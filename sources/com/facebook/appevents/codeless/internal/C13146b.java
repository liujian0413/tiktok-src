package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.facebook.appevents.codeless.internal.b */
public final class C13146b {
    /* renamed from: c */
    private static boolean m38421c(TextView textView) {
        if (textView.getInputType() == 96) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m38422d(TextView textView) {
        if (textView.getInputType() == 112) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m38423e(TextView textView) {
        if (textView.getInputType() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m38419a(TextView textView) {
        if (textView.getInputType() == 128) {
            return true;
        }
        return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    /* renamed from: a */
    public static boolean m38418a(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (m38419a(textView) || m38424f(textView) || m38421c(textView) || m38422d(textView) || m38423e(textView) || m38420b(textView)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m38420b(TextView textView) {
        if (textView.getInputType() == 32) {
            return true;
        }
        String b = C13148d.m38433b(textView);
        if (b == null || b.length() == 0) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(b).matches();
    }

    /* renamed from: f */
    private static boolean m38424f(TextView textView) {
        String replaceAll = C13148d.m38433b(textView).replaceAll("\\s", "");
        int length = replaceAll.length();
        if (length < 12 || length > 19) {
            return false;
        }
        int i = 0;
        boolean z = false;
        for (int i2 = length - 1; i2 >= 0; i2--) {
            char charAt = replaceAll.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return false;
            }
            int i3 = charAt - '0';
            if (z) {
                i3 *= 2;
                if (i3 > 9) {
                    i3 = (i3 % 10) + 1;
                }
            }
            i += i3;
            z = !z;
        }
        if (i % 10 == 0) {
            return true;
        }
        return false;
    }
}
