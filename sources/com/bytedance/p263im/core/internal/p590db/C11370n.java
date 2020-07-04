package com.bytedance.p263im.core.internal.p590db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.C11468l;
import com.bytedance.p263im.core.p586b.C11209d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.db.n */
public final class C11370n {

    /* renamed from: com.bytedance.im.core.internal.db.n$a */
    static class C11372a {

        /* renamed from: a */
        public static C11370n f30825a = new C11370n();
    }

    private C11370n() {
    }

    /* renamed from: a */
    public static C11370n m33407a() {
        return C11372a.f30825a;
    }

    /* renamed from: b */
    public static String m33410b() {
        C11364h[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant_read(");
        for (C11364h hVar : C11364h.values()) {
            sb.append(hVar.f30796f);
            sb.append(" ");
            sb.append(hVar.f30797g);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    private static ContentValues m33406a(C11468l lVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11364h.COLUMN_CONVERSATION_ID.f30796f, lVar.f31021a);
        contentValues.put(C11364h.COLUMN_USER_ID.f30796f, Long.valueOf(lVar.f31022b));
        contentValues.put(C11364h.COLUMN_MIN_INDEX.f30796f, Long.valueOf(lVar.f31023c));
        contentValues.put(C11364h.COLUMN_READ_INDEX.f30796f, Long.valueOf(lVar.f31024d));
        contentValues.put(C11364h.COLUMN_READ_ORDER.f30796f, Long.valueOf(lVar.f31025e));
        return contentValues;
    }

    /* renamed from: b */
    private static List<Long> m33411b(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from participant_read where ");
            sb.append(C11364h.COLUMN_CONVERSATION_ID.f30796f);
            sb.append("=? ");
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            int i = -1;
            while (a.mo27359d()) {
                try {
                    if (i < 0) {
                        i = a.mo27353a(C11364h.COLUMN_USER_ID.f30796f);
                    }
                    arrayList.add(Long.valueOf(a.mo27356b(i)));
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11404d.m33585a("getMemberIdList", (Throwable) e);
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
            C11404d.m33585a("getMemberIdList", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C11468l m33408a(C11339b bVar) {
        C11468l lVar = new C11468l();
        lVar.f31021a = bVar.mo27357c(bVar.mo27353a(C11364h.COLUMN_CONVERSATION_ID.f30796f));
        lVar.f31022b = bVar.mo27356b(bVar.mo27353a(C11364h.COLUMN_USER_ID.f30796f));
        lVar.mo27677a(bVar.mo27356b(bVar.mo27353a(C11364h.COLUMN_MIN_INDEX.f30796f)));
        lVar.mo27679b(bVar.mo27356b(bVar.mo27353a(C11364h.COLUMN_READ_INDEX.f30796f)));
        lVar.mo27681c(bVar.mo27356b(bVar.mo27353a(C11364h.COLUMN_READ_ORDER.f30796f)));
        return lVar;
    }

    /* renamed from: a */
    private static List<C11468l> m33409a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from participant_read where ");
            sb.append(C11364h.COLUMN_CONVERSATION_ID.f30796f);
            sb.append("=? ");
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            while (a.mo27359d()) {
                try {
                    arrayList.add(m33408a(a));
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
    private static int m33405a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Long l : list) {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder();
            sb.append(C11364h.COLUMN_CONVERSATION_ID.f30796f);
            sb.append("=? AND ");
            sb.append(C11364h.COLUMN_USER_ID.f30796f);
            sb.append("=?");
            if (C11324d.m33209a("participant_read", sb.toString(), new String[]{str, String.valueOf(l)})) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final Map<Long, C11468l> mo27392b(String str, Map<Long, C11468l> map) {
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        List a = m33409a(str);
        if (!a.isEmpty()) {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C11468l lVar = (C11468l) a.get(i);
                if (lVar != null) {
                    long j = lVar.f31022b;
                    if (map == null) {
                        map = new HashMap<>();
                        map.put(Long.valueOf(j), lVar.clone());
                    } else {
                        C11468l lVar2 = (C11468l) map.get(Long.valueOf(j));
                        if (lVar2 == null) {
                            lVar2 = new C11468l();
                        }
                        lVar2.mo27678a(lVar);
                        map.put(Long.valueOf(j), lVar2);
                    }
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    public final boolean mo27391a(String str, Map<Long, C11468l> map) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet(m33411b(str));
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.addAll(hashSet2);
        hashSet3.removeAll(hashSet);
        ArrayList arrayList = new ArrayList(hashSet3);
        ArrayList<C11468l> arrayList2 = new ArrayList<>(map.values());
        HashSet<C11468l> hashSet4 = new HashSet<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C11324d.m33206a();
        C11324d.m33208a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        for (C11468l lVar : arrayList2) {
            if (lVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C11364h.COLUMN_MIN_INDEX.f30796f, Long.valueOf(lVar.f31023c));
                contentValues.put(C11364h.COLUMN_READ_INDEX.f30796f, Long.valueOf(lVar.f31024d));
                contentValues.put(C11364h.COLUMN_READ_ORDER.f30796f, Long.valueOf(lVar.f31025e));
                C11324d.m33206a();
                StringBuilder sb = new StringBuilder();
                sb.append(C11364h.COLUMN_USER_ID.f30796f);
                sb.append("=? AND ");
                sb.append(C11364h.COLUMN_CONVERSATION_ID.f30796f);
                sb.append("=?");
                if (C11324d.m33204a("participant_read", contentValues, sb.toString(), new String[]{String.valueOf(lVar.f31022b), str}) <= 0) {
                    hashSet4.add(lVar);
                    arrayList4.add(Long.valueOf(lVar.f31022b));
                } else {
                    arrayList3.add(Long.valueOf(lVar.f31022b));
                }
            }
        }
        for (C11468l a : hashSet4) {
            ContentValues a2 = m33406a(a);
            C11324d.m33206a();
            C11324d.m33205a("participant_read", (String) null, a2);
        }
        m33405a(str, (List<Long>) arrayList);
        C11404d.m33582a(C1642a.m8034a("IMConversationMemberReadDao.insertOrUpdateMemberRead updateList=%s, insertList=%s, deleteList=%s", new Object[]{C11403c.f30887a.mo15979b((Object) arrayList3), C11403c.f30887a.mo15979b((Object) arrayList4), C11403c.f30887a.mo15979b((Object) arrayList)}));
        C11324d.m33206a();
        C11324d.m33210b("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        return true;
    }
}
