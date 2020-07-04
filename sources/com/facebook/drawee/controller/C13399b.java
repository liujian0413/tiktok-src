package com.facebook.drawee.controller;

import com.p280ss.android.ugc.aweme.lancet.C32276d;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.facebook.drawee.controller.b */
final class C13399b {
    /* renamed from: a */
    static C13396a m39310a(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        if (C7213d.m22500a().mo18782au()) {
            try {
                AbstractDraweeControllerBuilder abstractDraweeControllerBuilder2 = abstractDraweeControllerBuilder;
                C13401d<? super INFO> dVar = abstractDraweeControllerBuilder2.f35445g;
                if (dVar == null || !(dVar instanceof C32276d)) {
                    Object obj = abstractDraweeControllerBuilder2.f35441c != null ? abstractDraweeControllerBuilder2.f35441c : abstractDraweeControllerBuilder2.f35443e != null ? abstractDraweeControllerBuilder2.f35443e : abstractDraweeControllerBuilder2.f35442d;
                    abstractDraweeControllerBuilder2.mo32743a((C13401d<? super INFO>) new C32276d<Object>(dVar, obj));
                }
            } catch (Exception unused) {
            }
        }
        return abstractDraweeControllerBuilder.mo32753d();
    }
}
