package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p1842d.C46476c;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.toutiao.proxyserver.z */
final class C46571z {

    /* renamed from: a */
    public List<String> f120015a;

    /* renamed from: b */
    public final ArrayDeque<C46572a> f120016b;

    /* renamed from: c */
    private final ArrayDeque<C46572a> f120017c;

    /* renamed from: com.toutiao.proxyserver.z$a */
    class C46572a {

        /* renamed from: a */
        final String f120018a;

        /* renamed from: b */
        boolean f120019b = true;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo115754a() {
            if (this.f120019b) {
                C46571z.this.f120016b.addLast(this);
                this.f120019b = false;
            }
        }

        C46572a(String str) {
            this.f120018a = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo115752a() {
        if (!this.f120017c.isEmpty() || !this.f120016b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C46572a mo115753b() {
        if (!this.f120017c.isEmpty()) {
            return (C46572a) this.f120017c.removeFirst();
        }
        if (!this.f120016b.isEmpty()) {
            return (C46572a) this.f120016b.removeFirst();
        }
        throw new NoSuchElementException();
    }

    C46571z(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("urls is empty");
        }
        int size = list.size();
        this.f120015a = list;
        this.f120017c = new ArrayDeque<>(size);
        this.f120016b = new ArrayDeque<>(size);
        for (String str : list) {
            if (C46476c.m146127a(str)) {
                this.f120017c.add(new C46572a(str));
            }
        }
    }
}
