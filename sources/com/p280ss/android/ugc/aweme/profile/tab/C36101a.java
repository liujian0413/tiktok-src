package com.p280ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.a */
public final class C36101a {
    /* renamed from: a */
    public static MusProfileTabView m116260a(Context context, int i, ViewGroup viewGroup, int i2) {
        if (i == 1) {
            MusProfileTabView musProfileTabView = (MusProfileTabView) LayoutInflater.from(context).inflate(R.layout.b4k, viewGroup, false);
            ((MusProfileTabTextView) musProfileTabView).setText(C23481i.m77089a().getString(i2));
            musProfileTabView.setAnimationEnabled(true);
            return musProfileTabView;
        } else if (i != 0) {
            return null;
        } else {
            MusProfileTabView musProfileTabView2 = (MusProfileTabView) LayoutInflater.from(context).inflate(R.layout.b4j, viewGroup, false);
            ((MusProfileTabImageView) musProfileTabView2).setImageResource(i2);
            musProfileTabView2.setAnimationEnabled(true);
            return musProfileTabView2;
        }
    }
}
