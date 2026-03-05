package org.example;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class MyStack <T> {
    private List<T> stack;

    public MyStack(){

    }

    public void add(T elem){
        stack.add(elem);
    }

    public T pop(){
        if (stack.size() == 0){
            throw new IllegalArgumentException("No element to pop");
        }
        return stack.get(stack.size()-1);
    }

    public void addAll(Collection<T> elems){
        Iterator iter = elems.iterator();
        while(iter.hasNext()){
            T elem = (T)iter.next();
            stack.add(elem);
        }
    }

    public int size(){
        return stack.size();
    }
}
