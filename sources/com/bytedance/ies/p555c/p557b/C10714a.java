package com.bytedance.ies.p555c.p557b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.ies.p555c.C10702a;
import com.bytedance.ies.p555c.p558c.C10717a;
import com.bytedance.ies.p555c.p558c.C10717a.C10718a;
import com.bytedance.ies.p555c.p558c.C10717a.C10719b;
import com.bytedance.ies.p555c.p559d.C10722b;
import com.bytedance.p505d.p506a.C10031a;
import com.bytedance.p505d.p506a.C10032b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.bytedance.ies.c.b.a */
public class C10714a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C10714a f28634a;

    /* renamed from: b */
    private Context f28635b;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0163 A[SYNTHETIC, Splitter:B:37:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016d A[SYNTHETIC, Splitter:B:46:0x016d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31289a() {
        /*
            r12 = this;
            android.database.sqlite.SQLiteDatabase r8 = r12.getWritableDatabase()
            r8.beginTransaction()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r10 = r0.toString()
            r11 = 0
            java.lang.String r1 = "weboffline_statistic"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x016a, all -> 0x015f }
            int r1 = r0.getCount()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r2 = 20
            if (r1 >= r2) goto L_0x0033
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r8.endTransaction()
            return
        L_0x0033:
            r1 = r11
            r3 = r1
        L_0x0035:
            boolean r4 = r0.moveToNext()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            if (r4 == 0) goto L_0x0123
            com.bytedance.ies.c.c.a$b r1 = new com.bytedance.ies.c.c.a$b     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.<init>()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r3 = "app_version"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r4 = "device_id"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "resource_url"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28646a = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "access_key"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28647b = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "access_key"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28647b = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "channel"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28648c = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "mime_type"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28649d = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "offline_status"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28650e = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "offline_duration"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28651f = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "ac"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28652g = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "offline_rule"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28653h = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "err_code"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28654i = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "err_msg"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28655j = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "online_duration"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28657l = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "res_root_dir"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28658m = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28659n = r10     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "page_url"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28661p = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "pkg_version"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28656k = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f28660o = r11     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r9.add(r1)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1 = r3
            r3 = r4
            goto L_0x0035
        L_0x0123:
            java.lang.String r4 = "weboffline_statistic"
            r8.delete(r4, r11, r11)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r8.setTransactionSuccessful()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            if (r0 == 0) goto L_0x0130
            r0.close()     // Catch:{ Exception -> 0x0130 }
        L_0x0130:
            r8.endTransaction()
            int r0 = r9.size()
            int r0 = r0 / r2
            int r0 = r0 + 1
            r2 = 0
        L_0x013b:
            if (r2 >= r0) goto L_0x015c
            int r4 = r2 * 20
            int r5 = r9.size()
            if (r4 < r5) goto L_0x0146
            return
        L_0x0146:
            int r5 = r4 + 20
            int r6 = r9.size()
            if (r5 <= r6) goto L_0x0152
            int r5 = r9.size()
        L_0x0152:
            java.util.List r4 = r9.subList(r4, r5)
            r12.m31290a(r1, r3, r4)
            int r2 = r2 + 1
            goto L_0x013b
        L_0x015c:
            return
        L_0x015d:
            r1 = move-exception
            goto L_0x0161
        L_0x015f:
            r1 = move-exception
            r0 = r11
        L_0x0161:
            if (r0 == 0) goto L_0x0166
            r0.close()     // Catch:{ Exception -> 0x0166 }
        L_0x0166:
            r8.endTransaction()
            throw r1
        L_0x016a:
            r0 = r11
        L_0x016b:
            if (r0 == 0) goto L_0x0170
            r0.close()     // Catch:{ Exception -> 0x0170 }
        L_0x0170:
            r8.endTransaction()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p555c.p557b.C10714a.m31289a():void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists weboffline_statistic (id integer primary key autoincrement,time integer,app_version text,sdk_version text,device_id text,device_model text,region text,resource_url text,access_key text,channel text,mime_type text,offline_status integer,offline_duration integer,ac text,offline_rule text,err_code text,err_msg text,pkg_version integer,online_duration integer,res_root_dir text,log_id text,page_url text)");
    }

    /* renamed from: a */
    public static C10714a m31287a(Context context) {
        if (f28634a == null) {
            synchronized (C10714a.class) {
                if (f28634a == null) {
                    f28634a = new C10714a(context.getApplicationContext(), "web_offline_statistic.db", null, 1);
                }
            }
        }
        return f28634a;
    }

    /* renamed from: a */
    private Long m31288a(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        try {
            SQLiteDatabase writableDatabase = C10032b.m29806a(this.f28635b).getWritableDatabase();
            StringBuilder sb = new StringBuilder("SELECT name FROM sqlite_master WHERE type='table' AND name LIKE '%");
            sb.append(str);
            sb.append("'");
            cursor2 = writableDatabase.rawQuery(sb.toString(), null);
            if (cursor2 != null) {
                try {
                    if (cursor2.moveToNext()) {
                        cursor = writableDatabase.query(cursor2.getString(cursor2.getColumnIndex("name")), new String[]{C38347c.f99551f}, "channel=?", new String[]{str2}, null, null, null);
                        if (cursor != null) {
                            try {
                                if (cursor.moveToNext()) {
                                    Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex(C38347c.f99551f)));
                                    C10031a.m29804a(cursor2);
                                    C10031a.m29804a(cursor);
                                    return valueOf;
                                }
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                cursor3 = cursor2;
                                th = th2;
                                C10031a.m29804a(cursor3);
                                C10031a.m29804a(cursor);
                                throw th;
                            }
                        }
                        C10031a.m29804a(cursor2);
                        C10031a.m29804a(cursor);
                        return null;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    cursor3 = cursor2;
                    th = th3;
                    cursor = null;
                    C10031a.m29804a(cursor3);
                    C10031a.m29804a(cursor);
                    throw th;
                }
            }
            cursor = null;
        } catch (Exception unused3) {
            cursor2 = null;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
            C10031a.m29804a(cursor3);
            C10031a.m29804a(cursor);
            throw th;
        }
        C10031a.m29804a(cursor2);
        C10031a.m29804a(cursor);
        return null;
    }

    /* renamed from: a */
    private void m31290a(String str, String str2, List<C10719b> list) {
        String str3;
        try {
            if (TextUtils.isEmpty(C10702a.f28600d)) {
                str3 = "gecko.snssdk.com";
            } else {
                str3 = C10702a.f28600d;
            }
            StringBuilder sb = new StringBuilder("https://");
            sb.append(str3);
            sb.append("/gecko/server/falcon/stats");
            String sb2 = sb.toString();
            C10717a aVar = new C10717a();
            aVar.f28639b = list;
            aVar.f28638a = new C10718a();
            aVar.f28638a.f28640a = str;
            aVar.f28638a.f28642c = str2;
            String uuid = UUID.randomUUID().toString();
            for (C10719b bVar : list) {
                bVar.f28659n = uuid;
            }
            new Builder().build().newCall(new Request.Builder().url(sb2).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), new C6600e().mo15979b((Object) aVar))).build()).enqueue(new Callback() {
                public final void onFailure(Call call, IOException iOException) {
                }

                public final void onResponse(Call call, Response response) throws IOException {
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo25599a(String str, String str2, C10719b bVar) {
        if (bVar != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("app_version", str);
            contentValues.put("device_id", str2);
            contentValues.put("region", Locale.getDefault().getCountry());
            contentValues.put("resource_url", bVar.f28646a);
            contentValues.put("access_key", bVar.f28647b);
            contentValues.put("channel", bVar.f28648c);
            contentValues.put("mime_type", bVar.f28649d);
            contentValues.put("offline_status", bVar.f28650e);
            contentValues.put("offline_duration", bVar.f28651f);
            contentValues.put("ac", C10722b.m31300a(this.f28635b));
            contentValues.put("offline_rule", bVar.f28653h);
            contentValues.put("err_code", bVar.f28654i);
            contentValues.put("err_msg", bVar.f28655j);
            contentValues.put("online_duration", bVar.f28657l);
            contentValues.put("res_root_dir", bVar.f28658m);
            contentValues.put("page_url", bVar.f28661p);
            contentValues.put("pkg_version", m31288a(bVar.f28647b, bVar.f28648c));
            try {
                getWritableDatabase().insert("weboffline_statistic", null, contentValues);
                m31289a();
            } catch (Exception unused) {
            }
        }
    }

    private C10714a(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, null, 1);
        this.f28635b = context;
    }
}
