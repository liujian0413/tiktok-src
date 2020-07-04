package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.C0611k;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.C23465e;
import com.p280ss.android.ugc.aweme.base.p308ui.C23466f;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter.C23435a;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter.C23437b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.C30251c;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ViewPagerFlingEndEvent;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.X2CActivityMain;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a */
public final class C30262a {

    /* renamed from: a */
    public static ScrollableViewPager f79626a;

    /* renamed from: b */
    public static SwitchFragmentPagerAdapter f79627b;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$a */
    public static final class C30263a implements C30251c {
        C30263a() {
        }

        /* renamed from: a */
        public final int mo67727a() {
            Integer num;
            ScrollableViewPager scrollableViewPager = C30262a.f79626a;
            if (scrollableViewPager != null) {
                num = Integer.valueOf(scrollableViewPager.getCurrentItem());
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
            ScrollableViewPager scrollableViewPager = C30262a.f79626a;
            if (scrollableViewPager != null) {
                scrollableViewPager.setCurrentItem(i);
            }
        }

        /* renamed from: a */
        public final void mo67729a(int i, boolean z) {
            ScrollableViewPager scrollableViewPager = C30262a.f79626a;
            if (scrollableViewPager != null) {
                scrollableViewPager.mo3450a(i, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$b */
    static final class C30264b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        public static final C30264b f79628a = new C30264b();

        C30264b() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            m99009a((Boolean) obj);
        }

        /* renamed from: a */
        private static void m99009a(Boolean bool) {
            ScrollableViewPager scrollableViewPager = C30262a.f79626a;
            if (scrollableViewPager != null) {
                if (bool == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) bool, "enabled!!");
                scrollableViewPager.f61815g = bool.booleanValue();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$c */
    static final class C30265c<T> implements C0053p<Boolean> {

        /* renamed from: a */
        public static final C30265c f79629a = new C30265c();

        C30265c() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            m99010a((Boolean) obj);
        }

        /* renamed from: a */
        private static void m99010a(Boolean bool) {
            ScrollableViewPager scrollableViewPager = C30262a.f79626a;
            if (scrollableViewPager != null) {
                if (bool == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) bool, "block!!");
                scrollableViewPager.setBlockCanScroll(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$d */
    static final class C30266d<T> implements C0053p<String> {

        /* renamed from: a */
        public static final C30266d f79630a = new C30266d();

        C30266d() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            m99011a((String) obj);
        }

        /* renamed from: a */
        private static void m99011a(final String str) {
            SwitchFragmentPagerAdapter switchFragmentPagerAdapter = C30262a.f79627b;
            if (switchFragmentPagerAdapter == null) {
                C7573i.m23580a();
            }
            if (!C0611k.m2585a(switchFragmentPagerAdapter.f61826d)) {
                SwitchFragmentPagerAdapter switchFragmentPagerAdapter2 = C30262a.f79627b;
                if (switchFragmentPagerAdapter2 == null) {
                    C7573i.m23580a();
                }
                switchFragmentPagerAdapter2.mo61037a(str);
                return;
            }
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    SwitchFragmentPagerAdapter switchFragmentPagerAdapter = C30262a.f79627b;
                    if (switchFragmentPagerAdapter == null) {
                        C7573i.m23580a();
                    }
                    switchFragmentPagerAdapter.mo61037a(str);
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$e */
    static final class C30268e<T> implements C0053p<C23434a> {

        /* renamed from: a */
        public static final C30268e f79632a = new C30268e();

        C30268e() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            m99013a((C23434a) obj);
        }

        /* renamed from: a */
        private static void m99013a(C23434a aVar) {
            ScrollableViewPager scrollableViewPager = C30262a.f79626a;
            if (scrollableViewPager != null) {
                scrollableViewPager.mo61025a(aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$f */
    public static final class C30269f implements C23437b {

        /* renamed from: a */
        final /* synthetic */ AmeSSActivity f79633a;

        C30269f(AmeSSActivity ameSSActivity) {
            this.f79633a = ameSSActivity;
        }

        /* renamed from: a */
        public final void mo61044a(HashMap<Integer, CommonPageFragment> hashMap) {
            C7573i.m23587b(hashMap, "fragments");
            C30246a.m98970a(this.f79633a).mo79714a(hashMap);
        }

        /* renamed from: a */
        public final void mo61045a(List<C23465e> list) {
            C7573i.m23587b(list, "mainPages");
            C30246a.m98970a(this.f79633a).mo79715a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$g */
    static final class C30270g implements OnTouchListener {

        /* renamed from: a */
        public static final C30270g f79634a = new C30270g();

        C30270g() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            view.requestFocusFromTouch();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$h */
    static final class C30271h implements C23466f {

        /* renamed from: a */
        final /* synthetic */ AmeSSActivity f79635a;

        C30271h(AmeSSActivity ameSSActivity) {
            this.f79635a = ameSSActivity;
        }

        /* renamed from: a */
        public final void mo61074a() {
            C30246a.m98970a(this.f79635a).mo79707a(ViewPagerFlingEndEvent.INSTANCE);
        }
    }

    /* renamed from: a */
    public static final SwitchFragmentPagerAdapter m99001a() {
        return f79627b;
    }

    /* renamed from: b */
    public static final ScrollableViewPager m99003b() {
        return f79626a;
    }

    /* renamed from: b */
    public static final void m99004b(AmeSSActivity ameSSActivity) {
        C7573i.m23587b(ameSSActivity, "activity");
        X2CActivityMain x2CActivityMain = (X2CActivityMain) C7121a.m22249b(X2CActivityMain.class);
        C6857a.m21312e().mo16822a("method_main_set_content_view_duration", false);
        ameSSActivity.setContentView(x2CActivityMain.getView(ameSSActivity, R.layout.activity_main));
        C6857a.m21312e().mo16827b("method_main_set_content_view_duration", false);
    }

    /* renamed from: c */
    private static void m99005c(AmeSSActivity ameSSActivity) {
        C7573i.m23587b(ameSSActivity, "activity");
        ScrollSwitchStateManager a = C30246a.m98970a(ameSSActivity);
        a.mo79709a((C30251c) new C30263a());
        C0043i iVar = ameSSActivity;
        a.mo79720b(iVar, (C0053p<Boolean>) C30264b.f79628a);
        a.f79582a.observe(iVar, C30265c.f79629a);
        a.mo79727c(iVar, C30266d.f79630a);
        a.mo79743j(iVar, C30268e.f79632a);
    }

    /* renamed from: a */
    public static final void m99002a(AmeSSActivity ameSSActivity) {
        C7573i.m23587b(ameSSActivity, "activity");
        f79626a = (ScrollableViewPager) ameSSActivity.findViewById(R.id.edp);
        C23435a builderForFragmentInHomePageActivity = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getBuilderForFragmentInHomePageActivity();
        builderForFragmentInHomePageActivity.f61832b = new C30269f(ameSSActivity);
        f79627b = builderForFragmentInHomePageActivity.mo61042a(ameSSActivity.getSupportFragmentManager());
        C30276b.m99026a(ameSSActivity, f79626a);
        ScrollableViewPager scrollableViewPager = f79626a;
        if (scrollableViewPager != null) {
            scrollableViewPager.setAdapter(f79627b);
        }
        SwitchFragmentPagerAdapter switchFragmentPagerAdapter = f79627b;
        if (switchFragmentPagerAdapter != null) {
            switchFragmentPagerAdapter.notifyDataSetChanged();
        }
        ScrollableViewPager scrollableViewPager2 = f79626a;
        if (scrollableViewPager2 != null) {
            scrollableViewPager2.setDescendantFocusability(131072);
        }
        ScrollableViewPager scrollableViewPager3 = f79626a;
        if (scrollableViewPager3 != null) {
            scrollableViewPager3.setFocusable(true);
        }
        ScrollableViewPager scrollableViewPager4 = f79626a;
        if (scrollableViewPager4 != null) {
            scrollableViewPager4.setFocusableInTouchMode(true);
        }
        ScrollableViewPager scrollableViewPager5 = f79626a;
        if (scrollableViewPager5 != null) {
            scrollableViewPager5.setOnTouchListener(C30270g.f79634a);
        }
        ScrollableViewPager scrollableViewPager6 = f79626a;
        if (scrollableViewPager6 != null) {
            scrollableViewPager6.mo3451a((C0935e) new HomePageActivityUIIniterKt$initPagers$3(ameSSActivity));
        }
        ScrollableViewPager scrollableViewPager7 = f79626a;
        if (scrollableViewPager7 != null) {
            scrollableViewPager7.setOnFlingEndListener(new C30271h(ameSSActivity));
        }
        m99005c(ameSSActivity);
    }
}
