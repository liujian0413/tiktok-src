package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView */
public final class AVDmtPanelRecyleView extends RecyclerView {

    /* renamed from: M */
    public int f109577M;

    /* renamed from: N */
    public int f109578N;

    /* renamed from: O */
    public int f109579O;

    public AVDmtPanelRecyleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtPanelRecyleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: n */
    public final boolean mo61102n() {
        if (C0991u.m4220h(this) == 1) {
            return true;
        }
        return false;
    }

    public final void setSecondPanel(boolean z) {
        if (z) {
            int a = C42111b.f109618a.mo103542a(false, z, false, false, false);
            setBackground(C38501ax.m123066a(a, a, 0, 0));
        }
    }

    /* renamed from: a */
    private final void m134014a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            this.f109577M = (int) obtainStyledAttributes.getDimension(19, 0.0f);
            this.f109578N = (int) obtainStyledAttributes.getDimension(4, 0.0f);
            this.f109579O = (int) obtainStyledAttributes.getDimension(21, 0.0f);
            int b = (int) C9738o.m28708b(context, 2.0f);
            if (obtainStyledAttributes.getBoolean(20, true)) {
                if (this.f109577M > 0) {
                    this.f109577M -= b * 2;
                }
                if (this.f109578N > 0) {
                    this.f109578N -= b;
                }
                if (this.f109579O > 0) {
                    this.f109579O -= b;
                }
            }
            if (z) {
                Drawable a = C42111b.f109618a.mo103544a(context, attributeSet);
                if (a != null) {
                    setBackground(a);
                }
            }
            mo5525a((C1272h) new AVDmtPanelRecyleView$init$1(this));
        }
    }

    public AVDmtPanelRecyleView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m134014a(context, attributeSet);
    }

    public /* synthetic */ AVDmtPanelRecyleView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
