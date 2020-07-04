package com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b;

import android.content.ContentValues;
import android.database.Cursor;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.UserExtra;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBUserExtraColumn;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.storage.b.b */
public class C31851b {

    /* renamed from: a */
    private static C31851b f83316a;

    /* renamed from: c */
    public static String m103387c() {
        return "drop table if exists USER_EXTRA";
    }

    /* renamed from: a */
    public static C31851b m103384a() {
        if (f83316a == null) {
            synchronized (C31851b.class) {
                if (f83316a == null) {
                    f83316a = new C31851b();
                }
            }
        }
        return f83316a;
    }

    /* renamed from: b */
    public static String m103386b() {
        DBUserExtraColumn[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists USER_EXTRA (");
        for (DBUserExtraColumn dBUserExtraColumn : DBUserExtraColumn.values()) {
            sb.append(dBUserExtraColumn.key);
            sb.append(" ");
            sb.append(dBUserExtraColumn.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: b */
    private static ContentValues m103385b(UserExtra userExtra) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBUserExtraColumn.COLUMN_UID.key, userExtra.getUid());
        contentValues.put(DBUserExtraColumn.COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR.key, Integer.valueOf(userExtra.getIsDisableShowFollowBar() ? 1 : 0));
        contentValues.put(DBUserExtraColumn.COLUMN_IS_SAY_HELLO_LOGGER.key, Integer.valueOf(userExtra.getIsSayHelloLogger() ? 1 : 0));
        return contentValues;
    }

    /* renamed from: a */
    public final boolean mo82689a(UserExtra userExtra) {
        if (C31848b.m103344a().mo82674a("USER_EXTRA", (String) null, m103385b(userExtra)) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static UserExtra m103383a(Cursor cursor) {
        boolean z;
        if (cursor == null) {
            return null;
        }
        UserExtra userExtra = new UserExtra();
        userExtra.setUid(cursor.getString(cursor.getColumnIndex(DBUserExtraColumn.COLUMN_UID.key)));
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndex(DBUserExtraColumn.COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR.key)) > 0) {
            z = true;
        } else {
            z = false;
        }
        userExtra.setIsDisableShowFollowBar(z);
        if (cursor.getInt(cursor.getColumnIndex(DBUserExtraColumn.COLUMN_IS_SAY_HELLO_LOGGER.key)) > 0) {
            z2 = true;
        }
        userExtra.setIsSayHelloLogger(z2);
        return userExtra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r6 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r6 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.UserExtra mo82688a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "select * from USER_EXTRA where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.ss.android.ugc.aweme.im.sdk.storage.column.DBUserExtraColumn r2 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.column.DBUserExtraColumn.COLUMN_UID     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r1.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = " = "
            r1.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r1.append(r6)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.ss.android.ugc.aweme.im.sdk.storage.a.b r1 = com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a.C31848b.m103344a()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            android.database.Cursor r6 = r1.mo82675a(r6, r0)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            if (r6 == 0) goto L_0x0037
            boolean r1 = r6.moveToNext()     // Catch:{ Exception -> 0x0035 }
            if (r1 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra r1 = m103383a(r6)     // Catch:{ Exception -> 0x0035 }
            if (r6 == 0) goto L_0x0034
            r6.close()
        L_0x0034:
            return r1
        L_0x0035:
            r1 = move-exception
            goto L_0x003e
        L_0x0037:
            if (r6 == 0) goto L_0x0054
            goto L_0x0051
        L_0x003a:
            r6 = move-exception
            goto L_0x0059
        L_0x003c:
            r1 = move-exception
            r6 = r0
        L_0x003e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "getUserExtraByUid "
            r2.<init>(r3)     // Catch:{ all -> 0x0055 }
            r2.append(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0055 }
            com.bytedance.p263im.core.internal.utils.C11404d.m33591d(r1)     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0054
        L_0x0051:
            r6.close()
        L_0x0054:
            return r0
        L_0x0055:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31851b.mo82688a(java.lang.String):com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra");
    }
}
