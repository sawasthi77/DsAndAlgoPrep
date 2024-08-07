package org.example.DSImpl;

import java.util.LinkedList;

public class MyHashMap<K,V> {// what is the use of generics in java and why it is used here?
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private LinkedList<Node<K,V>>[]buckets;
    private int size;

    private static class Node<K,V> {
        final K key;
        V value;
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap(){
        buckets = new LinkedList[INITIAL_CAPACITY];
        for(int i = 0; i <INITIAL_CAPACITY; i++){
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int getBucketIndex(K key){
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void put(K key, V value){
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K,V>> bucket = buckets[bucketIndex];
        for(Node<K,V> node: bucket){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
        }
        bucket.add(new Node<>(key, value));
        size ++;
        if( (double) size / buckets.length >= LOAD_FACTOR){
            resize();
        }
    }

    private void resize(){
        LinkedList<Node<K,V>>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length*2];
        for(int i =0; i< buckets.length;i++){
            buckets[i] = new LinkedList<>();
        }
        size = 0;
        for(LinkedList<Node<K,V>> bucket: oldBuckets){
            for(Node<K,V> node: bucket){
                put(node.key, node.value);
            }
        }
    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K,V>> bucket = buckets[bucketIndex];
        for(Node<K,V> node: bucket){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key){
        return get(key)!= null;
    }

    public void remove(K key){
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K,V>> bucket = buckets[bucketIndex];
        for(Node<K,V> node: bucket){
            if(node.key.equals(key)){
                bucket.remove(node);
                size --;
                return;
            }
        }
    }

    public int size(){
        return size;
    }
}
