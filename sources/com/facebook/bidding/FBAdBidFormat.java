package com.facebook.bidding;

public enum FBAdBidFormat {
    BANNER_320_50(320, 50, 0, 0, false, "banner"),
    BANNER_HEIGHT_50(-1, 50, 0, 0, false, "banner"),
    BANNER_HEIGHT_90(-1, 90, 0, 0, false, "banner"),
    BANNER_HEIGHT_250(-1, 250, 0, 0, true, "banner"),
    INTERSTITIAL(0, 0, 1, 0, true, "banner"),
    INSTREAM_VIDEO(0, 0, 0, 1, true, "video"),
    REWARDED_VIDEO(0, 0, 0, 2, true, "video"),
    NATIVE(-1, -1, 0, 0, true, "native"),
    NATIVE_BANNER(-1, -1, 0, 0, false, "native");
    

    /* renamed from: a */
    private final int f34980a;

    /* renamed from: b */
    private final int f34981b;

    /* renamed from: c */
    private final int f34982c;

    /* renamed from: d */
    private final int f34983d;

    /* renamed from: e */
    private final boolean f34984e;

    /* renamed from: f */
    private final String f34985f;

    private FBAdBidFormat(int i, int i2, int i3, int i4, boolean z, String str) {
        this.f34980a = i;
        this.f34981b = i2;
        this.f34982c = i3;
        this.f34983d = i4;
        this.f34984e = z;
        this.f34985f = str;
    }

    public final String getFormatLabel() {
        return this.f34985f;
    }

    public final int getHeight() {
        return this.f34981b;
    }

    public final int getInstl() {
        return this.f34982c;
    }

    public final int getLinearity() {
        return this.f34983d;
    }

    public final boolean getMediaView() {
        return this.f34984e;
    }

    public final int getWidth() {
        return this.f34980a;
    }
}
