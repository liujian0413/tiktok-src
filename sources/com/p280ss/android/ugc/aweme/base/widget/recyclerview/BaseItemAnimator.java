package com.p280ss.android.ugc.aweme.base.widget.recyclerview;

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

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator */
public abstract class BaseItemAnimator extends SimpleItemAnimator {

    /* renamed from: a */
    public ArrayList<ArrayList<C1293v>> f62035a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<ArrayList<C23517b>> f62036b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<ArrayList<C23516a>> f62037c = new ArrayList<>();

    /* renamed from: d */
    protected ArrayList<C1293v> f62038d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C1293v> f62039e = new ArrayList<>();

    /* renamed from: f */
    protected ArrayList<C1293v> f62040f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C1293v> f62041g = new ArrayList<>();

    /* renamed from: n */
    public Interpolator f62042n = new DecelerateInterpolator();

    /* renamed from: o */
    private ArrayList<C1293v> f62043o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<C1293v> f62044p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C23517b> f62045q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C23516a> f62046r = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator$DefaultAddVpaListener */
    protected class DefaultAddVpaListener extends C23518c {

        /* renamed from: a */
        C1293v f62065a;

        /* renamed from: a */
        public final void mo3626a(View view) {
        }

        /* renamed from: c */
        public final void mo3628c(View view) {
            C23523b.m77278a(view);
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            C23523b.m77278a(view);
            BaseItemAnimator.this.mo6005j(this.f62065a);
            BaseItemAnimator.this.f62038d.remove(this.f62065a);
            BaseItemAnimator.this.mo5333c();
        }

        public DefaultAddVpaListener(C1293v vVar) {
            super();
            this.f62065a = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator$DefaultRemoveVpaListener */
    protected class DefaultRemoveVpaListener extends C23518c {

        /* renamed from: a */
        C1293v f62067a;

        /* renamed from: a */
        public final void mo3626a(View view) {
        }

        /* renamed from: c */
        public final void mo3628c(View view) {
            C23523b.m77278a(view);
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            C23523b.m77278a(view);
            BaseItemAnimator.this.mo6003h(this.f62067a);
            BaseItemAnimator.this.f62040f.remove(this.f62067a);
            BaseItemAnimator.this.mo5333c();
        }

        public DefaultRemoveVpaListener(C1293v vVar) {
            super();
            this.f62067a = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator$a */
    static class C23516a {

        /* renamed from: a */
        public C1293v f62069a;

        /* renamed from: b */
        public C1293v f62070b;

        /* renamed from: c */
        public int f62071c;

        /* renamed from: d */
        public int f62072d;

        /* renamed from: e */
        public int f62073e;

        /* renamed from: f */
        public int f62074f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f62069a);
            sb.append(", newHolder=");
            sb.append(this.f62070b);
            sb.append(", fromX=");
            sb.append(this.f62071c);
            sb.append(", fromY=");
            sb.append(this.f62072d);
            sb.append(", toX=");
            sb.append(this.f62073e);
            sb.append(", toY=");
            sb.append(this.f62074f);
            sb.append('}');
            return sb.toString();
        }

        private C23516a(C1293v vVar, C1293v vVar2) {
            this.f62069a = vVar;
            this.f62070b = vVar2;
        }

        private C23516a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f62071c = i;
            this.f62072d = i2;
            this.f62073e = i3;
            this.f62074f = i4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator$b */
    static class C23517b {

        /* renamed from: a */
        public C1293v f62075a;

        /* renamed from: b */
        public int f62076b;

        /* renamed from: c */
        public int f62077c;

        /* renamed from: d */
        public int f62078d;

        /* renamed from: e */
        public int f62079e;

        private C23517b(C1293v vVar, int i, int i2, int i3, int i4) {
            this.f62075a = vVar;
            this.f62076b = i;
            this.f62077c = i2;
            this.f62078d = i3;
            this.f62079e = i4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.BaseItemAnimator$c */
    static class C23518c implements C1002z {
        private C23518c() {
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
    public void mo61157c(C1293v vVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo61158k(C1293v vVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo61159l(C1293v vVar);

    /* renamed from: c */
    public final void mo5333c() {
        if (!mo5331b()) {
            mo5735e();
        }
    }

    /* renamed from: b */
    public final boolean mo5331b() {
        if (!this.f62044p.isEmpty() || !this.f62046r.isEmpty() || !this.f62045q.isEmpty() || !this.f62043o.isEmpty() || !this.f62039e.isEmpty() || !this.f62040f.isEmpty() || !this.f62038d.isEmpty() || !this.f62041g.isEmpty() || !this.f62036b.isEmpty() || !this.f62035a.isEmpty() || !this.f62037c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5324a() {
        long j;
        long j2;
        boolean z = !this.f62043o.isEmpty();
        boolean z2 = !this.f62045q.isEmpty();
        boolean z3 = !this.f62046r.isEmpty();
        boolean z4 = !this.f62044p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f62043o.iterator();
            while (it.hasNext()) {
                m77206r((C1293v) it.next());
            }
            this.f62043o.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f62045q);
                this.f62036b.add(arrayList);
                this.f62045q.clear();
                C235101 r6 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f62036b.remove(arrayList)) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C23517b bVar = (C23517b) it.next();
                                BaseItemAnimator.this.mo61156b(bVar.f62075a, bVar.f62076b, bVar.f62077c, bVar.f62078d, bVar.f62079e);
                            }
                            arrayList.clear();
                        }
                    }
                };
                if (z) {
                    C0991u.m4191a(((C23517b) arrayList.get(0)).f62075a.itemView, (Runnable) r6, this.f4941j);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f62046r);
                this.f62037c.add(arrayList2);
                this.f62046r.clear();
                C235112 r62 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f62037c.remove(arrayList2)) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                BaseItemAnimator.this.mo61155a((C23516a) it.next());
                            }
                            arrayList2.clear();
                        }
                    }
                };
                if (z) {
                    C0991u.m4191a(((C23516a) arrayList2.get(0)).f62069a.itemView, (Runnable) r62, this.f4941j);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f62044p);
                this.f62035a.add(arrayList3);
                this.f62044p.clear();
                C235123 r5 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f62035a.remove(arrayList3)) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                BaseItemAnimator.this.mo61160m((C1293v) it.next());
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
        int size = this.f62045q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C23517b bVar = (C23517b) this.f62045q.get(size);
            View view = bVar.f62075a.itemView;
            C0991u.m4200b(view, 0.0f);
            C0991u.m4177a(view, 0.0f);
            mo6004i(bVar.f62075a);
            this.f62045q.remove(size);
        }
        for (int size2 = this.f62043o.size() - 1; size2 >= 0; size2--) {
            mo6003h((C1293v) this.f62043o.get(size2));
            this.f62043o.remove(size2);
        }
        for (int size3 = this.f62044p.size() - 1; size3 >= 0; size3--) {
            C1293v vVar = (C1293v) this.f62044p.get(size3);
            C23523b.m77278a(vVar.itemView);
            mo6005j(vVar);
            this.f62044p.remove(size3);
        }
        for (int size4 = this.f62046r.size() - 1; size4 >= 0; size4--) {
            m77203b((C23516a) this.f62046r.get(size4));
        }
        this.f62046r.clear();
        if (mo5331b()) {
            for (int size5 = this.f62036b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f62036b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C23517b bVar2 = (C23517b) arrayList.get(size6);
                    View view2 = bVar2.f62075a.itemView;
                    C0991u.m4200b(view2, 0.0f);
                    C0991u.m4177a(view2, 0.0f);
                    mo6004i(bVar2.f62075a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f62036b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f62035a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f62035a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1293v vVar2 = (C1293v) arrayList2.get(size8);
                    C0991u.m4205c(vVar2.itemView, 1.0f);
                    mo6005j(vVar2);
                    if (size8 < arrayList2.size()) {
                        arrayList2.remove(size8);
                    }
                    if (arrayList2.isEmpty()) {
                        this.f62035a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f62037c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f62037c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m77203b((C23516a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f62037c.remove(arrayList3);
                    }
                }
            }
            m77200a((List<C1293v>) this.f62040f);
            m77200a((List<C1293v>) this.f62039e);
            m77200a((List<C1293v>) this.f62038d);
            m77200a((List<C1293v>) this.f62041g);
            mo5735e();
        }
    }

    /* renamed from: p */
    private void m77204p(C1293v vVar) {
        C23523b.m77278a(vVar.itemView);
    }

    /* renamed from: q */
    private void m77205q(C1293v vVar) {
        C23523b.m77278a(vVar.itemView);
        if (!(vVar instanceof C23520a)) {
            mo61157c(vVar);
        }
    }

    /* renamed from: a */
    public final boolean mo5326a(C1293v vVar) {
        mo5336d(vVar);
        m77204p(vVar);
        this.f62043o.add(vVar);
        return true;
    }

    /* renamed from: b */
    public final boolean mo5332b(C1293v vVar) {
        mo5336d(vVar);
        m77205q(vVar);
        this.f62044p.add(vVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final long mo61161n(C1293v vVar) {
        return Math.abs((((long) vVar.mOldPosition) * this.f4941j) / 4);
    }

    /* renamed from: a */
    private static void m77200a(List<C1293v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0991u.m4238q(((C1293v) list.get(size)).itemView).mo3804b();
        }
    }

    /* renamed from: b */
    private void m77203b(C23516a aVar) {
        if (aVar.f62069a != null) {
            m77202a(aVar, aVar.f62069a);
        }
        if (aVar.f62070b != null) {
            m77202a(aVar, aVar.f62070b);
        }
    }

    /* renamed from: r */
    private void m77206r(C1293v vVar) {
        if (vVar instanceof C23520a) {
            new DefaultRemoveVpaListener(vVar);
        } else {
            mo61158k(vVar);
        }
        this.f62040f.add(vVar);
    }

    /* renamed from: m */
    public final void mo61160m(C1293v vVar) {
        if (vVar instanceof C23520a) {
            new DefaultAddVpaListener(vVar);
        } else {
            mo61159l(vVar);
        }
        this.f62038d.add(vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final long mo61162o(C1293v vVar) {
        return Math.abs((((long) vVar.getAdapterPosition()) * this.f4940i) / 4);
    }

    /* renamed from: a */
    public final void mo61155a(final C23516a aVar) {
        View view;
        C1293v vVar = aVar.f62069a;
        final View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C1293v vVar2 = aVar.f62070b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            this.f62041g.add(aVar.f62069a);
            final C0998y a = C0991u.m4238q(view).mo3798a(this.f4943l);
            a.mo3802b((float) (aVar.f62073e - aVar.f62071c));
            a.mo3805c((float) (aVar.f62074f - aVar.f62072d));
            a.mo3797a(0.0f).mo3800a((C1002z) new C23518c() {
                /* renamed from: a */
                public final void mo3626a(View view) {
                }

                /* renamed from: b */
                public final void mo3627b(View view) {
                    a.mo3800a((C1002z) null);
                    C0991u.m4205c(view, 1.0f);
                    C0991u.m4177a(view, 0.0f);
                    C0991u.m4200b(view, 0.0f);
                    BaseItemAnimator.this.mo6002a(aVar.f62069a, true);
                    BaseItemAnimator.this.f62041g.remove(aVar.f62069a);
                    BaseItemAnimator.this.mo5333c();
                }
            }).mo3806c();
        }
        if (view2 != null) {
            this.f62041g.add(aVar.f62070b);
            final C0998y q = C0991u.m4238q(view2);
            q.mo3802b(0.0f).mo3805c(0.0f).mo3798a(this.f4943l).mo3797a(1.0f).mo3800a((C1002z) new C23518c() {
                /* renamed from: a */
                public final void mo3626a(View view) {
                }

                /* renamed from: b */
                public final void mo3627b(View view) {
                    q.mo3800a((C1002z) null);
                    C0991u.m4205c(view2, 1.0f);
                    C0991u.m4177a(view2, 0.0f);
                    C0991u.m4200b(view2, 0.0f);
                    BaseItemAnimator.this.mo6002a(aVar.f62070b, false);
                    BaseItemAnimator.this.f62041g.remove(aVar.f62070b);
                    BaseItemAnimator.this.mo5333c();
                }
            }).mo3806c();
        }
    }

    /* renamed from: d */
    public final void mo5336d(C1293v vVar) {
        View view = vVar.itemView;
        C0991u.m4238q(view).mo3804b();
        int size = this.f62045q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C23517b) this.f62045q.get(size)).f62075a == vVar) {
                C0991u.m4200b(view, 0.0f);
                C0991u.m4177a(view, 0.0f);
                mo6004i(vVar);
                this.f62045q.remove(size);
            }
        }
        m77201a((List<C23516a>) this.f62046r, vVar);
        if (this.f62043o.remove(vVar)) {
            C23523b.m77278a(vVar.itemView);
            mo6003h(vVar);
        }
        if (this.f62044p.remove(vVar)) {
            C23523b.m77278a(vVar.itemView);
            mo6005j(vVar);
        }
        for (int size2 = this.f62037c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f62037c.get(size2);
            m77201a((List<C23516a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f62037c.remove(size2);
            }
        }
        for (int size3 = this.f62036b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f62036b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C23517b) arrayList2.get(size4)).f62075a == vVar) {
                    C0991u.m4200b(view, 0.0f);
                    C0991u.m4177a(view, 0.0f);
                    mo6004i(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f62036b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f62035a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f62035a.get(size5);
            if (arrayList3.remove(vVar)) {
                C23523b.m77278a(vVar.itemView);
                mo6005j(vVar);
                if (arrayList3.isEmpty()) {
                    this.f62035a.remove(size5);
                }
            }
        }
        this.f62040f.remove(vVar);
        this.f62038d.remove(vVar);
        this.f62041g.remove(vVar);
        this.f62039e.remove(vVar);
        mo5333c();
    }

    /* renamed from: a */
    private void m77201a(List<C23516a> list, C1293v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C23516a aVar = (C23516a) list.get(size);
            if (m77202a(aVar, vVar) && aVar.f62069a == null && aVar.f62070b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m77202a(C23516a aVar, C1293v vVar) {
        boolean z = false;
        if (aVar.f62070b == vVar) {
            aVar.f62070b = null;
        } else if (aVar.f62069a != vVar) {
            return false;
        } else {
            aVar.f62069a = null;
            z = true;
        }
        C0991u.m4205c(vVar.itemView, 1.0f);
        C0991u.m4177a(vVar.itemView, 0.0f);
        C0991u.m4200b(vVar.itemView, 0.0f);
        mo6002a(vVar, z);
        return true;
    }

    /* renamed from: b */
    public final void mo61156b(C1293v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            C0991u.m4238q(view).mo3802b(0.0f);
        }
        if (i6 != 0) {
            C0991u.m4238q(view).mo3805c(0.0f);
        }
        this.f62039e.add(vVar);
        final C0998y q = C0991u.m4238q(view);
        C0998y a = q.mo3798a(this.f4942k);
        final C1293v vVar2 = vVar;
        C235134 r1 = new C23518c() {
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
                BaseItemAnimator.this.f62039e.remove(vVar2);
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
        ArrayList<C23517b> arrayList = this.f62045q;
        C23517b bVar = new C23517b(vVar, m, n, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo5328a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
        C1293v vVar3 = vVar;
        C1293v vVar4 = vVar2;
        if (vVar3 == vVar4) {
            return mo5327a(vVar, i, i2, i3, i4);
        }
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
            mo5336d(vVar4);
            C0991u.m4177a(vVar4.itemView, (float) (-i5));
            C0991u.m4200b(vVar4.itemView, (float) (-i6));
            C0991u.m4205c(vVar4.itemView, 0.0f);
        }
        ArrayList<C23516a> arrayList = this.f62046r;
        C23516a aVar = new C23516a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }
}
