package org.libsdl.app;

import com.p280ss.android.medialib.p879a.C19617a.C19618a;

public interface AudioRecorderInterfaceExt extends C19618a, AudioRecorderInterface {
    int initAudioConfig(int i, int i2, int i3, int i4);

    int onProcessData(byte[] bArr, int i);
}
