package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.b */
public abstract class C4319b {

    /* renamed from: a */
    public boolean f12544a;

    /* renamed from: b */
    public Room f12545b;

    /* renamed from: c */
    private C7321c f12546c;

    /* renamed from: d */
    private final C4320a f12547d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.b$a */
    public interface C4320a {
        /* renamed from: a */
        void mo12002a(int i, String str);

        /* renamed from: a */
        void mo12003a(Room room);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C7492s<C3479d<Room>> mo12001c();

    /* renamed from: b */
    public final void mo12000b() {
        this.f12544a = false;
        if (this.f12546c != null && !this.f12546c.isDisposed()) {
            this.f12546c.dispose();
        }
    }

    /* renamed from: a */
    public final void mo11997a() {
        if (!this.f12544a) {
            this.f12544a = true;
            this.f12546c = mo12001c().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4321c<Object>(this), (C7326g<? super Throwable>) new C4322d<Object>(this));
        }
    }

    C4319b(C4320a aVar) {
        this.f12547d = aVar;
    }

    /* renamed from: a */
    private void m14523a(Room room) {
        this.f12545b = room;
        this.f12544a = false;
        this.f12547d.mo12003a(room);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11998a(C3479d dVar) throws Exception {
        if (this.f12544a) {
            if (dVar == null) {
                m14522a(0, "invalid room data _ response is null");
            } else {
                m14523a((Room) dVar.data);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11999a(Throwable th) throws Exception {
        if (this.f12544a) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                m14522a(apiServerException.getErrorCode(), apiServerException.getErrorMsg());
                return;
            }
            m14522a(0, th.toString());
        }
    }

    /* renamed from: a */
    private void m14522a(int i, String str) {
        this.f12544a = false;
        this.f12547d.mo12002a(i, str);
    }
}
