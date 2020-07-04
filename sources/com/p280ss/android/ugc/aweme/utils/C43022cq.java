package com.p280ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0052o;
import com.bytedance.apm.util.C9653q;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.cq */
public final class C43022cq {
    /* renamed from: a */
    public static final <T> void m136539a(C0052o<T> oVar, T t) {
        C7573i.m23587b(oVar, "$this$threadSoftValue");
        if (C9653q.m28546a()) {
            oVar.setValue(t);
        } else {
            oVar.postValue(t);
        }
    }
}
