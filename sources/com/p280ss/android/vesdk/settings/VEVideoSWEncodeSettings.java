package com.p280ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;

/* renamed from: com.ss.android.vesdk.settings.VEVideoSWEncodeSettings */
public class VEVideoSWEncodeSettings implements Parcelable {
    public static final Creator<VEVideoSWEncodeSettings> CREATOR = new Creator<VEVideoSWEncodeSettings>() {
        /* renamed from: a */
        private static VEVideoSWEncodeSettings[] m143399a(int i) {
            return new VEVideoSWEncodeSettings[i];
        }

        /* renamed from: a */
        private static VEVideoSWEncodeSettings m143398a(Parcel parcel) {
            return new VEVideoSWEncodeSettings(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m143398a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m143399a(i);
        }
    };
    private static final String TAG = "VEVideoSWEncodeSettings";
    public int mBitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
    public int mBps = 4000000;
    public int mCrf = 15;
    public int mGop = 35;
    public long mMaxRate = 15000000;
    public int mPreset = VEVideoEncodePreset.ENCODE_LEVEL_ULTRAFAST.ordinal();
    public int mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();

    public int describeContents() {
        return 0;
    }

    public VEVideoSWEncodeSettings() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEVideoSWEncodeSettings{mCrf=");
        sb.append(this.mCrf);
        sb.append(", mBps=");
        sb.append(this.mBps);
        sb.append(", mBitrateMode=");
        sb.append(this.mBitrateMode);
        sb.append(", mPreset=");
        sb.append(this.mPreset);
        sb.append(", mProfile=");
        sb.append(this.mProfile);
        sb.append(", mMaxRate=");
        sb.append(this.mMaxRate);
        sb.append(", mGop=");
        sb.append(this.mGop);
        sb.append('}');
        return sb.toString();
    }

    protected VEVideoSWEncodeSettings(Parcel parcel) {
        this.mCrf = parcel.readInt();
        this.mPreset = parcel.readInt();
        this.mProfile = parcel.readInt();
        this.mMaxRate = parcel.readLong();
        this.mBps = parcel.readInt();
        this.mBitrateMode = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCrf);
        parcel.writeInt(this.mPreset);
        parcel.writeInt(this.mProfile);
        parcel.writeLong(this.mMaxRate);
        parcel.writeInt(this.mBps);
        parcel.writeInt(this.mBitrateMode);
    }
}
