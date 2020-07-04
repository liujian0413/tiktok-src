package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47920c;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.internal.C48175s;
import kotlinx.coroutines.internal.C48180x;
import kotlinx.coroutines.p1885a.C48049a;
import kotlinx.coroutines.p1885a.C48050b;

/* renamed from: kotlinx.coroutines.g */
final /* synthetic */ class C48145g {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> Object m149383a(C47924e eVar, C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> mVar, C47919b<? super T> bVar) {
        Object obj;
        C47924e context = bVar.getContext();
        C47924e plus = context.plus(eVar);
        if (plus == context) {
            C48175s sVar = new C48175s(plus, bVar);
            obj = C48050b.m149007a((C48048a<? super T>) sVar, sVar, mVar);
        } else if (C7573i.m23585a((Object) (C47920c) plus.get(C47920c.f122777a), (Object) (C47920c) context.get(C47920c.f122777a))) {
            C48140ci ciVar = new C48140ci(plus, bVar);
            Object a = C48180x.m149482a(plus, null);
            try {
                Object a2 = C48050b.m149007a((C48048a<? super T>) ciVar, ciVar, mVar);
                C48180x.m149483b(plus, a);
                obj = a2;
            } catch (Throwable th) {
                C48180x.m149483b(plus, a);
                throw th;
            }
        } else {
            C48077ap apVar = new C48077ap(plus, bVar);
            apVar.ca_();
            C48049a.m149006a(mVar, apVar, apVar);
            obj = apVar.mo120286i();
        }
        if (obj == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return obj;
    }

    /* renamed from: a */
    public static final C48100bi m149384a(C48056ad adVar, C47924e eVar, CoroutineStart coroutineStart, C7563m<? super C48056ad, ? super C47919b<? super C7581n>, ? extends Object> mVar) {
        C48125ca caVar;
        C7573i.m23587b(adVar, "receiver$0");
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(coroutineStart, "start");
        C7573i.m23587b(mVar, "block");
        C47924e a = C48221x.m149607a(adVar, eVar);
        if (coroutineStart.isLazy()) {
            caVar = new C48115br(a, mVar);
        } else {
            caVar = new C48125ca(a, true);
        }
        caVar.mo120250a(coroutineStart, caVar, mVar);
        return caVar;
    }

    /* renamed from: b */
    public static final <T> C48063ak<T> m149386b(C48056ad adVar, C47924e eVar, CoroutineStart coroutineStart, C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> mVar) {
        C48064al alVar;
        C7573i.m23587b(adVar, "receiver$0");
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(coroutineStart, "start");
        C7573i.m23587b(mVar, "block");
        C47924e a = C48221x.m149607a(adVar, eVar);
        if (coroutineStart.isLazy()) {
            alVar = new C48114bq(a, mVar);
        } else {
            alVar = new C48064al(a, true);
        }
        alVar.mo120250a(coroutineStart, alVar, mVar);
        return alVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C48100bi m149385a(C48056ad adVar, C47924e eVar, CoroutineStart coroutineStart, C7563m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C48143e.m149379b(adVar, eVar, coroutineStart, mVar);
    }

    /* renamed from: b */
    public static /* synthetic */ C48063ak m149387b(C48056ad adVar, C47924e eVar, CoroutineStart coroutineStart, C7563m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C48143e.m149377a(adVar, eVar, coroutineStart, mVar);
    }
}
