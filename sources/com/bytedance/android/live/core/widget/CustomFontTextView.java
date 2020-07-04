package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.core.p147c.C3166a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class CustomFontTextView extends LiveTextView {

    /* renamed from: d */
    private C7321c f10229d;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12691a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10229d != null) {
            this.f10229d.dispose();
        }
    }

    /* renamed from: a */
    private void m12691a() {
        try {
            if (f10235b != null) {
                this.f10229d = f10235b.mo10286b().mo19129a((C7326g<? super T>) new C3419b<Object>(this), C3420c.f10239a);
            }
        } catch (Throwable th) {
            C3166a.m11963b("font_text_view", th);
        }
    }

    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
