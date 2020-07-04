package com.p1843tt.miniapphost.entity;

import com.p1843tt.miniapphost.appbase.listener.MiniAppPreloadStateListener;

/* renamed from: com.tt.miniapphost.entity.MiniAppPreloadConfigEntity */
public class MiniAppPreloadConfigEntity {
    private boolean mCancelPreloadWhenNotWifi = true;
    private MiniAppPreloadStateListener mPreloadStateListener;

    public MiniAppPreloadStateListener getPreloadStateListener() {
        return this.mPreloadStateListener;
    }

    public boolean isCancelPreloadWhenNotWifi() {
        return this.mCancelPreloadWhenNotWifi;
    }

    public void setCancelPreloadWhenNotWifi(boolean z) {
        this.mCancelPreloadWhenNotWifi = z;
    }

    public void setPreloadStateListener(MiniAppPreloadStateListener miniAppPreloadStateListener) {
        this.mPreloadStateListener = miniAppPreloadStateListener;
    }
}
