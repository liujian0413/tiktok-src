package com.p280ss.android.vesdk.p1775c;

import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.vesdk.c.a */
public final class C45277a extends SurfaceTexture {

    /* renamed from: a */
    private boolean f116507a;

    public final boolean isReleased() {
        if (VERSION.SDK_INT >= 26) {
            return super.isReleased();
        }
        return this.f116507a;
    }

    public final synchronized void detachFromGLContext() {
        if (!isReleased()) {
            super.detachFromGLContext();
        }
    }

    public final synchronized long getTimestamp() {
        if (isReleased()) {
            return -1;
        }
        return super.getTimestamp();
    }

    public final synchronized void release() {
        if (!isReleased()) {
            super.release();
            this.f116507a = true;
        }
    }

    public final synchronized void releaseTexImage() {
        if (!isReleased()) {
            super.releaseTexImage();
        }
    }

    public final synchronized void updateTexImage() {
        if (!isReleased()) {
            super.updateTexImage();
        }
    }

    public C45277a(int i) {
        super(i);
    }

    public final synchronized void attachToGLContext(int i) {
        if (!isReleased()) {
            super.attachToGLContext(i);
        }
    }

    public final synchronized void getTransformMatrix(float[] fArr) {
        if (!isReleased()) {
            super.getTransformMatrix(fArr);
        }
    }

    public final synchronized void setDefaultBufferSize(int i, int i2) {
        if (!isReleased()) {
            super.setDefaultBufferSize(i, i2);
        }
    }
}
