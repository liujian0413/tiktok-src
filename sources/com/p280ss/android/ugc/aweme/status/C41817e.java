package com.p280ss.android.ugc.aweme.status;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0370b;
import android.support.design.widget.TabLayout.C0376f;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.status.p1631a.C41806c;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42347l;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.e */
public final class C41817e extends C43869e implements OnClickListener {

    /* renamed from: k */
    public static final C41818a f108768k = new C41818a(null);

    /* renamed from: i */
    public DmtStatusView f108769i;

    /* renamed from: j */
    public RecordStatusViewModel f108770j;

    /* renamed from: l */
    private RelativeLayout f108771l;

    /* renamed from: m */
    private AutoRTLImageView f108772m;

    /* renamed from: n */
    private TabLayout f108773n;

    /* renamed from: o */
    private ViewPager f108774o;

    /* renamed from: p */
    private ViewStub f108775p;

    /* renamed from: q */
    private C41781a f108776q;

    /* renamed from: r */
    private ShortVideoContext f108777r;

    /* renamed from: s */
    private StatusViewPagerAdapter f108778s;

    /* renamed from: com.ss.android.ugc.aweme.status.e$a */
    public static final class C41818a {
        private C41818a() {
        }

        public /* synthetic */ C41818a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.e$b */
    static final class C41819b<T> implements C0053p<EffectChannelResponse> {

        /* renamed from: a */
        final /* synthetic */ C41817e f108779a;

        C41819b(C41817e eVar) {
            this.f108779a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(EffectChannelResponse effectChannelResponse) {
            C41817e.m133057a(this.f108779a).mo25938c(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.e$c */
    public static final class C41820c implements C0370b<C0376f> {

        /* renamed from: a */
        final /* synthetic */ C41817e f108780a;

        /* renamed from: b */
        public final void mo1670b(C0376f fVar) {
        }

        C41820c(C41817e eVar) {
            this.f108780a = eVar;
        }

        /* renamed from: a */
        public final void mo1669a(C0376f fVar) {
            if (fVar != null) {
                C41817e.m133058b(this.f108780a).mo102546q().setValue(String.valueOf(fVar.f1536c));
            }
        }
    }

    public final String bQ_() {
        return "status";
    }

    public final void bS_() {
    }

    public final void bR_() {
        if (this.f108771l == null) {
            m133060e();
            m133059d();
            RecordStatusViewModel recordStatusViewModel = this.f108770j;
            if (recordStatusViewModel == null) {
                C7573i.m23583a("statusViewModel");
            }
            recordStatusViewModel.mo102530a().setValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: n */
    public final void mo30957n() {
        super.mo30957n();
        Activity activity = this.f33526d_;
        if (activity != null) {
            C7573i.m23582a((Object) activity, "it");
            C41806c.m133031a(activity);
        }
    }

    /* renamed from: d */
    private final void m133059d() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            C7573i.m23582a((Object) shortVideoContext, "ViewModelProviders.of(ac…s.java).shortVideoContext");
            this.f108777r = shortVideoContext;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(RecordStatusViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…tusViewModel::class.java)");
                this.f108770j = (RecordStatusViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) activity3;
                    ShortVideoContext shortVideoContext2 = this.f108777r;
                    if (shortVideoContext2 == null) {
                        C7573i.m23583a("shortVideoContext");
                    }
                    this.f108776q = new C41781a(fragmentActivity, shortVideoContext2);
                    RecordStatusViewModel recordStatusViewModel = this.f108770j;
                    if (recordStatusViewModel == null) {
                        C7573i.m23583a("statusViewModel");
                    }
                    C0052o b = recordStatusViewModel.mo102531b();
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        b.observe((FragmentActivity) activity4, new C41819b(this));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: e */
    private final void m133060e() {
        ViewStub viewStub = this.f108775p;
        if (viewStub == null) {
            C7573i.m23583a("viewStub");
        }
        this.f108771l = (RelativeLayout) viewStub.inflate().findViewById(R.id.cyy);
        int c = C39805en.m127450c(this.f33526d_);
        RelativeLayout relativeLayout = this.f108771l;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, c, 0, 0);
        }
        RelativeLayout relativeLayout2 = this.f108771l;
        if (relativeLayout2 == null) {
            C7573i.m23580a();
        }
        View findViewById = relativeLayout2.findViewById(R.id.dak);
        C7573i.m23582a((Object) findViewById, "rootView!!.findViewById(R.id.status_back)");
        this.f108772m = (AutoRTLImageView) findViewById;
        AutoRTLImageView autoRTLImageView = this.f108772m;
        if (autoRTLImageView == null) {
            C7573i.m23583a("statusBackView");
        }
        autoRTLImageView.setOnClickListener(this);
        RelativeLayout relativeLayout3 = this.f108771l;
        if (relativeLayout3 == null) {
            C7573i.m23580a();
        }
        View findViewById2 = relativeLayout3.findViewById(R.id.cz0);
        C7573i.m23582a((Object) findViewById2, "rootView!!.findViewById(…d.scene_status_tablayout)");
        this.f108773n = (TabLayout) findViewById2;
        RelativeLayout relativeLayout4 = this.f108771l;
        if (relativeLayout4 == null) {
            C7573i.m23580a();
        }
        View findViewById3 = relativeLayout4.findViewById(R.id.cz2);
        C7573i.m23582a((Object) findViewById3, "rootView!!.findViewById(R.id.scene_viewpager)");
        this.f108774o = (ViewPager) findViewById3;
        Activity activity = this.f33526d_;
        if (activity != null) {
            this.f108778s = new StatusViewPagerAdapter((FragmentActivity) activity);
            ViewPager viewPager = this.f108774o;
            if (viewPager == null) {
                C7573i.m23583a("viewPager");
            }
            StatusViewPagerAdapter statusViewPagerAdapter = this.f108778s;
            if (statusViewPagerAdapter == null) {
                C7573i.m23583a("pagerAdapter");
            }
            viewPager.setAdapter(statusViewPagerAdapter);
            RelativeLayout relativeLayout5 = this.f108771l;
            if (relativeLayout5 == null) {
                C7573i.m23580a();
            }
            View findViewById4 = relativeLayout5.findViewById(R.id.dat);
            C7573i.m23582a((Object) findViewById4, "rootView!!.findViewById(R.id.status_loading)");
            this.f108769i = (DmtStatusView) findViewById4;
            DmtStatusView dmtStatusView = this.f108769i;
            if (dmtStatusView == null) {
                C7573i.m23583a("statusLoadView");
            }
            dmtStatusView.setBuilder(null);
            DmtStatusView dmtStatusView2 = this.f108769i;
            if (dmtStatusView2 == null) {
                C7573i.m23583a("statusLoadView");
            }
            dmtStatusView2.mo25942f();
            TabLayout tabLayout = this.f108773n;
            if (tabLayout == null) {
                C7573i.m23583a("statusTablayout");
            }
            ViewPager viewPager2 = this.f108774o;
            if (viewPager2 == null) {
                C7573i.m23583a("viewPager");
            }
            tabLayout.setupWithViewPager(viewPager2);
            TabLayout tabLayout2 = this.f108773n;
            if (tabLayout2 == null) {
                C7573i.m23583a("statusTablayout");
            }
            tabLayout2.addOnTabSelectedListener(new C41820c(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtStatusView m133057a(C41817e eVar) {
        DmtStatusView dmtStatusView = eVar.f108769i;
        if (dmtStatusView == null) {
            C7573i.m23583a("statusLoadView");
        }
        return dmtStatusView;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordStatusViewModel m133058b(C41817e eVar) {
        RecordStatusViewModel recordStatusViewModel = eVar.f108770j;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("statusViewModel");
        }
        return recordStatusViewModel;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AutoRTLImageView autoRTLImageView = this.f108772m;
        if (autoRTLImageView == null) {
            C7573i.m23583a("statusBackView");
        }
        if (C7573i.m23585a((Object) view, (Object) autoRTLImageView) && (this.f33526d_ instanceof VideoRecordNewActivity)) {
            Activity activity = this.f33526d_;
            if (activity != null) {
                C39382ed edVar = ((VideoRecordNewActivity) activity).f107267H;
                C7573i.m23582a((Object) edVar, "(activity as VideoRecordNewActivity).plan");
                C42156aw J = edVar.mo97896J();
                if (J == null) {
                    C7573i.m23580a();
                }
                J.mo103594a((Object) this, (C42155av) new C42347l("close_view"));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        }
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aj4, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.cym);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.scenc_record_status_stub)");
        this.f108775p = (ViewStub) findViewById;
        C7573i.m23582a((Object) inflate, "view");
        return inflate;
    }
}
