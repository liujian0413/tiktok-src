package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.ad */
public final class C2022ad implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -2, -2);
        linearLayout.setId(R.id.c22);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        appCompatImageView.setId(R.id.c1e);
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(R.drawable.a8p);
        appCompatImageView.setAlpha(0.9f);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView.setTextSize(1, 15.0f);
        dmtTextView.setText(R.string.crg);
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setMaxWidth((int) TypedValue.applyDimension(1, 149.0f, resources.getDisplayMetrics()));
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), 0.0f, dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setFontType("bold");
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.a8n));
        dmtTextView.setTextColor(resources.getColorStateList(R.color.ls));
        dmtTextView.setId(R.id.c1l);
        dmtTextView.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView.setEllipsize(TruncateAt.END);
        dmtTextView.setMaxLines(1);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setVisibility(8);
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        MarqueeView marqueeView = new MarqueeView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        marqueeView.setId(R.id.c24);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        marqueeView.setSpeed((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        marqueeView.setTextShadow(resources.getColor(R.color.px));
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        marqueeView.setTextColor(resources.getColor(R.color.lt));
        marqueeView.setTextSize((int) TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()));
        marqueeView.setLayoutParams(layoutParams3);
        if (marqueeView.getParent() == null) {
            linearLayout.addView(marqueeView);
        }
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(marqueeView);
        return linearLayout;
    }
}
