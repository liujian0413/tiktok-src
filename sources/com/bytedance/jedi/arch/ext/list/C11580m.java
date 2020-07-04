package com.bytedance.jedi.arch.ext.list;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.jedi.arch.ext.list.m */
public final class C11580m {

    /* renamed from: com.bytedance.jedi.arch.ext.list.m$a */
    static final class C11581a extends Lambda implements C7563m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a */
        public static final C11581a f31252a = new C11581a();

        C11581a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m34047a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<T> m34047a(List<? extends T> list, List<? extends T> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            return C7525m.m23506c((Collection<? extends T>) list, (Iterable<? extends T>) list2);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.m$b */
    static final class C11582b extends Lambda implements C7563m<List<? extends T>, List<? extends T>, List<? extends T>> {

        /* renamed from: a */
        public static final C11582b f31253a = new C11582b();

        C11582b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m34048a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<T> m34048a(List<? extends T> list, List<? extends T> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            if (!list2.isEmpty()) {
                return list2;
            }
            return list;
        }
    }

    /* renamed from: a */
    public static final <T> C7563m<List<? extends T>, List<? extends T>, List<T>> m34045a() {
        return C11582b.f31253a;
    }

    /* renamed from: b */
    public static final <T> C7563m<List<? extends T>, List<? extends T>, List<T>> m34046b() {
        return C11581a.f31252a;
    }
}
