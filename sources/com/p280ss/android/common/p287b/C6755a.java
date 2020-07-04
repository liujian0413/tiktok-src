package com.p280ss.android.common.p287b;

import com.bytedance.common.utility.collection.C6308d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ss.android.common.b.a */
public final class C6755a {

    /* renamed from: a */
    private static Set<String> f19257a = new HashSet();

    /* renamed from: b */
    private static C6308d<C6756a> f19258b = new C6308d<>();

    /* renamed from: com.ss.android.common.b.a$a */
    public interface C6756a {
        /* renamed from: a */
        String mo16522a();

        /* renamed from: b */
        boolean mo16523b();
    }

    /* renamed from: a */
    public static String m20902a() {
        if (f19257a == null || f19257a.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : f19257a) {
                if (i < f19257a.size() - 1) {
                    sb.append(str);
                    sb.append("|");
                } else {
                    sb.append(str);
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m20903b() {
        if (f19258b == null || f19258b.mo15145b()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Iterator it = f19258b.iterator();
            while (it.hasNext()) {
                C6756a aVar = (C6756a) it.next();
                if (aVar != null && !f19257a.contains(aVar.mo16522a()) && aVar.mo16523b()) {
                    if (i < f19258b.mo15146c() - 1) {
                        sb.append(aVar.mo16522a());
                        sb.append("|");
                    } else {
                        sb.append(aVar.mo16522a());
                    }
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
