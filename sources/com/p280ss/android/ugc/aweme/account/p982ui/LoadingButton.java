package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingButton */
public final class LoadingButton extends FrameLayout {

    /* renamed from: a */
    public static final C22260a f59451a = new C22260a(null);

    /* renamed from: b */
    private LoadingCircleView f59452b;

    /* renamed from: c */
    private TextView f59453c;

    /* renamed from: d */
    private boolean f59454d;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingButton$a */
    public static final class C22260a {
        private C22260a() {
        }

        public /* synthetic */ C22260a(C7571f fVar) {
            this();
        }
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo58679a() {
        m73777a(true);
    }

    /* renamed from: b */
    public final void mo58680b() {
        m73778b(true);
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "text");
        this.f59453c.setText(str);
    }

    /* renamed from: a */
    private void m73777a(boolean z) {
        this.f59454d = true;
        setEnabled(false);
        if (this.f59452b.getVisibility() != 0) {
            this.f59452b.setVisibility(0);
        }
        this.f59452b.mo58683a();
    }

    /* renamed from: b */
    private void m73778b(boolean z) {
        this.f59454d = false;
        setEnabled(true);
        if (this.f59452b.getVisibility() != 8) {
            this.f59452b.setVisibility(8);
        }
        this.f59452b.mo58684b();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z || this.f59454d) {
            this.f59453c.setTextColor(C0683b.m2912c(getContext(), R.color.lt));
            this.f59453c.setBackground(C0683b.m2903a(getContext(), (int) R.drawable.vz));
        } else {
            this.f59453c.setTextColor(C0683b.m2912c(getContext(), R.color.ly));
            this.f59453c.setBackground(C0683b.m2903a(getContext(), (int) R.drawable.bii));
        }
        this.f59453c.setEnabled(z);
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingButton);
        int color = obtainStyledAttributes.getColor(4, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, C23486n.m77122a(10.0d));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, C23486n.m77122a(20.0d));
        float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(5, C23486n.m77122a(3.0d));
        int color2 = obtainStyledAttributes.getColor(1, -16777216);
        String string = obtainStyledAttributes.getString(3);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.a84, this);
        if (drawable != null) {
            setBackground(drawable);
        }
        View findViewById = findViewById(R.id.bti);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.loading_button_loading_view)");
        this.f59452b = (LoadingCircleView) findViewById;
        View findViewById2 = findViewById(R.id.btj);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.loading_button_text)");
        this.f59453c = (TextView) findViewById2;
        this.f59453c.setText(string);
        this.f59453c.setTextColor(color2);
        LayoutParams layoutParams = this.f59452b.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = dimensionPixelSize2;
            layoutParams2.width = dimensionPixelSize2;
            layoutParams2.rightMargin = dimensionPixelSize;
            if (VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginEnd(dimensionPixelSize);
            }
            this.f59452b.setLayoutParams(layoutParams2);
            this.f59452b.setLoadingColor(color);
            this.f59452b.setLineWidth(dimensionPixelSize3);
            if (dimensionPixelSize4 != -1) {
                this.f59453c.setTextSize(0, (float) dimensionPixelSize4);
            }
            setEnabled(false);
            C10789c.m31502a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public /* synthetic */ LoadingButton(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
