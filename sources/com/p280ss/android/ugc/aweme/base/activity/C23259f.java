package com.p280ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.bytedance.ies.dmt.p262ui.sliding.AmeSlidingPaneLayout;
import com.bytedance.ies.dmt.p262ui.sliding.DmtSlidingPaneLayout.C10796d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.livedata.SlideData;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.activity.f */
public final class C23259f implements C10796d {

    /* renamed from: c */
    public static final C23260a f61284c = new C23260a(null);

    /* renamed from: a */
    public boolean f61285a;

    /* renamed from: b */
    public AmeSlidingPaneLayout f61286b;

    /* renamed from: d */
    private SlideData f61287d;

    /* renamed from: e */
    private Activity f61288e;

    /* renamed from: f */
    private int f61289f;

    /* renamed from: g */
    private C23261b f61290g;

    /* renamed from: com.ss.android.ugc.aweme.base.activity.f$a */
    public static final class C23260a {
        private C23260a() {
        }

        public /* synthetic */ C23260a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.f$b */
    public interface C23261b {
        /* renamed from: a */
        void mo60531a();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.f$c */
    static final class C23262c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23259f f61291a;

        C23262c(C23259f fVar) {
            this.f61291a = fVar;
        }

        public final void run() {
            this.f61291a.mo60529b();
            this.f61291a.f61285a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.f$d */
    static final class C23263d implements C23266b {

        /* renamed from: a */
        final /* synthetic */ C23259f f61292a;

        C23263d(C23259f fVar) {
            this.f61292a = fVar;
        }

        /* renamed from: a */
        public final void mo60533a() {
            AmeSlidingPaneLayout ameSlidingPaneLayout = this.f61292a.f61286b;
            if (ameSlidingPaneLayout != null) {
                ameSlidingPaneLayout.mo25807a();
            }
        }
    }

    /* renamed from: e */
    private static boolean m76353e() {
        if (VERSION.SDK_INT > 23) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo60530c() {
        C23264g.m76364a(this.f61288e);
        AmeSlidingPaneLayout ameSlidingPaneLayout = this.f61286b;
        if (ameSlidingPaneLayout != null) {
            ameSlidingPaneLayout.mo25808b();
        }
    }

    /* renamed from: b */
    public final void mo60529b() {
        AmeSlidingPaneLayout ameSlidingPaneLayout = this.f61286b;
        if (ameSlidingPaneLayout != null) {
            ameSlidingPaneLayout.mo25808b();
        }
        C23264g.m76365a(this.f61288e, new C23263d(this));
    }

    /* renamed from: a */
    public final void mo60527a() {
        if (m76353e()) {
            this.f61288e.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            switch (this.f61289f) {
                case 0:
                    mo60529b();
                    this.f61285a = true;
                    break;
                case 1:
                case 2:
                    new Handler().postDelayed(new C23262c(this), 1300);
                    break;
            }
            m76352d();
            Activity activity = this.f61288e;
            if (activity != null) {
                this.f61287d = (SlideData) C0069x.m159a((FragmentActivity) activity).mo147a(SlideData.class);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: d */
    private final void m76352d() {
        this.f61286b = new AmeSlidingPaneLayout(this.f61288e);
        AmeSlidingPaneLayout ameSlidingPaneLayout = this.f61286b;
        if (ameSlidingPaneLayout != null) {
            ameSlidingPaneLayout.setPanelSlideListener(this);
        }
        AmeSlidingPaneLayout ameSlidingPaneLayout2 = this.f61286b;
        if (ameSlidingPaneLayout2 != null) {
            ameSlidingPaneLayout2.setSliderFadeColor(C23481i.m77089a().getColor(17170445));
        }
        View view = new View(this.f61288e);
        view.setLayoutParams(new LayoutParams(-1, -1));
        AmeSlidingPaneLayout ameSlidingPaneLayout3 = this.f61286b;
        if (ameSlidingPaneLayout3 != null) {
            ameSlidingPaneLayout3.addView(view, 0);
        }
        Window window = this.f61288e.getWindow();
        C7573i.m23582a((Object) window, "mActivity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2 != null) {
                    if (C6399b.m19945u()) {
                        viewGroup2.setBackgroundColor(C23481i.m77089a().getColor(17170444));
                    } else {
                        viewGroup2.setBackgroundColor(C23481i.m77089a().getColor(R.color.a7f));
                    }
                    View view2 = viewGroup2;
                    viewGroup.removeView(view2);
                    viewGroup.addView(this.f61286b);
                    AmeSlidingPaneLayout ameSlidingPaneLayout4 = this.f61286b;
                    if (ameSlidingPaneLayout4 != null) {
                        ameSlidingPaneLayout4.addView(view2, 1);
                        return;
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void mo60528a(C23261b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f61290g = bVar;
    }

    /* renamed from: a */
    public final void mo25853a(View view) {
        C7573i.m23587b(view, "var1");
        SlideData slideData = this.f61287d;
        if (slideData != null) {
            C0052o b = slideData.mo60649b();
            if (b != null) {
                b.setValue(Boolean.valueOf(false));
            }
        }
        this.f61288e.finish();
        this.f61288e.overridePendingTransition(0, R.anim.cm);
    }

    /* renamed from: b */
    public final void mo25855b(View view) {
        C7573i.m23587b(view, "var1");
        SlideData slideData = this.f61287d;
        if (slideData != null) {
            C0052o b = slideData.mo60649b();
            if (b != null) {
                b.setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: c */
    public final void mo25856c(View view) {
        C7573i.m23587b(view, "var1");
        KeyboardUtils.m77057c(view);
        SlideData slideData = this.f61287d;
        if (slideData != null) {
            C0052o b = slideData.mo60649b();
            if (b != null) {
                b.setValue(Boolean.valueOf(true));
            }
        }
        if (this.f61290g != null) {
            C23261b bVar = this.f61290g;
            if (bVar != null) {
                bVar.mo60531a();
            }
        }
    }

    public C23259f(Activity activity, int i) {
        C7573i.m23587b(activity, "activity");
        this.f61288e = activity;
        this.f61289f = i;
    }

    /* renamed from: a */
    public final void mo25854a(View view, float f) {
        C7573i.m23587b(view, "var1");
        SlideData slideData = this.f61287d;
        if (slideData != null) {
            C0052o a = slideData.mo60648a();
            if (a != null) {
                a.setValue(Float.valueOf(f));
            }
        }
    }
}
