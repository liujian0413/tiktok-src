package com.p280ss.android.ugc.aweme.i18n.draftcompat;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.draftcompat.b */
public final class C30451b {

    /* renamed from: a */
    public String f80019a;

    /* renamed from: b */
    public String f80020b;

    /* renamed from: c */
    public String f80021c;

    /* renamed from: d */
    public Long f80022d;

    /* renamed from: a */
    private void m99471a(long j) {
        this.f80022d = Long.valueOf(j);
    }

    /* renamed from: a */
    private static List<Segment> m99470a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (List) new C6600e().mo15975a(str, new C6597a<List<Segment>>() {
            }.type);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r9 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        if (r9 != null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[SYNTHETIC, Splitter:B:23:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m99469a(android.database.sqlite.SQLiteDatabase r9, long r10) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r2 = "T_MUSICAL"
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r1 = "id"
            r4 = 0
            r3[r4] = r1     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r1 = "CAPTION"
            r5 = 1
            r3[r5] = r1     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r6 = "id=?"
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            r5[r4] = r10     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            r10 = 0
            r7 = 0
            r8 = 0
            r1 = r9
            r4 = r6
            r6 = r10
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            if (r9 == 0) goto L_0x0042
            boolean r10 = r9.moveToNext()     // Catch:{ Exception -> 0x0050, all -> 0x003f }
            if (r10 == 0) goto L_0x0042
            java.lang.String r10 = "CAPTION"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ Exception -> 0x0050, all -> 0x003f }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ Exception -> 0x0050, all -> 0x003f }
            if (r9 == 0) goto L_0x003e
            r9.close()     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            return r10
        L_0x003f:
            r10 = move-exception
            r0 = r9
            goto L_0x0049
        L_0x0042:
            if (r9 == 0) goto L_0x0053
        L_0x0044:
            r9.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0053
        L_0x0048:
            r10 = move-exception
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            throw r10
        L_0x004f:
            r9 = r0
        L_0x0050:
            if (r9 == 0) goto L_0x0053
            goto L_0x0044
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.i18n.draftcompat.C30451b.m99469a(android.database.sqlite.SQLiteDatabase, long):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.i18n.draftcompat.b, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r12v9, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:44|45|46|47|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x000f, B:30:0x00db, B:42:0x0150] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0158 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.ss.android.ugc.aweme.i18n.draftcompat.b, android.database.Cursor]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [android.database.Cursor, com.ss.android.ugc.aweme.i18n.draftcompat.b]
      mth insns count: 132
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0150=Splitter:B:42:0x0150, B:47:0x0158=Splitter:B:47:0x0158} */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.i18n.draftcompat.C30451b m99468a(android.database.sqlite.SQLiteDatabase r12, android.database.Cursor r13, boolean r14) {
        /*
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ss.android.ugc.aweme.i18n.draftcompat.b r1 = new com.ss.android.ugc.aweme.i18n.draftcompat.b
            r1.<init>()
            r2 = 1
            r3 = 0
            if (r14 == 0) goto L_0x00b2
            java.lang.String r14 = "SEGMENTS"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = r13.getString(r14)     // Catch:{ Exception -> 0x0159 }
            java.util.List r14 = m99470a(r14)     // Catch:{ Exception -> 0x0159 }
            boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r14)     // Catch:{ Exception -> 0x0159 }
            if (r4 == 0) goto L_0x0022
            return r0
        L_0x0022:
            int r0 = r14.size()     // Catch:{ Exception -> 0x0159 }
            if (r0 <= r2) goto L_0x0063
            java.lang.String r0 = "LOCAL_MOVIE_URL"
            int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x0159 }
            r1.f80019a = r0     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = "MIX_AUDIO_PATH"
            int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x0159 }
            boolean r2 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r0)     // Catch:{ Exception -> 0x0159 }
            if (r2 == 0) goto L_0x0047
            r1.f80020b = r0     // Catch:{ Exception -> 0x0159 }
            goto L_0x009d
        L_0x0047:
            java.lang.Object r0 = r14.get(r3)     // Catch:{ Exception -> 0x0159 }
            com.ss.android.ugc.aweme.i18n.draftcompat.Segment r0 = (com.p280ss.android.ugc.aweme.i18n.draftcompat.Segment) r0     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r0.f80001i     // Catch:{ Exception -> 0x0159 }
            boolean r2 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r0)     // Catch:{ Exception -> 0x0159 }
            if (r2 == 0) goto L_0x0058
            r1.f80020b = r0     // Catch:{ Exception -> 0x0159 }
            goto L_0x009d
        L_0x0058:
            java.lang.Object r14 = r14.get(r3)     // Catch:{ Exception -> 0x0159 }
            com.ss.android.ugc.aweme.i18n.draftcompat.Segment r14 = (com.p280ss.android.ugc.aweme.i18n.draftcompat.Segment) r14     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = r14.f80002j     // Catch:{ Exception -> 0x0159 }
            r1.f80020b = r14     // Catch:{ Exception -> 0x0159 }
            goto L_0x009d
        L_0x0063:
            java.lang.Object r0 = r14.get(r3)     // Catch:{ Exception -> 0x0159 }
            com.ss.android.ugc.aweme.i18n.draftcompat.Segment r0 = (com.p280ss.android.ugc.aweme.i18n.draftcompat.Segment) r0     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r0.mo80124a()     // Catch:{ Exception -> 0x0159 }
            r1.f80019a = r0     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r0 = r14.get(r3)     // Catch:{ Exception -> 0x0159 }
            com.ss.android.ugc.aweme.i18n.draftcompat.Segment r0 = (com.p280ss.android.ugc.aweme.i18n.draftcompat.Segment) r0     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r0.f80001i     // Catch:{ Exception -> 0x0159 }
            boolean r2 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r0)     // Catch:{ Exception -> 0x0159 }
            if (r2 == 0) goto L_0x0080
            r1.f80020b = r0     // Catch:{ Exception -> 0x0159 }
            goto L_0x009d
        L_0x0080:
            java.lang.Object r14 = r14.get(r3)     // Catch:{ Exception -> 0x0159 }
            com.ss.android.ugc.aweme.i18n.draftcompat.Segment r14 = (com.p280ss.android.ugc.aweme.i18n.draftcompat.Segment) r14     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = r14.f80002j     // Catch:{ Exception -> 0x0159 }
            boolean r0 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r14)     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x0091
            r1.f80020b = r14     // Catch:{ Exception -> 0x0159 }
            goto L_0x009d
        L_0x0091:
            java.lang.String r14 = "MIX_AUDIO_PATH"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = r13.getString(r14)     // Catch:{ Exception -> 0x0159 }
            r1.f80020b = r14     // Catch:{ Exception -> 0x0159 }
        L_0x009d:
            java.lang.String r14 = "MUSICAL_ID"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0159 }
            long r13 = r13.getLong(r14)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r12 = m99469a(r12, r13)     // Catch:{ Exception -> 0x0159 }
            r1.f80021c = r12     // Catch:{ Exception -> 0x0159 }
            r1.m99471a(r13)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0159
        L_0x00b2:
            java.lang.String r14 = "id"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0159 }
            long r4 = r13.getLong(r14)     // Catch:{ Exception -> 0x0159 }
            r1.m99471a(r4)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = "CAPTION"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = r13.getString(r14)     // Catch:{ Exception -> 0x0159 }
            r1.f80021c = r14     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = "LOCAL_MOVIE_URL"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = r13.getString(r14)     // Catch:{ Exception -> 0x0159 }
            r1.f80019a = r14     // Catch:{ Exception -> 0x0159 }
            if (r12 == 0) goto L_0x0159
            java.lang.String r14 = "TRACK_ID"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r14 = r13.getString(r14)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            if (r14 == 0) goto L_0x0107
            java.lang.String r5 = "T_TRACK"
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r14 = "LOCAL_SONG_URL"
            r6[r3] = r14     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r7 = "TRACK_ID=?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r14 = "TRACK_ID"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r13 = r13.getString(r14)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            r8[r3] = r13     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r12
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
        L_0x0105:
            r0 = r12
            goto L_0x0136
        L_0x0107:
            java.lang.String r14 = "T_TRACK"
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r5 = "LOCAL_SONG_URL"
            r4[r3] = r5     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r5 = "FOREIGN_TRACK_ID=? and TRACK_SOURCE=?"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r7 = "FOREIGN_TRACK_ID"
            int r7 = r13.getColumnIndex(r7)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r7 = r13.getString(r7)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            r6[r3] = r7     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r3 = "TRACK_SOURCE"
            int r3 = r13.getColumnIndex(r3)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r13 = r13.getString(r3)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            r6[r2] = r13     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            r3 = r14
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            goto L_0x0105
        L_0x0136:
            if (r0 == 0) goto L_0x0150
            int r12 = r0.getCount()     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            if (r12 <= 0) goto L_0x0150
            boolean r12 = r0.moveToNext()     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            if (r12 == 0) goto L_0x0150
            java.lang.String r12 = "LOCAL_SONG_URL"
            int r12 = r0.getColumnIndex(r12)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            java.lang.String r12 = r0.getString(r12)     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
            r1.f80020b = r12     // Catch:{ Exception -> 0x0150, all -> 0x0154 }
        L_0x0150:
            r0.close()     // Catch:{ Exception -> 0x0159 }
            goto L_0x0159
        L_0x0154:
            r12 = move-exception
            r0.close()     // Catch:{ Exception -> 0x0158 }
        L_0x0158:
            throw r12     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.i18n.draftcompat.C30451b.m99468a(android.database.sqlite.SQLiteDatabase, android.database.Cursor, boolean):com.ss.android.ugc.aweme.i18n.draftcompat.b");
    }
}
