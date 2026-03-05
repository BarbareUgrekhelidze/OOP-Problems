package org.example;

import java.util.Objects;

public class GenericPair <K, V>{
    private K key;
    private V value;

    public GenericPair(){}

    public GenericPair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof GenericPair){
            GenericPair<?, ?> pair = (GenericPair<?, ?>) o;
            return Objects.equals(key, pair.getKey()) && Objects.equals(value, pair.getValue());
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(key, value);
    }

    @Override
    public String toString(){
        return this.key + "=" + this.value;
    }
}
