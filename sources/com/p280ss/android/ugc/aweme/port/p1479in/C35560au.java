package com.p280ss.android.ugc.aweme.port.p1479in;

import android.content.Context;
import java.io.File;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlin.p1884io.C47984g;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48093bb;

/* renamed from: com.ss.android.ugc.aweme.port.in.au */
public final class C35560au {

    @C7540d(mo19421b = "LegacyEffectModels.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.port.in.LegacyEffectModels$removeLegacyEffectModelFiles$1")
    /* renamed from: com.ss.android.ugc.aweme.port.in.au$a */
    static final class C35561a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        int f93215a;

        /* renamed from: b */
        final /* synthetic */ File f93216b;

        /* renamed from: c */
        private C48056ad f93217c;

        C35561a(File file, C47919b bVar) {
            this.f93216b = file;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C35561a aVar = new C35561a(this.f93216b, bVar);
            aVar.f93217c = (C48056ad) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C35561a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f93215a == 0) {
                C47984g.m148946e(this.f93216b);
                return C7581n.f20898a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final void m114825a(Context context) {
        C7573i.m23587b(context, "context");
        File filesDir = context.getFilesDir();
        C7573i.m23582a((Object) filesDir, "context.filesDir");
        File c = C47984g.m148944c(C47984g.m148944c(filesDir, "vesdk"), "models");
        if (c.exists()) {
            C48145g.m149385a(C48093bb.f122957a, null, null, new C35561a(c, null), 3, null);
        }
    }
}
