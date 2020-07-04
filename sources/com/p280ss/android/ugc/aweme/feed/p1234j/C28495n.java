package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.feed.api.FeedLiveRoomApi;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.LiveCnySetting;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.j.n */
public final class C28495n {

    /* renamed from: a */
    public static boolean f75112a;

    /* renamed from: b */
    public static final Map<String, Room> f75113b = new HashMap();

    /* renamed from: c */
    public static final Map<String, Boolean> f75114c = new HashMap();

    /* renamed from: d */
    private static final List<C28497a> f75115d = new ArrayList();

    /* renamed from: e */
    private static C12466b<C3477b<Room, Extra>> f75116e;

    /* renamed from: com.ss.android.ugc.aweme.feed.j.n$a */
    public interface C28497a {
        /* renamed from: a */
        void mo71715a();

        /* renamed from: a */
        void mo71716a(Room room);

        /* renamed from: b */
        void mo71717b();
    }

    /* renamed from: b */
    private static boolean m93653b() {
        IESSettingsProxy a = C30199h.m98861a();
        if (a == null) {
            return true;
        }
        try {
            LiveCnySetting liveCnySettings = a.getLiveCnySettings();
            if (!(liveCnySettings == null || liveCnySettings.getForceUpdateRoom() == null)) {
                return liveCnySettings.getForceUpdateRoom().booleanValue();
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: a */
    public static void m93646a() {
        if (f75112a && f75116e != null) {
            f75116e.cancel();
            f75112a = false;
            for (C28497a aVar : f75115d) {
                if (aVar != null) {
                    aVar.mo71717b();
                }
            }
            f75115d.clear();
        }
    }

    /* renamed from: a */
    private static Room m93644a(String str) {
        try {
            return (Room) C2317a.m9932a().mo15974a(str, Room.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m93647a(Room room) {
        for (C28497a aVar : f75115d) {
            if (aVar != null) {
                aVar.mo71716a(room);
            }
        }
        f75115d.clear();
    }

    /* renamed from: a */
    public static String m93645a(Aweme aweme) {
        if (!C25072c.m82577c(aweme) || aweme == null) {
            return "";
        }
        Room room = (Room) f75113b.get(aweme.getAid());
        if (room != null) {
            return String.valueOf(room.getId());
        }
        return "";
    }

    /* renamed from: b */
    public static String m93652b(Aweme aweme) {
        if (!C25072c.m82577c(aweme) || aweme == null) {
            return "";
        }
        Room room = (Room) f75113b.get(aweme.getAid());
        if (room != null) {
            return String.valueOf(room.getOwnerUserId());
        }
        LiveAwesomeData i = C25072c.m82583i(aweme);
        if (i == null) {
            return "";
        }
        if (i.useRoomInfo) {
            return "";
        }
        return String.valueOf(i.uid);
    }

    /* renamed from: a */
    public static void m93648a(Aweme aweme, C28497a aVar) {
        m93649a(aweme, aVar, true);
    }

    /* renamed from: a */
    public static void m93650a(Aweme aweme, boolean z) {
        for (C28497a aVar : f75115d) {
            if (aVar != null) {
                aVar.mo71715a();
            }
        }
        f75115d.clear();
        if (!z) {
            return;
        }
        if (C25072c.m82578d(aweme) || (C25072c.m82575a(aweme) && C25072c.m82579e(aweme))) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.c2o).mo25750a();
        }
    }

    /* renamed from: a */
    public static void m93649a(Aweme aweme, C28497a aVar, boolean z) {
        if (C25072c.m82577c(aweme)) {
            Room room = (Room) f75113b.get(aweme.getAid());
            if (room != null) {
                aVar.mo71716a(room);
                m93651a(aweme, true, z);
                return;
            }
            LiveAwesomeData i = C25072c.m82583i(aweme);
            if (i != null) {
                if (i.useRoomInfo) {
                    Room a = m93644a(i.roomData);
                    if (a != null) {
                        f75113b.put(aweme.getAid(), a);
                        aVar.mo71716a(a);
                        m93651a(aweme, true, z);
                        return;
                    }
                }
                f75115d.add(aVar);
                m93651a(aweme, false, z);
            }
        }
    }

    /* renamed from: a */
    private static void m93651a(final Aweme aweme, boolean z, final boolean z2) {
        Boolean bool = (Boolean) f75114c.get(aweme.getAid());
        if (!z || (m93653b() && (bool == null || !bool.booleanValue()))) {
            LiveAwesomeData i = C25072c.m82583i(aweme);
            if (i != null && !f75112a) {
                f75112a = true;
                C12466b<C3477b<Room, Extra>> a = FeedLiveRoomApi.m92746a(i.uid, i.secUid);
                f75116e = a;
                a.enqueue(new C12474e<C3477b<Room, Extra>>() {
                    /* renamed from: a */
                    public final void mo26464a(C12466b<C3477b<Room, Extra>> bVar, Throwable th) {
                        String str;
                        String str2;
                        C28495n.f75112a = false;
                        C28495n.m93650a(aweme, z2);
                        Aweme aweme = aweme;
                        String str3 = "ttlive_cny_getroom_all";
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = "request fail";
                        }
                        C28498o.m93665a(aweme, str3, false, str);
                        Aweme aweme2 = aweme;
                        String str4 = "ttlive_cny_getroom_error";
                        if (th != null) {
                            str2 = th.getMessage();
                        } else {
                            str2 = "request fail";
                        }
                        C28498o.m93665a(aweme2, str4, false, str2);
                    }

                    /* renamed from: a */
                    public final void mo26463a(C12466b<C3477b<Room, Extra>> bVar, C12534t<C3477b<Room, Extra>> tVar) {
                        String str;
                        C28495n.f75112a = false;
                        if (tVar == null || !tVar.mo30512c() || tVar.f33302b == null || ((C3477b) tVar.f33302b).data == null) {
                            C28495n.m93650a(aweme, z2);
                            if (tVar == null) {
                                str = "response is null";
                            } else if (tVar.mo30512c()) {
                                str = "Room data is null";
                            } else {
                                StringBuilder sb = new StringBuilder("response code:");
                                sb.append(tVar.mo30510a());
                                str = sb.toString();
                            }
                            C28498o.m93665a(aweme, "ttlive_cny_getroom_all", false, str);
                            C28498o.m93665a(aweme, "ttlive_cny_getroom_error", false, str);
                            return;
                        }
                        Room room = (Room) ((C3477b) tVar.f33302b).data;
                        room.init();
                        C28495n.f75113b.put(aweme.getAid(), room);
                        C28495n.f75114c.put(aweme.getAid(), Boolean.valueOf(true));
                        C28495n.m93647a(room);
                        C28498o.m93664a(aweme, "ttlive_cny_getroom_all", true);
                        C28498o.m93666a("ttlive_cny_room_info", (Object) room);
                    }
                });
            }
        }
    }
}
