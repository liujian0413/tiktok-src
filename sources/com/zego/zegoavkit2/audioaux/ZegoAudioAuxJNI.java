package com.zego.zegoavkit2.audioaux;

import com.zego.zegoavkit2.entities.AuxDataEx;

final class ZegoAudioAuxJNI {
    private static volatile IJniZegoAuxCallback sJNIzegoAuxCallback;

    interface IJniZegoAuxCallback {
        AuxDataEx onAuxCallback(int i);
    }

    ZegoAudioAuxJNI() {
    }

    public static native boolean enableAux(boolean z);

    public static native boolean muteAux(boolean z);

    public static native void setAuxVolume(int i);

    public static void setCallback(IJniZegoAuxCallback iJniZegoAuxCallback) {
        sJNIzegoAuxCallback = iJniZegoAuxCallback;
    }

    public static AuxDataEx onAuxCallback(int i) {
        IJniZegoAuxCallback iJniZegoAuxCallback = sJNIzegoAuxCallback;
        if (iJniZegoAuxCallback != null) {
            return iJniZegoAuxCallback.onAuxCallback(i);
        }
        return null;
    }
}
