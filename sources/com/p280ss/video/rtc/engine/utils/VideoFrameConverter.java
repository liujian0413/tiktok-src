package com.p280ss.video.rtc.engine.utils;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.ss.video.rtc.engine.utils.VideoFrameConverter */
public class VideoFrameConverter {
    private Object mContextObject;
    private Handler mHandler;
    private HandlerThread mHandlerThread = new HandlerThread("video-frame-converter");
    private boolean mIsStart;
    private TextureHelper mTextureHelper;

    public synchronized void dispose() {
        if (this.mTextureHelper != null) {
            this.mTextureHelper.dispose();
        }
        if (this.mHandlerThread != null) {
            this.mHandlerThread.quit();
        }
        this.mIsStart = false;
    }

    public VideoFrameConverter() {
        this.mHandlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
        this.mIsStart = true;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$getVideoFrame$0$VideoFrameConverter(ExtVideoFrame extVideoFrame) {
        this.mTextureHelper.queueTexture(extVideoFrame.textureID);
    }

    public synchronized void post(Runnable runnable) {
        if (this.mIsStart) {
            if (this.mTextureHelper != null) {
                this.mTextureHelper.post(runnable);
            } else {
                this.mHandler.post(runnable);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        return r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0031=Splitter:B:23:0x0031, B:19:0x0027=Splitter:B:19:0x0027} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.webrtc.VideoFrame converterExtFrametoVideoFrame(com.p280ss.video.rtc.engine.utils.ExtVideoFrame r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L_0x0006
            monitor-exit(r4)
            return r0
        L_0x0006:
            int r1 = r5.format     // Catch:{ all -> 0x005f }
            r2 = 11
            if (r1 == r2) goto L_0x0031
            int r1 = r5.format     // Catch:{ all -> 0x005f }
            r2 = 10
            if (r1 != r2) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            int r1 = r5.format     // Catch:{ all -> 0x005f }
            r2 = 3
            if (r1 == r2) goto L_0x0027
            int r1 = r5.format     // Catch:{ all -> 0x005f }
            r2 = 1
            if (r1 != r2) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            java.lang.String r5 = "VideoFrameConverter"
            java.lang.String r1 = "pushExternalVideoFrame ExtVideoFrame type is not available"
            com.p280ss.video.rtc.engine.utils.LogUtil.m145282w(r5, r1)     // Catch:{ all -> 0x005f }
            monitor-exit(r4)
            return r0
        L_0x0027:
            int r0 = r5.stride     // Catch:{ all -> 0x005f }
            int r1 = r5.height     // Catch:{ all -> 0x005f }
            org.webrtc.VideoFrame r5 = r5.getVideoFrame(r0, r1)     // Catch:{ all -> 0x005f }
            monitor-exit(r4)
            return r5
        L_0x0031:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            android.opengl.EGLContext r1 = r5.eglContext14     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0042
            android.opengl.EGLContext r1 = r5.eglContext14     // Catch:{ all -> 0x005f }
            int r2 = r5.stride     // Catch:{ all -> 0x005f }
            int r3 = r5.height     // Catch:{ all -> 0x005f }
            r4.updateEglContext(r1, r2, r3)     // Catch:{ all -> 0x005f }
            goto L_0x004f
        L_0x0042:
            javax.microedition.khronos.egl.EGLContext r1 = r5.eglContext11     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x004f
            javax.microedition.khronos.egl.EGLContext r1 = r5.eglContext11     // Catch:{ all -> 0x005f }
            int r2 = r5.stride     // Catch:{ all -> 0x005f }
            int r3 = r5.height     // Catch:{ all -> 0x005f }
            r4.updateEglContext(r1, r2, r3)     // Catch:{ all -> 0x005f }
        L_0x004f:
            com.ss.video.rtc.engine.utils.TextureHelper r1 = r4.mTextureHelper     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x005d
            com.ss.video.rtc.engine.utils.TextureHelper r1 = r4.mTextureHelper     // Catch:{ all -> 0x005f }
            int r2 = r5.stride     // Catch:{ all -> 0x005f }
            int r3 = r5.height     // Catch:{ all -> 0x005f }
            org.webrtc.VideoFrame r0 = r5.getVideoFrame(r1, r2, r3, r0)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r4)
            return r0
        L_0x005f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.video.rtc.engine.utils.VideoFrameConverter.converterExtFrametoVideoFrame(com.ss.video.rtc.engine.utils.ExtVideoFrame):org.webrtc.VideoFrame");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        return null;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0035=Splitter:B:24:0x0035, B:20:0x002b=Splitter:B:20:0x002b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.webrtc.VideoFrame getVideoFrame(com.p280ss.video.rtc.engine.utils.ExtVideoFrame r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0085
            boolean r1 = r5.mIsStart     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x000a
            goto L_0x0085
        L_0x000a:
            int r1 = r6.format     // Catch:{ all -> 0x0082 }
            r2 = 11
            r3 = 10
            if (r1 == r2) goto L_0x0035
            int r1 = r6.format     // Catch:{ all -> 0x0082 }
            if (r1 != r3) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            int r1 = r6.format     // Catch:{ all -> 0x0082 }
            r2 = 3
            if (r1 == r2) goto L_0x002b
            int r1 = r6.format     // Catch:{ all -> 0x0082 }
            r2 = 1
            if (r1 != r2) goto L_0x0022
            goto L_0x002b
        L_0x0022:
            java.lang.String r6 = "VideoFrameConverter"
            java.lang.String r1 = "pushExternalVideoFrame ExtVideoFrame type is not available"
            com.p280ss.video.rtc.engine.utils.LogUtil.m145282w(r6, r1)     // Catch:{ all -> 0x0082 }
            monitor-exit(r5)
            return r0
        L_0x002b:
            int r0 = r6.stride     // Catch:{ all -> 0x0082 }
            int r1 = r6.height     // Catch:{ all -> 0x0082 }
            org.webrtc.VideoFrame r6 = r6.getVideoFrame(r0, r1)     // Catch:{ all -> 0x0082 }
            monitor-exit(r5)
            return r6
        L_0x0035:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0082 }
            android.opengl.EGLContext r1 = r6.eglContext14     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0046
            android.opengl.EGLContext r1 = r6.eglContext14     // Catch:{ all -> 0x0082 }
            int r2 = r6.stride     // Catch:{ all -> 0x0082 }
            int r4 = r6.height     // Catch:{ all -> 0x0082 }
            r5.updateEglContext(r1, r2, r4)     // Catch:{ all -> 0x0082 }
            goto L_0x0053
        L_0x0046:
            javax.microedition.khronos.egl.EGLContext r1 = r6.eglContext11     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0053
            javax.microedition.khronos.egl.EGLContext r1 = r6.eglContext11     // Catch:{ all -> 0x0082 }
            int r2 = r6.stride     // Catch:{ all -> 0x0082 }
            int r4 = r6.height     // Catch:{ all -> 0x0082 }
            r5.updateEglContext(r1, r2, r4)     // Catch:{ all -> 0x0082 }
        L_0x0053:
            com.ss.video.rtc.engine.utils.TextureHelper r1 = r5.mTextureHelper     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0080
            com.ss.video.rtc.engine.utils.TextureHelper r1 = r5.mTextureHelper     // Catch:{ all -> 0x0082 }
            int r1 = r1.dequeueTexture()     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0061
            monitor-exit(r5)
            return r0
        L_0x0061:
            com.ss.video.rtc.engine.utils.TextureHelper r0 = r5.mTextureHelper     // Catch:{ all -> 0x0082 }
            int r2 = r6.format     // Catch:{ all -> 0x0082 }
            int r4 = r6.textureID     // Catch:{ all -> 0x0082 }
            r0.drawTexture(r2, r4, r1)     // Catch:{ all -> 0x0082 }
            r6.textureID = r1     // Catch:{ all -> 0x0082 }
            r6.format = r3     // Catch:{ all -> 0x0082 }
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0082 }
            com.ss.video.rtc.engine.utils.TextureHelper r0 = r5.mTextureHelper     // Catch:{ all -> 0x0082 }
            int r1 = r6.stride     // Catch:{ all -> 0x0082 }
            int r2 = r6.height     // Catch:{ all -> 0x0082 }
            com.ss.video.rtc.engine.utils.VideoFrameConverter$$Lambda$0 r3 = new com.ss.video.rtc.engine.utils.VideoFrameConverter$$Lambda$0     // Catch:{ all -> 0x0082 }
            r3.<init>(r5, r6)     // Catch:{ all -> 0x0082 }
            org.webrtc.VideoFrame r0 = r6.getVideoFrame(r0, r1, r2, r3)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r5)
            return r0
        L_0x0082:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0085:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.video.rtc.engine.utils.VideoFrameConverter.getVideoFrame(com.ss.video.rtc.engine.utils.ExtVideoFrame):org.webrtc.VideoFrame");
    }

    private void updateEglContext(EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            this.mContextObject = eGLContext;
            LogUtil.m145281i("VideoFrameConverter", "create  egl14 texture helper");
            return;
        }
        if (this.mContextObject != eGLContext) {
            this.mContextObject = eGLContext;
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            StringBuilder sb = new StringBuilder("update egl14Context mContextObject:");
            sb.append(this.mContextObject);
            sb.append(" ,eglContext:");
            sb.append(eGLContext);
            LogUtil.m145281i("VideoFrameConverter", sb.toString());
        }
    }

    private void updateEglContext(javax.microedition.khronos.egl.EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL10TextureHelper", eGLContext, i, i2);
            this.mContextObject = eGLContext;
            LogUtil.m145281i("VideoFrameConverter", "create  egl10 texture helper");
            return;
        }
        if (this.mContextObject != eGLContext) {
            this.mContextObject = eGLContext;
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGL10TextureHelper", eGLContext, i, i2);
            StringBuilder sb = new StringBuilder("update egl14Context mContextObject:");
            sb.append(this.mContextObject);
            sb.append(" ,eglContext:");
            sb.append(eGLContext);
            LogUtil.m145281i("VideoFrameConverter", sb.toString());
        }
    }
}
