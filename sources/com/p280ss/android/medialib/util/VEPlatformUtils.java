package com.p280ss.android.medialib.util;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.medialib.util.VEPlatformUtils */
public final class VEPlatformUtils {

    /* renamed from: com.ss.android.medialib.util.VEPlatformUtils$VEPlatform */
    public enum VEPlatform implements Parcelable {
        PLATFORM_UNKNOWN,
        PLATFORM_QCOM,
        PLATFORM_MTK,
        PLATFORM_HISI,
        PLATFORM_EXYNOS;
        
        public static final Creator<VEPlatform> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<VEPlatform>() {
                /* renamed from: a */
                private static VEPlatform[] m65372a(int i) {
                    return new VEPlatform[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m65371a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m65372a(i);
                }

                /* renamed from: a */
                private static VEPlatform m65371a(Parcel parcel) {
                    return VEPlatform.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: a */
    public static VEPlatform m65370a() {
        VEPlatform vEPlatform = VEPlatform.PLATFORM_UNKNOWN;
        String str = Build.HARDWARE;
        if (str.matches("qcom")) {
            return VEPlatform.PLATFORM_QCOM;
        }
        if (str.matches("mt[0-9]*")) {
            return VEPlatform.PLATFORM_MTK;
        }
        if (str.matches("kirin[0-9]*")) {
            return VEPlatform.PLATFORM_HISI;
        }
        return vEPlatform;
    }
}
