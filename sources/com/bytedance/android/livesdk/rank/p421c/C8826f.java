package com.bytedance.android.livesdk.rank.p421c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.rank.model.C8856e;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8812a;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8813b;
import com.bytedance.android.livesdk.rank.viewbinder.C8896l;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.rank.c.f */
public final class C8826f implements C8813b, C6310a {

    /* renamed from: a */
    private C6309f f23985a = new C6309f(this);

    /* renamed from: b */
    private C8812a f23986b;

    /* renamed from: c */
    private long f23987c;

    /* renamed from: d */
    private long f23988d;

    /* renamed from: e */
    private boolean f23989e;

    /* renamed from: f */
    private C3479d<C8856e> f23990f;

    /* renamed from: g */
    private LiveMultiTypeAdapter f23991g;

    /* renamed from: a */
    public final void mo21897a() {
        C4275g.m14446a((Handler) this.f23985a, this.f23987c, this.f23988d);
    }

    /* renamed from: b */
    private void m26431b() {
        C8857f fVar;
        if (this.f23990f == null) {
            this.f23986b.mo21890a();
            return;
        }
        if (this.f23990f.data != null && !C6311g.m19573a(((C8856e) this.f23990f.data).f24095a)) {
            C7492s.m23300b((Iterable<? extends T>) ((C8856e) this.f23990f.data).f24095a).mo19291a(C8827g.f23992a).mo19334m().mo19129a((C7326g<? super T>) new C8828h<Object>(this), C8829i.f23994a);
        }
        if (this.f23990f.data == null || C6307b.m19566a((Collection<T>) ((C8856e) this.f23990f.data).f24095a)) {
            this.f23986b.mo21893b();
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                this.f23986b.mo21894c();
                return;
            }
            if (this.f23990f.data != null) {
                fVar = ((C8856e) this.f23990f.data).f24096b;
            } else {
                fVar = null;
            }
            this.f23986b.mo21892a(true, fVar);
            return;
        }
        C8856e eVar = (C8856e) this.f23990f.data;
        ArrayList arrayList = new ArrayList(eVar.f24095a.size());
        if (this.f23986b.getContext() != null) {
            arrayList.addAll(eVar.f24095a);
            this.f23991g = new LiveMultiTypeAdapter();
            this.f23991g.mo120457a(C8857f.class, new C8896l());
            this.f23991g.mo11418a(arrayList);
            this.f23986b.mo21891a(this.f23991g);
            this.f23986b.mo21892a(true ^ this.f23989e, eVar.f24096b);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m26430a(C8857f fVar) throws Exception {
        if (fVar == null || fVar.f24097a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21903a(List list) throws Exception {
        ((C8856e) this.f23990f.data).f24095a = list;
    }

    public final void handleMsg(Message message) {
        if (message.what == 36) {
            if (message.obj instanceof Exception) {
                this.f23986b.mo21890a();
            } else if (message.obj instanceof C3477b) {
                this.f23990f = (C3479d) message.obj;
                m26431b();
            }
        }
    }

    public C8826f(C8812a aVar, long j, long j2, boolean z) {
        this.f23986b = aVar;
        this.f23987c = j;
        this.f23988d = j2;
        this.f23989e = z;
    }
}
