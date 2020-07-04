package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.p039b.C1566a;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f5633a;

    /* renamed from: b */
    public C1458e f5634b;

    /* renamed from: c */
    public Set<String> f5635c;

    /* renamed from: d */
    public int f5636d;

    /* renamed from: e */
    public Executor f5637e;

    /* renamed from: f */
    public C1566a f5638f;

    /* renamed from: g */
    public C1577j f5639g;

    /* renamed from: h */
    private C1450a f5640h;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1450a {

        /* renamed from: a */
        public List<String> f5641a;

        /* renamed from: b */
        public List<Uri> f5642b;

        /* renamed from: c */
        public Network f5643c;
    }

    public WorkerParameters(UUID uuid, C1458e eVar, Collection<String> collection, C1450a aVar, int i, Executor executor, C1566a aVar2, C1577j jVar) {
        this.f5633a = uuid;
        this.f5634b = eVar;
        this.f5635c = new HashSet(collection);
        this.f5640h = aVar;
        this.f5636d = i;
        this.f5637e = executor;
        this.f5638f = aVar2;
        this.f5639g = jVar;
    }
}
