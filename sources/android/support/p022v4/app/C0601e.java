package android.support.p022v4.app;

import android.support.p022v4.util.C0892d;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.e */
final class C0601e extends C0633q implements C0626h {

    /* renamed from: a */
    final C0612l f2359a;

    /* renamed from: b */
    ArrayList<C0602a> f2360b = new ArrayList<>();

    /* renamed from: c */
    int f2361c;

    /* renamed from: d */
    int f2362d;

    /* renamed from: e */
    int f2363e;

    /* renamed from: f */
    int f2364f;

    /* renamed from: g */
    public int f2365g;

    /* renamed from: h */
    public int f2366h;

    /* renamed from: i */
    boolean f2367i;

    /* renamed from: j */
    boolean f2368j = true;

    /* renamed from: k */
    String f2369k;

    /* renamed from: l */
    boolean f2370l;

    /* renamed from: m */
    int f2371m = -1;

    /* renamed from: n */
    int f2372n;

    /* renamed from: o */
    CharSequence f2373o;

    /* renamed from: p */
    int f2374p;

    /* renamed from: q */
    CharSequence f2375q;

    /* renamed from: r */
    ArrayList<String> f2376r;

    /* renamed from: s */
    ArrayList<String> f2377s;

    /* renamed from: t */
    boolean f2378t = false;

    /* renamed from: u */
    ArrayList<Runnable> f2379u;

    /* renamed from: android.support.v4.app.e$a */
    static final class C0602a {

        /* renamed from: a */
        int f2380a;

        /* renamed from: b */
        Fragment f2381b;

        /* renamed from: c */
        int f2382c;

        /* renamed from: d */
        int f2383d;

        /* renamed from: e */
        int f2384e;

        /* renamed from: f */
        int f2385f;

        C0602a() {
        }

        C0602a(int i, Fragment fragment) {
            this.f2380a = i;
            this.f2381b = fragment;
        }
    }

    /* renamed from: i */
    public final String mo2613i() {
        return this.f2369k;
    }

    /* renamed from: a */
    public final void mo2593a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo2594a(str, printWriter, true);
    }

    /* renamed from: a */
    public final void mo2594a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2369k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2371m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2370l);
            if (this.f2365g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2365g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2366h));
            }
            if (!(this.f2361c == 0 && this.f2362d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2361c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2362d));
            }
            if (!(this.f2363e == 0 && this.f2364f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2363e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2364f));
            }
            if (!(this.f2372n == 0 && this.f2373o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2372n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2373o);
            }
            if (!(this.f2374p == 0 && this.f2375q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2374p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2375q);
            }
        }
        if (!this.f2360b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            int size = this.f2360b.size();
            for (int i = 0; i < size; i++) {
                C0602a aVar = (C0602a) this.f2360b.get(i);
                switch (aVar.f2380a) {
                    case 0:
                        str2 = POIService.INVALID_ID;
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("cmd=");
                        sb2.append(aVar.f2380a);
                        str2 = sb2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2381b);
                if (z) {
                    if (!(aVar.f2382c == 0 && aVar.f2383d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2382c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2383d));
                    }
                    if (aVar.f2384e != 0 || aVar.f2385f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2384e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2385f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2592a(C0602a aVar) {
        this.f2360b.add(aVar);
        aVar.f2382c = this.f2361c;
        aVar.f2383d = this.f2362d;
        aVar.f2384e = this.f2363e;
        aVar.f2385f = this.f2364f;
    }

    /* renamed from: a */
    public final C0633q mo2589a(String str) {
        if (this.f2368j) {
            this.f2367i = true;
            this.f2369k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2590a(int i) {
        if (this.f2367i) {
            int size = this.f2360b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0602a aVar = (C0602a) this.f2360b.get(i2);
                if (aVar.f2381b != null) {
                    aVar.f2381b.mBackStackNesting += i;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2597a(ArrayList<C0601e> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f2367i) {
            this.f2359a.mo2688b(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2596a(ArrayList<C0601e> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2360b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0602a aVar = (C0602a) this.f2360b.get(i4);
            int i5 = aVar.f2381b != null ? aVar.f2381b.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0601e eVar = (C0601e) arrayList.get(i6);
                    int size2 = eVar.f2360b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0602a aVar2 = (C0602a) eVar.f2360b.get(i7);
                        if ((aVar2.f2381b != null ? aVar2.f2381b.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2595a(boolean z) {
        for (int size = this.f2360b.size() - 1; size >= 0; size--) {
            C0602a aVar = (C0602a) this.f2360b.get(size);
            Fragment fragment = aVar.f2381b;
            if (fragment != null) {
                fragment.setNextTransition(C0612l.m2620c(this.f2365g), this.f2366h);
            }
            int i = aVar.f2380a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        fragment.setNextAnim(aVar.f2384e);
                        this.f2359a.mo2677a(fragment, false);
                        break;
                    case 4:
                        fragment.setNextAnim(aVar.f2384e);
                        C0612l.m2632g(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(aVar.f2385f);
                        C0612l.m2630f(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(aVar.f2384e);
                        this.f2359a.mo2699i(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(aVar.f2385f);
                        this.f2359a.mo2697h(fragment);
                        break;
                    case 8:
                        this.f2359a.mo2700j(null);
                        break;
                    case 9:
                        this.f2359a.mo2700j(fragment);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown cmd: ");
                        sb.append(aVar.f2380a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.setNextAnim(aVar.f2385f);
                this.f2359a.mo2696e(fragment);
            }
            if (!(this.f2378t || aVar.f2380a == 3 || fragment == null)) {
                this.f2359a.mo2694c(fragment);
            }
        }
        if (!this.f2378t && z) {
            this.f2359a.mo2673a(this.f2359a.f2413l, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2591a(C0551b bVar) {
        for (int i = 0; i < this.f2360b.size(); i++) {
            C0602a aVar = (C0602a) this.f2360b.get(i);
            if (m2494b(aVar)) {
                aVar.f2381b.setOnStartEnterTransitionListener(bVar);
            }
        }
    }

    /* renamed from: c */
    public final int mo2604c() {
        return m2493b(false);
    }

    /* renamed from: d */
    public final int mo2606d() {
        return m2493b(true);
    }

    /* renamed from: j */
    public final boolean mo2614j() {
        return this.f2360b.isEmpty();
    }

    /* renamed from: a */
    public final C0633q mo2582a() {
        if (!this.f2367i) {
            this.f2368j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: f */
    public final void mo2610f() {
        mo2582a();
        this.f2359a.mo2689b((C0626h) this, true);
    }

    /* renamed from: e */
    public final void mo2609e() {
        mo2582a();
        this.f2359a.mo2689b((C0626h) this, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo2612h() {
        for (int i = 0; i < this.f2360b.size(); i++) {
            if (m2494b((C0602a) this.f2360b.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2371m >= 0) {
            sb.append(" #");
            sb.append(this.f2371m);
        }
        if (this.f2369k != null) {
            sb.append(" ");
            sb.append(this.f2369k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo2611g() {
        int size = this.f2360b.size();
        for (int i = 0; i < size; i++) {
            C0602a aVar = (C0602a) this.f2360b.get(i);
            Fragment fragment = aVar.f2381b;
            if (fragment != null) {
                fragment.setNextTransition(this.f2365g, this.f2366h);
            }
            int i2 = aVar.f2380a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fragment.setNextAnim(aVar.f2383d);
                        this.f2359a.mo2696e(fragment);
                        break;
                    case 4:
                        fragment.setNextAnim(aVar.f2383d);
                        C0612l.m2630f(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(aVar.f2382c);
                        C0612l.m2632g(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(aVar.f2383d);
                        this.f2359a.mo2697h(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(aVar.f2382c);
                        this.f2359a.mo2699i(fragment);
                        break;
                    case 8:
                        this.f2359a.mo2700j(fragment);
                        break;
                    case 9:
                        this.f2359a.mo2700j(null);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown cmd: ");
                        sb.append(aVar.f2380a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.setNextAnim(aVar.f2382c);
                this.f2359a.mo2677a(fragment, false);
            }
            if (!(this.f2378t || aVar.f2380a == 1 || fragment == null)) {
                this.f2359a.mo2694c(fragment);
            }
        }
        if (!this.f2378t) {
            this.f2359a.mo2673a(this.f2359a.f2413l, true);
        }
    }

    /* renamed from: b */
    public final void mo2602b() {
        if (this.f2379u != null) {
            int size = this.f2379u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f2379u.get(i)).run();
            }
            this.f2379u = null;
        }
    }

    /* renamed from: c */
    public final C0633q mo2605c(Fragment fragment) {
        mo2592a(new C0602a(5, fragment));
        return this;
    }

    /* renamed from: d */
    public final C0633q mo2607d(Fragment fragment) {
        mo2592a(new C0602a(6, fragment));
        return this;
    }

    /* renamed from: e */
    public final C0633q mo2608e(Fragment fragment) {
        mo2592a(new C0602a(7, fragment));
        return this;
    }

    public C0601e(C0612l lVar) {
        this.f2359a = lVar;
    }

    /* renamed from: b */
    private static boolean m2494b(C0602a aVar) {
        Fragment fragment = aVar.f2381b;
        if (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m2493b(boolean z) {
        if (!this.f2370l) {
            if (C0612l.f2395a) {
                PrintWriter printWriter = new PrintWriter(new C0892d("FragmentManager"));
                mo2593a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f2370l = true;
            if (this.f2367i) {
                this.f2371m = this.f2359a.mo2672a(this);
            } else {
                this.f2371m = -1;
            }
            this.f2359a.mo2680a((C0626h) this, z);
            return this.f2371m;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: b */
    public final C0633q mo2601b(Fragment fragment) {
        mo2592a(new C0602a(4, fragment));
        return this;
    }

    /* renamed from: a */
    public final C0633q mo2587a(Fragment fragment) {
        mo2592a(new C0602a(3, fragment));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo2603b(int i) {
        int i2;
        int size = this.f2360b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0602a aVar = (C0602a) this.f2360b.get(i3);
            if (aVar.f2381b != null) {
                i2 = aVar.f2381b.mContainerId;
            } else {
                i2 = 0;
            }
            if (i2 != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C0633q mo2583a(int i, int i2) {
        return mo2584a(i, i2, 0, 0);
    }

    /* renamed from: b */
    public final C0633q mo2599b(int i, Fragment fragment) {
        return mo2600b(i, fragment, null);
    }

    /* renamed from: a */
    public final C0633q mo2585a(int i, Fragment fragment) {
        m2492a(i, fragment, (String) null, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Fragment mo2598b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f2360b.size(); i++) {
            C0602a aVar = (C0602a) this.f2360b.get(i);
            int i2 = aVar.f2380a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2381b;
                            break;
                    }
                }
                arrayList.add(aVar.f2381b);
            }
            arrayList.remove(aVar.f2381b);
        }
        return fragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Fragment mo2581a(ArrayList<Fragment> arrayList, Fragment fragment) {
        int i;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i < this.f2360b.size()) {
            C0602a aVar = (C0602a) this.f2360b.get(i);
            switch (aVar.f2380a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f2381b);
                    break;
                case 2:
                    Fragment fragment3 = aVar.f2381b;
                    int i3 = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f2360b.add(i4, new C0602a(9, fragment5));
                                    i4++;
                                    fragment4 = null;
                                }
                                C0602a aVar2 = new C0602a(3, fragment5);
                                aVar2.f2382c = aVar.f2382c;
                                aVar2.f2384e = aVar.f2384e;
                                aVar2.f2383d = aVar.f2383d;
                                aVar2.f2385f = aVar.f2385f;
                                this.f2360b.add(i4, aVar2);
                                arrayList.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f2360b.remove(i4);
                        i = i4 - 1;
                    } else {
                        aVar.f2380a = 1;
                        arrayList.add(fragment3);
                        i = i4;
                    }
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f2381b);
                    if (aVar.f2381b != fragment2) {
                        break;
                    } else {
                        this.f2360b.add(i, new C0602a(9, aVar.f2381b));
                        i++;
                        fragment2 = null;
                        break;
                    }
                case 8:
                    this.f2360b.add(i, new C0602a(9, fragment2));
                    i++;
                    fragment2 = aVar.f2381b;
                    break;
            }
            i2 = i + 1;
        }
        return fragment2;
    }

    /* renamed from: a */
    public final C0633q mo2588a(Fragment fragment, String str) {
        m2492a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: b */
    public final C0633q mo2600b(int i, Fragment fragment, String str) {
        if (i != 0) {
            m2492a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: a */
    public final C0633q mo2586a(int i, Fragment fragment, String str) {
        m2492a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public final C0633q mo2584a(int i, int i2, int i3, int i4) {
        this.f2361c = i;
        this.f2362d = i2;
        this.f2363e = i3;
        this.f2364f = i4;
        return this;
    }

    /* renamed from: a */
    private void m2492a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        fragment.mFragmentManager = this.f2359a;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        mo2592a(new C0602a(i2, fragment));
    }
}
