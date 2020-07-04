package com.bytedance.android.livesdk.live.p403b;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.C2343f;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.live.data.C8391a;
import com.bytedance.android.livesdk.live.model.FeedDraw;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.android.livesdkapi.p452h.C9419g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.live.b.a */
public final class C8385a extends C9419g {

    /* renamed from: d */
    public static final C8387b f22986d = new C8387b(null);

    /* renamed from: a */
    public C2344a f22987a;

    /* renamed from: b */
    public String f22988b = "";

    /* renamed from: c */
    public boolean f22989c;

    /* renamed from: e */
    private C8391a f22990e;

    /* renamed from: f */
    private final ArrayList<Room> f22991f = new ArrayList<>();

    /* renamed from: g */
    private final ArrayList<Bundle> f22992g = new ArrayList<>();

    /* renamed from: h */
    private final ArrayList<FeedItem> f22993h = new ArrayList<>();

    /* renamed from: i */
    private final HashSet<Long> f22994i = new HashSet<>();

    /* renamed from: j */
    private final HashMap<String, HashSet<Long>> f22995j = new HashMap<>();

    /* renamed from: k */
    private long f22996k;

    /* renamed from: l */
    private long f22997l;

    /* renamed from: m */
    private String f22998m = "";

    /* renamed from: n */
    private final C47562b f22999n = new C47562b();

    /* renamed from: o */
    private int f23000o;

    /* renamed from: p */
    private boolean f23001p;

    /* renamed from: com.bytedance.android.livesdk.live.b.a$a */
    static final class C8386a<T> implements C7326g<C3479d<Object>> {

        /* renamed from: a */
        final /* synthetic */ String f23002a;

        C8386a(String str) {
            this.f23002a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$b */
    public static final class C8387b {
        private C8387b() {
        }

        public /* synthetic */ C8387b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$c */
    static final class C8388c<T> implements C7326g<Pair<List<? extends FeedItem>, C2344a>> {

        /* renamed from: a */
        final /* synthetic */ C8385a f23003a;

        C8388c(C8385a aVar) {
            this.f23003a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<List<FeedItem>, C2344a> pair) {
            if (pair == null) {
                this.f23003a.f22989c = false;
                return;
            }
            this.f23003a.f22987a = (C2344a) pair.second;
            if (pair.first == null || ((List) pair.first).isEmpty()) {
                this.f23003a.f22989c = false;
                return;
            }
            C8385a aVar = this.f23003a;
            Object obj = pair.first;
            C7573i.m23582a(obj, "pair.first");
            List list = (List) obj;
            Object obj2 = pair.second;
            C7573i.m23582a(obj2, "pair.second");
            aVar.mo21549a(list, (C2344a) obj2);
            this.f23003a.mo23118f();
            this.f23003a.f22989c = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$d */
    static final class C8389d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C8385a f23004a;

        C8389d(C8385a aVar) {
            this.f23004a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f23004a.f22989c = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.b.a$e */
    static final class C8390e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C8390e f23005a = new C8390e();

        C8390e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    public final void mo14626a(int i, FeedItem feedItem) {
    }

    /* renamed from: b */
    public final int mo14629b() {
        return this.f22992g.size();
    }

    /* renamed from: d */
    public final List<Room> mo14634d() {
        return this.f22991f;
    }

    /* renamed from: e */
    public final void mo21552e() {
        if (FeedDraw.needCollectUnRead(this.f22988b)) {
            m25531h();
        }
    }

    /* renamed from: g */
    private final String m25530g() {
        long j;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22988b);
        C2344a aVar = this.f22987a;
        if (aVar != null) {
            j = aVar.f7698e;
        } else {
            j = 0;
        }
        if (j == 0) {
            str = "_refresh";
        } else {
            str = "_loadmore";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo14632c() {
        this.f22994i.clear();
        this.f22995j.clear();
        this.f22992g.clear();
        this.f22991f.clear();
        this.f22999n.mo119660a();
        this.f22989c = false;
    }

    /* renamed from: h */
    private final void m25531h() {
        String str;
        Map map = this.f22995j;
        Map linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            ((HashSet) entry.getValue()).removeAll(this.f22994i);
            if (((HashSet) entry.getValue()).size() > 0) {
                z = true;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Entry entry2 : linkedHashMap.entrySet()) {
            try {
                String str2 = (String) entry2.getKey();
                int b = C7634n.m23760b((CharSequence) entry2.getKey(), "_", 0, false, 6, (Object) null);
                if (str2 != null) {
                    str = str2.substring(0, b);
                    C7573i.m23582a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (this.f22990e == null) {
                        this.f22990e = new C8391a();
                    }
                    C8391a aVar = this.f22990e;
                    if (aVar != null) {
                        C7492s a = aVar.mo21556a(this.f22996k, this.f22997l, str, new ArrayList((Collection) entry2.getValue()));
                        if (a != null) {
                            a.mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8386a<Object>(str), (C7326g<? super Throwable>) C8390e.f23005a);
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } catch (Exception unused) {
                str = (String) entry2.getKey();
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo14625a(int i) {
        Object obj = this.f22992g.get(i);
        C7573i.m23582a(obj, "mRoomArgList[pos]");
        return (Bundle) obj;
    }

    /* renamed from: b */
    public final void mo21550b(long j) {
        this.f22994i.add(Long.valueOf(j));
    }

    /* renamed from: c */
    private final void m25529c(Bundle bundle) {
        if (this.f23001p && bundle != null) {
            bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", this.f23001p);
            bundle.putString("live.intent.extra.FEED_URL", this.f22998m);
            bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
        }
    }

    /* renamed from: a */
    private static void m25527a(FeedItem feedItem) {
        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
            C2343f fVar = feedItem.item;
            if (fVar != null) {
                Room room = (Room) fVar;
                room.setLog_pb(feedItem.logPb);
                User owner = room.getOwner();
                if (owner != null) {
                    owner.setLogPb(feedItem.logPb);
                }
                room.setRequestId(feedItem.resId);
                room.isFromRecommendCard = feedItem.isRecommendCard;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
        }
    }

    /* renamed from: c */
    public final FeedItem mo21551c(int i) {
        int size = this.f22993h.size();
        if (1 <= i && size > i) {
            return (FeedItem) this.f22993h.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo14624a(Bundle bundle) {
        boolean z;
        long j = -1;
        if (bundle != null) {
            j = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        }
        int size = this.f22992g.size();
        for (int i = 0; i < size; i++) {
            Object obj = this.f22992g.get(i);
            if (((Bundle) obj).getLong("live.intent.extra.ROOM_ID", 0) == j) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                obj = null;
            }
            if (((Bundle) obj) != null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo14631b(int i) {
        C7492s sVar;
        long j = 0;
        if (this.f22996k > 0) {
            C2344a aVar = this.f22987a;
            if (aVar == null || aVar.hasMore) {
                if (this.f22990e == null) {
                    this.f22990e = new C8391a();
                }
                if (!this.f22989c) {
                    C8391a aVar2 = this.f22990e;
                    if (aVar2 != null) {
                        C2344a aVar3 = this.f22987a;
                        if (aVar3 != null) {
                            j = aVar3.f7698e;
                        }
                        sVar = aVar2.mo21557a(j, m25530g(), this.f22996k, this.f22997l, this.f22998m);
                    } else {
                        sVar = null;
                    }
                    if (sVar != null) {
                        this.f22989c = true;
                        this.f22999n.mo119661a(sVar.mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8388c<Object>(this), (C7326g<? super Throwable>) new C8389d<Object>(this)));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14627a(long j) {
        if (!C6307b.m19566a((Collection<T>) this.f22991f) && !C6307b.m19566a((Collection<T>) this.f22992g) && !C6307b.m19566a((Collection<T>) this.f22993h)) {
            int size = this.f22991f.size();
            for (int i = 0; i < size; i++) {
                Object obj = this.f22991f.get(i);
                C7573i.m23582a(obj, "mRoomList[i]");
                if (((Room) obj).getId() == j) {
                    if (this.f22992g.size() > i) {
                        this.f22992g.remove(i);
                    }
                    if (this.f22991f.size() > i) {
                        this.f22991f.remove(i);
                    }
                    if (this.f22993h.size() > i) {
                        this.f22993h.remove(i);
                    }
                    mo23118f();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m25528b(Bundle bundle) {
        String str;
        String str2;
        if (bundle != null) {
            HashSet hashSet = new HashSet();
            boolean z = false;
            this.f23001p = bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false);
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("live.intent.extra.MORE_BUNDLE");
            if (sparseParcelableArray != null) {
                int size = sparseParcelableArray.size() + 1;
                for (int i = 0; i < size; i++) {
                    Bundle bundle2 = (Bundle) sparseParcelableArray.get(i);
                    if (bundle2 != null) {
                        m25529c(bundle2);
                        this.f22992g.add(bundle2);
                        ArrayList<Room> arrayList = this.f22991f;
                        Room room = new Room();
                        room.setId(bundle2.getLong("live.intent.extra.ROOM_ID", 0));
                        room.setIdStr(String.valueOf(room.getId()));
                        room.isFromRecommendCard = !TextUtils.isEmpty(bundle2.getString("enter_from_merge_recommend", null));
                        User user = new User();
                        user.setId(bundle2.getLong("anchor_id", 0));
                        user.setIdStr(String.valueOf(user.getId()));
                        room.setOwner(user);
                        arrayList.add(room);
                        this.f22993h.add(new FeedItem());
                        hashSet.add(Long.valueOf(bundle2.getLong("live.intent.extra.ROOM_ID", 0)));
                    }
                }
                if (bundle.containsKey("live.intent.extra.HAS_MORE") && bundle.containsKey("live.intent.extra.MAX_TIME")) {
                    C2344a aVar = new C2344a();
                    aVar.hasMore = bundle.getBoolean("live.intent.extra.HAS_MORE", false);
                    aVar.f7698e = bundle.getLong("live.intent.extra.MAX_TIME", 0);
                    this.f22987a = aVar;
                }
                if (!C6319n.m19593a(bundle.getString("live.intent.extra.UNREAD_ID", ""))) {
                    C2344a aVar2 = this.f22987a;
                    if (aVar2 != null) {
                        aVar2.f7696c = bundle.getString("live.intent.extra.UNREAD_ID", "");
                    }
                    C2344a aVar3 = this.f22987a;
                    if (aVar3 != null) {
                        str = aVar3.f7696c;
                    } else {
                        str = null;
                    }
                    if (!C6319n.m19593a(str)) {
                        C2344a aVar4 = this.f22987a;
                        if (aVar4 != null) {
                            str2 = aVar4.f7696c;
                        } else {
                            str2 = null;
                        }
                        CharSequence charSequence = str2;
                        if (charSequence == null || charSequence.length() == 0) {
                            z = true;
                        }
                        if (z) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            Map map = this.f22995j;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append('_');
                            sb.append(this.f23000o);
                            map.put(sb.toString(), hashSet);
                            this.f23000o++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21549a(List<? extends FeedItem> list, C2344a aVar) {
        boolean z;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (true) {
                Room room = null;
                if (!it.hasNext()) {
                    break;
                }
                FeedItem feedItem = (FeedItem) it.next();
                if (feedItem.item == null) {
                    try {
                        feedItem.item = feedItem.getRoom();
                        m25527a(feedItem);
                    } catch (Exception unused) {
                    }
                }
                C2343f fVar = feedItem.item;
                if (fVar instanceof Room) {
                    room = fVar;
                }
                Room room2 = room;
                if (room2 != null) {
                    long j = this.f22996k;
                    User owner = room2.getOwner();
                    if (owner == null || j != owner.getLiveRoomId()) {
                        room2.isFromRecommendCard = feedItem.isRecommendCard;
                        this.f22991f.add(room2);
                        Bundle a = C9412a.m27916a(room2);
                        C7573i.m23582a((Object) a, "b");
                        m25529c(a);
                        this.f22992g.add(a);
                        this.f22993h.add(feedItem);
                        hashSet.add(Long.valueOf(room2.getId()));
                    }
                }
            }
            String str = aVar.f7696c;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = null;
            }
            if (str != null) {
                Map map = this.f22995j;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('_');
                sb.append(this.f23000o);
                map.put(sb.toString(), hashSet);
                this.f23000o++;
            }
        }
    }

    public C8385a(Bundle bundle, String str, String str2) {
        long j;
        boolean z;
        C7573i.m23587b(bundle, "roomArgs");
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "requestFrom");
        this.f22998m = str;
        this.f22996k = bundle.getLong("live.intent.extra.ROOM_ID", 0);
        Object obj = bundle.get("live.intent.extra.USER_ID");
        if (obj == null) {
            obj = bundle.get("anchor_id");
        }
        if (obj instanceof Long) {
            j = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                Long e = C7634n.m23707e((String) obj);
                if (e != null) {
                    j = e.longValue();
                }
            }
            j = 0;
        }
        this.f22997l = j;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle2 != null) {
                String conventRequestFrom = FeedDraw.conventRequestFrom(bundle2.getString("enter_from_merge", ""), bundle2.getString("enter_method", ""));
                C7573i.m23582a((Object) conventRequestFrom, "FeedDraw.conventRequestF…RA_LOG_ENTER_METHOD, \"\"))");
                this.f22988b = conventRequestFrom;
            }
        } else {
            this.f22988b = str2;
        }
        if (bundle.getLong("anchor_id", 0) == 0) {
            bundle.putLong("anchor_id", this.f22997l);
        }
        if (C6319n.m19593a(bundle.getString("live.intent.extra.REQUEST_ID", ""))) {
            bundle.putString("live.intent.extra.REQUEST_ID", bundle.getString("request_id", ""));
        }
        if (C6319n.m19593a(bundle.getString("live.intent.extra.LOG_PB", ""))) {
            bundle.putString("live.intent.extra.LOG_PB", bundle.getString("log_pb", ""));
        }
        this.f22992g.add(bundle);
        ArrayList<Room> arrayList = this.f22991f;
        Room room = new Room();
        room.setId(this.f22996k);
        room.setIdStr(String.valueOf(this.f22996k));
        User user = new User();
        user.setId(this.f22997l);
        user.setIdStr(String.valueOf(this.f22997l));
        room.setOwner(user);
        arrayList.add(room);
        this.f22993h.add(new FeedItem());
        m25528b(bundle);
    }
}
