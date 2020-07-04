package com.p280ss.android.ugc.aweme.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.text.TextUtils;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29207e;
import com.p280ss.android.ugc.aweme.filter.CircleViewPager.C29141a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39372f;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39372f.C39373a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.filter.c */
public final class C29269c implements C39372f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f77226a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C29269c.class), "filterAdapter", "getFilterAdapter()Lcom/ss/android/ugc/aweme/filter/EmptyFilterAdapter;"))};

    /* renamed from: h */
    public static final C29270a f77227h = new C29270a(null);

    /* renamed from: b */
    public boolean f77228b = true;

    /* renamed from: c */
    public SimpleOnPageChangeListener f77229c;

    /* renamed from: d */
    public C29296g f77230d;

    /* renamed from: e */
    public C39373a f77231e;

    /* renamed from: f */
    public final Activity f77232f;

    /* renamed from: g */
    public final C29207e f77233g;

    /* renamed from: i */
    private ValueAnimator f77234i;

    /* renamed from: j */
    private final C7541d f77235j = C7546e.m23569a(new C29271b(this));

    /* renamed from: k */
    private final C0043i f77236k;

    /* renamed from: l */
    private final C23321d<JSONObject> f77237l;

    /* renamed from: com.ss.android.ugc.aweme.filter.c$a */
    public static final class C29270a {
        private C29270a() {
        }

        public /* synthetic */ C29270a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c$b */
    static final class C29271b extends Lambda implements C7561a<EmptyFilterAdapter> {

        /* renamed from: a */
        final /* synthetic */ C29269c f77238a;

        C29271b(C29269c cVar) {
            this.f77238a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EmptyFilterAdapter invoke() {
            return new EmptyFilterAdapter(this.f77238a.f77232f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c$c */
    public static final class C29272c implements C29141a {

        /* renamed from: a */
        final /* synthetic */ C29269c f77239a;

        /* renamed from: a */
        public final void mo74651a() {
            if (!this.f77239a.f77228b) {
                C10761a.m31410e((Context) this.f77239a.f77232f, this.f77239a.f77232f.getString(R.string.byg)).mo25750a();
                this.f77239a.f77228b = true;
            }
        }

        C29272c(C29269c cVar) {
            this.f77239a = cVar;
        }

        /* renamed from: a */
        public final void mo74652a(float f) {
            C39373a aVar = this.f77239a.f77231e;
            if (aVar != null) {
                List<C29296g> list = this.f77239a.mo74922a().f76929d;
                C7573i.m23582a((Object) list, "filterAdapter.liveFilterBeanList");
                aVar.mo74917a(list, this.f77239a.mo74922a().f76930e, f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c$d */
    static final class C29273d<T> implements C0053p<List<? extends C29296g>> {

        /* renamed from: a */
        final /* synthetic */ C29269c f77240a;

        C29273d(C29269c cVar) {
            this.f77240a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<? extends C29296g> list) {
            if (list != null) {
                this.f77240a.mo74930a(list, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c$e */
    static final class C29274e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C29269c f77241a;

        /* renamed from: b */
        final /* synthetic */ int f77242b;

        /* renamed from: c */
        final /* synthetic */ float f77243c;

        /* renamed from: d */
        final /* synthetic */ float f77244d;

        /* renamed from: e */
        final /* synthetic */ C29296g f77245e;

        C29274e(C29269c cVar, int i, float f, float f2, C29296g gVar) {
            this.f77241a = cVar;
            this.f77242b = i;
            this.f77243c = f;
            this.f77244d = f2;
            this.f77245e = gVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleViewPager a = this.f77241a.f77233g.mo74809a();
            if (a != null && a.getAdapter() != null) {
                C7573i.m23582a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    a.mo74645a(((Float) animatedValue).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c$f */
    public static final class C29275f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39373a f77246a;

        /* renamed from: b */
        final /* synthetic */ C29269c f77247b;

        /* renamed from: c */
        final /* synthetic */ int f77248c;

        /* renamed from: d */
        final /* synthetic */ float f77249d;

        /* renamed from: e */
        final /* synthetic */ float f77250e;

        /* renamed from: f */
        final /* synthetic */ C29296g f77251f;

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
            C39373a aVar = this.f77247b.f77231e;
            if (aVar != null) {
                aVar.mo74918b();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            if (this.f77247b.f77230d != null) {
                CircleViewPager a = this.f77247b.f77233g.mo74809a();
                if (a != null) {
                    C29296g gVar = this.f77247b.f77230d;
                    if (gVar == null || gVar.f77270e != a.getCurrentItem()) {
                        C29296g gVar2 = this.f77247b.f77230d;
                        if (gVar2 == null) {
                            C7573i.m23580a();
                        }
                        a.setCurrentItem(gVar2.f77270e, true);
                    } else {
                        SimpleOnPageChangeListener simpleOnPageChangeListener = this.f77247b.f77229c;
                        if (simpleOnPageChangeListener != null) {
                            C29296g gVar3 = this.f77247b.f77230d;
                            if (gVar3 == null) {
                                C7573i.m23580a();
                            }
                            simpleOnPageChangeListener.onPageSelected(gVar3.f77270e);
                        }
                    }
                }
            }
            this.f77246a.mo74915a(this.f77247b.f77230d);
        }

        C29275f(C39373a aVar, C29269c cVar, int i, float f, float f2, C29296g gVar) {
            this.f77246a = aVar;
            this.f77247b = cVar;
            this.f77248c = i;
            this.f77249d = f;
            this.f77250e = f2;
            this.f77251f = gVar;
        }
    }

    /* renamed from: a */
    public final EmptyFilterAdapter mo74922a() {
        return (EmptyFilterAdapter) this.f77235j.getValue();
    }

    /* renamed from: a */
    public final void mo74929a(List<? extends C29296g> list, int i) {
        C7573i.m23587b(list, "newFilterRes");
        CircleViewPager a = this.f77233g.mo74809a();
        if (a != null && a.getAdapter() != null && !list.isEmpty()) {
            PagerAdapter adapter = a.getAdapter();
            if (adapter != null) {
                EmptyFilterAdapter emptyFilterAdapter = (EmptyFilterAdapter) adapter;
                emptyFilterAdapter.mo74667a(true);
                emptyFilterAdapter.mo74665a(list);
                StringBuilder sb = new StringBuilder("RecordFilterModuleImpl setLiveFilter currentPos: ");
                sb.append(i);
                C41530am.m132280a(sb.toString());
                if (i == -1) {
                    i = 0;
                }
                a.setCurrentItem(i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.EmptyFilterAdapter");
        }
    }

    /* renamed from: b */
    public final boolean mo74933b() {
        return mo74922a().f76930e;
    }

    /* renamed from: c */
    public final void mo74934c() {
        ValueAnimator valueAnimator = this.f77234i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f77234i = null;
    }

    /* renamed from: a */
    public final void mo74927a(C39373a aVar) {
        this.f77231e = aVar;
    }

    /* renamed from: a */
    public final void mo74923a(float f) {
        CircleViewPager a = this.f77233g.mo74809a();
        if (a != null && a.getAdapter() != null) {
            a.mo74645a(f);
        }
    }

    /* renamed from: a */
    public final void mo74924a(int i) {
        CircleViewPager a = this.f77233g.mo74809a();
        if (a != null) {
            a.setStartItem(i);
        }
    }

    /* renamed from: b */
    public final C29296g mo74931b(C29296g gVar) {
        C7573i.m23587b(gVar, "curFilter");
        if (mo74922a().f76930e) {
            List<C29296g> list = mo74922a().f76929d;
            C7573i.m23582a((Object) list, "filterAdapter.getLiveFilterBeanList()");
            return m96011a(list, gVar);
        }
        List a = mo74922a().mo74664a();
        C7573i.m23582a((Object) a, "filterAdapter.getFilterBeanList()");
        return m96013b(a, gVar);
    }

    /* renamed from: a */
    private final void m96012a(C0043i iVar) {
        this.f77229c = new DefaultFilterSwitcher$init$1(this);
        CircleViewPager a = this.f77233g.mo74809a();
        if (a != null) {
            a.setAdapter(mo74922a());
            mo74922a().mo74666a(mo74922a().mo74664a(), true);
            SimpleOnPageChangeListener simpleOnPageChangeListener = this.f77229c;
            if (simpleOnPageChangeListener == null) {
                C7573i.m23580a();
            }
            a.removeOnPageChangeListener(simpleOnPageChangeListener);
            SimpleOnPageChangeListener simpleOnPageChangeListener2 = this.f77229c;
            if (simpleOnPageChangeListener2 == null) {
                C7573i.m23580a();
            }
            a.addOnPageChangeListener(simpleOnPageChangeListener2);
            a.setOnScrolledListener(new C29272c(this));
        }
        List d = C35574k.m114859a().mo70097l().mo74951d().mo74830d();
        if (d != null && !C6311g.m19573a(d)) {
            mo74930a(d, false);
        }
        C35574k.m114859a().mo70097l().mo74951d().mo74818a().observe(iVar, new C29273d(this));
    }

    /* renamed from: b */
    public final void mo74932b(int i) {
        PagerAdapter pagerAdapter;
        CircleViewPager a = this.f77233g.mo74809a();
        if (a != null) {
            pagerAdapter = a.getAdapter();
        } else {
            pagerAdapter = null;
        }
        if (pagerAdapter != null) {
            PagerAdapter adapter = a.getAdapter();
            if (adapter != null) {
                ((EmptyFilterAdapter) adapter).mo74667a(false);
                a.setCurrentItem(i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.EmptyFilterAdapter");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74925a(com.p280ss.android.ugc.aweme.filter.C29296g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "curFilter"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            com.ss.android.ugc.aweme.filter.EmptyFilterAdapter r0 = r2.mo74922a()
            boolean r0 = r0.f76930e
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.filter.ag$e r0 = r2.f77233g
            com.ss.android.ugc.aweme.filter.CircleViewPager r0 = r0.mo74809a()
            r1 = 0
            if (r0 == 0) goto L_0x001c
            int r3 = r3.f77270e
            r0.setCurrentItem(r3, r1)
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.e.f$a r3 = r2.f77231e
            if (r3 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.filter.g r3 = r3.mo74914a()
            if (r3 == 0) goto L_0x0029
            int r3 = r3.f77270e
            goto L_0x002a
        L_0x0029:
            r3 = -1
        L_0x002a:
            com.ss.android.ugc.aweme.filter.EmptyFilterAdapter r0 = r2.mo74922a()
            int r0 = r0.getCount()
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x0038
            r2.f77228b = r1
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.filter.C29269c.mo74925a(com.ss.android.ugc.aweme.filter.g):void");
    }

    /* renamed from: a */
    public final void mo74928a(List<? extends C29296g> list) {
        C7573i.m23587b(list, "newFilterRes");
        CircleViewPager a = this.f77233g.mo74809a();
        if (a != null && a.getAdapter() != null && !list.isEmpty()) {
            PagerAdapter adapter = a.getAdapter();
            if (adapter != null) {
                EmptyFilterAdapter emptyFilterAdapter = (EmptyFilterAdapter) adapter;
                emptyFilterAdapter.mo74667a(true);
                emptyFilterAdapter.mo74665a(list);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.EmptyFilterAdapter");
        }
    }

    /* renamed from: a */
    public final void mo74930a(List<? extends C29296g> list, boolean z) {
        mo74922a().mo74666a(list, z);
    }

    /* renamed from: a */
    private static C29296g m96011a(List<? extends C29296g> list, C29296g gVar) {
        if (C6311g.m19573a(list) || gVar == null) {
            return null;
        }
        for (C29296g gVar2 : list) {
            if (gVar2 != null && TextUtils.equals(gVar2.f77267b, gVar.f77267b)) {
                return gVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static C29296g m96013b(List<? extends C29296g> list, C29296g gVar) {
        if (C6311g.m19573a(list) || gVar == null) {
            return null;
        }
        for (C29296g gVar2 : list) {
            if (gVar2 != null && gVar2.f77266a == gVar.f77266a) {
                return gVar2;
            }
        }
        return null;
    }

    public C29269c(Activity activity, C0043i iVar, C23321d<JSONObject> dVar, C29207e eVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(dVar, "shootWaySupplier");
        C7573i.m23587b(eVar, "viewPagerSupplier");
        this.f77232f = activity;
        this.f77236k = iVar;
        this.f77237l = dVar;
        this.f77233g = eVar;
        m96012a(this.f77236k);
    }

    /* renamed from: a */
    public final void mo74926a(C29296g gVar, float f, float f2, int i) {
        long j;
        int i2;
        int i3;
        int i4 = i;
        C42962b.f111525a.mo104670a(this.f77232f, "filter_slide", "shoot_page", 0, 0, (JSONObject) this.f77237l.mo60607a());
        C39373a aVar = this.f77231e;
        if (aVar != null) {
            if (Math.signum(f2) == Math.signum(f)) {
                this.f77230d = gVar;
                this.f77234i = ValueAnimator.ofFloat(new float[]{f2, 0.0f});
                j = (long) (((float) ((long) (((float) i4) * Math.abs(f2)))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            } else {
                C29296g gVar2 = gVar;
                List a = mo74922a().mo74664a();
                if (a.isEmpty()) {
                    this.f77230d = C35574k.m114859a().mo70097l().mo74949b().mo74967c();
                    this.f77234i = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else if (f >= 1.0E-5f) {
                    C29296g a2 = aVar.mo74914a();
                    if (a2 != null) {
                        i3 = a2.f77270e;
                    } else {
                        i3 = 0;
                    }
                    this.f77230d = (C29296g) a.get(C0534a.m2233a(i3 - 1, 0, a.size() - 1));
                    this.f77234i = ValueAnimator.ofFloat(new float[]{f2, -1.0f});
                } else {
                    int size = mo74922a().mo74664a().size() - 1;
                    C29296g a3 = aVar.mo74914a();
                    if (a3 != null) {
                        i2 = a3.f77270e;
                    } else {
                        i2 = 0;
                    }
                    this.f77230d = (C29296g) a.get(Math.min(size, i2 + 1));
                    this.f77234i = ValueAnimator.ofFloat(new float[]{f2, 1.0f});
                }
                j = (long) (((float) ((long) (((float) i4) * (1.0f - Math.abs(f2))))) / ((Math.abs(f) / 1000.0f) / 2.0f));
            }
            long min = Math.min(j, 400);
            ValueAnimator valueAnimator = this.f77234i;
            if (valueAnimator == null) {
                C7573i.m23580a();
            }
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            ValueAnimator valueAnimator2 = this.f77234i;
            if (valueAnimator2 == null) {
                C7573i.m23580a();
            }
            valueAnimator2.setDuration(min);
            ValueAnimator valueAnimator3 = this.f77234i;
            if (valueAnimator3 == null) {
                C7573i.m23580a();
            }
            C29274e eVar = new C29274e(this, i, f2, f, gVar);
            valueAnimator3.addUpdateListener(eVar);
            ValueAnimator valueAnimator4 = this.f77234i;
            if (valueAnimator4 == null) {
                C7573i.m23580a();
            }
            C29275f fVar = new C29275f(aVar, this, i, f2, f, gVar);
            valueAnimator4.addListener(fVar);
            ValueAnimator valueAnimator5 = this.f77234i;
            if (valueAnimator5 == null) {
                C7573i.m23580a();
            }
            valueAnimator5.start();
        }
    }
}
