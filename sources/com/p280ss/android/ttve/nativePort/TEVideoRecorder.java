package com.p280ss.android.ttve.nativePort;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.p280ss.android.ttve.audio.C20441b;
import com.p280ss.android.ttve.audio.TEAudioWriter;
import com.p280ss.android.ttve.common.C20447e;
import com.p280ss.android.ttve.common.C20448f;
import com.p280ss.android.ttve.nativePort.C20494b.C20497c;

/* renamed from: com.ss.android.ttve.nativePort.TEVideoRecorder */
public class TEVideoRecorder extends TENativeServiceBase {
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    public static final String FACE_BEAUTY_NULL = "null";
    public static final int SCALE_MODE_CENTER_CROP = 0;
    public static final int SCALE_MODE_CENTER_INSIDE = 1;
    public static final int SCALE_MODE_FIT_FULL = 2;
    private static final String TAG = "TEVideoRecorder";
    private C20441b mAudioRecorder = new C20441b(new TEAudioWriter());
    private long mNativeAddr = nativeCreate();
    private C20497c mNativeCreateCallback;

    static {
        TENativeLibsLoader.m67986c();
    }

    private native int nativeAddBackgroundMusic(long j, String str, int i, int i2, int i3, int i4, int i5);

    private native long nativeCreate();

    private native int nativeCreateScene(long j, String[] strArr, String[] strArr2, int i, int i2);

    private native int nativeDestroy(long j);

    private native int nativeDrawFrame(long j, int i, int i2, int i3, int i4, int i5, long j2);

    private native int nativeGetCurrentPosition(long j);

    private native int nativeInit(long j, int i, int i2, int i3, int i4, String str, Surface surface);

    private native int nativeRemoveBackgroundMusic(long j, int i);

    private native int nativeSeek(long j, int i);

    private native int nativeSetBeautyFace(long j, int i, String str);

    private native int nativeSetBeautyFaceIntensity(long j, float f, float f2);

    private native int nativeSetBeautyIntensity(long j, int i, float f);

    private native int nativeSetCameraFocus(long j, float f, float f2, float f3);

    private native int nativeSetDeviceRotation(long j, float[] fArr);

    private native int nativeSetEncoderContext(long j);

    private native int nativeSetFaceMakeUp(long j, String str, float f, float f2);

    private native int nativeSetFaceReshape(long j, String str, float f, float f2);

    private native int nativeSetFilter(long j, String str, float f);

    private native int nativeSetFilterIntensity(long j, float f);

    private native int nativeSetPreviewScaleMode(long j, int i);

    private native int nativeSetSurface(long j, Surface surface);

    private native int nativeSetSurfaceTexture(long j, SurfaceTexture surfaceTexture, int i);

    private native int nativeShotScreen(long j, String str, int i, int i2, int i3, int i4);

    private native int nativeStartPreview(long j);

    private native int nativeStartRecord(long j, String str, int i, int i2, float f, boolean z);

    private native int nativeStopPreview(long j);

    private native int nativeStopRecord(long j);

    private native int nativeSwitchCamera(long j, int i);

    private native int nativeSwitchEffect(long j, String str);

    private native int nativeSwitchFilter(long j, String str, String str2, float f);

    private native int nativeUpdateCameraRotation(long j, int i, boolean z);

    public int destroy() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.mo55022a();
        int nativeDestroy = nativeDestroy(this.mNativeAddr);
        this.mNativeAddr = 0;
        return nativeDestroy;
    }

    public int getCurrentPosition() {
        if (this.mNativeAddr == 0) {
            return 0;
        }
        return nativeGetCurrentPosition(this.mNativeAddr);
    }

    public int setEncoderContext() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetEncoderContext(this.mNativeAddr);
    }

    public int startPreview() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeStartPreview(this.mNativeAddr);
    }

    public int stopPreview() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeStopPreview(this.mNativeAddr);
    }

    public int stopRecorder() {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.mo55025b();
        return nativeStopRecord(this.mNativeAddr);
    }

    public int removeBackgroundMusic(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeRemoveBackgroundMusic(this.mNativeAddr, i);
    }

    public int seek(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSeek(this.mNativeAddr, i);
    }

    public int setDeviceRoation(float[] fArr) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetDeviceRotation(this.mNativeAddr, fArr);
    }

    public int setFilterIntensity(float f) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFilterIntensity(this.mNativeAddr, f);
    }

    public int setPreviewScaleMode(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetPreviewScaleMode(this.mNativeAddr, i);
    }

    public int setSurface(Surface surface) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetSurface(this.mNativeAddr, surface);
    }

    public int switchCamera(int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSwitchCamera(this.mNativeAddr, i);
    }

    public int switchEffect(String str) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSwitchEffect(this.mNativeAddr, str);
    }

    public int startRecord(C20447e eVar) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.mo55024a(eVar.f55214d, (double) eVar.f55212b, 0, 0);
        return nativeStartRecord(this.mNativeAddr, eVar.f55211a, eVar.f55213c.f55236a, eVar.f55213c.f55237b, eVar.f55212b, eVar.f55215e);
    }

    public int init(C20448f fVar) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.mo55023a(5);
        return nativeInit(this.mNativeAddr, fVar.f55218c, fVar.f55219d, fVar.f55216a, fVar.f55217b, fVar.f55220e, fVar.f55221f);
    }

    public int setBeautyFace(int i, String str) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetBeautyFace(this.mNativeAddr, i, str);
    }

    public int setBeautyFaceIntensity(float f, float f2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetBeautyFaceIntensity(this.mNativeAddr, f, f2);
    }

    public int setBeautyIntensity(int i, float f) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetBeautyIntensity(this.mNativeAddr, i, f);
    }

    public int setFilter(String str, float f) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFilter(this.mNativeAddr, str, f);
    }

    public int setSurfaceTexture(SurfaceTexture surfaceTexture, int i) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetSurfaceTexture(this.mNativeAddr, surfaceTexture, i);
    }

    public int shotScreen(String str, Rect rect) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeShotScreen(this.mNativeAddr, str, rect.left, rect.top, rect.right, rect.bottom);
    }

    public int updateCameraRotation(int i, boolean z) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeUpdateCameraRotation(this.mNativeAddr, i, z);
    }

    public int setCameraFocus(float f, float f2, float f3) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetCameraFocus(this.mNativeAddr, f, f2, f3);
    }

    public int setFaceMakeUp(String str, float f, float f2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFaceMakeUp(this.mNativeAddr, str, f, f2);
    }

    public int setFaceReshape(String str, float f, float f2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSetFaceReshape(this.mNativeAddr, str, f, f2);
    }

    public int switchFilter(String str, String str2, float f) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeSwitchFilter(this.mNativeAddr, str, str2, f);
    }

    public int addBackgroundMusic(String str, int i, int i2, int i3) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeAddBackgroundMusic(this.mNativeAddr, str, 0, i2 - i, i, i2, i3);
    }

    public int createScene(String[] strArr, String[] strArr2, int i, int i2) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeCreateScene(this.mNativeAddr, strArr, strArr2, i, i2);
    }

    public int drawFrame(int i, int i2, int i3, int i4, int i5, long j) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        return nativeDrawFrame(this.mNativeAddr, i, i2, i3, i4, i5, j);
    }

    public int init(int i, int i2, int i3, int i4, String str, Surface surface) {
        if (this.mNativeAddr == 0) {
            return -112;
        }
        this.mAudioRecorder.mo55023a(5);
        return nativeInit(this.mNativeAddr, i, i2, i3, i4, str, surface);
    }
}
