package com.zego.p1851ve;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zego.p1851ve.CameraAvailabilityCallback.Listener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.zego.ve.VCam */
public class VCam {
    int mBackCameraId = -1;
    private Camera mCam;
    private CameraInfo mCamInfo;
    private Object mCameraAvailabilityCallback;
    private Context mContext;
    float mExposureCompensation;
    int mExposureMode = -1;
    float mExposurePointX;
    float mExposurePointY;
    int mFocusMode = -1;
    float mFocusPointX;
    float mFocusPointY;
    int mFrameRate = 15;
    int mFrontCameraId = -1;
    int mHeight = 480;
    boolean mNeedHack;
    public long mThis;
    int mUseCameraId = -1;
    int mWidth = 640;

    static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public static native void onCameraAvailable(long j);

    public static native void onCameraUnavailable(long j);

    /* access modifiers changed from: 0000 */
    public int getBackCameraId() {
        return this.mBackCameraId;
    }

    /* access modifiers changed from: 0000 */
    public int getFramerate() {
        return this.mFrameRate;
    }

    /* access modifiers changed from: 0000 */
    public int getFrontCameraId() {
        return this.mFrontCameraId;
    }

    /* access modifiers changed from: 0000 */
    public int getHeight() {
        return this.mHeight;
    }

    /* access modifiers changed from: 0000 */
    public int getWidth() {
        return this.mWidth;
    }

    private boolean isSupportCameraAvailabilityCallback() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean checkPermission() {
        return PermissionChecker.checkSelfPermission(this.mContext, "android.permission.CAMERA");
    }

    /* access modifiers changed from: 0000 */
    public int getFront() {
        if (this.mCamInfo == null || this.mCamInfo.facing != 1) {
            return 0;
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public int getOrientation() {
        if (this.mCamInfo != null) {
            return this.mCamInfo.orientation;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int releaseCam() {
        if (isSupportCameraAvailabilityCallback()) {
            unregisterCameraAvailabilityCallback();
        }
        if (this.mCam != null) {
            this.mCam.release();
            this.mCam = null;
        }
        this.mCamInfo = null;
        this.mUseCameraId = -1;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int stopCam() {
        if (this.mCam != null) {
            this.mCam.stopPreview();
            try {
                this.mCam.setPreviewTexture(null);
            } catch (IOException unused) {
            }
        }
        return 0;
    }

    private void registerCameraAvailabilityCallback() {
        if (this.mContext != null) {
            try {
                CameraManager cameraManager = (CameraManager) this.mContext.getSystemService("camera");
                this.mCameraAvailabilityCallback = new CameraAvailabilityCallback(new Listener() {
                    public void onCameraAvailable(String str) {
                        StringBuilder sb = new StringBuilder("trace interruption this: ");
                        sb.append(VCam.this);
                        sb.append(", cameraId: ");
                        sb.append(str);
                        sb.append(" available, mUseCameraId: ");
                        sb.append(VCam.this.mUseCameraId);
                        Log.m147741i("vcap", sb.toString());
                        VCam.onCameraAvailable(VCam.this.mThis);
                    }

                    public void onCameraUnavailable(String str) {
                        StringBuilder sb = new StringBuilder("trace interruption this: ");
                        sb.append(VCam.this);
                        sb.append(", cameraId: ");
                        sb.append(str);
                        sb.append(" unavailable, mUseCameraId: ");
                        sb.append(VCam.this.mUseCameraId);
                        Log.m147741i("vcap", sb.toString());
                        VCam.onCameraUnavailable(VCam.this.mThis);
                    }
                });
                cameraManager.registerAvailabilityCallback((CameraAvailabilityCallback) this.mCameraAvailabilityCallback, null);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("registerCameraAvailabilityCallback failed, ");
                sb.append(th);
                Log.m147739e("vcap", sb.toString());
            }
        }
    }

    private void unregisterCameraAvailabilityCallback() {
        if (this.mContext != null) {
            try {
                ((CameraManager) this.mContext.getSystemService("camera")).unregisterAvailabilityCallback((CameraAvailabilityCallback) this.mCameraAvailabilityCallback);
                this.mCameraAvailabilityCallback = null;
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("unregisterCameraAvailabilityCallback failed, ");
                sb.append(th);
                Log.m147739e("vcap", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int closeTorch() {
        boolean z;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (parameters.getSupportedFlashModes().contains("off")) {
            z = true;
            try {
                parameters.setFlashMode("off");
            } catch (Exception unused) {
            }
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        try {
            this.mCam.setParameters(parameters);
        } catch (Exception unused2) {
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int openTorch() {
        boolean z;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (parameters.getSupportedFlashModes().contains("torch")) {
            z = true;
            try {
                parameters.setFlashMode("torch");
            } catch (Exception unused) {
            }
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        try {
            this.mCam.setParameters(parameters);
        } catch (Exception unused2) {
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void enumerateCamera() {
        CameraInfo cameraInfo = new CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0 && this.mBackCameraId == -1) {
                this.mBackCameraId = i;
            }
            if (cameraInfo.facing == 1 && this.mFrontCameraId == -1) {
                this.mFrontCameraId = i;
            }
        }
        StringBuilder sb = new StringBuilder("trace interruption enumerateCamera this: ");
        sb.append(this);
        sb.append(", mFrontCameraId: ");
        sb.append(this.mFrontCameraId);
        sb.append(", mBackCameraId: ");
        sb.append(this.mBackCameraId);
        Log.m147741i("vcap", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public int startCam() {
        boolean z;
        this.mCam.startPreview();
        this.mCam.cancelAutoFocus();
        Parameters parameters = this.mCam.getParameters();
        if (doSetFocusMode(this.mFocusMode, parameters) > 0) {
            z = true;
            doSetFocusPoint(this.mFocusPointX, this.mFocusPointY, parameters);
        } else {
            if (parameters.getMaxNumFocusAreas() > 0) {
                parameters.setFocusAreas(null);
            }
            z = false;
        }
        if (doSetExposureMode(this.mExposureMode, parameters) == 0) {
            doSetExposurePoint(this.mExposurePointX, this.mExposurePointY, parameters);
            try {
                this.mCam.setParameters(parameters);
            } catch (Exception unused) {
            }
        }
        if (z) {
            this.mCam.autoFocus(null);
        }
        return 0;
    }

    private String GetCameraString(int i) {
        if (i == this.mFrontCameraId) {
            return "front camera";
        }
        return "back camera";
    }

    /* access modifiers changed from: 0000 */
    public int setRate(int i) {
        this.mFrameRate = i;
        if (this.mCam != null) {
            updateRate(i);
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int setSurfaceTexture(SurfaceTexture surfaceTexture) {
        if (this.mCam == null) {
            return -1;
        }
        try {
            this.mCam.setPreviewTexture(surfaceTexture);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int setExposureCompensation(float f) {
        this.mExposureCompensation = f;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (doSetExposureCompensation(f, parameters) != 0) {
            return -1;
        }
        try {
            this.mCam.setParameters(parameters);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int setExposureMode(int i) {
        this.mExposureMode = i;
        if (this.mCam == null) {
            return -1;
        }
        Parameters parameters = this.mCam.getParameters();
        if (doSetExposureMode(this.mExposureMode, parameters) != 0) {
            return -1;
        }
        try {
            this.mCam.setParameters(parameters);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int setFocusMode(int i) {
        boolean z;
        this.mFocusMode = i;
        if (this.mCam == null) {
            return -1;
        }
        this.mCam.cancelAutoFocus();
        Parameters parameters = this.mCam.getParameters();
        if (doSetFocusMode(this.mFocusMode, parameters) > 0) {
            z = true;
            doSetFocusPoint(this.mFocusPointX, this.mFocusPointY, parameters);
        } else {
            if (parameters.getMaxNumFocusAreas() > 0) {
                parameters.setFocusAreas(null);
            }
            z = false;
        }
        try {
            this.mCam.setParameters(parameters);
            if (z) {
                this.mCam.autoFocus(null);
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int updateRate(int i) {
        this.mFrameRate = i;
        Parameters parameters = this.mCam.getParameters();
        List supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            Iterator it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] iArr = (int[]) it.next();
                if (iArr[0] == iArr[1] && iArr[0] == this.mFrameRate * 1000) {
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    break;
                }
            }
        }
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        if (iArr2[0] == iArr2[1]) {
            this.mFrameRate = iArr2[0] / 1000;
        } else {
            this.mFrameRate = (iArr2[1] / 2) / 1000;
        }
        try {
            this.mCam.setParameters(parameters);
        } catch (Exception unused) {
        }
        return 0;
    }

    public int createCam(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        if (i == -1) {
            return -1;
        }
        if (this.mCam != null) {
            return 0;
        }
        this.mCamInfo = new CameraInfo();
        try {
            this.mCam = Camera.open(i);
            Camera.getCameraInfo(i, this.mCamInfo);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("trace interruption open ");
            sb.append(GetCameraString(i));
            sb.append(" failed, ");
            sb.append(e);
            Log.m147739e("vcap", sb.toString());
            this.mCam = null;
        }
        this.mUseCameraId = i;
        if (this.mCam == null) {
            try {
                this.mCam = Camera.open();
            } catch (RuntimeException e2) {
                StringBuilder sb2 = new StringBuilder("trace interruption open ");
                sb2.append(GetCameraString(this.mBackCameraId));
                sb2.append(" failed, ");
                sb2.append(e2);
                Log.m147739e("vcap", sb2.toString());
                this.mCam = null;
            }
            if (this.mCam == null) {
                return -1;
            }
            Camera.getCameraInfo(this.mBackCameraId, this.mCamInfo);
            this.mUseCameraId = this.mBackCameraId;
        }
        Parameters parameters = this.mCam.getParameters();
        Size preferredPreviewSizeForVideo = parameters.getPreferredPreviewSizeForVideo();
        List<Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes == null) {
            supportedVideoSizes = parameters.getSupportedPreviewSizes();
        }
        if (supportedVideoSizes != null) {
            i4 = 0;
            i3 = 0;
            for (Size size : supportedVideoSizes) {
                if (size.width * size.height > i4 * i3 && (size.width * 3 == size.height * 4 || size.width * 9 == size.height * 16)) {
                    i4 = size.width;
                    i3 = size.height;
                }
            }
            i5 = 0;
            i2 = 0;
            for (Size size2 : supportedVideoSizes) {
                if (size2.width % 16 == 0 && size2.height % 16 == 0) {
                    if (size2.width < this.mWidth || size2.height < this.mHeight) {
                        if (size2.width >= this.mWidth) {
                            if (i5 < this.mWidth || i2 < this.mHeight) {
                                if (i5 < this.mWidth && i2 < this.mHeight) {
                                    i5 = size2.width;
                                    i2 = size2.height;
                                } else if (i5 >= this.mWidth && size2.height > i2) {
                                    i5 = size2.width;
                                    i2 = size2.height;
                                } else if (size2.width * size2.height > i5 * i2) {
                                    i5 = size2.width;
                                    i2 = size2.height;
                                }
                            }
                        } else if (size2.height >= this.mHeight && (i5 < this.mWidth || i2 < this.mHeight)) {
                            if (i5 < this.mWidth && i2 < this.mHeight) {
                                i5 = size2.width;
                                i2 = size2.height;
                            } else if (i2 >= this.mHeight && size2.width > i5) {
                                i5 = size2.width;
                                i2 = size2.height;
                            } else if (size2.width * size2.height > i5 * i2) {
                                i5 = size2.width;
                                i2 = size2.height;
                            }
                        }
                    } else if (i5 < this.mWidth || i2 < this.mHeight) {
                        i5 = size2.width;
                        i2 = size2.height;
                    } else if (size2.width * size2.height < i5 * i2) {
                        i5 = size2.width;
                        i2 = size2.height;
                    }
                }
            }
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        if (i5 * i2 != 0) {
            parameters.setPreviewSize(i5, i2);
            this.mWidth = i5;
            this.mHeight = i2;
        } else if (i4 * i3 != 0) {
            parameters.setPreviewSize(i4, i3);
            this.mWidth = i4;
            this.mHeight = i3;
        } else {
            parameters.setPreviewSize(320, 240);
            this.mWidth = 320;
            this.mHeight = 240;
        }
        if ((!Build.MANUFACTURER.equals("Xiaomi") || !Build.MODEL.equals("MI 4LTE") || VERSION.SDK_INT > 19) && !this.mNeedHack) {
            z = true;
        } else {
            z = false;
        }
        if (!z && preferredPreviewSizeForVideo != null) {
            parameters.setPreviewSize(preferredPreviewSizeForVideo.width, preferredPreviewSizeForVideo.height);
            this.mWidth = preferredPreviewSizeForVideo.width;
            this.mHeight = preferredPreviewSizeForVideo.height;
        }
        StringBuilder sb3 = new StringBuilder("vcap: preview size -- perferred:");
        if (preferredPreviewSizeForVideo == null) {
            i6 = 0;
        } else {
            i6 = preferredPreviewSizeForVideo.width;
        }
        sb3.append(i6);
        sb3.append("x");
        if (preferredPreviewSizeForVideo == null) {
            i7 = 0;
        } else {
            i7 = preferredPreviewSizeForVideo.height;
        }
        sb3.append(i7);
        sb3.append(", candidate:");
        sb3.append(i5);
        sb3.append("x");
        sb3.append(i2);
        sb3.append(", preview:");
        sb3.append(this.mWidth);
        sb3.append("x");
        sb3.append(this.mHeight);
        List supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            Iterator it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] iArr = (int[]) it.next();
                if (iArr[0] == iArr[1] && iArr[0] == this.mFrameRate * 1000) {
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    break;
                }
            }
        }
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        if (iArr2[0] == iArr2[1]) {
            this.mFrameRate = iArr2[0] / 1000;
        } else {
            this.mFrameRate = (iArr2[1] / 2) / 1000;
        }
        try {
            this.mCam.setParameters(parameters);
            Parameters parameters2 = this.mCam.getParameters();
            this.mWidth = parameters2.getPreviewSize().width;
            this.mHeight = parameters2.getPreviewSize().height;
            if (isSupportCameraAvailabilityCallback()) {
                registerCameraAvailabilityCallback();
            }
            return 0;
        } catch (Exception unused) {
            this.mCam.release();
            this.mCam = null;
            if (this.mNeedHack) {
                return -1;
            }
            this.mNeedHack = true;
            return createCam(i);
        }
    }

    public int setContext(long j, Context context) {
        this.mThis = j;
        this.mContext = context;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int setFocusPoint(float f, float f2) {
        this.mFocusPointX = f;
        this.mFocusPointY = f2;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int setSize(int i, int i2) {
        if (i < i2) {
            this.mWidth = i2;
            this.mHeight = i;
        } else {
            this.mWidth = i;
            this.mHeight = i2;
        }
        this.mNeedHack = false;
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int doSetExposureCompensation(float f, Parameters parameters) {
        float f2;
        int minExposureCompensation = parameters.getMinExposureCompensation() * -1;
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        if (f < 0.0f) {
            f2 = (float) minExposureCompensation;
        } else {
            f2 = (float) maxExposureCompensation;
        }
        try {
            parameters.setExposureCompensation((int) (f2 * f));
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int doSetExposureMode(int i, Parameters parameters) {
        if (i == -1) {
            return 0;
        }
        if (!parameters.isAutoExposureLockSupported()) {
            return -1;
        }
        if (i == 0) {
            try {
                parameters.setAutoExposureLock(false);
            } catch (Exception unused) {
            }
        } else if (i == 1) {
            parameters.setAutoExposureLock(true);
        }
        doSetExposureCompensation(this.mExposureCompensation, parameters);
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public int setExposurePoint(float f, float f2) {
        this.mExposurePointX = f;
        this.mExposurePointY = f2;
        Parameters parameters = this.mCam.getParameters();
        doSetExposurePoint(f, f2, parameters);
        try {
            this.mCam.setParameters(parameters);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = r6.getSupportedFocusModes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r3 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r3.contains(r5) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.setFocusMode(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doSetFocusMode(int r5, android.hardware.Camera.Parameters r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            switch(r5) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0012;
                case 2: goto L_0x000f;
                case 3: goto L_0x000c;
                case 4: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r5 = "continuous-video"
        L_0x0007:
            r2 = 0
            goto L_0x0018
        L_0x0009:
            java.lang.String r5 = "edof"
            goto L_0x0007
        L_0x000c:
            java.lang.String r5 = "fixed"
            goto L_0x0007
        L_0x000f:
            java.lang.String r5 = "macro"
            goto L_0x0017
        L_0x0012:
            java.lang.String r5 = "infinity"
            goto L_0x0007
        L_0x0015:
            java.lang.String r5 = "auto"
        L_0x0017:
            r2 = 1
        L_0x0018:
            java.util.List r3 = r6.getSupportedFocusModes()
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0029
            r6.setFocusMode(r5)     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 != 0) goto L_0x002e
            r5 = -1
            return r5
        L_0x002e:
            if (r2 == 0) goto L_0x0031
            return r1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.p1851ve.VCam.doSetFocusMode(int, android.hardware.Camera$Parameters):int");
    }

    /* access modifiers changed from: 0000 */
    public int doSetExposurePoint(float f, float f2, Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() == 0) {
            return -1;
        }
        int i = (int) (f * 1000.0f);
        int i2 = (int) (f2 * 1000.0f);
        Rect rect = new Rect(clamp(i - 200, -1000, 1000), clamp(i2 - 200, -1000, 1000), clamp(i + C34943c.f91127w, -1000, 1000), clamp(i2 + C34943c.f91127w, -1000, 1000));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Area(rect, 800));
        try {
            parameters.setMeteringAreas(arrayList);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    public int doSetFocusPoint(float f, float f2, Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() == 0) {
            return -1;
        }
        int i = (int) (f * 1000.0f);
        int i2 = (int) (f2 * 1000.0f);
        Rect rect = new Rect(clamp(i - 200, -1000, 1000), clamp(i2 - 200, -1000, 1000), clamp(i + C34943c.f91127w, -1000, 1000), clamp(i2 + C34943c.f91127w, -1000, 1000));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Area(rect, 800));
        try {
            parameters.setFocusAreas(arrayList);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }
}
