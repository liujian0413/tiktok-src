package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class zznd implements Parcelable, Comparator<zza> {
    public static final Creator<zznd> CREATOR = new bmx();

    /* renamed from: a */
    public final int f45737a;

    /* renamed from: b */
    private final zza[] f45738b;

    /* renamed from: c */
    private int f45739c;

    public static final class zza implements Parcelable {
        public static final Creator<zza> CREATOR = new bmy();

        /* renamed from: a */
        public final boolean f45740a;

        /* renamed from: b */
        private int f45741b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final UUID f45742c;

        /* renamed from: d */
        private final String f45743d;

        /* renamed from: e */
        private final byte[] f45744e;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public final int describeContents() {
            return 0;
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f45742c = (UUID) brr.m49869a(uuid);
            this.f45743d = (String) brr.m49869a(str);
            this.f45744e = (byte[]) brr.m49869a(bArr);
            this.f45740a = false;
        }

        zza(Parcel parcel) {
            this.f45742c = new UUID(parcel.readLong(), parcel.readLong());
            this.f45743d = parcel.readString();
            this.f45744e = parcel.createByteArray();
            this.f45740a = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zza = (zza) obj;
            return this.f45743d.equals(zza.f45743d) && bsf.m49941a((Object) this.f45742c, (Object) zza.f45742c) && Arrays.equals(this.f45744e, zza.f45744e);
        }

        public final int hashCode() {
            if (this.f45741b == 0) {
                this.f45741b = (((this.f45742c.hashCode() * 31) + this.f45743d.hashCode()) * 31) + Arrays.hashCode(this.f45744e);
            }
            return this.f45741b;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f45742c.getMostSignificantBits());
            parcel.writeLong(this.f45742c.getLeastSignificantBits());
            parcel.writeString(this.f45743d);
            parcel.writeByteArray(this.f45744e);
            parcel.writeByte(this.f45740a ? (byte) 1 : 0);
        }
    }

    public zznd(zza... zzaArr) {
        this(true, zzaArr);
    }

    public final int describeContents() {
        return 0;
    }

    private zznd(boolean z, zza... zzaArr) {
        zza[] zzaArr2 = (zza[]) zzaArr.clone();
        Arrays.sort(zzaArr2, this);
        int i = 1;
        while (i < zzaArr2.length) {
            if (!zzaArr2[i - 1].f45742c.equals(zzaArr2[i].f45742c)) {
                i++;
            } else {
                String valueOf = String.valueOf(zzaArr2[i].f45742c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f45738b = zzaArr2;
        this.f45737a = zzaArr2.length;
    }

    zznd(Parcel parcel) {
        this.f45738b = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.f45737a = this.f45738b.length;
    }

    /* renamed from: a */
    public final zza mo42360a(int i) {
        return this.f45738b[i];
    }

    public final int hashCode() {
        if (this.f45739c == 0) {
            this.f45739c = Arrays.hashCode(this.f45738b);
        }
        return this.f45739c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45738b, ((zznd) obj).f45738b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f45738b, 0);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zza zza2 = (zza) obj;
        zza zza3 = (zza) obj2;
        if (bkr.f42399b.equals(zza2.f45742c)) {
            return bkr.f42399b.equals(zza3.f45742c) ? 0 : 1;
        }
        return zza2.f45742c.compareTo(zza3.f45742c);
    }
}
