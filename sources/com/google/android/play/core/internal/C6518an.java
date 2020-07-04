package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.an */
final class C6518an extends C6513aj {

    /* renamed from: a */
    private final C6517am f18829a = new C6517am();

    C6518an() {
    }

    /* renamed from: a */
    public final void mo15881a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f18829a.mo15884a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
