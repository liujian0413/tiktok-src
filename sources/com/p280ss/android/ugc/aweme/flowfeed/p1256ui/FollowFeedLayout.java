package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedLayout */
public class FollowFeedLayout extends LinearLayout {

    /* renamed from: a */
    private OnAttachStateChangeListener f77466a = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    };

    /* renamed from: b */
    private OnAttachStateChangeListener f77467b = this.f77466a;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f77467b.onViewAttachedToWindow(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f77467b.onViewDetachedFromWindow(this);
    }

    public FollowFeedLayout(Context context) {
        super(context);
    }

    public void setOnAttachStateChangeListener(OnAttachStateChangeListener onAttachStateChangeListener) {
        if (onAttachStateChangeListener == null) {
            this.f77467b = this.f77466a;
        } else {
            this.f77467b = onAttachStateChangeListener;
        }
    }

    public FollowFeedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FollowFeedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
