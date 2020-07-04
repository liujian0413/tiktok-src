package com.airbnb.lottie.p051a.p052a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.PolystarShape.Type;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1755c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.m */
public final class C1680m implements C1676j, C1679l, C1688a {

    /* renamed from: a */
    private final Path f6184a = new Path();

    /* renamed from: b */
    private final String f6185b;

    /* renamed from: c */
    private final C1767h f6186c;

    /* renamed from: d */
    private final Type f6187d;

    /* renamed from: e */
    private final C1687a<?, Float> f6188e;

    /* renamed from: f */
    private final C1687a<?, PointF> f6189f;

    /* renamed from: g */
    private final C1687a<?, Float> f6190g;

    /* renamed from: h */
    private final C1687a<?, Float> f6191h;

    /* renamed from: i */
    private final C1687a<?, Float> f6192i;

    /* renamed from: j */
    private final C1687a<?, Float> f6193j;

    /* renamed from: k */
    private final C1687a<?, Float> f6194k;

    /* renamed from: l */
    private C1686r f6195l;

    /* renamed from: m */
    private boolean f6196m;

    /* renamed from: a */
    public final void mo7131a() {
        m8156c();
    }

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6185b;
    }

    /* renamed from: c */
    private void m8156c() {
        this.f6196m = false;
        this.f6186c.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo7140e() {
        if (this.f6196m) {
            return this.f6184a;
        }
        this.f6184a.reset();
        switch (this.f6187d) {
            case Star:
                m8157d();
                break;
            case Polygon:
                m8158f();
                break;
        }
        this.f6184a.close();
        C1751f.m8372a(this.f6184a, this.f6195l);
        this.f6196m = true;
        return this.f6184a;
    }

    /* renamed from: f */
    private void m8158f() {
        double d;
        double d2;
        double d3;
        int i;
        double d4;
        int floor = (int) Math.floor((double) ((Float) this.f6188e.mo7151e()).floatValue());
        if (this.f6190g == null) {
            d = 0.0d;
        } else {
            d = (double) ((Float) this.f6190g.mo7151e()).floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = (double) floor;
        Double.isNaN(d5);
        float f = (float) (6.283185307179586d / d5);
        float floatValue = ((Float) this.f6194k.mo7151e()).floatValue() / 100.0f;
        float floatValue2 = ((Float) this.f6192i.mo7151e()).floatValue();
        double d6 = (double) floatValue2;
        double cos = Math.cos(radians);
        Double.isNaN(d6);
        float f2 = (float) (cos * d6);
        double sin = Math.sin(radians);
        Double.isNaN(d6);
        float f3 = (float) (sin * d6);
        this.f6184a.moveTo(f2, f3);
        double d7 = (double) f;
        Double.isNaN(d7);
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i2 = 0;
        while (((double) i2) < ceil) {
            double cos2 = Math.cos(d8);
            Double.isNaN(d6);
            float f4 = (float) (cos2 * d6);
            double sin2 = Math.sin(d8);
            Double.isNaN(d6);
            double d9 = ceil;
            float f5 = (float) (d6 * sin2);
            if (floatValue != 0.0f) {
                d4 = d6;
                i = i2;
                d3 = d8;
                double atan2 = (double) ((float) (Math.atan2((double) f3, (double) f2) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d2 = d7;
                double atan22 = (double) ((float) (Math.atan2((double) f5, (double) f4) - 1.5707963267948966d));
                float f6 = floatValue2 * floatValue * 0.25f;
                float f7 = cos3 * f6;
                float sin3 = ((float) Math.sin(atan2)) * f6;
                float cos4 = ((float) Math.cos(atan22)) * f6;
                float sin4 = f6 * ((float) Math.sin(atan22));
                this.f6184a.cubicTo(f2 - f7, f3 - sin3, f4 + cos4, f5 + sin4, f4, f5);
            } else {
                i = i2;
                d3 = d8;
                d4 = d6;
                d2 = d7;
                this.f6184a.lineTo(f4, f5);
            }
            Double.isNaN(d2);
            d8 = d3 + d2;
            i2 = i + 1;
            f3 = f5;
            f2 = f4;
            ceil = d9;
            d6 = d4;
            d7 = d2;
        }
        PointF pointF = (PointF) this.f6189f.mo7151e();
        this.f6184a.offset(pointF.x, pointF.y);
        this.f6184a.close();
    }

    /* renamed from: d */
    private void m8157d() {
        double d;
        float f;
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        float f6;
        double d3;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float floatValue = ((Float) this.f6188e.mo7151e()).floatValue();
        if (this.f6190g == null) {
            d = 0.0d;
        } else {
            d = (double) ((Float) this.f6190g.mo7151e()).floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d4 = (double) floatValue;
        Double.isNaN(d4);
        float f18 = (float) (6.283185307179586d / d4);
        float f19 = f18 / 2.0f;
        float f20 = floatValue - ((float) ((int) floatValue));
        if (f20 != 0.0f) {
            double d5 = (double) ((1.0f - f20) * f19);
            Double.isNaN(d5);
            radians += d5;
        }
        float floatValue2 = ((Float) this.f6192i.mo7151e()).floatValue();
        float floatValue3 = ((Float) this.f6191h.mo7151e()).floatValue();
        if (this.f6193j != null) {
            f = ((Float) this.f6193j.mo7151e()).floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        if (this.f6194k != null) {
            f2 = ((Float) this.f6194k.mo7151e()).floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (f20 != 0.0f) {
            f4 = ((floatValue2 - floatValue3) * f20) + floatValue3;
            float f21 = floatValue2;
            double d6 = (double) f4;
            double cos = Math.cos(radians);
            Double.isNaN(d6);
            d2 = d4;
            f6 = (float) (d6 * cos);
            double sin = Math.sin(radians);
            Double.isNaN(d6);
            f5 = (float) (d6 * sin);
            this.f6184a.moveTo(f6, f5);
            double d7 = (double) ((f18 * f20) / 2.0f);
            Double.isNaN(d7);
            d3 = radians + d7;
            f3 = f21;
        } else {
            d2 = d4;
            float f22 = floatValue2;
            double d8 = (double) f22;
            double cos2 = Math.cos(radians);
            Double.isNaN(d8);
            float f23 = (float) (cos2 * d8);
            double sin2 = Math.sin(radians);
            Double.isNaN(d8);
            float f24 = (float) (d8 * sin2);
            this.f6184a.moveTo(f23, f24);
            f3 = f22;
            float f25 = f24;
            double d9 = (double) f19;
            Double.isNaN(d9);
            d3 = radians + d9;
            f6 = f23;
            f5 = f25;
            f4 = 0.0f;
        }
        double ceil = Math.ceil(d2) * 2.0d;
        int i = 0;
        double d10 = d3;
        float f26 = f6;
        float f27 = f5;
        boolean z = false;
        while (true) {
            double d11 = (double) i;
            if (d11 < ceil) {
                if (z) {
                    f7 = f3;
                } else {
                    f7 = floatValue3;
                }
                if (f4 == 0.0f || d11 != ceil - 2.0d) {
                    f8 = f19;
                } else {
                    f8 = (f18 * f20) / 2.0f;
                }
                if (f4 == 0.0f || d11 != ceil - 1.0d) {
                    f9 = f18;
                } else {
                    f9 = f18;
                    f7 = f4;
                }
                double d12 = (double) f7;
                double cos3 = Math.cos(d10);
                Double.isNaN(d12);
                float f28 = f4;
                float f29 = f8;
                float f30 = (float) (d12 * cos3);
                double sin3 = Math.sin(d10);
                Double.isNaN(d12);
                float f31 = (float) (d12 * sin3);
                if (f == 0.0f && f2 == 0.0f) {
                    this.f6184a.lineTo(f30, f31);
                    f12 = floatValue3;
                    f11 = f;
                    f10 = f2;
                    f13 = f29;
                } else {
                    double d13 = d11;
                    float f32 = f27;
                    f12 = floatValue3;
                    f11 = f;
                    float f33 = f26;
                    double atan2 = (double) ((float) (Math.atan2((double) f32, (double) f33) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    f10 = f2;
                    float f34 = f33;
                    double atan22 = (double) ((float) (Math.atan2((double) f31, (double) f30) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    if (z) {
                        f14 = f11;
                    } else {
                        f14 = f10;
                    }
                    if (z) {
                        f15 = f10;
                    } else {
                        f15 = f11;
                    }
                    if (z) {
                        f16 = f12;
                    } else {
                        f16 = f3;
                    }
                    if (z) {
                        f17 = f3;
                    } else {
                        f17 = f12;
                    }
                    float f35 = f16 * f14 * 0.47829f;
                    float f36 = cos4 * f35;
                    float f37 = f35 * sin4;
                    float f38 = f17 * f15 * 0.47829f;
                    float f39 = cos5 * f38;
                    float f40 = f38 * sin5;
                    if (f20 != 0.0f) {
                        if (i == 0) {
                            f36 *= f20;
                            f37 *= f20;
                        } else if (d13 == ceil - 1.0d) {
                            f39 *= f20;
                            f40 *= f20;
                        }
                    }
                    this.f6184a.cubicTo(f34 - f36, f32 - f37, f30 + f39, f31 + f40, f30, f31);
                    f13 = f29;
                }
                double d14 = (double) f13;
                Double.isNaN(d14);
                d10 += d14;
                z = !z;
                i++;
                f27 = f31;
                f26 = f30;
                f18 = f9;
                f4 = f28;
                floatValue3 = f12;
                f = f11;
                f2 = f10;
            } else {
                PointF pointF = (PointF) this.f6189f.mo7151e();
                this.f6184a.offset(pointF.x, pointF.y);
                this.f6184a.close();
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1668b bVar = (C1668b) list.get(i);
            if (bVar instanceof C1686r) {
                C1686r rVar = (C1686r) bVar;
                if (rVar.f6226a == ShapeTrimPath.Type.Simultaneously) {
                    this.f6195l = rVar;
                    this.f6195l.mo7142a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        if (t == C1782k.f6414o) {
            this.f6188e.mo7147a(cVar);
        } else if (t == C1782k.f6415p) {
            this.f6190g.mo7147a(cVar);
        } else if (t == C1782k.f6407h) {
            this.f6189f.mo7147a(cVar);
        } else if (t == C1782k.f6416q && this.f6191h != null) {
            this.f6191h.mo7147a(cVar);
        } else if (t == C1782k.f6417r) {
            this.f6192i.mo7147a(cVar);
        } else if (t != C1782k.f6418s || this.f6193j == null) {
            if (t == C1782k.f6419t) {
                this.f6194k.mo7147a(cVar);
            }
        } else {
            this.f6193j.mo7147a(cVar);
        }
    }

    public C1680m(C1767h hVar, C1821a aVar, PolystarShape polystarShape) {
        this.f6186c = hVar;
        this.f6185b = polystarShape.f6474a;
        this.f6187d = polystarShape.f6475b;
        this.f6188e = polystarShape.f6476c.mo7288a();
        this.f6189f = polystarShape.f6477d.mo7288a();
        this.f6190g = polystarShape.f6478e.mo7288a();
        this.f6192i = polystarShape.f6480g.mo7288a();
        this.f6194k = polystarShape.f6482i.mo7288a();
        if (this.f6187d == Type.Star) {
            this.f6191h = polystarShape.f6479f.mo7288a();
            this.f6193j = polystarShape.f6481h.mo7288a();
        } else {
            this.f6191h = null;
            this.f6193j = null;
        }
        aVar.mo7326a(this.f6188e);
        aVar.mo7326a(this.f6189f);
        aVar.mo7326a(this.f6190g);
        aVar.mo7326a(this.f6192i);
        aVar.mo7326a(this.f6194k);
        if (this.f6187d == Type.Star) {
            aVar.mo7326a(this.f6191h);
            aVar.mo7326a(this.f6193j);
        }
        this.f6188e.mo7146a((C1688a) this);
        this.f6189f.mo7146a((C1688a) this);
        this.f6190g.mo7146a((C1688a) this);
        this.f6192i.mo7146a((C1688a) this);
        this.f6194k.mo7146a((C1688a) this);
        if (this.f6187d == Type.Star) {
            this.f6191h.mo7146a((C1688a) this);
            this.f6193j.mo7146a((C1688a) this);
        }
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        C1750e.m8363a(eVar, i, list, eVar2, this);
    }
}
