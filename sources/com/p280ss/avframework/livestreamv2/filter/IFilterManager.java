package com.p280ss.avframework.livestreamv2.filter;

import android.content.res.AssetManager;

/* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager */
public interface IFilterManager {

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$EffectMsgListener */
    public interface EffectMsgListener extends com.p280ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener {
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$ErrorListener */
    public interface ErrorListener {
        void onError(int i, String str);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$FaceDetectListener */
    public interface FaceDetectListener extends com.p280ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener {
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.IFilterManager$MicrophoneDetectListener */
    public interface MicrophoneDetectListener extends com.p280ss.avframework.effect.IVideoEffectProcessor.MicrophoneDetectListener {
    }

    int composerAppendNodes(String[] strArr);

    int composerReloadNodes(String[] strArr, int i);

    int composerRemoveNodes(String[] strArr);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerUpdateNode(String str, String str2, float f);

    void configEffect(int i, int i2, String str, String str2, boolean z);

    void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager);

    void configEffect(int i, int i2, String str, String str2, boolean z, Object obj);

    void enable(boolean z);

    int enableMockFace(boolean z);

    void enableRoi(boolean z);

    void forceOutput2DTex(boolean z);

    String getEffectVersion();

    String getVersion();

    boolean isEnable();

    boolean isValid();

    String name();

    int pauseEffect();

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

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    int setCustomEffect(String str, String str2);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    void setEffectAlgorithmAB(boolean z);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setErrorListener(ErrorListener errorListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, String str2, float f);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    int setReshape(String str, float f, float f2);

    int startEffectAudio();

    int stopEffectAudio();
}
