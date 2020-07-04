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
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.RecommendPointView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.SwipableViewPager;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.NoticeButtonView;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PressFadeFrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.o */
public final class C2046o implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        View view;
        int i2;
        View view2;
        int i3;
        View view3;
        ViewStub viewStub;
        NoticeView noticeView;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -1);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        View view4 = new View(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view4.setBackgroundColor(resources.getColor(R.color.a03));
        view4.setId(R.id.dal);
        view4.setLayoutParams(layoutParams);
        if (view4.getParent() == null) {
            relativeLayout.addView(view4);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.x5));
        relativeLayout2.setBackgroundColor(resources.getColor(R.color.a6c));
        relativeLayout2.setId(R.id.djz);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(3, R.id.dal);
        }
        relativeLayout2.setLayoutParams(layoutParams2);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.jo);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(R.drawable.ald);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(15, -1);
        }
        appCompatImageView.setLayoutParams(layoutParams3);
        if (appCompatImageView.getParent() == null) {
            relativeLayout2.addView(appCompatImageView);
        }
        RelativeLayout relativeLayout3 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), -1);
        relativeLayout3.setId(R.id.e7);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(15, -1);
        }
        relativeLayout3.setLayoutParams(layoutParams4);
        if (relativeLayout3.getParent() == null) {
            relativeLayout2.addView(relativeLayout3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setId(R.id.b5t);
        appCompatImageView2.setScaleType(ScaleType.CENTER_INSIDE);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(13, -1);
        }
        appCompatImageView2.setImageResource(R.drawable.afl);
        appCompatImageView2.setLayoutParams(layoutParams5);
        if (appCompatImageView2.getParent() == null) {
            relativeLayout3.addView(appCompatImageView2);
        }
        RecommendPointView recommendPointView = new RecommendPointView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(2, R.id.b5t);
        }
        recommendPointView.setBackgroundResource(R.drawable.rh);
        recommendPointView.setId(R.id.cp4);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(1, R.id.b5t);
        }
        recommendPointView.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(17, R.id.b5t);
        }
        recommendPointView.setLayoutParams(layoutParams6);
        if (recommendPointView.getParent() == null) {
            relativeLayout3.addView(recommendPointView);
        }
        View view5 = new View(context2);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        view5.setBackgroundResource(R.drawable.bhx);
        view5.setLayoutParams(layoutParams7);
        if (view5.getParent() == null) {
            relativeLayout3.addView(view5);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        appCompatImageView3.setId(R.id.c2l);
        View view6 = view5;
        appCompatImageView3.setPadding(appCompatImageView3.getPaddingLeft(), appCompatImageView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), appCompatImageView3.getPaddingBottom());
        RecommendPointView recommendPointView2 = recommendPointView;
        appCompatImageView3.setPadding(appCompatImageView3.getPaddingLeft(), appCompatImageView3.getPaddingTop(), appCompatImageView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            RelativeLayout.LayoutParams layoutParams9 = layoutParams8;
            i = R.id.e7;
            layoutParams9.addRule(1, R.id.e7);
        } else {
            i = R.id.e7;
        }
        appCompatImageView3.setVisibility(8);
        appCompatImageView3.setImageResource(R.drawable.aip);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(17, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(15, -1);
        }
        appCompatImageView3.setPadding(appCompatImageView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), appCompatImageView3.getPaddingRight(), appCompatImageView3.getPaddingBottom());
        appCompatImageView3.setLayoutParams(layoutParams8);
        if (appCompatImageView3.getParent() == null) {
            relativeLayout2.addView(appCompatImageView3);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -1);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView.setTextSize(1, 17.0f);
        dmtTextView.setId(R.id.title);
        dmtTextView.setEllipsize(TruncateAt.END);
        dmtTextView.setMaxWidth((int) TypedValue.applyDimension(1, 184.0f, resources.getDisplayMetrics()));
        dmtTextView.setMaxLines(1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(13, -1);
        }
        dmtTextView.setGravity(17);
        dmtTextView.setFontType("bold");
        dmtTextView.setTextColor(resources.getColorStateList(R.color.a5d));
        dmtTextView.setLayoutParams(layoutParams10);
        if (dmtTextView.getParent() == null) {
            relativeLayout2.addView(dmtTextView);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        appCompatImageView4.setId(R.id.a0);
        if (MarginLayoutParams.class.isInstance(layoutParams11) && VERSION.SDK_INT >= 17) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView4.setVisibility(8);
        appCompatImageView4.setImageResource(R.drawable.ao7);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(17, R.id.title);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(15, -1);
        }
        appCompatImageView4.setRotation(180.0f);
        appCompatImageView4.setLayoutParams(layoutParams11);
        if (appCompatImageView4.getParent() == null) {
            relativeLayout2.addView(appCompatImageView4);
        }
        View view7 = new View(context2);
        AppCompatImageView appCompatImageView5 = appCompatImageView4;
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        view7.setBackgroundResource(R.drawable.io);
        view7.setId(R.id.cr1);
        if (MarginLayoutParams.class.isInstance(layoutParams12) && VERSION.SDK_INT >= 17) {
            layoutParams12.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        view7.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(17, R.id.a0);
        }
        view7.setLayoutParams(layoutParams12);
        if (view7.getParent() == null) {
            relativeLayout2.addView(view7);
        }
        RelativeLayout relativeLayout4 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), -1);
        relativeLayout4.setId(R.id.bzz);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(15, -1);
        }
        relativeLayout4.setLayoutParams(layoutParams13);
        if (relativeLayout4.getParent() == null) {
            relativeLayout2.addView(relativeLayout4);
        }
        AppCompatImageView appCompatImageView6 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, -2);
        appCompatImageView6.setId(R.id.c02);
        appCompatImageView6.setScaleType(ScaleType.CENTER_INSIDE);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            view = view7;
            layoutParams14.addRule(13, -1);
        } else {
            view = view7;
        }
        appCompatImageView6.setImageResource(R.drawable.ayu);
        appCompatImageView6.setLayoutParams(layoutParams14);
        if (appCompatImageView6.getParent() == null) {
            relativeLayout4.addView(appCompatImageView6);
        }
        View view8 = new View(context2);
        AppCompatImageView appCompatImageView7 = appCompatImageView6;
        DmtTextView dmtTextView2 = dmtTextView;
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        view8.setBackgroundResource(R.drawable.rh);
        view8.setId(R.id.c09);
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.leftMargin = (int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            RelativeLayout.LayoutParams layoutParams16 = layoutParams15;
            i2 = R.id.c02;
            layoutParams16.addRule(6, R.id.c02);
        } else {
            i2 = R.id.c02;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(1, i2);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15) && VERSION.SDK_INT >= 17) {
            layoutParams15.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        view8.setVisibility(8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(17, R.id.c02);
        }
        view8.setLayoutParams(layoutParams15);
        if (view8.getParent() == null) {
            relativeLayout4.addView(view8);
        }
        View view9 = new View(context2);
        RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -1);
        view9.setBackgroundResource(R.drawable.bhx);
        view9.setLayoutParams(layoutParams17);
        if (view9.getParent() == null) {
            relativeLayout4.addView(view9);
        }
        AppCompatImageView appCompatImageView8 = new AppCompatImageView(context2);
        View view10 = view9;
        View view11 = view8;
        RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(16, R.id.bzz);
        }
        appCompatImageView8.setId(R.id.c2r);
        appCompatImageView8.setImageResource(R.drawable.b1r);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.addRule(0, R.id.bzz);
        }
        appCompatImageView8.setLayoutParams(layoutParams18);
        if (appCompatImageView8.getParent() == null) {
            relativeLayout2.addView(appCompatImageView8);
        }
        View view12 = new View(context2);
        RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        view12.setBackgroundColor(resources.getColor(R.color.a4j));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.addRule(12, -1);
        }
        view12.setLayoutParams(layoutParams19);
        if (view12.getParent() == null) {
            relativeLayout2.addView(view12);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -1);
        linearLayout.setId(R.id.a19);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams20)) {
            view2 = view12;
            layoutParams20.addRule(3, R.id.djz);
        } else {
            view2 = view12;
        }
        linearLayout.setOrientation(1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i3 = -1;
            layoutParams20.addRule(9, -1);
        } else {
            i3 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.addRule(20, i3);
        }
        linearLayout.setLayoutParams(layoutParams20);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout);
        }
        DampScrollableLayout dampScrollableLayout = new DampScrollableLayout(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, -2);
        dampScrollableLayout.setId(R.id.czg);
        dampScrollableLayout.setOrientation(1);
        dampScrollableLayout.setLayoutParams(layoutParams21);
        if (dampScrollableLayout.getParent() == null) {
            linearLayout.addView(dampScrollableLayout);
        }
        View a2 = C2058a.m9123a(context2, R.layout.ah2, dampScrollableLayout, false, 0);
        if (!(a2 == null || a2 == dampScrollableLayout)) {
            a2.setLayoutParams(C1444a.m7241a(dampScrollableLayout, -1, -2));
            if (a2.getParent() == null) {
                dampScrollableLayout.addView(a2);
            }
        }
        PressFadeFrameLayout pressFadeFrameLayout = new PressFadeFrameLayout(context2);
        View view13 = a2;
        LinearLayout linearLayout2 = linearLayout;
        MarginLayoutParams a3 = C1444a.m7241a(dampScrollableLayout, -1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        pressFadeFrameLayout.setId(R.id.bj4);
        AppCompatImageView appCompatImageView9 = appCompatImageView8;
        RelativeLayout relativeLayout5 = relativeLayout4;
        pressFadeFrameLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingTop(), pressFadeFrameLayout.getPaddingRight(), pressFadeFrameLayout.getPaddingBottom());
        AppCompatImageView appCompatImageView10 = appCompatImageView3;
        pressFadeFrameLayout.setPadding(pressFadeFrameLayout.getPaddingLeft(), pressFadeFrameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingTop(), pressFadeFrameLayout.getPaddingRight(), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding(pressFadeFrameLayout.getPaddingLeft(), pressFadeFrameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setVisibility(8);
        pressFadeFrameLayout.setLayoutParams(a3);
        if (pressFadeFrameLayout.getParent() == null) {
            dampScrollableLayout.addView(pressFadeFrameLayout);
        }
        View view14 = new View(context2);
        MarginLayoutParams a4 = C1444a.m7241a(pressFadeFrameLayout, -1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        view14.setBackgroundColor(resources.getColor(R.color.a4l));
        view14.setLayoutParams(a4);
        if (view14.getParent() == null) {
            pressFadeFrameLayout.addView(view14);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        MarginLayoutParams a5 = C1444a.m7241a(pressFadeFrameLayout, -1, -1);
        remoteImageView.setBackgroundColor(resources.getColor(R.color.ac4));
        remoteImageView.setId(R.id.azr);
        ((C13438a) remoteImageView.getHierarchy()).mo32896a(C13423b.f35599g);
        ((C13438a) remoteImageView.getHierarchy()).mo32900b(resources.getDrawable(R.color.ac4));
        remoteImageView.setLayoutParams(a5);
        if (remoteImageView.getParent() == null) {
            pressFadeFrameLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        MarginLayoutParams a6 = C1444a.m7241a(pressFadeFrameLayout, -2, -2);
        RemoteImageView remoteImageView2 = remoteImageView;
        dmtTextView3.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        dmtTextView3.setTextSize(1, 14.0f);
        dmtTextView3.setId(R.id.dzy);
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            ((LinearLayout.LayoutParams) a6).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = 16;
        }
        dmtTextView3.setTextColor(resources.getColorStateList(R.color.a51));
        dmtTextView3.setLayoutParams(a6);
        if (dmtTextView3.getParent() == null) {
            pressFadeFrameLayout.addView(dmtTextView3);
        }
        AppCompatImageView appCompatImageView11 = new AppCompatImageView(context2);
        MarginLayoutParams a7 = C1444a.m7241a(pressFadeFrameLayout, -2, -2);
        appCompatImageView11.setId(R.id.azs);
        DmtTextView dmtTextView4 = dmtTextView3;
        View view15 = view14;
        appCompatImageView11.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), appCompatImageView11.getPaddingTop(), appCompatImageView11.getPaddingRight(), appCompatImageView11.getPaddingBottom());
        RelativeLayout relativeLayout6 = relativeLayout3;
        AppCompatImageView appCompatImageView12 = appCompatImageView2;
        appCompatImageView11.setPadding(appCompatImageView11.getPaddingLeft(), appCompatImageView11.getPaddingTop(), appCompatImageView11.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a7)) {
            ((LinearLayout.LayoutParams) a7).gravity = 8388661;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a7)) {
            ((FrameLayout.LayoutParams) a7).gravity = 8388661;
        }
        appCompatImageView11.setVisibility(8);
        appCompatImageView11.setImageResource(R.drawable.anz);
        appCompatImageView11.setLayoutParams(a7);
        if (appCompatImageView11.getParent() == null) {
            pressFadeFrameLayout.addView(appCompatImageView11);
        }
        AppCompatImageView appCompatImageView13 = new AppCompatImageView(context2);
        MarginLayoutParams a8 = C1444a.m7241a(pressFadeFrameLayout, -2, -2);
        appCompatImageView13.setId(R.id.azq);
        if (LinearLayout.LayoutParams.class.isInstance(a8)) {
            ((LinearLayout.LayoutParams) a8).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a8)) {
            ((FrameLayout.LayoutParams) a8).gravity = 8388629;
        }
        appCompatImageView13.setImageResource(R.drawable.bdw);
        appCompatImageView13.setLayoutParams(a8);
        if (appCompatImageView13.getParent() == null) {
            pressFadeFrameLayout.addView(appCompatImageView13);
        }
        View a9 = C2058a.m9123a(context2, R.layout.ah7, dampScrollableLayout, false, 0);
        if (!(a9 == null || a9 == dampScrollableLayout)) {
            a9.setLayoutParams(C1444a.m7241a(dampScrollableLayout, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics())));
            if (a9.getParent() == null) {
                dampScrollableLayout.addView(a9);
            }
        }
        SwipableViewPager swipableViewPager = new SwipableViewPager(context2);
        MarginLayoutParams a10 = C1444a.m7241a(dampScrollableLayout, -1, -2);
        swipableViewPager.setId(R.id.czl);
        swipableViewPager.setLayoutParams(a10);
        if (swipableViewPager.getParent() == null) {
            dampScrollableLayout.addView(swipableViewPager);
        }
        ViewStub viewStub2 = new ViewStub(context2);
        SwipableViewPager swipableViewPager2 = swipableViewPager;
        RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics()), -2);
        viewStub2.setLayoutResource(R.layout.afp);
        viewStub2.setId(R.id.c4m);
        if (TextView.class.isInstance(viewStub2)) {
            C1444a.m7243a(viewStub2, (int) TypedValue.applyDimension(1, 178.0f, resources.getDisplayMetrics()));
        } else {
            viewStub2.setMinimumWidth((int) TypedValue.applyDimension(1, 178.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(12, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams22)) {
            view3 = a9;
            layoutParams22.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        } else {
            view3 = a9;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.addRule(14, -1);
        }
        viewStub2.setLayoutParams(layoutParams22);
        if (viewStub2.getParent() == null) {
            relativeLayout.addView(viewStub2);
        }
        NoticeView noticeView2 = new NoticeView(context2);
        RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
        noticeView2.setId(R.id.ecs);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.addRule(12, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23)) {
            viewStub = viewStub2;
            layoutParams23.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        } else {
            viewStub = viewStub2;
        }
        noticeView2.setVisibility(8);
        noticeView2.setLayoutParams(layoutParams23);
        if (noticeView2.getParent() == null) {
            relativeLayout.addView(noticeView2);
        }
        NoticeButtonView noticeButtonView = new NoticeButtonView(context2);
        RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
        noticeButtonView.setId(R.id.eda);
        noticeButtonView.setContextText("Start earning free gifts today.");
        noticeButtonView.setNoticeBackgroundColor(resources.getColor(R.color.az3));
        noticeButtonView.setTitleText("TikTok Rewards");
        noticeButtonView.setItemText("Join");
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.addRule(12, -1);
        }
        noticeButtonView.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams24)) {
            noticeView = noticeView2;
            layoutParams24.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        } else {
            noticeView = noticeView2;
        }
        noticeButtonView.setIconImage((int) R.drawable.aiq);
        noticeButtonView.setLayoutParams(layoutParams24);
        if (noticeButtonView.getParent() == null) {
            relativeLayout.addView(noticeButtonView);
        }
        ViewStub viewStub3 = new ViewStub(context2);
        RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
        viewStub3.setId(R.id.c2q);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.addRule(12, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub3.setVisibility(8);
        viewStub3.setLayoutParams(layoutParams25);
        if (viewStub3.getParent() == null) {
            relativeLayout.addView(viewStub3);
        }
        ViewStub viewStub4 = new ViewStub(context2);
        RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
        viewStub4.setLayoutResource(R.layout.a6y);
        viewStub4.setId(R.id.c2p);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams26)) {
            layoutParams26.addRule(12, -1);
        }
        viewStub4.setLayoutParams(layoutParams26);
        if (viewStub4.getParent() == null) {
            relativeLayout.addView(viewStub4);
        }
        C1444a.m7242a(relativeLayout);
        C1444a.m7242a(view4);
        C1444a.m7242a(relativeLayout2);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(relativeLayout6);
        C1444a.m7242a(appCompatImageView12);
        C1444a.m7242a(recommendPointView2);
        C1444a.m7242a(view6);
        C1444a.m7242a(appCompatImageView10);
        C1444a.m7242a(dmtTextView2);
        C1444a.m7242a(appCompatImageView5);
        C1444a.m7242a(view);
        C1444a.m7242a(relativeLayout5);
        C1444a.m7242a(appCompatImageView7);
        C1444a.m7242a(view11);
        C1444a.m7242a(view10);
        C1444a.m7242a(appCompatImageView9);
        C1444a.m7242a(view2);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(dampScrollableLayout);
        C1444a.m7242a(view13);
        C1444a.m7242a(pressFadeFrameLayout);
        C1444a.m7242a(view15);
        C1444a.m7242a(remoteImageView2);
        C1444a.m7242a(dmtTextView4);
        C1444a.m7242a(appCompatImageView11);
        C1444a.m7242a(appCompatImageView13);
        C1444a.m7242a(view3);
        C1444a.m7242a(swipableViewPager2);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(noticeView);
        C1444a.m7242a(noticeButtonView);
        C1444a.m7242a(viewStub3);
        C1444a.m7242a(viewStub4);
        return relativeLayout;
    }
}
