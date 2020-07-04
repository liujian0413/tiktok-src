package com.bytedance.p263im.core.internal.p590db;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.p586b.C11209d;

/* renamed from: com.bytedance.im.core.internal.db.k */
public class C11367k {

    /* renamed from: a */
    private static C11367k f30822a;

    private C11367k() {
    }

    /* renamed from: a */
    public static C11367k m33368a() {
        if (f30822a == null) {
            synchronized (C11367k.class) {
                if (f30822a == null) {
                    f30822a = new C11367k();
                }
            }
        }
        return f30822a;
    }

    /* renamed from: b */
    public static String m33373b() {
        C11355c[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_core (");
        for (C11355c cVar : C11355c.values()) {
            sb.append(cVar.f30731j);
            sb.append(" ");
            sb.append(cVar.f30732k);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: b */
    public static boolean m33374b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11355c.COLUMN_ID.f30731j);
        sb.append("=?");
        return C11324d.m33209a("conversation_core", sb.toString(), new String[]{str});
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bytedance.im.core.model.ConversationCoreInfo] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.bytedance.im.core.model.ConversationCoreInfo] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v4
      assigns: [?[OBJECT, ARRAY], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.bytedance.im.core.model.ConversationCoreInfo, com.bytedance.im.core.internal.db.b.b]
      mth insns count: 39
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.p263im.core.model.ConversationCoreInfo m33370a(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "select * from conversation_core where "
            r0.<init>(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.bytedance.im.core.internal.db.c r2 = com.bytedance.p263im.core.internal.p590db.C11355c.COLUMN_ID     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = r2.f30731j     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r0.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "=?"
            r0.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3 = 0
            r2[r3] = r4     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.bytedance.im.core.internal.db.b.b r4 = com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33207a(r0, r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            boolean r0 = r4.mo27358c()     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0046
            com.bytedance.im.core.model.ConversationCoreInfo r0 = m33369a(r4)     // Catch:{ Exception -> 0x0038 }
            r1 = r0
            goto L_0x0046
        L_0x0038:
            r0 = move-exception
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            goto L_0x004c
        L_0x003c:
            r0 = move-exception
            r4 = r1
        L_0x003e:
            java.lang.String r2 = "get "
            com.bytedance.p263im.core.internal.utils.C11404d.m33585a(r2, r0)     // Catch:{ all -> 0x004a }
            com.bytedance.p263im.core.p586b.C11209d.m32824a(r0)     // Catch:{ all -> 0x004a }
        L_0x0046:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r4)
            return r1
        L_0x004a:
            r0 = move-exception
            r1 = r4
        L_0x004c:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.C11367k.m33370a(java.lang.String):com.bytedance.im.core.model.ConversationCoreInfo");
    }

    /* renamed from: a */
    private static ConversationCoreInfo m33369a(C11339b bVar) {
        if (bVar == null) {
            return null;
        }
        ConversationCoreInfo conversationCoreInfo = new ConversationCoreInfo();
        conversationCoreInfo.setConversationId(bVar.mo27357c(bVar.mo27353a(C11355c.COLUMN_ID.f30731j)));
        conversationCoreInfo.setVersion(bVar.mo27356b(bVar.mo27353a(C11355c.COLUMN_VERSION.f30731j)));
        conversationCoreInfo.setName(bVar.mo27357c(bVar.mo27353a(C11355c.COLUMN_NAME.f30731j)));
        conversationCoreInfo.setIcon(bVar.mo27357c(bVar.mo27353a(C11355c.COLUMN_ICON.f30731j)));
        conversationCoreInfo.setDesc(bVar.mo27357c(bVar.mo27353a(C11355c.COLUMN_DESC.f30731j)));
        conversationCoreInfo.setNotice(bVar.mo27357c(bVar.mo27353a(C11355c.COLUMN_NOTICE.f30731j)));
        conversationCoreInfo.setOwner(bVar.mo27356b(bVar.mo27353a(C11355c.COLUMN_OWNER_ID.f30731j)));
        conversationCoreInfo.setSecOwner(bVar.mo27357c(bVar.mo27353a(C11355c.COLUMN_SEC_OWNER.f30731j)));
        conversationCoreInfo.setExtStr(bVar.mo27357c(bVar.mo27353a(C11355c.COLUMN_EXT.f30731j)));
        return conversationCoreInfo;
    }

    /* renamed from: a */
    public static boolean m33372a(ConversationCoreInfo conversationCoreInfo) {
        Boolean bool;
        boolean z = false;
        if (conversationCoreInfo == null || TextUtils.isEmpty(conversationCoreInfo.getConversationId())) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(false);
        C11354f fVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into conversation_core(");
            for (C11355c cVar : C11355c.values()) {
                sb.append(cVar.f30731j);
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
                m33371a(d, conversationCoreInfo);
                if (d.mo27374a() > 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                C11378t.m33469a(d);
            } catch (Exception e) {
                e = e;
                fVar = d;
                try {
                    C11404d.m33585a("insertOrUpdate ", (Throwable) e);
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
            C11404d.m33585a("insertOrUpdate ", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33469a(fVar);
            bool = valueOf;
            return bool.booleanValue();
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    private static void m33371a(C11354f fVar, ConversationCoreInfo conversationCoreInfo) {
        if (fVar != null && conversationCoreInfo != null) {
            fVar.mo27379d();
            fVar.mo27376a(C11355c.COLUMN_ID.ordinal() + 1, C11378t.m33467a(conversationCoreInfo.getConversationId()));
            fVar.mo27375a(C11355c.COLUMN_VERSION.ordinal() + 1, conversationCoreInfo.getVersion());
            fVar.mo27376a(C11355c.COLUMN_NAME.ordinal() + 1, C11378t.m33467a(conversationCoreInfo.getName()));
            fVar.mo27376a(C11355c.COLUMN_ICON.ordinal() + 1, C11378t.m33467a(conversationCoreInfo.getIcon()));
            fVar.mo27376a(C11355c.COLUMN_DESC.ordinal() + 1, C11378t.m33467a(conversationCoreInfo.getDesc()));
            fVar.mo27376a(C11355c.COLUMN_NOTICE.ordinal() + 1, C11378t.m33467a(conversationCoreInfo.getNotice()));
            fVar.mo27375a(C11355c.COLUMN_OWNER_ID.ordinal() + 1, conversationCoreInfo.getOwner());
            fVar.mo27376a(C11355c.COLUMN_SEC_OWNER.ordinal() + 1, C11378t.m33467a(conversationCoreInfo.getSecOwner()));
            fVar.mo27376a(C11355c.COLUMN_EXT.ordinal() + 1, C11378t.m33467a(conversationCoreInfo.getExtStr()));
        }
    }
}
