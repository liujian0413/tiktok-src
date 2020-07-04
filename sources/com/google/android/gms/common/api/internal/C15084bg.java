package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.api.C15034c;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.internal.C15104c.C15105a;

/* renamed from: com.google.android.gms.common.api.internal.bg */
public final class C15084bg<O extends C15021d> extends C15155v {

    /* renamed from: a */
    private final C15034c<O> f39021a;

    public C15084bg(C15034c<O> cVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f39021a = cVar;
    }

    /* renamed from: a */
    public final void mo38236a(C15097bt btVar) {
    }

    /* renamed from: b */
    public final void mo38241b(C15097bt btVar) {
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38232a(T t) {
        return this.f39021a.mo38226a(t);
    }

    /* renamed from: c */
    public final Looper mo38242c() {
        return this.f39021a.f38887e;
    }

    /* renamed from: b */
    public final Context mo38239b() {
        return this.f39021a.f38883a;
    }
}
