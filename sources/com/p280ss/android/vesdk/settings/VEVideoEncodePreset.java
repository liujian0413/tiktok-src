package com.p280ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.settings.VEVideoEncodePreset */
public enum VEVideoEncodePreset implements Parcelable {
    ENCODE_LEVEL_ULTRAFAST,
    ENCODE_LEVEL_SUPERFAST,
    ENCODE_LEVEL_VERYFAST,
    ENCODE_LEVEL_FASTER,
    ENCODE_LEVEL_FAST,
    ENCODE_LEVEL_MEDIUM,
    ENCODE_LEVEL_SLOW,
    ENCODE_LEVEL_SLOWER,
    ENCODE_LEVEL_VERYSLOW,
    ENCODE_LEVEL_PLACEBO;
    
    public static final Creator<VEVideoEncodePreset> CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    static {
        CREATOR = new Creator<VEVideoEncodePreset>() {
            /* renamed from: a */
            private static VEVideoEncodePreset[] m143393a(int i) {
                return new VEVideoEncodePreset[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m143392a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m143393a(i);
            }

            /* renamed from: a */
            private static VEVideoEncodePreset m143392a(Parcel parcel) {
                return VEVideoEncodePreset.values()[parcel.readInt()];
            }
        };
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
