package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.C46869g;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ac */
public final class C46903ac implements Runnable {

    /* renamed from: a */
    private final Context f120271a;

    /* renamed from: b */
    private final C46921p f120272b;

    public final void run() {
        try {
            C46869g.m146602a(this.f120271a, "Performing time based file roll over.");
            if (!this.f120272b.mo118028c()) {
                this.f120272b.mo118027b();
            }
        } catch (Exception e) {
            C46869g.m146603a(this.f120271a, "Failed to roll over file", (Throwable) e);
        }
    }

    public C46903ac(Context context, C46921p pVar) {
        this.f120271a = context;
        this.f120272b = pVar;
    }
}
