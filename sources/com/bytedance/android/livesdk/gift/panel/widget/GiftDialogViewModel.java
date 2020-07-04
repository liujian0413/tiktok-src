package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.C8283t;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.GiftOperation;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.p391a.C8170c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8437i;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.log.p405b.C8441m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class GiftDialogViewModel extends C0063u {

    /* renamed from: A */
    public C0052o<Integer> f22439A;

    /* renamed from: B */
    public C0052o<C8158m> f22440B;

    /* renamed from: C */
    public C0052o<Boolean> f22441C;

    /* renamed from: D */
    public C0052o<String> f22442D;

    /* renamed from: E */
    public C0052o<List<GiftPage>> f22443E;

    /* renamed from: F */
    public C0052o<Integer> f22444F;

    /* renamed from: G */
    public C0052o<GiftOperation> f22445G;

    /* renamed from: H */
    public C0052o<Boolean> f22446H;

    /* renamed from: I */
    public LongSparseArray<Integer> f22447I;

    /* renamed from: J */
    private List<C0052o> f22448J;

    /* renamed from: K */
    private C8158m f22449K;

    /* renamed from: L */
    private boolean f22450L;

    /* renamed from: M */
    private int f22451M;

    /* renamed from: N */
    private C8203a f22452N;

    /* renamed from: a */
    public boolean f22453a;

    /* renamed from: b */
    public boolean f22454b = true;

    /* renamed from: c */
    public SendToType f22455c = SendToType.ANCHOR;

    /* renamed from: d */
    public int f22456d = 1;

    /* renamed from: e */
    public Room f22457e;

    /* renamed from: f */
    public User f22458f;

    /* renamed from: g */
    public PanelType f22459g;

    /* renamed from: h */
    public boolean f22460h;

    /* renamed from: i */
    public C0052o<PanelType> f22461i;

    /* renamed from: j */
    public C0052o<Boolean> f22462j;

    /* renamed from: k */
    public C0052o<Boolean> f22463k;

    /* renamed from: l */
    public C0052o<User> f22464l;

    /* renamed from: m */
    public C0052o<Boolean> f22465m;

    /* renamed from: n */
    public C0052o<Boolean> f22466n;

    /* renamed from: o */
    public C0052o<C8170c> f22467o;

    /* renamed from: p */
    public C0052o<Boolean> f22468p;

    /* renamed from: q */
    public C0052o<Boolean> f22469q;

    /* renamed from: r */
    public C0052o<C8134a> f22470r;

    /* renamed from: s */
    public C0052o<C8169b> f22471s;

    /* renamed from: t */
    public C0052o<Boolean> f22472t;

    /* renamed from: u */
    public C0052o<PanelType> f22473u;

    /* renamed from: v */
    public C0052o<Integer> f22474v;

    /* renamed from: w */
    public C0052o<Integer> f22475w;

    /* renamed from: x */
    public C0052o<Boolean> f22476x;

    /* renamed from: y */
    public C0052o<MonetaryType> f22477y;

    /* renamed from: z */
    public C0052o<Long> f22478z;

    public enum MonetaryType {
        DIAMOND,
        GOLDEN_BEAN
    }

    public enum SendGiftType {
        NORMAL,
        GIFT,
        DOODLE_GIFT,
        PROP,
        TASK_GIFT,
        GIFT_AD
    }

    public enum SendToType {
        ANCHOR,
        GUEST,
        OFFICIAL_GUEST
    }

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$a */
    interface C8203a {
        /* renamed from: a */
        int mo21347a(long j);
    }

    /* renamed from: b */
    public final void mo21343b() {
        this.f22451M++;
    }

    /* renamed from: a */
    public final int mo21335a() {
        if (this.f22456d > 0) {
            return this.f22456d;
        }
        return 1;
    }

    /* renamed from: e */
    static void m25111e() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
        C8443c.m25663a().mo21606a("knapsack_tab_click", hashMap, Room.class, new C8438j());
    }

    /* renamed from: g */
    private JSONObject m25112g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("UID", ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
        jSONObject.put("room_id", this.f22457e.getId());
        jSONObject.put("source", this.f22457e.getUserFrom());
        jSONObject.put("request_id", this.f22457e.getRequestId());
        jSONObject.put("log_pb", this.f22457e.getLog_pb());
        if (!TextUtils.isEmpty(this.f22457e.getSourceType())) {
            jSONObject.put("moment_room_source", this.f22457e.getSourceType());
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo21346f() {
        long j;
        HashMap hashMap = new HashMap();
        String str = "room_id";
        long j2 = 0;
        if (this.f22457e != null) {
            j = this.f22457e.getId();
        } else {
            j = 0;
        }
        hashMap.put(str, String.valueOf(j));
        String str2 = "anchor_id";
        if (this.f22457e != null) {
            j2 = this.f22457e.getOwnerUserId();
        }
        hashMap.put(str2, String.valueOf(j2));
        C8443c.m25663a().mo21606a("monkey_game_rank_click", hashMap, Room.class, new C8438j());
    }

    /* renamed from: d */
    public final void mo21345d() {
        String str;
        if (this.f22451M > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("source", String.valueOf(this.f22457e.getUserFrom()));
            hashMap.put("request_id", this.f22457e.getRequestId());
            hashMap.put("log_pb", this.f22457e.getLog_pb());
            if (this.f22470r.getValue() == null) {
                hashMap.put("gift_id", "-1");
            } else {
                hashMap.put("gift_id", String.valueOf(((C8134a) this.f22470r.getValue()).mo21275p()));
            }
            hashMap.put("gift_cnt", String.valueOf(this.f22451M));
            C8443c a = C8443c.m25663a();
            String str2 = "send_pop_gift";
            Object[] objArr = new Object[2];
            C8438j jVar = new C8438j();
            if (this.f22453a) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[0] = jVar.mo21598a(str).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
            objArr[1] = Room.class;
            a.mo21606a(str2, hashMap, objArr);
            this.f22451M = 0;
        }
    }

    public GiftDialogViewModel() {
        ((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo10240a()).intValue();
        this.f22450L = false;
        this.f22451M = 0;
        this.f22447I = new LongSparseArray<>();
        this.f22452N = new C8203a() {
            /* renamed from: a */
            public final int mo21347a(long j) {
                return ((Integer) GiftDialogViewModel.this.f22447I.get(j, Integer.valueOf(-1))).intValue();
            }
        };
        this.f22461i = new C0052o<>();
        this.f22462j = new C0052o<>();
        this.f22463k = new C0052o<>();
        this.f22464l = new C0052o<>();
        this.f22465m = new C0052o<>();
        this.f22466n = new C0052o<>();
        this.f22467o = new C0052o<>();
        this.f22468p = new C0052o<>();
        this.f22469q = new C0052o<>();
        this.f22470r = new C0052o<>();
        this.f22471s = new C0052o<>();
        this.f22472t = new C0052o<>();
        this.f22473u = new C0052o<>();
        this.f22474v = new C0052o<>();
        this.f22475w = new C0052o<>();
        this.f22476x = new C0052o<>();
        this.f22477y = new C0052o<>();
        this.f22478z = new C0052o<>();
        this.f22439A = new C0052o<>();
        this.f22440B = new C0052o<>();
        this.f22441C = new C0052o<>();
        this.f22442D = new C0052o<>();
        this.f22443E = new C0052o<>();
        this.f22444F = new C0052o<>();
        this.f22445G = new C0052o<>();
        this.f22446H = new C0052o<>();
        this.f22448J = new ArrayList();
        this.f22448J.add(this.f22461i);
        this.f22448J.add(this.f22462j);
        this.f22448J.add(this.f22463k);
        this.f22448J.add(this.f22464l);
        this.f22448J.add(this.f22465m);
        this.f22448J.add(this.f22466n);
        this.f22448J.add(this.f22467o);
        this.f22448J.add(this.f22468p);
        this.f22448J.add(this.f22469q);
        this.f22448J.add(this.f22470r);
        this.f22448J.add(this.f22471s);
        this.f22448J.add(this.f22472t);
        this.f22448J.add(this.f22473u);
        this.f22448J.add(this.f22474v);
        this.f22448J.add(this.f22475w);
        this.f22448J.add(this.f22476x);
        this.f22448J.add(this.f22477y);
        this.f22448J.add(this.f22478z);
        this.f22448J.add(this.f22470r);
        this.f22448J.add(this.f22439A);
        this.f22448J.add(this.f22440B);
        this.f22448J.add(this.f22441C);
        this.f22448J.add(this.f22442D);
        this.f22448J.add(this.f22443E);
        this.f22448J.add(this.f22444F);
        this.f22448J.add(this.f22445G);
        this.f22448J.add(this.f22446H);
    }

    /* renamed from: c */
    public final void mo21344c() {
        int i;
        int i2;
        int i3;
        long j;
        String str;
        int i4;
        int i5;
        int i6;
        String str2;
        if (this.f22449K != null && this.f22449K.f22301e != -1 && this.f22449K.f22304h > 0) {
            C8149d findGiftById = GiftManager.inst().findGiftById(this.f22449K.f22301e);
            if (findGiftById != null) {
                if (this.f22450L || !(findGiftById.f22234e == 2 || findGiftById.f22234e == 8)) {
                    if (this.f22449K.f22308l > 0) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        Long valueOf = Long.valueOf(this.f22449K.f22308l);
                        if (findGiftById.f22234e == 2) {
                            i4 = 1;
                        } else {
                            i4 = this.f22449K.f22304h;
                        }
                        hashMap2.put(valueOf, Integer.valueOf(i4));
                        hashMap.put("prop_info", C7895a.m24190a(hashMap2));
                        String str3 = "gift_cnt";
                        if (findGiftById.f22234e == 2) {
                            i5 = 1;
                        } else {
                            i5 = this.f22449K.f22304h;
                        }
                        hashMap.put(str3, String.valueOf(i5));
                        if (findGiftById.f22234e == 2) {
                            i6 = 1;
                        } else {
                            i6 = this.f22449K.f22304h;
                        }
                        hashMap.put("money", String.valueOf(i6 * findGiftById.f22235f));
                        if (!(this.f22458f == null || this.f22458f.getId() == this.f22457e.getOwnerUserId())) {
                            hashMap.put("to_user_id", String.valueOf(this.f22458f.getId()));
                        }
                        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
                        C8443c a = C8443c.m25663a();
                        String str4 = "send_prop";
                        Object[] objArr = new Object[5];
                        C8438j jVar = new C8438j();
                        if (this.f22453a) {
                            str2 = "live_take_detail";
                        } else {
                            str2 = "live_detail";
                        }
                        objArr[0] = jVar.mo21598a(str2).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
                        objArr[1] = Room.class;
                        objArr[2] = C8163o.m24997a(this.f22449K);
                        objArr[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
                        objArr[4] = new C8439k();
                        a.mo21606a(str4, hashMap, objArr);
                    } else {
                        int a2 = this.f22452N.mo21347a(this.f22449K.f22301e);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("gift_position", String.valueOf(a2));
                        if (!TextUtils.isEmpty(this.f22449K.f22320x)) {
                            hashMap3.put("request_page", this.f22449K.f22320x);
                        }
                        HashMap hashMap4 = new HashMap();
                        Long valueOf2 = Long.valueOf(this.f22449K.f22301e);
                        if (findGiftById.f22234e == 2) {
                            i = 1;
                        } else {
                            i = this.f22449K.f22304h;
                        }
                        hashMap4.put(valueOf2, Integer.valueOf(i));
                        hashMap3.put("gift_info", C7895a.m24190a(hashMap4));
                        String str5 = "gift_cnt";
                        if (findGiftById.f22234e == 2) {
                            i2 = 1;
                        } else {
                            i2 = this.f22449K.f22304h;
                        }
                        hashMap3.put(str5, String.valueOf(i2));
                        if (findGiftById.f22234e == 2) {
                            i3 = 1;
                        } else {
                            i3 = this.f22449K.f22304h;
                        }
                        hashMap3.put("money", String.valueOf(i3 * findGiftById.f22235f));
                        if (!(this.f22458f == null || this.f22458f.getId() == this.f22457e.getOwnerUserId())) {
                            hashMap3.put("to_user_id", String.valueOf(this.f22458f.getId()));
                        }
                        hashMap3.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
                        hashMap3.put("growth_deepevent", "1");
                        String str6 = "to_user_id";
                        if (this.f22458f != null) {
                            j = this.f22458f.getId();
                        } else {
                            j = this.f22457e.getOwnerUserId();
                        }
                        hashMap3.put(str6, String.valueOf(j));
                        if (findGiftById.f22234e == 10) {
                            hashMap3.put("gift_type", "coin_gift");
                        }
                        if (!(this.f22458f == null || this.f22457e == null || this.f22458f.getId() == this.f22457e.getOwnerUserId())) {
                            this.f22449K.f22318v = C8437i.f23078b;
                        }
                        C8443c a3 = C8443c.m25663a();
                        String str7 = "send_gift";
                        Object[] objArr2 = new Object[4];
                        C8438j jVar2 = new C8438j();
                        if (this.f22453a) {
                            str = "live_take_detail";
                        } else {
                            str = "live_detail";
                        }
                        objArr2[0] = jVar2.mo21598a(str).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
                        objArr2[1] = Room.class;
                        objArr2[2] = C8163o.m24997a(this.f22449K);
                        objArr2[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
                        a3.mo21606a(str7, hashMap3, objArr2);
                    }
                    this.f22449K = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo21336a(long j) {
        return this.f22452N.mo21347a(j);
    }

    /* renamed from: a */
    public final void mo21338a(C0043i iVar) {
        for (C0052o removeObservers : this.f22448J) {
            removeObservers.removeObservers(iVar);
        }
    }

    /* renamed from: a */
    public final void mo21337a(int i) {
        this.f22470r.getValue();
        HashMap hashMap = new HashMap();
        hashMap.put("cards_left", String.valueOf(i));
        hashMap.put("room_id", String.valueOf(this.f22457e.getId()));
        C8443c.m25663a().mo21606a("popular_card_click", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public final void mo21339a(C8158m mVar) {
        if (!(this.f22449K == null || (this.f22449K.f22301e == mVar.f22301e && this.f22449K.f22302f == mVar.f22302f && this.f22449K.f22308l == mVar.f22308l))) {
            mo21344c();
        }
        this.f22449K = mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21340a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f22457e.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f22457e.getOwnerUserId()));
        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
        if ("grey_prop".equals(str)) {
            C8443c.m25663a().mo21606a("grep_prop_click", hashMap, Room.class, new C8438j());
        } else if ("more_prop".equals(str)) {
            C8443c.m25663a().mo21606a("more_prop_click", hashMap, Room.class, new C8438j());
        }
        hashMap.put("request_page", str);
        C8443c.m25663a().mo21606a("task_show", hashMap, Room.class, new C8438j());
    }

    /* renamed from: a */
    public final boolean mo21342a(C8134a aVar) {
        if (this.f22449K == null) {
            return false;
        }
        if (aVar instanceof C8141h) {
            if (this.f22449K.f22308l != aVar.mo21275p()) {
                return true;
            }
            return false;
        } else if (this.f22449K.f22301e != aVar.mo21275p()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo21341a(String str, int i, long j, C8169b bVar) {
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        String str5;
        C8169b bVar2 = bVar;
        if (SendToType.GUEST == this.f22455c) {
            str2 = "guest_tuya_gift";
        } else {
            str2 = "tuya_gift";
        }
        String str6 = str2;
        HashSet hashSet = new HashSet();
        try {
            C8170c cVar = (C8170c) this.f22467o.getValue();
            JSONObject g = m25112g();
            if (cVar.f22366a == SendGiftType.DOODLE_GIFT) {
                i2 = 0;
                for (C8283t tVar : cVar.f22370e.f22362a) {
                    hashSet.add(Long.valueOf(tVar.f22755c));
                    i2 += tVar.f22756d;
                }
                g.put("gift_id", hashSet);
            } else {
                i2 = 0;
            }
            if (this.f22455c == SendToType.GUEST) {
                g.put("UID", this.f22458f.getId());
            }
            g.put("enter_from", str);
            String str7 = "event_page";
            if (this.f22453a) {
                str3 = "live_take_detail";
            } else {
                str3 = "live_detail";
            }
            g.put(str7, str3);
            HashMap hashMap = new HashMap();
            long j2 = 0;
            if (j != 0) {
                hashMap.put("team_id", String.valueOf(j));
                String str8 = "top_anchor_id";
                if (this.f22458f == null) {
                    str5 = "";
                } else {
                    str5 = this.f22458f.getIdStr();
                }
                hashMap.put(str8, str5);
            }
            hashMap.put("request_id", this.f22457e.getRequestId());
            hashMap.put("log_pb", this.f22457e.getLog_pb());
            hashMap.put("gift_cnt", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            if (bVar2 == null || C6311g.m19573a(bVar2.f22362a)) {
                hashMap2.put(Long.valueOf(998), Integer.valueOf(1));
            } else {
                for (C8283t tVar2 : bVar2.f22362a) {
                    if (!hashMap2.containsKey(Long.valueOf(tVar2.f22755c))) {
                        hashMap2.put(Long.valueOf(tVar2.f22755c), Integer.valueOf(1));
                    } else {
                        hashMap2.put(Long.valueOf(tVar2.f22755c), Integer.valueOf(((Integer) hashMap2.get(Long.valueOf(tVar2.f22755c))).intValue() + 1));
                    }
                }
            }
            hashMap.put("gift_info", C7895a.m24190a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
            hashMap.put("growth_deepevent", "1");
            C8443c a = C8443c.m25663a();
            String str9 = "send_gift";
            Object[] objArr = new Object[4];
            String obj = hashSet.toString();
            if (this.f22455c == SendToType.GUEST) {
                i3 = C8437i.f23078b;
            } else {
                i3 = C8437i.f23077a;
            }
            if (this.f22458f != null) {
                j2 = this.f22458f.getId();
            }
            C8441m mVar = new C8441m(str6, obj, i2, i3, j2);
            objArr[0] = mVar;
            C8438j jVar = new C8438j();
            if (this.f22453a) {
                str4 = "live_take_detail";
            } else {
                str4 = "live_detail";
            }
            objArr[1] = jVar.mo21598a(str4).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
            objArr[2] = Room.class;
            objArr[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
            a.mo21606a(str9, hashMap, objArr);
        } catch (Exception e) {
            C3166a.m11966e("GiftDialogViewModel", e.toString());
        }
    }
}
