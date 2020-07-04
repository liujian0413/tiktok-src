package com.p280ss.android.p298ml;

import com.google.gson.C6600e;
import com.google.gson.stream.C6718a;
import com.p280ss.android.p298ml.process.C6831a;
import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.p299bl.MLConfigModel;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ml.e */
public class C6824e {

    /* renamed from: d */
    private static C6820a f19439d;

    /* renamed from: i */
    private static final ExecutorService f19440i;

    /* renamed from: a */
    public volatile boolean f19441a;

    /* renamed from: b */
    public C6823d f19442b;

    /* renamed from: c */
    protected final C6827f f19443c;

    /* renamed from: e */
    private int f19444e;

    /* renamed from: f */
    private int f19445f;

    /* renamed from: g */
    private MLConfigModel f19446g;

    /* renamed from: h */
    private C6821b f19447h;

    /* renamed from: a */
    public static C6820a m21222a() {
        return f19439d;
    }

    /* renamed from: b */
    public final boolean mo16672b() {
        return this.f19443c.mo16681a();
    }

    /* renamed from: c */
    public final List<? extends C6833c> mo16674c() {
        return this.f19446g.preOPModelList;
    }

    /* renamed from: d */
    public final C6831a mo16675d() {
        return this.f19446g.afOPModel;
    }

    /* renamed from: e */
    public final List<String> mo16676e() {
        return this.f19446g.inputFeatureList;
    }

    /* renamed from: g */
    public final void mo16678g() {
        if (this.f19442b != null) {
            this.f19442b.mo16668c();
        }
        this.f19444e = 0;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 5, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("ml-evaluator");
                sb.append(thread.getId());
                thread.setName(sb.toString());
                return thread;
            }
        });
        f19440i = threadPoolExecutor;
    }

    /* renamed from: f */
    public final boolean mo16677f() {
        if (this.f19443c.mo16681a() && !this.f19442b.mo16667b() && !this.f19441a && this.f19444e <= 15) {
            this.f19441a = true;
            this.f19444e++;
            f19440i.submit(new Runnable() {
                public final void run() {
                    File file;
                    String str;
                    String b = C6824e.this.f19443c.mo16682b();
                    String a = C6830h.m21256a(b);
                    StringBuilder sb = new StringBuilder();
                    sb.append(C6824e.this.f19443c.mo16683c());
                    sb.append(File.separator);
                    sb.append(C6824e.this.f19443c.mo16684d());
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append(File.separator);
                    sb3.append(a);
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(File.separator);
                    sb5.append(a);
                    String sb6 = sb5.toString();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(sb2);
                    sb7.append(File.separator);
                    sb7.append(a);
                    String sb8 = sb7.toString();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb8);
                    sb9.append(File.separator);
                    sb9.append("data");
                    String sb10 = sb9.toString();
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(sb8);
                    sb11.append(File.separator);
                    sb11.append("config");
                    String sb12 = sb11.toString();
                    File file2 = new File(sb10);
                    File file3 = new File(sb12);
                    if (!file2.exists() || !file3.exists() || !C6824e.m21225a(C6824e.this.f19443c, file2)) {
                        try {
                            C6824e.m21224a(sb10, sb12);
                            file = new File(sb4, a);
                            try {
                                if (!C6830h.m21261a(file.getPath(), b)) {
                                    C6824e.m21224a(sb10, sb12, sb6, sb8);
                                    if (C6824e.this.mo16671a(b, sb4, a)) {
                                        C6824e.this.mo16669a(1, (Throwable) null);
                                    } else {
                                        C6824e.this.mo16669a(2, (Throwable) null);
                                        C6824e.m21224a(sb10, sb12, sb6, sb8);
                                        C6824e.this.f19441a = false;
                                        return;
                                    }
                                }
                                C6830h.m21255a(file, new File(sb4));
                                C6824e.this.mo16669a(3, (Throwable) null);
                                if (!C6824e.this.mo16673b(file3)) {
                                    C6824e.m21224a(sb10, sb12, sb6, sb8);
                                    C6824e.this.f19441a = false;
                                    return;
                                }
                                if (!C6824e.this.mo16670a(file2)) {
                                    C6824e.m21224a(sb10, sb12, sb6, sb8);
                                    C6824e.this.f19441a = false;
                                    return;
                                }
                                C6824e.this.f19441a = false;
                            } catch (Throwable th) {
                                C6824e.this.mo16669a(2, th);
                                C6824e.m21224a(sb10, sb12, sb6, sb8);
                                C6824e.this.f19441a = false;
                            }
                        } catch (Throwable th2) {
                            try {
                                C6830h.m21259a(th2);
                            } catch (Throwable th3) {
                                C6824e.this.f19441a = false;
                                throw th3;
                            }
                        }
                    } else if (!C6824e.this.mo16673b(file3)) {
                        C6824e.m21224a(sb10, sb12);
                        C6824e.this.f19441a = false;
                    } else {
                        if (!C6824e.this.mo16670a(file2)) {
                            C6824e.m21224a(sb10, sb12);
                        }
                        C6824e.this.f19441a = false;
                    }
                }
            });
        }
        return this.f19442b.mo16667b();
    }

    /* renamed from: a */
    public static void m21223a(C6820a aVar) {
        f19439d = aVar;
    }

    /* renamed from: a */
    public static void m21224a(String... strArr) {
        for (String file : strArr) {
            File file2 = new File(file);
            if (file2.exists()) {
                file2.delete();
            }
        }
    }

    public C6824e(C6827f fVar) {
        C6823d dVar;
        if (fVar != null) {
            this.f19443c = fVar;
            this.f19447h = fVar.mo16687g();
            if (f19439d == null) {
                dVar = new C6829g(fVar.mo16682b());
            } else {
                dVar = new C6822c(new C6829g(fVar.mo16682b()), f19439d);
            }
            this.f19442b = dVar;
            return;
        }
        throw new RuntimeException("MLModelConfig can not be null!");
    }

    /* renamed from: a */
    public final boolean mo16670a(File file) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                this.f19442b.mo16666a(fileInputStream2, this.f19446g);
                mo16669a(7, (Throwable) null);
                C6830h.m21258a((Closeable) fileInputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                C6830h.m21258a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mo16669a(8, th);
            C6830h.m21258a((Closeable) fileInputStream);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo16673b(File file) {
        try {
            this.f19446g = (MLConfigModel) new C6600e().mo15972a(new C6718a(new FileReader(file)), (Type) MLConfigModel.class);
            if (this.f19446g == null) {
                mo16669a(6, (Throwable) null);
            } else {
                mo16669a(5, (Throwable) null);
            }
            return true;
        } catch (Throwable th) {
            mo16669a(6, th);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo16669a(int i, Throwable th) {
        this.f19445f = i;
        m21226b(this.f19445f, th);
    }

    /* renamed from: a */
    public static boolean m21225a(C6827f fVar, File file) {
        boolean a = C6830h.m21260a(file);
        if ((!a || fVar.mo16686f()) && (a || !fVar.mo16686f())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m21226b(int i, Throwable th) {
        String str;
        if (this.f19447h != null) {
            C6821b bVar = this.f19447h;
            String b = this.f19443c.mo16682b();
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(C6830h.m21263b(th));
                str = sb.toString();
            } else {
                str = "";
            }
            bVar.mo16662a(b, i, str);
        }
    }

    /* renamed from: a */
    public final boolean mo16671a(String str, String str2, String str3) {
        return this.f19443c.mo16685e().mo16688a(str, str2, str3);
    }
}
