package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.contract.C4523c.C4524a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4740hd;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.C4765a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.an */
public final class C4488an implements C4765a {

    /* renamed from: a */
    private Room f13086a;

    /* renamed from: b */
    private C4764a f13087b;

    /* renamed from: c */
    private C4489a f13088c;

    /* renamed from: d */
    private List<C4524a> f13089d = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.an$a */
    public interface C4489a {
        /* renamed from: a */
        void mo12254a(int i);
    }

    /* renamed from: a */
    public final void mo12185a(List<C4855f> list, long j) {
    }

    /* renamed from: a */
    public final void mo12251a() {
        this.f13087b.mo12689a((C4765a) this);
    }

    /* renamed from: b */
    public final void mo12253b() {
        this.f13087b.mo12695b((C4765a) this);
    }

    /* renamed from: b */
    public final void mo12186b(List<C4854e> list) {
        this.f13088c.mo12254a(list.size());
    }

    /* renamed from: a */
    public final void mo12184a(List<C4854e> list) {
        for (C4524a aVar : this.f13089d) {
            C4854e a = this.f13087b.mo12684a(aVar.mo12356c(), aVar.mo12357d());
            if (a != null) {
                aVar.mo12354a(a);
            }
        }
    }

    /* renamed from: b */
    public final C4524a mo12252b(long j, int i) {
        C4854e b = this.f13087b.mo12691b(j, i);
        if (b == null) {
            this.f13087b.mo12696c();
        }
        C4524a c = m15010c(j, i);
        if (c == null) {
            return m15009a(j, i, b);
        }
        c.mo12354a(b);
        return c;
    }

    /* renamed from: c */
    private C4524a m15010c(long j, int i) {
        for (C4524a aVar : this.f13089d) {
            if ((j > 0 && aVar.mo12356c() == j) || (i > 0 && aVar.mo12357d() == i)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo12181a(long j, int i) {
        for (C4524a aVar : this.f13089d) {
            if ((j > 0 && aVar.mo12356c() == j) || (i > 0 && aVar.mo12357d() == i)) {
                this.f13089d.remove(aVar);
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo12183a(long j, long j2) {
        if (j > 0) {
            for (C4524a aVar : this.f13089d) {
                if (aVar.mo12356c() == j) {
                    aVar.mo12353a(j2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12182a(long j, int i, boolean z) {
        C4524a c = m15010c(j, i);
        if (c != null) {
            c.mo12352a(z ^ true ? 1 : 0);
        }
    }

    public C4488an(Room room, C4764a aVar, C4489a aVar2) {
        this.f13086a = room;
        this.f13088c = aVar2;
        this.f13087b = aVar;
    }

    /* renamed from: a */
    private C4524a m15009a(long j, int i, C4854e eVar) {
        C4740hd hdVar = new C4740hd(this.f13086a, j, i, eVar);
        this.f13089d.add(hdVar);
        return hdVar;
    }
}
