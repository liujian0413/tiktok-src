package com.p280ss.android.ugc.aweme.antiaddic.lock.api;

import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import kotlin.C47965i;
import kotlin.Result;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47940f;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.a */
public final class C22592a {

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.a$a */
    public static final class C22593a implements C18245g<T> {

        /* renamed from: a */
        final /* synthetic */ C47919b f60166a;

        C22593a(C47919b bVar) {
            this.f60166a = bVar;
        }

        public final void onSuccess(T t) {
            if (t != null) {
                this.f60166a.resumeWith(Result.m150902constructorimpl(t));
            }
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f60166a.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
        }
    }

    /* renamed from: a */
    public static final <T> Object m74662a(C18253l<T> lVar, C47919b<? super T> bVar) {
        C47940f fVar = new C47940f(C47948a.m148878a(bVar));
        C18246h.m60213a(lVar, new C22593a(fVar));
        Object a = fVar.mo120151a();
        if (a == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return a;
    }
}
