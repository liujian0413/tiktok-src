package com.p280ss.avframework.livestreamv2.effectcamera.render;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.p280ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p280ss.avframework.effect.VideoEffectUtilsWrapper;
import com.p280ss.avframework.livestreamv2.effectcamera.render.IAudioPlayer.IFactory;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.LogUtils;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.EffectRender */
public class EffectRender {
    private static String TAG = "EffectRender";
    private EffectMsgListener mEffectMsgListener;
    private boolean mEnableAlgorithmAB;
    private boolean mForceDetectFace;
    private boolean mInited;
    private long mNativePtr;
    private OnMicrophoneDetectResultListener mOnMicrophoneDetectResultListener;
    private OnRefreshFaceDataListener mOnRefreshFaceDataListener;
    private boolean mROIDetect;

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.EffectRender$CameraPosition */
    public enum CameraPosition {
        camera_position_front(0),
        camera_position_back(1);
        

        /* renamed from: id */
        public int f117079id;

        public static CameraPosition valueOf(int i) {
            switch (i) {
                case 0:
                    return camera_position_front;
                case 1:
                    return camera_position_back;
                default:
                    return null;
            }
        }

        private CameraPosition(int i) {
            this.f117079id = i;
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.EffectRender$OnMicrophoneDetectResultListener */
    public interface OnMicrophoneDetectResultListener {
        void onMicrophoneDetectResult(float f);
    }

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.EffectRender$OnRefreshFaceDataListener */
    public interface OnRefreshFaceDataListener {
        void onRefreshFaceData(int i);
    }

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.EffectRender$Rotation */
    public enum Rotation {
        CLOCKWISE_ROTATE_0(0),
        CLOCKWISE_ROTATE_90(1),
        CLOCKWISE_ROTATE_180(2),
        CLOCKWISE_ROTATE_270(3);
        

        /* renamed from: id */
        public int f117080id;

        private Rotation(int i) {
            this.f117080id = i;
        }
    }

    private native int nativeComposerAppendNodes(long j, String[] strArr);

    private native int nativeComposerReloadNodes(long j, String[] strArr, int i);

    private native int nativeComposerRemoveNodes(long j, String[] strArr);

    private native int nativeComposerSetMode(long j, int i, int i2);

    private native int nativeComposerSetNodes(long j, String[] strArr, int i);

    private native int nativeComposerUpdateNode(long j, String str, String str2, float f);

    private native long nativeCreate();

    private native int nativeEnableMockFace(long j, boolean z);

    private native int nativeInit(long j, String str, String str2, int i, int i2, boolean z, AssetManager assetManager, boolean z2);

    private native int nativeOnPause(long j);

    private native int nativeOnResume(long j);

    private native int nativeProcess(long j, int i, int i2, int i3, double d);

    private native void nativeProcessDoubleClickEvent(long j, float f, float f2);

    private native void nativeProcessLongPressEvent(long j, float f, float f2);

    private native void nativeProcessPanEvent(long j, float f, float f2, float f3, float f4, float f5);

    private native void nativeProcessRotationEvent(long j, float f, float f2);

    private native void nativeProcessScaleEvent(long j, float f, float f2);

    private native void nativeProcessTouchDownEvent(long j, float f, float f2, int i);

    private native void nativeProcessTouchEvent(long j, float f, float f2);

    private native void nativeProcessTouchUpEvent(long j, float f, float f2, int i);

    private native void nativeRelease(long j);

    private native int nativeSendMessage(long j, int i, int i2, int i3, String str);

    private native void nativeSetAlgorithmAB(long j, boolean z);

    private native int nativeSetAudioPlayerFactory(long j, IFactory iFactory);

    private native int nativeSetCameraPosition(long j, int i);

    private native int nativeSetDeviceRotation(long j, float[] fArr);

    private native int nativeSetFaceBeauty(long j, String str, float f, float f2, float f3);

    private native int nativeSetFilter(long j, String str, float f);

    private native int nativeSetForceDetectFace(long j, boolean z);

    private native int nativeSetMaxMemCache(long j, int i);

    private native int nativeSetMusicEffect(long j, String str, float f);

    private native int nativeSetROIDetect(long j, boolean z);

    private native int nativeSetReshape(long j, String str, float f, float f2);

    private native int nativeSetWidthHeight(long j, int i, int i2);

    private native int nativeSwitchCustomResource(long j, String str, String str2, boolean z);

    private native int nativeSwitchFilter(long j, String str, String str2, float f);

    private native int nativeSwitchResource(long j, String str, boolean z);

    private native int nativeUpdateMusicEffectTempo(long j, float f);

    public boolean isEnableMockFace() {
        return this.mForceDetectFace;
    }

    public boolean isEnableROI() {
        return this.mROIDetect;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            release();
        } finally {
            super.finalize();
        }
    }

    public long getHandler() {
        if (!this.mInited) {
            return 0;
        }
        return this.mNativePtr;
    }

    public int onPause() {
        if (!this.mInited) {
            return -105;
        }
        return nativeOnPause(this.mNativePtr);
    }

    public int onResume() {
        if (!this.mInited) {
            return -105;
        }
        return nativeOnResume(this.mNativePtr);
    }

    public void release() {
        if (this.mEffectMsgListener != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(this.mEffectMsgListener);
            this.mEffectMsgListener = null;
        }
        if (this.mInited && this.mNativePtr != 0) {
            nativeRelease(this.mNativePtr);
            this.mNativePtr = 0;
            this.mInited = false;
        }
    }

    public void setOnMicrophoneDetectResultListener(OnMicrophoneDetectResultListener onMicrophoneDetectResultListener) {
        this.mOnMicrophoneDetectResultListener = onMicrophoneDetectResultListener;
    }

    public void setOnRefreshFaceDataListener(OnRefreshFaceDataListener onRefreshFaceDataListener) {
        this.mOnRefreshFaceDataListener = onRefreshFaceDataListener;
    }

    private void onNativeCallBack_microphoneDetectResult(float f) {
        if (this.mOnMicrophoneDetectResultListener != null) {
            this.mOnMicrophoneDetectResultListener.onMicrophoneDetectResult(f);
        }
    }

    private void onNativeCallBack_refreshFace(int i) {
        if (this.mOnRefreshFaceDataListener != null) {
            this.mOnRefreshFaceDataListener.onRefreshFaceData(i);
        }
    }

    public void setAlgorithmAB(boolean z) {
        this.mEnableAlgorithmAB = z;
        if (this.mInited) {
            nativeSetAlgorithmAB(this.mNativePtr, z);
        }
    }

    public int setAudioPlayerFactory(IFactory iFactory) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetAudioPlayerFactory(this.mNativePtr, iFactory);
    }

    public int setCameraPosition(CameraPosition cameraPosition) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetCameraPosition(this.mNativePtr, cameraPosition.f117079id);
    }

    public int setDeviceRotation(float[] fArr) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetDeviceRotation(this.mNativePtr, fArr);
    }

    public int setForceDetectFace(boolean z) {
        this.mForceDetectFace = z;
        if (!this.mInited) {
            return -105;
        }
        return nativeSetForceDetectFace(this.mNativePtr, z);
    }

    public int setMaxMemCache(int i) {
        if (!this.mInited) {
            return -105;
        }
        return nativeSetMaxMemCache(this.mNativePtr, i);
    }

    public int setROIDetect(boolean z) {
        this.mROIDetect = z;
        if (!this.mInited) {
            return 0;
        }
        return nativeSetROIDetect(this.mNativePtr, z);
    }

    public int updateMusicEffectTempo(float f) {
        if (!this.mInited) {
            return -105;
        }
        return nativeUpdateMusicEffectTempo(this.mNativePtr, f);
    }

    public int composerAppendNodes(String[] strArr) {
        if (!this.mInited) {
            return -105;
        }
        if (strArr == null || strArr.length <= 0) {
            return -100;
        }
        return nativeComposerAppendNodes(this.mNativePtr, strArr);
    }

    public int composerRemoveNodes(String[] strArr) {
        if (!this.mInited) {
            return -105;
        }
        if (strArr == null || strArr.length <= 0) {
            return -100;
        }
        return nativeComposerRemoveNodes(this.mNativePtr, strArr);
    }

    public int enableMockFace(boolean z) {
        if (!this.mInited) {
            return -105;
        }
        int nativeEnableMockFace = nativeEnableMockFace(this.mNativePtr, z);
        if (nativeEnableMockFace >= 0) {
            this.mForceDetectFace = z;
        }
        return nativeEnableMockFace;
    }

    public int setMessageListener(EffectMsgListener effectMsgListener) {
        if (!this.mInited) {
            return -105;
        }
        EffectMsgListener effectMsgListener2 = this.mEffectMsgListener;
        this.mEffectMsgListener = effectMsgListener;
        if (this.mEffectMsgListener != null) {
            VideoEffectUtilsWrapper.addMessageCenterListener(this.mEffectMsgListener);
        }
        if (effectMsgListener2 != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(this.mEffectMsgListener);
        }
        return 0;
    }

    public int setMusicEffect(String str) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSetMusicEffect(j, str, 1.0f);
    }

    public void processDoubleClickEvent(float f, float f2) {
        if (this.mInited) {
            nativeProcessDoubleClickEvent(this.mNativePtr, f, f2);
        }
    }

    public void processLongPressEvent(float f, float f2) {
        if (this.mInited) {
            nativeProcessLongPressEvent(this.mNativePtr, f, f2);
        }
    }

    public void processRotationEvent(float f, float f2) {
        if (this.mInited) {
            nativeProcessRotationEvent(this.mNativePtr, f, f2);
        }
    }

    public void processScaleEvent(float f, float f2) {
        if (this.mInited) {
            nativeProcessScaleEvent(this.mNativePtr, f, f2);
        }
    }

    public void processTouchEvent(float f, float f2) {
        if (this.mInited) {
            nativeProcessTouchEvent(this.mNativePtr, f, f2);
        }
    }

    public int composerReloadNodes(String[] strArr, int i) {
        if (!this.mInited) {
            return -105;
        }
        if (strArr == null || i <= 0) {
            return -100;
        }
        if (strArr == null || i <= strArr.length) {
            return nativeComposerReloadNodes(this.mNativePtr, strArr, i);
        }
        return -100;
    }

    public int composerSetMode(int i, int i2) {
        if (!this.mInited) {
            return -105;
        }
        if (i < 0 || i2 < 0) {
            return -100;
        }
        return nativeComposerSetMode(this.mNativePtr, i, i2);
    }

    public int composerSetNodes(String[] strArr, int i) {
        if (!this.mInited) {
            return -105;
        }
        if (strArr == null || i <= 0) {
            i = 0;
            strArr = null;
        }
        if (strArr == null || i <= strArr.length) {
            return nativeComposerSetNodes(this.mNativePtr, strArr, i);
        }
        return -105;
    }

    public int setEffect(String str, boolean z) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSwitchResource(j, str, z);
    }

    public int setFilter(String str, float f) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSetFilter(j, str, f);
    }

    public void processTouchDownEvent(float f, float f2, int i) {
        if (this.mInited) {
            nativeProcessTouchDownEvent(this.mNativePtr, f, f2, i);
        }
    }

    public void processTouchUpEvent(float f, float f2, int i) {
        if (this.mInited) {
            nativeProcessTouchUpEvent(this.mNativePtr, f, f2, i);
        }
    }

    public int setCustomEffect(String str, String str2, boolean z) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = "";
        }
        return nativeSwitchCustomResource(j, str3, str2, z);
    }

    public int setReshape(String str, float f, float f2) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSetReshape(j, str, f, f2);
    }

    public int composerUpdateNode(String str, String str2, float f) {
        if (!this.mInited) {
            return -105;
        }
        if (TextUtils.isEmpty(str)) {
            str = new String("");
        }
        String str3 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = new String("");
        }
        return nativeComposerUpdateNode(this.mNativePtr, str3, str2, f);
    }

    public int switchFilter(String str, String str2, float f) {
        if (!this.mInited) {
            return -105;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return nativeSwitchFilter(this.mNativePtr, str, str2, f);
    }

    public int sendMessage(int i, int i2, int i3, String str) {
        if (!this.mInited) {
            return -105;
        }
        long j = this.mNativePtr;
        if (str == null) {
            str = "";
        }
        return nativeSendMessage(j, i, i2, i3, str);
    }

    public int setFaceBeauty(String str, float f, float f2, float f3) {
        if (!this.mInited) {
            return -105;
        }
        int nativeSetFaceBeauty = nativeSetFaceBeauty(this.mNativePtr, str, f, f2, f3);
        if (nativeSetFaceBeauty != 0) {
            StringBuilder sb = new StringBuilder("setFaceBeauty fail ret: ");
            sb.append(nativeSetFaceBeauty);
            LogUtils.m143680e("EffectRender", sb.toString(), new Object[0]);
        }
        return nativeSetFaceBeauty;
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (this.mInited) {
            nativeProcessPanEvent(this.mNativePtr, f, f2, f3, f4, f5);
        }
    }

    public int process(int i, int i2, int i3, int i4, Rotation rotation, double d) {
        if (!this.mInited) {
            return -105;
        }
        int i5 = i3;
        int i6 = i4;
        nativeSetWidthHeight(this.mNativePtr, i3, i4);
        return nativeProcess(this.mNativePtr, i, i2, rotation.f117080id, d);
    }

    public int init(String str, String str2, int i, int i2, boolean z, AssetManager assetManager, boolean z2) {
        if (this.mInited) {
            return 1;
        }
        if (TextUtils.isEmpty(str)) {
            return -111;
        }
        this.mNativePtr = nativeCreate();
        if (this.mNativePtr == 0) {
            return -112;
        }
        int nativeInit = nativeInit(this.mNativePtr, str, str2, i, i2, z, assetManager, z2);
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("nativeInit: ");
        sb.append(nativeInit);
        LogUtils.m143677d(str3, sb.toString(), new Object[0]);
        if (nativeInit == 0) {
            this.mInited = true;
            nativeSetForceDetectFace(this.mNativePtr, this.mForceDetectFace);
            nativeSetROIDetect(this.mNativePtr, this.mROIDetect);
            nativeSetAlgorithmAB(this.mNativePtr, this.mEnableAlgorithmAB);
        }
        return nativeInit;
    }
}
