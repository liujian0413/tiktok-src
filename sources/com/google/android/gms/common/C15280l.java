package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15219ak;
import com.google.android.gms.common.internal.C15220al;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.l */
abstract class C15280l extends C15220al {

    /* renamed from: a */
    private int f39485a;

    protected C15280l(byte[] bArr) {
        C15267r.m44394b(bArr.length == 25);
        this.f39485a = Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract byte[] mo38622c();

    public int hashCode() {
        return this.f39485a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C15219ak)) {
            return false;
        }
        try {
            C15219ak akVar = (C15219ak) obj;
            if (akVar.mo38543b() != hashCode()) {
                return false;
            }
            C15345b a = akVar.mo38542a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(mo38622c(), (byte[]) C15349d.m44669a(a));
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C15345b mo38542a() {
        return C15349d.m44668a(mo38622c());
    }

    /* renamed from: b */
    public final int mo38543b() {
        return hashCode();
    }

    /* renamed from: a */
    protected static byte[] m44482a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
