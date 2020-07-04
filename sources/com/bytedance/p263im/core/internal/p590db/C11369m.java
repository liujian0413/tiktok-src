package com.bytedance.p263im.core.internal.p590db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.fts.C11359a;
import com.bytedance.p263im.core.internal.p590db.fts.C11362b;
import com.bytedance.p263im.core.internal.p590db.fts.DBFTSColumn;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p586b.C11209d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.m */
public class C11369m {

    /* renamed from: a */
    private static C11369m f30824a;

    private C11369m() {
    }

    /* renamed from: a */
    public static boolean m33397a(String str, int i, List<Member> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        ArrayList<Member> arrayList = new ArrayList<>();
        C11324d.m33206a();
        C11324d.m33208a("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        for (Member member : list) {
            if (member != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C11363g.COLUMN_SORT_ORDER.f30788g, Long.valueOf(member.getSortOrder()));
                contentValues.put(C11363g.COLUMN_ROLE.f30788g, Integer.valueOf(member.getRole()));
                contentValues.put(C11363g.COLUMN_ALIAS.f30788g, member.getAlias());
                contentValues.put(C11363g.COLUMN_SEC_UID.f30788g, member.getSecUid());
                C11324d.m33206a();
                StringBuilder sb = new StringBuilder();
                sb.append(C11363g.COLUMN_USER_ID.f30788g);
                sb.append("=? AND ");
                sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
                sb.append("=?");
                if (C11324d.m33204a("participant", contentValues, sb.toString(), new String[]{String.valueOf(member.getUid()), str}) <= 0) {
                    member.setConversationType(i);
                    arrayList.add(member);
                } else {
                    C11359a.m33339a().mo27386a(false, (Object) member);
                }
            }
        }
        for (Member member2 : arrayList) {
            ContentValues a = m33391a(member2);
            C11324d.m33206a();
            if (C11324d.m33205a("participant", (String) null, a) > 0) {
                C11359a.m33339a().mo27386a(true, (Object) member2);
            }
        }
        C11324d.m33206a();
        C11324d.m33210b("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        C11407f.m33601a().mo27468h(list);
        return true;
    }

    /* renamed from: a */
    public static C11369m m33392a() {
        if (f30824a == null) {
            synchronized (C11369m.class) {
                if (f30824a == null) {
                    f30824a = new C11369m();
                }
            }
        }
        return f30824a;
    }

    /* renamed from: b */
    public static String m33399b() {
        C11363g[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant(");
        for (C11363g gVar : C11363g.values()) {
            sb.append(gVar.f30788g);
            sb.append(" ");
            sb.append(gVar.f30789h);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: d */
    public static boolean m33404d(String str) {
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
        sb.append("=?");
        boolean a = C11324d.m33209a("participant", sb.toString(), new String[]{str});
        if (a) {
            C11359a.m33339a().mo27384a(str, DBFTSColumn.COLUMN_CONVERSATION_ID.key, 3);
        }
        return a;
    }

    /* renamed from: a */
    private static ContentValues m33391a(Member member) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11363g.COLUMN_USER_ID.f30788g, Long.valueOf(member.getUid()));
        contentValues.put(C11363g.COLUMN_ALIAS.f30788g, member.getAlias());
        contentValues.put(C11363g.COLUMN_CONVERSATION_ID.f30788g, member.getConversationId());
        contentValues.put(C11363g.COLUMN_ROLE.f30788g, Integer.valueOf(member.getRole()));
        contentValues.put(C11363g.COLUMN_SORT_ORDER.f30788g, Long.valueOf(member.getSortOrder()));
        contentValues.put(C11363g.COLUMN_SEC_UID.f30788g, member.getSecUid());
        return contentValues;
    }

    /* renamed from: a */
    private static Member m33393a(C11339b bVar) {
        Member member = new Member();
        member.setAlias(bVar.mo27357c(bVar.mo27353a(C11363g.COLUMN_ALIAS.f30788g)));
        member.setConversationId(bVar.mo27357c(bVar.mo27353a(C11363g.COLUMN_CONVERSATION_ID.f30788g)));
        member.setRole(bVar.mo27352a(bVar.mo27353a(C11363g.COLUMN_ROLE.f30788g)));
        member.setSortOrder((long) bVar.mo27352a(bVar.mo27353a(C11363g.COLUMN_SORT_ORDER.f30788g)));
        member.setUid(bVar.mo27356b(bVar.mo27353a(C11363g.COLUMN_USER_ID.f30788g)));
        member.setSecUid(bVar.mo27357c(bVar.mo27353a(C11363g.COLUMN_SEC_UID.f30788g)));
        return member;
    }

    /* renamed from: c */
    public static long m33403c(String str) {
        StringBuilder sb = new StringBuilder("select * from participant where ");
        sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
        sb.append("=? order by ");
        sb.append(C11363g.COLUMN_SORT_ORDER.f30788g);
        sb.append(" desc limit 1");
        String sb2 = sb.toString();
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            C11339b a = C11324d.m33207a(sb2, new String[]{str});
            if (a != null) {
                try {
                    if (a.mo27358c()) {
                        long b = a.mo27356b(a.mo27353a(C11363g.COLUMN_SORT_ORDER.f30788g));
                        C11378t.m33468a(a);
                        return b;
                    }
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11404d.m33585a("removeMemberOverOrder", (Throwable) e);
                        C11209d.m32824a(e);
                        C11378t.m33468a(bVar);
                        return 0;
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
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("removeMemberOverOrder", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return 0;
        }
        return 0;
    }

    /* renamed from: b */
    public static List<Member> m33400b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from participant where ");
            sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
            sb.append("=? order by ");
            sb.append(C11363g.COLUMN_SORT_ORDER.f30788g);
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            while (a.mo27359d()) {
                try {
                    arrayList.add(m33393a(a));
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11404d.m33585a("getMemberList", (Throwable) e);
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
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("getMemberList", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Long> m33395a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from participant where ");
            sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
            sb.append("=? order by ");
            sb.append(C11363g.COLUMN_SORT_ORDER.f30788g);
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            int i = -1;
            while (a.mo27359d()) {
                try {
                    if (i < 0) {
                        i = a.mo27353a(C11363g.COLUMN_USER_ID.f30788g);
                    }
                    arrayList.add(Long.valueOf(a.mo27356b(i)));
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11404d.m33585a("getMemberId", (Throwable) e);
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
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("getMemberId", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static int m33398b(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        C11324d.m33206a();
        C11324d.m33208a("IMConversationMemberDao.removeMember(String,List)");
        int i = 0;
        for (Long l : list) {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
            sb.append("=? AND ");
            sb.append(C11363g.COLUMN_USER_ID.f30788g);
            sb.append("=?");
            if (C11324d.m33209a("participant", sb.toString(), new String[]{str, String.valueOf(l)})) {
                i++;
                C11362b.m33353a();
                C11362b.m33355a(str, String.valueOf(l));
            }
        }
        C11324d.m33206a();
        C11324d.m33210b("IMConversationMemberDao.removeMember(String,List)");
        return i;
    }

    /* renamed from: c */
    public static int m33402c(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Long l : list) {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
            sb.append("=? AND ");
            sb.append(C11363g.COLUMN_USER_ID.f30788g);
            sb.append("=?");
            if (C11324d.m33209a("participant", sb.toString(), new String[]{str, String.valueOf(l)})) {
                i++;
                C11362b.m33353a();
                C11362b.m33355a(str, String.valueOf(l));
            }
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.bytedance.im.core.model.Member] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.bytedance.im.core.internal.db.b.b] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [com.bytedance.im.core.model.Member] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
      assigns: []
      uses: []
      mth insns count: 67
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
    /* JADX WARNING: Unknown variable types count: 9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.p263im.core.model.Member m33394a(java.lang.String r5, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0097
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x000f
            goto L_0x0097
        L_0x000f:
            com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33206a()     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "select * from participant where "
            r0.<init>(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.db.g r2 = com.bytedance.p263im.core.internal.p590db.C11363g.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.f30788g     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "=?  and "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.db.g r2 = com.bytedance.p263im.core.internal.p590db.C11363g.COLUMN_USER_ID     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.f30788g     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "=? and "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.db.g r2 = com.bytedance.p263im.core.internal.p590db.C11363g.COLUMN_ROLE     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.f30788g     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = " in ("
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.p263im.core.proto.GroupRole.OWNER     // Catch:{ Exception -> 0x0085 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = ","
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.p263im.core.proto.GroupRole.MANAGER     // Catch:{ Exception -> 0x0085 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = ") "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0085 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0085 }
            r3 = 0
            r2[r3] = r5     // Catch:{ Exception -> 0x0085 }
            r5 = 1
            r2[r5] = r6     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.internal.db.b.b r5 = com.bytedance.p263im.core.internal.p590db.p591a.C11324d.m33207a(r0, r2)     // Catch:{ Exception -> 0x0085 }
        L_0x006a:
            boolean r6 = r5.mo27359d()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            if (r6 == 0) goto L_0x0076
            com.bytedance.im.core.model.Member r6 = m33393a(r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r1 = r6
            goto L_0x006a
        L_0x0076:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r5)
            r5 = r1
            goto L_0x0092
        L_0x007b:
            r6 = move-exception
            r1 = r5
            goto L_0x0093
        L_0x007e:
            r6 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L_0x0087
        L_0x0083:
            r6 = move-exception
            goto L_0x0093
        L_0x0085:
            r6 = move-exception
            r5 = r1
        L_0x0087:
            java.lang.String r0 = "queryMember"
            com.bytedance.p263im.core.internal.utils.C11404d.m33585a(r0, r6)     // Catch:{ all -> 0x0083 }
            com.bytedance.p263im.core.p586b.C11209d.m32824a(r6)     // Catch:{ all -> 0x0083 }
            com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r1)
        L_0x0092:
            return r5
        L_0x0093:
            com.bytedance.p263im.core.internal.p590db.C11378t.m33468a(r1)
            throw r6
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.C11369m.m33394a(java.lang.String, java.lang.String):com.bytedance.im.core.model.Member");
    }

    /* renamed from: a */
    public static List<Member> m33396a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from participant where ");
            sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
            sb.append("=? and ");
            sb.append(C11363g.COLUMN_USER_ID.f30788g);
            sb.append(" in (");
            sb.append(C11377s.m33466a(list, ","));
            sb.append(") order by ");
            sb.append(C11363g.COLUMN_SORT_ORDER.f30788g);
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            while (a.mo27359d()) {
                try {
                    arrayList.add(m33393a(a));
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11404d.m33585a("getMemberList", (Throwable) e);
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
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("getMemberList", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m33401b(String str, int i, List<Member> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        ArrayList<Member> arrayList = new ArrayList<>();
        for (Member member : list) {
            if (member != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C11363g.COLUMN_SORT_ORDER.f30788g, Long.valueOf(member.getSortOrder()));
                contentValues.put(C11363g.COLUMN_ROLE.f30788g, Integer.valueOf(member.getRole()));
                contentValues.put(C11363g.COLUMN_ALIAS.f30788g, member.getAlias());
                contentValues.put(C11363g.COLUMN_SEC_UID.f30788g, member.getSecUid());
                C11324d.m33206a();
                StringBuilder sb = new StringBuilder();
                sb.append(C11363g.COLUMN_USER_ID.f30788g);
                sb.append("=? AND ");
                sb.append(C11363g.COLUMN_CONVERSATION_ID.f30788g);
                sb.append("=?");
                if (C11324d.m33204a("participant", contentValues, sb.toString(), new String[]{String.valueOf(member.getUid()), str}) <= 0) {
                    member.setConversationType(i);
                    arrayList.add(member);
                } else {
                    C11359a.m33339a().mo27386a(false, (Object) member);
                }
            }
        }
        for (Member member2 : arrayList) {
            ContentValues a = m33391a(member2);
            C11324d.m33206a();
            if (C11324d.m33205a("participant", (String) null, a) > 0) {
                C11359a.m33339a().mo27386a(true, (Object) member2);
            }
        }
        C11407f.m33601a().mo27468h(list);
        return true;
    }
}
