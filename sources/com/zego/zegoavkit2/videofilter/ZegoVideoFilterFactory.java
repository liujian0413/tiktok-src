package com.zego.zegoavkit2.videofilter;

public abstract class ZegoVideoFilterFactory {
    /* access modifiers changed from: protected */
    public abstract ZegoVideoFilter create();

    /* access modifiers changed from: protected */
    public abstract void destroy(ZegoVideoFilter zegoVideoFilter);
}
