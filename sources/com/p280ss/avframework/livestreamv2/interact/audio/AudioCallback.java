package com.p280ss.avframework.livestreamv2.interact.audio;

import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.interact.audio.AudioCallback */
public interface AudioCallback {
    boolean updateAudioFrame(Buffer buffer, int i, long j);
}
