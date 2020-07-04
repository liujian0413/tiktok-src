package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.g */
final class C6552g implements C6554i {

    /* renamed from: a */
    private final /* synthetic */ Set f18858a;

    /* renamed from: b */
    private final /* synthetic */ C6562q f18859b;

    /* renamed from: c */
    private final /* synthetic */ C6551f f18860c;

    C6552g(C6551f fVar, Set set, C6562q qVar) {
        this.f18860c = fVar;
        this.f18858a = set;
        this.f18859b = qVar;
    }

    /* renamed from: a */
    public final void mo15917a(ZipFile zipFile, Set<C6556k> set) throws IOException {
        this.f18858a.addAll(this.f18860c.m20369a(set, this.f18859b, zipFile));
    }
}
