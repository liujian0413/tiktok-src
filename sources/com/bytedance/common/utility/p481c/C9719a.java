package com.bytedance.common.utility.p481c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.common.utility.c.a */
public final class C9719a implements SharedPreferences {

    /* renamed from: a */
    private SharedPreferences f26461a;

    /* renamed from: com.bytedance.common.utility.c.a$a */
    public static class C9720a implements Editor {

        /* renamed from: a */
        private Editor f26462a;

        public final void apply() {
            this.f26462a.apply();
        }

        public final Editor clear() {
            this.f26462a.clear();
            return this;
        }

        public final boolean commit() {
            return this.f26462a.commit();
        }

        public C9720a(Editor editor) {
            this.f26462a = editor;
        }

        public final Editor remove(String str) {
            this.f26462a.remove(str);
            return this;
        }

        public final Editor putBoolean(String str, boolean z) {
            this.f26462a.putBoolean(str, z);
            return this;
        }

        public final Editor putFloat(String str, float f) {
            this.f26462a.putFloat(str, f);
            return this;
        }

        public final Editor putInt(String str, int i) {
            this.f26462a.putInt(str, i);
            return this;
        }

        public final Editor putLong(String str, long j) {
            this.f26462a.putLong(str, j);
            return this;
        }

        public final Editor putString(String str, String str2) {
            this.f26462a.putString(str, str2);
            return this;
        }

        public final Editor putStringSet(String str, Set<String> set) {
            this.f26462a.putStringSet(str, set);
            return this;
        }
    }

    public final Map<String, ?> getAll() {
        return this.f26461a.getAll();
    }

    /* renamed from: a */
    public final C9720a edit() {
        return new C9720a(this.f26461a.edit());
    }

    private C9719a(SharedPreferences sharedPreferences) {
        this.f26461a = sharedPreferences;
    }

    public final boolean contains(String str) {
        return this.f26461a.contains(str);
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f26461a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f26461a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final boolean getBoolean(String str, boolean z) {
        return this.f26461a.getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        return this.f26461a.getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        return this.f26461a.getInt(str, i);
    }

    public final long getLong(String str, long j) {
        return this.f26461a.getLong(str, j);
    }

    public final String getString(String str, String str2) {
        return this.f26461a.getString(str, str2);
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        return this.f26461a.getStringSet(str, set);
    }

    /* renamed from: a */
    public static C9719a m28654a(Context context, String str) {
        StringBuilder sb = new StringBuilder("pref_id_");
        sb.append(str);
        return new C9719a(C7285c.m22838a(context, sb.toString(), 0));
    }
}
