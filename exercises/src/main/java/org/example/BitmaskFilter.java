package org.example;

public class BitmaskFilter implements Filter{

    private Long mask;
    public void BitmaskFilter(){
        mask = 0L;
    }

    @Override
    public int size() {
        return Long.bitCount(mask);
    }

    @Override
    public boolean isPresent(int index) {
        return index < 64 && (mask & 1L << index) != 0;
    }

    @Override
    public void add(int index) {
        if (index < 64){
            mask = mask | (1L << index);
        }
    }

    @Override
    public void remove(int index) {
        if (index < 64){
            mask = mask & (~ (1L << index));
        }
    }
}
