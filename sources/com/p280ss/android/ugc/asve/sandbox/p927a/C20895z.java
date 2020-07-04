package com.p280ss.android.ugc.asve.sandbox.p927a;

import android.util.SparseArray;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20953q.C20954a;
import com.p280ss.android.vesdk.C45382z.C45398i;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.z */
public final class C20895z extends C20954a {

    /* renamed from: a */
    private final WeakReference<C45398i> f56324a;

    public C20895z(C45398i iVar) {
        C7573i.m23587b(iVar, "listener");
        this.f56324a = new WeakReference<>(iVar);
    }

    /* renamed from: a */
    public final void mo56406a(int[] iArr, long[] jArr, float f) {
        C7573i.m23587b(iArr, "var1");
        C7573i.m23587b(jArr, "var2");
        SparseArray sparseArray = new SparseArray();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sparseArray.put(iArr[i], Long.valueOf(jArr[i]));
        }
        C45398i iVar = (C45398i) this.f56324a.get();
        if (iVar != null) {
            iVar.mo56379a(sparseArray, f);
        }
    }
}
