package com.p280ss.video.rtc.engine;

/* renamed from: com.ss.video.rtc.engine.IAudioFrameObserver */
public interface IAudioFrameObserver {
    boolean onPlaybackFrame(byte[] bArr, int i, int i2, int i3, int i4);

    boolean onRecordFrame(byte[] bArr, int i, int i2, int i3, int i4);
}
