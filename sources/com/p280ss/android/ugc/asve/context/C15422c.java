package com.p280ss.android.ugc.asve.context;

import com.p280ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel;
import com.p280ss.android.ugc.asve.constant.ASCameraType;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_OPTION_FLAG;

/* renamed from: com.ss.android.ugc.asve.context.c */
public interface C15422c {

    /* renamed from: com.ss.android.ugc.asve.context.c$a */
    public static final class C15423a {
        /* renamed from: a */
        public static AS_CAMERA_LENS_FACING m45097a(C15422c cVar) {
            return AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_FRONT;
        }

        /* renamed from: b */
        public static ASCameraType m45098b(C15422c cVar) {
            return ASCameraType.AS_CAMERA_1;
        }

        /* renamed from: c */
        public static ASCameraHardwareSupportLevel m45099c(C15422c cVar) {
            return ASCameraHardwareSupportLevel.AS_HW_CHECK_LEVEL_LIMITED;
        }

        /* renamed from: e */
        public static int[] m45101e(C15422c cVar) {
            return new int[0];
        }

        /* renamed from: d */
        public static byte m45100d(C15422c cVar) {
            return AS_CAMERA_OPTION_FLAG.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
        }
    }

    /* renamed from: a */
    AS_CAMERA_LENS_FACING mo38910a();

    /* renamed from: b */
    ASCameraType mo38911b();

    /* renamed from: c */
    ASCameraHardwareSupportLevel mo38912c();

    /* renamed from: d */
    boolean mo38913d();

    /* renamed from: e */
    byte mo38914e();

    /* renamed from: f */
    boolean mo38915f();

    /* renamed from: g */
    int mo38916g();

    /* renamed from: h */
    int[] mo38917h();
}
