package com.p280ss.android.ugc.aweme.shortvideo.widget.animation;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator */
public abstract class BaseItemAnimator extends SimpleItemAnimator {

    /* renamed from: a */
    public ArrayList<ArrayList<C1293v>> f108446a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<ArrayList<C41682b>> f108447b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<ArrayList<C41681a>> f108448c = new ArrayList<>();

    /* renamed from: d */
    protected ArrayList<C1293v> f108449d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C1293v> f108450e = new ArrayList<>();

    /* renamed from: f */
    protected ArrayList<C1293v> f108451f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C1293v> f108452g = new ArrayList<>();

    /* renamed from: n */
    public Interpolator f108453n = new DecelerateInterpolator();

    /* renamed from: o */
    private ArrayList<C1293v> f108454o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<C1293v> f108455p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C41682b> f108456q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C41681a> f108457r = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator$DefaultAddVpaListener */
    protected class DefaultAddVpaListener extends VpaListenerAdapter {

        /* renamed from: a */
        C1293v f108476a;

        /* renamed from: b */
        final /* synthetic */ BaseItemAnimator f108477b;

        /* renamed from: a */
        public final void mo3626a(View view) {
        }

        /* renamed from: c */
        public final void mo3628c(View view) {
            BaseItemAnimator.m132718a(view);
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            BaseItemAnimator.m132718a(view);
            this.f108477b.mo6005j(this.f108476a);
            this.f108477b.f108449d.remove(this.f108476a);
            this.f108477b.mo5333c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator$DefaultRemoveVpaListener */
    protected class DefaultRemoveVpaListener extends VpaListenerAdapter {

        /* renamed from: a */
        C1293v f108478a;

        /* renamed from: b */
        final /* synthetic */ BaseItemAnimator f108479b;

        /* renamed from: a */
        public final void mo3626a(View view) {
        }

        /* renamed from: c */
        public final void mo3628c(View view) {
            BaseItemAnimator.m132718a(view);
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            BaseItemAnimator.m132718a(view);
            this.f108479b.mo6003h(this.f108478a);
            this.f108479b.f108451f.remove(this.f108478a);
            this.f108479b.mo5333c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator$VpaListenerAdapter */
    public static class VpaListenerAdapter implements C1002z {
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator$a */
    static class C41681a {

        /* renamed from: a */
        public C1293v f108480a;

        /* renamed from: b */
        public C1293v f108481b;

        /* renamed from: c */
        public int f108482c;

        /* renamed from: d */
        public int f108483d;

        /* renamed from: e */
        public int f108484e;

        /* renamed from: f */
        public int f108485f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f108480a);
            sb.append(", newHolder=");
            sb.append(this.f108481b);
            sb.append(", fromX=");
            sb.append(this.f108482c);
            sb.append(", fromY=");
            sb.append(this.f108483d);
            sb.append(", toX=");
            sb.append(this.f108484e);
            sb.append(", toY=");
            sb.append(this.f108485f);
            sb.append('}');
            return sb.toString();
        }

        private C41681a(C1293v vVar, C1293v vVar2) {
            this.f108480a = vVar;
            this.f108481b = vVar2;
        }

        private C41681a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f108482c = i;
            this.f108483d = i2;
            this.f108484e = i3;
            this.f108485f = i4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.BaseItemAnimator$b */
    static class C41682b {

        /* renamed from: a */
        public C1293v f108486a;

        /* renamed from: b */
        public int f108487b;

        /* renamed from: c */
        public int f108488c;

        /* renamed from: d */
        public int f108489d;

        /* renamed from: e */
        public int f108490e;

        private C41682b(C1293v vVar, int i, int i2, int i3, int i4) {
            this.f108486a = vVar;
            this.f108487b = i;
            this.f108488c = i2;
            this.f108489d = i3;
            this.f108490e = i4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo102447c(C1293v vVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo102448k(C1293v vVar);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo102449l(C1293v vVar);

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
        ArrayList<C41681a> arrayList = this.f108457r;
        C41681a aVar = new C41681a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5333c() {
        if (!mo5331b()) {
            mo5735e();
        }
    }

    /* renamed from: b */
    public final boolean mo5331b() {
        if (!this.f108455p.isEmpty() || !this.f108457r.isEmpty() || !this.f108456q.isEmpty() || !this.f108454o.isEmpty() || !this.f108450e.isEmpty() || !this.f108451f.isEmpty() || !this.f108449d.isEmpty() || !this.f108452g.isEmpty() || !this.f108447b.isEmpty() || !this.f108446a.isEmpty() || !this.f108448c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5324a() {
        long j;
        long j2;
        boolean z = !this.f108454o.isEmpty();
        boolean z2 = !this.f108456q.isEmpty();
        boolean z3 = !this.f108457r.isEmpty();
        boolean z4 = !this.f108455p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f108454o.iterator();
            while (it.hasNext()) {
                m132725p((C1293v) it.next());
            }
            this.f108454o.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f108456q);
                this.f108447b.add(arrayList);
                this.f108456q.clear();
                C416751 r6 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f108447b.remove(arrayList)) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C41682b bVar = (C41682b) it.next();
                                BaseItemAnimator.this.mo102446b(bVar.f108486a, bVar.f108487b, bVar.f108488c, bVar.f108489d, bVar.f108490e);
                            }
                            arrayList.clear();
                        }
                    }
                };
                if (z) {
                    C0991u.m4191a(((C41682b) arrayList.get(0)).f108486a.itemView, (Runnable) r6, this.f4941j);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f108457r);
                this.f108448c.add(arrayList2);
                this.f108457r.clear();
                C416762 r62 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f108448c.remove(arrayList2)) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                BaseItemAnimator.this.mo102445a((C41681a) it.next());
                            }
                            arrayList2.clear();
                        }
                    }
                };
                if (z) {
                    C0991u.m4191a(((C41681a) arrayList2.get(0)).f108480a.itemView, (Runnable) r62, this.f4941j);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f108455p);
                this.f108446a.add(arrayList3);
                this.f108455p.clear();
                C416773 r5 = new Runnable() {
                    public final void run() {
                        if (BaseItemAnimator.this.f108446a.remove(arrayList3)) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                BaseItemAnimator.this.mo102450m((C1293v) it.next());
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
        int size = this.f108456q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C41682b bVar = (C41682b) this.f108456q.get(size);
            View view = bVar.f108486a.itemView;
            C0991u.m4200b(view, 0.0f);
            C0991u.m4177a(view, 0.0f);
            mo6004i(bVar.f108486a);
            this.f108456q.remove(size);
        }
        for (int size2 = this.f108454o.size() - 1; size2 >= 0; size2--) {
            mo6003h((C1293v) this.f108454o.get(size2));
            this.f108454o.remove(size2);
        }
        for (int size3 = this.f108455p.size() - 1; size3 >= 0; size3--) {
            C1293v vVar = (C1293v) this.f108455p.get(size3);
            m132718a(vVar.itemView);
            mo6005j(vVar);
            this.f108455p.remove(size3);
        }
        for (int size4 = this.f108457r.size() - 1; size4 >= 0; size4--) {
            m132722b((C41681a) this.f108457r.get(size4));
        }
        this.f108457r.clear();
        if (mo5331b()) {
            for (int size5 = this.f108447b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f108447b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C41682b bVar2 = (C41682b) arrayList.get(size6);
                    View view2 = bVar2.f108486a.itemView;
                    C0991u.m4200b(view2, 0.0f);
                    C0991u.m4177a(view2, 0.0f);
                    mo6004i(bVar2.f108486a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f108447b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f108446a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f108446a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1293v vVar2 = (C1293v) arrayList2.get(size8);
                    C0991u.m4205c(vVar2.itemView, 1.0f);
                    mo6005j(vVar2);
                    if (size8 < arrayList2.size()) {
                        arrayList2.remove(size8);
                    }
                    if (arrayList2.isEmpty()) {
                        this.f108446a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f108448c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f108448c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m132722b((C41681a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f108448c.remove(arrayList3);
                    }
                }
            }
            m132719a((List<C1293v>) this.f108451f);
            m132719a((List<C1293v>) this.f108450e);
            m132719a((List<C1293v>) this.f108449d);
            m132719a((List<C1293v>) this.f108452g);
            mo5735e();
        }
    }

    /* renamed from: n */
    private void m132723n(C1293v vVar) {
        m132718a(vVar.itemView);
    }

    /* renamed from: o */
    private void m132724o(C1293v vVar) {
        m132718a(vVar.itemView);
        mo102447c(vVar);
    }

    /* renamed from: p */
    private void m132725p(C1293v vVar) {
        mo102448k(vVar);
        this.f108451f.add(vVar);
    }

    /* renamed from: a */
    public final boolean mo5326a(C1293v vVar) {
        mo5336d(vVar);
        m132723n(vVar);
        this.f108454o.add(vVar);
        return true;
    }

    /* renamed from: b */
    public final boolean mo5332b(C1293v vVar) {
        mo5336d(vVar);
        m132724o(vVar);
        this.f108455p.add(vVar);
        return true;
    }

    /* renamed from: m */
    public final void mo102450m(C1293v vVar) {
        mo102449l(vVar);
        this.f108449d.add(vVar);
    }

    /* renamed from: a */
    private static void m132719a(List<C1293v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0991u.m4238q(((C1293v) list.get(size)).itemView).mo3804b();
        }
    }

    /* renamed from: b */
    private void m132722b(C41681a aVar) {
        if (aVar.f108480a != null) {
            m132721a(aVar, aVar.f108480a);
        }
        if (aVar.f108481b != null) {
            m132721a(aVar, aVar.f108481b);
        }
    }

    /* renamed from: a */
    public static void m132718a(View view) {
        C0991u.m4205c(view, 1.0f);
        C0991u.m4221h(view, 1.0f);
        C0991u.m4218g(view, 1.0f);
        C0991u.m4200b(view, 0.0f);
        C0991u.m4177a(view, 0.0f);
        C0991u.m4233l(view, 0.0f);
        C0991u.m4208d(view, 0.0f);
        C0991u.m4215f(view, 0.0f);
        C0991u.m4213e(view, 0.0f);
        C0991u.m4227j(view, (float) (view.getMeasuredHeight() / 2));
        C0991u.m4224i(view, (float) (view.getMeasuredWidth() / 2));
        C0991u.m4238q(view).mo3801a((Interpolator) null).mo3803b(0);
    }

    /* renamed from: a */
    public final void mo102445a(final C41681a aVar) {
        View view;
        C1293v vVar = aVar.f108480a;
        final View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C1293v vVar2 = aVar.f108481b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            this.f108452g.add(aVar.f108480a);
            final C0998y a = C0991u.m4238q(view).mo3798a(this.f4943l);
            a.mo3802b((float) (aVar.f108484e - aVar.f108482c));
            a.mo3805c((float) (aVar.f108485f - aVar.f108483d));
            a.mo3797a(0.0f).mo3800a((C1002z) new VpaListenerAdapter() {
                /* renamed from: a */
                public final void mo3626a(View view) {
                }

                /* renamed from: b */
                public final void mo3627b(View view) {
                    a.mo3800a((C1002z) null);
                    C0991u.m4205c(view, 1.0f);
                    C0991u.m4177a(view, 0.0f);
                    C0991u.m4200b(view, 0.0f);
                    BaseItemAnimator.this.mo6002a(aVar.f108480a, true);
                    BaseItemAnimator.this.f108452g.remove(aVar.f108480a);
                    BaseItemAnimator.this.mo5333c();
                }
            }).mo3806c();
        }
        if (view2 != null) {
            this.f108452g.add(aVar.f108481b);
            final C0998y q = C0991u.m4238q(view2);
            q.mo3802b(0.0f).mo3805c(0.0f).mo3798a(this.f4943l).mo3797a(1.0f).mo3800a((C1002z) new VpaListenerAdapter() {
                /* renamed from: a */
                public final void mo3626a(View view) {
                }

                /* renamed from: b */
                public final void mo3627b(View view) {
                    q.mo3800a((C1002z) null);
                    C0991u.m4205c(view2, 1.0f);
                    C0991u.m4177a(view2, 0.0f);
                    C0991u.m4200b(view2, 0.0f);
                    BaseItemAnimator.this.mo6002a(aVar.f108481b, false);
                    BaseItemAnimator.this.f108452g.remove(aVar.f108481b);
                    BaseItemAnimator.this.mo5333c();
                }
            }).mo3806c();
        }
    }

    /* renamed from: d */
    public final void mo5336d(C1293v vVar) {
        View view = vVar.itemView;
        C0991u.m4238q(view).mo3804b();
        int size = this.f108456q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C41682b) this.f108456q.get(size)).f108486a == vVar) {
                C0991u.m4200b(view, 0.0f);
                C0991u.m4177a(view, 0.0f);
                mo6004i(vVar);
                this.f108456q.remove(size);
            }
        }
        m132720a((List<C41681a>) this.f108457r, vVar);
        if (this.f108454o.remove(vVar)) {
            m132718a(vVar.itemView);
            mo6003h(vVar);
        }
        if (this.f108455p.remove(vVar)) {
            m132718a(vVar.itemView);
            mo6005j(vVar);
        }
        for (int size2 = this.f108448c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f108448c.get(size2);
            m132720a((List<C41681a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f108448c.remove(size2);
            }
        }
        for (int size3 = this.f108447b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f108447b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C41682b) arrayList2.get(size4)).f108486a == vVar) {
                    C0991u.m4200b(view, 0.0f);
                    C0991u.m4177a(view, 0.0f);
                    mo6004i(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f108447b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f108446a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f108446a.get(size5);
            if (arrayList3.remove(vVar)) {
                m132718a(vVar.itemView);
                mo6005j(vVar);
                if (arrayList3.isEmpty()) {
                    this.f108446a.remove(size5);
                }
            }
        }
        this.f108451f.remove(vVar);
        this.f108449d.remove(vVar);
        this.f108452g.remove(vVar);
        this.f108450e.remove(vVar);
        mo5333c();
    }

    /* renamed from: a */
    private void m132720a(List<C41681a> list, C1293v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C41681a aVar = (C41681a) list.get(size);
            if (m132721a(aVar, vVar) && aVar.f108480a == null && aVar.f108481b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m132721a(C41681a aVar, C1293v vVar) {
        boolean z = false;
        if (aVar.f108481b == vVar) {
            aVar.f108481b = null;
        } else if (aVar.f108480a != vVar) {
            return false;
        } else {
            aVar.f108480a = null;
            z = true;
        }
        C0991u.m4205c(vVar.itemView, 1.0f);
        C0991u.m4177a(vVar.itemView, 0.0f);
        C0991u.m4200b(vVar.itemView, 0.0f);
        mo6002a(vVar, z);
        return true;
    }

    /* renamed from: b */
    public final void mo102446b(C1293v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            C0991u.m4238q(view).mo3802b(0.0f);
        }
        if (i6 != 0) {
            C0991u.m4238q(view).mo3805c(0.0f);
        }
        this.f108450e.add(vVar);
        final C0998y q = C0991u.m4238q(view);
        C0998y a = q.mo3798a(this.f4942k);
        final C1293v vVar2 = vVar;
        C416784 r1 = new VpaListenerAdapter() {
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
                BaseItemAnimator.this.f108450e.remove(vVar2);
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
        ArrayList<C41682b> arrayList = this.f108456q;
        C41682b bVar = new C41682b(vVar, m, n, i3, i4);
        arrayList.add(bVar);
        return true;
    }
}
