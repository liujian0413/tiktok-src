package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.awc;
import com.google.android.gms.internal.ads.awd;
import java.io.IOException;

public abstract class awd<MessageType extends awc<MessageType, BuilderType>, BuilderType extends awd<MessageType, BuilderType>> implements azb {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo40084a(MessageType messagetype);

    /* renamed from: a */
    public abstract BuilderType mo40085a(awx awx, axi axi) throws IOException;

    /* renamed from: b */
    public abstract BuilderType clone();

    /* renamed from: a */
    public BuilderType mo40086a(byte[] bArr, int i, int i2, axi axi) throws zzcdx {
        try {
            awx a = awx.m47454a(bArr, 0, i2, false);
            mo40085a(a, axi);
            a.mo40132a(0);
            return this;
        } catch (zzcdx e) {
            throw e;
        } catch (IOException e2) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ azb mo40087a(aza aza) {
        if (mo40288o().getClass().isInstance(aza)) {
            return mo40084a((MessageType) (awc) aza);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
