package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C15265q;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.bc */
final class C18332bc {

    /* renamed from: a */
    public final KeyPair f49815a;

    /* renamed from: b */
    public final long f49816b;

    C18332bc(KeyPair keyPair, long j) {
        this.f49815a = keyPair;
        this.f49816b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18332bc)) {
            return false;
        }
        C18332bc bcVar = (C18332bc) obj;
        if (this.f49816b != bcVar.f49816b || !this.f49815a.getPublic().equals(bcVar.f49815a.getPublic()) || !this.f49815a.getPrivate().equals(bcVar.f49815a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f49815a.getPublic(), this.f49815a.getPrivate(), Long.valueOf(this.f49816b));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m60431a() {
        return Base64.encodeToString(this.f49815a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m60433b() {
        return Base64.encodeToString(this.f49815a.getPrivate().getEncoded(), 11);
    }
}
