package com.zego.zegoavkit2.videofilter;

public class ZegoDefaultVideoFilterFactory extends ZegoVideoFilterFactory {
    public static final ZegoDefaultVideoFilterFactory sFactory = new ZegoDefaultVideoFilterFactory();
    private ZegoVideoFilter mVideoFilter;

    private ZegoDefaultVideoFilterFactory() {
    }

    /* access modifiers changed from: protected */
    public ZegoVideoFilter create() {
        return this.mVideoFilter;
    }

    public ZegoVideoFilter getZegoVideoFilter() {
        return this.mVideoFilter;
    }

    public void setZegoVideoFilter(ZegoVideoFilter zegoVideoFilter) {
        this.mVideoFilter = zegoVideoFilter;
    }

    /* access modifiers changed from: protected */
    public void destroy(ZegoVideoFilter zegoVideoFilter) {
        if (zegoVideoFilter != null && zegoVideoFilter.equals(this.mVideoFilter)) {
            this.mVideoFilter = null;
        }
    }
}
