package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.DmtAutoCenterScrollView */
public class DmtAutoCenterScrollView extends HorizontalScrollView {
    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo103318b(View view) {
        smoothScrollTo(view.getLeft() - (getWidth() / 2), 0);
    }

    /* renamed from: a */
    public final void mo103317a(View view) {
        if (getWidth() == 0) {
            postDelayed(new C42076b(this, view), 100);
        } else {
            smoothScrollTo(view.getLeft() - (getWidth() / 2), 0);
        }
    }

    public DmtAutoCenterScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }
}
