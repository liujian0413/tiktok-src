package com.ttnet.org.chromium.base;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class DiscardableReferencePool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Set<DiscardableReference<?>> mPool = Collections.newSetFromMap(new WeakHashMap());

    public static class DiscardableReference<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private T mPayload;

        static {
            Class<DiscardableReferencePool> cls = DiscardableReferencePool.class;
        }

        public void discard() {
            this.mPayload = null;
        }

        public T get() {
            return this.mPayload;
        }

        private DiscardableReference(T t) {
            this.mPayload = t;
        }
    }

    public void drain() {
        for (DiscardableReference discard : this.mPool) {
            discard.discard();
        }
        this.mPool.clear();
    }

    public <T> DiscardableReference<T> put(T t) {
        DiscardableReference<T> discardableReference = new DiscardableReference<>(t);
        this.mPool.add(discardableReference);
        return discardableReference;
    }

    public void remove(DiscardableReference<?> discardableReference) {
        if (this.mPool.contains(discardableReference)) {
            discardableReference.discard();
            this.mPool.remove(discardableReference);
        }
    }
}
