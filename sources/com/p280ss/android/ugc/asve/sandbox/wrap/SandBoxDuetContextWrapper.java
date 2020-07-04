package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.asve.context.C15428f;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxDuetContextWrapper */
public class SandBoxDuetContextWrapper implements Parcelable {
    public static final Creator<SandBoxDuetContextWrapper> CREATOR = new Creator<SandBoxDuetContextWrapper>() {
        /* renamed from: a */
        private static SandBoxDuetContextWrapper[] m71060a(int i) {
            return new SandBoxDuetContextWrapper[i];
        }

        /* renamed from: a */
        private static SandBoxDuetContextWrapper m71059a(Parcel parcel) {
            return new SandBoxDuetContextWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71059a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71060a(i);
        }
    };

    /* renamed from: a */
    public boolean f56565a;

    /* renamed from: b */
    public String f56566b;

    /* renamed from: c */
    public String f56567c;

    /* renamed from: d */
    public int f56568d;

    /* renamed from: e */
    public int f56569e;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxDuetContextWrapper{isGameModeInDuet=");
        sb.append(this.f56565a);
        sb.append(", duetAudioPath='");
        sb.append(this.f56566b);
        sb.append('\'');
        sb.append(", duetVideoPath='");
        sb.append(this.f56567c);
        sb.append('\'');
        sb.append(", duetWidth=");
        sb.append(this.f56568d);
        sb.append(", duetHeight=");
        sb.append(this.f56569e);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxDuetContextWrapper(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56565a = z;
        this.f56566b = parcel.readString();
        this.f56567c = parcel.readString();
        this.f56568d = parcel.readInt();
        this.f56569e = parcel.readInt();
    }

    public SandBoxDuetContextWrapper(C15428f fVar) {
        this.f56565a = fVar.mo38970a();
        this.f56566b = fVar.mo38971b();
        this.f56567c = fVar.mo38972c();
        this.f56568d = fVar.mo38973d();
        this.f56569e = fVar.mo38974e();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f56565a ? (byte) 1 : 0);
        parcel.writeString(this.f56566b);
        parcel.writeString(this.f56567c);
        parcel.writeInt(this.f56568d);
        parcel.writeInt(this.f56569e);
    }
}
