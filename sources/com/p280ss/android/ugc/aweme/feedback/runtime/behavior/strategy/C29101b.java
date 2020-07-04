package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.b */
public final class C29101b extends C29100a {

    /* renamed from: a */
    public static final C29102a f76854a = new C29102a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.b$a */
    public static final class C29102a {
        private C29102a() {
        }

        public /* synthetic */ C29102a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo74558a() {
        return "abnor_im";
    }

    /* renamed from: b */
    public final long mo74560b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo74561c() {
        long currentTimeMillis = System.currentTimeMillis() - mo74560b();
        List<C37295c> b = C29097a.m95452a().mo74534b("message_send_fail", currentTimeMillis);
        List<C37295c> b2 = C29097a.m95452a().mo74534b("message_self_visiable", currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!b.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("消息发送失败: ");
            sb2.append(b.size());
            sb2.append("次(ErrorCode:");
            sb.append(sb2.toString());
            for (C37295c cVar : b) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cVar.f97424d);
                sb3.append(',');
                sb.append(sb3.toString());
            }
            sb.append(");");
        }
        if (!b2.isEmpty()) {
            StringBuilder sb4 = new StringBuilder("消息自见: ");
            sb4.append(b2.size());
            sb4.append("次(ErrorCode:");
            sb.append(sb4.toString());
            for (C37295c cVar2 : b2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(cVar2.f97424d);
                sb5.append(',');
                sb.append(sb5.toString());
            }
            sb.append(");");
        }
        String sb6 = sb.toString();
        C7573i.m23582a((Object) sb6, "result.toString()");
        return sb6;
    }

    /* renamed from: a */
    public final boolean mo74559a(String str) {
        C7573i.m23587b(str, "type");
        int hashCode = str.hashCode();
        if (hashCode == -1082517890 ? !str.equals("message_self_visiable") : hashCode != 171840317 || !str.equals("message_send_fail")) {
            return false;
        }
        return true;
    }
}
