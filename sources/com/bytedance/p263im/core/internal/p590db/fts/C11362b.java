package com.bytedance.p263im.core.internal.p590db.fts;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.model.p598a.C11435a;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.fts.b */
public class C11362b {

    /* renamed from: a */
    private static C11362b f30780a;

    private C11362b() {
    }

    /* renamed from: a */
    public static C11362b m33353a() {
        if (f30780a == null) {
            synchronized (C11362b.class) {
                if (f30780a == null) {
                    f30780a = new C11362b();
                }
            }
        }
        return f30780a;
    }

    /* renamed from: a */
    public final boolean mo27388a(List<C11435a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (C11435a a : list) {
            ContentValues a2 = m33352a(a);
            C11324d.m33206a();
            if (C11324d.m33205a("fts_entity", (String) null, a2) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static ContentValues m33352a(C11435a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBFTSColumn.COLUMN_ID.key, aVar.mo27652a());
        contentValues.put(DBFTSColumn.COLUMN_TYPE.key, Integer.valueOf(aVar.f30949b));
        contentValues.put(DBFTSColumn.COLUMN_CONVERSATION_ID.key, aVar.f30950c);
        contentValues.put(DBFTSColumn.COLUMN_MESSAGE_UUID.key, aVar.f30951d);
        contentValues.put(DBFTSColumn.COLUMN_USER_ID.key, aVar.f30952e);
        contentValues.put(DBFTSColumn.COLUMN_ENTITY_ID.key, aVar.f30953f);
        contentValues.put(DBFTSColumn.COLUMN_SEARCH_CONTENT.key, aVar.f30954g);
        contentValues.put(DBFTSColumn.COLUMN_EXTRA.key, aVar.f30955h);
        return contentValues;
    }

    /* renamed from: a */
    public static String m33354a(boolean z) {
        DBFTSColumn[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create virtual table if not exists fts_entity using fts4 (");
        for (DBFTSColumn dBFTSColumn : DBFTSColumn.values()) {
            sb.append(dBFTSColumn.key);
            sb.append(" ");
            sb.append(dBFTSColumn.type);
            sb.append(",");
        }
        sb.append(" notindexed=");
        sb.append(DBFTSColumn.COLUMN_EXTRA.key);
        sb.append(",");
        if (z) {
            sb.append(" tokenize=mmicu,");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: c */
    public static boolean m33358c(List<C11435a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (C11435a aVar : list) {
            if (aVar != null && !TextUtils.isEmpty(aVar.mo27652a())) {
                sb.append(",\"");
                sb.append(aVar.mo27652a());
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(sb2.substring(1));
        sb3.append(")");
        String sb4 = sb3.toString();
        C11324d.m33206a();
        StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
        sb5.append(DBFTSColumn.COLUMN_ID.key);
        sb5.append(" in ");
        sb5.append(sb4);
        return C11324d.m33211c(sb5.toString());
    }

    /* renamed from: b */
    public final boolean mo27389b(List<C11435a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (C11435a aVar : list) {
            if (aVar != null && !TextUtils.isEmpty(aVar.mo27652a())) {
                sb.append(",\"");
                sb.append(aVar.mo27652a());
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            StringBuilder sb3 = new StringBuilder("(");
            sb3.append(sb2.substring(1));
            sb3.append(")");
            String sb4 = sb3.toString();
            C11324d.m33206a();
            StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
            sb5.append(DBFTSColumn.COLUMN_ID.key);
            sb5.append(" in ");
            sb5.append(sb4);
            if (C11324d.m33211c(sb5.toString())) {
                return mo27388a(list);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m33355a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(DBFTSColumn.COLUMN_CONVERSATION_ID.key);
        sb.append("=? AND ");
        sb.append(DBFTSColumn.COLUMN_USER_ID.key);
        sb.append("=?");
        return C11324d.m33209a("fts_entity", sb.toString(), new String[]{str, str2});
    }

    /* renamed from: a */
    public static boolean m33356a(List<String> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                sb.append(",\"");
                sb.append(str2);
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(sb2.substring(1));
        sb3.append(")");
        String sb4 = sb3.toString();
        C11324d.m33206a();
        StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
        sb5.append(str);
        sb5.append(" in ");
        sb5.append(sb4);
        return C11324d.m33211c(sb5.toString());
    }

    /* renamed from: a */
    public static boolean m33357a(List<String> list, String str, int i) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                sb.append(",\"");
                sb.append(str2);
                sb.append('\"');
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(sb2.substring(1));
        sb3.append(")");
        String sb4 = sb3.toString();
        C11324d.m33206a();
        StringBuilder sb5 = new StringBuilder("delete from fts_entity where ");
        sb5.append(str);
        sb5.append(" in ");
        sb5.append(sb4);
        sb5.append(" and ");
        sb5.append(DBFTSColumn.COLUMN_TYPE.key);
        sb5.append(" =");
        sb5.append(i);
        return C11324d.m33211c(sb5.toString());
    }
}
