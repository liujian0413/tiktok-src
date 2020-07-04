package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3390j;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.DoodleGiftApi;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.TaskGiftApi;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.C8283t;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.C8159n;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.p391a.C8170c;
import com.bytedance.android.livesdk.p393h.C8292b;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.panel.l */
public final class C8186l extends C10291b<C8188a> {

    /* renamed from: a */
    private int f22390a;

    /* renamed from: b */
    private long f22391b;

    /* renamed from: c */
    private Room f22392c;

    /* renamed from: d */
    private String f22393d;

    /* renamed from: e */
    private boolean f22394e;

    /* renamed from: com.bytedance.android.livesdk.gift.panel.l$a */
    public interface C8188a extends C10290a {
        /* renamed from: a */
        void mo21284a();

        /* renamed from: a */
        void mo21285a(int i, C8169b bVar);

        /* renamed from: a */
        void mo21288a(C8158m mVar);

        /* renamed from: a */
        void mo21289a(C8159n nVar);

        /* renamed from: a */
        void mo21293a(Exception exc);

        /* renamed from: b */
        void mo21297b(C8158m mVar);

        /* renamed from: b */
        void mo21299b(Exception exc);

        /* renamed from: c */
        void mo21301c(Exception exc);

        /* renamed from: d */
        void mo21302d(Exception exc);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21313b() throws Exception {
        this.f22394e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo21318d() throws Exception {
        this.f22394e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo21321e() throws Exception {
        this.f22394e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo21322f() throws Exception {
        this.f22394e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo21323g() throws Exception {
        this.f22394e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo21324h() throws Exception {
        this.f22394e = false;
    }

    /* renamed from: a */
    public final void mo21311a(C8170c cVar) {
        if (cVar != null) {
            switch (cVar.f22366a) {
                case GIFT:
                    C8149d findGiftById = GiftManager.inst().findGiftById(cVar.f22367b);
                    if (findGiftById == null || findGiftById.f22251v <= 0 || findGiftById.f22234e != 10) {
                        m25055a(cVar.f22367b, cVar.f22368c);
                        return;
                    } else {
                        m25059b(cVar.f22367b, cVar.f22368c);
                        return;
                    }
                case PROP:
                    m25060c(cVar.f22367b, cVar.f22368c);
                    return;
                case TASK_GIFT:
                    m25054a(cVar.f22367b);
                    return;
                case DOODLE_GIFT:
                    m25058a(cVar.f22370e);
                    return;
                case GIFT_AD:
                    m25061d(cVar.f22367b, cVar.f22368c);
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21307a(long j, long j2, C8149d dVar, int i, C3479d dVar2) throws Exception {
        m25057a((C8158m) dVar2.data);
        C8282s.m25314a(j, this.f22392c.getId(), SystemClock.uptimeMillis() - j2);
        if (dVar != null && dVar.f22228G) {
            long j3 = j;
            int i2 = i;
            C8282s.m25312a(j3, this.f22392c.getId(), i2, "gift_panel", SystemClock.uptimeMillis() - j2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21308a(long j, C8149d dVar, int i, Throwable th) throws Exception {
        this.f22394e = false;
        if (mo9140c() != null) {
            ((C8188a) mo9140c()).mo21293a((Exception) th);
        }
        C8282s.m25315a(j, this.f22392c.getId(), th);
        if (dVar != null && dVar.f22228G) {
            C8282s.m25313a(j, this.f22392c.getId(), i, "gift_panel", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21310a(C8169b bVar, long j, C3479d dVar) throws Exception {
        C8158m mVar = (C8158m) dVar.data;
        mVar.f22305i = bVar.f22362a.size();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a(mVar.f22299c);
        ((C8188a) mo9140c()).mo21285a(mVar.f22305i, bVar);
        C8282s.m25314a(998, this.f22392c.getId(), SystemClock.uptimeMillis() - j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21312a(Throwable th) throws Exception {
        this.f22394e = false;
        if (th instanceof Exception) {
            ((C8188a) mo9140c()).mo21299b((Exception) th);
            C8282s.m25315a(998, this.f22392c.getId(), th);
        }
    }

    /* renamed from: a */
    private void m25054a(long j) {
        long j2 = j;
        if (!this.f22394e && GiftManager.inst().findGiftById(j2) != null) {
            this.f22394e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            C7492s a = ((TaskGiftApi) C3458e.m12798a().mo10440a(TaskGiftApi.class)).sendTaskGift(j, 1, this.f22392c.getId()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
            C8174ad adVar = new C8174ad(this, j, uptimeMillis);
            a.mo19281a((C7326g<? super T>) adVar, (C7326g<? super Throwable>) new C8191o<Object>(this, j2), (C7323a) new C8192p(this));
        }
    }

    /* renamed from: a */
    private void m25057a(C8158m mVar) {
        if (mo9140c() != null && mVar.f22310n != 2) {
            C8149d findGiftById = GiftManager.inst().findGiftById(mVar.f22301e);
            if (findGiftById.f22234e == 10) {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11153a(mVar.f22315s);
            } else {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a(mVar.f22299c);
            }
            if (mVar.f22308l > 0) {
                mVar.f22317u = C8284u.m25332a().mo21433a(mVar.f22308l);
                if (mVar.f22317u != null) {
                    mVar.f22301e = mVar.f22317u.gift.f22233d;
                    boolean z = true;
                    if (!C6311g.m19573a(mVar.f22311o)) {
                        Iterator it = mVar.f22311o.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Prop) it.next()).f22201id == mVar.f22308l) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z) {
                        Prop newInstance = Prop.newInstance(mVar.f22317u);
                        newInstance.count -= this.f22390a;
                        if (mVar.f22311o == null) {
                            mVar.f22311o = new ArrayList();
                        }
                        mVar.f22311o.add(newInstance);
                    }
                }
            }
            ((C8188a) mo9140c()).mo21288a(mVar);
            m25056a(findGiftById, mVar);
        }
    }

    /* renamed from: a */
    private void m25058a(C8169b bVar) {
        if (!this.f22394e) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < bVar.f22362a.size(); i++) {
                C8283t tVar = (C8283t) bVar.f22362a.get(i);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", tVar.f22755c);
                    jSONObject2.put("x", tVar.f22753a);
                    jSONObject2.put("y", tVar.f22754b);
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            try {
                jSONObject.put("points", jSONArray);
                jSONObject.put("origin_width", bVar.f22363b);
                jSONObject.put("origin_height", bVar.f22364c);
            } catch (Exception unused2) {
            }
            this.f22394e = true;
            ((DoodleGiftApi) C3458e.m12798a().mo10440a(DoodleGiftApi.class)).sendDoodleGift(998, this.f22392c.getId(), jSONObject.toString(), this.f22391b).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19281a((C7326g<? super T>) new C8193q<Object>(this, bVar, SystemClock.uptimeMillis()), (C7326g<? super Throwable>) new C8194r<Object>(this), (C7323a) new C8195s(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21309a(long j, Throwable th) throws Exception {
        this.f22394e = false;
        if (mo9140c() != null) {
            ((C8188a) mo9140c()).mo21302d((Exception) th);
        }
        C8282s.m25315a(j, this.f22392c.getId(), th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21315b(long j, Throwable th) throws Exception {
        this.f22394e = false;
        if (mo9140c() != null) {
            ((C8188a) mo9140c()).mo21301c((Exception) th);
        }
        C8282s.m25324b(j, this.f22392c.getId(), th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo21317c(long j, Throwable th) throws Exception {
        this.f22394e = false;
        if (th instanceof Exception) {
            ((C8188a) mo9140c()).mo21293a((Exception) th);
        }
        C8282s.m25328c(j, this.f22392c.getId(), th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo21320d(long j, Throwable th) throws Exception {
        this.f22394e = false;
        if (mo9140c() != null) {
            ((C8188a) mo9140c()).mo21293a((Exception) th);
        }
        C8282s.m25315a(j, this.f22392c.getId(), th);
    }

    /* renamed from: d */
    private void m25061d(long j, int i) {
        long j2 = j;
        if (!this.f22394e && GiftManager.inst().findGiftById(j2) != null) {
            this.f22394e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            C7492s a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(j, this.f22392c.getId(), this.f22391b, i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
            long j3 = j2;
            C8196t tVar = new C8196t(this, j, uptimeMillis);
            a.mo19281a((C7326g<? super T>) tVar, (C7326g<? super Throwable>) new C8197u<Object>(this, j3), (C7323a) new C8199w(this));
        }
    }

    /* renamed from: a */
    private void m25055a(long j, int i) {
        if (!this.f22394e) {
            C8149d findGiftById = GiftManager.inst().findGiftById(j);
            if (findGiftById != null) {
                if (((IHostContext) C3596c.m13172a(IHostContext.class)).isLocalTest() || ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11156b((long) findGiftById.f22235f)) {
                    this.f22394e = true;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C7492s a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(j, this.f22392c.getId(), this.f22391b, i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                    long j2 = j;
                    C8149d dVar = findGiftById;
                    C8189m mVar = new C8189m(this, j2, uptimeMillis, dVar, i);
                    C8190n nVar = new C8190n(this, j2, dVar, i);
                    a.mo19281a((C7326g<? super T>) mVar, (C7326g<? super Throwable>) nVar, (C7323a) new C8198v(this));
                    return;
                }
                C9049ap.m27022a((int) R.string.fc7);
            }
        }
    }

    /* renamed from: b */
    private void m25059b(long j, int i) {
        long j2 = j;
        if (!this.f22394e) {
            C8149d findGiftById = GiftManager.inst().findGiftById(j2);
            if (findGiftById != null) {
                if (((IHostContext) C3596c.m13172a(IHostContext.class)).isLocalTest() || ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11158c(findGiftById.f22251v)) {
                    this.f22394e = true;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C7492s a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).sendGoldenGift(j, this.f22392c.getId(), this.f22391b, i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                    long j3 = j2;
                    C8259x xVar = new C8259x(this, j, uptimeMillis);
                    a.mo19281a((C7326g<? super T>) xVar, (C7326g<? super Throwable>) new C8260y<Object>(this, j3), (C7323a) new C8261z(this));
                    return;
                }
                C9049ap.m27022a((int) R.string.fc7);
            }
        }
    }

    /* renamed from: c */
    private void m25060c(long j, int i) {
        int i2;
        if (!this.f22394e) {
            Prop a = C8284u.m25332a().mo21433a(j);
            if (a != null) {
                if (a.count <= 0) {
                    C9049ap.m27022a((int) R.string.f0f);
                    if (mo9140c() != null) {
                        ((C8188a) mo9140c()).mo21284a();
                    }
                    return;
                }
                if (a.gift != null && a.gift.f22228G) {
                    if (a.count < 10) {
                        C9049ap.m27028a(C3390j.m12609a(C3358ac.m12515a((int) R.string.f3f), Integer.valueOf(10)));
                        return;
                    } else if (i < 10) {
                        i2 = 10;
                        this.f22390a = i2;
                        this.f22394e = true;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        C7492s a2 = ((PropApi) C3458e.m12798a().mo10440a(PropApi.class)).sendProp(j, this.f22392c.getId(), i2, this.f22391b, a.isAwemeFreeGift).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                        C8171aa aaVar = new C8171aa(this, j, uptimeMillis);
                        a2.mo19281a((C7326g<? super T>) aaVar, (C7326g<? super Throwable>) new C8172ab<Object>(this, j), (C7323a) new C8173ac(this));
                    }
                }
                i2 = i;
                this.f22390a = i2;
                this.f22394e = true;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                C7492s a22 = ((PropApi) C3458e.m12798a().mo10440a(PropApi.class)).sendProp(j, this.f22392c.getId(), i2, this.f22391b, a.isAwemeFreeGift).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                C8171aa aaVar2 = new C8171aa(this, j, uptimeMillis2);
                a22.mo19281a((C7326g<? super T>) aaVar2, (C7326g<? super Throwable>) new C8172ab<Object>(this, j), (C7323a) new C8173ac(this));
            }
        }
    }

    /* renamed from: a */
    private void m25056a(C8149d dVar, C8158m mVar) {
        if (this.f22392c != null && this.f22392c.isStar()) {
            if (dVar != null && dVar.f22228G) {
                C9097a.m27146a().mo22267a((Object) new C8292b(1, "cny_send_gift", new JSONObject()));
            }
            if (mVar != null && mVar.f22317u != null && mVar.f22317u.gift != null && mVar.f22317u.gift.f22228G) {
                C9097a.m27146a().mo22267a((Object) new C8292b(1, "cny_send_gift", new JSONObject()));
            }
        }
    }

    public C8186l(Room room, long j, String str) {
        this.f22392c = room;
        this.f22391b = j;
        this.f22393d = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo21319d(long j, long j2, C3479d dVar) throws Exception {
        m25057a((C8158m) dVar.data);
        C8282s.m25314a(j, this.f22392c.getId(), SystemClock.uptimeMillis() - j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21306a(long j, long j2, C3479d dVar) throws Exception {
        if (mo9140c() != null) {
            ((C8188a) mo9140c()).mo21297b((C8158m) dVar.data);
        }
        C8282s.m25314a(j, this.f22392c.getId(), SystemClock.uptimeMillis() - j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21314b(long j, long j2, C3479d dVar) throws Exception {
        if (mo9140c() != null) {
            ((C8188a) mo9140c()).mo21289a((C8159n) dVar.data);
        }
        C8282s.m25323b(j, this.f22392c.getId(), SystemClock.uptimeMillis() - j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo21316c(long j, long j2, C3479d dVar) throws Exception {
        C8158m mVar = (C8158m) dVar.data;
        long j3 = dVar.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop nowTimeDiff : mVar.f22311o) {
            nowTimeDiff.setNowTimeDiff((j3 - currentTimeMillis) / 1000);
        }
        m25057a(mVar);
        C8282s.m25327c(j, this.f22392c.getId(), SystemClock.uptimeMillis() - j2);
    }
}
