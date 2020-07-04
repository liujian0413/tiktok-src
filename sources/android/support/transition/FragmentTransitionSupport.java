package android.support.transition;

import android.graphics.Rect;
import android.support.p022v4.app.C0646u;
import android.support.transition.C0508m.C0513b;
import android.support.transition.C0508m.C0514c;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport extends C0646u {
    /* renamed from: a */
    public final boolean mo2033a(Object obj) {
        return obj instanceof C0508m;
    }

    /* renamed from: b */
    public final Object mo2034b(Object obj) {
        if (obj != null) {
            return ((C0508m) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo2039c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0520q qVar = new C0520q();
        qVar.mo2151a((C0508m) obj);
        return qVar;
    }

    /* renamed from: a */
    private static boolean m1958a(C0508m mVar) {
        if (!m2788a((List) mVar.f2026f) || !m2788a((List) mVar.f2028h) || !m2788a((List) mVar.f2029i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2026a(ViewGroup viewGroup, Object obj) {
        C0516o.m2171a(viewGroup, (C0508m) obj);
    }

    /* renamed from: b */
    public final void mo2036b(Object obj, View view) {
        if (obj != null) {
            ((C0508m) obj).mo2131b(view);
        }
    }

    /* renamed from: c */
    public final void mo2040c(Object obj, View view) {
        if (obj != null) {
            ((C0508m) obj).mo2134c(view);
        }
    }

    /* renamed from: a */
    public final void mo2027a(Object obj, final Rect rect) {
        if (obj != null) {
            ((C0508m) obj).mo2121a((C0513b) new C0513b() {
                /* renamed from: a */
                public final Rect mo2041a(C0508m mVar) {
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo2028a(Object obj, View view) {
        if (view != null) {
            C0508m mVar = (C0508m) obj;
            final Rect rect = new Rect();
            m2786a(view, rect);
            mVar.mo2121a((C0513b) new C0513b() {
                /* renamed from: a */
                public final Rect mo2041a(C0508m mVar) {
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo2031a(Object obj, ArrayList<View> arrayList) {
        C0508m mVar = (C0508m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C0520q) {
                C0520q qVar = (C0520q) mVar;
                int g = qVar.mo2156g();
                while (i < g) {
                    mo2031a((Object) qVar.mo2153c(i), arrayList);
                    i++;
                }
                return;
            }
            if (!m1958a(mVar) && m2788a((List) mVar.f2027g)) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo2131b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo2037b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((C0508m) obj).mo2117a((C0514c) new C0514c() {
            /* renamed from: b */
            public final void mo2043b(C0508m mVar) {
            }

            /* renamed from: c */
            public final void mo2044c(C0508m mVar) {
            }

            /* renamed from: d */
            public final void mo2045d(C0508m mVar) {
            }

            /* renamed from: a */
            public final void mo2042a(C0508m mVar) {
                mVar.mo2130b((C0514c) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    /* renamed from: a */
    public final Object mo2025a(Object obj, Object obj2, Object obj3) {
        C0520q qVar = new C0520q();
        if (obj != null) {
            qVar.mo2151a((C0508m) obj);
        }
        if (obj2 != null) {
            qVar.mo2151a((C0508m) obj2);
        }
        if (obj3 != null) {
            qVar.mo2151a((C0508m) obj3);
        }
        return qVar;
    }

    /* renamed from: b */
    public final Object mo2035b(Object obj, Object obj2, Object obj3) {
        C0508m mVar = (C0508m) obj;
        C0508m mVar2 = (C0508m) obj2;
        C0508m mVar3 = (C0508m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new C0520q().mo2151a(mVar).mo2151a(mVar2).mo2150a(1);
        } else if (mVar == null) {
            if (mVar2 != null) {
                mVar = mVar2;
            } else {
                mVar = null;
            }
        }
        if (mVar3 == null) {
            return mVar;
        }
        C0520q qVar = new C0520q();
        if (mVar != null) {
            qVar.mo2151a(mVar);
        }
        qVar.mo2151a(mVar3);
        return qVar;
    }

    /* renamed from: b */
    public final void mo2038b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C0508m mVar = (C0508m) obj;
        int i2 = 0;
        if (mVar instanceof C0520q) {
            C0520q qVar = (C0520q) mVar;
            int g = qVar.mo2156g();
            while (i2 < g) {
                mo2038b((Object) qVar.mo2153c(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (!m1958a(mVar)) {
            ArrayList<View> arrayList3 = mVar.f2027g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.mo2131b((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.mo2134c((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2029a(Object obj, View view, ArrayList<View> arrayList) {
        C0520q qVar = (C0520q) obj;
        ArrayList<View> arrayList2 = qVar.f2027g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m2787a((List<View>) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo2031a((Object) qVar, arrayList);
    }

    /* renamed from: a */
    public final void mo2032a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0520q qVar = (C0520q) obj;
        if (qVar != null) {
            qVar.f2027g.clear();
            qVar.f2027g.addAll(arrayList2);
            mo2038b((Object) qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo2030a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        C0508m mVar = (C0508m) obj;
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        C04513 r1 = new C0514c() {
            /* renamed from: a */
            public final void mo2042a(C0508m mVar) {
            }

            /* renamed from: b */
            public final void mo2043b(C0508m mVar) {
            }

            /* renamed from: c */
            public final void mo2044c(C0508m mVar) {
            }

            /* renamed from: d */
            public final void mo2045d(C0508m mVar) {
                if (obj5 != null) {
                    FragmentTransitionSupport.this.mo2038b(obj5, arrayList4, null);
                }
                if (obj6 != null) {
                    FragmentTransitionSupport.this.mo2038b(obj6, arrayList5, null);
                }
                if (obj7 != null) {
                    FragmentTransitionSupport.this.mo2038b(obj7, arrayList6, null);
                }
            }
        };
        mVar.mo2117a((C0514c) r1);
    }
}
