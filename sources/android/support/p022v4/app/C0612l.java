package android.support.p022v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0070y;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.C0608j.C0610b;
import android.support.p022v4.app.Fragment.SavedState;
import android.support.p022v4.util.C0888a;
import android.support.p022v4.util.C0891c;
import android.support.p022v4.util.C0892d;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.bef.effectsdk.message.MessageCenter;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.l */
final class C0612l extends C0608j implements Factory2 {

    /* renamed from: F */
    static final Interpolator f2391F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f2392G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f2393H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f2394I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f2395a;

    /* renamed from: q */
    static Field f2396q;

    /* renamed from: A */
    Bundle f2397A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f2398B = null;

    /* renamed from: C */
    ArrayList<C0628j> f2399C;

    /* renamed from: D */
    C0632p f2400D;

    /* renamed from: E */
    Runnable f2401E = new Runnable() {
        public final void run() {
            C0612l.this.mo2701j();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<C0624f> f2402J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0626h> f2403b;

    /* renamed from: c */
    boolean f2404c;

    /* renamed from: d */
    int f2405d;

    /* renamed from: e */
    final ArrayList<Fragment> f2406e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<Fragment> f2407f;

    /* renamed from: g */
    ArrayList<C0601e> f2408g;

    /* renamed from: h */
    ArrayList<Fragment> f2409h;

    /* renamed from: i */
    ArrayList<C0601e> f2410i;

    /* renamed from: j */
    ArrayList<Integer> f2411j;

    /* renamed from: k */
    ArrayList<C0610b> f2412k;

    /* renamed from: l */
    int f2413l = 0;

    /* renamed from: m */
    FragmentHostCallback f2414m;

    /* renamed from: n */
    C0606h f2415n;

    /* renamed from: o */
    Fragment f2416o;

    /* renamed from: p */
    Fragment f2417p;

    /* renamed from: r */
    boolean f2418r;

    /* renamed from: s */
    boolean f2419s;

    /* renamed from: t */
    boolean f2420t;

    /* renamed from: u */
    boolean f2421u;

    /* renamed from: v */
    String f2422v;

    /* renamed from: w */
    boolean f2423w;

    /* renamed from: x */
    ArrayList<C0601e> f2424x;

    /* renamed from: y */
    ArrayList<Boolean> f2425y;

    /* renamed from: z */
    ArrayList<Fragment> f2426z;

    /* renamed from: android.support.v4.app.l$a */
    static class C0618a extends C0620b {

        /* renamed from: a */
        View f2440a;

        public final void onAnimationEnd(Animation animation) {
            if (C0991u.m4170G(this.f2440a) || VERSION.SDK_INT >= 24) {
                this.f2440a.post(new Runnable() {
                    public final void run() {
                        C0618a.this.f2440a.setLayerType(0, null);
                    }
                });
            } else {
                this.f2440a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }

        C0618a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f2440a = view;
        }
    }

    /* renamed from: android.support.v4.app.l$b */
    static class C0620b implements AnimationListener {

        /* renamed from: a */
        private final AnimationListener f2442a;

        C0620b(AnimationListener animationListener) {
            this.f2442a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f2442a != null) {
                this.f2442a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f2442a != null) {
                this.f2442a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f2442a != null) {
                this.f2442a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.l$c */
    static class C0621c {

        /* renamed from: a */
        public final Animation f2443a;

        /* renamed from: b */
        public final Animator f2444b;

        C0621c(Animator animator) {
            this.f2444b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0621c(Animation animation) {
            this.f2443a = animation;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.l$d */
    static class C0622d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f2445a;

        C0622d(View view) {
            this.f2445a = view;
        }

        public final void onAnimationStart(Animator animator) {
            this.f2445a.setLayerType(2, null);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f2445a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    /* renamed from: android.support.v4.app.l$e */
    static class C0623e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f2446a;

        /* renamed from: b */
        private final View f2447b;

        /* renamed from: c */
        private boolean f2448c;

        /* renamed from: d */
        private boolean f2449d;

        /* renamed from: e */
        private boolean f2450e = true;

        public final void run() {
            if (this.f2448c || !this.f2450e) {
                this.f2446a.endViewTransition(this.f2447b);
                this.f2449d = true;
                return;
            }
            this.f2450e = false;
            this.f2446a.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.f2450e = true;
            if (!this.f2448c) {
                if (!super.getTransformation(j, transformation)) {
                    this.f2448c = true;
                    C0587ab.m2461a(this.f2446a, this);
                }
                return true;
            } else if (!this.f2449d) {
                return true;
            } else {
                return false;
            }
        }

        C0623e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2446a = viewGroup;
            this.f2447b = view;
            addAnimation(animation);
            this.f2446a.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2450e = true;
            if (!this.f2448c) {
                if (!super.getTransformation(j, transformation, f)) {
                    this.f2448c = true;
                    C0587ab.m2461a(this.f2446a, this);
                }
                return true;
            } else if (!this.f2449d) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: android.support.v4.app.l$f */
    static final class C0624f {

        /* renamed from: a */
        final C0609a f2451a;

        /* renamed from: b */
        final boolean f2452b;

        C0624f(C0609a aVar, boolean z) {
            this.f2451a = aVar;
            this.f2452b = z;
        }
    }

    /* renamed from: android.support.v4.app.l$g */
    static class C0625g {

        /* renamed from: a */
        public static final int[] f2453a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.l$h */
    interface C0626h {
        /* renamed from: a */
        boolean mo2597a(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.l$i */
    class C0627i implements C0626h {

        /* renamed from: a */
        final String f2454a;

        /* renamed from: b */
        final int f2455b;

        /* renamed from: c */
        final int f2456c;

        /* renamed from: a */
        public final boolean mo2597a(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2) {
            if (C0612l.this.f2417p != null && this.f2455b < 0 && this.f2454a == null) {
                C0612l lVar = C0612l.this.f2417p.mChildFragmentManager;
                if (lVar != null && lVar.mo2656d()) {
                    return false;
                }
            }
            return C0612l.this.mo2685a(arrayList, arrayList2, this.f2454a, this.f2455b, this.f2456c);
        }

        C0627i(String str, int i, int i2) {
            this.f2454a = str;
            this.f2455b = i;
            this.f2456c = i2;
        }
    }

    /* renamed from: android.support.v4.app.l$j */
    static class C0628j implements C0551b {

        /* renamed from: a */
        final boolean f2458a;

        /* renamed from: b */
        final C0601e f2459b;

        /* renamed from: c */
        private int f2460c;

        /* renamed from: b */
        public final void mo2359b() {
            this.f2460c++;
        }

        /* renamed from: c */
        public final boolean mo2731c() {
            if (this.f2460c == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final void mo2733e() {
            this.f2459b.f2359a.mo2679a(this.f2459b, this.f2458a, false, false);
        }

        /* renamed from: a */
        public final void mo2358a() {
            this.f2460c--;
            if (this.f2460c == 0) {
                this.f2459b.f2359a.mo2698i();
            }
        }

        /* renamed from: d */
        public final void mo2732d() {
            boolean z;
            if (this.f2460c > 0) {
                z = true;
            } else {
                z = false;
            }
            C0612l lVar = this.f2459b.f2359a;
            int size = lVar.f2406e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) lVar.f2406e.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.f2459b.f2359a.mo2679a(this.f2459b, this.f2458a, !z, true);
        }

        C0628j(C0601e eVar, boolean z) {
            this.f2458a = z;
            this.f2459b = eVar;
        }
    }

    /* renamed from: G */
    private Fragment m2592G() {
        return this.f2417p;
    }

    /* renamed from: b */
    private static int m2612b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: c */
    public static int m2620c(int i) {
        if (i != 4097) {
            return i != 4099 ? i != 8194 ? 0 : 4097 : MessageCenter.MSG_SDK_TO_CLIENT_END_GAME_REQ;
        }
        return 8194;
    }

    /* renamed from: g */
    public final boolean mo2659g() {
        return this.f2421u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final Factory2 mo2717w() {
        return this;
    }

    /* renamed from: a */
    private static boolean m2609a(C0621c cVar) {
        if (cVar.f2443a instanceof AlphaAnimation) {
            return true;
        }
        if (!(cVar.f2443a instanceof AnimationSet)) {
            return m2608a(cVar.f2444b);
        }
        List animations = ((AnimationSet) cVar.f2443a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2608a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m2608a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2610a(View view, C0621c cVar) {
        if (view == null || cVar == null || VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !C0991u.m4245x(view) || !m2609a(cVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m2605a(RuntimeException runtimeException) {
        PrintWriter printWriter = new PrintWriter(new C0892d("FragmentManager"));
        if (this.f2414m != null) {
            try {
                this.f2414m.mo2410a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            mo2652a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public final void mo2651a(String str, int i) {
        mo2680a((C0626h) new C0627i(str, -1, 0), false);
    }

    /* renamed from: a */
    public final void mo2646a(int i, int i2) {
        if (i >= 0) {
            mo2680a((C0626h) new C0627i(null, i, 1), false);
            return;
        }
        StringBuilder sb = new StringBuilder("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private boolean m2611a(String str, int i, int i2) {
        mo2701j();
        m2623c(true);
        if (this.f2417p != null) {
            C0612l lVar = this.f2417p.mChildFragmentManager;
            if (lVar != null && lVar.mo2656d()) {
                return true;
            }
        }
        boolean a = mo2685a(this.f2424x, this.f2425y, (String) null, -1, 0);
        if (a) {
            this.f2404c = true;
            try {
                m2618b(this.f2424x, this.f2425y);
            } finally {
                m2644z();
            }
        }
        m2588C();
        m2591F();
        return a;
    }

    /* renamed from: a */
    public final void mo2650a(C0610b bVar) {
        if (this.f2412k == null) {
            this.f2412k = new ArrayList<>();
        }
        this.f2412k.add(bVar);
    }

    /* renamed from: a */
    public final void mo2647a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m2605a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    /* renamed from: a */
    public final Fragment mo2643a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f2407f.get(i);
        if (fragment == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": index ");
            sb.append(i);
            m2605a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    /* renamed from: a */
    public final SavedState mo2641a(Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m2605a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (fragment.mState <= 0) {
            return null;
        }
        Bundle q = m2641q(fragment);
        if (q != null) {
            return new SavedState(q);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo2652a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (this.f2407f != null) {
            int size = this.f2407f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f2407f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.dump(sb2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size2 = this.f2406e.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment2 = (Fragment) this.f2406e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f2409h != null) {
            int size3 = this.f2409h.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    Fragment fragment3 = (Fragment) this.f2409h.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        if (this.f2408g != null) {
            int size4 = this.f2408g.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    C0601e eVar = (C0601e) this.f2408g.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(eVar.toString());
                    eVar.mo2593a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f2410i != null) {
                int size5 = this.f2410i.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        C0601e eVar2 = (C0601e) this.f2410i.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(eVar2);
                    }
                }
            }
            if (this.f2411j != null && this.f2411j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f2411j.toArray()));
            }
        }
        if (this.f2403b != null) {
            int size6 = this.f2403b.size();
            if (size6 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size6; i6++) {
                    C0626h hVar = (C0626h) this.f2403b.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2414m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2415n);
        if (this.f2416o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2416o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2413l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2419s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2420t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2421u);
        if (this.f2418r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2418r);
        }
        if (this.f2422v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f2422v);
        }
    }

    /* renamed from: b */
    public final void mo2687b(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f2404c) {
                this.f2423w = true;
                return;
            }
            fragment.mDeferStart = false;
            C0631o.m2717a(this, fragment, this.f2413l, 0, 0, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo2692b(int i) {
        return this.f2413l > 0;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r8v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX INFO: used method not loaded: android.support.v4.app.FragmentHostCallback.a(android.support.v4.app.Fragment):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0286, code lost:
        if (r11 >= 3) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0288, code lost:
        r15.performStop();
        m2629e(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x028e, code lost:
        if (r11 >= 2) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0292, code lost:
        if (r7.mView == null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x029a, code lost:
        if (r6.f2414m.mo2411a(r15) == false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x029e, code lost:
        if (r7.mSavedViewState != null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a0, code lost:
        m2640p(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a3, code lost:
        r15.performDestroyView();
        m2631f(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ab, code lost:
        if (r7.mView == null) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02af, code lost:
        if (r7.mContainer == null) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b1, code lost:
        r7.mContainer.endViewTransition(r7.mView);
        r7.mView.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02c0, code lost:
        if (r6.f2413l <= 0) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02c4, code lost:
        if (r6.f2421u != false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02cc, code lost:
        if (r7.mView.getVisibility() != 0) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02d2, code lost:
        if (r7.mPostponedAlpha < 0.0f) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02d4, code lost:
        r0 = m2596a(r15, r17, false, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02dd, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02de, code lost:
        r7.mPostponedAlpha = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02e0, code lost:
        if (r0 == null) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02e2, code lost:
        m2601a(r15, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02e5, code lost:
        r7.mContainer.removeView(r7.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02ec, code lost:
        r7.mContainer = null;
        r7.mView = null;
        r7.mViewLifecycleOwner = null;
        r7.mViewLifecycleOwnerLiveData.setValue(null);
        r7.mInnerView = null;
        r7.mInLayout = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02fb, code lost:
        if (r11 > 0) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ff, code lost:
        if (r6.f2421u == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0305, code lost:
        if (r15.getAnimatingAway() == null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0307, code lost:
        r0 = r15.getAnimatingAway();
        r15.setAnimatingAway(null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0316, code lost:
        if (r15.getAnimator() == null) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0318, code lost:
        r0 = r15.getAnimator();
        r15.setAnimator(null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0326, code lost:
        if (r15.getAnimatingAway() != null) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x032c, code lost:
        if (r15.getAnimator() == null) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0331, code lost:
        if (r7.mRetaining != false) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0333, code lost:
        r15.performDestroy();
        m2633g(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x033a, code lost:
        r7.mState = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x033c, code lost:
        r15.performDetach();
        m2634h(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0342, code lost:
        if (r19 != false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0346, code lost:
        if (r7.mRetaining != false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0348, code lost:
        m2638n(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x034c, code lost:
        r7.mHost = null;
        r7.mParentFragment = null;
        r7.mFragmentManager = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0353, code lost:
        r15.setStateAfterAnimating(r11);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0182, code lost:
        m2636l(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0185, code lost:
        if (r11 <= 1) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0189, code lost:
        if (r7.mFromLayout != false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018d, code lost:
        if (r7.mContainerId == 0) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0192, code lost:
        if (r7.mContainerId != -1) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0194, code lost:
        r1 = new java.lang.StringBuilder("Cannot create fragment ");
        r1.append(r15);
        r1.append(" for a container view with no id");
        m2605a((java.lang.RuntimeException) new java.lang.IllegalArgumentException(r1.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01af, code lost:
        r0 = (android.view.ViewGroup) r6.f2415n.mo2351a(r7.mContainerId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b9, code lost:
        if (r0 != null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bd, code lost:
        if (r7.mRestored != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r1 = r15.getResources().getResourceName(r7.mContainerId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ca, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f9, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v5
      assigns: []
      uses: []
      mth insns count: 349
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x035c  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2676a(android.support.p022v4.app.Fragment r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0 = r16
            goto L_0x0014
        L_0x000f:
            r0 = r16
            if (r0 <= r8) goto L_0x0014
            r0 = 1
        L_0x0014:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002a
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002a
            int r0 = r7.mState
            if (r0 != 0) goto L_0x0028
            boolean r0 = r15.isInBackStack()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.mState
        L_0x002a:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.mState
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x0272
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x0048
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 != 0) goto L_0x0054
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x0066
        L_0x0054:
            r15.setAnimatingAway(r12)
            r15.setAnimator(r12)
            int r2 = r15.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            r1 = r15
            android.support.p022v4.app.C0631o.m2717a(r0, r1, r2, r3, r4, r5)
        L_0x0066:
            int r0 = r7.mState
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0182;
                case 2: goto L_0x025c;
                case 3: goto L_0x0264;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x0357
        L_0x006d:
            if (r11 <= 0) goto L_0x0182
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x00c4
            android.os.Bundle r0 = r7.mSavedFragmentState
            android.support.v4.app.FragmentHostCallback r1 = r6.f2414m
            android.content.Context r1 = r1.f2159c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r14.mo2643a(r0, r1)
            r7.mTarget = r0
            android.support.v4.app.Fragment r0 = r7.mTarget
            if (r0 == 0) goto L_0x00a2
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.mTargetRequestCode = r0
        L_0x00a2:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00b1
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r12
            goto L_0x00bb
        L_0x00b1:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00bb:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x00c4
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x00c4
            r11 = 2
        L_0x00c4:
            android.support.v4.app.FragmentHostCallback r0 = r6.f2414m
            r7.mHost = r0
            android.support.v4.app.Fragment r0 = r6.f2416o
            r7.mParentFragment = r0
            android.support.v4.app.Fragment r0 = r6.f2416o
            if (r0 == 0) goto L_0x00d5
            android.support.v4.app.Fragment r0 = r6.f2416o
            android.support.v4.app.l r0 = r0.mChildFragmentManager
            goto L_0x00d9
        L_0x00d5:
            android.support.v4.app.FragmentHostCallback r0 = r6.f2414m
            android.support.v4.app.l r0 = r0.f2161e
        L_0x00d9:
            r7.mFragmentManager = r0
            android.support.v4.app.Fragment r0 = r7.mTarget
            if (r0 == 0) goto L_0x0121
            android.util.SparseArray<android.support.v4.app.Fragment> r0 = r6.f2407f
            android.support.v4.app.Fragment r1 = r7.mTarget
            int r1 = r1.mIndex
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x00fe
            android.support.v4.app.Fragment r0 = r7.mTarget
            int r0 = r0.mState
            if (r0 > 0) goto L_0x0121
            android.support.v4.app.Fragment r1 = r7.mTarget
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            android.support.p022v4.app.C0631o.m2717a(r0, r1, r2, r3, r4, r5)
            goto L_0x0121
        L_0x00fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.Fragment r2 = r7.mTarget
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0121:
            android.support.v4.app.FragmentHostCallback r0 = r6.f2414m
            android.content.Context r0 = r0.f2159c
            r14.m2599a(r15, r0, r13)
            r7.mCalled = r13
            android.support.v4.app.FragmentHostCallback r0 = r6.f2414m
            android.content.Context r0 = r0.f2159c
            r15.onAttach(r0)
            boolean r0 = r7.mCalled
            if (r0 == 0) goto L_0x0169
            android.support.v4.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x013f
            android.support.v4.app.FragmentHostCallback r0 = r6.f2414m
            r0.mo2414b(r15)
            goto L_0x0144
        L_0x013f:
            android.support.v4.app.Fragment r0 = r7.mParentFragment
            r0.onAttachFragment(r15)
        L_0x0144:
            android.support.v4.app.FragmentHostCallback r0 = r6.f2414m
            android.content.Context r0 = r0.f2159c
            r14.m2613b(r15, r0, r13)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x015f
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.m2600a(r15, r0, r13)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.m2614b(r15, r0, r13)
            goto L_0x0166
        L_0x015f:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x0166:
            r7.mRetaining = r13
            goto L_0x0182
        L_0x0169:
            android.support.v4.app.af r0 = new android.support.v4.app.af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0182:
            r14.m2636l(r15)
            if (r11 <= r8) goto L_0x025c
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x0247
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x01f9
            int r0 = r7.mContainerId
            r1 = -1
            if (r0 != r1) goto L_0x01af
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r14.m2605a(r0)
        L_0x01af:
            android.support.v4.app.h r0 = r6.f2415n
            int r1 = r7.mContainerId
            android.view.View r0 = r0.mo2351a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x01fa
            boolean r1 = r7.mRestored
            if (r1 != 0) goto L_0x01fa
            android.content.res.Resources r1 = r15.getResources()     // Catch:{ NotFoundException -> 0x01ca }
            int r2 = r7.mContainerId     // Catch:{ NotFoundException -> 0x01ca }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01ca }
            goto L_0x01cc
        L_0x01ca:
            java.lang.String r1 = "unknown"
        L_0x01cc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r3.<init>(r4)
            int r4 = r7.mContainerId
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r15)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r14.m2605a(r2)
            goto L_0x01fa
        L_0x01f9:
            r0 = r12
        L_0x01fa:
            r7.mContainer = r0
            android.os.Bundle r1 = r7.mSavedFragmentState
            android.view.LayoutInflater r1 = r15.performGetLayoutInflater(r1)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r15.performCreateView(r1, r0, r2)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x0245
            android.view.View r1 = r7.mView
            r7.mInnerView = r1
            android.view.View r1 = r7.mView
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x021b
            android.view.View r1 = r7.mView
            r0.addView(r1)
        L_0x021b:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x0226
            android.view.View r0 = r7.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x0226:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r15.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r14.m2602a(r15, r0, r1, r13)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0241
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x0241
            goto L_0x0242
        L_0x0241:
            r8 = 0
        L_0x0242:
            r7.mIsNewlyAdded = r8
            goto L_0x0247
        L_0x0245:
            r7.mInnerView = r12
        L_0x0247:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.m2621c(r15, r0, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x025a
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.restoreViewState(r0)
        L_0x025a:
            r7.mSavedFragmentState = r12
        L_0x025c:
            if (r11 <= r10) goto L_0x0264
            r15.performStart()
            r14.m2615b(r15, r13)
        L_0x0264:
            if (r11 <= r9) goto L_0x0357
            r15.performResume()
            r14.m2622c(r15, r13)
            r7.mSavedFragmentState = r12
            r7.mSavedViewState = r12
            goto L_0x0357
        L_0x0272:
            int r0 = r7.mState
            if (r0 <= r11) goto L_0x0357
            int r0 = r7.mState
            switch(r0) {
                case 1: goto L_0x02fb;
                case 2: goto L_0x028e;
                case 3: goto L_0x0286;
                case 4: goto L_0x027d;
                default: goto L_0x027b;
            }
        L_0x027b:
            goto L_0x0357
        L_0x027d:
            r0 = 4
            if (r11 >= r0) goto L_0x0286
            r15.performPause()
            r14.m2627d(r15, r13)
        L_0x0286:
            if (r11 >= r9) goto L_0x028e
            r15.performStop()
            r14.m2629e(r15, r13)
        L_0x028e:
            if (r11 >= r10) goto L_0x02fb
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02a3
            android.support.v4.app.FragmentHostCallback r0 = r6.f2414m
            boolean r0 = r0.mo2411a(r15)
            if (r0 == 0) goto L_0x02a3
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x02a3
            r14.m2640p(r15)
        L_0x02a3:
            r15.performDestroyView()
            r14.m2631f(r15, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02ec
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x02ec
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.endViewTransition(r1)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            int r0 = r6.f2413l
            r1 = 0
            if (r0 <= 0) goto L_0x02dd
            boolean r0 = r6.f2421u
            if (r0 != 0) goto L_0x02dd
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02dd
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02dd
            r0 = r17
            r2 = r18
            android.support.v4.app.l$c r0 = r14.m2596a(r15, r0, r13, r2)
            goto L_0x02de
        L_0x02dd:
            r0 = r12
        L_0x02de:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x02e5
            r14.m2601a(r15, r0, r11)
        L_0x02e5:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x02ec:
            r7.mContainer = r12
            r7.mView = r12
            r7.mViewLifecycleOwner = r12
            android.arch.lifecycle.o<android.arch.lifecycle.i> r0 = r7.mViewLifecycleOwnerLiveData
            r0.setValue(r12)
            r7.mInnerView = r12
            r7.mInLayout = r13
        L_0x02fb:
            if (r11 > 0) goto L_0x0357
            boolean r0 = r6.f2421u
            if (r0 == 0) goto L_0x0322
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 == 0) goto L_0x0312
            android.view.View r0 = r15.getAnimatingAway()
            r15.setAnimatingAway(r12)
            r0.clearAnimation()
            goto L_0x0322
        L_0x0312:
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x0322
            android.animation.Animator r0 = r15.getAnimator()
            r15.setAnimator(r12)
            r0.cancel()
        L_0x0322:
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 != 0) goto L_0x0353
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x032f
            goto L_0x0353
        L_0x032f:
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x033a
            r15.performDestroy()
            r14.m2633g(r15, r13)
            goto L_0x033c
        L_0x033a:
            r7.mState = r13
        L_0x033c:
            r15.performDetach()
            r14.m2634h(r15, r13)
            if (r19 != 0) goto L_0x0357
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x034c
            r14.m2638n(r15)
            goto L_0x0357
        L_0x034c:
            r7.mHost = r12
            r7.mParentFragment = r12
            r7.mFragmentManager = r12
            goto L_0x0357
        L_0x0353:
            r15.setStateAfterAnimating(r11)
            goto L_0x0358
        L_0x0357:
            r8 = r11
        L_0x0358:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x035e
            r7.mState = r8
        L_0x035e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.C0612l.mo2676a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m2601a(final Fragment fragment, C0621c cVar, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (cVar.f2443a != null) {
            C0623e eVar = new C0623e(cVar.f2443a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new C0620b(m2597a((Animation) eVar)) {
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {
                        public final void run() {
                            if (fragment.getAnimatingAway() != null) {
                                fragment.setAnimatingAway(null);
                                C0629m.m2715a(C0612l.this, fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            m2617b(view, cVar);
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f2444b;
        fragment.setAnimator(cVar.f2444b);
        animator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    C0630n.m2716a(C0612l.this, fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.mView);
        m2617b(fragment.mView, cVar);
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2673a(int i, boolean z) {
        if (this.f2414m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2413l) {
            this.f2413l = i;
            if (this.f2407f != null) {
                int size = this.f2406e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo2694c((Fragment) this.f2406e.get(i2));
                }
                int size2 = this.f2407f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment fragment = (Fragment) this.f2407f.valueAt(i3);
                    if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                        mo2694c(fragment);
                    }
                }
                m2642x();
                if (this.f2418r && this.f2414m != null && this.f2413l == 4) {
                    this.f2414m.mo2415c();
                    this.f2418r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2677a(Fragment fragment, boolean z) {
        mo2695d(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f2406e.contains(fragment)) {
            synchronized (this.f2406e) {
                this.f2406e.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f2418r = true;
            }
            if (z) {
                m2635k(fragment);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final Fragment mo2642a(int i) {
        for (int size = this.f2406e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2406e.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        if (this.f2407f != null) {
            for (int size2 = this.f2407f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f2407f.valueAt(size2);
                if (fragment2 != null && fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Fragment mo2644a(String str) {
        if (str != null) {
            for (int size = this.f2406e.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2406e.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (!(this.f2407f == null || str == null)) {
            for (int size2 = this.f2407f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f2407f.valueAt(size2);
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Fragment mo2686b(String str) {
        if (!(this.f2407f == null || str == null)) {
            for (int size = this.f2407f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2407f.valueAt(size);
                if (fragment != null) {
                    Fragment findFragmentByWho = fragment.findFragmentByWho(str);
                    if (findFragmentByWho != null) {
                        return findFragmentByWho;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo2680a(C0626h hVar, boolean z) {
        if (!z) {
            m2643y();
        }
        synchronized (this) {
            if (!this.f2421u) {
                if (this.f2414m != null) {
                    if (this.f2403b == null) {
                        this.f2403b = new ArrayList<>();
                    }
                    this.f2403b.add(hVar);
                    mo2698i();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public final int mo2672a(C0601e eVar) {
        synchronized (this) {
            if (this.f2411j != null) {
                if (this.f2411j.size() > 0) {
                    int intValue = ((Integer) this.f2411j.remove(this.f2411j.size() - 1)).intValue();
                    this.f2410i.set(intValue, eVar);
                    return intValue;
                }
            }
            if (this.f2410i == null) {
                this.f2410i = new ArrayList<>();
            }
            int size = this.f2410i.size();
            this.f2410i.add(eVar);
            return size;
        }
    }

    /* renamed from: b */
    public final void mo2689b(C0626h hVar, boolean z) {
        if (!z || (this.f2414m != null && !this.f2421u)) {
            m2623c(z);
            if (hVar.mo2597a(this.f2424x, this.f2425y)) {
                this.f2404c = true;
                try {
                    m2618b(this.f2424x, this.f2425y);
                } finally {
                    m2644z();
                }
            }
            m2588C();
            m2591F();
        }
    }

    /* renamed from: a */
    private void m2606a(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2) {
        int size = this.f2399C == null ? 0 : this.f2399C.size();
        int i = 0;
        while (i < size) {
            C0628j jVar = (C0628j) this.f2399C.get(i);
            if (arrayList != null && !jVar.f2458a) {
                int indexOf = arrayList.indexOf(jVar.f2459b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    jVar.mo2733e();
                    i++;
                }
            }
            if (jVar.mo2731c() || (arrayList != null && jVar.f2459b.mo2596a(arrayList, 0, arrayList.size()))) {
                this.f2399C.remove(i);
                i--;
                size--;
                if (arrayList != null && !jVar.f2458a) {
                    int indexOf2 = arrayList.indexOf(jVar.f2459b);
                    if (indexOf2 != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                        jVar.mo2733e();
                    }
                }
                jVar.mo2732d();
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m2607a(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0601e> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0601e) arrayList3.get(i4)).f2378t;
        if (this.f2426z == null) {
            this.f2426z = new ArrayList<>();
        } else {
            this.f2426z.clear();
        }
        this.f2426z.addAll(this.f2406e);
        Fragment G = m2592G();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0601e eVar = (C0601e) arrayList3.get(i6);
            if (!((Boolean) arrayList4.get(i6)).booleanValue()) {
                G = eVar.mo2581a(this.f2426z, G);
            } else {
                G = eVar.mo2598b(this.f2426z, G);
            }
            z2 = z2 || eVar.f2367i;
        }
        this.f2426z.clear();
        if (!z) {
            C0634r.m2753a(this, arrayList, arrayList2, i, i2, false);
        }
        m2619b(arrayList, arrayList2, i, i2);
        if (z) {
            C0888a aVar = new C0888a();
            m2616b(aVar);
            int a = m2593a(arrayList, arrayList2, i, i2, aVar);
            m2604a(aVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0634r.m2753a(this, arrayList, arrayList2, i, i3, true);
            mo2673a(this.f2413l, true);
        }
        while (i4 < i5) {
            C0601e eVar2 = (C0601e) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue() && eVar2.f2371m >= 0) {
                m2625d(eVar2.f2371m);
                eVar2.f2371m = -1;
            }
            eVar2.mo2602b();
            i4++;
        }
        if (z2) {
            m2589D();
        }
    }

    /* renamed from: a */
    private static void m2604a(C0888a<Fragment> aVar) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) aVar.mo3305a(i);
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2679a(C0601e eVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            eVar.mo2595a(z3);
        } else {
            eVar.mo2611g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(eVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0634r.m2753a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo2673a(this.f2413l, true);
        }
        if (this.f2407f != null) {
            int size = this.f2407f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f2407f.valueAt(i);
                if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && eVar.mo2603b(fragment.mContainerId)) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    if (z3) {
                        fragment.mPostponedAlpha = 0.0f;
                    } else {
                        fragment.mPostponedAlpha = -1.0f;
                        fragment.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m2619b(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0601e eVar = (C0601e) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                eVar.mo2590a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                eVar.mo2595a(z);
            } else {
                eVar.mo2590a(1);
                eVar.mo2611g();
            }
            i++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2688b(C0601e eVar) {
        if (this.f2408g == null) {
            this.f2408g = new ArrayList<>();
        }
        this.f2408g.add(eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2685a(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        if (this.f2408g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f2408g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2408g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f2408g.size() - 1;
                while (i3 >= 0) {
                    C0601e eVar = (C0601e) this.f2408g.get(i3);
                    if ((str != null && str.equals(eVar.mo2613i())) || (i >= 0 && i == eVar.f2371m)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        C0601e eVar2 = (C0601e) this.f2408g.get(i3);
                        if ((str == null || !str.equals(eVar2.mo2613i())) && (i < 0 || i != eVar2.f2371m)) {
                            break;
                        }
                        i3--;
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f2408g.size() - 1) {
                return false;
            }
            for (int size3 = this.f2408g.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2408g.remove(size3));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m2603a(C0632p pVar) {
        if (pVar != null) {
            List<Fragment> list = pVar.f2461a;
            if (list != null) {
                for (Fragment fragment : list) {
                    fragment.mRetaining = true;
                }
            }
            List<C0632p> list2 = pVar.f2462b;
            if (list2 != null) {
                for (C0632p a : list2) {
                    m2603a(a);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2675a(Parcelable parcelable, C0632p pVar) {
        List list;
        List list2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f2162a != null) {
                if (pVar != null) {
                    List<Fragment> list3 = pVar.f2461a;
                    list2 = pVar.f2462b;
                    list = pVar.f2463c;
                    int size = list3 != null ? list3.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = (Fragment) list3.get(i);
                        int i2 = 0;
                        while (i2 < fragmentManagerState.f2162a.length && fragmentManagerState.f2162a[i2].f2171b != fragment.mIndex) {
                            i2++;
                        }
                        if (i2 == fragmentManagerState.f2162a.length) {
                            StringBuilder sb = new StringBuilder("Could not find active fragment with index ");
                            sb.append(fragment.mIndex);
                            m2605a((RuntimeException) new IllegalStateException(sb.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.f2162a[i2];
                        fragmentState.f2181l = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        if (fragmentState.f2180k != null) {
                            fragmentState.f2180k.setClassLoader(this.f2414m.f2159c.getClassLoader());
                            fragment.mSavedViewState = fragmentState.f2180k.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = fragmentState.f2180k;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f2407f = new SparseArray<>(fragmentManagerState.f2162a.length);
                int i3 = 0;
                while (i3 < fragmentManagerState.f2162a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f2162a[i3];
                    if (fragmentState2 != null) {
                        Fragment a = fragmentState2.mo2433a(this.f2414m, this.f2415n, this.f2416o, (list2 == null || i3 >= list2.size()) ? null : (C0632p) list2.get(i3), (list == null || i3 >= list.size()) ? null : (C0070y) list.get(i3));
                        this.f2407f.put(a.mIndex, a);
                        fragmentState2.f2181l = null;
                    }
                    i3++;
                }
                if (pVar != null) {
                    List<Fragment> list4 = pVar.f2461a;
                    int size2 = list4 != null ? list4.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fragment fragment2 = (Fragment) list4.get(i4);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = (Fragment) this.f2407f.get(fragment2.mTargetIndex);
                        }
                    }
                }
                this.f2406e.clear();
                if (fragmentManagerState.f2163b != null) {
                    int i5 = 0;
                    while (i5 < fragmentManagerState.f2163b.length) {
                        Fragment fragment3 = (Fragment) this.f2407f.get(fragmentManagerState.f2163b[i5]);
                        if (fragment3 == null) {
                            StringBuilder sb2 = new StringBuilder("No instantiated fragment for index #");
                            sb2.append(fragmentManagerState.f2163b[i5]);
                            m2605a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        fragment3.mAdded = true;
                        if (!this.f2406e.contains(fragment3)) {
                            synchronized (this.f2406e) {
                                this.f2406e.add(fragment3);
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (fragmentManagerState.f2164c != null) {
                    this.f2408g = new ArrayList<>(fragmentManagerState.f2164c.length);
                    for (BackStackState a2 : fragmentManagerState.f2164c) {
                        C0601e a3 = a2.mo2186a(this);
                        if (f2395a) {
                            PrintWriter printWriter = new PrintWriter(new C0892d("FragmentManager"));
                            a3.mo2594a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2408g.add(a3);
                        if (a3.f2371m >= 0) {
                            m2598a(a3.f2371m, a3);
                        }
                    }
                } else {
                    this.f2408g = null;
                }
                if (fragmentManagerState.f2165d >= 0) {
                    this.f2417p = (Fragment) this.f2407f.get(fragmentManagerState.f2165d);
                }
                this.f2405d = fragmentManagerState.f2166e;
            }
        }
    }

    /* renamed from: a */
    public final void mo2678a(FragmentHostCallback fragmentHostCallback, C0606h hVar, Fragment fragment) {
        if (this.f2414m == null) {
            this.f2414m = fragmentHostCallback;
            this.f2415n = hVar;
            this.f2416o = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public final void mo2681a(boolean z) {
        for (int size = this.f2406e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2406e.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public final void mo2691b(boolean z) {
        for (int size = this.f2406e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2406e.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo2674a(Configuration configuration) {
        for (int i = 0; i < this.f2406e.size(); i++) {
            Fragment fragment = (Fragment) this.f2406e.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2683a(Menu menu, MenuInflater menuInflater) {
        if (this.f2413l <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f2406e.size(); i++) {
            Fragment fragment = (Fragment) this.f2406e.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2409h != null) {
            for (int i2 = 0; i2 < this.f2409h.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f2409h.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2409h = arrayList;
        return z;
    }

    /* renamed from: a */
    public final boolean mo2682a(Menu menu) {
        if (this.f2413l <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f2406e.size(); i++) {
            Fragment fragment = (Fragment) this.f2406e.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo2684a(MenuItem menuItem) {
        if (this.f2413l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2406e.size(); i++) {
            Fragment fragment = (Fragment) this.f2406e.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo2693b(MenuItem menuItem) {
        if (this.f2413l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2406e.size(); i++) {
            Fragment fragment = (Fragment) this.f2406e.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo2690b(Menu menu) {
        if (this.f2413l > 0) {
            for (int i = 0; i < this.f2406e.size(); i++) {
                Fragment fragment = (Fragment) this.f2406e.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2648a(C0609a aVar) {
        synchronized (this.f2402J) {
            int i = 0;
            int size = this.f2402J.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C0624f) this.f2402J.get(i)).f2451a == aVar) {
                    this.f2402J.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m2600a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2600a(fragment, bundle, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    private void m2602a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2602a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public final C0633q mo2645a() {
        return new C0601e(this);
    }

    /* renamed from: b */
    public final boolean mo2654b() {
        boolean j = mo2701j();
        m2586A();
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final C0632p mo2702k() {
        m2603a(this.f2400D);
        return this.f2400D;
    }

    /* renamed from: r */
    public final void mo2711r() {
        m2628e(3);
    }

    /* renamed from: s */
    public final void mo2712s() {
        this.f2420t = true;
        m2628e(2);
    }

    /* renamed from: t */
    public final void mo2713t() {
        m2628e(1);
    }

    /* renamed from: C */
    private void m2588C() {
        if (this.f2423w) {
            this.f2423w = false;
            m2642x();
        }
    }

    /* renamed from: z */
    private void m2644z() {
        this.f2404c = false;
        this.f2425y.clear();
        this.f2424x.clear();
    }

    /* renamed from: c */
    public final void mo2655c() {
        mo2680a((C0626h) new C0627i(null, -1, 0), false);
    }

    /* renamed from: d */
    public final boolean mo2656d() {
        m2643y();
        return m2611a((String) null, -1, 0);
    }

    /* renamed from: e */
    public final int mo2657e() {
        if (this.f2408g != null) {
            return this.f2408g.size();
        }
        return 0;
    }

    /* renamed from: h */
    public final boolean mo2660h() {
        if (this.f2419s || this.f2420t) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo2705n() {
        this.f2419s = false;
        this.f2420t = false;
        m2628e(1);
    }

    /* renamed from: o */
    public final void mo2706o() {
        this.f2419s = false;
        this.f2420t = false;
        m2628e(2);
    }

    /* renamed from: p */
    public final void mo2709p() {
        this.f2419s = false;
        this.f2420t = false;
        m2628e(3);
    }

    /* renamed from: q */
    public final void mo2710q() {
        this.f2419s = false;
        this.f2420t = false;
        m2628e(4);
    }

    /* renamed from: A */
    private void m2586A() {
        if (this.f2399C != null) {
            while (!this.f2399C.isEmpty()) {
                ((C0628j) this.f2399C.remove(0)).mo2732d();
            }
        }
    }

    /* renamed from: D */
    private void m2589D() {
        if (this.f2412k != null) {
            for (int i = 0; i < this.f2412k.size(); i++) {
                ((C0610b) this.f2412k.get(i)).mo2671a();
            }
        }
    }

    /* renamed from: x */
    private void m2642x() {
        if (this.f2407f != null) {
            for (int i = 0; i < this.f2407f.size(); i++) {
                Fragment fragment = (Fragment) this.f2407f.valueAt(i);
                if (fragment != null) {
                    mo2687b(fragment);
                }
            }
        }
    }

    /* renamed from: f */
    public final List<Fragment> mo2658f() {
        List<Fragment> list;
        if (this.f2406e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2406e) {
            list = (List) this.f2406e.clone();
        }
        return list;
    }

    /* renamed from: u */
    public final void mo2715u() {
        this.f2421u = true;
        mo2701j();
        m2628e(0);
        this.f2414m = null;
        this.f2415n = null;
        this.f2416o = null;
    }

    /* renamed from: v */
    public final void mo2716v() {
        for (int i = 0; i < this.f2406e.size(); i++) {
            Fragment fragment = (Fragment) this.f2406e.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    C0612l() {
    }

    /* renamed from: F */
    private void m2591F() {
        if (this.f2407f != null) {
            for (int size = this.f2407f.size() - 1; size >= 0; size--) {
                if (this.f2407f.valueAt(size) == null) {
                    this.f2407f.delete(this.f2407f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: y */
    private void m2643y() {
        if (mo2660h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f2422v != null) {
            StringBuilder sb = new StringBuilder("Can not perform this action inside of ");
            sb.append(this.f2422v);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo2698i() {
        boolean z;
        synchronized (this) {
            boolean z2 = false;
            if (this.f2399C == null || this.f2399C.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f2403b != null && this.f2403b.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.f2414m.f2160d.removeCallbacks(this.f2401E);
                this.f2414m.f2160d.post(this.f2401E);
            }
        }
    }

    /* renamed from: m */
    public final void mo2704m() {
        this.f2400D = null;
        this.f2419s = false;
        this.f2420t = false;
        int size = this.f2406e.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f2406e.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f2416o != null) {
            C0891c.m3790a(this.f2416o, sb);
        } else {
            C0891c.m3790a(this.f2414m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: B */
    private void m2587B() {
        int i;
        if (this.f2407f == null) {
            i = 0;
        } else {
            i = this.f2407f.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            Fragment fragment = (Fragment) this.f2407f.valueAt(i2);
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    C0631o.m2717a(this, fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public final boolean mo2701j() {
        m2623c(true);
        boolean z = false;
        while (m2624c(this.f2424x, this.f2425y)) {
            this.f2404c = true;
            try {
                m2618b(this.f2424x, this.f2425y);
                m2644z();
                z = true;
            } catch (Throwable th) {
                m2644z();
                throw th;
            }
        }
        m2588C();
        m2591F();
        return z;
    }

    /* renamed from: E */
    private void m2590E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0632p pVar;
        int i;
        if (this.f2407f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < this.f2407f.size(); i2++) {
                Fragment fragment = (Fragment) this.f2407f.valueAt(i2);
                if (fragment != null) {
                    if (fragment.mRetainInstance) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(fragment);
                        if (fragment.mTarget != null) {
                            i = fragment.mTarget.mIndex;
                        } else {
                            i = -1;
                        }
                        fragment.mTargetIndex = i;
                    }
                    if (fragment.mChildFragmentManager != null) {
                        fragment.mChildFragmentManager.m2590E();
                        pVar = fragment.mChildFragmentManager.f2400D;
                    } else {
                        pVar = fragment.mChildNonConfig;
                    }
                    if (arrayList2 == null && pVar != null) {
                        arrayList2 = new ArrayList(this.f2407f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(pVar);
                    }
                    if (arrayList == null && fragment.mViewModelStore != null) {
                        arrayList = new ArrayList(this.f2407f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(fragment.mViewModelStore);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f2400D = null;
        } else {
            this.f2400D = new C0632p(arrayList3, arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final Parcelable mo2703l() {
        int[] iArr;
        m2586A();
        m2587B();
        mo2701j();
        this.f2419s = true;
        BackStackState[] backStackStateArr = null;
        this.f2400D = null;
        if (this.f2407f == null || this.f2407f.size() <= 0) {
            return null;
        }
        int size = this.f2407f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f2407f.valueAt(i);
            if (fragment != null) {
                if (fragment.mIndex < 0) {
                    StringBuilder sb = new StringBuilder("Failure saving state: active ");
                    sb.append(fragment);
                    sb.append(" has cleared index: ");
                    sb.append(fragment.mIndex);
                    m2605a((RuntimeException) new IllegalStateException(sb.toString()));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.mState <= 0 || fragmentState.f2180k != null) {
                    fragmentState.f2180k = fragment.mSavedFragmentState;
                } else {
                    fragmentState.f2180k = m2641q(fragment);
                    if (fragment.mTarget != null) {
                        if (fragment.mTarget.mIndex < 0) {
                            StringBuilder sb2 = new StringBuilder("Failure saving state: ");
                            sb2.append(fragment);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(fragment.mTarget);
                            m2605a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (fragmentState.f2180k == null) {
                            fragmentState.f2180k = new Bundle();
                        }
                        mo2647a(fragmentState.f2180k, "android:target_state", fragment.mTarget);
                        if (fragment.mTargetRequestCode != 0) {
                            fragmentState.f2180k.putInt("android:target_req_state", fragment.mTargetRequestCode);
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        int size2 = this.f2406e.size();
        if (size2 > 0) {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Fragment) this.f2406e.get(i2)).mIndex;
                if (iArr[i2] < 0) {
                    StringBuilder sb3 = new StringBuilder("Failure saving state: active ");
                    sb3.append(this.f2406e.get(i2));
                    sb3.append(" has cleared index: ");
                    sb3.append(iArr[i2]);
                    m2605a((RuntimeException) new IllegalStateException(sb3.toString()));
                }
            }
        } else {
            iArr = null;
        }
        if (this.f2408g != null) {
            int size3 = this.f2408g.size();
            if (size3 > 0) {
                backStackStateArr = new BackStackState[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    backStackStateArr[i3] = new BackStackState((C0601e) this.f2408g.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f2162a = fragmentStateArr;
        fragmentManagerState.f2163b = iArr;
        fragmentManagerState.f2164c = backStackStateArr;
        if (this.f2417p != null) {
            fragmentManagerState.f2165d = this.f2417p.mIndex;
        }
        fragmentManagerState.f2166e = this.f2405d;
        m2590E();
        return fragmentManagerState;
    }

    /* renamed from: f */
    public static void m2630f(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* renamed from: g */
    public static void m2632g(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: k */
    private void m2635k(Fragment fragment) {
        C0631o.m2717a(this, fragment, this.f2413l, 0, 0, false);
    }

    /* renamed from: b */
    public final void mo2653b(C0610b bVar) {
        if (this.f2412k != null) {
            this.f2412k.remove(bVar);
        }
    }

    /* renamed from: d */
    private void m2625d(int i) {
        synchronized (this) {
            this.f2410i.set(i, null);
            if (this.f2411j == null) {
                this.f2411j = new ArrayList<>();
            }
            this.f2411j.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m2628e(int i) {
        try {
            this.f2404c = true;
            mo2673a(i, false);
            this.f2404c = false;
            mo2701j();
        } catch (Throwable th) {
            this.f2404c = false;
            throw th;
        }
    }

    /* renamed from: n */
    private void m2638n(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            this.f2407f.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    /* renamed from: l */
    private void m2636l(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                m2602a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* renamed from: o */
    private Fragment m2639o(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f2406e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = (Fragment) this.f2406e.get(indexOf);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: p */
    private void m2640p(Fragment fragment) {
        if (fragment.mInnerView != null) {
            if (this.f2398B == null) {
                this.f2398B = new SparseArray<>();
            } else {
                this.f2398B.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f2398B);
            if (this.f2398B.size() > 0) {
                fragment.mSavedViewState = this.f2398B;
                this.f2398B = null;
            }
        }
    }

    /* renamed from: j */
    public final void mo2700j(Fragment fragment) {
        if (fragment == null || (this.f2407f.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            this.f2417p = fragment;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: q */
    private Bundle m2641q(Fragment fragment) {
        Bundle bundle;
        if (this.f2397A == null) {
            this.f2397A = new Bundle();
        }
        fragment.performSaveInstanceState(this.f2397A);
        m2626d(fragment, this.f2397A, false);
        if (!this.f2397A.isEmpty()) {
            bundle = this.f2397A;
            this.f2397A = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            m2640p(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: e */
    public final void mo2696e(Fragment fragment) {
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f2406e) {
                this.f2406e.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f2418r = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* renamed from: h */
    public final void mo2697h(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.f2406e) {
                    this.f2406e.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f2418r = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* renamed from: i */
    public final void mo2699i(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f2406e.contains(fragment)) {
                synchronized (this.f2406e) {
                    this.f2406e.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f2418r = true;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Fragment already added: ");
            sb.append(fragment);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    private void m2623c(boolean z) {
        if (this.f2404c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2414m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f2414m.f2160d.getLooper()) {
            if (!z) {
                m2643y();
            }
            if (this.f2424x == null) {
                this.f2424x = new ArrayList<>();
                this.f2425y = new ArrayList<>();
            }
            this.f2404c = true;
            try {
                m2606a(null, null);
            } finally {
                this.f2404c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: m */
    private void m2637m(final Fragment fragment) {
        int i;
        if (fragment.mView != null) {
            C0621c a = m2596a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a == null || a.f2444b == null) {
                if (a != null) {
                    m2617b(fragment.mView, a);
                    fragment.mView.startAnimation(a.f2443a);
                    a.f2443a.start();
                }
                if (!fragment.mHidden || fragment.isHideReplaced()) {
                    i = 0;
                } else {
                    i = 8;
                }
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                a.f2444b.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    a.f2444b.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                m2617b(fragment.mView, a);
                a.f2444b.start();
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.f2418r = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo2695d(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.f2405d;
            this.f2405d = i + 1;
            fragment.setIndex(i, this.f2416o);
            if (this.f2407f == null) {
                this.f2407f = new SparseArray<>();
            }
            this.f2407f.put(fragment.mIndex, fragment);
        }
    }

    /* renamed from: a */
    private static AnimationListener m2597a(Animation animation) {
        try {
            if (f2396q == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f2396q = declaredField;
                declaredField.setAccessible(true);
            }
            return (AnimationListener) f2396q.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private void m2616b(C0888a<Fragment> aVar) {
        if (this.f2413l > 0) {
            int min = Math.min(this.f2413l, 3);
            int size = this.f2406e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f2406e.get(i);
                if (fragment.mState < min) {
                    C0631o.m2717a(this, fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        aVar.add(fragment);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2694c(Fragment fragment) {
        if (fragment != null) {
            int i = this.f2413l;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            C0631o.m2717a(this, fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment o = m2639o(fragment);
                if (o != null) {
                    View view = o.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C0621c a = m2596a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a != null) {
                        m2617b(fragment.mView, a);
                        if (a.f2443a != null) {
                            fragment.mView.startAnimation(a.f2443a);
                        } else {
                            a.f2444b.setTarget(fragment.mView);
                            a.f2444b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                m2637m(fragment);
            }
        }
    }

    /* renamed from: a */
    public final void mo2649a(C0609a aVar, boolean z) {
        this.f2402J.add(new C0624f(aVar, z));
    }

    /* renamed from: e */
    private void m2629e(Fragment fragment, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2629e(fragment, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentStopped(this, fragment);
            }
        }
    }

    /* renamed from: f */
    private void m2631f(Fragment fragment, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2631f(fragment, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    /* renamed from: g */
    private void m2633g(Fragment fragment, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2633g(fragment, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentDestroyed(this, fragment);
            }
        }
    }

    /* renamed from: h */
    private void m2634h(Fragment fragment, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2634h(fragment, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentDetached(this, fragment);
            }
        }
    }

    /* renamed from: c */
    private void m2622c(Fragment fragment, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2622c(fragment, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentResumed(this, fragment);
            }
        }
    }

    /* renamed from: d */
    private void m2627d(Fragment fragment, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2627d(fragment, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentPaused(this, fragment);
            }
        }
    }

    /* renamed from: b */
    private void m2615b(Fragment fragment, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2615b(fragment, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentStarted(this, fragment);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2624c(java.util.ArrayList<android.support.p022v4.app.C0601e> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f2403b     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f2403b     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.l$h> r0 = r4.f2403b     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.l$h> r3 = r4.f2403b     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            android.support.v4.app.l$h r3 = (android.support.p022v4.app.C0612l.C0626h) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.mo2597a(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.l$h> r5 = r4.f2403b     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            android.support.v4.app.FragmentHostCallback r5 = r4.f2414m     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.f2160d     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.f2401E     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.C0612l.m2624c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: a */
    private void m2598a(int i, C0601e eVar) {
        synchronized (this) {
            if (this.f2410i == null) {
                this.f2410i = new ArrayList<>();
            }
            int size = this.f2410i.size();
            if (i < size) {
                this.f2410i.set(i, eVar);
            } else {
                while (size < i) {
                    this.f2410i.add(null);
                    if (this.f2411j == null) {
                        this.f2411j = new ArrayList<>();
                    }
                    this.f2411j.add(Integer.valueOf(size));
                    size++;
                }
                this.f2410i.add(eVar);
            }
        }
    }

    /* renamed from: b */
    private static void m2617b(View view, C0621c cVar) {
        if (!(view == null || cVar == null || !m2610a(view, cVar))) {
            if (cVar.f2444b != null) {
                cVar.f2444b.addListener(new C0622d(view));
                return;
            }
            AnimationListener a = m2597a(cVar.f2443a);
            view.setLayerType(2, null);
            cVar.f2443a.setAnimationListener(new C0618a(view, a));
        }
    }

    /* renamed from: b */
    private void m2618b(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m2606a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0601e) arrayList.get(i)).f2378t) {
                    if (i2 != i) {
                        m2607a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0601e) arrayList.get(i2)).f2378t) {
                            i2++;
                        }
                    }
                    m2607a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m2607a(arrayList, arrayList2, i2, size);
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: a */
    private static C0621c m2594a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f2392G);
        alphaAnimation.setDuration(220);
        return new C0621c((Animation) alphaAnimation);
    }

    /* renamed from: b */
    private void m2613b(Fragment fragment, Context context, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2613b(fragment, context, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentAttached(this, fragment, context);
            }
        }
    }

    /* renamed from: c */
    private void m2621c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2621c(fragment, bundle, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    private void m2626d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2626d(fragment, bundle, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    private void m2614b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2614b(fragment, bundle, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    private void m2599a(Fragment fragment, Context context, boolean z) {
        if (this.f2416o != null) {
            C0612l lVar = this.f2416o.mFragmentManager;
            if (lVar instanceof C0612l) {
                lVar.m2599a(fragment, context, true);
            }
        }
        Iterator it = this.f2402J.iterator();
        while (it.hasNext()) {
            C0624f fVar = (C0624f) it.next();
            if (!z || fVar.f2452b) {
                fVar.f2451a.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    private C0621c m2596a(Fragment fragment, int i, boolean z, int i2) {
        int nextAnim = fragment.getNextAnim();
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C0621c(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C0621c(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.f2414m.f2159c.getResources().getResourceTypeName(nextAnim));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f2414m.f2159c, nextAnim);
                    if (loadAnimation != null) {
                        return new C0621c(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f2414m.f2159c, nextAnim);
                    if (loadAnimator != null) {
                        return new C0621c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f2414m.f2159c, nextAnim);
                        if (loadAnimation2 != null) {
                            return new C0621c(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int b = m2612b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m2595a(this.f2414m.f2159c, 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m2595a(this.f2414m.f2159c, 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m2595a(this.f2414m.f2159c, 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m2595a(this.f2414m.f2159c, 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m2594a(this.f2414m.f2159c, 0.0f, 1.0f);
            case 6:
                return m2594a(this.f2414m.f2159c, 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f2414m.mo2416d()) {
                    i2 = this.f2414m.mo2417e();
                }
                return i2 == 0 ? null : null;
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        Fragment fragment2;
        int i;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0625g.f2453a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(this.f2414m.f2159c, str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment = mo2642a(resourceId);
        } else {
            fragment = null;
        }
        if (fragment == null && string != null) {
            fragment = mo2644a(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = mo2642a(i2);
        }
        if (fragment == null) {
            Fragment a = this.f2415n.mo2350a(context, str2, null);
            a.mFromLayout = true;
            if (resourceId != 0) {
                i = resourceId;
            } else {
                i = i2;
            }
            a.mFragmentId = i;
            a.mContainerId = i2;
            a.mTag = string;
            a.mInLayout = true;
            a.mFragmentManager = this;
            a.mHost = this.f2414m;
            a.onInflate(this.f2414m.f2159c, attributeSet, a.mSavedFragmentState);
            mo2677a(a, true);
            fragment2 = a;
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            fragment.mHost = this.f2414m;
            if (!fragment.mRetaining) {
                fragment.onInflate(this.f2414m.f2159c, attributeSet, fragment.mSavedFragmentState);
            }
            fragment2 = fragment;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(i2));
            sb2.append(" with another fragment for ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.f2413l > 0 || !fragment2.mFromLayout) {
            m2635k(fragment2);
        } else {
            C0631o.m2717a(this, fragment2, 1, 0, 0, false);
        }
        if (fragment2.mView != null) {
            if (resourceId != 0) {
                fragment2.mView.setId(resourceId);
            }
            if (fragment2.mView.getTag() == null) {
                fragment2.mView.setTag(string);
            }
            return fragment2.mView;
        }
        StringBuilder sb3 = new StringBuilder("Fragment ");
        sb3.append(str2);
        sb3.append(" did not create a view.");
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: a */
    private static C0621c m2595a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f2391F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f2392G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0621c((Animation) animationSet);
    }

    /* renamed from: a */
    private int m2593a(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0888a<Fragment> aVar) {
        boolean z;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0601e eVar = (C0601e) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (!eVar.mo2612h() || eVar.mo2596a(arrayList, i4 + 1, i2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f2399C == null) {
                    this.f2399C = new ArrayList<>();
                }
                C0628j jVar = new C0628j(eVar, booleanValue);
                this.f2399C.add(jVar);
                eVar.mo2591a((C0551b) jVar);
                if (booleanValue) {
                    eVar.mo2611g();
                } else {
                    eVar.mo2595a(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, eVar);
                }
                m2616b(aVar);
            }
        }
        return i3;
    }
}
