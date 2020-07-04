package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.navigation.C12666f;
import com.bytedance.scene.utlity.C12699i;
import com.bytedance.scene.utlity.C12700j;
import com.bytedance.scene.utlity.SceneInstanceUtility;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.scene.i */
public final class C12626i {

    /* renamed from: a */
    private static final WeakHashMap<Activity, HashSet<String>> f33511a = new WeakHashMap<>();

    /* renamed from: com.bytedance.scene.i$a */
    public static final class C12628a {

        /* renamed from: a */
        private final Activity f33512a;

        /* renamed from: b */
        private final Class<? extends C12629j> f33513b;

        /* renamed from: c */
        private Bundle f33514c;

        /* renamed from: d */
        private boolean f33515d;

        /* renamed from: e */
        private boolean f33516e;

        /* renamed from: f */
        private int f33517f;

        /* renamed from: g */
        private int f33518g;

        /* renamed from: h */
        private boolean f33519h;

        /* renamed from: i */
        private C12640l f33520i;

        /* renamed from: j */
        private String f33521j;

        /* renamed from: k */
        private boolean f33522k;

        /* renamed from: a */
        public final C12642n mo30990a() {
            C12666f fVar = new C12666f(this.f33513b, this.f33514c);
            fVar.mo31105a(this.f33515d);
            fVar.mo31106b(this.f33516e);
            fVar.mo31104a(this.f33517f);
            return C12626i.m36629a(this.f33512a, this.f33518g, fVar, this.f33520i, this.f33519h, this.f33521j, this.f33522k);
        }

        /* renamed from: a */
        public final C12628a mo30987a(int i) {
            this.f33518g = i;
            return this;
        }

        /* renamed from: b */
        public final C12628a mo30991b(boolean z) {
            this.f33515d = false;
            return this;
        }

        /* renamed from: c */
        public final C12628a mo30992c(boolean z) {
            this.f33516e = false;
            return this;
        }

        /* renamed from: a */
        public final C12628a mo30988a(C12640l lVar) {
            this.f33520i = lVar;
            return this;
        }

        /* renamed from: a */
        public final C12628a mo30989a(boolean z) {
            this.f33519h = z;
            return this;
        }

        private C12628a(Activity activity, Class<? extends C12629j> cls) {
            this.f33515d = true;
            this.f33516e = true;
            this.f33518g = 16908290;
            this.f33521j = "LifeCycleFragment";
            this.f33522k = true;
            this.f33512a = (Activity) C12700j.m36907a(activity, "Activity can't be null");
            this.f33513b = (Class) C12700j.m36907a(cls, "Root Scene class can't be null");
        }
    }

    /* renamed from: a */
    public static C12628a m36626a(Activity activity, Class<? extends C12629j> cls) {
        return new C12628a(activity, cls);
    }

    /* renamed from: b */
    static void m36632b(Activity activity, String str) {
        ((HashSet) f33511a.get(activity)).remove(str);
    }

    /* renamed from: a */
    static void m36631a(Activity activity, String str) {
        if (f33511a.get(activity) == null || !((HashSet) f33511a.get(activity)).contains(str)) {
            HashSet hashSet = (HashSet) f33511a.get(activity);
            if (hashSet == null) {
                hashSet = new HashSet();
                f33511a.put(activity, hashSet);
            }
            hashSet.add(str);
            return;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Activity");
    }

    /* renamed from: a */
    public static C12642n m36630a(Activity activity, Bundle bundle, C12666f fVar, boolean z) {
        return m36627a(activity, 16908290, bundle, fVar, null, false);
    }

    /* renamed from: a */
    private static C12642n m36627a(Activity activity, int i, Bundle bundle, C12666f fVar, C12640l lVar, boolean z) {
        return m36628a(activity, 16908290, bundle, fVar, null, z, "LifeCycleFragment", true);
    }

    /* renamed from: a */
    public static C12642n m36629a(Activity activity, int i, C12666f fVar, C12640l lVar, boolean z, String str, boolean z2) {
        C12679u a;
        C12699i.m36905a();
        if (str != null) {
            m36631a(activity, str);
            C12648d dVar = (C12648d) SceneInstanceUtility.m36887a(C12648d.class, fVar.mo31103a());
            if (!C12700j.m36913a(activity)) {
                return new C12595d(dVar);
            }
            dVar.f33574i = lVar;
            FragmentManager fragmentManager = activity.getFragmentManager();
            C12600g gVar = (C12600g) fragmentManager.findFragmentByTag(str);
            if (gVar != null && !z) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(gVar);
                C12700j.m36910a(fragmentManager, beginTransaction, z2);
                gVar = null;
            }
            C12600g gVar2 = gVar;
            C12581b bVar = new C12581b(activity);
            if (gVar2 != null) {
                a = C12679u.m36864a(activity, str, false, z2);
                C12669o oVar = new C12669o(i, bVar, dVar, a, z);
                gVar2.f33435b = oVar;
            } else {
                gVar2 = C12600g.m36518a(z);
                FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
                beginTransaction2.add(i, gVar2, str);
                a = C12679u.m36864a(activity, str, !z, z2);
                C12669o oVar2 = new C12669o(i, bVar, dVar, a, z);
                gVar2.f33435b = oVar2;
                C12700j.m36910a(fragmentManager, beginTransaction2, z2);
            }
            C12624h hVar = new C12624h(activity, dVar, gVar2, a, z2);
            return hVar;
        }
        throw new IllegalArgumentException("tag cant be null");
    }

    /* renamed from: a */
    private static C12642n m36628a(Activity activity, int i, Bundle bundle, C12666f fVar, C12640l lVar, boolean z, String str, boolean z2) {
        return m36629a(activity, i, fVar, lVar, z, str, true);
    }
}
