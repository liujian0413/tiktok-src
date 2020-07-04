package com.bytedance.p263im.core.internal.p590db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.fts.C11359a;
import com.bytedance.p263im.core.internal.p590db.fts.DBFTSColumn;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p586b.C11209d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.q */
public class C11375q {

    /* renamed from: a */
    private static C11375q f30828a;

    private C11375q() {
    }

    /* renamed from: a */
    public final boolean mo27396a(Message message) {
        Boolean valueOf;
        if (message == null || message.invalid()) {
            return false;
        }
        Boolean valueOf2 = Boolean.valueOf(false);
        C11354f fVar = null;
        try {
            long j = m33452j(message.getUuid());
            if (message.getRowId() <= 0) {
                message.setRowId(j);
            }
            C11324d.m33206a();
            C11354f fVar2 = C11324d.m33212d(m33433a(j, message.getUuid()));
            boolean z = true;
            if (j > 0) {
                try {
                    m33440b(fVar2, message);
                    if (fVar2.mo27374a() <= 0) {
                        z = false;
                    }
                    valueOf = Boolean.valueOf(z);
                } catch (Exception e) {
                    e = e;
                    fVar = fVar2;
                    try {
                        C11404d.m33585a("updateMessage", (Throwable) e);
                        C11209d.m32824a(e);
                        C11378t.m33469a(fVar);
                        return valueOf2.booleanValue();
                    } catch (Throwable th) {
                        th = th;
                        fVar2 = fVar;
                        C11378t.m33469a(fVar2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C11378t.m33469a(fVar2);
                    throw th;
                }
            } else {
                m33437a(fVar2, message);
                long b = fVar2.mo27377b();
                message.setRowId(b);
                if (b <= 0) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            valueOf2 = valueOf;
            if (valueOf2.booleanValue()) {
                if (message.getDeleted() == 0) {
                    C11359a.m33339a().mo27386a(false, (Object) message);
                } else {
                    C11359a.m33339a().mo27382a((Object) message);
                }
                C11374p.m33421a().mo27393a(message);
            }
            if (!valueOf2.booleanValue() || message.getAttachments() == null) {
                C11378t.m33469a(fVar2);
                return valueOf2.booleanValue();
            }
            boolean b2 = C11366j.m33362a().mo27390b(message.getAttachments());
            C11378t.m33469a(fVar2);
            return b2;
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("updateMessage", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33469a(fVar);
            return valueOf2.booleanValue();
        }
    }

    /* renamed from: a */
    public static boolean m33438a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder("update msg set ");
        sb.append(C11358f.COLUMN_DELETED.f30771u);
        sb.append("=1");
        sb.append(" where ");
        sb.append(C11358f.COLUMN_MSG_ID.f30771u);
        sb.append("=\"");
        sb.append(str);
        sb.append("\"");
        boolean c = C11324d.m33211c(sb.toString());
        if (c) {
            C11374p.m33421a();
            C11374p.m33424a(str);
            C11359a.m33339a().mo27383a(str, DBFTSColumn.COLUMN_MESSAGE_UUID.key);
        }
        return c;
    }

    /* renamed from: a */
    public static List<Message> m33436a(List<String> list, long j) {
        C11339b bVar = null;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_MSG_ID.f30771u);
            sb.append(" in ('");
            sb.append(C11377s.m33466a(list, "','"));
            sb.append("')  AND ");
            sb.append(C11358f.COLUMN_DELETED.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_NET_STATUS.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
            sb.append(">? order by ");
            sb.append(C11358f.COLUMN_ORDER_INDEX.f30771u);
            sb.append(" desc, ");
            sb.append(C11358f.COLUMN_CREATE_TIME.f30771u);
            sb.append(" desc");
            String sb2 = sb.toString();
            C11324d.m33206a();
            C11339b a = C11324d.m33207a(sb2, new String[]{"0", "0", String.valueOf(j)});
            while (a.mo27359d()) {
                try {
                    arrayList.add(m33431a(a));
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11404d.m33585a("initMessageList", (Throwable) e);
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
            C11404d.m33585a("initMessageList", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<Message> m33434a(String str, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        C11339b bVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_DELETED.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_NET_STATUS.f30771u);
            sb.append("=?");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(" order by ");
            sb3.append(C11358f.COLUMN_ORDER_INDEX.f30771u);
            sb3.append(" desc, ");
            sb3.append(C11358f.COLUMN_CREATE_TIME.f30771u);
            sb3.append(" desc limit ");
            sb3.append(i);
            String sb4 = sb3.toString();
            C11324d.m33206a();
            C11339b a = C11324d.m33207a(sb4, new String[]{str, "0", "0"});
            while (a.mo27359d()) {
                try {
                    arrayList.add(m33431a(a));
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11404d.m33585a("initMessageList", (Throwable) e);
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
            C11404d.m33585a("initMessageList", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Message> m33435a(String str, long j, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        C11339b bVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_DELETED.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_NET_STATUS.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
            sb.append("<?");
            String sb2 = sb.toString();
            if (iArr != null && iArr.length > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("(");
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    sb3.append(iArr[i2]);
                    if (i2 < iArr.length - 1) {
                        sb3.append(",");
                    }
                }
                sb3.append(")");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append(" AND ");
                sb4.append(C11358f.COLUMN_MSG_TYPE.f30771u);
                sb4.append(" IN ");
                sb4.append(sb3.toString());
                sb2 = sb4.toString();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append(" order by ");
            sb5.append(C11358f.COLUMN_ORDER_INDEX.f30771u);
            sb5.append(" desc, ");
            sb5.append(C11358f.COLUMN_CREATE_TIME.f30771u);
            sb5.append(" desc limit ");
            sb5.append(i);
            String sb6 = sb5.toString();
            C11324d.m33206a();
            C11339b a = C11324d.m33207a(sb6, new String[]{str, "0", "0", String.valueOf(j)});
            while (a.mo27359d()) {
                try {
                    arrayList.add(m33431a(a));
                } catch (Exception e) {
                    bVar = a;
                    e = e;
                    try {
                        C11404d.m33585a("queryOlderMessageList", (Throwable) e);
                        C11209d.m32824a(e);
                        C11378t.m33468a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        C11378t.m33468a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar = a;
                    th = th2;
                    C11378t.m33468a(bVar);
                    throw th;
                }
            }
            C11378t.m33468a(a);
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("queryOlderMessageList", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m33437a(C11354f fVar, Message message) {
        if (fVar != null && message != null) {
            fVar.mo27376a(C11358f.COLUMN_MSG_ID.ordinal() + 1, C11378t.m33467a(message.getUuid()));
            fVar.mo27375a(C11358f.COLUMN_SERVER_ID.ordinal() + 1, message.getMsgId());
            fVar.mo27376a(C11358f.COLUMN_CONVERSATION_ID.ordinal() + 1, C11378t.m33467a(message.getConversationId()));
            fVar.mo27375a(C11358f.COLUMN_CONVERSATION_SHORT_ID.ordinal() + 1, message.getConversationShortId());
            fVar.mo27375a(C11358f.COLUMN_CONVERSATION_TYPE.ordinal() + 1, (long) message.getConversationType());
            fVar.mo27375a(C11358f.COLUMN_MSG_TYPE.ordinal() + 1, (long) message.getMsgType());
            fVar.mo27375a(C11358f.COLUMN_INNER_INDEX.ordinal() + 1, message.getIndex());
            fVar.mo27375a(C11358f.COLUMN_ORDER_INDEX.ordinal() + 1, message.getOrderIndex());
            fVar.mo27375a(C11358f.COLUMN_STATUS.ordinal() + 1, (long) message.getMsgStatus());
            fVar.mo27375a(C11358f.COLUMN_NET_STATUS.ordinal() + 1, (long) message.getSvrStatus());
            fVar.mo27375a(C11358f.COLUMN_VERSION.ordinal() + 1, message.getVersion());
            fVar.mo27375a(C11358f.COLUMN_DELETED.ordinal() + 1, (long) message.getDeleted());
            fVar.mo27375a(C11358f.COLUMN_CREATE_TIME.ordinal() + 1, message.getCreatedAt());
            fVar.mo27375a(C11358f.COLUMN_SENDER.ordinal() + 1, message.getSender());
            fVar.mo27376a(C11358f.COLUMN_CONTENT.ordinal() + 1, C11378t.m33467a(message.getContent()));
            fVar.mo27376a(C11358f.COLUMN_EXT.ordinal() + 1, C11378t.m33467a(message.getExtStr()));
            fVar.mo27376a(C11358f.COLUMN_LOCAL_INFO.ordinal() + 1, C11378t.m33467a(message.getLocalExtStr()));
            fVar.mo27375a(C11358f.COLUMN_READ_STATUS.ordinal() + 1, (long) message.getReadStatus());
            fVar.mo27376a(C11358f.COLUMN_SEC_SENDER.ordinal() + 1, message.getSecSender());
            fVar.mo27376a(C11358f.COLUMN_PROPERTY_LIST.ordinal() + 1, message.getPropertyItemListMapString());
        }
    }

    /* renamed from: a */
    public static C11375q m33429a() {
        if (f30828a == null) {
            synchronized (C11375q.class) {
                if (f30828a == null) {
                    f30828a = new C11375q();
                }
            }
        }
        return f30828a;
    }

    /* renamed from: b */
    public static String m33439b() {
        C11358f[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg(");
        for (C11358f fVar : C11358f.values()) {
            sb.append(fVar.f30771u);
            sb.append(" ");
            sb.append(fVar.f30772v);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: c */
    public static String[] m33446c() {
        StringBuilder sb = new StringBuilder("CREATE INDEX UID_INDEX ON msg(");
        sb.append(C11358f.COLUMN_SERVER_ID.f30771u);
        sb.append(")");
        StringBuilder sb2 = new StringBuilder("CREATE INDEX SENDER_INDEX ON msg(");
        sb2.append(C11358f.COLUMN_SENDER.f30771u);
        sb2.append(")");
        StringBuilder sb3 = new StringBuilder("CREATE INDEX CONVERSATION_INDEX ON msg(");
        sb3.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
        sb3.append(",");
        sb3.append(C11358f.COLUMN_INNER_INDEX.f30771u);
        sb3.append(")");
        return new String[]{sb.toString(), sb2.toString(), sb3.toString()};
    }

    /* renamed from: g */
    public final long mo27397g(String str) {
        Message k = m33453k(str);
        if (k != null) {
            return k.getIndex();
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m33443b(String str) {
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
        sb.append("=?");
        boolean a = C11324d.m33209a("msg", sb.toString(), new String[]{str});
        if (a) {
            C11374p.m33421a();
            C11374p.m33426b(str);
            C11359a.m33339a().mo27384a(str, DBFTSColumn.COLUMN_CONVERSATION_ID.key, 2);
        }
        return a;
    }

    /* renamed from: c */
    public static boolean m33445c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11324d.m33206a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11358f.COLUMN_MSG_TYPE.f30771u);
        sb.append("=?");
        return C11324d.m33209a("msg", sb.toString(), new String[]{str});
    }

    /* renamed from: a */
    public static Message m33430a(long j) {
        C11339b bVar;
        C11339b bVar2 = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_SERVER_ID.f30771u);
            sb.append("=?");
            bVar = C11324d.m33207a(sb.toString(), new String[]{String.valueOf(j)});
            try {
                if (bVar.mo27358c()) {
                    Message a = m33431a(bVar);
                    C11378t.m33468a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11404d.m33585a("getMsg", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33468a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11378t.m33468a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11404d.m33585a("getMsg", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11378t.m33468a(bVar2);
            throw th;
        }
        C11378t.m33468a(bVar);
        return null;
    }

    /* renamed from: d */
    public static Message m33447d(String str) {
        C11339b bVar;
        C11339b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_MSG_ID.f30771u);
            sb.append("=?");
            bVar = C11324d.m33207a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo27358c()) {
                    Message a = m33431a(bVar);
                    C11378t.m33468a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11404d.m33585a("getMsg", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33468a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11378t.m33468a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11404d.m33585a("getMsg", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11378t.m33468a(bVar2);
            throw th;
        }
        C11378t.m33468a(bVar);
        return null;
    }

    /* renamed from: e */
    public static boolean m33448e(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from msg where ");
            sb.append(C11358f.COLUMN_MSG_ID.f30771u);
            sb.append("=?");
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            if (a != null) {
                try {
                    if (a.mo27355b() > 0) {
                        z = true;
                    }
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11404d.m33585a("getMsg", (Throwable) e);
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
            }
            C11378t.m33468a(a);
            return z;
        } catch (Exception e2) {
            e = e2;
            C11404d.m33585a("getMsg", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return false;
        }
    }

    /* renamed from: f */
    public static Message m33449f(String str) {
        C11339b bVar;
        C11339b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
            sb.append("=? order by ");
            sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
            sb.append(" asc, ");
            sb.append(C11358f.COLUMN_CREATE_TIME.f30771u);
            sb.append(" asc limit 1");
            bVar = C11324d.m33207a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo27358c()) {
                    Message a = m33431a(bVar);
                    C11378t.m33468a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11404d.m33585a("getLastShowMsg", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33468a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11378t.m33468a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11404d.m33585a("getLastShowMsg", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11378t.m33468a(bVar2);
            throw th;
        }
        C11378t.m33468a(bVar);
        return null;
    }

    /* renamed from: i */
    public static boolean m33451i(String str) {
        StringBuilder sb = new StringBuilder("update msg set ");
        sb.append(C11358f.COLUMN_READ_STATUS.f30771u);
        sb.append("=1");
        sb.append(" where ");
        sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
        sb.append("='");
        sb.append(str);
        sb.append("' AND ");
        sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
        sb.append("='0'");
        String sb2 = sb.toString();
        C11324d.m33206a();
        return C11324d.m33211c(sb2);
    }

    /* renamed from: j */
    private static long m33452j(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid from msg where ");
            sb.append(C11358f.COLUMN_MSG_ID.f30771u);
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

    /* renamed from: k */
    private static Message m33453k(String str) {
        C11339b bVar;
        C11339b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
            sb.append("=? order by ");
            sb.append(C11358f.COLUMN_ORDER_INDEX.f30771u);
            sb.append(" desc, ");
            sb.append(C11358f.COLUMN_CREATE_TIME.f30771u);
            sb.append(" desc limit 1");
            bVar = C11324d.m33207a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo27358c()) {
                    Message a = m33431a(bVar);
                    C11378t.m33468a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11404d.m33585a("getLastMsg", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33468a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11378t.m33468a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11404d.m33585a("getLastMsg", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11378t.m33468a(bVar2);
            throw th;
        }
        C11378t.m33468a(bVar);
        return null;
    }

    /* renamed from: b */
    public static boolean m33441b(long j) {
        StringBuilder sb = new StringBuilder("update msg set ");
        sb.append(C11358f.COLUMN_STATUS.f30771u);
        sb.append("=3");
        sb.append(" where ");
        sb.append(C11358f.COLUMN_SENDER.f30771u);
        sb.append("='");
        sb.append(j);
        sb.append("' AND ");
        sb.append(C11358f.COLUMN_STATUS.f30771u);
        sb.append("<'2");
        sb.append("'");
        String sb2 = sb.toString();
        C11324d.m33206a();
        return C11324d.m33211c(sb2);
    }

    /* renamed from: h */
    public static Message m33450h(String str) {
        C11339b bVar;
        C11339b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_DELETED.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_NET_STATUS.f30771u);
            sb.append("=? order by ");
            sb.append(C11358f.COLUMN_ORDER_INDEX.f30771u);
            sb.append(" desc, ");
            sb.append(C11358f.COLUMN_CREATE_TIME.f30771u);
            sb.append(" desc limit 1");
            bVar = C11324d.m33207a(sb.toString(), new String[]{str, "0", "0"});
            try {
                if (bVar.mo27358c()) {
                    Message a = m33431a(bVar);
                    C11378t.m33468a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11404d.m33585a("getLastShowMsg", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33468a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11378t.m33468a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11404d.m33585a("getLastShowMsg", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11378t.m33468a(bVar2);
            throw th;
        }
        C11378t.m33468a(bVar);
        return null;
    }

    /* renamed from: a */
    private static Message m33431a(C11339b bVar) {
        if (bVar == null) {
            return null;
        }
        Message message = new Message();
        message.setRowId(bVar.mo27356b(bVar.mo27353a("rowid")));
        message.setUuid(bVar.mo27357c(bVar.mo27353a(C11358f.COLUMN_MSG_ID.f30771u)));
        message.setMsgId(bVar.mo27356b(bVar.mo27353a(C11358f.COLUMN_SERVER_ID.f30771u)));
        message.setConversationId(bVar.mo27357c(bVar.mo27353a(C11358f.COLUMN_CONVERSATION_ID.f30771u)));
        message.setConversationShortId(bVar.mo27356b(bVar.mo27353a(C11358f.COLUMN_CONVERSATION_SHORT_ID.f30771u)));
        message.setConversationType(bVar.mo27352a(bVar.mo27353a(C11358f.COLUMN_CONVERSATION_TYPE.f30771u)));
        message.setMsgType(bVar.mo27352a(bVar.mo27353a(C11358f.COLUMN_MSG_TYPE.f30771u)));
        message.setIndex(bVar.mo27356b(bVar.mo27353a(C11358f.COLUMN_INNER_INDEX.f30771u)));
        message.setOrderIndex(bVar.mo27356b(bVar.mo27353a(C11358f.COLUMN_ORDER_INDEX.f30771u)));
        message.setMsgStatus(bVar.mo27352a(bVar.mo27353a(C11358f.COLUMN_STATUS.f30771u)));
        message.setSvrStatus(bVar.mo27352a(bVar.mo27353a(C11358f.COLUMN_NET_STATUS.f30771u)));
        message.setVersion((long) bVar.mo27352a(bVar.mo27353a(C11358f.COLUMN_VERSION.f30771u)));
        message.setDeleted(bVar.mo27352a(bVar.mo27353a(C11358f.COLUMN_DELETED.f30771u)));
        message.setCreatedAt(bVar.mo27356b(bVar.mo27353a(C11358f.COLUMN_CREATE_TIME.f30771u)));
        message.setSender(bVar.mo27356b(bVar.mo27353a(C11358f.COLUMN_SENDER.f30771u)));
        message.setContent(bVar.mo27357c(bVar.mo27353a(C11358f.COLUMN_CONTENT.f30771u)));
        message.setExtStr(bVar.mo27357c(bVar.mo27353a(C11358f.COLUMN_EXT.f30771u)));
        message.setLocalExtStr(bVar.mo27357c(bVar.mo27353a(C11358f.COLUMN_LOCAL_INFO.f30771u)));
        message.setReadStatus(bVar.mo27352a(bVar.mo27353a(C11358f.COLUMN_READ_STATUS.f30771u)));
        C11366j.m33362a();
        message.setAttachments(C11366j.m33364a(message.getUuid()));
        message.setSecSender(bVar.mo27357c(bVar.mo27353a(C11358f.COLUMN_SEC_SENDER.f30771u)));
        message.setPropertyItemListMapByString(bVar.mo27357c(bVar.mo27353a(C11358f.COLUMN_PROPERTY_LIST.f30771u)));
        return message;
    }

    /* renamed from: c */
    private static ContentValues m33444c(Message message) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11358f.COLUMN_MSG_ID.f30771u, message.getUuid());
        contentValues.put(C11358f.COLUMN_SERVER_ID.f30771u, Long.valueOf(message.getMsgId()));
        contentValues.put(C11358f.COLUMN_CONVERSATION_ID.f30771u, message.getConversationId());
        contentValues.put(C11358f.COLUMN_CONVERSATION_SHORT_ID.f30771u, Long.valueOf(message.getConversationShortId()));
        contentValues.put(C11358f.COLUMN_CONVERSATION_TYPE.f30771u, Integer.valueOf(message.getConversationType()));
        contentValues.put(C11358f.COLUMN_MSG_TYPE.f30771u, Integer.valueOf(message.getMsgType()));
        contentValues.put(C11358f.COLUMN_INNER_INDEX.f30771u, Long.valueOf(message.getIndex()));
        contentValues.put(C11358f.COLUMN_ORDER_INDEX.f30771u, Long.valueOf(message.getOrderIndex()));
        contentValues.put(C11358f.COLUMN_STATUS.f30771u, Integer.valueOf(message.getMsgStatus()));
        contentValues.put(C11358f.COLUMN_NET_STATUS.f30771u, Integer.valueOf(message.getSvrStatus()));
        contentValues.put(C11358f.COLUMN_VERSION.f30771u, Long.valueOf(message.getVersion()));
        contentValues.put(C11358f.COLUMN_DELETED.f30771u, Integer.valueOf(message.getDeleted()));
        contentValues.put(C11358f.COLUMN_CREATE_TIME.f30771u, Long.valueOf(message.getCreatedAt()));
        contentValues.put(C11358f.COLUMN_SENDER.f30771u, Long.valueOf(message.getSender()));
        contentValues.put(C11358f.COLUMN_CONTENT.f30771u, message.getContent());
        contentValues.put(C11358f.COLUMN_EXT.f30771u, message.getExtStr());
        contentValues.put(C11358f.COLUMN_LOCAL_INFO.f30771u, message.getLocalExtStr());
        contentValues.put(C11358f.COLUMN_READ_STATUS.f30771u, Integer.valueOf(message.getReadStatus()));
        contentValues.put(C11358f.COLUMN_SEC_SENDER.f30771u, message.getSecSender());
        contentValues.put(C11358f.COLUMN_PROPERTY_LIST.f30771u, message.getPropertyItemListMapString());
        return contentValues;
    }

    /* renamed from: b */
    public static boolean m33442b(Message message) {
        boolean z = false;
        if (message == null || message.invalid()) {
            return false;
        }
        ContentValues c = m33444c(message);
        C11324d.m33206a();
        long a = C11324d.m33205a("msg", (String) null, c);
        message.setRowId(a);
        C11374p.m33421a().mo27393a(message);
        if (a >= 0) {
            z = true;
        }
        if (z && message.getDeleted() == 0) {
            C11359a.m33339a().mo27386a(true, (Object) message);
        }
        if (!z || message.getAttachments() == null) {
            return z;
        }
        C11366j.m33362a();
        return C11366j.m33365a(message.getAttachments());
    }

    /* renamed from: a */
    public final List<Message> mo27394a(String str, int i) {
        return m33434a(str, i, (int[]) null);
    }

    /* renamed from: b */
    private static void m33440b(C11354f fVar, Message message) {
        if (fVar != null && message != null) {
            fVar.mo27375a(C11358f.COLUMN_SERVER_ID.ordinal() + 0, message.getMsgId());
            fVar.mo27376a(C11358f.COLUMN_CONVERSATION_ID.ordinal() + 0, C11378t.m33467a(message.getConversationId()));
            fVar.mo27375a(C11358f.COLUMN_CONVERSATION_SHORT_ID.ordinal() + 0, message.getConversationShortId());
            fVar.mo27375a(C11358f.COLUMN_CONVERSATION_TYPE.ordinal() + 0, (long) message.getConversationType());
            fVar.mo27375a(C11358f.COLUMN_MSG_TYPE.ordinal() + 0, (long) message.getMsgType());
            fVar.mo27375a(C11358f.COLUMN_INNER_INDEX.ordinal() + 0, message.getIndex());
            fVar.mo27375a(C11358f.COLUMN_ORDER_INDEX.ordinal() + 0, message.getOrderIndex());
            fVar.mo27375a(C11358f.COLUMN_STATUS.ordinal() + 0, (long) message.getMsgStatus());
            fVar.mo27375a(C11358f.COLUMN_NET_STATUS.ordinal() + 0, (long) message.getSvrStatus());
            fVar.mo27375a(C11358f.COLUMN_VERSION.ordinal() + 0, message.getVersion());
            fVar.mo27375a(C11358f.COLUMN_DELETED.ordinal() + 0, (long) message.getDeleted());
            fVar.mo27375a(C11358f.COLUMN_CREATE_TIME.ordinal() + 0, message.getCreatedAt());
            fVar.mo27375a(C11358f.COLUMN_SENDER.ordinal() + 0, message.getSender());
            fVar.mo27376a(C11358f.COLUMN_CONTENT.ordinal() + 0, C11378t.m33467a(message.getContent()));
            fVar.mo27376a(C11358f.COLUMN_EXT.ordinal() + 0, C11378t.m33467a(message.getExtStr()));
            fVar.mo27376a(C11358f.COLUMN_LOCAL_INFO.ordinal() + 0, C11378t.m33467a(message.getLocalExtStr()));
            fVar.mo27375a(C11358f.COLUMN_READ_STATUS.ordinal() + 0, (long) message.getReadStatus());
            fVar.mo27376a(C11358f.COLUMN_SEC_SENDER.ordinal() + 0, message.getSecSender());
            fVar.mo27376a(C11358f.COLUMN_PROPERTY_LIST.ordinal() + 0, message.getPropertyItemListMapString());
        }
    }

    /* renamed from: a */
    public static Message m33432a(String str, long j) {
        C11339b bVar;
        C11339b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_DELETED.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_NET_STATUS.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
            sb.append("=? order by ");
            sb.append(C11358f.COLUMN_ORDER_INDEX.f30771u);
            sb.append(" desc, ");
            sb.append(C11358f.COLUMN_CREATE_TIME.f30771u);
            sb.append(" desc limit 1");
            bVar = C11324d.m33207a(sb.toString(), new String[]{str, "0", "0", String.valueOf(j)});
            try {
                if (bVar.mo27358c()) {
                    Message a = m33431a(bVar);
                    C11378t.m33468a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11404d.m33585a("getMsgByMsgIndex", (Throwable) e);
                    C11209d.m32824a(e);
                    C11378t.m33468a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11378t.m33468a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11404d.m33585a("getMsgByMsgIndex", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11378t.m33468a(bVar2);
            throw th;
        }
        C11378t.m33468a(bVar);
        return null;
    }

    /* renamed from: a */
    private static String m33433a(long j, String str) {
        C11358f[] values;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (j > 0) {
            sb.append(" update msg set ");
            for (C11358f fVar : C11358f.values()) {
                if (!"msg_uuid".equals(fVar.f30771u)) {
                    sb.append(fVar.f30771u);
                    sb.append("=?,");
                }
            }
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3.substring(0, sb3.length() - 1));
            sb4.append(" where msg_uuid='");
            sb4.append(C11378t.m33467a(str));
            sb4.append("'");
            return sb4.toString();
        }
        sb.append(" insert into msg(");
        for (C11358f fVar2 : C11358f.values()) {
            sb.append(fVar2.f30771u);
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
    public final List<Message> mo27395a(String str, long j, int i) {
        return m33435a(str, j, i, (int[]) null);
    }

    /* renamed from: a */
    public static long m33428a(String str, long j, long j2, long j3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C11339b bVar = null;
        try {
            StringBuilder sb = new StringBuilder("select * from msg where ");
            sb.append(C11358f.COLUMN_CONVERSATION_ID.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_DELETED.f30771u);
            sb.append("=? AND (");
            sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
            sb.append("<=? AND ");
            sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
            sb.append(">? OR ");
            sb.append(C11358f.COLUMN_INNER_INDEX.f30771u);
            sb.append("='0') AND ");
            sb.append(C11358f.COLUMN_SENDER.f30771u);
            sb.append("!=? AND ");
            sb.append(C11358f.COLUMN_NET_STATUS.f30771u);
            sb.append("=? AND ");
            sb.append(C11358f.COLUMN_READ_STATUS.f30771u);
            sb.append("=?");
            String sb2 = sb.toString();
            C11324d.m33206a();
            C11339b a = C11324d.m33207a(sb2, new String[]{str, "0", String.valueOf(j2), String.valueOf(j), String.valueOf(j3), "0", "0"});
            try {
                long b = (long) a.mo27355b();
                C11378t.m33468a(a);
                return b;
            } catch (Exception e) {
                e = e;
                bVar = a;
                try {
                    C11404d.m33591d("computeUnreadMsgCount");
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
        } catch (Exception e2) {
            e = e2;
            C11404d.m33591d("computeUnreadMsgCount");
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return 0;
        }
    }
}
