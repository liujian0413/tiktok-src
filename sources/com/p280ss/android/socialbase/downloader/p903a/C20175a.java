package com.p280ss.android.socialbase.downloader.p903a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import java.io.File;

/* renamed from: com.ss.android.socialbase.downloader.a.a */
public class C20175a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C20175a f54585a;

    /* renamed from: b */
    private boolean f54586b = false;

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private C20175a() {
        super(C20269b.m66765x(), "downloader.db", null, 12);
    }

    /* renamed from: a */
    public static C20175a m66445a() {
        if (f54585a == null) {
            synchronized (C20175a.class) {
                if (f54585a == null) {
                    f54585a = new C20175a();
                }
            }
        }
        return f54585a;
    }

    public SQLiteDatabase getReadableDatabase() {
        Context x = C20269b.m66765x();
        if (this.f54586b || x == null) {
            return super.getReadableDatabase();
        }
        try {
            StringBuilder sb = new StringBuilder("/data/data/");
            sb.append(x.getPackageName());
            sb.append("/database/main/");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdir();
            }
            super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
            this.f54586b = true;
        } catch (Exception unused) {
        }
        return super.getReadableDatabase();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005f, code lost:
        r1.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
        r1.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007d, code lost:
        r1.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r1.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        r1.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        r1.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        r1.execSQL("ALTER TABLE downloader ADD packageName TEXT");
        r1.execSQL("ALTER TABLE downloader ADD md5 TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r1.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
        r1.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        r1.execSQL("ALTER TABLE downloadChunk ADD chunkContentLen INTEGER");
        r1.execSQL("ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0055, code lost:
        r1.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        r1.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
        /*
            r0 = this;
            switch(r2) {
                case 1: goto L_0x0005;
                case 2: goto L_0x0019;
                case 3: goto L_0x001e;
                case 4: goto L_0x0023;
                case 5: goto L_0x002d;
                case 6: goto L_0x0037;
                case 7: goto L_0x004b;
                case 8: goto L_0x0055;
                case 9: goto L_0x005a;
                case 10: goto L_0x005f;
                case 11: goto L_0x007d;
                default: goto L_0x0003;
            }
        L_0x0003:
            goto L_0x0082
        L_0x0005:
            java.lang.String r2 = "ALTER TABLE downloader ADD mimeType TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD title TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD notificationEnable INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD notificationVisibility INTEGER"
            r1.execSQL(r2)
        L_0x0019:
            java.lang.String r2 = "ALTER TABLE downloader ADD isFirstDownload INTEGER"
            r1.execSQL(r2)
        L_0x001e:
            java.lang.String r2 = "ALTER TABLE downloader ADD isFirstSuccess INTEGER"
            r1.execSQL(r2)
        L_0x0023:
            java.lang.String r2 = "ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD downloadTime INTEGER"
            r1.execSQL(r2)
        L_0x002d:
            java.lang.String r2 = "ALTER TABLE downloader ADD packageName TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD md5 TEXT"
            r1.execSQL(r2)
        L_0x0037:
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelay INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD curRetryTime INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelayStatus INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER"
            r1.execSQL(r2)
        L_0x004b:
            java.lang.String r2 = "ALTER TABLE downloadChunk ADD chunkContentLen INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER"
            r1.execSQL(r2)
        L_0x0055:
            java.lang.String r2 = "ALTER TABLE downloader ADD chunkRunnableReuse INTEGER"
            r1.execSQL(r2)
        L_0x005a:
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelayTimeArray TEXT"
            r1.execSQL(r2)
        L_0x005f:
            java.lang.String r2 = "ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD backUpUrlsStr TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD realDownloadTime INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD retryScheduleMinutes INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD independentProcess INTEGER"
            r1.execSQL(r2)
        L_0x007d:
            java.lang.String r2 = "ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT"
            r1.execSQL(r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p903a.C20175a.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
