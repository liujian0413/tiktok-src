package com.p280ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.settings.VEVideoHWEncodeSettings */
public class VEVideoHWEncodeSettings implements Parcelable {
    public static final Creator<VEVideoHWEncodeSettings> CREATOR = new Creator<VEVideoHWEncodeSettings>() {
        /* renamed from: a */
        private static VEVideoHWEncodeSettings[] m143397a(int i) {
            return new VEVideoHWEncodeSettings[i];
        }

        /* renamed from: a */
        private static VEVideoHWEncodeSettings m143396a(Parcel parcel) {
            return new VEVideoHWEncodeSettings(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m143396a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m143397a(i);
        }
    };
    private static final String TAG = "VEVideoHWEncodeSettings";
    public long mBitrate = 6000000;
    public int mGop = 35;
    public double mHp_bitrate_ratio = 0.75d;
    public int mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
    public double mSd_bitrate_ratio = 1.0d;

    public int describeContents() {
        return 0;
    }

    public VEVideoHWEncodeSettings() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEVideoHWEncodeSettings{mBitrate=");
        sb.append(this.mBitrate);
        sb.append(", mProfile=");
        sb.append(this.mProfile);
        sb.append(", mGop=");
        sb.append(this.mGop);
        sb.append('}');
        return sb.toString();
    }

    protected VEVideoHWEncodeSettings(Parcel parcel) {
        this.mBitrate = parcel.readLong();
        this.mProfile = parcel.readInt();
        this.mGop = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mBitrate);
        parcel.writeInt(this.mProfile);
        parcel.writeInt(this.mGop);
    }
}
