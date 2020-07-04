package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.gift.C3435e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.p210c.C4298a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8263r.C8264a;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.C8284u.C8285a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.dialog.C7897b;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8151f;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8136c;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.bytedance.android.livesdk.gift.model.p390a.C8140g;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.gift.model.p390a.C8142i;
import com.bytedance.android.livesdk.gift.p371a.C7863d;
import com.bytedance.android.livesdk.p393h.C8292b;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class GiftViewModel extends C0063u {

    /* renamed from: a */
    public final C0052o<C7939b> f21466a = new C0052o<>();

    /* renamed from: b */
    public final C7939b f21467b = new C7939b();

    /* renamed from: c */
    protected Room f21468c;

    /* renamed from: d */
    protected boolean f21469d;

    /* renamed from: e */
    protected boolean f21470e;

    /* renamed from: f */
    public User f21471f;

    /* renamed from: g */
    public String f21472g;

    /* renamed from: h */
    public C8264a f21473h;

    /* renamed from: i */
    private final C7940c f21474i = new C7940c();

    /* renamed from: j */
    private final C47562b f21475j = new C47562b();

    /* renamed from: k */
    private final Map<GiftPage, LongSparseArray<Integer>> f21476k = new HashMap();

    /* renamed from: l */
    private Map<GiftPage, List<C8135b>> f21477l = new HashMap();

    /* renamed from: m */
    private DataCenter f21478m;

    /* renamed from: n */
    private boolean f21479n;

    /* renamed from: o */
    private int f21480o;

    /* renamed from: p */
    private int f21481p;

    /* renamed from: q */
    private C8158m f21482q;

    /* renamed from: r */
    private LongSparseArray<String> f21483r = new LongSparseArray<>();

    /* renamed from: s */
    private LongSparseArray<String> f21484s = new LongSparseArray<>();

    /* renamed from: t */
    private WeakReference<Context> f21485t;

    /* renamed from: u */
    private C8986g<IUser> f21486u = new C8986g<IUser>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(IUser iUser) {
            super.onNext(iUser);
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
            GiftViewModel.this.f21466a.postValue(GiftViewModel.this.f21467b);
            GiftViewModel.this.mo20794c();
        }
    };

    /* renamed from: v */
    private C8285a f21487v = new C8285a() {
        /* renamed from: a */
        public final void mo20799a() {
        }

        /* renamed from: a */
        public final void mo20800a(List<Prop> list) {
            GiftViewModel.this.mo20790a(list);
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo20797f() throws Exception {
        this.f21479n = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo20798g() throws Exception {
        this.f21479n = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20789a(Long l) throws Exception {
        this.f21467b.f21501i = l.longValue();
        this.f21466a.postValue(this.f21467b);
    }

    /* renamed from: a */
    public final void mo20785a(Context context) {
        this.f21485t = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo20784a(C0043i iVar, C0053p<C7939b> pVar) {
        this.f21466a.observe(iVar, pVar);
    }

    /* renamed from: a */
    public final void mo20783a(C0043i iVar) {
        this.f21466a.removeObservers(iVar);
    }

    /* renamed from: a */
    public final void mo20788a(DataCenter dataCenter) {
        this.f21478m = dataCenter;
        if (this.f21478m != null) {
            this.f21468c = (Room) this.f21478m.get("data_room", null);
            this.f21469d = ((Boolean) this.f21478m.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            this.f21470e = ((Boolean) this.f21478m.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20792a(com.bytedance.android.livesdk.gift.dialog.viewmodel.C7938a r3) {
        /*
            r2 = this;
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r0 = r2.f21467b
            com.bytedance.android.livesdk.gift.dialog.viewmodel.C7940c.m24372a(r0, r3)
            int r3 = r3.f21491a
            r0 = 0
            r1 = 1
            switch(r3) {
                case 2: goto L_0x005e;
                case 3: goto L_0x005a;
                case 4: goto L_0x0056;
                case 5: goto L_0x004f;
                case 6: goto L_0x004b;
                case 7: goto L_0x002d;
                case 8: goto L_0x0027;
                case 9: goto L_0x0023;
                case 10: goto L_0x000c;
                case 11: goto L_0x001d;
                case 12: goto L_0x0019;
                case 13: goto L_0x0015;
                case 14: goto L_0x0011;
                case 15: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0061
        L_0x000d:
            r2.mo20794c()
            goto L_0x0061
        L_0x0011:
            r2.m24331p()
            goto L_0x0061
        L_0x0015:
            r2.m24335t()
            goto L_0x0061
        L_0x0019:
            r2.m24330o()
            goto L_0x0061
        L_0x001d:
            r3 = 1001(0x3e9, float:1.403E-42)
            r2.m24310a(r3)
            goto L_0x0061
        L_0x0023:
            m24329n()
            goto L_0x0061
        L_0x0027:
            java.lang.String r3 = "click"
            r2.m24316a(r3)
            goto L_0x0061
        L_0x002d:
            boolean r3 = r2.f21479n
            if (r3 == 0) goto L_0x0040
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r3 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_NEW_COMBO_STYLE
            java.lang.Object r3 = r3.mo10240a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0040
            return r1
        L_0x0040:
            boolean r3 = r2.m24328m()
            if (r3 == 0) goto L_0x0062
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r3 = r2.f21467b
            r3.f21502j = r0
            goto L_0x0061
        L_0x004b:
            r2.m24332q()
            goto L_0x0061
        L_0x004f:
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r3 = r2.f21467b
            r0 = 0
            r3.mo20801a(r0)
            goto L_0x0061
        L_0x0056:
            r2.m24325j()
            goto L_0x0061
        L_0x005a:
            r2.m24326k()
            goto L_0x0061
        L_0x005e:
            r2.m24324i()
        L_0x0061:
            r0 = 1
        L_0x0062:
            android.arch.lifecycle.o<com.bytedance.android.livesdk.gift.dialog.viewmodel.b> r3 = r2.f21466a
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r1 = r2.f21467b
            r3.postValue(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.mo20792a(com.bytedance.android.livesdk.gift.dialog.viewmodel.a):boolean");
    }

    /* renamed from: a */
    public final void mo20790a(List<Prop> list) {
        if (!C6311g.m19573a(list)) {
            ArrayList arrayList = new ArrayList();
            for (Prop hVar : list) {
                arrayList.add(new C8141h(hVar));
            }
            this.f21467b.mo20806b(arrayList);
            this.f21466a.postValue(this.f21467b);
        }
    }

    /* renamed from: a */
    public final void mo20791a(List<GiftPage> list, boolean z) {
        this.f21467b.mo20808c(GiftManager.inst().getGroupCountInfo());
        if (!C6311g.m19573a(list)) {
            boolean z2 = false;
            if (this.f21478m != null && ((Boolean) this.f21478m.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
                z2 = true;
            }
            for (GiftPage giftPage : list) {
                GiftManager.filterNotSupportGift(giftPage.gifts, z2);
                GiftManager.filterNotDisplayedOnPanel(giftPage.gifts);
                if (giftPage.pageType != 5) {
                    ArrayList arrayList = new ArrayList();
                    for (C8149d dVar : giftPage.gifts) {
                        if (dVar.f22222A == 2) {
                            C9357a aVar = new C9357a();
                            aVar.f25628f = dVar.f22223B;
                            aVar.f25625c = dVar.f22231b;
                            aVar.f25629g = dVar.f22230a;
                            arrayList.add(new C8136c(aVar));
                        } else if (dVar.f22234e != 5) {
                            if (dVar.f22234e == 3) {
                                arrayList.add(new C8142i(dVar));
                            } else if (dVar.f22234e == 9) {
                                arrayList.add(new C8140g(dVar));
                            } else {
                                arrayList.add(new C8139f(dVar));
                            }
                        }
                    }
                    this.f21477l.put(giftPage, arrayList);
                    m24327l();
                }
            }
            this.f21467b.mo20803a(list);
            this.f21467b.f21497e = this.f21477l;
            this.f21466a.postValue(this.f21467b);
        }
    }

    /* renamed from: a */
    private boolean m24320a(C8149d dVar, int i, int i2, boolean z) {
        boolean z2 = false;
        if (dVar == null) {
            return false;
        }
        if (((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11156b((long) dVar.f22235f) || ((IHostContext) C3596c.m13172a(IHostContext.class)).isLocalTest()) {
            int i3 = dVar.f22234e;
            if (!(i3 == 5 || i3 == 10)) {
                z2 = m24319a(dVar, i2);
            }
            if (z) {
                mo20792a(new C7938a(1, null));
            }
            return z2;
        }
        String str = "";
        switch (i) {
            case 1:
                str = "gift";
                break;
            case 2:
                str = "fans_club_gift";
                break;
            case 3:
                str = "honor_level_gift";
                break;
        }
        m24316a(str);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24318a(com.bytedance.android.livesdk.gift.model.Prop r20, int r21, boolean r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r0 = 0
            if (r8 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r1 = r8.count
            if (r1 > 0) goto L_0x0013
            r1 = 2131828435(0x7f111ed3, float:1.928981E38)
            com.bytedance.android.livesdk.utils.C9049ap.m27022a(r1)
            return r0
        L_0x0013:
            com.bytedance.android.livesdk.gift.model.d r1 = r8.gift
            r2 = 10
            r9 = 1
            if (r1 == 0) goto L_0x0042
            com.bytedance.android.livesdk.gift.model.d r1 = r8.gift
            boolean r1 = r1.f22228G
            if (r1 == 0) goto L_0x0042
            int r1 = r8.count
            if (r1 >= r2) goto L_0x003b
            r1 = 2131828548(0x7f111f44, float:1.929004E38)
            java.lang.String r1 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r1)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r0] = r2
            java.lang.String r1 = com.bytedance.android.live.core.utils.C3390j.m12609a(r1, r3)
            com.bytedance.android.livesdk.utils.C9049ap.m27028a(r1)
            return r0
        L_0x003b:
            r0 = r21
            if (r0 >= r2) goto L_0x0044
            r15 = 10
            goto L_0x0045
        L_0x0042:
            r0 = r21
        L_0x0044:
            r15 = r0
        L_0x0045:
            r7.f21480o = r15
            r7.f21479n = r9
            long r5 = android.os.SystemClock.uptimeMillis()
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f21478m
            r3 = 0
            if (r0 == 0) goto L_0x005d
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f21478m
            java.lang.String r1 = "data_room"
            java.lang.Object r0 = r0.get(r1, r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            goto L_0x005e
        L_0x005d:
            r0 = r3
        L_0x005e:
            r1 = 0
            if (r0 == 0) goto L_0x0068
            long r10 = r0.getId()
            r13 = r10
            goto L_0x0069
        L_0x0068:
            r13 = r1
        L_0x0069:
            io.reactivex.b.b r4 = r7.f21475j
            com.bytedance.android.live.network.e r0 = com.bytedance.android.live.network.C3458e.m12798a()
            java.lang.Class<com.bytedance.android.livesdk.gift.domain.api.PropApi> r10 = com.bytedance.android.livesdk.gift.domain.api.PropApi.class
            java.lang.Object r0 = r0.mo10440a(r10)
            r10 = r0
            com.bytedance.android.livesdk.gift.domain.api.PropApi r10 = (com.bytedance.android.livesdk.gift.domain.api.PropApi) r10
            long r11 = r8.f22201id
            com.bytedance.android.live.base.model.user.User r0 = r7.f21471f
            if (r0 == 0) goto L_0x0087
            com.bytedance.android.live.base.model.user.User r0 = r7.f21471f
            long r0 = r0.getId()
            r16 = r0
            goto L_0x0089
        L_0x0087:
            r16 = r1
        L_0x0089:
            int r0 = r8.isAwemeFreeGift
            r1 = r13
            r18 = r0
            io.reactivex.s r0 = r10.sendProp(r11, r13, r15, r16, r18)
            com.bytedance.android.live.core.rxutils.f r10 = com.bytedance.android.live.core.rxutils.C3303k.m12366a()
            io.reactivex.s r10 = r0.mo19293a(r10)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.i r11 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.i
            r0 = r11
            r12 = r1
            r1 = r19
            r2 = r20
            r15 = r3
            r14 = r4
            r3 = r12
            r0.<init>(r1, r2, r3, r5)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.j r0 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.j
            r0.<init>(r7, r8, r12)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.k r1 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.k
            r1.<init>(r7)
            io.reactivex.b.c r0 = r10.mo19281a(r11, r0, r1)
            r14.mo119661a(r0)
            if (r22 == 0) goto L_0x00c3
            com.bytedance.android.livesdk.gift.dialog.viewmodel.a r0 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.a
            r0.<init>(r9, r15)
            r7.mo20792a(r0)
        L_0x00c3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.m24318a(com.bytedance.android.livesdk.gift.model.Prop, int, boolean):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20786a(Prop prop, long j, long j2, C3479d dVar) throws Exception {
        C3479d dVar2 = dVar;
        C8158m mVar = (C8158m) dVar2.data;
        long j3 = dVar2.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop nowTimeDiff : mVar.f22311o) {
            nowTimeDiff.setNowTimeDiff((j3 - currentTimeMillis) / 1000);
        }
        this.f21479n = false;
        m24313a(mVar);
        C8282s.m25327c(prop.f22201id, j, SystemClock.uptimeMillis() - j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20787a(Prop prop, long j, Throwable th) throws Exception {
        this.f21479n = false;
        if (th instanceof Exception) {
            m24315a((Exception) th);
        }
        C8282s.m25328c(prop.f22201id, j, th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24319a(com.bytedance.android.livesdk.gift.model.C8149d r21, int r22) {
        /*
            r20 = this;
            r11 = r20
            r12 = r21
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostContext> r0 = com.bytedance.android.livesdkapi.host.IHostContext.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.livesdkapi.host.IHostContext r0 = (com.bytedance.android.livesdkapi.host.IHostContext) r0
            boolean r0 = r0.isLocalTest()
            r1 = 0
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.c r0 = r0.walletCenter()
            int r2 = r12.f22235f
            long r2 = (long) r2
            boolean r0 = r0.mo11156b(r2)
            if (r0 != 0) goto L_0x002f
            r0 = 2131828916(0x7f1120b4, float:1.9290786E38)
            com.bytedance.android.livesdk.utils.C9049ap.m27022a(r0)
            return r1
        L_0x002f:
            if (r12 != 0) goto L_0x0032
            return r1
        L_0x0032:
            android.content.Context r0 = r20.m24323h()
            if (r0 != 0) goto L_0x0039
            return r1
        L_0x0039:
            boolean r2 = r12.f22226E
            r13 = 1
            if (r2 == 0) goto L_0x009a
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Boolean> r2 = com.bytedance.android.livesdk.sharedpref.C8946b.f24436bH
            java.lang.Object r2 = r2.mo22117a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x007a
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Boolean> r2 = com.bytedance.android.livesdk.sharedpref.C8946b.f24436bH
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            r2.mo22118a(r3)
            com.bytedance.android.live.core.setting.l<java.lang.String> r2 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.PORTAL_INTRODUCTION_URI     // Catch:{ Throwable -> 0x006d }
            java.lang.Object r2 = r2.mo10240a()     // Catch:{ Throwable -> 0x006d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x006d }
            java.lang.Class<com.bytedance.android.livesdk.schema.interfaces.a> r3 = com.bytedance.android.livesdk.schema.interfaces.C8931a.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.utility.C3596c.m13172a(r3)     // Catch:{ Throwable -> 0x006d }
            com.bytedance.android.livesdk.schema.interfaces.a r3 = (com.bytedance.android.livesdk.schema.interfaces.C8931a) r3     // Catch:{ Throwable -> 0x006d }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Throwable -> 0x006d }
            r3.handle(r0, r2)     // Catch:{ Throwable -> 0x006d }
            goto L_0x0094
        L_0x006d:
            r0 = move-exception
            com.bytedance.android.livesdk.log.C8444d.m25673b()
            r2 = 5
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.bytedance.android.livesdk.log.C8444d.m11969a(r2, r0)
            goto L_0x0094
        L_0x007a:
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r11.f21478m
            java.lang.String r3 = "data_allow_send_portal_gift"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)
            java.lang.Object r2 = r2.get(r3, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0096
            r2 = 2131828827(0x7f11205b, float:1.9290606E38)
            com.bytedance.android.live.uikit.p176d.C3517a.m12960a(r0, r2)
        L_0x0094:
            r0 = 0
            goto L_0x0097
        L_0x0096:
            r0 = 1
        L_0x0097:
            if (r0 != 0) goto L_0x009a
            return r1
        L_0x009a:
            long r14 = r12.f22233d
            r11.f21479n = r13
            long r16 = android.os.SystemClock.uptimeMillis()
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r11.f21478m
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r11.f21478m
            java.lang.String r2 = "data_room"
            java.lang.Object r0 = r0.get(r2, r1)
            r1 = r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        L_0x00b2:
            r2 = 0
            if (r1 == 0) goto L_0x00bd
            long r0 = r1.getId()
            r18 = r0
            goto L_0x00bf
        L_0x00bd:
            r18 = r2
        L_0x00bf:
            io.reactivex.b.b r0 = r11.f21475j
            com.bytedance.android.live.network.e r1 = com.bytedance.android.live.network.C3458e.m12798a()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi> r4 = com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi.class
            java.lang.Object r1 = r1.mo10440a(r4)
            com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi r1 = (com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi) r1
            com.bytedance.android.live.base.model.user.User r4 = r11.f21471f
            if (r4 == 0) goto L_0x00d7
            com.bytedance.android.live.base.model.user.User r2 = r11.f21471f
            long r2 = r2.getId()
        L_0x00d7:
            r7 = r2
            r2 = r1
            r3 = r14
            r5 = r18
            r9 = r22
            io.reactivex.s r1 = r2.send(r3, r5, r7, r9)
            com.bytedance.android.live.core.rxutils.f r2 = com.bytedance.android.live.core.rxutils.C3303k.m12366a()
            io.reactivex.s r10 = r1.mo19293a(r2)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.l r9 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.l
            r1 = r9
            r2 = r20
            r7 = r16
            r13 = r9
            r9 = r21
            r12 = r10
            r10 = r22
            r1.<init>(r2, r3, r5, r7, r9, r10)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.m r9 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.m
            r1 = r9
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r5, r7, r8)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.n r1 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.n
            r1.<init>(r11)
            io.reactivex.b.c r1 = r12.mo19281a(r13, r9, r1)
            r0.mo119661a(r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.m24319a(com.bytedance.android.livesdk.gift.model.d, int):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20781a(long j, long j2, long j3, C8149d dVar, int i, C3479d dVar2) throws Exception {
        C8149d dVar3 = dVar;
        m24313a((C8158m) dVar2.data);
        C8282s.m25314a(j, j2, SystemClock.uptimeMillis() - j3);
        if (dVar3 != null && dVar3.f22228G) {
            C8282s.m25312a(j, j2, i, "gift_panel", SystemClock.uptimeMillis() - j3);
        }
        this.f21479n = false;
        this.f21466a.postValue(this.f21467b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20782a(long j, long j2, C8149d dVar, int i, Throwable th) throws Exception {
        m24315a((Exception) th);
        C8282s.m25315a(j, j2, th);
        if (dVar != null && dVar.f22228G) {
            C8282s.m25313a(j, j2, i, "gift_panel", th);
        }
        this.f21479n = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20780a(long j) {
        this.f21467b.f21500h = j;
        this.f21466a.postValue(this.f21467b);
    }

    /* renamed from: t */
    private void m24335t() {
        m24333r();
        m24336u();
    }

    /* renamed from: h */
    private Context m24323h() {
        if (this.f21485t != null) {
            return (Context) this.f21485t.get();
        }
        return null;
    }

    /* renamed from: n */
    private static void m24329n() {
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo20796e() {
        mo20792a(new C7938a(1, null));
    }

    /* renamed from: i */
    private void m24324i() {
        if (GiftManager.inst().isGiftListLoaded()) {
            mo20791a(GiftManager.inst().getGiftPageList(), false);
        }
    }

    /* renamed from: u */
    private void m24336u() {
        if (this.f21482q != null) {
            C7897b.m24198a(this.f21482q, this.f21471f, this.f21469d, this.f21468c, this.f21481p);
        }
        this.f21482q = null;
    }

    /* renamed from: b */
    public final boolean mo20793b() {
        if (this.f21478m == null) {
            return true;
        }
        return ((Boolean) this.f21478m.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
    }

    /* renamed from: d */
    public final void mo20795d() {
        this.f21467b.mo20801a((C8135b) null);
        this.f21467b.f21498f = 1;
        this.f21467b.f21504l = false;
        this.f21467b.f21502j = false;
    }

    public void onCleared() {
        super.onCleared();
        if (!this.f21475j.isDisposed()) {
            this.f21475j.dispose();
        }
        C8284u.m25332a().mo21439b(this.f21487v);
    }

    /* renamed from: j */
    private void m24325j() {
        long j;
        Room room = null;
        if (this.f21478m != null) {
            room = (Room) this.f21478m.get("data_room", null);
        }
        C8284u a = C8284u.m25332a();
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        a.mo21438b(j);
    }

    /* renamed from: o */
    private void m24330o() {
        long j;
        if (this.f21467b.f21494b != null) {
            j = this.f21467b.f21494b.mo21275p();
        } else {
            j = 0;
        }
        C9097a.m27146a().mo22267a((Object) new C7863d(j, this.f21471f, this.f21472g));
    }

    /* renamed from: s */
    private void m24334s() {
        boolean z;
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo10240a()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LongSparseArray<String> longSparseArray = (LongSparseArray) C8946b.f24443bO.mo22117a();
            if (longSparseArray != null) {
                this.f21483r = longSparseArray;
            }
            LongSparseArray<String> longSparseArray2 = (LongSparseArray) C8946b.f24444bP.mo22117a();
            if (longSparseArray2 != null) {
                this.f21484s = longSparseArray2;
            }
        }
    }

    /* renamed from: a */
    public final int mo20779a() {
        return this.f21467b.mo20809d();
    }

    /* renamed from: c */
    public final void mo20794c() {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            this.f21467b.f21500h = 0;
            this.f21466a.postValue(this.f21467b);
            return;
        }
        GiftManager.inst().syncXgCoin(new C7944g(this));
    }

    /* renamed from: k */
    private void m24326k() {
        boolean z;
        Room room = null;
        if (this.f21478m != null) {
            room = (Room) this.f21478m.get("data_room", null);
        }
        if (this.f21478m == null || !((Boolean) this.f21478m.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (room != null) {
            GiftManager.inst().syncGiftList(new C3435e() {
                /* renamed from: a */
                public final void mo8799a(List<C8149d> list) {
                }

                /* renamed from: b */
                public final void mo8800b(List<GiftPage> list) {
                    GiftViewModel.this.mo20791a(list, true);
                }
            }, room.getId(), 3, z);
        }
    }

    /* renamed from: l */
    private void m24327l() {
        Set<GiftPage> keySet = this.f21477l.keySet();
        this.f21476k.clear();
        for (GiftPage giftPage : keySet) {
            List list = (List) this.f21477l.get(giftPage);
            if (!C6311g.m19573a(list)) {
                LongSparseArray longSparseArray = new LongSparseArray();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C8135b bVar = (C8135b) list.get(i);
                    if (bVar.f22206d instanceof C8149d) {
                        longSparseArray.append(bVar.mo21275p(), Integer.valueOf(i + 1));
                    }
                }
                this.f21476k.put(giftPage, longSparseArray);
            }
        }
    }

    /* renamed from: q */
    private void m24332q() {
        C8135b bVar = this.f21467b.f21494b;
        if (bVar != null) {
            if (bVar.f22206d instanceof C8149d) {
                C8149d dVar = (C8149d) bVar.f22206d;
                LongSparseArray longSparseArray = null;
                Iterator it = this.f21476k.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    GiftPage giftPage = (GiftPage) it.next();
                    if (giftPage.pageType == this.f21467b.f21498f) {
                        longSparseArray = (LongSparseArray) this.f21476k.get(giftPage);
                        break;
                    }
                }
                m24336u();
                if (longSparseArray == null || longSparseArray.get(dVar.f22233d) == null) {
                    this.f21481p = -1;
                } else {
                    this.f21481p = ((Integer) longSparseArray.get(dVar.f22233d)).intValue();
                }
            }
            m24311a(bVar);
            m24333r();
        }
    }

    public GiftViewModel() {
        this.f21475j.mo119662a(C9097a.m27146a().mo22266a(C8296e.class).mo19325f(C7941d.f21506a), ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19280a((C7326g<? super T>) new C7942e<Object>(this), C7945h.f21510a));
        C8284u.m25332a().mo21435a(this.f21487v);
        this.f21466a.postValue(this.f21467b);
        m24334s();
    }

    /* renamed from: m */
    private boolean m24328m() {
        Context h = m24323h();
        if (h == null) {
            return false;
        }
        if (this.f21479n && !((Boolean) LiveConfigSettingKeys.LIVE_NEW_COMBO_STYLE.mo10240a()).booleanValue()) {
            return false;
        }
        if (!C7952o.m24376a(h)) {
            C3517a.m12960a(h, (int) R.string.efp);
            return false;
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            m24310a(1001);
            return false;
        } else if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.GIFT)) {
            return false;
        } else {
            if (((IHostContext) C3596c.m13172a(IHostContext.class)).isNeedProtectUnderage()) {
                C9049ap.m27022a((int) R.string.f0i);
                return false;
            }
            C8135b bVar = this.f21467b.f21494b;
            GiftPage c = this.f21467b.mo20807c();
            if (bVar == null || c == null) {
                return false;
            }
            int d = this.f21467b.mo20809d();
            if ((bVar instanceof C8134a) && (bVar.f22206d instanceof C8149d)) {
                return m24320a((C8149d) bVar.f22206d, c.pageType, d, ((C8134a) bVar).mo21264e());
            } else if (!(bVar instanceof C8141h) || !(bVar.f22206d instanceof Prop)) {
                return false;
            } else {
                C8141h hVar = (C8141h) bVar;
                this.f21480o = d;
                return m24318a((Prop) bVar.f22206d, this.f21480o, hVar.mo21264e());
            }
        }
    }

    /* renamed from: p */
    private void m24331p() {
        long j;
        long j2;
        Room room = (Room) this.f21478m.get("data_room", null);
        C8135b bVar = this.f21467b.f21494b;
        if ((bVar instanceof C8141h) && (bVar.f22206d instanceof Prop)) {
            Prop prop = (Prop) bVar.f22206d;
            if (prop.propType == 4) {
                C8141h hVar = (C8141h) bVar;
                if (((Prop) hVar.f22206d).banner != null) {
                    HashMap hashMap = new HashMap();
                    if (((Prop) hVar.f22206d).count <= 0) {
                        hashMap.put("has_popularity_card", Boolean.valueOf(false));
                        ((Prop) hVar.f22206d).banner.f25626d = 306;
                    } else {
                        hashMap.put("has_popularity_card", Boolean.valueOf(true));
                        ((Prop) hVar.f22206d).banner.f25626d = 373;
                    }
                    ((Prop) hVar.f22206d).banner.f25627e = 280;
                    ((Prop) hVar.f22206d).banner.f25630h = 3;
                    hashMap.put("count", Integer.valueOf(1));
                    String str = "room_id";
                    long j3 = 0;
                    if (room != null) {
                        j = room.getId();
                    } else {
                        j = 0;
                    }
                    hashMap.put(str, Long.valueOf(j));
                    hashMap.put("prop_def_id", Long.valueOf(hVar.mo21275p()));
                    String str2 = "to_uid";
                    if (room != null) {
                        j2 = room.getOwnerUserId();
                    } else {
                        j2 = 0;
                    }
                    hashMap.put(str2, Long.valueOf(j2));
                    hashMap.put("is_aweme_free_gift", Integer.valueOf(0));
                    hashMap.put("describe", hVar.mo21271l());
                    hashMap.put("next_expire", Long.valueOf(((Prop) hVar.f22206d).nextExpire));
                    if (m24323h() != null) {
                        C4298a.m14477a(m24323h(), ((Prop) hVar.f22206d).banner, hashMap);
                    }
                    int i = prop.count;
                    if (room != null) {
                        j3 = room.getId();
                    }
                    C7897b.m24197a(i, j3);
                }
            }
        }
    }

    /* renamed from: r */
    private void m24333r() {
        if (this.f21478m != null) {
            Room room = (Room) this.f21478m.get("data_room", null);
            User user = (User) this.f21478m.get("data_user_in_room", null);
            boolean z = false;
            if (!((Boolean) this.f21478m.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
                this.f21467b.f21502j = false;
            } else if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo10240a()).intValue() & 4) != 4) {
                this.f21467b.f21502j = false;
            } else {
                C8135b bVar = this.f21467b.f21494b;
                if (room == null || room.getOwner() == null || bVar == null) {
                    this.f21467b.f21502j = false;
                    return;
                }
                if (bVar.f22206d instanceof C8149d) {
                    C8149d dVar = (C8149d) bVar.f22206d;
                    boolean z2 = dVar.f22238i;
                    if (!z2) {
                        this.f21467b.f21502j = false;
                        return;
                    } else if (dVar.mo21281d()) {
                        z = GiftManager.inst().canSendNobleGift(user, dVar);
                    } else if (dVar.mo21280c()) {
                        z = GiftManager.inst().canSendHonorGift(user, dVar);
                    } else if (dVar.f22253x) {
                        z = GiftManager.inst().canSendFansClubGift(room.getOwner(), user, dVar);
                    } else {
                        z = z2;
                    }
                }
                this.f21467b.f21502j = z;
            }
        }
    }

    /* renamed from: a */
    private void m24315a(Exception exc) {
        if (this.f21473h != null) {
            this.f21473h.mo13796a(exc, new C7943f(this));
        }
    }

    /* renamed from: a */
    private void m24310a(int i) {
        Context h = m24323h();
        if (h != null) {
            ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(h, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f68)).mo22188a(i).mo22193d("live_detail").mo22194e("gift_send").mo22192c("enableGift").mo22190a()).mo19189a((C7498y<? super T>) this.f21486u);
        }
    }

    /* renamed from: b */
    private void m24321b(C8158m mVar) {
        boolean z;
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo10240a()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (mVar != null && z) {
            if (mVar.f22308l > 0) {
                this.f21484s.append(mVar.f22308l, String.valueOf(mVar.f22302f));
                C8946b.f24444bP.mo22118a(this.f21484s);
                return;
            }
            this.f21483r.append(mVar.f22301e, String.valueOf(mVar.f22302f));
            C8946b.f24443bO.mo22118a(this.f21483r);
        }
    }

    /* renamed from: a */
    private void m24311a(C8135b bVar) {
        String str;
        C8151f fVar;
        int i;
        if (bVar != null) {
            C8151f fVar2 = this.f21467b.f21499g;
            if (fVar2 != null) {
                fVar2.f22263c = false;
            }
            if (bVar.f22206d instanceof C8149d) {
                str = (String) this.f21483r.get(((C8149d) bVar.f22206d).f22233d);
            } else if (bVar.f22206d instanceof Prop) {
                str = (String) this.f21484s.get(((Prop) bVar.f22206d).f22201id);
            } else {
                return;
            }
            List<C8151f> list = this.f21467b.f21496d;
            if (list.size() > 0) {
                fVar = (C8151f) list.get(0);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8151f fVar3 = (C8151f) it.next();
                    if (fVar3 != null && fVar3.f22261a == i) {
                        fVar2 = fVar3;
                        break;
                    }
                }
                if (i == 0) {
                    fVar2 = fVar;
                }
                if (fVar2 != null) {
                    fVar2.f22263c = true;
                    this.f21467b.mo20802a(fVar2);
                }
            }
        }
    }

    /* renamed from: b */
    private void m24322b(String str) {
        FragmentActivity fragmentActivity;
        Context h = m24323h();
        if (h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f21469d);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str);
            if (((IWalletService) C3596c.m13172a(IWalletService.class)).getRechargeType() != 3) {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog(fragmentActivity, bundle, this.f21478m, null);
            } else {
                ((IWalletService) C3596c.m13172a(IWalletService.class)).showRechargeDialog(fragmentActivity, bundle, this.f21478m, null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24313a(com.bytedance.android.livesdk.gift.model.C8158m r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r12.f22310n
            r1 = 2
            if (r0 != r1) goto L_0x0009
            return
        L_0x0009:
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            long r1 = r12.f22301e
            com.bytedance.android.livesdk.gift.model.d r0 = r0.findGiftById(r1)
            int r1 = r0.f22234e
            r2 = 10
            if (r1 != r2) goto L_0x002b
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r1 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.C3596c.m13172a(r1)
            com.bytedance.android.live.wallet.IWalletService r1 = (com.bytedance.android.live.wallet.IWalletService) r1
            com.bytedance.android.live.wallet.c r1 = r1.walletCenter()
            int r2 = r12.f22315s
            r1.mo11153a(r2)
            goto L_0x003c
        L_0x002b:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r1 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.C3596c.m13172a(r1)
            com.bytedance.android.live.wallet.IWalletService r1 = (com.bytedance.android.live.wallet.IWalletService) r1
            com.bytedance.android.live.wallet.c r1 = r1.walletCenter()
            long r2 = r12.f22299c
            r1.mo11154a(r2)
        L_0x003c:
            long r1 = r12.f22308l
            r3 = 0
            r5 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a8
            com.bytedance.android.livesdk.gift.u r1 = com.bytedance.android.livesdk.gift.C8284u.m25332a()
            long r6 = r12.f22308l
            com.bytedance.android.livesdk.gift.model.Prop r1 = r1.mo21433a(r6)
            r12.f22317u = r1
            com.bytedance.android.livesdk.gift.model.Prop r1 = r12.f22317u
            if (r1 == 0) goto L_0x00a8
            com.bytedance.android.livesdk.gift.model.Prop r1 = r12.f22317u
            com.bytedance.android.livesdk.gift.model.d r1 = r1.gift
            long r1 = r1.f22233d
            r12.f22301e = r1
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r1 = r12.f22311o
            boolean r1 = com.bytedance.common.utility.C6311g.m19573a(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0082
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r1 = r12.f22311o
            java.util.Iterator r1 = r1.iterator()
        L_0x006c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0082
            java.lang.Object r6 = r1.next()
            com.bytedance.android.livesdk.gift.model.Prop r6 = (com.bytedance.android.livesdk.gift.model.Prop) r6
            long r6 = r6.f22201id
            long r8 = r12.f22308l
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x006c
            r1 = 0
            goto L_0x0083
        L_0x0082:
            r1 = 1
        L_0x0083:
            if (r1 == 0) goto L_0x00a8
            com.bytedance.android.livesdk.gift.model.Prop r1 = r12.f22317u
            com.bytedance.android.livesdk.gift.model.Prop r1 = com.bytedance.android.livesdk.gift.model.Prop.newInstance(r1)
            int r6 = r1.count
            int r7 = r11.f21480o
            int r6 = r6 - r7
            r1.count = r6
            int r6 = r1.count
            if (r6 >= 0) goto L_0x0098
            r1.count = r2
        L_0x0098:
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r2 = r12.f22311o
            if (r2 != 0) goto L_0x00a3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r12.f22311o = r2
        L_0x00a3:
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r2 = r12.f22311o
            r2.add(r1)
        L_0x00a8:
            com.bytedance.android.livesdk.gift.r$a r1 = r11.f21473h
            if (r1 == 0) goto L_0x00b7
            com.bytedance.android.livesdk.gift.r$a r1 = r11.f21473h
            int r2 = r11.f21481p
            boolean r1 = r1.mo13795a(r12, r2, r5)
            if (r1 != 0) goto L_0x00b7
            return
        L_0x00b7:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r11.f21478m
            r2 = 0
            if (r1 == 0) goto L_0x00c7
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r11.f21478m
            java.lang.String r6 = "data_room"
            java.lang.Object r1 = r1.get(r6, r2)
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
            goto L_0x00c8
        L_0x00c7:
            r1 = r2
        L_0x00c8:
            if (r1 == 0) goto L_0x00ce
            long r3 = r1.getId()
        L_0x00ce:
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r1 = r12.f22311o
            if (r1 == 0) goto L_0x00e3
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r1 = r12.f22311o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00e3
            com.bytedance.android.livesdk.gift.u r1 = com.bytedance.android.livesdk.gift.C8284u.m25332a()
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r6 = r12.f22311o
            r1.mo21437a(r6)
        L_0x00e3:
            java.lang.Class<com.bytedance.android.live.user.a> r1 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.C3596c.m13172a(r1)
            com.bytedance.android.live.user.a r1 = (com.bytedance.android.live.user.C3592a) r1
            com.bytedance.android.livesdk.user.e r1 = r1.user()
            r1.mo22177a(r5)
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r11.f21478m
            if (r1 == 0) goto L_0x0101
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r11.f21478m
            java.lang.String r5 = "data_message_manager"
            java.lang.Object r1 = r1.get(r5, r2)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r1 = (com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager) r1
            goto L_0x0102
        L_0x0101:
            r1 = r2
        L_0x0102:
            com.bytedance.ies.sdk.widgets.DataCenter r5 = r11.f21478m
            if (r5 == 0) goto L_0x0110
            com.bytedance.ies.sdk.widgets.DataCenter r5 = r11.f21478m
            java.lang.String r6 = "data_user_in_room"
            java.lang.Object r2 = r5.get(r6, r2)
            com.bytedance.android.live.base.model.user.User r2 = (com.bytedance.android.live.base.model.user.User) r2
        L_0x0110:
            com.bytedance.android.live.base.model.user.User r5 = r11.f21471f
            java.util.List r5 = com.bytedance.android.livesdk.gift.C8163o.m25002b(r3, r12, r5, r2)
            if (r1 == 0) goto L_0x013c
            boolean r6 = com.bytedance.common.utility.C6311g.m19573a(r5)
            if (r6 == 0) goto L_0x0128
            com.bytedance.android.live.base.model.user.User r5 = r11.f21471f
            com.bytedance.android.livesdk.message.model.ao r2 = com.bytedance.android.livesdk.gift.C8163o.m24999a(r3, r12, r5, r2)
            r1.insertMessage(r2)
            goto L_0x013c
        L_0x0128:
            java.util.Iterator r2 = r5.iterator()
        L_0x012c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x013c
            java.lang.Object r3 = r2.next()
            com.bytedance.android.livesdk.message.model.ao r3 = (com.bytedance.android.livesdk.message.model.C8489ao) r3
            r1.insertMessage(r3)
            goto L_0x012c
        L_0x013c:
            r11.m24321b(r12)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r1 = r11.f21467b
            r1.f21503k = r12
            r11.f21482q = r12
            android.arch.lifecycle.o<com.bytedance.android.livesdk.gift.dialog.viewmodel.b> r1 = r11.f21466a
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r2 = r11.f21467b
            r1.postValue(r2)
            r11.m24312a(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.m24313a(com.bytedance.android.livesdk.gift.model.m):void");
    }

    /* renamed from: a */
    private void m24316a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                m24310a(1002);
            } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.RECHARGE)) {
                if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo10240a()).intValue() == 1) {
                    m24322b(str);
                } else {
                    Context h = m24323h();
                    if (h instanceof Activity) {
                        ((IWalletService) C3596c.m13172a(IWalletService.class)).openWallet((Activity) h);
                    }
                }
                this.f21467b.f21504l = true;
            }
        }
    }

    /* renamed from: a */
    private void m24312a(C8149d dVar, C8158m mVar) {
        if (this.f21468c != null && this.f21468c.isStar()) {
            if (dVar != null && dVar.f22228G) {
                C9097a.m27146a().mo22267a((Object) new C8292b(1, "cny_send_gift", new JSONObject()));
            }
            if (mVar != null && mVar.f22317u != null && mVar.f22317u.gift != null && mVar.f22317u.gift.f22228G) {
                C9097a.m27146a().mo22267a((Object) new C8292b(1, "cny_send_gift", new JSONObject()));
            }
        }
    }
}
