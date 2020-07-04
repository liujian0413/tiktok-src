package com.bytedance.p073ad.symphony.nativead.p087fb;

import com.bytedance.p073ad.symphony.p074a.p075a.C2088e;
import com.bytedance.p073ad.symphony.p074a.p075a.C2088e.C2089a;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

/* renamed from: com.bytedance.ad.symphony.nativead.fb.c */
final class C2182c implements C2088e, C2089a {

    /* renamed from: a */
    private MediaViewVideoRenderer f7409a;

    /* renamed from: a */
    public final void mo7775a() {
        if (this.f7409a != null) {
            this.f7409a.play(VideoStartReason.AUTO_STARTED);
        }
    }

    /* renamed from: b */
    public final void mo7776b() {
        if (this.f7409a != null) {
            this.f7409a.pause(true);
        }
    }

    /* renamed from: c */
    public final boolean mo7778c() {
        if (this.f7409a == null || this.f7409a.getVolume() != 0.0f) {
            return false;
        }
        return true;
    }

    public C2182c(MediaViewVideoRenderer mediaViewVideoRenderer) {
        this.f7409a = mediaViewVideoRenderer;
    }

    /* renamed from: a */
    public final void mo7777a(boolean z) {
        if (this.f7409a != null) {
            this.f7409a.setVolume(1.0f);
        }
    }
}
