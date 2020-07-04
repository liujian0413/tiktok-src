package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.C1841q;
import com.airbnb.lottie.model.C1802b;
import com.airbnb.lottie.model.C1803c;
import com.airbnb.lottie.model.C1816d;
import com.airbnb.lottie.model.content.C1814j;
import com.airbnb.lottie.model.p058a.C1798k;
import com.airbnb.lottie.p051a.p052a.C1669c;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1701n;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1755c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.model.layer.g */
public final class C1830g extends C1821a {

    /* renamed from: g */
    private final char[] f6622g = new char[1];

    /* renamed from: h */
    private final RectF f6623h = new RectF();

    /* renamed from: i */
    private final Matrix f6624i = new Matrix();

    /* renamed from: j */
    private final Paint f6625j = new Paint(1) {
        {
            setStyle(Style.FILL);
        }
    };

    /* renamed from: k */
    private final Paint f6626k = new Paint(1) {
        {
            setStyle(Style.STROKE);
        }
    };

    /* renamed from: l */
    private final Map<C1816d, List<C1669c>> f6627l = new HashMap();

    /* renamed from: m */
    private final C1701n f6628m;

    /* renamed from: n */
    private final C1767h f6629n;

    /* renamed from: o */
    private final C1757f f6630o;

    /* renamed from: p */
    private C1687a<Integer, Integer> f6631p;

    /* renamed from: q */
    private C1687a<Integer, Integer> f6632q;

    /* renamed from: r */
    private C1687a<Float, Float> f6633r;

    /* renamed from: s */
    private C1687a<Float, Float> f6634s;

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        super.mo7135a(t, cVar);
        if (t == C1782k.f6400a && this.f6631p != null) {
            this.f6631p.mo7147a(cVar);
        } else if (t == C1782k.f6401b && this.f6632q != null) {
            this.f6632q.mo7147a(cVar);
        } else if (t != C1782k.f6410k || this.f6633r == null) {
            if (t == C1782k.f6411l && this.f6634s != null) {
                this.f6634s.mo7147a(cVar);
            }
        } else {
            this.f6633r.mo7147a(cVar);
        }
    }

    /* renamed from: a */
    private List<C1669c> m8581a(C1816d dVar) {
        if (this.f6627l.containsKey(dVar)) {
            return (List) this.f6627l.get(dVar);
        }
        List<C1814j> list = dVar.f6547a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1669c(this.f6629n, this, (C1814j) list.get(i)));
        }
        this.f6627l.put(dVar, arrayList);
        return arrayList;
    }

    C1830g(C1767h hVar, Layer layer) {
        super(hVar, layer);
        this.f6629n = hVar;
        this.f6630o = layer.f6560b;
        this.f6628m = layer.f6574p.mo7288a();
        this.f6628m.mo7146a((C1688a) this);
        mo7326a((C1687a<?, ?>) this.f6628m);
        C1798k kVar = layer.f6575q;
        if (!(kVar == null || kVar.f6442a == null)) {
            this.f6631p = kVar.f6442a.mo7288a();
            this.f6631p.mo7146a((C1688a) this);
            mo7326a(this.f6631p);
        }
        if (!(kVar == null || kVar.f6443b == null)) {
            this.f6632q = kVar.f6443b.mo7288a();
            this.f6632q.mo7146a((C1688a) this);
            mo7326a(this.f6632q);
        }
        if (!(kVar == null || kVar.f6444c == null)) {
            this.f6633r = kVar.f6444c.mo7288a();
            this.f6633r.mo7146a((C1688a) this);
            mo7326a(this.f6633r);
        }
        if (kVar != null && kVar.f6445d != null) {
            this.f6634s = kVar.f6445d.mo7288a();
            this.f6634s.mo7146a((C1688a) this);
            mo7326a(this.f6634s);
        }
    }

    /* renamed from: a */
    private static void m8583a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private void m8582a(char c, C1802b bVar, Canvas canvas) {
        this.f6622g[0] = c;
        if (bVar.f6464k) {
            m8587a(this.f6622g, this.f6625j, canvas);
            m8587a(this.f6622g, this.f6626k, canvas);
            return;
        }
        m8587a(this.f6622g, this.f6626k, canvas);
        m8587a(this.f6622g, this.f6625j, canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7328b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f6629n.mo7261n()) {
            canvas.setMatrix(matrix);
        }
        C1802b bVar = (C1802b) this.f6628m.mo7151e();
        C1803c cVar = (C1803c) this.f6630o.f6334c.get(bVar.f6455b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        if (this.f6631p != null) {
            this.f6625j.setColor(((Integer) this.f6631p.mo7151e()).intValue());
        } else {
            this.f6625j.setColor(bVar.f6461h);
        }
        if (this.f6632q != null) {
            this.f6626k.setColor(((Integer) this.f6632q.mo7151e()).intValue());
        } else {
            this.f6626k.setColor(bVar.f6462i);
        }
        int intValue = (((Integer) this.f6585f.f6253a.mo7151e()).intValue() * NormalGiftView.ALPHA_255) / 100;
        this.f6625j.setAlpha(intValue);
        this.f6626k.setAlpha(intValue);
        if (this.f6633r != null) {
            this.f6626k.setStrokeWidth(((Float) this.f6633r.mo7151e()).floatValue());
        } else {
            this.f6626k.setStrokeWidth(((float) bVar.f6463j) * C1751f.m8367a() * C1751f.m8368a(matrix));
        }
        if (this.f6629n.mo7261n()) {
            m8584a(bVar, matrix, cVar, canvas);
        } else {
            m8585a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private static void m8587a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: a */
    private void m8584a(C1802b bVar, Matrix matrix, C1803c cVar, Canvas canvas) {
        float f = ((float) bVar.f6456c) / 100.0f;
        float a = C1751f.m8368a(matrix);
        String str = bVar.f6454a;
        for (int i = 0; i < str.length(); i++) {
            C1816d dVar = (C1816d) this.f6630o.f6335d.mo3433a(C1816d.m8518a(str.charAt(i), cVar.f6465a, cVar.f6467c));
            if (dVar != null) {
                m8586a(dVar, matrix, f, bVar, canvas);
                float a2 = ((float) dVar.f6549c) * f * C1751f.m8367a() * a;
                float f2 = ((float) bVar.f6458e) / 10.0f;
                if (this.f6634s != null) {
                    f2 += ((Float) this.f6634s.mo7151e()).floatValue();
                }
                canvas.translate(a2 + (f2 * a), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m8585a(C1802b bVar, C1803c cVar, Matrix matrix, Canvas canvas) {
        float a = C1751f.m8368a(matrix);
        Typeface a2 = this.f6629n.mo7220a(cVar.f6465a, cVar.f6467c);
        if (a2 != null) {
            String str = bVar.f6454a;
            C1841q qVar = this.f6629n.f6361f;
            if (qVar != null) {
                str = qVar.mo7340a(str);
            }
            this.f6625j.setTypeface(a2);
            Paint paint = this.f6625j;
            double d = bVar.f6456c;
            double a3 = (double) C1751f.m8367a();
            Double.isNaN(a3);
            paint.setTextSize((float) (d * a3));
            this.f6626k.setTypeface(this.f6625j.getTypeface());
            this.f6626k.setTextSize(this.f6625j.getTextSize());
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                m8582a(charAt, bVar, canvas);
                this.f6622g[0] = charAt;
                float measureText = this.f6625j.measureText(this.f6622g, 0, 1);
                float f = ((float) bVar.f6458e) / 10.0f;
                if (this.f6634s != null) {
                    f += ((Float) this.f6634s.mo7151e()).floatValue();
                }
                canvas.translate(measureText + (f * a), 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m8586a(C1816d dVar, Matrix matrix, float f, C1802b bVar, Canvas canvas) {
        List a = m8581a(dVar);
        for (int i = 0; i < a.size(); i++) {
            Path e = ((C1669c) a.get(i)).mo7140e();
            e.computeBounds(this.f6623h, false);
            this.f6624i.set(matrix);
            this.f6624i.preTranslate(0.0f, ((float) (-bVar.f6460g)) * C1751f.m8367a());
            this.f6624i.preScale(f, f);
            e.transform(this.f6624i);
            if (bVar.f6464k) {
                m8583a(e, this.f6625j, canvas);
                m8583a(e, this.f6626k, canvas);
            } else {
                m8583a(e, this.f6626k, canvas);
                m8583a(e, this.f6625j, canvas);
            }
        }
    }
}
