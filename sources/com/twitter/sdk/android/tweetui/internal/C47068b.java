package com.twitter.sdk.android.tweetui.internal;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: com.twitter.sdk.android.tweetui.internal.b */
public abstract class C47068b extends ClickableSpan implements C47070d {

    /* renamed from: a */
    private final int f120791a;

    /* renamed from: b */
    private final boolean f120792b;

    /* renamed from: c */
    public final int f120793c;

    /* renamed from: d */
    private final boolean f120794d;

    /* renamed from: e */
    private boolean f120795e;

    /* renamed from: a */
    public final boolean mo118335a() {
        return this.f120795e;
    }

    /* renamed from: a */
    public final void mo118334a(boolean z) {
        this.f120795e = z;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.f120792b) {
            textPaint.setColor(this.f120793c);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
        if (this.f120795e) {
            textPaint.bgColor = this.f120791a;
        } else {
            textPaint.bgColor = 0;
        }
        if (this.f120794d) {
            textPaint.setUnderlineText(true);
        }
    }

    public C47068b(int i, int i2, boolean z) {
        this(i, i2, true, z);
    }

    private C47068b(int i, int i2, boolean z, boolean z2) {
        this.f120791a = i;
        this.f120793c = i2;
        this.f120792b = true;
        this.f120794d = z2;
    }
}
