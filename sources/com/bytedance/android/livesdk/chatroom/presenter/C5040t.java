package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C4440j;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5572e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import java.util.HashSet;
import java.util.Set;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.t */
public final class C5040t extends C10291b<C5042a> {

    /* renamed from: a */
    public String f14320a;

    /* renamed from: b */
    public boolean f14321b = true;

    /* renamed from: c */
    public boolean f14322c;

    /* renamed from: d */
    public Room f14323d;

    /* renamed from: e */
    public int f14324e = 0;

    /* renamed from: f */
    private C47562b f14325f = new C47562b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.t$a */
    public interface C5042a extends C10290a {
        /* renamed from: a */
        void mo13083a();

        /* renamed from: a */
        void mo13084a(C8158m mVar);

        /* renamed from: a */
        void mo13085a(String str);

        /* renamed from: a */
        void mo13086a(boolean z);

        /* renamed from: b */
        void mo13087b();

        /* renamed from: c */
        void mo13088c();
    }

    /* renamed from: j */
    public final void mo13079j() {
        this.f14324e = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo13080k() throws Exception {
        this.f14322c = false;
    }

    /* renamed from: l */
    private void m16161l() {
        mo13069a((Context) null);
    }

    /* renamed from: i */
    public final void mo13078i() {
        this.f14324e++;
    }

    /* renamed from: e */
    public static C8149d m16160e() {
        return GiftManager.inst().getFastGift();
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f14325f != null) {
            this.f14325f.mo119660a();
        }
    }

    /* renamed from: d */
    public final boolean mo13074d() {
        if (m16160e() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo13075f() {
        if (m16160e() == null) {
            return 0;
        }
        return m16160e().f22233d;
    }

    /* renamed from: g */
    public final int mo13076g() {
        if (m16160e() != null) {
            return m16160e().f22235f;
        }
        return 0;
    }

    /* renamed from: h */
    public final boolean mo13077h() {
        if (m16160e() == null || !m16160e().f22236g) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m16162m() {
        boolean z;
        if (m16160e() != null) {
            Set set = (Set) C8946b.f24369U.mo22117a();
            if (set == null || !set.contains(String.valueOf(m16160e().f22233d))) {
                z = true;
            } else {
                z = false;
            }
            this.f14321b = z;
        }
    }

    /* renamed from: b */
    public final void mo13073b() {
        this.f14321b = false;
        Set set = (Set) C8946b.f24369U.mo22117a();
        if (set == null) {
            set = new HashSet();
        }
        set.add(String.valueOf(m16160e().f22233d));
        C8946b.f24369U.mo22118a(set);
    }

    public final void onEvent(C8296e eVar) {
        if (eVar != null && eVar.f22776a == 2) {
            m16161l();
        }
    }

    /* renamed from: a */
    private <T> void m16159a(Class<T> cls) {
        this.f14325f.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C4440j) {
                    C5040t.this.onEvent((C4440j) t);
                    return;
                }
                if (t instanceof C8296e) {
                    C5040t.this.onEvent((C8296e) t);
                }
            }
        }));
    }

    /* renamed from: a */
    public final void mo9142a(C5042a aVar) {
        super.mo9142a(aVar);
        if (this.f14325f != null) {
            this.f14325f.mo119660a();
        }
        m16159a(C4440j.class);
        m16159a(C8296e.class);
        C8149d fastGift = GiftManager.inst().getFastGift();
        if (fastGift != null && fastGift.f22233d > 0) {
            m16162m();
            if (mo9140c() != null) {
                ((C5042a) mo9140c()).mo13087b();
            }
        }
    }

    /* renamed from: a */
    public final void mo13069a(Context context) {
        if (!this.f14322c) {
            if (m16160e() == null) {
                this.f14322c = false;
                return;
            }
            C8149d e = m16160e();
            this.f14322c = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            C7492s a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(e.f22233d, this.f14323d.getId(), this.f14323d.getOwner().getId(), 1, 126).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
            C5043u uVar = new C5043u(this, e, uptimeMillis, context);
            a.mo19281a((C7326g<? super T>) uVar, (C7326g<? super Throwable>) new C5044v<Object>(this, e), (C7323a) new C5045w(this));
        }
    }

    public final void onEvent(C4440j jVar) {
        int i;
        C5042a aVar = (C5042a) mo9140c();
        if (jVar != null) {
            if (jVar.f12889a == null) {
                i = 8;
            } else {
                i = 0;
            }
            C5572e eVar = new C5572e(i);
            if (eVar.f16625a != 0 || !((C3495l) C3596c.m13172a(C3495l.class)).toolbarManagerHelper().mo10531b().mo14166a(ToolbarButton.RECHARGE_GUIDE)) {
                ((C3495l) C3596c.m13172a(C3495l.class)).toolbarManagerHelper().mo10531b().mo14164a(ToolbarButton.FAST_GIFT, (C5735a) eVar);
                if (aVar != null) {
                    aVar.mo13087b();
                }
            } else {
                return;
            }
        }
        if (jVar != null && jVar.f12889a != null && jVar.f12889a.f22233d > 0) {
            if (jVar.f12890b != 2 && jVar.f12890b != 1 && m16160e() != null && m16160e().equals(jVar.f12889a)) {
                return;
            }
            if (!GiftManager.inst().isTemporaryFastGiftPresent() || jVar.f12890b == 1) {
                m16162m();
                if (aVar != null) {
                    if (jVar.f12890b == 2 || jVar.f12890b == 1) {
                        aVar.mo13086a(jVar.f12891c);
                        return;
                    }
                    aVar.mo13087b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13072a(C8149d dVar, Throwable th) throws Exception {
        this.f14322c = false;
        C8282s.m25315a(dVar.f22233d, this.f14323d.getId(), th);
        if (dVar != null && dVar.f22228G) {
            C8282s.m25313a(dVar.f22233d, this.f14323d.getId(), 1, "fast_gift", th);
        }
        if (mo9140c() != null) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (40001 == apiServerException.getErrorCode()) {
                    ((C5042a) mo9140c()).mo13083a();
                } else {
                    ((C5042a) mo9140c()).mo13085a(apiServerException.getPrompt());
                }
            } else {
                ((C5042a) mo9140c()).mo13088c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13071a(C8149d dVar, long j, Context context, C3479d dVar2) throws Exception {
        C8282s.m25314a(dVar.f22233d, this.f14323d.getId(), SystemClock.uptimeMillis() - j);
        if (dVar != null && dVar.f22228G) {
            C8282s.m25312a(dVar.f22233d, this.f14323d.getId(), 1, "fast_gift", SystemClock.uptimeMillis() - j);
        }
        if (mo9140c() != null) {
            C8158m mVar = (C8158m) dVar2.data;
            ((C5042a) mo9140c()).mo13084a(mVar);
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a(mVar.f22299c);
        }
    }
}
