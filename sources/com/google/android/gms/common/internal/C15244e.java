package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.support.p022v4.util.C0888a;
import android.view.View;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C16962a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C15244e {

    /* renamed from: a */
    public final Account f39419a;

    /* renamed from: b */
    public final Set<Scope> f39420b;

    /* renamed from: c */
    public final Set<Scope> f39421c;

    /* renamed from: d */
    public final Map<C15017a<?>, C15246b> f39422d;

    /* renamed from: e */
    public final int f39423e;

    /* renamed from: f */
    public final View f39424f;

    /* renamed from: g */
    public final String f39425g;

    /* renamed from: h */
    public final String f39426h;

    /* renamed from: i */
    public final C16962a f39427i;

    /* renamed from: j */
    public Integer f39428j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class C15245a {

        /* renamed from: a */
        private Account f39429a;

        /* renamed from: b */
        private C0888a<Scope> f39430b;

        /* renamed from: c */
        private Map<C15017a<?>, C15246b> f39431c;

        /* renamed from: d */
        private int f39432d;

        /* renamed from: e */
        private View f39433e;

        /* renamed from: f */
        private String f39434f;

        /* renamed from: g */
        private String f39435g;

        /* renamed from: h */
        private C16962a f39436h = C16962a.f47559a;

        /* renamed from: a */
        public final C15245a mo38585a(Account account) {
            this.f39429a = account;
            return this;
        }

        /* renamed from: a */
        public final C15245a mo38587a(Collection<Scope> collection) {
            if (this.f39430b == null) {
                this.f39430b = new C0888a<>();
            }
            this.f39430b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C15245a mo38586a(String str) {
            this.f39434f = str;
            return this;
        }

        /* renamed from: b */
        public final C15245a mo38589b(String str) {
            this.f39435g = str;
            return this;
        }

        /* renamed from: a */
        public final C15244e mo38588a() {
            C15244e eVar = new C15244e(this.f39429a, this.f39430b, this.f39431c, this.f39432d, this.f39433e, this.f39434f, this.f39435g, this.f39436h);
            return eVar;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$b */
    public static final class C15246b {

        /* renamed from: a */
        public final Set<Scope> f39437a;
    }

    public C15244e(Account account, Set<Scope> set, Map<C15017a<?>, C15246b> map, int i, View view, String str, String str2, C16962a aVar) {
        this.f39419a = account;
        this.f39420b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f39422d = map;
        this.f39424f = view;
        this.f39423e = i;
        this.f39425g = str;
        this.f39426h = str2;
        this.f39427i = aVar;
        HashSet hashSet = new HashSet(this.f39420b);
        for (C15246b bVar : this.f39422d.values()) {
            hashSet.addAll(bVar.f39437a);
        }
        this.f39421c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public final String mo38582a() {
        if (this.f39419a != null) {
            return this.f39419a.name;
        }
        return null;
    }

    /* renamed from: b */
    public final Account mo38584b() {
        if (this.f39419a != null) {
            return this.f39419a;
        }
        return new Account("<<default account>>", "com.google");
    }

    /* renamed from: a */
    public final Set<Scope> mo38583a(C15017a<?> aVar) {
        C15246b bVar = (C15246b) this.f39422d.get(aVar);
        if (bVar == null || bVar.f39437a.isEmpty()) {
            return this.f39420b;
        }
        HashSet hashSet = new HashSet(this.f39420b);
        hashSet.addAll(bVar.f39437a);
        return hashSet;
    }
}
