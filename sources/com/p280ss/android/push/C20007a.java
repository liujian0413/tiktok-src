package com.p280ss.android.push;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.ss.android.push.a */
public final class C20007a {
    /* renamed from: a */
    public static int m65932a(Intent intent, String str, int i) {
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
}
