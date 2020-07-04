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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.aa */
public final class C2019aa implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        DmtTextView dmtTextView = new DmtTextView(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -2, -2);
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).leftMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        dmtTextView.setTextSize(2, 15.0f);
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        if (MarginLayoutParams.class.isInstance(a) && VERSION.SDK_INT >= 17) {
            ((MarginLayoutParams) a).setMarginStart((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 16;
        }
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.px));
        dmtTextView.setTextColor(resources.getColorStateList(R.color.r6));
        dmtTextView.setId(R.id.dzt);
        dmtTextView.setTextDirection(5);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setTextAlignment(5);
        if (viewGroup != null) {
            dmtTextView.setLayoutParams(a);
            if (z) {
                viewGroup.addView(dmtTextView);
            }
        }
        C1444a.m7242a(dmtTextView);
        return dmtTextView;
    }
}
