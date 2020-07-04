package com.bytedance.p263im.core.internal.p590db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.fts.C11359a;
import com.bytedance.p263im.core.internal.p590db.fts.DBFTSColumn;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p586b.C11209d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.l */
public class C11368l {

    /* renamed from: a */
    private static C11368l f30823a;

    private C11368l() {
    }

    /* renamed from: a */
    public static boolean m33381a(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder("update conversation_list set ");
        sb.append(C11326b.COLUMN_UPDATE_TIME.f30692t);
        sb.append("=");
        sb.append(System.currentTimeMillis());
        sb.append(" where ");
        sb.append(C11326b.COLUMN_ID.f30692t);
        sb.append("=\"");
        sb.append(str);
        sb.append("\"");
        return C11324d.m33211c(sb.toString());
    }

    /* renamed from: a */
    public static boolean m33382a(List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            sb.append(",");
        }
        String sb2 = sb.toString();
        C11324d.m33206a();
        StringBuilder sb3 = new StringBuilder("delete from conversation_list where ");
        sb3.append(C11326b.COLUMN_ID.f30692t);
        sb3.append(" in (");
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(")");
        boolean c = C11324d.m33211c(sb3.toString());
        if (c) {
            C11359a.m33339a().mo27385a(list, DBFTSColumn.COLUMN_CONVERSATION_ID.key);
        }
        return c;
    }

    /* renamed from: a */
    public static C11368l m33375a() {
        if (f30823a == null) {
            synchronized (C11368l.class) {
                if (f30823a == null) {
                    f30823a = new C11368l();
                }
            }
        }
        return f30823a;
    }

    /* renamed from: b */
    public static List<Conversation> m33383b() {
        ArrayList arrayList = new ArrayList();
        C11339b bVar = null;
        try {
            StringBuilder sb = new StringBuilder("select * from conversation_list order by ");
            sb.append(C11326b.COLUMN_UPDATE_TIME.f30692t);
            sb.append(" desc;");
            String sb2 = sb.toString();
            C11324d.m33206a();
            C11339b a = C11324d.m33207a(sb2, null);
            if (a != null) {
                while (a.mo27359d()) {
                    try {
                        arrayList.add(m33376a(a));
                    } catch (Exception e) {
                        C11339b bVar2 = a;
                        e = e;
                        bVar = bVar2;
                        try {
                            StringBuilder sb3 = new StringBuilder("getAllConversation ");
                            sb3.append(e);
                            C11404d.m33591d(sb3.toString());
                            C11209d.m32824a(e);
                            C11378t.m33468a(bVar);
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            C11378t.m33468a(bVar);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = a;
                        C11378t.m33468a(bVar);
                        throw th;
                    }
                }
            }
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            StringBuilder sb32 = new StringBuilder("getAllConversation ");
            sb32.append(e);
            C11404d.m33591d(sb32.toString());
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m33386c() {
        C11326b[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_list (");
        for (C11326b bVar : C11326b.values()) {
            sb.append(bVar.f30692t);
            sb.append(" ");
            sb.append(bVar.f30693u);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: c */
    public static boolean m33388c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder("update conversation_list set ");
        sb.append(C11326b.COLUMN_STATUS.f30692t);
        sb.append("=1");
        sb.append(" where ");
        sb.append(C11326b.COLUMN_ID.f30692t);
        sb.append("=\"");
        sb.append(str);
        sb.append("\"");
        return C11324d.m33211c(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bytedance.im.core.model.Conversation] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.bytedance.im.core.model.Conversation] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v4
      assigns: [?[OBJECT, ARRAY], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.bytedance.im.core.model.Conversation, com.bytedance.im.core.internal.db.b.b]
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
    public static com.bytedance.p263im.core.model.Conversation m33377a(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "select * from conversation_list where "
            r0.<init>(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.bytedance.im.core.internal.db.b r2 = com.bytedance.p263im.core.internal.p590db.C11326b.COLUMN_ID     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = r2.f30692t     // Catch:{ Exception -> 0x003c, all -> 0x003a }
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
            com.bytedance.im.core.model.Conversation r0 = m33376a(r4)     // Catch:{ Exception -> 0x0038 }
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
            java.lang.String r2 = "getConversation "
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.C11368l.m33377a(java.lang.String):com.bytedance.im.core.model.Conversation");
    }

    /* renamed from: d */
    public static boolean m33390d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11326b.COLUMN_ID.f30692t);
        sb.append("=?");
        boolean a = C11324d.m33209a("conversation_list", sb.toString(), new String[]{str});
        if (a) {
            C11375q.m33429a();
            C11375q.m33443b(str);
            C11373o.m33414a();
            C11373o.m33420b(str);
            C11367k.m33368a();
            C11367k.m33374b(str);
            C11369m.m33392a();
            C11369m.m33404d(str);
            C11376r.m33458a();
            C11376r.m33461a(str);
            C11359a.m33339a().mo27383a(str, DBFTSColumn.COLUMN_CONVERSATION_ID.key);
        }
        return a;
    }

    /* renamed from: a */
    public static List<Conversation> m33378a(int i) {
        ArrayList arrayList = new ArrayList();
        C11339b bVar = null;
        try {
            StringBuilder sb = new StringBuilder("select * from conversation_list order by ");
            sb.append(C11326b.COLUMN_UPDATE_TIME.f30692t);
            sb.append(" desc limit ");
            sb.append(i);
            sb.append(";");
            String sb2 = sb.toString();
            C11324d.m33206a();
            C11339b a = C11324d.m33207a(sb2, null);
            if (a != null) {
                while (a.mo27359d()) {
                    try {
                        arrayList.add(m33376a(a));
                    } catch (Exception e) {
                        Exception exc = e;
                        bVar = a;
                        e = exc;
                        try {
                            StringBuilder sb3 = new StringBuilder("getConversationLimit ");
                            sb3.append(e);
                            C11404d.m33591d(sb3.toString());
                            C11209d.m32824a(e);
                            C11378t.m33468a(bVar);
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            C11378t.m33468a(bVar);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = a;
                        C11378t.m33468a(bVar);
                        throw th;
                    }
                }
            }
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            StringBuilder sb32 = new StringBuilder("getConversationLimit ");
            sb32.append(e);
            C11404d.m33591d(sb32.toString());
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r9 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x007a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33384b(com.bytedance.p263im.core.model.Conversation r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x00d5
            java.lang.String r1 = r9.getConversationId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x000f
            goto L_0x00d5
        L_0x000f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r3.<init>()     // Catch:{ Exception -> 0x00c0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r4.<init>()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r5 = " replace into conversation_list("
            r3.append(r5)     // Catch:{ Exception -> 0x00c0 }
            com.bytedance.im.core.internal.db.b[] r5 = com.bytedance.p263im.core.internal.p590db.C11326b.values()     // Catch:{ Exception -> 0x00c0 }
            int r6 = r5.length     // Catch:{ Exception -> 0x00c0 }
            r7 = 0
        L_0x0029:
            if (r7 >= r6) goto L_0x003f
            r8 = r5[r7]     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r8 = r8.f30692t     // Catch:{ Exception -> 0x00c0 }
            r3.append(r8)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r8 = ","
            r3.append(r8)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r8 = "?,"
            r4.append(r8)     // Catch:{ Exception -> 0x00c0 }
            int r7 = r7 + 1
            goto L_0x0029
        L_0x003f:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r5.<init>()     // Catch:{ Exception -> 0x00c0 }
            int r6 = r3.length()     // Catch:{ Exception -> 0x00c0 }
            r7 = 1
            int r6 = r6 - r7
            java.lang.String r3 = r3.substring(r0, r6)     // Catch:{ Exception -> 0x00c0 }
            r5.append(r3)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = ") values ("
            r5.append(r3)     // Catch:{ Exception -> 0x00c0 }
            int r3 = r4.length()     // Catch:{ Exception -> 0x00c0 }
            int r3 = r3 - r7
            java.lang.String r3 = r4.substring(r0, r3)     // Catch:{ Exception -> 0x00c0 }
            r5.append(r3)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = ");"
            r5.append(r3)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x00c0 }
            com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x00c0 }
            com.bytedance.im.core.internal.db.b.f r3 = com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33212d(r3)     // Catch:{ Exception -> 0x00c0 }
            m33379a(r3, r9)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            int r2 = r3.mo27374a()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r2 <= 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r7 = 0
        L_0x0085:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            com.bytedance.im.core.model.ConversationCoreInfo r1 = r9.getCoreInfo()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            if (r1 == 0) goto L_0x0099
            com.bytedance.p263im.core.internal.p590db.C11367k.m33368a()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            com.bytedance.im.core.model.ConversationCoreInfo r1 = r9.getCoreInfo()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            com.bytedance.p263im.core.internal.p590db.C11367k.m33372a(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
        L_0x0099:
            com.bytedance.im.core.model.ConversationSettingInfo r1 = r9.getSettingInfo()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            if (r1 == 0) goto L_0x00a9
            com.bytedance.p263im.core.internal.p590db.C11373o.m33414a()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            com.bytedance.im.core.model.ConversationSettingInfo r1 = r9.getSettingInfo()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            com.bytedance.p263im.core.internal.p590db.C11373o.m33418a(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
        L_0x00a9:
            com.bytedance.im.core.internal.db.fts.a r1 = com.bytedance.p263im.core.internal.p590db.fts.C11359a.m33339a()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            r1.mo27386a(r0, r9)     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            com.bytedance.p263im.core.internal.p590db.C11378t.m33469a(r3)
            r1 = r2
            goto L_0x00cc
        L_0x00b5:
            r9 = move-exception
            r1 = r2
            goto L_0x00bc
        L_0x00b8:
            r9 = move-exception
            r2 = r3
            goto L_0x00d1
        L_0x00bb:
            r9 = move-exception
        L_0x00bc:
            r2 = r3
            goto L_0x00c1
        L_0x00be:
            r9 = move-exception
            goto L_0x00d1
        L_0x00c0:
            r9 = move-exception
        L_0x00c1:
            java.lang.String r0 = "updateConversation "
            com.bytedance.p263im.core.internal.utils.C11404d.m33585a(r0, r9)     // Catch:{ all -> 0x00be }
            com.bytedance.p263im.core.p586b.C11209d.m32824a(r9)     // Catch:{ all -> 0x00be }
            com.bytedance.p263im.core.internal.p590db.C11378t.m33469a(r2)
        L_0x00cc:
            boolean r9 = r1.booleanValue()
            return r9
        L_0x00d1:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33469a(r2)
            throw r9
        L_0x00d5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.C11368l.m33384b(com.bytedance.im.core.model.Conversation):boolean");
    }

    /* renamed from: c */
    public static boolean m33387c(Conversation conversation) {
        boolean z;
        if (conversation == null || TextUtils.isEmpty(conversation.getConversationId())) {
            return false;
        }
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11326b.COLUMN_ID.f30692t);
            sb.append("=?");
            z = C11324d.m33209a("conversation_list", sb.toString(), new String[]{conversation.getConversationId()});
            if (z) {
                try {
                    C11324d.m33206a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
                    sb2.append("=?");
                    C11324d.m33209a("msg", sb2.toString(), new String[]{conversation.getConversationId()});
                    C11373o.m33414a();
                    C11373o.m33420b(conversation.getConversationId());
                    C11367k.m33368a();
                    C11367k.m33374b(conversation.getConversationId());
                    C11369m.m33392a();
                    C11369m.m33404d(conversation.getConversationId());
                    C11359a.m33339a().mo27383a(conversation.getConversationId(), DBFTSColumn.COLUMN_CONVERSATION_ID.key);
                } catch (Exception e) {
                    e = e;
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
            C11404d.m33585a("deleteConversation", (Throwable) e);
            C11209d.m32824a(e);
            return z;
        }
        return z;
    }

    /* renamed from: a */
    private static Conversation m33376a(C11339b bVar) {
        boolean z;
        if (bVar == null) {
            return null;
        }
        Conversation conversation = new Conversation();
        conversation.setConversationId(bVar.mo27357c(bVar.mo27353a(C11326b.COLUMN_ID.f30692t)));
        conversation.setConversationShortId(bVar.mo27356b(bVar.mo27353a(C11326b.COLUMN_SHORT_ID.f30692t)));
        conversation.setUpdatedTime(bVar.mo27356b(bVar.mo27353a(C11326b.COLUMN_UPDATE_TIME.f30692t)));
        conversation.setUnreadCount((long) bVar.mo27352a(bVar.mo27353a(C11326b.COLUMN_UNREAD_COUNT.f30692t)));
        conversation.setTicket(bVar.mo27357c(bVar.mo27353a(C11326b.COLUMN_COLUMN_TICKET.f30692t)));
        conversation.setConversationType(bVar.mo27352a(bVar.mo27353a(C11326b.COLUMN_CONVERSATION_TYPE.f30692t)));
        conversation.setDraftTime(bVar.mo27356b(bVar.mo27353a(C11326b.COLUMN_DRAFT_TIME.f30692t)));
        conversation.setDraftContent(bVar.mo27357c(bVar.mo27353a(C11326b.COLUMN_DRAFT_CONTENT.f30692t)));
        conversation.setMinIndex(bVar.mo27356b(bVar.mo27353a(C11326b.COLUMN_MIN_INDEX.f30692t)));
        conversation.setLocalExtStr(bVar.mo27357c(bVar.mo27353a(C11326b.COLUMN_LOCAL_INFO.f30692t)));
        conversation.setReadIndex(bVar.mo27356b(bVar.mo27353a(C11326b.COLUMN_READ_INDEX.f30692t)));
        conversation.setLastMessageIndex(bVar.mo27356b(bVar.mo27353a(C11326b.COLUMN_LAST_MSG_INDEX.f30692t)));
        conversation.setInboxType(bVar.mo27352a(bVar.mo27353a(C11326b.COLUMN_INBOX.f30692t)));
        boolean z2 = false;
        if (bVar.mo27352a(bVar.mo27353a(C11326b.COLUMN_IS_MEMBER.f30692t)) == 1) {
            z = true;
        } else {
            z = false;
        }
        conversation.setIsMember(z);
        if (bVar.mo27352a(bVar.mo27353a(C11326b.COLUMN_HAS_MORE.f30692t)) == 1) {
            z2 = true;
        }
        conversation.setHasMore(z2);
        conversation.setMemberCount(bVar.mo27352a(bVar.mo27353a(C11326b.COLUMN_MEMBER_COUNT.f30692t)));
        conversation.setStatus(bVar.mo27352a(bVar.mo27353a(C11326b.COLUMN_STATUS.f30692t)));
        conversation.setMemberStr(bVar.mo27357c(bVar.mo27353a(C11326b.COLUMN_PARTICIPANT.f30692t)));
        C11369m.m33392a();
        conversation.setMemberIds(C11369m.m33395a(conversation.getConversationId()));
        C11375q.m33429a();
        conversation.setLastMessage(C11375q.m33450h(conversation.getConversationId()));
        C11367k.m33368a();
        conversation.setCoreInfo(C11367k.m33370a(conversation.getConversationId()));
        C11373o.m33414a();
        conversation.setSettingInfo(C11373o.m33416a(conversation.getConversationId()));
        C11374p.m33421a();
        conversation.setMentionMessages(C11374p.m33422a(conversation.getConversationId(), conversation.getReadIndex()));
        conversation.setLastMessageOrderIndex(bVar.mo27356b(bVar.mo27353a(C11326b.COLUMN_LAST_MSG_ORDER_INDEX.f30692t)));
        return conversation;
    }

    /* renamed from: b */
    public static boolean m33385b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from conversation_list where ");
            sb.append(C11326b.COLUMN_ID.f30692t);
            sb.append("=?");
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            try {
                if (a.mo27355b() > 0) {
                    z = true;
                }
                C11378t.m33468a(a);
                return z;
            } catch (Exception e) {
                Exception exc = e;
                bVar = a;
                e = exc;
                try {
                    C11404d.m33585a("getConversation ", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33468a(bVar);
                    return false;
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
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("getConversation ", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return false;
        }
    }

    /* renamed from: d */
    private static ContentValues m33389d(Conversation conversation) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11326b.COLUMN_ID.f30692t, conversation.getConversationId());
        contentValues.put(C11326b.COLUMN_SHORT_ID.f30692t, Long.valueOf(conversation.getConversationShortId()));
        contentValues.put(C11326b.COLUMN_LAST_MSG_INDEX.f30692t, Long.valueOf(conversation.getLastMessageIndex()));
        contentValues.put(C11326b.COLUMN_UPDATE_TIME.f30692t, Long.valueOf(conversation.getUpdatedTime()));
        contentValues.put(C11326b.COLUMN_UNREAD_COUNT.f30692t, Long.valueOf(conversation.getUnreadCount()));
        contentValues.put(C11326b.COLUMN_COLUMN_TICKET.f30692t, conversation.getTicket());
        contentValues.put(C11326b.COLUMN_CONVERSATION_TYPE.f30692t, Integer.valueOf(conversation.getConversationType()));
        contentValues.put(C11326b.COLUMN_DRAFT_TIME.f30692t, Long.valueOf(conversation.getDraftTime()));
        contentValues.put(C11326b.COLUMN_DRAFT_CONTENT.f30692t, conversation.getDraftContent());
        contentValues.put(C11326b.COLUMN_MIN_INDEX.f30692t, Long.valueOf(conversation.getMinIndex()));
        contentValues.put(C11326b.COLUMN_LOCAL_INFO.f30692t, conversation.getLocalExtStr());
        contentValues.put(C11326b.COLUMN_READ_INDEX.f30692t, Long.valueOf(conversation.getReadIndex()));
        contentValues.put(C11326b.COLUMN_INBOX.f30692t, Integer.valueOf(conversation.getInboxType()));
        contentValues.put(C11326b.COLUMN_IS_MEMBER.f30692t, Integer.valueOf(conversation.isMember() ? 1 : 0));
        contentValues.put(C11326b.COLUMN_HAS_MORE.f30692t, Integer.valueOf(conversation.hasMore() ? 1 : 0));
        contentValues.put(C11326b.COLUMN_MEMBER_COUNT.f30692t, Integer.valueOf(conversation.getMemberCount()));
        contentValues.put(C11326b.COLUMN_STATUS.f30692t, Integer.valueOf(conversation.getStatus()));
        contentValues.put(C11326b.COLUMN_PARTICIPANT.f30692t, conversation.getMemberStr());
        contentValues.put(C11326b.COLUMN_LAST_MSG_ORDER_INDEX.f30692t, Long.valueOf(conversation.getLastMessageOrderIndex()));
        return contentValues;
    }

    /* renamed from: a */
    public static boolean m33380a(Conversation conversation) {
        boolean z = false;
        if (conversation == null || TextUtils.isEmpty(conversation.getConversationId())) {
            return false;
        }
        ContentValues d = m33389d(conversation);
        if (conversation.getCoreInfo() != null) {
            C11367k.m33368a();
            C11367k.m33372a(conversation.getCoreInfo());
        }
        if (conversation.getSettingInfo() != null) {
            C11373o.m33414a();
            C11373o.m33418a(conversation.getSettingInfo());
        }
        C11324d.m33206a();
        if (C11324d.m33205a("conversation_list", (String) null, d) >= 0) {
            z = true;
        }
        if (z) {
            C11359a.m33339a().mo27386a(true, (Object) conversation);
        }
        return z;
    }

    /* renamed from: a */
    private static void m33379a(C11354f fVar, Conversation conversation) {
        long j;
        if (fVar != null && conversation != null) {
            fVar.mo27379d();
            fVar.mo27376a(C11326b.COLUMN_ID.ordinal() + 1, C11378t.m33467a(conversation.getConversationId()));
            fVar.mo27375a(C11326b.COLUMN_SHORT_ID.ordinal() + 1, conversation.getConversationShortId());
            fVar.mo27375a(C11326b.COLUMN_CONVERSATION_TYPE.ordinal() + 1, (long) conversation.getConversationType());
            fVar.mo27375a(C11326b.COLUMN_LAST_MSG_INDEX.ordinal() + 1, conversation.getLastMessageIndex());
            fVar.mo27375a(C11326b.COLUMN_UPDATE_TIME.ordinal() + 1, conversation.getUpdatedTime());
            fVar.mo27375a(C11326b.COLUMN_UNREAD_COUNT.ordinal() + 1, conversation.getUnreadCount());
            fVar.mo27375a(C11326b.COLUMN_READ_INDEX.ordinal() + 1, conversation.getReadIndex());
            fVar.mo27375a(C11326b.COLUMN_MIN_INDEX.ordinal() + 1, conversation.getMinIndex());
            fVar.mo27375a(C11326b.COLUMN_DRAFT_TIME.ordinal() + 1, conversation.getDraftTime());
            fVar.mo27376a(C11326b.COLUMN_COLUMN_TICKET.ordinal() + 1, C11378t.m33467a(conversation.getTicket()));
            fVar.mo27376a(C11326b.COLUMN_DRAFT_CONTENT.ordinal() + 1, C11378t.m33467a(conversation.getDraftContent()));
            fVar.mo27376a(C11326b.COLUMN_LOCAL_INFO.ordinal() + 1, C11378t.m33467a(conversation.getLocalExtStr()));
            fVar.mo27375a(C11326b.COLUMN_INBOX.ordinal() + 1, (long) conversation.getInboxType());
            int ordinal = C11326b.COLUMN_IS_MEMBER.ordinal() + 1;
            long j2 = 0;
            if (conversation.isMember()) {
                j = 1;
            } else {
                j = 0;
            }
            fVar.mo27375a(ordinal, j);
            int ordinal2 = C11326b.COLUMN_HAS_MORE.ordinal() + 1;
            if (conversation.hasMore()) {
                j2 = 1;
            }
            fVar.mo27375a(ordinal2, j2);
            fVar.mo27375a(C11326b.COLUMN_MEMBER_COUNT.ordinal() + 1, (long) conversation.getMemberCount());
            fVar.mo27375a(C11326b.COLUMN_STATUS.ordinal() + 1, (long) conversation.getStatus());
            fVar.mo27376a(C11326b.COLUMN_PARTICIPANT.ordinal() + 1, conversation.getMemberStr());
            fVar.mo27375a(C11326b.COLUMN_LAST_MSG_ORDER_INDEX.ordinal() + 1, conversation.getLastMessageOrderIndex());
        }
    }
}
