package com.bytedance.p509f.p510a;

import android.os.Build.VERSION;
import android.system.Os;
import com.bytedance.p509f.C10056b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.f.a.a */
public final class C10054a {

    /* renamed from: a */
    public static final C10054a f27359a = new C10054a();

    private C10054a() {
    }

    /* renamed from: a */
    public static List<String> m29863a(File file) {
        C7573i.m23587b(file, "fdDir");
        if (!file.exists() || !file.isDirectory()) {
            return C7525m.m23461a();
        }
        Set linkedHashSet = new LinkedHashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            Collection arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    arrayList.add(file2);
                }
            }
            for (File file3 : (List) arrayList) {
                if (file3.exists()) {
                    if (VERSION.SDK_INT >= 21) {
                        try {
                            C7573i.m23582a((Object) file3, "fdFile");
                            String readlink = Os.readlink(file3.getPath());
                            C7573i.m23582a((Object) readlink, "link");
                            linkedHashSet.add(readlink);
                        } catch (Throwable unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("readlink ");
                        C7573i.m23582a((Object) file3, "fdFile");
                        sb.append(file3.getPath());
                        linkedHashSet.add((String) C10056b.m29865a(sb.toString()).get(0));
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return C7525m.m23461a();
        }
        return C7525m.m23516h((Iterable<? extends T>) linkedHashSet);
    }
}
