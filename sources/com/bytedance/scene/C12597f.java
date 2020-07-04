package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.utlity.C12699i;
import com.bytedance.scene.utlity.C12700j;
import com.bytedance.scene.utlity.SceneInstanceUtility;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.scene.f */
public final class C12597f {

    /* renamed from: com.bytedance.scene.f$a */
    public static final class C12599a {

        /* renamed from: a */
        private final Activity f33426a;

        /* renamed from: b */
        private final Class<? extends C12604b> f33427b;

        /* renamed from: c */
        private Bundle f33428c;

        /* renamed from: d */
        private int f33429d;

        /* renamed from: e */
        private boolean f33430e;

        /* renamed from: f */
        private C12640l f33431f;

        /* renamed from: g */
        private String f33432g;

        /* renamed from: h */
        private boolean f33433h;

        /* renamed from: a */
        public final C12596e mo30879a() {
            return C12597f.m36511a(this.f33426a, this.f33429d, this.f33427b, this.f33428c, this.f33431f, this.f33430e, this.f33432g, this.f33433h);
        }

        /* renamed from: a */
        public final C12599a mo30881a(C12640l lVar) {
            this.f33431f = lVar;
            return this;
        }

        /* renamed from: a */
        public final C12599a mo30880a(int i) {
            this.f33429d = R.id.cuv;
            return this;
        }

        /* renamed from: a */
        public final C12599a mo30882a(boolean z) {
            this.f33430e = false;
            return this;
        }

        private C12599a(Activity activity, Class<? extends C12604b> cls) {
            this.f33429d = 16908290;
            this.f33432g = "LifeCycleFragment";
            this.f33433h = true;
            this.f33426a = (Activity) C12700j.m36907a(activity, "Activity can't be null");
            this.f33427b = (Class) C12700j.m36907a(cls, "Root Scene class can't be null");
        }
    }

    /* renamed from: a */
    public static C12599a m36512a(Activity activity, Class<? extends C12604b> cls) {
        return new C12599a(activity, cls);
    }

    /* renamed from: a */
    public static C12596e m36511a(Activity activity, int i, Class<? extends C12604b> cls, Bundle bundle, C12640l lVar, boolean z, String str, boolean z2) {
        C12604b bVar;
        final C12679u a;
        C12699i.m36905a();
        if (str != null) {
            C12626i.m36631a(activity, str);
            if (lVar != null) {
                bVar = (C12604b) lVar.mo31032a(activity.getClass().getClassLoader(), cls.getName(), bundle);
            } else {
                bVar = null;
            }
            if (bVar == null) {
                bVar = (C12604b) SceneInstanceUtility.m36887a(cls, bundle);
            }
            if (!C12700j.m36913a(activity)) {
                return new C12590c(bVar);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            C12600g gVar = (C12600g) fragmentManager.findFragmentByTag(str);
            if (gVar != null && !z) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(gVar);
                C12700j.m36910a(fragmentManager, beginTransaction, z2);
                gVar = null;
            }
            C12581b bVar2 = new C12581b(activity);
            if (gVar != null) {
                a = C12679u.m36864a(activity, str, false, z2);
                C12669o oVar = new C12669o(i, bVar2, bVar, a, z);
                gVar.f33435b = oVar;
            } else {
                gVar = C12600g.m36518a(z);
                FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
                beginTransaction2.add(i, gVar, str);
                a = C12679u.m36864a(activity, str, !z, z2);
                C12669o oVar2 = new C12669o(i, bVar2, bVar, a, z);
                gVar.f33435b = oVar2;
                C12700j.m36910a(fragmentManager, beginTransaction2, z2);
            }
            final C12600g gVar2 = gVar;
            final C12604b bVar3 = bVar;
            final Activity activity2 = activity;
            final boolean z3 = z2;
            C125981 r1 = new C12596e() {

                /* renamed from: a */
                boolean f33420a;

                /* renamed from: a */
                public final C12604b mo30865a() {
                    if (this.f33420a) {
                        return null;
                    }
                    return bVar3;
                }
            };
            return r1;
        }
        throw new IllegalArgumentException("tag cant be null");
    }
}
