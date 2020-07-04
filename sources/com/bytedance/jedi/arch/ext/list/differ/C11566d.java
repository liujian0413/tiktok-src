package com.bytedance.jedi.arch.ext.list.differ;

import android.support.p029v7.util.C1143a.C1147c;
import com.bytedance.jedi.arch.ext.list.differ.C11564c.C11565a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.arch.ext.list.differ.d */
public final class C11566d {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <T> C11564c<T> m34032a(C1147c<T> cVar, Executor executor) {
        C7573i.m23587b(cVar, "$this$asDifferConfig");
        C11565a aVar = new C11565a(cVar);
        if (executor != null) {
            aVar.mo29149a(executor);
        }
        return aVar.mo29150a();
    }
}
