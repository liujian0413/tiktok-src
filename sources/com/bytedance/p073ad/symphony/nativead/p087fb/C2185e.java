package com.bytedance.p073ad.symphony.nativead.p087fb;

import android.content.Context;
import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.bytedance.ad.symphony.nativead.fb.e */
public final class C2185e extends MediaViewVideoRenderer {

    /* renamed from: a */
    boolean f7413a;

    public final void onCompleted() {
        super.onCompleted();
    }

    public final void onPrepared() {
        super.onPrepared();
    }

    public final boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public final void onPaused() {
        super.onPaused();
        this.f7413a = true;
    }

    public final void onPlayed() {
        super.onPlayed();
        this.f7413a = false;
    }

    public C2185e(Context context) {
        super(context);
    }
}
