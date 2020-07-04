package com.google.android.play.core.splitcompat;

import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.p */
final class C6561p implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Set f18870a;

    /* renamed from: b */
    private final /* synthetic */ C6546a f18871b;

    C6561p(C6546a aVar, Set set) {
        this.f18871b = aVar;
        this.f18870a = set;
    }

    public final void run() {
        try {
            for (String f : this.f18870a) {
                this.f18871b.f18847b.mo15915f(f);
            }
        } catch (Exception unused) {
        }
    }
}
