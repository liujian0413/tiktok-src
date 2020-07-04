package com.bytedance.android.livesdk.chatroom.p209bl;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.FixedSizePriorityQueue */
public class FixedSizePriorityQueue<E> extends TreeSet<E> {
    private int mLeft;
    private int maxSize;

    public void clear() {
        super.clear();
        this.mLeft = this.maxSize;
    }

    public E pollFirst() {
        E pollFirst = super.pollFirst();
        if (pollFirst != null) {
            this.mLeft++;
        }
        return pollFirst;
    }

    public E pollLast() {
        E pollLast = super.pollLast();
        if (pollLast != null) {
            this.mLeft++;
        }
        return pollLast;
    }

    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        if (remove) {
            this.mLeft++;
        }
        return remove;
    }

    public boolean add(E e) {
        if (this.mLeft > 0) {
            boolean add = super.add(e);
            if (add) {
                this.mLeft--;
            }
            return add;
        } else if (super.comparator().compare(e, first()) <= 0) {
            return false;
        } else {
            pollFirst();
            if (super.add(e)) {
                this.mLeft--;
            }
            return true;
        }
    }

    public FixedSizePriorityQueue(int i, Comparator<E> comparator) {
        super(comparator);
        if (i > 0) {
            this.mLeft = i;
            this.maxSize = i;
            return;
        }
        throw new IllegalArgumentException("FixedSizePriorityQueue: maxSize <= 0");
    }
}
