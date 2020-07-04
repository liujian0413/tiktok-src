package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.C6568q;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.e */
final class C6524e implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ List f18839a;

    /* renamed from: b */
    private final /* synthetic */ C6568q f18840b;

    /* renamed from: c */
    private final /* synthetic */ C6521b f18841c;

    C6524e(C6521b bVar, List list, C6568q qVar) {
        this.f18841c = bVar;
        this.f18839a = list;
        this.f18840b = qVar;
    }

    public final void run() {
        try {
            if (this.f18841c.f18833c.mo15887a(this.f18839a)) {
                this.f18841c.m20271a(this.f18840b);
            } else {
                this.f18841c.m20276b(this.f18839a, this.f18840b);
            }
        } catch (Exception unused) {
            this.f18840b.mo15932a(-11);
        }
    }
}
