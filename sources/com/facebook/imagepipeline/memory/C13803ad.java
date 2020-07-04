package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.C13307g;

/* renamed from: com.facebook.imagepipeline.memory.ad */
public final class C13803ad {

    /* renamed from: a */
    public final int f36639a;

    /* renamed from: b */
    public final int f36640b;

    /* renamed from: c */
    public final SparseIntArray f36641c;

    /* renamed from: d */
    public final int f36642d;

    /* renamed from: e */
    public final int f36643e;

    /* renamed from: f */
    public boolean f36644f;

    /* renamed from: g */
    public final int f36645g;

    public C13803ad(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C13803ad(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        boolean z;
        if (i < 0 || i2 < i) {
            z = false;
        } else {
            z = true;
        }
        C13307g.m38947b(z);
        this.f36640b = i;
        this.f36639a = i2;
        this.f36641c = sparseIntArray;
        this.f36642d = i3;
        this.f36643e = i4;
        this.f36645g = i5;
    }
}
