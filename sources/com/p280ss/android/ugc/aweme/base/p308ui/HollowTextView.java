package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.aweme.common.p575ui.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.base.ui.HollowTextView */
public class HollowTextView extends View {

    /* renamed from: a */
    protected Paint f61699a;

    /* renamed from: b */
    private String f61700b;

    /* renamed from: c */
    private PorterDuffXfermode f61701c;

    /* renamed from: d */
    private PorterDuffXfermode f61702d;

    /* renamed from: e */
    private RectF f61703e;

    /* renamed from: f */
    private int f61704f;

    /* renamed from: g */
    private int f61705g;

    /* renamed from: h */
    private int f61706h;

    /* renamed from: i */
    private boolean f61707i;

    /* renamed from: j */
    private boolean f61708j;

    /* renamed from: k */
    private boolean f61709k;

    /* renamed from: l */
    private boolean f61710l;

    /* renamed from: m */
    private int f61711m;

    /* renamed from: n */
    private int f61712n;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.HollowTextView$a */
    public static class C23418a {

        /* renamed from: a */
        public String f61713a;

        /* renamed from: b */
        public int f61714b;

        /* renamed from: c */
        public int f61715c;

        /* renamed from: d */
        public int f61716d;

        /* renamed from: e */
        public boolean f61717e;

        /* renamed from: f */
        public boolean f61718f;

        /* renamed from: g */
        public boolean f61719g;

        /* renamed from: h */
        public boolean f61720h;
    }

    public String getText() {
        return this.f61700b;
    }

    /* renamed from: a */
    private void m76835a() {
        this.f61699a = new Paint();
        this.f61699a.setTextSize((float) this.f61704f);
        this.f61699a.setAntiAlias(true);
        this.f61699a.setFakeBoldText(true);
        this.f61699a.setColor(this.f61705g);
        this.f61699a.setAntiAlias(true);
    }

    public HollowTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setText(String str) {
        if (str != null && !str.equals(this.f61700b)) {
            this.f61700b = str;
            requestLayout();
            invalidate();
            setContentDescription(str);
        }
    }

    /* renamed from: a */
    private void m76837a(C23418a aVar) {
        this.f61700b = aVar.f61713a;
        this.f61704f = aVar.f61714b;
        this.f61705g = aVar.f61715c;
        this.f61706h = aVar.f61716d;
        this.f61707i = aVar.f61717e;
        this.f61708j = aVar.f61718f;
        this.f61709k = aVar.f61719g;
        this.f61710l = aVar.f61720h;
        m76835a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        if (!TextUtils.isEmpty(this.f61700b)) {
            if (VERSION.SDK_INT >= 21) {
                i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null);
            } else {
                i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            }
            if (this.f61702d == null) {
                this.f61702d = new PorterDuffXfermode(Mode.SRC);
            }
            this.f61699a.setXfermode(this.f61702d);
            if (this.f61706h > 0) {
                if (this.f61703e == null) {
                    this.f61703e = new RectF();
                }
                this.f61703e.left = 0.0f;
                this.f61703e.top = 0.0f;
                this.f61703e.right = (float) this.f61711m;
                this.f61703e.bottom = (float) this.f61712n;
                canvas.drawRoundRect(this.f61703e, (float) this.f61706h, (float) this.f61706h, this.f61699a);
                if (!this.f61707i) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f61706h, (float) this.f61706h, this.f61699a);
                }
                if (!this.f61708j) {
                    canvas.drawRect((float) (this.f61711m - this.f61706h), 0.0f, (float) this.f61711m, (float) this.f61706h, this.f61699a);
                }
                if (!this.f61709k) {
                    canvas.drawRect(0.0f, (float) (this.f61712n - this.f61706h), (float) this.f61706h, (float) this.f61712n, this.f61699a);
                }
                if (!this.f61710l) {
                    canvas.drawRect((float) (this.f61711m - this.f61706h), (float) (this.f61712n - this.f61706h), (float) this.f61711m, (float) this.f61712n, this.f61699a);
                }
            } else {
                canvas.drawRect(0.0f, 0.0f, (float) this.f61711m, (float) this.f61712n, this.f61699a);
            }
            if (this.f61701c == null) {
                this.f61701c = new PorterDuffXfermode(Mode.DST_OUT);
            }
            this.f61699a.setXfermode(this.f61701c);
            canvas.drawText(this.f61700b, (float) getPaddingLeft(), (float) ((((int) (((float) this.f61712n) - this.f61699a.getFontMetrics().ascent)) >> 1) - 2), this.f61699a);
            canvas.restoreToCount(i);
        }
    }

    public HollowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m76834a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    public HollowTextView(Context context, C23418a aVar) {
        super(context);
        this.f61704f = 15;
        this.f61705g = -1711276033;
        m76837a(aVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f61711m = ((int) this.f61699a.measureText(this.f61700b)) + getPaddingLeft() + getPaddingRight();
        this.f61712n = this.f61704f + getPaddingTop() + getPaddingBottom();
        this.f61711m = m76834a(this.f61711m, i);
        this.f61712n = m76834a(this.f61712n, i2);
        setMeasuredDimension(this.f61711m, this.f61712n);
    }

    /* renamed from: a */
    private void m76836a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HollowTextView);
        this.f61704f = (int) obtainStyledAttributes.getDimension(0, C9738o.m28708b(context, 15.0f));
        this.f61700b = obtainStyledAttributes.getString(1);
        this.f61705g = obtainStyledAttributes.getColor(3, 0);
        this.f61706h = (int) obtainStyledAttributes.getDimension(2, 0.0f);
        this.f61707i = obtainStyledAttributes.getBoolean(6, false);
        this.f61708j = obtainStyledAttributes.getBoolean(7, false);
        this.f61709k = obtainStyledAttributes.getBoolean(4, false);
        this.f61710l = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        m76835a();
    }

    public HollowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61704f = 15;
        this.f61705g = -1711276033;
        m76836a(context, attributeSet);
    }
}
