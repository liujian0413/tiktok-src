package com.p280ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.c */
public final class C43557c extends FrameLayout implements Checkable {

    /* renamed from: c */
    private static final int[] f112785c = {16842912};

    /* renamed from: a */
    public boolean f112786a = true;

    /* renamed from: b */
    private boolean f112787b;

    public final boolean isChecked() {
        return this.f112787b;
    }

    public final View getTagView() {
        return getChildAt(0);
    }

    public final void toggle() {
        setChecked(!this.f112787b);
    }

    public final void setAllowSelect(boolean z) {
        this.f112786a = z;
    }

    public C43557c(Context context) {
        super(context);
    }

    public final void setChecked(boolean z) {
        if (this.f112787b != z) {
            this.f112787b = z;
            refreshDrawableState();
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f112785c);
        }
        return onCreateDrawableState;
    }
}
