package com.bytedance.common.utility.p480a;

import android.content.ClipData;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.ClipboardManager;

/* renamed from: com.bytedance.common.utility.a.a */
public final class C9700a {

    /* renamed from: a */
    static final C9702b f26431a;

    /* renamed from: com.bytedance.common.utility.a.a$a */
    static class C9701a implements C9702b {
        C9701a() {
        }

        /* renamed from: a */
        public final void mo24061a(Context context, CharSequence charSequence, CharSequence charSequence2) {
            ((ClipboardManager) context.getSystemService("clipboard")).setText(charSequence2);
        }
    }

    /* renamed from: com.bytedance.common.utility.a.a$b */
    interface C9702b {
        /* renamed from: a */
        void mo24061a(Context context, CharSequence charSequence, CharSequence charSequence2);
    }

    /* renamed from: com.bytedance.common.utility.a.a$c */
    static class C9703c implements C9702b {
        C9703c() {
        }

        /* renamed from: a */
        public final void mo24061a(Context context, CharSequence charSequence, CharSequence charSequence2) {
            ((android.content.ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f26431a = new C9703c();
        } else {
            f26431a = new C9701a();
        }
    }

    /* renamed from: a */
    public static void m28636a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        if (context != null && charSequence2 != null) {
            try {
                f26431a.mo24061a(context, charSequence, charSequence2);
            } catch (Throwable unused) {
            }
        }
    }
}
