package com.zego.zegoavkit2.audiodevice;

import com.zego.zegoavkit2.entities.ZegoAudioFrame;

public class ZegoExternalAudioDevice {

    public static final class AuxPublishChannelAudioSrcType {
    }

    public static native void enableExternalAudioDevice(boolean z);

    public static native boolean onPlaybackAudioFrame(ZegoAudioFrame zegoAudioFrame);

    public static native int onRecordAudioFrame(int i, ZegoAudioFrame zegoAudioFrame);

    public static native int setAudioSrcForAuxiliaryPublishChannel(int i);

    public static native int startCapture(int i);

    public static native boolean startRender();

    public static native int stopCapture(int i);

    public static native boolean stopRender();

    public static boolean startCapture() {
        if (startCapture(0) == 0) {
            return true;
        }
        return false;
    }

    public static boolean stopCapture() {
        if (stopCapture(0) == 0) {
            return true;
        }
        return false;
    }

    public static boolean onRecordAudioFrame(ZegoAudioFrame zegoAudioFrame) {
        if (onRecordAudioFrame(0, zegoAudioFrame) == 0) {
            return true;
        }
        return false;
    }
}
