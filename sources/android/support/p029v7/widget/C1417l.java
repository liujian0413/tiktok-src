package android.support.p029v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.l */
final class C1417l extends C1416k {

    /* renamed from: b */
    public Drawable f5517b;

    /* renamed from: c */
    public ColorStateList f5518c;

    /* renamed from: d */
    public Mode f5519d;

    /* renamed from: e */
    private final SeekBar f5520e;

    /* renamed from: f */
    private boolean f5521f;

    /* renamed from: g */
    private boolean f5522g;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6549a() {
        if (this.f5517b != null) {
            this.f5517b.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6551b() {
        Drawable drawable = this.f5517b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f5520e.getDrawableState())) {
            this.f5520e.invalidateDrawable(drawable);
        }
    }

    /* renamed from: c */
    private void m7014c() {
        if (this.f5517b == null) {
            return;
        }
        if (this.f5521f || this.f5522g) {
            this.f5517b = C0727a.m3116g(this.f5517b.mutate());
            if (this.f5521f) {
                C0727a.m3105a(this.f5517b, this.f5518c);
            }
            if (this.f5522g) {
                C0727a.m3108a(this.f5517b, this.f5519d);
            }
            if (this.f5517b.isStateful()) {
                this.f5517b.setState(this.f5520e.getDrawableState());
            }
        }
    }

    C1417l(SeekBar seekBar) {
        super(seekBar);
        this.f5520e = seekBar;
    }

    /* renamed from: a */
    private void m7013a(Drawable drawable) {
        if (this.f5517b != null) {
            this.f5517b.setCallback(null);
        }
        this.f5517b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f5520e);
            C0727a.m3111b(drawable, C0991u.m4220h(this.f5520e));
            if (drawable.isStateful()) {
                drawable.setState(this.f5520e.getDrawableState());
            }
            m7014c();
        }
        this.f5520e.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6550a(Canvas canvas) {
        int i;
        if (this.f5517b != null) {
            int max = this.f5520e.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f5517b.getIntrinsicWidth();
                int intrinsicHeight = this.f5517b.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f5517b.setBounds(-i, -i2, i, i2);
                float width = ((float) ((this.f5520e.getWidth() - this.f5520e.getPaddingLeft()) - this.f5520e.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f5520e.getPaddingLeft(), (float) (this.f5520e.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5517b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6548a(AttributeSet attributeSet, int i) {
        super.mo6548a(attributeSet, i);
        C1365av a = C1365av.m6744a(this.f5520e.getContext(), attributeSet, R$styleable.AppCompatSeekBar, i, 0);
        Drawable b = a.mo6396b(0);
        if (b != null) {
            this.f5520e.setThumb(b);
        }
        m7013a(a.mo6392a(1));
        if (a.mo6406g(3)) {
            this.f5519d = C1433w.m7200a(a.mo6390a(3, -1), this.f5519d);
            this.f5522g = true;
        }
        if (a.mo6406g(2)) {
            this.f5518c = a.mo6402e(2);
            this.f5521f = true;
        }
        a.mo6393a();
        m7014c();
    }
}
