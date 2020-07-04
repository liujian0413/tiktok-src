package com.bytedance.ies.dmt.p262ui.bubbleview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
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
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.dmt.ui.bubbleview.DmtBubbleLayout */
public final class DmtBubbleLayout extends LinearLayout {

    /* renamed from: g */
    public static int f28751g;

    /* renamed from: h */
    public static int f28752h;

    /* renamed from: i */
    public static float f28753i;

    /* renamed from: j */
    public static float f28754j;

    /* renamed from: k */
    public static float f28755k;

    /* renamed from: l */
    public static int f28756l;

    /* renamed from: m */
    public static int f28757m;

    /* renamed from: n */
    public static final C10750a f28758n = new C10750a(null);

    /* renamed from: A */
    private int f28759A;

    /* renamed from: B */
    private boolean f28760B;

    /* renamed from: C */
    private boolean f28761C;

    /* renamed from: D */
    private boolean f28762D;

    /* renamed from: E */
    private boolean f28763E;

    /* renamed from: F */
    private boolean f28764F;

    /* renamed from: a */
    public Paint f28765a;

    /* renamed from: b */
    public Path f28766b;

    /* renamed from: c */
    public Path f28767c;

    /* renamed from: d */
    public Path f28768d;

    /* renamed from: e */
    public RectF f28769e;

    /* renamed from: f */
    public Matrix f28770f;

    /* renamed from: o */
    private float f28771o;

    /* renamed from: p */
    private RectF f28772p;

    /* renamed from: q */
    private float f28773q;

    /* renamed from: r */
    private float f28774r;

    /* renamed from: s */
    private int f28775s;

    /* renamed from: t */
    private Bitmap f28776t;

    /* renamed from: u */
    private Canvas f28777u;

    /* renamed from: v */
    private int f28778v;

    /* renamed from: w */
    private int f28779w;

    /* renamed from: x */
    private int f28780x;

    /* renamed from: y */
    private boolean f28781y;

    /* renamed from: z */
    private float f28782z;

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.DmtBubbleLayout$a */
    public static final class C10750a {
        private C10750a() {
        }

        /* renamed from: a */
        public static void m31345a(int i) {
            DmtBubbleLayout.f28756l = i;
        }

        /* renamed from: b */
        public static void m31346b(int i) {
            DmtBubbleLayout.f28757m = i;
        }

        public /* synthetic */ C10750a(C7571f fVar) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.f28778v;
    }

    public final int getMBorderColor() {
        return this.f28779w;
    }

    public final int getMBorderWidth() {
        return this.f28775s;
    }

    public final float getMHeight() {
        return this.f28774r;
    }

    public final boolean getMNeedAddColor() {
        return this.f28763E;
    }

    public final boolean getMNeedArrow() {
        return this.f28762D;
    }

    public final boolean getMNeedPath() {
        return this.f28760B;
    }

    public final boolean getMNeedPressFade() {
        return this.f28761C;
    }

    public final boolean getMNeedShadow() {
        return this.f28781y;
    }

    public final float getMPadding() {
        return this.f28771o;
    }

    public final int getMShadowColor() {
        return this.f28780x;
    }

    public final float getMWidth() {
        return this.f28773q;
    }

    public final boolean getUseDefaultView() {
        return this.f28764F;
    }

    public final int getPADDING() {
        return f28751g / 2;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f28768d;
        if (path == null) {
            C7573i.m23583a("mBorderBubbleArrowPath");
        }
        return path;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f28770f;
        if (matrix == null) {
            C7573i.m23583a("mBorderMatrix");
        }
        return matrix;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f28769e;
        if (rectF == null) {
            C7573i.m23583a("mBorderRoundRect");
        }
        return rectF;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.f28767c;
        if (path == null) {
            C7573i.m23583a("mBubbleArrowPath");
        }
        return path;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.f28765a;
        if (paint == null) {
            C7573i.m23583a("mFillPaint");
        }
        return paint;
    }

    public final Path getMPath() {
        Path path = this.f28766b;
        if (path == null) {
            C7573i.m23583a("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.f28782z, f28755k);
        switch (this.f28759A) {
            case 0:
                return Math.min(max, this.f28773q - f28755k);
            case 1:
                return Math.min(max, this.f28774r - f28755k);
            case 2:
                return Math.min(max, this.f28774r - f28755k);
            case 3:
                return Math.min(max, this.f28773q - f28755k);
            default:
                return 0.0f;
        }
    }

    /* renamed from: a */
    private final void m31342a() {
        Path path = this.f28767c;
        if (path == null) {
            C7573i.m23583a("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f28767c;
        if (path2 == null) {
            C7573i.m23583a("mBubbleArrowPath");
        }
        path2.lineTo((float) f28751g, (float) (-f28751g));
        Path path3 = this.f28767c;
        if (path3 == null) {
            C7573i.m23583a("mBubbleArrowPath");
        }
        path3.lineTo((float) f28751g, (float) f28751g);
        Path path4 = this.f28767c;
        if (path4 == null) {
            C7573i.m23583a("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f28768d;
        if (path5 == null) {
            C7573i.m23583a("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f28768d;
        if (path6 == null) {
            C7573i.m23583a("mBorderBubbleArrowPath");
        }
        double d = (double) f28751g;
        double d2 = (double) this.f28775s;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt;
        Double.isNaN(d);
        float f = (float) (d + d3);
        double d4 = (double) (-f28751g);
        double d5 = (double) this.f28775s;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt2;
        Double.isNaN(d4);
        path6.lineTo(f, (float) (d4 - d6));
        Path path7 = this.f28768d;
        if (path7 == null) {
            C7573i.m23583a("mBorderBubbleArrowPath");
        }
        double d7 = (double) f28751g;
        double d8 = (double) this.f28775s;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt3;
        Double.isNaN(d7);
        float f2 = (float) (d7 + d9);
        double d10 = (double) f28751g;
        double d11 = (double) this.f28775s;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d11);
        double d12 = d11 * sqrt4;
        Double.isNaN(d10);
        path7.lineTo(f2, (float) (d10 + d12));
        Path path8 = this.f28768d;
        if (path8 == null) {
            C7573i.m23583a("mBorderBubbleArrowPath");
        }
        path8.close();
    }

    public final void setBubbleOrientation(int i) {
        this.f28759A = i;
    }

    public final void setMBgColor(int i) {
        this.f28778v = i;
    }

    public final void setMBorderColor(int i) {
        this.f28779w = i;
    }

    public final void setMBorderWidth(int i) {
        this.f28775s = i;
    }

    public final void setMHeight(float f) {
        this.f28774r = f;
    }

    public final void setMNeedAddColor(boolean z) {
        this.f28763E = z;
    }

    public final void setMNeedArrow(boolean z) {
        this.f28762D = z;
    }

    public final void setMNeedPath(boolean z) {
        this.f28760B = z;
    }

    public final void setMNeedPressFade(boolean z) {
        this.f28761C = z;
    }

    public final void setMNeedShadow(boolean z) {
        this.f28781y = z;
    }

    public final void setMPadding(float f) {
        this.f28771o = f;
    }

    public final void setMShadowColor(int i) {
        this.f28780x = i;
    }

    public final void setMWidth(float f) {
        this.f28773q = f;
    }

    public final void setNeedAddColor(boolean z) {
        this.f28763E = z;
    }

    public final void setUseDefaultView(boolean z) {
        this.f28764F = z;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        C7573i.m23587b(path, "<set-?>");
        this.f28768d = path;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        C7573i.m23587b(matrix, "<set-?>");
        this.f28770f = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        C7573i.m23587b(rectF, "<set-?>");
        this.f28769e = rectF;
    }

    public final void setMBubbleArrowPath(Path path) {
        C7573i.m23587b(path, "<set-?>");
        this.f28767c = path;
    }

    public final void setMFillPaint(Paint paint) {
        C7573i.m23587b(paint, "<set-?>");
        this.f28765a = paint;
    }

    public final void setMPath(Path path) {
        C7573i.m23587b(path, "<set-?>");
        this.f28766b = path;
    }

    public DmtBubbleLayout(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        C7573i.m23587b(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (this.f28776t == null) {
            this.f28776t = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f28777u = new Canvas(this.f28776t);
        }
        Matrix a = m31341a(this.f28773q, this.f28774r);
        if (this.f28781y) {
            Paint paint = this.f28765a;
            if (paint == null) {
                C7573i.m23583a("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.f28780x);
        }
        if (this.f28760B) {
            Paint paint2 = this.f28765a;
            if (paint2 == null) {
                C7573i.m23583a("mFillPaint");
            }
            paint2.setColor(this.f28779w);
            Paint paint3 = this.f28765a;
            if (paint3 == null) {
                C7573i.m23583a("mFillPaint");
            }
            paint3.setStyle(Style.STROKE);
            Paint paint4 = this.f28765a;
            if (paint4 == null) {
                C7573i.m23583a("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.f28775s);
            Path path = this.f28766b;
            if (path == null) {
                C7573i.m23583a("mPath");
            }
            path.reset();
            Path path2 = this.f28766b;
            if (path2 == null) {
                C7573i.m23583a("mPath");
            }
            RectF rectF = this.f28769e;
            if (rectF == null) {
                C7573i.m23583a("mBorderRoundRect");
            }
            path2.addRoundRect(rectF, f28754j + ((float) (this.f28775s / 2)), f28754j + ((float) (this.f28775s / 2)), Direction.CW);
            if (this.f28762D) {
                Path path3 = this.f28766b;
                if (path3 == null) {
                    C7573i.m23583a("mPath");
                }
                Path path4 = this.f28768d;
                if (path4 == null) {
                    C7573i.m23583a("mBorderBubbleArrowPath");
                }
                Matrix matrix = this.f28770f;
                if (matrix == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                path3.addPath(path4, matrix);
            }
            Canvas canvas2 = this.f28777u;
            if (canvas2 == null) {
                C7573i.m23583a("mCanvas");
            }
            Path path5 = this.f28766b;
            if (path5 == null) {
                C7573i.m23583a("mPath");
            }
            Paint paint5 = this.f28765a;
            if (paint5 == null) {
                C7573i.m23583a("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.f28763E) {
                Paint paint6 = this.f28765a;
                if (paint6 == null) {
                    C7573i.m23583a("mFillPaint");
                }
                paint6.setColor(getResources().getColor(R.color.aut));
                Paint paint7 = this.f28765a;
                if (paint7 == null) {
                    C7573i.m23583a("mFillPaint");
                }
                paint7.setStyle(Style.STROKE);
                Path path6 = this.f28766b;
                if (path6 == null) {
                    C7573i.m23583a("mPath");
                }
                path6.reset();
                if (this.f28762D) {
                    Path path7 = this.f28766b;
                    if (path7 == null) {
                        C7573i.m23583a("mPath");
                    }
                    Path path8 = this.f28768d;
                    if (path8 == null) {
                        C7573i.m23583a("mBorderBubbleArrowPath");
                    }
                    Matrix matrix2 = this.f28770f;
                    if (matrix2 == null) {
                        C7573i.m23583a("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix2);
                }
                Path path9 = this.f28766b;
                if (path9 == null) {
                    C7573i.m23583a("mPath");
                }
                RectF rectF2 = this.f28769e;
                if (rectF2 == null) {
                    C7573i.m23583a("mBorderRoundRect");
                }
                path9.addRoundRect(rectF2, f28754j + ((float) (this.f28775s / 2)), f28754j + ((float) (this.f28775s / 2)), Direction.CW);
                Canvas canvas3 = this.f28777u;
                if (canvas3 == null) {
                    C7573i.m23583a("mCanvas");
                }
                Path path10 = this.f28766b;
                if (path10 == null) {
                    C7573i.m23583a("mPath");
                }
                Paint paint8 = this.f28765a;
                if (paint8 == null) {
                    C7573i.m23583a("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f28765a;
        if (paint9 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(Mode.SRC));
        Paint paint10 = this.f28765a;
        if (paint10 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint10.setColor(this.f28778v);
        Paint paint11 = this.f28765a;
        if (paint11 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint11.setStyle(Style.FILL);
        Path path11 = this.f28766b;
        if (path11 == null) {
            C7573i.m23583a("mPath");
        }
        path11.reset();
        Path path12 = this.f28766b;
        if (path12 == null) {
            C7573i.m23583a("mPath");
        }
        RectF rectF3 = this.f28772p;
        if (rectF3 == null) {
            C7573i.m23583a("mRoundRect");
        }
        float f = f28754j;
        path12.addRoundRect(rectF3, f, f, Direction.CW);
        if (this.f28762D) {
            Path path13 = this.f28766b;
            if (path13 == null) {
                C7573i.m23583a("mPath");
            }
            Path path14 = this.f28767c;
            if (path14 == null) {
                C7573i.m23583a("mBubbleArrowPath");
            }
            path13.addPath(path14, a);
        }
        Canvas canvas4 = this.f28777u;
        if (canvas4 == null) {
            C7573i.m23583a("mCanvas");
        }
        Path path15 = this.f28766b;
        if (path15 == null) {
            C7573i.m23583a("mPath");
        }
        Paint paint12 = this.f28765a;
        if (paint12 == null) {
            C7573i.m23583a("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f28765a;
        if (paint13 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint13.setXfermode(null);
        canvas.drawBitmap(this.f28776t, ((float) f28751g) - C9738o.m28708b(getContext(), 1.4f), ((float) f28751g) - C9738o.m28708b(getContext(), 1.3f), null);
    }

    /* renamed from: a */
    public final void mo25670a(int i, float f) {
        this.f28782z = f;
        this.f28759A = i;
    }

    public DmtBubbleLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31343a(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this.f28775s = (int) C9738o.m28708b(context, 0.7f);
        f28751g = (int) C9738o.m28708b(context, 7.0f);
        f28753i = 2.0f;
        f28754j = C9738o.m28708b(context, 8.0f);
        f28755k = C9738o.m28708b(context, 3.0f);
        f28756l = (int) C9738o.m28708b(context, 50.0f);
        f28757m = (int) C9738o.m28708b(context, 56.0f);
        this.f28765a = new Paint();
        this.f28766b = new Path();
        this.f28768d = new Path();
        this.f28767c = new Path();
        Paint paint = this.f28765a;
        if (paint == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint.setStyle(Style.FILL);
        Paint paint2 = this.f28765a;
        if (paint2 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint2.setStrokeCap(Cap.BUTT);
        Paint paint3 = this.f28765a;
        if (paint3 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f28765a;
        if (paint4 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint4.setStrokeWidth(f28753i);
        Paint paint5 = this.f28765a;
        if (paint5 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint5.setStrokeJoin(Join.MITER);
        this.f28778v = getResources().getColor(R.color.auo);
        this.f28779w = getResources().getColor(R.color.a4k);
        Paint paint6 = this.f28765a;
        if (paint6 == null) {
            C7573i.m23583a("mFillPaint");
        }
        paint6.setColor(this.f28778v);
        Paint paint7 = this.f28765a;
        if (paint7 == null) {
            C7573i.m23583a("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.f28781y) {
            Paint paint8 = this.f28765a;
            if (paint8 == null) {
                C7573i.m23583a("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.f28780x);
        }
        m31342a();
        setBackgroundColor(0);
        setClipChildren(false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextView textView;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        super.onMeasure(i, i2);
        f28752h = (int) C9738o.m28708b(getContext(), this.f28771o + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            textView = null;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (textView != null) {
            if (((float) ((int) textView.getPaint().measureText(textView.getText().toString()))) > C9738o.m28708b(getContext(), 197.0f)) {
                i7 = (int) C9738o.m28708b(getContext(), 197.0f);
                c = 2;
            } else {
                i7 = (int) textView.getPaint().measureText(textView.getText().toString());
                c = 1;
            }
            i3 = i7 + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            i3 = getMeasuredWidth();
            c = 0;
        }
        if (this.f28764F) {
            if (this.f28759A == 2 || this.f28759A == 1) {
                if (i3 > f28756l) {
                    i6 = i3 + (f28752h * 2);
                } else {
                    i6 = f28756l;
                }
                i4 = i6 + f28751g;
            } else if (i3 > f28756l) {
                i4 = i3 + (f28752h * 2);
            } else {
                i4 = f28756l;
            }
            if (c == 1) {
                i5 = f28757m;
            } else {
                i5 = f28757m + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            C7573i.m23582a((Object) contentView, "pop.contentView");
            int measuredWidth = contentView.getMeasuredWidth() + (f28751g * 3) + f28752h;
            View contentView2 = popupWindow.getContentView();
            C7573i.m23582a((Object) contentView2, "pop.contentView");
            i4 = measuredWidth;
            i5 = contentView2.getMeasuredHeight() + (f28751g * 3) + f28752h;
        }
        int i8 = i4 + (this.f28775s * 3);
        int i9 = i5 + (this.f28775s * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i8, i9);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i8, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i9);
        }
        this.f28773q = (float) (getMeasuredWidth() - (f28751g * 2));
        this.f28774r = (float) (getMeasuredHeight() - (f28751g * 2));
    }

    /* renamed from: a */
    private final Matrix m31341a(float f, float f2) {
        float max = Math.max(this.f28782z, f28755k);
        Matrix matrix = new Matrix();
        this.f28770f = new Matrix();
        switch (this.f28759A) {
            case 0:
                float min = Math.min(max, f - f28755k);
                matrix.postRotate(90.0f);
                Matrix matrix2 = this.f28770f;
                if (matrix2 == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                matrix2.postRotate(90.0f);
                Matrix matrix3 = this.f28770f;
                if (matrix3 == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                matrix3.postTranslate((((float) ((this.f28775s * 3) / 2)) + min) - ((float) ((f28751g * 3) / 2)), ((float) this.f28775s) + 0.0f);
                setPadding(0, f28751g, 0, 0);
                setGravity(17);
                this.f28772p = new RectF(0.0f, (float) f28751g, this.f28773q, this.f28774r);
                matrix.postTranslate((min + ((float) ((this.f28775s * 3) / 2))) - ((float) ((f28751g * 3) / 2)), ((float) ((this.f28775s * 3) / 2)) + 0.0f);
                break;
            case 1:
                float min2 = Math.min(max, f2 - f28755k);
                setPadding(f28751g, 0, 0, 0);
                setGravity(17);
                Matrix matrix4 = this.f28770f;
                if (matrix4 == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                matrix4.postTranslate(((float) this.f28775s) + 0.0f, (((float) (this.f28775s * 2)) + min2) - ((float) ((f28751g * 3) / 2)));
                this.f28772p = new RectF((float) f28751g, 0.0f, this.f28773q, this.f28774r);
                matrix.postTranslate(((float) ((this.f28775s * 3) / 2)) + 0.0f, (min2 + ((float) (this.f28775s * 2))) - ((float) ((f28751g * 3) / 2)));
                break;
            case 2:
                float min3 = Math.min(max, f2 - f28755k);
                matrix.postRotate(180.0f);
                Matrix matrix5 = this.f28770f;
                if (matrix5 == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                matrix5.postRotate(180.0f);
                Matrix matrix6 = this.f28770f;
                if (matrix6 == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                matrix6.postTranslate(((float) (this.f28775s * 2)) + f, (((float) (this.f28775s * 2)) + min3) - ((float) ((f28751g * 3) / 2)));
                setPadding(0, 0, f28751g, 0);
                setGravity(17);
                this.f28772p = new RectF(0.0f, 0.0f, this.f28773q - ((float) f28751g), this.f28774r);
                matrix.postTranslate(f + ((float) ((this.f28775s * 3) / 2)), (min3 + ((float) (this.f28775s * 2))) - ((float) ((f28751g * 3) / 2)));
                break;
            case 3:
                float min4 = Math.min(max, f - f28755k);
                matrix.postRotate(270.0f);
                Matrix matrix7 = this.f28770f;
                if (matrix7 == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                matrix7.postRotate(270.0f);
                Matrix matrix8 = this.f28770f;
                if (matrix8 == null) {
                    C7573i.m23583a("mBorderMatrix");
                }
                matrix8.postTranslate((((float) ((this.f28775s * 3) / 2)) + min4) - ((float) ((f28751g * 3) / 2)), ((float) (this.f28775s * 2)) + f2);
                setPadding(0, 0, 0, f28751g);
                setGravity(17);
                this.f28772p = new RectF(0.0f, 0.0f, this.f28773q, this.f28774r - ((float) f28751g));
                matrix.postTranslate((min4 + ((float) ((this.f28775s * 3) / 2))) - ((float) ((f28751g * 3) / 2)), f2 + ((float) ((this.f28775s * 3) / 2)));
                break;
        }
        RectF rectF = this.f28772p;
        if (rectF == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF.left += (float) ((this.f28775s * 3) / 2);
        RectF rectF2 = this.f28772p;
        if (rectF2 == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF2.top += (float) ((this.f28775s * 3) / 2);
        RectF rectF3 = this.f28772p;
        if (rectF3 == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF3.right += (float) ((this.f28775s * 3) / 2);
        RectF rectF4 = this.f28772p;
        if (rectF4 == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF4.bottom += (float) ((this.f28775s * 3) / 2);
        this.f28769e = new RectF();
        RectF rectF5 = this.f28769e;
        if (rectF5 == null) {
            C7573i.m23583a("mBorderRoundRect");
        }
        RectF rectF6 = this.f28772p;
        if (rectF6 == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.f28775s / 2));
        RectF rectF7 = this.f28769e;
        if (rectF7 == null) {
            C7573i.m23583a("mBorderRoundRect");
        }
        RectF rectF8 = this.f28772p;
        if (rectF8 == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.f28775s / 2));
        RectF rectF9 = this.f28769e;
        if (rectF9 == null) {
            C7573i.m23583a("mBorderRoundRect");
        }
        RectF rectF10 = this.f28772p;
        if (rectF10 == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.f28775s / 2));
        RectF rectF11 = this.f28769e;
        if (rectF11 == null) {
            C7573i.m23583a("mBorderRoundRect");
        }
        RectF rectF12 = this.f28772p;
        if (rectF12 == null) {
            C7573i.m23583a("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.f28775s / 2));
        return matrix;
    }

    public DmtBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f28771o = 12.0f;
        this.f28780x = -16777216;
        this.f28782z = 0.75f;
        this.f28759A = 1;
        this.f28760B = true;
        this.f28762D = true;
        this.f28763E = true;
        this.f28764F = true;
        m31343a(context, attributeSet);
    }
}
