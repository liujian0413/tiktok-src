package com.p1848vk.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.vk.sdk.WebView */
public class WebView extends android.webkit.WebView {
    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            view2.setBackgroundColor(0);
            view = view2;
        }
    }

    public WebView(Context context) {
        super(context);
    }

    public WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
