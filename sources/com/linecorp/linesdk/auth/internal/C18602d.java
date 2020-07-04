package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.linecorp.linesdk.p801a.C18588g;

/* renamed from: com.linecorp.linesdk.auth.internal.d */
final class C18602d implements Parcelable {
    public static final Creator<C18602d> CREATOR = new Creator<C18602d>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C18602d[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C18602d(parcel, 0);
        }
    };

    /* renamed from: a */
    C18588g f50279a;

    /* renamed from: b */
    String f50280b;

    /* renamed from: c */
    String f50281c;

    /* renamed from: d */
    int f50282d;

    /* renamed from: com.linecorp.linesdk.auth.internal.d$a */
    enum C18604a {
        ;

        /* renamed from: a */
        public static int[] m61031a() {
            return (int[]) f50287e.clone();
        }

        static {
            f50287e = new int[]{f50283a, f50284b, f50285c, f50286d};
        }
    }

    public final int describeContents() {
        return 0;
    }

    C18602d() {
        this.f50282d = C18604a.f50283a;
    }

    private C18602d(Parcel parcel) {
        C18588g gVar;
        this.f50282d = C18604a.f50283a;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (TextUtils.isEmpty(readString) || TextUtils.isEmpty(readString2)) {
            gVar = null;
        } else {
            gVar = new C18588g(readString, readString2);
        }
        this.f50279a = gVar;
        this.f50280b = parcel.readString();
        this.f50282d = C18604a.m61031a()[parcel.readByte()];
        this.f50281c = parcel.readString();
    }

    /* synthetic */ C18602d(Parcel parcel, byte b) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2 = null;
        if (this.f50279a == null) {
            str = null;
        } else {
            str = this.f50279a.f50227a;
        }
        parcel.writeString(str);
        if (this.f50279a != null) {
            str2 = this.f50279a.f50228b;
        }
        parcel.writeString(str2);
        parcel.writeString(this.f50280b);
        parcel.writeByte((byte) (this.f50282d - 1));
        parcel.writeString(this.f50281c);
    }
}
