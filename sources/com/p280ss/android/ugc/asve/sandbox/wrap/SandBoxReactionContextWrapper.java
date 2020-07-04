package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.asve.context.C15430g;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxReactionContextWrapper */
public class SandBoxReactionContextWrapper implements Parcelable {
    public static final Creator<SandBoxReactionContextWrapper> CREATOR = new Creator<SandBoxReactionContextWrapper>() {
        /* renamed from: a */
        private static SandBoxReactionContextWrapper[] m71062a(int i) {
            return new SandBoxReactionContextWrapper[i];
        }

        /* renamed from: a */
        private static SandBoxReactionContextWrapper m71061a(Parcel parcel) {
            return new SandBoxReactionContextWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71061a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71062a(i);
        }
    };

    /* renamed from: a */
    public String f56570a;

    /* renamed from: b */
    public String f56571b;

    /* renamed from: c */
    public float f56572c;

    /* renamed from: d */
    public boolean f56573d;

    /* renamed from: e */
    public int f56574e;

    /* renamed from: f */
    public int f56575f;

    /* renamed from: g */
    public int f56576g;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxReactionContextWrapper{reactionAudioPath='");
        sb.append(this.f56570a);
        sb.append('\'');
        sb.append(", reactionVideoPath='");
        sb.append(this.f56571b);
        sb.append('\'');
        sb.append(", reactionMaskAlpha=");
        sb.append(this.f56572c);
        sb.append(", isRandomWindowPos=");
        sb.append(this.f56573d);
        sb.append(", rectWindowRes=");
        sb.append(this.f56574e);
        sb.append(", circleWindowRes=");
        sb.append(this.f56575f);
        sb.append(", windowBoundaryRes=");
        sb.append(this.f56576g);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxReactionContextWrapper(Parcel parcel) {
        boolean z;
        this.f56570a = parcel.readString();
        this.f56571b = parcel.readString();
        this.f56572c = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56573d = z;
        this.f56574e = parcel.readInt();
        this.f56575f = parcel.readInt();
        this.f56576g = parcel.readInt();
    }

    public SandBoxReactionContextWrapper(C15430g gVar) {
        this.f56570a = gVar.mo38975a();
        this.f56571b = gVar.mo38976b();
        this.f56572c = gVar.mo38977c();
        this.f56573d = gVar.mo38978d();
        this.f56574e = gVar.mo38979e();
        this.f56575f = gVar.mo38980f();
        this.f56576g = gVar.mo38981g();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56570a);
        parcel.writeString(this.f56571b);
        parcel.writeFloat(this.f56572c);
        parcel.writeByte(this.f56573d ? (byte) 1 : 0);
        parcel.writeInt(this.f56574e);
        parcel.writeInt(this.f56575f);
        parcel.writeInt(this.f56576g);
    }
}
