package com.p280ss.android.common.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
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
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.base.C11008b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.common.util.MultiProcessSharedProvider */
public class MultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f52182a;

    /* renamed from: b */
    public static Uri f52183b;

    /* renamed from: c */
    private static UriMatcher f52184c;

    /* renamed from: f */
    private static C19286b f52185f;

    /* renamed from: d */
    private SharedPreferences f52186d;

    /* renamed from: e */
    private Map<String, Object> f52187e;

    /* renamed from: com.ss.android.common.util.MultiProcessSharedProvider$a */
    public static class C19285a {

        /* renamed from: a */
        Context f52188a;

        /* renamed from: b */
        private ContentValues f52189b;

        /* renamed from: b */
        private synchronized void m63196b() {
            try {
                this.f52188a.getContentResolver().insert(MultiProcessSharedProvider.m63188a(this.f52188a, "key", "type"), this.f52189b);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public final synchronized void mo51180a() {
            m63196b();
        }

        private C19285a(Context context) {
            this.f52189b = new ContentValues();
            this.f52188a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C19285a mo51178a(String str, String str2) {
            this.f52189b.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C19285a mo51175a(String str, float f) {
            this.f52189b.put(str, Float.valueOf(f));
            return this;
        }

        /* renamed from: a */
        public final C19285a mo51176a(String str, int i) {
            this.f52189b.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C19285a mo51177a(String str, long j) {
            this.f52189b.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public final C19285a mo51179a(String str, boolean z) {
            this.f52189b.put(str, Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: com.ss.android.common.util.MultiProcessSharedProvider$b */
    public static class C19286b {

        /* renamed from: a */
        private Context f52190a;

        /* renamed from: a */
        public final C19285a mo51182a() {
            return new C19285a(this.f52190a);
        }

        private C19286b(Context context) {
            this.f52190a = context.getApplicationContext();
        }

        /* renamed from: a */
        public final int mo51181a(String str, int i) {
            try {
                return MultiProcessSharedProvider.m63186a(this.f52190a.getContentResolver().query(MultiProcessSharedProvider.m63188a(this.f52190a, str, "integer"), null, null, null, null), i);
            } catch (Throwable unused) {
                return i;
            }
        }

        /* renamed from: a */
        public final String mo51183a(String str, String str2) {
            try {
                return MultiProcessSharedProvider.m63191a(this.f52190a.getContentResolver().query(MultiProcessSharedProvider.m63188a(this.f52190a, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }
    }

    /* renamed from: a */
    private synchronized SharedPreferences m63187a() {
        int i;
        if (this.f52186d == null) {
            int i2 = VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            String str = "multi_process_config";
            if (i2 >= 11) {
                i = 4;
            } else {
                i = 0;
            }
            this.f52186d = C7285c.m22838a(applicationContext, str, i);
            return this.f52186d;
        }
        return this.f52186d;
    }

    /* renamed from: b */
    private synchronized void m63194b() {
        if (this.f52187e == null) {
            this.f52187e = new ConcurrentHashMap();
            SharedPreferences a = m63187a();
            if (a != null) {
                for (Entry entry : a.getAll().entrySet()) {
                    this.f52187e.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public boolean onCreate() {
        if (f52184c == null) {
            try {
                m63195c(getContext());
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            if (C11008b.m32267a() != null) {
                getContext();
            } else {
                getContext().startService(new Intent(getContext(), Class.forName("com.ss.android.newmedia.message.MessageHandler")));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    /* renamed from: a */
    public static C19285a m63189a(Context context) {
        return new C19285a(context);
    }

    /* renamed from: a */
    private void m63192a(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    /* renamed from: b */
    public static synchronized C19286b m63193b(Context context) {
        C19286b bVar;
        synchronized (MultiProcessSharedProvider.class) {
            if (f52185f == null) {
                f52185f = new C19286b(context);
            }
            bVar = f52185f;
        }
        return bVar;
    }

    public String getType(Uri uri) {
        StringBuilder sb = new StringBuilder("vnd.android.cursor.item/vnd.");
        sb.append(f52182a);
        sb.append(".item");
        return sb.toString();
    }

    /* renamed from: c */
    private static void m63195c(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(f52182a)) {
            String a = m63190a(context, MultiProcessSharedProvider.class.getName());
            f52182a = a;
            if (TextUtils.isEmpty(a)) {
                throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
            }
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        f52184c = uriMatcher;
        uriMatcher.addURI(f52182a, "*/*", 65536);
        StringBuilder sb = new StringBuilder("content://");
        sb.append(f52182a);
        f52183b = Uri.parse(sb.toString());
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        f52182a = providerInfo.authority;
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
    public static int m63186a(boolean r1, int r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.MultiProcessSharedProvider.m63186a(android.database.Cursor, int):int");
    }

    /* renamed from: a */
    private static String m63190a(Context context, String str) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r1v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m63191a(boolean r1, java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.util.MultiProcessSharedProvider.m63191a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        if (f52184c.match(uri) == 65536) {
            try {
                m63194b();
                Editor editor = null;
                for (Entry entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String str = (String) entry.getKey();
                    boolean z = true;
                    if (value == null) {
                        this.f52187e.remove(str);
                    } else {
                        Object obj = this.f52187e.get(str);
                        if (obj != null) {
                            if (obj.equals(value)) {
                                z = false;
                            }
                        }
                        this.f52187e.put(str, value);
                    }
                    if (z) {
                        if (editor == null) {
                            editor = m63187a().edit();
                        }
                        if (value == null) {
                            editor.remove(str);
                        } else if (value instanceof String) {
                            editor.putString(str, (String) value);
                            m63192a(m63188a(getContext(), str, "string"));
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(str, ((Boolean) value).booleanValue());
                            m63192a(m63188a(getContext(), str, "boolean"));
                        } else if (value instanceof Long) {
                            editor.putLong(str, ((Long) value).longValue());
                            m63192a(m63188a(getContext(), str, "long"));
                        } else if (value instanceof Integer) {
                            editor.putInt(str, ((Integer) value).intValue());
                            m63192a(m63188a(getContext(), str, "integer"));
                        } else if (value instanceof Float) {
                            editor.putFloat(str, ((Float) value).floatValue());
                            m63192a(m63188a(getContext(), str, "float"));
                        } else {
                            StringBuilder sb = new StringBuilder("Unsupported type ");
                            sb.append(uri);
                            throw new IllegalArgumentException(sb.toString());
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
                return null;
            } catch (Exception unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Unsupported uri ");
            sb2.append(uri);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public static final synchronized Uri m63188a(Context context, String str, String str2) {
        Uri build;
        synchronized (MultiProcessSharedProvider.class) {
            if (f52183b == null) {
                try {
                    m63195c(context);
                } catch (Exception unused) {
                    return null;
                }
            }
            build = f52183b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f52184c.match(uri) == 65536) {
            try {
                m63194b();
                m63187a().edit().clear().commit();
                this.f52187e.clear();
                m63192a(m63188a(getContext(), "key", "type"));
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
        if (f52184c.match(uri) == 65536) {
            try {
                m63194b();
                if ("all".equals((String) uri.getPathSegments().get(1))) {
                    Map all = m63187a().getAll();
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
                if (!this.f52187e.containsKey(str5)) {
                    return null;
                }
                matrixCursor = new MatrixCursor(new String[]{str5});
                Object obj = this.f52187e.get(str5);
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
