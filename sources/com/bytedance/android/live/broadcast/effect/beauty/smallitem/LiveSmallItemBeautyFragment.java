package com.bytedance.android.live.broadcast.effect.beauty.smallitem;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.effect.C2636q.C2637a;
import com.bytedance.android.live.broadcast.effect.C2636q.C2639c;
import com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyAdapter.C2593a;
import com.bytedance.android.live.broadcast.effect.p136b.C2589a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5295a;
import com.bytedance.android.livesdk.p368g.p369a.C7852a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdk.widget.AdjustPercentBar.C9189b;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.C9355c.C9356a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public final class LiveSmallItemBeautyFragment extends BaseFragment {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f8356a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveSmallItemBeautyFragment.class), "beautyAdapter", "getBeautyAdapter()Lcom/bytedance/android/live/broadcast/effect/beauty/smallitem/LiveSmallItemBeautyAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveSmallItemBeautyFragment.class), "smallItemBeautySeekBar", "getSmallItemBeautySeekBar()Lcom/bytedance/android/livesdk/widget/AdjustPercentBar;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveSmallItemBeautyFragment.class), "smallItemBeautyResetView", "getSmallItemBeautyResetView()Landroid/view/View;"))};

    /* renamed from: h */
    public static final C2600a f8357h = new C2600a(null);

    /* renamed from: b */
    public C9355c f8358b;

    /* renamed from: c */
    public View f8359c;

    /* renamed from: d */
    public AdjustPercentBar f8360d;

    /* renamed from: e */
    public int f8361e = R.layout.arq;

    /* renamed from: f */
    public int f8362f = R.layout.arh;

    /* renamed from: g */
    public final C2602c f8363g = new C2602c(this);

    /* renamed from: i */
    private C5290du f8364i;

    /* renamed from: j */
    private final C7541d f8365j = C7546e.m23569a(new C2601b(this));

    /* renamed from: k */
    private final C7541d f8366k = C7546e.m23569a(new C2610k(this));

    /* renamed from: l */
    private final C7541d f8367l = C7546e.m23569a(new C2609j(this));

    /* renamed from: m */
    private HashMap f8368m;

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$a */
    public static final class C2600a {
        private C2600a() {
        }

        public /* synthetic */ C2600a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LiveSmallItemBeautyFragment m10685a(C2589a aVar) {
            C7573i.m23587b(aVar, "beautyTemplate");
            LiveSmallItemBeautyFragment liveSmallItemBeautyFragment = new LiveSmallItemBeautyFragment();
            liveSmallItemBeautyFragment.f8359c = aVar.f8318a;
            liveSmallItemBeautyFragment.f8360d = aVar.f8319b;
            liveSmallItemBeautyFragment.f8361e = aVar.f8320c;
            liveSmallItemBeautyFragment.f8362f = aVar.f8321d;
            return liveSmallItemBeautyFragment;
        }

        /* renamed from: a */
        public static /* synthetic */ LiveSmallItemBeautyFragment m10686a(C2600a aVar, C2589a aVar2, int i, Object obj) {
            C2589a aVar3 = new C2589a(null, null, 0, 0, 15, null);
            return m10685a(aVar3);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$b */
    static final class C2601b extends Lambda implements C7561a<LiveSmallItemBeautyAdapter> {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8369a;

        C2601b(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8369a = liveSmallItemBeautyFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LiveSmallItemBeautyAdapter invoke() {
            return this.f8369a.mo9229d();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$c */
    public static final class C2602c implements C2639c {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8370a;

        /* renamed from: a */
        public final void mo9233a() {
            LoadingStatusView loadingStatusView = (LoadingStatusView) this.f8370a.mo9225a((int) R.id.d84);
            if (loadingStatusView != null) {
                loadingStatusView.mo10832e();
            }
        }

        C2602c(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8370a = liveSmallItemBeautyFragment;
        }

        /* renamed from: a */
        public final void mo9234a(List<? extends C9355c> list) {
            C7573i.m23587b(list, "stickerList");
            this.f8370a.mo9226a().mo9218a(list);
            if (this.f8370a.f8358b == null) {
                this.f8370a.f8358b = (C9355c) list.get(0);
            }
            if (((LoadingStatusView) this.f8370a.mo9225a((int) R.id.d84)) != null) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) this.f8370a.mo9225a((int) R.id.d84);
                C7573i.m23582a((Object) loadingStatusView, "small_item_beauty_loading_view");
                loadingStatusView.setVisibility(8);
            }
            this.f8370a.mo9230e();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$d */
    public static final class C2603d implements C2593a {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8371a;

        C2603d(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8371a = liveSmallItemBeautyFragment;
        }

        /* renamed from: a */
        public final void mo9219a(C9355c cVar) {
            C7573i.m23587b(cVar, "sticker");
            this.f8371a.f8358b = cVar;
            this.f8371a.mo9230e();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$e */
    static final class C2604e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8372a;

        C2604e(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8372a = liveSmallItemBeautyFragment;
        }

        public final void onClick(View view) {
            C2588b b = C2515f.m10417f().mo9075b();
            C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
            b.mo9214b().mo9312a((Fragment) this.f8372a, (C2639c) this.f8372a.f8363g);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$f */
    public static final class C2605f implements C9189b {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8373a;

        C2605f(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8373a = liveSmallItemBeautyFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9236a(int r4) {
            /*
                r3 = this;
                com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment r0 = r3.f8373a
                com.bytedance.android.livesdkapi.depend.model.c r0 = r0.f8358b
                if (r0 != 0) goto L_0x0007
                return
            L_0x0007:
                com.bytedance.android.live.broadcast.c.c r0 = com.bytedance.android.live.broadcast.p132c.C2515f.m10417f()
                com.bytedance.android.live.broadcast.api.b.c r0 = r0.mo9074a()
                com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment r1 = r3.f8373a
                com.bytedance.android.livesdkapi.depend.model.c r1 = r1.f8358b
                if (r1 == 0) goto L_0x001c
                com.bytedance.android.livesdkapi.depend.model.c$a r1 = r1.f25570i
                if (r1 == 0) goto L_0x001c
                java.lang.String r1 = r1.f25589b
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment r2 = r3.f8373a
                com.bytedance.android.livesdkapi.depend.model.c r2 = r2.f8358b
                if (r2 != 0) goto L_0x0026
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0026:
                float r4 = com.bytedance.android.live.broadcast.effect.C2636q.C2637a.m10781a(r2, r4)
                r0.mo8891a(r1, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment.C2605f.mo9236a(int):void");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$g */
    static final class C2606g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8374a;

        C2606g(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8374a = liveSmallItemBeautyFragment;
        }

        public final void onClick(View view) {
            this.f8374a.mo9232g();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$h */
    static final class C2607h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8375a;

        C2607h(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8375a = liveSmallItemBeautyFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            this.f8375a.mo9231f();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$i */
    static final class C2608i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C2608i f8376a = new C2608i();

        C2608i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$j */
    static final class C2609j extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8377a;

        C2609j(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8377a = liveSmallItemBeautyFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View view;
            if (this.f8377a.f8359c != null) {
                view = this.f8377a.f8359c;
                if (view == null) {
                    C7573i.m23580a();
                    return view;
                }
            } else {
                view = LayoutInflater.from(this.f8377a.getContext()).inflate(R.layout.aw2, null);
            }
            return view;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment$k */
    static final class C2610k extends Lambda implements C7561a<AdjustPercentBar> {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyFragment f8378a;

        C2610k(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment) {
            this.f8378a = liveSmallItemBeautyFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AdjustPercentBar invoke() {
            AdjustPercentBar adjustPercentBar;
            if (this.f8378a.f8360d != null) {
                adjustPercentBar = this.f8378a.f8360d;
                if (adjustPercentBar == null) {
                    C7573i.m23580a();
                    return adjustPercentBar;
                }
            } else {
                View inflate = LayoutInflater.from(this.f8378a.getContext()).inflate(R.layout.aw3, null);
                if (inflate != null) {
                    adjustPercentBar = (AdjustPercentBar) inflate;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.android.livesdk.widget.AdjustPercentBar");
                }
            }
            return adjustPercentBar;
        }
    }

    /* renamed from: i */
    private void m10676i() {
        if (this.f8368m != null) {
            this.f8368m.clear();
        }
    }

    /* renamed from: a */
    public final View mo9225a(int i) {
        if (this.f8368m == null) {
            this.f8368m = new HashMap();
        }
        View view = (View) this.f8368m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8368m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final LiveSmallItemBeautyAdapter mo9226a() {
        return (LiveSmallItemBeautyAdapter) this.f8365j.getValue();
    }

    /* renamed from: b */
    public final AdjustPercentBar mo9227b() {
        return (AdjustPercentBar) this.f8366k.getValue();
    }

    /* renamed from: c */
    public final View mo9228c() {
        return (View) this.f8367l.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m10676i();
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
    }

    /* renamed from: d */
    public final LiveSmallItemBeautyAdapter mo9229d() {
        LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter = new LiveSmallItemBeautyAdapter(this.f8361e, this.f8362f);
        liveSmallItemBeautyAdapter.mo9217a((C2593a) new C2603d(this));
        return liveSmallItemBeautyAdapter;
    }

    /* renamed from: f */
    public final void mo9231f() {
        String str;
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        Iterator it = b.mo9214b().f8442a.iterator();
        while (it.hasNext()) {
            C9355c cVar = (C9355c) it.next();
            C2421c a = C2515f.m10417f().mo9074a();
            C7573i.m23582a((Object) cVar, "value");
            C9356a aVar = cVar.f25570i;
            if (aVar == null) {
                C7573i.m23580a();
            }
            String str2 = aVar.f25589b;
            C9356a aVar2 = cVar.f25570i;
            if (aVar2 == null) {
                C7573i.m23580a();
            }
            a.mo8889a(cVar, str2, C2637a.m10781a(cVar, aVar2.f25588a), false);
            String str3 = cVar.f25574m;
            C9355c cVar2 = this.f8358b;
            if (cVar2 != null) {
                str = cVar2.f25574m;
            } else {
                str = null;
            }
            if (C7573i.m23585a((Object) str3, (Object) str)) {
                AdjustPercentBar b2 = mo9227b();
                C9356a aVar3 = cVar.f25570i;
                if (aVar3 == null) {
                    C7573i.m23580a();
                }
                b2.setPercent(aVar3.f25588a);
            }
        }
        m10674a("live_beauty_reset_confirm");
    }

    /* renamed from: g */
    public final void mo9232g() {
        this.f8364i = new C5295a(getContext(), 2).mo13572a(false).mo13576b(C3358ac.m12515a((int) R.string.ep8), new C2607h(this)).mo13571a(C3358ac.m12515a((int) R.string.f3q), C2608i.f8376a).mo13575b((CharSequence) C3358ac.m12515a((int) R.string.ep9)).mo13570a((CharSequence) C3358ac.m12515a((int) R.string.ep_)).mo13573a();
        C5290du duVar = this.f8364i;
        if (duVar != null) {
            duVar.show();
        }
        m10674a("live_beauty_reset");
    }

    /* renamed from: h */
    private void m10675h() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.acm, null);
        inflate.setOnClickListener(new C2604e(this));
        ((LoadingStatusView) mo9225a((int) R.id.d84)).setBuilder(C3555a.m13075a(getContext()).mo10839c(inflate).mo10834a(getResources().getDimensionPixelSize(R.dimen.oa)));
        ((LoadingStatusView) mo9225a((int) R.id.d84)).mo10830c();
        mo9227b().setOnLevelChangeListener(new C2605f(this));
        RecyclerView recyclerView = (RecyclerView) mo9225a((int) R.id.d85);
        C7573i.m23582a((Object) recyclerView, "small_item_beauty_recycle_view");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) mo9225a((int) R.id.d85);
        C7573i.m23582a((Object) recyclerView2, "small_item_beauty_recycle_view");
        recyclerView2.setAdapter(mo9226a());
        ((RecyclerView) mo9225a((int) R.id.d85)).mo5525a((C1272h) new LiveSmallItemBeautyItemDecoration());
        mo9228c().setOnClickListener(new C2606g(this));
        mo9230e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9230e() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo9227b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.bytedance.android.livesdkapi.depend.model.c r0 = r4.f8358b
            r1 = 0
            if (r0 == 0) goto L_0x000f
            com.bytedance.android.livesdkapi.depend.model.c$a r0 = r0.f25570i
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 != 0) goto L_0x001c
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo9227b()
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x001c:
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo9227b()
            r2 = 0
            r0.setVisibility(r2)
            com.bytedance.android.live.broadcast.c.c r0 = com.bytedance.android.live.broadcast.p132c.C2515f.m10417f()
            com.bytedance.android.live.broadcast.api.b.c r0 = r0.mo9074a()
            com.bytedance.android.livesdkapi.depend.model.c r3 = r4.f8358b
            if (r3 == 0) goto L_0x0037
            com.bytedance.android.livesdkapi.depend.model.c$a r3 = r3.f25570i
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.f25589b
            goto L_0x0038
        L_0x0037:
            r3 = r1
        L_0x0038:
            java.lang.Float r0 = r0.mo8899c(r3)
            if (r0 != 0) goto L_0x0064
            com.bytedance.android.livesdkapi.depend.model.c r0 = r4.f8358b
            if (r0 != 0) goto L_0x0045
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0045:
            com.bytedance.android.livesdkapi.depend.model.c r3 = r4.f8358b
            if (r3 == 0) goto L_0x0053
            com.bytedance.android.livesdkapi.depend.model.c$a r3 = r3.f25570i
            if (r3 == 0) goto L_0x0053
            int r1 = r3.f25588a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0053:
            if (r1 != 0) goto L_0x0058
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0058:
            int r1 = r1.intValue()
            float r0 = com.bytedance.android.live.broadcast.effect.C2636q.C2637a.m10781a(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0064:
            com.bytedance.android.livesdk.widget.AdjustPercentBar r1 = r4.mo9227b()
            com.bytedance.android.livesdkapi.depend.model.c r3 = r4.f8358b
            if (r3 != 0) goto L_0x006f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x006f:
            float r0 = r0.floatValue()
            int r0 = com.bytedance.android.live.broadcast.effect.C2636q.C2637a.m10782a(r3, r0)
            r1.setPercent(r0)
            com.bytedance.android.livesdkapi.depend.model.c r0 = r4.f8358b
            r1 = 1
            if (r0 == 0) goto L_0x0093
            com.bytedance.android.livesdkapi.depend.model.c$a r0 = r0.f25570i
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.f25592e
            if (r0 != r1) goto L_0x0093
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo9227b()
            r1 = 50
            r3 = -50
            r0.mo22390a(r1, r3, r2, r2)
            goto L_0x009c
        L_0x0093:
            com.bytedance.android.livesdk.widget.AdjustPercentBar r0 = r4.mo9227b()
            r3 = 100
            r0.mo22390a(r3, r2, r2, r1)
        L_0x009c:
            com.bytedance.android.live.broadcast.c.c r0 = com.bytedance.android.live.broadcast.p132c.C2515f.m10417f()
            com.bytedance.android.live.broadcast.api.b.c r0 = r0.mo9074a()
            java.lang.String r1 = com.bytedance.android.live.broadcast.api.C2418b.f7953d
            com.bytedance.android.livesdkapi.depend.model.c r2 = r4.f8358b
            r0.mo8892a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment.mo9230e():void");
    }

    /* renamed from: a */
    private static void m10674a(String str) {
        C9097a.m27146a().mo22267a((Object) new C7852a(str));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m10675h();
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo9214b().mo9312a((Fragment) this, (C2639c) this.f8363g);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.apv, viewGroup, false);
    }
}
