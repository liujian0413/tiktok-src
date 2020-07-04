package com.google.android.play.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.o */
final class C6534o implements C6526g {
    C6534o() {
    }

    /* renamed from: a */
    public static void m20305a(ClassLoader classLoader, Set<File> set, C6535p pVar) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object a = C6528i.m20294a(classLoader);
            List list = (List) C6512ad.m20217a(a, "nativeLibraryDirectories", List.class).mo15898a();
            hashSet.removeAll(list);
            list.addAll(hashSet);
            ArrayList arrayList = new ArrayList();
            Object[] a2 = pVar.mo15897a(a, new ArrayList(hashSet), null, arrayList);
            if (!arrayList.isEmpty()) {
                C6509aa aaVar = new C6509aa("Error in makePathElements");
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C6514ak.m20231a(aaVar, (IOException) obj);
                }
                throw aaVar;
            }
            C6512ad.m20228b(a, "nativeLibraryPathElements", Object.class).mo15900a((T[]) a2);
        }
    }

    /* renamed from: a */
    public static boolean m20306a(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return C6528i.m20295a(classLoader, file, file2, z, new C6533n(), str, new C6530k());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Object[] m20308b(Object obj, List<File> list, File file, List<IOException> list2) {
        return (Object[]) C6512ad.m20222a(obj, "makePathElements", Object[].class, List.class, list, File.class, file, List.class, list2);
    }

    /* renamed from: a */
    public final void mo15894a(ClassLoader classLoader, Set<File> set) {
        m20305a(classLoader, set, new C6536q());
    }

    /* renamed from: a */
    public final boolean mo15895a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m20306a(classLoader, file, file2, z, "zip");
    }
}
