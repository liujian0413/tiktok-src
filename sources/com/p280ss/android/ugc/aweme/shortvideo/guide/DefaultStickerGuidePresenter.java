package com.p280ss.android.ugc.aweme.shortvideo.guide;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.IStickerGuidePresenter;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.guide.DefaultStickerGuidePresenter */
public class DefaultStickerGuidePresenter implements IStickerGuidePresenter {

    /* renamed from: a */
    private FrameLayout f103853a;

    /* renamed from: b */
    private C39990e f103854b;

    /* renamed from: c */
    private C39992f f103855c;

    /* renamed from: d */
    private FaceStickerBean f103856d;

    @C0054q(mo125a = Event.ON_DESTROY)
    public void hide() {
        if (this.f103854b != null) {
            this.f103854b.mo98266a(true);
        }
    }

    public DefaultStickerGuidePresenter(FrameLayout frameLayout) {
        this(C39981c.m127866a(), frameLayout);
    }

    /* renamed from: a */
    public final void mo99409a(C0043i iVar) {
        iVar.getLifecycle().mo55a(this);
    }

    /* renamed from: a */
    public final void mo99410a(FaceStickerBean faceStickerBean) {
        if (this.f103854b != null) {
            this.f103854b.mo98266a(false);
        }
        if (faceStickerBean == null || (faceStickerBean.equals(this.f103856d) && !faceStickerBean.getTypes().contains("Game2DV2"))) {
            this.f103856d = faceStickerBean;
            return;
        }
        this.f103856d = faceStickerBean;
        this.f103854b = this.f103855c.mo99438a(faceStickerBean);
        this.f103854b.mo98265a(this.f103853a);
    }

    private DefaultStickerGuidePresenter(C39992f fVar, FrameLayout frameLayout) {
        this.f103853a = frameLayout;
        this.f103855c = fVar;
    }
}
