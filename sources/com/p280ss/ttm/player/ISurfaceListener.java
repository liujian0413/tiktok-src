package com.p280ss.ttm.player;

import android.view.SurfaceHolder;

/* renamed from: com.ss.ttm.player.ISurfaceListener */
public interface ISurfaceListener {
    void onSurfaceChanged(SurfaceHolder surfaceHolder);

    void onSurfaceCreated(SurfaceHolder surfaceHolder);

    void onSurfaceDestroyed(SurfaceHolder surfaceHolder);
}
