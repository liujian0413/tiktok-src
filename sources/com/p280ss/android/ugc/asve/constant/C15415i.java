package com.p280ss.android.ugc.asve.constant;

import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.i */
public final class C15415i {
    /* renamed from: a */
    public static final CAMERA_FACING_ID m45062a(AS_CAMERA_LENS_FACING as_camera_lens_facing) {
        C7573i.m23587b(as_camera_lens_facing, "$this$toVEFacingID");
        switch (C15416j.f39722a[as_camera_lens_facing.ordinal()]) {
            case 1:
                return CAMERA_FACING_ID.FACING_BACK;
            case 2:
                return CAMERA_FACING_ID.FACING_FRONT;
            case 3:
                return CAMERA_FACING_ID.FACING_WIDE_ANGLE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
