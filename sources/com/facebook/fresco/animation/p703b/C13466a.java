package com.facebook.fresco.animation.p703b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p702a.C13462c.C13464a;
import com.facebook.fresco.animation.p702a.C13465d;
import com.facebook.fresco.animation.p703b.p705b.C13471a;
import com.facebook.fresco.animation.p703b.p705b.C13472b;
import com.facebook.imagepipeline.p715b.C13551f;

/* renamed from: com.facebook.fresco.animation.b.a */
public class C13466a implements C13460a, C13464a {

    /* renamed from: c */
    private static final Class<?> f35706c = C13466a.class;

    /* renamed from: a */
    public C13471a f35707a;

    /* renamed from: b */
    public Config f35708b = Config.ARGB_8888;

    /* renamed from: d */
    private final C13551f f35709d;

    /* renamed from: e */
    private final C13470b f35710e;

    /* renamed from: f */
    private final C13465d f35711f;

    /* renamed from: g */
    private final C13476c f35712g;

    /* renamed from: h */
    private final C13472b f35713h;

    /* renamed from: i */
    private final Paint f35714i;

    /* renamed from: j */
    private Rect f35715j;

    /* renamed from: k */
    private int f35716k;

    /* renamed from: l */
    private int f35717l;

    /* renamed from: a */
    public final int mo32986a() {
        return this.f35716k;
    }

    /* renamed from: b */
    public final int mo32991b() {
        return this.f35717l;
    }

    /* renamed from: f */
    public final void mo33000f() {
        mo32993c();
    }

    /* renamed from: d */
    public final int mo32995d() {
        return this.f35711f.mo32995d();
    }

    /* renamed from: e */
    public final int mo32996e() {
        return this.f35711f.mo32996e();
    }

    /* renamed from: c */
    public final void mo32993c() {
        this.f35710e.mo33003a();
    }

    /* renamed from: g */
    private void m39587g() {
        int i;
        this.f35716k = this.f35712g.mo33010a();
        int i2 = -1;
        if (this.f35716k == -1) {
            if (this.f35715j == null) {
                i = -1;
            } else {
                i = this.f35715j.width();
            }
            this.f35716k = i;
        }
        this.f35717l = this.f35712g.mo33013b();
        if (this.f35717l == -1) {
            if (this.f35715j != null) {
                i2 = this.f35715j.height();
            }
            this.f35717l = i2;
        }
    }

    /* renamed from: a */
    public final void mo32987a(int i) {
        this.f35714i.setAlpha(i);
    }

    /* renamed from: b */
    public final boolean mo32992b(int i) {
        return this.f35710e.mo33007c(i);
    }

    /* renamed from: c */
    public final int mo32994c(int i) {
        return this.f35711f.mo32994c(i);
    }

    /* renamed from: a */
    public final void mo32988a(ColorFilter colorFilter) {
        this.f35714i.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public final void mo32989a(Rect rect) {
        this.f35715j = rect;
        this.f35712g.mo33011a(rect);
        m39587g();
    }

    /* renamed from: a */
    private boolean m39584a(int i, C13326a<Bitmap> aVar) {
        if (!C13326a.m38999a(aVar)) {
            return false;
        }
        boolean a = this.f35712g.mo33012a(i, (Bitmap) aVar.mo32609a());
        if (!a) {
            C13326a.m39001c(aVar);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m39586a(Canvas canvas, int i, int i2) {
        C13326a aVar;
        boolean z;
        while (true) {
            int i3 = 3;
            C13326a aVar2 = null;
            boolean z2 = true;
            switch (i2) {
                case 0:
                    aVar = this.f35710e.mo33001a(i);
                    z = m39585a(i, aVar, canvas, 0);
                    i3 = 1;
                    break;
                case 1:
                    aVar = this.f35710e.mo33002a(i, this.f35716k, this.f35717l);
                    if (!m39584a(i, aVar) || !m39585a(i, aVar, canvas, 1)) {
                        z2 = false;
                    }
                    z = z2;
                    i3 = 2;
                    break;
                case 2:
                    aVar = this.f35709d.mo33098b(this.f35716k, this.f35717l, this.f35708b);
                    if (m39584a(i, aVar) && m39585a(i, aVar, canvas, 2)) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 3:
                    try {
                        aVar = this.f35710e.mo33005b(i);
                        try {
                            z = m39585a(i, aVar, canvas, 3);
                            i3 = -1;
                            break;
                        } catch (Throwable th) {
                            th = th;
                            aVar2 = aVar;
                            C13326a.m39001c(aVar2);
                            throw th;
                        }
                    } catch (RuntimeException e) {
                        C13286a.m38839a(f35706c, "Failed to create frame bitmap", (Throwable) e);
                        C13326a.m39001c(null);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        C13326a.m39001c(aVar2);
                        throw th;
                    }
                default:
                    C13326a.m39001c(null);
                    return false;
            }
            C13326a.m39001c(aVar);
            if (z || i3 == -1) {
                return z;
            }
            i2 = i3;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo32990a(Drawable drawable, Canvas canvas, int i) {
        boolean a = m39586a(canvas, i, 0);
        if (!(this.f35707a == null || this.f35713h == null)) {
            this.f35707a.mo29881a(this.f35713h, this.f35710e, this, i);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m39585a(int i, C13326a<Bitmap> aVar, Canvas canvas, int i2) {
        if (!C13326a.m38999a(aVar)) {
            return false;
        }
        if (this.f35715j == null) {
            canvas.drawBitmap((Bitmap) aVar.mo32609a(), 0.0f, 0.0f, this.f35714i);
        } else {
            canvas.drawBitmap((Bitmap) aVar.mo32609a(), null, this.f35715j, this.f35714i);
        }
        if (i2 != 3) {
            this.f35710e.mo33004a(i, aVar, i2);
        }
        return true;
    }

    public C13466a(C13551f fVar, C13470b bVar, C13465d dVar, C13476c cVar, C13471a aVar, C13472b bVar2) {
        this.f35709d = fVar;
        this.f35710e = bVar;
        this.f35711f = dVar;
        this.f35712g = cVar;
        this.f35707a = aVar;
        this.f35713h = bVar2;
        this.f35714i = new Paint(6);
        m39587g();
    }
}
