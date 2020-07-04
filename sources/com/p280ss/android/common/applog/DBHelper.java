package com.p280ss.android.common.applog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.applog.AppLog.ILogSessionHook;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.DBHelper */
class DBHelper {
    static volatile String DB_NAME = "ss_app_log.db";
    static final String[] EVENT_COLS = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json", "user_id", "timestamp", "session_id", "event_index"};
    static final String[] MISC_LOG_COLS = {"_id", "log_type", "value", "session_id"};
    static final String[] MON_LOG_COLS = {"_id", "log_type", "value"};
    static final String[] PAGE_COLS = {"_id", "name", "duration", "session_id"};
    static final String[] QUEUE_COLS = {"_id", "value", "is_crash", "timestamp", "retry_count", "retry_time", "log_type"};
    static final String[] SESSION_COLS = {"_id", "value", "timestamp", "duration", "non_page", "app_version", "version_code", "pausetime", "launch_sent", "event_index"};
    private static DBHelper mInstance;
    private static final Object mLock = new Object();
    private final Context mContext;
    private SQLiteDatabase mDb;

    /* renamed from: com.ss.android.common.applog.DBHelper$OpenHelper */
    static class OpenHelper extends SQLiteOpenHelper {
        public OpenHelper(Context context) {
            super(context, DBHelper.DB_NAME, null, 9);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE session ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value VARCHAR NOT NULL, timestamp INTEGER, duration INTEGER, non_page INTEGER, app_version VARCHAR, version_code INTEGER, pausetime INTEGER,launch_sent INTEGER NOT NULL DEFAULT 0, event_index INTEGER NOT NULL DEFAULT 0  )");
                sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT, user_id INTEGER, timestamp INTEGER, session_id INTEGER, event_index INTEGER NOT NULL DEFAULT 0 )");
                sQLiteDatabase.execSQL("CREATE TABLE page ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, duration INTEGER, session_id INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT, is_crash INTEGER NOT NULL DEFAULT 0, log_type INTEGER NOT NULL DEFAULT 0, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE mon_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT )");
                sQLiteDatabase.execSQL("CREATE TABLE misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
            } catch (Exception unused) {
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 2) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN user_id INTEGER");
            }
            if (i < 3) {
                sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN launch_sent INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 4) {
                sQLiteDatabase.execSQL("ALTER TABLE queue ADD COLUMN is_crash INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 5) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN ext_json TEXT");
            }
            if (i < 6) {
                sQLiteDatabase.execSQL("ALTER TABLE queue ADD COLUMN log_type INTEGER NOT NULL DEFAULT 0");
                sQLiteDatabase.execSQL("CREATE TABLE mon_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT )");
            }
            if (i < 7) {
                sQLiteDatabase.execSQL("CREATE TABLE misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
            }
            if (i < 8) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 9) {
                sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
        }
    }

    static int bool2int(boolean z) {
        return z ? 1 : 0;
    }

    public static void closeDB() {
        synchronized (mLock) {
            if (mInstance != null) {
                mInstance.closeDatabase();
            }
        }
    }

    private synchronized void closeDatabase() {
        try {
            if (this.mDb != null && this.mDb.isOpen()) {
                this.mDb.close();
                this.mDb = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void cleanExpireLog() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.database.sqlite.SQLiteDatabase r0 = r5.mDb     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            android.database.sqlite.SQLiteDatabase r0 = r5.mDb     // Catch:{ all -> 0x002f }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x000e
            goto L_0x002d
        L_0x000e:
            java.lang.String r0 = "timestamp <= ? OR retry_count > 5"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x002f }
            r3 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r1 = r1 - r3
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x002f }
            r4 = 0
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x002f }
            r3[r4] = r1     // Catch:{ all -> 0x002f }
            android.database.sqlite.SQLiteDatabase r1 = r5.mDb     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "queue"
            r1.delete(r2, r0, r3)     // Catch:{ Exception -> 0x002b }
            monitor-exit(r5)
            return
        L_0x002b:
            monitor-exit(r5)
            return
        L_0x002d:
            monitor-exit(r5)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.cleanExpireLog():void");
    }

    private long insertLog(String str) {
        return insertLog(str, 0);
    }

    /* access modifiers changed from: 0000 */
    public long insertCrashLog(String str) {
        return insertLog(str, 1);
    }

    protected static void safeCloseCursor(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    static void setDBName(String str) {
        if (!C6319n.m19593a(str)) {
            DB_NAME = str;
        }
    }

    private DBHelper(Context context) {
        this.mDb = new OpenHelper(context).getWritableDatabase();
        this.mContext = context;
    }

    public static DBHelper getInstance(Context context) {
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new DBHelper(context.getApplicationContext());
            }
        }
        return mInstance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean deleteEvent(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.mDb     // Catch:{ all -> 0x002a }
            r1 = 0
            if (r0 == 0) goto L_0x0028
            android.database.sqlite.SQLiteDatabase r0 = r4.mDb     // Catch:{ all -> 0x002a }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x002a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x002a }
            r2[r1] = r5     // Catch:{ all -> 0x002a }
            android.database.sqlite.SQLiteDatabase r5 = r4.mDb     // Catch:{ all -> 0x002a }
            java.lang.String r6 = "event"
            java.lang.String r3 = "_id = ?"
            int r5 = r5.delete(r6, r3, r2)     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x0026
            monitor-exit(r4)
            return r0
        L_0x0026:
            monitor-exit(r4)
            return r1
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.deleteEvent(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setSessionLaunchSent(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.mDb     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0033
            android.database.sqlite.SQLiteDatabase r0 = r4.mDb     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0033
        L_0x000e:
            java.lang.String r0 = "_id=?"
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0031 }
            r3 = 0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0031 }
            r2[r3] = r5     // Catch:{ Exception -> 0x0031 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x0031 }
            r5.<init>()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = "launch_sent"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0031 }
            r5.put(r6, r1)     // Catch:{ Exception -> 0x0031 }
            android.database.sqlite.SQLiteDatabase r6 = r4.mDb     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "session"
            r6.update(r1, r5, r0, r2)     // Catch:{ Exception -> 0x0031 }
            monitor-exit(r4)
            return
        L_0x0031:
            monitor-exit(r4)
            return
        L_0x0033:
            monitor-exit(r4)
            return
        L_0x0035:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.setSessionLaunchSent(long):void");
    }

    public synchronized long insertSession(LogSession logSession) {
        if (this.mDb != null) {
            if (this.mDb.isOpen()) {
                boolean z = logSession.non_page;
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", logSession.value);
                contentValues.put("timestamp", Long.valueOf(logSession.timestamp));
                contentValues.put("duration", Integer.valueOf(logSession.duration));
                contentValues.put("non_page", Integer.valueOf(z ? 1 : 0));
                contentValues.put("app_version", logSession.app_version);
                contentValues.put("version_code", Integer.valueOf(logSession.version_code));
                contentValues.put("event_index", Long.valueOf(logSession.eventIndex));
                return this.mDb.insert("session", null, contentValues);
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        return null;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0071=Splitter:B:20:0x0071, B:27:0x007a=Splitter:B:27:0x007a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.p280ss.android.common.applog.LogItem getLog(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ all -> 0x0086 }
            r1 = 0
            if (r0 == 0) goto L_0x0084
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ all -> 0x0086 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0084
        L_0x0010:
            java.lang.String r9 = "_id ASC"
            java.lang.String r10 = "1"
            java.lang.String r5 = "_id > ?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ Exception -> 0x007e, all -> 0x0078 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x007e, all -> 0x0078 }
            r13 = 0
            r6[r13] = r12     // Catch:{ Exception -> 0x007e, all -> 0x0078 }
            android.database.sqlite.SQLiteDatabase r2 = r11.mDb     // Catch:{ Exception -> 0x007e, all -> 0x0078 }
            java.lang.String r3 = "queue"
            java.lang.String[] r4 = QUEUE_COLS     // Catch:{ Exception -> 0x007e, all -> 0x0078 }
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x007e, all -> 0x0078 }
            boolean r2 = r12.moveToNext()     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            if (r2 == 0) goto L_0x0071
            com.ss.android.common.applog.LogItem r2 = new com.ss.android.common.applog.LogItem     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r2.<init>()     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            int r3 = r12.getInt(r13)     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r2.f52158id = r3     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            java.lang.String r3 = r12.getString(r0)     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r2.value = r3     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r3 = 2
            int r3 = r12.getInt(r3)     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            if (r3 <= 0) goto L_0x004c
            r13 = 1
        L_0x004c:
            r3 = 3
            long r3 = r12.getLong(r3)     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r2.timestamp = r3     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r3 = 4
            int r3 = r12.getInt(r3)     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r2.retry_count = r3     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r3 = 5
            long r3 = r12.getLong(r3)     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r2.retry_time = r3     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r3 = 6
            int r3 = r12.getInt(r3)     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            r2.type = r3     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            int r3 = r2.type     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
            if (r3 != 0) goto L_0x0070
            if (r13 == 0) goto L_0x0070
            r2.type = r0     // Catch:{ Exception -> 0x007f, all -> 0x0076 }
        L_0x0070:
            r1 = r2
        L_0x0071:
            safeCloseCursor(r12)     // Catch:{ all -> 0x0086 }
            monitor-exit(r11)
            return r1
        L_0x0076:
            r13 = move-exception
            goto L_0x007a
        L_0x0078:
            r13 = move-exception
            r12 = r1
        L_0x007a:
            safeCloseCursor(r12)     // Catch:{ all -> 0x0086 }
            throw r13     // Catch:{ all -> 0x0086 }
        L_0x007e:
            r12 = r1
        L_0x007f:
            safeCloseCursor(r12)     // Catch:{ all -> 0x0086 }
            monitor-exit(r11)
            return r1
        L_0x0084:
            monitor-exit(r11)
            return r1
        L_0x0086:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.getLog(long):com.ss.android.common.applog.LogItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        return null;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0090=Splitter:B:26:0x0090, B:33:0x009a=Splitter:B:33:0x009a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.p280ss.android.common.applog.LogSession getSession(long r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            android.database.sqlite.SQLiteDatabase r0 = r12.mDb     // Catch:{ all -> 0x00a6 }
            r1 = 0
            if (r0 == 0) goto L_0x00a4
            android.database.sqlite.SQLiteDatabase r0 = r12.mDb     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x0010
            goto L_0x00a4
        L_0x0010:
            java.lang.String r9 = "_id DESC"
            java.lang.String r10 = "1"
            r2 = 0
            r0 = 1
            r11 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0029
            java.lang.String r2 = "_id < ?"
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ Exception -> 0x009e, all -> 0x0097 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x009e, all -> 0x0097 }
            r3[r11] = r13     // Catch:{ Exception -> 0x009e, all -> 0x0097 }
            r5 = r2
            r6 = r3
            goto L_0x002b
        L_0x0029:
            r5 = r1
            r6 = r5
        L_0x002b:
            android.database.sqlite.SQLiteDatabase r2 = r12.mDb     // Catch:{ Exception -> 0x009e, all -> 0x0097 }
            java.lang.String r3 = "session"
            java.lang.String[] r4 = SESSION_COLS     // Catch:{ Exception -> 0x009e, all -> 0x0097 }
            r7 = 0
            r8 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x009e, all -> 0x0097 }
            boolean r14 = r13.moveToNext()     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            if (r14 == 0) goto L_0x008f
            com.ss.android.common.applog.LogSession r14 = new com.ss.android.common.applog.LogSession     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            int r2 = r13.getInt(r11)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.f19228id = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            java.lang.String r2 = r13.getString(r0)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.value = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r2 = 2
            long r2 = r13.getLong(r2)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.timestamp = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r2 = 4
            int r2 = r13.getInt(r2)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            if (r2 <= 0) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r14.non_page = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r2 = 5
            java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.app_version = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r2 = 6
            int r2 = r13.getInt(r2)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.version_code = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r2 = 7
            int r2 = r13.getInt(r2)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.pausetime = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r2 = 8
            int r2 = r13.getInt(r2)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            if (r2 <= 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r14.launch_sent = r0     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r0 = 9
            long r2 = r13.getLong(r0)     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.eventIndex = r2     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            r14.active = r11     // Catch:{ Exception -> 0x009f, all -> 0x0095 }
            goto L_0x0090
        L_0x008f:
            r14 = r1
        L_0x0090:
            safeCloseCursor(r13)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r12)
            return r14
        L_0x0095:
            r14 = move-exception
            goto L_0x009a
        L_0x0097:
            r13 = move-exception
            r14 = r13
            r13 = r1
        L_0x009a:
            safeCloseCursor(r13)     // Catch:{ all -> 0x00a6 }
            throw r14     // Catch:{ all -> 0x00a6 }
        L_0x009e:
            r13 = r1
        L_0x009f:
            safeCloseCursor(r13)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r12)
            return r1
        L_0x00a4:
            monitor-exit(r12)
            return r1
        L_0x00a6:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.getSession(long):com.ss.android.common.applog.LogSession");
    }

    public synchronized long insertEvent(LogEvent logEvent) {
        if (this.mDb != null) {
            if (this.mDb.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", logEvent.category);
                contentValues.put("tag", logEvent.tag);
                if (!C6319n.m19593a(logEvent.label)) {
                    contentValues.put("label", logEvent.label);
                }
                contentValues.put("value", Long.valueOf(logEvent.value));
                contentValues.put("ext_value", Long.valueOf(logEvent.ext_value));
                if (!C6319n.m19593a(logEvent.ext_json)) {
                    contentValues.put("ext_json", logEvent.ext_json);
                }
                contentValues.put("user_id", Long.valueOf(logEvent.user_id));
                contentValues.put("timestamp", Long.valueOf(logEvent.timestamp));
                contentValues.put("session_id", Long.valueOf(logEvent.session_id));
                contentValues.put("event_index", Long.valueOf(logEvent.teaEventIndex));
                return this.mDb.insert("event", null, contentValues);
            }
        }
        return -1;
    }

    protected static void safeCloseCursorAndEndTX(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        safeCloseCursor(cursor);
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized long insertMonLogEntry(String str, String str2) {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("log_type", str);
        contentValues.put("value", str2);
        return this.mDb.insert("mon_log", null, contentValues);
    }

    /* access modifiers changed from: 0000 */
    public synchronized long insertLog(String str, int i) {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("value", str);
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", Integer.valueOf(0));
        contentValues.put("retry_time", Long.valueOf(0));
        contentValues.put("log_type", Integer.valueOf(i));
        return this.mDb.insert("queue", null, contentValues);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long insertPage(com.p280ss.android.common.applog.LogPage r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.mDb     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0062
            android.database.sqlite.SQLiteDatabase r0 = r3.mDb     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0062
        L_0x000e:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x0031 }
            r0.<init>()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "pausetime"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0031 }
            r0.put(r1, r5)     // Catch:{ Exception -> 0x0031 }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0031 }
            r6 = 0
            long r1 = r4.session_id     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0031 }
            r5[r6] = r1     // Catch:{ Exception -> 0x0031 }
            android.database.sqlite.SQLiteDatabase r6 = r3.mDb     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "session"
            java.lang.String r2 = "_id = ?"
            r6.update(r1, r0, r2, r5)     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x005e }
            r5.<init>()     // Catch:{ Exception -> 0x005e }
            java.lang.String r6 = "name"
            java.lang.String r0 = r4.name     // Catch:{ Exception -> 0x005e }
            r5.put(r6, r0)     // Catch:{ Exception -> 0x005e }
            java.lang.String r6 = "duration"
            int r0 = r4.duration     // Catch:{ Exception -> 0x005e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x005e }
            r5.put(r6, r0)     // Catch:{ Exception -> 0x005e }
            java.lang.String r6 = "session_id"
            long r0 = r4.session_id     // Catch:{ Exception -> 0x005e }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x005e }
            r5.put(r6, r4)     // Catch:{ Exception -> 0x005e }
            android.database.sqlite.SQLiteDatabase r4 = r3.mDb     // Catch:{ Exception -> 0x005e }
            java.lang.String r6 = "page"
            r0 = 0
            long r4 = r4.insert(r6, r0, r5)     // Catch:{ Exception -> 0x005e }
            monitor-exit(r3)
            return r4
        L_0x005e:
            r4 = 0
            monitor-exit(r3)
            return r4
        L_0x0062:
            r4 = -1
            monitor-exit(r3)
            return r4
        L_0x0066:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.insertPage(com.ss.android.common.applog.LogPage, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c0, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b2 A[SYNTHETIC, Splitter:B:53:0x00b2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean onLogSent(long r12, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ all -> 0x00c1 }
            r1 = 0
            if (r0 == 0) goto L_0x00bf
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ all -> 0x00c1 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x0010
            goto L_0x00bf
        L_0x0010:
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0018
            monitor-exit(r11)
            return r1
        L_0x0018:
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00c1 }
            r10[r1] = r2     // Catch:{ all -> 0x00c1 }
            if (r14 != 0) goto L_0x00a1
            r14 = 0
            r2 = 3
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Exception -> 0x009b, all -> 0x0095 }
            java.lang.String r2 = "timestamp"
            r4[r1] = r2     // Catch:{ Exception -> 0x009b, all -> 0x0095 }
            java.lang.String r2 = "retry_count"
            r4[r0] = r2     // Catch:{ Exception -> 0x009b, all -> 0x0095 }
            r2 = 2
            java.lang.String r3 = "retry_time"
            r4[r2] = r3     // Catch:{ Exception -> 0x009b, all -> 0x0095 }
            android.database.sqlite.SQLiteDatabase r2 = r11.mDb     // Catch:{ Exception -> 0x009b, all -> 0x0095 }
            java.lang.String r3 = "queue"
            java.lang.String r5 = "_id = ?"
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x009b, all -> 0x0095 }
            boolean r14 = r2.moveToNext()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            if (r14 != 0) goto L_0x004d
            safeCloseCursor(r2)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r11)
            return r1
        L_0x004d:
            long r3 = r2.getLong(r1)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            int r14 = r2.getInt(r0)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            r7 = 0
            long r3 = r5 - r3
            r7 = 432000000(0x19bfcc00, double:2.13436359E-315)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x008c
            r3 = 5
            if (r14 >= r3) goto L_0x008c
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            r3.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.String r4 = "retry_count"
            int r14 = r14 + r0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            r3.put(r4, r14)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.String r14 = "retry_time"
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            r3.put(r14, r4)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            android.database.sqlite.SQLiteDatabase r14 = r11.mDb     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "_id = ?"
            r14.update(r4, r3, r5, r10)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            safeCloseCursor(r2)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r11)
            return r1
        L_0x008c:
            safeCloseCursor(r2)     // Catch:{ all -> 0x00c1 }
            r14 = 1
            goto L_0x00a2
        L_0x0091:
            r12 = move-exception
            goto L_0x0097
        L_0x0093:
            r14 = r2
            goto L_0x009b
        L_0x0095:
            r12 = move-exception
            r2 = r14
        L_0x0097:
            safeCloseCursor(r2)     // Catch:{ all -> 0x00c1 }
            throw r12     // Catch:{ all -> 0x00c1 }
        L_0x009b:
            safeCloseCursor(r14)     // Catch:{ all -> 0x00c1 }
            r14 = 0
            r2 = 0
            goto L_0x00a3
        L_0x00a1:
            r14 = 0
        L_0x00a2:
            r2 = 1
        L_0x00a3:
            if (r14 == 0) goto L_0x00b0
            boolean r14 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ all -> 0x00c1 }
            if (r14 == 0) goto L_0x00b0
            android.content.Context r14 = r11.mContext     // Catch:{ all -> 0x00c1 }
            com.p280ss.android.common.applog.LogDebugUtil.trackLogDiscard(r14, r12)     // Catch:{ all -> 0x00c1 }
        L_0x00b0:
            if (r2 == 0) goto L_0x00bc
            android.database.sqlite.SQLiteDatabase r12 = r11.mDb     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r13 = "queue"
            java.lang.String r14 = "_id = ?"
            r12.delete(r13, r14, r10)     // Catch:{ Throwable -> 0x00bc }
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            monitor-exit(r11)
            return r0
        L_0x00bf:
            monitor-exit(r11)
            return r1
        L_0x00c1:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.onLogSent(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096 A[Catch:{ Exception -> 0x001d, all -> 0x0096 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5 A[Catch:{ Exception -> 0x001d, all -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ab A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long packMonLog(org.json.JSONObject r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 2
            r1 = 0
            r3 = 0
            java.lang.String r11 = "_id ASC"
            android.database.sqlite.SQLiteDatabase r4 = r13.mDb     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            java.lang.String r5 = "mon_log"
            java.lang.String[] r6 = MON_LOG_COLS     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r12 = "100"
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x009f, all -> 0x0096 }
            r5.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x0096 }
            r6 = r1
        L_0x001d:
            boolean r8 = r4.moveToNext()     // Catch:{ Exception -> 0x009f, all -> 0x0096 }
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x004f
            long r10 = r4.getLong(r10)     // Catch:{ Exception -> 0x009f, all -> 0x0096 }
            java.lang.String r8 = r4.getString(r9)     // Catch:{ Exception -> 0x009f, all -> 0x0096 }
            java.lang.String r9 = r4.getString(r0)     // Catch:{ Exception -> 0x009f, all -> 0x0096 }
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0036
            r6 = r10
        L_0x0036:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x001d, all -> 0x0096 }
            r12.<init>(r9)     // Catch:{ Exception -> 0x001d, all -> 0x0096 }
            java.lang.String r9 = "log_id"
            r12.put(r9, r10)     // Catch:{ Exception -> 0x001d, all -> 0x0096 }
            boolean r9 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Exception -> 0x001d, all -> 0x0096 }
            if (r9 != 0) goto L_0x004b
            java.lang.String r9 = "log_type"
            r12.put(r9, r8)     // Catch:{ Exception -> 0x001d, all -> 0x0096 }
        L_0x004b:
            r5.put(r12)     // Catch:{ Exception -> 0x001d, all -> 0x0096 }
            goto L_0x001d
        L_0x004f:
            r4.close()     // Catch:{ Exception -> 0x009f, all -> 0x0096 }
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0067
            java.lang.String r4 = "_id<= ?"
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            r8[r10] = r6     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            android.database.sqlite.SQLiteDatabase r6 = r13.mDb     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            java.lang.String r7 = "mon_log"
            r6.delete(r7, r4, r8)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
        L_0x0067:
            int r4 = r5.length()     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            if (r4 <= 0) goto L_0x0091
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            r4.<init>()     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            java.lang.String r6 = "magic_tag"
            java.lang.String r7 = "ss_app_log"
            r4.put(r6, r7)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            if (r15 == 0) goto L_0x0080
            java.lang.String r6 = "time_sync"
            r4.put(r6, r15)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
        L_0x0080:
            java.lang.String r15 = "data"
            r4.put(r15, r5)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            if (r14 == 0) goto L_0x008c
            java.lang.String r15 = "header"
            r4.put(r15, r14)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
        L_0x008c:
            java.lang.String r14 = r4.toString()     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            goto L_0x0092
        L_0x0091:
            r14 = r3
        L_0x0092:
            safeCloseCursor(r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a3
        L_0x0096:
            r14 = move-exception
            r3 = r4
            goto L_0x009a
        L_0x0099:
            r14 = move-exception
        L_0x009a:
            safeCloseCursor(r3)     // Catch:{ all -> 0x00ad }
            throw r14     // Catch:{ all -> 0x00ad }
        L_0x009e:
            r4 = r3
        L_0x009f:
            safeCloseCursor(r4)     // Catch:{ all -> 0x00ad }
            r14 = r3
        L_0x00a3:
            if (r14 == 0) goto L_0x00ab
            long r14 = r13.insertLog(r14, r0)     // Catch:{ all -> 0x00ad }
            monitor-exit(r13)
            return r14
        L_0x00ab:
            monitor-exit(r13)
            return r1
        L_0x00ad:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.packMonLog(org.json.JSONObject, org.json.JSONObject):long");
    }

    /* access modifiers changed from: 0000 */
    public synchronized long insertMiscLog(long j, String str, String str2) {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("log_type", str);
        contentValues.put("value", str2);
        contentValues.put("session_id", Long.valueOf(j));
        return this.mDb.insert("misc_log", null, contentValues);
    }

    private void notifySessionBatchEvent(List<ILogSessionHook> list, long j, String str, JSONObject jSONObject) {
        if (list != null) {
            synchronized (list) {
                for (ILogSessionHook onLogSessionBatchEvent : list) {
                    try {
                        onLogSessionBatchEvent.onLogSessionBatchEvent(j, str, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    private void notifySessionTerminate(List<ILogSessionHook> list, long j, String str, JSONObject jSONObject) {
        if (list != null) {
            synchronized (list) {
                for (ILogSessionHook onLogSessionTerminate : list) {
                    try {
                        onLogSessionTerminate.onLogSessionTerminate(j, str, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010f, code lost:
        r29 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0112, code lost:
        r29 = r14;
        r10 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0116, code lost:
        r9 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0118, code lost:
        r23 = r3;
        r20 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011f, code lost:
        r29 = r14;
        r10 = r27;
        r9 = r28;
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0128, code lost:
        r29 = r14;
        r10 = r27;
        r9 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0130, code lost:
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0132, code lost:
        safeCloseCursor(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0135, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONArray packMiscLog(boolean r32, long r33, java.lang.String r35, org.json.JSONObject r36, org.json.JSONObject r37) {
        /*
            r31 = this;
            r1 = r31
            r0 = r36
            r2 = r37
            java.lang.String r12 = "_id > ? AND session_id=?"
            r13 = 2
            java.lang.String[] r14 = new java.lang.String[r13]
            java.lang.String r3 = "0"
            r15 = 0
            r14[r15] = r3
            java.lang.String r3 = java.lang.String.valueOf(r33)
            r11 = 1
            r14[r11] = r3
            java.lang.String r10 = "_id<= ? "
            java.lang.String[] r9 = new java.lang.String[r11]
            java.lang.String r3 = "0"
            r9[r15] = r3
            java.lang.String r16 = "100"
            java.lang.String r17 = "_id ASC"
            r3 = 0
            r18 = 0
            r22 = r3
            r23 = r22
            r20 = r18
        L_0x002c:
            java.lang.String r3 = java.lang.String.valueOf(r20)     // Catch:{ Exception -> 0x0136, all -> 0x012f }
            r14[r15] = r3     // Catch:{ Exception -> 0x0136, all -> 0x012f }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0136, all -> 0x012f }
            r8.<init>()     // Catch:{ Exception -> 0x0136, all -> 0x012f }
            android.database.sqlite.SQLiteDatabase r3 = r1.mDb     // Catch:{ Exception -> 0x0136, all -> 0x012f }
            java.lang.String r4 = "misc_log"
            java.lang.String[] r5 = MISC_LOG_COLS     // Catch:{ Exception -> 0x0136, all -> 0x012f }
            r24 = 0
            r25 = 0
            r6 = r12
            r7 = r14
            r26 = r8
            r8 = r24
            r27 = r9
            r9 = r25
            r28 = r10
            r10 = r17
            r13 = 1
            r11 = r16
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0128, all -> 0x012f }
            r3.getCount()     // Catch:{ Exception -> 0x011f, all -> 0x011d }
            r4 = r18
        L_0x005b:
            boolean r6 = r3.moveToNext()     // Catch:{ Exception -> 0x011f, all -> 0x011d }
            if (r6 == 0) goto L_0x00a3
            long r6 = r3.getLong(r15)     // Catch:{ Exception -> 0x011f, all -> 0x011d }
            int r8 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x005b
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x006e
            r4 = r6
        L_0x006e:
            java.lang.String r8 = r3.getString(r13)     // Catch:{ Exception -> 0x011f, all -> 0x011d }
            r9 = 2
            java.lang.String r10 = r3.getString(r9)     // Catch:{ Exception -> 0x011f, all -> 0x011d }
            boolean r11 = com.bytedance.common.utility.C6319n.m19593a(r10)     // Catch:{ Exception -> 0x011f, all -> 0x011d }
            if (r11 != 0) goto L_0x009e
            boolean r11 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Exception -> 0x011f, all -> 0x011d }
            if (r11 != 0) goto L_0x009e
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x009e, all -> 0x011d }
            r11.<init>(r10)     // Catch:{ Exception -> 0x009e, all -> 0x011d }
            java.lang.String r10 = "log_id"
            r11.put(r10, r6)     // Catch:{ Exception -> 0x009e, all -> 0x011d }
            boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Exception -> 0x009e, all -> 0x011d }
            if (r6 != 0) goto L_0x0098
            java.lang.String r6 = "log_type"
            r11.put(r6, r8)     // Catch:{ Exception -> 0x009e, all -> 0x011d }
        L_0x0098:
            r6 = r26
            r6.put(r11)     // Catch:{ Exception -> 0x00a0, all -> 0x011d }
            goto L_0x00a0
        L_0x009e:
            r6 = r26
        L_0x00a0:
            r26 = r6
            goto L_0x005b
        L_0x00a3:
            r6 = r26
            r9 = 2
            int r7 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x00ae
            r22 = r6
            r7 = 0
            goto L_0x00af
        L_0x00ae:
            r7 = 1
        L_0x00af:
            int r8 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00b7
            safeCloseCursor(r3)
            return r22
        L_0x00b7:
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0112, all -> 0x011d }
            r10 = r27
            r10[r15] = r8     // Catch:{ Exception -> 0x010f, all -> 0x011d }
            android.database.sqlite.SQLiteDatabase r8 = r1.mDb     // Catch:{ Exception -> 0x010f, all -> 0x011d }
            java.lang.String r11 = "misc_log"
            r9 = r28
            r8.delete(r11, r9, r10)     // Catch:{ Exception -> 0x010c, all -> 0x011d }
            if (r7 == 0) goto L_0x0102
            int r7 = r6.length()     // Catch:{ Exception -> 0x010c, all -> 0x011d }
            if (r7 <= 0) goto L_0x0102
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x010c, all -> 0x011d }
            r7.<init>()     // Catch:{ Exception -> 0x010c, all -> 0x011d }
            java.lang.String r8 = "magic_tag"
            java.lang.String r11 = "ss_app_log"
            r7.put(r8, r11)     // Catch:{ Exception -> 0x010c, all -> 0x011d }
            if (r2 == 0) goto L_0x00e3
            java.lang.String r8 = "time_sync"
            r7.put(r8, r2)     // Catch:{ Exception -> 0x010c, all -> 0x011d }
        L_0x00e3:
            java.lang.String r8 = "log_data"
            r7.put(r8, r6)     // Catch:{ Exception -> 0x010c, all -> 0x011d }
            if (r0 == 0) goto L_0x00ef
            java.lang.String r6 = "header"
            r7.put(r6, r0)     // Catch:{ Exception -> 0x010c, all -> 0x011d }
        L_0x00ef:
            java.lang.String r6 = "_gen_time"
            r29 = r14
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0118, all -> 0x011d }
            r7.put(r6, r13)     // Catch:{ Exception -> 0x0118, all -> 0x011d }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x0118, all -> 0x011d }
            r1.insertLog(r6)     // Catch:{ Exception -> 0x0118, all -> 0x011d }
            goto L_0x0104
        L_0x0102:
            r29 = r14
        L_0x0104:
            safeCloseCursor(r3)
            r23 = r3
            r20 = r4
            goto L_0x0140
        L_0x010c:
            r29 = r14
            goto L_0x0118
        L_0x010f:
            r29 = r14
            goto L_0x0116
        L_0x0112:
            r29 = r14
            r10 = r27
        L_0x0116:
            r9 = r28
        L_0x0118:
            r23 = r3
            r20 = r4
            goto L_0x013d
        L_0x011d:
            r0 = move-exception
            goto L_0x0132
        L_0x011f:
            r29 = r14
            r10 = r27
            r9 = r28
            r23 = r3
            goto L_0x013d
        L_0x0128:
            r29 = r14
            r10 = r27
            r9 = r28
            goto L_0x013d
        L_0x012f:
            r0 = move-exception
            r3 = r23
        L_0x0132:
            safeCloseCursor(r3)
            throw r0
        L_0x0136:
            r29 = r14
            r30 = r10
            r10 = r9
            r9 = r30
        L_0x013d:
            safeCloseCursor(r23)
        L_0x0140:
            r14 = r29
            r11 = 1
            r13 = 2
            r30 = r10
            r10 = r9
            r9 = r30
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.packMiscLog(boolean, long, java.lang.String, org.json.JSONObject, org.json.JSONObject):org.json.JSONArray");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0346, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
        r15 = r1;
        r11 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014b, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0150, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0151, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        r11 = r41;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x024e A[SYNTHETIC, Splitter:B:130:0x024e] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02f1 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02fa A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0305 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0310 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0346 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:80:0x01bc] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0358 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0360 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0371 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0373 A[Catch:{ Exception -> 0x014c, all -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ac A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03ae A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03b6 A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x043f A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x044f A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x046e A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0484 A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x049c A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04d1 A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d2 A[Catch:{ Exception -> 0x053d, all -> 0x0520 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:24:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0150 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:22:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:22:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0168 A[SYNTHETIC, Splitter:B:66:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long batchSession(com.p280ss.android.common.applog.LogSession r42, com.p280ss.android.common.applog.LogSession r43, org.json.JSONObject r44, boolean r45, long[] r46, java.lang.String[] r47, java.util.List<com.p280ss.android.common.applog.AppLog.ILogSessionHook> r48, boolean r49, org.json.JSONObject r50) {
        /*
            r41 = this;
            r8 = r41
            r0 = r42
            r9 = r43
            r13 = r50
            monitor-enter(r41)
            android.database.sqlite.SQLiteDatabase r1 = r8.mDb     // Catch:{ all -> 0x054b }
            if (r1 == 0) goto L_0x0546
            android.database.sqlite.SQLiteDatabase r1 = r8.mDb     // Catch:{ all -> 0x054b }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x054b }
            if (r1 != 0) goto L_0x0017
            goto L_0x0546
        L_0x0017:
            r14 = 1
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ all -> 0x054b }
            long r1 = r0.f19228id     // Catch:{ all -> 0x054b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x054b }
            r6 = 0
            r7[r6] = r1     // Catch:{ all -> 0x054b }
            r24 = 0
            r25 = 0
            java.lang.String r1 = r0.app_version     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            if (r1 != 0) goto L_0x004c
            int r1 = r0.version_code     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            if (r1 <= 0) goto L_0x004c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            java.lang.String[] r2 = com.p280ss.android.common.applog.AppLog.HEADER_KEYS     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r3 = r44
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            java.lang.String r2 = "app_version"
            java.lang.String r3 = r0.app_version     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            java.lang.String r2 = "version_code"
            int r3 = r0.version_code     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r5 = r1
            goto L_0x004f
        L_0x004c:
            r3 = r44
            r5 = r3
        L_0x004f:
            android.database.sqlite.SQLiteDatabase r1 = r8.mDb     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r1.beginTransaction()     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r3.<init>()     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r4.<init>()     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            java.lang.String r27 = "_id ASC"
            boolean r1 = r0.non_page     // Catch:{ Exception -> 0x053a, all -> 0x0530 }
            r2 = 2
            if (r1 != 0) goto L_0x015b
            if (r45 != 0) goto L_0x015b
            java.lang.String r23 = "500"
            android.database.sqlite.SQLiteDatabase r15 = r8.mDb     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            java.lang.String r16 = "page"
            java.lang.String[] r17 = PAGE_COLS     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            java.lang.String r18 = "session_id = ?"
            r20 = 0
            r21 = 0
            r19 = r7
            r22 = r27
            android.database.Cursor r1 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            org.json.JSONArray r15 = new org.json.JSONArray     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r15.<init>()     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r16 = 0
            r28 = 0
        L_0x0086:
            boolean r17 = r1.moveToNext()     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            if (r17 == 0) goto L_0x00c7
            java.lang.String r6 = r1.getString(r14)     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            int r14 = r1.getInt(r2)     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            boolean r17 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            if (r17 != 0) goto L_0x00b5
            if (r14 <= 0) goto L_0x00b5
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            r2.<init>()     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            r29 = r7
            r7 = 0
            r2.put(r7, r6)     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            r6 = 1
            r2.put(r6, r14)     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            r6 = r28
            int r28 = r6 + r14
            int r16 = r16 + 1
            r15.put(r2)     // Catch:{ Exception -> 0x014b, all -> 0x00c2 }
            goto L_0x00bc
        L_0x00b5:
            r29 = r7
            r6 = r28
            r7 = 0
            r28 = r6
        L_0x00bc:
            r7 = r29
            r2 = 2
            r6 = 0
            r14 = 1
            goto L_0x0086
        L_0x00c2:
            r0 = move-exception
            r15 = r1
            r11 = r8
            goto L_0x0534
        L_0x00c7:
            r29 = r7
            r6 = r28
            r7 = 0
            r1.close()     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            if (r16 <= 0) goto L_0x0142
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r14.<init>()     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r1 = "duration"
            r14.put(r1, r6)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r1 = "datetime"
            long r7 = r0.timestamp     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r2 = com.p280ss.android.common.applog.AppLog.formatDate(r7)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r14.put(r1, r2)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r1 = "session_id"
            java.lang.String r2 = r0.value     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r14.put(r1, r2)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r1 = "activites"
            r14.put(r1, r15)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r1 = "local_time_ms"
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r14.put(r1, r6)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r1 = com.p280ss.android.common.applog.AppLog.getAbSDKVersion()     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            if (r1 != 0) goto L_0x010e
            java.lang.String r1 = "ab_sdk_version"
            java.lang.String r2 = com.p280ss.android.common.applog.AppLog.getAbSDKVersion()     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r14.put(r1, r2)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
        L_0x010e:
            com.p280ss.android.common.applog.AppLog.tryPutEventIndex(r14)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            long r6 = r0.f19228id     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r8 = r0.value     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r1 = r41
            r15 = 2
            r2 = r48
            r15 = r3
            r13 = r4
            r3 = r6
            r7 = r5
            r5 = r8
            r8 = 0
            r6 = r14
            r1.notifySessionTerminate(r2, r3, r5, r6)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r1.<init>()     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r1.put(r14)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            java.lang.String r2 = "terminate"
            r15.put(r2, r1)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            int r1 = com.p280ss.android.common.applog.AppLog.mLaunchFrom     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            if (r1 <= 0) goto L_0x0161
            java.lang.String r1 = "launch_from"
            int r2 = com.p280ss.android.common.applog.AppLog.mLaunchFrom     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            r15.put(r1, r2)     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            com.p280ss.android.common.applog.AppLog.mLaunchFrom = r8     // Catch:{ Exception -> 0x013f, all -> 0x0150 }
            goto L_0x0161
        L_0x013f:
            r15 = r24
            goto L_0x014c
        L_0x0142:
            r15 = r3
            r13 = r4
            r7 = r5
            r8 = 0
            r14 = 1
            goto L_0x0162
        L_0x0148:
            r0 = move-exception
            r15 = r1
            goto L_0x0153
        L_0x014b:
            r15 = r1
        L_0x014c:
            r11 = r41
            goto L_0x053d
        L_0x0150:
            r0 = move-exception
            r15 = r24
        L_0x0153:
            r11 = r41
            goto L_0x0534
        L_0x0157:
            r11 = r41
            goto L_0x053b
        L_0x015b:
            r15 = r3
            r13 = r4
            r29 = r7
            r8 = 0
            r7 = r5
        L_0x0161:
            r14 = 0
        L_0x0162:
            java.lang.String r23 = "200"
            java.lang.String r1 = "session_id = ?"
            if (r45 == 0) goto L_0x0189
            r2 = r46[r8]     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            int r4 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r4 <= 0) goto L_0x0189
            java.lang.String r1 = "_id > ? AND session_id=?"
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            r4 = r46[r8]     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            r3[r8] = r4     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            long r4 = r0.f19228id     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            r5 = 1
            r3[r5] = r4     // Catch:{ Exception -> 0x0157, all -> 0x0150 }
            r18 = r1
            r19 = r3
            goto L_0x018e
        L_0x0189:
            r2 = 2
            r18 = r1
            r19 = r29
        L_0x018e:
            r6 = r41
            android.database.sqlite.SQLiteDatabase r1 = r6.mDb     // Catch:{ Exception -> 0x052a, all -> 0x0527 }
            java.lang.String r16 = "event"
            java.lang.String[] r17 = EVENT_COLS     // Catch:{ Exception -> 0x052a, all -> 0x0527 }
            r20 = 0
            r21 = 0
            r5 = r15
            r3 = 2
            r15 = r1
            r22 = r27
            android.database.Cursor r15 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x052a, all -> 0x0527 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            r1.<init>()     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            r2.<init>()     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            r17 = r25
            r4 = 0
            r16 = 0
            r30 = 0
        L_0x01b4:
            boolean r19 = r15.moveToNext()     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            if (r19 == 0) goto L_0x0349
            r31 = r4
            long r3 = r15.getLong(r8)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r32 = r14
            r8 = 1
            java.lang.String r14 = r15.getString(r8)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r8 = 2
            java.lang.String r11 = r15.getString(r8)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r8 = 3
            boolean r19 = r15.isNull(r8)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r19 != 0) goto L_0x01d8
            java.lang.String r8 = r15.getString(r8)     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            goto L_0x01da
        L_0x01d8:
            r8 = r24
        L_0x01da:
            r9 = 4
            boolean r19 = r15.isNull(r9)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r19 != 0) goto L_0x01ea
            long r19 = r15.getLong(r9)     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            r33 = r13
            r12 = r19
            goto L_0x01ee
        L_0x01ea:
            r33 = r13
            r12 = r25
        L_0x01ee:
            r9 = 5
            boolean r19 = r15.isNull(r9)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r19 != 0) goto L_0x01fe
            long r19 = r15.getLong(r9)     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            r34 = r7
            r9 = r19
            goto L_0x0202
        L_0x01fe:
            r34 = r7
            r9 = r25
        L_0x0202:
            r7 = 6
            boolean r19 = r15.isNull(r7)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r19 != 0) goto L_0x0210
            java.lang.String r7 = r15.getString(r7)     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            r35 = r5
            goto L_0x0214
        L_0x0210:
            r35 = r5
            r7 = r24
        L_0x0214:
            r5 = 7
            boolean r19 = r15.isNull(r5)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r19 != 0) goto L_0x0224
            long r19 = r15.getLong(r5)     // Catch:{ Exception -> 0x0525, all -> 0x0522 }
            r36 = r1
            r5 = r19
            goto L_0x0228
        L_0x0224:
            r36 = r1
            r5 = r25
        L_0x0228:
            r1 = 8
            r37 = r9
            long r9 = r15.getLong(r1)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r1 = 10
            r39 = r12
            long r12 = r15.getLong(r1)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            int r1 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x023e
            r17 = r3
        L_0x023e:
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r1 != 0) goto L_0x024a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x024a, all -> 0x0346 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x024a, all -> 0x0346 }
            goto L_0x024c
        L_0x024a:
            r1 = r24
        L_0x024c:
            if (r1 != 0) goto L_0x0253
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r1.<init>()     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
        L_0x0253:
            java.lang.String r7 = "tea_event_index"
            r1.put(r7, r12)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            java.lang.String r7 = "local_time_ms"
            r1.put(r7, r9)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            java.lang.String r7 = "_event_v3"
            r12 = 0
            int r7 = r1.optInt(r7, r12)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r12 = 1
            if (r7 != r12) goto L_0x02e1
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r7 != 0) goto L_0x02e1
            java.lang.String r7 = "event_v3"
            boolean r7 = r14.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r7 == 0) goto L_0x02e1
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            r7.<init>()     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r8 = "nt"
            boolean r8 = r1.has(r8)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            if (r8 == 0) goto L_0x028d
            java.lang.String r8 = "nt"
            int r8 = r1.optInt(r8)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r12 = "nt"
            r7.put(r12, r8)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
        L_0x028d:
            java.lang.String r8 = "nt"
            r1.remove(r8)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r8 = "_event_v3"
            r1.remove(r8)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            int r8 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r8 <= 0) goto L_0x02a0
            java.lang.String r8 = "user_id"
            r7.put(r8, r5)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
        L_0x02a0:
            java.lang.String r5 = "ab_sdk_version"
            boolean r5 = r1.has(r5)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            if (r5 == 0) goto L_0x02b8
            java.lang.String r5 = "ab_sdk_version"
            java.lang.String r5 = r1.optString(r5)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r6 = "ab_sdk_version"
            r7.put(r6, r5)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r5 = "ab_sdk_version"
            r1.remove(r5)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
        L_0x02b8:
            java.lang.String r5 = "event"
            r7.put(r5, r11)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r5 = "params"
            r7.put(r5, r1)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r1 = "event_id"
            r7.put(r1, r3)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r1 = "session_id"
            java.lang.String r3 = r0.value     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            r7.put(r1, r3)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            java.lang.String r1 = "datetime"
            java.lang.String r3 = com.p280ss.android.common.applog.AppLog.formatDate(r9)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            r7.put(r1, r3)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            r2.put(r7)     // Catch:{ Exception -> 0x02dc, all -> 0x0346 }
            int r16 = r16 + 1
        L_0x02dc:
            r4 = r31
            r3 = r36
            goto L_0x0331
        L_0x02e1:
            java.lang.String r7 = "category"
            r1.put(r7, r14)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            java.lang.String r7 = "tag"
            r1.put(r7, r11)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r7 != 0) goto L_0x02f6
            java.lang.String r7 = "label"
            r1.put(r7, r8)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
        L_0x02f6:
            int r7 = (r39 > r25 ? 1 : (r39 == r25 ? 0 : -1))
            if (r7 == 0) goto L_0x0301
            java.lang.String r7 = "value"
            r11 = r39
            r1.put(r7, r11)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
        L_0x0301:
            int r7 = (r37 > r25 ? 1 : (r37 == r25 ? 0 : -1))
            if (r7 == 0) goto L_0x030c
            java.lang.String r7 = "ext_value"
            r11 = r37
            r1.put(r7, r11)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
        L_0x030c:
            int r7 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r7 <= 0) goto L_0x0315
            java.lang.String r7 = "user_id"
            r1.put(r7, r5)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
        L_0x0315:
            java.lang.String r5 = "session_id"
            java.lang.String r6 = r0.value     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r1.put(r5, r6)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            java.lang.String r5 = "datetime"
            java.lang.String r6 = com.p280ss.android.common.applog.AppLog.formatDate(r9)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r1.put(r5, r6)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            java.lang.String r5 = "event_id"
            r1.put(r5, r3)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r3 = r36
            r3.put(r1)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            int r4 = r31 + 1
        L_0x0331:
            r8 = r30
            int r30 = r8 + 1
            r1 = r3
            r14 = r32
            r13 = r33
            r7 = r34
            r5 = r35
            r3 = 2
            r6 = r41
            r8 = 0
            r9 = r43
            goto L_0x01b4
        L_0x0346:
            r0 = move-exception
            goto L_0x0153
        L_0x0349:
            r3 = r1
            r31 = r4
            r35 = r5
            r34 = r7
            r33 = r13
            r32 = r14
            r8 = r30
            if (r31 <= 0) goto L_0x0360
            java.lang.String r1 = "event"
            r5 = r35
            r5.put(r1, r3)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            goto L_0x0362
        L_0x0360:
            r5 = r35
        L_0x0362:
            if (r16 <= 0) goto L_0x036f
            boolean r1 = com.p280ss.android.common.applog.AppLog.getEventV3Switch()     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            if (r1 == 0) goto L_0x036f
            java.lang.String r1 = "event_v3"
            r5.put(r1, r2)     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
        L_0x036f:
            if (r8 <= 0) goto L_0x0373
            r14 = 1
            goto L_0x0375
        L_0x0373:
            r14 = r32
        L_0x0375:
            long r3 = r0.f19228id     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            java.lang.String r6 = r0.value     // Catch:{ Exception -> 0x014c, all -> 0x0346 }
            r1 = r41
            r2 = r49
            r9 = 2
            r10 = r5
            r5 = r6
            r11 = r41
            r6 = r34
            r12 = r29
            r13 = r34
            r7 = r50
            org.json.JSONArray r1 = r1.packMiscLog(r2, r3, r5, r6, r7)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r1 == 0) goto L_0x039c
            int r2 = r1.length()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r2 <= 0) goto L_0x039c
            java.lang.String r2 = "log_data"
            r10.put(r2, r1)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r14 = 1
        L_0x039c:
            long r3 = r0.f19228id     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r5 = r0.value     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r1 = r41
            r2 = r48
            r6 = r10
            r1.notifySessionBatchEvent(r2, r3, r5, r6)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            boolean r1 = r0.launch_sent     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r1 == 0) goto L_0x03ae
            r6 = 0
            goto L_0x03af
        L_0x03ae:
            r6 = r14
        L_0x03af:
            if (r45 == 0) goto L_0x03b4
            if (r49 == 0) goto L_0x03b4
            r6 = 0
        L_0x03b4:
            if (r6 == 0) goto L_0x0406
            java.lang.String r2 = "terminate"
            boolean r2 = r10.isNull(r2)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r2 == 0) goto L_0x0406
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2.<init>()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r3 = "datetime"
            long r4 = r0.timestamp     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r4 = com.p280ss.android.common.applog.AppLog.formatDate(r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r3 = "session_id"
            java.lang.String r4 = r0.value     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r3 = "local_time_ms"
            long r4 = r0.timestamp     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r3 = "tea_event_index"
            long r4 = r0.eventIndex     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            boolean r3 = r0.non_page     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r3 == 0) goto L_0x03ed
            java.lang.String r3 = "is_background"
            r4 = 1
            r2.put(r3, r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x03ed:
            java.lang.String r3 = com.p280ss.android.common.applog.AppLog.getAbSDKVersion()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r3 != 0) goto L_0x0400
            java.lang.String r3 = "ab_sdk_version"
            java.lang.String r4 = com.p280ss.android.common.applog.AppLog.getAbSDKVersion()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x0400:
            r3 = r33
            r3.put(r2)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            goto L_0x0408
        L_0x0406:
            r3 = r33
        L_0x0408:
            r2 = r43
            if (r2 == 0) goto L_0x044b
            boolean r4 = r2.non_page     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r4 != 0) goto L_0x044b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r4.<init>()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r5 = "datetime"
            long r6 = r2.timestamp     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r6 = com.p280ss.android.common.applog.AppLog.formatDate(r6)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r5 = "session_id"
            java.lang.String r6 = r2.value     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r5 = "local_time_ms"
            long r6 = r2.timestamp     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r5 = "tea_event_index"
            long r6 = r2.eventIndex     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r2 = com.p280ss.android.common.applog.AppLog.getAbSDKVersion()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r2 != 0) goto L_0x0448
            java.lang.String r2 = "ab_sdk_version"
            java.lang.String r5 = com.p280ss.android.common.applog.AppLog.getAbSDKVersion()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x0448:
            r3.put(r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x044b:
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 < r2) goto L_0x046e
            java.lang.String r2 = "session_id= ? AND _id<= ?"
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            long r5 = r0.f19228id     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r5 = 0
            r4[r5] = r0     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r5 = 1
            r4[r5] = r0     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r5 = "event"
            r0.delete(r5, r2, r4)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2 = 0
            r46[r2] = r17     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            goto L_0x0482
        L_0x046e:
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r2 = "event"
            java.lang.String r4 = "session_id = ?"
            r0.delete(r2, r4, r12)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r49 == 0) goto L_0x0482
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r2 = "session"
            java.lang.String r4 = "_id = ?"
            r0.delete(r2, r4, r12)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x0482:
            if (r49 == 0) goto L_0x0496
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r1 = "page"
            java.lang.String r2 = "session_id = ?"
            r0.delete(r1, r2, r12)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r1 = "misc_log"
            java.lang.String r2 = "session_id = ?"
            r0.delete(r1, r2, r12)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x0496:
            int r0 = r3.length()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r0 <= 0) goto L_0x04a1
            java.lang.String r0 = "launch"
            r10.put(r0, r3)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x04a1:
            java.lang.String r0 = "terminate"
            boolean r0 = r10.isNull(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r0 == 0) goto L_0x04d5
            java.lang.String r0 = "event"
            boolean r0 = r10.isNull(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r0 == 0) goto L_0x04d5
            java.lang.String r0 = "launch"
            boolean r0 = r10.isNull(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r0 == 0) goto L_0x04d5
            java.lang.String r0 = "item_impression"
            boolean r0 = r10.isNull(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r0 == 0) goto L_0x04d5
            java.lang.String r0 = "log_data"
            boolean r0 = r10.isNull(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r0 == 0) goto L_0x04d5
            java.lang.String r0 = "event_v3"
            boolean r0 = r10.isNull(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r0 != 0) goto L_0x04d2
            goto L_0x04d5
        L_0x04d2:
            r1 = r25
            goto L_0x0514
        L_0x04d5:
            java.lang.String r0 = "magic_tag"
            java.lang.String r1 = "ss_app_log"
            r10.put(r0, r1)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r0 = r50
            if (r0 == 0) goto L_0x04e5
            java.lang.String r1 = "time_sync"
            r10.put(r1, r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x04e5:
            java.lang.String r0 = "header"
            r10.put(r0, r13)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r0 = "_gen_time"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r10.put(r0, r1)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r2 = 0
            r47[r2] = r0     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            long r1 = r11.insertLog(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            int r3 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r3 > 0) goto L_0x0509
            java.util.List r3 = com.p280ss.android.common.applog.LogReaper.getTerminateSessionIdFromData(r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            com.p280ss.android.common.applog.AppLog.tryReportTerminateLost(r3)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x0509:
            boolean r3 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            if (r3 == 0) goto L_0x0514
            android.content.Context r3 = r11.mContext     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            com.p280ss.android.common.applog.LogDebugUtil.trackLogInsert(r3, r1, r0)     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
        L_0x0514:
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x053d, all -> 0x0520 }
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ all -> 0x0544 }
            safeCloseCursorAndEndTX(r15, r0)     // Catch:{ all -> 0x0544 }
            monitor-exit(r41)
            return r1
        L_0x0520:
            r0 = move-exception
            goto L_0x0534
        L_0x0522:
            r0 = move-exception
            r11 = r6
            goto L_0x0534
        L_0x0525:
            r11 = r6
            goto L_0x053d
        L_0x0527:
            r0 = move-exception
            r11 = r6
            goto L_0x0532
        L_0x052a:
            r11 = r6
            goto L_0x053b
        L_0x052c:
            r0 = move-exception
            r11 = r41
            goto L_0x0532
        L_0x0530:
            r0 = move-exception
            r11 = r8
        L_0x0532:
            r15 = r24
        L_0x0534:
            android.database.sqlite.SQLiteDatabase r1 = r11.mDb     // Catch:{ all -> 0x0544 }
            safeCloseCursorAndEndTX(r15, r1)     // Catch:{ all -> 0x0544 }
            throw r0     // Catch:{ all -> 0x0544 }
        L_0x053a:
            r11 = r8
        L_0x053b:
            r15 = r24
        L_0x053d:
            android.database.sqlite.SQLiteDatabase r0 = r11.mDb     // Catch:{ all -> 0x0544 }
            safeCloseCursorAndEndTX(r15, r0)     // Catch:{ all -> 0x0544 }
            monitor-exit(r41)
            return r25
        L_0x0544:
            r0 = move-exception
            goto L_0x054d
        L_0x0546:
            r11 = r8
            r0 = -1
            monitor-exit(r41)
            return r0
        L_0x054b:
            r0 = move-exception
            r11 = r8
        L_0x054d:
            monitor-exit(r41)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.DBHelper.batchSession(com.ss.android.common.applog.LogSession, com.ss.android.common.applog.LogSession, org.json.JSONObject, boolean, long[], java.lang.String[], java.util.List, boolean, org.json.JSONObject):long");
    }
}
