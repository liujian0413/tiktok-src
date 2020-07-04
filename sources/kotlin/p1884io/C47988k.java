package kotlin.p1884io;

import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: kotlin.io.k */
public class C47988k extends C47987j {
    /* renamed from: d */
    public static final String m148945d(File file) {
        C7573i.m23587b(file, "$this$nameWithoutExtension");
        String name = file.getName();
        C7573i.m23582a((Object) name, "name");
        return C7634n.m23764b(name, ClassUtils.PACKAGE_SEPARATOR, name);
    }

    /* renamed from: e */
    public static final boolean m148946e(File file) {
        C7573i.m23587b(file, "$this$deleteRecursively");
        Iterator a = C47984g.m148938c(file).mo19416a();
        while (true) {
            boolean z = true;
            while (true) {
                if (!a.hasNext()) {
                    return z;
                }
                File file2 = (File) a.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: a */
    public static final boolean m148940a(File file, String str) {
        C7573i.m23587b(file, "$this$startsWith");
        C7573i.m23587b(str, "other");
        return C47984g.m148939a(file, new File(str));
    }

    /* renamed from: b */
    public static final boolean m148942b(File file, String str) {
        C7573i.m23587b(file, "$this$endsWith");
        C7573i.m23587b(str, "other");
        return C47984g.m148941b(file, new File(str));
    }

    /* renamed from: c */
    public static final File m148944c(File file, String str) {
        C7573i.m23587b(file, "$this$resolve");
        C7573i.m23587b(str, "relative");
        return C47984g.m148943c(file, new File(str));
    }

    /* renamed from: a */
    public static final boolean m148939a(File file, File file2) {
        C7573i.m23587b(file, "$this$startsWith");
        C7573i.m23587b(file2, "other");
        C47975d b = C47984g.m148931b(file);
        C47975d b2 = C47984g.m148931b(file2);
        if (!(!C7573i.m23585a((Object) b.f122807a, (Object) b2.f122807a)) && b.mo120171b() >= b2.mo120171b()) {
            return b.f122808b.subList(0, b2.mo120171b()).equals(b2.f122808b);
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m148941b(File file, File file2) {
        C7573i.m23587b(file, "$this$endsWith");
        C7573i.m23587b(file2, "other");
        C47975d b = C47984g.m148931b(file);
        C47975d b2 = C47984g.m148931b(file2);
        if (b2.mo120170a()) {
            return C7573i.m23585a((Object) file, (Object) file2);
        }
        int b3 = b.mo120171b() - b2.mo120171b();
        if (b3 < 0) {
            return false;
        }
        return b.f122808b.subList(b3, b.mo120171b()).equals(b2.f122808b);
    }

    /* renamed from: c */
    public static final File m148943c(File file, File file2) {
        boolean z;
        C7573i.m23587b(file, "$this$resolve");
        C7573i.m23587b(file2, "relative");
        if (C47984g.m148930a(file2)) {
            return file2;
        }
        String file3 = file.toString();
        C7573i.m23582a((Object) file3, "this.toString()");
        CharSequence charSequence = file3;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C7634n.m23752a(charSequence, File.separatorChar, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(file3);
            sb.append(file2);
            return new File(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file3);
        sb2.append(File.separatorChar);
        sb2.append(file2);
        return new File(sb2.toString());
    }
}
