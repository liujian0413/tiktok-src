package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.e */
public final class C21905e {

    /* renamed from: a */
    public C21907b f58625a;

    /* renamed from: b */
    private C7321c f58626b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.e$a */
    public interface C21906a {
        /* renamed from: a */
        void mo58357a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.e$b */
    public interface C21907b {
        /* renamed from: a */
        void mo58358a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.e$c */
    static final class C21908c<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ C21905e f58627a;

        C21908c(C21905e eVar) {
            this.f58627a = eVar;
        }

        public final void subscribe(final C47870u<String> uVar) {
            C7573i.m23587b(uVar, "it");
            this.f58627a.f58625a = new C21907b() {
                /* renamed from: a */
                public final void mo58358a(String str) {
                    C7573i.m23587b(str, "msg");
                    C47870u uVar = uVar;
                    C7573i.m23582a((Object) uVar, "it");
                    if (!uVar.isDisposed()) {
                        uVar.mo19239a((Object) str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.e$d */
    static final class C21910d<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ C21906a f58629a;

        C21910d(C21906a aVar) {
            this.f58629a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            C21906a aVar = this.f58629a;
            C7573i.m23582a((Object) str, "p0");
            aVar.mo58357a(str);
        }
    }

    /* renamed from: a */
    public final void mo58354a() {
        C7321c cVar = this.f58626b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: b */
    private final C7492s<String> m73120b() {
        C7492s<String> a = C7492s.m23282a((C7495v<T>) new C21908c<T>(this));
        C7573i.m23582a((Object) a, "Observable.create {\n    …}\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    public final void mo58356a(String str) {
        C7573i.m23587b(str, "msg");
        C21907b bVar = this.f58625a;
        if (bVar != null) {
            bVar.mo58358a(str);
        }
    }

    /* renamed from: a */
    public final void mo58355a(C21906a aVar, long j, TimeUnit timeUnit) {
        C7573i.m23587b(aVar, "onReceiveMsgListener");
        C7573i.m23587b(timeUnit, "timeUnit");
        this.f58626b = m73120b().mo19315d(1000, timeUnit).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C21910d<Object>(aVar));
    }
}
