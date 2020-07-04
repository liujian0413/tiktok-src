package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.asve.context.C15432h;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper */
public class ASSandBoxRecorderContextWrapper implements Parcelable {
    public static final Creator<ASSandBoxRecorderContextWrapper> CREATOR = new Creator<ASSandBoxRecorderContextWrapper>() {
        /* renamed from: a */
        private static ASSandBoxRecorderContextWrapper[] m71050a(int i) {
            return new ASSandBoxRecorderContextWrapper[i];
        }

        /* renamed from: a */
        private static ASSandBoxRecorderContextWrapper m71049a(Parcel parcel) {
            return new ASSandBoxRecorderContextWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71049a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71050a(i);
        }
    };

    /* renamed from: a */
    public SandBoxCameraContextWrapper f56513a;

    /* renamed from: b */
    public SandBoxCodecContextWrapper f56514b;

    /* renamed from: c */
    public SandBoxWorkspaceProviderWrapper f56515c;

    /* renamed from: d */
    public SandBoxReactionContextWrapper f56516d;

    /* renamed from: e */
    public SandBoxDuetContextWrapper f56517e;

    /* renamed from: f */
    public boolean f56518f;

    /* renamed from: g */
    public int f56519g;

    /* renamed from: h */
    public int f56520h;

    /* renamed from: i */
    public boolean f56521i;

    /* renamed from: j */
    public boolean f56522j;

    /* renamed from: k */
    public boolean f56523k;

    /* renamed from: l */
    public boolean f56524l;

    /* renamed from: m */
    public boolean f56525m;

    /* renamed from: n */
    public boolean f56526n;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ASSandBoxRecorderContextWrapper{sandBoxCameraContextWrapper=");
        sb.append(this.f56513a);
        sb.append(", sandBoxCodecContextWrapper=");
        sb.append(this.f56514b);
        sb.append(", sandBoxWorkspaceProviderWrapper=");
        sb.append(this.f56515c);
        sb.append(", sandBoxReactionContextWrapper=");
        sb.append(this.f56516d);
        sb.append(", sandBoxDuetContextWrapper=");
        sb.append(this.f56517e);
        sb.append(", isUseVERecorder=");
        sb.append(this.f56518f);
        sb.append(", outputWidth=");
        sb.append(this.f56519g);
        sb.append(", outputHeight=");
        sb.append(this.f56520h);
        sb.append(", enableEffectAmazing=");
        sb.append(this.f56521i);
        sb.append(", enableAbandonFirstFrame=");
        sb.append(this.f56522j);
        sb.append(", enableThreeBuffer=");
        sb.append(this.f56523k);
        sb.append(", enableAsyncDetection=");
        sb.append(this.f56524l);
        sb.append(", faceBeautyPlayUseMusic=");
        sb.append(this.f56525m);
        sb.append(", enableAudioRecord=");
        sb.append(this.f56526n);
        sb.append('}');
        return sb.toString();
    }

    protected ASSandBoxRecorderContextWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.f56513a = (SandBoxCameraContextWrapper) parcel.readParcelable(SandBoxCameraContextWrapper.class.getClassLoader());
        this.f56514b = (SandBoxCodecContextWrapper) parcel.readParcelable(SandBoxCodecContextWrapper.class.getClassLoader());
        this.f56515c = (SandBoxWorkspaceProviderWrapper) parcel.readParcelable(SandBoxWorkspaceProviderWrapper.class.getClassLoader());
        this.f56516d = (SandBoxReactionContextWrapper) parcel.readParcelable(SandBoxReactionContextWrapper.class.getClassLoader());
        this.f56517e = (SandBoxDuetContextWrapper) parcel.readParcelable(SandBoxDuetContextWrapper.class.getClassLoader());
        boolean z7 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56518f = z;
        this.f56519g = parcel.readInt();
        this.f56520h = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56521i = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f56522j = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f56523k = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f56524l = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f56525m = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        }
        this.f56526n = z7;
    }

    public ASSandBoxRecorderContextWrapper(C15432h hVar) {
        boolean z;
        this.f56513a = new SandBoxCameraContextWrapper(hVar.mo38930m());
        this.f56514b = new SandBoxCodecContextWrapper(hVar.mo38929l());
        this.f56515c = new SandBoxWorkspaceProviderWrapper(hVar.mo38921d());
        this.f56516d = new SandBoxReactionContextWrapper(hVar.mo38928k());
        this.f56517e = new SandBoxDuetContextWrapper(hVar.mo38927j());
        if (hVar.mo38918a() == null) {
            z = false;
        } else {
            z = hVar.mo38918a().booleanValue();
        }
        this.f56518f = z;
        this.f56519g = ((Integer) hVar.mo38922e().getFirst()).intValue();
        this.f56520h = ((Integer) hVar.mo38922e().getSecond()).intValue();
        this.f56521i = hVar.mo38923f();
        this.f56522j = hVar.mo38924g();
        this.f56523k = hVar.mo38933p();
        this.f56524l = hVar.mo38925h();
        this.f56525m = hVar.mo38926i();
        this.f56526n = hVar.mo38934q();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f56513a, i);
        parcel.writeParcelable(this.f56514b, i);
        parcel.writeParcelable(this.f56515c, i);
        parcel.writeParcelable(this.f56516d, i);
        parcel.writeParcelable(this.f56517e, i);
        parcel.writeByte(this.f56518f ? (byte) 1 : 0);
        parcel.writeInt(this.f56519g);
        parcel.writeInt(this.f56520h);
        parcel.writeByte(this.f56521i ? (byte) 1 : 0);
        parcel.writeByte(this.f56522j ? (byte) 1 : 0);
        parcel.writeByte(this.f56523k ? (byte) 1 : 0);
        parcel.writeByte(this.f56524l ? (byte) 1 : 0);
        parcel.writeByte(this.f56525m ? (byte) 1 : 0);
        parcel.writeByte(this.f56526n ? (byte) 1 : 0);
    }
}
