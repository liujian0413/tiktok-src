package com.p280ss.texturerender;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* renamed from: com.ss.texturerender.VideoTextureRenderer */
public class VideoTextureRenderer extends TextureRenderer {
    private static VideoTextureRenderer mRenderInstance;
    private final String mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private final String mVertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* access modifiers changed from: protected */
    public void onInternalStateChanged(int i) {
    }

    /* access modifiers changed from: protected */
    public void updateDisplaySize(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void deinitGLComponents() {
        GLES20.glDeleteProgram(this.mProgram);
    }

    /* access modifiers changed from: protected */
    public void initGLComponents() {
        if (this.mState != -1) {
            setupGraphics();
        }
    }

    public synchronized void release() {
        super.release();
        mRenderInstance = null;
    }

    public static synchronized VideoTextureRenderer getRenderer() {
        synchronized (VideoTextureRenderer.class) {
            if (mRenderInstance == null) {
                mRenderInstance = new VideoTextureRenderer();
            }
            if (mRenderInstance != null && mRenderInstance.mState == -1) {
                return null;
            }
            VideoTextureRenderer videoTextureRenderer = mRenderInstance;
            return videoTextureRenderer;
        }
    }

    private void setupGraphics() {
        this.mProgram = ShaderHelper.createAndLinkProgram(ShaderHelper.compileShader(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"), ShaderHelper.compileShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"), null);
        GLES20.glUseProgram(this.mProgram);
        this.maPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "aPosition");
        if (this.maPositionHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for aPosition");
            return;
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        if (this.maTextureHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for aTextureCoord");
            return;
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for uSTMatrix");
            return;
        }
        this.mTriangleVertices.position(0);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 12, this.mTriangleVertices);
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        this.mTextureVertices.position(0);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, 8, this.mTextureVertices);
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
    }

    private void drawTexture(int i) {
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glBindTexture(36197, i);
        GLES20.glActiveTexture(33984);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private int getConsumerHeight(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    private int getConsumerWidth(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        r1 = r6.getTexId();
        r2 = r6.getViewportWidth();
        r3 = r6.getViewportHeight();
        r6.getTransformMatrix(r5.mSTMatrix);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glViewport(0, 0, r2, r3);
        drawTexture(r1.lock());
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (android.opengl.GLES20.glGetError() != 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean draw(com.p280ss.texturerender.VideoSurfaceTexture r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            monitor-enter(r6)
            boolean r1 = r6.isRelease()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            return r0
        L_0x000d:
            r6.updateTexImage()     // Catch:{ all -> 0x005a }
            long r1 = r5.mDrawingObjectId     // Catch:{ all -> 0x005a }
            boolean r1 = r6.isCurrentObject(r1)     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x001a
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            return r0
        L_0x001a:
            boolean r1 = r6.isPaused()     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            boolean r1 = r6.isMakeCurrent()     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            com.ss.texturerender.ITexture r1 = r6.getTexId()
            int r2 = r6.getViewportWidth()
            int r3 = r6.getViewportHeight()
            float[] r4 = r5.mSTMatrix
            r6.getTransformMatrix(r4)
            r6 = 0
            android.opengl.GLES20.glClearColor(r6, r6, r6, r6)
            r6 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r6)
            android.opengl.GLES20.glViewport(r0, r0, r2, r3)
            int r6 = r1.lock()
            r5.drawTexture(r6)
            r1.unlock()
            int r6 = android.opengl.GLES20.glGetError()
            if (r6 != 0) goto L_0x0057
            r6 = 1
            return r6
        L_0x0057:
            return r0
        L_0x0058:
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            return r0
        L_0x005a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.texturerender.VideoTextureRenderer.draw(com.ss.texturerender.VideoSurfaceTexture):boolean");
    }
}
