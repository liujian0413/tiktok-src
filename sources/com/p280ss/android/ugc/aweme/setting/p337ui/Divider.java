package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.Divider */
public final class Divider extends LinearLayout {

    /* renamed from: a */
    private View f98427a;

    /* renamed from: b */
    private DmtTextView f98428b;

    /* renamed from: c */
    private View f98429c;

    public Divider(Context context) {
        this(context, null, 0, 6, null);
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setLeftText(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "charSequence");
        DmtTextView dmtTextView = this.f98428b;
        if (dmtTextView != null) {
            dmtTextView.setText(charSequence);
        }
    }

    /* renamed from: a */
    private final void m120772a(Context context) {
        DmtTextView dmtTextView;
        this.f98427a = View.inflate(context, R.layout.b0v, this);
        View view = this.f98427a;
        View view2 = null;
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(R.id.dwq);
        } else {
            dmtTextView = null;
        }
        this.f98428b = dmtTextView;
        View view3 = this.f98427a;
        if (view3 != null) {
            view2 = view3.findViewById(R.id.e7n);
        }
        this.f98429c = view2;
        View view4 = this.f98427a;
        if (view4 != null) {
            view4.setBackgroundColor(C10774c.m31446b(getContext()));
        }
    }

    /* renamed from: a */
    private final void m120773a(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Divider);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            View view = this.f98429c;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        View view2 = this.f98429c;
        if (view2 != null) {
            view2.setBackgroundColor(C10774c.m31448d(context));
        }
        View view3 = this.f98427a;
        if (view3 != null) {
            view3.setBackgroundColor(C10774c.m31446b(context));
        }
        CharSequence string = obtainStyledAttributes.getString(1);
        if (!TextUtils.isEmpty(string)) {
            DmtTextView dmtTextView = this.f98428b;
            if (dmtTextView != null) {
                dmtTextView.setText(string);
            }
            DmtTextView dmtTextView2 = this.f98428b;
            if (dmtTextView2 != null) {
                dmtTextView2.setFontType(C10834d.f29332b);
            }
        } else {
            DmtTextView dmtTextView3 = this.f98428b;
            if (dmtTextView3 != null) {
                dmtTextView3.setVisibility(8);
            }
            View view4 = this.f98429c;
            if (view4 != null) {
                layoutParams = view4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).bottomMargin = (int) C9738o.m28708b(getContext(), 8.0f);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        DmtTextView dmtTextView4 = this.f98428b;
        if (dmtTextView4 != null) {
            dmtTextView4.setTextColor(C10774c.m31447c(getContext()));
        }
        obtainStyledAttributes.recycle();
    }

    public Divider(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m120772a(context);
        m120773a(context, attributeSet);
    }

    public /* synthetic */ Divider(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
