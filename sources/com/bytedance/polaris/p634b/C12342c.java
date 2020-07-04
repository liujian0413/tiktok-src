package com.bytedance.polaris.p634b;

import android.content.ClipData.Item;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.ClipboardManager;

/* renamed from: com.bytedance.polaris.b.c */
public final class C12342c {

    /* renamed from: a */
    private static final C12345b f32767a;

    /* renamed from: com.bytedance.polaris.b.c$a */
    static class C12344a implements C12345b {
        private C12344a() {
        }

        /* renamed from: a */
        public final String mo30186a(Context context) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                return "";
            }
            CharSequence text = clipboardManager.getText();
            if (text == null) {
                return "";
            }
            return text.toString();
        }
    }

    /* renamed from: com.bytedance.polaris.b.c$b */
    protected interface C12345b {
        /* renamed from: a */
        String mo30186a(Context context);
    }

    /* renamed from: com.bytedance.polaris.b.c$c */
    static class C12346c implements C12345b {
        private C12346c() {
        }

        /* renamed from: a */
        public final String mo30186a(Context context) {
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                return "";
            }
            try {
                if (clipboardManager.hasPrimaryClip() && (clipboardManager.getPrimaryClipDescription().hasMimeType("text/plain") || clipboardManager.getPrimaryClipDescription().hasMimeType("text/html"))) {
                    Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    if (itemAt.getText() == null) {
                        return "";
                    }
                    CharSequence text = itemAt.getText();
                    if (text == null) {
                        return "";
                    }
                    return text.toString();
                }
            } catch (Throwable unused) {
            }
            return "";
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f32767a = new C12346c();
        } else {
            f32767a = new C12344a();
        }
    }

    /* renamed from: a */
    public static String m35842a(Context context) {
        return f32767a.mo30186a(context);
    }
}
