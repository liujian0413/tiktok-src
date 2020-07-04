package kotlin.p1884io;

import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.io.c */
public final class C47974c {
    /* renamed from: a */
    public static final String m148918a(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            StringBuilder sb2 = new StringBuilder(" -> ");
            sb2.append(file2);
            sb.append(sb2.toString());
        }
        if (str != null) {
            StringBuilder sb3 = new StringBuilder(": ");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        String sb4 = sb.toString();
        C7573i.m23582a((Object) sb4, "sb.toString()");
        return sb4;
    }
}
