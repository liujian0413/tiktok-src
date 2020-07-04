package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1346e;

import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6937c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e.b */
public final class C31699b extends C31698a<Conversation> {

    /* renamed from: b */
    public static final C31700a f82930b = new C31700a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e.b$a */
    public static final class C31700a {
        private C31700a() {
        }

        public /* synthetic */ C31700a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C31699b m102945a(C31690a aVar) {
            C7573i.m23587b(aVar, "parameters");
            return new C31699b(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.e.b$b */
    static final class C31701b<T> implements Comparator<Conversation> {

        /* renamed from: a */
        final /* synthetic */ Map f82931a;

        /* renamed from: b */
        final /* synthetic */ Map f82932b;

        C31701b(Map map, Map map2) {
            this.f82931a = map;
            this.f82932b = map2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compare(Conversation conversation, Conversation conversation2) {
            Integer num = (Integer) this.f82931a.get(conversation);
            Integer num2 = (Integer) this.f82931a.get(conversation2);
            if (!C7573i.m23585a((Object) num, (Object) num2)) {
                return C47886a.m148819a(num2, num);
            }
            return C47886a.m148819a((Long) this.f82932b.get(conversation2), (Long) this.f82932b.get(conversation));
        }
    }

    public C31699b(C31690a aVar) {
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
    }

    /* renamed from: a */
    private static long m102939a(Conversation conversation) {
        long j;
        Message lastMessage = conversation.getLastMessage();
        if (lastMessage != null) {
            j = lastMessage.getCreatedAt();
        } else {
            j = 0;
        }
        if (conversation.isStickTop()) {
            return Math.max(j, conversation.getUpdatedTime());
        }
        return j;
    }

    /* renamed from: b */
    private final int m102940b(Conversation conversation) {
        switch (C6937c.f19628b.mo17969d()) {
            case 1:
                return m102941c(conversation);
            case 2:
                return m102942d(conversation);
            default:
                if (conversation.isStickTop()) {
                    return 50;
                }
                return 0;
        }
    }

    /* renamed from: d */
    private static int m102942d(Conversation conversation) {
        if (conversation.isStickTop()) {
            return 50;
        }
        if (conversation.isSingleChat()) {
            Message lastMessage = conversation.getLastMessage();
            if (lastMessage == null || lastMessage.getMsgType() != 15) {
                return 49;
            }
            return 46;
        } else if (conversation.isGroupChat()) {
            return 49;
        } else {
            return 0;
        }
    }

    /* renamed from: e */
    private static IMUser m102943e(Conversation conversation) {
        if (!conversation.isSingleChat()) {
            return null;
        }
        long a = C6425b.m20074a(conversation.getConversationId());
        if (a <= 0) {
            return null;
        }
        return C6961d.m21657a().mo18029b(String.valueOf(a));
    }

    /* renamed from: c */
    private final int m102941c(Conversation conversation) {
        if (conversation.isStickTop()) {
            return 50;
        }
        if (conversation.isSingleChat()) {
            IMUser e = m102943e(conversation);
            if (e == null) {
                return 0;
            }
            if (e.getFollowStatus() == 2) {
                Message lastMessage = conversation.getLastMessage();
                if (lastMessage == null || lastMessage.getMsgType() != 15) {
                    return 49;
                }
                return 46;
            } else if (e.getFollowStatus() == 1) {
                return 47;
            }
        } else if (conversation.isGroupChat()) {
            return 49;
        }
        return 0;
    }

    /* renamed from: a */
    public final List<Conversation> mo82467a(List<? extends Conversation> list) {
        C7573i.m23587b(list, "list");
        Map linkedHashMap = new LinkedHashMap();
        Map linkedHashMap2 = new LinkedHashMap();
        Iterable<Conversation> iterable = list;
        for (Conversation conversation : iterable) {
            linkedHashMap.put(conversation, Long.valueOf(m102939a(conversation)));
            linkedHashMap2.put(conversation, Integer.valueOf(m102940b(conversation)));
        }
        return C7525m.m23494a(iterable, (Comparator<? super T>) new C31701b<Object>(linkedHashMap2, linkedHashMap));
    }
}
