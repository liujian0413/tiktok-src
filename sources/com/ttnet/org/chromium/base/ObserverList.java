package com.ttnet.org.chromium.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ObserverList<E> implements Iterable<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int mCount;
    private int mIterationDepth;
    private boolean mNeedsCompact;
    public final List<E> mObservers = new ArrayList();

    class ObserverListIterator implements RewindableIterator<E> {
        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private void compactListIfNeeded() {
            if (!this.mIsExhausted) {
                this.mIsExhausted = true;
                ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
            }
        }

        public boolean hasNext() {
            int i = this.mIndex;
            while (i < this.mListEndMarker && ObserverList.this.getObserverAt(i) == null) {
                i++;
            }
            if (i < this.mListEndMarker) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        public void rewind() {
            compactListIfNeeded();
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
            this.mIsExhausted = false;
            this.mIndex = 0;
        }

        public E next() {
            while (this.mIndex < this.mListEndMarker && ObserverList.this.getObserverAt(this.mIndex) == null) {
                this.mIndex++;
            }
            if (this.mIndex < this.mListEndMarker) {
                ObserverList observerList = ObserverList.this;
                int i = this.mIndex;
                this.mIndex = i + 1;
                return observerList.getObserverAt(i);
            }
            compactListIfNeeded();
            throw new NoSuchElementException();
        }

        private ObserverListIterator() {
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
        }
    }

    public interface RewindableIterator<E> extends Iterator<E> {
        void rewind();
    }

    public int size() {
        return this.mCount;
    }

    public int capacity() {
        return this.mObservers.size();
    }

    public void incrementIterationDepth() {
        this.mIterationDepth++;
    }

    public boolean isEmpty() {
        if (this.mCount == 0) {
            return true;
        }
        return false;
    }

    public Iterator<E> iterator() {
        return new ObserverListIterator();
    }

    public RewindableIterator<E> rewindableIterator() {
        return new ObserverListIterator();
    }

    private void compact() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            if (this.mObservers.get(size) == null) {
                this.mObservers.remove(size);
            }
        }
    }

    public void decrementIterationDepthAndCompactIfNeeded() {
        this.mIterationDepth--;
        if (this.mIterationDepth <= 0 && this.mNeedsCompact) {
            this.mNeedsCompact = false;
            compact();
        }
    }

    public void clear() {
        boolean z;
        this.mCount = 0;
        if (this.mIterationDepth == 0) {
            this.mObservers.clear();
            return;
        }
        int size = this.mObservers.size();
        boolean z2 = this.mNeedsCompact;
        if (size != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mNeedsCompact = z2 | z;
        for (int i = 0; i < size; i++) {
            this.mObservers.set(i, null);
        }
    }

    public E getObserverAt(int i) {
        return this.mObservers.get(i);
    }

    public boolean hasObserver(E e) {
        return this.mObservers.contains(e);
    }

    public boolean addObserver(E e) {
        if (e == null || this.mObservers.contains(e)) {
            return false;
        }
        this.mObservers.add(e);
        this.mCount++;
        return true;
    }

    public boolean removeObserver(E e) {
        if (e == null) {
            return false;
        }
        int indexOf = this.mObservers.indexOf(e);
        if (indexOf == -1) {
            return false;
        }
        if (this.mIterationDepth == 0) {
            this.mObservers.remove(indexOf);
        } else {
            this.mNeedsCompact = true;
            this.mObservers.set(indexOf, null);
        }
        this.mCount--;
        return true;
    }
}
