package com.aweme.storage;

import android.content.Context;
import android.os.FileObserver;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.aweme.storage.b */
final class C1909b {

    /* renamed from: a */
    static int f6907a;

    /* renamed from: b */
    static long f6908b;

    /* renamed from: c */
    static int f6909c;

    /* renamed from: d */
    static List<String> f6910d;

    /* renamed from: e */
    static C1925h f6911e;

    /* renamed from: f */
    static C1924g f6912f;

    /* renamed from: g */
    private static List<FileObserver> f6913g;

    /* renamed from: h */
    private static volatile boolean f6914h;

    /* renamed from: com.aweme.storage.b$a */
    static class C1911a extends FileObserver {

        /* renamed from: a */
        public C1934m f6915a;

        /* renamed from: b */
        public Context f6916b;

        public final void onEvent(int i, String str) {
            new StringBuilder("event path ").append(this.f6915a.f6959b);
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    if (C1911a.this.f6916b != null) {
                        C1927j a = C1932l.m8920a(C1911a.this.f6916b);
                        if (a != null) {
                            a.mo7550b(C1911a.this.f6915a);
                        }
                    }
                    return null;
                }
            }, (Executor) C7258h.m22730c());
        }

        C1911a(Context context, C1934m mVar, int i) {
            super(mVar.f6959b, 547);
            this.f6915a = mVar;
            this.f6916b = context;
        }
    }

    /* renamed from: a */
    static void m8848a(Context context) {
        if (!f6914h) {
            f6914h = true;
            if (context != null) {
                List<C1934m> b = m8850b(context);
                if (b != null && b.size() > 0) {
                    f6913g = new ArrayList(b.size());
                    for (C1934m mVar : b) {
                        if (!(mVar == null || mVar.f6959b == null)) {
                            new StringBuilder("new observer ").append(mVar.f6959b);
                            if (new File(mVar.f6959b).exists()) {
                                C1911a aVar = new C1911a(context, mVar, 547);
                                f6913g.add(aVar);
                                aVar.startWatching();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static List<C1934m> m8850b(Context context) {
        if (f6907a <= 0 || context == null) {
            return null;
        }
        C1927j a = C1932l.m8920a(context);
        if (a == null) {
            return null;
        }
        List<C1934m> a2 = a.mo7548a();
        if (a2.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1934m mVar : a2) {
            if (!(mVar == null || mVar.f6959b == null)) {
                StringBuilder sb = new StringBuilder("black path ");
                sb.append(mVar.f6959b);
                sb.append("  ");
                sb.append(new Date(mVar.f6961d));
                sb.append(" ");
                sb.append(mVar.f6962e);
            }
            if (mVar == null || mVar.f6962e < f6909c || mVar.f6961d + f6908b >= System.currentTimeMillis()) {
                arrayList2.add(mVar);
            } else {
                new StringBuilder("expired files ").append(mVar.f6959b);
                arrayList.add(mVar);
            }
        }
        if (arrayList.size() > 0) {
            C1934m[] mVarArr = new C1934m[arrayList.size()];
            arrayList.toArray(mVarArr);
            a.mo7550b(mVarArr);
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder();
            for (C1934m mVar2 : mVarArr) {
                if (!(mVar2 == null || mVar2.f6959b == null)) {
                    sb2.append(mVar2.f6959b);
                    sb2.append(";");
                }
            }
            try {
                jSONObject.put("files", sb2.toString());
            } catch (JSONException unused) {
            }
            new StringBuilder("delete files ").append(jSONObject.toString());
            if (f6912f != null) {
                f6912f.mo7543a("delete_files", jSONObject);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    static void m8849a(Context context, List<C1919a> list) {
        if (f6907a > 0 && context != null && list.size() > 0) {
            ArrayList<File> arrayList = new ArrayList<>();
            for (C1919a aVar : list) {
                if (!(aVar == null || aVar.mo7538b() == null)) {
                    new StringBuilder("get node path: ").append(aVar.mo7538b());
                    String b = aVar.mo7538b();
                    if (b.startsWith(C1920b.e.name()) && context.getExternalCacheDir() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getExternalCacheDir().getParent());
                        sb.append(b.substring(1));
                        b = sb.toString();
                    } else if (b.startsWith(C1920b.p.name()) && context.getCacheDir() != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(context.getCacheDir().getParent());
                        sb2.append(b.substring(1));
                        b = sb2.toString();
                    }
                    new StringBuilder("get node file path ").append(b);
                    File file = new File(b);
                    if (file.exists()) {
                        C1918d.m8877a(file, (List<File>) arrayList);
                    }
                }
            }
            Collections.sort(arrayList, new Comparator<File>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m8851a((File) obj, (File) obj2);
                }

                /* renamed from: a */
                private static int m8851a(File file, File file2) {
                    long j;
                    long j2 = 0;
                    if (file == null) {
                        j = 0;
                    } else {
                        j = file.length();
                    }
                    if (file2 != null) {
                        j2 = file2.length();
                    }
                    if (j < j2) {
                        return 1;
                    }
                    if (j == j2) {
                        return 0;
                    }
                    return -1;
                }
            });
            ArrayList<C1934m> arrayList2 = new ArrayList<>();
            for (File file2 : arrayList) {
                if (file2 != null && arrayList2.size() < f6907a) {
                    if (f6910d != null) {
                        int i = 0;
                        while (i < f6910d.size() && !file2.getAbsolutePath().contains((CharSequence) f6910d.get(i))) {
                            i++;
                        }
                        if (i >= f6910d.size() && (f6911e == null || f6911e.mo7545a() == null || !f6911e.mo7545a().contains(file2.getAbsolutePath()))) {
                            arrayList2.add(new C1934m(file2.getAbsolutePath(), System.currentTimeMillis(), 1));
                        }
                    } else if (f6911e == null || f6911e.mo7545a() == null || !f6911e.mo7545a().contains(file2.getAbsolutePath())) {
                        arrayList2.add(new C1934m(file2.getAbsolutePath(), System.currentTimeMillis(), 1));
                    }
                }
            }
            for (C1934m mVar : arrayList2) {
                new StringBuilder("black list: ").append(mVar.f6959b);
            }
            C1932l.m8921a(context, arrayList2, f6907a);
        }
    }
}
