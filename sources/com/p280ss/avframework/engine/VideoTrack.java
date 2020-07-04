package com.p280ss.avframework.engine;

import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.VideoTrack */
public class VideoTrack extends MediaTrack {
    private VideoProcessor mVideoProcessor;

    private native void nativeSetVideoProcessor(VideoProcessor videoProcessor);

    public synchronized void release() {
        super.release();
        if (this.mVideoProcessor != null) {
            this.mVideoProcessor.release();
        }
    }

    public void addVideoSink(VideoSink videoSink) {
        super.addVideoSink(videoSink);
    }

    public void removeVideoSink(VideoSink videoSink) {
        super.removeVideoSink(videoSink);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor) {
        this.mVideoProcessor = videoProcessor;
        nativeSetVideoProcessor(videoProcessor);
    }

    public VideoTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
