package com.google.firebase.iid;

import android.support.p022v4.util.ArrayMap;
import android.util.Pair;
import com.google.android.gms.tasks.C17057f;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.u */
final class C18351u {

    /* renamed from: a */
    private final Executor f49846a;

    /* renamed from: b */
    private final Map<Pair<String, String>, C17057f<String>> f49847b = new ArrayMap();

    C18351u(Executor executor) {
        this.f49846a = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C17057f<String> mo47272a(String str, String str2, C18353w wVar) {
        Pair pair = new Pair(str, str2);
        C17057f<String> fVar = (C17057f) this.f49847b.get(pair);
        if (fVar != null) {
            return fVar;
        }
        C17057f<String> b = wVar.mo47232a().mo44293b(this.f49846a, new C18352v(this, pair));
        this.f49847b.put(pair, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C17057f mo47271a(Pair pair, C17057f fVar) throws Exception {
        synchronized (this) {
            this.f49847b.remove(pair);
        }
        return fVar;
    }
}
