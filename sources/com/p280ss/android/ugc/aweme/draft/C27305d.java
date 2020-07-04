package com.p280ss.android.ugc.aweme.draft;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.draft.model.C27310b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.draft.d */
public class C27305d extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C27305d f71921a;

    private C27305d() {
        super(C35574k.m114861b().getApplicationContext(), "aweme.db", null, 20);
    }

    /* renamed from: a */
    public static C27305d m89405a() {
        if (f71921a == null) {
            synchronized (C27305d.class) {
                if (f71921a == null) {
                    f71921a = new C27305d();
                }
            }
        }
        return f71921a;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `local_draft` (\n\t`video_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`aweme`\tTEXT NOT NULL,\n\t`music_path`\tTEXT,\n\t`voice_path`\tTEXT ,\n\t`video_volume`\tINTEGER NOT NULL,\n\t`music_volume`\tINTEGER NOT NULL,\n\t`filter`\tINTEGER NOT NULL,\n\t`music`\tTEXT,\n\t`music_start`\tINTEGER NOT NULL,\n\t`time`\tLONG NOT NULL,\n\t`effect`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`face_beauty`\tINTEGER,\n\t`user_id`\tTEXT,\n\t`segment_video`\tTEXT,\n\t`segment_sdk`\tTEXT,\n\t`hard_encode`\tINTEGER,\n\t`special_points`\tINTEGER,\n\t`sticker_id`\tTEXT,\n\t`music_id`\tTEXT,\n\t`sticker_path`\tTEXT,\n\t`effect_list`\tTEXT,\n\t`camera_poi`\tINTEGER,\n\t`filter_label`\tTEXT,\n\t`beauty_label`\tINTEGER,\n\t`reverse_path`\tTEXT,\n\t`music_effect`\tTEXT,\n\t`video_speed`\tTEXT,\n\t`music_effect_segments`\tTEXT,\n\t`is_private`\tINTEGER,\n\t`max_duration`\tINTEGER,\n\t`audio_track`\tTEXT,\n\t`new_version`\tINTEGER,\n\t`output_wav_path`\tTEXT,\n\t`custom_cover_start`\tFLOAT,\n\t`video_width`\tINTEGER\tDEFAULT 540,\n\t`video_height`\tINTEGER\tDEFAULT 960,\n\t`duet_from`\tTEXT,\n\t`sync_platforms`\tTEXT,\n\t`photo_movie`\tTEXT,\n\t`draft_extras`\tTEXT\n);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            C9738o.m28693a(C35574k.m114861b().getApplicationContext(), (int) R.string.fk5);
            System.exit(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r4.isClosed() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r4.isClosed() == false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m89406a(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            java.lang.String r3 = "SELECT * FROM "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            r2.append(r5)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            java.lang.String r5 = " LIMIT 0"
            r2.append(r5)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            android.database.Cursor r4 = r4.rawQuery(r5, r0)     // Catch:{ Exception -> 0x0041, all -> 0x0034 }
            if (r4 == 0) goto L_0x0028
            int r5 = r4.getColumnIndex(r6)     // Catch:{ Exception -> 0x0042, all -> 0x0025 }
            r6 = -1
            if (r5 == r6) goto L_0x0028
            r5 = 1
            r1 = 1
            goto L_0x0028
        L_0x0025:
            r5 = move-exception
            r0 = r4
            goto L_0x0035
        L_0x0028:
            if (r4 == 0) goto L_0x004b
            boolean r5 = r4.isClosed()
            if (r5 != 0) goto L_0x004b
        L_0x0030:
            r4.close()
            goto L_0x004b
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            if (r0 == 0) goto L_0x0040
            boolean r4 = r0.isClosed()
            if (r4 != 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r5
        L_0x0041:
            r4 = r0
        L_0x0042:
            if (r4 == 0) goto L_0x004b
            boolean r5 = r4.isClosed()
            if (r5 != 0) goto L_0x004b
            goto L_0x0030
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.draft.C27305d.m89406a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C35574k.m114859a().mo70073G().mo57087a(true);
        if (i == 1 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN effect INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN origin INTEGER");
        }
        if (i <= 2 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN face_beauty INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN user_id TEXT");
        }
        if (i <= 3 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN segment_video TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN segment_sdk TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN hard_encode INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN special_points INTEGER");
        }
        if (i <= 4 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN sticker_path TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN sticker_id TEXT");
        }
        if (i <= 5 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN music_id TEXT");
        }
        if (i <= 6 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN effect_list TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN camera_poi INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN filter_label TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN beauty_label INTEGER");
        }
        if (i <= 7 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN reverse_path TEXT");
        }
        if (i <= 8 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN music_effect TEXT");
        }
        if (i <= 9 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN video_speed TEXT");
        }
        if (i <= 10 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN music_effect_segments TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN is_private INTEGER");
        }
        if (i <= 11 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN max_duration INTEGER");
            sQLiteDatabase.execSQL("UPDATE local_draft SET max_duration = 15000");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN audio_track TEXT");
        }
        if (i <= 12 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN new_version INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN output_wav_path TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN custom_cover_start FLOAT");
        }
        if (i <= 13 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN video_width INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN video_height INTEGER");
        }
        if (i <= 14 && i != i2) {
            sQLiteDatabase.execSQL(" UPDATE local_draft SET video_width = 540 ");
            sQLiteDatabase.execSQL(" UPDATE local_draft SET video_height = 960 ");
        }
        if (i <= 15 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN duet_from TEXT");
            if (!C6399b.m19946v()) {
                sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN sync_platforms TEXT");
            }
        }
        if (i <= 16 && i != i2) {
            if (C6399b.m19946v()) {
                sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN sync_platforms TEXT");
            }
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN photo_movie TEXT");
        }
        if (i <= 17 && i != i2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
        }
        if (i <= 18 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN draft_extras TEXT");
            C27310b bVar = new C27310b();
            bVar.f71963a = 1;
            bVar.f71988b = 3;
            String b = C35574k.m114859a().mo70085S().mo15979b((Object) bVar);
            StringBuilder sb = new StringBuilder(" UPDATE local_draft SET draft_extras = '");
            sb.append(b);
            sb.append("'");
            sQLiteDatabase.execSQL(sb.toString());
        }
        if (C6399b.m19947w()) {
            if (i <= 19 && i != i2) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `face` (\n\t`path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`origin_path`\tTEXT NOT NULL,\n\t`width`\tINTEGER\tDEFAULT 0,\n\t`height`\tINTEGER\tDEFAULT 0,\n\t`date_added`\tINTEGER\tDEFAULT 0\n);");
            }
            if (i <= 19 && i != i2) {
                C27310b bVar2 = new C27310b();
                bVar2.f71963a = 1;
                bVar2.f71988b = 3;
                String b2 = C35574k.m114859a().mo70085S().mo15979b((Object) bVar2);
                if (!m89406a(sQLiteDatabase, "local_draft", "draft_extras")) {
                    sQLiteDatabase.execSQL("ALTER TABLE local_draft ADD COLUMN draft_extras TEXT");
                    StringBuilder sb2 = new StringBuilder(" UPDATE local_draft SET draft_extras = '");
                    sb2.append(b2);
                    sb2.append("'");
                    sQLiteDatabase.execSQL(sb2.toString());
                    return;
                }
                StringBuilder sb3 = new StringBuilder(" UPDATE local_draft SET draft_extras = '");
                sb3.append(b2);
                sb3.append("' WHERE draft_extras");
                sb3.append(" IS NULL");
                sQLiteDatabase.execSQL(sb3.toString());
            }
        }
    }
}
