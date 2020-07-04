package dmt.p1861av.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: dmt.av.video.VEPreviewMusicParams */
public class VEPreviewMusicParams implements Parcelable {
    public static final Creator<VEPreviewMusicParams> CREATOR = new Creator<VEPreviewMusicParams>() {
        /* renamed from: a */
        private static VEPreviewMusicParams[] m147957a(int i) {
            return new VEPreviewMusicParams[i];
        }

        /* renamed from: a */
        private static VEPreviewMusicParams m147956a(Parcel parcel) {
            return new VEPreviewMusicParams(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147956a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147957a(i);
        }
    };

    /* renamed from: a */
    public String f121606a;

    /* renamed from: b */
    public int f121607b;

    /* renamed from: c */
    public int f121608c;

    /* renamed from: d */
    public int f121609d;

    /* renamed from: e */
    public float f121610e;

    /* renamed from: f */
    public String f121611f;

    /* renamed from: g */
    public float f121612g;

    /* renamed from: h */
    public int f121613h;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo119477a() {
        if (this.f121613h == 1) {
            return true;
        }
        return false;
    }

    public VEPreviewMusicParams() {
        this.f121613h = 1;
        this.f121610e = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEPreviewMusicParams{mPath='");
        sb.append(this.f121606a);
        sb.append('\'');
        sb.append(", mInPoint=");
        sb.append(this.f121607b);
        sb.append(", mDuration=");
        sb.append(this.f121608c);
        sb.append(", mVolume=");
        sb.append(this.f121610e);
        sb.append("previewStartTime=");
        sb.append(this.f121612g);
        sb.append('}');
        return sb.toString();
    }

    protected VEPreviewMusicParams(Parcel parcel) {
        this.f121613h = 1;
        this.f121606a = parcel.readString();
        this.f121607b = parcel.readInt();
        this.f121608c = parcel.readInt();
        this.f121610e = parcel.readFloat();
        this.f121611f = parcel.readString();
        this.f121613h = parcel.readInt();
        this.f121612g = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121606a);
        parcel.writeInt(this.f121607b);
        parcel.writeInt(this.f121608c);
        parcel.writeFloat(this.f121610e);
        parcel.writeString(this.f121611f);
        parcel.writeInt(this.f121613h);
        parcel.writeFloat(this.f121612g);
    }
}
