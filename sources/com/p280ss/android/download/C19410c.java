package com.p280ss.android.download;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.download.p861b.C19405c.C19406a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ttm.player.MediaPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.download.c */
public final class C19410c {

    /* renamed from: a */
    public static final String[] f52523a = {"_id", "_data AS local_filename", "mediaprovider_uri", "destination", "title", "description", "uri", "status", "hint", "mimetype AS media_type", "total_bytes AS total_size", "lastmod AS last_modified_timestamp", "current_bytes AS bytes_so_far", "allow_write", "etag", "'placeholder' AS local_uri", "'placeholder' AS reason"};

    /* renamed from: g */
    private static C19410c f52524g;

    /* renamed from: b */
    private Context f52525b;

    /* renamed from: c */
    private ContentResolver f52526c;

    /* renamed from: d */
    private C19422f f52527d;

    /* renamed from: e */
    private String f52528e;

    /* renamed from: f */
    private Uri f52529f = C19406a.f52513a;

    /* renamed from: com.ss.android.download.c$a */
    static class C19411a extends CursorWrapper {

        /* renamed from: a */
        private Uri f52530a;

        /* renamed from: b */
        private static long m63789b(int i) {
            switch (i) {
                case 194:
                    return 1;
                case 195:
                    return 2;
                case 196:
                    return 3;
                default:
                    return 4;
            }
        }

        /* renamed from: c */
        private static long m63790c(int i) {
            if ((400 <= i && i < 488) || (500 <= i && i < 600)) {
                return (long) i;
            }
            switch (i) {
                case 198:
                    return 1006;
                case 199:
                    return 1007;
                case 488:
                    return 1009;
                case 489:
                    return 1008;
                case 492:
                    return 1001;
                case 493:
                case 494:
                    return 1002;
                case 495:
                    return 1004;
                case 497:
                    return 1005;
                default:
                    return 1000;
            }
        }

        /* renamed from: a */
        private String m63788a() {
            long j = getLong(getColumnIndex("destination"));
            if (j == 1 || j == 0) {
                String string = getString(getColumnIndex("local_filename"));
                if (string == null) {
                    return null;
                }
                return Uri.fromFile(new File(string)).toString();
            }
            return ContentUris.withAppendedId(this.f52530a, getLong(getColumnIndex("_id"))).toString();
        }

        public final int getInt(int i) {
            return (int) getLong(i);
        }

        /* renamed from: a */
        private long m63787a(int i) {
            int a = C19410c.m63771a(i);
            if (a == 4) {
                return m63789b(i);
            }
            if (a != 16) {
                return 0;
            }
            return m63790c(i);
        }

        public final String getString(int i) {
            if (getColumnName(i).equals("local_uri")) {
                return m63788a();
            }
            return super.getString(i);
        }

        public final long getLong(int i) {
            if (getColumnName(i).equals("reason")) {
                return m63787a(super.getInt(getColumnIndex("status")));
            }
            if (getColumnName(i).equals("status")) {
                return (long) C19410c.m63771a(super.getInt(getColumnIndex("status")));
            }
            return super.getLong(i);
        }

        public C19411a(Cursor cursor, Uri uri) {
            super(cursor);
            this.f52530a = uri;
        }
    }

    /* renamed from: com.ss.android.download.c$b */
    public class C19412b {

        /* renamed from: a */
        public long f52531a = -1;

        /* renamed from: b */
        public int f52532b = -1;

        /* renamed from: c */
        public long f52533c = -1;

        /* renamed from: d */
        public long f52534d = -1;

        /* renamed from: e */
        public String f52535e;

        public C19412b() {
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (!(obj instanceof C19412b) || obj == null) {
                return super.equals(obj);
            }
            C19412b bVar = (C19412b) obj;
            if (this.f52531a == bVar.f52531a) {
                z = true;
            } else {
                z = false;
            }
            if (this.f52532b == bVar.f52532b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f52533c == bVar.f52533c) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((!TextUtils.isEmpty(this.f52535e) || !TextUtils.isEmpty(bVar.f52535e)) && (TextUtils.isEmpty(this.f52535e) || TextUtils.isEmpty(bVar.f52535e) || !this.f52535e.equals(bVar.f52535e))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z || !z2 || !z3 || !z4) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.download.c$c */
    public static class C19413c {

        /* renamed from: a */
        private long[] f52537a;

        /* renamed from: b */
        private String[] f52538b;

        /* renamed from: c */
        private Integer f52539c;

        /* renamed from: d */
        private String f52540d = "lastmod";

        /* renamed from: e */
        private int f52541e = 2;

        /* renamed from: f */
        private boolean f52542f;

        /* renamed from: a */
        public final C19413c mo51436a(long... jArr) {
            this.f52537a = jArr;
            return this;
        }

        /* renamed from: a */
        private static String m63791a(String str, int i) {
            StringBuilder sb = new StringBuilder("status");
            sb.append(str);
            sb.append("'");
            sb.append(i);
            sb.append("'");
            return sb.toString();
        }

        /* renamed from: a */
        private static String m63792a(String str, Iterable<String> iterable) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (String str2 : iterable) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(str2);
                z = false;
            }
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Cursor mo51435a(C19422f fVar, String[] strArr, Uri uri) {
            String[] strArr2;
            String str;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f52537a != null) {
                arrayList.add(C19410c.m63777b(this.f52537a));
                arrayList2.addAll(Arrays.asList(C19410c.m63780c(this.f52537a)));
            }
            if (this.f52538b != null) {
                arrayList.add(C19410c.m63773a(this.f52538b));
                arrayList2.addAll(Arrays.asList(C19410c.m63778b(this.f52538b)));
            }
            if (this.f52539c != null) {
                ArrayList arrayList3 = new ArrayList();
                if ((this.f52539c.intValue() & 1) != 0) {
                    arrayList3.add(m63791a("=", 190));
                }
                if ((this.f52539c.intValue() & 2) != 0) {
                    arrayList3.add(m63791a("=", 192));
                }
                if ((this.f52539c.intValue() & 4) != 0) {
                    arrayList3.add(m63791a("=", 193));
                    arrayList3.add(m63791a("=", 194));
                    arrayList3.add(m63791a("=", 195));
                    arrayList3.add(m63791a("=", 196));
                }
                if ((this.f52539c.intValue() & 8) != 0) {
                    arrayList3.add(m63791a("=", (int) C34943c.f91127w));
                }
                if ((this.f52539c.intValue() & 16) != 0) {
                    StringBuilder sb = new StringBuilder("(");
                    sb.append(m63791a(">=", (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
                    sb.append(" AND ");
                    sb.append(m63791a("<", 600));
                    sb.append(")");
                    arrayList3.add(sb.toString());
                }
                arrayList.add(m63792a(" OR ", (Iterable<String>) arrayList3));
            }
            if (this.f52542f) {
                arrayList.add("is_visible_in_downloads_ui != '0'");
            }
            arrayList.add("deleted != '1'");
            String a = m63792a(" AND ", (Iterable<String>) arrayList);
            try {
                strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            } catch (ArrayStoreException unused) {
                strArr2 = null;
            }
            if (this.f52541e == 1) {
                str = "ASC";
            } else {
                str = "DESC";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f52540d);
            sb2.append(" ");
            sb2.append(str);
            try {
                return fVar.mo51451a(uri, strArr, a, strArr2, sb2.toString());
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static int m63771a(int i) {
        switch (i) {
            case 190:
                return 1;
            case 192:
                return 2;
            case 193:
            case 194:
            case 195:
            case 196:
                return 4;
            case C34943c.f91127w /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.w int)*/:
            case 201:
                return 8;
            default:
                return 16;
        }
    }

    /* renamed from: c */
    public static Long m63779c(Context context) {
        return Long.valueOf(1073741824);
    }

    /* renamed from: a */
    public final int mo51429a(long... jArr) {
        return m63781d(jArr);
    }

    /* renamed from: b */
    public static Long m63776b(Context context) {
        return Long.valueOf(2147483648L);
    }

    /* renamed from: a */
    public static synchronized C19410c m63772a(Context context) {
        C19410c cVar;
        synchronized (C19410c.class) {
            if (f52524g == null) {
                f52524g = new C19410c(context, context.getPackageName());
            }
            cVar = f52524g;
        }
        return cVar;
    }

    /* renamed from: b */
    static String[] m63778b(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = strArr[i];
        }
        return strArr2;
    }

    /* renamed from: c */
    static String[] m63780c(long[] jArr) {
        String[] strArr = new String[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            strArr[i] = Long.toString(jArr[i]);
        }
        return strArr;
    }

    /* renamed from: b */
    static String m63777b(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                sb.append("OR ");
            }
            sb.append("_id");
            sb.append(" = ? ");
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    static String m63773a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append("OR ");
            }
            sb.append("uri");
            sb.append(" = ? ");
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: d */
    private int m63781d(long... jArr) {
        if (jArr != null) {
            try {
                if (jArr.length != 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("deleted", Integer.valueOf(1));
                    if (jArr.length == 1) {
                        return this.f52527d.mo51449a(ContentUris.withAppendedId(this.f52529f, jArr[0]), contentValues, (String) null, (String[]) null);
                    }
                    return this.f52527d.mo51449a(this.f52529f, contentValues, m63777b(jArr), m63780c(jArr));
                }
            } catch (Exception unused) {
                return -1;
            }
        }
        throw new IllegalArgumentException("input param 'ids' can't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63783f(long... r6) {
        /*
            r5 = this;
            com.ss.android.download.c$c r0 = new com.ss.android.download.c$c
            r0.<init>()
            com.ss.android.download.c$c r0 = r0.mo51436a(r6)
            android.database.Cursor r0 = r5.mo51430a(r0)
            r0.moveToFirst()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
        L_0x0010:
            boolean r1 = r0.isAfterLast()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r2 = 4
            if (r1 != r2) goto L_0x0027
            r0.moveToNext()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            goto L_0x0010
        L_0x0027:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r3 = "Cann only resume a paused download: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r3 = "_id"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            long r3 = r0.getLong(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r2.append(r3)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            throw r1     // Catch:{ Exception -> 0x0052, all -> 0x004b }
        L_0x0045:
            if (r0 == 0) goto L_0x0055
        L_0x0047:
            r0.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0055
        L_0x004b:
            r6 = move-exception
            if (r0 == 0) goto L_0x0051
            r0.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            throw r6
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            goto L_0x0047
        L_0x0055:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "status"
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.lang.String r1 = "control"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.ss.android.download.f r1 = r5.f52527d
            android.net.Uri r2 = r5.f52529f
            java.lang.String r3 = m63777b(r6)
            java.lang.String[] r6 = m63780c(r6)
            r1.mo51449a(r2, r0, r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19410c.m63783f(long[]):void");
    }

    /* renamed from: e */
    private void m63782e(long... jArr) {
        Cursor a = mo51430a(new C19413c().mo51436a(jArr));
        try {
            a.moveToFirst();
            while (!a.isAfterLast()) {
                int i = a.getInt(a.getColumnIndex("status"));
                if (i != 2) {
                    if (i != 1) {
                        StringBuilder sb = new StringBuilder("Can only pause a running download: ");
                        sb.append(a.getLong(a.getColumnIndex("_id")));
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                a.moveToNext();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("control", Integer.valueOf(1));
            contentValues.put("no_integrity", Integer.valueOf(1));
            this.f52527d.mo51449a(this.f52529f, contentValues, m63777b(jArr), m63780c(jArr));
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused3) {
                }
            }
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused4) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r8 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r8.close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo51428a(long r8) {
        /*
            r7 = this;
            android.net.Uri r0 = com.p280ss.android.download.p861b.C19405c.C19406a.f52513a
            android.net.Uri r2 = android.content.ContentUris.withAppendedId(r0, r8)
            android.content.Context r8 = r7.f52525b
            com.ss.android.download.f r1 = com.p280ss.android.download.C19422f.m63833a(r8)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.mo51451a(r2, r3, r4, r5, r6)
            r9 = -1
            boolean r0 = r8.moveToFirst()     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "status"
            int r0 = com.p280ss.android.download.C19414d.m63795a(r8, r0)     // Catch:{ Exception -> 0x002f, all -> 0x0028 }
            r9 = r0
        L_0x0022:
            if (r8 == 0) goto L_0x0032
        L_0x0024:
            r8.close()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0032
        L_0x0028:
            r9 = move-exception
            if (r8 == 0) goto L_0x002e
            r8.close()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            throw r9
        L_0x002f:
            if (r8 == 0) goto L_0x0032
            goto L_0x0024
        L_0x0032:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19410c.mo51428a(long):int");
    }

    /* renamed from: a */
    public final Cursor mo51430a(C19413c cVar) {
        Cursor a = cVar.mo51435a(this.f52527d, f52523a, this.f52529f);
        if (a == null) {
            return null;
        }
        return new C19411a(a, this.f52529f);
    }

    private C19410c(Context context, String str) {
        this.f52525b = context.getApplicationContext();
        this.f52526c = context.getApplicationContext().getContentResolver();
        this.f52527d = C19422f.m63833a(this.f52525b.getApplicationContext());
        this.f52528e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63774a(int r5, long... r6) {
        /*
            r4 = this;
            com.ss.android.download.c$c r5 = new com.ss.android.download.c$c
            r5.<init>()
            com.ss.android.download.c$c r5 = r5.mo51436a(r6)
            android.database.Cursor r5 = r4.mo51430a(r5)
            r5.moveToFirst()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
        L_0x0010:
            boolean r0 = r5.isAfterLast()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "status"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            int r0 = r5.getInt(r0)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r1 = 8
            if (r0 == r1) goto L_0x0047
            r1 = 16
            if (r0 != r1) goto L_0x0029
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r2 = "Cannot restart incomplete download: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r2 = "_id"
            int r2 = r5.getColumnIndex(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            long r2 = r5.getLong(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r1.append(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            throw r0     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
        L_0x0047:
            r5.moveToNext()     // Catch:{ Exception -> 0x0058, all -> 0x0051 }
            goto L_0x0010
        L_0x004b:
            if (r5 == 0) goto L_0x005b
        L_0x004d:
            r5.close()     // Catch:{ Exception -> 0x005b }
            goto L_0x005b
        L_0x0051:
            r6 = move-exception
            if (r5 == 0) goto L_0x0057
            r5.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            throw r6
        L_0x0058:
            if (r5 == 0) goto L_0x005b
            goto L_0x004d
        L_0x005b:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r0 = "current_bytes"
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r2)
            java.lang.String r0 = "total_bytes"
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r0, r2)
            java.lang.String r0 = "_data"
            r5.putNull(r0)
            java.lang.String r0 = "status"
            r2 = 190(0xbe, float:2.66E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r0, r2)
            java.lang.String r0 = "numfailed"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
            java.lang.String r0 = "visibility"
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
            com.ss.android.download.f r0 = r4.f52527d
            android.net.Uri r1 = r4.f52529f
            java.lang.String r2 = m63777b(r6)
            java.lang.String[] r6 = m63780c(r6)
            r0.mo51449a(r1, r5, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19410c.m63774a(int, long[]):void");
    }

    /* renamed from: a */
    public static void m63775a(Context context, int i, long j) {
        if (context != null && j >= 0) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        switch (i) {
                            case 1:
                            case 2:
                                if (j >= 0) {
                                    try {
                                        m63772a(context).m63782e(j);
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                }
                                break;
                        }
                    } else if (j >= 0) {
                        m63772a(context).m63774a(1, j);
                    }
                } else if (j >= 0) {
                    C19434m.m63902a(context, j, 268435456, true);
                }
            }
            if (j >= 0) {
                m63772a(context).m63783f(j);
            }
        }
    }
}
