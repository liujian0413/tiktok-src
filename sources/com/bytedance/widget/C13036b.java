package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle.State;

/* renamed from: com.bytedance.widget.b */
public final /* synthetic */ class C13036b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f34487a;

    static {
        int[] iArr = new int[State.values().length];
        f34487a = iArr;
        iArr[State.INITIALIZED.ordinal()] = 1;
        f34487a[State.DESTROYED.ordinal()] = 2;
        f34487a[State.CREATED.ordinal()] = 3;
        f34487a[State.STARTED.ordinal()] = 4;
        f34487a[State.RESUMED.ordinal()] = 5;
    }
}
