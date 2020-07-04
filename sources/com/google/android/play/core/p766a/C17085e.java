package com.google.android.play.core.p766a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import com.google.android.play.core.install.C17094b;
import com.google.android.play.core.p275b.C6506a;
import com.google.android.play.core.tasks.C17147c;

/* renamed from: com.google.android.play.core.a.e */
final class C17085e implements C17082b {

    /* renamed from: a */
    private final C17087g f47779a;

    /* renamed from: b */
    private final C17084d f47780b;

    /* renamed from: c */
    private final Context f47781c;

    C17085e(C17087g gVar, Context context) {
        this.f47779a = gVar;
        this.f47780b = new C17084d(context);
        this.f47781c = context;
    }

    /* renamed from: a */
    public final C17147c<C17081a> mo44323a() {
        return this.f47779a.mo44329a(this.f47781c.getPackageName());
    }

    /* renamed from: a */
    public final synchronized void mo44324a(C17094b bVar) {
        this.f47780b.mo15873a((C6506a<StateT>) bVar);
    }

    /* renamed from: a */
    public final boolean mo44325a(C17081a aVar, int i, Activity activity, int i2) throws SendIntentException {
        if (!aVar.mo44322b(0)) {
            return false;
        }
        activity.startIntentSenderForResult(aVar.mo44321a(0).getIntentSender(), 19, null, 0, 0, 0);
        return true;
    }

    /* renamed from: b */
    public final C17147c<Void> mo44326b() {
        return this.f47779a.mo44330b(this.f47781c.getPackageName());
    }

    /* renamed from: b */
    public final synchronized void mo44327b(C17094b bVar) {
        this.f47780b.mo15876b(bVar);
    }
}
