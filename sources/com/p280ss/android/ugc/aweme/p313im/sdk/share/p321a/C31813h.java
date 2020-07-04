package com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a;

import android.os.Bundle;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31859ae;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.h */
public final class C31813h {

    /* renamed from: a */
    public static final C31813h f83230a = new C31813h();

    /* renamed from: b */
    private static C31812g f83231b;

    private C31813h() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m103254a(com.bytedance.p263im.core.model.Message r3) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.share.a.h> r0 = com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31813h.class
            monitor-enter(r0)
            com.ss.android.ugc.aweme.im.sdk.share.a.g r1 = f83231b     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0010
            int r1 = r3.getMsgStatus()     // Catch:{ all -> 0x0034 }
            r2 = 2
            if (r1 == r2) goto L_0x001b
        L_0x0010:
            if (r3 == 0) goto L_0x0032
            int r1 = r3.getMsgStatus()     // Catch:{ all -> 0x0034 }
            r2 = 3
            if (r1 == r2) goto L_0x001b
            monitor-exit(r0)
            return
        L_0x001b:
            m103255b(r3)     // Catch:{ all -> 0x0034 }
            com.ss.android.ugc.aweme.im.sdk.share.a.g r3 = f83231b     // Catch:{ all -> 0x0034 }
            if (r3 != 0) goto L_0x0025
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ all -> 0x0034 }
        L_0x0025:
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r3.f83228b     // Catch:{ all -> 0x0034 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0030
            r3 = 0
            f83231b = r3     // Catch:{ all -> 0x0034 }
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            monitor-exit(r0)
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31813h.m103254a(com.bytedance.im.core.model.Message):void");
    }

    /* renamed from: b */
    private static void m103255b(Message message) {
        C31812g gVar = f83231b;
        if (gVar == null) {
            C7573i.m23580a();
        }
        if (C7573i.m23585a((Object) gVar.f83227a, (Object) "aweme") && message.getMsgType() == 8) {
            C31812g gVar2 = f83231b;
            if (gVar2 == null) {
                C7573i.m23580a();
            }
            if (!gVar2.f83228b.containsKey(message.getConversationId())) {
                gVar2 = null;
            }
            if (gVar2 != null) {
                Boolean bool = (Boolean) gVar2.f83228b.remove(message.getConversationId());
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    Bundle bundle = gVar2.f83229c;
                    String conversationId = message.getConversationId();
                    C7573i.m23582a((Object) conversationId, "message.conversationId");
                    C31859ae.m103517a(bundle, conversationId, booleanValue);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo82626a(SharePackage sharePackage, List<IMContact> list) {
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(list, "list");
        if (f83231b != null) {
            C6921a.m21555a("ShareStateHelper markShare lastShareState not null");
        }
        if (!list.isEmpty()) {
            Map linkedHashMap = new LinkedHashMap();
            for (IMContact iMContact : list) {
                if (iMContact instanceof IMUser) {
                    String uid = ((IMUser) iMContact).getUid();
                    C7573i.m23582a((Object) uid, "it.uid");
                    String a = C6425b.m20076a(Long.parseLong(uid));
                    C7573i.m23582a((Object) a, "ConversationModel.findCo…nIdByUid(it.uid.toLong())");
                    linkedHashMap.put(a, Boolean.valueOf(false));
                } else if (iMContact instanceof IMConversation) {
                    String conversationId = ((IMConversation) iMContact).getConversationId();
                    C7573i.m23582a((Object) conversationId, "it.conversationId");
                    linkedHashMap.put(conversationId, Boolean.valueOf(true));
                }
            }
            f83231b = new C31812g(sharePackage.f20181g, linkedHashMap, sharePackage.f20186l);
        }
    }
}
