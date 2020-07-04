package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.splitcompat.h */
final class C6553h implements C6557l {

    /* renamed from: a */
    private final /* synthetic */ C6550e f18861a;

    C6553h(C6550e eVar) {
        this.f18861a = eVar;
    }

    /* renamed from: a */
    public final void mo15920a(C6556k kVar, File file, boolean z) throws IOException {
        this.f18861a.f18852a.add(file);
        if (!z) {
            this.f18861a.f18853b.set(false);
        }
    }
}
