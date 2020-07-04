package com.p280ss.android.ugc.gamora.recorder.localmedia;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument */
public final class LocalMediaArgument implements Parcelable {
    public static final C44670a CREATOR = new C44670a(null);

    /* renamed from: a */
    public final int f115026a;

    /* renamed from: b */
    public final int f115027b;

    /* renamed from: c */
    public final int f115028c;

    /* renamed from: d */
    public final boolean f115029d;

    /* renamed from: e */
    public final int f115030e;

    /* renamed from: f */
    public final long f115031f;

    /* renamed from: g */
    public final int f115032g;

    /* renamed from: h */
    public final int f115033h;

    /* renamed from: i */
    public final int f115034i;

    /* renamed from: j */
    public final int f115035j;

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument$a */
    public static final class C44670a implements Creator<LocalMediaArgument> {
        private C44670a() {
        }

        /* renamed from: a */
        private static LocalMediaArgument[] m141055a(int i) {
            return new LocalMediaArgument[i];
        }

        public /* synthetic */ C44670a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m141054a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m141055a(i);
        }

        /* renamed from: a */
        private static LocalMediaArgument m141054a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new LocalMediaArgument(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalMediaArgument) {
                LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
                if (this.f115026a == localMediaArgument.f115026a) {
                    if (this.f115027b == localMediaArgument.f115027b) {
                        if (this.f115028c == localMediaArgument.f115028c) {
                            if (this.f115029d == localMediaArgument.f115029d) {
                                if (this.f115030e == localMediaArgument.f115030e) {
                                    if (this.f115031f == localMediaArgument.f115031f) {
                                        if (this.f115032g == localMediaArgument.f115032g) {
                                            if (this.f115033h == localMediaArgument.f115033h) {
                                                if (this.f115034i == localMediaArgument.f115034i) {
                                                    if (this.f115035j == localMediaArgument.f115035j) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f115026a * 31) + this.f115027b) * 31) + this.f115028c) * 31;
        boolean z = this.f115029d;
        if (z) {
            z = true;
        }
        int i2 = (((i + (z ? 1 : 0)) * 31) + this.f115030e) * 31;
        long j = this.f115031f;
        return ((((((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f115032g) * 31) + this.f115033h) * 31) + this.f115034i) * 31) + this.f115035j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalMediaArgument(chooseRequestCode=");
        sb.append(this.f115026a);
        sb.append(", requestCode=");
        sb.append(this.f115027b);
        sb.append(", supportFlag=");
        sb.append(this.f115028c);
        sb.append(", enableMultiVideo=");
        sb.append(this.f115029d);
        sb.append(", chooseScene=");
        sb.append(this.f115030e);
        sb.append(", minDuration=");
        sb.append(this.f115031f);
        sb.append(", minPhotoCount=");
        sb.append(this.f115032g);
        sb.append(", maxPhotoCount=");
        sb.append(this.f115033h);
        sb.append(", minVideoCount=");
        sb.append(this.f115034i);
        sb.append(", maxVideoCount=");
        sb.append(this.f115035j);
        sb.append(")");
        return sb.toString();
    }

    public LocalMediaArgument(Parcel parcel) {
        boolean z;
        C7573i.m23587b(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this(readInt, readInt2, readInt3, z, parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.f115026a);
        parcel.writeInt(this.f115027b);
        parcel.writeInt(this.f115028c);
        parcel.writeByte(this.f115029d ? (byte) 1 : 0);
        parcel.writeInt(this.f115030e);
        parcel.writeLong(this.f115031f);
        parcel.writeInt(this.f115032g);
        parcel.writeInt(this.f115033h);
        parcel.writeInt(this.f115034i);
        parcel.writeInt(this.f115035j);
    }

    public LocalMediaArgument(int i, int i2, int i3, boolean z, int i4, long j, int i5, int i6, int i7, int i8) {
        this.f115026a = i;
        this.f115027b = i2;
        this.f115028c = i3;
        this.f115029d = z;
        this.f115030e = i4;
        this.f115031f = j;
        this.f115032g = i5;
        this.f115033h = i6;
        this.f115034i = i7;
        this.f115035j = i8;
    }
}
