package com.p280ss.ttm.player;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

/* renamed from: com.ss.ttm.player.TTSurfaceCallback */
public class TTSurfaceCallback implements Callback {
    private static final String TAG = "TTSurfaceCallback";
    private ISurfaceListener mListener;

    TTSurfaceCallback(ISurfaceListener iSurfaceListener) {
        this.mListener = iSurfaceListener;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.mListener != null) {
            this.mListener.onSurfaceCreated(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.mListener != null) {
            this.mListener.onSurfaceDestroyed(surfaceHolder);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.mListener != null) {
            this.mListener.onSurfaceChanged(surfaceHolder);
        }
    }
}
