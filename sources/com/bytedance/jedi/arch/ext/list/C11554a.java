package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.bytedance.jedi.arch.ext.list.a */
public interface C11554a<T> {

    /* renamed from: com.bytedance.jedi.arch.ext.list.a$a */
    public static final class C11555a {
        /* renamed from: b */
        public static <T> int m34010b(C11554a<T> aVar) {
            return aVar.aC_().mo29143a();
        }

        /* renamed from: a */
        public static <T> List<T> m34007a(C11554a<T> aVar) {
            return aVar.aC_().f31223c;
        }

        /* renamed from: a */
        public static <T> void m34008a(C11554a<T> aVar, List<? extends T> list) {
            C7573i.m23587b(list, "list");
            aVar.mo29136a(list, null);
        }

        /* renamed from: a */
        public static <T> T m34005a(C11554a<T> aVar, int i, boolean z) {
            return aVar.aC_().mo29144a(i, z);
        }

        /* renamed from: a */
        public static <T> void m34009a(C11554a<T> aVar, List<? extends T> list, C7561a<C7581n> aVar2) {
            C7573i.m23587b(list, "list");
            aVar.aC_().mo29146a(list, aVar2);
        }
    }

    /* renamed from: a */
    T mo29135a(int i, boolean z);

    /* renamed from: a */
    void mo29136a(List<? extends T> list, C7561a<C7581n> aVar);

    C11561b<T> aC_();
}
