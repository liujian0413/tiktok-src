package com.bytedance.android.livesdk.widget.roundcorner;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class RoundCornerFrameLayout extends FrameLayout implements C9275a {

    /* renamed from: a */
    private final C9276b f25450a;

    public RoundCornerFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void draw(Canvas canvas) {
        this.f25450a.mo22760a(canvas);
    }

    /* renamed from: a */
    public final void mo22755a(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        super.draw(canvas);
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f25450a = new C9276b(this);
        this.f25450a.mo22759a(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f25450a.mo22758a(getWidth(), getHeight());
    }

    public /* synthetic */ RoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
