package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.tools.R$styleable;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.property.WaveSideBar */
public class WaveSideBar extends View {

    /* renamed from: a */
    private static final String[] f96824a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#"};

    /* renamed from: b */
    private String[] f96825b;

    /* renamed from: c */
    private int f96826c;

    /* renamed from: d */
    private float f96827d;

    /* renamed from: e */
    private Paint f96828e;

    /* renamed from: f */
    private int f96829f;

    /* renamed from: g */
    private float f96830g;

    /* renamed from: h */
    private float f96831h;

    /* renamed from: i */
    private float f96832i;

    /* renamed from: j */
    private RectF f96833j;

    /* renamed from: k */
    private float f96834k;

    /* renamed from: l */
    private float f96835l;

    /* renamed from: m */
    private boolean f96836m;

    /* renamed from: n */
    private boolean f96837n;

    /* renamed from: o */
    private int f96838o;

    /* renamed from: p */
    private int f96839p;

    /* renamed from: q */
    private C36953a f96840q;

    /* renamed from: r */
    private float f96841r;

    /* renamed from: s */
    private DisplayMetrics f96842s;

    /* renamed from: com.ss.android.ugc.aweme.property.WaveSideBar$a */
    public interface C36953a {
        /* renamed from: a */
        void mo93355a(String str);
    }

    /* renamed from: a */
    private void m118899a() {
        this.f96828e = new Paint();
        this.f96828e.setAntiAlias(true);
        this.f96828e.setColor(this.f96829f);
        this.f96828e.setTextSize(this.f96830g);
        switch (this.f96839p) {
            case 0:
                this.f96828e.setTextAlign(Align.CENTER);
                return;
            case 1:
                this.f96828e.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f96828e.setTextAlign(Align.RIGHT);
                break;
        }
    }

    public void setLazyRespond(boolean z) {
        this.f96837n = z;
    }

    public void setOnSelectIndexItemListener(C36953a aVar) {
        this.f96840q = aVar;
    }

    public WaveSideBar(Context context) {
        this(context, null);
    }

    public void setMaxOffset(int i) {
        this.f96832i = (float) i;
        invalidate();
    }

    /* renamed from: b */
    private float m118900b(int i) {
        return TypedValue.applyDimension(1, 80.0f, this.f96842s);
    }

    /* renamed from: c */
    private float m118901c(int i) {
        return TypedValue.applyDimension(2, 14.0f, this.f96842s);
    }

    public void setIndexItems(String... strArr) {
        this.f96825b = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f96829f = i;
        this.f96828e.setColor(i);
        invalidate();
    }

    public void setPosition(int i) {
        if (i == 0 || i == 1) {
            this.f96838o = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
    }

    public void setTextSize(float f) {
        if (this.f96830g != f) {
            this.f96830g = f;
            this.f96828e.setTextSize(f);
            invalidate();
        }
    }

    /* renamed from: a */
    private float m118897a(int i) {
        if (this.f96826c == -1) {
            return 0.0f;
        }
        float abs = Math.abs(this.f96827d - ((this.f96831h * ((float) i)) + (this.f96831h / 2.0f))) / this.f96831h;
        return Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
    }

    public void setTextAlign(int i) {
        if (this.f96839p != i) {
            switch (i) {
                case 0:
                    this.f96828e.setTextAlign(Align.CENTER);
                    break;
                case 1:
                    this.f96828e.setTextAlign(Align.LEFT);
                    break;
                case 2:
                    this.f96828e.setTextAlign(Align.RIGHT);
                    break;
                default:
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
            }
            this.f96839p = i;
            invalidate();
        }
    }

    /* renamed from: a */
    private int m118898a(float f) {
        this.f96827d = f - (((float) (getHeight() / 2)) - (this.f96834k / 2.0f));
        if (this.f96827d <= 0.0f) {
            return 0;
        }
        int i = (int) (this.f96827d / this.f96831h);
        if (i >= this.f96825b.length) {
            i = this.f96825b.length - 1;
        }
        return i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f96825b.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        this.f96826c = m118898a(y);
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f96833j.contains(x, y)) {
                    this.f96836m = true;
                    invalidate();
                    return true;
                }
                this.f96826c = -1;
                return false;
            case 1:
            case 3:
                if (this.f96837n && this.f96840q != null) {
                    this.f96840q.mo93355a(this.f96825b[this.f96826c]);
                }
                this.f96826c = -1;
                this.f96836m = false;
                invalidate();
                return true;
            case 2:
                invalidate();
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int length = this.f96825b.length;
        int i = 0;
        while (true) {
            int i2 = NormalGiftView.ALPHA_255;
            if (i < length) {
                float f = this.f96841r + (this.f96831h * ((float) i));
                float a = m118897a(i);
                if (i != this.f96826c) {
                    i2 = (int) ((1.0f - a) * 255.0f);
                }
                this.f96828e.setAlpha(i2);
                this.f96828e.setTextSize(this.f96830g + (this.f96830g * a));
                float f2 = 0.0f;
                if (this.f96838o != 1) {
                    switch (this.f96839p) {
                        case 0:
                            f2 = (((float) (getWidth() - getPaddingRight())) - (this.f96835l / 2.0f)) - (this.f96832i * a);
                            break;
                        case 1:
                            f2 = (((float) (getWidth() - getPaddingRight())) - this.f96835l) - (this.f96832i * a);
                            break;
                        case 2:
                            f2 = ((float) (getWidth() - getPaddingRight())) - (this.f96832i * a);
                            break;
                    }
                } else {
                    switch (this.f96839p) {
                        case 0:
                            f2 = ((float) getPaddingLeft()) + (this.f96835l / 2.0f) + (this.f96832i * a);
                            break;
                        case 1:
                            f2 = ((float) getPaddingLeft()) + (this.f96832i * a);
                            break;
                        case 2:
                            f2 = ((float) getPaddingLeft()) + this.f96835l + (this.f96832i * a);
                            break;
                    }
                }
                canvas.drawText(this.f96825b[i], f2, f, this.f96828e);
                i++;
            } else {
                this.f96828e.setAlpha(NormalGiftView.ALPHA_255);
                this.f96828e.setTextSize(this.f96830g);
                return;
            }
        }
    }

    public WaveSideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        FontMetrics fontMetrics = this.f96828e.getFontMetrics();
        this.f96831h = fontMetrics.bottom - fontMetrics.top;
        this.f96834k = ((float) this.f96825b.length) * this.f96831h;
        for (String measureText : this.f96825b) {
            this.f96835l = Math.max(this.f96835l, this.f96828e.measureText(measureText));
        }
        if (this.f96838o == 1) {
            f = 0.0f;
        } else {
            f = (((float) size2) - this.f96835l) - ((float) getPaddingRight());
        }
        if (this.f96838o == 1) {
            f2 = ((float) getPaddingLeft()) + f + this.f96835l;
        } else {
            f2 = (float) size2;
        }
        float f3 = (float) (size / 2);
        float f4 = f3 - (this.f96834k / 2.0f);
        this.f96833j.set(f, f4, f2, this.f96834k + f4);
        this.f96841r = ((f3 - ((((float) this.f96825b.length) * this.f96831h) / 2.0f)) + ((this.f96831h / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f))) - fontMetrics.ascent;
    }

    public WaveSideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f96826c = -1;
        this.f96827d = -1.0f;
        this.f96833j = new RectF();
        this.f96836m = false;
        this.f96837n = false;
        this.f96842s = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveSideBar);
        this.f96837n = obtainStyledAttributes.getBoolean(0, false);
        this.f96829f = obtainStyledAttributes.getColor(4, -7829368);
        this.f96830g = obtainStyledAttributes.getDimension(5, m118901c(14));
        this.f96832i = obtainStyledAttributes.getDimension(1, m118900b(80));
        this.f96838o = obtainStyledAttributes.getInt(2, 0);
        this.f96839p = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.f96825b = f96824a;
        m118899a();
    }
}
