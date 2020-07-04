package com.bytedance.android.livesdk.gift.dialog;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.p374d.C7895a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.b */
public final class C7897b {
    /* renamed from: a */
    public static void m24203a(String str, Room room) {
        String valueOf = ((C3592a) C3596c.m13172a(C3592a.class)).user() != null ? String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) : "";
        HashMap hashMap = new HashMap();
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("orientation", String.valueOf(room.getOrientation()));
        }
        hashMap.put("user_id", valueOf);
        C8443c.m25663a().mo21606a(str, hashMap, new C8438j(), Room.class);
    }

    /* renamed from: a */
    public static void m24202a(String str) {
        String valueOf = ((C3592a) C3596c.m13172a(C3592a.class)).user() != null ? String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) : "";
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", valueOf);
        hashMap.put("type", "gift");
        C8443c.m25663a().mo21606a(str, hashMap, new C8438j(), Room.class);
    }

    /* renamed from: a */
    public static void m24195a() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
        C8443c.m25663a().mo21606a("livesdk_doodling_gift_canvas_show", hashMap, Room.class, new C8438j());
    }

    /* renamed from: b */
    public static void m24204b() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
        C8443c.m25663a().mo21606a("livesdk_doodling_gift_click", hashMap, Room.class, new C8438j());
    }

    /* renamed from: a */
    public static void m24196a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cards_left", String.valueOf(i));
        C8443c.m25663a().mo21606a("popular_card_show", hashMap, Room.class);
    }

    /* renamed from: a */
    public static void m24197a(int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("cards_left", String.valueOf(i));
        hashMap.put("room_id", String.valueOf(j));
        C8443c.m25663a().mo21606a("popular_card_click", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public static void m24201a(Room room, C8149d dVar) {
        if (dVar != null) {
            HashMap hashMap = new HashMap();
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
            }
            hashMap.put("gift_id", String.valueOf(dVar.f22233d));
            hashMap.put("money", String.valueOf(dVar.f22235f));
            C8443c.m25663a().mo21606a("gift_preview", hashMap, new C8438j(), Room.class);
        }
    }

    /* renamed from: a */
    public static void m24199a(Room room, int i, int i2) {
        HashMap hashMap = new HashMap();
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
        }
        hashMap.put("page", String.valueOf(i));
        hashMap.put("pageType", String.valueOf(i2));
        C8443c.m25663a().mo21606a("gift_pages_show", hashMap, new C8438j(), Room.class);
    }

    /* renamed from: a */
    public static void m24200a(Room room, C8135b bVar, int i) {
        String str;
        HashMap hashMap = new HashMap();
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
        }
        String str2 = "";
        long j = 0;
        if (bVar != null) {
            if (bVar.f22206d instanceof C8149d) {
                str = "gift";
                j = ((C8149d) bVar.f22206d).f22233d;
            } else if (bVar.f22206d instanceof Prop) {
                str = "prop";
                j = ((Prop) bVar.f22206d).f22201id;
            }
            hashMap.put("type", str);
            hashMap.put("id", String.valueOf(j));
            hashMap.put("group_cnt", String.valueOf(i));
            C8443c.m25663a().mo21606a("group_cnt_click", hashMap, Room.class, new C8438j());
        }
        str = str2;
        hashMap.put("type", str);
        hashMap.put("id", String.valueOf(j));
        hashMap.put("group_cnt", String.valueOf(i));
        C8443c.m25663a().mo21606a("group_cnt_click", hashMap, Room.class, new C8438j());
    }

    /* renamed from: a */
    public static void m24198a(C8158m mVar, User user, boolean z, Room room, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        String str;
        int i5;
        int i6;
        int i7;
        String str2;
        C8158m mVar2 = mVar;
        if (mVar2 != null && mVar2.f22301e != -1 && mVar2.f22304h > 0) {
            C8149d findGiftById = GiftManager.inst().findGiftById(mVar2.f22301e);
            if (findGiftById != null && findGiftById.f22234e != 2 && findGiftById.f22234e != 8) {
                if (mVar2.f22308l > 0) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Long valueOf = Long.valueOf(mVar2.f22308l);
                    if (findGiftById.f22234e == 2) {
                        i5 = 1;
                    } else {
                        i5 = mVar2.f22304h;
                    }
                    hashMap2.put(valueOf, Integer.valueOf(i5));
                    hashMap.put("prop_info", C7895a.m24190a(hashMap2));
                    String str3 = "gift_cnt";
                    if (findGiftById.f22234e == 2) {
                        i6 = 1;
                    } else {
                        i6 = mVar2.f22304h;
                    }
                    hashMap.put(str3, String.valueOf(i6));
                    if (findGiftById.f22234e == 2) {
                        i7 = 1;
                    } else {
                        i7 = mVar2.f22304h;
                    }
                    hashMap.put("money", String.valueOf(i7 * findGiftById.f22235f));
                    if (!(user == null || user.getId() == room.getOwnerUserId())) {
                        hashMap.put("to_user_id", String.valueOf(user.getId()));
                    }
                    C8443c a = C8443c.m25663a();
                    String str4 = "send_prop";
                    Object[] objArr = new Object[5];
                    C8438j jVar = new C8438j();
                    if (z) {
                        str2 = "live_take_detail";
                    } else {
                        str2 = "live_detail";
                    }
                    objArr[0] = jVar.mo21598a(str2).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
                    objArr[1] = Room.class;
                    objArr[2] = C8163o.m24997a(mVar);
                    objArr[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
                    objArr[4] = new C8439k();
                    a.mo21606a(str4, hashMap, objArr);
                    return;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("gift_position", String.valueOf(i));
                if (!TextUtils.isEmpty(mVar2.f22320x)) {
                    hashMap3.put("request_page", mVar2.f22320x);
                }
                HashMap hashMap4 = new HashMap();
                Long valueOf2 = Long.valueOf(mVar2.f22301e);
                if (findGiftById.f22234e == 2) {
                    i2 = 1;
                } else {
                    i2 = mVar2.f22304h;
                }
                hashMap4.put(valueOf2, Integer.valueOf(i2));
                hashMap3.put("gift_info", C7895a.m24190a(hashMap4));
                String str5 = "gift_cnt";
                if (findGiftById.f22234e == 2) {
                    i3 = 1;
                } else {
                    i3 = mVar2.f22304h;
                }
                hashMap3.put(str5, String.valueOf(i3));
                if (findGiftById.f22234e == 2) {
                    i4 = 1;
                } else {
                    i4 = mVar2.f22304h;
                }
                hashMap3.put("money", String.valueOf(i4 * findGiftById.f22235f));
                if (!(user == null || user.getId() == room.getOwnerUserId())) {
                    hashMap3.put("to_user_id", String.valueOf(user.getId()));
                }
                hashMap3.put("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
                hashMap3.put("growth_deepevent", "1");
                String str6 = "to_user_id";
                if (user != null) {
                    j = user.getId();
                } else {
                    j = room.getOwnerUserId();
                }
                hashMap3.put(str6, String.valueOf(j));
                if (findGiftById.f22234e == 10) {
                    hashMap3.put("gift_type", "coin_gift");
                }
                C8443c a2 = C8443c.m25663a();
                String str7 = "send_gift";
                Object[] objArr2 = new Object[4];
                C8438j jVar2 = new C8438j();
                if (z) {
                    str = "live_take_detail";
                } else {
                    str = "live_detail";
                }
                objArr2[0] = jVar2.mo21598a(str).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
                objArr2[1] = Room.class;
                objArr2[2] = C8163o.m24997a(mVar);
                objArr2[3] = ((C3440a) C3596c.m13172a(C3440a.class)).getLinkCrossRoomLog();
                a2.mo21606a(str7, hashMap3, objArr2);
            }
        }
    }
}
