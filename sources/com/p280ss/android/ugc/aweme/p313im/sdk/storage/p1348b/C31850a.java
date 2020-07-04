package com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31733b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.storage.b.a */
public class C31850a {

    /* renamed from: a */
    private static C31850a f83315a;

    private C31850a() {
    }

    /* renamed from: c */
    public static String m103364c() {
        return "SIMPLE_USER";
    }

    /* renamed from: d */
    public static String m103365d() {
        return "drop table if exists SIMPLE_USER";
    }

    /* renamed from: j */
    public static void m103371j() {
        C31848b.m103344a().mo82677a("SIMPLE_USER", (String) null, (String[]) null);
    }

    /* renamed from: a */
    public static C31850a m103357a() {
        if (f83315a == null) {
            synchronized (C31850a.class) {
                if (f83315a == null) {
                    f83315a = new C31850a();
                }
            }
        }
        return f83315a;
    }

    /* renamed from: e */
    public static String m103366e() {
        StringBuilder sb = new StringBuilder();
        sb.append(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 2");
        return sb.toString();
    }

    /* renamed from: h */
    public static String m103369h() {
        StringBuilder sb = new StringBuilder();
        sb.append(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 1");
        return sb.toString();
    }

    /* renamed from: i */
    public static String m103370i() {
        StringBuilder sb = new StringBuilder();
        sb.append(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key);
        sb.append(" != 0");
        return sb.toString();
    }

    /* renamed from: f */
    public static String m103367f() {
        StringBuilder sb = new StringBuilder();
        sb.append(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 2");
        sb.append(" and ");
        sb.append(DBIMUserColumn.COLUMN_USER_SHARE_STATUS.key);
        sb.append(" != 2");
        return sb.toString();
    }

    /* renamed from: g */
    public static String m103368g() {
        StringBuilder sb = new StringBuilder();
        sb.append(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 1");
        sb.append(" and ");
        sb.append(DBIMUserColumn.COLUMN_USER_SHARE_STATUS.key);
        sb.append(" != 2");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m103372k() {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "select * from SIMPLE_USER"
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            android.database.Cursor r2 = r3.mo82675a(r2, r1)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            if (r2 == 0) goto L_0x0021
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            if (r1 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r0
        L_0x001c:
            r0 = move-exception
            r1 = r2
            goto L_0x0028
        L_0x001f:
            r1 = r2
            goto L_0x002e
        L_0x0021:
            if (r2 == 0) goto L_0x0033
            r2.close()
            goto L_0x0033
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            if (r1 == 0) goto L_0x002d
            r1.close()
        L_0x002d:
            throw r0
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.m103372k():boolean");
    }

    /* renamed from: b */
    public static String m103360b() {
        DBIMUserColumn[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists SIMPLE_USER (");
        for (DBIMUserColumn dBIMUserColumn : DBIMUserColumn.values()) {
            sb.append(dBIMUserColumn.key);
            sb.append(" ");
            sb.append(dBIMUserColumn.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[SYNTHETIC, Splitter:B:23:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC, Splitter:B:29:0x004b] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m103373l() {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = "select * from SIMPLE_USER where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x003e }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r2 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x003e }
            r1.append(r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = " != 0"
            r1.append(r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x003e }
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r2 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x003e }
            android.database.Cursor r1 = r2.mo82675a(r1, r0)     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0036
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            return r0
        L_0x002c:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0049
        L_0x0031:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x003f
        L_0x0036:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x0047
        L_0x003c:
            r1 = move-exception
            goto L_0x0049
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r1)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0047
            r0.close()     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            r0 = 0
            return r0
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.m103373l():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC, Splitter:B:26:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC, Splitter:B:32:0x0075] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m103374m() {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "select * from SIMPLE_USER where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0068 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r2 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0068 }
            r1.append(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = " == 2"
            r1.append(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0068 }
            java.lang.CharSequence r2 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e.m22069b()     // Catch:{ Exception -> 0x0068 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0068 }
            if (r3 != 0) goto L_0x0042
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068 }
            r3.<init>()     // Catch:{ Exception -> 0x0068 }
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = " and "
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r1 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_UID     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = r1.key     // Catch:{ Exception -> 0x0068 }
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = " != "
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            r3.append(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0068 }
        L_0x0042:
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r2 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x0068 }
            android.database.Cursor r1 = r2.mo82675a(r1, r0)     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0060
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            return r0
        L_0x0056:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0073
        L_0x005b:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0069
        L_0x0060:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ Exception -> 0x0071 }
            goto L_0x0071
        L_0x0066:
            r1 = move-exception
            goto L_0x0073
        L_0x0068:
            r1 = move-exception
        L_0x0069:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r1)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            r0 = 0
            return r0
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            r0.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.m103374m():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.p313im.service.model.IMUser> mo82687n() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            r2.<init>()     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r3 = "select * from SIMPLE_USER"
            r2.append(r3)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            r2.append(r3)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r3 = " != 0"
            r2.append(r3)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            android.database.Cursor r2 = r3.mo82675a(r2, r1)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            if (r2 == 0) goto L_0x0042
        L_0x002f:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r1 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = m103358a(r2)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r0.add(r1)     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            goto L_0x002f
        L_0x003d:
            r0 = move-exception
            r1 = r2
            goto L_0x0049
        L_0x0040:
            r1 = r2
            goto L_0x004f
        L_0x0042:
            if (r2 == 0) goto L_0x0054
            r2.close()
            goto L_0x0054
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r0
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.mo82687n():java.util.List");
    }

    /* renamed from: a */
    public static void m103359a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C31848b a = C31848b.m103344a();
            StringBuilder sb = new StringBuilder("delete from SIMPLE_USER where ");
            sb.append(DBIMUserColumn.COLUMN_UID.key);
            sb.append(" = ");
            sb.append(str);
            a.mo82676a(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo82682a(List<IMUser> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                m103361b((IMUser) list.get(i));
            }
            C31848b.m103344a().mo82678b();
            for (IMUser iMUser : list) {
                if (iMUser != null && !IMUser.isInvalidUser(iMUser.getUid())) {
                    C31848b.m103344a().mo82674a("SIMPLE_USER", (String) null, m103363c(iMUser));
                }
            }
            C31848b.m103344a().mo82679c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.p313im.service.model.IMUser> mo82685c(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.<init>()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r3 = "select * from SIMPLE_USER"
            r2.append(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = " and "
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r5 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_SORT_WEIGHT     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = " is not null  and "
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r5 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_INITIAL_LETTER     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = " is not null  order by "
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r5 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_SORT_WEIGHT     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r5 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            android.database.Cursor r5 = r5.mo82675a(r2, r1)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            if (r5 == 0) goto L_0x005b
        L_0x004a:
            boolean r1 = r5.moveToNext()     // Catch:{ Exception -> 0x0066, all -> 0x0058 }
            if (r1 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = m103358a(r5)     // Catch:{ Exception -> 0x0066, all -> 0x0058 }
            r0.add(r1)     // Catch:{ Exception -> 0x0066, all -> 0x0058 }
            goto L_0x004a
        L_0x0058:
            r0 = move-exception
            r1 = r5
            goto L_0x005f
        L_0x005b:
            if (r5 == 0) goto L_0x006b
            goto L_0x0068
        L_0x005e:
            r0 = move-exception
        L_0x005f:
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            throw r0
        L_0x0065:
            r5 = r1
        L_0x0066:
            if (r5 == 0) goto L_0x006b
        L_0x0068:
            r5.close()
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.mo82685c(java.lang.String):java.util.List");
    }

    /* renamed from: b */
    public static void m103361b(IMUser iMUser) {
        String c = C7048a.m21930c(iMUser.getDisplayName());
        iMUser.setSortWeight(C31733b.m103058a().mo82527b(c));
        iMUser.setInitialLetter(C31733b.m103058a().mo82525a(c));
        try {
            iMUser.setAvatarStr(C31913m.m103668a(iMUser.getAvatarThumb()));
        } catch (Exception unused) {
        }
        if (!C31915n.m103671a()) {
            iMUser.setRemarkPinyin(C7048a.m21930c(iMUser.getRemarkName()).toLowerCase());
            iMUser.setRemarkInitial(C7048a.m21928b(iMUser.getRemarkName()).toLowerCase());
            iMUser.setNickNamePinyin(C7048a.m21930c(iMUser.getNickName()).toLowerCase());
            iMUser.setNickNameInitial(C7048a.m21928b(iMUser.getNickName()).toLowerCase());
            iMUser.setContactNamePinyin(C7048a.m21930c(iMUser.getContactName()).toLowerCase());
            iMUser.setContactNameInitial(C7048a.m21928b(iMUser.getContactName()).toLowerCase());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008d, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0098, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0093  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.p313im.service.model.IMUser> mo82686d(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = "select * from SIMPLE_USER where "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = " != 0"
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = " and ("
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_REMARK_NAME     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = " like '%"
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r5)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = "%' or "
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_NICK_NAME     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = " like '%"
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r5)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = "%' or "
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_UID     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = " like '%"
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r5)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = "%' or "
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r3 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_UNIQUE_ID     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r3 = " like '%"
            r2.append(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            r2.append(r5)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r5 = "%');"
            r2.append(r5)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r2 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            android.database.Cursor r5 = r2.mo82675a(r5, r1)     // Catch:{ Exception -> 0x0097, all -> 0x0090 }
            if (r5 == 0) goto L_0x008d
        L_0x007c:
            boolean r1 = r5.moveToNext()     // Catch:{ Exception -> 0x0098, all -> 0x008a }
            if (r1 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = m103358a(r5)     // Catch:{ Exception -> 0x0098, all -> 0x008a }
            r0.add(r1)     // Catch:{ Exception -> 0x0098, all -> 0x008a }
            goto L_0x007c
        L_0x008a:
            r0 = move-exception
            r1 = r5
            goto L_0x0091
        L_0x008d:
            if (r5 == 0) goto L_0x009d
            goto L_0x009a
        L_0x0090:
            r0 = move-exception
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()
        L_0x0096:
            throw r0
        L_0x0097:
            r5 = r1
        L_0x0098:
            if (r5 == 0) goto L_0x009d
        L_0x009a:
            r5.close()
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.mo82686d(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    private static IMUser m103358a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_UID.key)));
        iMUser.setSecUid(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_SEC_UID.key)));
        iMUser.setNickName(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_NICK_NAME.key)));
        iMUser.setSignature(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_SIGNATURE.key)));
        iMUser.setAvatarStr(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_AVATAR_THUMB.key)));
        iMUser.setFollowStatus(cursor.getInt(cursor.getColumnIndex(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key)));
        iMUser.setUniqueId(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_UNIQUE_ID.key)));
        iMUser.setWeiboVerify(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_WEIBO_VERIFY.key)));
        iMUser.setCustomVerify(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_CUSTOM_VERIFY.key)));
        iMUser.setEnterpriseVerifyReason(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_ENTERPRISE_VERIFY_REASON.key)));
        iMUser.setVerificationType(cursor.getInt(cursor.getColumnIndex(DBIMUserColumn.COLUMN_VERIFICATION_TYPE.key)));
        iMUser.setRemarkName(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_REMARK_NAME.key)));
        iMUser.setSortWeight(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_SORT_WEIGHT.key)));
        iMUser.setInitialLetter(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_INITIAL_LETTER.key)));
        iMUser.setShortId(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_SHORT_ID.key)));
        iMUser.setRemarkPinyin(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_REMARK_PINYIN.key)));
        iMUser.setRemarkInitial(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_REMARK_INITIAL.key)));
        iMUser.setNickNamePinyin(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_NICK_NAME_PINYIN.key)));
        iMUser.setNickNameInitial(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_NICK_NAME_INITIAL.key)));
        iMUser.setCommerceUserLevel(cursor.getInt(cursor.getColumnIndex(DBIMUserColumn.COLUMN_COMMERCE_USER_LEVEL.key)));
        iMUser.setContactName(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_CONTACT_NAME.key)));
        iMUser.setContactNamePinyin(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_CONTACT_NAME_PINYIN.key)));
        iMUser.setContactNameInitial(cursor.getString(cursor.getColumnIndex(DBIMUserColumn.COLUMN_CONTACT_NAME_INITIAL.key)));
        iMUser.setShareStatus(cursor.getInt(cursor.getColumnIndex(DBIMUserColumn.COLUMN_USER_SHARE_STATUS.key)));
        return iMUser;
    }

    /* renamed from: b */
    public static void m103362b(List<IMUser> list) {
        if (list != null && !list.isEmpty()) {
            C31848b.m103344a().mo82678b();
            for (IMUser iMUser : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(DBIMUserColumn.COLUMN_UID.key, iMUser.getUid());
                contentValues.put(DBIMUserColumn.COLUMN_SEC_UID.key, iMUser.getSecUid());
                contentValues.put(DBIMUserColumn.COLUMN_NICK_NAME.key, iMUser.getNickName());
                contentValues.put(DBIMUserColumn.COLUMN_SIGNATURE.key, iMUser.getSignature());
                contentValues.put(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
                contentValues.put(DBIMUserColumn.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
                contentValues.put(DBIMUserColumn.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
                contentValues.put(DBIMUserColumn.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
                contentValues.put(DBIMUserColumn.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
                contentValues.put(DBIMUserColumn.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
                contentValues.put(DBIMUserColumn.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
                contentValues.put(DBIMUserColumn.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
                contentValues.put(DBIMUserColumn.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
                contentValues.put(DBIMUserColumn.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
                contentValues.put(DBIMUserColumn.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
                contentValues.put(DBIMUserColumn.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
                StringBuilder sb = new StringBuilder();
                sb.append(DBIMUserColumn.COLUMN_UID.key);
                sb.append("=?");
                C31848b.m103344a().mo82673a("SIMPLE_USER", contentValues, sb.toString(), new String[]{iMUser.getUid()});
            }
            C31848b.m103344a().mo82679c();
        }
    }

    /* renamed from: c */
    private static ContentValues m103363c(IMUser iMUser) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBIMUserColumn.COLUMN_UID.key, iMUser.getUid());
        contentValues.put(DBIMUserColumn.COLUMN_SEC_UID.key, iMUser.getSecUid());
        contentValues.put(DBIMUserColumn.COLUMN_NICK_NAME.key, iMUser.getNickName());
        contentValues.put(DBIMUserColumn.COLUMN_SIGNATURE.key, iMUser.getSignature());
        contentValues.put(DBIMUserColumn.COLUMN_AVATAR_THUMB.key, iMUser.getAvatarStr());
        contentValues.put(DBIMUserColumn.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
        contentValues.put(DBIMUserColumn.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
        contentValues.put(DBIMUserColumn.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
        contentValues.put(DBIMUserColumn.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
        contentValues.put(DBIMUserColumn.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
        contentValues.put(DBIMUserColumn.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
        contentValues.put(DBIMUserColumn.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
        contentValues.put(DBIMUserColumn.COLUMN_SORT_WEIGHT.key, iMUser.getSortWeight());
        contentValues.put(DBIMUserColumn.COLUMN_INITIAL_LETTER.key, iMUser.getInitialLetter());
        contentValues.put(DBIMUserColumn.COLUMN_SHORT_ID.key, iMUser.getShortId());
        contentValues.put(DBIMUserColumn.COLUMN_REMARK_PINYIN.key, iMUser.getRemarkPinyin());
        contentValues.put(DBIMUserColumn.COLUMN_REMARK_INITIAL.key, iMUser.getRemarkInitial());
        contentValues.put(DBIMUserColumn.COLUMN_NICK_NAME_PINYIN.key, iMUser.getNickNamePinyin());
        contentValues.put(DBIMUserColumn.COLUMN_NICK_NAME_INITIAL.key, iMUser.getNickNameInitial());
        contentValues.put(DBIMUserColumn.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
        contentValues.put(DBIMUserColumn.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
        contentValues.put(DBIMUserColumn.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
        contentValues.put(DBIMUserColumn.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
        contentValues.put(DBIMUserColumn.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
        return contentValues;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r5 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r5 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.p313im.service.model.IMUser mo82684b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r2 = "select * from SIMPLE_USER where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBIMUserColumn r2 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBIMUserColumn.COLUMN_UID     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r1.append(r2)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r2 = " = "
            r1.append(r2)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r1.append(r5)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r1 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            android.database.Cursor r5 = r1.mo82675a(r5, r0)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            if (r5 == 0) goto L_0x003a
            boolean r1 = r5.moveToNext()     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            if (r1 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = m103358a(r5)     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            if (r5 == 0) goto L_0x0034
            r5.close()
        L_0x0034:
            return r1
        L_0x0035:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x003e
        L_0x003a:
            if (r5 == 0) goto L_0x004a
            goto L_0x0047
        L_0x003d:
            r5 = move-exception
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            throw r5
        L_0x0044:
            r5 = r0
        L_0x0045:
            if (r5 == 0) goto L_0x004a
        L_0x0047:
            r5.close()
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.mo82684b(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* renamed from: a */
    public final boolean mo82683a(IMUser iMUser) {
        if (iMUser == null || IMUser.isInvalidUser(iMUser.getUid())) {
            return false;
        }
        m103361b(iMUser);
        if (C31848b.m103344a().mo82674a("SIMPLE_USER", (String) null, m103363c(iMUser)) > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r4 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r4 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.p313im.service.model.IMUser> mo82680a(java.util.List<java.lang.String> r4, int r5, int r6) {
        /*
            r3 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            r0.<init>()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.String r1 = "select * from SIMPLE_USER"
            r0.append(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            boolean r1 = r4.isEmpty()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = " where sec_uid in ("
            r0.append(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            r1 = 0
        L_0x001c:
            int r2 = r4.size()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            if (r1 >= r2) goto L_0x0046
            java.lang.String r2 = "\""
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.Object r2 = r4.get(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            int r2 = r4.size()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            int r2 = r2 + -1
            if (r1 == r2) goto L_0x003e
            java.lang.String r2 = "\","
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            goto L_0x0043
        L_0x003e:
            java.lang.String r2 = "\""
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
        L_0x0043:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0046:
            java.lang.String r4 = ")"
            r0.append(r4)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
        L_0x004b:
            java.lang.String r4 = " limit 30"
            r0.append(r4)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r4 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            android.database.Cursor r4 = r4.mo82675a(r0, r6)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            if (r4 == 0) goto L_0x0070
        L_0x005e:
            boolean r6 = r4.moveToNext()     // Catch:{ Exception -> 0x007b, all -> 0x006c }
            if (r6 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = m103358a(r4)     // Catch:{ Exception -> 0x007b, all -> 0x006c }
            r5.add(r6)     // Catch:{ Exception -> 0x007b, all -> 0x006c }
            goto L_0x005e
        L_0x006c:
            r5 = move-exception
            r6 = r4
            r4 = r5
            goto L_0x0074
        L_0x0070:
            if (r4 == 0) goto L_0x0080
            goto L_0x007d
        L_0x0073:
            r4 = move-exception
        L_0x0074:
            if (r6 == 0) goto L_0x0079
            r6.close()
        L_0x0079:
            throw r4
        L_0x007a:
            r4 = r6
        L_0x007b:
            if (r4 == 0) goto L_0x0080
        L_0x007d:
            r4.close()
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.mo82680a(java.util.List, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r5 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r5 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.p313im.service.model.IMUser> mo82681a(java.util.List<java.lang.String> r5, int r6, int r7, java.lang.String r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.<init>()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r3 = "select * from SIMPLE_USER"
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r5 == 0) goto L_0x004a
            boolean r8 = r5.isEmpty()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r8 != 0) goto L_0x004a
            java.lang.String r8 = " and uid not in ("
            r2.append(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r8 = 0
        L_0x0026:
            int r3 = r5.size()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r8 >= r3) goto L_0x0045
            java.lang.Object r3 = r5.get(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            int r3 = r5.size()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            int r3 = r3 + -1
            if (r8 == r3) goto L_0x0042
            java.lang.String r3 = ","
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x0042:
            int r8 = r8 + 1
            goto L_0x0026
        L_0x0045:
            java.lang.String r5 = ")"
            r2.append(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x004a:
            if (r6 <= 0) goto L_0x0054
            java.lang.String r5 = " limit "
            r2.append(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x0054:
            if (r7 <= 0) goto L_0x005e
            java.lang.String r5 = " offset "
            r2.append(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r7)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x005e:
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r5 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            android.database.Cursor r5 = r5.mo82675a(r6, r1)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r5 == 0) goto L_0x007e
        L_0x006c:
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x0089, all -> 0x007a }
            if (r6 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = m103358a(r5)     // Catch:{ Exception -> 0x0089, all -> 0x007a }
            r0.add(r6)     // Catch:{ Exception -> 0x0089, all -> 0x007a }
            goto L_0x006c
        L_0x007a:
            r6 = move-exception
            r1 = r5
            r5 = r6
            goto L_0x0082
        L_0x007e:
            if (r5 == 0) goto L_0x008e
            goto L_0x008b
        L_0x0081:
            r5 = move-exception
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r1.close()
        L_0x0087:
            throw r5
        L_0x0088:
            r5 = r1
        L_0x0089:
            if (r5 == 0) goto L_0x008e
        L_0x008b:
            r5.close()
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a.mo82681a(java.util.List, int, int, java.lang.String):java.util.List");
    }
}
