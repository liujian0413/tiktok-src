package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView */
public class CommentTranslationStatusView extends FrameLayout {

    /* renamed from: a */
    private LinearLayout f64120a;

    /* renamed from: b */
    private ObjectAnimator f64121b;

    /* renamed from: c */
    private boolean f64122c;

    /* renamed from: b */
    private void m79878b() {
        setLoading(false);
    }

    /* renamed from: a */
    private void m79877a() {
        m79879c();
        addView(this.f64120a);
        m79878b();
    }

    /* renamed from: d */
    private DmtTextView m79880d() {
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setTextColor(getContext().getResources().getColor(R.color.abn));
        return dmtTextView;
    }

    /* renamed from: c */
    private void m79879c() {
        this.f64120a = new LinearLayout(getContext());
        this.f64120a.setLayoutParams(new LayoutParams(-2, -1));
        this.f64120a.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.alx);
        this.f64121b = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 360.0f}).setDuration(800);
        this.f64121b.setInterpolator(new LinearInterpolator());
        this.f64121b.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        this.f64120a.addView(imageView);
        DmtTextView d = m79880d();
        d.setText(R.string.a9k);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C9738o.m28708b(getContext(), 1.0f);
        layoutParams2.gravity = 16;
        d.setLayoutParams(layoutParams2);
        this.f64120a.addView(d);
    }

    public CommentTranslationStatusView(Context context) {
        this(context, null);
    }

    public void setLoading(boolean z) {
        int i;
        if (this.f64122c != z) {
            if (z) {
                this.f64121b.start();
            } else {
                this.f64121b.cancel();
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            setVisibility(i);
            this.f64122c = z;
        }
    }

    public CommentTranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentTranslationStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m79877a();
    }
}
