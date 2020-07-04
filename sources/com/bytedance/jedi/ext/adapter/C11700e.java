package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.Lifecycle.State;

/* renamed from: com.bytedance.jedi.ext.adapter.e */
public final /* synthetic */ class C11700e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f31439a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f31440b;

    static {
        int[] iArr = new int[State.values().length];
        f31439a = iArr;
        iArr[State.RESUMED.ordinal()] = 1;
        f31439a[State.CREATED.ordinal()] = 2;
        f31439a[State.STARTED.ordinal()] = 3;
        int[] iArr2 = new int[State.values().length];
        f31440b = iArr2;
        iArr2[State.RESUMED.ordinal()] = 1;
        f31440b[State.STARTED.ordinal()] = 2;
        f31440b[State.CREATED.ordinal()] = 3;
    }
}
