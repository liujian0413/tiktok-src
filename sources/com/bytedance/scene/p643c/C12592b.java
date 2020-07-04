package com.bytedance.scene.p643c;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: com.bytedance.scene.c.b */
public final class C12592b extends C12593c {
    public C12592b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }
}
