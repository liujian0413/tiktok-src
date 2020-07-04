package com.bytedance.common.utility.p481c;

import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.common.utility.c.b */
public final class C9721b {

    /* renamed from: a */
    static final C9723b f26463a;

    /* renamed from: com.bytedance.common.utility.c.b$a */
    static class C9722a implements C9723b {
        C9722a() {
        }

        /* renamed from: a */
        public final void mo24090a(Editor editor) {
            editor.commit();
        }
    }

    /* renamed from: com.bytedance.common.utility.c.b$b */
    interface C9723b {
        /* renamed from: a */
        void mo24090a(Editor editor);
    }

    /* renamed from: com.bytedance.common.utility.c.b$c */
    static class C9724c implements C9723b {
        C9724c() {
        }

        /* renamed from: a */
        public final void mo24090a(Editor editor) {
            editor.apply();
        }
    }

    static {
        if (VERSION.SDK_INT >= 9) {
            f26463a = new C9724c();
        } else {
            f26463a = new C9722a();
        }
    }

    /* renamed from: a */
    public static void m28656a(Editor editor) {
        if (editor != null) {
            f26463a.mo24090a(editor);
        }
    }
}
