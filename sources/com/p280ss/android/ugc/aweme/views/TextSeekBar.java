package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SeekBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.views.TextSeekBar */
public class TextSeekBar extends LinearLayout {

    /* renamed from: a */
    private DmtTextView f112314a;

    /* renamed from: b */
    private SeekBar f112315b;

    /* renamed from: c */
    private boolean f112316c = true;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m137620a();
    }

    /* renamed from: a */
    private void m137620a() {
        this.f112314a = (DmtTextView) getChildAt(0);
        this.f112315b = (SeekBar) getChildAt(1);
    }

    /* renamed from: b */
    private void m137621b() {
        int paddingLeft = this.f112315b.getPaddingLeft();
        int measuredWidth = (this.f112315b.getMeasuredWidth() - paddingLeft) - this.f112315b.getPaddingRight();
        int progress = this.f112315b.getProgress();
        this.f112314a.setText(String.valueOf(progress));
        double d = (double) progress;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        int measuredWidth2 = this.f112314a.getMeasuredWidth();
        double d3 = (double) paddingLeft;
        double d4 = (double) measuredWidth;
        Double.isNaN(d4);
        double d5 = d2 * d4;
        Double.isNaN(d3);
        double d6 = d3 + d5;
        double d7 = (double) measuredWidth2;
        Double.isNaN(d7);
        double d8 = d6 - (d7 / 2.0d);
        LayoutParams layoutParams = new LayoutParams(this.f112314a.getLayoutParams());
        layoutParams.leftMargin = (int) d8;
        this.f112314a.setLayoutParams(layoutParams);
    }

    public TextSeekBar(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent) {
            m137621b();
        }
        return dispatchTouchEvent;
    }

    public TextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f112315b.getMeasuredWidth() != 0 && this.f112316c) {
            m137621b();
            this.f112316c = false;
        }
    }
}
