package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Build.VERSION;
import android.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.bytedance.keva.Keva.OnChangeListener;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KevaSpAdapter implements SharedPreferences {
    private static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = _lancet.m35247x6416be54();
    private final Map<OnSharedPreferenceChangeListener, OnChangeListener> mChangeListenerMap = obtainMap();
    public Keva mKeva;
    public SharedPreferences mSp;

    public class Editor implements android.content.SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = KevaSpAdapter.obtainMap();

        public synchronized void apply() {
            commit();
        }

        public synchronized android.content.SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        public synchronized boolean commit() {
            final Map<String, Object> map = this.mTempMap;
            final boolean z = this.mClear;
            if (KevaSpAdapter.this.mSp != null) {
                KevaSpAdapter.sWriterExecutor.execute(new Runnable() {
                    public void run() {
                        Editor.this.doWriteSp(map, z);
                    }
                });
            }
            doWriteKeva(map, z);
            this.mTempMap = KevaSpAdapter.obtainMap();
            if (this.mClear) {
                this.mClear = false;
            }
            return true;
        }

        public Editor() {
        }

        public synchronized android.content.SharedPreferences.Editor remove(String str) {
            this.mTempMap.put(str, this);
            return this;
        }

        public synchronized android.content.SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.mTempMap.put(str, Boolean.valueOf(z));
            return this;
        }

        public synchronized android.content.SharedPreferences.Editor putFloat(String str, float f) {
            this.mTempMap.put(str, Float.valueOf(f));
            return this;
        }

        public synchronized android.content.SharedPreferences.Editor putInt(String str, int i) {
            this.mTempMap.put(str, Integer.valueOf(i));
            return this;
        }

        public synchronized android.content.SharedPreferences.Editor putLong(String str, long j) {
            this.mTempMap.put(str, Long.valueOf(j));
            return this;
        }

        public synchronized android.content.SharedPreferences.Editor putString(String str, String str2) {
            this.mTempMap.put(str, str2);
            return this;
        }

        public synchronized android.content.SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.mTempMap.put(str, set);
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpAdapter.this.mKeva.clear();
            }
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        KevaSpAdapter.this.mKeva.storeInt(str, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        KevaSpAdapter.this.mKeva.storeBoolean(str, ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        KevaSpAdapter.this.mKeva.storeString(str, (String) value);
                    } else if (value instanceof Long) {
                        KevaSpAdapter.this.mKeva.storeLong(str, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        KevaSpAdapter.this.mKeva.storeFloat(str, ((Float) value).floatValue());
                    } else if (value instanceof Set) {
                        KevaSpAdapter.this.mKeva.storeStringSet(str, (Set) value);
                    }
                }
                KevaSpAdapter.this.mKeva.erase(str);
            }
        }

        public void doWriteSp(Map<String, Object> map, boolean z) {
            android.content.SharedPreferences.Editor edit = KevaSpAdapter.this.mSp.edit();
            if (z) {
                edit.clear();
            }
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    edit.remove(str);
                } else if (value instanceof Integer) {
                    edit.putInt(str, ((Integer) value).intValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    edit.putString(str, (String) value);
                } else if (value instanceof Long) {
                    edit.putLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(str, ((Float) value).floatValue());
                } else if (value instanceof Set) {
                    edit.putStringSet(str, (Set) value);
                } else {
                    edit.remove(str);
                }
            }
            edit.commit();
        }
    }

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor */
        static ExecutorService m35247x6416be54() {
            return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
        }
    }

    public android.content.SharedPreferences.Editor edit() {
        return new Editor();
    }

    public static Map obtainMap() {
        if (VERSION.SDK_INT >= 19) {
            return new ArrayMap();
        }
        return new HashMap();
    }

    public synchronized Map<String, ?> getAll() {
        HashMap hashMap;
        hashMap = new HashMap();
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

    private KevaSpAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public synchronized boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    public synchronized void registerOnSharedPreferenceChangeListener(final OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        C120861 r0 = new OnChangeListener() {
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r0);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r0);
    }

    public synchronized void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener((OnChangeListener) this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    public synchronized float getFloat(String str, float f) {
        return this.mKeva.getFloat(str, f);
    }

    public synchronized int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    public synchronized long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    public synchronized String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    public synchronized Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpAdapter getSharedPreferences(Context context, String str, int i, boolean z) {
        int i2;
        if (i == 4) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        KevaSpAdapter kevaSpAdapter = new KevaSpAdapter(Keva.getRepoFromSp(context, str, i2));
        if (z) {
            kevaSpAdapter.mSp = context.getSharedPreferences(str, i);
        }
        return kevaSpAdapter;
    }
}
