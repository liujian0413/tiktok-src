package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16535fq;
import com.google.android.gms.internal.measurement.C16536fr;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.fq */
public abstract class C16535fq<MessageType extends C16535fq<MessageType, BuilderType>, BuilderType extends C16536fr<MessageType, BuilderType>> implements C16615ij {
    private static boolean zzbtj;
    protected int zzbti;

    /* renamed from: d */
    public final zzte mo42726d() {
        try {
            C16550ge zzao = zzte.zzao(mo42933h());
            mo42929a(zzao.f46343a);
            return zzao.mo42765a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf(str).length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo42727e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo42725a(int i) {
        throw new UnsupportedOperationException();
    }
}
