package com.snapchat.kit.sdk.creative.media;

import com.snapchat.kit.sdk.creative.p809b.C18710c;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

public final class SnapMediaFactory_Factory implements C47373d<SnapMediaFactory> {

    /* renamed from: a */
    private final C47883a<C18710c> f50518a;

    public final SnapMediaFactory get() {
        return new SnapMediaFactory((C18710c) this.f50518a.get());
    }

    public SnapMediaFactory_Factory(C47883a<C18710c> aVar) {
        this.f50518a = aVar;
    }

    public static C47373d<SnapMediaFactory> create(C47883a<C18710c> aVar) {
        return new SnapMediaFactory_Factory(aVar);
    }

    public static SnapMediaFactory newSnapMediaFactory(C18710c cVar) {
        return new SnapMediaFactory(cVar);
    }
}
