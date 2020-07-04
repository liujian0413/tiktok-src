package com.p280ss.android.ugc.aweme.tools.draft;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.gson.JsonParseException;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.draft.C27303b;
import com.p280ss.android.ugc.aweme.draft.C27305d;
import com.p280ss.android.ugc.aweme.draft.model.C27309a;
import com.p280ss.android.ugc.aweme.draft.model.C27310b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.DraftUpdateService;
import com.p280ss.android.ugc.aweme.effect.EffectListModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.tools.draft.p1667b.C42278a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.n */
public class C42297n {

    /* renamed from: a */
    private static C42297n f110053a;

    /* renamed from: b */
    private SQLiteDatabase f110054b = C27305d.m89405a().getWritableDatabase();

    /* renamed from: c */
    private SQLiteDatabase f110055c = C27305d.m89405a().getReadableDatabase();

    /* renamed from: g */
    private static String m134532g() {
        return C35563c.f93260w.mo57091d();
    }

    /* renamed from: b */
    public final List<C27311c> mo103779b() {
        return mo103774a((C27303b) null);
    }

    private C42297n() {
    }

    /* renamed from: a */
    public static C42297n m134523a() {
        if (f110053a == null) {
            synchronized (C42297n.class) {
                if (f110053a == null) {
                    f110053a = new C42297n();
                }
            }
        }
        return f110053a;
    }

    /* renamed from: f */
    private static String m134530f() {
        StringBuilder sb = new StringBuilder("local_draft' where user_id = '");
        sb.append(m134532g());
        sb.append("' or user_id");
        sb.append(" is null order by 'time");
        sb.append("' desc");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.draft.model.C27311c> mo103784e() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.f110055c     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.lang.String r3 = "select * from 'local_draft' order by 'time' desc"
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r2 == 0) goto L_0x0026
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0024 }
            if (r1 <= 0) goto L_0x0026
        L_0x0016:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0024 }
            if (r1 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.draft.model.c r1 = r5.m134522a(r2)     // Catch:{ Exception -> 0x0024 }
            r0.add(r1)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0016
        L_0x0024:
            r1 = move-exception
            goto L_0x0030
        L_0x0026:
            if (r2 == 0) goto L_0x0038
            goto L_0x0035
        L_0x0029:
            r0 = move-exception
            r2 = r1
            goto L_0x003a
        L_0x002c:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x0030:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r1)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0038
        L_0x0035:
            r2.close()
        L_0x0038:
            return r0
        L_0x0039:
            r0 = move-exception
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            r2.close()
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.draft.C42297n.mo103784e():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo103780c() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.f110055c     // Catch:{ Exception -> 0x0032 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            java.lang.String r4 = "select * from '"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r4 = m134530f()     // Catch:{ Exception -> 0x0032 }
            r3.append(r4)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0032 }
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0032 }
            if (r2 != 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x002b, all -> 0x0028 }
            r0 = r1
        L_0x0022:
            if (r2 == 0) goto L_0x003b
            r2.close()
            goto L_0x003b
        L_0x0028:
            r0 = move-exception
            r1 = r2
            goto L_0x003c
        L_0x002b:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x003c
        L_0x0032:
            r2 = move-exception
        L_0x0033:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x003b
            r1.close()
        L_0x003b:
            return r0
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.draft.C42297n.mo103780c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        if (r0 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        if (r0 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        m134525a((java.util.List<com.p280ss.android.ugc.aweme.tools.draft.p1667b.C42278a>) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ef, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.tools.draft.p1667b.C42278a> mo103782d() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from local_draft where user_id = '"
            r0.<init>(r1)
            java.lang.String r1 = m134532g()
            r0.append(r1)
            java.lang.String r1 = "' order by music_id"
            r0.append(r1)
            java.lang.String r1 = " desc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "DraftDBHelper before mReadableDataBase.rawQuery"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r3)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            android.database.sqlite.SQLiteDatabase r3 = r8.f110055c     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            android.database.Cursor r0 = r3.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r3 = "DraftDBHelper after mReadableDataBase.rawQuery"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r3)     // Catch:{ Exception -> 0x00db }
            if (r0 == 0) goto L_0x00d8
            int r3 = r0.getCount()     // Catch:{ Exception -> 0x00db }
            if (r3 <= 0) goto L_0x00d8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = "DraftDBHelper cursor.getCount:"
            r3.<init>(r4)     // Catch:{ Exception -> 0x00db }
            int r4 = r0.getCount()     // Catch:{ Exception -> 0x00db }
            r3.append(r4)     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00db }
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r3)     // Catch:{ Exception -> 0x00db }
        L_0x004f:
            boolean r3 = r0.moveToNext()     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = "DraftDBHelper cursor.moveToNext()"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r3)     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.draft.model.c r3 = r8.m134522a(r0)     // Catch:{ Exception -> 0x00db }
            boolean r4 = r1.isEmpty()     // Catch:{ Exception -> 0x00db }
            if (r4 != 0) goto L_0x0071
            int r4 = r1.size()     // Catch:{ Exception -> 0x00db }
            int r4 = r4 + -1
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.tools.draft.b.a r4 = (com.p280ss.android.ugc.aweme.tools.draft.p1667b.C42278a) r4     // Catch:{ Exception -> 0x00db }
            goto L_0x0072
        L_0x0071:
            r4 = r2
        L_0x0072:
            if (r4 != 0) goto L_0x0084
            com.ss.android.ugc.aweme.tools.draft.b.a r4 = new com.ss.android.ugc.aweme.tools.draft.b.a     // Catch:{ Exception -> 0x00db }
            r4.<init>()     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r3.f72036e     // Catch:{ Exception -> 0x00db }
            r4.f110029a = r5     // Catch:{ Exception -> 0x00db }
            r4.mo103760a(r3)     // Catch:{ Exception -> 0x00db }
            r1.add(r4)     // Catch:{ Exception -> 0x00db }
            goto L_0x004f
        L_0x0084:
            java.util.List r5 = r4.mo103759a()     // Catch:{ Exception -> 0x00db }
            if (r5 == 0) goto L_0x00c7
            java.util.List r5 = r4.mo103759a()     // Catch:{ Exception -> 0x00db }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00db }
            if (r5 != 0) goto L_0x00c7
            java.util.List r5 = r4.mo103759a()     // Catch:{ Exception -> 0x00db }
            r6 = 0
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.draft.model.c r5 = (com.p280ss.android.ugc.aweme.draft.model.C27311c) r5     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r5.f72036e     // Catch:{ Exception -> 0x00db }
            if (r5 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r3.f72036e     // Catch:{ Exception -> 0x00db }
            if (r5 == 0) goto L_0x00c7
            java.util.List r5 = r4.mo103759a()     // Catch:{ Exception -> 0x00db }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.draft.model.c r5 = (com.p280ss.android.ugc.aweme.draft.model.C27311c) r5     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r5.f72036e     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = r5.getMusicId()     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.shortvideo.AVMusic r6 = r3.f72036e     // Catch:{ Exception -> 0x00db }
            java.lang.String r6 = r6.getMusicId()     // Catch:{ Exception -> 0x00db }
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch:{ Exception -> 0x00db }
            if (r5 == 0) goto L_0x00c7
            r4.mo103760a(r3)     // Catch:{ Exception -> 0x00db }
            goto L_0x004f
        L_0x00c7:
            com.ss.android.ugc.aweme.tools.draft.b.a r4 = new com.ss.android.ugc.aweme.tools.draft.b.a     // Catch:{ Exception -> 0x00db }
            r4.<init>()     // Catch:{ Exception -> 0x00db }
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r3.f72036e     // Catch:{ Exception -> 0x00db }
            r4.f110029a = r5     // Catch:{ Exception -> 0x00db }
            r4.mo103760a(r3)     // Catch:{ Exception -> 0x00db }
            r1.add(r4)     // Catch:{ Exception -> 0x00db }
            goto L_0x004f
        L_0x00d8:
            if (r0 == 0) goto L_0x00ec
            goto L_0x00e9
        L_0x00db:
            r2 = move-exception
            goto L_0x00e4
        L_0x00dd:
            r1 = move-exception
            r0 = r2
            goto L_0x00f1
        L_0x00e0:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x00e4:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r2)     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00ec
        L_0x00e9:
            r0.close()
        L_0x00ec:
            m134525a(r1)
            return r1
        L_0x00f0:
            r1 = move-exception
        L_0x00f1:
            if (r0 == 0) goto L_0x00f6
            r0.close()
        L_0x00f6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.draft.C42297n.mo103782d():java.util.List");
    }

    /* renamed from: e */
    private void m134529e(C27311c cVar) {
        m134531f(cVar);
    }

    /* renamed from: a */
    public static String m134524a(C27311c cVar) {
        return cVar.mo70221aj();
    }

    /* renamed from: e */
    private static EffectListModel m134528e(String str) {
        try {
            return (EffectListModel) JSON.parseObject(str, EffectListModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final int mo103776b(C27303b bVar) {
        if (bVar == null) {
            return mo103780c();
        }
        return mo103774a(bVar).size();
    }

    /* renamed from: a */
    private static void m134525a(List<C42278a> list) {
        int size = list.size();
        int i = 0;
        while (i < size - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < size; i3++) {
                if (((C42278a) list.get(i3)).mo103761a((C42278a) list.get(i))) {
                    C42278a aVar = (C42278a) list.get(i);
                    list.set(i, list.get(i3));
                    list.set(i3, aVar);
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    private static C27309a m134526c(String str) {
        try {
            return (C27309a) C35563c.f93239b.mo15974a(str, C27309a.class);
        } catch (JsonParseException e) {
            C6921a.m21555a(str);
            C6921a.m21559a((Throwable) e);
            return new C27309a();
        } catch (Exception e2) {
            C6921a.m21555a(str);
            C6921a.m21559a((Throwable) e2);
            return new C27309a();
        }
    }

    /* renamed from: d */
    private static AVMusic m134527d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ((DraftUpdateService) ServiceManager.get().getService(DraftUpdateService.class)).transformNewAVMusic(str);
        } catch (JsonParseException e) {
            C6921a.m21555a(str);
            C6921a.m21559a((Throwable) e);
            return new AVMusic();
        } catch (Exception e2) {
            C6921a.m21555a(str);
            C6921a.m21559a((Throwable) e2);
            return new AVMusic();
        }
    }

    /* renamed from: b */
    public final synchronized int mo103777b(C27311c cVar) {
        String aj = cVar.mo70221aj();
        if (TextUtils.isEmpty(aj)) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("draft_extras", C35563c.f93239b.mo15979b((Object) cVar.f72031S));
        return this.f110054b.update("local_draft", contentValues, "video_path = ?", new String[]{aj});
    }

    /* renamed from: f */
    private static void m134531f(C27311c cVar) {
        if (cVar.f72031S != null && TextUtils.isEmpty(cVar.f72031S.f71961Y)) {
            cVar.f72031S.f71961Y = C35574k.m114859a().mo70097l().mo74949b().mo74962a(cVar.f72042k).mo74978b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.draft.model.C27311c> mo103774a(com.p280ss.android.ugc.aweme.draft.C27303b r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.f110055c     // Catch:{ Exception -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = "select * from '"
            r3.<init>(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = m134530f()     // Catch:{ Exception -> 0x004e }
            r3.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x004e }
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x004e }
            if (r2 == 0) goto L_0x0046
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r1 <= 0) goto L_0x0046
        L_0x0026:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r1 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.draft.model.c r1 = r5.m134522a(r2)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r6 == 0) goto L_0x003c
            boolean r3 = r6.mo70115a(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            if (r3 == 0) goto L_0x0026
            r0.add(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            goto L_0x0026
        L_0x003c:
            r0.add(r1)     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            goto L_0x0026
        L_0x0040:
            r6 = move-exception
            r1 = r2
            goto L_0x0058
        L_0x0043:
            r6 = move-exception
            r1 = r2
            goto L_0x004f
        L_0x0046:
            if (r2 == 0) goto L_0x0057
            r2.close()
            goto L_0x0057
        L_0x004c:
            r6 = move-exception
            goto L_0x0058
        L_0x004e:
            r6 = move-exception
        L_0x004f:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r6)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r0
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.draft.C42297n.mo103774a(com.ss.android.ugc.aweme.draft.b):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.draft.model.C27311c mo103778b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.lang.String r2 = "select * from local_draft where video_path = '"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            r1.append(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.lang.String r5 = "'"
            r1.append(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            java.io.PrintStream r1 = java.lang.System.out     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            r1.println(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            android.database.sqlite.SQLiteDatabase r1 = r4.f110055c     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            android.database.Cursor r5 = r1.rawQuery(r5, r0)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            r5.moveToNext()     // Catch:{ Exception -> 0x0039, all -> 0x002c }
            com.ss.android.ugc.aweme.draft.model.c r1 = r4.m134522a(r5)     // Catch:{ Exception -> 0x0039, all -> 0x002c }
            if (r5 == 0) goto L_0x002b
            r5.close()
        L_0x002b:
            return r1
        L_0x002c:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x0032
        L_0x0031:
            r5 = move-exception
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            throw r5
        L_0x0038:
            r5 = r0
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            r5.close()
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.draft.C42297n.mo103778b(java.lang.String):com.ss.android.ugc.aweme.draft.model.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo103783d(com.p280ss.android.ugc.aweme.draft.model.C27311c r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L_0x0035
            java.lang.String r0 = m134524a(r6)     // Catch:{ all -> 0x0032 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000e
            goto L_0x0035
        L_0x000e:
            android.database.sqlite.SQLiteDatabase r0 = r5.f110054b     // Catch:{ all -> 0x0032 }
            r0.beginTransaction()     // Catch:{ all -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r0 = r5.f110054b     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "local_draft"
            java.lang.String r2 = "video_path = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0032 }
            r4 = 0
            java.lang.String r6 = m134524a(r6)     // Catch:{ all -> 0x0032 }
            r3[r4] = r6     // Catch:{ all -> 0x0032 }
            r0.delete(r1, r2, r3)     // Catch:{ all -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f110054b     // Catch:{ all -> 0x0032 }
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0032 }
            android.database.sqlite.SQLiteDatabase r6 = r5.f110054b     // Catch:{ all -> 0x0032 }
            r6.endTransaction()     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)
            return
        L_0x0032:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0035:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.draft.C42297n.mo103783d(com.ss.android.ugc.aweme.draft.model.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.tools.draft.p1668c.C42281b> mo103775a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from local_draft where user_id = '"
            r0.<init>(r1)
            java.lang.String r1 = m134532g()
            r0.append(r1)
            java.lang.String r1 = "' order by music_id"
            r0.append(r1)
            java.lang.String r1 = " desc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.ugc.aweme.tools.draft.c.d r2 = new com.ss.android.ugc.aweme.tools.draft.c.d
            r2.<init>()
            r1.add(r2)
            com.ss.android.ugc.aweme.tools.draft.c.e r2 = new com.ss.android.ugc.aweme.tools.draft.c.e
            r2.<init>()
            r1.add(r2)
            com.ss.android.ugc.aweme.tools.draft.c.c r2 = new com.ss.android.ugc.aweme.tools.draft.c.c
            r2.<init>()
            r1.add(r2)
            com.ss.android.ugc.aweme.tools.draft.c.a r2 = new com.ss.android.ugc.aweme.tools.draft.c.a
            r2.<init>()
            r1.add(r2)
            r2 = 0
            java.lang.String r3 = "DraftDBHelper before mReadableDataBase.rawQuery v2"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r3)     // Catch:{ Exception -> 0x00b5 }
            android.database.sqlite.SQLiteDatabase r3 = r6.f110055c     // Catch:{ Exception -> 0x00b5 }
            android.database.Cursor r0 = r3.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r2 = "DraftDBHelper after mReadableDataBase.rawQuery v2"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r0 == 0) goto L_0x00a7
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r2 <= 0) goto L_0x00a7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.lang.String r3 = "DraftDBHelper cursor.getCount:"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            int r3 = r0.getCount()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            r2.append(r3)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.lang.String r3 = " v2"
            r2.append(r3)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
        L_0x0074:
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r2 == 0) goto L_0x00a7
            java.lang.String r2 = "DraftDBHelper cursor.moveToNext() v2"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            com.ss.android.ugc.aweme.draft.model.c r2 = r6.m134522a(r0)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
        L_0x0087:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            com.ss.android.ugc.aweme.tools.draft.c.b r4 = (com.p280ss.android.ugc.aweme.tools.draft.p1668c.C42281b) r4     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            boolean r5 = r4.mo103763a(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r5 == 0) goto L_0x0087
            java.lang.String r5 = r2.mo70221aj()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            boolean r5 = android.text.TextUtils.equals(r5, r7)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            if (r5 != 0) goto L_0x0087
            r4.mo103765b(r2)     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            goto L_0x0074
        L_0x00a7:
            if (r0 == 0) goto L_0x00be
            r0.close()
            goto L_0x00be
        L_0x00ad:
            r7 = move-exception
            goto L_0x00bf
        L_0x00af:
            r7 = move-exception
            r2 = r0
            goto L_0x00b6
        L_0x00b2:
            r7 = move-exception
            r0 = r2
            goto L_0x00bf
        L_0x00b5:
            r7 = move-exception
        L_0x00b6:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r7)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x00be
            r2.close()
        L_0x00be:
            return r1
        L_0x00bf:
            if (r0 == 0) goto L_0x00c4
            r0.close()
        L_0x00c4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.draft.C42297n.mo103775a(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    private C27311c m134522a(Cursor cursor) {
        C27311c cVar = new C27311c();
        String string = cursor.getString(cursor.getColumnIndex("user_id"));
        if (TextUtils.isEmpty(string)) {
            string = m134532g();
        }
        cVar.f72035d = cursor.getString(cursor.getColumnIndex("video_path"));
        cVar.f72017E = string;
        cVar.f72033b = m134526c(cursor.getString(cursor.getColumnIndex("aweme")));
        cVar.f72036e = m134527d(cursor.getString(cursor.getColumnIndex("music")));
        cVar.f72038g = cursor.getString(cursor.getColumnIndex("music_path"));
        cVar.f72040i = cursor.getInt(cursor.getColumnIndex("video_volume"));
        cVar.f72041j = cursor.getInt(cursor.getColumnIndex("music_volume"));
        cVar.mo70249e(cursor.getInt(cursor.getColumnIndex("filter")));
        cVar.f72043l = cursor.getInt(cursor.getColumnIndex("music_start"));
        cVar.f72039h = cursor.getString(cursor.getColumnIndex("voice_path"));
        cVar.f72018F = cursor.getLong(cursor.getColumnIndex("time"));
        cVar.f72044m = cursor.getInt(cursor.getColumnIndex("effect"));
        cVar.f72045n = cursor.getInt(cursor.getColumnIndex("origin"));
        cVar.f72016D = cursor.getInt(cursor.getColumnIndex("face_beauty"));
        cVar.f72019G = cursor.getString(cursor.getColumnIndex("segment_video"));
        cVar.f72020H = cursor.getInt(cursor.getColumnIndex("hard_encode"));
        cVar.f72021I = cursor.getInt(cursor.getColumnIndex("special_points"));
        cVar.f72022J = cursor.getString(cursor.getColumnIndex("sticker_path"));
        cVar.f72023K = cursor.getString(cursor.getColumnIndex("sticker_id"));
        cVar.f72051t = cursor.getInt(cursor.getColumnIndex("camera_poi"));
        cVar.f72050s = cursor.getString(cursor.getColumnIndex("filter_label"));
        cVar.f72014B = m134528e(cursor.getString(cursor.getColumnIndex("effect_list")));
        cVar.f72052u = cursor.getInt(cursor.getColumnIndex("beauty_label"));
        cVar.f72046o = cursor.getString(cursor.getColumnIndex("reverse_path"));
        cVar.f72047p = cursor.getString(cursor.getColumnIndex("video_speed"));
        cVar.f72013A = cursor.getInt(cursor.getColumnIndex("is_private"));
        cVar.f72015C = (long) cursor.getInt(cursor.getColumnIndex("max_duration"));
        cVar.f72048q = (UrlModel) C35563c.f93239b.mo15974a(cursor.getString(cursor.getColumnIndex("audio_track")), UrlModel.class);
        cVar.mo70246d(cursor.getString(cursor.getColumnIndex("photo_movie")));
        cVar.mo70258g(cursor.getString(cursor.getColumnIndex("music_effect_segments")));
        cVar.mo70257g(cursor.getInt(cursor.getColumnIndex("new_version")));
        cVar.mo70186a(cursor.getFloat(cursor.getColumnIndex("custom_cover_start")));
        cVar.f72028P = cursor.getString(cursor.getColumnIndex("duet_from"));
        cVar.f72029Q = cursor.getString(cursor.getColumnIndex("sync_platforms"));
        cVar.mo70191a((C27310b) C35563c.f93239b.mo15974a(cursor.getString(cursor.getColumnIndex("draft_extras")), C27310b.class));
        if (cVar.f72031S == null || TextUtils.isEmpty(cVar.f72031S.f71951O)) {
            cVar.mo70240c(cursor.getString(cursor.getColumnIndex("video_path")));
        }
        return cVar;
    }

    /* renamed from: c */
    public final long mo103781c(C27311c cVar) {
        String str;
        String str2;
        String str3;
        String jSONString;
        m134529e(cVar);
        ContentValues contentValues = new ContentValues();
        String str4 = "aweme";
        if (cVar.f72033b == null) {
            str = "";
        } else {
            str = JSON.toJSONString(cVar.f72033b);
        }
        contentValues.put(str4, str);
        contentValues.put("video_path", m134524a(cVar));
        contentValues.put("music_path", cVar.f72038g);
        contentValues.put("video_volume", Integer.valueOf(cVar.f72040i));
        contentValues.put("music_volume", Integer.valueOf(cVar.f72041j));
        String str5 = "music";
        if (cVar.f72036e == null) {
            str2 = "";
        } else {
            str2 = JSON.toJSONString(cVar.f72036e);
        }
        contentValues.put(str5, str2);
        contentValues.put("filter", Integer.valueOf(cVar.f72042k));
        contentValues.put("music_start", Integer.valueOf(cVar.f72043l));
        contentValues.put("time", Long.valueOf(cVar.f72018F));
        contentValues.put("effect", Integer.valueOf(cVar.f72044m));
        contentValues.put("origin", Integer.valueOf(cVar.f72045n));
        contentValues.put("face_beauty", Integer.valueOf(cVar.f72016D));
        contentValues.put("user_id", cVar.f72017E);
        contentValues.put("segment_video", cVar.f72019G);
        contentValues.put("hard_encode", Integer.valueOf(cVar.f72020H));
        contentValues.put("special_points", Integer.valueOf(cVar.f72021I));
        contentValues.put("sticker_path", cVar.f72022J);
        contentValues.put("sticker_id", cVar.f72023K);
        contentValues.put("camera_poi", Integer.valueOf(cVar.f72051t));
        contentValues.put("filter_label", cVar.f72050s);
        contentValues.put("beauty_label", Integer.valueOf(cVar.f72052u));
        contentValues.put("video_speed", cVar.f72047p);
        contentValues.put("music_effect_segments", cVar.f72025M);
        contentValues.put("is_private", Integer.valueOf(cVar.f72013A));
        contentValues.put("max_duration", Long.valueOf(cVar.f72015C));
        contentValues.put("audio_track", C35563c.f93239b.mo15979b((Object) cVar.f72048q));
        String str6 = "photo_movie";
        if (cVar.f72034c == null) {
            str3 = "";
        } else {
            str3 = C35563c.f93239b.mo15979b((Object) cVar.f72034c);
        }
        contentValues.put(str6, str3);
        String str7 = "";
        try {
            if (cVar.f72014B == null) {
                jSONString = "";
            } else {
                jSONString = JSON.toJSONString(cVar.f72014B);
            }
            str7 = jSONString;
        } catch (Exception unused) {
        }
        contentValues.put("effect_list", str7);
        String str8 = "";
        if (!(cVar.f72036e == null || cVar.f72036e.getMusicId() == null)) {
            str8 = cVar.f72036e.getMusicId();
        }
        contentValues.put("music_id", str8);
        contentValues.put("new_version", Integer.valueOf(cVar.f72026N));
        contentValues.put("custom_cover_start", Float.valueOf(cVar.f72027O));
        contentValues.put("duet_from", cVar.f72028P);
        contentValues.put("sync_platforms", cVar.f72029Q);
        contentValues.put("draft_extras", C35563c.f93239b.mo15979b((Object) cVar.f72031S));
        long replace = this.f110054b.replace("local_draft", null, contentValues);
        if (replace > 0) {
            C6893q.m21444a("aweme_draft_create_fail_rate", 0, (JSONObject) null);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(replace);
            C6893q.m21444a("aweme_draft_create_fail_rate", 1, C6869c.m21381a().mo16887a("rowId", sb.toString()).mo16888b());
        }
        return replace;
    }
}
