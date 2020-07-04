package com.p280ss.android.ugc.aweme.property;

import android.content.SharedPreferences;
import android.support.p022v4.util.ArrayMap;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29965e;

/* renamed from: com.ss.android.ugc.aweme.property.PropertyStore */
public final class PropertyStore {

    /* renamed from: a */
    private SharedPreferences f96822a;

    /* renamed from: b */
    private ArrayMap<String, Object> f96823b = new ArrayMap<>();

    /* renamed from: com.ss.android.ugc.aweme.property.PropertyStore$PropertyType */
    public enum PropertyType {
        Boolean,
        Integer,
        Long,
        Float,
        String
    }

    /* renamed from: com.ss.android.ugc.aweme.property.PropertyStore$a */
    public interface C36952a {
        Object defValue();

        String key();

        boolean supportPersist();

        PropertyType type();
    }

    public PropertyStore(SharedPreferences sharedPreferences) {
        this.f96822a = sharedPreferences;
    }

    /* renamed from: f */
    public final synchronized boolean mo93367f(C36952a aVar) {
        return this.f96822a.contains(aVar.key());
    }

    /* renamed from: g */
    public final synchronized void mo93368g(C36952a aVar) {
        this.f96823b.remove(aVar.key());
        if (aVar.supportPersist()) {
            this.f96822a.edit().remove(aVar.key()).apply();
        }
    }

    /* renamed from: b */
    public final synchronized int mo93363b(C36952a aVar) {
        boolean z;
        Integer num;
        if (aVar.type() == PropertyType.Integer) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        num = (Integer) this.f96823b.get(aVar.key());
        if (num == null) {
            if (aVar.supportPersist()) {
                num = Integer.valueOf(this.f96822a.getInt(aVar.key(), ((Integer) aVar.defValue()).intValue()));
            } else {
                num = (Integer) aVar.defValue();
            }
            this.f96823b.put(aVar.key(), num);
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final synchronized long mo93364c(C36952a aVar) {
        boolean z;
        Long l;
        if (aVar.type() == PropertyType.Long) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        l = (Long) this.f96823b.get(aVar.key());
        if (l == null) {
            if (aVar.supportPersist()) {
                l = Long.valueOf(this.f96822a.getLong(aVar.key(), ((Long) aVar.defValue()).longValue()));
            } else {
                l = (Long) aVar.defValue();
            }
            this.f96823b.put(aVar.key(), l);
        }
        return l.longValue();
    }

    /* renamed from: d */
    public final synchronized float mo93365d(C36952a aVar) {
        boolean z;
        Float f;
        if (aVar.type() == PropertyType.Float) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        f = (Float) this.f96823b.get(aVar.key());
        if (f == null) {
            if (aVar.supportPersist()) {
                f = Float.valueOf(this.f96822a.getFloat(aVar.key(), ((Float) aVar.defValue()).floatValue()));
            } else {
                f = (Float) aVar.defValue();
            }
            this.f96823b.put(aVar.key(), f);
        }
        return f.floatValue();
    }

    /* renamed from: e */
    public final synchronized String mo93366e(C36952a aVar) {
        boolean z;
        String str;
        if (aVar.type() == PropertyType.String) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        str = (String) this.f96823b.get(aVar.key());
        if (str == null) {
            if (aVar.supportPersist()) {
                str = this.f96822a.getString(aVar.key(), (String) aVar.defValue());
            } else {
                str = (String) aVar.defValue();
            }
            this.f96823b.put(aVar.key(), str);
        }
        return str;
    }

    /* renamed from: a */
    public final synchronized boolean mo93362a(C36952a aVar) {
        boolean z;
        Boolean bool;
        if (aVar.type() == PropertyType.Boolean) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        bool = (Boolean) this.f96823b.get(aVar.key());
        if (bool == null) {
            if (aVar.supportPersist()) {
                bool = Boolean.valueOf(this.f96822a.getBoolean(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
            } else {
                bool = (Boolean) aVar.defValue();
            }
            this.f96823b.put(aVar.key(), bool);
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public final synchronized void mo93357a(C36952a aVar, float f) {
        boolean z;
        if (aVar.type() == PropertyType.Float) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        this.f96823b.put(aVar.key(), Float.valueOf(f));
        if (aVar.supportPersist()) {
            this.f96822a.edit().putFloat(aVar.key(), f).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo93358a(C36952a aVar, int i) {
        boolean z;
        if (aVar.type() == PropertyType.Integer) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        this.f96823b.put(aVar.key(), Integer.valueOf(i));
        if (aVar.supportPersist()) {
            this.f96822a.edit().putInt(aVar.key(), i).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo93359a(C36952a aVar, long j) {
        boolean z;
        if (aVar.type() == PropertyType.Long) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        this.f96823b.put(aVar.key(), Long.valueOf(j));
        if (aVar.supportPersist()) {
            this.f96822a.edit().putLong(aVar.key(), j).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo93360a(C36952a aVar, String str) {
        boolean z;
        if (aVar.type() == PropertyType.String) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98248a(z);
        this.f96823b.put(aVar.key(), str);
        if (aVar.supportPersist()) {
            this.f96822a.edit().putString(aVar.key(), str).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo93361a(C36952a aVar, boolean z) {
        boolean z2;
        Boolean bool;
        if (aVar.type() == PropertyType.Boolean) {
            z2 = true;
        } else {
            z2 = false;
        }
        C29965e.m98248a(z2);
        ArrayMap<String, Object> arrayMap = this.f96823b;
        String key = aVar.key();
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        arrayMap.put(key, bool);
        if (aVar.supportPersist()) {
            this.f96822a.edit().putBoolean(aVar.key(), z).apply();
        }
    }
}
