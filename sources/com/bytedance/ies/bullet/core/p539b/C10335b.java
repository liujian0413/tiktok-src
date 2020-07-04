package com.bytedance.ies.bullet.core.p539b;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.b.b */
public final class C10335b {
    /* renamed from: a */
    public static final Uri m30619a(String str) {
        C7573i.m23587b(str, "path");
        Uri build = new Builder().scheme("local_file").authority("relative").path(str).build();
        C7573i.m23582a((Object) build, "Uri.Builder()\n    .schem…ATIVE).path(path).build()");
        return build;
    }
}
