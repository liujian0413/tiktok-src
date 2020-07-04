package com.p280ss.android.ugc.asve.recorder.camera;

import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_TYPE;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.f */
public final class C20732f {
    /* renamed from: a */
    public static final CAMERA_FACING_ID m68908a(int i) {
        switch (i) {
            case 0:
                return CAMERA_FACING_ID.FACING_BACK;
            case 1:
                return CAMERA_FACING_ID.FACING_FRONT;
            case 2:
                return CAMERA_FACING_ID.FACING_WIDE_ANGLE;
            case 3:
                return CAMERA_FACING_ID.FACING_3RD;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static final CAMERA_TYPE m68909b(int i) {
        switch (i) {
            case 0:
                return CAMERA_TYPE.NULL;
            case 1:
                return CAMERA_TYPE.TYPE1;
            case 2:
                return CAMERA_TYPE.TYPE2;
            case 3:
                return CAMERA_TYPE.TYPE_CHRYCamera;
            case 4:
                return CAMERA_TYPE.TYPE_Mi;
            case 5:
                return CAMERA_TYPE.TYPE_Oppo;
            case 6:
                return CAMERA_TYPE.TYPE_Vivo;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public static final CAMERA_FLASH_MODE m68910c(int i) {
        switch (i) {
            case 0:
                return CAMERA_FLASH_MODE.CAMERA_FLASH_OFF;
            case 1:
                return CAMERA_FLASH_MODE.CAMERA_FLASH_ON;
            case 2:
                return CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH;
            case 3:
                return CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO;
            case 4:
                return CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE;
            default:
                throw new IllegalStateException();
        }
    }
}
