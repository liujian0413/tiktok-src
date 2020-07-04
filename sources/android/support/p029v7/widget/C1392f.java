package android.support.p029v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.widget.C1043e;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.f */
final class C1392f {

    /* renamed from: a */
    public ColorStateList f5427a;

    /* renamed from: b */
    public Mode f5428b;

    /* renamed from: c */
    private final CompoundButton f5429c;

    /* renamed from: d */
    private boolean f5430d;

    /* renamed from: e */
    private boolean f5431e;

    /* renamed from: f */
    private boolean f5432f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6483a() {
        if (this.f5432f) {
            this.f5432f = false;
            return;
        }
        this.f5432f = true;
        m6889b();
    }

    /* renamed from: b */
    private void m6889b() {
        Drawable a = C1043e.m4502a(this.f5429c);
        if (a == null) {
            return;
        }
        if (this.f5430d || this.f5431e) {
            Drawable mutate = C0727a.m3116g(a).mutate();
            if (this.f5430d) {
                C0727a.m3105a(mutate, this.f5427a);
            }
            if (this.f5431e) {
                C0727a.m3108a(mutate, this.f5428b);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f5429c.getDrawableState());
            }
            this.f5429c.setButtonDrawable(mutate);
        }
    }

    C1392f(CompoundButton compoundButton) {
        this.f5429c = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo6482a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C1043e.m4502a(this.f5429c);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6484a(ColorStateList colorStateList) {
        this.f5427a = colorStateList;
        this.f5430d = true;
        m6889b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6485a(Mode mode) {
        this.f5428b = mode;
        this.f5431e = true;
        m6889b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6486a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f5429c.getContext().obtainStyledAttributes(attributeSet, R$styleable.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    this.f5429c.setButtonDrawable(C1065a.m4641b(this.f5429c.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                C1043e.m4503a(this.f5429c, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                C1043e.m4504a(this.f5429c, C1433w.m7200a(obtainStyledAttributes.getInt(2, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
