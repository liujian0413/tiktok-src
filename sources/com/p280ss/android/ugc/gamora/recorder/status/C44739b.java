package com.p280ss.android.ugc.gamora.recorder.status;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.base.C17462u;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41494t;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter.C44735b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.gamora.recorder.status.b */
public final class C44739b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f115134a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44739b.class), "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;"))};

    /* renamed from: b */
    public ViewGroup f115135b;

    /* renamed from: c */
    public ViewGroup f115136c;

    /* renamed from: d */
    public ViewGroup f115137d;

    /* renamed from: e */
    public OnClickListener f115138e;

    /* renamed from: f */
    public StatusBackgroundAdapter f115139f;

    /* renamed from: g */
    public StatusBackgroundAdapter f115140g;

    /* renamed from: h */
    public StatusBackgroundAdapter f115141h;

    /* renamed from: i */
    public final List<C44737a> f115142i = new ArrayList();

    /* renamed from: j */
    public final List<C44737a> f115143j = new ArrayList();

    /* renamed from: k */
    public final List<C44737a> f115144k = new ArrayList();

    /* renamed from: l */
    public C44735b f115145l;

    /* renamed from: m */
    public Pair<Integer, Integer> f115146m;

    /* renamed from: n */
    public Pair<Integer, Integer> f115147n;

    /* renamed from: o */
    public final FrameLayout f115148o;

    /* renamed from: p */
    private final C7541d f115149p = C7546e.m23569a(new C44740a(this));

    /* renamed from: q */
    private Pair<Integer, ? extends ViewGroup> f115150q = new Pair<>(Integer.valueOf(-1), null);

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$a */
    static final class C44740a extends Lambda implements C7561a<EffectPlatform> {

        /* renamed from: a */
        final /* synthetic */ C44739b f115151a;

        C44740a(C44739b bVar) {
            this.f115151a = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EffectPlatform invoke() {
            Context context = this.f115151a.f115148o.getContext();
            C35603z zVar = C35563c.f93245h;
            C7573i.m23582a((Object) zVar, "AVEnv.LOCATION_SERVICE");
            return new EffectPlatform(context, zVar.mo83209c(), C35563c.f93220B.getOKHttpClient());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$b */
    public static final class C44741b implements C44735b {

        /* renamed from: a */
        final /* synthetic */ C44739b f115152a;

        C44741b(C44739b bVar) {
            this.f115152a = bVar;
        }

        /* renamed from: a */
        public final void mo106785a(C44737a aVar, int i) {
            C7573i.m23587b(aVar, "model");
            C44735b bVar = this.f115152a.f115145l;
            if (bVar != null) {
                bVar.mo106785a(aVar, i);
            }
            this.f115152a.f115147n = new Pair<>(Integer.valueOf(0), Integer.valueOf(i));
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115152a.f115141h;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.mo107153b();
            }
            StatusBackgroundAdapter statusBackgroundAdapter2 = this.f115152a.f115140g;
            if (statusBackgroundAdapter2 != null) {
                statusBackgroundAdapter2.mo107153b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$c */
    static final class C44742c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44739b f115153a;

        C44742c(C44739b bVar) {
            this.f115153a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f115153a.f115135b;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.bjf);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            this.f115153a.mo107162e();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$d */
    public static final class C44743d implements C44735b {

        /* renamed from: a */
        final /* synthetic */ C44739b f115154a;

        C44743d(C44739b bVar) {
            this.f115154a = bVar;
        }

        /* renamed from: a */
        public final void mo106785a(C44737a aVar, int i) {
            C7573i.m23587b(aVar, "model");
            C44735b bVar = this.f115154a.f115145l;
            if (bVar != null) {
                bVar.mo106785a(aVar, i);
            }
            this.f115154a.f115147n = new Pair<>(Integer.valueOf(1), Integer.valueOf(i));
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115154a.f115139f;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.mo107153b();
            }
            StatusBackgroundAdapter statusBackgroundAdapter2 = this.f115154a.f115141h;
            if (statusBackgroundAdapter2 != null) {
                statusBackgroundAdapter2.mo107153b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$e */
    static final class C44744e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44739b f115155a;

        C44744e(C44739b bVar) {
            this.f115155a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f115155a.f115136c;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.bjf);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            this.f115155a.mo107163f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$f */
    public static final class C44745f implements C44735b {

        /* renamed from: a */
        final /* synthetic */ C44739b f115156a;

        C44745f(C44739b bVar) {
            this.f115156a = bVar;
        }

        /* renamed from: a */
        public final void mo106785a(C44737a aVar, int i) {
            C7573i.m23587b(aVar, "model");
            C44735b bVar = this.f115156a.f115145l;
            if (bVar != null) {
                bVar.mo106785a(aVar, i);
            }
            this.f115156a.f115147n = new Pair<>(Integer.valueOf(2), Integer.valueOf(i));
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115156a.f115139f;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.mo107153b();
            }
            StatusBackgroundAdapter statusBackgroundAdapter2 = this.f115156a.f115140g;
            if (statusBackgroundAdapter2 != null) {
                statusBackgroundAdapter2.mo107153b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$g */
    static final class C44746g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44739b f115157a;

        C44746g(C44739b bVar) {
            this.f115157a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f115157a.f115137d;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.bjf);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            this.f115157a.mo107164g();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$h */
    static final class C44747h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C44739b f115158a;

        C44747h(C44739b bVar) {
            this.f115158a = bVar;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m141241a());
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[LOOP:1: B:15:0x0051->B:16:0x0053, LOOP_END] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m141241a() {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a.f105087a
                java.util.List r0 = r0.mo100447g()
                r1 = 1
                if (r0 == 0) goto L_0x003e
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ r1
                if (r2 == 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r0 = 0
            L_0x0015:
                if (r0 == 0) goto L_0x003e
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r0 = r0.iterator()
            L_0x0024:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x003b
                java.lang.Object r3 = r0.next()
                r4 = r3
                java.lang.String r4 = (java.lang.String) r4
                boolean r4 = com.p280ss.android.ugc.gamora.recorder.status.C44753d.m141259a(r4)
                if (r4 == 0) goto L_0x0024
                r2.add(r3)
                goto L_0x0024
            L_0x003b:
                java.util.List r2 = (java.util.List) r2
                goto L_0x0046
            L_0x003e:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2 = r0
                java.util.List r2 = (java.util.List) r2
            L_0x0046:
                int r0 = r2.size()
                r3 = 200(0xc8, float:2.8E-43)
                int r0 = java.lang.Math.min(r3, r0)
                r3 = 0
            L_0x0051:
                if (r3 >= r0) goto L_0x0068
                com.ss.android.ugc.gamora.recorder.status.a r4 = new com.ss.android.ugc.gamora.recorder.status.a
                java.lang.Object r5 = r2.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                r4.<init>(r5)
                com.ss.android.ugc.gamora.recorder.status.b r5 = r6.f115158a
                java.util.List<com.ss.android.ugc.gamora.recorder.status.a> r5 = r5.f115142i
                r5.add(r4)
                int r3 = r3 + 1
                goto L_0x0051
            L_0x0068:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.status.C44739b.C44747h.m141241a():boolean");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$i */
    static final class C44748i<TTaskResult, TContinuationResult> implements C1591g<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44739b f115159a;

        C44748i(C44739b bVar) {
            this.f115159a = bVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m141242a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141242a(C1592h<Boolean> hVar) {
            C7573i.m23582a((Object) hVar, "lastTask");
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "lastTask.result");
            C44739b.m141223a(((Boolean) e).booleanValue(), this.f115159a.f115135b, this.f115159a.f115139f);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$j */
    public static final class C44749j implements C43756f {

        /* renamed from: a */
        final /* synthetic */ C44739b f115160a;

        C44749j(C44739b bVar) {
            this.f115160a = bVar;
        }

        /* renamed from: a */
        public final void mo70686a(C43726c cVar) {
            C44739b.m141223a(false, this.f115160a.f115136c, this.f115160a.f115140g);
        }

        /* renamed from: a */
        public final void mo70687a(CategoryPageModel categoryPageModel) {
            if (categoryPageModel != null) {
                CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
                if (categoryEffectModel != null) {
                    List<Effect> list = categoryEffectModel.effects;
                    if (list != null) {
                        for (Effect effect : list) {
                            List<C44737a> list2 = this.f115160a.f115143j;
                            C7573i.m23582a((Object) effect, "effect");
                            list2.add(new C44737a(effect));
                        }
                    }
                }
            }
            if (C35563c.f93231M.mo93305a(Property.EnableStatusBgRandomOrder)) {
                Collections.shuffle(this.f115160a.f115143j);
            }
            C44739b.m141223a(true, this.f115160a.f115136c, this.f115160a.f115140g);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.b$k */
    public static final class C44750k implements C43756f {

        /* renamed from: a */
        final /* synthetic */ C44739b f115161a;

        C44750k(C44739b bVar) {
            this.f115161a = bVar;
        }

        /* renamed from: a */
        public final void mo70686a(C43726c cVar) {
            C44739b.m141223a(false, this.f115161a.f115137d, this.f115161a.f115141h);
            if (cVar == null) {
                C44739b.m141222a(false, 1, (Exception) null);
            } else {
                C44739b.m141222a(false, cVar.f113220a, cVar.f113222c);
            }
        }

        /* renamed from: a */
        public final void mo70687a(CategoryPageModel categoryPageModel) {
            if (categoryPageModel != null) {
                CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
                if (categoryEffectModel != null) {
                    List<Effect> list = categoryEffectModel.effects;
                    if (list != null) {
                        for (Effect effect : list) {
                            List<C44737a> list2 = this.f115161a.f115144k;
                            C7573i.m23582a((Object) effect, "effect");
                            list2.add(new C44737a(effect));
                        }
                    }
                }
            }
            if (C35563c.f93231M.mo93305a(Property.EnableStatusBgRandomOrder)) {
                Collections.shuffle(this.f115161a.f115144k);
            }
            C44739b.m141223a(true, this.f115161a.f115137d, this.f115161a.f115141h);
            C44739b.m141222a(true, 0, (Exception) null);
        }
    }

    /* renamed from: h */
    private final EffectPlatform m141224h() {
        return (EffectPlatform) this.f115149p.getValue();
    }

    /* renamed from: b */
    public final void mo107159b() {
        this.f115146m = this.f115147n;
    }

    /* renamed from: a */
    public final void mo107156a() {
        Pair<Integer, Integer> pair = this.f115146m;
        if (pair != null) {
            m141221a(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        }
        this.f115147n = this.f115146m;
    }

    /* renamed from: e */
    public final void mo107162e() {
        ViewGroup viewGroup = this.f115135b;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.bu9);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        C1592h.m7853a((Callable<TResult>) new C44747h<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C44748i<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: f */
    public final void mo107163f() {
        ViewGroup viewGroup = this.f115136c;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.bu9);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        m141224h().mo70632a("status-background", "template", false, 0, 0, 0, null, new C44749j(this));
    }

    /* renamed from: g */
    public final void mo107164g() {
        ViewGroup viewGroup = this.f115137d;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.bu9);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        m141224h().mo70632a("status-background", "wallpaper", false, 0, 0, 0, null, new C44750k(this));
    }

    /* renamed from: c */
    public final void mo107160c() {
        Integer num;
        Pair<Integer, Integer> pair = this.f115147n;
        if (pair != null) {
            num = (Integer) pair.getFirst();
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115139f;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.mo107150a();
            }
        } else if (num != null && num.intValue() == 1) {
            StatusBackgroundAdapter statusBackgroundAdapter2 = this.f115140g;
            if (statusBackgroundAdapter2 != null) {
                statusBackgroundAdapter2.mo107150a();
            }
        } else if (num != null && num.intValue() == 2) {
            StatusBackgroundAdapter statusBackgroundAdapter3 = this.f115141h;
            if (statusBackgroundAdapter3 != null) {
                statusBackgroundAdapter3.mo107150a();
            }
        }
    }

    /* renamed from: d */
    public final void mo107161d() {
        Integer num;
        Pair<Integer, Integer> pair = this.f115147n;
        if (pair != null) {
            num = (Integer) pair.getFirst();
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115139f;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.mo107153b();
            }
        } else if (num != null && num.intValue() == 1) {
            StatusBackgroundAdapter statusBackgroundAdapter2 = this.f115140g;
            if (statusBackgroundAdapter2 != null) {
                statusBackgroundAdapter2.mo107153b();
            }
        } else if (num != null && num.intValue() == 2) {
            StatusBackgroundAdapter statusBackgroundAdapter3 = this.f115141h;
            if (statusBackgroundAdapter3 != null) {
                statusBackgroundAdapter3.mo107153b();
            }
        }
    }

    /* renamed from: i */
    private final void m141225i() {
        if (this.f115137d == null) {
            this.f115137d = (ViewGroup) LayoutInflater.from(this.f115148o.getContext()).inflate(R.layout.ajt, this.f115148o, false);
            this.f115148o.addView(this.f115137d);
            RecyclerView recyclerView = null;
            this.f115141h = new StatusBackgroundAdapter(this.f115144k, false, 2, null);
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115141h;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.f115116a = new C44745f(this);
            }
            ViewGroup viewGroup = this.f115137d;
            if (viewGroup != null) {
                recyclerView = (RecyclerView) viewGroup.findViewById(R.id.cqd);
            }
            if (recyclerView == null) {
                C7573i.m23580a();
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f115148o.getContext(), 0, false));
            recyclerView.setAdapter(this.f115141h);
            ViewGroup viewGroup2 = this.f115137d;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(R.id.e0q);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C44746g(this));
                }
            }
            mo107164g();
        }
    }

    /* renamed from: j */
    private final void m141226j() {
        if (this.f115136c == null) {
            this.f115136c = (ViewGroup) LayoutInflater.from(this.f115148o.getContext()).inflate(R.layout.ajt, this.f115148o, false);
            this.f115148o.addView(this.f115136c);
            RecyclerView recyclerView = null;
            this.f115140g = new StatusBackgroundAdapter(this.f115143j, false, 2, null);
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115140g;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.f115116a = new C44743d(this);
            }
            ViewGroup viewGroup = this.f115136c;
            if (viewGroup != null) {
                recyclerView = (RecyclerView) viewGroup.findViewById(R.id.cqd);
            }
            if (recyclerView == null) {
                C7573i.m23580a();
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f115148o.getContext(), 0, false));
            recyclerView.setAdapter(this.f115140g);
            ViewGroup viewGroup2 = this.f115136c;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(R.id.e0q);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C44744e(this));
                }
            }
            mo107163f();
        }
    }

    /* renamed from: k */
    private final void m141227k() {
        RecyclerView recyclerView;
        if (this.f115135b == null) {
            this.f115135b = (ViewGroup) LayoutInflater.from(this.f115148o.getContext()).inflate(R.layout.ajt, this.f115148o, false);
            this.f115148o.addView(this.f115135b);
            this.f115139f = new StatusBackgroundAdapter(this.f115142i, true);
            StatusBackgroundAdapter statusBackgroundAdapter = this.f115139f;
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.f115117b = this.f115138e;
            }
            StatusBackgroundAdapter statusBackgroundAdapter2 = this.f115139f;
            if (statusBackgroundAdapter2 != null) {
                statusBackgroundAdapter2.f115116a = new C44741b(this);
            }
            ViewGroup viewGroup = this.f115135b;
            if (viewGroup != null) {
                recyclerView = (RecyclerView) viewGroup.findViewById(R.id.cqd);
            } else {
                recyclerView = null;
            }
            if (recyclerView == null) {
                C7573i.m23580a();
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f115148o.getContext(), 0, false));
            recyclerView.setAdapter(this.f115139f);
            ViewGroup viewGroup2 = this.f115135b;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(R.id.e0q);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C44742c(this));
                }
            }
            mo107162e();
        }
    }

    /* renamed from: a */
    public final void mo107158a(String str) {
        StatusBackgroundAdapter statusBackgroundAdapter = this.f115139f;
        if (statusBackgroundAdapter != null) {
            statusBackgroundAdapter.mo107152a(str);
        }
    }

    public C44739b(FrameLayout frameLayout) {
        C7573i.m23587b(frameLayout, "parentView");
        this.f115148o = frameLayout;
    }

    /* renamed from: a */
    public final void mo107157a(int i) {
        if (((Number) this.f115150q.getFirst()).intValue() != i) {
            ViewGroup viewGroup = (ViewGroup) this.f115150q.getSecond();
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            switch (i) {
                case 0:
                    m141227k();
                    this.f115150q = new Pair<>(Integer.valueOf(0), this.f115135b);
                    break;
                case 1:
                    m141226j();
                    this.f115150q = new Pair<>(Integer.valueOf(1), this.f115136c);
                    break;
                case 2:
                    m141225i();
                    this.f115150q = new Pair<>(Integer.valueOf(2), this.f115137d);
                    break;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f115150q.getSecond();
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    private final void m141221a(int i, int i2) {
        switch (i) {
            case 0:
                StatusBackgroundAdapter statusBackgroundAdapter = this.f115139f;
                if (statusBackgroundAdapter != null) {
                    statusBackgroundAdapter.mo107151a(i2);
                    break;
                } else {
                    return;
                }
            case 1:
                StatusBackgroundAdapter statusBackgroundAdapter2 = this.f115140g;
                if (statusBackgroundAdapter2 != null) {
                    statusBackgroundAdapter2.mo107151a(i2);
                    break;
                } else {
                    return;
                }
            case 2:
                StatusBackgroundAdapter statusBackgroundAdapter3 = this.f115141h;
                if (statusBackgroundAdapter3 != null) {
                    statusBackgroundAdapter3.mo107151a(i2);
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public static void m141222a(boolean z, int i, Exception exc) {
        JSONObject jSONObject = null;
        if (z) {
            C6893q.m21444a("status_resource_list_download_error_state", 0, (JSONObject) null);
            return;
        }
        if (exc != null) {
            jSONObject = C38510bb.m123095a().mo96481a("exception", C17462u.m58024b(exc)).mo96481a("event", C41494t.m132184a().mo102150b().toString()).mo96482b();
        }
        C6893q.m21444a("status_resource_list_download_error_state", i, jSONObject);
    }

    /* renamed from: a */
    public static void m141223a(boolean z, ViewGroup viewGroup, StatusBackgroundAdapter statusBackgroundAdapter) {
        if (z) {
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.bnb);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
            }
            if (viewGroup != null) {
                View findViewById2 = viewGroup.findViewById(R.id.bu9);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
            }
            if (statusBackgroundAdapter != null) {
                statusBackgroundAdapter.notifyDataSetChanged();
            }
        } else {
            if (viewGroup != null) {
                View findViewById3 = viewGroup.findViewById(R.id.bu9);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
            }
            if (viewGroup != null) {
                View findViewById4 = viewGroup.findViewById(R.id.bjf);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(0);
                }
            }
        }
    }
}
