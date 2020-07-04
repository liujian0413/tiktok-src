package com.p280ss.avframework.livestreamv2.effectcamera.common;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.common.TCState */
public class TCState {

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.common.TCState$StateListener */
    public interface StateListener {
        void onError(TCStateType tCStateType, int i, String str);

        void onInfo(TCStateType tCStateType, int i, String str);
    }

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.common.TCState$TCStateType */
    public enum TCStateType {
        CameraOpenFail,
        PreProcessFail,
        EffectInitFail,
        EffectProcessFail,
        NotConfigEffect,
        EffectInitSucceed
    }
}
