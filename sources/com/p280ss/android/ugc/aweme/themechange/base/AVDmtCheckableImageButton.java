package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.design.widget.CheckableImageButton;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton */
public final class AVDmtCheckableImageButton extends CheckableImageButton {

    /* renamed from: a */
    private Drawable f109526a;

    /* renamed from: b */
    private Drawable f109527b;

    /* renamed from: c */
    private boolean f109528c;

    public final void toggle() {
        Drawable drawable;
        super.toggle();
        if (isChecked()) {
            drawable = this.f109526a;
        } else {
            drawable = this.f109527b;
        }
        setImageDrawable(drawable);
    }

    public AVDmtCheckableImageButton(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null, 0);
    }

    public AVDmtCheckableImageButton(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final void m133983a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            boolean z = obtainStyledAttributes.getBoolean(26, false);
            this.f109528c = obtainStyledAttributes.getBoolean(6, true);
            this.f109526a = obtainStyledAttributes.getDrawable(31);
            this.f109527b = obtainStyledAttributes.getDrawable(40);
            if (this.f109528c) {
                this.f109526a = C42111b.f109618a.mo103545a(this.f109526a, z);
                this.f109527b = C42111b.f109618a.mo103545a(this.f109527b, z);
            }
            setImageDrawable(this.f109527b);
        }
    }

    public AVDmtCheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109528c = true;
        m133983a(context, attributeSet);
    }
}
