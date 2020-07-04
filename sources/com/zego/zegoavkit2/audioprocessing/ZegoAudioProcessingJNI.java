package com.zego.zegoavkit2.audioprocessing;

final class ZegoAudioProcessingJNI {
    ZegoAudioProcessingJNI() {
    }

    static native boolean enableReverb(boolean z, int i);

    static native boolean enableVirtualStereo(boolean z, int i);

    static native boolean setReverbParam(float f, float f2);

    static native boolean setReverbParam2(ZegoAudioReverbParam zegoAudioReverbParam);

    static native boolean setVoiceChangerParam(float f);
}
