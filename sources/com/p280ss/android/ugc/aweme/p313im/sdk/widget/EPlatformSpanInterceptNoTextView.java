package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.EPlatformSpanInterceptNoTextView */
public class EPlatformSpanInterceptNoTextView extends SpanInterceptNoTextView {

    /* renamed from: b */
    public int f83543b;

    /* renamed from: d */
    private View f83544d;

    /* access modifiers changed from: 0000 */
    public CharacterStyle getCharStyle() {
        return new ForegroundColorSpan(this.f83543b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1061a() {
        super.mo1061a();
        if (this.f83544d != null) {
            this.f83544d.performLongClick();
        }
    }

    public EPlatformSpanInterceptNoTextView(Context context) {
        super(context);
    }

    public void setContentArea(View view) {
        this.f83544d = view;
    }

    public EPlatformSpanInterceptNoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EPlatformSpanInterceptNoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
