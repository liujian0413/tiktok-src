package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15034c;
import com.google.android.gms.common.api.internal.C15133d.C15134a;
import com.google.android.gms.common.internal.C15244e;
import com.google.android.gms.signin.C16962a;
import com.google.android.gms.signin.C16967e;

/* renamed from: com.google.android.gms.common.api.internal.cs */
public final class C15126cs<O extends C15021d> extends C15034c<O> {

    /* renamed from: i */
    public final C15028f f39109i;

    /* renamed from: j */
    private final C15120cm f39110j;

    /* renamed from: k */
    private final C15244e f39111k;

    /* renamed from: l */
    private final C15018a<? extends C16967e, C16962a> f39112l;

    public C15126cs(Context context, C15017a<O> aVar, Looper looper, C15028f fVar, C15120cm cmVar, C15244e eVar, C15018a<? extends C16967e, C16962a> aVar2) {
        super(context, aVar, looper);
        this.f39109i = fVar;
        this.f39110j = cmVar;
        this.f39111k = eVar;
        this.f39112l = aVar2;
        this.f38890h.mo38397a((C15034c<?>) this);
    }

    /* renamed from: a */
    public final C15028f mo38224a(Looper looper, C15134a<O> aVar) {
        this.f39110j.f39090b = aVar;
        return this.f39109i;
    }

    /* renamed from: a */
    public final C15093bp mo38225a(Context context, Handler handler) {
        return new C15093bp(context, handler, this.f39111k, this.f39112l);
    }
}
