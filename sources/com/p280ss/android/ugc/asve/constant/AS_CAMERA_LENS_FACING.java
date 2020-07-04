package com.p280ss.android.ugc.asve.constant;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING */
public enum AS_CAMERA_LENS_FACING {
    AS_CAMERA_LENS_BACK,
    AS_CAMERA_LENS_FRONT,
    AS_CAMERA_LENS_WIDE;
    
    public static final C15405a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING$a */
    public static final class C15405a {
        private C15405a() {
        }

        public /* synthetic */ C15405a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AS_CAMERA_LENS_FACING m45057a(int i) {
            switch (i) {
                case 0:
                    return AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_BACK;
                case 1:
                    return AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_FRONT;
                case 2:
                    return AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_WIDE;
                default:
                    return AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_BACK;
            }
        }

        /* renamed from: a */
        public static int m45056a(AS_CAMERA_LENS_FACING as_camera_lens_facing) {
            C7573i.m23587b(as_camera_lens_facing, "asCameraLensFacing");
            switch (C15414h.f39721a[as_camera_lens_facing.ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        Companion = new C15405a(null);
    }

    public static final AS_CAMERA_LENS_FACING fromOrdinal(int i) {
        return C15405a.m45057a(i);
    }

    public static final int toIntValue(AS_CAMERA_LENS_FACING as_camera_lens_facing) {
        return C15405a.m45056a(as_camera_lens_facing);
    }
}
