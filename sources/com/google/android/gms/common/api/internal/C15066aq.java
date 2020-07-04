package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.C14984b;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.C15045h;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.aq */
final class C15066aq implements C15045h<Status> {

    /* renamed from: a */
    private final /* synthetic */ C15146m f38983a;

    /* renamed from: b */
    private final /* synthetic */ boolean f38984b;

    /* renamed from: c */
    private final /* synthetic */ C15037d f38985c;

    /* renamed from: d */
    private final /* synthetic */ C15061al f38986d;

    C15066aq(C15061al alVar, C15146m mVar, boolean z, C15037d dVar) {
        this.f38986d = alVar;
        this.f38983a = mVar;
        this.f38984b = z;
        this.f38985c = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo29952a(C15044g gVar) {
        Status status = (Status) gVar;
        C14984b.m43475a(this.f38986d.f38962k).mo38122d();
        if (status.mo38201c() && this.f38986d.mo38249j()) {
            this.f38986d.mo38247h();
        }
        this.f38983a.mo38267a(status);
        if (this.f38984b) {
            this.f38985c.mo38246g();
        }
    }
}
