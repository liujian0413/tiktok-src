package com.zego.zegoavkit2.audioencryptdecrypt;

import java.nio.ByteBuffer;

final class ZegoAudioEncryptDecryptJNI {
    private static volatile IZegoAudioEncryptDecryptCallback sCallback;

    ZegoAudioEncryptDecryptJNI() {
    }

    static native void enableAudioEncryptDecrypt(boolean z);

    static void setZegoAudioEncryptDecryptCallback(IZegoAudioEncryptDecryptCallback iZegoAudioEncryptDecryptCallback) {
        sCallback = iZegoAudioEncryptDecryptCallback;
    }

    static int onAudioEncryptDecrypt(String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        IZegoAudioEncryptDecryptCallback iZegoAudioEncryptDecryptCallback = sCallback;
        if (iZegoAudioEncryptDecryptCallback != null) {
            return iZegoAudioEncryptDecryptCallback.onAudioEncryptDecrypt(str, byteBuffer, i, byteBuffer2, i2);
        }
        return 0;
    }
}
