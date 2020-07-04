package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.c */
public final class C29103c extends C29100a {

    /* renamed from: a */
    public static final C29104a f76855a = new C29104a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.c$a */
    public static final class C29104a {
        private C29104a() {
        }

        public /* synthetic */ C29104a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo74558a() {
        return "abnor_compose";
    }

    /* renamed from: b */
    public final long mo74560b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo74561c() {
        long currentTimeMillis = System.currentTimeMillis() - mo74560b();
        List b = C29097a.m95452a().mo74534b("compose_start", currentTimeMillis);
        List<C37295c> b2 = C29097a.m95452a().mo74534b("compose_error", currentTimeMillis);
        List b3 = C29097a.m95452a().mo74534b("compose_success", currentTimeMillis);
        List b4 = C29097a.m95452a().mo74534b("compose_cancel", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C37295c cVar : b2) {
            arrayList2.add(new AwemeToolFeedbackECode(cVar.f97424d, null, 2, null));
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = new AwemeToolFeedbackInfo("合成", b.size(), b3.size(), b4.size(), arrayList2);
        arrayList.add(awemeToolFeedbackInfo);
        String b5 = C10944e.m32113a().mo15979b((Object) arrayList);
        C7573i.m23582a((Object) b5, "Network.getGson().toJson(infos)");
        return b5;
    }

    /* renamed from: a */
    public final boolean mo74559a(String str) {
        C7573i.m23587b(str, "type");
        int hashCode = str.hashCode();
        if (hashCode == -2098026922 ? !str.equals("compose_success") : hashCode == 1388163355 ? !str.equals("compose_error") : hashCode != 1401135989 || !str.equals("compose_start")) {
            return false;
        }
        return true;
    }
}
