package com.zego.p1851ve;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

/* renamed from: com.zego.ve.VSurTex */
public class VSurTex implements OnFrameAvailableListener {
    private SurfaceTexture mSt;
    private long pthis;

    private static native int on_frame(long j, int i);

    public SurfaceTexture get() {
        return this.mSt;
    }

    public void destroy() {
        this.mSt.setOnFrameAvailableListener(null);
        this.mSt.release();
        this.mSt = null;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        try {
            on_frame(this.pthis, surfaceTexture.hashCode());
        } catch (Exception unused) {
        }
    }

    public int create(long j, int i) {
        this.pthis = j;
        this.mSt = new SurfaceTexture(i);
        this.mSt.setOnFrameAvailableListener(this);
        return this.mSt.hashCode();
    }
}
