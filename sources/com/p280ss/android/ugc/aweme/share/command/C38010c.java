package com.p280ss.android.ugc.aweme.share.command;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.share.command.c */
final /* synthetic */ class C38010c implements Runnable {

    /* renamed from: a */
    private final CommandObserver f98941a;

    /* renamed from: b */
    private final Context f98942b;

    C38010c(CommandObserver commandObserver, Context context) {
        this.f98941a = commandObserver;
        this.f98942b = context;
    }

    public final void run() {
        this.f98941a.mo95582a(this.f98942b);
    }
}
