package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.C40991g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.C40992h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.bm */
public final class C40501bm {

    /* renamed from: a */
    public FaceStickerBean f105255a;

    /* renamed from: b */
    public final C20676a f105256b;

    /* renamed from: c */
    private final FaceStickerViewModel f105257c;

    /* renamed from: d */
    private final C0053p<C40991g> f105258d = new C40502a(this);

    /* renamed from: e */
    private final AppCompatActivity f105259e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.bm$a */
    static final class C40502a<T> implements C0053p<C40991g> {

        /* renamed from: a */
        final /* synthetic */ C40501bm f105260a;

        C40502a(C40501bm bmVar) {
            this.f105260a = bmVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C40991g gVar) {
            if (!(gVar instanceof C40992h)) {
                this.f105260a.f105255a = null;
                this.f105260a.f105256b.mo55906b();
            } else if (C40496bh.m129441a("voice_recognization", gVar.f106582a)) {
                this.f105260a.f105255a = gVar.f106582a;
                this.f105260a.f105256b.mo55890a();
            } else {
                this.f105260a.f105256b.mo55906b();
                this.f105260a.f105255a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo100553a() {
        if (this.f105255a != null) {
            this.f105256b.mo55890a();
        }
    }

    /* renamed from: b */
    public final void mo100554b() {
        this.f105257c.mo101292a().observe(this.f105259e, this.f105258d);
    }

    public C40501bm(AppCompatActivity appCompatActivity, C20676a aVar) {
        C7573i.m23587b(appCompatActivity, "context");
        C7573i.m23587b(aVar, "mediaController");
        this.f105259e = appCompatActivity;
        this.f105256b = aVar;
        C0063u a = C0069x.m159a((FragmentActivity) this.f105259e).mo147a(FaceStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(co…kerViewModel::class.java]");
        this.f105257c = (FaceStickerViewModel) a;
    }
}
