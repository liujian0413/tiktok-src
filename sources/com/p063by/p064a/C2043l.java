package com.p063by.p064a;

import android.content.Context;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FriendTabViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.l */
public final class C2043l implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, -1);
        if (viewGroup != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(relativeLayout);
            }
        }
        FriendTabViewPager friendTabViewPager = new FriendTabViewPager(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        friendTabViewPager.setId(R.id.edp);
        friendTabViewPager.setLayoutParams(layoutParams);
        if (friendTabViewPager.getParent() == null) {
            relativeLayout.addView(friendTabViewPager);
        }
        C1444a.m7242a(relativeLayout);
        C1444a.m7242a(friendTabViewPager);
        return relativeLayout;
    }
}
