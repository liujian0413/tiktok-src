package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.drawable.C13411f;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.views.UserProfileViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;

/* renamed from: com.by.a.p */
public final class C2047p implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        View view;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        frameLayout.setBackgroundColor(resources.getColor(R.color.el));
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        SmartImageView smartImageView = new SmartImageView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.x6));
        smartImageView.setBackgroundColor(resources.getColor(R.color.a40));
        smartImageView.setId(R.id.b81);
        ((C13438a) smartImageView.getHierarchy()).mo32896a(C13423b.f35593a);
        smartImageView.setLayoutParams(layoutParams);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView);
        }
        View view2 = new View(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.x6));
        view2.setBackgroundResource(R.drawable.yk);
        view2.setId(R.id.a4o);
        view2.setLayoutParams(layoutParams2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388659;
        }
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams3);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout);
        }
        DampScrollableLayout dampScrollableLayout = new DampScrollableLayout(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        dampScrollableLayout.setId(R.id.czg);
        dampScrollableLayout.setTabsMarginTop((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        dampScrollableLayout.setOrientation(1);
        dampScrollableLayout.setLayoutParams(layoutParams4);
        if (dampScrollableLayout.getParent() == null) {
            linearLayout.addView(dampScrollableLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        MarginLayoutParams a2 = C1444a.m7241a(dampScrollableLayout, -1, -2);
        frameLayout2.setVisibility(8);
        frameLayout2.setLayoutParams(a2);
        if (frameLayout2.getParent() == null) {
            dampScrollableLayout.addView(frameLayout2);
        }
        View a3 = C2058a.m9123a(context2, R.layout.user_profile_head_view, frameLayout2, false, 0);
        if (!(a3 == null || a3 == frameLayout2)) {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
            a3.setId(R.id.ckh);
            a3.setLayoutParams(layoutParams5);
            if (a3.getParent() == null) {
                frameLayout2.addView(a3);
            }
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        viewStub.setLayoutResource(R.layout.mb);
        viewStub.setId(R.id.afe);
        viewStub.setLayoutParams(layoutParams6);
        if (viewStub.getParent() == null) {
            frameLayout2.addView(viewStub);
        }
        UserProfileViewPager userProfileViewPager = new UserProfileViewPager(context2);
        MarginLayoutParams a4 = C1444a.m7241a(dampScrollableLayout, -1, -1);
        userProfileViewPager.setBackgroundColor(resources.getColor(R.color.a7f));
        userProfileViewPager.setId(R.id.czl);
        userProfileViewPager.setLayoutParams(a4);
        if (userProfileViewPager.getParent() == null) {
            dampScrollableLayout.addView(userProfileViewPager);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams7);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2);
        }
        View view3 = new View(context2);
        UserProfileViewPager userProfileViewPager2 = userProfileViewPager;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view3.setBackgroundColor(resources.getColor(R.color.a03));
        view3.setId(R.id.dal);
        view3.setLayoutParams(layoutParams8);
        if (view3.getParent() == null) {
            linearLayout2.addView(view3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.nb));
        relativeLayout.setBackgroundColor(resources.getColor(R.color.ayd));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            view = view3;
            ((RelativeLayout.LayoutParams) layoutParams9).addRule(3, R.id.dal);
        } else {
            view = view3;
        }
        relativeLayout.setLayoutParams(layoutParams9);
        if (relativeLayout.getParent() == null) {
            linearLayout2.addView(relativeLayout);
        }
        View view4 = new View(context2);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -1);
        view4.setBackgroundColor(resources.getColor(R.color.a6c));
        view4.setId(R.id.dk8);
        view4.setAlpha(0.0f);
        view4.setLayoutParams(layoutParams10);
        if (view4.getParent() == null) {
            relativeLayout.addView(view4);
        }
        View view5 = new View(context2);
        View view6 = view4;
        ViewStub viewStub2 = viewStub;
        View view7 = a3;
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        view5.setBackgroundResource(R.drawable.in);
        view5.setId(R.id.jp);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(6, R.id.jo);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(18, R.id.jo);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(5, R.id.jo);
        }
        view5.setLayoutParams(layoutParams11);
        if (view5.getParent() == null) {
            relativeLayout.addView(view5);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context2);
        View view8 = view5;
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        autoRTLImageView.setId(R.id.jo);
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        FrameLayout frameLayout3 = frameLayout2;
        DampScrollableLayout dampScrollableLayout2 = dampScrollableLayout;
        autoRTLImageView.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams12) && VERSION.SDK_INT >= 17) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        autoRTLImageView.setImageResource(R.drawable.ald);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(15, -1);
        }
        autoRTLImageView.setLayoutParams(layoutParams12);
        if (autoRTLImageView.getParent() == null) {
            relativeLayout.addView(autoRTLImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), -2);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView.setTextSize(1, 17.0f);
        dmtTextView.setId(R.id.title);
        dmtTextView.setEllipsize(TruncateAt.END);
        dmtTextView.setMaxLines(1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(13, -1);
        }
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView.setLayoutParams(layoutParams13);
        if (dmtTextView.getParent() == null) {
            relativeLayout.addView(dmtTextView);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(16, R.id.dk5);
        }
        ((C13438a) remoteImageView.getHierarchy()).mo32902c((int) R.drawable.ahs);
        ((C13438a) remoteImageView.getHierarchy()).mo32898b((int) R.drawable.ahs);
        ((C13438a) remoteImageView.getHierarchy()).mo32896a(C13423b.f35595c);
        if (MarginLayoutParams.class.isInstance(layoutParams14) && VERSION.SDK_INT >= 17) {
            layoutParams14.setMarginEnd((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        remoteImageView.setId(R.id.ait);
        C13438a aVar = (C13438a) remoteImageView.getHierarchy();
        Field declaredField = C13438a.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        aVar.mo32895a(((C13411f) declaredField.get(aVar)).mo32778a(1), C13423b.f35595c);
        C13438a aVar2 = (C13438a) remoteImageView.getHierarchy();
        Field declaredField2 = C13438a.class.getDeclaredField("b");
        declaredField2.setAccessible(true);
        aVar2.mo32901b(((C13411f) declaredField2.get(aVar2)).mo32778a(5), C13423b.f35595c);
        remoteImageView.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.rightMargin = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(0, R.id.dk5);
        }
        remoteImageView.setLayoutParams(layoutParams14);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        RemoteImageView remoteImageView2 = remoteImageView;
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        dmtTextView2.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView2.setTextSize(1, 13.0f);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(16, R.id.dk5);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            z2 = true;
            layoutParams15.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            z2 = true;
        }
        dmtTextView2.setText(R.string.b7r);
        dmtTextView2.setSingleLine(z2);
        dmtTextView2.setMaxWidth((int) TypedValue.applyDimension(z2 ? 1 : 0, 66.0f, resources.getDisplayMetrics()));
        dmtTextView2.setTextColor(resources.getColorStateList(R.color.az3));
        dmtTextView2.setBackgroundResource(R.drawable.r2);
        dmtTextView2.setId(R.id.aiu);
        if (TextView.class.isInstance(dmtTextView2)) {
            i = 1;
            C1444a.m7243a(dmtTextView2, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        } else {
            i = 1;
            dmtTextView2.setMinimumWidth((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        }
        dmtTextView2.setMaxLines(i);
        dmtTextView2.setGravity(17);
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.rightMargin = (int) TypedValue.applyDimension(i, 16.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(0, R.id.dk5);
        }
        dmtTextView2.setLayoutParams(layoutParams15);
        if (dmtTextView2.getParent() == null) {
            relativeLayout.addView(dmtTextView2);
        }
        View view9 = new View(context2);
        DmtTextView dmtTextView3 = dmtTextView2;
        RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        view9.setBackgroundResource(R.drawable.in);
        view9.setId(R.id.c00);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            RelativeLayout.LayoutParams layoutParams17 = layoutParams16;
            i2 = R.id.dk5;
            layoutParams17.addRule(6, R.id.dk5);
        } else {
            i2 = R.id.dk5;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.addRule(18, i2);
        }
        view9.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.addRule(5, i2);
        }
        view9.setLayoutParams(layoutParams16);
        if (view9.getParent() == null) {
            relativeLayout.addView(view9);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        View view10 = view9;
        RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.dk5);
        DmtTextView dmtTextView4 = dmtTextView;
        AutoRTLImageView autoRTLImageView2 = autoRTLImageView;
        appCompatImageView.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams18) && VERSION.SDK_INT >= 17) {
            layoutParams18.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            i3 = -1;
            layoutParams18.addRule(11, -1);
        } else {
            i3 = -1;
        }
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(R.drawable.ayu);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(21, i3);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.rightMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(15, -1);
        }
        appCompatImageView.setLayoutParams(layoutParams18);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView);
        }
        FrameLayout frameLayout4 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, -1);
        frameLayout4.setId(R.id.e9y);
        frameLayout4.setLayoutParams(layoutParams19);
        if (frameLayout4.getParent() == null) {
            linearLayout2.addView(frameLayout4);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        linearLayout3.setBackgroundColor(Color.parseColor("#cc000000"));
        linearLayout3.setId(R.id.be);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((LinearLayout.LayoutParams) layoutParams20).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.bottomMargin = (int) TypedValue.applyDimension(1, -55.0f, resources.getDisplayMetrics());
        }
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(layoutParams20);
        if (linearLayout3.getParent() == null) {
            frameLayout.addView(linearLayout3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, -2);
        appCompatImageView2.setId(R.id.bc);
        FrameLayout frameLayout5 = frameLayout4;
        AppCompatImageView appCompatImageView3 = appCompatImageView;
        RelativeLayout relativeLayout2 = relativeLayout;
        appCompatImageView2.setPadding((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams21)) {
            i4 = 17;
            layoutParams21.gravity = 17;
        } else {
            i4 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((FrameLayout.LayoutParams) layoutParams21).gravity = i4;
        }
        appCompatImageView2.setImageResource(R.drawable.b2y);
        appCompatImageView2.setLayoutParams(layoutParams21);
        if (appCompatImageView2.getParent() == null) {
            linearLayout3.addView(appCompatImageView2);
        }
        AvatarImageView avatarImageView = new AvatarImageView(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()));
        avatarImageView.setId(R.id.bb);
        if (MarginLayoutParams.class.isInstance(layoutParams22) && VERSION.SDK_INT >= 17) {
            layoutParams22.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams22)) {
            i5 = 17;
            layoutParams22.gravity = 17;
        } else {
            i5 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((FrameLayout.LayoutParams) layoutParams22).gravity = i5;
        }
        avatarImageView.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.rightMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        avatarImageView.setLayoutParams(layoutParams22);
        if (avatarImageView.getParent() == null) {
            linearLayout3.addView(avatarImageView);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        linearLayout4.setId(R.id.bd);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i6 = 17;
            layoutParams23.gravity = 17;
        } else {
            i6 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = i6;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.weight = 1.0f;
        }
        linearLayout4.setVisibility(8);
        linearLayout4.setOrientation(1);
        linearLayout4.setLayoutParams(layoutParams23);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, -1);
        dmtTextView5.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView5.setTextSize(1, 15.0f);
        dmtTextView5.setId(R.id.bg);
        dmtTextView5.setEllipsize(TruncateAt.END);
        dmtTextView5.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((FrameLayout.LayoutParams) layoutParams24).gravity = 8388627;
        }
        dmtTextView5.setGravity(8388627);
        dmtTextView5.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView5.setLayoutParams(layoutParams24);
        if (dmtTextView5.getParent() == null) {
            linearLayout4.addView(dmtTextView5);
        }
        DmtTextView dmtTextView6 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, -1);
        DmtTextView dmtTextView7 = dmtTextView5;
        dmtTextView6.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView6.setTextSize(1, 12.0f);
        dmtTextView6.setText(R.string.f124284do);
        dmtTextView6.setEllipsize(TruncateAt.END);
        dmtTextView6.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            i7 = 8388627;
            layoutParams25.gravity = 8388627;
        } else {
            i7 = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((FrameLayout.LayoutParams) layoutParams25).gravity = i7;
        }
        dmtTextView6.setGravity(i7);
        dmtTextView6.setTextColor(resources.getColorStateList(R.color.a5h));
        dmtTextView6.setLayoutParams(layoutParams25);
        if (dmtTextView6.getParent() == null) {
            linearLayout4.addView(dmtTextView6);
        }
        DmtTextView dmtTextView8 = new DmtTextView(context2);
        DmtTextView dmtTextView9 = dmtTextView6;
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        dmtTextView8.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView8.setTextSize(1, 13.0f);
        dmtTextView8.setId(R.id.e6v);
        dmtTextView8.setText(R.string.f124284do);
        dmtTextView8.setEllipsize(TruncateAt.END);
        dmtTextView8.setMaxLines(1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams26)) {
            i8 = 17;
            layoutParams26.gravity = 17;
        } else {
            i8 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams26)) {
            ((FrameLayout.LayoutParams) layoutParams26).gravity = i8;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams26)) {
            layoutParams26.weight = 1.0f;
        }
        dmtTextView8.setGravity(16);
        dmtTextView8.setTextColor(resources.getColorStateList(R.color.a5e));
        dmtTextView8.setLayoutParams(layoutParams26);
        if (dmtTextView8.getParent() == null) {
            linearLayout3.addView(dmtTextView8);
        }
        DmtTextView dmtTextView10 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams(-2, -2);
        DmtTextView dmtTextView11 = dmtTextView8;
        dmtTextView10.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView10.setTextSize(1, 13.0f);
        dmtTextView10.setText(R.string.dp);
        LinearLayout linearLayout5 = linearLayout4;
        dmtTextView10.setPadding((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), dmtTextView10.getPaddingTop(), dmtTextView10.getPaddingRight(), dmtTextView10.getPaddingBottom());
        AvatarImageView avatarImageView2 = avatarImageView;
        dmtTextView10.setPadding(dmtTextView10.getPaddingLeft(), dmtTextView10.getPaddingTop(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), dmtTextView10.getPaddingBottom());
        if (MarginLayoutParams.class.isInstance(layoutParams27) && VERSION.SDK_INT >= 17) {
            layoutParams27.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams27)) {
            i9 = 17;
            layoutParams27.gravity = 17;
        } else {
            i9 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams27)) {
            ((FrameLayout.LayoutParams) layoutParams27).gravity = i9;
        }
        dmtTextView10.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView10.setBackgroundResource(R.drawable.h1);
        dmtTextView10.setId(R.id.bf);
        AppCompatImageView appCompatImageView4 = appCompatImageView2;
        dmtTextView10.setPadding(dmtTextView10.getPaddingLeft(), dmtTextView10.getPaddingTop(), dmtTextView10.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView10.setGravity(17);
        if (MarginLayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.rightMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        dmtTextView10.setPadding(dmtTextView10.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView10.getPaddingRight(), dmtTextView10.getPaddingBottom());
        dmtTextView10.setLayoutParams(layoutParams27);
        if (dmtTextView10.getParent() == null) {
            linearLayout3.addView(dmtTextView10);
        }
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context2);
        FrameLayout.LayoutParams layoutParams28 = new FrameLayout.LayoutParams(-1, -1);
        adHalfWebPageMaskLayer.setId(R.id.mr);
        adHalfWebPageMaskLayer.setVisibility(8);
        adHalfWebPageMaskLayer.setLayoutParams(layoutParams28);
        if (adHalfWebPageMaskLayer.getParent() == null) {
            frameLayout.addView(adHalfWebPageMaskLayer);
        }
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context2);
        FrameLayout.LayoutParams layoutParams29 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 138.0f, resources.getDisplayMetrics()));
        adHalfWebPageContainer.setId(R.id.bz);
        if (MarginLayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams29) && VERSION.SDK_INT >= 17) {
            layoutParams29.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams29)) {
            ((LinearLayout.LayoutParams) layoutParams29).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.gravity = 8388691;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        adHalfWebPageContainer.setLayoutParams(layoutParams29);
        if (adHalfWebPageContainer.getParent() == null) {
            frameLayout.addView(adHalfWebPageContainer);
        }
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(smartImageView);
        C1444a.m7242a(view2);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(dampScrollableLayout2);
        C1444a.m7242a(frameLayout3);
        C1444a.m7242a(view7);
        C1444a.m7242a(viewStub2);
        C1444a.m7242a(userProfileViewPager2);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(view);
        C1444a.m7242a(relativeLayout2);
        C1444a.m7242a(view6);
        C1444a.m7242a(view8);
        C1444a.m7242a(autoRTLImageView2);
        C1444a.m7242a(dmtTextView4);
        C1444a.m7242a(remoteImageView2);
        C1444a.m7242a(dmtTextView3);
        C1444a.m7242a(view10);
        C1444a.m7242a(appCompatImageView3);
        C1444a.m7242a(frameLayout5);
        C1444a.m7242a(linearLayout3);
        C1444a.m7242a(appCompatImageView4);
        C1444a.m7242a(avatarImageView2);
        C1444a.m7242a(linearLayout5);
        C1444a.m7242a(dmtTextView7);
        C1444a.m7242a(dmtTextView9);
        C1444a.m7242a(dmtTextView11);
        C1444a.m7242a(dmtTextView10);
        C1444a.m7242a(adHalfWebPageMaskLayer);
        C1444a.m7242a(adHalfWebPageContainer);
        return frameLayout;
    }
}
