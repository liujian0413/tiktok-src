package kotlin.p1884io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: kotlin.io.h */
class C47985h {
    /* renamed from: a */
    public static final boolean m148930a(File file) {
        C7573i.m23587b(file, "$this$isRooted");
        String path = file.getPath();
        C7573i.m23582a((Object) path, "path");
        if (m148929a(path) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static final int m148929a(String str) {
        CharSequence charSequence = str;
        int a = C7634n.m23726a(charSequence, File.separatorChar, 0, false, 4, (Object) null);
        if (a == 0) {
            if (str.length() > 1 && str.charAt(1) == File.separatorChar) {
                int a2 = C7634n.m23726a(charSequence, File.separatorChar, 2, false, 4, (Object) null);
                if (a2 >= 0) {
                    int i = a2 + 1;
                    int a3 = C7634n.m23726a(charSequence, File.separatorChar, i, false, 4, (Object) null);
                    if (a3 >= 0) {
                        return a3 + 1;
                    }
                    return str.length();
                }
            }
            return 1;
        } else if (a > 0 && str.charAt(a - 1) == ':') {
            return a + 1;
        } else {
            if (a != -1 || !C7634n.m23752a(charSequence, ':', false)) {
                return 0;
            }
            return str.length();
        }
    }

    /* renamed from: b */
    public static final C47975d m148931b(File file) {
        boolean z;
        List list;
        C7573i.m23587b(file, "$this$toComponents");
        String path = file.getPath();
        C7573i.m23582a((Object) path, "path");
        int a = m148929a(path);
        String substring = path.substring(0, a);
        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = path.substring(a);
        C7573i.m23582a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
        CharSequence charSequence = substring2;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = C7525m.m23461a();
        } else {
            Iterable<String> b = C7634n.m23766b(charSequence, new char[]{File.separatorChar}, false, 0);
            Collection arrayList = new ArrayList(C7525m.m23469a(b, 10));
            for (String file2 : b) {
                arrayList.add(new File(file2));
            }
            list = (List) arrayList;
        }
        return new C47975d(new File(substring), list);
    }
}
