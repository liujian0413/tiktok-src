package com.bytedance.android.livesdk.gift;

import android.os.SystemClock;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.C8157l;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.u */
public final class C8284u {

    /* renamed from: a */
    private static C8284u f22757a;

    /* renamed from: b */
    private final List<Prop> f22758b = new ArrayList();

    /* renamed from: c */
    private final List<C8285a> f22759c = new ArrayList();

    /* renamed from: d */
    private boolean f22760d = false;

    /* renamed from: com.bytedance.android.livesdk.gift.u$a */
    public interface C8285a {
        /* renamed from: a */
        void mo20799a();

        /* renamed from: a */
        void mo20800a(List<Prop> list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo21443e() throws Exception {
        this.f22760d = false;
    }

    private C8284u() {
    }

    /* renamed from: a */
    public static synchronized C8284u m25332a() {
        C8284u uVar;
        synchronized (C8284u.class) {
            if (f22757a == null) {
                f22757a = new C8284u();
            }
            uVar = f22757a;
        }
        return uVar;
    }

    /* renamed from: c */
    public final boolean mo21441c() {
        Set set = (Set) C8946b.f24367S.mo22117a();
        for (Prop prop : this.f22758b) {
            if (prop.reddotTip && !set.contains(Long.valueOf(prop.f22201id))) {
                return true;
            }
        }
        return ((Boolean) C8946b.f24471by.mo22117a()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo21440b() {
        if ((System.currentTimeMillis() / 86400000) - (((Long) C8946b.f24487q.mo22117a()).longValue() / 86400000) < 1) {
            return false;
        }
        for (Prop prop : this.f22758b) {
            if (prop.nextExpire > 0 && prop.nextExpire - ((System.currentTimeMillis() / 1000) + prop.getNowTimeDiff()) < 86400) {
                C8946b.f24487q.mo22118a(Long.valueOf(System.currentTimeMillis()));
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo21442d() {
        Set set = (Set) C8946b.f24367S.mo22117a();
        for (Prop prop : this.f22758b) {
            if (prop.reddotTip && !set.contains(Long.valueOf(prop.f22201id))) {
                set.add(Long.valueOf(prop.f22201id));
            }
        }
        C8946b.f24367S.mo22118a(set);
        C8946b.f24471by.mo22118a(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo21435a(C8285a aVar) {
        if (aVar != null && !this.f22759c.contains(aVar)) {
            this.f22759c.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo21439b(C8285a aVar) {
        if (aVar != null && this.f22759c.contains(aVar)) {
            this.f22759c.remove(aVar);
        }
    }

    /* renamed from: a */
    public final Prop mo21433a(long j) {
        for (Prop prop : this.f22758b) {
            if (prop.f22201id == j) {
                return prop;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo21438b(long j) {
        if (!this.f22760d) {
            this.f22760d = true;
            ((PropApi) C3458e.m12798a().mo10440a(PropApi.class)).getPropList(j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19281a((C7326g<? super T>) new C8286v<Object>(this, SystemClock.uptimeMillis()), (C7326g<? super Throwable>) new C8287w<Object>(this), (C7323a) new C8288x(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21436a(Throwable th) throws Exception {
        if (th instanceof Exception) {
            for (C8285a a : this.f22759c) {
                a.mo20799a();
            }
        }
        this.f22760d = false;
        C8282s.m25325b(th.getMessage());
    }

    /* renamed from: a */
    public final void mo21437a(List<Prop> list) {
        if (!list.isEmpty()) {
            for (Prop prop : list) {
                Prop a = mo21433a(prop.f22201id);
                if (a != null) {
                    this.f22758b.set(this.f22758b.indexOf(a), prop);
                }
            }
            for (C8285a a2 : this.f22759c) {
                a2.mo20800a(this.f22758b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21434a(long j, C3479d dVar) throws Exception {
        this.f22758b.clear();
        this.f22758b.addAll(((C8157l) dVar.data).f22296a);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = dVar.extra.now;
        for (Prop nowTimeDiff : this.f22758b) {
            nowTimeDiff.setNowTimeDiff((j2 - currentTimeMillis) / 1000);
        }
        for (C8285a a : this.f22759c) {
            a.mo20800a(this.f22758b);
        }
        C8282s.m25322b(SystemClock.uptimeMillis() - j);
    }
}
