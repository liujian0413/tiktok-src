package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity.C24832a;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b.C24878a;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b.C24880b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24891f;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.Loft;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftGuide;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24858b;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24859c;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24860d;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewType;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment */
public final class DouyinSingleIntermediateFragment extends SingleIntermediateFragment implements C24880b, C26596c {

    /* renamed from: e */
    public LoftNestedRefreshLayout f70955e;

    /* renamed from: f */
    public IntermediateStateViewController f70956f;

    /* renamed from: g */
    public boolean f70957g;

    /* renamed from: h */
    public boolean f70958h;

    /* renamed from: i */
    public boolean f70959i;

    /* renamed from: j */
    public final Handler f70960j = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    private int f70961t;

    /* renamed from: u */
    private long f70962u = SystemClock.elapsedRealtime();

    /* renamed from: v */
    private Bitmap f70963v;

    /* renamed from: w */
    private HashMap f70964w;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment$a */
    public static final class C26889a implements C24860d {

        /* renamed from: a */
        final /* synthetic */ DouyinSingleIntermediateFragment f70965a;

        /* renamed from: e */
        public final void mo64996e() {
            IntermediateStateViewController intermediateStateViewController = this.f70965a.f70956f;
            if (intermediateStateViewController != null) {
                intermediateStateViewController.mo64996e();
            }
        }

        /* renamed from: f */
        public final void mo64997f() {
            if (this.f70965a.isViewValid()) {
                this.f70965a.mo69579j();
                IntermediateStateViewController intermediateStateViewController = this.f70965a.f70956f;
                if (intermediateStateViewController != null) {
                    intermediateStateViewController.mo64997f();
                }
                LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70965a.f70955e;
                if (loftNestedRefreshLayout != null) {
                    loftNestedRefreshLayout.setRefreshing(false);
                }
            }
        }

        C26889a(DouyinSingleIntermediateFragment douyinSingleIntermediateFragment) {
            this.f70965a = douyinSingleIntermediateFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment$b */
    public static final class C26890b implements C24858b {

        /* renamed from: a */
        final /* synthetic */ DouyinSingleIntermediateFragment f70966a;

        /* renamed from: d */
        public final void mo64994d() {
            this.f70966a.mo69578i();
        }

        /* renamed from: c */
        public final void mo64993c() {
            IntermediateStateViewController intermediateStateViewController = this.f70966a.f70956f;
            if (intermediateStateViewController != null) {
                intermediateStateViewController.mo64993c();
            }
        }

        /* renamed from: a */
        public final void mo64991a() {
            C23060u.m75742a().mo60073c().mo59871a(Boolean.valueOf(false));
            Context context = this.f70966a.getContext();
            if (context != null) {
                DouyinSingleIntermediateFragment douyinSingleIntermediateFragment = this.f70966a;
                C24878a aVar = C24877b.f65602l;
                C7573i.m23582a((Object) context, "it");
                douyinSingleIntermediateFragment.mo69576b(((C24877b) aVar.mo65136a(context)).f65604b);
            }
            IntermediateStateViewController intermediateStateViewController = this.f70966a.f70956f;
            if (intermediateStateViewController != null) {
                intermediateStateViewController.mo64991a();
            }
        }

        /* renamed from: b */
        public final void mo64992b() {
            Integer num;
            IntermediateStateViewController intermediateStateViewController = this.f70966a.f70956f;
            if (intermediateStateViewController != null) {
                intermediateStateViewController.mo64992b();
            }
            Context context = this.f70966a.getContext();
            if (context != null) {
                C24878a aVar = C24877b.f65602l;
                C7573i.m23582a((Object) context, "it");
                Loft loft = ((C24877b) aVar.mo65136a(context)).f65604b;
                String str = "enter_second_floor";
                C22984d a = C22984d.m75611a().mo59973a("enter_method", "slide_down").mo59973a("is_success", "success");
                String str2 = "enter_status";
                if (loft != null) {
                    num = Integer.valueOf(loft.getStatus());
                } else {
                    num = null;
                }
                C6907h.m21524a(str, (Map) a.mo59973a(str2, String.valueOf(num)).f60753a);
            }
        }

        C26890b(DouyinSingleIntermediateFragment douyinSingleIntermediateFragment) {
            this.f70966a = douyinSingleIntermediateFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment$c */
    public static final class C26891c implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ DouyinSingleIntermediateFragment f70967a;

        C26891c(DouyinSingleIntermediateFragment douyinSingleIntermediateFragment) {
            this.f70967a = douyinSingleIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                float floatValue = f.floatValue();
                IntermediateStateViewController intermediateStateViewController = this.f70967a.f70956f;
                if (intermediateStateViewController != null) {
                    intermediateStateViewController.mo65138a(floatValue);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment$d */
    static final class C26892d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DouyinSingleIntermediateFragment f70968a;

        C26892d(DouyinSingleIntermediateFragment douyinSingleIntermediateFragment) {
            this.f70968a = douyinSingleIntermediateFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f70968a.f70957g) {
                this.f70968a.mo69580k();
                this.f70968a.f70957g = false;
                this.f70968a.f70959i = false;
            }
            this.f70968a.mo69577g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment$e */
    public static final class C26893e implements C24859c {

        /* renamed from: a */
        final /* synthetic */ DouyinSingleIntermediateFragment f70969a;

        /* renamed from: b */
        final /* synthetic */ Loft f70970b;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment$e$a */
        static final class C26894a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C26893e f70971a;

            C26894a(C26893e eVar) {
                this.f70971a = eVar;
            }

            public final void run() {
                this.f70971a.f70969a.mo69575a(this.f70971a.f70970b, true);
            }
        }

        /* renamed from: a */
        public final void mo64995a() {
            if (this.f70969a.isResumed()) {
                IntermediateStateViewController intermediateStateViewController = this.f70969a.f70956f;
                if (intermediateStateViewController != null) {
                    intermediateStateViewController.mo65139a(this.f70970b);
                }
                this.f70969a.f70957g = true;
                this.f70969a.f70960j.postDelayed(new C26894a(this), TimeUnit.SECONDS.toMillis(1));
                return;
            }
            this.f70969a.f70958h = true;
        }

        C26893e(DouyinSingleIntermediateFragment douyinSingleIntermediateFragment, Loft loft) {
            this.f70969a = douyinSingleIntermediateFragment;
            this.f70970b = loft;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DouyinSingleIntermediateFragment$f */
    static final class C26895f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DouyinSingleIntermediateFragment f70972a;

        /* renamed from: b */
        final /* synthetic */ Loft f70973b;

        C26895f(DouyinSingleIntermediateFragment douyinSingleIntermediateFragment, Loft loft) {
            this.f70972a = douyinSingleIntermediateFragment;
            this.f70973b = loft;
        }

        public final void run() {
            float f;
            C24891f fVar = null;
            if (!(this.f70972a.getContext() == null || this.f70973b == null)) {
                C24878a aVar = C24877b.f65602l;
                Context context = this.f70972a.getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                if (((C24877b) aVar.mo65136a(context)).mo65123b() && this.f70973b.getGuide() != null) {
                    C24878a aVar2 = C24877b.f65602l;
                    FragmentActivity activity = this.f70972a.getActivity();
                    if (activity == null) {
                        C7573i.m23580a();
                    }
                    C7573i.m23582a((Object) activity, "activity!!");
                    C24877b bVar = (C24877b) aVar2.mo65136a(activity);
                    LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70972a.f70955e;
                    if (loftNestedRefreshLayout != null) {
                        C0052o totalConsume = loftNestedRefreshLayout.getTotalConsume();
                        if (totalConsume != null) {
                            LoftGuide guide = this.f70973b.getGuide();
                            if (guide == null) {
                                C7573i.m23580a();
                            }
                            UrlModel imageUrl = guide.getImageUrl();
                            LoftGuide guide2 = this.f70973b.getGuide();
                            if (guide2 == null) {
                                C7573i.m23580a();
                            }
                            String desc = guide2.getDesc();
                            LiveData liveData = totalConsume;
                            LoftNestedRefreshLayout loftNestedRefreshLayout2 = this.f70972a.f70955e;
                            if (loftNestedRefreshLayout2 != null) {
                                f = (float) loftNestedRefreshLayout2.getHeight();
                            } else {
                                f = 0.0f;
                            }
                            fVar = new C24891f(imageUrl, desc, liveData, f);
                        }
                    }
                    bVar.f65605c = fVar;
                    this.f70972a.mo69777u();
                    return;
                }
            }
            FragmentActivity activity2 = this.f70972a.getActivity();
            if (activity2 != null) {
                C24878a aVar3 = C24877b.f65602l;
                C7573i.m23582a((Object) activity2, "it");
                ((C24877b) aVar3.mo65136a(activity2)).f65605c = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo68280a(boolean z) {
    }

    public final void aJ_() {
    }

    /* renamed from: f */
    public final void mo69551f() {
        if (this.f70964w != null) {
            this.f70964w.clear();
        }
    }

    /* renamed from: j */
    public final void mo69579j() {
        m88297w();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }

    /* renamed from: e */
    public final void mo69550e() {
        super.mo69550e();
        m88296v();
        mo69579j();
    }

    /* renamed from: g */
    public final void mo69577g() {
        if (this.f70959i) {
            mo69580k();
            this.f70959i = false;
        }
    }

    /* renamed from: k */
    public final void mo69580k() {
        this.f70960j.removeCallbacksAndMessages(null);
        LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70955e;
        if (loftNestedRefreshLayout != null) {
            loftNestedRefreshLayout.setExpand(false);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        Context context = getContext();
        if (context != null) {
            C24878a aVar = C24877b.f65602l;
            C7573i.m23582a((Object) context, "it");
            ((C24877b) aVar.mo65136a(context)).mo65115a();
        }
        this.f70960j.removeCallbacksAndMessages(null);
    }

    /* renamed from: v */
    private final void m88296v() {
        if (this.f70955e != null) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70955e;
            if (loftNestedRefreshLayout != null) {
                loftNestedRefreshLayout.setIRefresh(new C26889a(this));
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout2 = this.f70955e;
            if (loftNestedRefreshLayout2 != null) {
                loftNestedRefreshLayout2.mo64894a((C24858b) new C26890b(this));
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout3 = this.f70955e;
            if (loftNestedRefreshLayout3 != null) {
                C0052o totalConsume = loftNestedRefreshLayout3.getTotalConsume();
                if (totalConsume != null) {
                    totalConsume.observe(this, new C26891c(this));
                }
            }
            mo69578i();
        }
    }

    /* renamed from: w */
    private final void m88297w() {
        if (!C6399b.m19944t()) {
            this.f70962u = SystemClock.elapsedRealtime();
            Context context = getContext();
            if (context != null) {
                C24878a aVar = C24877b.f65602l;
                C7573i.m23582a((Object) context, "it");
                ((C24877b) aVar.mo65136a(context)).mo65117a((C24880b) this, (String) null);
            }
        }
    }

    /* renamed from: i */
    public final void mo69578i() {
        Context context = getContext();
        if (context != null) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70955e;
            if (loftNestedRefreshLayout != null) {
                C24878a aVar = C24877b.f65602l;
                C7573i.m23582a((Object) context, "it");
                loftNestedRefreshLayout.setEnabled(((C24877b) aVar.mo65136a(context)).mo65123b());
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout2 = this.f70955e;
            if (loftNestedRefreshLayout2 != null) {
                C24878a aVar2 = C24877b.f65602l;
                C7573i.m23582a((Object) context, "it");
                loftNestedRefreshLayout2.setEnableExpand(((C24877b) aVar2.mo65136a(context)).mo65126c());
            }
            C24878a aVar3 = C24877b.f65602l;
            C7573i.m23582a((Object) context, "it");
            mo69576b(((C24877b) aVar3.mo65136a(context)).f65604b);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f70955e != null) {
            if (getContext() != null) {
                C24878a aVar = C24877b.f65602l;
                Context context = getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                if (((C24877b) aVar.mo65136a(context)).mo65123b()) {
                    Integer num = (Integer) mo69723p().getIntermediateState().getValue();
                    if (num != null && num.intValue() == 1) {
                        mo69578i();
                    }
                }
            }
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70955e;
            if (loftNestedRefreshLayout != null) {
                loftNestedRefreshLayout.setEnabled(false);
            }
        }
        mo69577g();
        IntermediateStateViewController intermediateStateViewController = this.f70956f;
        if (intermediateStateViewController != null) {
            intermediateStateViewController.mo65149n();
        }
        if (this.f70957g || this.f70958h) {
            Context context2 = getContext();
            if (context2 != null) {
                C24878a aVar2 = C24877b.f65602l;
                C7573i.m23582a((Object) context2, "it");
                mo69575a(((C24877b) aVar2.mo65136a(context2)).f65604b, false);
            }
            this.f70958h = false;
            this.f70957g = false;
        }
    }

    /* renamed from: b */
    public final void mo68282b(int i) {
        this.f70961t = i;
    }

    /* renamed from: a */
    public final void mo68279a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        C7573i.m23587b(loftNestedRefreshLayout, "loftNestedRefreshLayout");
        this.f70955e = loftNestedRefreshLayout;
    }

    /* renamed from: b */
    public final void mo69576b(Loft loft) {
        C6726a.m20844b(new C26895f(this, loft));
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f70955e != null) {
            if (z) {
                LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70955e;
                if (loftNestedRefreshLayout != null) {
                    loftNestedRefreshLayout.setEnabled(false);
                }
                return;
            }
            mo69578i();
        }
    }

    /* renamed from: a */
    public final void mo64889a(Loft loft) {
        C7573i.m23587b(loft, "loft");
        if (getActivity() != null && this.f70955e != null) {
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59971a("duration", SystemClock.elapsedRealtime() - this.f70962u).mo59973a("activity_id", loft.getId()).mo59970a("status", 0).f60753a);
            if (this.f70956f == null) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) activity, "activity!!");
                Context context = activity;
                LoftNestedRefreshLayout loftNestedRefreshLayout = this.f70955e;
                if (loftNestedRefreshLayout == null) {
                    C7573i.m23580a();
                }
                this.f70956f = new IntermediateStateViewController(context, loftNestedRefreshLayout.getHeaderView(), true, true);
                LoftNestedRefreshLayout loftNestedRefreshLayout2 = this.f70955e;
                if (loftNestedRefreshLayout2 != null) {
                    IntermediateStateViewController intermediateStateViewController = this.f70956f;
                    if (intermediateStateViewController == null) {
                        C7573i.m23580a();
                    }
                    loftNestedRefreshLayout2.setHeader(intermediateStateViewController.mo65150o());
                }
                IntermediateStateViewController intermediateStateViewController2 = this.f70956f;
                if (intermediateStateViewController2 != null) {
                    intermediateStateViewController2.mo65140a(loft, ViewType.SECOND_LOFT, (OnClickListener) new C26892d(this));
                }
                IntermediateStateViewController intermediateStateViewController3 = this.f70956f;
                if (intermediateStateViewController3 != null) {
                    intermediateStateViewController3.f65673c = new C26893e(this, loft);
                }
            }
            IntermediateStateViewController intermediateStateViewController4 = this.f70956f;
            if (intermediateStateViewController4 != null) {
                intermediateStateViewController4.f65674d = loft;
            }
            mo69578i();
        }
    }

    /* renamed from: a */
    public final void mo64887a(int i, Throwable th) {
        if (th == null) {
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59970a("status", i).f60753a);
        } else if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59970a("status", i).mo59970a("error_code", baseException.getErrorCode()).mo59973a("error_msg", baseException.getErrorMessage()).f60753a);
        } else {
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59970a("status", i).mo59973a("error_msg", th.getMessage()).f60753a);
        }
        mo69578i();
    }

    /* renamed from: a */
    public final void mo69575a(Loft loft, boolean z) {
        Bitmap bitmap;
        if (getActivity() != null && loft != null && !TextUtils.isEmpty(loft.getId()) && isResumed()) {
            this.f70959i = true;
            this.f70957g = false;
            if (this.f70963v == null) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) activity, "activity!!");
                Window window = activity.getWindow();
                C7573i.m23582a((Object) window, "activity!!.window");
                View decorView = window.getDecorView();
                C7573i.m23582a((Object) decorView, "activity!!.window.decorView");
                decorView.setDrawingCacheEnabled(true);
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) activity2, "activity!!");
                Window window2 = activity2.getWindow();
                C7573i.m23582a((Object) window2, "activity!!.window");
                View decorView2 = window2.getDecorView();
                C7573i.m23582a((Object) decorView2, "activity!!.window.decorView");
                this.f70963v = decorView2.getDrawingCache();
            }
            C24832a aVar = LoftPlayActivity.f65427c;
            Context context = getContext();
            String id = loft.getId();
            if (id == null) {
                C7573i.m23580a();
            }
            Integer valueOf = Integer.valueOf(0);
            if (z) {
                bitmap = this.f70963v;
            } else {
                bitmap = null;
            }
            aVar.mo64926a(context, id, valueOf, bitmap);
        }
    }
}
