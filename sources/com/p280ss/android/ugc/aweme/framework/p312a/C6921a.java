package com.p280ss.android.ugc.aweme.framework.p312a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.framework.a.a */
public class C6921a {

    /* renamed from: a */
    public static volatile boolean f19610a;

    /* renamed from: b */
    private static CopyOnWriteArrayList<C6923c> f19611b;

    /* renamed from: c */
    private static Context f19612c;

    /* renamed from: d */
    private static boolean f19613d;

    /* renamed from: a */
    public static void m21552a(int i, String str, String str2) {
        C6922b.m21565a(i, str, str2);
    }

    /* renamed from: a */
    public static void m21554a(Exception exc) {
        m21556a("", exc);
    }

    /* renamed from: b */
    public static void m21561b(String str) {
        m21563c(3, null, str);
    }

    /* renamed from: a */
    public static void m21555a(String str) {
        m21552a(3, null, str);
    }

    /* renamed from: a */
    public static void m21559a(Throwable th) {
        if (f19610a && f19611b != null) {
            Iterator it = f19611b.iterator();
            while (it.hasNext()) {
                C6923c cVar = (C6923c) it.next();
                if (cVar != null && cVar.mo17353a()) {
                    cVar.mo17352a(cVar.mo17354b(), th);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m21562b(String str, String str2) {
        m21552a(2, str, str2);
    }

    /* renamed from: a */
    public static void m21557a(String str, String str2) {
        m21563c(2, str, str2);
    }

    /* renamed from: c */
    public static void m21564c(String str, String str2) {
        if (f19610a && f19611b != null) {
            Iterator it = f19611b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public static void m21556a(String str, Exception exc) {
        if (C7163a.m22363a()) {
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            throw new RuntimeException(str, exc);
        } else if (f19610a && f19611b != null) {
            Iterator it = f19611b.iterator();
            while (it.hasNext()) {
                C6923c cVar = (C6923c) it.next();
                if (cVar != null && cVar.mo17353a()) {
                    cVar.mo17351a(cVar.mo17354b(), str, exc);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m21553a(Context context, List<C6923c> list) {
        synchronized (C6921a.class) {
            if (f19610a) {
                throw new IllegalStateException("CrashlyticsWrapper already inited!");
            } else if (context != null) {
                f19613d = true;
                f19612c = context.getApplicationContext();
                if (!list.isEmpty()) {
                    f19611b = new CopyOnWriteArrayList<>(list);
                }
                if (f19611b != null) {
                    Iterator it = f19611b.iterator();
                    while (it.hasNext()) {
                        C6923c cVar = (C6923c) it.next();
                        if (cVar != null && cVar.mo17353a()) {
                            cVar.mo17350a(f19612c);
                        }
                    }
                }
                f19610a = true;
            } else {
                throw new IllegalArgumentException("Context can't be null!");
            }
        }
    }

    /* renamed from: a */
    public static void m21558a(String str, Map<String, String> map) {
        if (f19610a && f19611b != null) {
            Iterator it = f19611b.iterator();
            while (it.hasNext()) {
                C6923c cVar = (C6923c) it.next();
                if (cVar != null && cVar.mo17353a()) {
                    cVar.mo17354b();
                }
            }
        }
    }

    /* renamed from: c */
    public static void m21563c(int i, String str, String str2) {
        if (!C7188c.m22428a()) {
            m21552a(i, str, str2);
        }
    }

    /* renamed from: b */
    public static void m21560b(int i, String str, String str2) {
        String str3;
        if (f19610a && f19611b != null) {
            Iterator it = f19611b.iterator();
            while (it.hasNext()) {
                C6923c cVar = (C6923c) it.next();
                if (cVar != null && cVar.mo17353a()) {
                    if (str == null) {
                        str3 = cVar.mo17354b();
                    } else {
                        str3 = str;
                    }
                    cVar.mo17349a(i, str3, str2);
                }
            }
        }
    }
}
