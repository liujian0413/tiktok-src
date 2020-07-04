package com.p280ss.android.ugc.aweme.profile.jedi.p1485a;

import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11805b;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.b */
public final class C35820b extends C11994b {

    /* renamed from: a */
    public static final C35820b f93872a;

    /* renamed from: b */
    private static final C35819a f93873b = C35819a.f93871a;

    /* renamed from: c */
    private static final C35826d f93874c = new C35826d();

    /* renamed from: d */
    private static final C35829e f93875d = new C35829e();

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.b$a */
    static final class C35823a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C35823a f93877a = new C35823a();

        C35823a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m115649a((C11786e) obj);
        }

        /* renamed from: a */
        private static List<C27311c> m115649a(C11786e<? extends List<? extends C27311c>> eVar) {
            C7573i.m23587b(eVar, "it");
            List<C27311c> list = (List) eVar.mo29356a();
            if (list == null) {
                return C7525m.m23461a();
            }
            return list;
        }
    }

    private C35820b() {
    }

    /* renamed from: c */
    public static void m115646c() {
        f93873b.mo29334b();
    }

    /* renamed from: b */
    public static C7319aa<List<C27311c>> m115645b() {
        return C7319aa.m22929a((C7496w<? extends T>) f93874c.mo29357c(C7581n.f20898a));
    }

    /* renamed from: d */
    public static C7492s<List<C27311c>> m115647d() {
        return C11783b.m34515a((C11757e<K, V>) f93873b).mo29342a(C7581n.f20898a, (C11785d<?, ?>[]) new C11785d[0]).mo19317d((C7327h<? super T, ? extends R>) C35823a.f93877a);
    }

    static {
        C35820b bVar = new C35820b();
        f93872a = bVar;
        bVar.mo29602a(C11783b.m34516a((C11790b<K, V, REQ, RESP>) f93874c), C11783b.m34515a((C11757e<K, V>) f93873b), C11805b.m34557a((C7563m<? super K, ? super V, ? extends K1>) C11806a.f31598a, (C48006q<? super K, ? super V, ? super V1, ? extends V1>) C11993a.f31891a));
        bVar.mo29602a(C11783b.m34516a((C11790b<K, V, REQ, RESP>) f93875d), C11783b.m34515a((C11757e<K, V>) f93873b), C11805b.m34556a((C7563m<? super V, ? super V1, Boolean>) C11807b.f31599a, (C7563m<? super V, ? super V1, ? extends V1>) C358211.f93876a));
        C35824c.f93878a.mo90719a();
    }

    /* renamed from: a */
    public static C7319aa<C27311c> m115644a(C27311c cVar) {
        C7573i.m23587b(cVar, "awemeDraft");
        return C7319aa.m22929a((C7496w<? extends T>) f93875d.mo29357c(cVar));
    }
}
