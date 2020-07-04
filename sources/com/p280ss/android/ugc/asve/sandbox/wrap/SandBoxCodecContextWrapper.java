package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.asve.constant.AS_ENCODE_PROFILE;
import com.p280ss.android.ugc.asve.context.C15424d;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxCodecContextWrapper */
public class SandBoxCodecContextWrapper implements Parcelable {
    public static final Creator<SandBoxCodecContextWrapper> CREATOR = new Creator<SandBoxCodecContextWrapper>() {
        /* renamed from: a */
        private static SandBoxCodecContextWrapper[] m71058a(int i) {
            return new SandBoxCodecContextWrapper[i];
        }

        /* renamed from: a */
        private static SandBoxCodecContextWrapper m71057a(Parcel parcel) {
            return new SandBoxCodecContextWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71057a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71058a(i);
        }
    };

    /* renamed from: a */
    public float f56557a;

    /* renamed from: b */
    public boolean f56558b;

    /* renamed from: c */
    public float f56559c;

    /* renamed from: d */
    public boolean f56560d;

    /* renamed from: e */
    public int f56561e;

    /* renamed from: f */
    public int f56562f;

    /* renamed from: g */
    public boolean f56563g;

    /* renamed from: h */
    public String f56564h;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxCodecContextWrapper{bgmPlayVolume=");
        sb.append(this.f56557a);
        sb.append(", enableEnhanceVolume=");
        sb.append(this.f56558b);
        sb.append(", recordBitrate=");
        sb.append(this.f56559c);
        sb.append(", useHardwareEncode=");
        sb.append(this.f56560d);
        sb.append(", softEncodeQP=");
        sb.append(this.f56561e);
        sb.append(", encodeProfile=");
        sb.append(this.f56562f);
        sb.append(", remuxWithCopying=");
        sb.append(this.f56563g);
        sb.append(", videoMetadataDescription='");
        sb.append(this.f56564h);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public SandBoxCodecContextWrapper(C15424d dVar) {
        this.f56557a = dVar.mo38935a();
        this.f56558b = dVar.mo38936b();
        this.f56559c = dVar.mo38937c();
        this.f56560d = dVar.mo38938d();
        this.f56561e = dVar.mo38939e();
        this.f56562f = AS_ENCODE_PROFILE.toIntValue(dVar.mo38940f());
        this.f56563g = dVar.mo38941g();
        this.f56564h = dVar.mo38942h();
    }

    protected SandBoxCodecContextWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f56557a = parcel.readFloat();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56558b = z;
        this.f56559c = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56560d = z2;
        this.f56561e = parcel.readInt();
        this.f56562f = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.f56563g = z3;
        this.f56564h = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f56557a);
        parcel.writeByte(this.f56558b ? (byte) 1 : 0);
        parcel.writeFloat(this.f56559c);
        parcel.writeByte(this.f56560d ? (byte) 1 : 0);
        parcel.writeInt(this.f56561e);
        parcel.writeInt(this.f56562f);
        parcel.writeByte(this.f56563g ? (byte) 1 : 0);
        parcel.writeString(this.f56564h);
    }
}
