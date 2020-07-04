package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.d */
public final class C2035d implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        linearLayout.setBackgroundColor(resources.getColor(R.color.f));
        linearLayout.setId(R.id.ef);
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).bottomMargin = (int) TypedValue.applyDimension(1, -48.0f, resources.getDisplayMetrics());
        }
        linearLayout.setOrientation(0);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.b5v);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView.setImageResource(R.drawable.aup);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.dqe);
        dmtTextView.setText(R.string.b50);
        dmtTextView.setTextSize(1, 13.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setGravity(16);
        dmtTextView.setFontType("medium");
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setTextColor(resources.getColorStateList(R.color.yr));
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(dmtTextView);
        return linearLayout;
    }
}
