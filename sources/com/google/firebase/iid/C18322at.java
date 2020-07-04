package com.google.firebase.iid;

import com.google.firebase.p785a.C18262a;
import com.google.firebase.p785a.C18263b;

/* renamed from: com.google.firebase.iid.at */
final /* synthetic */ class C18322at implements C18263b {

    /* renamed from: a */
    private final C18299a f49803a;

    C18322at(C18299a aVar) {
        this.f49803a = aVar;
    }

    /* renamed from: a */
    public final void mo47127a(C18262a aVar) {
        C18299a aVar2 = this.f49803a;
        synchronized (aVar2) {
            if (aVar2.mo47199a()) {
                FirebaseInstanceId.this.m60329m();
            }
        }
    }
}
