package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b */
public final class C4129b extends C11152c<C4131a, C4132b> {

    /* renamed from: a */
    private AlertDialog f12125a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$a */
    static final class C4131a {
        @C6593c(mo15949a = "title")

        /* renamed from: a */
        String f12126a;
        @C6593c(mo15949a = "content")

        /* renamed from: b */
        String f12127b;
        @C6593c(mo15949a = "confirmText")

        /* renamed from: c */
        String f12128c;
        @C6593c(mo15949a = "showCancel")

        /* renamed from: d */
        boolean f12129d;
        @C6593c(mo15949a = "cancelText")

        /* renamed from: e */
        String f12130e;

        C4131a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b */
    static final class C4132b {
        @C6593c(mo15949a = "data")

        /* renamed from: a */
        C4133a f12131a;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b$a */
        static final class C4133a {
            @C6593c(mo15949a = "confirm")

            /* renamed from: a */
            boolean f12132a;
            @C6593c(mo15949a = "cancel")

            /* renamed from: b */
            boolean f12133b;

            C4133a(boolean z) {
                this.f12132a = z;
                this.f12133b = !z;
            }
        }

        private C4132b(boolean z) {
            this.f12131a = new C4133a(z);
        }
    }

    public final void onTerminate() {
        if (this.f12125a != null) {
            this.f12125a.dismiss();
        }
        this.f12125a = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11695a(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        finishWithResult(new C4132b(false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11696b(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        finishWithResult(new C4132b(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(C4131a aVar, CallContext callContext) {
        String str;
        String str2;
        C1081a aVar2 = new C1081a(callContext.f30265a);
        aVar2.mo4240b((CharSequence) aVar.f12127b);
        if (!TextUtils.isEmpty(aVar.f12126a)) {
            aVar2.mo4233a((CharSequence) aVar.f12126a);
        }
        if (TextUtils.isEmpty(aVar.f12128c)) {
            str = C3358ac.m12515a((int) R.string.f96);
        } else {
            str = aVar.f12128c;
        }
        aVar2.mo4234a((CharSequence) str, (OnClickListener) new C4163c(this));
        if (aVar.f12129d) {
            if (TextUtils.isEmpty(aVar.f12130e)) {
                str2 = C3358ac.m12515a((int) R.string.ecm);
            } else {
                str2 = aVar.f12130e;
            }
            aVar2.mo4241b((CharSequence) str2, (OnClickListener) new C4164d(this));
        }
        this.f12125a = aVar2.mo4242b();
        this.f12125a.show();
    }
}
