package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ViewWrapper */
public final class ViewWrapper {
    private final View view;

    public final View getView() {
        return this.view;
    }

    public final int getHeight() {
        return this.view.getLayoutParams().height;
    }

    public final int getWidth() {
        return this.view.getLayoutParams().width;
    }

    public final MarginLayoutParams getMarginLayoutParams() {
        Object obj;
        if (this.view.getParent() instanceof FrameLayout) {
            LayoutParams layoutParams = this.view.getLayoutParams();
            if (layoutParams != null) {
                obj = (FrameLayout.LayoutParams) layoutParams;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        } else {
            obj = this.view.getLayoutParams();
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return (MarginLayoutParams) obj;
    }

    public ViewWrapper(View view2) {
        C7573i.m23587b(view2, "view");
        this.view = view2;
    }

    public final void setHeight(int i) {
        this.view.getLayoutParams().height = i;
        this.view.requestLayout();
    }

    public final void setWidth(int i) {
        this.view.getLayoutParams().width = i;
        this.view.requestLayout();
    }
}
