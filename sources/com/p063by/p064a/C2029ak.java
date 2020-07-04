package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
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
import android.widget.Space;
import android.widget.TableLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarBorderView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BindAccountView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.ConnectedRelationView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.ProfileStarRankView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.ak */
public final class C2029ak implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        View view;
        Space space;
        View view2;
        int i;
        FrameLayout frameLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        AppCompatImageView appCompatImageView;
        FrameLayout frameLayout2;
        DmtTextView dmtTextView;
        BindAccountView bindAccountView;
        int i6;
        FrameLayout frameLayout3;
        DmtTextView dmtTextView2;
        int i7;
        DmtTextView dmtTextView3;
        int i8;
        DmtTextView dmtTextView4;
        int i9;
        DmtTextView dmtTextView5;
        int i10;
        DmtTextView dmtTextView6;
        int i11;
        ConnectedRelationView connectedRelationView;
        int i12;
        AppCompatImageView appCompatImageView2;
        View view3;
        int i13;
        DmtTextView dmtTextView7;
        DmtTextView dmtTextView8;
        DmtTextView dmtTextView9;
        TranslationStatusView translationStatusView;
        int i14;
        EnterpriseTransformLayout enterpriseTransformLayout;
        LinearLayout linearLayout;
        View view4;
        DmtTextView dmtTextView10;
        int i15;
        DmtTextView dmtTextView11;
        int i16;
        DmtTextView dmtTextView12;
        LinearLayout linearLayout2;
        int i17;
        DmtTextView dmtTextView13;
        int i18;
        DmtTextView dmtTextView14;
        LinearLayout linearLayout3;
        int i19;
        DmtTextView dmtTextView15;
        int i20;
        int i21;
        DmtTextView dmtTextView16;
        int i22;
        ProfileStarRankView profileStarRankView;
        int i23;
        int i24;
        int i25;
        AppCompatImageView appCompatImageView3;
        int i26;
        int i27;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout4 = new FrameLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -2);
        frameLayout4.setId(R.id.ckd);
        if (viewGroup2 != null) {
            frameLayout4.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout4);
            }
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        constraintLayout.setId(R.id.cke);
        constraintLayout.setLayoutParams(layoutParams);
        if (constraintLayout.getParent() == null) {
            frameLayout4.addView(constraintLayout);
        }
        View view5 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        view5.setId(R.id.ahq);
        view5.setLayoutParams(layoutParams2);
        if (view5.getParent() == null) {
            constraintLayout.addView(view5);
        }
        View view6 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        view6.setBackgroundResource(R.drawable.h4);
        view6.setId(R.id.bj);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f475j = R.id.le;
        }
        view6.setVisibility(8);
        view6.setLayoutParams(layoutParams3);
        if (view6.getParent() == null) {
            constraintLayout.addView(view6);
        }
        DmtTextView dmtTextView17 = new DmtTextView(context2);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-1, -2);
        dmtTextView17.setTextSize(2, 12.0f);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f475j = R.id.le;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView17.setTextColor(resources.getColorStateList(R.color.j7));
        dmtTextView17.setId(R.id.bk);
        dmtTextView17.setEllipsize(TruncateAt.END);
        dmtTextView17.setMaxLines(1);
        dmtTextView17.setGravity(8388613);
        dmtTextView17.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.rightMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f484s = 0;
        }
        dmtTextView17.setLayoutParams(layoutParams4);
        if (dmtTextView17.getParent() == null) {
            constraintLayout.addView(dmtTextView17);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context2);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
        appCompatImageView4.setId(R.id.bl);
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.f475j = R.id.le;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5) && VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        appCompatImageView4.setVisibility(8);
        appCompatImageView4.setImageResource(R.drawable.ap1);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.f481p = R.id.bk;
        }
        appCompatImageView4.setLayoutParams(layoutParams5);
        if (appCompatImageView4.getParent() == null) {
            constraintLayout.addView(appCompatImageView4);
        }
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context2);
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        appCompatImageView5.setId(R.id.a68);
        appCompatImageView5.setScaleType(ScaleType.FIT_XY);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.f474i = R.id.ahq;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6) && VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.f482q = 0;
        }
        appCompatImageView5.setImageResource(R.drawable.im);
        appCompatImageView5.setLayoutParams(layoutParams6);
        if (appCompatImageView5.getParent() == null) {
            constraintLayout.addView(appCompatImageView5);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        ConstraintLayout.LayoutParams layoutParams7 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(R.id.le);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f476k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f473h = R.id.a68;
        }
        ((C13438a) remoteImageView.getHierarchy()).mo32896a(C13423b.f35593a);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f482q = 0;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f484s = 0;
        }
        remoteImageView.setLayoutParams(layoutParams7);
        if (remoteImageView.getParent() == null) {
            constraintLayout.addView(remoteImageView);
        }
        View view7 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams8 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view7.setBackgroundColor(resources.getColor(R.color.a6c));
        view7.setId(R.id.ckf);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f476k = R.id.le;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f473h = R.id.le;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f482q = 0;
        }
        view7.setAlpha(0.96f);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f484s = R.id.ckg;
        }
        view7.setLayoutParams(layoutParams8);
        if (view7.getParent() == null) {
            constraintLayout.addView(view7);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        ConstraintLayout.LayoutParams layoutParams9 = new ConstraintLayout.LayoutParams(-1, -2);
        linearLayout4.setId(R.id.ckg);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.f473h = R.id.a68;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.f482q = 0;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams9)) {
            view = view7;
            layoutParams9.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            view = view7;
        }
        linearLayout4.setOrientation(1);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.f484s = 0;
        }
        linearLayout4.setLayoutParams(layoutParams9);
        if (linearLayout4.getParent() == null) {
            constraintLayout.addView(linearLayout4);
        }
        Space space2 = new Space(context2);
        RemoteImageView remoteImageView2 = remoteImageView;
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        space2.setId(R.id.d8x);
        space2.setLayoutParams(layoutParams10);
        if (space2.getParent() == null) {
            linearLayout4.addView(space2);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams11)) {
            space = space2;
            layoutParams11.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            space = space2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams11) && VERSION.SDK_INT >= 17) {
            layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams11) && VERSION.SDK_INT >= 17) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        linearLayout5.setOrientation(0);
        if (MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.rightMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        linearLayout5.setLayoutParams(layoutParams11);
        if (linearLayout5.getParent() == null) {
            linearLayout4.addView(linearLayout5);
        }
        FrameLayout frameLayout5 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 102.0f, resources.getDisplayMetrics()), -2);
        frameLayout5.setId(R.id.amb);
        frameLayout5.setLayoutParams(layoutParams12);
        if (frameLayout5.getParent() == null) {
            linearLayout5.addView(frameLayout5);
        }
        LiveCircleView liveCircleView = new LiveCircleView(context2);
        AppCompatImageView appCompatImageView6 = appCompatImageView5;
        AppCompatImageView appCompatImageView7 = appCompatImageView4;
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 96.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 96.0f, resources.getDisplayMetrics()));
        liveCircleView.setId(R.id.bnu);
        if (MarginLayoutParams.class.isInstance(layoutParams13) && VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, -2.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.topMargin = (int) TypedValue.applyDimension(1, -2.5f, resources.getDisplayMetrics());
        }
        liveCircleView.setVisibility(8);
        liveCircleView.setLayoutParams(layoutParams13);
        if (liveCircleView.getParent() == null) {
            frameLayout5.addView(liveCircleView);
        }
        SmartAvatarBorderView smartAvatarBorderView = new SmartAvatarBorderView(context2);
        LiveCircleView liveCircleView2 = liveCircleView;
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()));
        smartAvatarBorderView.setId(R.id.aus);
        smartAvatarBorderView.setScaleType(ScaleType.CENTER_INSIDE);
        if (VERSION.SDK_INT >= 26) {
            smartAvatarBorderView.setDefaultFocusHighlightEnabled(false);
        }
        smartAvatarBorderView.setLayoutParams(layoutParams14);
        if (smartAvatarBorderView.getParent() == null) {
            frameLayout5.addView(smartAvatarBorderView);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        SmartAvatarBorderView smartAvatarBorderView2 = smartAvatarBorderView;
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        animationImageView.setId(R.id.j7);
        if (MarginLayoutParams.class.isInstance(layoutParams15) && VERSION.SDK_INT >= 17) {
            layoutParams15.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.topMargin = (int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        animationImageView.setVisibility(8);
        animationImageView.setLayoutParams(layoutParams15);
        if (animationImageView.getParent() == null) {
            frameLayout5.addView(animationImageView);
        }
        AnimationImageView animationImageView2 = new AnimationImageView(context2);
        AnimationImageView animationImageView3 = animationImageView;
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        animationImageView2.setId(R.id.j8);
        if (MarginLayoutParams.class.isInstance(layoutParams16) && VERSION.SDK_INT >= 17) {
            layoutParams16.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.topMargin = (int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        animationImageView2.setVisibility(8);
        animationImageView2.setLayoutParams(layoutParams16);
        if (animationImageView2.getParent() == null) {
            frameLayout5.addView(animationImageView2);
        }
        AnimationImageView animationImageView4 = new AnimationImageView(context2);
        AnimationImageView animationImageView5 = animationImageView2;
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 59.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        animationImageView4.setId(R.id.ew);
        animationImageView4.setScaleType(ScaleType.CENTER_CROP);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = 8388693;
        }
        animationImageView4.setVisibility(8);
        animationImageView4.setImageResource(R.drawable.ab_);
        animationImageView4.setLayoutParams(layoutParams17);
        if (animationImageView4.getParent() == null) {
            frameLayout5.addView(animationImageView4);
        }
        View view8 = new View(context2);
        AnimationImageView animationImageView6 = animationImageView4;
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.weight = 1.0f;
        }
        view8.setLayoutParams(layoutParams18);
        if (view8.getParent() == null) {
            linearLayout5.addView(view8);
        }
        DmtTextView dmtTextView18 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTextView18.setTextSize(2, 15.0f);
        if (!MarginLayoutParams.class.isInstance(layoutParams19) || VERSION.SDK_INT < 17) {
            view2 = view8;
        } else {
            view2 = view8;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = 16;
        }
        dmtTextView18.setTextColor(resources.getColorStateList(R.color.ql));
        dmtTextView18.setBackgroundResource(R.drawable.bg_followed);
        dmtTextView18.setId(R.id.anp);
        dmtTextView18.setGravity(17);
        dmtTextView18.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView18.setLayoutParams(layoutParams19);
        if (dmtTextView18.getParent() == null) {
            linearLayout5.addView(dmtTextView18);
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        DmtTextView dmtTextView19 = dmtTextView18;
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        linearLayout6.setBackgroundResource(R.drawable.bg_followed);
        linearLayout6.setId(R.id.d3_);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i = 16;
            layoutParams20.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((FrameLayout.LayoutParams) layoutParams20).gravity = i;
        }
        linearLayout6.setGravity(17);
        linearLayout6.setVisibility(8);
        linearLayout6.setLayoutParams(layoutParams20);
        if (linearLayout6.getParent() == null) {
            linearLayout5.addView(linearLayout6);
        }
        RemoteImageView remoteImageView3 = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, -2);
        remoteImageView3.setId(R.id.d39);
        remoteImageView3.setVisibility(8);
        remoteImageView3.setImageResource(R.drawable.ahs);
        remoteImageView3.setLayoutParams(layoutParams21);
        if (remoteImageView3.getParent() == null) {
            linearLayout6.addView(remoteImageView3);
        }
        DmtTextView dmtTextView20 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
        RemoteImageView remoteImageView4 = remoteImageView3;
        dmtTextView20.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView20.setTextSize(1, 15.0f);
        dmtTextView20.setId(R.id.d38);
        if (MarginLayoutParams.class.isInstance(layoutParams22)) {
            frameLayout = frameLayout5;
            layoutParams22.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            frameLayout = frameLayout5;
        }
        dmtTextView20.setText(R.string.dm2);
        dmtTextView20.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams22) && VERSION.SDK_INT >= 17) {
            layoutParams22.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        dmtTextView20.setVisibility(8);
        dmtTextView20.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView20.setLayoutParams(layoutParams22);
        if (dmtTextView20.getParent() == null) {
            linearLayout6.addView(dmtTextView20);
        }
        RemoteImageView remoteImageView5 = new RemoteImageView(context2);
        DmtTextView dmtTextView21 = dmtTextView20;
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        remoteImageView5.setBackgroundResource(R.drawable.bg_followed);
        remoteImageView5.setId(R.id.anq);
        remoteImageView5.setScaleType(ScaleType.CENTER_INSIDE);
        if (MarginLayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23) && VERSION.SDK_INT >= 17) {
            layoutParams23.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i2 = 16;
            layoutParams23.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = i2;
        }
        remoteImageView5.setVisibility(8);
        remoteImageView5.setImageResource(R.drawable.a1k);
        remoteImageView5.setLayoutParams(layoutParams23);
        if (remoteImageView5.getParent() == null) {
            linearLayout5.addView(remoteImageView5);
        }
        DmtTextView dmtTextView22 = new DmtTextView(context2);
        RemoteImageView remoteImageView6 = remoteImageView5;
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.hg), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTextView22.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView22.setTextSize(1, 15.0f);
        dmtTextView22.setBackgroundResource(R.drawable.k8);
        dmtTextView22.setId(R.id.cs8);
        dmtTextView22.setText(R.string.b8v);
        dmtTextView22.setEllipsize(TruncateAt.END);
        dmtTextView22.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams24)) {
            i3 = 16;
            layoutParams24.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((FrameLayout.LayoutParams) layoutParams24).gravity = i3;
        }
        dmtTextView22.setGravity(17);
        dmtTextView22.setVisibility(8);
        dmtTextView22.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView22.setLayoutParams(layoutParams24);
        if (dmtTextView22.getParent() == null) {
            linearLayout5.addView(dmtTextView22);
        }
        DmtTextView dmtTextView23 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTextView23.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView23.setTextSize(1, 15.0f);
        dmtTextView23.setBackgroundResource(R.drawable.r2);
        dmtTextView23.setId(R.id.ck9);
        dmtTextView23.setText(R.string.b7r);
        dmtTextView23.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            i4 = 16;
            layoutParams25.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((FrameLayout.LayoutParams) layoutParams25).gravity = i4;
        }
        dmtTextView23.setGravity(17);
        dmtTextView23.setTextColor(resources.getColorStateList(R.color.az3));
        dmtTextView23.setLayoutParams(layoutParams25);
        if (dmtTextView23.getParent() == null) {
            linearLayout5.addView(dmtTextView23);
        }
        FrameLayout frameLayout6 = new FrameLayout(context2);
        DmtTextView dmtTextView24 = dmtTextView23;
        DmtTextView dmtTextView25 = dmtTextView22;
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        frameLayout6.setId(R.id.cka);
        if (MarginLayoutParams.class.isInstance(layoutParams26)) {
            layoutParams26.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams26) && VERSION.SDK_INT >= 17) {
            layoutParams26.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams26)) {
            i5 = 16;
            layoutParams26.gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams26)) {
            ((FrameLayout.LayoutParams) layoutParams26).gravity = i5;
        }
        frameLayout6.setLayoutParams(layoutParams26);
        if (frameLayout6.getParent() == null) {
            linearLayout5.addView(frameLayout6);
        }
        AppCompatImageView appCompatImageView8 = new AppCompatImageView(context2);
        LinearLayout linearLayout7 = linearLayout6;
        FrameLayout.LayoutParams layoutParams27 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        appCompatImageView8.setId(R.id.ck_);
        appCompatImageView8.setContentDescription("");
        appCompatImageView8.setScaleType(ScaleType.CENTER_INSIDE);
        appCompatImageView8.setImageResource(R.drawable.alz);
        appCompatImageView8.setLayoutParams(layoutParams27);
        if (appCompatImageView8.getParent() == null) {
            frameLayout6.addView(appCompatImageView8);
        }
        DmtTextView dmtTextView26 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView26.setId(R.id.c4a);
        dmtTextView26.setTypeface(Typeface.defaultFromStyle(1));
        if (MarginLayoutParams.class.isInstance(layoutParams28)) {
            appCompatImageView = appCompatImageView8;
            layoutParams28.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView = appCompatImageView8;
        }
        dmtTextView26.setTextSize(2, 24.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams28) && VERSION.SDK_INT >= 17) {
            layoutParams28.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        dmtTextView26.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView26.setLayoutParams(layoutParams28);
        if (dmtTextView26.getParent() == null) {
            linearLayout4.addView(dmtTextView26);
        }
        FrameLayout frameLayout7 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams29 = new LinearLayout.LayoutParams(-1, -2);
        frameLayout7.setId(R.id.ca9);
        frameLayout7.setLayoutParams(layoutParams29);
        if (frameLayout7.getParent() == null) {
            linearLayout4.addView(frameLayout7);
        }
        BindAccountView bindAccountView2 = new BindAccountView(context2);
        FrameLayout.LayoutParams layoutParams30 = new FrameLayout.LayoutParams(-2, -2);
        bindAccountView2.setId(R.id.mf);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams30)) {
            ((LinearLayout.LayoutParams) layoutParams30).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.gravity = 8388693;
        }
        bindAccountView2.setLayoutParams(layoutParams30);
        if (bindAccountView2.getParent() == null) {
            frameLayout7.addView(bindAccountView2);
        }
        LinearLayout linearLayout8 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams31 = new FrameLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams31)) {
            bindAccountView = bindAccountView2;
            dmtTextView = dmtTextView26;
            frameLayout2 = frameLayout6;
            i6 = 1;
            layoutParams31.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView = dmtTextView26;
            bindAccountView = bindAccountView2;
            frameLayout2 = frameLayout6;
            i6 = 1;
        }
        linearLayout8.setOrientation(i6);
        linearLayout8.setLayoutParams(layoutParams31);
        if (linearLayout8.getParent() == null) {
            frameLayout7.addView(linearLayout8);
        }
        DmtTextView dmtTextView27 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView27.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView27.setTextSize(1, 12.0f);
        dmtTextView27.setId(R.id.e9_);
        if (MarginLayoutParams.class.isInstance(layoutParams32)) {
            frameLayout3 = frameLayout7;
            layoutParams32.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            frameLayout3 = frameLayout7;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams32) && VERSION.SDK_INT >= 17) {
            layoutParams32.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        dmtTextView27.setGravity(17);
        dmtTextView27.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView27.setLayoutParams(layoutParams32);
        if (dmtTextView27.getParent() == null) {
            linearLayout8.addView(dmtTextView27);
        }
        DmtTextView dmtTextView28 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams33 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView28.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView28.setTextSize(1, 12.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams33)) {
            dmtTextView2 = dmtTextView27;
            layoutParams33.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView2 = dmtTextView27;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams33) && VERSION.SDK_INT >= 17) {
            layoutParams33.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams33) || VERSION.SDK_INT < 17) {
            i7 = 1;
        } else {
            i7 = 1;
            layoutParams33.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView28.setCompoundDrawablePadding((int) TypedValue.applyDimension(i7, 5.0f, resources.getDisplayMetrics()));
        dmtTextView28.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView28.setId(R.id.egn);
        dmtTextView28.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.amq), dmtTextView28.getCompoundDrawablesRelative()[1], dmtTextView28.getCompoundDrawablesRelative()[2], dmtTextView28.getCompoundDrawablesRelative()[3]);
        dmtTextView28.setEllipsize(TruncateAt.END);
        dmtTextView28.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        dmtTextView28.setGravity(17);
        dmtTextView28.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        dmtTextView28.setLayoutParams(layoutParams33);
        if (dmtTextView28.getParent() == null) {
            linearLayout8.addView(dmtTextView28);
        }
        DmtTextView dmtTextView29 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView29.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView29.setTextSize(1, 12.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            dmtTextView3 = dmtTextView28;
            layoutParams34.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView3 = dmtTextView28;
        }
        dmtTextView29.setText(R.string.auw);
        if (MarginLayoutParams.class.isInstance(layoutParams34) && VERSION.SDK_INT >= 17) {
            layoutParams34.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams34) || VERSION.SDK_INT < 17) {
            i8 = 1;
        } else {
            i8 = 1;
            layoutParams34.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView29.setCompoundDrawablePadding((int) TypedValue.applyDimension(i8, 5.0f, resources.getDisplayMetrics()));
        dmtTextView29.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView29.setId(R.id.c9g);
        dmtTextView29.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.amp), dmtTextView29.getCompoundDrawablesRelative()[1], dmtTextView29.getCompoundDrawablesRelative()[2], dmtTextView29.getCompoundDrawablesRelative()[3]);
        dmtTextView29.setEllipsize(TruncateAt.END);
        dmtTextView29.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        dmtTextView29.setGravity(17);
        dmtTextView29.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        dmtTextView29.setLayoutParams(layoutParams34);
        if (dmtTextView29.getParent() == null) {
            linearLayout8.addView(dmtTextView29);
        }
        DmtTextView dmtTextView30 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView30.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView30.setTextSize(1, 12.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            dmtTextView4 = dmtTextView29;
            layoutParams35.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView4 = dmtTextView29;
        }
        dmtTextView30.setText(R.string.fsn);
        if (MarginLayoutParams.class.isInstance(layoutParams35) && VERSION.SDK_INT >= 17) {
            layoutParams35.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams35) || VERSION.SDK_INT < 17) {
            i9 = 1;
        } else {
            i9 = 1;
            layoutParams35.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView30.setCompoundDrawablePadding((int) TypedValue.applyDimension(i9, 5.0f, resources.getDisplayMetrics()));
        dmtTextView30.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView30.setId(R.id.afg);
        dmtTextView30.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.amm), dmtTextView30.getCompoundDrawablesRelative()[1], dmtTextView30.getCompoundDrawablesRelative()[2], dmtTextView30.getCompoundDrawablesRelative()[3]);
        dmtTextView30.setEllipsize(TruncateAt.END);
        dmtTextView30.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView30.setGravity(17);
        dmtTextView30.setVisibility(8);
        dmtTextView30.setMaxEms(14);
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        dmtTextView30.setLayoutParams(layoutParams35);
        if (dmtTextView30.getParent() == null) {
            linearLayout8.addView(dmtTextView30);
        }
        DmtTextView dmtTextView31 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView31.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView31.setTextSize(1, 12.0f);
        if (!MarginLayoutParams.class.isInstance(layoutParams36) || VERSION.SDK_INT < 17) {
            dmtTextView5 = dmtTextView30;
        } else {
            dmtTextView5 = dmtTextView30;
            layoutParams36.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams36) || VERSION.SDK_INT < 17) {
            i10 = 1;
        } else {
            i10 = 1;
            layoutParams36.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView31.setCompoundDrawablePadding((int) TypedValue.applyDimension(i10, 2.0f, resources.getDisplayMetrics()));
        dmtTextView31.setTextColor(resources.getColorStateList(R.color.a4z));
        dmtTextView31.setId(R.id.e0c);
        dmtTextView31.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.ag0), dmtTextView31.getCompoundDrawablesRelative()[1], dmtTextView31.getCompoundDrawablesRelative()[2], dmtTextView31.getCompoundDrawablesRelative()[3]);
        dmtTextView31.setEllipsize(TruncateAt.END);
        dmtTextView31.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams36)) {
            layoutParams36.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        dmtTextView31.setGravity(17);
        dmtTextView31.setVisibility(8);
        dmtTextView31.setMaxEms(14);
        dmtTextView31.setLayoutParams(layoutParams36);
        if (dmtTextView31.getParent() == null) {
            linearLayout8.addView(dmtTextView31);
        }
        DmtTextView dmtTextView32 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams37 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView32.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView32.setTextSize(1, 12.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            dmtTextView6 = dmtTextView31;
            layoutParams37.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView6 = dmtTextView31;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams37) && VERSION.SDK_INT >= 17) {
            layoutParams37.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams37) && VERSION.SDK_INT >= 17) {
            layoutParams37.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            i11 = 1;
            layoutParams37.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        } else {
            i11 = 1;
        }
        dmtTextView32.setId(R.id.ehc);
        LinearLayout linearLayout9 = linearLayout5;
        dmtTextView32.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.az4), dmtTextView32.getCompoundDrawablesRelative()[i11], dmtTextView32.getCompoundDrawablesRelative()[2], dmtTextView32.getCompoundDrawablesRelative()[3]);
        dmtTextView32.setMaxLines(i11);
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.topMargin = (int) TypedValue.applyDimension(i11, 3.5f, resources.getDisplayMetrics());
        }
        dmtTextView32.setVisibility(8);
        dmtTextView32.setMaxEms(20);
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        dmtTextView32.setLayoutParams(layoutParams37);
        if (dmtTextView32.getParent() == null) {
            linearLayout8.addView(dmtTextView32);
        }
        ConnectedRelationView connectedRelationView2 = new ConnectedRelationView(context2);
        LinearLayout.LayoutParams layoutParams38 = new LinearLayout.LayoutParams(-1, -2);
        connectedRelationView2.setId(R.id.a15);
        if (MarginLayoutParams.class.isInstance(layoutParams38) && VERSION.SDK_INT >= 17) {
            layoutParams38.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        connectedRelationView2.setVisibility(8);
        connectedRelationView2.setLayoutParams(layoutParams38);
        if (connectedRelationView2.getParent() == null) {
            linearLayout8.addView(connectedRelationView2);
        }
        RecommendCommonUserView recommendCommonUserView = new RecommendCommonUserView(context2);
        LinearLayout.LayoutParams layoutParams39 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        recommendCommonUserView.setId(R.id.cp1);
        recommendCommonUserView.setVisibility(0);
        recommendCommonUserView.setLayoutParams(layoutParams39);
        if (recommendCommonUserView.getParent() == null) {
            linearLayout4.addView(recommendCommonUserView);
        }
        View view9 = new View(context2);
        RecommendCommonUserView recommendCommonUserView2 = recommendCommonUserView;
        LinearLayout.LayoutParams layoutParams40 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        view9.setBackgroundColor(resources.getColor(R.color.qp));
        view9.setId(R.id.a9o);
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            connectedRelationView = connectedRelationView2;
            layoutParams40.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            connectedRelationView = connectedRelationView2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40) && VERSION.SDK_INT >= 17) {
            layoutParams40.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams40) || VERSION.SDK_INT < 17) {
            i12 = 1;
        } else {
            i12 = 1;
            layoutParams40.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.topMargin = (int) TypedValue.applyDimension(i12, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.rightMargin = (int) TypedValue.applyDimension(i12, 15.0f, resources.getDisplayMetrics());
        }
        view9.setLayoutParams(layoutParams40);
        if (view9.getParent() == null) {
            linearLayout4.addView(view9);
        }
        LinearLayout linearLayout10 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams41 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout10.setId(R.id.c2y);
        View view10 = view9;
        linearLayout10.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout10.getPaddingTop(), linearLayout10.getPaddingRight(), linearLayout10.getPaddingBottom());
        DmtTextView dmtTextView33 = dmtTextView32;
        linearLayout10.setPadding(linearLayout10.getPaddingLeft(), linearLayout10.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout10.getPaddingBottom());
        linearLayout10.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout10.getPaddingTop(), linearLayout10.getPaddingRight(), linearLayout10.getPaddingBottom());
        linearLayout10.setPadding(linearLayout10.getPaddingLeft(), linearLayout10.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout10.getPaddingBottom());
        linearLayout10.setVisibility(8);
        linearLayout10.setOrientation(1);
        linearLayout10.setLayoutParams(layoutParams41);
        if (linearLayout10.getParent() == null) {
            linearLayout4.addView(linearLayout10);
        }
        LinearLayout linearLayout11 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams42 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        linearLayout11.setGravity(16);
        linearLayout11.setOrientation(0);
        linearLayout11.setLayoutParams(layoutParams42);
        if (linearLayout11.getParent() == null) {
            linearLayout10.addView(linearLayout11);
        }
        AppCompatImageView appCompatImageView9 = new AppCompatImageView(context2);
        LinearLayout linearLayout12 = linearLayout8;
        LinearLayout.LayoutParams layoutParams43 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        appCompatImageView9.setBackgroundResource(R.drawable.bjd);
        appCompatImageView9.setId(R.id.ckp);
        appCompatImageView9.setLayoutParams(layoutParams43);
        if (appCompatImageView9.getParent() == null) {
            linearLayout11.addView(appCompatImageView9);
        }
        DmtTextView dmtTextView34 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams44 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView34.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView34.setTextSize(1, 12.0f);
        dmtTextView34.setId(R.id.ckq);
        if (MarginLayoutParams.class.isInstance(layoutParams44)) {
            appCompatImageView2 = appCompatImageView9;
            layoutParams44.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView2 = appCompatImageView9;
        }
        dmtTextView34.setText(R.string.d6r);
        DmtTextView dmtTextView35 = dmtTextView17;
        View view11 = view6;
        dmtTextView34.setPadding(dmtTextView34.getPaddingLeft(), dmtTextView34.getPaddingTop(), dmtTextView34.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams44) && VERSION.SDK_INT >= 17) {
            layoutParams44.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        dmtTextView34.setTextColor(resources.getColorStateList(R.color.a71));
        dmtTextView34.setLayoutParams(layoutParams44);
        if (dmtTextView34.getParent() == null) {
            linearLayout11.addView(dmtTextView34);
        }
        View view12 = new View(context2);
        LinearLayout.LayoutParams layoutParams45 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        view12.setBackgroundResource(R.drawable.xt);
        view12.setId(R.id.c3x);
        if (MarginLayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams45) && VERSION.SDK_INT >= 17) {
            layoutParams45.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams45)) {
            ((FrameLayout.LayoutParams) layoutParams45).gravity = 48;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        view12.setVisibility(4);
        view12.setLayoutParams(layoutParams45);
        if (view12.getParent() == null) {
            linearLayout11.addView(view12);
        }
        Space space3 = new Space(context2);
        LinearLayout.LayoutParams layoutParams46 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams46)) {
            layoutParams46.weight = 1.0f;
        }
        space3.setLayoutParams(layoutParams46);
        if (space3.getParent() == null) {
            linearLayout11.addView(space3);
        }
        View view13 = new View(context2);
        Space space4 = space3;
        LinearLayout.LayoutParams layoutParams47 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        view13.setBackgroundResource(R.drawable.bjc);
        if (MarginLayoutParams.class.isInstance(layoutParams47)) {
            layoutParams47.leftMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams47) && VERSION.SDK_INT >= 17) {
            layoutParams47.setMarginStart((int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()));
        }
        view13.setLayoutParams(layoutParams47);
        if (view13.getParent() == null) {
            linearLayout11.addView(view13);
        }
        View view14 = new View(context2);
        LinearLayout.LayoutParams layoutParams48 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        view14.setBackgroundColor(resources.getColor(R.color.qp));
        view14.setId(R.id.au_);
        view14.setLayoutParams(layoutParams48);
        if (view14.getParent() == null) {
            linearLayout10.addView(view14);
        }
        DmtTextView dmtTextView36 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams49 = new LinearLayout.LayoutParams(-2, -2);
        View view15 = view14;
        dmtTextView36.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView36.setTextSize(1, 15.0f);
        dmtTextView36.setId(R.id.e_2);
        if (MarginLayoutParams.class.isInstance(layoutParams49)) {
            view3 = view13;
            layoutParams49.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            view3 = view13;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams49) && VERSION.SDK_INT >= 17) {
            layoutParams49.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams49) || VERSION.SDK_INT < 17) {
            i13 = 1;
        } else {
            i13 = 1;
            layoutParams49.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.topMargin = (int) TypedValue.applyDimension(i13, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView36.setGravity(8388611);
        if (MarginLayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.rightMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        dmtTextView36.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView36.setLayoutParams(layoutParams49);
        if (dmtTextView36.getParent() == null) {
            linearLayout4.addView(dmtTextView36);
        }
        DmtTextView dmtTextView37 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams50 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView37.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView37.setTextSize(1, 15.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams50)) {
            dmtTextView7 = dmtTextView36;
            layoutParams50.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView7 = dmtTextView36;
        }
        dmtTextView37.setSingleLine(true);
        if (MarginLayoutParams.class.isInstance(layoutParams50) && VERSION.SDK_INT >= 17) {
            layoutParams50.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams50) && VERSION.SDK_INT >= 17) {
            layoutParams50.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView37.setFontType("medium");
        dmtTextView37.setTextColor(resources.getColorStateList(R.color.w4));
        dmtTextView37.setId(R.id.e8x);
        dmtTextView37.setEllipsize(TruncateAt.END);
        if (MarginLayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.topMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        dmtTextView37.setGravity(8388611);
        dmtTextView37.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.rightMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        dmtTextView37.setLayoutParams(layoutParams50);
        if (dmtTextView37.getParent() == null) {
            linearLayout4.addView(dmtTextView37);
        }
        DmtTextView dmtTextView38 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams51 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView38.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView38.setTextSize(1, 15.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams51)) {
            dmtTextView8 = dmtTextView37;
            layoutParams51.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView8 = dmtTextView37;
        }
        dmtTextView38.setSingleLine(true);
        if (MarginLayoutParams.class.isInstance(layoutParams51) && VERSION.SDK_INT >= 17) {
            layoutParams51.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams51) && VERSION.SDK_INT >= 17) {
            layoutParams51.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView38.setFontType("medium");
        dmtTextView38.setTextColor(resources.getColorStateList(R.color.a_5));
        dmtTextView38.setId(R.id.e8w);
        dmtTextView38.setEllipsize(TruncateAt.END);
        if (MarginLayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView38.setGravity(8388611);
        dmtTextView38.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.rightMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        dmtTextView38.setLayoutParams(layoutParams51);
        if (dmtTextView38.getParent() == null) {
            linearLayout4.addView(dmtTextView38);
        }
        TranslationStatusView translationStatusView2 = new TranslationStatusView(context2);
        LinearLayout.LayoutParams layoutParams52 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        translationStatusView2.setId(R.id.dnl);
        if (MarginLayoutParams.class.isInstance(layoutParams52)) {
            dmtTextView9 = dmtTextView38;
            layoutParams52.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView9 = dmtTextView38;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams52) && VERSION.SDK_INT >= 17) {
            layoutParams52.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        translationStatusView2.setVisibility(8);
        translationStatusView2.setLayoutParams(layoutParams52);
        if (translationStatusView2.getParent() == null) {
            linearLayout4.addView(translationStatusView2);
        }
        EnterpriseTransformLayout enterpriseTransformLayout2 = new EnterpriseTransformLayout(context2);
        LinearLayout.LayoutParams layoutParams53 = new LinearLayout.LayoutParams(-2, -2);
        enterpriseTransformLayout2.setId(R.id.dnb);
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            translationStatusView = translationStatusView2;
            layoutParams53.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            translationStatusView = translationStatusView2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53) && VERSION.SDK_INT >= 17) {
            layoutParams53.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53) && VERSION.SDK_INT >= 17) {
            layoutParams53.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            i14 = 1;
            layoutParams53.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i14 = 1;
        }
        enterpriseTransformLayout2.setOrientation(0);
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.rightMargin = (int) TypedValue.applyDimension(i14, 15.0f, resources.getDisplayMetrics());
        }
        enterpriseTransformLayout2.setLayoutParams(layoutParams53);
        if (enterpriseTransformLayout2.getParent() == null) {
            linearLayout4.addView(enterpriseTransformLayout2);
        }
        LinearLayout linearLayout13 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams54 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout13.setId(R.id.dg3);
        if (MarginLayoutParams.class.isInstance(layoutParams54)) {
            enterpriseTransformLayout = enterpriseTransformLayout2;
            layoutParams54.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            enterpriseTransformLayout = enterpriseTransformLayout2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams54) && VERSION.SDK_INT >= 17) {
            layoutParams54.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        linearLayout13.setOrientation(0);
        linearLayout13.setLayoutParams(layoutParams54);
        if (linearLayout13.getParent() == null) {
            linearLayout4.addView(linearLayout13);
        }
        LinearLayout linearLayout14 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams55 = new LinearLayout.LayoutParams(-1, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams55)) {
            linearLayout = linearLayout13;
            layoutParams55.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            linearLayout = linearLayout13;
        }
        linearLayout14.setGravity(16);
        if (MarginLayoutParams.class.isInstance(layoutParams55)) {
            layoutParams55.bottomMargin = (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        }
        linearLayout14.setLayoutParams(layoutParams55);
        if (linearLayout14.getParent() == null) {
            linearLayout4.addView(linearLayout14);
        }
        LinearLayout linearLayout15 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams56 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout15.setId(R.id.abf);
        if (MarginLayoutParams.class.isInstance(layoutParams56)) {
            view4 = view12;
            layoutParams56.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            view4 = view12;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams56) && VERSION.SDK_INT >= 17) {
            layoutParams56.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout15.setOrientation(0);
        linearLayout15.setLayoutParams(layoutParams56);
        if (linearLayout15.getParent() == null) {
            linearLayout14.addView(linearLayout15);
        }
        DmtTextView dmtTextView39 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams57 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView39.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView39.setTextSize(1, 17.0f);
        dmtTextView39.setId(R.id.a87);
        dmtTextView39.setMaxLines(1);
        if (!MarginLayoutParams.class.isInstance(layoutParams57) || VERSION.SDK_INT < 17) {
            dmtTextView10 = dmtTextView34;
        } else {
            dmtTextView10 = dmtTextView34;
            layoutParams57.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams57)) {
            i15 = 16;
            layoutParams57.gravity = 16;
        } else {
            i15 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams57)) {
            ((FrameLayout.LayoutParams) layoutParams57).gravity = i15;
        }
        dmtTextView39.setGravity(17);
        dmtTextView39.setFontType("regular");
        if (MarginLayoutParams.class.isInstance(layoutParams57)) {
            layoutParams57.rightMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        dmtTextView39.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView39.setLayoutParams(layoutParams57);
        if (dmtTextView39.getParent() == null) {
            linearLayout15.addView(dmtTextView39);
        }
        DmtTextView dmtTextView40 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams58 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView40.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView40.setTextSize(1, 15.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams58)) {
            dmtTextView11 = dmtTextView39;
            layoutParams58.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView11 = dmtTextView39;
        }
        dmtTextView40.setText(R.string.b8h);
        dmtTextView40.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams58) && VERSION.SDK_INT >= 17) {
            layoutParams58.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams58)) {
            i16 = 16;
            layoutParams58.gravity = 16;
        } else {
            i16 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams58)) {
            ((FrameLayout.LayoutParams) layoutParams58).gravity = i16;
        }
        dmtTextView40.setGravity(17);
        dmtTextView40.setFontType("regular");
        dmtTextView40.setTextColor(resources.getColorStateList(R.color.a53));
        dmtTextView40.setLayoutParams(layoutParams58);
        if (dmtTextView40.getParent() == null) {
            linearLayout15.addView(dmtTextView40);
        }
        LinearLayout linearLayout16 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams59 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout16.setId(R.id.aoa);
        if (MarginLayoutParams.class.isInstance(layoutParams59)) {
            dmtTextView12 = dmtTextView40;
            layoutParams59.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView12 = dmtTextView40;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams59) && VERSION.SDK_INT >= 17) {
            layoutParams59.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout16.setOrientation(0);
        linearLayout16.setLayoutParams(layoutParams59);
        if (linearLayout16.getParent() == null) {
            linearLayout14.addView(linearLayout16);
        }
        DmtTextView dmtTextView41 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams60 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView41.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView41.setTextSize(1, 17.0f);
        dmtTextView41.setId(R.id.ao9);
        dmtTextView41.setMaxLines(1);
        if (!MarginLayoutParams.class.isInstance(layoutParams60) || VERSION.SDK_INT < 17) {
            linearLayout2 = linearLayout15;
        } else {
            linearLayout2 = linearLayout15;
            layoutParams60.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams60)) {
            i17 = 16;
            layoutParams60.gravity = 16;
        } else {
            i17 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams60)) {
            ((FrameLayout.LayoutParams) layoutParams60).gravity = i17;
        }
        dmtTextView41.setGravity(17);
        dmtTextView41.setFontType("regular");
        if (MarginLayoutParams.class.isInstance(layoutParams60)) {
            layoutParams60.rightMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        dmtTextView41.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView41.setLayoutParams(layoutParams60);
        if (dmtTextView41.getParent() == null) {
            linearLayout16.addView(dmtTextView41);
        }
        DmtTextView dmtTextView42 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams61 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView42.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView42.setTextSize(1, 15.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams61)) {
            dmtTextView13 = dmtTextView41;
            layoutParams61.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView13 = dmtTextView41;
        }
        dmtTextView42.setText(R.string.b9_);
        dmtTextView42.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams61) && VERSION.SDK_INT >= 17) {
            layoutParams61.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams61)) {
            i18 = 16;
            layoutParams61.gravity = 16;
        } else {
            i18 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams61)) {
            ((FrameLayout.LayoutParams) layoutParams61).gravity = i18;
        }
        dmtTextView42.setGravity(17);
        dmtTextView42.setFontType("regular");
        dmtTextView42.setTextColor(resources.getColorStateList(R.color.a53));
        dmtTextView42.setLayoutParams(layoutParams61);
        if (dmtTextView42.getParent() == null) {
            linearLayout16.addView(dmtTextView42);
        }
        LinearLayout linearLayout17 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams62 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout17.setId(R.id.ao6);
        if (MarginLayoutParams.class.isInstance(layoutParams62)) {
            dmtTextView14 = dmtTextView42;
            layoutParams62.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView14 = dmtTextView42;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams62) && VERSION.SDK_INT >= 17) {
            layoutParams62.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout17.setOrientation(0);
        linearLayout17.setLayoutParams(layoutParams62);
        if (linearLayout17.getParent() == null) {
            linearLayout14.addView(linearLayout17);
        }
        DmtTextView dmtTextView43 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams63 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView43.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView43.setTextSize(1, 17.0f);
        dmtTextView43.setId(R.id.ao4);
        dmtTextView43.setMaxLines(1);
        if (!MarginLayoutParams.class.isInstance(layoutParams63) || VERSION.SDK_INT < 17) {
            linearLayout3 = linearLayout16;
        } else {
            linearLayout3 = linearLayout16;
            layoutParams63.setMarginEnd((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams63)) {
            i19 = 16;
            layoutParams63.gravity = 16;
        } else {
            i19 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams63)) {
            ((FrameLayout.LayoutParams) layoutParams63).gravity = i19;
        }
        dmtTextView43.setGravity(17);
        dmtTextView43.setFontType("regular");
        if (MarginLayoutParams.class.isInstance(layoutParams63)) {
            layoutParams63.rightMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        dmtTextView43.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView43.setLayoutParams(layoutParams63);
        if (dmtTextView43.getParent() == null) {
            linearLayout17.addView(dmtTextView43);
        }
        DmtTextView dmtTextView44 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams64 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView44.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView44.setTextSize(1, 15.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams64)) {
            dmtTextView15 = dmtTextView43;
            layoutParams64.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView15 = dmtTextView43;
        }
        dmtTextView44.setText(R.string.b94);
        dmtTextView44.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams64) && VERSION.SDK_INT >= 17) {
            layoutParams64.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams64)) {
            i20 = 16;
            layoutParams64.gravity = 16;
        } else {
            i20 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams64)) {
            ((FrameLayout.LayoutParams) layoutParams64).gravity = i20;
        }
        dmtTextView44.setGravity(17);
        dmtTextView44.setFontType("regular");
        dmtTextView44.setTextColor(resources.getColorStateList(R.color.a53));
        dmtTextView44.setLayoutParams(layoutParams64);
        if (dmtTextView44.getParent() == null) {
            linearLayout17.addView(dmtTextView44);
        }
        View view16 = new View(context2);
        DmtTextView dmtTextView45 = dmtTextView44;
        LinearLayout.LayoutParams layoutParams65 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams65)) {
            layoutParams65.weight = 1.0f;
        }
        view16.setLayoutParams(layoutParams65);
        if (view16.getParent() == null) {
            linearLayout14.addView(view16);
        }
        DmtTextView dmtTextView46 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams66 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView46.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView46.setTextSize(1, 17.0f);
        dmtTextView46.setId(R.id.blt);
        dmtTextView46.setTypeface(Typeface.defaultFromStyle(2));
        View view17 = view16;
        dmtTextView46.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.afp), dmtTextView46.getCompoundDrawablesRelative()[1], dmtTextView46.getCompoundDrawablesRelative()[2], dmtTextView46.getCompoundDrawablesRelative()[3]);
        if (!MarginLayoutParams.class.isInstance(layoutParams66) || VERSION.SDK_INT < 17) {
            i21 = 1;
        } else {
            i21 = 1;
            layoutParams66.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView46.setVisibility(8);
        dmtTextView46.setCompoundDrawablePadding((int) TypedValue.applyDimension(i21, 5.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams66)) {
            layoutParams66.rightMargin = (int) TypedValue.applyDimension(i21, 15.0f, resources.getDisplayMetrics());
        }
        dmtTextView46.setTextColor(resources.getColorStateList(R.color.a79));
        dmtTextView46.setLayoutParams(layoutParams66);
        if (dmtTextView46.getParent() == null) {
            linearLayout14.addView(dmtTextView46);
        }
        ProfileStarRankView profileStarRankView2 = new ProfileStarRankView(context2);
        LinearLayout.LayoutParams layoutParams67 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        profileStarRankView2.setId(R.id.cks);
        if (MarginLayoutParams.class.isInstance(layoutParams67)) {
            dmtTextView16 = dmtTextView46;
            layoutParams67.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView16 = dmtTextView46;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams67) && VERSION.SDK_INT >= 17) {
            layoutParams67.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams67) && VERSION.SDK_INT >= 17) {
            layoutParams67.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams67)) {
            i22 = 1;
            layoutParams67.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i22 = 1;
        }
        profileStarRankView2.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams67)) {
            layoutParams67.rightMargin = (int) TypedValue.applyDimension(i22, 16.0f, resources.getDisplayMetrics());
        }
        profileStarRankView2.setLayoutParams(layoutParams67);
        if (profileStarRankView2.getParent() == null) {
            linearLayout4.addView(profileStarRankView2);
        }
        View a2 = C2058a.m9123a(context2, R.layout.ah0, linearLayout4, false, 0);
        if (a2 == null || a2 == linearLayout4) {
            profileStarRankView = profileStarRankView2;
        } else {
            LinearLayout.LayoutParams layoutParams68 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
            if (MarginLayoutParams.class.isInstance(layoutParams68)) {
                profileStarRankView = profileStarRankView2;
                layoutParams68.topMargin = (int) TypedValue.applyDimension(1, -10.0f, resources.getDisplayMetrics());
            } else {
                profileStarRankView = profileStarRankView2;
            }
            a2.setLayoutParams(layoutParams68);
            if (a2.getParent() == null) {
                linearLayout4.addView(a2);
            }
        }
        LinearLayout linearLayout18 = new LinearLayout(context2);
        ConstraintLayout.LayoutParams layoutParams69 = new ConstraintLayout.LayoutParams(-1, -2);
        linearLayout18.setBackgroundColor(resources.getColor(R.color.a6c));
        linearLayout18.setId(R.id.bhf);
        View view18 = a2;
        LinearLayout linearLayout19 = linearLayout17;
        LinearLayout linearLayout20 = linearLayout14;
        linearLayout18.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.f474i = R.id.ckg;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams69)) {
            i23 = 0;
            layoutParams69.f482q = 0;
        } else {
            i23 = 0;
        }
        linearLayout18.setVisibility(8);
        linearLayout18.setOrientation(i23);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.f484s = i23;
        }
        linearLayout18.setLayoutParams(layoutParams69);
        if (linearLayout18.getParent() == null) {
            constraintLayout.addView(linearLayout18);
        }
        AppCompatImageView appCompatImageView10 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams70 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        appCompatImageView10.setId(R.id.axk);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams70)) {
            i24 = 16;
            layoutParams70.gravity = 16;
        } else {
            i24 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams70)) {
            ((FrameLayout.LayoutParams) layoutParams70).gravity = i24;
        }
        appCompatImageView10.setLayoutParams(layoutParams70);
        if (appCompatImageView10.getParent() == null) {
            linearLayout18.addView(appCompatImageView10);
        }
        LinearLayout linearLayout21 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams71 = new LinearLayout.LayoutParams(-1, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams71) && VERSION.SDK_INT >= 17) {
            layoutParams71.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams71)) {
            i25 = 16;
            layoutParams71.gravity = 16;
        } else {
            i25 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams71)) {
            ((FrameLayout.LayoutParams) layoutParams71).gravity = i25;
        }
        linearLayout21.setOrientation(1);
        linearLayout21.setLayoutParams(layoutParams71);
        if (linearLayout21.getParent() == null) {
            linearLayout18.addView(linearLayout21);
        }
        DmtTextView dmtTextView47 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams72 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView47.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView47.setTextSize(2, 15.0f);
        dmtTextView47.setId(R.id.dkc);
        dmtTextView47.setTextColor(resources.getColorStateList(R.color.se));
        dmtTextView47.setLayoutParams(layoutParams72);
        if (dmtTextView47.getParent() == null) {
            linearLayout21.addView(dmtTextView47);
        }
        DmtTextView dmtTextView48 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams73 = new LinearLayout.LayoutParams(-2, -2);
        DmtTextView dmtTextView49 = dmtTextView47;
        dmtTextView48.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView48.setTextSize(2, 13.0f);
        dmtTextView48.setId(R.id.a7n);
        if (MarginLayoutParams.class.isInstance(layoutParams73)) {
            appCompatImageView3 = appCompatImageView10;
            layoutParams73.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView3 = appCompatImageView10;
        }
        dmtTextView48.setTextColor(resources.getColorStateList(R.color.a3o));
        dmtTextView48.setLayoutParams(layoutParams73);
        if (dmtTextView48.getParent() == null) {
            linearLayout21.addView(dmtTextView48);
        }
        TableLayout tableLayout = new TableLayout(context2);
        tableLayout.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        if (tableLayout.getParent() == null) {
            constraintLayout.addView(tableLayout);
        }
        DmtTabLayout dmtTabLayout = new DmtTabLayout(context2);
        TableLayout tableLayout2 = tableLayout;
        ConstraintLayout.LayoutParams layoutParams74 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setSelectedTabIndicatorColor(resources.getColor(R.color.a4s));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            layoutParams74.f474i = R.id.ckg;
        }
        dmtTabLayout.setTabPaddingStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            layoutParams74.f482q = 0;
        }
        dmtTabLayout.setTabMinWidth((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setId(R.id.dfo);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            i26 = 0;
            layoutParams74.f476k = 0;
        } else {
            i26 = 0;
        }
        dmtTabLayout.setTabBackgroundResId(i26);
        dmtTabLayout.setSelectedTabIndicatorHeight((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabPaddingEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            i27 = 0;
            layoutParams74.f484s = 0;
        } else {
            i27 = 0;
        }
        dmtTabLayout.setTabMode(i27);
        dmtTabLayout.setLayoutParams(layoutParams74);
        if (dmtTabLayout.getParent() == null) {
            constraintLayout.addView(dmtTabLayout);
        }
        View view19 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams75 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(i27, 1.0f, resources.getDisplayMetrics()));
        view19.setBackgroundColor(resources.getColor(R.color.qp));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams75)) {
            layoutParams75.f474i = R.id.dfo;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams75)) {
            ((LinearLayout.LayoutParams) layoutParams75).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams75)) {
            ((FrameLayout.LayoutParams) layoutParams75).gravity = 80;
        }
        view19.setLayoutParams(layoutParams75);
        if (view19.getParent() == null) {
            constraintLayout.addView(view19);
        }
        C1444a.m7242a(frameLayout4);
        C1444a.m7242a(constraintLayout);
        C1444a.m7242a(view5);
        C1444a.m7242a(view11);
        C1444a.m7242a(dmtTextView35);
        C1444a.m7242a(appCompatImageView7);
        C1444a.m7242a(appCompatImageView6);
        C1444a.m7242a(remoteImageView2);
        C1444a.m7242a(view);
        C1444a.m7242a(linearLayout4);
        C1444a.m7242a(space);
        C1444a.m7242a(linearLayout9);
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(liveCircleView2);
        C1444a.m7242a(smartAvatarBorderView2);
        C1444a.m7242a(animationImageView3);
        C1444a.m7242a(animationImageView5);
        C1444a.m7242a(animationImageView6);
        C1444a.m7242a(view2);
        C1444a.m7242a(dmtTextView19);
        C1444a.m7242a(linearLayout7);
        C1444a.m7242a(remoteImageView4);
        C1444a.m7242a(dmtTextView21);
        C1444a.m7242a(remoteImageView6);
        C1444a.m7242a(dmtTextView25);
        C1444a.m7242a(dmtTextView24);
        C1444a.m7242a(frameLayout2);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(frameLayout3);
        C1444a.m7242a(bindAccountView);
        C1444a.m7242a(linearLayout12);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(dmtTextView3);
        dmtTextView3.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amq), null, null, null);
        C1444a.m7242a(dmtTextView4);
        dmtTextView4.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amp), null, null, null);
        C1444a.m7242a(dmtTextView5);
        dmtTextView5.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.amm), null, null, null);
        C1444a.m7242a(dmtTextView6);
        C1444a.m7242a(dmtTextView33);
        dmtTextView33.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.az4), null, null, null);
        C1444a.m7242a(connectedRelationView);
        C1444a.m7242a(recommendCommonUserView2);
        C1444a.m7242a(view10);
        C1444a.m7242a(linearLayout10);
        C1444a.m7242a(linearLayout11);
        C1444a.m7242a(appCompatImageView2);
        C1444a.m7242a(dmtTextView10);
        C1444a.m7242a(view4);
        C1444a.m7242a(space4);
        C1444a.m7242a(view3);
        C1444a.m7242a(view15);
        C1444a.m7242a(dmtTextView7);
        C1444a.m7242a(dmtTextView8);
        C1444a.m7242a(dmtTextView9);
        C1444a.m7242a(translationStatusView);
        C1444a.m7242a(enterpriseTransformLayout);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(linearLayout20);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(dmtTextView11);
        C1444a.m7242a(dmtTextView12);
        C1444a.m7242a(linearLayout3);
        C1444a.m7242a(dmtTextView13);
        C1444a.m7242a(dmtTextView14);
        C1444a.m7242a(linearLayout19);
        C1444a.m7242a(dmtTextView15);
        C1444a.m7242a(dmtTextView45);
        C1444a.m7242a(view17);
        C1444a.m7242a(dmtTextView16);
        dmtTextView16.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.afp), null, null, null);
        C1444a.m7242a(profileStarRankView);
        C1444a.m7242a(view18);
        C1444a.m7242a(linearLayout18);
        C1444a.m7242a(appCompatImageView3);
        C1444a.m7242a(linearLayout21);
        C1444a.m7242a(dmtTextView49);
        C1444a.m7242a(dmtTextView48);
        C1444a.m7242a(tableLayout2);
        C1444a.m7242a(dmtTabLayout);
        C1444a.m7242a(view19);
        return frameLayout4;
    }
}
