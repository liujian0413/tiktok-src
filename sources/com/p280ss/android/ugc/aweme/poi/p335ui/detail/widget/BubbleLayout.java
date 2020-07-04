package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

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
import java.io.PrintStream;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.BubbleLayout */
public class BubbleLayout extends LinearLayout {

    /* renamed from: a */
    public static int f92726a;

    /* renamed from: b */
    public static int f92727b;

    /* renamed from: c */
    public static int f92728c;

    /* renamed from: d */
    public static float f92729d;

    /* renamed from: e */
    public static float f92730e;

    /* renamed from: f */
    public static float f92731f;

    /* renamed from: g */
    public static int f92732g;

    /* renamed from: h */
    public static int f92733h;

    /* renamed from: A */
    private PorterDuffXfermode f92734A;

    /* renamed from: i */
    private Paint f92735i;

    /* renamed from: j */
    private final Path f92736j;

    /* renamed from: k */
    private final Path f92737k;

    /* renamed from: l */
    private RectF f92738l;

    /* renamed from: m */
    private float f92739m;

    /* renamed from: n */
    private float f92740n;

    /* renamed from: o */
    private Path f92741o;

    /* renamed from: p */
    private RectF f92742p;

    /* renamed from: q */
    private int f92743q;

    /* renamed from: r */
    private Matrix f92744r;

    /* renamed from: s */
    private Bitmap f92745s;

    /* renamed from: t */
    private Canvas f92746t;

    /* renamed from: u */
    private int f92747u;

    /* renamed from: v */
    private int f92748v;

    /* renamed from: w */
    private float f92749w;

    /* renamed from: x */
    private int f92750x;

    /* renamed from: y */
    private boolean f92751y;

    /* renamed from: z */
    private boolean f92752z;

    /* renamed from: c */
    private void m114165c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(100);
        ofFloat.start();
    }

    /* renamed from: b */
    private void m114164b() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
    }

    public float getBubbleOffset() {
        float max = Math.max(this.f92749w, f92731f);
        switch (this.f92750x) {
            case 0:
            case 3:
                return Math.min(max, this.f92739m - f92731f);
            case 1:
            case 2:
                return Math.min(max, this.f92740n - f92731f);
            default:
                return 0.0f;
        }
    }

    /* renamed from: a */
    private void m114162a() {
        this.f92737k.moveTo(0.0f, 0.0f);
        this.f92737k.lineTo((float) f92726a, (float) (-f92726a));
        this.f92737k.lineTo((float) f92726a, (float) f92726a);
        this.f92737k.close();
        this.f92741o.moveTo(0.0f, 0.0f);
        Path path = this.f92741o;
        double d = (double) f92726a;
        double d2 = (double) this.f92743q;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt;
        Double.isNaN(d);
        float f = (float) (d + d3);
        double d4 = (double) (-f92726a);
        double d5 = (double) this.f92743q;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt2;
        Double.isNaN(d4);
        path.lineTo(f, (float) (d4 - d6));
        Path path2 = this.f92741o;
        double d7 = (double) f92726a;
        double d8 = (double) this.f92743q;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt3;
        Double.isNaN(d7);
        float f2 = (float) (d7 + d9);
        double d10 = (double) f92726a;
        double d11 = (double) this.f92743q;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d11);
        double d12 = d11 * sqrt4;
        Double.isNaN(d10);
        path2.lineTo(f2, (float) (d10 + d12));
        this.f92741o.close();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setBgColor(int i) {
        this.f92747u = i;
    }

    public void setBorderColor(int i) {
        this.f92748v = i;
    }

    public void setBubbleOrientation(int i) {
        this.f92750x = i;
    }

    public void setNeedPath(boolean z) {
        this.f92751y = z;
    }

    public void setNeedPressFade(boolean z) {
        this.f92752z = z;
    }

    public BubbleLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (this.f92752z) {
                        m114165c();
                        break;
                    }
                    break;
                case 1:
                    break;
            }
        }
        if (this.f92752z) {
            m114164b();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f92745s == null) {
            this.f92745s = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f92746t = new Canvas(this.f92745s);
        }
        this.f92746t.drawColor(0, Mode.CLEAR);
        Matrix a = m114161a(this.f92739m, this.f92740n);
        this.f92735i.setColor(this.f92748v);
        this.f92735i.setStyle(Style.STROKE);
        this.f92735i.setStrokeWidth((float) this.f92743q);
        if (this.f92751y) {
            this.f92736j.reset();
            this.f92736j.addRoundRect(this.f92742p, f92730e + ((float) (this.f92743q / 2)), f92730e + ((float) (this.f92743q / 2)), Direction.CW);
            this.f92736j.addPath(this.f92741o, this.f92744r);
            this.f92746t.drawPath(this.f92736j, this.f92735i);
        }
        this.f92735i.setXfermode(this.f92734A);
        this.f92735i.setColor(this.f92747u);
        this.f92735i.setStyle(Style.FILL);
        this.f92736j.reset();
        Path path = this.f92736j;
        RectF rectF = this.f92738l;
        float f = f92730e;
        path.addRoundRect(rectF, f, f, Direction.CW);
        this.f92736j.addPath(this.f92737k, a);
        this.f92746t.drawPath(this.f92736j, this.f92735i);
        this.f92735i.setXfermode(null);
        canvas.drawBitmap(this.f92745s, 0.0f, 0.0f, null);
    }

    /* renamed from: a */
    public final void mo89999a(int i, float f) {
        this.f92749w = f;
        this.f92750x = 0;
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m114160a(Context context, float f) {
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
        if (this.f92750x == 2 || this.f92750x == 1) {
            if (i3 > f92732g) {
                i5 = i3 + (f92727b * 2);
            } else {
                i5 = f92732g;
            }
            i4 = i5 + f92726a;
        } else if (i3 > f92732g) {
            i4 = i3 + (f92727b * 2);
        } else {
            i4 = f92732g;
        }
        int i6 = i4 + (this.f92743q * 3);
        int i7 = f92733h + (this.f92743q * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, i7);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i6, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i7);
        }
        this.f92739m = (float) (getMeasuredWidth() - (this.f92743q * 3));
        this.f92740n = (float) (getMeasuredHeight() - (this.f92743q * 3));
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("bubbleoffset: width ");
        sb.append(this.f92739m);
        printStream.println(sb.toString());
    }

    /* renamed from: a */
    private Matrix m114161a(float f, float f2) {
        float max = Math.max(this.f92749w, f92731f);
        float min = Math.min(max, f2 - f92731f);
        Matrix matrix = new Matrix();
        this.f92744r = new Matrix();
        switch (this.f92750x) {
            case 0:
                f = Math.min(max, f - f92731f);
                matrix.postRotate(90.0f);
                this.f92744r.postRotate(90.0f);
                this.f92744r.postTranslate(((float) ((this.f92743q * 3) / 2)) + f, ((float) this.f92743q) + 0.0f);
                setPadding(0, f92726a, 0, 0);
                setGravity(17);
                this.f92738l = new RectF(0.0f, (float) f92726a, this.f92739m, this.f92740n);
                f2 = 0.0f;
                break;
            case 1:
                f2 = Math.min(max, f2 - f92731f);
                setPadding(f92726a, 0, 0, 0);
                setGravity(17);
                this.f92744r.postTranslate(((float) this.f92743q) + 0.0f, ((float) ((this.f92743q * 3) / 2)) + f2);
                this.f92738l = new RectF((float) f92726a, 0.0f, this.f92739m, this.f92740n);
                break;
            case 2:
                f2 = Math.min(max, f2 - f92731f);
                matrix.postRotate(180.0f);
                this.f92744r.postRotate(180.0f);
                this.f92744r.postTranslate(((float) (this.f92743q * 2)) + f, ((float) ((this.f92743q * 3) / 2)) + f2);
                setPadding(0, 0, f92726a, 0);
                setGravity(17);
                this.f92738l = new RectF(0.0f, 0.0f, this.f92739m - ((float) f92726a), this.f92740n);
                break;
            case 3:
                f = Math.min(max, f - f92731f);
                matrix.postRotate(270.0f);
                this.f92744r.postRotate(270.0f);
                this.f92744r.postTranslate(((float) ((this.f92743q * 3) / 2)) + f, ((float) (this.f92743q * 2)) + f2);
                setPadding(0, 0, 0, f92726a);
                setGravity(17);
                this.f92738l = new RectF(0.0f, 0.0f, this.f92739m, this.f92740n - ((float) f92726a));
                break;
            default:
                f2 = min;
                break;
        }
        f = 0.0f;
        this.f92738l.left += (float) ((this.f92743q * 3) / 2);
        this.f92738l.top += (float) ((this.f92743q * 3) / 2);
        this.f92738l.right += (float) ((this.f92743q * 3) / 2);
        this.f92738l.bottom += (float) ((this.f92743q * 3) / 2);
        this.f92742p = new RectF();
        this.f92742p.left = this.f92738l.left - ((float) (this.f92743q / 2));
        this.f92742p.top = this.f92738l.top - ((float) (this.f92743q / 2));
        this.f92742p.right = this.f92738l.right + ((float) (this.f92743q / 2));
        this.f92742p.bottom = this.f92738l.bottom + ((float) (this.f92743q / 2));
        matrix.postTranslate(f + ((float) ((this.f92743q * 3) / 2)), f2 + ((float) ((this.f92743q * 3) / 2)));
        return matrix;
    }

    /* renamed from: a */
    private void m114163a(Context context, AttributeSet attributeSet) {
        this.f92743q = (int) m114160a(context, 0.5f);
        if (this.f92743q < 2) {
            this.f92743q = 2;
        }
        f92726a = (int) m114160a(context, 7.0f);
        f92727b = (int) m114160a(context, 10.0f);
        f92728c = (int) m114160a(context, 6.0f);
        f92729d = 2.0f;
        f92730e = m114160a(context, 6.0f);
        f92731f = (float) (f92726a + f92728c);
        f92732g = (int) m114160a(context, 50.0f);
        f92733h = (int) m114160a(context, 46.0f);
        this.f92735i = new Paint();
        this.f92735i.setStyle(Style.FILL);
        this.f92735i.setStrokeCap(Cap.BUTT);
        this.f92735i.setAntiAlias(true);
        this.f92735i.setStrokeWidth(f92729d);
        this.f92735i.setStrokeJoin(Join.MITER);
        this.f92747u = Color.parseColor("#CC000000");
        this.f92748v = Color.parseColor("#1DFFFFFF");
        this.f92735i.setColor(this.f92747u);
        setLayerType(1, this.f92735i);
        m114162a();
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f92736j = new Path();
        this.f92737k = new Path();
        this.f92741o = new Path();
        this.f92749w = 0.75f;
        this.f92750x = 1;
        this.f92751y = true;
        this.f92734A = new PorterDuffXfermode(Mode.SRC);
        m114163a(context, attributeSet);
    }
}
