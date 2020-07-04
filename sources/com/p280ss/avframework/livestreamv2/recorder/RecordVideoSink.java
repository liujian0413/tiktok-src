package com.p280ss.avframework.livestreamv2.recorder;

import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.capture.video.VideoCapturer;
import com.p280ss.avframework.engine.VideoSink;

/* renamed from: com.ss.avframework.livestreamv2.recorder.RecordVideoSink */
class RecordVideoSink extends VideoCapturer {
    private int mFps;
    private int mHeight;
    private int mStatus = 0;
    private VideoSink mVideoSink = new VideoSink() {
        public void OnDiscardedFrame() {
        }

        public void onFrame(VideoFrame videoFrame) {
            RecordVideoSink.this.onFrame(videoFrame.getBuffer(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs() / 1000);
        }
    };
    private int mWidth;

    public VideoSink getVideoSink() {
        return this.mVideoSink;
    }

    public int status() {
        return this.mStatus;
    }

    public void stop() {
        this.mStatus = 2;
    }

    public synchronized void release() {
        stop();
        super.release();
        if (this.mVideoSink != null) {
            this.mVideoSink.release();
            this.mVideoSink = null;
        }
    }

    public void start(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        nativeAdaptedOutputFormat(this.mWidth, this.mHeight, i3);
        this.mStatus = 1;
    }

    public int pushVideoFrame(Buffer buffer, int i, int i2, int i3, long j) {
        return onFrame(buffer, i, i2, i3, j);
    }

    public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mStatus == 1) {
            return super.onFrame(buffer, i, i2, i3, j);
        }
        return -1;
    }
}
