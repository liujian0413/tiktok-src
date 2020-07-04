package com.p280ss.android.medialib;

import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.b */
public interface C19620b {
    int getProfile();

    int onEncoderData(int i, int i2, int i3, boolean z);

    void onEncoderData(byte[] bArr, int i, boolean z);

    Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z);

    void onSetCodecConfig(ByteBuffer byteBuffer);

    void onSwapGlBuffers();

    void onUninitHardEncoder();

    void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3);

    void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, int i2);

    void setColorFormat(int i);
}
