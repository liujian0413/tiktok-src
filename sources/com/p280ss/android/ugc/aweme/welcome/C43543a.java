package com.p280ss.android.ugc.aweme.welcome;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import kotlin.jvm.internal.C7573i;
import kotlin.p355d.C7545e;

/* renamed from: com.ss.android.ugc.aweme.welcome.a */
public final class C43543a {
    /* renamed from: a */
    public static final void m138035a(Intent intent, Activity activity) {
        C7573i.m23587b(activity, "activity");
        if (!(intent == null || intent.getData() == null)) {
            Intent intent2 = new Intent(activity, DeepLinkHandlerActivity.class);
            intent2.setFlags(268435456);
            intent2.setAction("android.intent.action.VIEW");
            C19290j jVar = new C19290j(intent.getData().toString());
            jVar.mo51188a("random", C7545e.m23549a(1000).toString());
            intent2.setData(Uri.parse(jVar.mo51184a()));
            intent2.putExtras(intent).putExtra("FROM_WELCOME_SCREEN", true);
            if (intent.getBooleanExtra("from_task", false)) {
                activity.setResult(-1, intent2);
                return;
            }
            activity.startActivity(intent2);
        }
    }
}
