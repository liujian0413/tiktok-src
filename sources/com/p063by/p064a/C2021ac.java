package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.FeedTagLayout2;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.ac */
public final class C2021ac implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -2, -2);
        linearLayout.setOrientation(1);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        FeedTagLayout2 feedTagLayout2 = new FeedTagLayout2(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        feedTagLayout2.setId(R.id.ajm);
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        feedTagLayout2.setVisibility(8);
        feedTagLayout2.setLayoutParams(layoutParams);
        if (feedTagLayout2.getParent() == null) {
            linearLayout.addView(feedTagLayout2);
        }
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(feedTagLayout2);
        return linearLayout;
    }
}
