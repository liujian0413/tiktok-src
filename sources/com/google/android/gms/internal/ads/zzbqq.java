package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.internal.ads.zzbo.zza;

public final class zzbqq extends AbstractSafeParcelable {
    public static final Creator<zzbqq> CREATOR = new apk();

    /* renamed from: a */
    private final int f45687a;

    /* renamed from: b */
    private zza f45688b;

    /* renamed from: c */
    private byte[] f45689c;

    zzbqq(int i, byte[] bArr) {
        this.f45687a = i;
        this.f45689c = bArr;
        m52979b();
    }

    /* renamed from: a */
    public final zza mo42282a() {
        if (!(this.f45688b != null)) {
            try {
                this.f45688b = zza.m52728a(this.f45689c, axi.m47630b());
                this.f45689c = null;
            } catch (zzcdx e) {
                throw new IllegalStateException(e);
            }
        }
        m52979b();
        return this.f45688b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45687a);
        if (this.f45689c != null) {
            bArr = this.f45689c;
        } else {
            bArr = this.f45688b.mo40082g();
        }
        C15269a.m44460a(parcel, 2, bArr, false);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: b */
    private final void m52979b() {
        if (this.f45688b == null && this.f45689c != null) {
            return;
        }
        if (this.f45688b != null && this.f45689c == null) {
            return;
        }
        if (this.f45688b != null && this.f45689c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f45688b == null && this.f45689c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
