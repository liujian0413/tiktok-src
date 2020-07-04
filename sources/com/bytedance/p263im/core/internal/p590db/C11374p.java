package com.bytedance.p263im.core.internal.p590db;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.p */
public final class C11374p {

    /* renamed from: a */
    private static C11374p f30827a;

    private C11374p() {
    }

    /* renamed from: a */
    public static C11374p m33421a() {
        if (f30827a == null) {
            synchronized (C11374p.class) {
                if (f30827a == null) {
                    f30827a = new C11374p();
                }
            }
        }
        return f30827a;
    }

    /* renamed from: b */
    public static String m33425b() {
        C11357e[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS mention(");
        for (C11357e eVar : C11357e.values()) {
            sb.append(eVar.f30748f);
            sb.append(" ");
            sb.append(eVar.f30749g);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    public static boolean m33424a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11357e.COLUMN_UUID.f30748f);
        sb.append("=?");
        return C11324d.m33209a("mention", sb.toString(), new String[]{str});
    }

    /* renamed from: b */
    public static boolean m33426b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11357e.COLUMN_CONVERSATION_ID.f30748f);
        sb.append("=?");
        return C11324d.m33209a("mention", sb.toString(), new String[]{str});
    }

    /* renamed from: a */
    public final boolean mo27393a(Message message) {
        Boolean bool;
        boolean z = true;
        if (message.isSelf()) {
            return true;
        }
        List mentionIds = message.getMentionIds();
        if (mentionIds == null || mentionIds.isEmpty() || (!mentionIds.contains(Long.valueOf(C11198c.m32777a().f30372b.mo27230a())) && !mentionIds.contains(Long.valueOf(0)))) {
            return true;
        }
        Boolean valueOf = Boolean.valueOf(false);
        C11354f fVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into mention(");
            for (C11357e eVar : C11357e.values()) {
                sb.append(eVar.f30748f);
                sb.append(",");
                sb2.append("?,");
            }
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb3.substring(0, sb3.length() - 1));
            sb5.append(") values (");
            sb5.append(sb4.substring(0, sb4.length() - 1));
            sb5.append(");");
            String sb6 = sb5.toString();
            C11324d.m33206a();
            C11354f d = C11324d.m33212d(sb6);
            try {
                m33423a(d, message, mentionIds);
                if (d.mo27374a() <= 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
                C11378t.m33469a(d);
            } catch (Exception e) {
                e = e;
                fVar = d;
                try {
                    C11404d.m33585a("IMMentionDao.upsert", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33469a(fVar);
                    bool = valueOf;
                    return bool.booleanValue();
                } catch (Throwable th) {
                    th = th;
                    C11378t.m33469a(fVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fVar = d;
                C11378t.m33469a(fVar);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("IMMentionDao.upsert", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33469a(fVar);
            bool = valueOf;
            return bool.booleanValue();
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.p263im.core.model.Message> m33422a(java.lang.String r5, long r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "select * from mention where "
            r2.<init>(r3)
            com.bytedance.im.core.internal.db.e r3 = com.bytedance.p263im.core.internal.p590db.C11357e.COLUMN_CONVERSATION_ID
            java.lang.String r3 = r3.f30748f
            r2.append(r3)
            java.lang.String r3 = "=? order by "
            r2.append(r3)
            com.bytedance.im.core.internal.db.e r3 = com.bytedance.p263im.core.internal.p590db.C11357e.COLUMN_CREATED_TIME
            java.lang.String r3 = r3.f30748f
            r2.append(r3)
            java.lang.String r3 = " desc"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            r4 = 0
            r3[r4] = r5     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            com.bytedance.im.core.internal.db.b.b r5 = com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33207a(r2, r3)     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
        L_0x003d:
            boolean r2 = r5.mo27359d()     // Catch:{ Exception -> 0x0053 }
            if (r2 == 0) goto L_0x0062
            com.bytedance.im.core.internal.db.e r2 = com.bytedance.p263im.core.internal.p590db.C11357e.COLUMN_UUID     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r2.f30748f     // Catch:{ Exception -> 0x0053 }
            int r2 = r5.mo27353a(r2)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r5.mo27357c(r2)     // Catch:{ Exception -> 0x0053 }
            r0.add(r2)     // Catch:{ Exception -> 0x0053 }
            goto L_0x003d
        L_0x0053:
            r2 = move-exception
            goto L_0x005a
        L_0x0055:
            r6 = move-exception
            r5 = r1
            goto L_0x0075
        L_0x0058:
            r2 = move-exception
            r5 = r1
        L_0x005a:
            java.lang.String r3 = "getMentionSender"
            com.bytedance.p263im.core.internal.utils.C11404d.m33585a(r3, r2)     // Catch:{ all -> 0x0074 }
            com.bytedance.p263im.core.p586b.C11209d.m32824a(r2)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r5)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x006c
            return r1
        L_0x006c:
            com.bytedance.p263im.core.internal.p590db.C11375q.m33429a()
            java.util.List r5 = com.bytedance.p263im.core.internal.p590db.C11375q.m33436a(r0, r6)
            return r5
        L_0x0074:
            r6 = move-exception
        L_0x0075:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.C11374p.m33422a(java.lang.String, long):java.util.List");
    }

    /* renamed from: a */
    private static void m33423a(C11354f fVar, Message message, List<Long> list) {
        if (fVar != null && message != null) {
            fVar.mo27376a(C11357e.COLUMN_UUID.ordinal() + 1, C11378t.m33467a(message.getUuid()));
            fVar.mo27376a(C11357e.COLUMN_CONVERSATION_ID.ordinal() + 1, C11378t.m33467a(message.getConversationId()));
            fVar.mo27376a(C11357e.COLUMN_IDS_STR.ordinal() + 1, C11377s.m33466a(list, ","));
            fVar.mo27375a(C11357e.COLUMN_SENDER_ID.ordinal() + 1, message.getSender());
            fVar.mo27375a(C11357e.COLUMN_CREATED_TIME.ordinal() + 1, message.getCreatedAt());
        }
    }
}
