package com.facebook.internal.p729a.p731b;

import com.C1642a;
import com.facebook.C13499h;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.internal.p729a.C13869b;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.internal.a.b.b */
public final class C13872b {
    /* renamed from: a */
    public static void m40969a() {
        if (C13499h.m39728n()) {
            m40971b();
        }
    }

    /* renamed from: c */
    private static File[] m40972c() {
        File b = C13869b.m40961b();
        if (b == null) {
            return new File[0];
        }
        return b.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.matches(C1642a.m8034a("^%s[0-9]+.json$", new Object[]{"error_log_"}));
            }
        });
    }

    /* renamed from: b */
    private static void m40971b() {
        File[] c = m40972c();
        final ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File aVar : c) {
            C13871a aVar2 = new C13871a(aVar);
            if (aVar2.mo33508a()) {
                arrayList.add(aVar2);
            }
        }
        Collections.sort(arrayList, new Comparator<C13871a>() {
            /* renamed from: a */
            private static int m40973a(C13871a aVar, C13871a aVar2) {
                return aVar.mo33507a(aVar2);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m40973a((C13871a) obj, (C13871a) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        while (i < arrayList.size() && i < 1000) {
            jSONArray.put(arrayList.get(i));
            i++;
        }
        C13869b.m40958a("error_reports", jSONArray, new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                try {
                    if (graphResponse.f34704d == null && graphResponse.f34702b.getBoolean("success")) {
                        for (int i = 0; arrayList.size() > i; i++) {
                            ((C13871a) arrayList.get(i)).mo33510c();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public static void m40970a(String str) {
        try {
            new C13871a(str).mo33509b();
        } catch (Exception unused) {
        }
    }
}
