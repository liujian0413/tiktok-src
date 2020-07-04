package com.p280ss.avframework.livestreamv2.effectcamera.camera;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.avframework.livestreamv2.effectcamera.camera.IESCameraInterface.ZoomListener;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.camera.Camera2 */
public class Camera2 implements IESCameraInterface {
    private int currentCameraPosition = -1;
    public CameraCaptureSession mCameraCaptureSession;
    private CameraCharacteristics mCameraCharacteristics;
    public CameraDevice mCameraDevice;
    private int mCameraHWLevel = 1;
    public Handler mCameraHandler;
    public CameraListener mCameraListener;
    private CameraManager mCameraManager;
    private int mCameraRotate;
    private CaptureRequest mCaptureRequest;
    public Builder mCaptureRequestBuilder;
    private int mDeviceHardwareSupportedLevel = 0;
    int[] mFpsRange = new int[2];
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    public volatile boolean mManualFocusEngaged = false;
    private Size[] mOutputSizes;
    private Surface mPreviewSurface;
    public CaptureCallback mSessionCaptureCallback = new CaptureCallback() {
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("Manual AF failure: ");
            sb.append(captureFailure);
            LogUtils.m143680e("Camera2", sb.toString(), new Object[0]);
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            LogUtils.m143677d("Camera2", C1642a.m8034a("onCaptureProgressed: state[AE, AF, AWB] = [%d, %d, %d]", new Object[]{captureResult.get(CaptureResult.CONTROL_AE_STATE), captureResult.get(CaptureResult.CONTROL_AF_STATE), captureResult.get(CaptureResult.CONTROL_AWB_STATE)}), new Object[0]);
        }
    };
    public volatile int mSessionState = 0;
    private StateCallback mStateCallback = new StateCallback() {
        public void onDisconnected(CameraDevice cameraDevice) {
            LogUtils.m143677d("Camera2", "StateCallback::onDisconnected...", new Object[0]);
            Camera2.this.mCameraDevice = cameraDevice;
            Camera2.this.close();
            Camera2.this.resetCameraVariables();
        }

        public void onOpened(CameraDevice cameraDevice) {
            StringBuilder sb = new StringBuilder("StateCallback::onOpened..., camera = ");
            sb.append(cameraDevice);
            LogUtils.m143677d("Camera2", sb.toString(), new Object[0]);
            Camera2.this.mSessionState = 1;
            Camera2.this.mCameraDevice = cameraDevice;
            if (Camera2.this.mCameraListener != null) {
                Camera2.this.mCameraListener.onOpenSuccess(2);
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            if (Camera2.this.mCameraListener != null) {
                Camera2.this.mCameraListener.onOpenFail(2);
                Camera2.this.mCameraListener = null;
            }
            Camera2.this.mCameraDevice = cameraDevice;
            Camera2.this.close();
            Camera2.this.resetCameraVariables();
        }
    };
    private int sHeight;
    private int sWidth;
    private ZoomListener zoomListener;

    public int getCameraPosition() {
        return this.currentCameraPosition;
    }

    public int getDeviceHardwareSupportedLevel() {
        return this.mDeviceHardwareSupportedLevel;
    }

    public void setZoom(float f) {
    }

    public void setZoomListener(ZoomListener zoomListener2) {
    }

    public void stopZoom() {
    }

    public boolean currentValid() {
        if (this.mCameraDevice != null) {
            return true;
        }
        return false;
    }

    public int[] getPreviewWH() {
        return new int[]{this.sWidth, this.sHeight};
    }

    public int[] initCameraParam() {
        return new int[]{this.sWidth, this.sHeight};
    }

    public boolean isFlipHorizontal() {
        if (this.mCameraManager != null && this.currentCameraPosition == 1) {
            return true;
        }
        return false;
    }

    public void resetCameraVariables() {
        this.mSessionState = 0;
        this.mCameraDevice = null;
        this.mCaptureRequestBuilder = null;
        this.mCameraCaptureSession = null;
        this.mCameraCharacteristics = null;
        this.mCaptureRequest = null;
    }

    public boolean isTorchSupported() {
        try {
            return ((Boolean) this.mCameraManager.getCameraCharacteristics("0").get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
            return false;
        }
    }

    public boolean isVideoStabilizationSupported() {
        if (this.mCameraCharacteristics == null) {
            return false;
        }
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    private boolean isMeteringAreaAFSupported() {
        if (this.mCameraCharacteristics == null) {
            try {
                if (((Integer) this.mCameraManager.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public void close() {
        LogUtils.m143677d("Camera2", "close...", new Object[0]);
        if (this.mSessionState == 2) {
            this.mSessionState = 0;
            try {
                if (this.mCameraDevice != null) {
                    this.mCameraDevice.close();
                    this.mCameraDevice = null;
                }
                if (this.mPreviewSurface != null) {
                    this.mPreviewSurface.release();
                    this.mPreviewSurface = null;
                }
            } catch (Throwable unused) {
            }
            this.mCameraListener = null;
        }
    }

    public float getMaxZoom() {
        float f;
        boolean z;
        if (this.mCameraCharacteristics == null) {
            f = -1.0f;
        } else {
            f = ((Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f2 = f / 2.0f;
        if (this.zoomListener != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f2)));
            ZoomListener zoomListener2 = this.zoomListener;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            zoomListener2.onZoomSupport(2, z, false, f2, arrayList);
        }
        return f2;
    }

    public List<int[]> getSupportedPreviewSizes() {
        Size[] sizeArr;
        ArrayList arrayList = new ArrayList();
        for (Size size : this.mOutputSizes) {
            if (size != null) {
                arrayList.add(new int[]{size.getWidth(), size.getHeight()});
            }
        }
        return arrayList;
    }

    public void cancelAutoFocus() {
        if (this.mSessionState == 1) {
            LogUtils.m143677d("Camera2", "Camera is opening, ignore cancelAutoFocus operation.", new Object[0]);
        } else if (isMeteringAreaAFSupported() && this.mCaptureRequestBuilder != null && this.mCameraDevice != null) {
            this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
            this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
            this.mCaptureRequest = this.mCaptureRequestBuilder.build();
            try {
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequest, null, this.mCameraHandler);
            } catch (CameraAccessException e) {
                StringBuilder sb = new StringBuilder("setRepeatingRequest failed, errMsg: ");
                sb.append(e.getMessage());
                LogUtils.m143680e("Camera2", sb.toString(), new Object[0]);
            }
        }
    }

    public void updatePreview() {
        LogUtils.m143677d("Camera2", "updatePreview", new Object[0]);
        if (this.mCameraDevice != null && this.mCaptureRequestBuilder != null) {
            try {
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.mCaptureRequest = this.mCaptureRequestBuilder.build();
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequest, this.mSessionCaptureCallback, this.mCameraHandler);
                this.mSessionState = 2;
                LogUtils.m143677d("Camera2", "send capture request...", new Object[0]);
            } catch (CameraAccessException unused) {
                this.mSessionState = 0;
            } catch (IllegalStateException unused2) {
                this.mSessionState = 0;
            }
        }
    }

    public int setCameraPosition(int i) {
        this.currentCameraPosition = i;
        return 0;
    }

    public int setOrientationDegrees(int i) {
        if (this.currentCameraPosition == 1) {
            return ((360 - ((this.mCameraRotate + i) % 360)) + NormalGiftView.ALPHA_180) % 360;
        }
        return ((this.mCameraRotate - i) + 360) % 360;
    }

    public void enableTorch(boolean z) {
        int i;
        if (this.mCaptureRequestBuilder != null && this.mCameraCaptureSession != null) {
            try {
                Builder builder = this.mCaptureRequestBuilder;
                Key key = CaptureRequest.FLASH_MODE;
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                builder.set(key, Integer.valueOf(i));
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequestBuilder.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    public void init(CameraParams cameraParams) {
        if (cameraParams == null || !cameraParams.isValid()) {
            LogUtils.m143680e("Camera2", "Invalid CameraParams", new Object[0]);
            return;
        }
        this.mCameraHandler = new Handler();
        this.mCameraHWLevel = cameraParams.mCameraHardwareSupportLevel;
        if (this.mCameraManager == null) {
            this.mCameraManager = (CameraManager) cameraParams.mContext.getSystemService("camera");
        }
    }

    private void getBestMatchCameraPreviewSize(Size[] sizeArr) {
        int i;
        int i2;
        if (sizeArr != null) {
            int length = sizeArr.length;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i3 >= length) {
                    i = -1;
                    i2 = -1;
                    break;
                }
                Size size = sizeArr[i3];
                if (size != null) {
                    i2 = size.getWidth();
                    i = size.getHeight();
                    StringBuilder sb = new StringBuilder("Camera preview size = ");
                    sb.append(i2);
                    sb.append(", ");
                    sb.append(i);
                    LogUtils.m143677d("Camera2", sb.toString(), new Object[0]);
                    if (i2 == 1280 && i == 720) {
                        break;
                    }
                    if (Math.abs((i2 * 9) - (i * 16)) < 32 && i5 < i) {
                        i5 = i;
                        i4 = i2;
                    }
                    if (Math.abs((i2 * 3) - (i * 4)) < 32 && i5 < i) {
                        i5 = i;
                        i4 = i2;
                    }
                }
                i3++;
            }
            if (i != -1) {
                this.sWidth = i2;
                this.sHeight = i;
                return;
            }
            this.sWidth = i4;
            this.sHeight = i5;
        }
    }

    public boolean setVideoStabilization(boolean z) {
        if (isVideoStabilizationSupported() && this.mCaptureRequestBuilder != null) {
            this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(z ? 1 : 0));
            this.mCaptureRequest = this.mCaptureRequestBuilder.build();
            try {
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequest, null, this.mCameraHandler);
                return true;
            } catch (CameraAccessException e) {
                StringBuilder sb = new StringBuilder("setRepeatingRequest failed, errMsg: ");
                sb.append(e.getMessage());
                LogUtils.m143680e("Camera2", sb.toString(), new Object[0]);
            }
        }
        return false;
    }

    public void startZoom(float f) {
        if (this.mCameraCharacteristics != null && this.mCaptureRequestBuilder != null && this.mCameraCaptureSession != null) {
            float floatValue = ((Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
            Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            int width = rect.width() - ((int) (((float) rect.width()) / floatValue));
            int height = rect.height() - ((int) (((float) rect.height()) / floatValue));
            int i = (int) ((((float) width) / floatValue) * f);
            int i2 = (int) ((((float) height) / floatValue) * f);
            int i3 = i - (i & 3);
            int i4 = i2 - (i2 & 3);
            try {
                this.mCaptureRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i3, i4, rect.width() - i3, rect.height() - i4));
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequestBuilder.build(), null, null);
                if (this.zoomListener != null) {
                    this.zoomListener.onChange(2, f, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean switchFlashMode(int i) {
        if (this.mCaptureRequestBuilder == null || this.mCameraCaptureSession == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 1:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 2:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 4:
                try {
                    this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                    this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequestBuilder.build(), null, this.mCameraHandler);
        return true;
    }

    public void startPreview(SurfaceTexture surfaceTexture) {
        boolean z;
        StringBuilder sb = new StringBuilder("startPreview++++, mCameraDevice = ");
        sb.append(this.mCameraDevice);
        sb.append(", surfaceTexture = ");
        sb.append(surfaceTexture);
        LogUtils.m143677d("Camera2", sb.toString(), new Object[0]);
        if (this.mCameraDevice != null && surfaceTexture != null) {
            if (this.mSessionState != 1) {
                LogUtils.m143677d("Camera2", "preview is opening, ignore start operation.", new Object[0]);
                return;
            }
            String str = "Camera2";
            try {
                StringBuilder sb2 = new StringBuilder("startPreview setDefaultBufferSize, sWidth = ");
                sb2.append(this.sWidth);
                sb2.append(" sHeight = ");
                sb2.append(this.sHeight);
                LogUtils.m143677d(str, sb2.toString(), new Object[0]);
                surfaceTexture.setDefaultBufferSize(this.sWidth, this.sHeight);
                this.mCaptureRequestBuilder = this.mCameraDevice.createCaptureRequest(3);
                ArrayList arrayList = new ArrayList();
                this.mPreviewSurface = new Surface(surfaceTexture);
                arrayList.add(this.mPreviewSurface);
                this.mCaptureRequestBuilder.addTarget(this.mPreviewSurface);
                if (this.mCameraCharacteristics != null) {
                    Range[] rangeArr = (Range[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    Range range = new Range(Integer.valueOf(this.mFpsRange[0] / 1000), Integer.valueOf(this.mFpsRange[1] / 1000));
                    int length = rangeArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        Range range2 = rangeArr[i];
                        if (((Integer) range2.getLower()).intValue() * 1000 == this.mFpsRange[0] && ((Integer) range2.getUpper()).intValue() * 1000 == this.mFpsRange[1]) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        int length2 = rangeArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            Range range3 = rangeArr[i2];
                            if (((Integer) range3.getLower()).intValue() * 1000 <= this.mFpsRange[0]) {
                                range = new Range(range3.getLower(), range3.getUpper());
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    Builder builder = this.mCaptureRequestBuilder;
                    Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    if (!z) {
                        range = rangeArr[0];
                    }
                    builder.set(key, range);
                }
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.mCameraDevice.createCaptureSession(arrayList, new CameraCaptureSession.StateCallback() {
                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        LogUtils.m143677d("Camera2", "onConfigureFailed...", new Object[0]);
                        Camera2.this.mSessionState = 0;
                    }

                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        LogUtils.m143677d("Camera2", "onConfigured...", new Object[0]);
                        Camera2.this.mCameraCaptureSession = cameraCaptureSession;
                        Camera2.this.updatePreview();
                    }
                }, this.mCameraHandler);
            } catch (CameraAccessException unused) {
            }
        }
    }

    public void changeCamera(int i, CameraListener cameraListener) {
        LogUtils.m143677d("Camera2", "changeCamera...", new Object[0]);
        if (this.mSessionState == 1) {
            LogUtils.m143677d("Camera2", "Camera is opening, ignore changeCamera operation.", new Object[0]);
            return;
        }
        close();
        open(i, cameraListener);
    }

    private boolean isHardwareLevelSupported(CameraCharacteristics cameraCharacteristics, int i) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue < 0 || intValue > 3) {
            StringBuilder sb = new StringBuilder("Invalid hardware level = ");
            sb.append(intValue);
            LogUtils.m143680e("Camera2", sb.toString(), new Object[0]);
            return false;
        } else if (VERSION.SDK_INT < 22 && intValue == 2) {
            return false;
        } else {
            this.mDeviceHardwareSupportedLevel = CameraHWLevelAndroid2VE[intValue];
            if (this.mDeviceHardwareSupportedLevel >= i) {
                StringBuilder sb2 = new StringBuilder("Camera hardware level supported, deviceLevel = ");
                sb2.append(this.mDeviceHardwareSupportedLevel);
                sb2.append(", require = ");
                sb2.append(this.mCameraHWLevel);
                LogUtils.m143683i("Camera2", sb2.toString(), new Object[0]);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
            sb3.append(this.mDeviceHardwareSupportedLevel);
            sb3.append(", require = ");
            sb3.append(this.mCameraHWLevel);
            LogUtils.m143680e("Camera2", sb3.toString(), new Object[0]);
            return false;
        }
    }

    public boolean open(int i, CameraListener cameraListener) {
        StringBuilder sb = new StringBuilder("open... position = ");
        sb.append(i);
        sb.append(" mCameraManager = ");
        sb.append(this.mCameraManager);
        LogUtils.m143677d("Camera2", sb.toString(), new Object[0]);
        this.mCameraListener = cameraListener;
        try {
            String[] cameraIdList = this.mCameraManager.getCameraIdList();
            if (i >= 0) {
                if (i <= 2) {
                    if (i >= cameraIdList.length) {
                        i = 1;
                    }
                    this.currentCameraPosition = i;
                    String str = cameraIdList[i];
                    this.mCameraCharacteristics = this.mCameraManager.getCameraCharacteristics(str);
                    if (!isHardwareLevelSupported(this.mCameraCharacteristics, this.mCameraHWLevel)) {
                        if (this.mCameraListener != null) {
                            this.mCameraListener.onOpenFail(2);
                        }
                        return false;
                    }
                    this.mCameraRotate = ((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                    this.mOutputSizes = ((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
                    getBestMatchCameraPreviewSize(this.mOutputSizes);
                    this.mCameraManager.openCamera(str, this.mStateCallback, this.mCameraHandler);
                    return true;
                }
            }
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    if (Camera2.this.mCameraListener != null) {
                        Camera2.this.mCameraListener.onOpenFail(2);
                    }
                }
            });
            return false;
        } catch (Throwable unused) {
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    if (Camera2.this.mCameraListener != null) {
                        Camera2.this.mCameraListener.onOpenFail(2);
                        Camera2.this.mCameraListener = null;
                    }
                }
            });
            this.mSessionState = 0;
            return false;
        }
    }

    private Rect _calculateFocusRect(View view, float[] fArr, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2 = i;
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        LogUtils.m143677d("Camera2", sb.toString(), new Object[0]);
        Size size = (Size) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        LogUtils.m143683i("onAreaTouchEvent", sb2.toString(), new Object[0]);
        float f6 = fArr[0];
        float f7 = fArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        int i3 = this.sWidth;
        int i4 = this.sHeight;
        if (90 == this.mCameraRotate || 270 == this.mCameraRotate) {
            i3 = this.sHeight;
            i4 = this.sWidth;
        }
        float f8 = 0.0f;
        if (i4 * width >= i3 * height) {
            float f9 = (((float) width) * 1.0f) / ((float) i3);
            f = ((((float) i4) * f9) - ((float) height)) / 2.0f;
            f2 = f9;
            f3 = 0.0f;
        } else {
            f2 = (((float) height) * 1.0f) / ((float) i4);
            f3 = ((((float) i3) * f2) - ((float) width)) / 2.0f;
            f = 0.0f;
        }
        float f10 = (f6 + f3) / f2;
        float f11 = (f7 + f) / f2;
        if (90 == i2) {
            f10 = ((float) this.sHeight) - f10;
        } else if (270 == i2) {
            f11 = ((float) this.sWidth) - f11;
        } else {
            float f12 = f10;
            f10 = f11;
            f11 = f12;
        }
        Rect rect2 = (Rect) this.mCaptureRequest.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            LogUtils.m143689w("Camera2", "can't get crop region", new Object[0]);
            rect2 = rect;
        }
        int width2 = rect2.width();
        int height2 = rect2.height();
        if (this.sHeight * width2 > this.sWidth * height2) {
            float f13 = (((float) height2) * 1.0f) / ((float) this.sHeight);
            f8 = (((float) width2) - (((float) this.sWidth) * f13)) / 2.0f;
            f5 = f13;
            f4 = 0.0f;
        } else {
            f5 = (((float) width2) * 1.0f) / ((float) this.sWidth);
            f4 = (((float) height2) - (((float) this.sHeight) * f5)) / 2.0f;
        }
        float f14 = (f11 * f5) + f8 + ((float) rect2.left);
        float f15 = (f10 * f5) + f4 + ((float) rect2.top);
        Rect rect3 = new Rect();
        double d = (double) f14;
        double width3 = (double) rect2.width();
        Double.isNaN(width3);
        double d2 = width3 * 0.05d;
        Double.isNaN(d);
        rect3.left = CameraUtils.clamp((int) (d - d2), 0, rect2.width());
        double width4 = (double) rect2.width();
        Double.isNaN(width4);
        double d3 = width4 * 0.05d;
        Double.isNaN(d);
        rect3.right = CameraUtils.clamp((int) (d + d3), 0, rect2.width());
        double d4 = (double) f15;
        double height3 = (double) rect2.height();
        Double.isNaN(height3);
        double d5 = height3 * 0.05d;
        Double.isNaN(d4);
        rect3.top = CameraUtils.clamp((int) (d4 - d5), 0, rect2.height());
        double height4 = (double) rect2.height();
        Double.isNaN(height4);
        double d6 = height4 * 0.05d;
        Double.isNaN(d4);
        rect3.bottom = CameraUtils.clamp((int) (d4 + d6), 0, rect2.height());
        StringBuilder sb3 = new StringBuilder("Focus Rect: [left, top, right, bottom] = [");
        sb3.append(rect3.left);
        sb3.append(", ");
        sb3.append(rect3.top);
        sb3.append(", ");
        sb3.append(rect3.right);
        sb3.append(", ");
        sb3.append(rect3.bottom);
        sb3.append("]");
        LogUtils.m143677d("Camera2", sb3.toString(), new Object[0]);
        return rect3;
    }

    public boolean setFocusAreas(View view, float[] fArr, int i) {
        LogUtils.m143677d("Camera2", "setFocusAreas...", new Object[0]);
        if (this.mSessionState == 1) {
            LogUtils.m143677d("Camera2", "Camera is opening, ignore setFocusAreas operation.", new Object[0]);
            return false;
        } else if (this.mCaptureRequestBuilder == null || this.mCameraDevice == null || this.mCameraCaptureSession == null) {
            LogUtils.m143680e("Camera2", "Set focus failed, you must open camera first.", new Object[0]);
            return false;
        } else if (this.mManualFocusEngaged) {
            LogUtils.m143689w("Camera2", "Manual focus already engaged", new Object[0]);
            return true;
        } else {
            Rect _calculateFocusRect = _calculateFocusRect(view, fArr, i);
            C456256 r8 = new CaptureCallback() {
                public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    StringBuilder sb = new StringBuilder("Manual AF failure: ");
                    sb.append(captureFailure);
                    LogUtils.m143680e("Camera2", sb.toString(), new Object[0]);
                    Camera2.this.mManualFocusEngaged = false;
                }

                public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num != null) {
                        StringBuilder sb = new StringBuilder("afState = ");
                        sb.append(num);
                        LogUtils.m143677d("Camera2", sb.toString(), new Object[0]);
                        if (4 == num.intValue() || 5 == num.intValue()) {
                            LogUtils.m143683i("Camera2", "Capture focused!!", new Object[0]);
                        }
                    } else {
                        LogUtils.m143689w("Camera2", "afState is null", new Object[0]);
                    }
                    Camera2.this.mManualFocusEngaged = false;
                    if (captureRequest.getTag() == "FOCUS_TAG") {
                        Camera2.this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, null);
                        try {
                            Camera2.this.mCameraCaptureSession.setRepeatingRequest(Camera2.this.mCaptureRequestBuilder.build(), Camera2.this.mSessionCaptureCallback, Camera2.this.mCameraHandler);
                        } catch (CameraAccessException unused) {
                        }
                    }
                }
            };
            try {
                this.mCameraCaptureSession.stopRepeating();
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
                this.mCameraCaptureSession.capture(this.mCaptureRequestBuilder.build(), this.mSessionCaptureCallback, this.mCameraHandler);
                if (isMeteringAreaAFSupported()) {
                    this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(_calculateFocusRect, 999)});
                } else {
                    LogUtils.m143689w("Camera2", "do not support MeteringAreaAF!", new Object[0]);
                }
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(_calculateFocusRect, 999)});
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.mCaptureRequestBuilder.setTag("FOCUS_TAG");
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                this.mCaptureRequest = this.mCaptureRequestBuilder.build();
                this.mCameraCaptureSession.capture(this.mCaptureRequest, r8, this.mCameraHandler);
                return true;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("setRepeatingRequest failed, ");
                sb.append(e.getMessage());
                LogUtils.m143680e("Camera2", sb.toString(), new Object[0]);
                return false;
            }
        }
    }
}
