package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* renamed from: com.facebook.imageutils.d */
public final class C13847d {

    /* renamed from: a */
    public final Pair<Integer, Integer> f36712a;

    /* renamed from: b */
    public final ColorSpace f36713b;

    public C13847d(int i, int i2, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i == -1 || i2 == -1) {
            pair = null;
        } else {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.f36712a = pair;
        this.f36713b = colorSpace;
    }
}
