package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;
import com.google.android.gms.common.internal.C15250i.C15251a;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C15249h<T extends IInterface> extends C15231d<T> implements C15028f, C15251a {

    /* renamed from: a */
    private final Set<Scope> f39439a;

    /* renamed from: i */
    public final C15244e f39440i;

    /* renamed from: j */
    private final Account f39441j;

    /* renamed from: b */
    private static Set<Scope> m44349b(Set<Scope> set) {
        return set;
    }

    protected C15249h(Context context, Looper looper, int i, C15244e eVar, C15039b bVar, C15040c cVar) {
        this(context, looper, C15252j.m44362a(context), GoogleApiAvailability.getInstance(), i, eVar, (C15039b) C15267r.m44384a(bVar), (C15040c) C15267r.m44384a(cVar));
    }

    private C15249h(Context context, Looper looper, C15252j jVar, GoogleApiAvailability googleApiAvailability, int i, C15244e eVar, C15039b bVar, C15040c cVar) {
        C15244e eVar2 = eVar;
        super(context, looper, jVar, googleApiAvailability, i, m44346a(bVar), m44347a(cVar), eVar2.f39426h);
        this.f39440i = eVar2;
        this.f39441j = eVar2.f39419a;
        this.f39439a = m44348a(eVar2.f39421c);
    }

    /* renamed from: a */
    private final Set<Scope> m44348a(Set<Scope> set) {
        Set<Scope> b = m44349b(set);
        for (Scope contains : b) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return b;
    }

    /* renamed from: m */
    public final Account mo38566m() {
        return this.f39441j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Set<Scope> mo38569p() {
        return this.f39439a;
    }

    /* renamed from: a */
    private static C15232a m44346a(C15039b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C15276y(bVar);
    }

    /* renamed from: a */
    private static C15233b m44347a(C15040c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C15277z(cVar);
    }

    /* renamed from: e */
    public int mo38134e() {
        return super.mo38134e();
    }
}
