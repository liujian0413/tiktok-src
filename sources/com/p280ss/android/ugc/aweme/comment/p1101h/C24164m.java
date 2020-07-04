package com.p280ss.android.ugc.aweme.comment.p1101h;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.comment.h.m */
public final class C24164m {

    /* renamed from: a */
    public C24166b f63838a;

    /* renamed from: b */
    private C7321c f63839b;

    /* renamed from: com.ss.android.ugc.aweme.comment.h.m$a */
    public interface C24165a {
        /* renamed from: a */
        void mo62309a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.h.m$b */
    public interface C24166b {
        /* renamed from: a */
        void mo62614a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.h.m$c */
    static final class C24167c<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ C24164m f63840a;

        C24167c(C24164m mVar) {
            this.f63840a = mVar;
        }

        public final void subscribe(final C47870u<String> uVar) {
            C7573i.m23587b(uVar, "it");
            this.f63840a.f63838a = new C24166b() {
                /* renamed from: a */
                public final void mo62614a(String str) {
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

    /* renamed from: com.ss.android.ugc.aweme.comment.h.m$d */
    static final class C24169d<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ C24165a f63842a;

        C24169d(C24165a aVar) {
            this.f63842a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            C24165a aVar = this.f63842a;
            C7573i.m23582a((Object) str, "p0");
            aVar.mo62309a(str);
        }
    }

    /* renamed from: a */
    public final void mo62611a() {
        C7321c cVar = this.f63839b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: b */
    private final C7492s<String> m79392b() {
        C7492s<String> a = C7492s.m23282a((C7495v<T>) new C24167c<T>(this));
        C7573i.m23582a((Object) a, "Observable.create {\n    …}\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    public final void mo62613a(String str) {
        C7573i.m23587b(str, "msg");
        C24166b bVar = this.f63838a;
        if (bVar != null) {
            bVar.mo62614a(str);
        }
    }

    /* renamed from: a */
    public final void mo62612a(C24165a aVar, long j, TimeUnit timeUnit) {
        C7573i.m23587b(aVar, "onReceiveMsgListener");
        C7573i.m23587b(timeUnit, "timeUnit");
        this.f63839b = m79392b().mo19315d(300, timeUnit).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C24169d<Object>(aVar));
    }
}
