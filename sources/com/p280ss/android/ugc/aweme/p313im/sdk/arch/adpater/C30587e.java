package com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater;

import android.support.p029v7.util.C1143a.C1147c;
import com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater.C30583c.C30584a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.e */
public final class C30587e {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <T> C30583c<T> m99899a(C1147c<T> cVar, Executor executor, Executor executor2) {
        C7573i.m23587b(cVar, "$this$asDifferConfig");
        C30584a aVar = new C30584a(cVar);
        if (executor != null) {
            aVar.mo80357a(executor);
        }
        if (executor2 != null) {
            aVar.mo80359b(executor2);
        }
        return aVar.mo80358a();
    }
}
