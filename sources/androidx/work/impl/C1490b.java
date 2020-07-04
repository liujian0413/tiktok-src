package androidx.work.impl;

import android.content.Context;
import androidx.work.C1451a;
import androidx.work.WorkerParameters.C1450a;
import androidx.work.impl.C1546h.C1550a;
import androidx.work.impl.utils.p038a.C1564c;
import androidx.work.impl.utils.p039b.C1566a;
import com.C1642a;
import com.google.common.util.concurrent.C18253l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.b */
public final class C1490b implements C1466a {

    /* renamed from: a */
    private Context f5709a;

    /* renamed from: b */
    private C1451a f5710b;

    /* renamed from: c */
    private C1566a f5711c;

    /* renamed from: d */
    private WorkDatabase f5712d;

    /* renamed from: e */
    private Map<String, C1546h> f5713e = new HashMap();

    /* renamed from: f */
    private List<C1538c> f5714f;

    /* renamed from: g */
    private Set<String> f5715g;

    /* renamed from: h */
    private final List<C1466a> f5716h;

    /* renamed from: i */
    private final Object f5717i;

    /* renamed from: androidx.work.impl.b$a */
    static class C1491a implements Runnable {

        /* renamed from: a */
        private C1466a f5718a;

        /* renamed from: b */
        private String f5719b;

        /* renamed from: c */
        private C18253l<Boolean> f5720c;

        public final void run() {
            boolean z;
            try {
                z = ((Boolean) this.f5720c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f5718a.mo6707a(this.f5719b, z);
        }

        C1491a(C1466a aVar, String str, C18253l<Boolean> lVar) {
            this.f5718a = aVar;
            this.f5719b = str;
            this.f5720c = lVar;
        }
    }

    /* renamed from: a */
    public final boolean mo6739a(String str) {
        return mo6740a(str, (C1450a) null);
    }

    /* renamed from: a */
    public final void mo6738a(C1466a aVar) {
        synchronized (this.f5717i) {
            this.f5716h.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo6741b(C1466a aVar) {
        synchronized (this.f5717i) {
            this.f5716h.remove(aVar);
        }
    }

    /* renamed from: c */
    public final boolean mo6743c(String str) {
        boolean contains;
        synchronized (this.f5717i) {
            contains = this.f5715g.contains(str);
        }
        return contains;
    }

    /* renamed from: d */
    public final boolean mo6744d(String str) {
        boolean containsKey;
        synchronized (this.f5717i) {
            containsKey = this.f5713e.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: b */
    public final boolean mo6742b(String str) {
        synchronized (this.f5717i) {
            C1642a.m8034a("Processor stopping %s", new Object[]{str});
            C1546h hVar = (C1546h) this.f5713e.remove(str);
            if (hVar != null) {
                hVar.mo6807a(false);
                C1642a.m8034a("WorkerWrapper stopped for %s", new Object[]{str});
                return true;
            }
            C1642a.m8034a("WorkerWrapper could not be found for %s", new Object[]{str});
            return false;
        }
    }

    /* renamed from: a */
    public final void mo6707a(String str, boolean z) {
        synchronized (this.f5717i) {
            this.f5713e.remove(str);
            C1642a.m8034a("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)});
            for (C1466a a : this.f5716h) {
                a.mo6707a(str, z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo6740a(String str, C1450a aVar) {
        synchronized (this.f5717i) {
            if (this.f5713e.containsKey(str)) {
                C1642a.m8034a("Work %s is already enqueued for processing", new Object[]{str});
                return false;
            }
            C1550a aVar2 = new C1550a(this.f5709a, this.f5710b, this.f5711c, this.f5712d, str);
            C1546h a = aVar2.mo6812a(this.f5714f).mo6811a(aVar).mo6813a();
            C1564c<Boolean> cVar = a.f5845c;
            cVar.mo6818a(new C1491a(this, str, cVar), this.f5711c.mo6839a());
            this.f5713e.put(str, a);
            this.f5711c.mo6842c().execute(a);
            C1642a.m8034a("%s: processing %s", new Object[]{getClass().getSimpleName(), str});
            return true;
        }
    }

    public C1490b(Context context, C1451a aVar, C1566a aVar2, WorkDatabase workDatabase, List<C1538c> list) {
        this.f5709a = context;
        this.f5710b = aVar;
        this.f5711c = aVar2;
        this.f5712d = workDatabase;
        this.f5714f = list;
        this.f5715g = new HashSet();
        this.f5716h = new ArrayList();
        this.f5717i = new Object();
    }
}
