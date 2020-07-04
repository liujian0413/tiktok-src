package com.p280ss.android.ugc.aweme.journey;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.journey.k */
public final class C32247k implements C7152c {

    /* renamed from: a */
    public static volatile boolean f84280a;

    /* renamed from: b */
    public static final C32248a f84281b = new C32248a(null);

    /* renamed from: c */
    private final boolean f84282c;

    /* renamed from: com.ss.android.ugc.aweme.journey.k$a */
    public static final class C32248a {

        /* renamed from: com.ss.android.ugc.aweme.journey.k$a$a */
        public static final class C32249a implements C7498y<C32244h> {

            /* renamed from: a */
            final /* synthetic */ Context f84283a;

            public final void onComplete() {
            }

            C32249a(Context context) {
                this.f84283a = context;
            }

            public final /* synthetic */ void onNext(Object obj) {
                m104748a((C32244h) obj);
            }

            /* renamed from: a */
            private static void m104748a(C32244h hVar) {
                C7573i.m23587b(hVar, "response");
                C42961az.m136381b(hVar);
            }

            public final void onSubscribe(C7321c cVar) {
                C7573i.m23587b(cVar, "d");
                C32248a.m104746a(true);
            }

            public final void onError(Throwable th) {
                C7573i.m23587b(th, "throwable");
                if (C32250l.f84286c.mo83472e()) {
                    C42961az.m136381b(new C32244h(new C32245i(C32230c.m104534a(this.f84283a), true), null));
                }
            }
        }

        private C32248a() {
        }

        /* renamed from: a */
        public static boolean m104747a() {
            return C32247k.f84280a;
        }

        /* renamed from: a */
        public static void m104746a(boolean z) {
            C32247k.f84280a = true;
        }

        public /* synthetic */ C32248a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m104745a(Context context) {
            C7573i.m23587b(context, "context");
            C32231d.m104535a().getJourney("new_user_journey").mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C32249a<Object>(context));
        }
    }

    /* renamed from: a */
    public final RequestType mo18606a() {
        if (this.f84282c) {
            return RequestType.NORMAL;
        }
        return RequestType.IDLE;
    }

    public C32247k() {
        boolean z;
        if (!C32250l.f84286c.mo83470c() || C32250l.f84285b || f84280a) {
            z = false;
        } else {
            z = true;
        }
        this.f84282c = z;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        if (this.f84282c) {
            C32248a.m104745a(context);
        }
    }
}
