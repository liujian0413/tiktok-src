package com.p280ss.android.ugc.asve.constant;

import com.p280ss.android.vesdk.VECameraSettings.CAMERA_TYPE;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.e */
public final class C15411e {
    /* renamed from: a */
    public static final CAMERA_TYPE m45061a(ASCameraType aSCameraType) {
        C7573i.m23587b(aSCameraType, "$this$toVECameraType");
        switch (C15412f.f39719a[aSCameraType.ordinal()]) {
            case 1:
                return CAMERA_TYPE.NULL;
            case 2:
                return CAMERA_TYPE.TYPE1;
            case 3:
                return CAMERA_TYPE.TYPE2;
            case 4:
                return CAMERA_TYPE.TYPE_CHRYCamera;
            case 5:
                return CAMERA_TYPE.TYPE_Mi;
            case 6:
                return CAMERA_TYPE.TYPE_Oppo;
            case 7:
                return CAMERA_TYPE.TYPE_CamKit;
            case 8:
                return CAMERA_TYPE.TYPE_Vivo;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
