package com.facebook.keyframes.model;

import com.facebook.keyframes.C13981a;
import com.facebook.keyframes.p733b.C14013e;
import com.facebook.keyframes.p733b.C14014f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.g */
public final class C14045g implements C14031a {

    /* renamed from: a */
    public final C14047b f37103a;

    /* renamed from: b */
    private final int f37104b;

    /* renamed from: com.facebook.keyframes.model.g$a */
    public static class C14046a {

        /* renamed from: a */
        public int f37105a;

        /* renamed from: b */
        public List<String> f37106b;

        /* renamed from: a */
        public final C14045g mo33698a() {
            return new C14045g(this.f37105a, this.f37106b);
        }
    }

    /* renamed from: com.facebook.keyframes.model.g$b */
    public static class C14047b {

        /* renamed from: a */
        public final List<C14014f> f37107a;

        /* renamed from: a */
        public final void mo33699a(C13981a aVar) {
            int size = this.f37107a.size();
            for (int i = 0; i < size; i++) {
                ((C14014f) this.f37107a.get(i)).mo33670a(aVar);
            }
        }

        public C14047b(List<String> list) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(C14014f.m41375a((String) list.get(i)));
            }
            this.f37107a = C14013e.m41371a(arrayList);
        }
    }

    /* renamed from: a */
    public final int mo33689a() {
        return this.f37104b;
    }

    public C14045g(int i, List<String> list) {
        this.f37104b = i;
        this.f37103a = new C14047b(list);
    }
}
