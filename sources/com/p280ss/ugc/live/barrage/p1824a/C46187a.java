package com.p280ss.ugc.live.barrage.p1824a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.MotionEvent;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.ugc.live.barrage.a.a */
public abstract class C46187a {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f118756g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C46187a.class), "paint", "getPaint()Landroid/graphics/Paint;"))};

    /* renamed from: a */
    private final C7541d f118757a = C7546e.m23569a(C46194c.f118767a);

    /* renamed from: h */
    public C46193b f118758h;

    /* renamed from: i */
    public boolean f118759i;

    /* renamed from: j */
    public boolean f118760j;

    /* renamed from: k */
    public final RectF f118761k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: l */
    public volatile C46188a f118762l;

    /* renamed from: com.ss.ugc.live.barrage.a.a$a */
    public static abstract class C46188a {

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$a */
        public static final class C46189a extends C46188a {

            /* renamed from: a */
            public static final C46189a f118763a = new C46189a();

            private C46189a() {
                super(null);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$b */
        public static final class C46190b extends C46188a {

            /* renamed from: a */
            public static final C46190b f118764a = new C46190b();

            private C46190b() {
                super(null);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$c */
        public static final class C46191c extends C46188a {

            /* renamed from: a */
            public static final C46191c f118765a = new C46191c();

            private C46191c() {
                super(null);
            }
        }

        /* renamed from: com.ss.ugc.live.barrage.a.a$a$d */
        public static final class C46192d extends C46188a {

            /* renamed from: a */
            public static final C46192d f118766a = new C46192d();

            private C46192d() {
                super(null);
            }
        }

        private C46188a() {
        }

        public /* synthetic */ C46188a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.a.a$b */
    public interface C46193b {
        /* renamed from: a */
        void mo11809a(C46187a aVar);
    }

    /* renamed from: com.ss.ugc.live.barrage.a.a$c */
    static final class C46194c extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        public static final C46194c f118767a = new C46194c();

        C46194c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m145075a();
        }

        /* renamed from: a */
        private static Paint m145075a() {
            Paint paint = new Paint();
            paint.setStyle(Style.FILL);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: a */
    public final Paint mo114135a() {
        return (Paint) this.f118757a.getValue();
    }

    /* renamed from: b */
    public abstract Bitmap mo114139b();

    /* renamed from: c */
    public void mo114140c() {
    }

    /* renamed from: d */
    public void mo114141d() {
    }

    /* renamed from: e */
    public final void mo114142e() {
        this.f118759i = true;
    }

    /* renamed from: f */
    private void m145064f() {
        C46193b bVar = this.f118758h;
        if (bVar != null) {
            bVar.mo11809a(this);
        }
    }

    /* renamed from: a */
    public final void mo114137a(C46188a aVar) {
        this.f118762l = aVar;
        m145063b(aVar);
    }

    /* renamed from: a */
    public final boolean mo114138a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                return true;
            case 1:
                m145064f();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private final void m145063b(C46188a aVar) {
        if (!C7573i.m23585a((Object) aVar, (Object) C46190b.f118764a)) {
            if (C7573i.m23585a((Object) aVar, (Object) C46191c.f118765a)) {
                mo114140c();
            } else if (!C7573i.m23585a((Object) aVar, (Object) C46192d.f118766a) && C7573i.m23585a((Object) aVar, (Object) C46189a.f118763a)) {
                mo114141d();
            }
        }
    }

    /* renamed from: a */
    public void mo11795a(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (!(!C7573i.m23585a((Object) this.f118762l, (Object) C46192d.f118766a))) {
            Bitmap b = mo114139b();
            if (b != null && !b.isRecycled()) {
                canvas.drawBitmap(mo114139b(), this.f118761k.left, this.f118761k.top, mo114135a());
            }
        }
    }

    /* renamed from: a */
    public final void mo114136a(Canvas canvas, Matrix matrix) {
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(matrix, "matrix");
        if (!(!C7573i.m23585a((Object) this.f118762l, (Object) C46192d.f118766a))) {
            Bitmap b = mo114139b();
            if (b != null && !b.isRecycled()) {
                canvas.drawBitmap(mo114139b(), matrix, mo114135a());
            }
        }
    }
}
