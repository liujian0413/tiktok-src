package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.Lifecycle.State;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.e */
public final /* synthetic */ class C11727e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f31509a;

    static {
        int[] iArr = new int[State.values().length];
        f31509a = iArr;
        iArr[State.INITIALIZED.ordinal()] = 1;
        f31509a[State.DESTROYED.ordinal()] = 2;
        f31509a[State.CREATED.ordinal()] = 3;
        f31509a[State.STARTED.ordinal()] = 4;
        f31509a[State.RESUMED.ordinal()] = 5;
    }
}
