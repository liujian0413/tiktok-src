package com.p280ss.android.ugc.aweme.account.views;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: com.ss.android.ugc.aweme.account.views.e */
public abstract class C22367e extends ClickableSpan {

    /* renamed from: a */
    private int f59672a;

    /* renamed from: b */
    private int f59673b;

    /* renamed from: d */
    public boolean f59674d;

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (this.f59674d) {
            i = this.f59673b;
        } else {
            i = this.f59672a;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public C22367e(int i, int i2) {
        this.f59672a = i;
        this.f59673b = i2;
    }
}
