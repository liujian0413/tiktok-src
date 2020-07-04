package com.bytedance.common.wschannel;

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
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.wschannel.p485c.C9762a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class WsChannelMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f26491a;

    /* renamed from: b */
    public static Uri f26492b;

    /* renamed from: c */
    public static boolean f26493c;

    /* renamed from: d */
    private static UriMatcher f26494d;

    /* renamed from: g */
    private static volatile boolean f26495g;

    /* renamed from: i */
    private static C9746b f26496i;

    /* renamed from: e */
    private SharedPreferences f26497e;

    /* renamed from: f */
    private Map<String, Object> f26498f = new ConcurrentHashMap();

    /* renamed from: h */
    private final Object f26499h = new Object();

    /* renamed from: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider$a */
    public static class C9745a {

        /* renamed from: a */
        Context f26503a;

        /* renamed from: b */
        private ContentValues f26504b;

        /* renamed from: a */
        public final synchronized void mo24124a() {
            m28735b();
        }

        /* renamed from: b */
        private synchronized void m28735b() {
            try {
                this.f26503a.getContentResolver().insert(WsChannelMultiProcessSharedProvider.m28726a(this.f26503a, "key", "type"), this.f26504b);
            } catch (Throwable unused) {
            }
        }

        private C9745a(Context context) {
            this.f26504b = new ContentValues();
            this.f26503a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C9745a mo24123a(String str, String str2) {
            this.f26504b.put(str, str2);
            return this;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider$b */
    public static class C9746b {

        /* renamed from: a */
        private Context f26505a;

        /* renamed from: b */
        private boolean f26506b;

        /* renamed from: c */
        private SharedPreferences f26507c;

        /* renamed from: a */
        public final C9745a mo24126a() {
            return new C9745a(this.f26505a);
        }

        private C9746b(Context context) {
            boolean z;
            if (!C9762a.m28790a(context) || !WsChannelMultiProcessSharedProvider.f26493c) {
                z = false;
            } else {
                z = true;
            }
            this.f26506b = z;
            this.f26505a = context.getApplicationContext();
            this.f26507c = C7285c.m22838a(this.f26505a.getApplicationContext(), "wschannel_multi_process_config", 4);
        }

        /* renamed from: a */
        public final long mo24125a(String str, long j) {
            try {
                if (this.f26506b) {
                    return this.f26507c.getLong(str, j);
                }
                return WsChannelMultiProcessSharedProvider.m28724a(this.f26505a.getContentResolver().query(WsChannelMultiProcessSharedProvider.m28726a(this.f26505a, str, "long"), null, null, null, null), j);
            } catch (Throwable unused) {
                return j;
            }
        }

        /* renamed from: a */
        public final String mo24127a(String str, String str2) {
            try {
                if (this.f26506b) {
                    return this.f26507c.getString(str, str2);
                }
                return WsChannelMultiProcessSharedProvider.m28730a(this.f26505a.getContentResolver().query(WsChannelMultiProcessSharedProvider.m28726a(this.f26505a, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }

        /* renamed from: a */
        public final boolean mo24128a(String str, boolean z) {
            try {
                if (this.f26506b) {
                    return this.f26507c.getBoolean(str, z);
                }
                return WsChannelMultiProcessSharedProvider.m28731a(this.f26505a.getContentResolver().query(WsChannelMultiProcessSharedProvider.m28726a(this.f26505a, str, "boolean"), null, null, null, null), z);
            } catch (Throwable unused) {
                return z;
            }
        }
    }

    public boolean onCreate() {
        if (C9762a.m28790a(getContext())) {
            f26493c = true;
        }
        if (f26494d == null) {
            try {
                m28733b(getContext());
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private synchronized SharedPreferences m28725a() {
        int i;
        if (this.f26497e == null) {
            int i2 = VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            String str = "wschannel_multi_process_config";
            if (i2 >= 11) {
                i = 4;
            } else {
                i = 0;
            }
            this.f26497e = C7285c.m22838a(applicationContext, str, i);
            return this.f26497e;
        }
        return this.f26497e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28732b() {
        /*
            r6 = this;
            boolean r0 = f26495g
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = r6.f26499h
            monitor-enter(r0)
            boolean r1 = f26495g     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            android.content.SharedPreferences r1 = r6.m28725a()     // Catch:{ all -> 0x0042 }
            r2 = 1
            if (r1 != 0) goto L_0x0016
            f26495g = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0016:
            java.util.Map r1 = r1.getAll()     // Catch:{ all -> 0x0042 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0042 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0042 }
        L_0x0022:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0042 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0042 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r6.f26498f     // Catch:{ all -> 0x0042 }
            r5.put(r4, r3)     // Catch:{ all -> 0x0042 }
            goto L_0x0022
        L_0x003e:
            f26495g = r2     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r1
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.m28732b():void");
    }

    /* renamed from: a */
    public final void mo24114a(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    public String getType(Uri uri) {
        StringBuilder sb = new StringBuilder("vnd.android.cursor.item/vnd.");
        sb.append(f26491a);
        sb.append(".item");
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized C9746b m28727a(Context context) {
        C9746b bVar;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (f26496i == null) {
                f26496i = new C9746b(context);
            }
            bVar = f26496i;
        }
        return bVar;
    }

    /* renamed from: b */
    private static void m28733b(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(f26491a)) {
            f26491a = m28729a(context, WsChannelMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f26491a)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f26494d = uriMatcher;
            uriMatcher.addURI(f26491a, "*/*", 65536);
            StringBuilder sb = new StringBuilder("content://");
            sb.append(f26491a);
            f26492b = Uri.parse(sb.toString());
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    private Runnable m28728a(final String str, final String str2) {
        return new Runnable() {
            public final void run() {
                WsChannelMultiProcessSharedProvider.this.mo24114a(WsChannelMultiProcessSharedProvider.m28726a(WsChannelMultiProcessSharedProvider.this.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f26491a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
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
    public static long m28724a(boolean r2, long r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.m28724a(android.database.Cursor, long):long");
    }

    /* renamed from: a */
    private static String m28729a(Context context, String str) {
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
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Object obj;
        if (f26494d.match(uri) == 65536) {
            try {
                m28732b();
                ArrayList<Runnable> arrayList = new ArrayList<>();
                Editor editor = null;
                for (Entry entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String str = (String) entry.getKey();
                    boolean z = true;
                    if (value == null) {
                        this.f26498f.remove(str);
                    } else {
                        Object obj2 = this.f26498f.get(str);
                        if (obj2 != null) {
                            if (obj2.equals(value)) {
                                z = false;
                            }
                        }
                        this.f26498f.put(str, value);
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
                            editor = m28725a().edit();
                        }
                        if (value == null) {
                            editor.remove(str);
                            obj = null;
                        } else if (value instanceof String) {
                            editor.putString(str, (String) value);
                            obj = m28728a(str, "string");
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(str, ((Boolean) value).booleanValue());
                            obj = m28728a(str, "boolean");
                        } else if (value instanceof Long) {
                            editor.putLong(str, ((Long) value).longValue());
                            obj = m28728a(str, "long");
                        } else if (value instanceof Integer) {
                            editor.putInt(str, ((Integer) value).intValue());
                            obj = m28728a(str, "integer");
                        } else if (value instanceof Float) {
                            editor.putFloat(str, ((Float) value).floatValue());
                            obj = m28728a(str, "float");
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r1v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m28730a(boolean r1, java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.m28730a(android.database.Cursor, java.lang.String):java.lang.String");
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
    public static boolean m28731a(boolean r2, boolean r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.m28731a(android.database.Cursor, boolean):boolean");
    }

    /* renamed from: a */
    public static final synchronized Uri m28726a(Context context, String str, String str2) {
        Uri build;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (f26492b == null) {
                try {
                    m28733b(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            build = f26492b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f26494d.match(uri) == 65536) {
            try {
                m28725a().edit().clear().commit();
                this.f26498f.clear();
                mo24114a(m28726a(getContext(), "key", "type"));
            } catch (Exception unused) {
            }
            return 0;
        }
        StringBuilder sb = new StringBuilder("Unsupported uri ");
        sb.append(uri);
        throw new IllegalArgumentException(sb.toString());
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        if (f26494d.match(uri) == 65536) {
            try {
                if ("all".equals((String) uri.getPathSegments().get(1))) {
                    Map all = m28725a().getAll();
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
                    return matrixCursor;
                }
                String str5 = (String) uri.getPathSegments().get(0);
                m28732b();
                if (!this.f26498f.containsKey(str5)) {
                    return null;
                }
                matrixCursor = new MatrixCursor(new String[]{str5});
                Object obj = this.f26498f.get(str5);
                RowBuilder newRow2 = matrixCursor.newRow();
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                newRow2.add(obj);
                return matrixCursor;
            } catch (Exception unused2) {
                matrixCursor = null;
            }
        } else {
            StringBuilder sb = new StringBuilder("Unsupported uri ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
