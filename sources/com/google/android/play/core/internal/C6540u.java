package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.u */
final class C6540u implements C6526g {
    C6540u() {
    }

    /* renamed from: b */
    static void m20318b(ClassLoader classLoader, Set<File> set) {
        C6534o.m20305a(classLoader, set, new C6539t());
    }

    /* renamed from: b */
    static boolean m20319b(ClassLoader classLoader, File file, File file2, boolean z) {
        return C6528i.m20295a(classLoader, file, file2, z, new C6533n(), "path", new C6542w());
    }

    /* renamed from: a */
    public final void mo15894a(ClassLoader classLoader, Set<File> set) {
        m20318b(classLoader, set);
    }

    /* renamed from: a */
    public final boolean mo15895a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m20319b(classLoader, file, file2, z);
    }
}
