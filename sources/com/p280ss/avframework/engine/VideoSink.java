package com.p280ss.avframework.engine;

import com.p280ss.avframework.buffer.VideoFrame;

/* renamed from: com.ss.avframework.engine.VideoSink */
public abstract class VideoSink extends NativeObject {
    /* access modifiers changed from: protected */
    public abstract void OnDiscardedFrame();

    /* access modifiers changed from: protected */
    public abstract void onFrame(VideoFrame videoFrame);
}
