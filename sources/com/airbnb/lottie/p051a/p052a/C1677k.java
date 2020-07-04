package com.airbnb.lottie.p051a.p052a;

import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.a.a.k */
public final class C1677k implements C1675i, C1679l {

    /* renamed from: a */
    private final Path f6177a = new Path();

    /* renamed from: b */
    private final Path f6178b = new Path();

    /* renamed from: c */
    private final Path f6179c = new Path();

    /* renamed from: d */
    private final String f6180d;

    /* renamed from: e */
    private final List<C1679l> f6181e = new ArrayList();

    /* renamed from: f */
    private final MergePaths f6182f;

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6180d;
    }

    /* renamed from: a */
    private void m8149a() {
        for (int i = 0; i < this.f6181e.size(); i++) {
            this.f6179c.addPath(((C1679l) this.f6181e.get(i)).mo7140e());
        }
    }

    /* renamed from: e */
    public final Path mo7140e() {
        this.f6179c.reset();
        switch (this.f6182f.f6473b) {
            case Merge:
                m8149a();
                break;
            case Add:
                m8150a(Op.UNION);
                break;
            case Subtract:
                m8150a(Op.REVERSE_DIFFERENCE);
                break;
            case Intersect:
                m8150a(Op.INTERSECT);
                break;
            case ExcludeIntersections:
                m8150a(Op.XOR);
                break;
        }
        return this.f6179c;
    }

    public C1677k(MergePaths mergePaths) {
        if (VERSION.SDK_INT >= 19) {
            this.f6180d = mergePaths.f6472a;
            this.f6182f = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: a */
    public final void mo7141a(ListIterator<C1668b> listIterator) {
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == this) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            C1668b bVar = (C1668b) listIterator.previous();
            if (bVar instanceof C1679l) {
                this.f6181e.add((C1679l) bVar);
                listIterator.remove();
            }
        }
    }

    /* renamed from: a */
    private void m8150a(Op op) {
        this.f6178b.reset();
        this.f6177a.reset();
        for (int size = this.f6181e.size() - 1; size > 0; size--) {
            C1679l lVar = (C1679l) this.f6181e.get(size);
            if (lVar instanceof C1669c) {
                C1669c cVar = (C1669c) lVar;
                List c = cVar.mo7138c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = ((C1679l) c.get(size2)).mo7140e();
                    e.transform(cVar.mo7139d());
                    this.f6178b.addPath(e);
                }
            } else {
                this.f6178b.addPath(lVar.mo7140e());
            }
        }
        C1679l lVar2 = (C1679l) this.f6181e.get(0);
        if (lVar2 instanceof C1669c) {
            C1669c cVar2 = (C1669c) lVar2;
            List c2 = cVar2.mo7138c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = ((C1679l) c2.get(i)).mo7140e();
                e2.transform(cVar2.mo7139d());
                this.f6177a.addPath(e2);
            }
        } else {
            this.f6177a.set(lVar2.mo7140e());
        }
        this.f6179c.op(this.f6177a, this.f6178b, op);
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        for (int i = 0; i < this.f6181e.size(); i++) {
            ((C1679l) this.f6181e.get(i)).mo7136a(list, list2);
        }
    }
}
