package com.p280ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.bl */
public class C22903bl<T> {

    /* renamed from: a */
    protected T f60629a;

    /* renamed from: b */
    public String f60630b;

    /* renamed from: c */
    protected Type f60631c;

    /* renamed from: a */
    protected static SharedPreferences m75371a() {
        return SharePrefCache.inst().getSharePref();
    }

    /* renamed from: b */
    public final void mo59873b() {
        m75372b(this.f60629a);
    }

    /* renamed from: c */
    public final T mo59876c() {
        T t;
        SharedPreferences a = m75371a();
        try {
            if (this.f60629a != null) {
                return mo59877d();
            }
            if (this.f60631c == null || !(this.f60631c instanceof Class)) {
                return null;
            }
            Class<Boolean> cls = (Class) this.f60631c;
            if (!a.contains(this.f60630b)) {
                return null;
            }
            if (cls == String.class) {
                t = a.getString(this.f60630b, "");
            } else if (cls == Integer.class) {
                t = Integer.valueOf(a.getInt(this.f60630b, -1000));
            } else if (cls == Float.class) {
                t = Float.valueOf(a.getFloat(this.f60630b, -1000.0f));
            } else if (cls == Long.class) {
                t = Long.valueOf(a.getLong(this.f60630b, -1000));
            } else if (cls == Boolean.class) {
                t = Boolean.valueOf(a.getBoolean(this.f60630b, false));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = a.getStringSet(this.f60630b, new HashSet());
            } else {
                throw new AssertionError();
            }
            return t;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public T mo59877d() {
        T t;
        SharedPreferences a = m75371a();
        try {
            Class<Boolean> cls = this.f60629a.getClass();
            if (cls == String.class) {
                t = a.getString(this.f60630b, (String) this.f60629a);
            } else if (cls == Integer.class) {
                t = Integer.valueOf(a.getInt(this.f60630b, ((Integer) this.f60629a).intValue()));
            } else if (cls == Float.class) {
                t = Float.valueOf(a.getFloat(this.f60630b, ((Float) this.f60629a).floatValue()));
            } else if (cls == Long.class) {
                t = Long.valueOf(a.getLong(this.f60630b, ((Long) this.f60629a).longValue()));
            } else if (cls == Boolean.class) {
                t = Boolean.valueOf(a.getBoolean(this.f60630b, ((Boolean) this.f60629a).booleanValue()));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = a.getStringSet(this.f60630b, (Set) this.f60629a);
            } else {
                throw new AssertionError();
            }
            if (t == null) {
                m75372b(this.f60629a);
                t = this.f60629a;
            }
            if (t.getClass() != this.f60629a.getClass()) {
                t = this.f60629a;
            }
            return t;
        } catch (Exception unused) {
            return this.f60629a;
        }
    }

    /* renamed from: b */
    private void m75372b(T t) {
        mo59872a(t, false);
    }

    /* renamed from: a */
    public final void mo59871a(T t) {
        mo59875b(t, false);
    }

    public C22903bl(String str, T t) {
        if (t != null) {
            this.f60629a = t;
            this.f60630b = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final void mo59874b(Editor editor, T t) {
        if (editor != null) {
            mo59870a(editor, t);
            return;
        }
        throw new IllegalArgumentException("editor can not be null!");
    }

    /* renamed from: b */
    public final void mo59875b(T t, boolean z) {
        if (t != null) {
            mo59872a(t, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59870a(Editor editor, T t) {
        if (t instanceof String) {
            editor.putString(this.f60630b, (String) t);
        } else if (t instanceof Integer) {
            editor.putInt(this.f60630b, ((Integer) t).intValue());
        } else if (t instanceof Float) {
            editor.putFloat(this.f60630b, ((Float) t).floatValue());
        } else if (t instanceof Long) {
            editor.putLong(this.f60630b, ((Long) t).longValue());
        } else if (t instanceof Boolean) {
            editor.putBoolean(this.f60630b, ((Boolean) t).booleanValue());
        } else {
            if (t instanceof Set) {
                editor.putStringSet(this.f60630b, (Set) t);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59872a(T t, boolean z) {
        if (t != null) {
            Editor edit = m75371a().edit();
            if (t instanceof String) {
                edit.putString(this.f60630b, (String) t);
            } else if (t instanceof Integer) {
                edit.putInt(this.f60630b, ((Integer) t).intValue());
            } else if (t instanceof Float) {
                edit.putFloat(this.f60630b, ((Float) t).floatValue());
            } else if (t instanceof Long) {
                edit.putLong(this.f60630b, ((Long) t).longValue());
            } else if (t instanceof Boolean) {
                edit.putBoolean(this.f60630b, ((Boolean) t).booleanValue());
            } else if (t instanceof Set) {
                edit.putStringSet(this.f60630b, (Set) t);
            }
            if (z) {
                edit.commit();
            } else {
                edit.apply();
            }
        }
    }

    public C22903bl(String str, Type type, T t) {
        if (t == null && type == null) {
            throw new NullPointerException();
        }
        this.f60629a = t;
        this.f60630b = str;
        this.f60631c = type;
    }
}
