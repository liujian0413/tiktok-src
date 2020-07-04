package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.a */
public final class C31852a {
    /* renamed from: a */
    public static void m103394a(View view, final String str) {
        if (view != null && str != null) {
            C0991u.m4187a(view, (C0939a) new C0939a() {
                /* renamed from: a */
                public final void mo1148a(View view, C0945c cVar) {
                    super.mo1148a(view, cVar);
                    if (!TextUtils.isEmpty(str)) {
                        view.setContentDescription(str);
                    }
                    cVar.mo3656b((CharSequence) DmtTextView.class.getName());
                }
            });
        }
    }

    /* renamed from: a */
    public static void m103395a(ImageView imageView, final IMUser iMUser) {
        if (imageView != null && iMUser != null) {
            C0991u.m4187a((View) imageView, (C0939a) new C0939a() {
                /* renamed from: a */
                public final void mo1148a(View view, C0945c cVar) {
                    super.mo1148a(view, cVar);
                    view.setContentDescription(iMUser.getDisplayName());
                    cVar.mo3656b((CharSequence) DmtTextView.class.getName());
                }
            });
        }
    }
}
