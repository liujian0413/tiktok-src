package com.p280ss.android.newmedia.message;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.ss.android.newmedia.message.a */
public final class C19950a {
    /* renamed from: a */
    public static int m65793a(Intent intent, String str, int i) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return -1;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            try {
                return ((Integer) obj).intValue();
            } catch (ClassCastException unused2) {
                return -1;
            }
        }
    }

    /* renamed from: a */
    public static boolean m65794a(Intent intent, String str, boolean z) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get(str);
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            try {
                return Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException unused) {
                return false;
            }
        } else {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (ClassCastException unused2) {
                return false;
            }
        }
    }
}
