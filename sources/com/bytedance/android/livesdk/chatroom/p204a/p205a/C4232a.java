package com.bytedance.android.livesdk.chatroom.p204a.p205a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.p280ss.ugc.live.barrage.p1824a.C46195b;
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

/* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a */
public final class C4232a extends C46195b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f12368a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C4232a.class), "matrix", "getMatrix()Landroid/graphics/Matrix;"))};

    /* renamed from: f */
    public static final C4233a f12369f = new C4233a(null);

    /* renamed from: b */
    public int f12370b = 204;

    /* renamed from: c */
    public float f12371c = 1.0f;

    /* renamed from: d */
    public float f12372d;

    /* renamed from: e */
    public double f12373e;

    /* renamed from: m */
    private final C7541d f12374m = C7546e.m23569a(C4234b.f12375a);

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$a */
    public static final class C4233a {
        private C4233a() {
        }

        public /* synthetic */ C4233a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$b */
    static final class C4234b extends Lambda implements C7561a<Matrix> {

        /* renamed from: a */
        public static final C4234b f12375a = new C4234b();

        C4234b() {
            super(0);
        }

        /* renamed from: a */
        private static Matrix m14374a() {
            return new Matrix();
        }

        public final /* synthetic */ Object invoke() {
            return m14374a();
        }
    }

    /* renamed from: f */
    private final Matrix m14372f() {
        return (Matrix) this.f12374m.getValue();
    }

    /* renamed from: a */
    public final void mo11795a(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        mo114135a().setAlpha(this.f12370b);
        RectF rectF = this.f118761k;
        float width = rectF.width();
        float height = rectF.height();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        m14372f().setRotate(this.f12372d, f, f2);
        m14372f().postScale(this.f12371c, this.f12371c);
        m14372f().postTranslate((rectF.left + ((width * 0.5f) * (1.0f - this.f12371c))) - f, (rectF.top + ((height * 0.5f) * (1.0f - this.f12371c))) - f2);
        super.mo114136a(canvas, m14372f());
    }

    public C4232a(Bitmap bitmap, double d) {
        C7573i.m23587b(bitmap, "bitmap");
        super(bitmap);
        this.f12373e = d;
    }
}
