package com.twitter.sdk.android.core.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import java.text.Normalizer;
import java.text.Normalizer.Form;

/* renamed from: com.twitter.sdk.android.core.internal.r */
public final class C46892r {

    /* renamed from: a */
    public final String f120234a;

    public C46892r() {
        this("https://api.twitter.com");
    }

    private C46892r(String str) {
        this.f120234a = str;
    }

    /* renamed from: a */
    private static String m146672a(String str) {
        return m146674b(Normalizer.normalize(str, Form.NFD));
    }

    /* renamed from: a */
    public final Builder mo118007a(String... strArr) {
        Builder buildUpon = Uri.parse(this.f120234a).buildUpon();
        for (int i = 0; i < 2; i++) {
            buildUpon.appendPath(strArr[i]);
        }
        return buildUpon;
    }

    /* renamed from: b */
    private static String m146674b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt > 31 && charAt < 127) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m146673a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('/');
        sb.append(str2);
        sb.append(' ');
        sb.append(Build.MODEL);
        sb.append('/');
        sb.append(VERSION.RELEASE);
        sb.append(" (");
        sb.append(Build.MANUFACTURER);
        sb.append(';');
        sb.append(Build.MODEL);
        sb.append(';');
        sb.append(Build.BRAND);
        sb.append(';');
        sb.append(Build.PRODUCT);
        sb.append(')');
        return m146672a(sb.toString());
    }
}
