package com.google.api.client.json;

import com.google.api.client.util.C17379u;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C17386y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.api.client.json.e */
public final class C17293e implements C17379u {

    /* renamed from: a */
    public final C17291c f48159a;

    /* renamed from: b */
    private final Set<String> f48160b;

    /* renamed from: com.google.api.client.json.e$a */
    public static class C17294a {

        /* renamed from: a */
        public final C17291c f48161a;

        /* renamed from: b */
        public Collection<String> f48162b = C17386y.m57857a();

        /* renamed from: a */
        public final C17293e mo44726a() {
            return new C17293e(this);
        }

        /* renamed from: a */
        public final C17294a mo44725a(Collection<String> collection) {
            this.f48162b = collection;
            return this;
        }

        public C17294a(C17291c cVar) {
            this.f48161a = (C17291c) C17384w.m57847a(cVar);
        }
    }

    /* renamed from: a */
    public final Set<String> mo44724a() {
        return Collections.unmodifiableSet(this.f48160b);
    }

    public C17293e(C17291c cVar) {
        this(new C17294a(cVar));
    }

    protected C17293e(C17294a aVar) {
        this.f48159a = aVar.f48161a;
        this.f48160b = new HashSet(aVar.f48162b);
    }

    /* renamed from: a */
    private void m57599a(C17295f fVar) throws IOException {
        boolean z;
        if (!this.f48160b.isEmpty()) {
            try {
                if (fVar.mo44729a(this.f48160b) == null || fVar.mo44694d() == JsonToken.END_OBJECT) {
                    z = false;
                } else {
                    z = true;
                }
                C17384w.m57852a(z, "wrapper key(s) not found: %s", this.f48160b);
            } catch (Throwable th) {
                fVar.mo44692b();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo44592a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return m57598a(inputStream, charset, (Type) cls);
    }

    /* renamed from: a */
    private Object m57598a(InputStream inputStream, Charset charset, Type type) throws IOException {
        C17295f a = this.f48159a.mo44673a(inputStream, charset);
        m57599a(a);
        return a.mo44728a(type, true);
    }
}
