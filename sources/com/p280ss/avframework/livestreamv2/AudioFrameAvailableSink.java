package com.p280ss.avframework.livestreamv2;

import com.p280ss.avframework.engine.AudioSink;
import com.p280ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.AudioFrameAvailableSink */
public class AudioFrameAvailableSink extends AudioSink {
    private IAudioFrameAvailableListener mListener;

    public void onNoData() {
    }

    /* access modifiers changed from: 0000 */
    public void setListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        this.mListener = iAudioFrameAvailableListener;
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mListener != null) {
            this.mListener.onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }
}
