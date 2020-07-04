package com.bytedance.android.live.core.rxutils.autodispose.p153a;

import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.p348d.C47569e;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a.a */
public final class C3236a {

    /* renamed from: a */
    private static volatile C47569e f9959a;

    /* renamed from: a */
    public static boolean m12266a(C47569e eVar) {
        if (eVar != null) {
            C47569e eVar2 = f9959a;
            if (eVar2 != null) {
                return eVar2.mo10175a();
            }
            try {
                return eVar.mo10175a();
            } catch (Exception e) {
                throw C7331a.m23008a(e);
            }
        } else {
            throw new NullPointerException("defaultChecker == null");
        }
    }
}
