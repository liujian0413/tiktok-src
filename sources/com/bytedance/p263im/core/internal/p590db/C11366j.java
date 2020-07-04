package com.bytedance.p263im.core.internal.p590db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.p586b.C11209d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.j */
public class C11366j {

    /* renamed from: a */
    private static C11366j f30821a;

    private C11366j() {
    }

    /* renamed from: a */
    public static C11366j m33362a() {
        if (f30821a == null) {
            synchronized (C11366j.class) {
                if (f30821a == null) {
                    f30821a = new C11366j();
                }
            }
        }
        return f30821a;
    }

    /* renamed from: b */
    public static String m33366b() {
        C11320a[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists attchment (");
        for (C11320a aVar : C11320a.values()) {
            sb.append(aVar.f30665l);
            sb.append(" ");
            sb.append(aVar.f30666m);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: a */
    public static boolean m33365a(List<Attachment> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (Attachment a : list) {
            ContentValues a2 = m33361a(a);
            C11324d.m33206a();
            if (C11324d.m33205a("attchment", (String) null, a2) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<Attachment> m33364a(String str) {
        ArrayList arrayList = new ArrayList();
        C11339b bVar = null;
        try {
            C11324d.m33206a();
            StringBuilder sb = new StringBuilder("select * from attchment where ");
            sb.append(C11320a.COLUMN_UUID.f30665l);
            sb.append("=?");
            C11339b a = C11324d.m33207a(sb.toString(), new String[]{str});
            while (a.mo27359d()) {
                try {
                    Attachment a2 = m33363a(a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11404d.m33585a("get attachment ", (Throwable) e);
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
            C11404d.m33585a("get attachment ", (Throwable) e);
            C11209d.m32824a(e);
            C11378t.m33468a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static ContentValues m33361a(Attachment attachment) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11320a.COLUMN_UUID.f30665l, attachment.getMsgUuid());
        contentValues.put(C11320a.COLUMN_LOCAL_URI.f30665l, attachment.getLocalPath());
        contentValues.put(C11320a.COLUMN_REMOTE_URI.f30665l, attachment.getRemoteUrl());
        contentValues.put(C11320a.COLUMN_HASH.f30665l, attachment.getHash());
        contentValues.put(C11320a.COLUMN_INDEX.f30665l, Integer.valueOf(attachment.getIndex()));
        contentValues.put(C11320a.COLUMN_EXT.f30665l, attachment.getExtStr());
        contentValues.put(C11320a.COLUMN_STATUS.f30665l, Integer.valueOf(attachment.getStatus()));
        contentValues.put(C11320a.COLUMN_TYPE.f30665l, attachment.getType());
        contentValues.put(C11320a.COLUMN_SIZE.f30665l, Long.valueOf(attachment.getLength()));
        contentValues.put(C11320a.COLUMN_DISPLAY_TYPE.f30665l, attachment.getDisplayType());
        contentValues.put(C11320a.COLUMN_MIME_TYPE.f30665l, attachment.getMimeType());
        return contentValues;
    }

    /* renamed from: b */
    public final boolean mo27390b(List<Attachment> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (Attachment attachment : list) {
            if (attachment != null && !TextUtils.isEmpty(attachment.getMsgUuid())) {
                sb.append(",\"");
                sb.append(attachment.getMsgUuid());
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
            StringBuilder sb5 = new StringBuilder("delete from attchment where ");
            sb5.append(C11320a.COLUMN_UUID.f30665l);
            sb5.append(" in ");
            sb5.append(sb4);
            if (C11324d.m33211c(sb5.toString())) {
                return m33365a(list);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Attachment m33363a(C11339b bVar) {
        if (bVar == null) {
            return null;
        }
        Attachment attachment = new Attachment();
        attachment.setMsgUuid(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_UUID.f30665l)));
        attachment.setLocalPath(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_LOCAL_URI.f30665l)));
        attachment.setRemoteUrl(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_REMOTE_URI.f30665l)));
        attachment.setIndex(bVar.mo27352a(bVar.mo27353a(C11320a.COLUMN_INDEX.f30665l)));
        attachment.setLength(bVar.mo27356b(bVar.mo27353a(C11320a.COLUMN_SIZE.f30665l)));
        attachment.setType(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_TYPE.f30665l)));
        attachment.setExtStr(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_EXT.f30665l)));
        attachment.setStatus(bVar.mo27352a(bVar.mo27353a(C11320a.COLUMN_STATUS.f30665l)));
        attachment.setHash(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_HASH.f30665l)));
        attachment.setDisplayType(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_DISPLAY_TYPE.f30665l)));
        attachment.setMimeType(bVar.mo27357c(bVar.mo27353a(C11320a.COLUMN_MIME_TYPE.f30665l)));
        return attachment;
    }
}
