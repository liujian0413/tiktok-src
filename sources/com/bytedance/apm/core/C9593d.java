package com.bytedance.apm.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.bytedance.apm.core.d */
public final class C9593d implements SharedPreferences {

    /* renamed from: d */
    private static int f26211d = -1;

    /* renamed from: a */
    public Application f26212a;

    /* renamed from: b */
    public String f26213b;

    /* renamed from: c */
    public Uri f26214c = Uri.parse(this.f26213b);

    /* renamed from: com.bytedance.apm.core.d$a */
    class C9595a implements Editor {

        /* renamed from: b */
        private boolean f26216b;

        /* renamed from: c */
        private HashMap<String, Object> f26217c;

        public final boolean commit() {
            apply();
            return true;
        }

        public final Editor clear() {
            this.f26217c.clear();
            this.f26216b = true;
            return this;
        }

        public final void apply() {
            if (this.f26216b || !this.f26217c.isEmpty()) {
                Bundle bundle = new Bundle();
                if (this.f26216b) {
                    bundle.putBoolean("clear", true);
                }
                ArrayList arrayList = new ArrayList(this.f26217c.size());
                for (Entry entry : this.f26217c.entrySet()) {
                    arrayList.add(new SpPair((String) entry.getKey(), entry.getValue()));
                }
                bundle.putParcelableArrayList("edit", arrayList);
                try {
                    C9593d.this.f26212a.getContentResolver().call(C9593d.this.f26214c, C9593d.this.f26213b, "edit", bundle);
                } catch (Exception unused) {
                }
            }
        }

        public final Editor remove(String str) {
            this.f26217c.put(str, null);
            return this;
        }

        private C9595a() {
            this.f26217c = new HashMap<>();
        }

        public final Editor putString(String str, String str2) {
            this.f26217c.put(str, str2);
            return this;
        }

        public final Editor putBoolean(String str, boolean z) {
            this.f26217c.put(str, Boolean.valueOf(z));
            return this;
        }

        public final Editor putFloat(String str, float f) {
            this.f26217c.put(str, Float.valueOf(f));
            return this;
        }

        public final Editor putInt(String str, int i) {
            this.f26217c.put(str, Integer.valueOf(i));
            return this;
        }

        public final Editor putLong(String str, long j) {
            this.f26217c.put(str, Long.valueOf(j));
            return this;
        }

        public final Editor putStringSet(String str, Set<String> set) {
            this.f26217c.put(str, C6292i.m19526a(set));
            return this;
        }
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final Editor edit() {
        return new C9595a();
    }

    public final Map<String, ?> getAll() {
        ArrayList a = m28390a((String) null, (Object) null);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            SpPair spPair = (SpPair) it.next();
            hashMap.put(spPair.f26209a, spPair.f26210b);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static int m28388a(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(context.getPackageName());
            sb.append(".apm");
            Bundle call = contentResolver.call(Uri.parse(sb.toString()), "getPid", null, null);
            if (call != null) {
                return call.getInt("Pid", -1);
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* renamed from: b */
    private static boolean m28392b(Context context) {
        if (f26211d == -1) {
            f26211d = m28388a(context);
        }
        if (f26211d == Process.myPid()) {
            return true;
        }
        return false;
    }

    public final boolean contains(String str) {
        Bundle bundle;
        String str2;
        try {
            ContentResolver contentResolver = this.f26212a.getContentResolver();
            Uri uri = this.f26214c;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f26213b);
                sb.append("/");
                sb.append(str);
                str2 = sb.toString();
            } else {
                str2 = this.f26213b;
            }
            bundle = contentResolver.call(uri, str2, "contains", null);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null || !bundle.getBoolean("contains")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static SharedPreferences m28389a(Context context, String str) {
        if (m28392b(context)) {
            return C7285c.m22838a(context, str, 0);
        }
        return m28391b(context, str);
    }

    /* renamed from: b */
    private static SharedPreferences m28391b(Context context, String str) {
        Application application;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            application = (Application) context.getApplicationContext();
        }
        return new C9593d(application, str);
    }

    public final String getString(String str, String str2) {
        ArrayList a = m28390a(str, (Object) str2);
        if (a == null) {
            return null;
        }
        return (String) ((SpPair) a.get(0)).f26210b;
    }

    private C9593d(Application application, String str) {
        this.f26212a = application;
        StringBuilder sb = new StringBuilder("content://");
        sb.append(application.getPackageName());
        sb.append(".apm/sp/");
        sb.append(str);
        this.f26213b = sb.toString();
    }

    public final boolean getBoolean(String str, boolean z) {
        ArrayList a = m28390a(str, (Object) String.valueOf(z));
        if (a == null) {
            return z;
        }
        Object obj = ((SpPair) a.get(0)).f26210b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public final float getFloat(String str, float f) {
        ArrayList a = m28390a(str, (Object) String.valueOf(f));
        if (a == null) {
            return f;
        }
        Object obj = ((SpPair) a.get(0)).f26210b;
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof String) {
            return Float.valueOf((String) obj).floatValue();
        }
        return f;
    }

    public final int getInt(String str, int i) {
        ArrayList a = m28390a(str, (Object) String.valueOf(i));
        if (a == null) {
            return i;
        }
        Object obj = ((SpPair) a.get(0)).f26210b;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.decode((String) obj).intValue();
        }
        return i;
    }

    public final long getLong(String str, long j) {
        ArrayList a = m28390a(str, (Object) String.valueOf(j));
        if (a == null) {
            return j;
        }
        Object obj = ((SpPair) a.get(0)).f26210b;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.decode((String) obj).longValue();
        }
        return j;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        ArrayList a = m28390a(str, (Object) set);
        if (a == null || ((SpPair) a.get(0)).f26210b == null) {
            return null;
        }
        String[] strArr = (String[]) ((SpPair) a.get(0)).f26210b;
        HashSet hashSet = new HashSet(strArr.length);
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    /* renamed from: a */
    private ArrayList<SpPair> m28390a(String str, Object obj) {
        Bundle bundle;
        String str2;
        Bundle bundle2 = new Bundle();
        if (obj != null) {
            bundle2.putParcelable("sp", new SpPair(str, obj));
        }
        try {
            ContentResolver contentResolver = this.f26212a.getContentResolver();
            Uri uri = this.f26214c;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f26213b);
                sb.append("/");
                sb.append(str);
                str2 = sb.toString();
            } else {
                str2 = this.f26213b;
            }
            String str3 = "query";
            if (obj == null) {
                bundle2 = null;
            }
            bundle = contentResolver.call(uri, str2, str3, bundle2);
        } catch (Exception unused) {
            bundle = null;
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        return bundle.getParcelableArrayList("sp");
    }
}
