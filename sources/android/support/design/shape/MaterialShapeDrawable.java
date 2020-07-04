package android.support.design.shape;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.support.p022v4.graphics.drawable.C0732e;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public class MaterialShapeDrawable extends Drawable implements C0732e {

    /* renamed from: a */
    public C0304d f1186a;

    /* renamed from: b */
    public boolean f1187b;

    /* renamed from: c */
    public float f1188c;

    /* renamed from: d */
    public int f1189d;

    /* renamed from: e */
    public int f1190e;

    /* renamed from: f */
    public float f1191f;

    /* renamed from: g */
    public float f1192g;

    /* renamed from: h */
    public Style f1193h;

    /* renamed from: i */
    public ColorStateList f1194i;

    /* renamed from: j */
    private final Paint f1195j;

    /* renamed from: k */
    private final Matrix[] f1196k;

    /* renamed from: l */
    private final Matrix[] f1197l;

    /* renamed from: m */
    private final C0300c[] f1198m;

    /* renamed from: n */
    private final Matrix f1199n;

    /* renamed from: o */
    private final Path f1200o;

    /* renamed from: p */
    private final PointF f1201p;

    /* renamed from: q */
    private final C0300c f1202q;

    /* renamed from: r */
    private final Region f1203r;

    /* renamed from: s */
    private final Region f1204s;

    /* renamed from: t */
    private final float[] f1205t;

    /* renamed from: u */
    private final float[] f1206u;

    /* renamed from: v */
    private boolean f1207v;

    /* renamed from: w */
    private int f1208w;

    /* renamed from: x */
    private int f1209x;

    /* renamed from: y */
    private PorterDuffColorFilter f1210y;

    /* renamed from: z */
    private Mode f1211z;

    /* renamed from: a */
    private static int m1179a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public int getOpacity() {
        return -3;
    }

    public MaterialShapeDrawable() {
        this(null);
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.f1203r.set(bounds);
        m1187b(bounds.width(), bounds.height(), this.f1200o);
        this.f1204s.setPath(this.f1200o, this.f1203r);
        this.f1203r.op(this.f1204s, Op.DIFFERENCE);
        return this.f1203r;
    }

    /* renamed from: a */
    private void m1181a() {
        if (this.f1194i == null || this.f1211z == null) {
            this.f1210y = null;
            return;
        }
        int colorForState = this.f1194i.getColorForState(getState(), 0);
        this.f1210y = new PorterDuffColorFilter(colorForState, this.f1211z);
        if (this.f1207v) {
            this.f1208w = colorForState;
        }
    }

    public void setAlpha(int i) {
        this.f1209x = i;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public final void mo1188a(float f) {
        this.f1188c = f;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1195j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1194i = colorStateList;
        m1181a();
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f1211z = mode;
        m1181a();
        invalidateSelf();
    }

    /* renamed from: a */
    private C0299b m1180a(int i) {
        switch (i) {
            case 1:
                return this.f1186a.f1230b;
            case 2:
                return this.f1186a.f1231c;
            case 3:
                return this.f1186a.f1232d;
            default:
                return this.f1186a.f1229a;
        }
    }

    public void draw(Canvas canvas) {
        this.f1195j.setColorFilter(this.f1210y);
        int alpha = this.f1195j.getAlpha();
        this.f1195j.setAlpha(m1179a(alpha, this.f1209x));
        this.f1195j.setStrokeWidth(this.f1192g);
        this.f1195j.setStyle(this.f1193h);
        if (this.f1189d > 0 && this.f1187b) {
            this.f1195j.setShadowLayer((float) this.f1190e, 0.0f, (float) this.f1189d, this.f1208w);
        }
        if (this.f1186a != null) {
            m1187b(canvas.getWidth(), canvas.getHeight(), this.f1200o);
            canvas.drawPath(this.f1200o, this.f1195j);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f1195j);
        }
        this.f1195j.setAlpha(alpha);
    }

    private MaterialShapeDrawable(C0304d dVar) {
        this.f1195j = new Paint();
        this.f1196k = new Matrix[4];
        this.f1197l = new Matrix[4];
        this.f1198m = new C0300c[4];
        this.f1199n = new Matrix();
        this.f1200o = new Path();
        this.f1201p = new PointF();
        this.f1202q = new C0300c();
        this.f1203r = new Region();
        this.f1204s = new Region();
        this.f1205t = new float[2];
        this.f1206u = new float[2];
        this.f1186a = null;
        this.f1187b = false;
        this.f1207v = false;
        this.f1188c = 1.0f;
        this.f1208w = -16777216;
        this.f1189d = 5;
        this.f1190e = 10;
        this.f1209x = NormalGiftView.ALPHA_255;
        this.f1191f = 1.0f;
        this.f1192g = 0.0f;
        this.f1193h = Style.FILL_AND_STROKE;
        this.f1211z = Mode.SRC_IN;
        this.f1194i = null;
        this.f1186a = null;
        for (int i = 0; i < 4; i++) {
            this.f1196k[i] = new Matrix();
            this.f1197l[i] = new Matrix();
            this.f1198m[i] = new C0300c();
        }
    }

    /* renamed from: b */
    private void m1188b(int i, Path path) {
        int i2 = (i + 1) % 4;
        this.f1205t[0] = this.f1198m[i].f1214c;
        this.f1205t[1] = this.f1198m[i].f1215d;
        this.f1196k[i].mapPoints(this.f1205t);
        this.f1206u[0] = this.f1198m[i2].f1212a;
        this.f1206u[1] = this.f1198m[i2].f1213b;
        this.f1196k[i2].mapPoints(this.f1206u);
        float hypot = (float) Math.hypot((double) (this.f1205t[0] - this.f1206u[0]), (double) (this.f1205t[1] - this.f1206u[1]));
        this.f1202q.mo1195a(0.0f, 0.0f);
        m1180a(i).mo723a(hypot, this.f1188c, this.f1202q);
        this.f1202q.mo1197a(this.f1197l[i], path);
    }

    /* renamed from: a */
    private void m1185a(int i, Path path) {
        this.f1205t[0] = this.f1198m[i].f1212a;
        this.f1205t[1] = this.f1198m[i].f1213b;
        this.f1196k[i].mapPoints(this.f1205t);
        if (i == 0) {
            path.moveTo(this.f1205t[0], this.f1205t[1]);
        } else {
            path.lineTo(this.f1205t[0], this.f1205t[1]);
        }
        this.f1198m[i].mo1197a(this.f1196k[i], path);
    }

    /* renamed from: b */
    private void m1187b(int i, int i2, Path path) {
        m1184a(i, i2, path);
        if (this.f1191f != 1.0f) {
            this.f1199n.reset();
            this.f1199n.setScale(this.f1191f, this.f1191f, (float) (i / 2), (float) (i2 / 2));
            path.transform(this.f1199n);
        }
    }

    /* renamed from: d */
    private float m1190d(int i, int i2, int i3) {
        int i4 = (i + 1) % 4;
        m1183a(i, i2, i3, this.f1201p);
        float f = this.f1201p.x;
        float f2 = this.f1201p.y;
        m1183a(i4, i2, i3, this.f1201p);
        return (float) Math.atan2((double) (this.f1201p.y - f2), (double) (this.f1201p.x - f));
    }

    /* renamed from: b */
    private void m1186b(int i, int i2, int i3) {
        this.f1205t[0] = this.f1198m[i].f1214c;
        this.f1205t[1] = this.f1198m[i].f1215d;
        this.f1196k[i].mapPoints(this.f1205t);
        float d = m1190d(i, i2, i3);
        this.f1197l[i].reset();
        this.f1197l[i].setTranslate(this.f1205t[0], this.f1205t[1]);
        this.f1197l[i].preRotate((float) Math.toDegrees((double) d));
    }

    /* renamed from: c */
    private float m1189c(int i, int i2, int i3) {
        m1183a(((i - 1) + 4) % 4, i2, i3, this.f1201p);
        float f = this.f1201p.x;
        float f2 = this.f1201p.y;
        m1183a((i + 1) % 4, i2, i3, this.f1201p);
        float f3 = this.f1201p.x;
        float f4 = this.f1201p.y;
        m1183a(i, i2, i3, this.f1201p);
        float f5 = this.f1201p.x;
        float f6 = this.f1201p.y;
        float f7 = f4 - f6;
        float atan2 = ((float) Math.atan2((double) (f2 - f6), (double) (f - f5))) - ((float) Math.atan2((double) f7, (double) (f3 - f5)));
        if (atan2 >= 0.0f) {
            return atan2;
        }
        double d = (double) atan2;
        Double.isNaN(d);
        return (float) (d + 6.283185307179586d);
    }

    /* renamed from: a */
    private void m1182a(int i, int i2, int i3) {
        m1183a(i, i2, i3, this.f1201p);
        m1189c(i, i2, i3);
        float d = m1190d(((i - 1) + 4) % 4, i2, i3) + 1.5707964f;
        this.f1196k[i].reset();
        this.f1196k[i].setTranslate(this.f1201p.x, this.f1201p.y);
        this.f1196k[i].preRotate((float) Math.toDegrees((double) d));
    }

    /* renamed from: a */
    private void m1184a(int i, int i2, Path path) {
        path.rewind();
        if (this.f1186a != null) {
            for (int i3 = 0; i3 < 4; i3++) {
                m1182a(i3, i, i2);
                m1186b(i3, i, i2);
            }
            for (int i4 = 0; i4 < 4; i4++) {
                m1185a(i4, path);
                m1188b(i4, path);
            }
            path.close();
        }
    }

    /* renamed from: a */
    private static void m1183a(int i, int i2, int i3, PointF pointF) {
        switch (i) {
            case 1:
                pointF.set((float) i2, 0.0f);
                return;
            case 2:
                pointF.set((float) i2, (float) i3);
                return;
            case 3:
                pointF.set(0.0f, (float) i3);
                return;
            default:
                pointF.set(0.0f, 0.0f);
                return;
        }
    }
}
