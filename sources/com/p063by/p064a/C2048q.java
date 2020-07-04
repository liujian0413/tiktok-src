package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.support.p029v7.widget.AppCompatTextView;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.EllipsizeLayout;
import com.p280ss.android.ugc.aweme.base.p308ui.PoiCardWebPageContainer;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p280ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.p280ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DebugInfoView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout;
import com.p280ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.p280ss.android.ugc.aweme.poi.widget.PoiRankVideoWidget;
import com.p280ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p280ss.android.ugc.aweme.setting.p337ui.RestrictTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.q */
public final class C2048q implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        ViewStub viewStub;
        RemoteImageView remoteImageView;
        int i;
        RemoteImageView remoteImageView2;
        float f;
        LinearLayout linearLayout;
        AnimationImageView animationImageView;
        int i2;
        CommerceMicroTagLayout commerceMicroTagLayout;
        int i3;
        StarAtlasTagLayout starAtlasTagLayout;
        int i4;
        NationalTaskTagLayout nationalTaskTagLayout;
        int i5;
        FrameLayout frameLayout;
        CommerceTagLayout commerceTagLayout;
        int i6;
        DouPlusTagLayout douPlusTagLayout;
        int i7;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        int i8;
        int i9;
        DmtTextView dmtTextView;
        ViewStub viewStub2;
        float f2;
        int i10;
        int i11;
        int i12;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        DmtTextView dmtTextView2;
        int i13;
        RatingBar ratingBar;
        int i14;
        DmtTextView dmtTextView3;
        int i15;
        ViewStub viewStub3;
        LinearLayout linearLayout2;
        int i16;
        FrameLayout frameLayout6;
        FrameLayout frameLayout7;
        int i17;
        ViewStub viewStub4;
        FrameLayout frameLayout8;
        View view;
        ViewStub viewStub5;
        StripAdBottomLabelView stripAdBottomLabelView;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        int i18;
        ViewStub viewStub6;
        int i19;
        int i20;
        CircleWaveLayout circleWaveLayout;
        FrameLayout frameLayout9;
        FrameLayout frameLayout10;
        FrameLayout frameLayout11;
        FrameLayout frameLayout12;
        int i21;
        PoiCardWebPageContainer poiCardWebPageContainer;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout13 = new FrameLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        frameLayout13.setBackgroundColor(resources.getColor(R.color.l3));
        frameLayout13.setId(R.id.edc);
        if (viewGroup2 != null) {
            frameLayout13.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout13);
            }
        }
        SmartImageView smartImageView = new SmartImageView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        smartImageView.setBackgroundResource(R.drawable.amv);
        smartImageView.setId(R.id.a4g);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        smartImageView.setLayoutParams(layoutParams);
        if (smartImageView.getParent() == null) {
            frameLayout13.addView(smartImageView);
        }
        View view8 = new View(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        view8.setBackgroundResource(R.drawable.ml);
        view8.setId(R.id.aso);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 80;
        }
        view8.setLayoutParams(layoutParams2);
        if (view8.getParent() == null) {
            frameLayout13.addView(view8);
        }
        LongPressLayout longPressLayout = new LongPressLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        longPressLayout.setId(R.id.bvy);
        longPressLayout.setLayoutParams(layoutParams3);
        if (longPressLayout.getParent() == null) {
            frameLayout13.addView(longPressLayout);
        }
        FrameLayout frameLayout14 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout14.setId(R.id.b2b);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 17;
        }
        frameLayout14.setLayoutParams(layoutParams4);
        if (frameLayout14.getParent() == null) {
            frameLayout13.addView(frameLayout14);
        }
        FrameLayout frameLayout15 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 300.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 500.0f, resources.getDisplayMetrics()));
        frameLayout15.setId(R.id.aws);
        frameLayout15.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.topMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        frameLayout15.setVisibility(8);
        frameLayout15.setLayoutParams(layoutParams5);
        if (frameLayout15.getParent() == null) {
            frameLayout13.addView(frameLayout15);
        }
        RemoteImageView remoteImageView3 = new RemoteImageView(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        remoteImageView3.setId(R.id.eht);
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        remoteImageView3.setVisibility(8);
        remoteImageView3.setLayoutParams(layoutParams6);
        if (remoteImageView3.getParent() == null) {
            frameLayout13.addView(remoteImageView3);
        }
        ViewStub viewStub7 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub7.setLayoutResource(R.layout.a9q);
        viewStub7.setId(R.id.cx);
        viewStub7.setLayoutParams(layoutParams7);
        if (viewStub7.getParent() == null) {
            frameLayout13.addView(viewStub7);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        relativeLayout.setId(R.id.eh4);
        relativeLayout.setLayoutParams(layoutParams8);
        if (relativeLayout.getParent() == null) {
            frameLayout13.addView(relativeLayout);
        }
        FrameLayout frameLayout16 = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(2, R.id.nk);
        }
        frameLayout16.setId(R.id.ec2);
        frameLayout16.setLayoutParams(layoutParams9);
        if (frameLayout16.getParent() == null) {
            relativeLayout.addView(frameLayout16);
        }
        ViewStub viewStub8 = new ViewStub(context2);
        FrameLayout frameLayout17 = frameLayout16;
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(2, R.id.jh);
        }
        viewStub8.setId(R.id.bq5);
        if (MarginLayoutParams.class.isInstance(layoutParams10)) {
            viewStub = viewStub7;
            layoutParams10.bottomMargin = (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        } else {
            viewStub = viewStub7;
        }
        viewStub8.setLayoutParams(layoutParams10);
        if (viewStub8.getParent() == null) {
            relativeLayout.addView(viewStub8);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(2, R.id.nk);
        }
        linearLayout3.setId(R.id.jh);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(layoutParams11);
        if (linearLayout3.getParent() == null) {
            relativeLayout.addView(linearLayout3);
        }
        RemoteImageView remoteImageView4 = new RemoteImageView(context2);
        ViewStub viewStub9 = viewStub8;
        RemoteImageView remoteImageView5 = remoteImageView3;
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 76.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        remoteImageView4.setId(R.id.d6);
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12) && VERSION.SDK_INT >= 17) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        remoteImageView4.setVisibility(8);
        remoteImageView4.setLayoutParams(layoutParams12);
        if (remoteImageView4.getParent() == null) {
            linearLayout3.addView(remoteImageView4);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        linearLayout4.setBackgroundResource(R.drawable.us);
        linearLayout4.setId(R.id.e_m);
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            remoteImageView = remoteImageView4;
            layoutParams13.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            remoteImageView = remoteImageView4;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams13) && VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        linearLayout4.setGravity(16);
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        linearLayout4.setVisibility(8);
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(layoutParams13);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4);
        }
        RemoteImageView remoteImageView6 = new RemoteImageView(context2);
        FrameLayout frameLayout18 = frameLayout15;
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        ((C13438a) remoteImageView6.getHierarchy()).mo32902c((int) R.drawable.co1);
        remoteImageView6.setId(R.id.e_n);
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        ((C13438a) remoteImageView6.getHierarchy()).mo32896a(C13423b.f35595c);
        if (MarginLayoutParams.class.isInstance(layoutParams14) && VERSION.SDK_INT >= 17) {
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14) && VERSION.SDK_INT >= 17) {
            layoutParams14.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            i = 1;
            layoutParams14.topMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        } else {
            i = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.bottomMargin = (int) TypedValue.applyDimension(i, 3.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.rightMargin = (int) TypedValue.applyDimension(i, 2.0f, resources.getDisplayMetrics());
        }
        remoteImageView6.setLayoutParams(layoutParams14);
        if (remoteImageView6.getParent() == null) {
            linearLayout4.addView(remoteImageView6);
        }
        DmtTextView dmtTextView4 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView4.setId(R.id.e_o);
        dmtTextView4.setTextSize(1, 13.0f);
        if (!MarginLayoutParams.class.isInstance(layoutParams15) || VERSION.SDK_INT < 17) {
            remoteImageView2 = remoteImageView6;
        } else {
            remoteImageView2 = remoteImageView6;
            layoutParams15.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            f = 2.0f;
            layoutParams15.topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        } else {
            f = 2.0f;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
        dmtTextView4.setLineSpacing(TypedValue.applyDimension(2, 3.0f, resources.getDisplayMetrics()), 1.0f);
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.rightMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        dmtTextView4.setTextColor(resources.getColorStateList(R.color.m1));
        dmtTextView4.setLayoutParams(layoutParams15);
        if (dmtTextView4.getParent() == null) {
            linearLayout4.addView(dmtTextView4);
        }
        FrameLayout frameLayout19 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, -2);
        frameLayout19.setId(R.id.ebn);
        frameLayout19.setLayoutParams(layoutParams16);
        if (frameLayout19.getParent() == null) {
            linearLayout3.addView(frameLayout19);
        }
        TagLayout tagLayout = new TagLayout(context2);
        DmtTextView dmtTextView5 = dmtTextView4;
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        tagLayout.setId(R.id.ebo);
        if (MarginLayoutParams.class.isInstance(layoutParams17)) {
            linearLayout = linearLayout4;
            layoutParams17.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            linearLayout = linearLayout4;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams17) && VERSION.SDK_INT >= 17) {
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        tagLayout.setLayoutParams(layoutParams17);
        if (tagLayout.getParent() == null) {
            frameLayout19.addView(tagLayout);
        }
        AnimationImageView animationImageView2 = new AnimationImageView(context2);
        TagLayout tagLayout2 = tagLayout;
        FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 66.0f, resources.getDisplayMetrics()));
        animationImageView2.setId(R.id.ebg);
        if (MarginLayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        animationImageView2.setLayoutParams(layoutParams18);
        if (animationImageView2.getParent() == null) {
            frameLayout19.addView(animationImageView2);
        }
        CommerceMicroTagLayout commerceMicroTagLayout2 = new CommerceMicroTagLayout(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        commerceMicroTagLayout2.setId(R.id.byo);
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19) && VERSION.SDK_INT >= 17) {
            layoutParams19.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams19) || VERSION.SDK_INT < 17) {
            animationImageView = animationImageView2;
        } else {
            animationImageView = animationImageView2;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            i2 = 1;
            layoutParams19.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        } else {
            i2 = 1;
        }
        commerceMicroTagLayout2.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.rightMargin = (int) TypedValue.applyDimension(i2, 100.0f, resources.getDisplayMetrics());
        }
        commerceMicroTagLayout2.setLayoutParams(layoutParams19);
        if (commerceMicroTagLayout2.getParent() == null) {
            linearLayout3.addView(commerceMicroTagLayout2);
        }
        StarAtlasTagLayout starAtlasTagLayout2 = new StarAtlasTagLayout(context2);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-2, -2);
        starAtlasTagLayout2.setId(R.id.d_e);
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams20) && VERSION.SDK_INT >= 17) {
            layoutParams20.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams20) || VERSION.SDK_INT < 17) {
            commerceMicroTagLayout = commerceMicroTagLayout2;
        } else {
            commerceMicroTagLayout = commerceMicroTagLayout2;
            layoutParams20.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            i3 = 1;
            layoutParams20.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        } else {
            i3 = 1;
        }
        starAtlasTagLayout2.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.rightMargin = (int) TypedValue.applyDimension(i3, 100.0f, resources.getDisplayMetrics());
        }
        starAtlasTagLayout2.setLayoutParams(layoutParams20);
        if (starAtlasTagLayout2.getParent() == null) {
            linearLayout3.addView(starAtlasTagLayout2);
        }
        NationalTaskTagLayout nationalTaskTagLayout2 = new NationalTaskTagLayout(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, -2);
        nationalTaskTagLayout2.setId(R.id.dgm);
        if (MarginLayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams21) && VERSION.SDK_INT >= 17) {
            layoutParams21.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams21) || VERSION.SDK_INT < 17) {
            starAtlasTagLayout = starAtlasTagLayout2;
        } else {
            starAtlasTagLayout = starAtlasTagLayout2;
            layoutParams21.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams21)) {
            i4 = 1;
            layoutParams21.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        } else {
            i4 = 1;
        }
        nationalTaskTagLayout2.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.rightMargin = (int) TypedValue.applyDimension(i4, 100.0f, resources.getDisplayMetrics());
        }
        nationalTaskTagLayout2.setLayoutParams(layoutParams21);
        if (nationalTaskTagLayout2.getParent() == null) {
            linearLayout3.addView(nationalTaskTagLayout2);
        }
        FrameLayout frameLayout20 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout20.setId(R.id.amr);
        if (MarginLayoutParams.class.isInstance(layoutParams22)) {
            nationalTaskTagLayout = nationalTaskTagLayout2;
            i5 = 1;
            layoutParams22.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            nationalTaskTagLayout = nationalTaskTagLayout2;
            i5 = 1;
        }
        frameLayout20.setClipChildren(false);
        if (MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.bottomMargin = (int) TypedValue.applyDimension(i5, 10.0f, resources.getDisplayMetrics());
        }
        frameLayout20.setVisibility(8);
        frameLayout20.setLayoutParams(layoutParams22);
        if (frameLayout20.getParent() == null) {
            linearLayout3.addView(frameLayout20);
        }
        CommerceTagLayout commerceTagLayout2 = new CommerceTagLayout(context2);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-2, -2);
        commerceTagLayout2.setId(R.id.bmy);
        if (MarginLayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23) && VERSION.SDK_INT >= 17) {
            layoutParams23.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23)) {
            frameLayout = frameLayout20;
            layoutParams23.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        } else {
            frameLayout = frameLayout20;
        }
        commerceTagLayout2.setVisibility(8);
        commerceTagLayout2.setLayoutParams(layoutParams23);
        if (commerceTagLayout2.getParent() == null) {
            linearLayout3.addView(commerceTagLayout2);
        }
        DouPlusTagLayout douPlusTagLayout2 = new DouPlusTagLayout(context2);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, -2);
        douPlusTagLayout2.setId(R.id.a_r);
        if (MarginLayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams24) && VERSION.SDK_INT >= 17) {
            layoutParams24.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams24) || VERSION.SDK_INT < 17) {
            commerceTagLayout = commerceTagLayout2;
        } else {
            commerceTagLayout = commerceTagLayout2;
            layoutParams24.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams24)) {
            i6 = 1;
            layoutParams24.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        } else {
            i6 = 1;
        }
        douPlusTagLayout2.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.rightMargin = (int) TypedValue.applyDimension(i6, 100.0f, resources.getDisplayMetrics());
        }
        douPlusTagLayout2.setLayoutParams(layoutParams24);
        if (douPlusTagLayout2.getParent() == null) {
            linearLayout3.addView(douPlusTagLayout2);
        }
        FrameLayout frameLayout21 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout21.setId(R.id.a0m);
        if (MarginLayoutParams.class.isInstance(layoutParams25)) {
            douPlusTagLayout = douPlusTagLayout2;
            layoutParams25.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            douPlusTagLayout = douPlusTagLayout2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams25) && VERSION.SDK_INT >= 17) {
            layoutParams25.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams25) && VERSION.SDK_INT >= 17) {
            layoutParams25.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams25)) {
            i7 = 1;
            layoutParams25.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            i7 = 1;
        }
        frameLayout21.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.rightMargin = (int) TypedValue.applyDimension(i7, 100.0f, resources.getDisplayMetrics());
        }
        frameLayout21.setLayoutParams(layoutParams25);
        if (frameLayout21.getParent() == null) {
            linearLayout3.addView(frameLayout21);
        }
        FrameLayout frameLayout22 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout22.setId(R.id.ajl);
        frameLayout22.setLayoutParams(layoutParams26);
        if (frameLayout22.getParent() == null) {
            linearLayout3.addView(frameLayout22);
        }
        DmtTextView dmtTextView6 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams27)) {
            frameLayout3 = frameLayout22;
            frameLayout2 = frameLayout21;
            i8 = 1;
            layoutParams27.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            frameLayout3 = frameLayout22;
            frameLayout2 = frameLayout21;
            i8 = 1;
        }
        dmtTextView6.setTextSize(2, 13.0f);
        FrameLayout frameLayout23 = frameLayout19;
        dmtTextView6.setPadding(dmtTextView6.getPaddingLeft(), dmtTextView6.getPaddingTop(), (int) TypedValue.applyDimension(i8, 4.0f, resources.getDisplayMetrics()), dmtTextView6.getPaddingBottom());
        if (!MarginLayoutParams.class.isInstance(layoutParams27) || VERSION.SDK_INT < 17) {
            i9 = 1;
        } else {
            i9 = 1;
            layoutParams27.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        dmtTextView6.setCompoundDrawablePadding((int) TypedValue.applyDimension(i9, 1.0f, resources.getDisplayMetrics()));
        dmtTextView6.setId(R.id.u8);
        dmtTextView6.setEllipsize(TruncateAt.END);
        FrameLayout frameLayout24 = frameLayout14;
        dmtTextView6.setPadding(dmtTextView6.getPaddingLeft(), dmtTextView6.getPaddingTop(), dmtTextView6.getPaddingRight(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        dmtTextView6.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView6.setPadding(dmtTextView6.getPaddingLeft(), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), dmtTextView6.getPaddingRight(), dmtTextView6.getPaddingBottom());
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams27)) {
            ((RelativeLayout.LayoutParams) layoutParams27).addRule(2, R.id.bkg);
        }
        dmtTextView6.setPadding((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), dmtTextView6.getPaddingTop(), dmtTextView6.getPaddingRight(), dmtTextView6.getPaddingBottom());
        dmtTextView6.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView6.setBackgroundResource(R.drawable.lj);
        dmtTextView6.setPadding((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), dmtTextView6.getPaddingTop(), dmtTextView6.getPaddingRight(), dmtTextView6.getPaddingBottom());
        dmtTextView6.setPadding(dmtTextView6.getPaddingLeft(), dmtTextView6.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView6.getPaddingBottom());
        dmtTextView6.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.a8l), dmtTextView6.getCompoundDrawablesRelative()[1], dmtTextView6.getCompoundDrawablesRelative()[2], dmtTextView6.getCompoundDrawablesRelative()[3]);
        dmtTextView6.setMaxLines(1);
        if (MarginLayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView6.setGravity(17);
        dmtTextView6.setVisibility(8);
        if (TextView.class.isInstance(dmtTextView6)) {
            C1444a.m7244b(dmtTextView6, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        } else {
            dmtTextView6.setMinimumHeight((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        dmtTextView6.setLayoutParams(layoutParams27);
        if (dmtTextView6.getParent() == null) {
            linearLayout3.addView(dmtTextView6);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams28) && VERSION.SDK_INT >= 17) {
            layoutParams28.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams28) && VERSION.SDK_INT >= 17) {
            layoutParams28.setMarginEnd((int) resources.getDimension(R.dimen.xd));
        }
        linearLayout5.setOrientation(0);
        if (MarginLayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.rightMargin = (int) resources.getDimension(R.dimen.xd);
        }
        linearLayout5.setLayoutParams(layoutParams28);
        if (linearLayout5.getParent() == null) {
            linearLayout3.addView(linearLayout5);
        }
        EllipsizeLayout ellipsizeLayout = new EllipsizeLayout(context2);
        LinearLayout.LayoutParams layoutParams29 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        ellipsizeLayout.setId(R.id.bkg);
        ellipsizeLayout.setGravity(16);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.weight = 1.0f;
        }
        ellipsizeLayout.setOrientation(0);
        ellipsizeLayout.setLayoutParams(layoutParams29);
        if (ellipsizeLayout.getParent() == null) {
            linearLayout5.addView(ellipsizeLayout);
        }
        DmtTextView dmtTextView7 = new DmtTextView(context2);
        MarginLayoutParams a2 = C1444a.m7241a(ellipsizeLayout, -2, -2);
        dmtTextView7.setTextSize(2, 15.0f);
        DmtTextView dmtTextView8 = dmtTextView6;
        dmtTextView7.setShadowLayer(1.0f, dmtTextView7.getShadowDx(), dmtTextView7.getShadowDy(), dmtTextView7.getShadowColor());
        dmtTextView7.setShadowLayer(dmtTextView7.getShadowRadius(), dmtTextView7.getShadowDx(), dmtTextView7.getShadowDy(), resources.getColor(R.color.px));
        dmtTextView7.setTextColor(resources.getColorStateList(R.color.zg));
        dmtTextView7.setId(R.id.title);
        dmtTextView7.setEllipsize(TruncateAt.END);
        dmtTextView7.setMaxLines(1);
        dmtTextView7.setShadowLayer(dmtTextView7.getShadowRadius(), dmtTextView7.getShadowDx(), 1.0f, dmtTextView7.getShadowColor());
        dmtTextView7.setGravity(16);
        if (VERSION.SDK_INT >= 21) {
            dmtTextView7.setLetterSpacing(-0.01f);
        }
        dmtTextView7.setIncludeFontPadding(false);
        dmtTextView7.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        if (TextView.class.isInstance(dmtTextView7)) {
            C1444a.m7244b(dmtTextView7, (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        } else {
            dmtTextView7.setMinimumHeight((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        dmtTextView7.setLayoutParams(a2);
        if (dmtTextView7.getParent() == null) {
            ellipsizeLayout.addView(dmtTextView7);
        }
        ViewStub viewStub10 = new ViewStub(context2);
        MarginLayoutParams a3 = C1444a.m7241a(ellipsizeLayout, (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        viewStub10.setId(R.id.bou);
        if (!MarginLayoutParams.class.isInstance(a3) || VERSION.SDK_INT < 17) {
            dmtTextView = dmtTextView7;
        } else {
            dmtTextView = dmtTextView7;
            a3.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        viewStub10.setLayoutParams(a3);
        if (viewStub10.getParent() == null) {
            ellipsizeLayout.addView(viewStub10);
        }
        DmtTextView dmtTextView9 = new DmtTextView(context2);
        MarginLayoutParams a4 = C1444a.m7241a(ellipsizeLayout, -2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        dmtTextView9.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView9.setTextSize(1, 13.0f);
        dmtTextView9.setText(R.string.di);
        if (MarginLayoutParams.class.isInstance(a4)) {
            viewStub2 = viewStub10;
            a4.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            viewStub2 = viewStub10;
        }
        dmtTextView9.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), dmtTextView9.getPaddingTop(), dmtTextView9.getPaddingRight(), dmtTextView9.getPaddingBottom());
        LongPressLayout longPressLayout2 = longPressLayout;
        dmtTextView9.setPadding(dmtTextView9.getPaddingLeft(), dmtTextView9.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), dmtTextView9.getPaddingBottom());
        if (MarginLayoutParams.class.isInstance(a4) && VERSION.SDK_INT >= 17) {
            a4.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (!MarginLayoutParams.class.isInstance(a4) || VERSION.SDK_INT < 17) {
            i10 = 1;
            f2 = 4.0f;
        } else {
            i10 = 1;
            f2 = 4.0f;
            a4.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a4)) {
            a4.bottomMargin = (int) TypedValue.applyDimension(i10, f2, resources.getDisplayMetrics());
        }
        dmtTextView9.setTextColor(resources.getColorStateList(R.color.az3));
        dmtTextView9.setBackgroundResource(R.drawable.hu);
        dmtTextView9.setId(R.id.dth);
        dmtTextView9.setPadding((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), dmtTextView9.getPaddingTop(), dmtTextView9.getPaddingRight(), dmtTextView9.getPaddingBottom());
        dmtTextView9.setPadding(dmtTextView9.getPaddingLeft(), dmtTextView9.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), dmtTextView9.getPaddingBottom());
        if (MarginLayoutParams.class.isInstance(a4)) {
            a4.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView9.setGravity(17);
        dmtTextView9.setVisibility(8);
        dmtTextView9.setIncludeFontPadding(false);
        dmtTextView9.setLineSpacing(TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), 1.0f);
        if (MarginLayoutParams.class.isInstance(a4)) {
            a4.rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView9.setLayoutParams(a4);
        if (dmtTextView9.getParent() == null) {
            ellipsizeLayout.addView(dmtTextView9);
        }
        FrameLayout frameLayout25 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams30 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout25.setId(R.id.ebb);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams30)) {
            i11 = 16;
            layoutParams30.gravity = 16;
        } else {
            i11 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams30)) {
            ((FrameLayout.LayoutParams) layoutParams30).gravity = i11;
        }
        frameLayout25.setLayoutParams(layoutParams30);
        if (frameLayout25.getParent() == null) {
            linearLayout5.addView(frameLayout25);
        }
        FrameLayout frameLayout26 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams31 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout26.setId(R.id.eb7);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams31)) {
            i12 = 16;
            layoutParams31.gravity = 16;
        } else {
            i12 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams31)) {
            ((FrameLayout.LayoutParams) layoutParams31).gravity = i12;
        }
        frameLayout26.setLayoutParams(layoutParams31);
        if (frameLayout26.getParent() == null) {
            linearLayout5.addView(frameLayout26);
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout6.setId(R.id.cg8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams32)) {
            frameLayout4 = frameLayout26;
            ((RelativeLayout.LayoutParams) layoutParams32).addRule(3, R.id.bkg);
        } else {
            frameLayout4 = frameLayout26;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams32)) {
            frameLayout5 = frameLayout25;
            layoutParams32.topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        } else {
            frameLayout5 = frameLayout25;
        }
        linearLayout6.setVisibility(8);
        linearLayout6.setOrientation(0);
        linearLayout6.setLayoutParams(layoutParams32);
        if (linearLayout6.getParent() == null) {
            linearLayout3.addView(linearLayout6);
        }
        RatingBar ratingBar2 = new RatingBar(context2);
        LinearLayout.LayoutParams layoutParams33 = new LinearLayout.LayoutParams(-2, -2);
        ratingBar2.setStepSize(1);
        ratingBar2.setStarFillDrawable(context.getResources().getDrawable(R.drawable.aev));
        ratingBar2.setStarImageSize(TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        ratingBar2.setId(R.id.d_b);
        ratingBar2.setStarHalfDrawable(context.getResources().getDrawable(R.drawable.aeu));
        if (MarginLayoutParams.class.isInstance(layoutParams33)) {
            dmtTextView2 = dmtTextView9;
            i13 = 1;
            layoutParams33.topMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView2 = dmtTextView9;
            i13 = 1;
        }
        ratingBar2.setStarEmptyDrawable(context.getResources().getDrawable(R.drawable.aew));
        ratingBar2.setStarPadding(TypedValue.applyDimension(i13, 2.0f, resources.getDisplayMetrics()));
        ratingBar2.setStarStep(0.0f);
        ratingBar2.setStarCount(5);
        ratingBar2.setClickable(false);
        ratingBar2.setLayoutParams(layoutParams33);
        if (ratingBar2.getParent() == null) {
            linearLayout6.addView(ratingBar2);
        }
        DmtTextView dmtTextView10 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            ratingBar = ratingBar2;
            layoutParams34.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            ratingBar = ratingBar2;
        }
        dmtTextView10.setTextSize(2, 12.0f);
        dmtTextView10.setShadowLayer(2.0f, dmtTextView10.getShadowDx(), dmtTextView10.getShadowDy(), dmtTextView10.getShadowColor());
        if (MarginLayoutParams.class.isInstance(layoutParams34) && VERSION.SDK_INT >= 17) {
            layoutParams34.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams34)) {
            i14 = 16;
            layoutParams34.gravity = 16;
        } else {
            i14 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams34)) {
            ((FrameLayout.LayoutParams) layoutParams34).gravity = i14;
        }
        dmtTextView10.setShadowLayer(dmtTextView10.getShadowRadius(), dmtTextView10.getShadowDx(), dmtTextView10.getShadowDy(), resources.getColor(R.color.px));
        dmtTextView10.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView10.setId(R.id.cni);
        dmtTextView10.setShadowLayer(dmtTextView10.getShadowRadius(), dmtTextView10.getShadowDx(), 2.0f, dmtTextView10.getShadowColor());
        dmtTextView10.setIncludeFontPadding(false);
        dmtTextView10.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView10.setLayoutParams(layoutParams34);
        if (dmtTextView10.getParent() == null) {
            linearLayout6.addView(dmtTextView10);
        }
        FrameLayout frameLayout27 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams35)) {
            ((RelativeLayout.LayoutParams) layoutParams35).addRule(2, R.id.ec3);
        }
        frameLayout27.setId(R.id.ec0);
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            dmtTextView3 = dmtTextView10;
            layoutParams35.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView3 = dmtTextView10;
        }
        frameLayout27.setLayoutParams(layoutParams35);
        if (frameLayout27.getParent() == null) {
            linearLayout3.addView(frameLayout27);
        }
        ViewStub viewStub11 = new ViewStub(context2);
        FrameLayout frameLayout28 = frameLayout27;
        LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 400.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 68.0f, resources.getDisplayMetrics()));
        viewStub11.setId(R.id.bot);
        if (!MarginLayoutParams.class.isInstance(layoutParams36) || VERSION.SDK_INT < 17) {
            i15 = 1;
        } else {
            i15 = 1;
            layoutParams36.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams36)) {
            layoutParams36.topMargin = (int) TypedValue.applyDimension(i15, 4.0f, resources.getDisplayMetrics());
        }
        viewStub11.setLayoutParams(layoutParams36);
        if (viewStub11.getParent() == null) {
            linearLayout3.addView(viewStub11);
        }
        FrameLayout frameLayout29 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams37 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams37)) {
            ((RelativeLayout.LayoutParams) layoutParams37).addRule(2, R.id.c3q);
        }
        frameLayout29.setLayoutParams(layoutParams37);
        if (frameLayout29.getParent() == null) {
            linearLayout3.addView(frameLayout29);
        }
        FrameLayout frameLayout30 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams38 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.kc), -2);
        frameLayout30.setId(R.id.ec3);
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            viewStub3 = viewStub11;
            layoutParams38.leftMargin = (int) resources.getDimension(R.dimen.xc);
        } else {
            viewStub3 = viewStub11;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams38) && VERSION.SDK_INT >= 17) {
            layoutParams38.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams38) || VERSION.SDK_INT < 17) {
            linearLayout2 = linearLayout6;
            i16 = 1;
        } else {
            linearLayout2 = linearLayout6;
            i16 = 1;
            layoutParams38.setMarginEnd((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.topMargin = (int) TypedValue.applyDimension(i16, 4.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.bottomMargin = (int) TypedValue.applyDimension(i16, 1.0f, resources.getDisplayMetrics());
        }
        frameLayout30.setPadding(frameLayout30.getPaddingLeft(), (int) TypedValue.applyDimension(i16, 2.0f, resources.getDisplayMetrics()), frameLayout30.getPaddingRight(), frameLayout30.getPaddingBottom());
        frameLayout30.setLayoutParams(layoutParams38);
        if (frameLayout30.getParent() == null) {
            frameLayout29.addView(frameLayout30);
        }
        FrameLayout frameLayout31 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams39 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout31.setId(R.id.c3q);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams39)) {
            ((RelativeLayout.LayoutParams) layoutParams39).addRule(12, -1);
        }
        frameLayout31.setLayoutParams(layoutParams39);
        if (frameLayout31.getParent() == null) {
            linearLayout3.addView(frameLayout31);
        }
        ButtonAdBottomLabelView buttonAdBottomLabelView = new ButtonAdBottomLabelView(context2);
        FrameLayout.LayoutParams layoutParams40 = new FrameLayout.LayoutParams(-2, -2);
        buttonAdBottomLabelView.setId(R.id.c3r);
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            frameLayout6 = frameLayout29;
            frameLayout7 = frameLayout30;
            layoutParams40.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            frameLayout6 = frameLayout29;
            frameLayout7 = frameLayout30;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams40) || VERSION.SDK_INT < 17) {
            i17 = 1;
        } else {
            i17 = 1;
            layoutParams40.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.topMargin = (int) TypedValue.applyDimension(i17, 10.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.bottomMargin = (int) resources.getDimension(R.dimen.ke);
        }
        buttonAdBottomLabelView.setLayoutParams(layoutParams40);
        if (buttonAdBottomLabelView.getParent() == null) {
            frameLayout31.addView(buttonAdBottomLabelView);
        }
        ViewStub viewStub12 = new ViewStub(context2);
        ButtonAdBottomLabelView buttonAdBottomLabelView2 = buttonAdBottomLabelView;
        LinearLayout.LayoutParams layoutParams41 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 34.0f, resources.getDisplayMetrics()));
        viewStub12.setLayoutResource(R.layout.aby);
        viewStub12.setId(R.id.ea_);
        if (MarginLayoutParams.class.isInstance(layoutParams41)) {
            layoutParams41.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams41) && VERSION.SDK_INT >= 17) {
            layoutParams41.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams41)) {
            layoutParams41.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        viewStub12.setLayoutParams(layoutParams41);
        if (viewStub12.getParent() == null) {
            linearLayout3.addView(viewStub12);
        }
        FrameLayout frameLayout32 = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -2);
        frameLayout32.setId(R.id.nk);
        if (MarginLayoutParams.class.isInstance(layoutParams42)) {
            viewStub4 = viewStub12;
            layoutParams42.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            viewStub4 = viewStub12;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams42)) {
            layoutParams42.addRule(12, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams42)) {
            layoutParams42.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        frameLayout32.setLayoutParams(layoutParams42);
        if (frameLayout32.getParent() == null) {
            relativeLayout.addView(frameLayout32);
        }
        View view9 = new View(context2);
        FrameLayout.LayoutParams layoutParams43 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.bi));
        view9.setBackgroundResource(R.drawable.gz);
        view9.setId(R.id.nn);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams43)) {
            ((LinearLayout.LayoutParams) layoutParams43).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams43)) {
            layoutParams43.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams43)) {
            layoutParams43.bottomMargin = (int) resources.getDimension(R.dimen.bl);
        }
        view9.setLayoutParams(layoutParams43);
        if (view9.getParent() == null) {
            frameLayout32.addView(view9);
        }
        ViewStub viewStub13 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams44 = new FrameLayout.LayoutParams(-1, -2);
        viewStub13.setId(R.id.bpz);
        if (!MarginLayoutParams.class.isInstance(layoutParams44) || VERSION.SDK_INT < 17) {
            view = view9;
            frameLayout8 = frameLayout31;
        } else {
            view = view9;
            frameLayout8 = frameLayout31;
            layoutParams44.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams44) && VERSION.SDK_INT >= 17) {
            layoutParams44.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams44)) {
            ((LinearLayout.LayoutParams) layoutParams44).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams44)) {
            layoutParams44.gravity = 80;
        }
        viewStub13.setLayoutParams(layoutParams44);
        if (viewStub13.getParent() == null) {
            frameLayout32.addView(viewStub13);
        }
        StripAdBottomLabelView stripAdBottomLabelView2 = new StripAdBottomLabelView(context2);
        FrameLayout.LayoutParams layoutParams45 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.bi));
        stripAdBottomLabelView2.setId(R.id.c8c);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams45)) {
            ((LinearLayout.LayoutParams) layoutParams45).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.bottomMargin = (int) resources.getDimension(R.dimen.bl);
        }
        stripAdBottomLabelView2.setLayoutParams(layoutParams45);
        if (stripAdBottomLabelView2.getParent() == null) {
            frameLayout32.addView(stripAdBottomLabelView2);
        }
        View a5 = C2058a.m9123a(context2, R.layout.mf, frameLayout32, false, 0);
        if (a5 == null || a5 == frameLayout32) {
            stripAdBottomLabelView = stripAdBottomLabelView2;
            viewStub5 = viewStub13;
        } else {
            FrameLayout.LayoutParams layoutParams46 = new FrameLayout.LayoutParams(-1, -2);
            a5.setId(R.id.ajh);
            if (MarginLayoutParams.class.isInstance(layoutParams46)) {
                stripAdBottomLabelView = stripAdBottomLabelView2;
                viewStub5 = viewStub13;
                layoutParams46.bottomMargin = (int) TypedValue.applyDimension(1, -83.0f, resources.getDisplayMetrics());
            } else {
                stripAdBottomLabelView = stripAdBottomLabelView2;
                viewStub5 = viewStub13;
            }
            a5.setLayoutParams(layoutParams46);
            if (a5.getParent() == null) {
                frameLayout32.addView(a5);
            }
        }
        View a6 = C2058a.m9123a(context2, R.layout.aho, frameLayout32, false, 0);
        if (!(a6 == null || a6 == frameLayout32)) {
            FrameLayout.LayoutParams layoutParams47 = new FrameLayout.LayoutParams(-1, -2);
            a6.setId(R.id.aji);
            a6.setLayoutParams(layoutParams47);
            if (a6.getParent() == null) {
                frameLayout32.addView(a6);
            }
        }
        View a7 = C2058a.m9123a(context2, R.layout.fl, frameLayout32, false, 0);
        if (!(a7 == null || a7 == frameLayout32)) {
            FrameLayout.LayoutParams layoutParams48 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.bi));
            a7.setId(R.id.bt);
            a7.setVisibility(8);
            a7.setLayoutParams(layoutParams48);
            if (a7.getParent() == null) {
                frameLayout32.addView(a7);
            }
        }
        View a8 = C2058a.m9123a(context2, R.layout.hi, frameLayout32, false, 0);
        if (a8 == null || a8 == frameLayout32) {
            view2 = a7;
        } else {
            view2 = a7;
            FrameLayout.LayoutParams layoutParams49 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.bi));
            a8.setId(R.id.jg);
            a8.setVisibility(8);
            a8.setLayoutParams(layoutParams49);
            if (a8.getParent() == null) {
                frameLayout32.addView(a8);
            }
        }
        View a9 = C2058a.m9123a(context2, R.layout.hj, frameLayout32, false, 0);
        if (a9 == null || a9 == frameLayout32) {
            view3 = a8;
        } else {
            view3 = a8;
            FrameLayout.LayoutParams layoutParams50 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.bi));
            a9.setId(R.id.jf);
            a9.setVisibility(8);
            a9.setLayoutParams(layoutParams50);
            if (a9.getParent() == null) {
                frameLayout32.addView(a9);
            }
        }
        View a10 = C2058a.m9123a(context2, R.layout.aae, frameLayout32, false, 0);
        if (a10 == null || a10 == frameLayout32) {
            view4 = a9;
        } else {
            view4 = a9;
            FrameLayout.LayoutParams layoutParams51 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.bi));
            a10.setId(R.id.d4y);
            a10.setVisibility(8);
            a10.setLayoutParams(layoutParams51);
            if (a10.getParent() == null) {
                frameLayout32.addView(a10);
            }
        }
        View a11 = C2058a.m9123a(context2, R.layout.ajs, frameLayout32, false, 0);
        if (a11 == null || a11 == frameLayout32) {
            view5 = a10;
        } else {
            view5 = a10;
            FrameLayout.LayoutParams layoutParams52 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.bi));
            a11.setId(R.id.ajk);
            a11.setVisibility(8);
            a11.setLayoutParams(layoutParams52);
            if (a11.getParent() == null) {
                frameLayout32.addView(a11);
            }
        }
        DebugInfoView debugInfoView = new DebugInfoView(context2);
        View view10 = a11;
        RelativeLayout.LayoutParams layoutParams53 = new RelativeLayout.LayoutParams(-1, -2);
        debugInfoView.setId(R.id.a6d);
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            view6 = a6;
            layoutParams53.leftMargin = (int) resources.getDimension(R.dimen.xc);
        } else {
            view6 = a6;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams53) || VERSION.SDK_INT < 17) {
            view7 = a5;
        } else {
            view7 = a5;
            layoutParams53.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53) && VERSION.SDK_INT >= 17) {
            layoutParams53.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            i18 = 1;
            layoutParams53.topMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        } else {
            i18 = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.bottomMargin = (int) TypedValue.applyDimension(i18, 210.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.rightMargin = (int) TypedValue.applyDimension(i18, 10.0f, resources.getDisplayMetrics());
        }
        debugInfoView.setLayoutParams(layoutParams53);
        if (debugInfoView.getParent() == null) {
            relativeLayout.addView(debugInfoView);
        }
        ViewStub viewStub14 = new ViewStub(context2);
        DebugInfoView debugInfoView2 = debugInfoView;
        RelativeLayout.LayoutParams layoutParams54 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.addRule(2, R.id.nk);
        }
        viewStub14.setLayoutResource(R.layout.abz);
        viewStub14.setId(R.id.ean);
        if (MarginLayoutParams.class.isInstance(layoutParams54) && VERSION.SDK_INT >= 17) {
            layoutParams54.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        viewStub14.setLayoutParams(layoutParams54);
        if (viewStub14.getParent() == null) {
            relativeLayout.addView(viewStub14);
        }
        RestrictTextView restrictTextView = new RestrictTextView(context2);
        RelativeLayout.LayoutParams layoutParams55 = new RelativeLayout.LayoutParams(-2, -2);
        restrictTextView.setId(R.id.e0p);
        if (MarginLayoutParams.class.isInstance(layoutParams55)) {
            viewStub6 = viewStub14;
            layoutParams55.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            viewStub6 = viewStub14;
        }
        restrictTextView.setTextSize(2, 16.0f);
        restrictTextView.setShadowLayer(1.0f, restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), restrictTextView.getShadowColor());
        if (!MarginLayoutParams.class.isInstance(layoutParams55) || VERSION.SDK_INT < 17) {
            i19 = 1;
        } else {
            i19 = 1;
            layoutParams55.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams55)) {
            layoutParams55.topMargin = (int) TypedValue.applyDimension(i19, 100.0f, resources.getDisplayMetrics());
        }
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), 1.0f, restrictTextView.getShadowColor());
        restrictTextView.setVisibility(8);
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), resources.getColor(R.color.a7f));
        restrictTextView.setTextColor(resources.getColorStateList(R.color.a5e));
        restrictTextView.setLayoutParams(layoutParams55);
        if (restrictTextView.getParent() == null) {
            relativeLayout.addView(restrictTextView);
        }
        LinearLayout linearLayout7 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams56 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams56)) {
            layoutParams56.addRule(2, R.id.ec2);
        }
        linearLayout7.setId(R.id.cte);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams56)) {
            i20 = -1;
            layoutParams56.addRule(11, -1);
        } else {
            i20 = -1;
        }
        linearLayout7.setGravity(8388613);
        linearLayout7.setOrientation(1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams56)) {
            layoutParams56.addRule(21, i20);
        }
        linearLayout7.setLayoutParams(layoutParams56);
        if (linearLayout7.getParent() == null) {
            relativeLayout.addView(linearLayout7);
        }
        CircleWaveLayout circleWaveLayout2 = new CircleWaveLayout(context2);
        RestrictTextView restrictTextView2 = restrictTextView;
        FrameLayout frameLayout33 = frameLayout32;
        LinearLayout.LayoutParams layoutParams57 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()));
        circleWaveLayout2.setId(R.id.bi);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams57)) {
            layoutParams57.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams57)) {
            ((FrameLayout.LayoutParams) layoutParams57).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams57)) {
            layoutParams57.bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        circleWaveLayout2.setVisibility(8);
        circleWaveLayout2.setLayoutParams(layoutParams57);
        if (circleWaveLayout2.getParent() == null) {
            linearLayout7.addView(circleWaveLayout2);
        }
        FrameLayout frameLayout34 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams58 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout34.setId(R.id.j3);
        frameLayout34.setLayoutParams(layoutParams58);
        if (frameLayout34.getParent() == null) {
            linearLayout7.addView(frameLayout34);
        }
        FrameLayout frameLayout35 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams59 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout35.setId(R.id.a8y);
        if (!MarginLayoutParams.class.isInstance(layoutParams59) || VERSION.SDK_INT < 17) {
            frameLayout9 = frameLayout34;
            circleWaveLayout = circleWaveLayout2;
        } else {
            frameLayout9 = frameLayout34;
            circleWaveLayout = circleWaveLayout2;
            layoutParams59.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams59)) {
            layoutParams59.rightMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        frameLayout35.setLayoutParams(layoutParams59);
        if (frameLayout35.getParent() == null) {
            linearLayout7.addView(frameLayout35);
        }
        FrameLayout frameLayout36 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams60 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout36.setId(R.id.ze);
        if (!MarginLayoutParams.class.isInstance(layoutParams60) || VERSION.SDK_INT < 17) {
            frameLayout10 = frameLayout35;
        } else {
            frameLayout10 = frameLayout35;
            layoutParams60.setMarginEnd((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams60)) {
            layoutParams60.rightMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        frameLayout36.setLayoutParams(layoutParams60);
        if (frameLayout36.getParent() == null) {
            linearLayout7.addView(frameLayout36);
        }
        FrameLayout frameLayout37 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams61 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout37.setId(R.id.d5b);
        if (!MarginLayoutParams.class.isInstance(layoutParams61) || VERSION.SDK_INT < 17) {
            frameLayout11 = frameLayout36;
        } else {
            frameLayout11 = frameLayout36;
            layoutParams61.setMarginEnd((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams61)) {
            layoutParams61.rightMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        frameLayout37.setLayoutParams(layoutParams61);
        if (frameLayout37.getParent() == null) {
            linearLayout7.addView(frameLayout37);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams62 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams62)) {
            layoutParams62.addRule(16, R.id.cte);
        }
        appCompatImageView3.setId(R.id.b98);
        if (!MarginLayoutParams.class.isInstance(layoutParams62) || VERSION.SDK_INT < 17) {
            frameLayout12 = frameLayout37;
            i21 = 1;
        } else {
            frameLayout12 = frameLayout37;
            i21 = 1;
            layoutParams62.setMarginEnd((int) TypedValue.applyDimension(1, -17.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams62)) {
            layoutParams62.bottomMargin = (int) TypedValue.applyDimension(i21, 15.0f, resources.getDisplayMetrics());
        }
        appCompatImageView3.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams62)) {
            layoutParams62.addRule(8, R.id.cte);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams62)) {
            layoutParams62.rightMargin = (int) TypedValue.applyDimension(1, -17.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams62)) {
            layoutParams62.addRule(0, R.id.cte);
        }
        appCompatImageView3.setLayoutParams(layoutParams62);
        if (appCompatImageView3.getParent() == null) {
            relativeLayout.addView(appCompatImageView3);
        }
        DmtTextView dmtTextView11 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams63 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView11.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView11.setTextSize(2, 13.0f);
        dmtTextView11.setId(R.id.e74);
        dmtTextView11.setText(R.string.fp_);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams63)) {
            layoutParams63.addRule(13, -1);
        }
        dmtTextView11.setVisibility(8);
        dmtTextView11.setTextColor(resources.getColorStateList(R.color.m1));
        dmtTextView11.setLayoutParams(layoutParams63);
        if (dmtTextView11.getParent() == null) {
            relativeLayout.addView(dmtTextView11);
        }
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context2);
        FrameLayout.LayoutParams layoutParams64 = new FrameLayout.LayoutParams(-1, -1);
        adHalfWebPageMaskLayer.setId(R.id.mq);
        adHalfWebPageMaskLayer.setVisibility(8);
        adHalfWebPageMaskLayer.setLayoutParams(layoutParams64);
        if (adHalfWebPageMaskLayer.getParent() == null) {
            frameLayout13.addView(adHalfWebPageMaskLayer);
        }
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context2);
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer2 = adHalfWebPageMaskLayer;
        DmtTextView dmtTextView12 = dmtTextView11;
        AppCompatImageView appCompatImageView4 = appCompatImageView3;
        FrameLayout.LayoutParams layoutParams65 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 255.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        adHalfWebPageContainer.setId(R.id.by);
        if (MarginLayoutParams.class.isInstance(layoutParams65)) {
            layoutParams65.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams65) && VERSION.SDK_INT >= 17) {
            layoutParams65.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams65)) {
            ((LinearLayout.LayoutParams) layoutParams65).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams65)) {
            layoutParams65.gravity = 8388691;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams65)) {
            layoutParams65.bottomMargin = (int) resources.getDimension(R.dimen.bk);
        }
        adHalfWebPageContainer.setLayoutParams(layoutParams65);
        if (adHalfWebPageContainer.getParent() == null) {
            frameLayout13.addView(adHalfWebPageContainer);
        }
        MicroAppVideoCardView microAppVideoCardView = new MicroAppVideoCardView(context2);
        AdHalfWebPageContainer adHalfWebPageContainer2 = adHalfWebPageContainer;
        FrameLayout.LayoutParams layoutParams66 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        microAppVideoCardView.setId(R.id.byn);
        if (MarginLayoutParams.class.isInstance(layoutParams66)) {
            layoutParams66.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams66) && VERSION.SDK_INT >= 17) {
            layoutParams66.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams66)) {
            ((LinearLayout.LayoutParams) layoutParams66).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams66)) {
            layoutParams66.gravity = 8388691;
        }
        microAppVideoCardView.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams66)) {
            layoutParams66.bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        microAppVideoCardView.setLayoutParams(layoutParams66);
        if (microAppVideoCardView.getParent() == null) {
            frameLayout13.addView(microAppVideoCardView);
        }
        FrameLayout frameLayout38 = new FrameLayout(context2);
        MicroAppVideoCardView microAppVideoCardView2 = microAppVideoCardView;
        FrameLayout.LayoutParams layoutParams67 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 139.0f, resources.getDisplayMetrics()));
        frameLayout38.setId(R.id.a09);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams67)) {
            ((LinearLayout.LayoutParams) layoutParams67).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams67)) {
            layoutParams67.gravity = 8388691;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams67)) {
            layoutParams67.bottomMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        frameLayout38.setVisibility(8);
        frameLayout38.setLayoutParams(layoutParams67);
        if (frameLayout38.getParent() == null) {
            frameLayout13.addView(frameLayout38);
        }
        PoiCardWebPageContainer poiCardWebPageContainer2 = new PoiCardWebPageContainer(context2);
        FrameLayout frameLayout39 = frameLayout38;
        FrameLayout.LayoutParams layoutParams68 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 138.0f, resources.getDisplayMetrics()));
        poiCardWebPageContainer2.setId(R.id.cd_);
        if (MarginLayoutParams.class.isInstance(layoutParams68)) {
            layoutParams68.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams68) && VERSION.SDK_INT >= 17) {
            layoutParams68.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams68)) {
            ((LinearLayout.LayoutParams) layoutParams68).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams68)) {
            layoutParams68.gravity = 8388691;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams68)) {
            layoutParams68.bottomMargin = (int) resources.getDimension(R.dimen.bk);
        }
        poiCardWebPageContainer2.setLayoutParams(layoutParams68);
        if (poiCardWebPageContainer2.getParent() == null) {
            frameLayout13.addView(poiCardWebPageContainer2);
        }
        PoiRankVideoWidget poiRankVideoWidget = new PoiRankVideoWidget(context2);
        FrameLayout.LayoutParams layoutParams69 = new FrameLayout.LayoutParams(-1, -2);
        poiRankVideoWidget.setId(R.id.cg7);
        if (MarginLayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.leftMargin = (int) resources.getDimension(R.dimen.lj);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams69)) {
            ((LinearLayout.LayoutParams) layoutParams69).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.gravity = 8388691;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams69)) {
            poiCardWebPageContainer = poiCardWebPageContainer2;
            layoutParams69.bottomMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        } else {
            poiCardWebPageContainer = poiCardWebPageContainer2;
        }
        poiRankVideoWidget.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.rightMargin = (int) resources.getDimension(R.dimen.lj);
        }
        poiRankVideoWidget.setLayoutParams(layoutParams69);
        if (poiRankVideoWidget.getParent() == null) {
            frameLayout13.addView(poiRankVideoWidget);
        }
        FrameLayout frameLayout40 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams70 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout40.setId(R.id.bx);
        frameLayout40.setLayoutParams(layoutParams70);
        if (frameLayout40.getParent() == null) {
            frameLayout13.addView(frameLayout40);
        }
        View a12 = C2058a.m9123a(context2, R.layout.va, frameLayout40, false, 0);
        if (!(a12 == null || a12 == frameLayout40)) {
            a12.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (a12.getParent() == null) {
                frameLayout40.addView(a12);
            }
        }
        DmtTextView dmtTextView13 = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams71 = new FrameLayout.LayoutParams(-2, -2);
        dmtTextView13.setBackgroundColor(resources.getColor(R.color.az3));
        dmtTextView13.setId(R.id.e7e);
        dmtTextView13.setText(R.string.b6e);
        View view11 = a12;
        dmtTextView13.setTextSize(2, 12.0f);
        FrameLayout frameLayout41 = frameLayout40;
        PoiRankVideoWidget poiRankVideoWidget2 = poiRankVideoWidget;
        LinearLayout linearLayout8 = linearLayout7;
        EllipsizeLayout ellipsizeLayout2 = ellipsizeLayout;
        dmtTextView13.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams71)) {
            layoutParams71.topMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        dmtTextView13.setVisibility(8);
        dmtTextView13.setLayoutParams(layoutParams71);
        if (dmtTextView13.getParent() == null) {
            frameLayout13.addView(dmtTextView13);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        FrameLayout.LayoutParams layoutParams72 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 240.0f, resources.getDisplayMetrics()), -2);
        appCompatTextView.setId(R.id.bfy);
        appCompatTextView.setTextSize(2, 15.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams72)) {
            ((LinearLayout.LayoutParams) layoutParams72).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams72)) {
            layoutParams72.gravity = 1;
        }
        appCompatTextView.setGravity(1);
        appCompatTextView.setVisibility(8);
        appCompatTextView.setLineSpacing(TypedValue.applyDimension(2, 3.0f, resources.getDisplayMetrics()), 1.0f);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.az3));
        appCompatTextView.setLayoutParams(layoutParams72);
        if (appCompatTextView.getParent() == null) {
            frameLayout13.addView(appCompatTextView);
        }
        ViewStub viewStub15 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams73 = new FrameLayout.LayoutParams(-1, -1);
        viewStub15.setLayoutResource(R.layout.b4g);
        viewStub15.setId(R.id.apm);
        viewStub15.setLayoutParams(layoutParams73);
        if (viewStub15.getParent() == null) {
            frameLayout13.addView(viewStub15);
        }
        CommerceLikeLayout commerceLikeLayout = new CommerceLikeLayout(context2);
        FrameLayout.LayoutParams layoutParams74 = new FrameLayout.LayoutParams(-1, -1);
        commerceLikeLayout.setId(R.id.bp);
        commerceLikeLayout.setLayoutParams(layoutParams74);
        if (commerceLikeLayout.getParent() == null) {
            frameLayout13.addView(commerceLikeLayout);
        }
        CommerceEggLayout commerceEggLayout = new CommerceEggLayout(context2);
        FrameLayout.LayoutParams layoutParams75 = new FrameLayout.LayoutParams(-1, -1);
        commerceEggLayout.setId(R.id.a0o);
        commerceEggLayout.setVisibility(8);
        commerceEggLayout.setLayoutParams(layoutParams75);
        if (commerceEggLayout.getParent() == null) {
            frameLayout13.addView(commerceEggLayout);
        }
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams76 = new FrameLayout.LayoutParams(-2, -2);
        appCompatImageView5.setId(R.id.a39);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams76)) {
            ((LinearLayout.LayoutParams) layoutParams76).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams76)) {
            layoutParams76.gravity = 51;
        }
        appCompatImageView5.setImageResource(R.drawable.a5s);
        appCompatImageView5.setLayoutParams(layoutParams76);
        if (appCompatImageView5.getParent() == null) {
            frameLayout13.addView(appCompatImageView5);
        }
        AppCompatImageView appCompatImageView6 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams77 = new FrameLayout.LayoutParams(-2, -2);
        appCompatImageView6.setId(R.id.a3_);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams77)) {
            appCompatImageView = appCompatImageView5;
            ((LinearLayout.LayoutParams) layoutParams77).gravity = 53;
        } else {
            appCompatImageView = appCompatImageView5;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams77)) {
            layoutParams77.gravity = 53;
        }
        appCompatImageView6.setImageResource(R.drawable.a5t);
        appCompatImageView6.setLayoutParams(layoutParams77);
        if (appCompatImageView6.getParent() == null) {
            frameLayout13.addView(appCompatImageView6);
        }
        AppCompatImageView appCompatImageView7 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams78 = new FrameLayout.LayoutParams(-2, -2);
        appCompatImageView7.setId(R.id.a35);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams78)) {
            appCompatImageView2 = appCompatImageView6;
            ((LinearLayout.LayoutParams) layoutParams78).gravity = 83;
        } else {
            appCompatImageView2 = appCompatImageView6;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams78)) {
            layoutParams78.gravity = 83;
        }
        appCompatImageView7.setImageResource(R.drawable.a5u);
        appCompatImageView7.setLayoutParams(layoutParams78);
        if (appCompatImageView7.getParent() == null) {
            frameLayout13.addView(appCompatImageView7);
        }
        AppCompatImageView appCompatImageView8 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams79 = new FrameLayout.LayoutParams(-2, -2);
        appCompatImageView8.setId(R.id.a36);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams79)) {
            ((LinearLayout.LayoutParams) layoutParams79).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams79)) {
            layoutParams79.gravity = 85;
        }
        appCompatImageView8.setImageResource(R.drawable.a5v);
        appCompatImageView8.setLayoutParams(layoutParams79);
        if (appCompatImageView8.getParent() == null) {
            frameLayout13.addView(appCompatImageView8);
        }
        C1444a.m7242a(frameLayout13);
        C1444a.m7242a(smartImageView);
        C1444a.m7242a(view8);
        C1444a.m7242a(longPressLayout2);
        C1444a.m7242a(frameLayout24);
        C1444a.m7242a(frameLayout18);
        C1444a.m7242a(remoteImageView5);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(relativeLayout);
        C1444a.m7242a(frameLayout17);
        C1444a.m7242a(viewStub9);
        C1444a.m7242a(linearLayout3);
        C1444a.m7242a(remoteImageView);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(remoteImageView2);
        C1444a.m7242a(dmtTextView5);
        C1444a.m7242a(frameLayout23);
        C1444a.m7242a(tagLayout2);
        C1444a.m7242a(animationImageView);
        C1444a.m7242a(commerceMicroTagLayout);
        C1444a.m7242a(starAtlasTagLayout);
        C1444a.m7242a(nationalTaskTagLayout);
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(commerceTagLayout);
        C1444a.m7242a(douPlusTagLayout);
        C1444a.m7242a(frameLayout2);
        C1444a.m7242a(frameLayout3);
        C1444a.m7242a(dmtTextView8);
        dmtTextView8.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.a8l), null, null, null);
        C1444a.m7242a(linearLayout5);
        C1444a.m7242a(ellipsizeLayout2);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(viewStub2);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(frameLayout5);
        C1444a.m7242a(frameLayout4);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(ratingBar);
        C1444a.m7242a(dmtTextView3);
        C1444a.m7242a(frameLayout28);
        C1444a.m7242a(viewStub3);
        C1444a.m7242a(frameLayout6);
        C1444a.m7242a(frameLayout7);
        C1444a.m7242a(frameLayout8);
        C1444a.m7242a(buttonAdBottomLabelView2);
        C1444a.m7242a(viewStub4);
        C1444a.m7242a(frameLayout33);
        C1444a.m7242a(view);
        C1444a.m7242a(viewStub5);
        C1444a.m7242a(stripAdBottomLabelView);
        C1444a.m7242a(view7);
        C1444a.m7242a(view6);
        C1444a.m7242a(view2);
        C1444a.m7242a(view3);
        C1444a.m7242a(view4);
        C1444a.m7242a(view5);
        C1444a.m7242a(view10);
        C1444a.m7242a(debugInfoView2);
        C1444a.m7242a(viewStub6);
        C1444a.m7242a(restrictTextView2);
        C1444a.m7242a(linearLayout8);
        C1444a.m7242a(circleWaveLayout);
        C1444a.m7242a(frameLayout9);
        C1444a.m7242a(frameLayout10);
        C1444a.m7242a(frameLayout11);
        C1444a.m7242a(frameLayout12);
        C1444a.m7242a(appCompatImageView4);
        C1444a.m7242a(dmtTextView12);
        C1444a.m7242a(adHalfWebPageMaskLayer2);
        C1444a.m7242a(adHalfWebPageContainer2);
        C1444a.m7242a(microAppVideoCardView2);
        C1444a.m7242a(frameLayout39);
        C1444a.m7242a(poiCardWebPageContainer);
        C1444a.m7242a(poiRankVideoWidget2);
        C1444a.m7242a(frameLayout41);
        C1444a.m7242a(view11);
        C1444a.m7242a(dmtTextView13);
        C1444a.m7242a(appCompatTextView);
        C1444a.m7242a(viewStub15);
        C1444a.m7242a(commerceLikeLayout);
        C1444a.m7242a(commerceEggLayout);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(appCompatImageView2);
        C1444a.m7242a(appCompatImageView7);
        C1444a.m7242a(appCompatImageView8);
        return frameLayout13;
    }
}
