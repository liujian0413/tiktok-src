package com.p280ss.android.ugc.aweme.account.login.p974ui;

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
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.WaveSideBar */
public class WaveSideBar extends View {

    /* renamed from: a */
    private static final String[] f58540a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /* renamed from: b */
    private String[] f58541b;

    /* renamed from: c */
    private int f58542c;

    /* renamed from: d */
    private float f58543d;

    /* renamed from: e */
    private Paint f58544e;

    /* renamed from: f */
    private int f58545f;

    /* renamed from: g */
    private float f58546g;

    /* renamed from: h */
    private float f58547h;

    /* renamed from: i */
    private float f58548i;

    /* renamed from: j */
    private RectF f58549j;

    /* renamed from: k */
    private float f58550k;

    /* renamed from: l */
    private float f58551l;

    /* renamed from: m */
    private boolean f58552m;

    /* renamed from: n */
    private boolean f58553n;

    /* renamed from: o */
    private int f58554o;

    /* renamed from: p */
    private int f58555p;

    /* renamed from: q */
    private C21860a f58556q;

    /* renamed from: r */
    private float f58557r;

    /* renamed from: s */
    private DisplayMetrics f58558s;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.WaveSideBar$a */
    public interface C21860a {
        /* renamed from: a */
        void mo58192a(String str);
    }

    /* access modifiers changed from: protected */
    public String[] getDefaultIndexItems() {
        return f58540a;
    }

    /* renamed from: a */
    private void m73029a() {
        this.f58544e = new Paint();
        this.f58544e.setAntiAlias(true);
        this.f58544e.setColor(this.f58545f);
        this.f58544e.setTextSize(this.f58546g);
        this.f58544e.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
        switch (this.f58555p) {
            case 0:
                this.f58544e.setTextAlign(Align.CENTER);
                return;
            case 1:
                this.f58544e.setTextAlign(Align.LEFT);
                return;
            case 2:
                this.f58544e.setTextAlign(Align.RIGHT);
                break;
        }
    }

    public void setLazyRespond(boolean z) {
        this.f58553n = z;
    }

    public void setOnSelectIndexItemListener(C21860a aVar) {
        this.f58556q = aVar;
    }

    public WaveSideBar(Context context) {
        this(context, null);
    }

    public void setMaxOffset(int i) {
        this.f58548i = (float) i;
        invalidate();
    }

    /* renamed from: b */
    private float m73030b(int i) {
        return TypedValue.applyDimension(1, 80.0f, this.f58558s);
    }

    /* renamed from: c */
    private float m73031c(int i) {
        return TypedValue.applyDimension(2, 14.0f, this.f58558s);
    }

    public void setIndexItems(String... strArr) {
        this.f58541b = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f58545f = i;
        this.f58544e.setColor(i);
        invalidate();
    }

    public void setPosition(int i) {
        if (i == 0 || i == 1) {
            this.f58554o = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
    }

    public void setTextSize(float f) {
        if (this.f58546g != f) {
            this.f58546g = f;
            this.f58544e.setTextSize(f);
            invalidate();
        }
    }

    /* renamed from: a */
    private float m73027a(int i) {
        if (this.f58542c == -1) {
            return 0.0f;
        }
        float abs = Math.abs(this.f58543d - ((this.f58547h * ((float) i)) + (this.f58547h / 2.0f))) / this.f58547h;
        return Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
    }

    public void setTextAlign(int i) {
        if (this.f58555p != i) {
            switch (i) {
                case 0:
                    this.f58544e.setTextAlign(Align.CENTER);
                    break;
                case 1:
                    this.f58544e.setTextAlign(Align.LEFT);
                    break;
                case 2:
                    this.f58544e.setTextAlign(Align.RIGHT);
                    break;
                default:
                    throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
            }
            this.f58555p = i;
            invalidate();
        }
    }

    /* renamed from: a */
    private int m73028a(float f) {
        this.f58543d = f - (((float) (getHeight() / 2)) - (this.f58550k / 2.0f));
        if (this.f58543d <= 0.0f) {
            return 0;
        }
        int i = (int) (this.f58543d / this.f58547h);
        if (i >= this.f58541b.length) {
            i = this.f58541b.length - 1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int length = this.f58541b.length;
        int i = 0;
        while (true) {
            int i2 = NormalGiftView.ALPHA_255;
            if (i < length) {
                float f = this.f58557r + (this.f58547h * ((float) i));
                float a = m73027a(i);
                if (i != this.f58542c) {
                    i2 = (int) ((1.0f - a) * 255.0f);
                }
                this.f58544e.setAlpha(i2);
                this.f58544e.setTextSize(this.f58546g + (this.f58546g * a));
                float f2 = 0.0f;
                if (this.f58554o != 1) {
                    switch (this.f58555p) {
                        case 0:
                            f2 = (((float) (getWidth() - getPaddingRight())) - (this.f58551l / 2.0f)) - (this.f58548i * a);
                            break;
                        case 1:
                            f2 = (((float) (getWidth() - getPaddingRight())) - this.f58551l) - (this.f58548i * a);
                            break;
                        case 2:
                            f2 = ((float) (getWidth() - getPaddingRight())) - (this.f58548i * a);
                            break;
                    }
                } else {
                    switch (this.f58555p) {
                        case 0:
                            f2 = ((float) getPaddingLeft()) + (this.f58551l / 2.0f) + (this.f58548i * a);
                            break;
                        case 1:
                            f2 = ((float) getPaddingLeft()) + (this.f58548i * a);
                            break;
                        case 2:
                            f2 = ((float) getPaddingLeft()) + this.f58551l + (this.f58548i * a);
                            break;
                    }
                }
                canvas.drawText(this.f58541b[i], f2, f, this.f58544e);
                i++;
            } else {
                this.f58544e.setAlpha(NormalGiftView.ALPHA_255);
                this.f58544e.setTextSize(this.f58546g);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f58541b.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        this.f58542c = m73028a(y);
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f58549j.contains(x, y)) {
                    this.f58552m = true;
                    if (!this.f58553n && this.f58556q != null) {
                        this.f58556q.mo58192a(this.f58541b[this.f58542c]);
                    }
                    invalidate();
                    return true;
                }
                this.f58542c = -1;
                return false;
            case 1:
            case 3:
                if (this.f58553n && this.f58556q != null) {
                    this.f58556q.mo58192a(this.f58541b[this.f58542c]);
                }
                this.f58542c = -1;
                this.f58552m = false;
                invalidate();
                return true;
            case 2:
                if (this.f58552m && !this.f58553n && this.f58556q != null) {
                    this.f58556q.mo58192a(this.f58541b[this.f58542c]);
                }
                invalidate();
                return true;
            default:
                return super.onTouchEvent(motionEvent);
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
        FontMetrics fontMetrics = this.f58544e.getFontMetrics();
        this.f58547h = fontMetrics.bottom - fontMetrics.top;
        this.f58550k = ((float) this.f58541b.length) * this.f58547h;
        for (String measureText : this.f58541b) {
            this.f58551l = Math.max(this.f58551l, this.f58544e.measureText(measureText));
        }
        if (this.f58554o == 1) {
            f = 0.0f;
        } else {
            f = (((float) size2) - this.f58551l) - ((float) getPaddingRight());
        }
        if (this.f58554o == 1) {
            f2 = ((float) getPaddingLeft()) + f + this.f58551l;
        } else {
            f2 = (float) size2;
        }
        float f3 = (float) (size / 2);
        float f4 = f3 - (this.f58550k / 2.0f);
        this.f58549j.set(f, f4, f2, this.f58550k + f4);
        this.f58557r = ((f3 - ((((float) this.f58541b.length) * this.f58547h) / 2.0f)) + ((this.f58547h / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f))) - fontMetrics.ascent;
    }

    public WaveSideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58542c = -1;
        this.f58543d = -1.0f;
        this.f58549j = new RectF();
        this.f58552m = false;
        this.f58553n = false;
        this.f58558s = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveSideBar);
        this.f58553n = obtainStyledAttributes.getBoolean(0, false);
        this.f58545f = obtainStyledAttributes.getColor(4, -7829368);
        this.f58546g = obtainStyledAttributes.getDimension(5, m73031c(14));
        this.f58548i = obtainStyledAttributes.getDimension(1, m73030b(80));
        this.f58554o = obtainStyledAttributes.getInt(2, 0);
        this.f58555p = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.f58541b = getDefaultIndexItems();
        m73029a();
    }
}
