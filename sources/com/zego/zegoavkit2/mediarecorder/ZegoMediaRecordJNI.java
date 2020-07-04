package com.zego.zegoavkit2.mediarecorder;

final class ZegoMediaRecordJNI {
    private static volatile IZegoMediaRecordCallback sCallback;

    ZegoMediaRecordJNI() {
    }

    static native void setMediaRecordCallback(boolean z);

    static native boolean startRecord(int i, int i2, String str);

    static native boolean startRecordEx(int i, int i2, String str, boolean z, int i3, int i4, boolean z2);

    static native void stopRecord(int i);

    static void setCallback(IZegoMediaRecordCallback iZegoMediaRecordCallback) {
        sCallback = iZegoMediaRecordCallback;
    }

    static void onMediaRecord(int i, int i2, String str) {
        IZegoMediaRecordCallback iZegoMediaRecordCallback = sCallback;
        if (iZegoMediaRecordCallback != null) {
            iZegoMediaRecordCallback.onMediaRecord(i, ZegoMediaRecordChannelIndex.values()[i2], str);
        }
    }

    static void onRecordStatusUpdate(int i, String str, long j, long j2) {
        IZegoMediaRecordCallback iZegoMediaRecordCallback = sCallback;
        if (iZegoMediaRecordCallback != null) {
            iZegoMediaRecordCallback.onRecordStatusUpdate(ZegoMediaRecordChannelIndex.values()[i], str, j, j2);
        }
    }
}
