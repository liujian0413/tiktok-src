package com.bytedance.p509f.p510a;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47991m;

/* renamed from: com.bytedance.f.a.b */
public final class C10055b {

    /* renamed from: a */
    public static final C10055b f27360a = new C10055b();

    private C10055b() {
    }

    /* renamed from: a */
    public static String m29864a(File file) {
        C7573i.m23587b(file, "statFile");
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            sb.append(" does not exist");
            return sb.toString();
        }
        String str = (String) C7525m.m23504c(C47991m.m148951a((Reader) new FileReader(file)), 0);
        if (str == null) {
            str = "";
        }
        return str;
    }
}
