package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.RankScrollView */
public class RankScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private C27271a f71850a;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.RankScrollView$a */
    public interface C27271a {
        /* renamed from: a */
        void mo68135a(int i);
    }

    public RankScrollView(Context context) {
        super(context);
    }

    public void setOnScrollListener(C27271a aVar) {
        this.f71850a = aVar;
    }

    public RankScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RankScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f71850a != null) {
            this.f71850a.mo68135a(i);
        }
    }
}
