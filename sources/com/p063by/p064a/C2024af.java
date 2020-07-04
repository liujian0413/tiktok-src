package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.generic.C13438a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusAvatarWithBorderView;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.af */
public final class C2024af implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        ViewStub viewStub;
        AppCompatImageView appCompatImageView;
        int i;
        int i2;
        DmtTextView dmtTextView;
        int i3;
        LinearLayout linearLayout;
        int i4;
        int i5;
        LinearLayout linearLayout2;
        int i6;
        DmtTextView dmtTextView2;
        int i7;
        int i8;
        int i9;
        View view;
        int i10;
        int i11;
        DmtTextView dmtTextView3;
        boolean z2;
        int i12;
        DmtTextView dmtTextView4;
        boolean z3;
        int i13;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -2);
        frameLayout.setBackgroundColor(resources.getColor(R.color.a6c));
        frameLayout.setId(R.id.ckd);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(layoutParams);
        if (linearLayout3.getParent() == null) {
            frameLayout.addView(linearLayout3);
        }
        Space space = new Space(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        space.setId(R.id.d8x);
        space.setLayoutParams(layoutParams2);
        if (space.getParent() == null) {
            linearLayout3.addView(space);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (relativeLayout.getParent() == null) {
            linearLayout3.addView(relativeLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        frameLayout2.setId(R.id.amb);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.topMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(14, -1);
        }
        frameLayout2.setLayoutParams(layoutParams3);
        if (frameLayout2.getParent() == null) {
            relativeLayout.addView(frameLayout2);
        }
        MusAvatarWithBorderView musAvatarWithBorderView = new MusAvatarWithBorderView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        musAvatarWithBorderView.setId(R.id.aus);
        musAvatarWithBorderView.setScaleType(ScaleType.CENTER_INSIDE);
        if (VERSION.SDK_INT >= 26) {
            musAvatarWithBorderView.setDefaultFocusHighlightEnabled(false);
        }
        ((C13438a) musAvatarWithBorderView.getHierarchy()).mo32898b((int) R.drawable.a60);
        musAvatarWithBorderView.setLayoutParams(layoutParams4);
        if (musAvatarWithBorderView.getParent() == null) {
            frameLayout2.addView(musAvatarWithBorderView);
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        frameLayout3.setBackgroundResource(R.drawable.pb);
        frameLayout3.setId(R.id.c58);
        frameLayout3.setVisibility(8);
        frameLayout3.setLayoutParams(layoutParams5);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 17;
        }
        appCompatImageView2.setImageResource(R.drawable.axo);
        appCompatImageView2.setLayoutParams(layoutParams6);
        if (appCompatImageView2.getParent() == null) {
            frameLayout3.addView(appCompatImageView2);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 59.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        animationImageView.setId(R.id.ew);
        animationImageView.setScaleType(ScaleType.CENTER_CROP);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 8388693;
        }
        animationImageView.setVisibility(8);
        animationImageView.setImageResource(R.drawable.ab_);
        animationImageView.setLayoutParams(layoutParams7);
        if (animationImageView.getParent() == null) {
            frameLayout2.addView(animationImageView);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
        AnimationImageView animationImageView2 = animationImageView;
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 33.0f, resources.getDisplayMetrics()));
        appCompatImageView3.setId(R.id.b99);
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.topMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(7, R.id.amb);
        }
        appCompatImageView3.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(19, R.id.amb);
        }
        appCompatImageView3.setLayoutParams(layoutParams8);
        if (appCompatImageView3.getParent() == null) {
            relativeLayout.addView(appCompatImageView3);
        }
        ViewStub viewStub2 = new ViewStub(context2);
        AppCompatImageView appCompatImageView4 = appCompatImageView3;
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.a_k, typedValue, true);
        viewStub2.setLayoutResource(typedValue.resourceId);
        viewStub2.setId(R.id.ef4);
        if (MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.topMargin = (int) TypedValue.applyDimension(1, 26.0f, resources.getDisplayMetrics());
        }
        viewStub2.setLayoutParams(layoutParams9);
        if (viewStub2.getParent() == null) {
            relativeLayout.addView(viewStub2);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10)) {
            viewStub = viewStub2;
            layoutParams10.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            viewStub = viewStub2;
        }
        linearLayout4.setLayoutParams(layoutParams10);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView5.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView5.setTextSize(1, 14.0f);
        dmtTextView5.setId(R.id.e9_);
        dmtTextView5.setFontType("medium");
        dmtTextView5.setTextColor(resources.getColorStateList(R.color.ac8));
        dmtTextView5.setLayoutParams(layoutParams11);
        if (dmtTextView5.getParent() == null) {
            linearLayout4.addView(dmtTextView5);
        }
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context2);
        DmtTextView dmtTextView6 = dmtTextView5;
        AppCompatImageView appCompatImageView6 = appCompatImageView2;
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        appCompatImageView5.setId(R.id.bv4);
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12) && VERSION.SDK_INT >= 17) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = 16;
        }
        appCompatImageView5.setVisibility(8);
        appCompatImageView5.setImageResource(R.drawable.ayv);
        appCompatImageView5.setLayoutParams(layoutParams12);
        if (appCompatImageView5.getParent() == null) {
            linearLayout4.addView(appCompatImageView5);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 29.0f, resources.getDisplayMetrics()));
        relativeLayout2.setId(R.id.e_7);
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            appCompatImageView = appCompatImageView5;
            layoutParams13.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView = appCompatImageView5;
        }
        relativeLayout2.setLayoutParams(layoutParams13);
        if (relativeLayout2.getParent() == null) {
            linearLayout3.addView(relativeLayout2);
        }
        DmtTextView dmtTextView7 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView7.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView7.setTextSize(1, 14.0f);
        LinearLayout linearLayout5 = linearLayout4;
        dmtTextView7.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView7.getPaddingTop(), dmtTextView7.getPaddingRight(), dmtTextView7.getPaddingBottom());
        FrameLayout frameLayout4 = frameLayout3;
        dmtTextView7.setPadding(dmtTextView7.getPaddingLeft(), dmtTextView7.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView7.getPaddingBottom());
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams14).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = i;
        }
        dmtTextView7.setFontType("medium");
        dmtTextView7.setTextColor(resources.getColorStateList(R.color.sw));
        dmtTextView7.setBackgroundResource(R.drawable.bet);
        dmtTextView7.setId(R.id.c2_);
        dmtTextView7.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView7.getPaddingTop(), dmtTextView7.getPaddingRight(), dmtTextView7.getPaddingBottom());
        dmtTextView7.setPadding(dmtTextView7.getPaddingLeft(), dmtTextView7.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView7.getPaddingBottom());
        MusAvatarWithBorderView musAvatarWithBorderView2 = musAvatarWithBorderView;
        dmtTextView7.setPadding(dmtTextView7.getPaddingLeft(), dmtTextView7.getPaddingTop(), dmtTextView7.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView7.setMaxLines(1);
        dmtTextView7.setGravity(16);
        dmtTextView7.setVisibility(0);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(14, -1);
        }
        dmtTextView7.setPadding(dmtTextView7.getPaddingLeft(), (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()), dmtTextView7.getPaddingRight(), dmtTextView7.getPaddingBottom());
        dmtTextView7.setLayoutParams(layoutParams14);
        if (dmtTextView7.getParent() == null) {
            relativeLayout2.addView(dmtTextView7);
        }
        DmtTextView dmtTextView8 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView8.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView8.setTextSize(1, 14.0f);
        dmtTextView8.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView8.getPaddingTop(), dmtTextView8.getPaddingRight(), dmtTextView8.getPaddingBottom());
        dmtTextView8.setPadding(dmtTextView8.getPaddingLeft(), dmtTextView8.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView8.getPaddingBottom());
        dmtTextView8.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView8.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView8.setBackgroundResource(R.drawable.bet);
        dmtTextView8.setId(R.id.k8);
        dmtTextView8.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView8.getPaddingTop(), dmtTextView8.getPaddingRight(), dmtTextView8.getPaddingBottom());
        dmtTextView8.setPadding(dmtTextView8.getPaddingLeft(), dmtTextView8.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView8.getPaddingBottom());
        dmtTextView8.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.amr), dmtTextView8.getCompoundDrawablesRelative()[1], dmtTextView8.getCompoundDrawablesRelative()[2], dmtTextView8.getCompoundDrawablesRelative()[3]);
        dmtTextView8.setEllipsize(TruncateAt.END);
        DmtTextView dmtTextView9 = dmtTextView7;
        dmtTextView8.setPadding(dmtTextView8.getPaddingLeft(), dmtTextView8.getPaddingTop(), dmtTextView8.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView8.setMaxLines(1);
        dmtTextView8.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(14, -1);
        }
        dmtTextView8.setPadding(dmtTextView8.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView8.getPaddingRight(), dmtTextView8.getPaddingBottom());
        dmtTextView8.setLayoutParams(layoutParams15);
        if (dmtTextView8.getParent() == null) {
            relativeLayout2.addView(dmtTextView8);
        }
        DmtTextView dmtTextView10 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView10.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView10.setTextSize(1, 14.0f);
        dmtTextView10.setFontType("medium");
        dmtTextView10.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView10.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView10.setBackgroundResource(R.drawable.bet);
        dmtTextView10.setId(R.id.afg);
        dmtTextView10.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView10.getPaddingTop(), dmtTextView10.getPaddingRight(), dmtTextView10.getPaddingBottom());
        dmtTextView10.setPadding(dmtTextView10.getPaddingLeft(), dmtTextView10.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView10.getPaddingBottom());
        dmtTextView10.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.amn), dmtTextView10.getCompoundDrawablesRelative()[1], dmtTextView10.getCompoundDrawablesRelative()[2], dmtTextView10.getCompoundDrawablesRelative()[3]);
        dmtTextView10.setEllipsize(TruncateAt.END);
        DmtTextView dmtTextView11 = dmtTextView8;
        dmtTextView10.setPadding(dmtTextView10.getPaddingLeft(), dmtTextView10.getPaddingTop(), dmtTextView10.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        dmtTextView10.setMaxLines(1);
        dmtTextView10.setGravity(16);
        dmtTextView10.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.addRule(14, -1);
        }
        dmtTextView10.setPadding(dmtTextView10.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), dmtTextView10.getPaddingRight(), dmtTextView10.getPaddingBottom());
        dmtTextView10.setLayoutParams(layoutParams16);
        if (dmtTextView10.getParent() == null) {
            relativeLayout2.addView(dmtTextView10);
        }
        DmtTextView dmtTextView12 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView12.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView12.setTextSize(1, 14.0f);
        dmtTextView12.setFontType("medium");
        dmtTextView12.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView12.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView12.setBackgroundResource(R.drawable.bet);
        dmtTextView12.setId(R.id.dl7);
        dmtTextView12.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView12.getPaddingTop(), dmtTextView12.getPaddingRight(), dmtTextView12.getPaddingBottom());
        dmtTextView12.setPadding(dmtTextView12.getPaddingLeft(), dmtTextView12.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView12.getPaddingBottom());
        dmtTextView12.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.amr), dmtTextView12.getCompoundDrawablesRelative()[1], dmtTextView12.getCompoundDrawablesRelative()[2], dmtTextView12.getCompoundDrawablesRelative()[3]);
        dmtTextView12.setEllipsize(TruncateAt.END);
        DmtTextView dmtTextView13 = dmtTextView10;
        dmtTextView12.setPadding(dmtTextView12.getPaddingLeft(), dmtTextView12.getPaddingTop(), dmtTextView12.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        dmtTextView12.setMaxLines(1);
        dmtTextView12.setGravity(16);
        dmtTextView12.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.addRule(14, -1);
        }
        dmtTextView12.setPadding(dmtTextView12.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), dmtTextView12.getPaddingRight(), dmtTextView12.getPaddingBottom());
        dmtTextView12.setLayoutParams(layoutParams17);
        if (dmtTextView12.getParent() == null) {
            relativeLayout2.addView(dmtTextView12);
        }
        DmtTextView dmtTextView14 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView14.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView14.setTextSize(1, 14.0f);
        dmtTextView14.setFontType("medium");
        dmtTextView14.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView14.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView14.setBackgroundResource(R.drawable.bet);
        dmtTextView14.setId(R.id.c2a);
        dmtTextView14.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView14.getPaddingTop(), dmtTextView14.getPaddingRight(), dmtTextView14.getPaddingBottom());
        dmtTextView14.setPadding(dmtTextView14.getPaddingLeft(), dmtTextView14.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtTextView14.getPaddingBottom());
        dmtTextView14.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.amr), dmtTextView14.getCompoundDrawablesRelative()[1], dmtTextView14.getCompoundDrawablesRelative()[2], dmtTextView14.getCompoundDrawablesRelative()[3]);
        dmtTextView14.setEllipsize(TruncateAt.END);
        DmtTextView dmtTextView15 = dmtTextView12;
        dmtTextView14.setPadding(dmtTextView14.getPaddingLeft(), dmtTextView14.getPaddingTop(), dmtTextView14.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        dmtTextView14.setMaxLines(1);
        dmtTextView14.setGravity(16);
        dmtTextView14.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(14, -1);
        }
        dmtTextView14.setPadding(dmtTextView14.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), dmtTextView14.getPaddingRight(), dmtTextView14.getPaddingBottom());
        dmtTextView14.setLayoutParams(layoutParams18);
        if (dmtTextView14.getParent() == null) {
            relativeLayout2.addView(dmtTextView14);
        }
        EnterpriseTransformLayout enterpriseTransformLayout = new EnterpriseTransformLayout(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        enterpriseTransformLayout.setId(R.id.ckx);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i2 = 1;
            layoutParams19.gravity = 1;
        } else {
            i2 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = i2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.topMargin = (int) TypedValue.applyDimension(i2, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.bottomMargin = (int) TypedValue.applyDimension(i2, 2.0f, resources.getDisplayMetrics());
        }
        enterpriseTransformLayout.setLayoutParams(layoutParams19);
        if (enterpriseTransformLayout.getParent() == null) {
            linearLayout3.addView(enterpriseTransformLayout);
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout6.setId(R.id.cre);
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.leftMargin = (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams20) && VERSION.SDK_INT >= 17) {
            layoutParams20.setMarginStart((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams20) && VERSION.SDK_INT >= 17) {
            layoutParams20.setMarginEnd((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        linearLayout6.setOrientation(0);
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.rightMargin = (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics());
        }
        linearLayout6.setLayoutParams(layoutParams20);
        if (linearLayout6.getParent() == null) {
            linearLayout3.addView(linearLayout6);
        }
        LinearLayout linearLayout7 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        linearLayout7.setId(R.id.aoa);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.weight = 1.0f;
        }
        linearLayout7.setOrientation(1);
        linearLayout7.setLayoutParams(layoutParams21);
        if (linearLayout7.getParent() == null) {
            linearLayout6.addView(linearLayout7);
        }
        DmtTextView dmtTextView16 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, -2);
        EnterpriseTransformLayout enterpriseTransformLayout2 = enterpriseTransformLayout;
        dmtTextView16.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView16.setTextSize(1, 17.0f);
        dmtTextView16.setId(R.id.ao9);
        dmtTextView16.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((FrameLayout.LayoutParams) layoutParams22).gravity = 1;
        }
        dmtTextView16.setGravity(17);
        dmtTextView16.setFontType("bold");
        dmtTextView16.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView16.setLayoutParams(layoutParams22);
        if (dmtTextView16.getParent() == null) {
            linearLayout7.addView(dmtTextView16);
        }
        DmtTextView dmtTextView17 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-1, -2);
        DmtTextView dmtTextView18 = dmtTextView16;
        dmtTextView17.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView17.setTextSize(1, 13.0f);
        dmtTextView17.setId(R.id.ao_);
        dmtTextView17.setText(R.string.ccq);
        dmtTextView17.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23)) {
            dmtTextView = dmtTextView14;
            layoutParams23.topMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        } else {
            dmtTextView = dmtTextView14;
        }
        dmtTextView17.setGravity(17);
        dmtTextView17.setFontType("regular");
        dmtTextView17.setTextColor(resources.getColorStateList(R.color.sw));
        dmtTextView17.setLayoutParams(layoutParams23);
        if (dmtTextView17.getParent() == null) {
            linearLayout7.addView(dmtTextView17);
        }
        View view2 = new View(context2);
        DmtTextView dmtTextView19 = dmtTextView17;
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        view2.setBackgroundColor(resources.getColor(R.color.am));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams24)) {
            i3 = 16;
            layoutParams24.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((FrameLayout.LayoutParams) layoutParams24).gravity = i3;
        }
        view2.setLayoutParams(layoutParams24);
        if (view2.getParent() == null) {
            linearLayout6.addView(view2);
        }
        LinearLayout linearLayout8 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        linearLayout8.setId(R.id.ao6);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.weight = 1.0f;
        }
        linearLayout8.setOrientation(1);
        linearLayout8.setLayoutParams(layoutParams25);
        if (linearLayout8.getParent() == null) {
            linearLayout6.addView(linearLayout8);
        }
        DmtTextView dmtTextView20 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-1, -2);
        View view3 = view2;
        dmtTextView20.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView20.setTextSize(1, 17.0f);
        dmtTextView20.setId(R.id.ao4);
        dmtTextView20.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams26)) {
            layoutParams26.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams26)) {
            ((FrameLayout.LayoutParams) layoutParams26).gravity = 1;
        }
        dmtTextView20.setGravity(17);
        dmtTextView20.setFontType("bold");
        dmtTextView20.setTextColor(resources.getColorStateList(R.color.sk));
        dmtTextView20.setLayoutParams(layoutParams26);
        if (dmtTextView20.getParent() == null) {
            linearLayout8.addView(dmtTextView20);
        }
        DmtTextView dmtTextView21 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-1, -2);
        DmtTextView dmtTextView22 = dmtTextView20;
        dmtTextView21.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView21.setTextSize(1, 13.0f);
        dmtTextView21.setId(R.id.ao5);
        dmtTextView21.setText(R.string.ccm);
        dmtTextView21.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams27)) {
            ((FrameLayout.LayoutParams) layoutParams27).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams27)) {
            linearLayout = linearLayout7;
            layoutParams27.topMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        } else {
            linearLayout = linearLayout7;
        }
        dmtTextView21.setGravity(17);
        dmtTextView21.setFontType("regular");
        dmtTextView21.setTextColor(resources.getColorStateList(R.color.sw));
        dmtTextView21.setLayoutParams(layoutParams27);
        if (dmtTextView21.getParent() == null) {
            linearLayout8.addView(dmtTextView21);
        }
        View view4 = new View(context2);
        DmtTextView dmtTextView23 = dmtTextView21;
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        view4.setBackgroundColor(resources.getColor(R.color.am));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams28)) {
            i4 = 16;
            layoutParams28.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams28)) {
            ((FrameLayout.LayoutParams) layoutParams28).gravity = i4;
        }
        view4.setLayoutParams(layoutParams28);
        if (view4.getParent() == null) {
            linearLayout6.addView(view4);
        }
        LinearLayout linearLayout9 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams29 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        linearLayout9.setId(R.id.abf);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.weight = 1.0f;
        }
        linearLayout9.setOrientation(1);
        linearLayout9.setLayoutParams(layoutParams29);
        if (linearLayout9.getParent() == null) {
            linearLayout6.addView(linearLayout9);
        }
        DmtTextView dmtTextView24 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams30 = new LinearLayout.LayoutParams(-1, -2);
        View view5 = view4;
        dmtTextView24.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView24.setTextSize(1, 17.0f);
        dmtTextView24.setId(R.id.a87);
        dmtTextView24.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams30)) {
            i5 = 17;
            layoutParams30.gravity = 17;
        } else {
            i5 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams30)) {
            ((FrameLayout.LayoutParams) layoutParams30).gravity = i5;
        }
        dmtTextView24.setGravity(i5);
        dmtTextView24.setFontType("bold");
        dmtTextView24.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView24.setLayoutParams(layoutParams30);
        if (dmtTextView24.getParent() == null) {
            linearLayout9.addView(dmtTextView24);
        }
        DmtTextView dmtTextView25 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams31 = new LinearLayout.LayoutParams(-1, -2);
        DmtTextView dmtTextView26 = dmtTextView24;
        dmtTextView25.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView25.setTextSize(1, 13.0f);
        dmtTextView25.setId(R.id.a88);
        dmtTextView25.setText(R.string.cdf);
        dmtTextView25.setEllipsize(TruncateAt.END);
        dmtTextView25.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams31)) {
            layoutParams31.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams31)) {
            ((FrameLayout.LayoutParams) layoutParams31).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams31)) {
            linearLayout2 = linearLayout8;
            layoutParams31.topMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        } else {
            linearLayout2 = linearLayout8;
        }
        dmtTextView25.setGravity(17);
        dmtTextView25.setFontType("regular");
        dmtTextView25.setTextColor(resources.getColorStateList(R.color.sw));
        dmtTextView25.setLayoutParams(layoutParams31);
        if (dmtTextView25.getParent() == null) {
            linearLayout9.addView(dmtTextView25);
        }
        LinearLayout linearLayout10 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams32)) {
            i6 = 1;
            layoutParams32.gravity = 1;
        } else {
            i6 = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams32)) {
            ((FrameLayout.LayoutParams) layoutParams32).gravity = i6;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams32)) {
            dmtTextView2 = dmtTextView25;
            layoutParams32.topMargin = (int) TypedValue.applyDimension(i6, 20.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView2 = dmtTextView25;
        }
        linearLayout10.setOrientation(0);
        linearLayout10.setLayoutParams(layoutParams32);
        if (linearLayout10.getParent() == null) {
            linearLayout3.addView(linearLayout10);
        }
        DmtButton dmtButton = new DmtButton(context2);
        LinearLayout.LayoutParams layoutParams33 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        dmtButton.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtButton.setTextSize(1, 15.0f);
        dmtButton.setText(R.string.ay3);
        LinearLayout linearLayout11 = linearLayout9;
        dmtButton.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtButton.getPaddingTop(), dmtButton.getPaddingRight(), dmtButton.getPaddingBottom());
        LinearLayout linearLayout12 = linearLayout6;
        dmtButton.setPadding(dmtButton.getPaddingLeft(), dmtButton.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtButton.getPaddingBottom());
        dmtButton.setAutoSizeTextTypeWithDefaults(1);
        dmtButton.setMaxWidth((int) TypedValue.applyDimension(1, 160.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams33)) {
            i7 = 16;
            layoutParams33.gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams33)) {
            ((FrameLayout.LayoutParams) layoutParams33).gravity = i7;
        }
        dmtButton.setFontType("medium");
        dmtButton.setTextColor(resources.getColorStateList(R.color.sj));
        dmtButton.setBackgroundResource(R.drawable.bb0);
        dmtButton.setId(R.id.c2o);
        dmtButton.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtButton.getPaddingTop(), dmtButton.getPaddingRight(), dmtButton.getPaddingBottom());
        if (TextView.class.isInstance(dmtButton)) {
            C1444a.m7243a(dmtButton, (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        } else {
            dmtButton.setMinimumWidth((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        }
        dmtButton.setPadding(dmtButton.getPaddingLeft(), dmtButton.getPaddingTop(), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), dmtButton.getPaddingBottom());
        RelativeLayout relativeLayout3 = relativeLayout2;
        dmtButton.setPadding(dmtButton.getPaddingLeft(), dmtButton.getPaddingTop(), dmtButton.getPaddingRight(), (int) TypedValue.applyDimension(1, 13.5f, resources.getDisplayMetrics()));
        dmtButton.setAllCaps(false);
        dmtButton.setMaxLines(1);
        if (VERSION.SDK_INT >= 26) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.a19, typedValue2, true);
            dmtButton.setForeground(context2.getDrawable(typedValue2.resourceId));
        }
        dmtButton.setGravity(17);
        dmtButton.setPadding(dmtButton.getPaddingLeft(), (int) TypedValue.applyDimension(1, 13.5f, resources.getDisplayMetrics()), dmtButton.getPaddingRight(), dmtButton.getPaddingBottom());
        dmtButton.setLayoutParams(layoutParams33);
        if (dmtButton.getParent() == null) {
            linearLayout10.addView(dmtButton);
        }
        AppCompatImageView appCompatImageView7 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        appCompatImageView7.setBackgroundResource(R.drawable.ber);
        appCompatImageView7.setId(R.id.me);
        appCompatImageView7.setScaleType(ScaleType.CENTER_INSIDE);
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.leftMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams34) && VERSION.SDK_INT >= 17) {
            layoutParams34.setMarginStart((int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams34)) {
            i8 = 16;
            layoutParams34.gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams34)) {
            ((FrameLayout.LayoutParams) layoutParams34).gravity = i8;
        }
        appCompatImageView7.setImageResource(R.drawable.ayq);
        appCompatImageView7.setLayoutParams(layoutParams34);
        if (appCompatImageView7.getParent() == null) {
            linearLayout10.addView(appCompatImageView7);
        }
        RelativeLayout relativeLayout4 = new RelativeLayout(context2);
        LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        relativeLayout4.setId(R.id.c2m);
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.leftMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams35) && VERSION.SDK_INT >= 17) {
            layoutParams35.setMarginStart((int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics()));
        }
        relativeLayout4.setLayoutParams(layoutParams35);
        if (relativeLayout4.getParent() == null) {
            linearLayout10.addView(relativeLayout4);
        }
        AppCompatImageView appCompatImageView8 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        appCompatImageView8.setBackgroundResource(R.drawable.ber);
        appCompatImageView8.setId(R.id.aiy);
        appCompatImageView8.setScaleType(ScaleType.CENTER_INSIDE);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams36)) {
            layoutParams36.addRule(13, -1);
        }
        appCompatImageView8.setImageResource(R.drawable.ali);
        appCompatImageView8.setLayoutParams(layoutParams36);
        if (appCompatImageView8.getParent() == null) {
            relativeLayout4.addView(appCompatImageView8);
        }
        View view6 = new View(context2);
        AppCompatImageView appCompatImageView9 = appCompatImageView8;
        AppCompatImageView appCompatImageView10 = appCompatImageView7;
        RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        view6.setBackgroundResource(R.drawable.rh);
        view6.setId(R.id.aiz);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams37)) {
            i9 = -1;
            layoutParams37.addRule(11, -1);
        } else {
            i9 = -1;
        }
        view6.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.addRule(21, i9);
        }
        view6.setLayoutParams(layoutParams37);
        if (view6.getParent() == null) {
            relativeLayout4.addView(view6);
        }
        DmtTextView dmtTextView27 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams38 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView27.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView27.setTextSize(1, 14.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            view = view6;
            layoutParams38.leftMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        } else {
            view = view6;
        }
        dmtTextView27.setText(R.string.dum);
        if (MarginLayoutParams.class.isInstance(layoutParams38) && VERSION.SDK_INT >= 17) {
            layoutParams38.setMarginStart((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams38) || VERSION.SDK_INT < 17) {
            i10 = 1;
        } else {
            i10 = 1;
            layoutParams38.setMarginEnd((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.gravity = i10;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams38)) {
            ((FrameLayout.LayoutParams) layoutParams38).gravity = i10;
        }
        dmtTextView27.setMinLines(2);
        dmtTextView27.setFontType("regular");
        dmtTextView27.setTextColor(resources.getColorStateList(R.color.a55));
        dmtTextView27.setId(R.id.e_2);
        dmtTextView27.setMaxLines(5);
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            i11 = 1;
            layoutParams38.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            i11 = 1;
        }
        dmtTextView27.setGravity(17);
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.rightMargin = (int) TypedValue.applyDimension(i11, 40.0f, resources.getDisplayMetrics());
        }
        dmtTextView27.setLayoutParams(layoutParams38);
        if (dmtTextView27.getParent() == null) {
            linearLayout3.addView(dmtTextView27);
        }
        DmtTextView dmtTextView28 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams39 = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams39)) {
            dmtTextView3 = dmtTextView27;
            z2 = true;
            layoutParams39.leftMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView3 = dmtTextView27;
            z2 = true;
        }
        dmtTextView28.setTextSize(z2 ? 1 : 0, 14.0f);
        dmtTextView28.setSingleLine(z2);
        if (MarginLayoutParams.class.isInstance(layoutParams39) && VERSION.SDK_INT >= 17) {
            layoutParams39.setMarginStart((int) TypedValue.applyDimension(z2, 40.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams39) || VERSION.SDK_INT < 17) {
            i12 = 1;
        } else {
            i12 = 1;
            layoutParams39.setMarginEnd((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.gravity = i12;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams39)) {
            ((FrameLayout.LayoutParams) layoutParams39).gravity = i12;
        }
        dmtTextView28.setFontType("medium");
        dmtTextView28.setTextColor(resources.getColorStateList(R.color.w4));
        dmtTextView28.setId(R.id.e_9);
        dmtTextView28.setEllipsize(TruncateAt.END);
        if (MarginLayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        dmtTextView28.setGravity(17);
        dmtTextView28.setMaxEms(39);
        if (MarginLayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.rightMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        dmtTextView28.setLayoutParams(layoutParams39);
        if (dmtTextView28.getParent() == null) {
            linearLayout3.addView(dmtTextView28);
        }
        DmtTextView dmtTextView29 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams40 = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            dmtTextView4 = dmtTextView28;
            z3 = true;
            layoutParams40.leftMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView4 = dmtTextView28;
            z3 = true;
        }
        dmtTextView29.setTextSize(z3 ? 1 : 0, 14.0f);
        dmtTextView29.setSingleLine(z3);
        if (MarginLayoutParams.class.isInstance(layoutParams40) && VERSION.SDK_INT >= 17) {
            layoutParams40.setMarginStart((int) TypedValue.applyDimension(z3, 40.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams40) || VERSION.SDK_INT < 17) {
            i13 = 1;
        } else {
            i13 = 1;
            layoutParams40.setMarginEnd((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.gravity = i13;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams40)) {
            ((FrameLayout.LayoutParams) layoutParams40).gravity = i13;
        }
        dmtTextView29.setFontType("medium");
        dmtTextView29.setTextColor(resources.getColorStateList(R.color.w4));
        dmtTextView29.setId(R.id.e92);
        dmtTextView29.setEllipsize(TruncateAt.END);
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView29.setGravity(17);
        dmtTextView29.setMaxEms(39);
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.rightMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        dmtTextView29.setLayoutParams(layoutParams40);
        if (dmtTextView29.getParent() == null) {
            linearLayout3.addView(dmtTextView29);
        }
        TranslationStatusView translationStatusView = new TranslationStatusView(context2);
        LinearLayout.LayoutParams layoutParams41 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        translationStatusView.setId(R.id.dnl);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams41)) {
            layoutParams41.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams41)) {
            ((FrameLayout.LayoutParams) layoutParams41).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams41)) {
            layoutParams41.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        translationStatusView.setVisibility(8);
        translationStatusView.setLayoutParams(layoutParams41);
        if (translationStatusView.getParent() == null) {
            linearLayout3.addView(translationStatusView);
        }
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(linearLayout3);
        C1444a.m7242a(space);
        C1444a.m7242a(relativeLayout);
        C1444a.m7242a(frameLayout2);
        C1444a.m7242a(musAvatarWithBorderView2);
        C1444a.m7242a(frameLayout4);
        C1444a.m7242a(appCompatImageView6);
        C1444a.m7242a(animationImageView2);
        C1444a.m7242a(appCompatImageView4);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(linearLayout5);
        C1444a.m7242a(dmtTextView6);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(relativeLayout3);
        C1444a.m7242a(dmtTextView9);
        C1444a.m7242a(dmtTextView11);
        dmtTextView11.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amr), null, null, null);
        C1444a.m7242a(dmtTextView13);
        dmtTextView13.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amn), null, null, null);
        C1444a.m7242a(dmtTextView15);
        dmtTextView15.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amr), null, null, null);
        C1444a.m7242a(dmtTextView);
        dmtTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amr), null, null, null);
        C1444a.m7242a(enterpriseTransformLayout2);
        C1444a.m7242a(linearLayout12);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(dmtTextView18);
        C1444a.m7242a(dmtTextView19);
        C1444a.m7242a(view3);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(dmtTextView22);
        C1444a.m7242a(dmtTextView23);
        C1444a.m7242a(view5);
        C1444a.m7242a(linearLayout11);
        C1444a.m7242a(dmtTextView26);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(linearLayout10);
        C1444a.m7242a(dmtButton);
        dmtButton.setAutoSizeTextTypeUniformWithConfiguration(13, 112, 1, 1);
        C1444a.m7242a(appCompatImageView10);
        C1444a.m7242a(relativeLayout4);
        C1444a.m7242a(appCompatImageView9);
        C1444a.m7242a(view);
        C1444a.m7242a(dmtTextView3);
        C1444a.m7242a(dmtTextView4);
        C1444a.m7242a(dmtTextView29);
        C1444a.m7242a(translationStatusView);
        return frameLayout;
    }
}
