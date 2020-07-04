package android.support.p029v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.DefaultItemAnimator */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* renamed from: n */
    private static TimeInterpolator f4658n;

    /* renamed from: a */
    ArrayList<ArrayList<C1293v>> f4659a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C1240b>> f4660b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C1239a>> f4661c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C1293v> f4662d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C1293v> f4663e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C1293v> f4664f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C1293v> f4665g = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<C1293v> f4666o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<C1293v> f4667p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C1240b> f4668q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C1239a> f4669r = new ArrayList<>();

    /* renamed from: android.support.v7.widget.DefaultItemAnimator$a */
    static class C1239a {

        /* renamed from: a */
        public C1293v f4698a;

        /* renamed from: b */
        public C1293v f4699b;

        /* renamed from: c */
        public int f4700c;

        /* renamed from: d */
        public int f4701d;

        /* renamed from: e */
        public int f4702e;

        /* renamed from: f */
        public int f4703f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f4698a);
            sb.append(", newHolder=");
            sb.append(this.f4699b);
            sb.append(", fromX=");
            sb.append(this.f4700c);
            sb.append(", fromY=");
            sb.append(this.f4701d);
            sb.append(", toX=");
            sb.append(this.f4702e);
            sb.append(", toY=");
            sb.append(this.f4703f);
            sb.append('}');
            return sb.toString();
        }

        private C1239a(C1293v vVar, C1293v vVar2) {
            this.f4698a = vVar;
            this.f4699b = vVar2;
        }

        C1239a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f4700c = i;
            this.f4701d = i2;
            this.f4702e = i3;
            this.f4703f = i4;
        }
    }

    /* renamed from: android.support.v7.widget.DefaultItemAnimator$b */
    static class C1240b {

        /* renamed from: a */
        public C1293v f4704a;

        /* renamed from: b */
        public int f4705b;

        /* renamed from: c */
        public int f4706c;

        /* renamed from: d */
        public int f4707d;

        /* renamed from: e */
        public int f4708e;

        C1240b(C1293v vVar, int i, int i2, int i3, int i4) {
            this.f4704a = vVar;
            this.f4705b = i;
            this.f4706c = i2;
            this.f4707d = i3;
            this.f4708e = i4;
        }
    }

    /* renamed from: a */
    public final boolean mo5329a(C1293v vVar, List<Object> list) {
        return !list.isEmpty() || super.mo5329a(vVar, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5333c() {
        if (!mo5331b()) {
            mo5735e();
        }
    }

    /* renamed from: b */
    public boolean mo5331b() {
        if (!this.f4667p.isEmpty() || !this.f4669r.isEmpty() || !this.f4668q.isEmpty() || !this.f4666o.isEmpty() || !this.f4663e.isEmpty() || !this.f4664f.isEmpty() || !this.f4662d.isEmpty() || !this.f4665g.isEmpty() || !this.f4660b.isEmpty() || !this.f4659a.isEmpty() || !this.f4661c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo5324a() {
        long j;
        long j2;
        boolean z = !this.f4666o.isEmpty();
        boolean z2 = !this.f4668q.isEmpty();
        boolean z3 = !this.f4669r.isEmpty();
        boolean z4 = !this.f4667p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f4666o.iterator();
            while (it.hasNext()) {
                m5599k((C1293v) it.next());
            }
            this.f4666o.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4668q);
                this.f4660b.add(arrayList);
                this.f4668q.clear();
                C12311 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1240b bVar = (C1240b) it.next();
                            DefaultItemAnimator.this.mo5330b(bVar.f4704a, bVar.f4705b, bVar.f4706c, bVar.f4707d, bVar.f4708e);
                        }
                        arrayList.clear();
                        DefaultItemAnimator.this.f4660b.remove(arrayList);
                    }
                };
                if (z) {
                    C0991u.m4191a(((C1240b) arrayList.get(0)).f4704a.itemView, (Runnable) r6, this.f4941j);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f4669r);
                this.f4661c.add(arrayList2);
                this.f4669r.clear();
                C12322 r62 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            DefaultItemAnimator.this.mo5325a((C1239a) it.next());
                        }
                        arrayList2.clear();
                        DefaultItemAnimator.this.f4661c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0991u.m4191a(((C1239a) arrayList2.get(0)).f4698a.itemView, (Runnable) r62, this.f4941j);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f4667p);
                this.f4659a.add(arrayList3);
                this.f4667p.clear();
                C12333 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            DefaultItemAnimator.this.mo5334c((C1293v) it.next());
                        }
                        arrayList3.clear();
                        DefaultItemAnimator.this.f4659a.remove(arrayList3);
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
    public void mo5335d() {
        int size = this.f4668q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1240b bVar = (C1240b) this.f4668q.get(size);
            View view = bVar.f4704a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo6004i(bVar.f4704a);
            this.f4668q.remove(size);
        }
        for (int size2 = this.f4666o.size() - 1; size2 >= 0; size2--) {
            mo6003h((C1293v) this.f4666o.get(size2));
            this.f4666o.remove(size2);
        }
        int size3 = this.f4667p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C1293v vVar = (C1293v) this.f4667p.get(size3);
            vVar.itemView.setAlpha(1.0f);
            mo6005j(vVar);
            this.f4667p.remove(size3);
        }
        for (int size4 = this.f4669r.size() - 1; size4 >= 0; size4--) {
            m5598b((C1239a) this.f4669r.get(size4));
        }
        this.f4669r.clear();
        if (mo5331b()) {
            for (int size5 = this.f4660b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f4660b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1240b bVar2 = (C1240b) arrayList.get(size6);
                    View view2 = bVar2.f4704a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo6004i(bVar2.f4704a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4660b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4659a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f4659a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1293v vVar2 = (C1293v) arrayList2.get(size8);
                    vVar2.itemView.setAlpha(1.0f);
                    mo6005j(vVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4659a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4661c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f4661c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5598b((C1239a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4661c.remove(arrayList3);
                    }
                }
            }
            m5595a((List<C1293v>) this.f4664f);
            m5595a((List<C1293v>) this.f4663e);
            m5595a((List<C1293v>) this.f4662d);
            m5595a((List<C1293v>) this.f4665g);
            mo5735e();
        }
    }

    /* renamed from: a */
    public boolean mo5326a(C1293v vVar) {
        m5600l(vVar);
        this.f4666o.add(vVar);
        return true;
    }

    /* renamed from: b */
    public boolean mo5332b(C1293v vVar) {
        m5600l(vVar);
        vVar.itemView.setAlpha(0.0f);
        this.f4667p.add(vVar);
        return true;
    }

    /* renamed from: a */
    private static void m5595a(List<C1293v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C1293v) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: b */
    private void m5598b(C1239a aVar) {
        if (aVar.f4698a != null) {
            m5597a(aVar, aVar.f4698a);
        }
        if (aVar.f4699b != null) {
            m5597a(aVar, aVar.f4699b);
        }
    }

    /* renamed from: l */
    private void m5600l(C1293v vVar) {
        if (f4658n == null) {
            f4658n = new ValueAnimator().getInterpolator();
        }
        vVar.itemView.animate().setInterpolator(f4658n);
        mo5336d(vVar);
    }

    /* renamed from: k */
    private void m5599k(final C1293v vVar) {
        final View view = vVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f4664f.add(vVar);
        animate.setDuration(this.f4941j).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                DefaultItemAnimator.this.mo6003h(vVar);
                DefaultItemAnimator.this.f4664f.remove(vVar);
                DefaultItemAnimator.this.mo5333c();
            }
        }).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5334c(final C1293v vVar) {
        final View view = vVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f4662d.add(vVar);
        animate.alpha(1.0f).setDuration(this.f4940i).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                DefaultItemAnimator.this.mo6005j(vVar);
                DefaultItemAnimator.this.f4662d.remove(vVar);
                DefaultItemAnimator.this.mo5333c();
            }
        }).start();
    }

    /* renamed from: d */
    public void mo5336d(C1293v vVar) {
        View view = vVar.itemView;
        view.animate().cancel();
        int size = this.f4668q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1240b) this.f4668q.get(size)).f4704a == vVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo6004i(vVar);
                this.f4668q.remove(size);
            }
        }
        m5596a((List<C1239a>) this.f4669r, vVar);
        if (this.f4666o.remove(vVar)) {
            view.setAlpha(1.0f);
            mo6003h(vVar);
        }
        if (this.f4667p.remove(vVar)) {
            view.setAlpha(1.0f);
            mo6005j(vVar);
        }
        for (int size2 = this.f4661c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f4661c.get(size2);
            m5596a((List<C1239a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f4661c.remove(size2);
            }
        }
        for (int size3 = this.f4660b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f4660b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1240b) arrayList2.get(size4)).f4704a == vVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo6004i(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4660b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4659a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f4659a.get(size5);
            if (arrayList3.remove(vVar)) {
                view.setAlpha(1.0f);
                mo6005j(vVar);
                if (arrayList3.isEmpty()) {
                    this.f4659a.remove(size5);
                }
            }
        }
        this.f4664f.remove(vVar);
        this.f4662d.remove(vVar);
        this.f4665g.remove(vVar);
        this.f4663e.remove(vVar);
        mo5333c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5325a(final C1239a aVar) {
        final View view;
        C1293v vVar = aVar.f4698a;
        final View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C1293v vVar2 = aVar.f4699b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(this.f4943l);
            this.f4665g.add(aVar.f4698a);
            duration.translationX((float) (aVar.f4702e - aVar.f4700c));
            duration.translationY((float) (aVar.f4703f - aVar.f4701d));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    DefaultItemAnimator.this.mo6002a(aVar.f4698a, true);
                    DefaultItemAnimator.this.f4665g.remove(aVar.f4698a);
                    DefaultItemAnimator.this.mo5333c();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.f4665g.add(aVar.f4699b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(this.f4943l).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    DefaultItemAnimator.this.mo6002a(aVar.f4699b, false);
                    DefaultItemAnimator.this.f4665g.remove(aVar.f4699b);
                    DefaultItemAnimator.this.mo5333c();
                }
            }).start();
        }
    }

    /* renamed from: a */
    private void m5596a(List<C1239a> list, C1293v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1239a aVar = (C1239a) list.get(size);
            if (m5597a(aVar, vVar) && aVar.f4698a == null && aVar.f4699b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m5597a(C1239a aVar, C1293v vVar) {
        boolean z = false;
        if (aVar.f4699b == vVar) {
            aVar.f4699b = null;
        } else if (aVar.f4698a != vVar) {
            return false;
        } else {
            aVar.f4698a = null;
            z = true;
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        vVar.itemView.setTranslationY(0.0f);
        mo6002a(vVar, z);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5330b(C1293v vVar, int i, int i2, int i3, int i4) {
        final View view = vVar.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.f4663e.add(vVar);
        ViewPropertyAnimator duration = animate.setDuration(this.f4942k);
        final C1293v vVar2 = vVar;
        C12366 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                DefaultItemAnimator.this.mo6004i(vVar2);
                DefaultItemAnimator.this.f4663e.remove(vVar2);
                DefaultItemAnimator.this.mo5333c();
            }
        };
        duration.setListener(r0).start();
    }

    /* renamed from: a */
    public final boolean mo5327a(C1293v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        int translationX = i + ((int) vVar.itemView.getTranslationX());
        int translationY = i2 + ((int) vVar.itemView.getTranslationY());
        m5600l(vVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo6004i(vVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C1240b> arrayList = this.f4668q;
        C1240b bVar = new C1240b(vVar, translationX, translationY, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo5328a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
        if (vVar == vVar2) {
            return mo5327a(vVar, i, i2, i3, i4);
        }
        float translationX = vVar.itemView.getTranslationX();
        float translationY = vVar.itemView.getTranslationY();
        float alpha = vVar.itemView.getAlpha();
        m5600l(vVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        vVar.itemView.setTranslationX(translationX);
        vVar.itemView.setTranslationY(translationY);
        vVar.itemView.setAlpha(alpha);
        if (vVar2 != null) {
            m5600l(vVar2);
            vVar2.itemView.setTranslationX((float) (-i5));
            vVar2.itemView.setTranslationY((float) (-i6));
            vVar2.itemView.setAlpha(0.0f);
        }
        ArrayList<C1239a> arrayList = this.f4669r;
        C1239a aVar = new C1239a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }
}
