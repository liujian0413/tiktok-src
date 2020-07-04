package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1282n;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewPropertyAnimator;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.filter.CenterLayoutManager;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b */
public final class C40871b extends C40882e {

    /* renamed from: g */
    public static final C40872a f106285g = new C40872a(null);

    /* renamed from: a */
    public final String f106286a;

    /* renamed from: b */
    public final List<Effect> f106287b = new ArrayList();

    /* renamed from: c */
    public final C0043i f106288c;

    /* renamed from: d */
    public final AppCompatActivity f106289d;

    /* renamed from: e */
    public final ShortVideoContext f106290e;

    /* renamed from: f */
    public final EffectStickerManager f106291f;

    /* renamed from: q */
    private final AVDmtTabLayout f106292q;

    /* renamed from: r */
    private final DmtStatusView f106293r;

    /* renamed from: s */
    private final C1282n f106294s;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b$a */
    public static final class C40872a {
        private C40872a() {
        }

        public /* synthetic */ C40872a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b$b */
    static final class C40873b extends Lambda implements C7562b<Effect, Boolean> {

        /* renamed from: a */
        public static final C40873b f106295a = new C40873b();

        C40873b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m130612a((Effect) obj));
        }

        /* renamed from: a */
        private static boolean m130612a(Effect effect) {
            C7573i.m23587b(effect, "it");
            List tags = effect.getTags();
            if (tags == null || !tags.contains("douyin_card")) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b$c */
    static final class C40874c extends Lambda implements C7562b<Effect, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C40871b f106296a;

        C40874c(C40871b bVar) {
            this.f106296a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m130613a((Effect) obj));
        }

        /* renamed from: a */
        private boolean m130613a(Effect effect) {
            C7573i.m23587b(effect, "it");
            if (!this.f106296a.mo101126b() || !C40496bh.m129455d(effect)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b$d */
    public static final class C40875d implements C0053p<LiveDataWrapper<FetchFavoriteListResponse>> {

        /* renamed from: a */
        final /* synthetic */ C40871b f106297a;

        C40875d(C40871b bVar) {
            this.f106297a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<FetchFavoriteListResponse> liveDataWrapper) {
            if (liveDataWrapper != null && ((FetchFavoriteListResponse) liveDataWrapper.f88767a) != null) {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) liveDataWrapper.f88767a;
                if (fetchFavoriteListResponse != null) {
                    List effects = fetchFavoriteListResponse.getEffects();
                    if (effects != null) {
                        this.f106297a.mo101141b(effects);
                        C40871b.m130601a(effects);
                        this.f106297a.f106287b.clear();
                        this.f106297a.f106287b.addAll(effects);
                        C40871b bVar = this.f106297a;
                        STATUS status = liveDataWrapper.f88768b;
                        C7573i.m23582a((Object) status, "list.status");
                        bVar.mo101149a(status);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b$e */
    static final class C40876e<T> implements C0053p<C0902i<Effect, Effect>> {

        /* renamed from: a */
        final /* synthetic */ C40871b f106298a;

        C40876e(C40871b bVar) {
            this.f106298a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Effect, Effect> iVar) {
            int i;
            if (iVar != null) {
                Effect effect = (Effect) iVar.f3154a;
                Effect effect2 = (Effect) iVar.f3155b;
                NewPanelStickerAdapter newPanelStickerAdapter = this.f106298a.f106321n;
                int i2 = -1;
                if (newPanelStickerAdapter != null) {
                    i = newPanelStickerAdapter.mo101102a(this.f106298a.f106286a, effect);
                } else {
                    i = -1;
                }
                NewPanelStickerAdapter newPanelStickerAdapter2 = this.f106298a.f106321n;
                if (newPanelStickerAdapter2 != null) {
                    i2 = newPanelStickerAdapter2.mo101102a(this.f106298a.f106286a, effect2);
                }
                if (i >= 0) {
                    NewPanelStickerAdapter newPanelStickerAdapter3 = this.f106298a.f106321n;
                    if (newPanelStickerAdapter3 != null) {
                        newPanelStickerAdapter3.notifyItemChanged(i, StickerWrapper.m129064a(effect, this.f106298a.f106286a, (C27481e) this.f106298a.f106291f.f104787e));
                    }
                }
                if (i2 >= 0) {
                    NewPanelStickerAdapter newPanelStickerAdapter4 = this.f106298a.f106321n;
                    if (newPanelStickerAdapter4 != null) {
                        newPanelStickerAdapter4.notifyItemChanged(i2, StickerWrapper.m129064a(effect2, this.f106298a.f106286a, (C27481e) this.f106298a.f106291f.f104787e));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b$f */
    public static final class C40877f implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C40871b f106299a;

        C40877f(C40871b bVar) {
            this.f106299a = bVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f106299a.mo101154k();
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f106299a.f106319l) {
                this.f106299a.mo101152i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.b$g */
    static final class C40878g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AVDmtPanelRecyleView f106300a;

        /* renamed from: b */
        final /* synthetic */ float f106301b;

        /* renamed from: c */
        final /* synthetic */ float f106302c;

        /* renamed from: d */
        final /* synthetic */ long f106303d;

        /* renamed from: e */
        final /* synthetic */ boolean f106304e;

        C40878g(AVDmtPanelRecyleView aVDmtPanelRecyleView, float f, float f2, long j, boolean z) {
            this.f106300a = aVDmtPanelRecyleView;
            this.f106301b = f;
            this.f106302c = f2;
            this.f106303d = j;
            this.f106304e = z;
        }

        public final void run() {
            int i;
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106300a;
            if (this.f106304e) {
                i = 0;
            } else {
                i = 8;
            }
            aVDmtPanelRecyleView.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo101128d() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        DmtStatusView dmtStatusView = this.f106293r;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(0);
        }
        DmtStatusView dmtStatusView2 = this.f106293r;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25934a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo101129e() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        DmtStatusView dmtStatusView = this.f106293r;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(0);
        }
        DmtStatusView dmtStatusView2 = this.f106293r;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25942f();
        }
    }

    /* renamed from: l */
    private final void m130602l() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo5528a((C1281m) new C40833x8cb7df70(this));
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f106320m;
        if (aVDmtPanelRecyleView2 != null) {
            aVDmtPanelRecyleView2.addOnAttachStateChangeListener(new C40877f(this));
        }
        this.f106323p = new C40834x8cb7df72(this);
        C1278j jVar = this.f106323p;
        if (jVar != null) {
            AVDmtPanelRecyleView aVDmtPanelRecyleView3 = this.f106320m;
            if (aVDmtPanelRecyleView3 != null) {
                aVDmtPanelRecyleView3.mo5526a(jVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo101120a() {
        this.f106292q.setHideIndicatorView(true);
        C41011f a = this.f106292q.mo101330a(0);
        if (a != null) {
            a.mo101403a();
        }
    }

    /* renamed from: b */
    public final boolean mo101126b() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f106289d).mo147a(EffectStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
        ShortVideoContext d = ((EffectStickerViewModel) a).mo101285a().mo101195d();
        if (d.mo96142d() || d.mo96144e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 == null) goto L_0x001b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101127c() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView r0 = r5.f106320m
            if (r0 == 0) goto L_0x0008
            r1 = 0
            r0.setVisibility(r1)
        L_0x0008:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r5.f106293r
            if (r0 == 0) goto L_0x0011
            r1 = 8
            r0.setVisibility(r1)
        L_0x0011:
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r0 = r5.f106321n
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.mo62312a()
            if (r0 != 0) goto L_0x001f
        L_0x001b:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
        L_0x001f:
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r5.f106287b
            java.lang.String r2 = r5.f106286a
            java.util.List r1 = com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper.m129069a(r1, r2)
            java.lang.String r2 = "StickerWrapper.covertDat…oriteStickers, mCategory)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0050
            android.support.v7.app.AppCompatActivity r0 = r5.f106289d
            r1 = 2131821105(0x7f110231, float:1.9274944E38)
            java.lang.String r0 = r0.getString(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r1 = r5.f106321n
            if (r1 == 0) goto L_0x004f
            java.lang.String r2 = "tips"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.model.EmptyStickerWrapper r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d.m130628b(r0)
            java.util.List r0 = kotlin.collections.C7525m.m23457a(r0)
            r1.mo58045a(r0)
        L_0x004f:
            return
        L_0x0050:
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r2 = r5.f106321n
            if (r2 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerDiff r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerDiff
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r4 = r5.f106291f
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.f104783a
            r3.<init>(r4, r0, r1)
            android.support.v7.util.a$a r3 = (android.support.p029v7.util.C1143a.C1145a) r3
            r0 = 1
            android.support.v7.util.a$b r0 = android.support.p029v7.util.C1143a.m5067a(r3, r0)
            java.lang.String r3 = "DiffUtil.calculateDiff(\n… oldData, newData), true)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r3 = r2
            android.support.v7.widget.RecyclerView$a r3 = (android.support.p029v7.widget.RecyclerView.C1262a) r3
            r0.mo4548a(r3)
            r2.mo58045a(r1)
            return
        L_0x0073:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40871b.mo101127c():void");
    }

    /* renamed from: b */
    public final void mo101141b(List<Effect> list) {
        if (list != null) {
            C7525m.m23480a(list, (C7562b<? super T, Boolean>) new C40874c<Object,Boolean>(this));
        }
    }

    /* renamed from: a */
    public static void m130601a(List<Effect> list) {
        if (list != null) {
            C22200c e = C35574k.m114859a().mo70073G().mo57092e();
            if (e != null && !e.mo58567j()) {
                C7525m.m23480a(list, (C7562b<? super T, Boolean>) C40873b.f106295a);
            }
        }
    }

    /* renamed from: a */
    private final void m130600a(View view) {
        NewPanelStickerAdapter newPanelStickerAdapter = new NewPanelStickerAdapter(this.f106291f);
        newPanelStickerAdapter.mo66516d(false);
        this.f106321n = newPanelStickerAdapter;
        this.f106322o = new CenterLayoutManager(this.f106289d, 0, false);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) view.findViewById(R.id.bhh);
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setAdapter(this.f106321n);
            aVDmtPanelRecyleView.setLayoutManager(this.f106322o);
            aVDmtPanelRecyleView.setItemViewCacheSize(5);
            aVDmtPanelRecyleView.setRecycledViewPool(this.f106294s);
        } else {
            aVDmtPanelRecyleView = null;
        }
        this.f106320m = aVDmtPanelRecyleView;
    }

    /* renamed from: a */
    public final void mo101139a(String str, View view) {
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(view, "root");
        m130600a(view);
        m130602l();
        mo101150b(mo101153j());
        C0063u a = C0069x.m159a((FragmentActivity) this.f106289d).mo147a(CurParentStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
        ((CurParentStickerViewModel) a).mo101270a().observe(this.f106288c, new C40876e(this));
    }

    /* renamed from: a */
    public final void mo101124a(String str, C7562b<? super String, ? extends Object> bVar) {
        C7573i.m23587b(str, "panel");
        if (STATUS.SUCCESS != this.f106316i) {
            mo101149a(STATUS.LOADING);
            C0063u a = C0069x.m159a((FragmentActivity) this.f106289d).mo147a(FavoriteStickerViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
            ((FavoriteStickerViewModel) a).f106551d.observe(this.f106288c, new C40875d(this));
        }
    }

    /* renamed from: a */
    public final void mo101140a(boolean z, long j) {
        float f;
        float f2;
        if (this.f106317j != z) {
            this.f106317j = z;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
            if (aVDmtPanelRecyleView != null) {
                aVDmtPanelRecyleView.setAlpha(f);
                aVDmtPanelRecyleView.setVisibility(0);
                ViewPropertyAnimator duration = aVDmtPanelRecyleView.animate().alpha(f2).setDuration(250);
                C40878g gVar = new C40878g(aVDmtPanelRecyleView, f, f2, 250, z);
                duration.withEndAction(gVar).start();
            }
            if (this.f106318k) {
                mo101149a(STATUS.SUCCESS);
                this.f106318k = false;
            }
        }
    }

    public C40871b(C0043i iVar, AppCompatActivity appCompatActivity, ShortVideoContext shortVideoContext, AVDmtTabLayout aVDmtTabLayout, DmtStatusView dmtStatusView, C1282n nVar, EffectStickerManager effectStickerManager) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(appCompatActivity, "mActivity");
        C7573i.m23587b(aVDmtTabLayout, "mTabLayout");
        C7573i.m23587b(nVar, "mViewPool");
        C7573i.m23587b(effectStickerManager, "mEffectStickerManager");
        super(appCompatActivity, shortVideoContext, effectStickerManager);
        this.f106288c = iVar;
        this.f106289d = appCompatActivity;
        this.f106290e = shortVideoContext;
        this.f106292q = aVDmtTabLayout;
        this.f106293r = dmtStatusView;
        this.f106294s = nVar;
        this.f106291f = effectStickerManager;
        String string = this.f106289d.getString(R.string.e1m);
        C7573i.m23582a((Object) string, "mActivity.getString(R.st…g.sticker_tab_collection)");
        this.f106286a = string;
    }
}
