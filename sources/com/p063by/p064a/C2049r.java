package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdRatingView;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.AdTagGroup;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.DescTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.r */
public final class C2049r implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        View view;
        DmtTextView dmtTextView;
        DescTextView descTextView;
        float f;
        LinearLayout linearLayout;
        DmtTextView dmtTextView2;
        DmtTextView dmtTextView3;
        DmtTextView dmtTextView4;
        int i;
        int i2;
        int i3;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(resources.getColor(R.color.v));
        linearLayout2.setId(R.id.aj7);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        linearLayout2.setGravity(17);
        linearLayout2.setVisibility(8);
        if (viewGroup2 != null) {
            linearLayout2.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout2);
            }
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        C13438a aVar = (C13438a) remoteImageView.getHierarchy();
        RoundingParams roundingParams = aVar.f35619a;
        aVar.mo32897a(roundingParams == null ? RoundingParams.m39399b(TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics())) : roundingParams.mo32879a(TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics())));
        remoteImageView.setId(R.id.c3);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        remoteImageView.setLayoutParams(layoutParams);
        if (remoteImageView.getParent() == null) {
            linearLayout2.addView(remoteImageView);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView5.setId(R.id.cj);
        dmtTextView5.setTextSize(2, 20.0f);
        dmtTextView5.setGravity(17);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView5.setTextColor(resources.getColorStateList(R.color.a5g));
        dmtTextView5.setLayoutParams(layoutParams2);
        if (dmtTextView5.getParent() == null) {
            linearLayout2.addView(dmtTextView5);
        }
        RemoteImageView remoteImageView2 = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        remoteImageView2.setBackgroundResource(R.drawable.h2);
        remoteImageView2.setId(R.id.c7);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        remoteImageView2.setLayoutParams(layoutParams3);
        if (remoteImageView2.getParent() == null) {
            linearLayout2.addView(remoteImageView2);
        }
        RemoteImageView remoteImageView3 = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()));
        remoteImageView3.setBackgroundResource(R.drawable.lg);
        C13438a aVar2 = (C13438a) remoteImageView3.getHierarchy();
        RoundingParams roundingParams2 = aVar2.f35619a;
        aVar2.mo32897a(roundingParams2 == null ? RoundingParams.m39399b(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())) : roundingParams2.mo32879a(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())));
        remoteImageView3.setId(R.id.du);
        remoteImageView3.setVisibility(8);
        remoteImageView3.setLayoutParams(layoutParams4);
        if (remoteImageView3.getParent() == null) {
            linearLayout2.addView(remoteImageView3);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout3.setId(R.id.f124296do);
        linearLayout3.setGravity(17);
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        linearLayout3.setLayoutParams(layoutParams5);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3);
        }
        DmtTextView dmtTextView6 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView6.setBackgroundResource(R.drawable.h7);
        dmtTextView6.setId(R.id.c_);
        dmtTextView6.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView6.getPaddingTop(), dmtTextView6.getPaddingRight(), dmtTextView6.getPaddingBottom());
        dmtTextView6.setPadding(dmtTextView6.getPaddingLeft(), dmtTextView6.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView6.getPaddingBottom());
        dmtTextView6.setTextSize(2, 12.0f);
        dmtTextView6.setPadding(dmtTextView6.getPaddingLeft(), dmtTextView6.getPaddingTop(), dmtTextView6.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        dmtTextView6.setMaxLines(1);
        dmtTextView6.setGravity(17);
        dmtTextView6.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView6.setLayoutParams(layoutParams6);
        if (dmtTextView6.getParent() == null) {
            linearLayout3.addView(dmtTextView6);
        }
        DmtTextView dmtTextView7 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView7.setId(R.id.dn);
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        dmtTextView7.setTextSize(2, 15.0f);
        dmtTextView7.setEllipsize(TruncateAt.END);
        dmtTextView7.setMaxLines(1);
        dmtTextView7.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView7.setLayoutParams(layoutParams7);
        if (dmtTextView7.getParent() == null) {
            linearLayout3.addView(dmtTextView7);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout4.setId(R.id.cf);
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(layoutParams8);
        if (linearLayout4.getParent() == null) {
            linearLayout2.addView(linearLayout4);
        }
        AdRatingView adRatingView = new AdRatingView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        adRatingView.setId(R.id.d3);
        adRatingView.setRatingStarNumber(5);
        adRatingView.setRatingUnImage(context.getResources().getDrawable(R.drawable.bk8));
        adRatingView.setRatingImage(context.getResources().getDrawable(R.drawable.bk7));
        adRatingView.setRatingDivide((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        adRatingView.setLayoutParams(layoutParams9);
        if (adRatingView.getParent() == null) {
            linearLayout4.addView(adRatingView);
        }
        View view2 = new View(context2);
        AdRatingView adRatingView2 = adRatingView;
        DmtTextView dmtTextView8 = dmtTextView7;
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        view2.setBackgroundColor(resources.getColor(R.color.a5y));
        view2.setId(R.id.cc);
        if (MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10) && VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginEnd((int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10) && VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.rightMargin = (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics());
        }
        view2.setLayoutParams(layoutParams10);
        if (view2.getParent() == null) {
            linearLayout4.addView(view2);
        }
        DmtTextView dmtTextView9 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView9.setId(R.id.b8);
        dmtTextView9.setTextSize(2, 12.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams11)) {
            view = view2;
            layoutParams11.bottomMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        } else {
            view = view2;
        }
        dmtTextView9.setTextColor(resources.getColorStateList(R.color.a6h));
        dmtTextView9.setLayoutParams(layoutParams11);
        if (dmtTextView9.getParent() == null) {
            linearLayout4.addView(dmtTextView9);
        }
        DescTextView descTextView2 = new DescTextView(context2);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        descTextView2.setId(R.id.bm);
        descTextView2.setTextSize(2, 14.0f);
        descTextView2.setMaxLines(3);
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            dmtTextView = dmtTextView9;
            layoutParams12.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView = dmtTextView9;
        }
        descTextView2.setGravity(1);
        descTextView2.setTextColor(resources.getColorStateList(R.color.a6h));
        descTextView2.setLayoutParams(layoutParams12);
        if (descTextView2.getParent() == null) {
            linearLayout2.addView(descTextView2);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout5.setId(R.id.d2);
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            descTextView = descTextView2;
            f = 8.5f;
            layoutParams13.topMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        } else {
            descTextView = descTextView2;
            f = 8.5f;
        }
        linearLayout5.setGravity(17);
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        linearLayout5.setLayoutParams(layoutParams13);
        if (linearLayout5.getParent() == null) {
            linearLayout2.addView(linearLayout5);
        }
        DmtTextView dmtTextView10 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView10.setText(R.string.dhb);
        dmtTextView10.setTextSize(2, 11.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = 80;
        }
        dmtTextView10.setGravity(17);
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            linearLayout = linearLayout4;
            layoutParams14.bottomMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        } else {
            linearLayout = linearLayout4;
        }
        dmtTextView10.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView10.setLayoutParams(layoutParams14);
        if (dmtTextView10.getParent() == null) {
            linearLayout5.addView(dmtTextView10);
        }
        DmtTextView dmtTextView11 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView11.setId(R.id.d1);
        dmtTextView11.setTextSize(2, 15.0f);
        dmtTextView11.setGravity(17);
        dmtTextView11.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView11.setLayoutParams(layoutParams15);
        if (dmtTextView11.getParent() == null) {
            linearLayout5.addView(dmtTextView11);
        }
        DmtTextView dmtTextView12 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView12.setId(R.id.d7);
        if (MarginLayoutParams.class.isInstance(layoutParams16)) {
            dmtTextView3 = dmtTextView11;
            dmtTextView2 = dmtTextView10;
            layoutParams16.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView2 = dmtTextView10;
            dmtTextView3 = dmtTextView11;
        }
        dmtTextView12.setTextSize(2, 12.0f);
        dmtTextView12.setEllipsize(TruncateAt.END);
        dmtTextView12.setMaxLines(1);
        dmtTextView12.setTextColor(resources.getColorStateList(R.color.a6h));
        dmtTextView12.setLayoutParams(layoutParams16);
        if (dmtTextView12.getParent() == null) {
            linearLayout5.addView(dmtTextView12);
        }
        AdTagGroup adTagGroup = new AdTagGroup(context2);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
        adTagGroup.setId(R.id.dm);
        if (MarginLayoutParams.class.isInstance(layoutParams17)) {
            dmtTextView4 = dmtTextView12;
            layoutParams17.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView4 = dmtTextView12;
        }
        adTagGroup.setLayoutParams(layoutParams17);
        if (adTagGroup.getParent() == null) {
            linearLayout2.addView(adTagGroup);
        }
        Space space = new Space(context2);
        AdTagGroup adTagGroup2 = adTagGroup;
        space.setLayoutParams(new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics())));
        if (space.getParent() == null) {
            linearLayout2.addView(space);
        }
        DmtTextView dmtTextView13 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView13.setBackgroundResource(R.drawable.gy);
        dmtTextView13.setId(R.id.aj4);
        dmtTextView13.setText(R.string.b4z);
        dmtTextView13.setTextSize(2, 15.0f);
        Space space2 = space;
        LinearLayout linearLayout6 = linearLayout5;
        DmtTextView dmtTextView14 = dmtTextView6;
        dmtTextView13.setPadding(dmtTextView13.getPaddingLeft(), dmtTextView13.getPaddingTop(), dmtTextView13.getPaddingRight(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            i = 17;
            layoutParams18.gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((FrameLayout.LayoutParams) layoutParams18).gravity = i;
        }
        dmtTextView13.setGravity(i);
        dmtTextView13.setTextColor(resources.getColorStateList(R.color.aye));
        dmtTextView13.setPadding(dmtTextView13.getPaddingLeft(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()), dmtTextView13.getPaddingRight(), dmtTextView13.getPaddingBottom());
        dmtTextView13.setLayoutParams(layoutParams18);
        if (dmtTextView13.getParent() == null) {
            linearLayout2.addView(dmtTextView13);
        }
        DmtTextView dmtTextView15 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView15.setId(R.id.aj8);
        dmtTextView15.setText(R.string.b51);
        dmtTextView15.setTextSize(2, 15.0f);
        dmtTextView15.setPadding(dmtTextView15.getPaddingLeft(), dmtTextView15.getPaddingTop(), dmtTextView15.getPaddingRight(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i2 = 17;
            layoutParams19.gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = i2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            i3 = 1;
            layoutParams19.topMargin = (int) TypedValue.applyDimension(1, 22.5f, resources.getDisplayMetrics());
        } else {
            i3 = 1;
        }
        dmtTextView15.setGravity(17);
        dmtTextView15.setTextColor(resources.getColorStateList(R.color.aye));
        dmtTextView15.setPadding(dmtTextView15.getPaddingLeft(), (int) TypedValue.applyDimension(i3, 9.5f, resources.getDisplayMetrics()), dmtTextView15.getPaddingRight(), dmtTextView15.getPaddingBottom());
        dmtTextView15.setLayoutParams(layoutParams19);
        if (dmtTextView15.getParent() == null) {
            linearLayout2.addView(dmtTextView15);
        }
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(remoteImageView);
        C1444a.m7242a(dmtTextView5);
        C1444a.m7242a(remoteImageView2);
        C1444a.m7242a(remoteImageView3);
        C1444a.m7242a(linearLayout3);
        C1444a.m7242a(dmtTextView14);
        C1444a.m7242a(dmtTextView8);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(adRatingView2);
        C1444a.m7242a(view);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(descTextView);
        C1444a.m7242a(linearLayout6);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(dmtTextView3);
        C1444a.m7242a(dmtTextView4);
        C1444a.m7242a(adTagGroup2);
        C1444a.m7242a(space2);
        C1444a.m7242a(dmtTextView13);
        C1444a.m7242a(dmtTextView15);
        return linearLayout2;
    }
}
