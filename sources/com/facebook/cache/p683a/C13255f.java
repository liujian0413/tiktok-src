package com.facebook.cache.p683a;

import com.facebook.binaryresource.C13231a;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.p683a.C13248d.C13249a;
import com.facebook.cache.p683a.C13248d.C13250b;
import com.facebook.common.file.C13297a;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.CreateDirectoryException;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.p686c.C13286a;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: com.facebook.cache.a.f */
public class C13255f implements C13248d {

    /* renamed from: b */
    private static final Class<?> f35133b = C13255f.class;

    /* renamed from: a */
    volatile C13256a f35134a = new C13256a(null, null);

    /* renamed from: c */
    private final int f35135c;

    /* renamed from: d */
    private final C13310j<File> f35136d;

    /* renamed from: e */
    private final String f35137e;

    /* renamed from: f */
    private final CacheErrorLogger f35138f;

    /* renamed from: com.facebook.cache.a.f$a */
    static class C13256a {

        /* renamed from: a */
        public final C13248d f35139a;

        /* renamed from: b */
        public final File f35140b;

        C13256a(File file, C13248d dVar) {
            this.f35139a = dVar;
            this.f35140b = file;
        }
    }

    /* renamed from: c */
    public final void mo32439c() throws IOException {
        m38762e().mo32439c();
    }

    /* renamed from: d */
    public final Collection<C13249a> mo32441d() throws IOException {
        return m38762e().mo32441d();
    }

    /* renamed from: e */
    private synchronized C13248d m38762e() throws IOException {
        if (m38763f()) {
            m38764g();
            m38765h();
        }
        return (C13248d) C13307g.m38940a(this.f35134a.f35139a);
    }

    /* renamed from: f */
    private boolean m38763f() {
        C13256a aVar = this.f35134a;
        if (aVar.f35139a == null || aVar.f35140b == null || !aVar.f35140b.exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m38764g() {
        if (this.f35134a.f35139a != null && this.f35134a.f35140b != null) {
            C13297a.m38911b(this.f35134a.f35140b);
        }
    }

    /* renamed from: h */
    private void m38765h() throws IOException {
        File file = new File((File) this.f35136d.mo29879b(), this.f35137e);
        m38761a(file);
        this.f35134a = new C13256a(file, new C13234a(file, this.f35135c, this.f35138f));
    }

    /* renamed from: b */
    public final void mo32438b() {
        try {
            m38762e().mo32438b();
        } catch (IOException e) {
            C13286a.m38850b(f35133b, "purgeUnexpectedResources", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final boolean mo32435a() {
        try {
            return m38762e().mo32435a();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final long mo32431a(C13249a aVar) throws IOException {
        return m38762e().mo32431a(aVar);
    }

    /* renamed from: b */
    public final long mo32436b(String str) throws IOException {
        return m38762e().mo32436b(str);
    }

    /* renamed from: a */
    private void m38761a(File file) throws IOException {
        try {
            FileUtils.m38907a(file);
            C13286a.m38849b(f35133b, "Created cache directory %s", (Object) file.getAbsolutePath());
        } catch (CreateDirectoryException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public final boolean mo32440c(String str, Object obj) throws IOException {
        return m38762e().mo32440c(str, obj);
    }

    /* renamed from: b */
    public final C13231a mo32437b(String str, Object obj) throws IOException {
        return m38762e().mo32437b(str, obj);
    }

    /* renamed from: a */
    public final C13250b mo32433a(String str, Object obj) throws IOException {
        return m38762e().mo32433a(str, obj);
    }

    public C13255f(int i, C13310j<File> jVar, String str, CacheErrorLogger cacheErrorLogger) {
        this.f35135c = i;
        this.f35138f = cacheErrorLogger;
        this.f35136d = jVar;
        this.f35137e = str;
    }
}
