package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40998d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.C40991g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42581q;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d */
public final class C40531d implements C40998d {

    /* renamed from: a */
    public boolean f105332a = true;

    /* renamed from: b */
    public final FragmentActivity f105333b;

    /* renamed from: c */
    private final FaceStickerViewModel f105334c;

    /* renamed from: b */
    public final void mo100602b() {
        FaceStickerBean c = m129586c();
        if (c != null) {
            m129587c(c);
        }
    }

    /* renamed from: c */
    private final FaceStickerBean m129586c() {
        C40991g gVar = (C40991g) this.f105334c.mo101292a().getValue();
        if (gVar != null) {
            return gVar.f106582a;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo100600a() {
        if (m129586c() != null) {
            FaceStickerBean c = m129586c();
            if (c == null) {
                C7573i.m23580a();
            }
            if (c.shouldShowCommerceStickerTag()) {
                FaceStickerBean c2 = m129586c();
                if (c2 == null) {
                    C7573i.m23580a();
                }
                m129585b(c2);
            }
        }
    }

    /* renamed from: a */
    public final void mo100601a(FaceStickerBean faceStickerBean) {
        if (this.f105332a) {
            this.f105332a = false;
            if (faceStickerBean != null) {
                if (faceStickerBean.shouldShowCommerceStickerTag()) {
                    m129585b(faceStickerBean);
                    return;
                }
                m129587c(faceStickerBean);
            }
        }
    }

    public C40531d(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f105333b = fragmentActivity;
        C0063u a = C0069x.m159a(this.f105333b).mo147a(FaceStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders\n     …kerViewModel::class.java]");
        this.f105334c = (FaceStickerViewModel) a;
    }

    /* renamed from: b */
    private final void m129585b(FaceStickerBean faceStickerBean) {
        C0063u a = C0069x.m159a(this.f105333b).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
        if (shortVideoContext != null) {
            RecordViewModel recordViewModel = (RecordViewModel) C36113b.m116288a(this.f105333b).mo91871a(RecordViewModel.class);
            if (shortVideoContext == null) {
                C7573i.m23580a();
            }
            recordViewModel.mo106830a(new C42581q(0, faceStickerBean, shortVideoContext.f99788x));
        }
    }

    /* renamed from: c */
    private final void m129587c(FaceStickerBean faceStickerBean) {
        C0063u a = C0069x.m159a(this.f105333b).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
        if (shortVideoContext != null) {
            RecordViewModel recordViewModel = (RecordViewModel) C36113b.m116288a(this.f105333b).mo91871a(RecordViewModel.class);
            if (shortVideoContext == null) {
                C7573i.m23580a();
            }
            recordViewModel.mo106830a(new C42581q(8, faceStickerBean, shortVideoContext.f99788x));
        }
    }
}
