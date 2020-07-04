package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.j */
final class C6555j implements C6557l {

    /* renamed from: a */
    private final /* synthetic */ Set f18862a;

    /* renamed from: b */
    private final /* synthetic */ C6562q f18863b;

    /* renamed from: c */
    private final /* synthetic */ ZipFile f18864c;

    C6555j(Set set, C6562q qVar, ZipFile zipFile) {
        this.f18862a = set;
        this.f18863b = qVar;
        this.f18864c = zipFile;
    }

    /* renamed from: a */
    public final void mo15920a(C6556k kVar, File file, boolean z) throws IOException {
        this.f18862a.add(file);
        if (!z) {
            C6551f.m20376b(this.f18864c, kVar.f18866b, file);
        }
    }
}
