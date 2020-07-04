package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainBottomTabView;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21089c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.c */
public final class C30277c {

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.c$a */
    static final class C30278a implements C21089c {

        /* renamed from: a */
        final /* synthetic */ MainBottomTabView f79639a;

        C30278a(MainBottomTabView mainBottomTabView) {
            this.f79639a = mainBottomTabView;
        }

        /* renamed from: a */
        public final void mo56929a() {
            MainBottomTabView mainBottomTabView = this.f79639a;
            if (mainBottomTabView != null) {
                mainBottomTabView.mo79795a();
            }
        }
    }

    /* renamed from: a */
    public static final void m99027a(AbsFragment absFragment, View view) {
        MainBottomTabView mainBottomTabView;
        C7573i.m23587b(absFragment, "fragment");
        FragmentActivity activity = absFragment.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "fragment.activity!!");
        if (TextUtils.equals(activity.getIntent().getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"), "NOTIFICATION")) {
            FragmentActivity activity2 = absFragment.getActivity();
            if (activity2 == null) {
                C7573i.m23580a();
            }
            TabChangeManager.m106432a(activity2).mo84574a("NOTIFICATION");
        }
        View view2 = null;
        if (view != null) {
            mainBottomTabView = (MainBottomTabView) view.findViewById(R.id.bwi);
        } else {
            mainBottomTabView = null;
        }
        if (view != null) {
            view2 = view.findViewById(R.id.oc);
        }
        View view3 = view2;
        if (absFragment.isViewValid()) {
            C21085a.m71117a().mo56925a(1, (View) mainBottomTabView, view3, (View) null, (C21089c) new C30278a(mainBottomTabView));
        }
    }
}
