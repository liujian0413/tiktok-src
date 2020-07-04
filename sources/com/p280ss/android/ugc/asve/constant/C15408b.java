package com.p280ss.android.ugc.asve.constant;

import com.p280ss.android.vesdk.VECameraSettings.CAMERA_HW_LEVEL;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.b */
public final class C15408b {
    /* renamed from: a */
    public static final CAMERA_HW_LEVEL m45060a(ASCameraHardwareSupportLevel aSCameraHardwareSupportLevel) {
        C7573i.m23587b(aSCameraHardwareSupportLevel, "$this$toVECameraHWLevel");
        switch (C15409c.f39717a[aSCameraHardwareSupportLevel.ordinal()]) {
            case 1:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
            case 2:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LIMITED;
            case 3:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_FULL;
            case 4:
                return CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEVEL_3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
