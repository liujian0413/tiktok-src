package com.p280ss.avframework.capture.video;

import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.engine.VideoSource;

/* renamed from: com.ss.avframework.capture.video.VideoCapturer */
public abstract class VideoCapturer extends VideoSource {

    /* renamed from: com.ss.avframework.capture.video.VideoCapturer$VideoCapturerObserver */
    public interface VideoCapturerObserver {
        void onVideoCapturerError(int i, Exception exc);

        void onVideoCapturerStarted();

        void onVideoCapturerStoped();
    }

    public boolean isScreenCast() {
        return false;
    }

    public abstract void start(int i, int i2, int i3);

    public abstract void stop();

    /* access modifiers changed from: protected */
    public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
        return nativeOnFrame(buffer, i, i2, i3, j);
    }
}
