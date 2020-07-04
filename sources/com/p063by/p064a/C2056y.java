package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
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
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.y */
public final class C2056y implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1444a.m7241a(viewGroup2, -1, -2);
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        frameLayout.setId(R.id.a7h);
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        linearLayout2.setId(R.id.a7o);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2);
        }
        MentionTextView mentionTextView = new MentionTextView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        mentionTextView.setTextSize(2, 15.0f);
        mentionTextView.setShadowLayer(1.0f, mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), mentionTextView.getShadowColor());
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), resources.getColor(R.color.px));
        mentionTextView.setTextColor(resources.getColorStateList(R.color.yk));
        mentionTextView.setId(R.id.a7e);
        mentionTextView.setEllipsize(TruncateAt.END);
        mentionTextView.setMaxLines(4);
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), 1.0f, mentionTextView.getShadowColor());
        mentionTextView.setGravity(8388611);
        mentionTextView.setIncludeFontPadding(false);
        mentionTextView.setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        mentionTextView.setTextAlignment(5);
        mentionTextView.setPadding(mentionTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()), mentionTextView.getPaddingRight(), mentionTextView.getPaddingBottom());
        mentionTextView.setLayoutParams(layoutParams3);
        if (mentionTextView.getParent() == null) {
            linearLayout2.addView(mentionTextView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        appCompatImageView.setId(R.id.b5r);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i = 16;
            layoutParams4.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = i;
        }
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(R.drawable.a8f);
        appCompatImageView.setPadding(appCompatImageView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()), appCompatImageView.getPaddingRight(), appCompatImageView.getPaddingBottom());
        appCompatImageView.setLayoutParams(layoutParams4);
        if (appCompatImageView.getParent() == null) {
            linearLayout2.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.e3q);
        dmtTextView.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView.setText(R.string.b53);
        dmtTextView.setTextSize(2, 15.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 8388693;
        }
        dmtTextView.setVisibility(8);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.yk));
        dmtTextView.setLayoutParams(layoutParams5);
        if (dmtTextView.getParent() == null) {
            frameLayout.addView(dmtTextView);
        }
        TranslationStatusView translationStatusView = new TranslationStatusView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        translationStatusView.setId(R.id.dnl);
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.leftMargin = (int) resources.getDimension(R.dimen.xc);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6) && VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart((int) resources.getDimension(R.dimen.xc));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        translationStatusView.setVisibility(8);
        translationStatusView.setLayoutParams(layoutParams6);
        if (translationStatusView.getParent() == null) {
            linearLayout.addView(translationStatusView);
        }
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(frameLayout);
        C1444a.m7242a(linearLayout2);
        C1444a.m7242a(mentionTextView);
        C1444a.m7242a(appCompatImageView);
        C1444a.m7242a(dmtTextView);
        C1444a.m7242a(translationStatusView);
        return linearLayout;
    }
}
