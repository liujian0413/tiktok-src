package com.p280ss.android.agilelogger.p840d;

import android.text.TextUtils;
import com.p280ss.android.agilelogger.C19178e;
import com.p280ss.android.agilelogger.p839c.C19172c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.agilelogger.d.a */
public final class C19174a {

    /* renamed from: a */
    public List<C19172c> f51837a = new ArrayList();

    /* renamed from: b */
    public volatile Set<String> f51838b = null;

    /* renamed from: com.ss.android.agilelogger.d.a$a */
    public static class C19175a {

        /* renamed from: a */
        public C19174a f51839a = new C19174a();

        /* renamed from: a */
        public final C19175a mo50908a(C19172c cVar) {
            this.f51839a.mo50904a(cVar);
            return this;
        }
    }

    /* renamed from: a */
    public final void mo50903a() {
        if (this.f51837a != null) {
            for (C19172c a : this.f51837a) {
                a.mo50882a();
            }
        }
    }

    /* renamed from: b */
    public final void mo50907b() {
        if (this.f51837a != null) {
            for (C19172c b : this.f51837a) {
                b.mo50885b();
            }
        }
    }

    /* renamed from: a */
    public final void mo50904a(C19172c cVar) {
        if (this.f51837a != null) {
            this.f51837a.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo50905a(C19178e eVar) {
        if (this.f51837a != null) {
            if (this.f51838b == null || TextUtils.isEmpty(eVar.f51848c) || !this.f51838b.contains(eVar.f51848c)) {
                for (C19172c b : this.f51837a) {
                    b.mo50901b(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50906a(Set<String> set) {
        if (set != null) {
            this.f51838b = Collections.unmodifiableSet(set);
        }
    }
}
