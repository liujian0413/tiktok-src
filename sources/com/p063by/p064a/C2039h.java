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
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.h */
public final class C2039h implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -2);
        linearLayout.setBackgroundColor(resources.getColor(R.color.a6s));
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.e4p);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setText(R.string.fqa);
        dmtTextView.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.a7d), dmtTextView.getCompoundDrawablesRelative()[1], dmtTextView.getCompoundDrawablesRelative()[2], dmtTextView.getCompoundDrawablesRelative()[3]);
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView.setTextColor(resources.getColorStateList(R.color.a67));
        dmtTextView.setLayoutParams(layoutParams);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics());
        }
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView2.setText(R.string.apt);
        dmtTextView2.setTextSize(2, 15.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        dmtTextView2.setTextColor(resources.getColorStateList(R.color.abj));
        dmtTextView2.setBackgroundResource(R.drawable.r8);
        dmtTextView2.setId(R.id.a9_);
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView2.setGravity(17);
        dmtTextView2.setIncludeFontPadding(false);
        dmtTextView2.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView2.getPaddingRight(), dmtTextView2.getPaddingBottom());
        dmtTextView2.setLayoutParams(layoutParams3);
        if (dmtTextView2.getParent() == null) {
            linearLayout2.addView(dmtTextView2);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        dmtTextView3.setText(R.string.i3);
        dmtTextView3.setTextSize(2, 15.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1.0f;
        }
        dmtTextView3.setTextColor(resources.getColorStateList(R.color.abj));
        dmtTextView3.setBackgroundResource(R.drawable.r8);
        dmtTextView3.setId(R.id.fh);
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView3.setGravity(17);
        dmtTextView3.setIncludeFontPadding(false);
        dmtTextView3.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView3.getPaddingRight(), dmtTextView3.getPaddingBottom());
        dmtTextView3.setLayoutParams(layoutParams4);
        if (dmtTextView3.getParent() == null) {
            linearLayout2.addView(dmtTextView3);
        }
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(dmtTextView);
        dmtTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.a7d), null, null, null);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(dmtTextView3);
        return linearLayout;
    }
}
