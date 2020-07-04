package com.bytedance.common.p477a;

import android.content.Context;
import com.bytedance.common.utility.p254b.C9714c;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.bytedance.common.a.d */
public class C9674d implements C9675e {

    /* renamed from: a */
    static C9674d f26399a;

    /* renamed from: d */
    private static C9669a f26400d;

    /* renamed from: b */
    private boolean f26401b;

    /* renamed from: c */
    private final C9672c f26402c;

    /* renamed from: e */
    private final Context f26403e;

    /* renamed from: f */
    private final String f26404f;

    /* renamed from: g */
    private final long f26405g;

    /* renamed from: h */
    private ConcurrentHashMap<String, Future<C9670b>> f26406h = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C9675e m28580a() {
        return f26399a;
    }

    /* renamed from: b */
    public final void mo24042b() {
        if (this.f26402c != null) {
            this.f26402c.mo24035b();
        }
    }

    /* renamed from: b */
    public final void mo24043b(boolean z) {
        this.f26401b = true;
    }

    /* renamed from: a */
    public final void mo24041a(boolean z) {
        C9676f.m28593a(true);
    }

    /* renamed from: a */
    public final List<InetAddress> mo24040a(String str) {
        C9670b b = m28582b(str);
        if (b != null) {
            return b.f26385c;
        }
        return null;
    }

    /* renamed from: c */
    private Future<C9670b> m28583c(String str) {
        try {
            ExecutorService a = C9714c.m28650a();
            C9677g gVar = new C9677g(str, this.f26403e, this.f26404f, this.f26402c, this.f26405g);
            Future<C9670b> submit = a.submit(gVar);
            this.f26402c.mo24037c(str);
            this.f26406h.put(str, submit);
            return submit;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private C9670b m28582b(String str) {
        if (!C9679i.m28599a(str) || C9679i.m28601b(str)) {
            return null;
        }
        if ((f26400d != null && f26400d.mo24027a(str)) || !C9679i.m28598a(this.f26403e)) {
            return null;
        }
        C9670b a = this.f26402c.mo24033a(str);
        if (a != null) {
            boolean b = a.mo24029b();
            StringBuilder sb = new StringBuilder("refresh host sync: ");
            sb.append(str);
            sb.append(" expired: ");
            sb.append(b);
            C9676f.m28592a(sb.toString());
        }
        if ((a == null || a.mo24029b()) && !this.f26402c.mo24036b(str)) {
            m28583c(str);
        }
        if (a == null || (a.mo24029b() && (!a.mo24029b() || !this.f26401b))) {
            return null;
        }
        return a;
    }

    private C9674d(Context context, String str, long j, boolean z) {
        this.f26403e = context;
        this.f26404f = str;
        this.f26402c = new C9672c(context, z);
        if (j > 300) {
            this.f26405g = j;
        } else {
            this.f26405g = 300;
        }
    }

    /* renamed from: a */
    public static C9675e m28581a(Context context, String str, long j, boolean z) {
        if (f26399a == null) {
            synchronized (C9674d.class) {
                if (f26399a == null) {
                    C9674d dVar = new C9674d(context.getApplicationContext(), str, 300, z);
                    f26399a = dVar;
                }
            }
        }
        return f26399a;
    }
}
