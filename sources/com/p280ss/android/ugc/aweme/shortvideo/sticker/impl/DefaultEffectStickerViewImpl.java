package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.filter.C29263bs;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.IStickerTabGuidePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.search.SearchStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel.C40984a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.UrlPrefixViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41005b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.TabLayoutOnPageChangeListener;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl */
public final class DefaultEffectStickerViewImpl extends EffectStickerViewImpl {

    /* renamed from: B */
    private EffectStickerViewPagerAdapter f105467B;

    /* renamed from: a */
    public ViewPager f105468a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl$a */
    static final class C40589a implements C40984a {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f105469a;

        /* renamed from: b */
        final /* synthetic */ FavoriteStickerViewModel f105470b;

        /* renamed from: c */
        final /* synthetic */ TabLayout f105471c;

        C40589a(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl, FavoriteStickerViewModel favoriteStickerViewModel, TabLayout tabLayout) {
            this.f105469a = defaultEffectStickerViewImpl;
            this.f105470b = favoriteStickerViewModel;
            this.f105471c = tabLayout;
        }

        /* renamed from: a */
        public final void mo100670a(Effect effect) {
            C7573i.m23587b(effect, "it");
            this.f105470b.f106548a = null;
            this.f105469a.mo100664a(this.f105471c.mo101330a(this.f105469a.mo100707n()), true);
            C35574k.m114859a().mo70091f().mo93341a(Property.StickerCollectionFirstShown, true);
            C35574k.m114859a().mo70091f().mo93341a(Property.StickerCollectionFirst, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl$b */
    public static final class C40590b implements C41006c {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f105472a;

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
            C7573i.m23587b(fVar, "tab");
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
            C7573i.m23587b(fVar, "tab");
        }

        C40590b(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl) {
            this.f105472a = defaultEffectStickerViewImpl;
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            C7573i.m23587b(fVar, "tab");
            this.f105472a.mo100664a(fVar, false);
            if (this.f105472a.f105517l != null && this.f105472a.f105518m) {
                EffectStickerManager effectStickerManager = this.f105472a.f105509d;
                C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
                Object obj = effectStickerManager.mo100228c().get(fVar.f106702e);
                C7573i.m23582a(obj, "mEffectStickerManager.effectCategory[tab.position]");
                String str = ((EffectCategoryModel) obj).name;
                FaceStickerBean.sCurPropSource = str;
                C42962b.f111525a.mo104671a("click_prop_tab", C22984d.m75611a().mo59973a("creation_id", this.f105472a.f105517l.f99787w).mo59973a("shoot_way", this.f105472a.f105517l.f99788x).mo59970a("draft_id", this.f105472a.f105517l.f99790z).mo59973a("tab_name", str).f60753a);
                C0063u a = C0069x.m159a((FragmentActivity) this.f105472a.f105507b).mo147a(TabSelectViewModel.class);
                C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…ectViewModel::class.java)");
                TabSelectViewModel tabSelectViewModel = (TabSelectViewModel) a;
                EffectStickerManager effectStickerManager2 = this.f105472a.f105509d;
                C7573i.m23582a((Object) effectStickerManager2, "mEffectStickerManager");
                tabSelectViewModel.mo101306a((EffectCategoryModel) effectStickerManager2.mo100228c().get(fVar.f106702e), fVar.f106702e);
                tabSelectViewModel.mo101307a(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl$c */
    static final class C40591c implements C43770t {

        /* renamed from: a */
        public static final C40591c f105473a = new C40591c();

        C40591c() {
        }

        /* renamed from: a */
        public final void mo9402a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl$d */
    public static final class C40592d implements C0053p<LiveDataWrapper<PanelInfoModel>> {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f105474a;

        /* renamed from: b */
        final /* synthetic */ String f105475b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<PanelInfoModel> liveDataWrapper) {
            if (liveDataWrapper != null) {
                PanelInfoModel panelInfoModel = (PanelInfoModel) liveDataWrapper.f88767a;
                if (panelInfoModel != null) {
                    C7573i.m23582a((Object) panelInfoModel, "liveDataWrapper.response ?: return");
                    if (C7573i.m23585a((Object) this.f105475b, (Object) "default")) {
                        ((UrlPrefixViewModel) C0069x.m159a((FragmentActivity) this.f105474a.f105507b).mo147a(UrlPrefixViewModel.class)).mo101308a("default", panelInfoModel.url_prefix);
                    }
                    ViewPager viewPager = this.f105474a.f105468a;
                    if (viewPager != null) {
                        viewPager.setAdapter(null);
                    }
                    if (liveDataWrapper.f88768b == STATUS.SUCCESS) {
                        this.f105474a.mo100666a(this.f105475b, panelInfoModel);
                    }
                }
            }
        }

        C40592d(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl, String str) {
            this.f105474a = defaultEffectStickerViewImpl;
            this.f105475b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl$e */
    public static final class C40593e implements C0053p<EffectCategoryModel> {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f105476a;

        C40593e(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl) {
            this.f105476a = defaultEffectStickerViewImpl;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(EffectCategoryModel effectCategoryModel) {
            if (effectCategoryModel != null) {
                this.f105476a.mo100665a(effectCategoryModel);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl$f */
    static final class C40594f implements C41005b {

        /* renamed from: a */
        public static final C40594f f105477a = new C40594f();

        C40594f() {
        }

        /* renamed from: a */
        public final void mo74815a(C41011f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl$g */
    static final class C40595g<T> implements C0053p<Effect> {

        /* renamed from: a */
        final /* synthetic */ DefaultEffectStickerViewImpl f105478a;

        C40595g(DefaultEffectStickerViewImpl defaultEffectStickerViewImpl) {
            this.f105478a = defaultEffectStickerViewImpl;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Effect effect) {
            this.f105478a.f105524s.mo101345b(this.f105478a.f105524s.mo101330a(1));
            ViewPager viewPager = this.f105478a.f105468a;
            if (viewPager != null) {
                viewPager.setCurrentItem(1, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo100667g() {
        return R.layout.abo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo100668h() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) "1", (java.lang.Object) ((com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r3).f113499id)) != false) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100666a(java.lang.String r6, com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel r7) {
        /*
            r5 = this;
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r7.category_effects
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r1 = r5.f105509d
            java.lang.String r2 = "mEffectStickerManager"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r2 = r7.category_list
            r1.f104786d = r2
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r1 = r5.f105509d
            java.lang.String r2 = "categoryEffectModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r2 = r0.category_key
            r1.mo100218a(r2, r0)
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r0 = r7.category_list
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.isEmpty()
            if (r0 == r2) goto L_0x003d
        L_0x0025:
            java.lang.String r0 = "1"
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r3 = r7.category_list
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "model.categoryList[0]"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r3 = (com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r3
            java.lang.String r3 = r3.f113499id
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0042
        L_0x003d:
            android.support.v7.app.AppCompatActivity r0 = r5.f105507b
            r5.mo100673a(r0)
        L_0x0042:
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter r0 = r5.f105511f
            if (r0 == 0) goto L_0x004a
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r5.f105514i
            r0.f106161b = r3
        L_0x004a:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.f105513h
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r5.f105509d
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r5.f105513h
            r4 = 0
            r0.mo100225b(r3, r1, r4)
            r5.f105513h = r4
        L_0x0058:
            r5.f105522q = r2
            boolean r0 = r5.f105521p
            if (r0 == 0) goto L_0x0061
            r5.mo100703j()
        L_0x0061:
            android.support.v4.view.ViewPager r0 = r5.f105468a
            if (r0 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter r3 = r5.f105467B
            android.support.v4.view.PagerAdapter r3 = (android.support.p022v4.view.PagerAdapter) r3
            r0.setAdapter(r3)
        L_0x006c:
            android.support.v4.view.ViewPager r0 = r5.f105468a
            if (r0 == 0) goto L_0x0074
            int r1 = r0.getCurrentItem()
        L_0x0074:
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> r7 = r7.category_list
            java.lang.String r0 = "model.categoryList"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            int r7 = r5.m129758b(r7, r1)
            android.support.v4.view.ViewPager r0 = r5.f105468a
            if (r0 == 0) goto L_0x0086
            r0.setCurrentItem(r7)
        L_0x0086:
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter r0 = r5.f105467B
            r5.m129757a(r6, r0)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r6 = r5.f105524s
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r6 = r6.mo101330a(r7)
            if (r6 == 0) goto L_0x0098
            r5.f105518m = r2
            r6.mo101403a()
        L_0x0098:
            r5.mo100706m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.impl.DefaultEffectStickerViewImpl.mo100666a(java.lang.String, com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel):void");
    }

    /* renamed from: s */
    private final void m129759s() {
        this.f105524s.mo101335a(new C40590b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo100669i() {
        IStickerTabGuidePresenter iStickerTabGuidePresenter = this.f105527v;
        if (iStickerTabGuidePresenter != null) {
            iStickerTabGuidePresenter.mo100246b(false);
        }
    }

    /* renamed from: t */
    private final void m129760t() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f105507b).mo147a(TabSelectViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…ectViewModel::class.java)");
        ((TabSelectViewModel) a).f106556a.observe(this.f105507b, new C40593e(this));
    }

    public DefaultEffectStickerViewImpl(FrameLayout frameLayout) {
        C7573i.m23587b(frameLayout, "rootView");
        super(frameLayout);
    }

    /* renamed from: a */
    public final void mo100665a(EffectCategoryModel effectCategoryModel) {
        Object obj;
        if (this.f105522q) {
            C29263bs bsVar = (C29263bs) ((UrlPrefixViewModel) C0069x.m159a((FragmentActivity) this.f105507b).mo147a(UrlPrefixViewModel.class)).f106559a.getValue();
            if (bsVar != null) {
                obj = bsVar.get((Object) "default");
            } else {
                obj = null;
            }
            if (!(obj instanceof Object)) {
                obj = null;
            }
            C0902i iVar = new C0902i(effectCategoryModel, obj);
            IStickerTabGuidePresenter iStickerTabGuidePresenter = this.f105527v;
            if (iStickerTabGuidePresenter != null) {
                iStickerTabGuidePresenter.mo100244a(iVar);
            }
        }
    }

    /* renamed from: b */
    private final int m129758b(List<? extends EffectCategoryModel> list, int i) {
        Collection collection = list;
        int size = collection.size();
        int i2 = this.f105523r;
        if (i2 >= 0 && size > i2) {
            return this.f105523r;
        }
        if (collection.size() > 1) {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    private final void m129756a(AppCompatActivity appCompatActivity, TabLayout tabLayout) {
        if (C35574k.m114859a().mo70091f().mo93342a(Property.StickerCollectionFirst)) {
            C0063u a = C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FavoriteStickerViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(am…kerViewModel::class.java)");
            FavoriteStickerViewModel favoriteStickerViewModel = (FavoriteStickerViewModel) a;
            favoriteStickerViewModel.f106548a = new C40589a(this, favoriteStickerViewModel, tabLayout);
        }
    }

    /* renamed from: a */
    private final void m129757a(String str, EffectStickerViewPagerAdapter effectStickerViewPagerAdapter) {
        if (effectStickerViewPagerAdapter != null) {
            this.f105524s.mo101344b();
            if (!C7573i.m23585a((Object) "livestreaming", (Object) str)) {
                this.f105524s.setMaxTabModeForCount(effectStickerViewPagerAdapter.getCount());
            }
            int count = effectStickerViewPagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                this.f105524s.mo101336a(this.f105524s.mo101329a().mo101401a(effectStickerViewPagerAdapter.mo100721b(i)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100663a(C0043i iVar, String str) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(str, "panel");
        EffectStickerViewModel effectStickerViewModel = (EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f105507b).mo147a(EffectStickerViewModel.class);
        EffectStickerManager effectStickerManager = this.f105509d;
        C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
        effectStickerViewModel.mo101283a(effectStickerManager.f104787e, str).observe(iVar, new C40592d(this, str));
    }

    /* renamed from: a */
    public final void mo100664a(C41011f fVar, boolean z) {
        if (fVar != null && fVar.f106703f != null) {
            if (fVar.f106702e == mo100707n() && C35574k.m114859a().mo70091f().mo93342a(Property.StickerCollectionFirstShown)) {
                C35574k.m114859a().mo70091f().mo93341a(Property.StickerCollectionFirstShown, false);
            }
            View view = fVar.f106703f;
            if (view instanceof AVDmtTabItemView) {
                ((AVDmtTabItemView) view).mo103525b(z);
            }
            EffectStickerManager effectStickerManager = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager, "mEffectStickerManager");
            EffectPlatform effectPlatform = effectStickerManager.f104787e;
            EffectStickerManager effectStickerManager2 = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager2, "mEffectStickerManager");
            Object obj = effectStickerManager2.mo100228c().get(fVar.f106702e);
            C7573i.m23582a(obj, "mEffectStickerManager.effectCategory[tab.position]");
            String str = ((EffectCategoryModel) obj).f113499id;
            EffectStickerManager effectStickerManager3 = this.f105509d;
            C7573i.m23582a((Object) effectStickerManager3, "mEffectStickerManager");
            Object obj2 = effectStickerManager3.mo100228c().get(fVar.f106702e);
            C7573i.m23582a(obj2, "mEffectStickerManager.effectCategory[tab.position]");
            effectPlatform.mo70631a(str, ((EffectCategoryModel) obj2).tags_updated_at, (C43770t) C40591c.f105473a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100662a(C0043i iVar, C0608j jVar, String str, View view) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(jVar, "fragmentManager");
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(view, "root");
        this.f105468a = (ViewPager) view.findViewById(R.id.edt);
        if (this.f105519n) {
            EffectStickerViewPagerAdapter effectStickerViewPagerAdapter = new EffectStickerViewPagerAdapter(jVar, this.f105468a, this.f105509d, str, this.f105517l, this.f105507b);
            this.f105467B = effectStickerViewPagerAdapter;
            EffectStickerViewPagerAdapter effectStickerViewPagerAdapter2 = this.f105467B;
            if (effectStickerViewPagerAdapter2 != null) {
                effectStickerViewPagerAdapter2.f105553g = this;
            }
        } else {
            StoryStickerViewPagerAdapter storyStickerViewPagerAdapter = new StoryStickerViewPagerAdapter(jVar, this.f105468a, this.f105509d, str, this.f105517l, this.f105507b);
            this.f105467B = storyStickerViewPagerAdapter;
        }
        ViewPager viewPager = this.f105468a;
        if (viewPager != null) {
            viewPager.setAdapter(this.f105467B);
        }
        ViewPager viewPager2 = this.f105468a;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(3);
        }
        this.f105524s.setOnTabClickListener(C40594f.f105477a);
        m129760t();
        ViewPager viewPager3 = this.f105468a;
        if (viewPager3 != null) {
            viewPager3.addOnPageChangeListener(new TabLayoutOnPageChangeListener(this.f105524s));
        }
        m129757a(str, this.f105467B);
        ViewPager viewPager4 = this.f105468a;
        if (viewPager4 != null) {
            viewPager4.setCurrentItem(mo100707n() + 1);
        }
        m129759s();
        AppCompatActivity appCompatActivity = this.f105507b;
        C7573i.m23582a((Object) appCompatActivity, "mActivity");
        AVDmtTabLayout aVDmtTabLayout = this.f105524s;
        C7573i.m23582a((Object) aVDmtTabLayout, "tabLayout");
        m129756a(appCompatActivity, (TabLayout) aVDmtTabLayout);
        ((SearchStickerViewModel) C0069x.m159a((FragmentActivity) this.f105507b).mo147a(SearchStickerViewModel.class)).f106396a.observe(this.f105507b, new C40595g(this));
    }
}
