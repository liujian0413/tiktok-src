package com.zego.zegoavkit2.audioencryptdecrypt;

import java.nio.ByteBuffer;

public interface IZegoAudioEncryptDecryptCallback {
    int onAudioEncryptDecrypt(String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2);
}
