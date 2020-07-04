package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageView */
public final class AVDmtImageView extends AppCompatImageView {

    /* renamed from: a */
    private boolean f109574a;

    /* renamed from: b */
    private boolean f109575b;

    /* renamed from: c */
    private int f109576c;

    public AVDmtImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setImageDrawable(Drawable drawable) {
        if (this.f109575b) {
            drawable = C42111b.m134051a(drawable, this.f109576c);
        }
        super.setImageDrawable(drawable);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = C42111b.f109618a.mo103541a(this.f109574a);
        } else {
            i = C42111b.f109618a.mo103546b(this.f109574a);
        }
        this.f109576c = i;
        setImageDrawable(getDrawable());
    }

    public AVDmtImageView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109575b = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f109574a = obtainStyledAttributes.getBoolean(26, false);
            this.f109575b = obtainStyledAttributes.getBoolean(6, true);
            if (obtainStyledAttributes.getBoolean(10, true)) {
                i2 = C42111b.f109618a.mo103541a(this.f109574a);
            } else {
                i2 = C42111b.f109618a.mo103546b(this.f109574a);
            }
            this.f109576c = i2;
        }
        if (this.f109575b) {
            setImageDrawable(C42111b.m134051a(getDrawable(), this.f109576c));
        }
    }

    public /* synthetic */ AVDmtImageView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
