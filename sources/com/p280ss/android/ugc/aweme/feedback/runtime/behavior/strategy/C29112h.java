package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h */
public final class C29112h extends C29100a {

    /* renamed from: a */
    public static final C29113a f76861a = new C29113a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h$a */
    public static final class C29113a {
        private C29113a() {
        }

        public /* synthetic */ C29113a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo74558a() {
        return "abnor_upload";
    }

    /* renamed from: b */
    public final long mo74560b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo74561c() {
        long currentTimeMillis = System.currentTimeMillis() - mo74560b();
        List b = C29097a.m95452a().mo74534b("upload_start", currentTimeMillis);
        List<C37295c> b2 = C29097a.m95452a().mo74534b("upload_error", currentTimeMillis);
        List b3 = C29097a.m95452a().mo74534b("upload_success", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C37295c cVar : b2) {
            List b4 = C7634n.m23768b(cVar.f97424d, new String[]{"-"}, false, 0);
            switch (b4.size()) {
                case 1:
                    arrayList2.add(new AwemeToolFeedbackECode((String) b4.get(0), null, 2, null));
                    break;
                case 2:
                    arrayList2.add(new AwemeToolFeedbackECode((String) b4.get(0), (String) b4.get(1)));
                    break;
            }
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = new AwemeToolFeedbackInfo("上传", b.size(), b3.size(), 0, arrayList2);
        arrayList.add(awemeToolFeedbackInfo);
        String b5 = C10944e.m32113a().mo15979b((Object) arrayList);
        C7573i.m23582a((Object) b5, "Network.getGson().toJson(infos)");
        return b5;
    }

    /* renamed from: a */
    public final boolean mo74559a(String str) {
        C7573i.m23587b(str, "type");
        int hashCode = str.hashCode();
        if (hashCode == -1358365110 ? !str.equals("upload_error") : hashCode == -1345392476 ? !str.equals("upload_start") : hashCode != -106994747 || !str.equals("upload_success")) {
            return false;
        }
        return true;
    }
}
