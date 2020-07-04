package com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide;

import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.util.C0902i;
import android.view.ViewGroup;
import com.bytedance.apm.util.C9653q;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.IStickerTabGuidePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1615a.C40939a.C40940a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1615a.C40941b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1616b.C40946b;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.DefaultStickerTabGuidePresenter */
public final class DefaultStickerTabGuidePresenter implements IStickerTabGuidePresenter<C0902i<EffectCategoryModel, Object>> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f106437a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DefaultStickerTabGuidePresenter.class), "mMainHandler", "getMMainHandler()Landroid/os/Handler;"))};

    /* renamed from: c */
    public static final C40935a f106438c = new C40935a(null);

    /* renamed from: b */
    public final ViewGroup f106439b;

    /* renamed from: d */
    private C0902i<EffectCategoryModel, Object> f106440d;

    /* renamed from: e */
    private C40946b f106441e;

    /* renamed from: f */
    private boolean f106442f;

    /* renamed from: g */
    private final C7541d f106443g;

    /* renamed from: h */
    private final C40941b<C0902i<EffectCategoryModel, Object>> f106444h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.DefaultStickerTabGuidePresenter$a */
    public static final class C40935a {
        private C40935a() {
        }

        public /* synthetic */ C40935a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static IStickerTabGuidePresenter<C0902i<EffectCategoryModel, Object>> m130776a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "root");
            return new DefaultStickerTabGuidePresenter<>(viewGroup, null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.DefaultStickerTabGuidePresenter$b */
    static final class C40936b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40946b f106445a;

        C40936b(C40946b bVar) {
            this.f106445a = bVar;
        }

        public final void run() {
            this.f106445a.mo101233a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.DefaultStickerTabGuidePresenter$c */
    static final class C40937c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DefaultStickerTabGuidePresenter f106446a;

        /* renamed from: b */
        final /* synthetic */ C40946b f106447b;

        C40937c(DefaultStickerTabGuidePresenter defaultStickerTabGuidePresenter, C40946b bVar) {
            this.f106446a = defaultStickerTabGuidePresenter;
            this.f106447b = bVar;
        }

        public final void run() {
            this.f106447b.mo101232a(this.f106446a.f106439b);
        }
    }

    /* renamed from: a */
    private final Handler m130763a() {
        return (Handler) this.f106443g.getValue();
    }

    /* renamed from: a */
    public final void mo100333a(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
    }

    /* renamed from: a */
    public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: b */
    public final void mo100337b(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
    }

    /* renamed from: c */
    public final void mo100339c(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C40946b bVar = this.f106441e;
        if (bVar != null) {
            bVar.mo101233a(false);
        }
    }

    /* renamed from: b */
    private final void m130766b() {
        C40946b bVar = this.f106441e;
        if (bVar != null) {
            m130764a(bVar.mo101235b(), (Runnable) new C40936b(bVar));
        }
    }

    /* renamed from: c */
    private final void m130767c() {
        C40946b bVar = this.f106441e;
        if (bVar != null) {
            m130764a(bVar.mo101235b(), (Runnable) new C40937c(this, bVar));
        }
    }

    /* renamed from: b */
    public final void mo100246b(boolean z) {
        C40946b bVar = this.f106441e;
        if (bVar != null) {
            bVar.mo101233a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo100244a(C0902i<EffectCategoryModel, Object> iVar) {
        boolean z;
        m130766b();
        boolean a = C7573i.m23585a((Object) iVar, (Object) this.f106440d);
        C40946b bVar = this.f106441e;
        if (bVar != null) {
            z = bVar.mo101234a();
        } else {
            z = false;
        }
        if (!a || !z) {
            this.f106441e = this.f106444h.mo101228a(iVar);
            this.f106440d = iVar;
        }
        m130767c();
    }

    /* renamed from: a */
    public final void mo100245a(boolean z) {
        this.f106442f = true;
    }

    /* renamed from: b */
    public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
        if (this.f106442f) {
            C40946b bVar = this.f106441e;
            if (bVar != null) {
                bVar.mo101233a(false);
            }
        }
    }

    private DefaultStickerTabGuidePresenter(ViewGroup viewGroup, C40941b<C0902i<EffectCategoryModel, Object>> bVar) {
        C7573i.m23587b(viewGroup, "root");
        C7573i.m23587b(bVar, "factory");
        this.f106439b = viewGroup;
        this.f106444h = bVar;
        this.f106443g = C7546e.m23570a(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    private final void m130764a(int i, Runnable runnable) {
        switch (i) {
            case 0:
                if (C9653q.m28546a()) {
                    runnable.run();
                    return;
                } else {
                    m130763a().post(runnable);
                    return;
                }
            case 1:
                m130763a().post(runnable);
                break;
            case 2:
                runnable.run();
                return;
        }
    }

    public /* synthetic */ DefaultStickerTabGuidePresenter(ViewGroup viewGroup, C40941b bVar, int i, C7571f fVar) {
        this(viewGroup, C40940a.m130785a());
    }
}
