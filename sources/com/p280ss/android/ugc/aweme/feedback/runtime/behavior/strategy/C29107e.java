package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.e */
public final class C29107e extends C29100a {

    /* renamed from: a */
    private final String f76857a = "follow_user";

    /* renamed from: b */
    private final String f76858b = "unfollow_user";

    /* renamed from: a */
    public final String mo74558a() {
        return "abnor_follow";
    }

    /* renamed from: b */
    public final long mo74560b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo74561c() {
        long currentTimeMillis = System.currentTimeMillis() - mo74560b();
        List<C37295c> b = C29097a.m95452a().mo74534b(this.f76857a, currentTimeMillis);
        List<C37295c> b2 = C29097a.m95452a().mo74534b(this.f76858b, currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!b.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("关注失败: ");
            sb2.append(b.size());
            sb2.append("次(ECode:");
            sb.append(sb2.toString());
            for (C37295c cVar : b) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cVar.f97424d);
                sb3.append(',');
                sb.append(sb3.toString());
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        if (!b2.isEmpty()) {
            StringBuilder sb4 = new StringBuilder("取消关注失败: ");
            sb4.append(b2.size());
            sb4.append("次(ECode:");
            sb.append(sb4.toString());
            for (C37295c cVar2 : b2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(cVar2.f97424d);
                sb5.append(',');
                sb.append(sb5.toString());
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        String sb6 = sb.toString();
        C7573i.m23582a((Object) sb6, "result.toString()");
        return sb6;
    }

    /* renamed from: a */
    public final boolean mo74559a(String str) {
        C7573i.m23587b(str, "type");
        if (C7573i.m23585a((Object) str, (Object) this.f76857a) || C7573i.m23585a((Object) str, (Object) this.f76858b)) {
            return true;
        }
        return false;
    }
}
