package com.p280ss.android.pushmanager.setting;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.p478b.C9680a;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider */
public class PushMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f54313a;

    /* renamed from: b */
    public static Uri f54314b;

    /* renamed from: c */
    private static UriMatcher f54315c;

    /* renamed from: h */
    private static C20088b f54316h;

    /* renamed from: d */
    private SharedPreferences f54317d;

    /* renamed from: e */
    private Map<String, Object> f54318e = new ConcurrentHashMap();

    /* renamed from: f */
    private volatile boolean f54319f = false;

    /* renamed from: g */
    private final Object f54320g = new Object();

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a */
    public static class C20087a {

        /* renamed from: a */
        Context f54324a;

        /* renamed from: b */
        private ContentValues f54325b;

        /* renamed from: b */
        public final synchronized void mo53733b() {
            mo53732a();
        }

        /* renamed from: a */
        public final synchronized void mo53732a() {
            try {
                this.f54324a.getContentResolver().insert(PushMultiProcessSharedProvider.m66154a(this.f54324a, "key", "type"), this.f54325b);
            } catch (Throwable unused) {
            }
        }

        private C20087a(Context context) {
            this.f54325b = new ContentValues();
            this.f54324a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C20087a mo53730a(String str, String str2) {
            this.f54325b.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C20087a mo53727a(String str, float f) {
            this.f54325b.put(str, Float.valueOf(f));
            return this;
        }

        /* renamed from: a */
        public final C20087a mo53728a(String str, int i) {
            this.f54325b.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C20087a mo53729a(String str, long j) {
            this.f54325b.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public final C20087a mo53731a(String str, boolean z) {
            this.f54325b.put(str, Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b */
    public static class C20088b {

        /* renamed from: a */
        private Context f54326a;

        /* renamed from: b */
        private boolean f54327b;

        /* renamed from: c */
        private SharedPreferences f54328c;

        /* renamed from: c */
        private static boolean m66172c() {
            C9680a.m28603a();
            if (!C9680a.m28604b()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C20087a mo53736a() {
            return new C20087a(this.f54326a);
        }

        /* renamed from: b */
        public final boolean mo53739b() {
            if (this.f54327b) {
                return m66172c();
            }
            return mo53738a("current_app_foreground", false);
        }

        private C20088b(Context context) {
            this.f54327b = C19826j.m65474c(context);
            this.f54326a = context.getApplicationContext();
            this.f54328c = C7285c.m22838a(this.f54326a.getApplicationContext(), "push_multi_process_config", 4);
        }

        /* renamed from: a */
        public final int mo53734a(String str, int i) {
            try {
                if (this.f54327b) {
                    return this.f54328c.getInt(str, i);
                }
                return PushMultiProcessSharedProvider.m66151a(this.f54326a.getContentResolver().query(PushMultiProcessSharedProvider.m66154a(this.f54326a, str, "integer"), null, null, null, null), i);
            } catch (Throwable unused) {
                return i;
            }
        }

        /* renamed from: a */
        public final long mo53735a(String str, long j) {
            try {
                if (this.f54327b) {
                    return this.f54328c.getLong(str, j);
                }
                return PushMultiProcessSharedProvider.m66152a(this.f54326a.getContentResolver().query(PushMultiProcessSharedProvider.m66154a(this.f54326a, str, "long"), null, null, null, null), j);
            } catch (Throwable unused) {
                return j;
            }
        }

        /* renamed from: a */
        public final String mo53737a(String str, String str2) {
            try {
                if (this.f54327b) {
                    return this.f54328c.getString(str, str2);
                }
                return PushMultiProcessSharedProvider.m66158a(this.f54326a.getContentResolver().query(PushMultiProcessSharedProvider.m66154a(this.f54326a, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }

        /* renamed from: a */
        public final boolean mo53738a(String str, boolean z) {
            try {
                if (this.f54327b) {
                    return this.f54328c.getBoolean(str, z);
                }
                return PushMultiProcessSharedProvider.m66159a(this.f54326a.getContentResolver().query(PushMultiProcessSharedProvider.m66154a(this.f54326a, str, "boolean"), null, null, null, null), z);
            } catch (Throwable unused) {
                return z;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != null) goto L_0x0015;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r2v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m66159a(boolean r2, boolean r3) {
        /*
            if (r2 != 0) goto L_0x0003
            return r3
        L_0x0003:
            boolean r0 = r2.moveToFirst()     // Catch:{ Throwable -> 0x0020, all -> 0x0019 }
            if (r0 == 0) goto L_0x0013
            r0 = 0
            int r1 = r2.getInt(r0)     // Catch:{ Throwable -> 0x0020, all -> 0x0019 }
            if (r1 <= 0) goto L_0x0012
            r3 = 1
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0023
        L_0x0015:
            r2.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0023
        L_0x0019:
            r3 = move-exception
            if (r2 == 0) goto L_0x001f
            r2.close()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            throw r3
        L_0x0020:
            if (r2 == 0) goto L_0x0023
            goto L_0x0015
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m66159a(android.database.Cursor, boolean):boolean");
    }

    /* renamed from: b */
    private static boolean m66161b() {
        if (!TextUtils.isEmpty(f54313a) && f54315c != null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m66162c() {
        if (!this.f54319f) {
            synchronized (this.f54320g) {
                if (!this.f54319f) {
                    m66163d();
                    this.f54319f = true;
                }
            }
        }
    }

    /* renamed from: d */
    private void m66163d() {
        SharedPreferences a = m66153a();
        if (a != null) {
            for (Entry entry : a.getAll().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!(str == null || value == null)) {
                    this.f54318e.put(str, value);
                }
            }
        }
    }

    public boolean onCreate() {
        if (!C6312h.m19578b() || C19826j.m65474c(getContext())) {
            if (f54315c == null) {
                try {
                    m66160b(getContext());
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalAccessError("should be create in main process");
    }

    /* renamed from: a */
    private synchronized SharedPreferences m66153a() {
        int i;
        if (this.f54317d == null) {
            int i2 = VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            String str = "push_multi_process_config";
            if (i2 >= 11) {
                i = 4;
            } else {
                i = 0;
            }
            this.f54317d = C7285c.m22838a(applicationContext, str, i);
            return this.f54317d;
        }
        return this.f54317d;
    }

    /* renamed from: a */
    public final void mo53718a(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    public String getType(Uri uri) {
        m66162c();
        StringBuilder sb = new StringBuilder("vnd.android.cursor.item/vnd.");
        sb.append(f54313a);
        sb.append(".item");
        return sb.toString();
    }

    /* renamed from: b */
    private static void m66160b(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(f54313a)) {
            f54313a = m66157a(context, PushMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f54313a)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f54315c = uriMatcher;
            uriMatcher.addURI(f54313a, "*/*", 65536);
            StringBuilder sb = new StringBuilder("content://");
            sb.append(f54313a);
            f54314b = Uri.parse(sb.toString());
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    public static synchronized C20088b m66155a(Context context) {
        C20088b bVar;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (f54316h == null) {
                f54316h = new C20088b(context);
            }
            bVar = f54316h;
        }
        return bVar;
    }

    /* renamed from: a */
    private Runnable m66156a(final String str, final String str2) {
        return new Runnable() {
            public final void run() {
                PushMultiProcessSharedProvider.this.mo53718a(PushMultiProcessSharedProvider.m66154a(PushMultiProcessSharedProvider.this.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f54313a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r1v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m66151a(boolean r1, int r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r2 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x001f
        L_0x0011:
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m66151a(android.database.Cursor, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r2 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r2v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m66152a(boolean r2, long r3) {
        /*
            if (r2 != 0) goto L_0x0003
            return r3
        L_0x0003:
            boolean r0 = r2.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r3 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x001f
        L_0x0011:
            r2.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r3 = move-exception
            if (r2 == 0) goto L_0x001b
            r2.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r3
        L_0x001c:
            if (r2 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m66152a(android.database.Cursor, long):long");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Object obj;
        m66162c();
        if (m66161b()) {
            return null;
        }
        if (f54315c.match(uri) == 65536) {
            try {
                ArrayList<Runnable> arrayList = new ArrayList<>();
                Editor editor = null;
                for (Entry entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String str = (String) entry.getKey();
                    boolean z = true;
                    if (value == null) {
                        this.f54318e.remove(str);
                    } else {
                        Object obj2 = this.f54318e.get(str);
                        if (obj2 != null) {
                            if (obj2.equals(value)) {
                                z = false;
                            }
                        }
                        this.f54318e.put(str, value);
                    }
                    if (z) {
                        if (C6312h.m19578b()) {
                            StringBuilder sb = new StringBuilder("MultiProcessShareProvider reallly insert key = ");
                            sb.append(str);
                            sb.append(" value = ");
                            sb.append(value);
                            String sb2 = sb.toString();
                        }
                        if (editor == null) {
                            editor = m66153a().edit();
                        }
                        if (value == null) {
                            editor.remove(str);
                            obj = null;
                        } else if (value instanceof String) {
                            editor.putString(str, (String) value);
                            obj = m66156a(str, "string");
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(str, ((Boolean) value).booleanValue());
                            obj = m66156a(str, "boolean");
                        } else if (value instanceof Long) {
                            editor.putLong(str, ((Long) value).longValue());
                            obj = m66156a(str, "long");
                        } else if (value instanceof Integer) {
                            editor.putInt(str, ((Integer) value).intValue());
                            obj = m66156a(str, "integer");
                        } else if (value instanceof Float) {
                            editor.putFloat(str, ((Float) value).floatValue());
                            obj = m66156a(str, "float");
                        } else {
                            StringBuilder sb3 = new StringBuilder("Unsupported type ");
                            sb3.append(uri);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (editor == null) {
                    return null;
                }
                if (VERSION.SDK_INT > 8) {
                    editor.apply();
                } else {
                    editor.commit();
                }
                for (Runnable run : arrayList) {
                    run.run();
                }
                return null;
            } catch (Exception unused) {
            }
        } else {
            StringBuilder sb4 = new StringBuilder("Unsupported uri ");
            sb4.append(uri);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    private static String m66157a(Context context, String str) {
        ProviderInfo[] providerInfoArr;
        if (context == null || C6319n.m19593a(str)) {
            return null;
        }
        try {
            for (ProviderInfo providerInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers) {
                if (str.equals(providerInfo.name)) {
                    return providerInfo.authority;
                }
            }
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".push.SHARE_PROVIDER_AUTHORITY");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r1v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m66158a(boolean r1, java.lang.String r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            r0 = 0
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Throwable -> 0x001c, all -> 0x0015 }
            r2 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x001f
        L_0x0011:
            r1.close()     // Catch:{ Exception -> 0x001f }
            goto L_0x001f
        L_0x0015:
            r2 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            throw r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0011
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m66158a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m66162c();
        if (m66161b() || f54315c.match(uri) == 65536) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final synchronized Uri m66154a(Context context, String str, String str2) {
        Uri build;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (f54314b == null) {
                try {
                    m66160b(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            build = f54314b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        Object obj;
        m66162c();
        if (m66161b()) {
            return null;
        }
        if (f54315c.match(uri) == 65536) {
            try {
                if ("all".equals((String) uri.getPathSegments().get(1))) {
                    Map all = m66153a().getAll();
                    matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Entry entry : all.entrySet()) {
                            String str3 = (String) entry.getKey();
                            Object value = entry.getValue();
                            RowBuilder newRow = matrixCursor.newRow();
                            String str4 = "string";
                            if (value instanceof String) {
                                str4 = "string";
                            } else if (value instanceof Boolean) {
                                str4 = "boolean";
                                value = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
                            } else if (value instanceof Integer) {
                                str4 = "integer";
                            } else if (value instanceof Long) {
                                str4 = "long";
                            } else if (value instanceof Float) {
                                str4 = "float";
                            }
                            newRow.add(str3);
                            newRow.add(value);
                            newRow.add(str4);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    String str5 = (String) uri.getPathSegments().get(0);
                    boolean a = C6319n.m19594a(str5, "current_app_state");
                    boolean a2 = C6319n.m19594a(str5, "current_app_foreground");
                    if (!this.f54318e.containsKey(str5) && !a && !a2) {
                        return null;
                    }
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str5});
                    if (a) {
                        try {
                            obj = Boolean.valueOf(C9680a.m28603a().f26418a);
                        } catch (Exception unused2) {
                        }
                    } else if (a2) {
                        C9680a.m28603a();
                        obj = Boolean.valueOf(!C9680a.m28604b());
                    } else {
                        obj = this.f54318e.get(str5);
                    }
                    RowBuilder newRow2 = matrixCursor2.newRow();
                    if (obj instanceof Boolean) {
                        obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                    }
                    newRow2.add(obj);
                    matrixCursor = matrixCursor2;
                }
            } catch (Exception unused3) {
                matrixCursor = null;
            }
            return matrixCursor;
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }
}
