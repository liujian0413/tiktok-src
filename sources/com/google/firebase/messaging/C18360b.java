package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.C18272b;
import com.google.firebase.analytics.connector.C18266a;

/* renamed from: com.google.firebase.messaging.b */
public final class C18360b {
    /* renamed from: a */
    public static void m60501a(Intent intent) {
        m60502a("_nr", intent);
    }

    /* renamed from: b */
    public static void m60503b(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                C18266a aVar = (C18266a) C18272b.m60250c().mo47141a(C18266a.class);
                if (aVar != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    aVar.mo47135a("fcm", "_ln", (Object) stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    aVar.mo47134a("fcm", "_cmp", bundle);
                }
            }
        }
        m60502a("_no", intent);
    }

    /* renamed from: c */
    public static void m60504c(Intent intent) {
        m60502a("_nd", intent);
    }

    /* renamed from: d */
    public static void m60505d(Intent intent) {
        m60502a("_nf", intent);
    }

    /* renamed from: e */
    public static boolean m60506e(Intent intent) {
        if (intent != null && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return "1".equals(intent.getStringExtra("google.c.a.e"));
        }
        return false;
    }

    /* renamed from: a */
    private static void m60502a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException unused) {
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException unused2) {
            }
        }
        C18266a aVar = (C18266a) C18272b.m60250c().mo47141a(C18266a.class);
        if (aVar != null) {
            aVar.mo47134a("fcm", str, bundle);
        }
    }
}
