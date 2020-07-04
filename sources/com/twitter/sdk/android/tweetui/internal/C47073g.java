package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.twitter.sdk.android.tweetui.internal.g */
public final class C47073g extends ImageView {

    /* renamed from: a */
    C47074a f120801a = new C47074a(null);

    /* renamed from: com.twitter.sdk.android.tweetui.internal.g$a */
    protected static class C47074a {

        /* renamed from: a */
        final Drawable f120802a;

        C47074a(Drawable drawable) {
            this.f120802a = drawable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo118346a(Canvas canvas) {
            if (this.f120802a != null) {
                this.f120802a.draw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo118347a(ImageView imageView) {
            if (this.f120802a != null) {
                this.f120802a.setCallback(null);
                imageView.unscheduleDrawable(this.f120802a);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo118348a(int[] iArr) {
            if (this.f120802a != null && this.f120802a.isStateful()) {
                this.f120802a.setState(iArr);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo118345a(int i, int i2) {
            if (this.f120802a != null) {
                this.f120802a.setBounds(0, 0, i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f120801a.mo118348a(getDrawableState());
    }

    public C47073g(Context context) {
        super(context);
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f120801a.f120802a) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f120801a.mo118346a(canvas);
    }

    public final void setOverlayDrawable(Drawable drawable) {
        if (drawable != this.f120801a.f120802a) {
            this.f120801a.mo118347a((ImageView) this);
            if (drawable != null) {
                drawable.setCallback(this);
            }
            this.f120801a = new C47074a(drawable);
            this.f120801a.mo118348a(getDrawableState());
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f120801a.mo118345a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f120801a.mo118345a(i, i2);
    }
}
