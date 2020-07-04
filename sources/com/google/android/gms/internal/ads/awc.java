package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.awc;
import com.google.android.gms.internal.ads.awd;
import java.io.IOException;

public abstract class awc<MessageType extends awc<MessageType, BuilderType>, BuilderType extends awd<MessageType, BuilderType>> implements aza {
    private static boolean zzfud;
    protected int zzfuc;

    /* renamed from: f */
    public final zzcce mo40081f() {
        try {
            awt zzfk = zzcce.zzfk(mo40285j());
            mo40281a(zzfk.f41140a);
            return zzfk.mo40122a();
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

    /* renamed from: g */
    public final byte[] mo40082g() {
        try {
            byte[] bArr = new byte[mo40285j()];
            zzccv a = zzccv.m52998a(bArr);
            mo40281a(a);
            a.mo42322c();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
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
    /* renamed from: h */
    public int mo40083h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40080a(int i) {
        throw new UnsupportedOperationException();
    }
}
