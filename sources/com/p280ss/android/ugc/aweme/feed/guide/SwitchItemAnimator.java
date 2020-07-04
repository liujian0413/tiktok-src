package com.p280ss.android.ugc.aweme.feed.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.common.utility.C9738o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.SwitchItemAnimator */
public class SwitchItemAnimator extends SimpleItemAnimator {

    /* renamed from: o */
    private static TimeInterpolator f74771o;

    /* renamed from: a */
    ArrayList<ArrayList<C1293v>> f74772a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C28380b>> f74773b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C28379a>> f74774c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C1293v> f74775d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C1293v> f74776e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C1293v> f74777f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C1293v> f74778g = new ArrayList<>();

    /* renamed from: n */
    public RecyclerView f74779n;

    /* renamed from: p */
    private ArrayList<C1293v> f74780p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C1293v> f74781q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C28380b> f74782r = new ArrayList<>();

    /* renamed from: s */
    private ArrayList<C28379a> f74783s = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.SwitchItemAnimator$a */
    static class C28379a {

        /* renamed from: a */
        public C1293v f74810a;

        /* renamed from: b */
        public C1293v f74811b;

        /* renamed from: c */
        public int f74812c;

        /* renamed from: d */
        public int f74813d;

        /* renamed from: e */
        public int f74814e;

        /* renamed from: f */
        public int f74815f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f74810a);
            sb.append(", newHolder=");
            sb.append(this.f74811b);
            sb.append(", fromX=");
            sb.append(this.f74812c);
            sb.append(", fromY=");
            sb.append(this.f74813d);
            sb.append(", toX=");
            sb.append(this.f74814e);
            sb.append(", toY=");
            sb.append(this.f74815f);
            sb.append('}');
            return sb.toString();
        }

        private C28379a(C1293v vVar, C1293v vVar2) {
            this.f74810a = vVar;
            this.f74811b = vVar2;
        }

        C28379a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f74812c = i;
            this.f74813d = i2;
            this.f74814e = i3;
            this.f74815f = i4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.SwitchItemAnimator$b */
    static class C28380b {

        /* renamed from: a */
        public C1293v f74816a;

        /* renamed from: b */
        public int f74817b;

        /* renamed from: c */
        public int f74818c;

        /* renamed from: d */
        public int f74819d;

        /* renamed from: e */
        public int f74820e;

        C28380b(C1293v vVar, int i, int i2, int i3, int i4) {
            this.f74816a = vVar;
            this.f74817b = i;
            this.f74818c = i2;
            this.f74819d = i3;
            this.f74820e = i4;
        }
    }

    /* renamed from: a */
    public final boolean mo5327a(C1293v vVar, int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        vVar.itemView.setTranslationX((float) i5);
        vVar.itemView.setAlpha(0.34f);
        vVar.itemView.setScaleX(0.9f);
        vVar.itemView.setScaleY(0.9f);
        vVar.itemView.setTranslationY(m93296a(vVar, 12.0f));
        if (Math.abs(i5) >= vVar.itemView.getWidth() / 2) {
            ArrayList<C28380b> arrayList = this.f74782r;
            C28380b bVar = new C28380b(vVar, i, i2, i3, i4);
            arrayList.add(bVar);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5328a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4) {
        if (vVar == vVar2) {
            return mo5327a(vVar, i, i2, i3, i4);
        }
        float translationX = vVar.itemView.getTranslationX();
        float translationY = vVar.itemView.getTranslationY();
        float alpha = vVar.itemView.getAlpha();
        m93302l(vVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        vVar.itemView.setTranslationX(translationX);
        vVar.itemView.setTranslationY(translationY);
        vVar.itemView.setAlpha(alpha);
        if (vVar2 != null) {
            m93302l(vVar2);
            vVar2.itemView.setTranslationX((float) (-i5));
            vVar2.itemView.setTranslationY((float) (-i6));
            vVar2.itemView.setAlpha(0.0f);
        }
        ArrayList<C28379a> arrayList = this.f74783s;
        C28379a aVar = new C28379a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
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
    public final boolean mo5331b() {
        if (!this.f74781q.isEmpty() || !this.f74783s.isEmpty() || !this.f74782r.isEmpty() || !this.f74780p.isEmpty() || !this.f74776e.isEmpty() || !this.f74777f.isEmpty() || !this.f74775d.isEmpty() || !this.f74778g.isEmpty() || !this.f74773b.isEmpty() || !this.f74772a.isEmpty() || !this.f74774c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5324a() {
        long j;
        long j2;
        boolean z = !this.f74780p.isEmpty();
        boolean z2 = !this.f74782r.isEmpty();
        boolean z3 = !this.f74783s.isEmpty();
        boolean z4 = !this.f74781q.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f74780p.iterator();
            while (it.hasNext()) {
                m93301k((C1293v) it.next());
            }
            this.f74780p.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f74782r);
                this.f74773b.add(arrayList);
                this.f74782r.clear();
                C283701 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C28380b bVar = (C28380b) it.next();
                            SwitchItemAnimator.this.mo72093b(bVar.f74816a, bVar.f74817b, bVar.f74818c, bVar.f74819d, bVar.f74820e);
                        }
                        arrayList.clear();
                        SwitchItemAnimator.this.f74773b.remove(arrayList);
                    }
                };
                if (z) {
                    C0991u.m4191a(((C28380b) arrayList.get(0)).f74816a.itemView, (Runnable) r6, this.f4941j);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f74783s);
                this.f74774c.add(arrayList2);
                this.f74783s.clear();
                C283712 r62 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            SwitchItemAnimator.this.mo72092a((C28379a) it.next());
                        }
                        arrayList2.clear();
                        SwitchItemAnimator.this.f74774c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0991u.m4191a(((C28379a) arrayList2.get(0)).f74810a.itemView, (Runnable) r62, this.f4941j);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f74781q);
                this.f74772a.add(arrayList3);
                this.f74781q.clear();
                C283723 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            SwitchItemAnimator.this.mo72094c((C1293v) it.next());
                        }
                        arrayList3.clear();
                        SwitchItemAnimator.this.f74772a.remove(arrayList3);
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
        int size = this.f74782r.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C28380b bVar = (C28380b) this.f74782r.get(size);
            View view = bVar.f74816a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo6004i(bVar.f74816a);
            this.f74782r.remove(size);
        }
        for (int size2 = this.f74780p.size() - 1; size2 >= 0; size2--) {
            mo6003h((C1293v) this.f74780p.get(size2));
            this.f74780p.remove(size2);
        }
        int size3 = this.f74781q.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C1293v vVar = (C1293v) this.f74781q.get(size3);
            vVar.itemView.setAlpha(1.0f);
            mo6005j(vVar);
            this.f74781q.remove(size3);
        }
        for (int size4 = this.f74783s.size() - 1; size4 >= 0; size4--) {
            m93300b((C28379a) this.f74783s.get(size4));
        }
        this.f74783s.clear();
        if (mo5331b()) {
            for (int size5 = this.f74773b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f74773b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C28380b bVar2 = (C28380b) arrayList.get(size6);
                    View view2 = bVar2.f74816a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo6004i(bVar2.f74816a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f74773b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f74772a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f74772a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1293v vVar2 = (C1293v) arrayList2.get(size8);
                    vVar2.itemView.setAlpha(1.0f);
                    mo6005j(vVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f74772a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f74774c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f74774c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m93300b((C28379a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f74774c.remove(arrayList3);
                    }
                }
            }
            m93297a((List<C1293v>) this.f74777f);
            m93297a((List<C1293v>) this.f74776e);
            m93297a((List<C1293v>) this.f74775d);
            m93297a((List<C1293v>) this.f74778g);
            mo5735e();
        }
    }

    /* renamed from: a */
    public final boolean mo5326a(C1293v vVar) {
        m93302l(vVar);
        this.f74780p.add(vVar);
        return true;
    }

    /* renamed from: b */
    private void m93300b(C28379a aVar) {
        if (aVar.f74810a != null) {
            m93299a(aVar, aVar.f74810a);
        }
        if (aVar.f74811b != null) {
            m93299a(aVar, aVar.f74811b);
        }
    }

    /* renamed from: l */
    private void m93302l(C1293v vVar) {
        if (f74771o == null) {
            f74771o = new ValueAnimator().getInterpolator();
        }
        vVar.itemView.animate().setInterpolator(f74771o);
        mo5336d(vVar);
    }

    /* renamed from: a */
    private static void m93297a(List<C1293v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C1293v) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: k */
    private void m93301k(final C1293v vVar) {
        this.f74777f.add(vVar);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = vVar.itemView;
                Float f = (Float) valueAnimator.getAnimatedValue();
                view.setAlpha(1.0f - f.floatValue());
                view.setScaleX(1.0f - (f.floatValue() * 0.5f));
                view.setScaleY(1.0f - (f.floatValue() * 0.5f));
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                ofFloat.removeAllListeners();
                SwitchItemAnimator.this.mo6003h(vVar);
                SwitchItemAnimator.this.f74777f.remove(vVar);
                SwitchItemAnimator.this.mo5333c();
            }
        });
        ofFloat.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo72094c(final C1293v vVar) {
        final View view = vVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f74775d.add(vVar);
        animate.translationX(0.0f).setDuration(300).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                view.setTranslationX(0.0f);
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                SwitchItemAnimator.this.mo6005j(vVar);
                SwitchItemAnimator.this.f74775d.remove(vVar);
                SwitchItemAnimator.this.mo5333c();
            }
        }).start();
    }

    public SwitchItemAnimator(RecyclerView recyclerView) {
        this.f74779n = recyclerView;
    }

    /* renamed from: b */
    public final boolean mo5332b(C1293v vVar) {
        m93302l(vVar);
        vVar.itemView.setAlpha(0.34f);
        if (vVar.getAdapterPosition() > ((GalleryLayoutManager) this.f74779n.getLayoutManager()).f74738a) {
            vVar.itemView.setTranslationX((float) this.f74779n.getWidth());
        } else {
            vVar.itemView.setTranslationX((float) (-this.f74779n.getWidth()));
        }
        this.f74781q.add(vVar);
        return true;
    }

    /* renamed from: d */
    public final void mo5336d(C1293v vVar) {
        View view = vVar.itemView;
        view.animate().cancel();
        int size = this.f74782r.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C28380b) this.f74782r.get(size)).f74816a == vVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo6004i(vVar);
                this.f74782r.remove(size);
            }
        }
        m93298a((List<C28379a>) this.f74783s, vVar);
        if (this.f74780p.remove(vVar)) {
            view.setAlpha(1.0f);
            mo6003h(vVar);
        }
        if (this.f74781q.remove(vVar)) {
            view.setAlpha(1.0f);
            mo6005j(vVar);
        }
        for (int size2 = this.f74774c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f74774c.get(size2);
            m93298a((List<C28379a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f74774c.remove(size2);
            }
        }
        for (int size3 = this.f74773b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f74773b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C28380b) arrayList2.get(size4)).f74816a == vVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo6004i(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f74773b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f74772a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f74772a.get(size5);
            if (arrayList3.remove(vVar)) {
                view.setAlpha(1.0f);
                mo6005j(vVar);
                if (arrayList3.isEmpty()) {
                    this.f74772a.remove(size5);
                }
            }
        }
        this.f74777f.remove(vVar);
        this.f74775d.remove(vVar);
        this.f74778g.remove(vVar);
        this.f74776e.remove(vVar);
        mo5333c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo72092a(final C28379a aVar) {
        final View view;
        C1293v vVar = aVar.f74810a;
        final View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C1293v vVar2 = aVar.f74811b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(this.f4943l);
            this.f74778g.add(aVar.f74810a);
            duration.translationX((float) (aVar.f74814e - aVar.f74812c));
            duration.translationY((float) (aVar.f74815f - aVar.f74813d));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    SwitchItemAnimator.this.mo6002a(aVar.f74810a, true);
                    SwitchItemAnimator.this.f74778g.remove(aVar.f74810a);
                    SwitchItemAnimator.this.mo5333c();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.f74778g.add(aVar.f74811b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(this.f4943l).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    SwitchItemAnimator.this.mo6002a(aVar.f74811b, false);
                    SwitchItemAnimator.this.f74778g.remove(aVar.f74811b);
                    SwitchItemAnimator.this.mo5333c();
                }
            }).start();
        }
    }

    /* renamed from: a */
    private static float m93296a(C1293v vVar, float f) {
        if (vVar.itemView.getContext() != null) {
            return C9738o.m28708b(vVar.itemView.getContext(), f);
        }
        return 12.0f;
    }

    /* renamed from: a */
    private void m93298a(List<C28379a> list, C1293v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C28379a aVar = (C28379a) list.get(size);
            if (m93299a(aVar, vVar) && aVar.f74810a == null && aVar.f74811b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m93299a(C28379a aVar, C1293v vVar) {
        boolean z = false;
        if (aVar.f74811b == vVar) {
            aVar.f74811b = null;
        } else if (aVar.f74810a != vVar) {
            return false;
        } else {
            aVar.f74810a = null;
            z = true;
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        vVar.itemView.setTranslationY(0.0f);
        mo6002a(vVar, z);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo72091a(C1293v vVar, float f, ValueAnimator valueAnimator) {
        View view = vVar.itemView;
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        view.setTranslationX((1.0f - f2.floatValue()) * f);
        view.setAlpha((f2.floatValue() * 0.65999997f) + 0.34f);
        view.setScaleX((f2.floatValue() * 0.100000024f) + 0.9f);
        view.setScaleY((f2.floatValue() * 0.100000024f) + 0.9f);
        view.setTranslationY(m93296a(vVar, (1.0f - f2.floatValue()) * 12.0f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo72093b(final C1293v vVar, int i, int i2, int i3, int i4) {
        this.f74776e.add(vVar);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        float translationX = vVar.itemView.getTranslationX();
        ofFloat.setDuration(400);
        ofFloat.addUpdateListener(new C28408o(this, vVar, translationX));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                ofFloat.removeAllListeners();
                SwitchItemAnimator.this.mo6004i(vVar);
                SwitchItemAnimator.this.f74776e.remove(vVar);
                SwitchItemAnimator.this.mo5333c();
            }
        });
        ofFloat.setStartDelay(100);
        ofFloat.start();
    }
}
