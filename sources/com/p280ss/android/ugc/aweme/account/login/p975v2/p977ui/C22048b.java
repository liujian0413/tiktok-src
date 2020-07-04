package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.text.TextUtils;
import android.widget.EditText;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.b */
public final class C22048b {

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.b$a */
    static final class C22049a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EditText f58972a;

        C22049a(EditText editText) {
            this.f58972a = editText;
        }

        public final void run() {
            this.f58972a.requestFocus();
            KeyboardUtils.m77056b(this.f58972a);
        }
    }

    /* renamed from: b */
    public static final boolean m73351b(EditText editText) {
        C7573i.m23587b(editText, "$this$isEmpty");
        return TextUtils.isEmpty(editText.getText());
    }

    /* renamed from: a */
    public static final void m73350a(EditText editText) {
        C7573i.m23587b(editText, "editText");
        editText.postDelayed(new C22049a(editText), 500);
    }
}
