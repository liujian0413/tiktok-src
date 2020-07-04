package com.p280ss.android.ugc.aweme.poi.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.BubbleLayout */
public class BubbleLayout extends LinearLayout {

    /* renamed from: a */
    public static int f93003a;

    /* renamed from: b */
    public static int f93004b;

    /* renamed from: c */
    public static int f93005c;

    /* renamed from: d */
    public static float f93006d;

    /* renamed from: e */
    public static float f93007e;

    /* renamed from: f */
    public static float f93008f;

    /* renamed from: g */
    public static int f93009g;

    /* renamed from: h */
    public static int f93010h;

    /* renamed from: i */
    private Paint f93011i;

    /* renamed from: j */
    private final Path f93012j;

    /* renamed from: k */
    private final Path f93013k;

    /* renamed from: l */
    private RectF f93014l;

    /* renamed from: m */
    private float f93015m;

    /* renamed from: n */
    private float f93016n;

    /* renamed from: o */
    private Path f93017o;

    /* renamed from: p */
    private RectF f93018p;

    /* renamed from: q */
    private int f93019q;

    /* renamed from: r */
    private Matrix f93020r;

    /* renamed from: s */
    private Bitmap f93021s;

    /* renamed from: t */
    private Canvas f93022t;

    /* renamed from: u */
    private int f93023u;

    /* renamed from: v */
    private int f93024v;

    /* renamed from: w */
    private float f93025w;

    /* renamed from: x */
    private int f93026x;

    /* renamed from: y */
    private boolean f93027y;

    /* renamed from: z */
    private boolean f93028z;

    /* renamed from: b */
    private void m114583b() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addUpdateListener(C35479a.f93091a);
    }

    /* renamed from: c */
    private void m114584c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addUpdateListener(C35480b.f93092a);
    }

    public float getBubbleOffset() {
        float max = Math.max(this.f93025w, f93008f);
        switch (this.f93026x) {
            case 0:
                return Math.min(max, this.f93015m - f93008f);
            case 1:
                return Math.min(max, this.f93016n - f93008f);
            case 2:
                return Math.min(max, this.f93016n - f93008f);
            case 3:
                return Math.min(max, this.f93015m - f93008f);
            default:
                return 0.0f;
        }
    }

    /* renamed from: a */
    private void m114581a() {
        this.f93013k.moveTo(0.0f, 0.0f);
        this.f93013k.lineTo((float) f93003a, (float) (-f93003a));
        this.f93013k.lineTo((float) f93003a, (float) f93003a);
        this.f93013k.close();
        this.f93017o.moveTo(0.0f, 0.0f);
        Path path = this.f93017o;
        double d = (double) f93003a;
        double d2 = (double) this.f93019q;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt;
        Double.isNaN(d);
        float f = (float) (d + d3);
        double d4 = (double) (-f93003a);
        double d5 = (double) this.f93019q;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt2;
        Double.isNaN(d4);
        path.lineTo(f, (float) (d4 - d6));
        Path path2 = this.f93017o;
        double d7 = (double) f93003a;
        double d8 = (double) this.f93019q;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt3;
        Double.isNaN(d7);
        float f2 = (float) (d7 + d9);
        double d10 = (double) f93003a;
        double d11 = (double) this.f93019q;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d11);
        double d12 = d11 * sqrt4;
        Double.isNaN(d10);
        path2.lineTo(f2, (float) (d10 + d12));
        this.f93017o.close();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setBgColor(int i) {
        this.f93023u = i;
    }

    public void setBorderColor(int i) {
        this.f93024v = i;
    }

    public void setBubbleOrientation(int i) {
        this.f93026x = i;
    }

    public void setNeedPath(boolean z) {
        this.f93027y = z;
    }

    public void setNeedPressFade(boolean z) {
        this.f93028z = z;
    }

    public BubbleLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (this.f93028z) {
                        m114584c();
                        break;
                    }
                    break;
                case 1:
                    if (this.f93028z) {
                        m114583b();
                        break;
                    }
                    break;
            }
        } else if (this.f93028z) {
            m114583b();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f93021s == null) {
            this.f93021s = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f93022t = new Canvas(this.f93021s);
        }
        Matrix a = m114580a(this.f93015m, this.f93016n);
        this.f93011i.setColor(this.f93024v);
        this.f93011i.setStyle(Style.STROKE);
        this.f93011i.setStrokeWidth((float) this.f93019q);
        if (this.f93027y) {
            this.f93012j.reset();
            this.f93012j.addRoundRect(this.f93018p, f93007e + ((float) (this.f93019q / 2)), f93007e + ((float) (this.f93019q / 2)), Direction.CW);
            this.f93012j.addPath(this.f93017o, this.f93020r);
            this.f93022t.drawPath(this.f93012j, this.f93011i);
        }
        this.f93011i.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.f93011i.setColor(this.f93023u);
        this.f93011i.setStyle(Style.FILL);
        this.f93012j.reset();
        Path path = this.f93012j;
        RectF rectF = this.f93014l;
        float f = f93007e;
        path.addRoundRect(rectF, f, f, Direction.CW);
        this.f93012j.addPath(this.f93013k, a);
        this.f93022t.drawPath(this.f93012j, this.f93011i);
        this.f93011i.setXfermode(null);
        canvas.drawBitmap(this.f93021s, 0.0f, 0.0f, null);
    }

    /* renamed from: a */
    public final void mo90187a(int i, float f) {
        this.f93025w = f;
        this.f93026x = i;
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m114579a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        TextView textView;
        int i3;
        int i4;
        int i5;
        super.onMeasure(i, i2);
        if (getChildAt(0) instanceof TextView) {
            textView = (TextView) getChildAt(0);
        } else {
            textView = null;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (textView != null) {
            i3 = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            i3 = getMeasuredWidth();
        }
        if (this.f93026x == 2 || this.f93026x == 1) {
            if (i3 > f93009g) {
                i5 = i3 + (f93004b * 2);
            } else {
                i5 = f93009g;
            }
            i4 = i5 + f93003a;
        } else if (i3 > f93009g) {
            i4 = i3 + (f93004b * 2);
        } else {
            i4 = f93009g;
        }
        int i6 = i4 + (this.f93019q * 3);
        int i7 = f93010h + (this.f93019q * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, i7);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i7);
        }
        this.f93015m = (float) (getMeasuredWidth() - (this.f93019q * 3));
        this.f93016n = (float) (getMeasuredHeight() - (this.f93019q * 3));
    }

    /* renamed from: a */
    private Matrix m114580a(float f, float f2) {
        float max = Math.max(this.f93025w, f93008f);
        float min = Math.min(max, f2 - f93008f);
        Matrix matrix = new Matrix();
        this.f93020r = new Matrix();
        switch (this.f93026x) {
            case 0:
                f = Math.min(max, f - f93008f);
                matrix.postRotate(90.0f);
                this.f93020r.postRotate(90.0f);
                this.f93020r.postTranslate(((float) ((this.f93019q * 3) / 2)) + f, ((float) this.f93019q) + 0.0f);
                setPadding(0, f93003a, 0, 0);
                setGravity(17);
                this.f93014l = new RectF(0.0f, (float) f93003a, this.f93015m, this.f93016n);
                f2 = 0.0f;
                break;
            case 1:
                f2 = Math.min(max, f2 - f93008f);
                setPadding(f93003a, 0, 0, 0);
                setGravity(17);
                this.f93020r.postTranslate(((float) this.f93019q) + 0.0f, ((float) ((this.f93019q * 3) / 2)) + f2);
                this.f93014l = new RectF((float) f93003a, 0.0f, this.f93015m, this.f93016n);
                break;
            case 2:
                f2 = Math.min(max, f2 - f93008f);
                matrix.postRotate(180.0f);
                this.f93020r.postRotate(180.0f);
                this.f93020r.postTranslate(((float) (this.f93019q * 2)) + f, ((float) ((this.f93019q * 3) / 2)) + f2);
                setPadding(0, 0, f93003a, 0);
                setGravity(17);
                this.f93014l = new RectF(0.0f, 0.0f, this.f93015m - ((float) f93003a), this.f93016n);
                break;
            case 3:
                f = Math.min(max, f - f93008f);
                matrix.postRotate(270.0f);
                this.f93020r.postRotate(270.0f);
                this.f93020r.postTranslate(((float) ((this.f93019q * 3) / 2)) + f, ((float) (this.f93019q * 2)) + f2);
                setPadding(0, 0, 0, f93003a);
                setGravity(17);
                this.f93014l = new RectF(0.0f, 0.0f, this.f93015m, this.f93016n - ((float) f93003a));
                break;
            default:
                f2 = min;
                break;
        }
        f = 0.0f;
        this.f93014l.left += (float) ((this.f93019q * 3) / 2);
        this.f93014l.top += (float) ((this.f93019q * 3) / 2);
        this.f93014l.right += (float) ((this.f93019q * 3) / 2);
        this.f93014l.bottom += (float) ((this.f93019q * 3) / 2);
        this.f93018p = new RectF();
        this.f93018p.left = this.f93014l.left - ((float) (this.f93019q / 2));
        this.f93018p.top = this.f93014l.top - ((float) (this.f93019q / 2));
        this.f93018p.right = this.f93014l.right + ((float) (this.f93019q / 2));
        this.f93018p.bottom = this.f93014l.bottom + ((float) (this.f93019q / 2));
        matrix.postTranslate(f + ((float) ((this.f93019q * 3) / 2)), f2 + ((float) ((this.f93019q * 3) / 2)));
        return matrix;
    }

    /* renamed from: a */
    private void m114582a(Context context, AttributeSet attributeSet) {
        this.f93019q = (int) m114579a(context, 0.5f);
        if (this.f93019q < 2) {
            this.f93019q = 2;
        }
        f93003a = (int) m114579a(context, 7.0f);
        f93004b = (int) m114579a(context, 10.0f);
        f93005c = (int) m114579a(context, 6.0f);
        f93006d = 2.0f;
        f93007e = m114579a(context, 6.0f);
        f93008f = (float) (f93003a + f93005c);
        f93009g = (int) m114579a(context, 50.0f);
        f93010h = (int) m114579a(context, 46.0f);
        this.f93011i = new Paint();
        this.f93011i.setStyle(Style.FILL);
        this.f93011i.setStrokeCap(Cap.BUTT);
        this.f93011i.setAntiAlias(true);
        this.f93011i.setStrokeWidth(f93006d);
        this.f93011i.setStrokeJoin(Join.MITER);
        this.f93023u = context.getResources().getColor(R.color.a85);
        this.f93024v = Color.parseColor("#1DFFFFFF");
        this.f93011i.setColor(this.f93023u);
        setLayerType(1, this.f93011i);
        m114581a();
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f93012j = new Path();
        this.f93013k = new Path();
        this.f93017o = new Path();
        this.f93025w = 0.75f;
        this.f93026x = 1;
        this.f93027y = true;
        m114582a(context, attributeSet);
    }
}
