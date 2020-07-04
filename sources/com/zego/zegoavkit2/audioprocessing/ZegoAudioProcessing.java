package com.zego.zegoavkit2.audioprocessing;

public class ZegoAudioProcessing {

    public static final class ZegoVoiceChangerCategory {
    }

    public static boolean setVoiceChangerParam(float f) {
        return ZegoAudioProcessingJNI.setVoiceChangerParam(f);
    }

    public static boolean setReverbParam(ZegoAudioReverbParam zegoAudioReverbParam) {
        return ZegoAudioProcessingJNI.setReverbParam2(zegoAudioReverbParam);
    }

    public static boolean enableVirtualStereo(boolean z, int i) {
        return ZegoAudioProcessingJNI.enableVirtualStereo(z, i);
    }

    public static boolean setReverbParam(float f, float f2) {
        return ZegoAudioProcessingJNI.setReverbParam(f, f2);
    }

    public static boolean enableReverb(boolean z, ZegoAudioReverbMode zegoAudioReverbMode) {
        if (zegoAudioReverbMode == null) {
            return false;
        }
        return ZegoAudioProcessingJNI.enableReverb(z, zegoAudioReverbMode.getCode());
    }
}
