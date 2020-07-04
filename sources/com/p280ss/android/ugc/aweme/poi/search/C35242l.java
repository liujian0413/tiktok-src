package com.p280ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.views.C43372h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.search.l */
public final class C35242l implements C43372h {
    /* renamed from: a */
    public final View mo89706a(Context context, int i) {
        View view = new View(context);
        LayoutParams layoutParams = new LayoutParams(i, C23486n.m77122a(2.0d));
        int b = (int) C9738o.m28708b(context, 16.0f);
        int i2 = b / 2;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i2);
            layoutParams.setMarginEnd(i2);
        }
        layoutParams.width -= b;
        layoutParams.gravity = 8388691;
        view.setBackgroundColor(context.getResources().getColor(R.color.a4s));
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* renamed from: a */
    public final View mo89707a(Context context, ViewGroup viewGroup, PagerAdapter pagerAdapter, int i, int i2, OnClickListener onClickListener) {
        LinearLayout.LayoutParams layoutParams;
        DmtTextView dmtTextView = new DmtTextView(context);
        if (i2 > 0) {
            layoutParams = new LinearLayout.LayoutParams(i2, -1);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
        }
        dmtTextView.setGravity(17);
        dmtTextView.setLayoutParams(layoutParams);
        dmtTextView.setText(String.valueOf(pagerAdapter.getPageTitle(i)));
        dmtTextView.setTextSize(1, 15.0f);
        dmtTextView.setBackgroundColor(context.getResources().getColor(R.color.ayd));
        dmtTextView.setTextColor(context.getResources().getColorStateList(R.color.ns));
        dmtTextView.setOnClickListener(onClickListener);
        return dmtTextView;
    }
}
