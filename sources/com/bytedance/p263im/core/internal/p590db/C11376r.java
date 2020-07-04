package com.bytedance.p263im.core.internal.p590db;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.PropertyMsg;
import com.bytedance.p263im.core.p586b.C11209d;

/* renamed from: com.bytedance.im.core.internal.db.r */
public class C11376r {

    /* renamed from: a */
    private static C11376r f30829a;

    private C11376r() {
    }

    /* renamed from: a */
    public static C11376r m33458a() {
        if (f30829a == null) {
            synchronized (C11376r.class) {
                if (f30829a == null) {
                    f30829a = new C11376r();
                }
            }
        }
        return f30829a;
    }

    /* renamed from: b */
    public static String m33463b() {
        C11365i[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg_property(");
        for (C11365i iVar : C11365i.values()) {
            sb.append(iVar.f30819u);
            sb.append(" ");
            sb.append(iVar.f30820v);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    public static void m33461a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11365i.COLUMN_CONVERSATION_ID.f30819u);
            sb.append("=?");
            C11324d.m33209a("msg_property", sb.toString(), new String[]{str});
        }
    }

    /* renamed from: b */
    private static long m33462b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid from msg_property where ");
            sb.append(C11365i.COLUMN_MSG_ID.f30819u);
            sb.append("=?");
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            if (a != null) {
                try {
                    if (a.mo27358c()) {
                        long b = a.mo27356b(a.mo27353a("rowid"));
                        C11378t.m33468a(a);
                        return b;
                    }
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11404d.m33585a("getRowid", (Throwable) e);
                        C11209d.m32824a(e);
                        C11378t.m33468a(bVar);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        C11378t.m33468a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    bVar = a;
                    th = th3;
                    C11378t.m33468a(bVar);
                    throw th;
                }
            }
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("getRowid", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return -1;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r4.mo27374a() > 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r4.mo27377b() > 0) goto L_0x0032;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27398a(com.bytedance.p263im.core.model.PropertyMsg r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x005d
            boolean r1 = r9.invalid()
            if (r1 == 0) goto L_0x000a
            goto L_0x005d
        L_0x000a:
            r1 = 0
            java.lang.String r2 = r9.getUuid()     // Catch:{ Exception -> 0x004c }
            long r2 = m33462b(r2)     // Catch:{ Exception -> 0x004c }
            java.lang.String r4 = r9.getUuid()     // Catch:{ Exception -> 0x004c }
            java.lang.String r4 = m33459a(r2, r4)     // Catch:{ Exception -> 0x004c }
            com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x004c }
            com.bytedance.im.core.internal.db.b.f r4 = com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33212d(r4)     // Catch:{ Exception -> 0x004c }
            r1 = 1
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x003a
            m33464b(r4, r9)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            int r9 = r4.mo27374a()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r9 <= 0) goto L_0x0046
        L_0x0032:
            r0 = 1
            goto L_0x0046
        L_0x0034:
            r9 = move-exception
            r1 = r4
            goto L_0x0059
        L_0x0037:
            r9 = move-exception
            r1 = r4
            goto L_0x004d
        L_0x003a:
            m33460a(r4, r9)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            long r2 = r4.mo27377b()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0046
            goto L_0x0032
        L_0x0046:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33469a(r4)
            goto L_0x0058
        L_0x004a:
            r9 = move-exception
            goto L_0x0059
        L_0x004c:
            r9 = move-exception
        L_0x004d:
            java.lang.String r2 = "insertOrUpdatePropertyMsg"
            com.bytedance.p263im.core.internal.utils.C11404d.m33585a(r2, r9)     // Catch:{ all -> 0x004a }
            com.bytedance.p263im.core.p586b.C11209d.m32824a(r9)     // Catch:{ all -> 0x004a }
            com.bytedance.p263im.core.internal.p590db.C11378t.m33469a(r1)
        L_0x0058:
            return r0
        L_0x0059:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33469a(r1)
            throw r9
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.C11376r.mo27398a(com.bytedance.im.core.model.PropertyMsg):boolean");
    }

    /* renamed from: a */
    private static String m33459a(long j, String str) {
        C11365i[] values;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (j > 0) {
            sb.append(" update msg_property set ");
            for (C11365i iVar : C11365i.values()) {
                if (!C11365i.COLUMN_MSG_ID.f30819u.equals(iVar.f30819u)) {
                    sb.append(iVar.f30819u);
                    sb.append("=?,");
                }
            }
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3.substring(0, sb3.length() - 1));
            sb4.append(" where ");
            sb4.append(C11365i.COLUMN_MSG_ID.f30819u);
            sb4.append("='");
            sb4.append(C11378t.m33467a(str));
            sb4.append("'");
            return sb4.toString();
        }
        sb.append(" insert into msg_property(");
        for (C11365i iVar2 : C11365i.values()) {
            sb.append(iVar2.f30819u);
            sb.append(",");
            sb2.append("?,");
        }
        String sb5 = sb.toString();
        String sb6 = sb2.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb5.substring(0, sb5.length() - 1));
        sb7.append(") values (");
        sb7.append(sb6.substring(0, sb6.length() - 1));
        sb7.append(");");
        return sb7.toString();
    }

    /* renamed from: a */
    private static void m33460a(C11354f fVar, PropertyMsg propertyMsg) {
        if (fVar != null && propertyMsg != null) {
            fVar.mo27376a(C11365i.COLUMN_MSG_ID.ordinal() + 1, C11378t.m33467a(propertyMsg.getUuid()));
            fVar.mo27375a(C11365i.COLUMN_SERVER_ID.ordinal() + 1, propertyMsg.getServerId());
            fVar.mo27376a(C11365i.COLUMN_CONVERSATION_ID.ordinal() + 1, C11378t.m33467a(propertyMsg.getConversationId()));
            fVar.mo27376a(C11365i.COLUMN_TARGET_MSG_ID.ordinal() + 1, C11378t.m33467a(propertyMsg.getTargetUuid()));
            fVar.mo27375a(C11365i.COLUMN_PROPERTY_TYPE.ordinal() + 1, (long) propertyMsg.getPropertyType());
            fVar.mo27375a(C11365i.COLUMN_MSG_TYPE.ordinal() + 1, (long) propertyMsg.getMsgType());
            fVar.mo27375a(C11365i.COLUMN_INNER_INDEX.ordinal() + 1, propertyMsg.getIndex());
            fVar.mo27375a(C11365i.COLUMN_ORDER_INDEX.ordinal() + 1, propertyMsg.getOrderIndex());
            fVar.mo27375a(C11365i.COLUMN_STATUS.ordinal() + 1, (long) propertyMsg.getStatus());
            fVar.mo27375a(C11365i.COLUMN_NET_STATUS.ordinal() + 1, (long) propertyMsg.getNetStatus());
            fVar.mo27375a(C11365i.COLUMN_VERSION.ordinal() + 1, propertyMsg.getVersion());
            fVar.mo27375a(C11365i.COLUMN_DELETED.ordinal() + 1, (long) propertyMsg.getDeleted());
            fVar.mo27375a(C11365i.COLUMN_CREATE_TIME.ordinal() + 1, propertyMsg.getCreatedTime());
            fVar.mo27375a(C11365i.COLUMN_SENDER.ordinal() + 1, propertyMsg.getSender());
            fVar.mo27376a(C11365i.COLUMN_CONTENT.ordinal() + 1, C11378t.m33467a(propertyMsg.getContent()));
            fVar.mo27376a(C11365i.COLUMN_EXT.ordinal() + 1, C11378t.m33467a(propertyMsg.getExtStr()));
            fVar.mo27376a(C11365i.COLUMN_LOCAL_INFO.ordinal() + 1, C11378t.m33467a(propertyMsg.getLocalExtStr()));
            fVar.mo27375a(C11365i.COLUMN_PRORERTY_ID.ordinal() + 1, (long) propertyMsg.getPropertyId());
            fVar.mo27376a(C11365i.COLUMN_PRORERTY_NAME.ordinal() + 1, C11378t.m33467a(propertyMsg.getPropertyName()));
            fVar.mo27375a(C11365i.COLUMN_REACTION_STATUS.ordinal() + 1, (long) propertyMsg.getReactionStatus());
        }
    }

    /* renamed from: b */
    private static void m33464b(C11354f fVar, PropertyMsg propertyMsg) {
        if (fVar != null && propertyMsg != null) {
            fVar.mo27375a(C11365i.COLUMN_SERVER_ID.ordinal() + 0, propertyMsg.getServerId());
            fVar.mo27376a(C11365i.COLUMN_CONVERSATION_ID.ordinal() + 0, C11378t.m33467a(propertyMsg.getConversationId()));
            fVar.mo27376a(C11365i.COLUMN_TARGET_MSG_ID.ordinal() + 0, C11378t.m33467a(propertyMsg.getTargetUuid()));
            fVar.mo27375a(C11365i.COLUMN_PROPERTY_TYPE.ordinal() + 0, (long) propertyMsg.getPropertyType());
            fVar.mo27375a(C11365i.COLUMN_MSG_TYPE.ordinal() + 0, (long) propertyMsg.getMsgType());
            fVar.mo27375a(C11365i.COLUMN_INNER_INDEX.ordinal() + 0, propertyMsg.getIndex());
            fVar.mo27375a(C11365i.COLUMN_ORDER_INDEX.ordinal() + 0, propertyMsg.getOrderIndex());
            fVar.mo27375a(C11365i.COLUMN_STATUS.ordinal() + 0, (long) propertyMsg.getStatus());
            fVar.mo27375a(C11365i.COLUMN_NET_STATUS.ordinal() + 0, (long) propertyMsg.getNetStatus());
            fVar.mo27375a(C11365i.COLUMN_VERSION.ordinal() + 0, propertyMsg.getVersion());
            fVar.mo27375a(C11365i.COLUMN_DELETED.ordinal() + 0, (long) propertyMsg.getDeleted());
            fVar.mo27375a(C11365i.COLUMN_CREATE_TIME.ordinal() + 0, propertyMsg.getCreatedTime());
            fVar.mo27375a(C11365i.COLUMN_SENDER.ordinal() + 0, propertyMsg.getSender());
            fVar.mo27376a(C11365i.COLUMN_CONTENT.ordinal() + 0, C11378t.m33467a(propertyMsg.getContent()));
            fVar.mo27376a(C11365i.COLUMN_EXT.ordinal() + 0, C11378t.m33467a(propertyMsg.getExtStr()));
            fVar.mo27376a(C11365i.COLUMN_LOCAL_INFO.ordinal() + 0, C11378t.m33467a(propertyMsg.getLocalExtStr()));
            fVar.mo27375a(C11365i.COLUMN_PRORERTY_ID.ordinal() + 0, (long) propertyMsg.getPropertyId());
            fVar.mo27376a(C11365i.COLUMN_PRORERTY_NAME.ordinal() + 0, C11378t.m33467a(propertyMsg.getPropertyName()));
            fVar.mo27375a(C11365i.COLUMN_REACTION_STATUS.ordinal() + 0, (long) propertyMsg.getReactionStatus());
        }
    }
}
