package com.p280ss.android.ugc.aweme.wiki;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.wiki.AutoCenterTextView */
public final class AutoCenterTextView extends DmtTextView {

    /* renamed from: b */
    public boolean f112812b;

    /* renamed from: com.ss.android.ugc.aweme.wiki.AutoCenterTextView$a */
    static final class C43565a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AutoCenterTextView f112813a;

        C43565a(AutoCenterTextView autoCenterTextView) {
            this.f112813a = autoCenterTextView;
        }

        public final void run() {
            LayoutParams layoutParams = this.f112813a.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((MarginLayoutParams) layoutParams);
                layoutParams2.addRule(1, R.id.xd);
                layoutParams2.addRule(17, R.id.xd);
                layoutParams2.addRule(3, R.id.dal);
                this.f112813a.setLayoutParams(layoutParams2);
                this.f112813a.f112812b = false;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AutoCenterTextView$b */
    static final class C43566b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AutoCenterTextView f112814a;

        C43566b(AutoCenterTextView autoCenterTextView) {
            this.f112814a = autoCenterTextView;
        }

        public final void run() {
            LayoutParams layoutParams = this.f112814a.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((MarginLayoutParams) layoutParams);
                layoutParams2.addRule(14, -1);
                layoutParams2.addRule(3, R.id.dal);
                this.f112814a.setLayoutParams(layoutParams2);
                this.f112814a.f112812b = false;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public AutoCenterTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoCenterTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AutoCenterTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f112812b = true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f112812b = true;
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f112812b) {
            if (((float) ((C9738o.m28691a(getContext()) - getMeasuredWidth()) / 2)) < C9738o.m28708b(getContext(), 96.0f)) {
                post(new C43565a(this));
            } else {
                post(new C43566b(this));
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public /* synthetic */ AutoCenterTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 16842884;
        }
        this(context, attributeSet, i);
    }
}
