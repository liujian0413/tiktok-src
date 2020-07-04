package com.bytedance.jedi.model.p600b;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p600b.C11766a.C11767a;
import com.bytedance.jedi.model.p600b.C11766a.C11768b;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p602d.C11789a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.model.b.b */
public final class C11774b {

    /* renamed from: com.bytedance.jedi.model.b.b$a */
    static final class C11775a extends Lambda implements C7562b<C11768b<K, RESP, K1, V1>, C7581n> {

        /* renamed from: a */
        public static final C11775a f31570a = new C11775a();

        C11775a() {
            super(1);
        }

        /* renamed from: a */
        private static void m34504a(C11768b<K, RESP, K1, V1> bVar) {
            C7573i.m23587b(bVar, "$receiver");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34504a((C11768b) obj);
            return C7581n.f20898a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <K, V, REQ, RESP, K1, V1> C11766a<K, V, REQ, RESP, K1, V1> m34502a(C11789a<K, V, REQ, RESP> aVar, C11750c<K1, V1> cVar, C7562b<? super C11768b<K, RESP, K1, V1>, C7581n> bVar) {
        C7573i.m23587b(aVar, "$this$withCache");
        C7573i.m23587b(cVar, "cache");
        C7573i.m23587b(bVar, "block");
        return C11767a.m34495a(aVar, C11783b.m34514a(cVar), bVar);
    }
}
