package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: android.support.transition.l */
public final class C0498l extends C0467aj {

    /* renamed from: q */
    private static final TimeInterpolator f2000q = new DecelerateInterpolator();

    /* renamed from: r */
    private static final TimeInterpolator f2001r = new AccelerateInterpolator();

    /* renamed from: t */
    private static final C0505a f2002t = new C0506b() {
        /* renamed from: a */
        public final float mo2113a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: u */
    private static final C0505a f2003u = new C0506b() {
        /* renamed from: a */
        public final float mo2113a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C0991u.m4220h(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: v */
    private static final C0505a f2004v = new C0507c() {
        /* renamed from: b */
        public final float mo2114b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: w */
    private static final C0505a f2005w = new C0506b() {
        /* renamed from: a */
        public final float mo2113a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: x */
    private static final C0505a f2006x = new C0506b() {
        /* renamed from: a */
        public final float mo2113a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C0991u.m4220h(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: y */
    private static final C0505a f2007y = new C0507c() {
        /* renamed from: b */
        public final float mo2114b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: a */
    public int f2008a = 80;

    /* renamed from: s */
    private C0505a f2009s = f2007y;

    /* renamed from: android.support.transition.l$a */
    interface C0505a {
        /* renamed from: a */
        float mo2113a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo2114b(ViewGroup viewGroup, View view);
    }

    /* renamed from: android.support.transition.l$b */
    static abstract class C0506b implements C0505a {
        private C0506b() {
        }

        /* renamed from: b */
        public final float mo2114b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: android.support.transition.l$c */
    static abstract class C0507c implements C0505a {
        private C0507c() {
        }

        /* renamed from: a */
        public final float mo2113a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public C0498l() {
        mo2112a(80);
    }

    /* renamed from: a */
    public final void mo1185a(C0524s sVar) {
        super.mo1185a(sVar);
        m2100d(sVar);
    }

    /* renamed from: b */
    public final void mo1186b(C0524s sVar) {
        super.mo1186b(sVar);
        m2100d(sVar);
    }

    /* renamed from: d */
    private static void m2100d(C0524s sVar) {
        int[] iArr = new int[2];
        sVar.f2073b.getLocationOnScreen(iArr);
        sVar.f2072a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public final void mo2112a(int i) {
        if (i == 3) {
            this.f2009s = f2002t;
        } else if (i == 5) {
            this.f2009s = f2005w;
        } else if (i == 48) {
            this.f2009s = f2004v;
        } else if (i == 80) {
            this.f2009s = f2007y;
        } else if (i == 8388611) {
            this.f2009s = f2003u;
        } else if (i == 8388613) {
            this.f2009s = f2006x;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f2008a = i;
        C0497k kVar = new C0497k();
        kVar.f1998a = i;
        mo2122a((C0519p) kVar);
    }

    /* renamed from: a */
    public final Animator mo2071a(ViewGroup viewGroup, View view, C0524s sVar, C0524s sVar2) {
        if (sVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) sVar2.f2072a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C0526u.m2218a(view, sVar2, iArr[0], iArr[1], this.f2009s.mo2113a(viewGroup, view), this.f2009s.mo2114b(viewGroup, view), translationX, translationY, f2000q);
    }

    /* renamed from: b */
    public final Animator mo2074b(ViewGroup viewGroup, View view, C0524s sVar, C0524s sVar2) {
        if (sVar == null) {
            return null;
        }
        int[] iArr = (int[]) sVar.f2072a.get("android:slide:screenPosition");
        return C0526u.m2218a(view, sVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f2009s.mo2113a(viewGroup, view), this.f2009s.mo2114b(viewGroup, view), f2001r);
    }
}
