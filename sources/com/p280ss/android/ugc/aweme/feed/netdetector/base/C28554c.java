package com.p280ss.android.ugc.aweme.feed.netdetector.base;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.base.c */
public final class C28554c {
    /* renamed from: a */
    public static final <T> T m93775a(C28553b bVar, C7561a<? extends T> aVar) throws Exception {
        C7573i.m23587b(aVar, "block");
        if (bVar != null) {
            try {
                bVar.mo73262a();
            } catch (Throwable th) {
                if (th instanceof BlockHookThrowableWrap) {
                    throw ((BlockHookThrowableWrap) th).getRealThrowable();
                }
                throw th;
            }
        }
        T invoke = aVar.invoke();
        if (bVar != null) {
            bVar.mo73265b();
        }
        return invoke;
    }
}
