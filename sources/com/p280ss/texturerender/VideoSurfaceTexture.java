package com.p280ss.texturerender;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.p280ss.texturerender.TextureRenderer.OnTextureFocusLossListener;
import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.VideoSurfaceTexture */
public class VideoSurfaceTexture extends SurfaceTexture implements OnFrameAvailableListener, OnTextureFocusLossListener, Serializable {
    private Looper mCreateLooper;
    private EGLConfig mEglConfig;
    private EGLContext mEglContext;
    private EGLDisplay mEglDisplay;
    private EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private long mIdleTimeStamp;
    private boolean mIsMakeCurrent = false;
    private boolean mIsPaused = false;
    private boolean mIsRelease = false;
    private ReentrantLock mLock;
    private long mObjectId;
    private VideoSurface mOffScreenSurface = null;
    private Handler mRenderHandler;
    private Bundle mRenderMsgBundle;
    private Surface mRenderSurface = null;
    private int mSerial = 0;
    private ITexture mTextureId;
    private long mTid;
    private Surface mUpdateSurface = null;
    private long mUpdateSurfaceTime;
    private int mViewportHeight = 0;
    private int mViewportWidth = 0;

    /* renamed from: com.ss.texturerender.VideoSurfaceTexture$TextureDrawCallback */
    public interface TextureDrawCallback {
        void onTextureUpdate(int i, long j);
    }

    public long getOjbectId() {
        return this.mObjectId;
    }

    public int getSerial() {
        return this.mSerial;
    }

    public long getSurfaceUpdateTime() {
        return this.mUpdateSurfaceTime;
    }

    public ITexture getTexId() {
        return this.mTextureId;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public boolean isRelease() {
        return this.mIsRelease;
    }

    public void onFocusLoss() {
        this.mIsMakeCurrent = false;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        releaseInternal();
        super.finalize();
    }

    public boolean isAlive() {
        if (this.mOffScreenSurface != null) {
            return true;
        }
        return false;
    }

    public void release() {
        releaseInternal();
        super.release();
    }

    public int getViewportHeight() {
        int consumerHeight = getConsumerHeight();
        if (this.mViewportHeight != consumerHeight) {
            this.mViewportHeight = consumerHeight;
        }
        return this.mViewportHeight;
    }

    public int getViewportWidth() {
        int consumerWidth = getConsumerWidth();
        if (this.mViewportWidth != consumerWidth) {
            this.mViewportWidth = consumerWidth;
        }
        return this.mViewportWidth;
    }

    public boolean isMakeCurrent() {
        if (!this.mIsMakeCurrent || this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public void releaseOffScreenSurface() {
        this.mOffScreenSurface = null;
        updateSurface(null);
        this.mIdleTimeStamp = SystemClock.elapsedRealtime();
    }

    private int getConsumerHeight() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    private int getConsumerWidth() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public boolean couldForceRelease() {
        if (SystemClock.elapsedRealtime() - this.mIdleTimeStamp > 120000) {
            return true;
        }
        return false;
    }

    public VideoSurface getOffScreenSurface() {
        if (this.mOffScreenSurface == null) {
            this.mOffScreenSurface = new VideoSurface(this);
        }
        this.mIdleTimeStamp = -9223372036854775807L;
        return this.mOffScreenSurface;
    }

    public boolean makeCurrent() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        GLES20.glFinish();
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext)) {
            return false;
        }
        this.mIsMakeCurrent = true;
        return true;
    }

    public void releaseInternal() {
        if (!this.mIsRelease) {
            this.mTextureId.decRef();
            this.mIsRelease = true;
            this.mRenderHandler = null;
            this.mCreateLooper = null;
            this.mOffScreenSurface = null;
            this.mRenderSurface = null;
            this.mUpdateSurface = null;
        }
    }

    public boolean render() {
        if (!EGL14.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
            return false;
        }
        notifyRenderFrame(this.mSerial);
        return true;
    }

    public boolean canReuse(Looper looper) {
        if (looper == this.mCreateLooper) {
            return true;
        }
        return false;
    }

    public boolean isCurrentObject(long j) {
        if (this.mObjectId == j) {
            return true;
        }
        return false;
    }

    public void notifyRenderFrame(int i) {
        if (i == this.mSerial) {
            try {
                this.mOffScreenSurface.onTextureUpdate(i, getTimestamp());
            } catch (Exception unused) {
            }
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.mRenderHandler != null) {
            Message obtainMessage = this.mRenderHandler.obtainMessage(2);
            obtainMessage.obj = this;
            obtainMessage.sendToTarget();
        }
    }

    private void internalConstruct(Handler handler) {
        this.mObjectId = new Random().nextLong();
        this.mRenderHandler = handler;
        this.mLock = new ReentrantLock();
        this.mCreateLooper = Looper.myLooper();
        this.mRenderMsgBundle = new Bundle();
        setOnFrameAvailableListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateSurface(android.view.Surface r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.view.Surface r0 = r2.mUpdateSurface     // Catch:{ all -> 0x0031 }
            if (r3 != r0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock     // Catch:{ all -> 0x0031 }
            r0.lock()     // Catch:{ all -> 0x0031 }
            r2.mUpdateSurface = r3     // Catch:{ all -> 0x0031 }
            java.util.concurrent.locks.ReentrantLock r3 = r2.mLock     // Catch:{ all -> 0x0031 }
            r3.unlock()     // Catch:{ all -> 0x0031 }
            android.os.Handler r3 = r2.mRenderHandler     // Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x002f
            android.os.Handler r3 = r2.mRenderHandler     // Catch:{ all -> 0x0031 }
            r0 = 4
            android.os.Message r3 = r3.obtainMessage(r0)     // Catch:{ all -> 0x0031 }
            android.os.Bundle r0 = r2.mRenderMsgBundle     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "texture"
            r0.putSerializable(r1, r2)     // Catch:{ all -> 0x0031 }
            android.os.Bundle r0 = r2.mRenderMsgBundle     // Catch:{ all -> 0x0031 }
            r3.setData(r0)     // Catch:{ all -> 0x0031 }
            android.os.Handler r0 = r2.mRenderHandler     // Catch:{ all -> 0x0031 }
            r0.sendMessageAtFrontOfQueue(r3)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r2)
            return
        L_0x0031:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.texturerender.VideoSurfaceTexture.updateSurface(android.view.Surface):void");
    }

    public VideoSurfaceTexture(ITexture iTexture, Handler handler) {
        super(iTexture.lock());
        iTexture.addRef();
        this.mTextureId = iTexture;
        iTexture.unlock();
        internalConstruct(handler);
    }

    public synchronized void pause(boolean z, boolean z2) {
        if (z2) {
            try {
                if (this.mIsPaused && !z && this.mRenderHandler != null) {
                    Message obtainMessage = this.mRenderHandler.obtainMessage(10);
                    obtainMessage.obj = this;
                    this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                }
            } finally {
            }
        }
        this.mIsPaused = z;
    }

    public boolean handleSurfaceChange(boolean z, EGLSurface eGLSurface) {
        this.mLock.lock();
        if (this.mRenderSurface == this.mUpdateSurface) {
            this.mLock.unlock();
            return false;
        }
        this.mRenderSurface = this.mUpdateSurface;
        this.mLock.unlock();
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            if (this.mRenderSurface == null && z) {
                EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext);
            }
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
            this.mEglSurface = EGL14.EGL_NO_SURFACE;
            this.mIsMakeCurrent = false;
        }
        if (this.mRenderSurface != null && this.mRenderSurface.isValid()) {
            try {
                this.mEglSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, this.mRenderSurface, new int[]{12344}, 0);
                if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
                    return false;
                }
                makeCurrent();
            } catch (Exception unused) {
                return false;
            }
        }
        this.mUpdateSurfaceTime = System.nanoTime();
        this.mSerial++;
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    public void bindEGLEnv(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (eGLContext == null || eGLDisplay == null || eGLConfig == null) {
            throw new RuntimeException("no egl env for texture bind");
        }
        this.mEglContext = eGLContext;
        this.mEglDisplay = eGLDisplay;
        this.mEglConfig = eGLConfig;
    }

    public VideoSurfaceTexture(ITexture iTexture, boolean z, Handler handler) {
        super(iTexture.lock(), z);
        iTexture.addRef();
        this.mTextureId = iTexture;
        iTexture.unlock();
        internalConstruct(handler);
    }
}
