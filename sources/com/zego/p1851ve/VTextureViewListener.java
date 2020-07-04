package com.zego.p1851ve;

import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

/* renamed from: com.zego.ve.VTextureViewListener */
public class VTextureViewListener implements SurfaceTextureListener {
    private static final Object lock = new Object();
    private static SparseArray<Integer> mLockMap = new SparseArray<>();
    private int mKey;
    private TextureView mView;
    private long pthis;

    private static native int on_surface_texture_changed(long j, SurfaceTexture surfaceTexture, int i, int i2);

    private static native int on_surface_texture_created(long j, SurfaceTexture surfaceTexture, int i, int i2);

    private static native int on_surface_texture_destroyed(long j, SurfaceTexture surfaceTexture);

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public boolean isAvailable() {
        boolean z;
        boolean z2;
        synchronized (lock) {
            z = true;
            if (this.mView.isAvailable()) {
                Integer num = (Integer) mLockMap.get(this.mView.getSurfaceTexture().hashCode());
                if (!(num == null || num.intValue() == 0)) {
                    z2 = true;
                    if (!z2 || this.mView == null || !this.mView.isAvailable()) {
                        z = false;
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
            z = false;
        }
        return z;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (lock) {
            if (this.pthis != 0) {
                on_surface_texture_destroyed(this.pthis, surfaceTexture);
            }
        }
        return true;
    }

    public boolean lockView(boolean z) {
        synchronized (lock) {
            if (z) {
                try {
                    int hashCode = this.mView.getSurfaceTexture().hashCode();
                    Integer num = (Integer) mLockMap.get(hashCode);
                    if (num != null) {
                        if (num.intValue() != 0) {
                            return false;
                        }
                    }
                    mLockMap.put(hashCode, Integer.valueOf(hashCode()));
                    this.mKey = hashCode;
                    return true;
                } finally {
                }
            } else {
                Integer num2 = (Integer) mLockMap.get(this.mKey);
                if (num2 != null && num2.intValue() == hashCode()) {
                    mLockMap.put(this.mKey, Integer.valueOf(0));
                }
                this.mKey = 0;
                return true;
            }
        }
    }

    public int setThis(long j, TextureView textureView) {
        synchronized (lock) {
            if (this.mView != null) {
                if (this.mView.getSurfaceTextureListener().equals(this)) {
                    this.mView.setSurfaceTextureListener(null);
                }
                if (this.mKey != 0) {
                    Integer num = (Integer) mLockMap.get(this.mKey);
                    if (num != null && num.intValue() == hashCode()) {
                        mLockMap.put(this.mKey, Integer.valueOf(0));
                    }
                    this.mKey = 0;
                }
            }
            if (textureView != null) {
                textureView.setSurfaceTextureListener(this);
            }
            this.pthis = j;
            this.mView = textureView;
        }
        return 0;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (lock) {
            if (this.pthis != 0) {
                if (VERSION.SDK_INT >= 15) {
                    surfaceTexture.setDefaultBufferSize(i, i2);
                }
                on_surface_texture_created(this.pthis, surfaceTexture, i, i2);
            }
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (lock) {
            if (this.pthis != 0) {
                on_surface_texture_changed(this.pthis, surfaceTexture, i, i2);
            }
        }
    }
}
