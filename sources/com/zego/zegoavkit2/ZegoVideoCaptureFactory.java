package com.zego.zegoavkit2;

public abstract class ZegoVideoCaptureFactory {
    /* access modifiers changed from: protected */
    public abstract ZegoVideoCaptureDevice create(String str);

    /* access modifiers changed from: protected */
    public abstract void destroy(ZegoVideoCaptureDevice zegoVideoCaptureDevice);
}
