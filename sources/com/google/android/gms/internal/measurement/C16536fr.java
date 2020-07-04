package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16535fq;
import com.google.android.gms.internal.measurement.C16536fr;

/* renamed from: com.google.android.gms.internal.measurement.fr */
public abstract class C16536fr<MessageType extends C16535fq<MessageType, BuilderType>, BuilderType extends C16536fr<MessageType, BuilderType>> implements C16616ik {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo42729a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ C16616ik mo42730a(C16615ij ijVar) {
        if (mo42937l().getClass().isInstance(ijVar)) {
            return mo42729a((MessageType) (C16535fq) ijVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
