package com.facebook.internal.p729a.p730a;

import android.os.Process;
import com.facebook.C13499h;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.internal.p729a.C13869b;
import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.internal.a.a.a */
public class C13865a implements UncaughtExceptionHandler {

    /* renamed from: a */
    private static final String f36734a = C13865a.class.getCanonicalName();

    /* renamed from: b */
    private static C13865a f36735b;

    /* renamed from: c */
    private final UncaughtExceptionHandler f36736c;

    /* renamed from: d */
    private boolean f36737d;

    /* renamed from: b */
    private static void m40946b() {
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static synchronized void m40945a() {
        synchronized (C13865a.class) {
            if (C13499h.m39728n()) {
                m40947c();
            }
            if (f36735b == null) {
                C13865a aVar = new C13865a(Thread.getDefaultUncaughtExceptionHandler());
                f36735b = aVar;
                Thread.setDefaultUncaughtExceptionHandler(aVar);
            }
        }
    }

    /* renamed from: c */
    private static void m40947c() {
        File[] a = C13869b.m40960a();
        final ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File bVar : a) {
            C13868b bVar2 = new C13868b(bVar);
            if (bVar2.mo33502a()) {
                arrayList.add(bVar2);
            }
        }
        Collections.sort(arrayList, new Comparator<C13868b>() {
            /* renamed from: a */
            private static int m40948a(C13868b bVar, C13868b bVar2) {
                return bVar.mo33501a(bVar2);
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m40948a((C13868b) obj, (C13868b) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        while (i < arrayList.size() && i < 5) {
            jSONArray.put(arrayList.get(i));
            i++;
        }
        C13869b.m40958a("crash_reports", jSONArray, new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                try {
                    if (graphResponse.f34704d == null && graphResponse.f34702b.getBoolean("success")) {
                        for (int i = 0; arrayList.size() > i; i++) {
                            ((C13868b) arrayList.get(i)).mo33504c();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }

    private C13865a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f36736c = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (C13869b.m40963c(th)) {
            new C13868b(th).mo33503b();
        }
        if (this.f36736c != null) {
            this.f36736c.uncaughtException(thread, th);
        }
        if (this.f36737d) {
            m40946b();
        }
    }
}
