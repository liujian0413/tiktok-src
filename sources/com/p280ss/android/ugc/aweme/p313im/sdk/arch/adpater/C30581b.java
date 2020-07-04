package com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater;

import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.b */
public interface C30581b<T> {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.b$a */
    public static final class C30582a {
        /* renamed from: a */
        public static <T> void m99892a(C30581b<T> bVar, List<? extends T> list) {
            bVar.mo80346f().mo80351a(list);
        }

        /* renamed from: a */
        public static <T> void m99893a(C30581b<T> bVar, List<? extends T> list, C7561a<C7581n> aVar) {
            bVar.mo80346f().mo80353a(list, aVar);
        }
    }

    /* renamed from: a */
    void mo80343a(List<? extends T> list, C7561a<C7581n> aVar);

    /* renamed from: f */
    C30577a<T> mo80346f();
}
