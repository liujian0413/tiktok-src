package android.support.p022v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new Creator<ParcelableVolumeInfo>() {
        /* renamed from: a */
        private static ParcelableVolumeInfo[] m3682a(int i) {
            return new ParcelableVolumeInfo[i];
        }

        /* renamed from: a */
        private static ParcelableVolumeInfo m3681a(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3681a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m3682a(i);
        }
    };

    /* renamed from: a */
    public int f3058a;

    /* renamed from: b */
    public int f3059b;

    /* renamed from: c */
    public int f3060c;

    /* renamed from: d */
    public int f3061d;

    /* renamed from: e */
    public int f3062e;

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f3058a = parcel.readInt();
        this.f3060c = parcel.readInt();
        this.f3061d = parcel.readInt();
        this.f3062e = parcel.readInt();
        this.f3059b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3058a);
        parcel.writeInt(this.f3060c);
        parcel.writeInt(this.f3061d);
        parcel.writeInt(this.f3062e);
        parcel.writeInt(this.f3059b);
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f3058a = i;
        this.f3059b = i2;
        this.f3060c = i3;
        this.f3061d = i4;
        this.f3062e = i5;
    }
}
