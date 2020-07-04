package com.p280ss.android.ugc.aweme.storage;

import com.bytedance.storage.C12918a;
import com.bytedance.storage.C12920c;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41915b;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41918c;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41919d;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41921e;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41923f;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41925g;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41927h;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41928i;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41929j;
import com.p280ss.android.ugc.aweme.storage.p1645c.C41931k;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41936a;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41938b;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41941d;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41942e;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41943f;
import com.p280ss.android.ugc.aweme.storage.p1648f.p1649a.C41950a;
import com.p280ss.android.ugc.aweme.storage.p1648f.p1650b.p1651a.C41953a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.b */
public final class C41894b implements C41942e {

    /* renamed from: a */
    private C41936a f108970a;

    /* renamed from: b */
    private final AtomicBoolean f108971b = new AtomicBoolean(false);

    /* renamed from: a */
    public final C41938b mo102929a() {
        C41936a aVar = this.f108970a;
        if (aVar == null) {
            C7573i.m23583a("mProxy");
        }
        return aVar.getMonitor();
    }

    /* renamed from: b */
    public final C41943f mo102931b() {
        C41936a aVar = this.f108970a;
        if (aVar == null) {
            C7573i.m23583a("mProxy");
        }
        return aVar.getWhiteListService();
    }

    /* renamed from: c */
    public final C41940c mo102932c() {
        C41936a aVar = this.f108970a;
        if (aVar == null) {
            C7573i.m23583a("mProxy");
        }
        return aVar.getFileProvider();
    }

    /* renamed from: d */
    public final C41941d mo102933d() {
        C41936a aVar = this.f108970a;
        if (aVar == null) {
            C7573i.m23583a("mProxy");
        }
        return aVar.getPersistedWhiteListManager();
    }

    /* renamed from: f */
    private final void m133236f() {
        C41936a aVar = this.f108970a;
        if (aVar == null) {
            C7573i.m23583a("mProxy");
        }
        aVar.getPersistedWhiteListManager().mo102967a((C41950a) new C41953a());
    }

    /* renamed from: e */
    private static void m133235e() {
        C12920c.m37606a((C12918a) new C41915b());
        C12920c.m37606a((C12918a) new C41919d());
        C12920c.m37606a((C12918a) new C41921e());
        C12920c.m37606a((C12918a) new C41923f());
        C12920c.m37606a((C12918a) new C41927h());
        C12920c.m37606a((C12918a) new C41925g());
        C12920c.m37606a((C12918a) new C41928i());
        C12920c.m37606a((C12918a) new C41929j());
        C12920c.m37606a((C12918a) new C41931k());
        C12920c.m37606a((C12918a) new C41918c());
    }

    /* renamed from: a */
    public final void mo102930a(C41936a aVar) {
        C7573i.m23587b(aVar, "proxy");
        if (!this.f108971b.get()) {
            this.f108971b.set(true);
            this.f108970a = aVar;
            m133235e();
            m133236f();
        }
    }
}
