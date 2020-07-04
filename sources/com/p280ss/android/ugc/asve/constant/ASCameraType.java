package com.p280ss.android.ugc.asve.constant;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.ASCameraType */
public enum ASCameraType {
    AS_CAMERA_NULL,
    AS_CAMERA_1,
    AS_CAMERA_2,
    AS_CAMERA_CHRY,
    AS_CAMERA_MI,
    AS_CAMERA_OPPO,
    AS_CAMERA_CHRY_CAMKIT,
    AS_CAMERA_VIVO;
    
    public static final C15403a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.constant.ASCameraType$a */
    public static final class C15403a {
        private C15403a() {
        }

        public /* synthetic */ C15403a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static int m45052a(ASCameraType aSCameraType) {
            C7573i.m23587b(aSCameraType, "asCameraType");
            switch (C15410d.f39718a[aSCameraType.ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                case 8:
                    return 7;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public static ASCameraType m45053a(int i) {
            switch (i) {
                case 1:
                    return ASCameraType.AS_CAMERA_1;
                case 2:
                    return ASCameraType.AS_CAMERA_2;
                case 3:
                    return ASCameraType.AS_CAMERA_CHRY;
                case 4:
                    return ASCameraType.AS_CAMERA_MI;
                case 5:
                    return ASCameraType.AS_CAMERA_OPPO;
                case 6:
                    return ASCameraType.AS_CAMERA_CHRY_CAMKIT;
                case 7:
                    return ASCameraType.AS_CAMERA_VIVO;
                default:
                    return ASCameraType.AS_CAMERA_NULL;
            }
        }
    }

    static {
        Companion = new C15403a(null);
    }

    public static final ASCameraType fromOrdinal(int i) {
        return C15403a.m45053a(i);
    }

    public static final int toIntValue(ASCameraType aSCameraType) {
        return C15403a.m45052a(aSCameraType);
    }
}
