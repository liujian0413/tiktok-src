package com.p280ss.android.ugc.aweme.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.app.C22887b;

/* renamed from: com.ss.android.ugc.aweme.router.p */
public final class C37282p {
    /* renamed from: b */
    public static boolean m119742b(Context context, Uri uri, Intent intent, boolean z) {
        if (z) {
            C22887b.m75350a("mine", uri, intent.getBooleanExtra("is_from_push", false));
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m119741a(Context context, Uri uri, Intent intent, boolean z) {
        if (z) {
            String queryParameter = uri.getQueryParameter("tab");
            boolean booleanExtra = intent.getBooleanExtra("is_from_push", false);
            try {
                int parseInt = Integer.parseInt(queryParameter);
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C22887b.m75350a("discovery", uri, booleanExtra);
                } else if (parseInt == 5) {
                    C22887b.m75350a("follow", uri, booleanExtra);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
