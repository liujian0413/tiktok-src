package com.zego.zegoavkit2.audioaux;

import com.zego.zegoavkit2.entities.AuxDataEx;

public class ZegoAudioAux implements IJniZegoAuxCallback {
    private IZegoAudioAuxCallbackEx mZegoAudioAuxCallbackEx;

    public void setAuxVolume(int i) {
        ZegoAudioAuxJNI.setAuxVolume(i);
    }

    public boolean enableAux(boolean z) {
        return ZegoAudioAuxJNI.enableAux(z);
    }

    public boolean muteAux(boolean z) {
        return ZegoAudioAuxJNI.muteAux(z);
    }

    public AuxDataEx onAuxCallback(int i) {
        IZegoAudioAuxCallbackEx iZegoAudioAuxCallbackEx = this.mZegoAudioAuxCallbackEx;
        if (iZegoAudioAuxCallbackEx != null) {
            return iZegoAudioAuxCallbackEx.onAuxCallback(i);
        }
        return null;
    }

    public void setZegoAuxCallbackEx(IZegoAudioAuxCallbackEx iZegoAudioAuxCallbackEx) {
        this.mZegoAudioAuxCallbackEx = iZegoAudioAuxCallbackEx;
        if (iZegoAudioAuxCallbackEx != null) {
            ZegoAudioAuxJNI.setCallback(this);
        } else {
            ZegoAudioAuxJNI.setCallback(null);
        }
    }
}
