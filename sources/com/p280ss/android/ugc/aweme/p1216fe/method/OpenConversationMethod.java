package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p313im.service.p1350c.C32006a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod */
public final class OpenConversationMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27904a f73509a = new C27904a(null);

    /* renamed from: b */
    private HashMap<String, C27876a> f73510b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod$a */
    public static final class C27904a {
        private C27904a() {
        }

        public /* synthetic */ C27904a(C7571f fVar) {
            this();
        }
    }

    public OpenConversationMethod() {
        this(null, 1, null);
    }

    public OpenConversationMethod(C11087a aVar) {
        super(aVar);
        this.f73510b = new HashMap<>();
    }

    @C7709l
    public final void onSelectedChatMsg(C32006a aVar) {
        boolean z;
        C7573i.m23587b(aVar, "event");
        String str = aVar.f83726b;
        if (C23764b.m77913a(str)) {
            Map map = this.f73510b;
            if (map == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            } else if (map.containsKey(str)) {
                Map map2 = this.f73510b;
                if (map2 != null) {
                    C27876a aVar2 = (C27876a) C7577n.m23626f(map2).remove(str);
                    if (aVar2 != null && C23764b.m77913a(aVar.f83725a)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("msgList", aVar.f83725a);
                        aVar2.mo71364a(jSONObject, C29956a.f78750c, "");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
            }
        }
        Map map3 = this.f73510b;
        if (map3 == null || map3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C42961az.m136383d(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r14, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x000a
            java.lang.String r1 = "extra"
            java.lang.String r1 = r14.optString(r1)
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r2 = 0
            goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            if (r2 == 0) goto L_0x001f
            return
        L_0x001f:
            java.lang.String r2 = "utf-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)
            java.lang.Class<com.google.gson.m> r2 = com.google.gson.C6711m.class
            java.lang.Object r1 = com.p280ss.android.ugc.aweme.utils.C42996by.m136484a(r1, r2)
            com.google.gson.m r1 = (com.google.gson.C6711m) r1
            if (r1 == 0) goto L_0x003c
            java.lang.String r2 = "conversation_id"
            com.google.gson.k r2 = r1.mo16149b(r2)
            if (r2 == 0) goto L_0x003c
            java.lang.String r2 = r2.mo15998c()
            goto L_0x003d
        L_0x003c:
            r2 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x004c
            java.lang.String r5 = "uid"
            com.google.gson.k r5 = r1.mo16149b(r5)
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = r5.mo15998c()
            goto L_0x004d
        L_0x004c:
            r5 = r0
        L_0x004d:
            if (r1 == 0) goto L_0x005c
            java.lang.String r6 = "nickname"
            com.google.gson.k r1 = r1.mo16149b(r6)
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r1.mo15998c()
            goto L_0x005d
        L_0x005c:
            r1 = r0
        L_0x005d:
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x006b
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r6 = 0
            goto L_0x006c
        L_0x006b:
            r6 = 1
        L_0x006c:
            if (r6 == 0) goto L_0x0093
            boolean r6 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r5)
            if (r6 == 0) goto L_0x0093
            boolean r6 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r1)
            if (r6 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.im.service.IIMService r2 = com.p280ss.android.ugc.aweme.p313im.C30553b.m99810g()
            java.lang.String r2 = r2.getConversationId(r5)
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = new com.ss.android.ugc.aweme.im.service.model.IMUser
            r6.<init>()
            r6.setUid(r5)
            r6.setNickName(r1)
            r6.setFake(r4)
            r9 = r2
            r10 = r6
            goto L_0x0095
        L_0x0093:
            r10 = r0
            r9 = r2
        L_0x0095:
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x00a0
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00a1
        L_0x00a0:
            r3 = 1
        L_0x00a1:
            if (r3 != 0) goto L_0x00aa
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = r13.f73510b
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r9, r15)
        L_0x00aa:
            com.p280ss.android.ugc.aweme.utils.C42961az.m136382c(r13)
            com.ss.android.ugc.aweme.im.service.IIMService r7 = com.p280ss.android.ugc.aweme.p313im.C30553b.m99810g()
            java.lang.ref.WeakReference r15 = r13.f73443f
            java.lang.Object r15 = r15.get()
            if (r15 == 0) goto L_0x00cc
            android.app.Activity r15 = (android.app.Activity) r15
            r8 = r15
            android.content.Context r8 = (android.content.Context) r8
            r11 = 1
            if (r14 == 0) goto L_0x00c7
            java.lang.String r15 = "msgList"
            java.lang.String r0 = r14.optString(r15)
        L_0x00c7:
            r12 = r0
            r7.startSelectChatMsg(r8, r9, r10, r11, r12)
            return
        L_0x00cc:
            kotlin.TypeCastException r14 = new kotlin.TypeCastException
            java.lang.String r15 = "null cannot be cast to non-null type android.app.Activity"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.OpenConversationMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ OpenConversationMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
