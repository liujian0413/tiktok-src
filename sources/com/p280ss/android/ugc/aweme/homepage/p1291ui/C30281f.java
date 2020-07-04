package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p308ui.FlippableViewPager;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip.C30311b;
import com.p280ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment;
import com.p280ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.f */
public final class C30281f {

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.f$a */
    public static final class C30282a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver f79641a;

        /* renamed from: b */
        final /* synthetic */ ViewTreeObserver f79642b;

        /* renamed from: c */
        final /* synthetic */ MainTabStrip f79643c;

        /* renamed from: d */
        final /* synthetic */ View f79644d;

        public final void onGlobalLayout() {
            if (this.f79642b.isAlive()) {
                this.f79641a.removeOnGlobalLayoutListener(this);
                MainTabStrip mainTabStrip = this.f79643c;
                if (mainTabStrip != null) {
                    mainTabStrip.mo79821a(this.f79644d);
                }
            }
        }

        C30282a(ViewTreeObserver viewTreeObserver, ViewTreeObserver viewTreeObserver2, MainTabStrip mainTabStrip, View view) {
            this.f79641a = viewTreeObserver;
            this.f79642b = viewTreeObserver2;
            this.f79643c = mainTabStrip;
            this.f79644d = view;
        }
    }

    /* renamed from: a */
    private static String[] m99033a(Context context) {
        String[] strArr;
        String[] stringArray;
        C7573i.m23587b(context, "context");
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isShowNearBy = inst.getIsShowNearBy();
        C7573i.m23582a((Object) isShowNearBy, "SharePrefCache.inst().isShowNearBy");
        Object d = isShowNearBy.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().isShowNearBy.cache");
        if (((Boolean) d).booleanValue()) {
            strArr = context.getResources().getStringArray(R.array.ad);
            C7573i.m23582a((Object) strArr, "context.resources.getStr…(R.array.top_tabs_nearby)");
        } else {
            strArr = context.getResources().getStringArray(R.array.ab);
            C7573i.m23582a((Object) strArr, "context.resources.getStringArray(R.array.top_tabs)");
        }
        if (!C6384b.m19835a().mo15292a(ForYouTranslationsExperiment.class, true, "for_you_new_translations", C6384b.m19835a().mo15295d().for_you_new_translations, false)) {
            return strArr;
        }
        SharePrefCache inst2 = SharePrefCache.inst();
        C7573i.m23582a((Object) inst2, "SharePrefCache.inst()");
        C22903bl isShowNearBy2 = inst2.getIsShowNearBy();
        C7573i.m23582a((Object) isShowNearBy2, "SharePrefCache.inst().isShowNearBy");
        Object d2 = isShowNearBy2.mo59877d();
        C7573i.m23582a(d2, "SharePrefCache.inst().isShowNearBy.cache");
        if (((Boolean) d2).booleanValue()) {
            stringArray = context.getResources().getStringArray(R.array.ae);
            C7573i.m23582a((Object) stringArray, "context.resources.getStr…y.top_tabs_nearby_4_i18n)");
        } else {
            stringArray = context.getResources().getStringArray(R.array.ac);
            C7573i.m23582a((Object) stringArray, "context.resources.getStr…(R.array.top_tabs_4_i18n)");
        }
        return stringArray;
    }

    /* renamed from: a */
    public static final void m99032a(AbsFragment absFragment, View view, MainTabStrip mainTabStrip, FlippableViewPager flippableViewPager) {
        View view2;
        int i;
        C7573i.m23587b(absFragment, "mainFragment");
        if (mainTabStrip == null) {
            C7573i.m23580a();
        }
        Context context = absFragment.getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context, "mainFragment.context!!");
        mainTabStrip.setTitle(m99033a(context));
        if (view != null) {
            view2 = view.findViewById(R.id.bwo);
        } else {
            view2 = null;
        }
        if (flippableViewPager == null) {
            C7573i.m23580a();
        }
        mainTabStrip.mo79822a(flippableViewPager, view2, MainTabStripSwipeSwitchExperiment.INSTANCE.getEnableSwipeMode());
        PagerAdapter adapter = flippableViewPager.getAdapter();
        if (adapter == null || adapter.getCount() != 2) {
            i = 6;
        } else {
            i = 5;
        }
        mainTabStrip.setTabMode(i);
        if (absFragment instanceof C30311b) {
            mainTabStrip.setTabOnClickListener((C30311b) absFragment);
        }
        ViewTreeObserver viewTreeObserver = mainTabStrip.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C30282a(viewTreeObserver, viewTreeObserver, mainTabStrip, view2));
        }
    }
}
