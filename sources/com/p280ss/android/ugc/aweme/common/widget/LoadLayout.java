package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.LoadLayout */
public class LoadLayout extends LinearLayout {

    /* renamed from: a */
    private ImageView f67764a;

    /* renamed from: b */
    private TextView f67765b;

    /* renamed from: c */
    private Animation f67766c;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f67764a = (ImageView) findViewById(R.id.bty);
        this.f67765b = (TextView) findViewById(R.id.bu3);
        this.f67766c = AnimationUtils.loadAnimation(getContext(), R.anim.av);
    }

    public LoadLayout(Context context) {
        this(context, null);
    }

    public void setLoadingText(int i) {
        this.f67765b.setText(i);
    }

    public void setLoadingText(String str) {
        this.f67765b.setText(str);
    }

    public void setLoadingViewSize(int i) {
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.f67764a.setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f67764a.startAnimation(this.f67766c);
        } else {
            this.f67764a.clearAnimation();
        }
    }

    public LoadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
