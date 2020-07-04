package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.C14750b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzafl extends AbstractSafeParcelable {
    public static final Creator<zzafl> CREATOR = new C15647ec();

    /* renamed from: a */
    public final int f45506a;

    /* renamed from: b */
    public final boolean f45507b;

    /* renamed from: c */
    public final int f45508c;

    /* renamed from: d */
    public final boolean f45509d;

    /* renamed from: e */
    public final int f45510e;

    /* renamed from: f */
    public final zzacq f45511f;

    /* renamed from: g */
    private final boolean f45512g;

    /* renamed from: h */
    private final int f45513h;

    public zzafl(C14750b bVar) {
        boolean z = bVar.f38114a;
        int i = bVar.f38115b;
        boolean z2 = bVar.f38117d;
        int i2 = bVar.f38118e;
        zzacq zzacq = bVar.f38119f != null ? new zzacq(bVar.f38119f) : null;
        this(4, z, i, z2, i2, zzacq, bVar.f38120g, bVar.f38116c);
    }

    public zzafl(int i, boolean z, int i2, boolean z2, int i3, zzacq zzacq, boolean z3, int i4) {
        this.f45506a = i;
        this.f45507b = z;
        this.f45508c = i2;
        this.f45509d = z2;
        this.f45510e = i3;
        this.f45511f = zzacq;
        this.f45512g = z3;
        this.f45513h = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45506a);
        C15269a.m44459a(parcel, 2, this.f45507b);
        C15269a.m44447a(parcel, 3, this.f45508c);
        C15269a.m44459a(parcel, 4, this.f45509d);
        C15269a.m44447a(parcel, 5, this.f45510e);
        C15269a.m44452a(parcel, 6, (Parcelable) this.f45511f, i, false);
        C15269a.m44459a(parcel, 7, this.f45512g);
        C15269a.m44447a(parcel, 8, this.f45513h);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public final String mo42163a() {
        switch (this.f45513h) {
            case 1:
                return "any";
            case 2:
                return "landscape";
            case 3:
                return "portrait";
            case 4:
                return "square";
            default:
                return "unknown";
        }
    }
}
