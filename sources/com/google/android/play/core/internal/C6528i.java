package com.google.android.play.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.i */
final class C6528i implements C6526g {
    C6528i() {
    }

    /* renamed from: a */
    static Object m20294a(ClassLoader classLoader) {
        return C6512ad.m20217a((Object) classLoader, "pathList", Object.class).mo15898a();
    }

    /* renamed from: a */
    static boolean m20295a(ClassLoader classLoader, File file, File file2, boolean z, C6532m mVar, String str, C6529j jVar) {
        ArrayList arrayList = new ArrayList();
        Object a = m20294a(classLoader);
        C6545z b = C6512ad.m20228b(a, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b.mo15898a());
        ArrayList arrayList2 = new ArrayList();
        for (Object a2 : asList) {
            arrayList2.add((File) C6512ad.m20217a(a2, str, File.class).mo15898a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        int i = 0;
        if (z || jVar.mo15878a(a, file2, file)) {
            b.mo15900a((T[]) mVar.mo15896a(a, new ArrayList(Collections.singleton(file2)), file, arrayList));
            if (arrayList.isEmpty()) {
                return true;
            }
            C6509aa aaVar = new C6509aa("DexPathList.makeDexElement failed");
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                C6514ak.m20231a(aaVar, (IOException) obj);
            }
            C6512ad.m20228b(a, "dexElementsSuppressedExceptions", IOException.class).mo15899a((Collection<T>) arrayList);
            throw aaVar;
        }
        String str2 = "Should be optimized ";
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return false;
    }

    /* renamed from: b */
    static void m20296b(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                String str = "Adding native library parent directory: ";
                String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                hashSet.add(file.getParentFile());
            }
            C6545z b = C6512ad.m20228b(m20294a(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) b.mo15898a()));
            b.mo15899a((Collection<T>) hashSet);
        }
    }

    /* renamed from: a */
    public final void mo15894a(ClassLoader classLoader, Set<File> set) {
        m20296b(classLoader, set);
    }

    /* renamed from: a */
    public final boolean mo15895a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m20295a(classLoader, file, file2, z, new C6527h(), "zip", new C6530k());
    }
}
