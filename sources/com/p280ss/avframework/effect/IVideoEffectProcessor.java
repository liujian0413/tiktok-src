package com.p280ss.avframework.effect;

import android.content.res.AssetManager;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p280ss.avframework.capture.audio.AudioCapturer;

/* renamed from: com.ss.avframework.effect.IVideoEffectProcessor */
public interface IVideoEffectProcessor {

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$EffectMsgListener */
    public interface EffectMsgListener {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$FaceDetectListener */
    public interface FaceDetectListener {
        void onFaceDetectResultCallback(int i);
    }

    /* renamed from: com.ss.avframework.effect.IVideoEffectProcessor$MicrophoneDetectListener */
    public interface MicrophoneDetectListener {
        void onMicrophoneDetectResultCallback(float f);
    }

    int composerAppendNodes(String[] strArr);

    int composerReloadNodes(String[] strArr, int i);

    int composerRemoveNodes(String[] strArr);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerUpdateNode(String str, String str2, float f);

    void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2);

    int enableMockFace(boolean z);

    AudioCapturer getEffectAudioSource();

    String getEffectVersion();

    String name();

    int pauseEffect();

    int process(int i, int i2, int i3, int i4, int i5, long j, boolean z);

    int process(int i, int i2, int i3, int i4, int i5, stRoiInfo stroiinfo, long j, boolean z);

    void processDoubleClickEvent(float f, float f2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchUpEvent(float f, float f2, int i);

    void release();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setAlgorithmAB(boolean z);

    int setAssetManager(AssetManager assetManager);

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    int setCustomEffect(String str, String str2);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, String str2, float f);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    int setReshape(String str, float f, float f2);

    int setResourceFinder(Object obj);

    int startEffectAudio();

    int stopEffectAudio();

    boolean valid();
}
