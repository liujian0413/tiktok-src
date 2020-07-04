package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtAutoRTLImageView */
public final class AVDmtAutoRTLImageView extends AutoRTLImageView {

    /* renamed from: a */
    private boolean f109524a;

    /* renamed from: b */
    private boolean f109525b;

    public AVDmtAutoRTLImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtAutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setImageDrawable(Drawable drawable) {
        if (this.f109525b) {
            drawable = C42111b.f109618a.mo103545a(drawable, this.f109524a);
        }
        super.setImageDrawable(drawable);
    }

    public AVDmtAutoRTLImageView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109525b = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f109524a = obtainStyledAttributes.getBoolean(26, false);
            this.f109525b = obtainStyledAttributes.getBoolean(6, true);
        }
        if (this.f109525b) {
            setImageDrawable(C42111b.f109618a.mo103545a(getDrawable(), this.f109524a));
        }
    }

    public /* synthetic */ AVDmtAutoRTLImageView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
