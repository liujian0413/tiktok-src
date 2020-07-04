package com.p280ss.android.ugc.aweme.live;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.live.i */
public final class C32528i {
    /* renamed from: a */
    public static void m105349a() {
        Context a = C6399b.m19921a();
        if (a != null) {
            C30476b.m99556b(a);
        }
    }

    /* renamed from: a */
    public static void m105350a(Context context) {
        C9515c d = C32430a.m105067d();
        if (d != null) {
            Locale a = C30476b.m99548a(context);
            if (a != null && !TextUtils.isEmpty(a.getLanguage())) {
                d.mo22012a(a);
            }
        }
    }
}
