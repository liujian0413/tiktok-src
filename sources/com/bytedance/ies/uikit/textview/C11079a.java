package com.bytedance.ies.uikit.textview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: com.bytedance.ies.uikit.textview.a */
public final class C11079a extends Drawable {

    /* renamed from: i */
    private static final int[] f30108i = {16842804};

    /* renamed from: j */
    private static final int[] f30109j = {16842901, 16842902, 16842903, 16842904};

    /* renamed from: a */
    public Alignment f30110a = Alignment.ALIGN_NORMAL;

    /* renamed from: b */
    public CharSequence f30111b = "";

    /* renamed from: c */
    private Resources f30112c;

    /* renamed from: d */
    private TextPaint f30113d;

    /* renamed from: e */
    private StaticLayout f30114e;

    /* renamed from: f */
    private Path f30115f;

    /* renamed from: g */
    private ColorStateList f30116g;

    /* renamed from: h */
    private Rect f30117h;

    public final int getOpacity() {
        return this.f30113d.getAlpha();
    }

    public final boolean isStateful() {
        return this.f30116g.isStateful();
    }

    public final int getIntrinsicHeight() {
        if (this.f30117h.isEmpty()) {
            return -1;
        }
        return this.f30117h.bottom - this.f30117h.top;
    }

    public final int getIntrinsicWidth() {
        if (this.f30117h.isEmpty()) {
            return -1;
        }
        return this.f30117h.right - this.f30117h.left;
    }

    /* renamed from: a */
    private void m32451a() {
        if (this.f30115f != null) {
            this.f30114e = null;
            this.f30117h.setEmpty();
        } else {
            StaticLayout staticLayout = new StaticLayout(this.f30111b, this.f30113d, (int) Math.ceil((double) Layout.getDesiredWidth(this.f30111b, this.f30113d)), this.f30110a, 1.0f, 0.0f, true);
            this.f30114e = staticLayout;
            this.f30117h.set(0, 0, this.f30114e.getWidth(), this.f30114e.getHeight());
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo26987a(float f) {
        m32452a(2, 15.0f);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f30117h.set(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        return m32456a(iArr);
    }

    public final void setAlpha(int i) {
        if (this.f30113d.getAlpha() != i) {
            this.f30113d.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f30113d.getColorFilter() != colorFilter) {
            this.f30113d.setColorFilter(colorFilter);
        }
    }

    /* renamed from: a */
    private void m32453a(ColorStateList colorStateList) {
        this.f30116g = colorStateList;
        m32456a(getState());
    }

    /* renamed from: b */
    private void m32457b(float f) {
        if (f != this.f30113d.getTextSize()) {
            this.f30113d.setTextSize(f);
            m32451a();
        }
    }

    /* renamed from: a */
    private void m32454a(Typeface typeface) {
        if (this.f30113d.getTypeface() != typeface) {
            this.f30113d.setTypeface(typeface);
            m32451a();
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        if (this.f30115f == null) {
            this.f30114e.draw(canvas);
        } else {
            canvas.drawTextOnPath(this.f30111b.toString(), this.f30115f, 0.0f, 0.0f, this.f30113d);
        }
        canvas.restoreToCount(save);
    }

    public C11079a(Context context) {
        TypedArray typedArray;
        int i;
        int i2;
        ColorStateList colorStateList;
        this.f30112c = context.getResources();
        this.f30117h = new Rect();
        this.f30113d = new TextPaint(1);
        this.f30113d.density = this.f30112c.getDisplayMetrics().density;
        this.f30113d.setDither(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(f30108i);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        Typeface typeface = null;
        if (resourceId != -1) {
            typedArray = context.obtainStyledAttributes(resourceId, f30109j);
        } else {
            typedArray = null;
        }
        int i3 = 15;
        if (typedArray != null) {
            colorStateList = null;
            i2 = -1;
            i = -1;
            for (int i4 = 0; i4 < typedArray.getIndexCount(); i4++) {
                int index = typedArray.getIndex(i4);
                switch (index) {
                    case 0:
                        i3 = obtainStyledAttributes.getDimensionPixelSize(index, i3);
                        break;
                    case 1:
                        i2 = obtainStyledAttributes.getInt(index, i2);
                        break;
                    case 2:
                        i = obtainStyledAttributes.getInt(index, i);
                        break;
                    case 3:
                        colorStateList = obtainStyledAttributes.getColorStateList(index);
                        break;
                }
            }
            typedArray.recycle();
        } else {
            colorStateList = null;
            i2 = -1;
            i = -1;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        m32453a(colorStateList);
        m32457b((float) i3);
        switch (i2) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
        }
        m32455a(typeface, i);
    }

    /* renamed from: a */
    private boolean m32456a(int[] iArr) {
        int colorForState = this.f30116g.getColorForState(iArr, -1);
        if (this.f30113d.getColor() == colorForState) {
            return false;
        }
        this.f30113d.setColor(colorForState);
        return true;
    }

    /* renamed from: a */
    public final void mo26988a(int i) {
        m32453a(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public final void mo26989a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f30111b = charSequence;
        m32451a();
    }

    /* renamed from: a */
    private void m32452a(int i, float f) {
        m32457b(TypedValue.applyDimension(2, f, this.f30112c.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m32455a(Typeface typeface, int i) {
        Typeface typeface2;
        int i2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            m32454a(typeface2);
            if (typeface2 != null) {
                i2 = typeface2.getStyle();
            } else {
                i2 = 0;
            }
            int i3 = (i2 ^ -1) & i;
            TextPaint textPaint = this.f30113d;
            if ((i3 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f30113d;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f30113d.setFakeBoldText(false);
        this.f30113d.setTextSkewX(0.0f);
        m32454a(typeface);
    }
}
