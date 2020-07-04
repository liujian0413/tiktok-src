package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.f */
public final class C23220f {
    /* renamed from: a */
    public static Object m76239a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, String str, String str2, Object[] objArr) {
        Editor editor;
        String str3 = objArr[0];
        Editor edit = sharedPreferences2.edit();
        if (sharedPreferences == null) {
            editor = null;
        } else {
            editor = sharedPreferences.edit();
        }
        if (TextUtils.equals(str2, "java.lang.String")) {
            String str4 = str3;
            edit.putString(str, str4);
            if (editor != null) {
                editor.putString(str, str4);
            }
        } else if (TextUtils.equals(str2, "java.lang.Integer") || TextUtils.equals(str2, "int")) {
            Integer num = (Integer) str3;
            edit.putInt(str, num.intValue());
            if (editor != null) {
                editor.putInt(str, num.intValue());
            }
        } else if (TextUtils.equals(str2, "java.lang.Float") || TextUtils.equals(str2, "float")) {
            Float f = (Float) str3;
            edit.putFloat(str, f.floatValue());
            if (editor != null) {
                editor.putFloat(str, f.floatValue());
            }
        } else if (TextUtils.equals(str2, "java.lang.Long") || TextUtils.equals(str2, "long")) {
            Long l = (Long) str3;
            edit.putLong(str, l.longValue());
            if (editor != null) {
                editor.putLong(str, l.longValue());
            }
        } else if (TextUtils.equals(str2, "java.lang.Boolean") || TextUtils.equals(str2, "boolean")) {
            Boolean bool = (Boolean) str3;
            edit.putBoolean(str, bool.booleanValue());
            if (editor != null) {
                editor.putBoolean(str, bool.booleanValue());
            }
        } else {
            StringBuilder sb = new StringBuilder("Unexpected argument type: ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        edit.apply();
        if (editor != null) {
            editor.apply();
        }
        return null;
    }

    /* renamed from: a */
    public static Object m76240a(SharedPreferences sharedPreferences, String str, SharedPreferences sharedPreferences2, String str2, String str3, String str4, Object[] objArr) {
        Object obj = objArr[0];
        if (TextUtils.equals(str3, "java.lang.String")) {
            return sharedPreferences2.getString(str2, (String) obj);
        }
        if (TextUtils.equals(str3, "java.lang.Integer") || TextUtils.equals(str3, "int")) {
            if (obj == null) {
                obj = Integer.valueOf(0);
            }
            return Integer.valueOf(sharedPreferences2.getInt(str2, ((Integer) obj).intValue()));
        } else if (TextUtils.equals(str3, "java.lang.Float") || TextUtils.equals(str3, "float")) {
            if (obj == null) {
                obj = Float.valueOf(0.0f);
            }
            return Float.valueOf(sharedPreferences2.getFloat(str2, ((Float) obj).floatValue()));
        } else if (TextUtils.equals(str3, "java.lang.Long") || TextUtils.equals(str3, "long")) {
            if (obj == null) {
                obj = Long.valueOf(0);
            }
            return Long.valueOf(sharedPreferences2.getLong(str2, ((Long) obj).longValue()));
        } else if (TextUtils.equals(str3, "java.lang.Boolean") || TextUtils.equals(str3, "boolean")) {
            if (obj == null) {
                obj = Boolean.valueOf(false);
            }
            return Boolean.valueOf(sharedPreferences2.getBoolean(str2, ((Boolean) obj).booleanValue()));
        } else {
            StringBuilder sb = new StringBuilder("Unexpected argument type: ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
