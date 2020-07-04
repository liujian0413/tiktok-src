package com.google.firebase.iid;

import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.firebase.iid.aq */
final /* synthetic */ class C18319aq implements Runnable {

    /* renamed from: a */
    private final FirebaseInstanceId f49788a;

    /* renamed from: b */
    private final String f49789b;

    /* renamed from: c */
    private final String f49790c;

    /* renamed from: d */
    private final C17058g f49791d;

    /* renamed from: e */
    private final String f49792e;

    C18319aq(FirebaseInstanceId firebaseInstanceId, String str, String str2, C17058g gVar, String str3) {
        this.f49788a = firebaseInstanceId;
        this.f49789b = str;
        this.f49790c = str2;
        this.f49791d = gVar;
        this.f49792e = str3;
    }

    public final void run() {
        this.f49788a.mo47184a(this.f49789b, this.f49790c, this.f49791d, this.f49792e);
    }
}
