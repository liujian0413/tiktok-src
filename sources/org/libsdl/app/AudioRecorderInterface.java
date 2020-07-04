package org.libsdl.app;

public interface AudioRecorderInterface {
    int addPCMData(byte[] bArr, int i);

    int closeWavFile(boolean z);

    int initWavFile(int i, int i2, double d);

    void lackPermission();

    void recordStatus(boolean z);
}
