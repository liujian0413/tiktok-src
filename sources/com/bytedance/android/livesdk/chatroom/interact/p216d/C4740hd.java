package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4523c.C4524a;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4523c.C4525b;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.hd */
public final class C4740hd extends C4524a {

    /* renamed from: b */
    private Room f13469b;

    /* renamed from: c */
    private long f13470c;

    /* renamed from: d */
    private int f13471d;

    /* renamed from: e */
    private C4854e f13472e;

    /* renamed from: f */
    private long f13473f;

    /* renamed from: b */
    public final Room mo12355b() {
        return this.f13469b;
    }

    /* renamed from: c */
    public final long mo12356c() {
        return this.f13470c;
    }

    /* renamed from: d */
    public final int mo12357d() {
        return this.f13471d;
    }

    /* renamed from: f */
    public final void mo12661f() {
        super.mo12661f();
    }

    /* renamed from: g */
    public final C4854e mo12359g() {
        return this.f13472e;
    }

    /* renamed from: a */
    public final User mo12351a() {
        if (this.f13472e != null) {
            return this.f13472e.f13871d;
        }
        return null;
    }

    /* renamed from: h_ */
    public final boolean mo12360h_() {
        if (this.f13472e == null || this.f13472e.f13874g != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo12358e() {
        if (this.f13470c == 0 || this.f13470c != TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m15602h() {
        if (this.f17242a != null) {
            if (this.f13472e == null) {
                ((C4525b) this.f17242a).setVisibility(false);
                return;
            }
            ((C4525b) this.f17242a).setVisibility(true);
            if (this.f13472e.f13871d != null) {
                ((C4525b) this.f17242a).mo12363a(this.f13472e.f13871d);
            }
            mo12353a(this.f13472e.f13869b);
            if (this.f13472e.f13876i > 0) {
                ((C4525b) this.f17242a).mo12361a(this.f13472e.f13877j, mo12358e());
            }
            ((C4525b) this.f17242a).mo12365b(mo12358e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo12659a(C4525b bVar) {
        super.mo12659a(bVar);
        m15602h();
    }

    /* renamed from: a */
    public final void mo12352a(int i) {
        boolean z;
        if (this.f13472e != null) {
            this.f13472e.f13868a = i;
        }
        if (this.f17242a != null) {
            C4525b bVar = (C4525b) this.f17242a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo12364a(z);
        }
    }

    /* renamed from: a */
    public final void mo12353a(long j) {
        if (j >= this.f13473f) {
            this.f13473f = j;
            if (this.f17242a != null) {
                ((C4525b) this.f17242a).mo12362a(this.f13473f);
            }
            if (mo12358e()) {
                C3913e.m13800a().mo11457a(this.f13473f);
            }
        }
    }

    /* renamed from: a */
    public final void mo12354a(C4854e eVar) {
        if (this.f13472e != null) {
            this.f13472e.mo12880a(eVar);
        } else {
            this.f13472e = eVar;
        }
        if (this.f13472e != null) {
            this.f13471d = this.f13472e.f13870c;
            if (this.f13472e.f13871d != null) {
                this.f13470c = this.f13472e.f13871d.getId();
            }
        }
        m15602h();
    }

    public C4740hd(Room room, long j, int i, C4854e eVar) {
        this.f13469b = room;
        this.f13470c = j;
        this.f13471d = i;
        if (this.f13472e != null) {
            this.f13472e.mo12880a(eVar);
        } else {
            this.f13472e = eVar;
        }
        if (this.f13472e != null) {
            this.f13471d = this.f13472e.f13870c;
            if (this.f13472e.f13871d != null) {
                this.f13470c = this.f13472e.f13871d.getId();
            }
        }
    }
}
