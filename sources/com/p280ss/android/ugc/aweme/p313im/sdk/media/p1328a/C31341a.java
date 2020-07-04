package com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a;

import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.a.a */
public final class C31341a {
    /* renamed from: a */
    private static <T> void m102049a(C47870u<T> uVar) {
        C7573i.m23587b(uVar, "$this$safeOnComplete");
        if (uVar.isDisposed()) {
            uVar = null;
        }
        if (uVar != null) {
            uVar.mo19238a();
        }
    }

    /* renamed from: a */
    public static final <T> void m102050a(C47870u<T> uVar, T t) {
        C7573i.m23587b(uVar, "$this$safeOnSingleNext");
        m102052b(uVar, t);
        m102049a(uVar);
    }

    /* renamed from: b */
    private static <T> void m102052b(C47870u<T> uVar, T t) {
        C7573i.m23587b(uVar, "$this$safeOnNext");
        if (uVar.isDisposed()) {
            uVar = null;
        }
        if (uVar != null) {
            uVar.mo19239a((Object) t);
        }
    }

    /* renamed from: a */
    public static final <T> void m102051a(C47870u<T> uVar, Throwable th) {
        C7573i.m23587b(uVar, "$this$safeOnError");
        C7573i.m23587b(th, "t");
        if (uVar.isDisposed()) {
            uVar = null;
        }
        if (uVar != null) {
            uVar.mo19240a(th);
        }
    }
}
