package com.bytedance.android.live.broadcast.api.p126b;

import com.bytedance.android.live.broadcast.api.C2418b;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.api.b.e */
public final class C2427e {

    /* renamed from: e */
    private static final List<C2419a> f7956e;

    /* renamed from: a */
    public final List<C2419a> f7957a;

    /* renamed from: b */
    public final List<String> f7958b;

    /* renamed from: c */
    public final C2420b f7959c;

    /* renamed from: d */
    public final List<String> f7960d;

    /* renamed from: com.bytedance.android.live.broadcast.api.b.e$a */
    public static class C2428a {

        /* renamed from: a */
        List<C2419a> f7961a;

        /* renamed from: b */
        List<String> f7962b;

        /* renamed from: c */
        List<String> f7963c;

        /* renamed from: d */
        C2420b f7964d;

        /* renamed from: a */
        public final C2427e mo8914a() {
            return new C2427e(this);
        }

        /* renamed from: a */
        public final C2428a mo8912a(C2420b bVar) {
            this.f7964d = bVar;
            return this;
        }

        /* renamed from: b */
        public final C2428a mo8915b(List<String> list) {
            this.f7963c = list;
            return this;
        }

        /* renamed from: a */
        public final C2428a mo8913a(List<String> list) {
            this.f7962b = list;
            return this;
        }
    }

    static {
        LinkedList linkedList = new LinkedList();
        f7956e = linkedList;
        linkedList.add(new C2419a("beauty", Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)})));
        f7956e.add(new C2419a(C2418b.f7953d, Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)})));
        f7956e.add(new C2419a("effect_gift", Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(3)})));
        f7956e.add(new C2419a("livegame", Collections.singletonList(Integer.valueOf(3))));
        f7956e.add(new C2419a("livemoneygame", Collections.singletonList(Integer.valueOf(3))));
        f7956e.add(new C2419a(C2418b.f7950a, Collections.singletonList(Integer.valueOf(2))));
        f7956e.add(new C2419a(C2418b.f7951b, Collections.singletonList(Integer.valueOf(2))));
        f7956e.add(new C2419a(C2418b.f7952c, Collections.singletonList(Integer.valueOf(2))));
    }

    public C2427e(C2428a aVar) {
        List<String> list;
        List<String> list2;
        List<C2419a> list3;
        this.f7959c = aVar.f7964d;
        if (aVar.f7962b == null) {
            list = Collections.emptyList();
        } else {
            list = aVar.f7962b;
        }
        this.f7958b = list;
        if (aVar.f7963c == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = aVar.f7963c;
        }
        this.f7960d = list2;
        if (aVar.f7961a == null || aVar.f7961a.isEmpty()) {
            list3 = f7956e;
        } else {
            list3 = aVar.f7961a;
        }
        this.f7957a = list3;
    }
}
