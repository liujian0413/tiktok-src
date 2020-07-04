package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.d */
final /* synthetic */ class C14976d implements Comparator {

    /* renamed from: a */
    static final Comparator f38814a = new C14976d();

    private C14976d() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).f38865a.compareTo(((Scope) obj2).f38865a);
    }
}
