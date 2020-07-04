package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C11437f;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.i */
public final class C31085i {

    /* renamed from: a */
    public static final C31085i f81578a = new C31085i();

    /* renamed from: b */
    private static C11437f f81579b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ConcurrentHashMap<String, String> f81580c = new ConcurrentHashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.i$a */
    static final class C31086a implements C11437f {

        /* renamed from: a */
        public static final C31086a f81581a = new C31086a();

        C31086a() {
        }

        /* renamed from: h */
        public final void mo27468h(List<Member> list) {
            C7573i.m23582a((Object) list, "it");
            for (Member member : list) {
                C7573i.m23582a((Object) member, "member");
                if (member.getUid() > 0 && !TextUtils.isEmpty(member.getSecUid()) && member.getConversationType() != C11203a.f30381b) {
                    IMUser a = C6961d.m21657a().mo18021a(String.valueOf(member.getUid()), member.getSecUid());
                    if (a != null) {
                        if (TextUtils.isEmpty(a.getSecUid())) {
                            a.setSecUid(member.getSecUid());
                            C6961d.m21657a().mo18026a(a);
                        }
                        String uid = a.getUid();
                        C7573i.m23582a((Object) uid, "user.uid");
                        String a2 = C6425b.m20076a(Long.parseLong(uid));
                        if (!TextUtils.isEmpty(a2)) {
                            C7573i.m23582a((Object) a2, "sessionId");
                            C31083h.m101384b(a2);
                        }
                    } else {
                        Map a3 = C31085i.f81580c;
                        String valueOf = String.valueOf(member.getUid());
                        String secUid = member.getSecUid();
                        C7573i.m23582a((Object) secUid, "member.secUid");
                        a3.put(valueOf, secUid);
                    }
                }
            }
        }
    }

    private C31085i() {
    }

    /* renamed from: a */
    public static void m101387a() {
        if (f81579b == null) {
            f81579b = C31086a.f81581a;
        }
        C11407f.m33601a().f30893c = f81579b;
    }

    /* renamed from: b */
    public static void m101390b() {
        if (f81579b != null) {
            C11407f.m33601a().mo27449a(f81579b);
            f81579b = null;
        }
    }

    /* renamed from: b */
    public static String m101389b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = (String) f81580c.get(str);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2;
    }

    /* renamed from: a */
    public final String mo81569a(String str) {
        boolean z;
        String str2;
        String b = m101389b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return b;
        }
        IMUser b2 = C6961d.m21657a().mo18029b(str);
        if (b2 != null) {
            str2 = b2.getSecUid();
        } else {
            str2 = null;
        }
        return str2;
    }

    /* renamed from: c */
    public final void mo81571c(String str) {
        if (!TextUtils.isEmpty(str)) {
            String a = mo81568a(C6961d.m21657a().mo18029b(str), str);
            C6956a a2 = C6956a.m21632a();
            C7573i.m23582a((Object) a2, "AwemeImManager.instance()");
            a2.mo18009f().putSecUidToMap(str, a);
        }
    }

    /* renamed from: a */
    public static void m101388a(IMUser iMUser) {
        if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid()) && !TextUtils.isEmpty(iMUser.getSecUid())) {
            if (!TextUtils.isEmpty(iMUser.getSecUid())) {
                Map map = f81580c;
                String uid = iMUser.getUid();
                C7573i.m23582a((Object) uid, "user.uid");
                String secUid = iMUser.getSecUid();
                C7573i.m23582a((Object) secUid, "user.secUid");
                map.put(uid, secUid);
            }
            IMUser b = C6961d.m21657a().mo18029b(iMUser.getUid());
            if (b != null && TextUtils.isEmpty(b.getSecUid())) {
                b.setSecUid(iMUser.getSecUid());
                C6961d.m21657a().mo18026a(b);
            }
        }
    }

    /* renamed from: b */
    public final String mo81570b(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return "";
        }
        if (!TextUtils.isEmpty(iMUser.getSecUid())) {
            return iMUser.getSecUid();
        }
        IMUser b = C6961d.m21657a().mo18029b(iMUser.getUid());
        if (b == null || TextUtils.isEmpty(b.getSecUid())) {
            return m101389b(iMUser.getUid());
        }
        return b.getSecUid();
    }

    /* renamed from: a */
    public final String mo81568a(IMUser iMUser, String str) {
        if (iMUser == null) {
            return m101389b(str);
        }
        return mo81570b(iMUser);
    }
}
