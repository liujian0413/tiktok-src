package com.p280ss.texturerender;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.texturerender.Ref */
public class Ref implements IRef {
    private AtomicInteger mCount;

    public Ref() {
        this(0);
    }

    public int addRef() {
        return this.mCount.getAndIncrement();
    }

    public int decRef() {
        return this.mCount.getAndDecrement();
    }

    public int refCnt() {
        return this.mCount.intValue();
    }

    public Ref(int i) {
        this.mCount = new AtomicInteger(i);
    }
}
