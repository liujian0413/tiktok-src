package com.p280ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.dw */
public final class C43074dw<T> extends C0052o<T> {

    /* renamed from: a */
    private WeakReference<C0043i> f111685a;

    /* renamed from: a */
    public final void mo104730a(C0043i iVar, C0053p<T> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        WeakReference<C0043i> weakReference = this.f111685a;
        if (weakReference != null) {
            C0043i iVar2 = (C0043i) weakReference.get();
            if (iVar2 != null) {
                removeObservers(iVar2);
            }
        }
        this.f111685a = new WeakReference<>(iVar);
        observe(iVar, pVar);
    }
}
