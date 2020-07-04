package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.widget.AppCompatImageView;
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
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.ab */
public final class C2020ab implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, -1);
        linearLayout.setId(R.id.a91);
        linearLayout.setGravity(8388629);
        linearLayout.setOrientation(1);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.an9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 21;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 21;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, -36.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setVisibility(8);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setId(R.id.an_);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 21;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 21;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, -36.0f, resources.getDisplayMetrics());
        }
        appCompatImageView2.setVisibility(8);
        appCompatImageView2.setLayoutParams(layoutParams2);
        if (appCompatImageView2.getParent() == null) {
            linearLayout.addView(appCompatImageView2);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        appCompatImageView3.setId(R.id.ana);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 21;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 21;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, -36.0f, resources.getDisplayMetrics());
        }
        appCompatImageView3.setVisibility(8);
        appCompatImageView3.setLayoutParams(layoutParams3);
        if (appCompatImageView3.getParent() == null) {
            linearLayout.addView(appCompatImageView3);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.h3), (int) resources.getDimension(R.dimen.h0));
        frameLayout.setBackgroundResource(R.drawable.lh);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.d51);
        frameLayout.setLayoutParams(layoutParams4);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -1);
        remoteImageView.setId(R.id.d5a);
        remoteImageView.setImageResource(R.drawable.a8t);
        remoteImageView.setLayoutParams(layoutParams5);
        if (remoteImageView.getParent() == null) {
            frameLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.px));
        dmtTextView.setTextColor(resources.getColorStateList(R.color.yk));
        dmtTextView.setId(R.id.d54);
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, -1.4f, resources.getDisplayMetrics());
        }
        dmtTextView.setGravity(17);
        dmtTextView.setLayoutParams(layoutParams6);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(appCompatImageView2);
        C1444a.m7242a(appCompatImageView3);
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(remoteImageView);
        C1444a.m7242a(dmtTextView);
        return linearLayout;
    }
}
