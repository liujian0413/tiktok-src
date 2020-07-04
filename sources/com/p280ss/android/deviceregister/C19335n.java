package com.p280ss.android.deviceregister;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.bytedance.common.utility.p254b.C6304f;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.ss.android.deviceregister.n */
final class C19335n implements C19348p {

    /* renamed from: a */
    private static volatile C19348p f52293a;

    /* renamed from: b */
    private final C19337a f52294b;

    /* renamed from: c */
    private final BlockingQueue<Pair<Boolean, C19340a>> f52295c = new LinkedBlockingDeque();

    /* renamed from: com.ss.android.deviceregister.n$a */
    static final class C19337a {

        /* renamed from: a */
        private final C19338b f52296a;

        /* renamed from: b */
        private final SQLiteDatabase f52297b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo51267a() {
            int i;
            long currentTimeMillis = System.currentTimeMillis();
            Cursor rawQuery = this.f52297b.rawQuery("SELECT _timestamp_id FROM timestamp ORDER BY _timestamp_id DESC LIMIT 1", null);
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(rawQuery.getColumnIndex("_timestamp_id"));
            } else {
                i = 0;
            }
            rawQuery.close();
            StringBuilder sb = new StringBuilder("maxTimestampId=");
            sb.append(i);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC, Splitter:B:24:0x0054] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo51274c() {
            /*
                r7 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 0
                r3 = 0
                android.database.sqlite.SQLiteDatabase r4 = r7.f52297b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                java.lang.String r5 = "SELECT timestamp_active_user_id FROM timestamp_active_user ORDER BY timestamp_active_user_id DESC LIMIT 1"
                android.database.Cursor r4 = r4.rawQuery(r5, r2)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                boolean r2 = r4.moveToFirst()     // Catch:{ Exception -> 0x0025 }
                if (r2 == 0) goto L_0x001f
                java.lang.String r2 = "timestamp_active_user_id"
                int r2 = r4.getColumnIndex(r2)     // Catch:{ Exception -> 0x0025 }
                int r2 = r4.getInt(r2)     // Catch:{ Exception -> 0x0025 }
                r3 = r2
            L_0x001f:
                if (r4 == 0) goto L_0x0034
            L_0x0021:
                r4.close()     // Catch:{ Exception -> 0x0034 }
                goto L_0x0034
            L_0x0025:
                r2 = move-exception
                goto L_0x002e
            L_0x0027:
                r0 = move-exception
                r4 = r2
                goto L_0x0052
            L_0x002a:
                r4 = move-exception
                r6 = r4
                r4 = r2
                r2 = r6
            L_0x002e:
                r2.getMessage()     // Catch:{ all -> 0x0051 }
                if (r4 == 0) goto L_0x0034
                goto L_0x0021
            L_0x0034:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "maxTimestampActiveUserId="
                r2.<init>(r4)
                r2.append(r3)
                java.lang.String r4 = ", takes "
                r2.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r2.append(r4)
                java.lang.String r0 = " ms"
                r2.append(r0)
                return r3
            L_0x0051:
                r0 = move-exception
            L_0x0052:
                if (r4 == 0) goto L_0x0057
                r4.close()     // Catch:{ Exception -> 0x0057 }
            L_0x0057:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C19335n.C19337a.mo51274c():int");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
            if (r4 != null) goto L_0x0021;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC, Splitter:B:24:0x0054] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo51276d() {
            /*
                r7 = this;
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 0
                r3 = 0
                android.database.sqlite.SQLiteDatabase r4 = r7.f52297b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                java.lang.String r5 = "SELECT _timestamp_header_id FROM timestamp_header ORDER BY _timestamp_header_id DESC LIMIT 1"
                android.database.Cursor r4 = r4.rawQuery(r5, r2)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
                boolean r2 = r4.moveToFirst()     // Catch:{ Exception -> 0x0025 }
                if (r2 == 0) goto L_0x001f
                java.lang.String r2 = "_timestamp_header_id"
                int r2 = r4.getColumnIndex(r2)     // Catch:{ Exception -> 0x0025 }
                int r2 = r4.getInt(r2)     // Catch:{ Exception -> 0x0025 }
                r3 = r2
            L_0x001f:
                if (r4 == 0) goto L_0x0034
            L_0x0021:
                r4.close()     // Catch:{ Exception -> 0x0034 }
                goto L_0x0034
            L_0x0025:
                r2 = move-exception
                goto L_0x002e
            L_0x0027:
                r0 = move-exception
                r4 = r2
                goto L_0x0052
            L_0x002a:
                r4 = move-exception
                r6 = r4
                r4 = r2
                r2 = r6
            L_0x002e:
                r2.getMessage()     // Catch:{ all -> 0x0051 }
                if (r4 == 0) goto L_0x0034
                goto L_0x0021
            L_0x0034:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "maxTimestampHeaderId="
                r2.<init>(r4)
                r2.append(r3)
                java.lang.String r4 = ", takes "
                r2.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r2.append(r4)
                java.lang.String r0 = " ms"
                r2.append(r0)
                return r3
            L_0x0051:
                r0 = move-exception
            L_0x0052:
                if (r4 == 0) goto L_0x0057
                r4.close()     // Catch:{ Exception -> 0x0057 }
            L_0x0057:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C19335n.C19337a.mo51276d():int");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
            if (r4 != null) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            if (r4 != null) goto L_0x0044;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[SYNTHETIC, Splitter:B:26:0x0077] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.p280ss.android.deviceregister.C19334l> mo51278f() {
            /*
                r10 = this;
                long r0 = java.lang.System.currentTimeMillis()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r3 = 0
                android.database.sqlite.SQLiteDatabase r4 = r10.f52297b     // Catch:{ Exception -> 0x004d, all -> 0x004a }
                java.lang.String r5 = "select * from timestamp_header ORDER BY _timestamp_header_id ASC"
                android.database.Cursor r4 = r4.rawQuery(r5, r3)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
                java.lang.String r3 = "_timestamp_header_id"
                int r3 = r4.getColumnIndex(r3)     // Catch:{ Exception -> 0x0048 }
                java.lang.String r5 = "_json"
                int r5 = r4.getColumnIndex(r5)     // Catch:{ Exception -> 0x0048 }
                boolean r6 = r4.moveToFirst()     // Catch:{ Exception -> 0x0048 }
                if (r6 == 0) goto L_0x0042
            L_0x0024:
                boolean r6 = r4.isAfterLast()     // Catch:{ Exception -> 0x0048 }
                if (r6 != 0) goto L_0x0042
                int r6 = r4.getInt(r3)     // Catch:{ Exception -> 0x0048 }
                java.lang.String r7 = r4.getString(r5)     // Catch:{ Exception -> 0x0048 }
                com.ss.android.deviceregister.l r8 = new com.ss.android.deviceregister.l     // Catch:{ Exception -> 0x0048 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0048 }
                r8.<init>(r7, r6)     // Catch:{ Exception -> 0x0048 }
                r2.add(r8)     // Catch:{ Exception -> 0x0048 }
                r4.moveToNext()     // Catch:{ Exception -> 0x0048 }
                goto L_0x0024
            L_0x0042:
                if (r4 == 0) goto L_0x0057
            L_0x0044:
                r4.close()     // Catch:{ Exception -> 0x0057 }
                goto L_0x0057
            L_0x0048:
                r3 = move-exception
                goto L_0x0051
            L_0x004a:
                r0 = move-exception
                r4 = r3
                goto L_0x0075
            L_0x004d:
                r4 = move-exception
                r9 = r4
                r4 = r3
                r3 = r9
            L_0x0051:
                r3.getMessage()     // Catch:{ all -> 0x0074 }
                if (r4 == 0) goto L_0x0057
                goto L_0x0044
            L_0x0057:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "end. return="
                r3.<init>(r4)
                r3.append(r2)
                java.lang.String r4 = ", takes "
                r3.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r0
                r3.append(r4)
                java.lang.String r0 = " ms"
                r3.append(r0)
                return r2
            L_0x0074:
                r0 = move-exception
            L_0x0075:
                if (r4 == 0) goto L_0x007a
                r4.close()     // Catch:{ Exception -> 0x007a }
            L_0x007a:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C19335n.C19337a.mo51278f():java.util.List");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x010b, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x010c, code lost:
            r21 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0110, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0110 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0011] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0121 A[SYNTHETIC, Splitter:B:32:0x0121] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0147 A[SYNTHETIC, Splitter:B:42:0x0147] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.p280ss.android.deviceregister.C19331j> mo51277e() {
            /*
                r34 = this;
                long r1 = java.lang.System.currentTimeMillis()
                r3 = 0
                r4 = r34
                android.database.sqlite.SQLiteDatabase r0 = r4.f52297b     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
                java.lang.String r5 = "select * from timestamp_active_user ORDER BY timestamp_active_user_id ASC"
                android.database.Cursor r5 = r0.rawQuery(r5, r3)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
                java.lang.String r0 = "timestamp_active_user_id"
                int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r6 = "invoke_internal_start"
                int r6 = r5.getColumnIndex(r6)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r7 = "invoke_internal_end"
                int r7 = r5.getColumnIndex(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r8 = "internal_json_object"
                int r8 = r5.getColumnIndex(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r9 = "active_thread_run"
                int r9 = r5.getColumnIndex(r9)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r10 = "active_user_start"
                int r10 = r5.getColumnIndex(r10)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r11 = "active_user_end"
                int r11 = r5.getColumnIndex(r11)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r12 = "net_start"
                int r12 = r5.getColumnIndex(r12)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r13 = "net_stacktrace"
                int r13 = r5.getColumnIndex(r13)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r14 = "net_url"
                int r14 = r5.getColumnIndex(r14)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r15.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                boolean r16 = r5.moveToFirst()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                if (r16 == 0) goto L_0x00e8
            L_0x0056:
                boolean r16 = r5.isAfterLast()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                if (r16 != 0) goto L_0x00e8
                int r16 = r5.getInt(r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r17 = r5.getLong(r6)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r19 = r5.getLong(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r3 = r5.getString(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r22 = r5.getLong(r9)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r24 = r5.getLong(r10)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r26 = r5.getLong(r11)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                long r28 = r5.getLong(r12)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r30 = r0
                java.lang.String r0 = r5.getString(r13)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.String r4 = r5.getString(r14)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r31 = r6
                com.ss.android.deviceregister.j$a r6 = new com.ss.android.deviceregister.j$a     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r6.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r32 = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r7 = r6.mo51243a(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r33 = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r7 = r7.mo51244a(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r7 = r7.mo51249b(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r8.<init>(r3)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r3 = r7.mo51247a(r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r7 = java.lang.Long.valueOf(r22)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r3 = r3.mo51250c(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r7 = java.lang.Long.valueOf(r24)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r3 = r3.mo51251d(r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r7 = java.lang.Long.valueOf(r26)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r0 = r3.mo51245a(r7, r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.lang.Long r3 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r0 = r0.mo51252e(r3)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r0.mo51246a(r4)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r15.add(r6)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r5.moveToNext()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r0 = r30
                r6 = r31
                r7 = r32
                r8 = r33
                r3 = 0
                r4 = r34
                goto L_0x0056
            L_0x00e8:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                r3.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
                java.util.Iterator r0 = r15.iterator()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
            L_0x00f1:
                boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                if (r4 == 0) goto L_0x0105
                java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                com.ss.android.deviceregister.j$a r4 = (com.p280ss.android.deviceregister.C19331j.C19333a) r4     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                com.ss.android.deviceregister.j r4 = r4.mo51248a()     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                r3.add(r4)     // Catch:{ Exception -> 0x010b, all -> 0x0110 }
                goto L_0x00f1
            L_0x0105:
                if (r5 == 0) goto L_0x0126
                r5.close()     // Catch:{ Exception -> 0x0126 }
                goto L_0x0126
            L_0x010b:
                r0 = move-exception
                r21 = r3
                r3 = r5
                goto L_0x011c
            L_0x0110:
                r0 = move-exception
                goto L_0x0145
            L_0x0112:
                r0 = move-exception
                r3 = r5
                goto L_0x011a
            L_0x0115:
                r0 = move-exception
                r5 = 0
                goto L_0x0145
            L_0x0118:
                r0 = move-exception
                r3 = 0
            L_0x011a:
                r21 = 0
            L_0x011c:
                r0.getMessage()     // Catch:{ all -> 0x0143 }
                if (r3 == 0) goto L_0x0124
                r3.close()     // Catch:{ Exception -> 0x0124 }
            L_0x0124:
                r3 = r21
            L_0x0126:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r4 = "end. return="
                r0.<init>(r4)
                r0.append(r3)
                java.lang.String r4 = ", takes "
                r0.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r1
                r0.append(r4)
                java.lang.String r1 = " ms"
                r0.append(r1)
                return r3
            L_0x0143:
                r0 = move-exception
                r5 = r3
            L_0x0145:
                if (r5 == 0) goto L_0x014a
                r5.close()     // Catch:{ Exception -> 0x014a }
            L_0x014a:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C19335n.C19337a.mo51277e():java.util.List");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0220, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0221, code lost:
            r1 = r4;
            r4 = r5;
            r16 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0226, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0227, code lost:
            r1 = r0;
            r16 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x024c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x024d, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            r16.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0257, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0258, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0282, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0283, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            r16.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x028d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x028e, code lost:
            r0.getMessage();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0226 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:17:0x010c] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0248 A[SYNTHETIC, Splitter:B:71:0x0248] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0253 A[SYNTHETIC, Splitter:B:76:0x0253] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x027e A[SYNTHETIC, Splitter:B:85:0x027e] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0289 A[SYNTHETIC, Splitter:B:90:0x0289] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.p280ss.android.deviceregister.C19326i> mo51272b() {
            /*
                r41 = this;
                r1 = r41
                long r2 = java.lang.System.currentTimeMillis()
                r4 = 0
                android.database.sqlite.SQLiteDatabase r0 = r1.f52297b     // Catch:{ Exception -> 0x023e, all -> 0x0238 }
                java.lang.String r5 = "select * from timestamp ORDER BY _timestamp_id ASC"
                android.database.Cursor r5 = r0.rawQuery(r5, r4)     // Catch:{ Exception -> 0x023e, all -> 0x0238 }
                java.lang.String r0 = "_timestamp_id"
                int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r6 = "_init_start"
                int r6 = r5.getColumnIndex(r6)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r7 = "_init_end"
                int r7 = r5.getColumnIndex(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r8 = "_prepare_param_start"
                int r8 = r5.getColumnIndex(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r9 = "_prepare_param_end"
                int r9 = r5.getColumnIndex(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r10 = "_load_cache_start"
                int r10 = r5.getColumnIndex(r10)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r11 = "_load_cache_end"
                int r11 = r5.getColumnIndex(r11)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r12 = "_net_max_try_times"
                int r12 = r5.getColumnIndex(r12)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r13 = "_current_did"
                int r13 = r5.getColumnIndex(r13)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.String r14 = "_last_success_upload_timestamp"
                int r14 = r5.getColumnIndex(r14)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r15.<init>()     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r4.<init>()     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                boolean r17 = r5.moveToFirst()     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                if (r17 == 0) goto L_0x0101
            L_0x005b:
                boolean r17 = r5.isAfterLast()     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                if (r17 != 0) goto L_0x0101
                int r17 = r5.getInt(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r18 = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r4.add(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                long r19 = r5.getLong(r6)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                long r21 = r5.getLong(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                long r23 = r5.getLong(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                long r25 = r5.getLong(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                long r27 = r5.getLong(r10)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                long r29 = r5.getLong(r11)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                int r0 = r5.getInt(r12)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r31 = r6
                java.lang.String r6 = r5.getString(r13)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r32 = r7
                com.ss.android.deviceregister.i$b r7 = new com.ss.android.deviceregister.i$b     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r7.<init>()     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r33 = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r8 = r7.mo51236b(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r34 = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r8 = r8.mo51233a(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r8 = r8.mo51237b(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.Long r9 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r8 = r8.mo51238c(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.Long r9 = java.lang.Long.valueOf(r25)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r8 = r8.mo51239d(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.Long r9 = java.lang.Long.valueOf(r27)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r8 = r8.mo51240e(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.Long r9 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r8 = r8.mo51241f(r9)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                com.ss.android.deviceregister.i$b r0 = r8.mo51232a(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r0.mo51234a(r6)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                boolean r0 = r5.isNull(r14)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                if (r0 != 0) goto L_0x00ef
                long r8 = r5.getLong(r14)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r7.mo51242g(r0)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
            L_0x00ef:
                r15.add(r7)     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r5.moveToNext()     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r0 = r18
                r6 = r31
                r7 = r32
                r8 = r33
                r9 = r34
                goto L_0x005b
            L_0x0101:
                int r0 = r4.size()     // Catch:{ Exception -> 0x0234, all -> 0x0231 }
                r6 = 0
                r7 = 0
                r8 = 0
            L_0x0108:
                if (r7 >= r0) goto L_0x01eb
                if (r8 == 0) goto L_0x010f
                r8.close()     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
            L_0x010f:
                android.database.sqlite.SQLiteDatabase r9 = r1.f52297b     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                java.lang.String r10 = "select * from call where _timestamp_id=?"
                r11 = 1
                java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                java.lang.Object r12 = r4.get(r7)     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                r11[r6] = r12     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                android.database.Cursor r9 = r9.rawQuery(r10, r11)     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                java.lang.String r8 = "_net_request_start"
                int r8 = r9.getColumnIndex(r8)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.String r10 = "_net_request_end"
                int r10 = r9.getColumnIndex(r10)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.String r11 = "_url"
                int r11 = r9.getColumnIndex(r11)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.String r12 = "_data"
                int r12 = r9.getColumnIndex(r12)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.String r13 = "_exception"
                int r13 = r9.getColumnIndex(r13)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.String r14 = "_error_message"
                int r14 = r9.getColumnIndex(r14)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.String r6 = "_n_try"
                int r6 = r9.getColumnIndex(r6)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                boolean r17 = r9.moveToFirst()     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                if (r17 == 0) goto L_0x01d0
            L_0x0154:
                boolean r17 = r9.isAfterLast()     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                if (r17 != 0) goto L_0x01d0
                long r17 = r9.getLong(r8)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                long r19 = r9.getLong(r10)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r35 = r0
                java.lang.String r0 = r9.getString(r11)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.String r1 = r9.getString(r12)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r36 = r4
                java.lang.String r4 = r9.getString(r13)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r37 = r8
                java.lang.String r8 = r9.getString(r14)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                int r21 = r9.getInt(r6)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.Object r22 = r15.get(r7)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r38 = r6
                r6 = r22
                com.ss.android.deviceregister.i$b r6 = (com.p280ss.android.deviceregister.C19326i.C19330b) r6     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r39 = r10
                com.ss.android.deviceregister.i$a$a r10 = new com.ss.android.deviceregister.i$a$a     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r10.<init>()     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r40 = r11
                java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a$a r10 = r10.mo51224a(r11)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.Long r11 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a$a r10 = r10.mo51227b(r11)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a$a r0 = r10.mo51225a(r0)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a$a r0 = r0.mo51228b(r1)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a$a r0 = r0.mo51229c(r4)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a$a r0 = r0.mo51230d(r8)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a$a r0 = r0.mo51223a(r1)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                com.ss.android.deviceregister.i$a r0 = r0.mo51226a()     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r6.mo51231a(r0)     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r9.moveToNext()     // Catch:{ Exception -> 0x01e6, all -> 0x01e0 }
                r0 = r35
                r4 = r36
                r8 = r37
                r6 = r38
                r10 = r39
                r11 = r40
                r1 = r41
                goto L_0x0154
            L_0x01d0:
                r35 = r0
                r36 = r4
                int r7 = r7 + 1
                r8 = r9
                r0 = r35
                r4 = r36
                r1 = r41
                r6 = 0
                goto L_0x0108
            L_0x01e0:
                r0 = move-exception
                r1 = r0
                r16 = r9
                goto L_0x027c
            L_0x01e6:
                r0 = move-exception
                r4 = r5
                r16 = r9
                goto L_0x022f
            L_0x01eb:
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                r4.<init>()     // Catch:{ Exception -> 0x022b, all -> 0x0226 }
                java.util.Iterator r0 = r15.iterator()     // Catch:{ Exception -> 0x0220, all -> 0x0226 }
            L_0x01f4:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0220, all -> 0x0226 }
                if (r1 == 0) goto L_0x0208
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0220, all -> 0x0226 }
                com.ss.android.deviceregister.i$b r1 = (com.p280ss.android.deviceregister.C19326i.C19330b) r1     // Catch:{ Exception -> 0x0220, all -> 0x0226 }
                com.ss.android.deviceregister.i r1 = r1.mo51235a()     // Catch:{ Exception -> 0x0220, all -> 0x0226 }
                r4.add(r1)     // Catch:{ Exception -> 0x0220, all -> 0x0226 }
                goto L_0x01f4
            L_0x0208:
                if (r5 == 0) goto L_0x0213
                r5.close()     // Catch:{ Exception -> 0x020e }
                goto L_0x0213
            L_0x020e:
                r0 = move-exception
                r1 = r0
                r1.getMessage()
            L_0x0213:
                if (r8 == 0) goto L_0x021e
                r8.close()     // Catch:{ Exception -> 0x0219 }
                goto L_0x021e
            L_0x0219:
                r0 = move-exception
                r1 = r0
                r1.getMessage()
            L_0x021e:
                r1 = r4
                goto L_0x025c
            L_0x0220:
                r0 = move-exception
                r1 = r4
                r4 = r5
                r16 = r8
                goto L_0x0243
            L_0x0226:
                r0 = move-exception
                r1 = r0
                r16 = r8
                goto L_0x027c
            L_0x022b:
                r0 = move-exception
                r4 = r5
                r16 = r8
            L_0x022f:
                r1 = 0
                goto L_0x0243
            L_0x0231:
                r0 = move-exception
                r1 = r0
                goto L_0x023b
            L_0x0234:
                r0 = move-exception
                r4 = r5
                r1 = 0
                goto L_0x0241
            L_0x0238:
                r0 = move-exception
                r1 = r0
                r5 = 0
            L_0x023b:
                r16 = 0
                goto L_0x027c
            L_0x023e:
                r0 = move-exception
                r1 = 0
                r4 = 0
            L_0x0241:
                r16 = 0
            L_0x0243:
                r0.getMessage()     // Catch:{ all -> 0x0279 }
                if (r4 == 0) goto L_0x0251
                r4.close()     // Catch:{ Exception -> 0x024c }
                goto L_0x0251
            L_0x024c:
                r0 = move-exception
                r4 = r0
                r4.getMessage()
            L_0x0251:
                if (r16 == 0) goto L_0x025c
                r16.close()     // Catch:{ Exception -> 0x0257 }
                goto L_0x025c
            L_0x0257:
                r0 = move-exception
                r4 = r0
                r4.getMessage()
            L_0x025c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r4 = "return="
                r0.<init>(r4)
                r0.append(r1)
                java.lang.String r4 = ", takes "
                r0.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r2
                r0.append(r4)
                java.lang.String r2 = " ms"
                r0.append(r2)
                return r1
            L_0x0279:
                r0 = move-exception
                r1 = r0
                r5 = r4
            L_0x027c:
                if (r5 == 0) goto L_0x0287
                r5.close()     // Catch:{ Exception -> 0x0282 }
                goto L_0x0287
            L_0x0282:
                r0 = move-exception
                r2 = r0
                r2.getMessage()
            L_0x0287:
                if (r16 == 0) goto L_0x0292
                r16.close()     // Catch:{ Exception -> 0x028d }
                goto L_0x0292
            L_0x028d:
                r0 = move-exception
                r2 = r0
                r2.getMessage()
            L_0x0292:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C19335n.C19337a.mo51272b():java.util.List");
        }

        private C19337a(Context context) {
            this.f52296a = new C19338b(context);
            this.f52297b = this.f52296a.getWritableDatabase();
        }

        /* renamed from: b */
        private long m63444b(C19334l lVar) {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_timestamp_header_id", lVar.f52292b);
            contentValues.put("_json", lVar.f52291a);
            this.f52297b.beginTransaction();
            try {
                j = this.f52297b.insert("timestamp_header", null, contentValues);
                if (j != -1) {
                    try {
                        this.f52297b.setTransactionSuccessful();
                    } catch (Exception e) {
                        e = e;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52297b.endTransaction();
                    StringBuilder sb = new StringBuilder("end. rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52297b.endTransaction();
                    throw th;
                }
            }
            this.f52297b.endTransaction();
            StringBuilder sb2 = new StringBuilder("end. rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* renamed from: d */
        private boolean m63445d(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = this.f52297b.query("timestamp", new String[]{"_timestamp_id"}, "_timestamp_id=?", new String[]{String.valueOf(i)}, null, null, null, "1");
            boolean moveToFirst = query.moveToFirst();
            query.close();
            StringBuilder sb = new StringBuilder("timestampPrimaryId=");
            sb.append(i);
            sb.append(" contains=");
            sb.append(moveToFirst);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return moveToFirst;
        }

        /* renamed from: e */
        private boolean m63446e(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = this.f52297b.query("timestamp_active_user", new String[]{"timestamp_active_user_id"}, "timestamp_active_user_id=?", new String[]{String.valueOf(i)}, null, null, null, "1");
            boolean moveToFirst = query.moveToFirst();
            query.close();
            StringBuilder sb = new StringBuilder("timestampPrimaryId=");
            sb.append(i);
            sb.append(" contains=");
            sb.append(moveToFirst);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return moveToFirst;
        }

        /* renamed from: f */
        private boolean m63447f(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = this.f52297b.query("timestamp_header", new String[]{"_timestamp_header_id"}, "_timestamp_header_id=?", new String[]{String.valueOf(i)}, null, null, null, "1");
            boolean moveToFirst = query.moveToFirst();
            query.close();
            StringBuilder sb = new StringBuilder("timestampPrimaryId=");
            sb.append(i);
            sb.append(" contains=");
            sb.append(moveToFirst);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return moveToFirst;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long mo51268a(C19326i iVar) {
            Object obj;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (iVar == null) {
                obj = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                obj = iVar.f52245k;
            }
            new StringBuilder("timestampPrimaryId=").append(String.valueOf(obj));
            if (iVar == null) {
                return -1;
            }
            this.f52297b.beginTransaction();
            try {
                mo51271a(iVar.f52245k.intValue());
                j = m63442b(iVar);
                try {
                    this.f52297b.setTransactionSuccessful();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52297b.endTransaction();
                    StringBuilder sb = new StringBuilder("rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52297b.endTransaction();
                    throw th;
                }
            }
            this.f52297b.endTransaction();
            StringBuilder sb2 = new StringBuilder("rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* renamed from: b */
        private long m63443b(C19331j jVar) {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp_active_user_id", jVar.f52271a);
            contentValues.put("invoke_internal_start", jVar.f52272b);
            contentValues.put("invoke_internal_end", jVar.f52273c);
            contentValues.put("internal_json_object", jVar.f52274d.toString());
            contentValues.put("active_thread_run", jVar.f52275e);
            contentValues.put("active_user_start", jVar.f52276f);
            contentValues.put("active_user_end", jVar.f52277g);
            contentValues.put("net_start", jVar.f52278h);
            contentValues.put("net_stacktrace", jVar.f52279i);
            contentValues.put("net_url", jVar.f52280j);
            this.f52297b.beginTransaction();
            try {
                j = this.f52297b.insert("timestamp_active_user", null, contentValues);
                if (j != -1) {
                    try {
                        this.f52297b.setTransactionSuccessful();
                    } catch (Exception e) {
                        e = e;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52297b.endTransaction();
                    StringBuilder sb = new StringBuilder("end. rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52297b.endTransaction();
                    throw th;
                }
            }
            this.f52297b.endTransaction();
            StringBuilder sb2 = new StringBuilder("end. rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long mo51269a(C19331j jVar) {
            Object obj;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (jVar == null) {
                obj = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                obj = jVar.f52271a;
            }
            new StringBuilder("timestampActiveUserId=").append(String.valueOf(obj));
            if (jVar == null) {
                return -1;
            }
            this.f52297b.beginTransaction();
            try {
                mo51273b(jVar.f52271a.intValue());
                j = m63443b(jVar);
                try {
                    this.f52297b.setTransactionSuccessful();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52297b.endTransaction();
                    StringBuilder sb = new StringBuilder("rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52297b.endTransaction();
                    throw th;
                }
            }
            this.f52297b.endTransaction();
            StringBuilder sb2 = new StringBuilder("rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo51275c(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f52297b.beginTransaction();
            int i2 = 0;
            try {
                if (m63447f(i)) {
                    i2 = this.f52297b.delete("timestamp_header", "_timestamp_header_id=?", new String[]{String.valueOf(i)});
                }
                this.f52297b.setTransactionSuccessful();
            } catch (Exception e) {
                e.getMessage();
            } catch (Throwable th) {
                this.f52297b.endTransaction();
                throw th;
            }
            this.f52297b.endTransaction();
            StringBuilder sb = new StringBuilder("end. timestampHeaderId=");
            sb.append(i);
            sb.append(" count=");
            sb.append(i2);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
        }

        /* renamed from: b */
        private long m63442b(C19326i iVar) {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_init_start", iVar.f52235a);
            contentValues.put("_init_end", iVar.f52236b);
            contentValues.put("_prepare_param_start", iVar.f52237c);
            contentValues.put("_prepare_param_end", iVar.f52238d);
            contentValues.put("_load_cache_start", iVar.f52239e);
            contentValues.put("_load_cache_end", iVar.f52240f);
            contentValues.put("_net_max_try_times", iVar.f52241g);
            contentValues.put("_current_did", iVar.f52243i);
            contentValues.put("_last_success_upload_timestamp", iVar.f52244j);
            this.f52297b.beginTransaction();
            try {
                j = this.f52297b.insert("timestamp", null, contentValues);
                if (j != -1) {
                    try {
                        for (C19328a aVar : iVar.f52242h) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("_timestamp_id", Long.valueOf(j));
                            contentValues2.put("_net_request_start", aVar.f52246a);
                            contentValues2.put("_net_request_end", aVar.f52247b);
                            contentValues2.put("_url", aVar.f52248c);
                            contentValues2.put("_data", aVar.f52249d);
                            contentValues2.put("_exception", aVar.f52250e);
                            contentValues2.put("_error_message", aVar.f52251f);
                            contentValues2.put("_n_try", aVar.f52252g);
                            if (this.f52297b.insert("call", null, contentValues2) == -1) {
                                StringBuilder sb = new StringBuilder("insert failed for call = ");
                                sb.append(aVar.toString());
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        this.f52297b.setTransactionSuccessful();
                    } catch (Exception e) {
                        e = e;
                        try {
                            e.getMessage();
                            this.f52297b.endTransaction();
                            StringBuilder sb2 = new StringBuilder("success. rowId=");
                            sb2.append(j);
                            sb2.append(", takes ");
                            sb2.append(System.currentTimeMillis() - currentTimeMillis);
                            sb2.append(" ms");
                            return j;
                        } catch (Throwable th) {
                            this.f52297b.endTransaction();
                            throw th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                e.getMessage();
                this.f52297b.endTransaction();
                StringBuilder sb22 = new StringBuilder("success. rowId=");
                sb22.append(j);
                sb22.append(", takes ");
                sb22.append(System.currentTimeMillis() - currentTimeMillis);
                sb22.append(" ms");
                return j;
            }
            this.f52297b.endTransaction();
            StringBuilder sb222 = new StringBuilder("success. rowId=");
            sb222.append(j);
            sb222.append(", takes ");
            sb222.append(System.currentTimeMillis() - currentTimeMillis);
            sb222.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long mo51270a(C19334l lVar) {
            Object obj;
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (lVar == null) {
                obj = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                obj = lVar.f52292b;
            }
            new StringBuilder("timestampHeaderPrimaryId=").append(String.valueOf(obj));
            if (lVar == null) {
                return -1;
            }
            this.f52297b.beginTransaction();
            try {
                mo51275c(lVar.f52292b.intValue());
                j = m63444b(lVar);
                try {
                    this.f52297b.setTransactionSuccessful();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
                try {
                    e.getMessage();
                    this.f52297b.endTransaction();
                    StringBuilder sb = new StringBuilder("rowId=");
                    sb.append(j);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                    return j;
                } catch (Throwable th) {
                    this.f52297b.endTransaction();
                    throw th;
                }
            }
            this.f52297b.endTransaction();
            StringBuilder sb2 = new StringBuilder("rowId=");
            sb2.append(j);
            sb2.append(", takes ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ms");
            return j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo51271a(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f52297b.beginTransaction();
            try {
                if (m63445d(i)) {
                    int delete = this.f52297b.delete("timestamp", "_timestamp_id=?", new String[]{String.valueOf(i)});
                    int delete2 = this.f52297b.delete("call", "_timestamp_id=?", new String[]{String.valueOf(i)});
                    StringBuilder sb = new StringBuilder("success. timestampPrimaryId=");
                    sb.append(i);
                    sb.append(" count=");
                    sb.append(delete);
                    sb.append(" callCount=");
                    sb.append(delete2);
                    sb.append(", takes ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    sb.append(" ms");
                }
                this.f52297b.setTransactionSuccessful();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f52297b.endTransaction();
                throw th;
            }
            this.f52297b.endTransaction();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo51273b(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f52297b.beginTransaction();
            int i2 = 0;
            try {
                if (m63446e(i)) {
                    i2 = this.f52297b.delete("timestamp_active_user", "timestamp_active_user_id=?", new String[]{String.valueOf(i)});
                }
                this.f52297b.setTransactionSuccessful();
            } catch (Exception e) {
                e.getMessage();
            } catch (Throwable th) {
                this.f52297b.endTransaction();
                throw th;
            }
            this.f52297b.endTransaction();
            StringBuilder sb = new StringBuilder("end. timestampActiveUserId=");
            sb.append(i);
            sb.append(" count=");
            sb.append(i2);
            sb.append(", takes ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
        }
    }

    /* renamed from: com.ss.android.deviceregister.n$b */
    static final class C19338b extends SQLiteOpenHelper {
        C19338b(Context context) {
            super(context, "DeviceRegisterMonitor.db", null, 2);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE timestamp (_timestamp_id INTEGER PRIMARY KEY,_init_start LONG,_init_end LONG,_prepare_param_start LONG,_prepare_param_end LONG,_load_cache_start LONG,_load_cache_end LONG,_net_max_try_times INTEGER,_current_did TEXT,_last_success_upload_timestamp LONG)");
            sQLiteDatabase.execSQL("CREATE TABLE call (_timestamp_id INTEGER,_net_request_start LONG,_net_request_end LONG,_url TEXT,_data TEXT,_exception TEXT,_error_message TEXT,_n_try INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE timestamp_active_user (timestamp_active_user_id INTEGER PRIMARY KEY,invoke_internal_start LONG,invoke_internal_end LONG,internal_json_object TEXT,active_thread_run LONG,active_user_start LONG,active_user_end LONG,net_start LONG,net_stacktrace TEXT,net_url TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE timestamp_header (_timestamp_header_id INTEGER PRIMARY KEY,_json TEXT)");
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onUpgrade(sQLiteDatabase, i, i2);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS timestamp");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS call");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS timestamp_active_user");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS timestamp_header");
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: com.ss.android.deviceregister.n$c */
    static final class C19339c extends C6304f {

        /* renamed from: a */
        private final BlockingQueue<Pair<Boolean, C19340a>> f52298a;

        /* renamed from: b */
        private final C19337a f52299b;

        /* renamed from: com.ss.android.deviceregister.n$c$a */
        interface C19340a<T extends C19340a> {
            /* renamed from: a */
            void mo51282a(T t, C19337a aVar);
        }

        /* renamed from: com.ss.android.deviceregister.n$c$b */
        static final class C19341b implements C19340a<C19341b> {

            /* renamed from: a */
            final int f52300a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("Delete{timestampPrimaryId=");
                sb.append(this.f52300a);
                sb.append('}');
                return sb.toString();
            }

            C19341b(int i) {
                this.f52300a = i;
            }

            /* renamed from: a */
            private static void m63461a(C19341b bVar, C19337a aVar) {
                aVar.mo51271a(bVar.f52300a);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo51282a(C19340a aVar, C19337a aVar2) {
                m63461a((C19341b) aVar, aVar2);
            }
        }

        /* renamed from: com.ss.android.deviceregister.n$c$c */
        static final class C19342c implements C19340a<C19342c> {

            /* renamed from: a */
            final int f52301a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("DeleteActiveUser{timestampActiveUserId=");
                sb.append(this.f52301a);
                sb.append('}');
                return sb.toString();
            }

            C19342c(int i) {
                this.f52301a = i;
            }

            /* renamed from: a */
            private static void m63463a(C19342c cVar, C19337a aVar) {
                aVar.mo51273b(cVar.f52301a);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo51282a(C19340a aVar, C19337a aVar2) {
                m63463a((C19342c) aVar, aVar2);
            }
        }

        /* renamed from: com.ss.android.deviceregister.n$c$d */
        static final class C19343d implements C19340a<C19343d> {

            /* renamed from: a */
            final int f52302a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("DeleteHeader{timestampHeaderId=");
                sb.append(this.f52302a);
                sb.append('}');
                return sb.toString();
            }

            C19343d(int i) {
                this.f52302a = i;
            }

            /* renamed from: a */
            private static void m63465a(C19343d dVar, C19337a aVar) {
                aVar.mo51275c(dVar.f52302a);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo51282a(C19340a aVar, C19337a aVar2) {
                m63465a((C19343d) aVar, aVar2);
            }
        }

        /* renamed from: com.ss.android.deviceregister.n$c$e */
        static final class C19344e implements C19340a<C19344e> {

            /* renamed from: a */
            final C19326i f52303a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("InsertOrUpdate{timestamp=");
                sb.append(this.f52303a.f52245k);
                sb.append('}');
                return sb.toString();
            }

            C19344e(C19326i iVar) {
                this.f52303a = iVar;
            }

            /* renamed from: a */
            private static void m63467a(C19344e eVar, C19337a aVar) {
                aVar.mo51268a(eVar.f52303a);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo51282a(C19340a aVar, C19337a aVar2) {
                m63467a((C19344e) aVar, aVar2);
            }
        }

        /* renamed from: com.ss.android.deviceregister.n$c$f */
        static final class C19345f implements C19340a<C19345f> {

            /* renamed from: a */
            final C19331j f52304a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("InsertOrUpdateActiveUser{timestampActiveUser=");
                sb.append(this.f52304a.f52271a);
                sb.append('}');
                return sb.toString();
            }

            C19345f(C19331j jVar) {
                this.f52304a = jVar;
            }

            /* renamed from: a */
            private static void m63469a(C19345f fVar, C19337a aVar) {
                aVar.mo51269a(fVar.f52304a);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo51282a(C19340a aVar, C19337a aVar2) {
                m63469a((C19345f) aVar, aVar2);
            }
        }

        /* renamed from: com.ss.android.deviceregister.n$c$g */
        static final class C19346g implements C19340a<C19346g> {

            /* renamed from: a */
            final C19334l f52305a;

            public final String toString() {
                StringBuilder sb = new StringBuilder("InsertOrUpdateHeader{timestampHeader=");
                sb.append(this.f52305a.f52292b);
                sb.append('}');
                return sb.toString();
            }

            C19346g(C19334l lVar) {
                this.f52305a = lVar;
            }

            /* renamed from: a */
            private static void m63471a(C19346g gVar, C19337a aVar) {
                aVar.mo51270a(gVar.f52305a);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo51282a(C19340a aVar, C19337a aVar2) {
                m63471a((C19346g) aVar, aVar2);
            }
        }

        public final void run() {
            while (true) {
                try {
                    Pair pair = (Pair) this.f52298a.take();
                    if (!((Boolean) pair.first).booleanValue()) {
                        C19340a aVar = (C19340a) pair.second;
                        new StringBuilder("execute action=").append(aVar);
                        aVar.mo51282a(aVar, this.f52299b);
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    new StringBuilder("action my be lost! errorMsg=").append(e.getMessage());
                }
            }
        }

        private C19339c(BlockingQueue<Pair<Boolean, C19340a>> blockingQueue, C19337a aVar) {
            this.f52298a = blockingQueue;
            this.f52299b = aVar;
        }
    }

    /* renamed from: b */
    public final int mo51259b() {
        return this.f52294b.mo51267a();
    }

    /* renamed from: c */
    public final int mo51261c() {
        return this.f52294b.mo51274c();
    }

    /* renamed from: d */
    public final int mo51263d() {
        return this.f52294b.mo51276d();
    }

    /* renamed from: e */
    public final List<C19326i> mo51264e() {
        return this.f52294b.mo51272b();
    }

    /* renamed from: f */
    public final List<C19331j> mo51265f() {
        return this.f52294b.mo51277e();
    }

    /* renamed from: g */
    public final List<C19334l> mo51266g() {
        return this.f52294b.mo51278f();
    }

    /* renamed from: a */
    static C19348p m63429a() {
        if (f52293a == null) {
            synchronized (C19335n.class) {
                if (f52293a == null) {
                    Context context = AppProvider.f19295a;
                    C19337a aVar = null;
                    if (context != null) {
                        try {
                            aVar = new C19337a(context);
                        } catch (Exception unused) {
                        }
                    }
                    if (aVar != null) {
                        f52293a = new C19335n(aVar);
                    } else {
                        f52293a = new C19347o();
                    }
                }
            }
        }
        return f52293a;
    }

    private C19335n(C19337a aVar) {
        this.f52294b = aVar;
        new C19339c(this.f52295c, aVar).start();
    }

    /* renamed from: a */
    public final void mo51255a(int i) {
        this.f52295c.offer(new Pair(Boolean.valueOf(false), new C19341b(i)));
    }

    /* renamed from: b */
    public final void mo51260b(int i) {
        this.f52295c.offer(new Pair(Boolean.valueOf(false), new C19342c(i)));
    }

    /* renamed from: c */
    public final void mo51262c(int i) {
        this.f52295c.offer(new Pair(Boolean.valueOf(false), new C19343d(i)));
    }

    /* renamed from: a */
    public final void mo51256a(C19326i iVar) {
        this.f52295c.offer(new Pair(Boolean.valueOf(false), new C19344e(iVar)));
    }

    /* renamed from: a */
    public final void mo51257a(C19331j jVar) {
        this.f52295c.offer(new Pair(Boolean.valueOf(false), new C19345f(jVar)));
    }

    /* renamed from: a */
    public final void mo51258a(C19334l lVar) {
        this.f52295c.offer(new Pair(Boolean.valueOf(false), new C19346g(lVar)));
    }
}
