package com.airbnb.lottie.p051a.p052a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.C1818f;
import com.airbnb.lottie.model.content.C1806b;
import com.airbnb.lottie.model.content.C1814j;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1799l;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1702o;
import com.airbnb.lottie.p057e.C1755c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.c */
public final class C1669c implements C1670d, C1679l, C1688a, C1818f {

    /* renamed from: a */
    private final Matrix f6126a;

    /* renamed from: b */
    private final Path f6127b;

    /* renamed from: c */
    private final RectF f6128c;

    /* renamed from: d */
    private final String f6129d;

    /* renamed from: e */
    private final List<C1668b> f6130e;

    /* renamed from: f */
    private final C1767h f6131f;

    /* renamed from: g */
    private List<C1679l> f6132g;

    /* renamed from: h */
    private C1702o f6133h;

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6129d;
    }

    /* renamed from: a */
    public final void mo7131a() {
        this.f6131f.invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Matrix mo7139d() {
        if (this.f6133h != null) {
            return this.f6133h.mo7152a();
        }
        this.f6126a.reset();
        return this.f6126a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final List<C1679l> mo7138c() {
        if (this.f6132g == null) {
            this.f6132g = new ArrayList();
            for (int i = 0; i < this.f6130e.size(); i++) {
                C1668b bVar = (C1668b) this.f6130e.get(i);
                if (bVar instanceof C1679l) {
                    this.f6132g.add((C1679l) bVar);
                }
            }
        }
        return this.f6132g;
    }

    /* renamed from: e */
    public final Path mo7140e() {
        this.f6126a.reset();
        if (this.f6133h != null) {
            this.f6126a.set(this.f6133h.mo7152a());
        }
        this.f6127b.reset();
        for (int size = this.f6130e.size() - 1; size >= 0; size--) {
            C1668b bVar = (C1668b) this.f6130e.get(size);
            if (bVar instanceof C1679l) {
                this.f6127b.addPath(((C1679l) bVar).mo7140e(), this.f6126a);
            }
        }
        return this.f6127b;
    }

    /* renamed from: a */
    private static C1799l m8105a(List<C1806b> list) {
        for (int i = 0; i < list.size(); i++) {
            C1806b bVar = (C1806b) list.get(i);
            if (bVar instanceof C1799l) {
                return (C1799l) bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        if (this.f6133h != null) {
            this.f6133h.mo7156a(t, cVar);
        }
    }

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        this.f6126a.set(matrix);
        if (this.f6133h != null) {
            this.f6126a.preConcat(this.f6133h.mo7152a());
        }
        this.f6128c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f6130e.size() - 1; size >= 0; size--) {
            C1668b bVar = (C1668b) this.f6130e.get(size);
            if (bVar instanceof C1670d) {
                ((C1670d) bVar).mo7133a(this.f6128c, this.f6126a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f6128c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f6128c.left), Math.min(rectF.top, this.f6128c.top), Math.max(rectF.right, this.f6128c.right), Math.max(rectF.bottom, this.f6128c.bottom));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f6130e.size());
        arrayList.addAll(list);
        for (int size = this.f6130e.size() - 1; size >= 0; size--) {
            C1668b bVar = (C1668b) this.f6130e.get(size);
            bVar.mo7136a(arrayList, this.f6130e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    public C1669c(C1767h hVar, C1821a aVar, C1814j jVar) {
        this(hVar, aVar, jVar.f6542a, m8106a(hVar, aVar, jVar.f6543b), m8105a(jVar.f6543b));
    }

    /* renamed from: a */
    private static List<C1668b> m8106a(C1767h hVar, C1821a aVar, List<C1806b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C1668b a = ((C1806b) list.get(i)).mo7291a(hVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo7132a(Canvas canvas, Matrix matrix, int i) {
        this.f6126a.set(matrix);
        if (this.f6133h != null) {
            this.f6126a.preConcat(this.f6133h.mo7152a());
            i = (int) ((((((float) ((Integer) this.f6133h.f6253a.mo7151e()).intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.f6130e.size() - 1; size >= 0; size--) {
            Object obj = this.f6130e.get(size);
            if (obj instanceof C1670d) {
                ((C1670d) obj).mo7132a(canvas, this.f6126a, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        if (eVar.mo7309a(mo7137b(), i)) {
            if (!"__container".equals(mo7137b())) {
                eVar2 = eVar2.mo7308a(mo7137b());
                if (eVar.mo7311c(mo7137b(), i)) {
                    list.add(eVar2.mo7307a((C1818f) this));
                }
            }
            if (eVar.mo7312d(mo7137b(), i)) {
                int b = i + eVar.mo7310b(mo7137b(), i);
                for (int i2 = 0; i2 < this.f6130e.size(); i2++) {
                    C1668b bVar = (C1668b) this.f6130e.get(i2);
                    if (bVar instanceof C1818f) {
                        ((C1818f) bVar).mo7134a(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }

    C1669c(C1767h hVar, C1821a aVar, String str, List<C1668b> list, C1799l lVar) {
        this.f6126a = new Matrix();
        this.f6127b = new Path();
        this.f6128c = new RectF();
        this.f6129d = str;
        this.f6131f = hVar;
        this.f6130e = list;
        if (lVar != null) {
            this.f6133h = lVar.mo7292a();
            this.f6133h.mo7155a(aVar);
            this.f6133h.mo7154a((C1688a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C1668b bVar = (C1668b) list.get(size);
            if (bVar instanceof C1675i) {
                arrayList.add((C1675i) bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C1675i) arrayList.get(size2)).mo7141a(list.listIterator(list.size()));
        }
    }
}
