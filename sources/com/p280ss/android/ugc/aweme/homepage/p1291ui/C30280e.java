package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.view.MainTabStrip;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.e */
public final class C30280e {

    /* renamed from: a */
    public MainTabStrip f79640a;

    /* renamed from: a */
    public final void mo79781a(AbsFragment absFragment, View view, Bundle bundle) {
        MainTabStrip mainTabStrip;
        C7573i.m23587b(absFragment, "fragment");
        if (view != null) {
            mainTabStrip = (MainTabStrip) view.findViewById(R.id.c_3);
        } else {
            mainTabStrip = null;
        }
        this.f79640a = mainTabStrip;
        C30283g.m99036a(absFragment, view, this.f79640a);
    }

    /* renamed from: a */
    public static View m99030a(AbsFragment absFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(absFragment, "fragment");
        C7573i.m23587b(layoutInflater, "inflater");
        return C30283g.m99035a(absFragment);
    }
}
