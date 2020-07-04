package com.twitter.sdk.android.tweetcomposer.internal.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView {

    /* renamed from: a */
    C46993a f120561a;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView$a */
    public interface C46993a {
        /* renamed from: a */
        void mo118161a(int i);
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    public void setScrollViewListener(C46993a aVar) {
        this.f120561a = aVar;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f120561a != null) {
            this.f120561a.mo118161a(i2);
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
