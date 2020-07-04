package com.bytedance.ies.dmt.p262ui.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.widget.Checkable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton */
public final class AwemeSwitchButton extends View implements Checkable {

    /* renamed from: A */
    private float f28997A;

    /* renamed from: B */
    private float f28998B;

    /* renamed from: C */
    private float f28999C;

    /* renamed from: D */
    private float f29000D;

    /* renamed from: E */
    private float f29001E;

    /* renamed from: F */
    private float f29002F;

    /* renamed from: G */
    private float f29003G;

    /* renamed from: H */
    private float f29004H;

    /* renamed from: I */
    private float f29005I;

    /* renamed from: J */
    private float f29006J;

    /* renamed from: K */
    private C10801a f29007K;

    /* renamed from: a */
    protected float f29008a;

    /* renamed from: b */
    protected float f29009b;

    /* renamed from: c */
    protected int f29010c;

    /* renamed from: d */
    protected int f29011d;

    /* renamed from: e */
    protected int f29012e;

    /* renamed from: f */
    protected int f29013f;

    /* renamed from: g */
    protected int f29014g;

    /* renamed from: h */
    protected boolean f29015h;

    /* renamed from: i */
    public boolean f29016i;

    /* renamed from: j */
    private final AccelerateInterpolator f29017j;

    /* renamed from: k */
    private final Paint f29018k;

    /* renamed from: l */
    private final Path f29019l;

    /* renamed from: m */
    private final Path f29020m;

    /* renamed from: n */
    private final RectF f29021n;

    /* renamed from: o */
    private float f29022o;

    /* renamed from: p */
    private float f29023p;

    /* renamed from: q */
    private RadialGradient f29024q;

    /* renamed from: r */
    private int f29025r;

    /* renamed from: s */
    private int f29026s;

    /* renamed from: t */
    private boolean f29027t;

    /* renamed from: u */
    private OnClickListener f29028u;

    /* renamed from: v */
    private float f29029v;

    /* renamed from: w */
    private float f29030w;

    /* renamed from: x */
    private float f29031x;

    /* renamed from: y */
    private float f29032y;

    /* renamed from: z */
    private float f29033z;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton$1 */
    class C107991 implements C10801a {

        /* renamed from: a */
        final /* synthetic */ AwemeSwitchButton f29034a;

        /* renamed from: a */
        public final void mo25912a(AwemeSwitchButton awemeSwitchButton) {
            this.f29034a.mo25898a(true);
        }

        /* renamed from: b */
        public final void mo25913b(AwemeSwitchButton awemeSwitchButton) {
            this.f29034a.mo25898a(false);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton$SavedState */
    static final class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m31580a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m31579a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m31579a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m31580a(i);
            }
        };

        /* renamed from: a */
        public boolean f29035a;

        public final int describeContents() {
            return 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z = true;
            if (1 != parcel.readInt()) {
                z = false;
            }
            this.f29035a = z;
        }

        /* synthetic */ SavedState(Parcel parcel, C107991 r2) {
            this(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f29035a ? 1 : 0);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton$a */
    public interface C10801a {
        /* renamed from: a */
        void mo25912a(AwemeSwitchButton awemeSwitchButton);

        /* renamed from: b */
        void mo25913b(AwemeSwitchButton awemeSwitchButton);
    }

    public final boolean isChecked() {
        return this.f29016i;
    }

    public final void toggle() {
        setOpened(!this.f29016i);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29035a = this.f29016i;
        return savedState;
    }

    public final void setChecked(boolean z) {
        mo25898a(z);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f29028u = onClickListener;
    }

    public final void setShadow(boolean z) {
        this.f29015h = z;
        invalidate();
    }

    public final void setOnStateChangedListener(C10801a aVar) {
        if (aVar != null) {
            this.f29007K = aVar;
            return;
        }
        throw new IllegalArgumentException("empty listener");
    }

    public final void setOpened(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        if (i != this.f29025r) {
            m31574a(i);
        }
    }

    /* renamed from: a */
    private void m31574a(int i) {
        if (!this.f29016i && i == 4) {
            this.f29016i = true;
        } else if (this.f29016i && i == 1) {
            this.f29016i = false;
        }
        this.f29026s = this.f29025r;
        this.f29025r = i;
        postInvalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f29016i = savedState.f29035a;
        if (this.f29016i) {
            i = 4;
        } else {
            i = 1;
        }
        this.f29025r = i;
        invalidate();
    }

    /* renamed from: a */
    public final void mo25898a(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        if (i != this.f29025r) {
            if ((i == 4 && (this.f29025r == 1 || this.f29025r == 2)) || (i == 1 && (this.f29025r == 4 || this.f29025r == 3))) {
                this.f29022o = 1.0f;
            }
            this.f29023p = 1.0f;
            m31574a(i);
        }
    }

    /* renamed from: a */
    private void m31573a(float f) {
        this.f29020m.reset();
        this.f29021n.left = this.f29000D + (this.f28998B / 2.0f);
        this.f29021n.right = this.f29001E - (this.f28998B / 2.0f);
        this.f29020m.arcTo(this.f29021n, 90.0f, 180.0f);
        this.f29021n.left = this.f29000D + (this.f29033z * f) + (this.f28998B / 2.0f);
        this.f29021n.right = (this.f29001E + (f * this.f29033z)) - (this.f28998B / 2.0f);
        this.f29020m.arcTo(this.f29021n, 270.0f, 180.0f);
        this.f29020m.close();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.f29025r == 4 || this.f29025r == 1) && this.f29022o * this.f29023p == 0.0f) {
            switch (motionEvent.getAction()) {
                case 0:
                    return true;
                case 1:
                    this.f29026s = this.f29025r;
                    this.f29023p = 1.0f;
                    if (this.f29025r == 1) {
                        m31574a(2);
                        this.f29007K.mo25912a(this);
                    } else if (this.f29025r == 4) {
                        m31574a(3);
                        this.f29007K.mo25913b(this);
                    }
                    if (this.f29028u != null) {
                        this.f29028u.onClick(this);
                        break;
                    }
                    break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m31575b(float r6) {
        /*
            r5 = this;
            int r0 = r5.f29025r
            int r1 = r5.f29026s
            int r0 = r0 - r1
            r1 = 2
            r2 = 3
            r3 = 4
            r4 = 1
            switch(r0) {
                case -3: goto L_0x0089;
                case -2: goto L_0x006b;
                case -1: goto L_0x0055;
                case 0: goto L_0x000c;
                case 1: goto L_0x003f;
                case 2: goto L_0x0020;
                case 3: goto L_0x0014;
                default: goto L_0x000c;
            }
        L_0x000c:
            int r6 = r5.f29025r
            if (r6 != r4) goto L_0x0094
            float r0 = r5.f29005I
            goto L_0x009c
        L_0x0014:
            float r0 = r5.f29002F
            float r1 = r5.f29002F
            float r2 = r5.f29005I
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 - r1
            goto L_0x009c
        L_0x0020:
            int r0 = r5.f29025r
            if (r0 != r3) goto L_0x0030
            float r0 = r5.f29002F
            float r1 = r5.f29002F
            float r2 = r5.f29005I
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 - r1
            goto L_0x009c
        L_0x0030:
            int r0 = r5.f29025r
            if (r0 != r2) goto L_0x009b
            float r0 = r5.f29003G
            float r1 = r5.f29003G
            float r2 = r5.f29005I
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 - r1
            goto L_0x009c
        L_0x003f:
            int r0 = r5.f29025r
            if (r0 != r1) goto L_0x0046
            float r0 = r5.f29005I
            goto L_0x009c
        L_0x0046:
            int r0 = r5.f29025r
            if (r0 != r3) goto L_0x009b
            float r0 = r5.f29002F
            float r1 = r5.f29002F
            float r2 = r5.f29003G
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 - r1
            goto L_0x009c
        L_0x0055:
            int r0 = r5.f29025r
            if (r0 != r2) goto L_0x0064
            float r0 = r5.f29003G
            float r1 = r5.f29002F
            float r2 = r5.f29003G
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 + r1
            goto L_0x009c
        L_0x0064:
            int r6 = r5.f29025r
            if (r6 != r4) goto L_0x009b
            float r0 = r5.f29005I
            goto L_0x009c
        L_0x006b:
            int r0 = r5.f29025r
            if (r0 != r4) goto L_0x007a
            float r0 = r5.f29005I
            float r1 = r5.f29003G
            float r2 = r5.f29005I
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 + r1
            goto L_0x009c
        L_0x007a:
            int r0 = r5.f29025r
            if (r0 != r1) goto L_0x009b
            float r0 = r5.f29004H
            float r1 = r5.f29002F
            float r2 = r5.f29004H
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 + r1
            goto L_0x009c
        L_0x0089:
            float r0 = r5.f29005I
            float r1 = r5.f29002F
            float r2 = r5.f29005I
            float r1 = r1 - r2
            float r1 = r1 * r6
            float r0 = r0 + r1
            goto L_0x009c
        L_0x0094:
            int r6 = r5.f29025r
            if (r6 != r3) goto L_0x009b
            float r0 = r5.f29002F
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            float r6 = r5.f29005I
            float r0 = r0 - r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.widget.AwemeSwitchButton.m31575b(float):float");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        float f2;
        float f3;
        int i2;
        super.onDraw(canvas);
        if (this.f29027t) {
            boolean z2 = true;
            this.f29018k.setAntiAlias(true);
            if (this.f29025r == 4 || this.f29025r == 3) {
                z = true;
            } else {
                z = false;
            }
            this.f29018k.setStyle(Style.FILL);
            Paint paint = this.f29018k;
            if (z) {
                i = this.f29010c;
            } else {
                i = this.f29012e;
            }
            paint.setColor(i);
            canvas.drawPath(this.f29019l, this.f29018k);
            if (this.f29022o - this.f29009b > 0.0f) {
                f = this.f29022o - this.f29009b;
            } else {
                f = 0.0f;
            }
            this.f29022o = f;
            if (this.f29023p - this.f29009b > 0.0f) {
                f2 = this.f29023p - this.f29009b;
            } else {
                f2 = 0.0f;
            }
            this.f29023p = f2;
            float interpolation = this.f29017j.getInterpolation(this.f29022o);
            float interpolation2 = this.f29017j.getInterpolation(this.f29023p);
            float f4 = this.f29032y;
            if (z) {
                f3 = interpolation;
            } else {
                f3 = 1.0f - interpolation;
            }
            float f5 = f4 * f3;
            float f6 = (this.f29029v - this.f29030w) - this.f28997A;
            if (z) {
                interpolation = 1.0f - interpolation;
            }
            float f7 = f6 * interpolation;
            canvas.save();
            canvas.scale(f5, f5, this.f29030w + f7, this.f29031x);
            this.f29018k.setColor(-1);
            canvas.drawPath(this.f29019l, this.f29018k);
            canvas.restore();
            canvas.save();
            canvas.translate(m31575b(interpolation2), this.f29006J);
            if (!(this.f29025r == 3 || this.f29025r == 2)) {
                z2 = false;
            }
            if (z2) {
                interpolation2 = 1.0f - interpolation2;
            }
            m31573a(interpolation2);
            if (this.f29015h) {
                this.f29018k.setStyle(Style.FILL);
                this.f29018k.setShader(this.f29024q);
                canvas.drawPath(this.f29020m, this.f29018k);
                this.f29018k.setShader(null);
            }
            canvas.translate(0.0f, -this.f29006J);
            canvas.scale(0.98f, 0.98f, this.f28999C / 2.0f, this.f28999C / 2.0f);
            this.f29018k.setStyle(Style.FILL);
            this.f29018k.setColor(-1);
            canvas.drawPath(this.f29020m, this.f29018k);
            this.f29018k.setStyle(Style.STROKE);
            this.f29018k.setStrokeWidth(this.f28998B * 0.5f);
            Paint paint2 = this.f29018k;
            if (z) {
                i2 = this.f29011d;
            } else {
                i2 = this.f29013f;
            }
            paint2.setColor(i2);
            canvas.drawPath(this.f29020m, this.f29018k);
            canvas.restore();
            this.f29018k.reset();
            if (this.f29022o > 0.0f || this.f29023p > 0.0f) {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        if (mode != 1073741824) {
            int paddingLeft = ((int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f)) + getPaddingLeft() + getPaddingRight();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(paddingLeft, size);
            } else {
                size = paddingLeft;
            }
        }
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 != 1073741824) {
            int paddingTop = ((int) (((float) size) * this.f29008a)) + getPaddingTop() + getPaddingBottom();
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= getPaddingLeft() + getPaddingRight() || i2 <= getPaddingTop() + getPaddingBottom()) {
            z = false;
        } else {
            z = true;
        }
        this.f29027t = z;
        if (this.f29027t) {
            float paddingLeft = (float) ((i - getPaddingLeft()) - getPaddingRight());
            float paddingTop = (float) ((i2 - getPaddingTop()) - getPaddingBottom());
            if (this.f29008a * paddingLeft < paddingTop) {
                i5 = getPaddingLeft();
                i7 = i - getPaddingRight();
                int i9 = ((int) (paddingTop - (paddingLeft * this.f29008a))) / 2;
                i6 = getPaddingTop() + i9;
                i8 = (getHeight() - getPaddingBottom()) - i9;
            } else {
                int i10 = ((int) (paddingLeft - (paddingTop / this.f29008a))) / 2;
                i5 = getPaddingLeft() + i10;
                i7 = (getWidth() - getPaddingRight()) - i10;
                i6 = getPaddingTop();
                i8 = getHeight() - getPaddingBottom();
            }
            this.f29006J = (float) ((int) (((float) (i8 - i6)) * 0.07f));
            float f = (float) i5;
            float f2 = ((float) i6) + this.f29006J;
            this.f29029v = (float) i7;
            float f3 = ((float) i8) - this.f29006J;
            float f4 = f3 - f2;
            this.f29030w = (this.f29029v + f) / 2.0f;
            float f5 = (f3 + f2) / 2.0f;
            this.f29031x = f5;
            this.f29000D = f;
            this.f28999C = f4;
            this.f29001E = this.f28999C + f;
            float f6 = this.f28999C / 2.0f;
            this.f28997A = 0.95f * f6;
            this.f29033z = this.f28997A * 0.2f;
            this.f28998B = (f6 - this.f28997A) * 2.0f;
            this.f29002F = this.f29029v - this.f28999C;
            this.f29003G = this.f29002F - this.f29033z;
            this.f29005I = f;
            this.f29004H = this.f29005I + this.f29033z;
            this.f29032y = 1.0f - (this.f28998B / f4);
            this.f29019l.reset();
            RectF rectF = new RectF();
            rectF.top = f2;
            rectF.bottom = f3;
            rectF.left = f;
            rectF.right = f + f4;
            this.f29019l.arcTo(rectF, 90.0f, 180.0f);
            rectF.left = this.f29029v - f4;
            rectF.right = this.f29029v;
            this.f29019l.arcTo(rectF, 270.0f, 180.0f);
            this.f29019l.close();
            this.f29021n.left = this.f29000D;
            this.f29021n.right = this.f29001E;
            this.f29021n.top = f2 + (this.f28998B / 2.0f);
            this.f29021n.bottom = f3 - (this.f28998B / 2.0f);
            int i11 = (this.f29014g >> 16) & NormalGiftView.ALPHA_255;
            int i12 = (this.f29014g >> 8) & NormalGiftView.ALPHA_255;
            int i13 = this.f29014g & NormalGiftView.ALPHA_255;
            RadialGradient radialGradient = new RadialGradient((this.f29001E + this.f29000D) / 2.0f, f5, this.f28997A, Color.argb(C34943c.f91127w, i11, i12, i13), Color.argb(25, i11, i12, i13), TileMode.CLAMP);
            this.f29024q = radialGradient;
        }
    }
}
