package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.support.p022v4.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.bytedance.keva.Keva.OnChangeListener;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KevaSpFastAdapter implements SharedPreferences {
    private static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = _lancet.m20124x6416be54();
    private File mBackupFile;
    private final Map<OnSharedPreferenceChangeListener, OnChangeListener> mChangeListenerMap = new ArrayMap();
    public File mFile;
    public Keva mKeva;

    public class Editor implements android.content.SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = new ArrayMap();

        public void apply() {
            commit();
        }

        public android.content.SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        public boolean commit() {
            doWriteKeva(this.mTempMap, this.mClear);
            if (KevaSpFastAdapter.this.mFile != null) {
                KevaSpFastAdapter.sWriterExecutor.execute(new Runnable() {
                    public void run() {
                        KevaSpFastAdapter.this.doWriteSp(KevaSpFastAdapter.this.getAll());
                    }
                });
            }
            this.mTempMap = new ArrayMap();
            if (this.mClear) {
                this.mClear = false;
            }
            return true;
        }

        public Editor() {
        }

        public android.content.SharedPreferences.Editor remove(String str) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, this);
            }
            return this;
        }

        public android.content.SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, str2);
            }
            return this;
        }

        public android.content.SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, set);
            }
            return this;
        }

        public android.content.SharedPreferences.Editor putBoolean(String str, boolean z) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public android.content.SharedPreferences.Editor putFloat(String str, float f) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Float.valueOf(f));
            }
            return this;
        }

        public android.content.SharedPreferences.Editor putInt(String str, int i) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public android.content.SharedPreferences.Editor putLong(String str, long j) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Long.valueOf(j));
            }
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpFastAdapter.this.mKeva.clear();
            }
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        KevaSpFastAdapter.this.mKeva.erase(str);
                    }
                    if (value instanceof Integer) {
                        KevaSpFastAdapter.this.mKeva.storeInt(str, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        KevaSpFastAdapter.this.mKeva.storeBoolean(str, ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        KevaSpFastAdapter.this.mKeva.storeString(str, (String) value);
                    } else if (value instanceof Long) {
                        KevaSpFastAdapter.this.mKeva.storeLong(str, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        KevaSpFastAdapter.this.mKeva.storeFloat(str, ((Float) value).floatValue());
                    } else if (value instanceof Set) {
                        KevaSpFastAdapter.this.mKeva.storeStringSet(str, (Set) value);
                    } else {
                        KevaSpFastAdapter.this.mKeva.erase(str);
                    }
                }
            }
        }
    }

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor */
        static ExecutorService m20124x6416be54() {
            return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
        }
    }

    public android.content.SharedPreferences.Editor edit() {
        return new Editor();
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.mKeva.getAll().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String[]) {
                value = new HashSet(Arrays.asList((String[]) value));
            }
            hashMap.put(str, value);
        }
        return hashMap;
    }

    public boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    private KevaSpFastAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public void registerOnSharedPreferenceChangeListener(final OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        C64411 r0 = new OnChangeListener() {
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpFastAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r0);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r0);
    }

    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener((OnChangeListener) this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    private static FileOutputStream createFileOutputStream(File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
                fileOutputStream = null;
            }
        }
        return fileOutputStream;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doWriteSp(java.util.Map<java.lang.String, ?> r6) {
        /*
            r5 = this;
            java.io.File r0 = r5.mBackupFile
            boolean r0 = r0.exists()
            java.io.File r1 = r5.mFile
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x001d
            if (r0 != 0) goto L_0x0018
            java.io.File r0 = r5.mFile
            java.io.File r1 = r5.mBackupFile
            r0.renameTo(r1)
            goto L_0x001d
        L_0x0018:
            java.io.File r0 = r5.mFile
            r0.delete()
        L_0x001d:
            java.io.File r0 = r5.mFile
            java.io.FileOutputStream r0 = createFileOutputStream(r0)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            com.bytedance.keva.adapter.xml.XmlUtils.writeMapXml(r6, r0)     // Catch:{ IOException -> 0x006d, XmlPullParserException -> 0x0063, Exception -> 0x003c }
            java.io.FileDescriptor r1 = r0.getFD()     // Catch:{ IOException -> 0x006d, XmlPullParserException -> 0x0063, Exception -> 0x003c }
            r1.sync()     // Catch:{ IOException -> 0x006d, XmlPullParserException -> 0x0063, Exception -> 0x003c }
            java.io.File r1 = r5.mBackupFile     // Catch:{ IOException -> 0x006d, XmlPullParserException -> 0x0063, Exception -> 0x003c }
            r1.delete()     // Catch:{ IOException -> 0x006d, XmlPullParserException -> 0x0063, Exception -> 0x003c }
            r0.close()     // Catch:{ IOException -> 0x0039 }
            return
        L_0x0039:
            return
        L_0x003a:
            r6 = move-exception
            goto L_0x0077
        L_0x003c:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "fail to write "
            r3.<init>(r4)     // Catch:{ all -> 0x003a }
            java.io.File r4 = r5.mFile     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x003a }
            r3.append(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = ", dump: "
            r3.append(r4)     // Catch:{ all -> 0x003a }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x003a }
            r3.append(r6)     // Catch:{ all -> 0x003a }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x003a }
            r2.<init>(r6, r1)     // Catch:{ all -> 0x003a }
            throw r2     // Catch:{ all -> 0x003a }
        L_0x0063:
            java.io.File r6 = r5.mFile     // Catch:{ all -> 0x003a }
            r6.delete()     // Catch:{ all -> 0x003a }
            r0.close()     // Catch:{ IOException -> 0x006c }
            return
        L_0x006c:
            return
        L_0x006d:
            java.io.File r6 = r5.mFile     // Catch:{ all -> 0x003a }
            r6.delete()     // Catch:{ all -> 0x003a }
            r0.close()     // Catch:{ IOException -> 0x0076 }
            return
        L_0x0076:
            return
        L_0x0077:
            r0.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.adapter.KevaSpFastAdapter.doWriteSp(java.util.Map):void");
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    public float getFloat(String str, float f) {
        return this.mKeva.getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    public String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpFastAdapter getSharedPreferences(Context context, String str, int i, boolean z) {
        int i2;
        if (i == 4) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        KevaSpFastAdapter kevaSpFastAdapter = new KevaSpFastAdapter(Keva.getRepoFromSp(context, str, i2));
        if (z) {
            File filesDir = context.getFilesDir();
            if (!filesDir.exists()) {
                filesDir.mkdirs();
            }
            String parent = filesDir.getParent();
            StringBuilder sb = new StringBuilder("shared_prefs/");
            sb.append(str);
            sb.append(".xml");
            kevaSpFastAdapter.mFile = new File(parent, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kevaSpFastAdapter.mFile.getPath());
            sb2.append(".bak");
            kevaSpFastAdapter.mBackupFile = new File(sb2.toString());
        }
        return kevaSpFastAdapter;
    }
}
