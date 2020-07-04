package com.p280ss.avframework.opengl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.engine.VideoSink;
import com.p280ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.opengl.GLRenderVideoSink */
public class GLRenderVideoSink extends VideoSink implements Callback, SurfaceHolder.Callback {
    private boolean mCanDrawer;
    public GLRenderer mGLRenderer;
    public GLThread mGLThread;
    private boolean mNeedSwapSurface;
    private GLSurface mSurface;

    /* renamed from: com.ss.avframework.opengl.GLRenderVideoSink$GLRenderer */
    public interface GLRenderer {
        void onDrawFrame(VideoFrame videoFrame);

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated();

        void onSurfaceDestroy();
    }

    public void OnDiscardedFrame() {
    }

    private void onSurfaceCreated() {
        this.mSurface = new GLSurface();
    }

    public Handler getGlThreadHandler() {
        return this.mGLThread.getHandler();
    }

    /* access modifiers changed from: private */
    public void onSurfaceDestroy() {
        if (this.mSurface != null) {
            GLES20.glFinish();
            this.mSurface.nativeSurfaceDestroy();
            this.mSurface.release();
            this.mSurface = null;
            this.mCanDrawer = false;
            if (!getGlThreadHandler().post(new Runnable() {
                public void run() {
                    if (GLRenderVideoSink.this.mGLRenderer != null) {
                        GLRenderVideoSink.this.mGLRenderer.onSurfaceDestroy();
                    }
                }
            }) && this.mGLRenderer != null) {
                this.mGLRenderer.onSurfaceDestroy();
                AVLog.m143700w("GLRenderVideoSink", "surfaceDestroy at release");
            }
        }
    }

    public synchronized void release() {
        super.release();
        if (!getGlThreadHandler().post(new Runnable() {
            public void run() {
                GLRenderVideoSink.this.onSurfaceDestroy();
            }
        })) {
            AVLog.ioe("GLRenderVideoSink", Log.getStackTraceString(new Exception("Already release at")));
        } else if (VERSION.SDK_INT >= 18) {
            this.mGLThread.quitSafely();
        } else {
            this.mGLThread.getHandler().post(new Runnable() {
                public void run() {
                    GLRenderVideoSink.this.mGLThread.quit();
                }
            });
            try {
                this.mGLThread.join(3000);
            } catch (InterruptedException unused) {
                String str = "GLRenderVideoSink";
                StringBuilder sb = new StringBuilder("GlRenderVideoSink thread exit exception at ");
                sb.append(3000);
                sb.append(" ms.");
                AVLog.m143697e(str, sb.toString());
            }
        }
    }

    public void setRenderer(GLRenderer gLRenderer) {
        this.mGLRenderer = gLRenderer;
    }

    public GLRenderVideoSink(SurfaceTexture surfaceTexture) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mNeedSwapSurface = true;
        this.mGLThread.post(1);
    }

    private void onFrameAvailable(VideoFrame videoFrame) {
        if (this.mGLRenderer != null && this.mCanDrawer) {
            this.mGLRenderer.onDrawFrame(videoFrame);
            if (this.mNeedSwapSurface && this.mSurface != null) {
                this.mSurface.nativeSwapBuffers();
            }
        }
        videoFrame.release();
    }

    public void onFrame(VideoFrame videoFrame) {
        if (this.mGLThread != null) {
            videoFrame.retain();
            if (!this.mGLThread.post(4, videoFrame)) {
                videoFrame.release();
            }
        }
    }

    public GLRenderVideoSink(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(this);
        this.mGLThread = new GLThread((Callback) this);
        GLThread gLThread = this.mGLThread;
        StringBuilder sb = new StringBuilder("GRK(");
        sb.append(this);
        sb.append(")");
        gLThread.setName(sb.toString());
        this.mGLThread.start();
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                onSurfaceCreated();
                break;
            case 2:
                onSurfaceChanged(message.arg1, message.arg2, (Surface) message.obj);
                break;
            case 3:
                onSurfaceDestroy();
                break;
            case 4:
                onFrameAvailable((VideoFrame) message.obj);
                break;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|(2:7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceDestroyed(android.view.SurfaceHolder r4) {
        /*
            r3 = this;
            r4 = 0
            r3.mNeedSwapSurface = r4
            r3.mCanDrawer = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            monitor-enter(r4)
            com.ss.avframework.opengl.GLThread r0 = r3.mGLThread     // Catch:{ all -> 0x002a }
            android.os.Handler r0 = r0.getHandler()     // Catch:{ all -> 0x002a }
            com.ss.avframework.opengl.GLRenderVideoSink$1 r1 = new com.ss.avframework.opengl.GLRenderVideoSink$1     // Catch:{ all -> 0x002a }
            r1.<init>(r4)     // Catch:{ all -> 0x002a }
            boolean r0 = r0.postAtFrontOfQueue(r1)     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0023
            java.lang.String r1 = "GLRenderVideoSink"
            java.lang.String r2 = "already surfaceDestroy"
            com.p280ss.avframework.utils.AVLog.m143700w(r1, r2)     // Catch:{ all -> 0x002a }
        L_0x0023:
            if (r0 == 0) goto L_0x0028
            r4.wait()     // Catch:{ InterruptedException -> 0x0028 }
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.opengl.GLRenderVideoSink.surfaceDestroyed(android.view.SurfaceHolder):void");
    }

    public GLRenderVideoSink(int i, int i2, int i3) {
    }

    private void onSurfaceChanged(int i, int i2, Surface surface) {
        if (this.mGLRenderer != null) {
            if (this.mSurface != null) {
                this.mSurface.nativeSurfaceCreate(i, i2, surface);
                this.mSurface.nativeMakeCurrent();
                this.mCanDrawer = true;
            }
            if (this.mGLRenderer != null) {
                this.mGLRenderer.onSurfaceCreated();
                this.mGLRenderer.onSurfaceChanged(i, i2);
            }
            if (this.mNeedSwapSurface && this.mSurface != null) {
                this.mSurface.nativeSwapBuffers();
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (!this.mGLThread.post(2, i2, i3, surfaceHolder.getSurface())) {
            AVLog.m143700w("GLRenderVideoSink", "surfaceChanged exception! thread already exit.");
        }
    }
}
