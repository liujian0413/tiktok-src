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
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.al */
public final class C2030al implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        relativeLayout.setBackgroundColor(Color.parseColor("#57292929"));
        relativeLayout.setVisibility(8);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        linearLayout.setId(R.id.bl5);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        linearLayout.setGravity(16);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(20, -1);
        }
        linearLayout.setLayoutParams(layoutParams);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.dw3);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(R.id.ax9);
        remoteImageView.setImageResource(R.drawable.amt);
        remoteImageView.setLayoutParams(layoutParams3);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        appCompatImageView.setId(R.id.b8y);
        appCompatImageView.setScaleType(ScaleType.CENTER);
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(11, -1);
        }
        appCompatImageView.setImageResource(R.drawable.a35);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(21, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.rightMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(15, -1);
        }
        appCompatImageView.setLayoutParams(layoutParams4);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(16, R.id.b8y);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            RelativeLayout.LayoutParams layoutParams6 = layoutParams5;
            i = R.id.bl5;
            layoutParams6.addRule(1, R.id.bl5);
        } else {
            i = R.id.bl5;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(17, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(0, R.id.b8y);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(15, -1);
        }
        linearLayout2.setLayoutParams(layoutParams5);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(layoutParams7);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView2.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView2.setTextSize(1, 13.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        dmtTextView2.setText(R.string.fpm);
        if (MarginLayoutParams.class.isInstance(layoutParams8) && VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.weight = 1.0f;
        }
        dmtTextView2.setTextColor(resources.getColorStateList(R.color.w4));
        dmtTextView2.setId(R.id.dsf);
        dmtTextView2.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView2.setEllipsize(TruncateAt.END);
        dmtTextView2.setMaxLines(1);
        dmtTextView2.setIncludeFontPadding(false);
        dmtTextView2.setLayoutParams(layoutParams8);
        if (dmtTextView2.getParent() == null) {
            linearLayout3.addView(dmtTextView2);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView3.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView3.setTextSize(1, 13.0f);
        dmtTextView3.setId(R.id.dvw);
        dmtTextView3.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
        dmtTextView3.setText(" | 热度35.2w");
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
        dmtTextView3.setMaxLines(1);
        dmtTextView3.setIncludeFontPadding(false);
        dmtTextView3.setTextColor(resources.getColorStateList(R.color.w4));
        dmtTextView3.setLayoutParams(layoutParams9);
        if (dmtTextView3.getParent() == null) {
            linearLayout3.addView(dmtTextView3);
        }
        C1444a.m7242a(relativeLayout);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(remoteImageView);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(linearLayout3);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(dmtTextView3);
        return relativeLayout;
    }
}
