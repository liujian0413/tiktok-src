package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.widget.TabWidget;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost.C11076b;
import com.p280ss.android.ugc.aweme.base.p308ui.C23464d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.C30248a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.X2CFragmentMainPage;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.main.C32999e;
import com.p280ss.android.ugc.aweme.main.TabAlphaController;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.main.TabChangeManager.C32854a;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.h */
public final class C30289h {

    /* renamed from: a */
    public TabChangeManager f79649a;

    /* renamed from: b */
    public ScrollSwitchStateManager f79650b;

    /* renamed from: c */
    private FragmentTabHost f79651c;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.h$a */
    public static final class C30290a extends C0052o<Fragment> {

        /* renamed from: a */
        final /* synthetic */ C30289h f79652a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Fragment getValue() {
            TabChangeManager tabChangeManager = this.f79652a.f79649a;
            if (tabChangeManager != null) {
                return tabChangeManager.mo84567a();
            }
            return null;
        }

        C30290a(C30289h hVar) {
            this.f79652a = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.h$b */
    static final class C30291b implements C32854a {

        /* renamed from: a */
        final /* synthetic */ C30289h f79653a;

        C30291b(C30289h hVar) {
            this.f79653a = hVar;
        }

        /* renamed from: a */
        public final void mo79785a(String str) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f79653a.f79650b;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f79583b = str;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.h$c */
    public static final class C30292c implements C30248a {

        /* renamed from: a */
        final /* synthetic */ C30289h f79654a;

        C30292c(C30289h hVar) {
            this.f79654a = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.h$d */
    static final class C30293d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsFragment f79655a;

        C30293d(AbsFragment absFragment) {
            this.f79655a = absFragment;
        }

        public final void run() {
            ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).runInTabHostRunnable(this.f79655a);
        }
    }

    /* renamed from: b */
    private final void m99045b(AbsFragment absFragment) {
        ScrollSwitchStateManager scrollSwitchStateManager = this.f79650b;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.mo79704a((C0052o<Fragment>) new C30290a<Fragment>(this));
        }
        TabChangeManager tabChangeManager = this.f79649a;
        if (tabChangeManager != null) {
            tabChangeManager.f85775c = new C30291b(this);
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.f79650b;
        if (scrollSwitchStateManager2 != null) {
            scrollSwitchStateManager2.mo79708a((C30248a) new C30292c(this));
        }
    }

    /* renamed from: a */
    public final View mo79783a(AbsFragment absFragment) {
        C7573i.m23587b(absFragment, "fragment");
        View view = ((X2CFragmentMainPage) C7121a.m22249b(X2CFragmentMainPage.class)).getView(absFragment.getContext(), R.layout.fragment_main_page);
        this.f79651c = (FragmentTabHost) view.findViewById(R.id.bwn);
        FragmentTabHost fragmentTabHost = this.f79651c;
        if (fragmentTabHost != null) {
            fragmentTabHost.setHideWhenTabChanged(true);
        }
        FragmentActivity activity = absFragment.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "fragment.activity!!");
        this.f79650b = C30246a.m98970a(activity);
        C7573i.m23582a((Object) view, "view");
        return view;
    }

    /* renamed from: a */
    public final void mo79784a(AbsFragment absFragment, View view) {
        C7573i.m23587b(absFragment, "fragment");
        absFragment.getLifecycle().mo55a(TabAlphaController.m106429a());
        FragmentTabHost fragmentTabHost = this.f79651c;
        if (fragmentTabHost != null) {
            fragmentTabHost.mo26964a((Context) absFragment.getActivity(), absFragment.getChildFragmentManager(), (int) R.id.dfc);
        }
        FragmentTabHost fragmentTabHost2 = this.f79651c;
        if (fragmentTabHost2 != null) {
            TabWidget tabWidget = fragmentTabHost2.getTabWidget();
            if (tabWidget != null) {
                tabWidget.setVisibility(8);
            }
        }
        if (absFragment instanceof C11076b) {
            FragmentTabHost fragmentTabHost3 = this.f79651c;
            if (fragmentTabHost3 != null) {
                fragmentTabHost3.setOnTabSwitchListener((C11076b) absFragment);
            }
        }
        this.f79649a = TabChangeManager.m106432a(absFragment.getActivity()).mo84569a(this.f79651c).mo84568a(absFragment.getChildFragmentManager());
        m99045b(absFragment);
        if (absFragment instanceof C23464d) {
            TabChangeManager tabChangeManager = this.f79649a;
            if (tabChangeManager != null) {
                tabChangeManager.mo84570a((C23464d) absFragment);
            }
        }
        C6857a.m21312e().mo16822a("method_main_page_add_tab_duration", false);
        FragmentActivity activity = absFragment.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "fragment.activity!!");
        Intent intent = activity.getIntent();
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class);
        TabChangeManager tabChangeManager2 = this.f79649a;
        if (tabChangeManager2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) intent, "intent");
        homePageUIFrameService.addTabToMainPageFragment(tabChangeManager2, intent);
        C6857a.m21312e().mo16827b("method_main_page_add_tab_duration", false);
        FragmentTabHost fragmentTabHost4 = this.f79651c;
        if (fragmentTabHost4 != null) {
            fragmentTabHost4.post(new C30293d(absFragment));
        }
        C30277c.m99027a(absFragment, view);
        FragmentActivity activity2 = absFragment.getActivity();
        if (activity2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity2, "fragment.activity!!");
        C32999e.m106648a(activity2);
    }
}
