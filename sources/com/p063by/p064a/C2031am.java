package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
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
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.am */
public final class C2031am implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        relativeLayout.setBackgroundColor(Color.parseColor("#57161823"));
        relativeLayout.setId(R.id.bz6);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        linearLayout.setId(R.id.bzh);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        linearLayout.setGravity(16);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        linearLayout.setLayoutParams(layoutParams);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.bz_);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setImageResource(R.drawable.a38);
        appCompatImageView.setLayoutParams(layoutParams2);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView.setTextSize(1, 13.0f);
        dmtTextView.setId(R.id.bza);
        dmtTextView.setTypeface(Typeface.defaultFromStyle(1));
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setText("合集");
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setTextColor(resources.getColorStateList(R.color.aze));
        dmtTextView.setLayoutParams(layoutParams3);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        appCompatImageView2.setImageResource(R.drawable.bas);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.rightMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        appCompatImageView2.setLayoutParams(layoutParams4);
        if (appCompatImageView2.getParent() == null) {
            linearLayout.addView(appCompatImageView2);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        appCompatImageView3.setId(R.id.bz4);
        appCompatImageView3.setScaleType(ScaleType.CENTER);
        if (MarginLayoutParams.class.isInstance(layoutParams5) && VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(11, -1);
        }
        appCompatImageView3.setImageResource(R.drawable.a34);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(21, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(15, -1);
        }
        appCompatImageView3.setLayoutParams(layoutParams5);
        if (appCompatImageView3.getParent() == null) {
            relativeLayout.addView(appCompatImageView3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(16, R.id.bz4);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            RelativeLayout.LayoutParams layoutParams7 = layoutParams6;
            i = R.id.bzh;
            layoutParams7.addRule(1, R.id.bzh);
        } else {
            i = R.id.bzh;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(17, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(0, R.id.bz4);
        }
        linearLayout2.setLayoutParams(layoutParams6);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView2.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView2.setTextSize(1, 13.0f);
        dmtTextView2.setId(R.id.bz2);
        dmtTextView2.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView2.setEllipsize(TruncateAt.END);
        dmtTextView2.setMaxLines(1);
        dmtTextView2.setIncludeFontPadding(false);
        dmtTextView2.setTextColor(resources.getColorStateList(R.color.aze));
        dmtTextView2.setLayoutParams(layoutParams8);
        if (dmtTextView2.getParent() == null) {
            linearLayout2.addView(dmtTextView2);
        }
        C1444a.m7242a(relativeLayout);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(appCompatImageView2);
        C1444a.m7242a(appCompatImageView3);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(dmtTextView2);
        return relativeLayout;
    }
}
