package android.support.transition;

import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.view.C0991u;
import android.support.transition.C0508m.C0514c;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.o */
public final class C0516o {

    /* renamed from: a */
    static ArrayList<ViewGroup> f2054a = new ArrayList<>();

    /* renamed from: b */
    private static C0508m f2055b = new C0475b();

    /* renamed from: c */
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<C0508m>>>> f2056c = new ThreadLocal<>();

    /* renamed from: android.support.transition.o$a */
    static class C0517a implements OnAttachStateChangeListener, OnPreDrawListener {

        /* renamed from: a */
        C0508m f2057a;

        /* renamed from: b */
        ViewGroup f2058b;

        public final void onViewAttachedToWindow(View view) {
        }

        /* renamed from: a */
        private void m2174a() {
            this.f2058b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2058b.removeOnAttachStateChangeListener(this);
        }

        public final boolean onPreDraw() {
            m2174a();
            if (!C0516o.f2054a.remove(this.f2058b)) {
                return true;
            }
            final ArrayMap a = C0516o.m2170a();
            ArrayList arrayList = (ArrayList) a.get(this.f2058b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f2058b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f2057a);
            this.f2057a.mo2117a((C0514c) new C0515n() {
                /* renamed from: a */
                public final void mo2042a(C0508m mVar) {
                    ((ArrayList) a.get(C0517a.this.f2058b)).remove(mVar);
                }
            });
            this.f2057a.mo2125a(this.f2058b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0508m) it.next()).mo2141e(this.f2058b);
                }
            }
            this.f2057a.mo2123a(this.f2058b);
            return true;
        }

        public final void onViewDetachedFromWindow(View view) {
            m2174a();
            C0516o.f2054a.remove(this.f2058b);
            ArrayList arrayList = (ArrayList) C0516o.m2170a().get(this.f2058b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0508m) it.next()).mo2141e(this.f2058b);
                }
            }
            this.f2057a.mo2126a(true);
        }

        C0517a(C0508m mVar, ViewGroup viewGroup) {
            this.f2057a = mVar;
            this.f2058b = viewGroup;
        }
    }

    /* renamed from: a */
    static ArrayMap<ViewGroup, ArrayList<C0508m>> m2170a() {
        WeakReference weakReference = (WeakReference) f2056c.get();
        if (weakReference != null) {
            ArrayMap<ViewGroup, ArrayList<C0508m>> arrayMap = (ArrayMap) weakReference.get();
            if (arrayMap != null) {
                return arrayMap;
            }
        }
        ArrayMap<ViewGroup, ArrayList<C0508m>> arrayMap2 = new ArrayMap<>();
        f2056c.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    /* renamed from: b */
    private static void m2172b(ViewGroup viewGroup, C0508m mVar) {
        if (mVar != null && viewGroup != null) {
            C0517a aVar = new C0517a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m2173c(ViewGroup viewGroup, C0508m mVar) {
        ArrayList arrayList = (ArrayList) m2170a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0508m) it.next()).mo2139d(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo2125a(viewGroup, true);
        }
        C0496j a = C0496j.m2094a(viewGroup);
        if (a != null) {
            a.mo2110a();
        }
    }

    /* renamed from: a */
    public static void m2171a(ViewGroup viewGroup, C0508m mVar) {
        if (!f2054a.contains(viewGroup) && C0991u.m4167D(viewGroup)) {
            f2054a.add(viewGroup);
            if (mVar == null) {
                mVar = f2055b;
            }
            C0508m f = mVar.clone();
            m2173c(viewGroup, f);
            C0496j.m2095a(viewGroup, null);
            m2172b(viewGroup, f);
        }
    }
}
