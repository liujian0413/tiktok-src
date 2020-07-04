package com.p280ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: com.ss.android.vesdk.settings.VEVideoEncodeProfile */
public enum VEVideoEncodeProfile implements Parcelable {
    ENCODE_PROFILE_UNKNOWN,
    ENCODE_PROFILE_BASELINE,
    ENCODE_PROFILE_MAIN,
    ENCODE_PROFILE_HIGH;
    
    public static final Creator<VEVideoEncodeProfile> CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    static {
        CREATOR = new Creator<VEVideoEncodeProfile>() {
            /* renamed from: a */
            private static VEVideoEncodeProfile[] m143395a(int i) {
                return new VEVideoEncodeProfile[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m143394a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m143395a(i);
            }

            /* renamed from: a */
            private static VEVideoEncodeProfile m143394a(Parcel parcel) {
                return VEVideoEncodeProfile.values()[parcel.readInt()];
            }
        };
    }

    public static VEVideoEncodeProfile valueOfString(String str) {
        VEVideoEncodeProfile vEVideoEncodeProfile = ENCODE_PROFILE_UNKNOWN;
        if (TextUtils.isEmpty(str)) {
            return vEVideoEncodeProfile;
        }
        if ("baseline".equals(str)) {
            return ENCODE_PROFILE_BASELINE;
        }
        if ("main".equals(str)) {
            return ENCODE_PROFILE_MAIN;
        }
        if ("high".equals(str)) {
            return ENCODE_PROFILE_HIGH;
        }
        return vEVideoEncodeProfile;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
