package com.p280ss.android.ugc.aweme.base.p308ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.RelativeLayout;

/* renamed from: com.ss.android.ugc.aweme.base.ui.RippleView */
public final class RippleView extends RelativeLayout {

    /* renamed from: a */
    public Boolean f61779a;

    /* renamed from: b */
    public Boolean f61780b;

    /* renamed from: c */
    private int f61781c;

    /* renamed from: d */
    private int f61782d;

    /* renamed from: e */
    private int f61783e;

    /* renamed from: f */
    private int f61784f;

    /* renamed from: g */
    private int f61785g;

    /* renamed from: h */
    private Handler f61786h;

    /* renamed from: i */
    private float f61787i;

    /* renamed from: j */
    private boolean f61788j;

    /* renamed from: k */
    private int f61789k;

    /* renamed from: l */
    private int f61790l;

    /* renamed from: m */
    private int f61791m;

    /* renamed from: n */
    private float f61792n;

    /* renamed from: o */
    private float f61793o;

    /* renamed from: p */
    private int f61794p;

    /* renamed from: q */
    private float f61795q;

    /* renamed from: r */
    private ScaleAnimation f61796r;

    /* renamed from: s */
    private Integer f61797s;

    /* renamed from: t */
    private Paint f61798t;

    /* renamed from: u */
    private Bitmap f61799u;

    /* renamed from: v */
    private int f61800v;

    /* renamed from: w */
    private int f61801w;

    /* renamed from: x */
    private GestureDetector f61802x;

    /* renamed from: y */
    private final Runnable f61803y;

    /* renamed from: z */
    private C23429a f61804z;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.RippleView$RippleType */
    public enum RippleType {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);
        
        int type;

        private RippleType(int i) {
            this.type = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.RippleView$a */
    public interface C23429a {
    }

    public final int getFrameRate() {
        return this.f61783e;
    }

    public final int getRippleAlpha() {
        return this.f61785g;
    }

    public final int getRippleColor() {
        return this.f61800v;
    }

    public final int getRippleDuration() {
        return this.f61784f;
    }

    public final int getRipplePadding() {
        return this.f61801w;
    }

    public final int getZoomDuration() {
        return this.f61794p;
    }

    public final float getZoomScale() {
        return this.f61795q;
    }

    public final RippleType getRippleType() {
        return RippleType.values()[this.f61797s.intValue()];
    }

    public final void setCentered(Boolean bool) {
        this.f61780b = bool;
    }

    public final void setFrameRate(int i) {
        this.f61783e = i;
    }

    public final void setOnRippleCompleteListener(C23429a aVar) {
        this.f61804z = aVar;
    }

    public final void setRippleAlpha(int i) {
        this.f61785g = i;
    }

    public final void setRippleDuration(int i) {
        this.f61784f = i;
    }

    public final void setRipplePadding(int i) {
        this.f61801w = i;
    }

    public final void setZoomDuration(int i) {
        this.f61794p = i;
    }

    public final void setZoomScale(float f) {
        this.f61795q = f;
    }

    public final void setZooming(Boolean bool) {
        this.f61779a = bool;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m76872a(MotionEvent motionEvent) {
        m76871a(motionEvent.getX(), motionEvent.getY());
    }

    public final void setRippleColor(int i) {
        this.f61800v = getResources().getColor(i);
    }

    public final void setRippleType(RippleType rippleType) {
        this.f61797s = Integer.valueOf(rippleType.ordinal());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f61802x.onTouchEvent(motionEvent)) {
            m76872a(motionEvent);
            m76873a(Boolean.valueOf(false));
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m76873a(Boolean bool) {
        if (getParent() instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) getParent();
            int positionForView = adapterView.getPositionForView(this);
            long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
            if (bool.booleanValue()) {
                if (adapterView.getOnItemLongClickListener() != null) {
                    adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition);
                }
            } else if (adapterView.getOnItemClickListener() != null) {
                adapterView.getOnItemClickListener().onItemClick(adapterView, this, positionForView, itemIdAtPosition);
            }
        }
    }

    /* renamed from: a */
    private Bitmap m76870a(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(this.f61799u.getWidth(), this.f61799u.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f = (float) i;
        Rect rect = new Rect((int) (this.f61792n - f), (int) (this.f61793o - f), (int) (this.f61792n + f), (int) (this.f61793o + f));
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(this.f61792n, this.f61793o, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(this.f61799u, rect, rect, paint);
        return createBitmap;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f61788j) {
            canvas.save();
            if (this.f61784f <= this.f61789k * this.f61783e) {
                this.f61788j = false;
                this.f61789k = 0;
                this.f61791m = -1;
                this.f61790l = 0;
                if (VERSION.SDK_INT != 23) {
                    canvas.restore();
                }
                invalidate();
                return;
            }
            this.f61786h.postDelayed(this.f61803y, (long) this.f61783e);
            if (this.f61789k == 0) {
                canvas.save();
            }
            canvas.drawCircle(this.f61792n, this.f61793o, this.f61787i * ((((float) this.f61789k) * ((float) this.f61783e)) / ((float) this.f61784f)), this.f61798t);
            this.f61798t.setColor(Color.parseColor("#ffff4444"));
            if (this.f61797s.intValue() == 1 && this.f61799u != null && (((float) this.f61789k) * ((float) this.f61783e)) / ((float) this.f61784f) > 0.4f) {
                if (this.f61791m == -1) {
                    this.f61791m = this.f61784f - (this.f61789k * this.f61783e);
                }
                this.f61790l++;
                Bitmap a = m76870a((int) (this.f61787i * ((((float) this.f61790l) * ((float) this.f61783e)) / ((float) this.f61791m))));
                canvas.drawBitmap(a, 0.0f, 0.0f, this.f61798t);
                a.recycle();
            }
            this.f61798t.setColor(this.f61800v);
            if (this.f61797s.intValue() != 1) {
                this.f61798t.setAlpha((int) (((float) this.f61785g) - (((float) this.f61785g) * ((((float) this.f61789k) * ((float) this.f61783e)) / ((float) this.f61784f)))));
            } else if ((((float) this.f61789k) * ((float) this.f61783e)) / ((float) this.f61784f) > 0.6f) {
                this.f61798t.setAlpha((int) (((float) this.f61785g) - (((float) this.f61785g) * ((((float) this.f61790l) * ((float) this.f61783e)) / ((float) this.f61791m)))));
            } else {
                this.f61798t.setAlpha(this.f61785g);
            }
            this.f61789k++;
        }
    }

    /* renamed from: a */
    private void m76871a(float f, float f2) {
        if (isEnabled() && !this.f61788j) {
            if (this.f61779a.booleanValue()) {
                startAnimation(this.f61796r);
            }
            this.f61787i = (float) (Math.max(this.f61781c, this.f61782d) * 2);
            if (this.f61797s.intValue() != 2) {
                this.f61787i /= 2.0f;
            }
            this.f61787i -= (float) this.f61801w;
            if (this.f61780b.booleanValue() || this.f61797s.intValue() == 1) {
                this.f61792n = (float) (getMeasuredWidth() / 2);
                this.f61793o = (float) (getMeasuredHeight() / 2);
            } else {
                this.f61792n = f;
                this.f61793o = f2;
            }
            this.f61788j = true;
            if (this.f61797s.intValue() == 1 && this.f61799u == null) {
                this.f61799u = getDrawingCache(true);
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f61781c = i;
        this.f61782d = i2;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, this.f61795q, 1.0f, this.f61795q, (float) (i / 2), (float) (i2 / 2));
        this.f61796r = scaleAnimation;
        this.f61796r.setDuration((long) this.f61794p);
        this.f61796r.setRepeatMode(2);
        this.f61796r.setRepeatCount(1);
    }
}
