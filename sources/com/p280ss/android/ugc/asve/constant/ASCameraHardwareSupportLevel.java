package com.p280ss.android.ugc.asve.constant;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel */
public enum ASCameraHardwareSupportLevel {
    AS_HW_CHECK_LEVEL_LEGACY,
    AS_HW_CHECK_LEVEL_LIMITED,
    AS_HW_CHECK_LEVEL_FULL,
    AS_HW_CHECK_LEVEL_3;
    
    public static final C15402a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel$a */
    public static final class C15402a {
        private C15402a() {
        }

        public /* synthetic */ C15402a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static int m45050a(ASCameraHardwareSupportLevel aSCameraHardwareSupportLevel) {
            C7573i.m23587b(aSCameraHardwareSupportLevel, "asCameraHardwareSupportLevel");
            switch (C15407a.f39716a[aSCameraHardwareSupportLevel.ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public static ASCameraHardwareSupportLevel m45051a(int i) {
            switch (i) {
                case 0:
                    return ASCameraHardwareSupportLevel.AS_HW_CHECK_LEVEL_LEGACY;
                case 1:
                    return ASCameraHardwareSupportLevel.AS_HW_CHECK_LEVEL_LIMITED;
                case 2:
                    return ASCameraHardwareSupportLevel.AS_HW_CHECK_LEVEL_FULL;
                case 3:
                    return ASCameraHardwareSupportLevel.AS_HW_CHECK_LEVEL_3;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    static {
        Companion = new C15402a(null);
    }

    public static final ASCameraHardwareSupportLevel fromOrdinal(int i) {
        return C15402a.m45051a(i);
    }

    public static final int toIntValue(ASCameraHardwareSupportLevel aSCameraHardwareSupportLevel) {
        return C15402a.m45050a(aSCameraHardwareSupportLevel);
    }
}
