package com.p280ss.android.ugc.aweme.account.login.p975v2.timer;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.C0049m;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder */
public final class TimerHolder extends AndroidViewModel {

    /* renamed from: c */
    public static final C22033a f58906c = new C22033a(null);

    /* renamed from: b */
    public final C0049m<SparseArray<Map<String, C22034b>>> f58907b = new C0049m<>();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder$a */
    public static final class C22033a {
        private C22033a() {
        }

        public /* synthetic */ C22033a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C22034b m73316a(FragmentActivity fragmentActivity, String str, Scene scene) {
            C7573i.m23587b(str, "timerId");
            C7573i.m23587b(scene, "scene");
            if (fragmentActivity == null) {
                return null;
            }
            SparseArray sparseArray = (SparseArray) ((TimerHolder) C0069x.m159a(fragmentActivity).mo147a(TimerHolder.class)).f58907b.getValue();
            if (sparseArray != null) {
                Map map = (Map) sparseArray.get(scene.getValue());
                if (map != null) {
                    return (C22034b) map.get(str);
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m73317a(FragmentActivity fragmentActivity, Scene scene, String str, boolean z) {
            C7573i.m23587b(str, "timerId");
            if (fragmentActivity != null && scene != null) {
                C0049m<SparseArray<Map<String, C22034b>>> mVar = ((TimerHolder) C0069x.m159a(fragmentActivity).mo147a(TimerHolder.class)).f58907b;
                SparseArray sparseArray = (SparseArray) mVar.getValue();
                if (sparseArray != null) {
                    Map map = (Map) sparseArray.get(scene.getValue());
                    if (map != null) {
                        C22034b bVar = (C22034b) map.get(str);
                        if (bVar != null) {
                            bVar.f58909b = Boolean.valueOf(z);
                            mVar.postValue(sparseArray);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static void m73318a(FragmentActivity fragmentActivity, String str, C22034b bVar, Scene scene) {
            C7573i.m23587b(str, "timerId");
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(scene, "scene");
            if (fragmentActivity != null) {
                C0049m<SparseArray<Map<String, C22034b>>> mVar = ((TimerHolder) C0069x.m159a(fragmentActivity).mo147a(TimerHolder.class)).f58907b;
                SparseArray sparseArray = (SparseArray) mVar.getValue();
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                Map map = (Map) sparseArray.get(scene.getValue());
                if (map == null) {
                    map = new LinkedHashMap();
                }
                map.put(str, bVar);
                sparseArray.put(scene.getValue(), map);
                mVar.postValue(sparseArray);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder$b */
    public static final class C22034b {

        /* renamed from: a */
        public C21866f f58908a;

        /* renamed from: b */
        public Boolean f58909b;

        private C22034b(C21866f fVar, Boolean bool) {
            C7573i.m23587b(fVar, "timer");
            this.f58908a = fVar;
            this.f58909b = bool;
        }

        public /* synthetic */ C22034b(C21866f fVar, Boolean bool, int i, C7571f fVar2) {
            this(fVar, null);
        }
    }

    public TimerHolder(Application application) {
        C7573i.m23587b(application, "app");
        super(application);
    }
}
