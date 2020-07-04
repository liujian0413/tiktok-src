package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel;
import com.p280ss.android.ugc.asve.constant.ASCameraType;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING;
import com.p280ss.android.ugc.asve.context.C15422c;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxCameraContextWrapper */
public class SandBoxCameraContextWrapper implements Parcelable {
    public static final Creator<SandBoxCameraContextWrapper> CREATOR = new Creator<SandBoxCameraContextWrapper>() {
        /* renamed from: a */
        private static SandBoxCameraContextWrapper[] m71056a(int i) {
            return new SandBoxCameraContextWrapper[i];
        }

        /* renamed from: a */
        private static SandBoxCameraContextWrapper m71055a(Parcel parcel) {
            return new SandBoxCameraContextWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71055a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71056a(i);
        }
    };

    /* renamed from: a */
    public int f56550a;

    /* renamed from: b */
    public int f56551b;

    /* renamed from: c */
    public int f56552c;

    /* renamed from: d */
    public boolean f56553d;

    /* renamed from: e */
    public int f56554e;

    /* renamed from: f */
    public boolean f56555f;

    /* renamed from: g */
    public int[] f56556g;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxCameraContextWrapper{defaultCameraFacing=");
        sb.append(this.f56550a);
        sb.append(", cameraType=");
        sb.append(this.f56551b);
        sb.append(", cameraHardwareSupportLevel=");
        sb.append(this.f56552c);
        sb.append(", enableFallBackIfV2OpenFailed=");
        sb.append(this.f56553d);
        sb.append(", optionFlag=");
        sb.append(this.f56554e);
        sb.append(", cameraAutoOpenOrCloseByLifecycle=");
        sb.append(this.f56555f);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxCameraContextWrapper(Parcel parcel) {
        boolean z;
        this.f56550a = parcel.readInt();
        this.f56551b = parcel.readInt();
        this.f56552c = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56553d = z;
        this.f56554e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f56555f = z2;
        this.f56556g = parcel.createIntArray();
    }

    public SandBoxCameraContextWrapper(C15422c cVar) {
        this.f56550a = AS_CAMERA_LENS_FACING.toIntValue(cVar.mo38910a());
        this.f56551b = ASCameraType.toIntValue(cVar.mo38911b());
        this.f56552c = ASCameraHardwareSupportLevel.toIntValue(cVar.mo38912c());
        this.f56553d = cVar.mo38913d();
        this.f56554e = cVar.mo38914e();
        this.f56555f = cVar.mo38915f();
        this.f56556g = cVar.mo38917h();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56550a);
        parcel.writeInt(this.f56551b);
        parcel.writeInt(this.f56552c);
        parcel.writeByte(this.f56553d ? (byte) 1 : 0);
        parcel.writeInt(this.f56554e);
        parcel.writeByte(this.f56555f ? (byte) 1 : 0);
        parcel.writeIntArray(this.f56556g);
    }
}
