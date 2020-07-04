package com.google.api.client.http;

import com.google.api.client.util.C17346aa;
import com.google.api.client.util.C17384w;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.api.client.http.z */
public final class C17277z extends C17231a {

    /* renamed from: b */
    private ArrayList<C17278a> f48142b = new ArrayList<>();

    /* renamed from: com.google.api.client.http.z$a */
    public static final class C17278a {

        /* renamed from: a */
        public C17257h f48143a;

        /* renamed from: b */
        public C17261l f48144b;

        /* renamed from: c */
        public C17258i f48145c;

        public C17278a() {
            this(null);
        }

        /* renamed from: a */
        private C17278a m57494a(C17257h hVar) {
            this.f48143a = hVar;
            return this;
        }

        /* renamed from: a */
        private C17278a m57495a(C17261l lVar) {
            this.f48144b = lVar;
            return this;
        }

        public C17278a(C17257h hVar) {
            this(null, hVar);
        }

        private C17278a(C17261l lVar, C17257h hVar) {
            m57495a((C17261l) null);
            m57494a(hVar);
        }
    }

    /* renamed from: e */
    private String m57490e() {
        return this.f48023a.mo44637a("boundary");
    }

    public C17277z() {
        super(new C17265n("multipart/related").mo44634a("boundary", "__END_OF_PART__"));
    }

    /* renamed from: d */
    public final boolean mo44567d() {
        Iterator it = this.f48142b.iterator();
        while (it.hasNext()) {
            if (!((C17278a) it.next()).f48143a.mo44567d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private C17277z m57489a(C17278a aVar) {
        this.f48142b.add(C17384w.m57847a(aVar));
        return this;
    }

    /* renamed from: a */
    public final C17277z mo44670a(Collection<? extends C17257h> collection) {
        this.f48142b = new ArrayList<>(collection.size());
        for (C17257h aVar : collection) {
            m57489a(new C17278a(aVar));
        }
        return this;
    }

    /* renamed from: a */
    public final void mo44591a(OutputStream outputStream) throws IOException {
        C17346aa aaVar;
        long j;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, mo44565b());
        String e = m57490e();
        Iterator it = this.f48142b.iterator();
        while (it.hasNext()) {
            C17278a aVar = (C17278a) it.next();
            C17261l a = new C17261l().mo44614a((String) null);
            if (aVar.f48144b != null) {
                a.mo44617a(aVar.f48144b);
            }
            a.mo44621c(null).mo44632k(null).mo44625e(null).mo44613a((Long) null).mo44448c("Content-Transfer-Encoding", (Object) null);
            C17257h hVar = aVar.f48143a;
            if (hVar != 0) {
                a.mo44448c("Content-Transfer-Encoding", (Object) Arrays.asList(new String[]{"binary"}));
                a.mo44625e(hVar.mo44566c());
                C17258i iVar = aVar.f48145c;
                if (iVar == null) {
                    j = hVar.mo44564a();
                    aaVar = hVar;
                } else {
                    a.mo44621c(iVar.mo44603a());
                    C17346aa jVar = new C17259j(hVar, iVar);
                    long a2 = C17231a.m57275a(hVar);
                    aaVar = jVar;
                    j = a2;
                }
                if (j != -1) {
                    a.mo44613a(Long.valueOf(j));
                }
            } else {
                aaVar = 0;
            }
            outputStreamWriter.write("--");
            outputStreamWriter.write(e);
            outputStreamWriter.write("\r\n");
            C17261l.m57389a(a, null, null, outputStreamWriter);
            if (aaVar != 0) {
                outputStreamWriter.write("\r\n");
                outputStreamWriter.flush();
                aaVar.mo44591a(outputStream);
            }
            outputStreamWriter.write("\r\n");
        }
        outputStreamWriter.write("--");
        outputStreamWriter.write(e);
        outputStreamWriter.write("--");
        outputStreamWriter.write("\r\n");
        outputStreamWriter.flush();
    }
}
