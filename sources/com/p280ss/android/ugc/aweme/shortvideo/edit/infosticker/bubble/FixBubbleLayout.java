package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.FixBubbleLayout */
public class FixBubbleLayout extends LinearLayout {

    /* renamed from: b */
    public static int f102732b;

    /* renamed from: c */
    public static int f102733c;

    /* renamed from: d */
    public static float f102734d;

    /* renamed from: e */
    public static float f102735e;

    /* renamed from: f */
    public static float f102736f;

    /* renamed from: g */
    public static int f102737g;

    /* renamed from: h */
    public static int f102738h;

    /* renamed from: i */
    public static int f102739i;

    /* renamed from: A */
    private boolean f102740A;

    /* renamed from: a */
    PorterDuffXfermode f102741a;

    /* renamed from: j */
    private Paint f102742j;

    /* renamed from: k */
    private final Path f102743k;

    /* renamed from: l */
    private final Path f102744l;

    /* renamed from: m */
    private RectF f102745m;

    /* renamed from: n */
    private float f102746n;

    /* renamed from: o */
    private float f102747o;

    /* renamed from: p */
    private Path f102748p;

    /* renamed from: q */
    private RectF f102749q;

    /* renamed from: r */
    private int f102750r;

    /* renamed from: s */
    private Matrix f102751s;

    /* renamed from: t */
    private Bitmap f102752t;

    /* renamed from: u */
    private Canvas f102753u;

    /* renamed from: v */
    private int f102754v;

    /* renamed from: w */
    private int f102755w;

    /* renamed from: x */
    private float f102756x;

    /* renamed from: y */
    private int f102757y;

    /* renamed from: z */
    private boolean f102758z;

    /* renamed from: b */
    private void m126395b() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addUpdateListener(C39577h.f102791a);
    }

    /* renamed from: c */
    private void m126396c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addUpdateListener(C39578i.f102792a);
    }

    public float getBubbleOffset() {
        float max = Math.max(this.f102756x, f102736f);
        switch (this.f102757y) {
            case 0:
                return Math.min(max, this.f102746n - f102736f);
            case 1:
                return Math.min(max, this.f102747o - f102736f);
            case 2:
                return Math.min(max, this.f102747o - f102736f);
            case 3:
                return Math.min(max, this.f102746n - f102736f);
            default:
                return 0.0f;
        }
    }

    /* renamed from: a */
    private void m126393a() {
        this.f102744l.moveTo(0.0f, 0.0f);
        this.f102744l.lineTo((float) f102732b, (float) (-f102732b));
        this.f102744l.lineTo((float) f102732b, (float) f102732b);
        this.f102744l.close();
        this.f102748p.moveTo(0.0f, 0.0f);
        Path path = this.f102748p;
        double d = (double) f102732b;
        double d2 = (double) this.f102750r;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt;
        Double.isNaN(d);
        float f = (float) (d + d3);
        double d4 = (double) (-f102732b);
        double d5 = (double) this.f102750r;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt2;
        Double.isNaN(d4);
        path.lineTo(f, (float) (d4 - d6));
        Path path2 = this.f102748p;
        double d7 = (double) f102732b;
        double d8 = (double) this.f102750r;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt3;
        Double.isNaN(d7);
        float f2 = (float) (d7 + d9);
        double d10 = (double) f102732b;
        double d11 = (double) this.f102750r;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d11);
        double d12 = d11 * sqrt4;
        Double.isNaN(d10);
        path2.lineTo(f2, (float) (d10 + d12));
        this.f102748p.close();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setAnimOffset(int i) {
        f102739i = i;
    }

    public void setBgColor(int i) {
        this.f102754v = i;
    }

    public void setBorderColor(int i) {
        this.f102755w = i;
    }

    public void setBubbleOrientation(int i) {
        this.f102757y = i;
    }

    public void setNeedPath(boolean z) {
        this.f102758z = z;
    }

    public void setNeedPressFade(boolean z) {
        this.f102740A = z;
    }

    public FixBubbleLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (this.f102740A) {
                        m126396c();
                        break;
                    }
                    break;
                case 1:
                    if (this.f102740A) {
                        m126395b();
                        break;
                    }
                    break;
            }
        } else if (this.f102740A) {
            m126395b();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f102752t == null) {
            this.f102752t = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f102753u = new Canvas(this.f102752t);
        }
        Matrix a = m126392a(this.f102746n, this.f102747o);
        this.f102742j.setColor(this.f102755w);
        this.f102742j.setStyle(Style.STROKE);
        this.f102742j.setStrokeWidth((float) this.f102750r);
        if (this.f102758z) {
            this.f102743k.reset();
            this.f102743k.addRoundRect(this.f102749q, f102735e + ((float) (this.f102750r / 2)), f102735e + ((float) (this.f102750r / 2)), Direction.CW);
            this.f102743k.addPath(this.f102748p, this.f102751s);
            this.f102753u.drawPath(this.f102743k, this.f102742j);
        }
        this.f102742j.setXfermode(this.f102741a);
        this.f102742j.setColor(this.f102754v);
        this.f102742j.setStyle(Style.FILL);
        this.f102743k.reset();
        Path path = this.f102743k;
        RectF rectF = this.f102745m;
        float f = f102735e;
        path.addRoundRect(rectF, f, f, Direction.CW);
        this.f102743k.addPath(this.f102744l, a);
        this.f102753u.drawPath(this.f102743k, this.f102742j);
        this.f102742j.setXfermode(null);
        canvas.drawBitmap(this.f102752t, 0.0f, 0.0f, null);
    }

    /* renamed from: a */
    public final void mo98514a(int i, float f) {
        this.f102756x = f;
        this.f102757y = i;
    }

    public FixBubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m126391a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        TextView textView;
        int i3;
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
        if (this.f102757y == 2 || this.f102757y == 1) {
            if (i3 <= f102737g) {
                i3 = f102737g;
            }
            i3 += f102732b;
        } else if (i3 <= f102737g) {
            i3 = f102737g;
        }
        int measuredHeight = getMeasuredHeight() + (this.f102750r * 3) + (f102732b * 2) + (f102739i * 2);
        int i4 = i3 + (this.f102750r * 3) + (f102732b * 2) + (f102739i * 2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i4, measuredHeight);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i4, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, measuredHeight);
        }
        this.f102746n = (float) (getMeasuredWidth() - (this.f102750r * 3));
        this.f102747o = (float) (getMeasuredHeight() - (this.f102750r * 3));
    }

    /* renamed from: a */
    private Matrix m126392a(float f, float f2) {
        float f3;
        float max = Math.max(this.f102756x, f102736f);
        float min = Math.min(max, f2 - f102736f);
        Matrix matrix = new Matrix();
        this.f102751s = new Matrix();
        int i = f102732b + f102739i;
        switch (this.f102757y) {
            case 0:
                f3 = Math.min(max, f - f102736f);
                min = (float) (f102739i + (this.f102750r * 2));
                matrix.postRotate(90.0f);
                this.f102751s.postRotate(90.0f);
                this.f102751s.postTranslate(((float) ((this.f102750r * 3) / 2)) + f3, ((float) this.f102750r) + min);
                break;
            case 1:
                f3 = (float) (f102739i + (this.f102750r * 2));
                min = Math.min(max, f2 - f102736f);
                setGravity(17);
                this.f102751s.postTranslate(((float) this.f102750r) + f3, ((float) ((this.f102750r * 3) / 2)) + min);
                break;
            case 2:
                f3 = (f - ((float) f102739i)) - ((float) (this.f102750r * 2));
                min = Math.min(max, f2 - f102736f);
                matrix.postRotate(180.0f);
                this.f102751s.postRotate(180.0f);
                this.f102751s.postTranslate(((float) (this.f102750r * 2)) + f3, ((float) ((this.f102750r * 3) / 2)) + min);
                break;
            case 3:
                f3 = Math.min(max, f - f102736f);
                min = (f2 - ((float) f102739i)) - ((float) (this.f102750r * 2));
                matrix.postRotate(270.0f);
                this.f102751s.postRotate(270.0f);
                this.f102751s.postTranslate(((float) ((this.f102750r * 3) / 2)) + f3, ((float) (this.f102750r * 2)) + min);
                break;
            default:
                f3 = 0.0f;
                break;
        }
        setGravity(17);
        float f4 = (float) i;
        this.f102745m = new RectF(f4, f4, this.f102746n - f4, this.f102747o - f4);
        this.f102745m.left += (float) ((this.f102750r * 3) / 2);
        this.f102745m.top += (float) ((this.f102750r * 3) / 2);
        this.f102745m.right += (float) ((this.f102750r * 3) / 2);
        this.f102745m.bottom += (float) ((this.f102750r * 3) / 2);
        this.f102749q = new RectF();
        this.f102749q.left = this.f102745m.left - (((float) this.f102750r) / 2.0f);
        this.f102749q.top = this.f102745m.top - (((float) this.f102750r) / 2.0f);
        this.f102749q.right = this.f102745m.right + (((float) this.f102750r) / 2.0f);
        this.f102749q.bottom = this.f102745m.bottom + (((float) this.f102750r) / 2.0f);
        matrix.postTranslate(f3 + ((((float) this.f102750r) * 3.0f) / 2.0f), min + ((((float) this.f102750r) * 3.0f) / 2.0f));
        return matrix;
    }

    /* renamed from: a */
    private void m126394a(Context context, AttributeSet attributeSet) {
        this.f102750r = (int) m126391a(context, 0.5f);
        f102732b = (int) m126391a(context, 7.0f);
        f102733c = (int) m126391a(context, 6.0f);
        f102734d = 2.0f;
        f102735e = m126391a(context, 6.0f);
        f102736f = (float) (f102732b + f102733c);
        f102737g = (int) m126391a(context, 50.0f);
        f102738h = (int) m126391a(context, 46.0f);
        this.f102742j = new Paint();
        this.f102742j.setStyle(Style.FILL);
        this.f102742j.setStrokeCap(Cap.BUTT);
        this.f102742j.setAntiAlias(true);
        this.f102742j.setStrokeWidth(f102734d);
        this.f102742j.setStrokeJoin(Join.MITER);
        this.f102754v = context.getResources().getColor(R.color.a85);
        this.f102755w = Color.parseColor("#1DFFFFFF");
        this.f102742j.setColor(this.f102754v);
        setLayerType(1, this.f102742j);
        m126393a();
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public FixBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f102741a = new PorterDuffXfermode(Mode.SRC);
        this.f102742j = null;
        this.f102743k = new Path();
        this.f102744l = new Path();
        this.f102748p = new Path();
        this.f102756x = 0.75f;
        this.f102757y = 1;
        this.f102758z = true;
        m126394a(context, attributeSet);
    }
}
