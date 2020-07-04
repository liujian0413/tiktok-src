package com.p280ss.video.rtc.engine.mediaio;

import android.opengl.EGLContext;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.ss.video.rtc.engine.mediaio.IVideoSink */
public interface IVideoSink extends IVideoFrameConsumer {

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.video.rtc.engine.mediaio.IVideoSink$BufferType */
    public @interface BufferType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.video.rtc.engine.mediaio.IVideoSink$FormatType */
    public @interface FormatType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.video.rtc.engine.mediaio.IVideoSink$PixelFormat */
    public @interface PixelFormat {
    }

    int getBufferType();

    EGLContext getEGLContextHandle();

    int getPixelFormat();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
