package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@C6505uv
public final class aeo {

    /* renamed from: a */
    private Map<Integer, Bitmap> f40107a = new ConcurrentHashMap();

    /* renamed from: b */
    private AtomicInteger f40108b = new AtomicInteger(0);

    /* renamed from: a */
    public final int mo39259a(Bitmap bitmap) {
        if (bitmap == null) {
            acd.m45777b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f40108b.getAndIncrement();
        this.f40107a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* renamed from: a */
    public final Bitmap mo39260a(Integer num) {
        return (Bitmap) this.f40107a.get(num);
    }

    /* renamed from: b */
    public final void mo39261b(Integer num) {
        this.f40107a.remove(num);
    }
}
