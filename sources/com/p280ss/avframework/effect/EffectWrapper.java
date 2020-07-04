package com.p280ss.avframework.effect;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p280ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener;
import com.p280ss.avframework.effect.IVideoEffectProcessor.MicrophoneDetectListener;
import com.p280ss.avframework.engine.NativeObject;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.effect.EffectWrapper */
public class EffectWrapper extends NativeObject implements IVideoEffectProcessor {
    public Long mDetectFlag = new Long(0);
    private EffectAudioSource mEffectAudioSource;
    private EffectMsgListener mEffectMsgListener;
    private FaceDetectListener mFaceListener;
    private boolean mFromExtern;
    private MicrophoneDetectListener mMicrophoneListener;
    private boolean mValid;

    private static String NonNull(String str) {
        return str == null ? "" : str;
    }

    private native int nativeComposerAppendNodes(String[] strArr);

    private native int nativeComposerReloadNodes(String[] strArr, int i);

    private native int nativeComposerRemoveNodes(String[] strArr);

    private native int nativeComposerSetMode(int i, int i2);

    private native int nativeComposerSetNodes(String[] strArr, int i);

    private native int nativeComposerUpdateNode(String str, String str2, float f);

    private native int nativeConfigEffect(int i, int i2, String str, String str2, boolean z, boolean z2);

    private native void nativeCreateEffectWrapper();

    private static native String nativeGetEffectVersion();

    private native String nativeName();

    private native int nativePauseEffect();

    private native int nativeProcess(int i, int i2, int i3, int i4, long j, Long l, stRoiInfo stroiinfo, boolean z, int i5);

    private native void nativeProcessDoubleClickEvent(float f, float f2);

    private native void nativeProcessLongPressEvent(float f, float f2);

    private native void nativeProcessPanEvent(float f, float f2, float f3, float f4, float f5);

    private native void nativeProcessRotationEvent(float f, float f2);

    private native void nativeProcessScaleEvent(float f, float f2);

    private native void nativeProcessTouchDownEvent(float f, float f2, int i);

    private native void nativeProcessTouchEvent(float f, float f2);

    private native void nativeProcessTouchUpEvent(float f, float f2, int i);

    private native int nativeResumeEffect();

    private native int nativeSendEffectMsg(int i, int i2, int i3, String str);

    private native void nativeSetAlgorithmAB(boolean z);

    private native int nativeSetAssetManager(AssetManager assetManager);

    private native int nativeSetBeautify(String str, float f, float f2);

    private native int nativeSetBeautifyWithSharp(String str, float f, float f2, float f3);

    private native int nativeSetCustomEffect(String str, String str2);

    private native int nativeSetEffect(String str);

    private native int nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f);

    private native int nativeSetReshape(String str, float f, float f2);

    private native int nativeSetResourceFinder(Object obj);

    private native int nativeSetTwoFilters(String str, String str2, float f);

    public int enableMockFace(boolean z) {
        return 0;
    }

    public AudioCapturer getEffectAudioSource() {
        return this.mEffectAudioSource;
    }

    public int setEffect(String str, boolean z) {
        return 0;
    }

    public int startEffectAudio() {
        return 0;
    }

    public int stopEffectAudio() {
        return 0;
    }

    public boolean valid() {
        return this.mValid;
    }

    public String getEffectVersion() {
        return nativeGetEffectVersion();
    }

    public String name() {
        if (!this.mValid) {
            return "Dummy Effect";
        }
        return nativeName();
    }

    public int pauseEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativePauseEffect();
    }

    public int resumeEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativeResumeEffect();
    }

    public EffectWrapper() {
        if (checkVersion()) {
            nativeCreateEffectWrapper();
            createEffectAudioSource();
        }
        this.mFromExtern = false;
    }

    private boolean checkVersion() {
        try {
            this.mValid = !TextUtils.isEmpty(getEffectVersion());
        } catch (Throwable unused) {
            this.mValid = false;
        }
        return this.mValid;
    }

    public void createEffectAudioSource() {
        if (this.mNativeObj != 0) {
            this.mEffectAudioSource = new EffectAudioSource(this.mNativeObj);
        }
    }

    public synchronized void release() {
        if (this.mEffectMsgListener != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(this.mEffectMsgListener);
            this.mEffectMsgListener = null;
        }
        this.mFaceListener = null;
        if (!this.mFromExtern) {
            super.release();
        }
        if (this.mEffectAudioSource != null) {
            this.mEffectAudioSource.release();
            this.mEffectAudioSource = null;
        }
    }

    public void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    public int setAssetManager(AssetManager assetManager) {
        return nativeSetAssetManager(assetManager);
    }

    public void setFaceDetectListener(FaceDetectListener faceDetectListener) {
        if (this.mValid) {
            this.mFaceListener = faceDetectListener;
        }
    }

    public void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener) {
        if (this.mValid) {
            this.mMicrophoneListener = microphoneDetectListener;
        }
    }

    public int setResourceFinder(Object obj) {
        return nativeSetResourceFinder(obj);
    }

    public int composerAppendNodes(String[] strArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerAppendNodes(strArr);
    }

    public int composerRemoveNodes(String[] strArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerRemoveNodes(strArr);
    }

    public void onFaceDetectResultCallback(int i) {
        if (this.mValid && this.mFaceListener != null) {
            this.mFaceListener.onFaceDetectResultCallback(i);
        }
    }

    public void onMicrophoneDetectResultCallback(float f) {
        if (this.mValid && this.mMicrophoneListener != null) {
            this.mMicrophoneListener.onMicrophoneDetectResultCallback(f);
        }
    }

    public void setAlgorithmAB(boolean z) {
        if (this.mValid) {
            nativeSetAlgorithmAB(z);
        }
    }

    public int setEffect(String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetEffect(NonNull(str));
    }

    public int setFaceAttribute(boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFaceAttribute(z);
    }

    public void setEffectMsgListener(EffectMsgListener effectMsgListener) {
        if (this.mValid) {
            if (this.mEffectMsgListener != null) {
                VideoEffectUtilsWrapper.removeMessageCenterListener(this.mEffectMsgListener);
                this.mEffectMsgListener = null;
            }
            if (effectMsgListener != null) {
                this.mEffectMsgListener = effectMsgListener;
                VideoEffectUtilsWrapper.addMessageCenterListener(this.mEffectMsgListener);
            }
        }
    }

    public EffectWrapper(long j) {
        this.mNativeObj = j;
        this.mFromExtern = true;
        if (checkVersion()) {
            createEffectAudioSource();
        }
    }

    public int composerSetMode(int i, int i2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerSetMode(i, i2);
    }

    public int composerSetNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerSetNodes(strArr, i);
    }

    public void processDoubleClickEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessDoubleClickEvent(f, f2);
        }
    }

    public void processLongPressEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessLongPressEvent(f, f2);
        }
    }

    public void processRotationEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessRotationEvent(f, f2);
        }
    }

    public void processScaleEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessScaleEvent(f, f2);
        }
    }

    public void processTouchEvent(float f, float f2) {
        if (this.mValid) {
            nativeProcessTouchEvent(f, f2);
        }
    }

    public int setFilter(String str, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFilter(NonNull(str), f);
    }

    public int composerReloadNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (strArr == null || strArr.length == 0 || i <= 0) {
            return -1;
        }
        return nativeComposerReloadNodes(strArr, i);
    }

    public int setCustomEffect(String str, String str2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetCustomEffect(NonNull(str), NonNull(str2));
    }

    public void processTouchDownEvent(float f, float f2, int i) {
        if (this.mValid) {
            nativeProcessTouchDownEvent(f, f2, i);
        }
    }

    public void processTouchUpEvent(float f, float f2, int i) {
        if (this.mValid) {
            nativeProcessTouchUpEvent(f, f2, i);
        }
    }

    public int setBeautify(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautify(NonNull(str), f, f2);
    }

    public int setReshape(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetReshape(NonNull(str), f, f2);
    }

    public int composerUpdateNode(String str, String str2, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerUpdateNode(NonNull(str), NonNull(str2), f);
    }

    public int setFilter(String str, String str2, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetTwoFilters(NonNull(str), NonNull(str2), f);
    }

    public int onReceiveEffectMessage(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return -1;
        }
        return 0;
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSendEffectMsg(i, i2, i3, NonNull(str));
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautifyWithSharp(NonNull(str), f, f2, f3);
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (this.mValid) {
            nativeProcessPanEvent(f, f2, f3, f4, f5);
        }
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2) {
        if (this.mValid) {
            nativeConfigEffect(i, i2, NonNull(str), NonNull(str2), z, z2);
        }
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, 0);
    }

    public int process(int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, i5);
    }

    public int process(int i, int i2, int i3, int i4, int i5, stRoiInfo stroiinfo, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, stroiinfo, z, i5);
    }
}
