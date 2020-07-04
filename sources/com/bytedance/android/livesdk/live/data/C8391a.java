package com.bytedance.android.livesdk.live.data;

import android.util.Pair;
import com.bytedance.android.live.base.model.C2343f;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6711m;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.live.data.a */
public final class C8391a {

    /* renamed from: com.bytedance.android.livesdk.live.data.a$a */
    static final class C8392a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C8392a f23007a = new C8392a();

        C8392a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m25553a((C3474a) obj);
        }

        /* renamed from: a */
        private static Pair<List<FeedItem>, C2344a> m25553a(C3474a<FeedItem, C2344a> aVar) {
            C7573i.m23587b(aVar, "response");
            ArrayList arrayList = new ArrayList();
            List<T> list = aVar.f10296b;
            if (list != null) {
                arrayList.addAll(list);
            }
            return Pair.create(arrayList, aVar.f10297c);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.live.data.a$b */
    static final class C8393b<T> implements C7326g<Pair<List<? extends FeedItem>, C2344a>> {

        /* renamed from: a */
        final /* synthetic */ C8391a f23008a;

        C8393b(C8391a aVar) {
            this.f23008a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<List<FeedItem>, C2344a> pair) {
            List list;
            if (pair != null) {
                list = (List) pair.first;
            } else {
                list = null;
            }
            if (list != null && !((List) pair.first).isEmpty() && pair.second != null) {
                Object obj = pair.second;
                C7573i.m23582a(obj, "pair.second");
                C6711m a = ((C2344a) obj).mo8249a();
                if (a != null) {
                    Object obj2 = pair.first;
                    C7573i.m23582a(obj2, "pair.first");
                    for (FeedItem feedItem : (Iterable) obj2) {
                        feedItem.logPb = a.toString();
                        C8391a.m25550a(feedItem);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25550a(FeedItem feedItem) {
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

    /* renamed from: a */
    private static String m25549a(List<? extends Object> list) {
        StringBuilder sb;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb2.append(list.get(i).toString());
            boolean z = true;
            if (i >= list.size() - 1) {
                z = false;
            }
            if (z) {
                sb = sb2;
            } else {
                sb = null;
            }
            if (sb != null) {
                sb.append(",");
            }
        }
        String sb3 = sb2.toString();
        C7573i.m23582a((Object) sb3, "builder.toString()");
        return sb3;
    }

    /* renamed from: a */
    public final C7492s<C3479d<Object>> mo21556a(long j, long j2, String str, List<Long> list) {
        C7573i.m23587b(str, "unreadExtra");
        C7573i.m23587b(list, "roomIds");
        C7492s<C3479d<Object>> collectUnreadRequest = ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).collectUnreadRequest(j, j2, str, m25549a(list));
        C7573i.m23582a((Object) collectUnreadRequest, "LiveInternalService.inst…, getObjectsStr(roomIds))");
        return collectUnreadRequest;
    }

    /* renamed from: a */
    public final C7492s<Pair<List<FeedItem>, C2344a>> mo21557a(long j, String str, long j2, long j3, String str2) {
        String str3 = str;
        C7573i.m23587b(str, "reqFrom");
        String str4 = str2;
        C7573i.m23587b(str4, "url");
        C7492s<Pair<List<FeedItem>, C2344a>> d = ((FeedApi) C9178j.m27302j().mo22373b().mo10440a(FeedApi.class)).feed(str4, j, str3, 1, j2, j3).mo19317d((C7327h<? super T, ? extends R>) C8392a.f23007a).mo19316d((C7326g<? super T>) new C8393b<Object>(this));
        C7573i.m23582a((Object) d, "LiveInternalService.inst…      }\n                }");
        return d;
    }
}
