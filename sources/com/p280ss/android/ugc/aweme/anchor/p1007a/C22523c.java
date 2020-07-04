package com.p280ss.android.ugc.aweme.anchor.p1007a;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22528c;
import com.p280ss.android.ugc.aweme.anchor.binder.base.module.CollectionItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.module.EmptyRecommendItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.module.RecentlyItemViewBinder;
import com.p280ss.android.ugc.aweme.anchor.binder.base.module.RecommendItemViewBinder;
import java.util.Collection;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.C48227d;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.a.c */
public abstract class C22523c {

    /* renamed from: a */
    public static final C22524a f59996a = new C22524a(null);

    /* renamed from: com.ss.android.ugc.aweme.anchor.a.c$a */
    public static final class C22524a {
        private C22524a() {
        }

        public /* synthetic */ C22524a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.a.c$b */
    static final class C22525b<T> implements C48227d<C22528c> {

        /* renamed from: a */
        public static final C22525b f59997a = new C22525b();

        C22525b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo21960a(Object obj) {
            return m74491a((C22528c) obj);
        }

        /* renamed from: a */
        private static int m74491a(C22528c cVar) {
            boolean z;
            C7573i.m23587b(cVar, "module");
            Collection collection = cVar.f60012e;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return 0;
            }
            Integer num = cVar.f60008a;
            if (num != null && num.intValue() == 1) {
                return 1;
            }
            if (num != null && num.intValue() == 2) {
                return 2;
            }
            if (num != null && num.intValue() == 3) {
                return 3;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public abstract void mo59137a(MultiTypeAdapter multiTypeAdapter, Activity activity, String str);

    /* renamed from: a */
    public final MultiTypeAdapter mo59138a(Activity activity, String str) {
        C7573i.m23587b(str, "fragmentType");
        MultiTypeAdapter multiTypeAdapter = new MultiTypeAdapter();
        m74488a(multiTypeAdapter, activity);
        mo59137a(multiTypeAdapter, activity, str);
        return multiTypeAdapter;
    }

    /* renamed from: a */
    private static void m74488a(MultiTypeAdapter multiTypeAdapter, Activity activity) {
        multiTypeAdapter.mo120456a(C22528c.class).mo120465a(new EmptyRecommendItemViewBinder(activity), new RecommendItemViewBinder(activity), new RecentlyItemViewBinder(activity), new CollectionItemViewBinder(activity)).mo120466a(C22525b.f59997a);
    }
}
