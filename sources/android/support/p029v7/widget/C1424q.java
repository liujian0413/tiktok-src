package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: android.support.v7.widget.q */
class C1424q implements C1427s {

    /* renamed from: a */
    final RectF f5549a = new RectF();

    /* renamed from: g */
    public final void mo6591g(C1426r rVar) {
    }

    C1424q() {
    }

    /* renamed from: a */
    public void mo6579a() {
        C1351am.f5264a = new C1352a() {
            /* renamed from: a */
            public final void mo6353a(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    C1424q.this.f5549a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    canvas.drawArc(C1424q.this.f5549a, 180.0f, 90.0f, true, paint);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    Paint paint2 = paint;
                    canvas.drawArc(C1424q.this.f5549a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C1424q.this.f5549a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C1424q.this.f5549a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        };
    }

    /* renamed from: j */
    private static C1351am m7085j(C1426r rVar) {
        return (C1351am) rVar.mo5310c();
    }

    /* renamed from: a */
    public final float mo6580a(C1426r rVar) {
        return m7085j(rVar).f5267c;
    }

    /* renamed from: d */
    public final float mo6588d(C1426r rVar) {
        return m7085j(rVar).f5266b;
    }

    /* renamed from: e */
    public final float mo6589e(C1426r rVar) {
        return m7085j(rVar).f5268d;
    }

    /* renamed from: i */
    public final ColorStateList mo6593i(C1426r rVar) {
        return m7085j(rVar).f5269e;
    }

    /* renamed from: b */
    public final float mo6584b(C1426r rVar) {
        return m7085j(rVar).mo6337a();
    }

    /* renamed from: c */
    public final float mo6586c(C1426r rVar) {
        return m7085j(rVar).mo6342b();
    }

    /* renamed from: h */
    public final void mo6592h(C1426r rVar) {
        m7085j(rVar).mo6341a(rVar.mo5309b());
        mo6590f(rVar);
    }

    /* renamed from: f */
    public final void mo6590f(C1426r rVar) {
        Rect rect = new Rect();
        m7085j(rVar).mo6340a(rect);
        rVar.mo5305a((int) Math.ceil((double) mo6584b(rVar)), (int) Math.ceil((double) mo6586c(rVar)));
        rVar.mo5306a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: c */
    public final void mo6587c(C1426r rVar, float f) {
        m7085j(rVar).mo6343b(f);
    }

    /* renamed from: b */
    public final void mo6585b(C1426r rVar, float f) {
        m7085j(rVar).mo6344c(f);
        mo6590f(rVar);
    }

    /* renamed from: a */
    public final void mo6581a(C1426r rVar, float f) {
        m7085j(rVar).mo6338a(f);
        mo6590f(rVar);
    }

    /* renamed from: a */
    public final void mo6583a(C1426r rVar, ColorStateList colorStateList) {
        m7085j(rVar).mo6339a(colorStateList);
    }

    /* renamed from: a */
    private static C1351am m7084a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1351am amVar = new C1351am(context.getResources(), colorStateList, f, f2, f3);
        return amVar;
    }

    /* renamed from: a */
    public final void mo6582a(C1426r rVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1351am a = m7084a(context, colorStateList, f, f2, f3);
        a.mo6341a(rVar.mo5309b());
        rVar.mo5307a(a);
        mo6590f(rVar);
    }
}
