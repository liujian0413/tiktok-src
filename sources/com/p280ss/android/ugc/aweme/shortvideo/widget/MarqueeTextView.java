package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.widget.Scroller;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.MarqueeTextView */
public class MarqueeTextView extends DmtTextView {

    /* renamed from: b */
    public Scroller f108285b;

    /* renamed from: c */
    public int f108286c;

    /* renamed from: d */
    public boolean f108287d;

    /* renamed from: e */
    private int f108288e;

    /* renamed from: f */
    private boolean f108289f;

    /* renamed from: g */
    private int f108290g;

    /* renamed from: h */
    private int f108291h;

    public int getRndDuration() {
        return this.f108288e;
    }

    public int getScrollFirstDelay() {
        return this.f108291h;
    }

    public int getScrollMode() {
        return this.f108290g;
    }

    /* renamed from: b */
    private void m132610b() {
        if (this.f108285b != null) {
            this.f108287d = true;
            this.f108285b.startScroll(0, 0, 0, 0, 0);
        }
    }

    /* renamed from: c */
    private int m132611c() {
        TextPaint paint = getPaint();
        Rect rect = new Rect();
        String charSequence = getText().toString();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return rect.width();
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f108285b != null && this.f108285b.isFinished() && !this.f108287d) {
            if (this.f108290g == 101) {
                m132610b();
                return;
            }
            this.f108287d = true;
            this.f108286c = getWidth() * -1;
            this.f108289f = false;
            m132609a();
        }
    }

    /* renamed from: a */
    private void m132609a() {
        if (this.f108287d) {
            setHorizontallyScrolling(true);
            if (this.f108285b != null) {
                setScroller(this.f108285b);
            }
            int c = m132611c();
            final int i = c - this.f108286c;
            double d = (double) (this.f108288e * i);
            Double.isNaN(d);
            double d2 = d * 1.0d;
            double d3 = (double) c;
            Double.isNaN(d3);
            final int intValue = Double.valueOf(d2 / d3).intValue();
            if (this.f108289f) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        MarqueeTextView.this.f108285b.startScroll(MarqueeTextView.this.f108286c, 0, i, 0, intValue);
                        MarqueeTextView.this.invalidate();
                        MarqueeTextView.this.f108287d = false;
                    }
                }, (long) this.f108291h);
                return;
            }
            this.f108285b.startScroll(this.f108286c, 0, i, 0, intValue);
            invalidate();
            this.f108287d = false;
        }
    }

    public void setRndDuration(int i) {
        this.f108288e = i;
    }

    public void setScrollFirstDelay(int i) {
        this.f108291h = i;
    }

    public void setScrollMode(int i) {
        this.f108290g = i;
    }
}
