package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.FlippableViewPager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.C30251c;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.C30252d;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.C30253e;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.X2CFragmentMain;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a.C30272a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.g */
public final class C30283g {

    /* renamed from: a */
    public static PagerAdapter f79645a;

    /* renamed from: b */
    public static FlippableViewPager f79646b;

    /* renamed from: c */
    public static ScrollSwitchStateManager f79647c;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.g$a */
    public static final class C30284a implements C30253e {
        C30284a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.g$b */
    static final class C30285b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        public static final C30285b f79648a = new C30285b();

        C30285b() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            m99039a((Boolean) obj);
        }

        /* renamed from: a */
        private static void m99039a(Boolean bool) {
            FlippableViewPager flippableViewPager = C30283g.f79646b;
            if (flippableViewPager != null) {
                if (bool == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) bool, "topTabPagingEnable!!");
                flippableViewPager.f61696a = bool.booleanValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.g$c */
    public static final class C30286c implements C30251c {
        C30286c() {
        }

        /* renamed from: a */
        public final int mo67727a() {
            Integer num;
            FlippableViewPager flippableViewPager = C30283g.f79646b;
            if (flippableViewPager != null) {
                num = Integer.valueOf(flippableViewPager.getCurrentItem());
            } else {
                num = null;
            }
            if (num == null) {
                C7573i.m23580a();
            }
            return num.intValue();
        }

        /* renamed from: a */
        public final void mo67728a(int i) {
            FlippableViewPager flippableViewPager = C30283g.f79646b;
            if (flippableViewPager != null) {
                flippableViewPager.setCurrentItem(i);
            }
        }

        /* renamed from: a */
        public final void mo67729a(int i, boolean z) {
            FlippableViewPager flippableViewPager = C30283g.f79646b;
            if (flippableViewPager != null) {
                flippableViewPager.setCurrentItem(i, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.g$d */
    public static final class C30287d implements C30252d {
        C30287d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.g$e */
    public static final class C30288e implements C30272a {
        C30288e() {
        }

        /* renamed from: a */
        public final void mo79779a(SparseArray<Fragment> sparseArray) {
            C7573i.m23587b(sparseArray, "fragments");
            ScrollSwitchStateManager scrollSwitchStateManager = C30283g.f79647c;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f79584c = sparseArray;
            }
        }

        /* renamed from: a */
        public final void mo79780a(WeakReference<Fragment> weakReference) {
            if (C6399b.m19944t()) {
                ScrollSwitchStateManager scrollSwitchStateManager = C30283g.f79647c;
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.f79585d = weakReference;
                }
            }
        }
    }

    /* renamed from: a */
    public static final PagerAdapter m99034a() {
        return f79645a;
    }

    /* renamed from: b */
    public static final FlippableViewPager m99037b() {
        return f79646b;
    }

    /* renamed from: a */
    public static final View m99035a(AbsFragment absFragment) {
        C7573i.m23587b(absFragment, "fragment");
        View view = ((X2CFragmentMain) C7121a.m22249b(X2CFragmentMain.class)).getView(absFragment.getContext(), R.layout.fragment_main);
        C7573i.m23582a((Object) view, "x2CFragmentMain.getView(…, R.layout.fragment_main)");
        return view;
    }

    /* renamed from: b */
    private static void m99038b(AbsFragment absFragment) {
        C7573i.m23587b(absFragment, "fragment");
        FlippableViewPager flippableViewPager = f79646b;
        if (flippableViewPager != null) {
            flippableViewPager.addOnPageChangeListener(new MainFragmentUIIniterKt$initInteractionDataStream$1());
        }
        ScrollSwitchStateManager scrollSwitchStateManager = f79647c;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.mo79711a((C30253e) new C30284a());
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = f79647c;
        if (scrollSwitchStateManager2 != null) {
            FragmentActivity activity = absFragment.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "fragment.activity!!");
            scrollSwitchStateManager2.mo79747m(activity, C30285b.f79648a);
        }
        ScrollSwitchStateManager scrollSwitchStateManager3 = f79647c;
        if (scrollSwitchStateManager3 != null) {
            scrollSwitchStateManager3.mo79721b((C30251c) new C30286c());
        }
        ScrollSwitchStateManager scrollSwitchStateManager4 = f79647c;
        if (scrollSwitchStateManager4 != null) {
            scrollSwitchStateManager4.mo79710a((C30252d) new C30287d());
        }
    }

    /* renamed from: a */
    public static final void m99036a(AbsFragment absFragment, View view, MainTabStrip mainTabStrip) {
        FlippableViewPager flippableViewPager;
        C7573i.m23587b(absFragment, "fragment");
        FragmentActivity activity = absFragment.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "fragment.activity!!");
        f79647c = C30246a.m98970a(activity);
        Context context = absFragment.getContext();
        C0608j childFragmentManager = absFragment.getChildFragmentManager();
        C7573i.m23582a((Object) childFragmentManager, "fragment.childFragmentManager");
        f79645a = C30279d.m99029a(absFragment, context, childFragmentManager, new C30288e());
        if (view != null) {
            flippableViewPager = (FlippableViewPager) view.findViewById(R.id.edp);
        } else {
            flippableViewPager = null;
        }
        f79646b = flippableViewPager;
        if (flippableViewPager != null) {
            flippableViewPager.setAdapter(f79645a);
        }
        FlippableViewPager flippableViewPager2 = f79646b;
        if (flippableViewPager2 != null) {
            flippableViewPager2.f61696a = true;
        }
        C30281f.m99032a(absFragment, view, mainTabStrip, f79646b);
        m99038b(absFragment);
    }
}
