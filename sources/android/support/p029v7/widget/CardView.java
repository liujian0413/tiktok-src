package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.cardview.R$styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.CardView */
public class CardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f4639e = {16842801};

    /* renamed from: f */
    private static final C1427s f4640f;

    /* renamed from: a */
    int f4641a;

    /* renamed from: b */
    int f4642b;

    /* renamed from: c */
    final Rect f4643c;

    /* renamed from: d */
    final Rect f4644d;

    /* renamed from: g */
    private boolean f4645g;

    /* renamed from: h */
    private boolean f4646h;

    /* renamed from: i */
    private final C1426r f4647i;

    public boolean getPreventCornerOverlap() {
        return this.f4646h;
    }

    public boolean getUseCompatPadding() {
        return this.f4645g;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public int getContentPaddingBottom() {
        return this.f4643c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4643c.left;
    }

    public int getContentPaddingRight() {
        return this.f4643c.right;
    }

    public int getContentPaddingTop() {
        return this.f4643c.top;
    }

    public ColorStateList getCardBackgroundColor() {
        return f4640f.mo6593i(this.f4647i);
    }

    public float getCardElevation() {
        return f4640f.mo6589e(this.f4647i);
    }

    public float getMaxCardElevation() {
        return f4640f.mo6580a(this.f4647i);
    }

    public float getRadius() {
        return f4640f.mo6588d(this.f4647i);
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f4640f = new C1423p();
        } else if (VERSION.SDK_INT >= 17) {
            f4640f = new C1421o();
        } else {
            f4640f = new C1424q();
        }
        f4640f.mo6579a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f4640f.mo6583a(this.f4647i, colorStateList);
    }

    public void setCardElevation(float f) {
        f4640f.mo6587c(this.f4647i, f);
    }

    public void setMaxCardElevation(float f) {
        f4640f.mo6585b(this.f4647i, f);
    }

    public void setMinimumHeight(int i) {
        this.f4642b = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f4641a = i;
        super.setMinimumWidth(i);
    }

    public void setRadius(float f) {
        f4640f.mo6581a(this.f4647i, f);
    }

    public void setCardBackgroundColor(int i) {
        f4640f.mo6583a(this.f4647i, ColorStateList.valueOf(i));
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4646h) {
            this.f4646h = z;
            f4640f.mo6592h(this.f4647i);
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4645g != z) {
            this.f4645g = z;
            f4640f.mo6591g(this.f4647i);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ej);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f4640f instanceof C1423p)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f4640f.mo6584b(this.f4647i)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f4640f.mo6586c(this.f4647i)), MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList valueOf;
        float f;
        super(context, attributeSet, i);
        this.f4643c = new Rect();
        this.f4644d = new Rect();
        this.f4647i = new C1426r() {

            /* renamed from: b */
            private Drawable f4649b;

            /* renamed from: c */
            public final Drawable mo5310c() {
                return this.f4649b;
            }

            /* renamed from: d */
            public final View mo5311d() {
                return CardView.this;
            }

            /* renamed from: b */
            public final boolean mo5309b() {
                return CardView.this.getPreventCornerOverlap();
            }

            /* renamed from: a */
            public final boolean mo5308a() {
                return CardView.this.getUseCompatPadding();
            }

            /* renamed from: a */
            public final void mo5307a(Drawable drawable) {
                this.f4649b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            /* renamed from: a */
            public final void mo5305a(int i, int i2) {
                if (i > CardView.this.f4641a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.f4642b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            /* renamed from: a */
            public final void mo5306a(int i, int i2, int i3, int i4) {
                CardView.this.f4644d.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.f4643c.left, i2 + CardView.this.f4643c.top, i3 + CardView.this.f4643c.right, i4 + CardView.this.f4643c.bottom);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CardView, i, R.style.fd);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4639e);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(R.color.gz);
            } else {
                i2 = getResources().getColor(R.color.gy);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f4645g = obtainStyledAttributes.getBoolean(7, false);
        this.f4646h = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f4643c.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.f4643c.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        this.f4643c.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.f4643c.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        if (dimension2 > dimension3) {
            f = dimension2;
        } else {
            f = dimension3;
        }
        this.f4641a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4642b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f4640f.mo6582a(this.f4647i, context, colorStateList, dimension, dimension2, f);
    }

    /* renamed from: a */
    public final void mo5283a(int i, int i2, int i3, int i4) {
        this.f4643c.set(i, i2, i3, i4);
        f4640f.mo6590f(this.f4647i);
    }
}
