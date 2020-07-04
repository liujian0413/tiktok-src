package com.p280ss.android.ugc.aweme.account.base.widget.recyclerview;

import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.BaseItemAnimator */
public abstract class BaseItemAnimator extends SimpleItemAnimator {

    /* renamed from: a */
    public ArrayList<ArrayList<C1293v>> f56751a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<ArrayList<C21140b>> f56752b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<ArrayList<C21139a>> f56753c = new ArrayList<>();

    /* renamed from: d */
    protected ArrayList<C1293v> f56754d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C1293v> f56755e = new ArrayList<>();

    /* renamed from: f */
    protected ArrayList<C1293v> f56756f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C1293v> f56757g = new ArrayList<>();

    /* renamed from: n */
    public Interpolator f56758n = new DecelerateInterpolator();

    /* renamed from: o */
    private ArrayList<C1293v> f56759o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<C1293v> f56760p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C21140b> f56761q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C21139a> f56762r = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.BaseItemAnimator$DefaultAddVpaListener */
    protected class DefaultAddVpaListener extends C21141c {

        /* renamed from: a */
        C1293v f56781a;

        /* renamed from: a */
        public final void mo3626a(View view) {
        }

        /* renamed from: c */
        public final void mo3628c(View view) {
            C21143b.m71284a(view);
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            C21143b.m71284a(view);
            BaseItemAnimator.this.mo6005j(this.f56781a);
            BaseItemAnimator.this.f56754d.remove(this.f56781a);
            BaseItemAnimator.this.mo5333c();
        }

        public DefaultAddVpaListener(C1293v vVar) {
            super();
            this.f56781a = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.BaseItemAnimator$DefaultRemoveVpaListener */
    protected class DefaultRemoveVpaListener extends C21141c {

        /* renamed from: a */
        C1293v f56783a;

        /* renamed from: a */
        public final void mo3626a(View view) {
        }

        /* renamed from: c */
        public final void mo3628c(View view) {
            C21143b.m71284a(view);
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            C21143b.m71284a(view);
            BaseItemAnimator.this.mo6003h(this.f56783a);
            BaseItemAnimator.this.f56756f.remove(this.f56783a);
            BaseItemAnimator.this.mo5333c();
        }

        public DefaultRemoveVpaListener(C1293v vVar) {
            super();
            this.f56783a = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.BaseItemAnimator$a */
    static class C21139a {

        /* renamed from: a */
        public C1293v f56785a;

        /* renamed from: b */
        public C1293v f56786b;

        /* renamed from: c */
        public int f56787c;

        /* renamed from: d */
        public int f56788d;

        /* renamed from: e */
        public int f56789e;

        /* renamed from: f */
        public int f56790f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f56785a);
            sb.append(", newHolder=");
            sb.append(this.f56786b);
            sb.append(", fromX=");
            sb.append(this.f56787c);
            sb.append(", fromY=");
            sb.append(this.f56788d);
            sb.append(", toX=");
            sb.append(this.f56789e);
            sb.append(", toY=");
            sb.append(this.f56790f);
            sb.append('}');
            return sb.toString();
        }

        private C21139a(C1293v vVar, C1293v vVar2) {
            this.f56785a = vVar;
            this.f56786b = vVar2;
        }

        private C21139a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f56787c = i;
            this.f56788d = i2;
            this.f56789e = i3;
            this.f56790f = i4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.BaseItemAnimator$b */
    static class C21140b {

        /* renamed from: a */
        public C1293v f56791a;

        /* renamed from: b */
        public int f56792b;

        /* renamed from: c */
        public int f56793c;

        /* renamed from: d */
        public int f56794d;

        /* renamed from: e */
        public int f56795e;

        private C21140b(C1293v vVar, int i, int i2, int i3, int i4) {
            this.f56791a = vVar;
            this.f56792b = i;
            this.f56793c = i2;
            this.f56794d = i3;
            this.f56795e = i4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.BaseItemAnimator$c */
    static class C21141c implements C1002z {
        private C21141c() {
        }

        /* renamed from: a */
        public void mo3626a(View view) {
        }

        /* renamed from: b */
        public void mo3627b(View view) {
        }

        /* renamed from: c */
        public void mo3628c(View view) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo57026c(C1293v vVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo57027k(C1293v vVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo57028l(C1293v vVar);

    /* renamed from: c */
    public final void mo5333c() {
        if (!mo5331b()) {
            mo5735e();
        }
    }

    /* renamed from: b */
    public final boolean mo5331b() {
        if (!this.f56760p.isEmpty() || !this.f56762r.isEmpty() || !this.f56761q.isEmpty() || !this.f56759o.isEmpty() || !this.f56755e.isEmpty() || !this.f56756f.isEmpty() || !this.f56754d.isEmpty() || !this.f56757g.isEmpty() || !this.f56752b.isEmpty() || !this.f56751a.isEmpty() || !this.f56753c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5324a() {
        long j;
        long j2;
        boolean z = !this.f56759o.isEmpty();
        boolean z2 = !this.f56761q.isEmpty();
        boolean z3 = !this.f56762r.isEmpty();
        boolean z4 = !this.f56760p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f56759o.iterator();
            while (it.hasNext()) {
                m71234r((C1293v) it.next());
            }
            this.f56759o.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f56761q);
                this.f56752b.add(arrayList);
                this.f56761q.clear();
                C211331 r6 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f56752b.remove(arrayList)) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C21140b bVar = (C21140b) it.next();
                                BaseItemAnimator.this.mo57025b(bVar.f56791a, bVar.f56792b, bVar.f56793c, bVar.f56794d, bVar.f56795e);
                            }
                            arrayList.clear();
                        }
                    }
                };
                if (z) {
                    C0991u.m4191a(((C21140b) arrayList.get(0)).f56791a.itemView, (Runnable) r6, this.f4941j);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f56762r);
                this.f56753c.add(arrayList2);
                this.f56762r.clear();
                C211342 r62 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f56753c.remove(arrayList2)) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                BaseItemAnimator.this.mo57024a((C21139a) it.next());
                            }
                            arrayList2.clear();
                        }
                    }
                };
                if (z) {
                    C0991u.m4191a(((C21139a) arrayList2.get(0)).f56785a.itemView, (Runnable) r62, this.f4941j);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f56760p);
                this.f56751a.add(arrayList3);
                this.f56760p.clear();
                C211353 r5 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f56751a.remove(arrayList3)) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                BaseItemAnimator.this.mo57029m((C1293v) it.next());
                            }
                            arrayList3.clear();
                        }
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = this.f4941j;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.f4942k;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.f4943l;
                    }
                    C0991u.m4191a(((C1293v) arrayList3.get(0)).itemView, (Runnable) r5, j + Math.max(j2, j3));
                    return;
                }
                r5.run();
            }
        }
    }

    /* renamed from: d */
    public final void mo5335d() {
        int size = this.f56761q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C21140b bVar = (C21140b) this.f56761q.get(size);
            View view = bVar.f56791a.itemView;
            C0991u.m4200b(view, 0.0f);
            C0991u.m4177a(view, 0.0f);
            mo6004i(bVar.f56791a);
            this.f56761q.remove(size);
        }
        for (int size2 = this.f56759o.size() - 1; size2 >= 0; size2--) {
            mo6003h((C1293v) this.f56759o.get(size2));
            this.f56759o.remove(size2);
        }
        for (int size3 = this.f56760p.size() - 1; size3 >= 0; size3--) {
            C1293v vVar = (C1293v) this.f56760p.get(size3);
            C21143b.m71284a(vVar.itemView);
            mo6005j(vVar);
            this.f56760p.remove(size3);
        }
        for (int size4 = this.f56762r.size() - 1; size4 >= 0; size4--) {
            m71231b((C21139a) this.f56762r.get(size4));
        }
        this.f56762r.clear();
        if (mo5331b()) {
            for (int size5 = this.f56752b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f56752b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C21140b bVar2 = (C21140b) arrayList.get(size6);
                    View view2 = bVar2.f56791a.itemView;
                    C0991u.m4200b(view2, 0.0f);
                    C0991u.m4177a(view2, 0.0f);
                    mo6004i(bVar2.f56791a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f56752b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f56751a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f56751a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1293v vVar2 = (C1293v) arrayList2.get(size8);
                    C0991u.m4205c(vVar2.itemView, 1.0f);
                    mo6005j(vVar2);
                    if (size8 < arrayList2.size()) {
                        arrayList2.remove(size8);
                    }
                    if (arrayList2.isEmpty()) {
                        this.f56751a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f56753c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f56753c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m71231b((C21139a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f56753c.remove(arrayList3);
                    }
                }
            }
            m71228a((List<C1293v>) this.f56756f);
            m71228a((List<C1293v>) this.f56755e);
            m71228a((List<C1293v>) this.f56754d);
            m71228a((List<C1293v>) this.f56757g);
            mo5735e();
        }
    }

    /* renamed from: p */
    private void m71232p(C1293v vVar) {
        C21143b.m71284a(vVar.itemView);
    }

    /* renamed from: q */
    private void m71233q(C1293v vVar) {
        C21143b.m71284a(vVar.itemView);
        if (!(vVar instanceof C21142a)) {
            mo57026c(vVar);
        }
    }

    /* renamed from: a */
    public final boolean mo5326a(C1293v vVar) {
        mo5336d(vVar);
        m71232p(vVar);
        this.f56759o.add(vVar);
        return true;
    }

    /* renamed from: b */
    public final boolean mo5332b(C1293v vVar) {
        mo5336d(vVar);
        m71233q(vVar);
        this.f56760p.add(vVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final long mo57030n(C1293v vVar) {
        return Math.abs((((long) vVar.mOldPosition) * this.f4941j) / 4);
    }

    /* renamed from: a */
    private static void m71228a(List<C1293v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0991u.m4238q(((C1293v) list.get(size)).itemView).mo3804b();
        }
    }

    /* renamed from: b */
    private void m71231b(C21139a aVar) {
        if (aVar.f56785a != null) {
            m71230a(aVar, aVar.f56785a);
        }
        if (aVar.f56786b != null) {
            m71230a(aVar, aVar.f56786b);
        }
    }

    /* renamed from: r */
    private void m71234r(C1293v vVar) {
        if (vVar instanceof C21142a) {
            new DefaultRemoveVpaListener(vVar);
        } else {
            mo57027k(vVar);
        }
        this.f56756f.add(vVar);
    }

    /* renamed from: m */
    public final void mo57029m(C1293v vVar) {
        if (vVar instanceof C21142a) {
            new DefaultAddVpaListener(vVar);
        } else {
            mo57028l(vVar);
        }
        this.f56754d.add(vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final long mo57031o(C1293v vVar) {
        return Math.abs((((long) vVar.getAdapterPosition()) * this.f4940i) / 4);
    }

    /* renamed from: a */
    public final void mo57024a(final C21139a aVar) {
        View view;
        C1293v vVar = aVar.f56785a;
        final View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C1293v vVar2 = aVar.f56786b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            this.f56757g.add(aVar.f56785a);
            final C0998y a = C0991u.m4238q(view).mo3798a(this.f4943l);
            a.mo3802b((float) (aVar.f56789e - aVar.f56787c));
            a.mo3805c((float) (aVar.f56790f - aVar.f56788d));
            a.mo3797a(0.0f).mo3800a((C1002z) new C21141c() {
                /* renamed from: a */
                public final void mo3626a(View view) {
                }

                /* renamed from: b */
                public final void mo3627b(View view) {
                    a.mo3800a((C1002z) null);
                    C0991u.m4205c(view, 1.0f);
                    C0991u.m4177a(view, 0.0f);
                    C0991u.m4200b(view, 0.0f);
                    BaseItemAnimator.this.mo6002a(aVar.f56785a, true);
                    BaseItemAnimator.this.f56757g.remove(aVar.f56785a);
                    BaseItemAnimator.this.mo5333c();
                }
            }).mo3806c();
        }
        if (view2 != null) {
            this.f56757g.add(aVar.f56786b);
            final C0998y q = C0991u.m4238q(view2);
            q.mo3802b(0.0f).mo3805c(0.0f).mo3798a(this.f4943l).mo3797a(1.0f).mo3800a((C1002z) new C21141c() {
                /* renamed from: a */
                public final void mo3626a(View view) {
                }

                /* renamed from: b */
                public final void mo3627b(View view) {
                    q.mo3800a((C1002z) null);
                    C0991u.m4205c(view2, 1.0f);
                    C0991u.m4177a(view2, 0.0f);
                    C0991u.m4200b(view2, 0.0f);
                    BaseItemAnimator.this.mo6002a(aVar.f56786b, false);
                    BaseItemAnimator.this.f56757g.remove(aVar.f56786b);
                    BaseItemAnimator.this.mo5333c();
                }
            }).mo3806c();
        }
    }

    /* renamed from: d */
    public final void mo5336d(C1293v vVar) {
        View view = vVar.itemView;
        C0991u.m4238q(view).mo3804b();
        int size = this.f56761q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C21140b) this.f56761q.get(size)).f56791a == vVar) {
                C0991u.m4200b(view, 0.0f);
                C0991u.m4177a(view, 0.0f);
                mo6004i(vVar);
                this.f56761q.remove(size);
            }
        }
        m71229a((List<C21139a>) this.f56762r, vVar);
        if (this.f56759o.remove(vVar)) {
            C21143b.m71284a(vVar.itemView);
            mo6003h(vVar);
        }
        if (this.f56760p.remove(vVar)) {
            C21143b.m71284a(vVar.itemView);
            mo6005j(vVar);
        }
        for (int size2 = this.f56753c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f56753c.get(size2);
            m71229a((List<C21139a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f56753c.remove(size2);
            }
        }
        for (int size3 = this.f56752b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f56752b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C21140b) arrayList2.get(size4)).f56791a == vVar) {
                    C0991u.m4200b(view, 0.0f);
                    C0991u.m4177a(view, 0.0f);
                    mo6004i(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f56752b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f56751a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f56751a.get(size5);
            if (arrayList3.remove(vVar)) {
                C21143b.m71284a(vVar.itemView);
                mo6005j(vVar);
                if (arrayList3.isEmpty()) {
                    this.f56751a.remove(size5);
                }
            }
        }
        this.f56756f.remove(vVar);
        this.f56754d.remove(vVar);
        this.f56757g.remove(vVar);
        this.f56755e.remove(vVar);
        mo5333c();
    }

    /* renamed from: a */
    private void m71229a(List<C21139a> list, C1293v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C21139a aVar = (C21139a) list.get(size);
            if (m71230a(aVar, vVar) && aVar.f56785a == null && aVar.f56786b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m71230a(C21139a aVar, C1293v vVar) {
        boolean z = false;
        if (aVar.f56786b == vVar) {
            aVar.f56786b = null;
        } else if (aVar.f56785a != vVar) {
            return false;
        } else {
            aVar.f56785a = null;
            z = true;
        }
        C0991u.m4205c(vVar.itemView, 1.0f);
        C0991u.m4177a(vVar.itemView, 0.0f);
        C0991u.m4200b(vVar.itemView, 0.0f);
        mo6002a(vVar, z);
        return true;
    }

    /* renamed from: b */
    public final void mo57025b(C1293v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            C0991u.m4238q(view).mo3802b(0.0f);
        }
        if (i6 != 0) {
            C0991u.m4238q(view).mo3805c(0.0f);
        }
        this.f56755e.add(vVar);
        final C0998y q = C0991u.m4238q(view);
        C0998y a = q.mo3798a(this.f4942k);
        final C1293v vVar2 = vVar;
        C211364 r1 = new C21141c() {
            /* renamed from: a */
            public final void mo3626a(View view) {
            }

            /* renamed from: c */
            public final void mo3628c(View view) {
                if (i5 != 0) {
                    C0991u.m4177a(view, 0.0f);
                }
                if (i6 != 0) {
                    C0991u.m4200b(view, 0.0f);
                }
            }

            /* renamed from: b */
            public final void mo3627b(View view) {
                q.mo3800a((C1002z) null);
                BaseItemAnimator.this.mo6004i(vVar2);
                BaseItemAnimator.this.f56755e.remove(vVar2);
                BaseItemAnimator.this.mo5333c();
            }
        };
        a.mo3800a((C1002z) r1).mo3806c();
    }

    /* renamed from: a */
    public final boolean mo5327a(C1293v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        int m = (int) (((float) i) + C0991u.m4234m(vVar.itemView));
        int n = (int) (((float) i2) + C0991u.m4235n(vVar.itemView));
        mo5336d(vVar);
        int i5 = i3 - m;
        int i6 = i4 - n;
        if (i5 == 0 && i6 == 0) {
            mo6004i(vVar);
            return false;
        }
        if (i5 != 0) {
            C0991u.m4177a(view, (float) (-i5));
        }
        if (i6 != 0) {
            C0991u.m4200b(view, (float) (-i6));
        }
        ArrayList<C21140b> arrayList = this.f56761q;
        C21140b bVar = new C21140b(vVar, m, n, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo5328a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
        C1293v vVar3 = vVar;
        C1293v vVar4 = vVar2;
        float m = C0991u.m4234m(vVar3.itemView);
        float n = C0991u.m4235n(vVar3.itemView);
        float g = C0991u.m4217g(vVar3.itemView);
        mo5336d(vVar);
        int i5 = (int) (((float) (i3 - i)) - m);
        int i6 = (int) (((float) (i4 - i2)) - n);
        C0991u.m4177a(vVar3.itemView, m);
        C0991u.m4200b(vVar3.itemView, n);
        C0991u.m4205c(vVar3.itemView, g);
        if (!(vVar4 == null || vVar4.itemView == null)) {
            mo5336d(vVar2);
            C0991u.m4177a(vVar4.itemView, (float) (-i5));
            C0991u.m4200b(vVar4.itemView, (float) (-i6));
            C0991u.m4205c(vVar4.itemView, 0.0f);
        }
        ArrayList<C21139a> arrayList = this.f56762r;
        C21139a aVar = new C21139a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }
}
