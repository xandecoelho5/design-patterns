package br.com.xandecoelho5.iterator.tvChannel;

import java.util.Iterator;

public class ChannelIterator implements Iterator<Integer> {
    private final Integer[] channels;
    private int index;

    public ChannelIterator(Integer[] channels) {
        this.channels = channels;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (channels == null) return false;
        return channels[index] != null;
    }

    @Override
    public Integer next() {
        return channels[index++];
    }
}
