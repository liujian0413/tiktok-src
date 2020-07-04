package com.zego.zegoavkit2.audioencryptdecrypt;

import java.nio.ByteBuffer;

public class ZegoAudioEncryptDecrypt implements IZegoAudioEncryptDecryptCallback {
    private volatile IZegoAudioEncryptDecryptCallback mAudioEncryptDecryptCallback;

    public static void enableAudioEncryptDecrypt(boolean z) {
        ZegoAudioEncryptDecryptJNI.enableAudioEncryptDecrypt(z);
    }

    public void setAudioEncryptDecryptCallback(IZegoAudioEncryptDecryptCallback iZegoAudioEncryptDecryptCallback) {
        this.mAudioEncryptDecryptCallback = iZegoAudioEncryptDecryptCallback;
        if (iZegoAudioEncryptDecryptCallback != null) {
            ZegoAudioEncryptDecryptJNI.setZegoAudioEncryptDecryptCallback(this);
        } else {
            ZegoAudioEncryptDecryptJNI.setZegoAudioEncryptDecryptCallback(null);
        }
    }

    public int onAudioEncryptDecrypt(String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        IZegoAudioEncryptDecryptCallback iZegoAudioEncryptDecryptCallback = this.mAudioEncryptDecryptCallback;
        if (iZegoAudioEncryptDecryptCallback != null) {
            return iZegoAudioEncryptDecryptCallback.onAudioEncryptDecrypt(str, byteBuffer, i, byteBuffer2, i2);
        }
        return 0;
    }
}
