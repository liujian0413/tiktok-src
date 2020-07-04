package com.bytedance.android.livesdk.chatroom.utils;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.j */
public final class C5352j {

    /* renamed from: a */
    private static boolean f15624a;

    /* renamed from: b */
    private static int f15625b;

    /* renamed from: a */
    public static boolean m17073a(Map<String, String> map) {
        int i;
        if (f15624a) {
            return true;
        }
        f15624a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = null;
        if (!(C9469i.m27993e() == null || C9469i.m27993e().mo14577q() == null)) {
            Map a = C9469i.m27993e().mo14577q().mo23191a(-1);
            if (a == null) {
                f15624a = false;
                return false;
            }
            if (a.get("feed_url") instanceof String) {
                str = (String) a.get("feed_url");
            }
            if (a.get("feed_style") instanceof Integer) {
                Integer num = (Integer) a.get("feed_style");
                if (num != null) {
                    i = num.intValue();
                    if (!C6319n.m19593a(str) || i != 3) {
                        f15624a = false;
                        return false;
                    }
                    ((FeedApi) C9178j.m27302j().mo22373b().mo10440a(FeedApi.class)).feed(str, 0, "enter_auto_feed_draw_refresh", 0, -1, -1).mo19317d(C5353k.f15626a).mo19316d(C5354l.f15627a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5355m<Object>(str, elapsedRealtime, map), C5356n.f15631a);
                    f15625b++;
                    return true;
                }
            }
        }
        i = 0;
        if (!C6319n.m19593a(str)) {
        }
        f15624a = false;
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ void m17069a(String str, long j, Map map, Pair pair) throws Exception {
        f15624a = false;
        if (pair == null || C6311g.m19573a((List) pair.first) || ((List) pair.first).get(0) == null) {
            C9049ap.m27022a((int) R.string.ejb);
            return;
        }
        Bundle a = m17064a((List) pair.first, (C2344a) pair.second, str, j, map);
        m17066a(j, a);
        TTLiveSDKContext.getHostService().mo22366g().mo23270a(C9469i.m27993e().mo14561a().context(), ((FeedItem) ((List) pair.first).get(0)).item.getId(), a);
    }

    /* renamed from: a */
    private static void m17071a(List<FeedItem> list) {
        if (!C6311g.m19573a(list)) {
            for (FeedItem feedItem : list) {
                if (feedItem != null && feedItem.item == null) {
                    try {
                        feedItem.item = feedItem.getRoom();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m17072a() {
        if (f15625b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ void m17070a(Throwable th) throws Exception {
        f15624a = false;
        C9049ap.m27022a((int) R.string.ejb);
        C3166a.m11963b("NewFeedStyleEntranceUtils", th);
    }

    /* renamed from: a */
    static final /* synthetic */ Pair m17065a(C3474a aVar) throws Exception {
        ArrayList<FeedItem> arrayList = new ArrayList<>(aVar.f10296b);
        m17071a((List<FeedItem>) arrayList);
        if (!C6311g.m19573a(arrayList)) {
            for (FeedItem a : arrayList) {
                m17068a(a);
            }
        }
        return Pair.create(arrayList, aVar.f10297c);
    }

    /* renamed from: a */
    static final /* synthetic */ void m17067a(Pair pair) throws Exception {
        if (pair != null && !C6311g.m19573a((List) pair.first) && pair.second != null) {
            for (FeedItem feedItem : (List) pair.first) {
                if (!(feedItem == null || ((C2344a) pair.second).mo8249a() == null)) {
                    feedItem.logPb = ((C2344a) pair.second).mo8249a().toString();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m17068a(FeedItem feedItem) {
        if (feedItem == null) {
            return;
        }
        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
            Room room = (Room) feedItem.item;
            room.setLog_pb(feedItem.logPb);
            if (room.getOwner() != null) {
                room.getOwner().setLogPb(feedItem.logPb);
            }
            room.setRequestId(feedItem.resId);
        }
    }

    /* renamed from: a */
    private static Bundle m17063a(FeedItem feedItem, C2344a aVar) {
        String str = null;
        if (feedItem == null || feedItem.item == null || !(feedItem.item instanceof Room)) {
            return null;
        }
        Bundle a = C9412a.m27916a((Room) feedItem.item);
        if (aVar != null) {
            try {
                a.putString("live.intent.extra.LOG_PB", String.valueOf(aVar.mo8249a()));
                a.putString("log_pb", String.valueOf(aVar.mo8249a()));
                if (TextUtils.isEmpty(aVar.f7700g) && !TextUtils.isEmpty(String.valueOf(aVar.mo8249a()))) {
                    aVar.f7700g = new JSONObject(aVar.mo8249a().toString()).getString("impr_id");
                }
                a.putString("live.intent.extra.REQUEST_ID", aVar.f7700g);
                a.putString("request_id", aVar.f7700g);
                String str2 = "enter_from_merge_recommend";
                if (feedItem.isRecommendCard) {
                    str = "pop_card";
                }
                a.putString(str2, str);
            } catch (Exception e) {
                C3166a.m11963b("NewFeedStyleEntranceUtils", (Throwable) e);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static void m17066a(long j, Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (j > 0 && bundle != null) {
            hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - j));
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("anchor_id", String.valueOf(bundle.getLong("anchor_id", 0)));
            hashMap.put("room_id", String.valueOf(bundle.getLong("live.intent.extra.ROOM_ID", 0)));
            hashMap.put("request_id", bundle.getString("live.intent.extra.REQUEST_ID", ""));
            hashMap.put("action_type", "click");
            hashMap.put("live_window_mode", "full_screen");
            hashMap.put("log_pb", bundle.getString("live.intent.extra.LOG_PB", ""));
            C8443c.m25663a().mo21606a("livesdk_new_style_feed_duration", hashMap, new Object[0]);
        }
    }

    /* renamed from: a */
    private static Bundle m17064a(List<FeedItem> list, C2344a aVar, String str, long j, Map<String, String> map) {
        Bundle bundle;
        FeedItem feedItem = (FeedItem) list.get(0);
        boolean z = ((FeedItem) list.get(0)).isRecommendCard;
        String str2 = null;
        if (feedItem == null || feedItem.item == null || !(feedItem.item instanceof Room)) {
            bundle = null;
        } else {
            bundle = m17063a(feedItem, aVar);
        }
        if (bundle == null) {
            return new Bundle();
        }
        bundle.putString("live.intent.extra.FEED_URL", str);
        bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
        bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
        bundle.putLong("live.intent.extra.LOAD_DURATION", j);
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        String str3 = "enter_from_merge_recommend";
        if (z) {
            str2 = "pop_card";
        }
        bundle.putString(str3, str2);
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        if (map != null && map.containsKey("enter_from_merge")) {
            bundle2.putString("enter_from_merge", (String) map.get("enter_from_merge"));
            map.remove("enter_from_merge");
        }
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
        SparseArray sparseArray = new SparseArray(list.size());
        int size = list.size();
        for (int i = 1; i < size; i++) {
            Bundle a = m17063a((FeedItem) list.get(i), aVar);
            if (a != null) {
                sparseArray.put(i, a);
            }
        }
        bundle.putSparseParcelableArray("live.intent.extra.MORE_BUNDLE", sparseArray);
        if (aVar != null) {
            bundle.putBoolean("live.intent.extra.HAS_MORE", aVar.hasMore);
            bundle.putLong("live.intent.extra.MAX_TIME", aVar.f7698e);
            bundle.putString("live.intent.extra.UNREAD_ID", aVar.f7696c);
        }
        if (map != null && !map.isEmpty()) {
            for (String str4 : map.keySet()) {
                if (!C6319n.m19593a(str4)) {
                    bundle2.putString(str4, (String) map.get(str4));
                }
            }
        }
        return bundle;
    }
}
