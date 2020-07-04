package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.p361a.C7704b;
import p346io.reactivex.BackpressureStrategy;
import p346io.reactivex.C47868q;
import p346io.reactivex.C7490k;
import p346io.reactivex.C7491p;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p354j.C47844a;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer */
public final class MaybeBindLifeCycleTransformer<T> implements C0042h, C47868q<T, T> {

    /* renamed from: a */
    public static final C21897a f58619a = new C21897a(null);

    /* renamed from: b */
    private final C47844a<Integer> f58620b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer$a */
    public static final class C21897a {
        private C21897a() {
        }

        public /* synthetic */ C21897a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer$b */
    static final class C21898b<T> implements C7328l<Integer> {

        /* renamed from: a */
        public static final C21898b f58621a = new C21898b();

        C21898b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
            return m73107a((Integer) obj);
        }

        /* renamed from: a */
        private static boolean m73107a(Integer num) {
            C7573i.m23587b(num, "it");
            if (num.intValue() == 1) {
                return true;
            }
            return false;
        }
    }

    public MaybeBindLifeCycleTransformer() {
        C47844a<Integer> a = C47844a.m148742a();
        C7573i.m23582a((Object) a, "BehaviorSubject.create<Int>()");
        this.f58620b = a;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void disposeRequest() {
        this.f58620b.onNext(Integer.valueOf(1));
    }

    /* renamed from: a */
    public final C7491p<T> mo10160a(C7490k<T> kVar) {
        C7573i.m23587b(kVar, "upstream");
        C7490k a = kVar.mo19270a((C7704b<U>) this.f58620b.mo19301b((C7328l<? super T>) C21898b.f58621a).mo19283a(BackpressureStrategy.MISSING));
        C7573i.m23582a((Object) a, "upstream.takeUntil(\n    …rategy.MISSING)\n        )");
        return a;
    }
}
