package org.example;
import java.util.*;

public class MyStack <T> {
    private List<T> stack;

    public MyStack(){
        stack = new ArrayList();
    }

    public void add(T elem){
        stack.add(elem);
    }

    public T pop(){
        if (stack.size() == 0){
            throw new EmptyStackException();
        }

        T result = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);

        return result;
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
