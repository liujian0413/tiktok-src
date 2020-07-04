package android.support.design.circularreveal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.circularreveal.C0263d.C0268d;
import android.support.design.widget.C0402j;
import android.view.View;

/* renamed from: android.support.design.circularreveal.c */
public final class C0261c {

    /* renamed from: a */
    public static final int f1037a;

    /* renamed from: b */
    public Drawable f1038b;

    /* renamed from: c */
    private final C0262a f1039c;

    /* renamed from: d */
    private final View f1040d;

    /* renamed from: e */
    private final Path f1041e;

    /* renamed from: f */
    private final Paint f1042f;

    /* renamed from: g */
    private final Paint f1043g;

    /* renamed from: h */
    private C0268d f1044h;

    /* renamed from: i */
    private boolean f1045i;

    /* renamed from: j */
    private boolean f1046j;

    /* renamed from: android.support.design.circularreveal.c$a */
    public interface C0262a {
        /* renamed from: a */
        void mo1012a(Canvas canvas);

        /* renamed from: c */
        boolean mo1014c();
    }

    /* renamed from: d */
    public final int mo1030d() {
        return this.f1043g.getColor();
    }

    /* renamed from: i */
    private boolean m1040i() {
        if (this.f1045i || this.f1038b == null || this.f1044h == null) {
            return false;
        }
        return true;
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1037a = 2;
        } else if (VERSION.SDK_INT >= 18) {
            f1037a = 1;
        } else {
            f1037a = 0;
        }
    }

    /* renamed from: h */
    private boolean m1039h() {
        if (this.f1045i || Color.alpha(this.f1043g.getColor()) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final C0268d mo1029c() {
        if (this.f1044h == null) {
            return null;
        }
        C0268d dVar = new C0268d(this.f1044h);
        if (dVar.mo1045a()) {
            dVar.f1055c = m1035b(dVar);
        }
        return dVar;
    }

    /* renamed from: e */
    public final boolean mo1031e() {
        if (!this.f1039c.mo1014c() || m1038g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m1037f() {
        if (f1037a == 1) {
            this.f1041e.rewind();
            if (this.f1044h != null) {
                this.f1041e.addCircle(this.f1044h.f1053a, this.f1044h.f1054b, this.f1044h.f1055c, Direction.CW);
            }
        }
        this.f1040d.invalidate();
    }

    /* renamed from: g */
    private boolean m1038g() {
        boolean z;
        if (this.f1044h == null || this.f1044h.mo1045a()) {
            z = true;
        } else {
            z = false;
        }
        if (f1037a == 0) {
            if (z || !this.f1046j) {
                return false;
            }
            return true;
        } else if (!z) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo1023a() {
        if (f1037a == 0) {
            this.f1045i = true;
            this.f1046j = false;
            this.f1040d.buildDrawingCache();
            Bitmap drawingCache = this.f1040d.getDrawingCache();
            if (!(drawingCache != null || this.f1040d.getWidth() == 0 || this.f1040d.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f1040d.getWidth(), this.f1040d.getHeight(), Config.ARGB_8888);
                this.f1040d.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f1042f;
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f1045i = false;
            this.f1046j = true;
        }
    }

    /* renamed from: b */
    public final void mo1028b() {
        if (f1037a == 0) {
            this.f1046j = false;
            this.f1040d.destroyDrawingCache();
            this.f1042f.setShader(null);
            this.f1040d.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo1026a(Drawable drawable) {
        this.f1038b = drawable;
        this.f1040d.invalidate();
    }

    /* renamed from: a */
    public final void mo1024a(int i) {
        this.f1043g.setColor(i);
        this.f1040d.invalidate();
    }

    /* renamed from: b */
    private float m1035b(C0268d dVar) {
        return C0402j.m1810a(dVar.f1053a, dVar.f1054b, 0.0f, 0.0f, (float) this.f1040d.getWidth(), (float) this.f1040d.getHeight());
    }

    /* renamed from: b */
    private void m1036b(Canvas canvas) {
        if (m1040i()) {
            Rect bounds = this.f1038b.getBounds();
            float width = this.f1044h.f1053a - (((float) bounds.width()) / 2.0f);
            float height = this.f1044h.f1054b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f1038b.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: a */
    public final void mo1027a(C0268d dVar) {
        if (dVar == null) {
            this.f1044h = null;
        } else {
            if (this.f1044h == null) {
                this.f1044h = new C0268d(dVar);
            } else {
                this.f1044h.mo1044a(dVar);
            }
            if (C0402j.m1812b(dVar.f1055c, m1035b(dVar), 1.0E-4f)) {
                this.f1044h.f1055c = Float.MAX_VALUE;
            }
        }
        m1037f();
    }

    /* renamed from: a */
    public final void mo1025a(Canvas canvas) {
        if (m1038g()) {
            switch (f1037a) {
                case 0:
                    canvas.drawCircle(this.f1044h.f1053a, this.f1044h.f1054b, this.f1044h.f1055c, this.f1042f);
                    if (m1039h()) {
                        canvas.drawCircle(this.f1044h.f1053a, this.f1044h.f1054b, this.f1044h.f1055c, this.f1043g);
                        break;
                    }
                    break;
                case 1:
                    int save = canvas.save();
                    canvas.clipPath(this.f1041e);
                    this.f1039c.mo1012a(canvas);
                    if (m1039h()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.f1040d.getWidth(), (float) this.f1040d.getHeight(), this.f1043g);
                    }
                    canvas.restoreToCount(save);
                    break;
                case 2:
                    this.f1039c.mo1012a(canvas);
                    if (m1039h()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.f1040d.getWidth(), (float) this.f1040d.getHeight(), this.f1043g);
                        break;
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unsupported strategy ");
                    sb.append(f1037a);
                    throw new IllegalStateException(sb.toString());
            }
        } else {
            this.f1039c.mo1012a(canvas);
            if (m1039h()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f1040d.getWidth(), (float) this.f1040d.getHeight(), this.f1043g);
            }
        }
        m1036b(canvas);
    }
}
