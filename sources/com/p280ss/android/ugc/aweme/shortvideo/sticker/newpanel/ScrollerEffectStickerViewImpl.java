package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1282n;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag.C40377a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41005b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl */
public final class ScrollerEffectStickerViewImpl extends EffectStickerViewImpl {

    /* renamed from: D */
    public static final C40841a f106227D = new C40841a(null);

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f106228a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ScrollerEffectStickerViewImpl.class), "mViewPool", "getMViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;"))};

    /* renamed from: B */
    public C40871b f106229B;

    /* renamed from: C */
    public C40851a f106230C;

    /* renamed from: E */
    private final C7541d f106231E = C7546e.m23570a(new C1282n());

    /* renamed from: F */
    private DmtStatusView f106232F;

    /* renamed from: G */
    private View f106233G;

    /* renamed from: H */
    private View f106234H;

    /* renamed from: I */
    private boolean f106235I;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$a */
    public static final class C40841a {
        private C40841a() {
        }

        public /* synthetic */ C40841a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$b */
    public static final class C40842b implements C41006c {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f106236a;

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
        }

        C40842b(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl) {
            this.f106236a = scrollerEffectStickerViewImpl;
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            if (fVar != null) {
                View view = fVar.f106703f;
                if (view != null) {
                    C7573i.m23582a((Object) view, "tab.customView ?: return");
                    if (view instanceof AVDmtTabItemView) {
                        ((AVDmtTabItemView) view).mo103525b(false);
                        EffectStickerManager effectStickerManager = this.f106236a.f105509d;
                        C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
                        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) effectStickerManager.mo100231d().get(fVar.f106702e);
                        ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl = this.f106236a;
                        C7573i.m23582a((Object) effectCategoryModel, "category");
                        scrollerEffectStickerViewImpl.mo101114a(effectCategoryModel);
                    }
                    this.f106236a.mo101113a(fVar.f106702e);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$c */
    static final class C40843c implements C41005b {

        /* renamed from: a */
        public static final C40843c f106237a = new C40843c();

        C40843c() {
        }

        /* renamed from: a */
        public final void mo74815a(C41011f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$d */
    static final class C40844d extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f106238a;

        C40844d(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl) {
            this.f106238a = scrollerEffectStickerViewImpl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m130551a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m130551a(String str) {
            C7573i.m23587b(str, "<anonymous parameter 0>");
            this.f106238a.mo101117s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$e */
    static final class C40845e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f106239a;

        /* renamed from: b */
        final /* synthetic */ C0043i f106240b;

        /* renamed from: c */
        final /* synthetic */ String f106241c;

        C40845e(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl, C0043i iVar, String str) {
            this.f106239a = scrollerEffectStickerViewImpl;
            this.f106240b = iVar;
            this.f106241c = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106239a.mo100663a(this.f106240b, this.f106241c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$f */
    static final class C40846f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f106242a;

        /* renamed from: b */
        final /* synthetic */ int f106243b;

        /* renamed from: c */
        final /* synthetic */ EffectCategoryModel f106244c;

        /* renamed from: d */
        final /* synthetic */ AVDmtTabItemView f106245d;

        C40846f(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl, int i, EffectCategoryModel effectCategoryModel, AVDmtTabItemView aVDmtTabItemView) {
            this.f106242a = scrollerEffectStickerViewImpl;
            this.f106243b = i;
            this.f106244c = effectCategoryModel;
            this.f106245d = aVDmtTabItemView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
            if (r8 == null) goto L_0x0084;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                android.support.v7.app.AppCompatActivity r8 = r8.f105507b
                r0 = 2131823076(0x7f1109e4, float:1.9278941E38)
                java.lang.String r8 = r8.getString(r0)
                int r0 = r7.f106243b
                if (r0 != 0) goto L_0x004d
                com.ss.android.ugc.aweme.port.in.n r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
                com.ss.android.ugc.aweme.account.d r0 = r0.mo70073G()
                boolean r0 = r0.mo57090c()
                if (r0 != 0) goto L_0x004d
                com.ss.android.ugc.aweme.port.in.n r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
                com.ss.android.ugc.aweme.account.d r1 = r0.mo70073G()
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r0 = r7.f106242a
                android.support.v7.app.AppCompatActivity r0 = r0.f105507b
                java.lang.String r2 = "mActivity"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                r2 = r0
                android.app.Activity r2 = (android.app.Activity) r2
                java.lang.String r3 = ""
                java.lang.String r4 = "click_my_prop"
                java.lang.String r0 = "loginTitle"
                kotlin.jvm.internal.C7573i.m23582a(r8, r0)
                android.os.Bundle r5 = com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl.m130529c(r8)
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$f$1 r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$f$1
                r8.<init>(r7)
                r6 = r8
                com.ss.android.ugc.aweme.account.d$a r6 = (com.p280ss.android.ugc.aweme.account.C21164d.C21165a) r6
                r1.mo57085a(r2, r3, r4, r5, r6)
                return
            L_0x004d:
                int r8 = r7.f106243b
                r0 = 0
                if (r8 != 0) goto L_0x00af
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                android.support.v7.app.AppCompatActivity r8 = r8.f105507b
                android.support.v4.app.FragmentActivity r8 = (android.support.p022v4.app.FragmentActivity) r8
                android.arch.lifecycle.w r8 = android.arch.lifecycle.C0069x.m159a(r8)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel> r1 = com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel.class
                android.arch.lifecycle.u r8 = r8.mo147a(r1)
                java.lang.String r1 = "ViewModelProviders.of(mA…kerViewModel::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r8, r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel r8 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel) r8
                android.arch.lifecycle.o<com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper<com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse>> r8 = r8.f106551d
                java.lang.String r1 = "ViewModelProviders.of(mA…                .stickers"
                kotlin.jvm.internal.C7573i.m23582a(r8, r1)
                java.lang.Object r8 = r8.getValue()
                com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper r8 = (com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper) r8
                if (r8 == 0) goto L_0x0084
                M r8 = r8.f88767a
                com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse r8 = (com.p280ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse) r8
                if (r8 == 0) goto L_0x0084
                java.util.List r8 = r8.getEffects()
                if (r8 != 0) goto L_0x0088
            L_0x0084:
                java.util.List r8 = kotlin.collections.C7525m.m23461a()
            L_0x0088:
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x009f
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                android.support.v7.app.AppCompatActivity r8 = r8.f105507b
                android.content.Context r8 = (android.content.Context) r8
                r1 = 2131821105(0x7f110231, float:1.9274944E38)
                com.bytedance.ies.dmt.ui.c.a r8 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31383a(r8, r1)
                r8.mo25750a()
                goto L_0x00cc
            L_0x009f:
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                r1 = 1
                r8.mo101116c(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b r8 = r8.f106229B
                if (r8 == 0) goto L_0x00cc
                r8.mo101120a()
                goto L_0x00cc
            L_0x00af:
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r1 = r7.f106244c
                r8.mo101114a(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                r8.mo101116c(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a r8 = r8.f106230C
                if (r8 == 0) goto L_0x00cc
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r1 = r7.f106244c
                java.lang.String r1 = r1.key
                if (r1 != 0) goto L_0x00c9
                java.lang.String r1 = ""
            L_0x00c9:
                r8.mo101122a(r1)
            L_0x00cc:
                com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r8 = r7.f106245d
                r8.mo103525b(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl r8 = r7.f106242a
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r0 = r7.f106244c
                r8.mo101115b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl.C40846f.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$g */
    public static final class C40848g implements C43765o {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f106247a;

        /* renamed from: b */
        final /* synthetic */ int f106248b;

        /* renamed from: c */
        final /* synthetic */ AVDmtTabItemView f106249c;

        /* renamed from: a */
        public final void mo9278a() {
        }

        /* renamed from: b */
        public final void mo9279b() {
            int i = this.f106248b;
            AVDmtTabLayout aVDmtTabLayout = this.f106247a.f105524s;
            C7573i.m23582a((Object) aVDmtTabLayout, "tabLayout");
            if (i != aVDmtTabLayout.getSelectedTabPosition()) {
                this.f106249c.mo103525b(true);
            }
        }

        C40848g(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl, int i, AVDmtTabItemView aVDmtTabItemView) {
            this.f106247a = scrollerEffectStickerViewImpl;
            this.f106248b = i;
            this.f106249c = aVDmtTabItemView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl$h */
    static final class C40849h implements C43770t {

        /* renamed from: a */
        public static final C40849h f106250a = new C40849h();

        C40849h() {
        }

        /* renamed from: a */
        public final void mo9402a() {
        }
    }

    /* renamed from: t */
    private final C1282n m130532t() {
        return (C1282n) this.f106231E.getValue();
    }

    /* renamed from: g */
    public final int mo100667g() {
        return R.layout.abn;
    }

    /* renamed from: v */
    private final void m130534v() {
        this.f105524s.mo101335a(new C40842b(this));
    }

    /* renamed from: i */
    public final void mo100669i() {
        C40851a aVar = this.f106230C;
        if (aVar != null) {
            aVar.mo101151h();
        }
        C40871b bVar = this.f106229B;
        if (bVar != null) {
            bVar.mo101151h();
        }
    }

    /* renamed from: w */
    private final int m130535w() {
        int i;
        if (this.f106235I) {
            return -1;
        }
        if (this.f105519n) {
            i = 2;
        } else {
            i = 1;
        }
        AVDmtTabLayout aVDmtTabLayout = this.f105524s;
        C7573i.m23582a((Object) aVDmtTabLayout, "tabLayout");
        if (aVDmtTabLayout.getTabCount() >= i) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: h */
    public final void mo100668h() {
        if (this.f106235I) {
            C40871b bVar = this.f106229B;
            if (bVar != null) {
                bVar.mo101130f();
            }
        } else {
            C40851a aVar = this.f106230C;
            if (aVar != null) {
                aVar.mo101130f();
            }
        }
    }

    /* renamed from: p */
    public final void mo100711p() {
        super.mo100711p();
        C40851a aVar = this.f106230C;
        if (aVar != null) {
            aVar.mo101131g();
        }
        C40871b bVar = this.f106229B;
        if (bVar != null) {
            bVar.mo101131g();
        }
    }

    /* renamed from: s */
    public final void mo101117s() {
        EffectStickerManager effectStickerManager = this.f105509d;
        C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
        List d = effectStickerManager.mo100231d();
        C7573i.m23582a((Object) d, "mEffectStickerManager.newPanelEffectCategory");
        if (!d.isEmpty()) {
            Object obj = d.get(0);
            C7573i.m23582a(obj, "effectCategory[0]");
            if (!C7573i.m23585a((Object) "1", (Object) ((EffectCategoryModel) obj).f113499id)) {
                AppCompatActivity appCompatActivity = this.f105507b;
                C7573i.m23582a((Object) appCompatActivity, "mActivity");
                m130528b(appCompatActivity);
            }
        }
        MultiStickerPresenter multiStickerPresenter = this.f105511f;
        if (multiStickerPresenter != null) {
            multiStickerPresenter.f106161b = this.f105514i;
        }
        this.f105511f.f106160a = true;
        if (this.f105513h != null) {
            this.f105509d.mo100225b(this.f105513h, 0, null);
            this.f105513h = null;
        }
        this.f105522q = true;
        if (this.f105521p) {
            mo100703j();
        }
        m130533u();
        mo100706m();
    }

    /* renamed from: u */
    private final void m130533u() {
        this.f105524s.mo101344b();
        EffectStickerManager effectStickerManager = this.f105509d;
        C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
        List d = effectStickerManager.mo100231d();
        C7573i.m23582a((Object) d, "mEffectStickerManager.newPanelEffectCategory");
        Iterable iterable = d;
        Collection arrayList = new ArrayList();
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            View a = m130524a(i, (EffectCategoryModel) next);
            if (a != null) {
                arrayList.add(a);
            }
            i = i2;
        }
        for (View a2 : (List) arrayList) {
            this.f105524s.mo101336a(this.f105524s.mo101329a().mo101401a(a2));
        }
        m130534v();
        this.f105524s.setOnTabClickListener(C40843c.f106237a);
        int w = m130535w();
        if (-1 != w) {
            C41011f a3 = this.f105524s.mo101330a(w);
            if (a3 != null) {
                a3.mo101403a();
            }
        }
    }

    public ScrollerEffectStickerViewImpl(FrameLayout frameLayout) {
        C7573i.m23587b(frameLayout, "rootView");
        super(frameLayout);
    }

    /* renamed from: b */
    private final void m130528b(AppCompatActivity appCompatActivity) {
        if (this.f105519n && this.f105509d != null) {
            EffectStickerManager effectStickerManager = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
            effectStickerManager.mo100231d().add(0, C40377a.m129124b(appCompatActivity));
        }
    }

    /* renamed from: c */
    public static Bundle m130529c(String str) {
        if (C30538p.m99745a()) {
            return null;
        }
        return C42914ab.m136242a().mo104633a("login_title", str).f111445a;
    }

    /* renamed from: a */
    public final void mo101114a(EffectCategoryModel effectCategoryModel) {
        EffectStickerManager effectStickerManager = this.f105509d;
        C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
        effectStickerManager.f104787e.mo70631a(effectCategoryModel.f113499id, effectCategoryModel.tags_updated_at, (C43770t) C40849h.f106250a);
    }

    /* renamed from: c */
    private static String m130530c(EffectCategoryModel effectCategoryModel) {
        String str;
        EffectCategoryIconsModel effectCategoryIconsModel = effectCategoryModel.icon;
        if (effectCategoryIconsModel != null) {
            str = effectCategoryIconsModel.uri;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        EffectCategoryIconsModel effectCategoryIconsModel2 = effectCategoryModel.icon;
        C7573i.m23582a((Object) effectCategoryIconsModel2, "icon");
        String str2 = effectCategoryIconsModel2.uri;
        C7573i.m23582a((Object) str2, "icon.uri");
        return str2;
    }

    /* renamed from: c */
    private final void m130531c(View view) {
        AppCompatActivity appCompatActivity = this.f105507b;
        C7573i.m23582a((Object) appCompatActivity, "mActivity");
        if (C40881d.m130625a((Context) appCompatActivity)) {
            View findViewById = view.findViewById(R.id.bk5);
            AppCompatActivity appCompatActivity2 = this.f105507b;
            C7573i.m23582a((Object) appCompatActivity2, "mActivity");
            m130526a(findViewById, appCompatActivity2.getResources().getDimensionPixelSize(R.dimen.cp) + ((int) C9738o.m28708b((Context) this.f105507b, 4.0f)));
            m130526a(view.findViewById(R.id.bk6), (int) C9738o.m28708b((Context) this.f105507b, 124.0f));
        }
    }

    /* renamed from: b */
    public final void mo101115b(EffectCategoryModel effectCategoryModel) {
        String str;
        EffectStickerManager effectStickerManager = this.f105509d;
        C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
        if (C7573i.m23585a((Object) effectStickerManager.mo100221b(), (Object) "livestreaming")) {
            str = "live_set";
        } else {
            str = "shoot_page";
        }
        C42962b bVar = C42962b.f111525a;
        MobClick jsonObject = MobClick.obtain().setEventName("click_prop_tab").setLabelName("prop").setValue(effectCategoryModel.f113499id).setJsonObject(new C6909j().mo16966a("position", str).mo16967a());
        C7573i.m23582a((Object) jsonObject, "MobClick.obtain()\n      …                .build())");
        bVar.onEvent(jsonObject);
    }

    /* renamed from: c */
    public final void mo101116c(boolean z) {
        this.f106235I = z;
        C40851a aVar = this.f106230C;
        if (aVar != null) {
            aVar.mo101125a(!this.f106235I, 250);
        }
        C40871b bVar = this.f106229B;
        if (bVar != null) {
            bVar.mo101140a(this.f106235I, 250);
        }
        if (this.f106235I) {
            C40851a aVar2 = this.f106230C;
            if (aVar2 != null) {
                aVar2.mo101151h();
            }
            C40871b bVar2 = this.f106229B;
            if (bVar2 != null) {
                bVar2.mo101130f();
            }
        } else {
            C40851a aVar3 = this.f106230C;
            if (aVar3 != null) {
                aVar3.mo101130f();
            }
            C40871b bVar3 = this.f106229B;
            if (bVar3 != null) {
                bVar3.mo101151h();
            }
        }
    }

    /* renamed from: a */
    public final void mo101113a(int i) {
        if (this.f105517l != null) {
            EffectStickerManager effectStickerManager = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
            Object obj = effectStickerManager.mo100231d().get(i);
            C7573i.m23582a(obj, "mEffectStickerManager\n  …lEffectCategory[position]");
            FaceStickerBean.sCurPropSource = ((EffectCategoryModel) obj).name;
            EffectStickerManager effectStickerManager2 = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager2, "mEffectStickerManager");
            Object obj2 = effectStickerManager2.mo100231d().get(i);
            C7573i.m23582a(obj2, "mEffectStickerManager.ne…lEffectCategory[position]");
            C42962b.f111525a.mo104671a("click_prop_tab", C22984d.m75611a().mo59973a("creation_id", this.f105517l.f99787w).mo59973a("shoot_way", this.f105517l.f99788x).mo59970a("draft_id", this.f105517l.f99790z).mo59973a("tab_name", ((EffectCategoryModel) obj2).name).f60753a);
        }
    }

    /* renamed from: a */
    private static void m130526a(View view, int i) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private final View m130524a(int i, EffectCategoryModel effectCategoryModel) {
        if (effectCategoryModel == null) {
            return null;
        }
        boolean z = true;
        AVDmtTabItemView a = C42107a.m134029a(this.f105507b, true);
        a.setOnClickListener(new C40846f(this, i, effectCategoryModel, a));
        String c = m130530c(effectCategoryModel);
        if (c.length() != 0) {
            z = false;
        }
        if (z) {
            a.setText(effectCategoryModel.name);
        } else {
            a.mo103523a(c, (int) R.drawable.aiu);
        }
        EffectStickerManager effectStickerManager = this.f105509d;
        C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
        effectStickerManager.f104787e.mo70634a(effectCategoryModel.f113499id, effectCategoryModel.tags, effectCategoryModel.tags_updated_at, (C43765o) new C40848g(this, i, a));
        return a;
    }

    /* renamed from: a */
    public final void mo100663a(C0043i iVar, String str) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(str, "panel");
        C40871b bVar = this.f106229B;
        if (bVar != null) {
            bVar.mo101124a(str, null);
        }
        C40851a aVar = this.f106230C;
        if (aVar != null) {
            aVar.mo101124a(str, (C7562b<? super String, ? extends Object>) new C40844d<Object,Object>(this));
        }
    }

    /* renamed from: a */
    private final void m130525a(C0043i iVar, String str, View view) {
        if (this.f106230C == null) {
            AppCompatActivity appCompatActivity = this.f105507b;
            C7573i.m23582a((Object) appCompatActivity, "mActivity");
            ShortVideoContext shortVideoContext = this.f105517l;
            AVDmtTabLayout aVDmtTabLayout = this.f105524s;
            C7573i.m23582a((Object) aVDmtTabLayout, "tabLayout");
            DmtStatusView dmtStatusView = this.f106232F;
            View view2 = this.f106233G;
            C1282n t = m130532t();
            EffectStickerManager effectStickerManager = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
            C40851a aVar = new C40851a(iVar, appCompatActivity, shortVideoContext, aVDmtTabLayout, dmtStatusView, view2, t, effectStickerManager);
            this.f106230C = aVar;
            C40851a aVar2 = this.f106230C;
            if (aVar2 != null) {
                aVar2.mo101123a(str, view);
            }
        }
        if (this.f106229B == null) {
            AppCompatActivity appCompatActivity2 = this.f105507b;
            C7573i.m23582a((Object) appCompatActivity2, "mActivity");
            ShortVideoContext shortVideoContext2 = this.f105517l;
            AVDmtTabLayout aVDmtTabLayout2 = this.f105524s;
            C7573i.m23582a((Object) aVDmtTabLayout2, "tabLayout");
            DmtStatusView dmtStatusView2 = this.f106232F;
            C1282n t2 = m130532t();
            EffectStickerManager effectStickerManager2 = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager2, "mEffectStickerManager");
            C40871b bVar = new C40871b(iVar, appCompatActivity2, shortVideoContext2, aVDmtTabLayout2, dmtStatusView2, t2, effectStickerManager2);
            this.f106229B = bVar;
            C40871b bVar2 = this.f106229B;
            if (bVar2 != null) {
                bVar2.mo101139a(str, view);
            }
        }
    }

    /* renamed from: a */
    private final void m130527a(View view, C0043i iVar, String str) {
        this.f106232F = (DmtStatusView) view.findViewById(R.id.b13);
        LayoutInflater from = LayoutInflater.from(this.f105507b);
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        View inflate = from.inflate(R.layout.gf, (ViewGroup) view, false);
        inflate.findViewById(R.id.ra).setOnClickListener(new C40845e(this, iVar, str));
        DmtStatusView dmtStatusView = this.f106232F;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10803a.m31631a((Context) this.f105507b).mo25966c(inflate).mo25955a((int) R.string.bzv, (int) R.string.fid).mo25965c(1));
            dmtStatusView.setVisibility(0);
            dmtStatusView.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    public final void mo100662a(C0043i iVar, C0608j jVar, String str, View view) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(jVar, "fragmentManager");
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(view, "root");
        m130527a(view, iVar, str);
        this.f106233G = view.findViewById(R.id.ayx);
        this.f106234H = view.findViewById(R.id.bk6);
        m130531c(view);
        m130533u();
        m130525a(iVar, str, view);
        mo101116c(false);
    }
}
