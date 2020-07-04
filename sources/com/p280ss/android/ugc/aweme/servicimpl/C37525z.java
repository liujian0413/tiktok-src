package com.p280ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35536ag;
import com.p280ss.android.ugc.aweme.port.p1479in.C35536ag.C35537a;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.z */
public final class C37525z implements C35536ag {

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.z$a */
    static final class C37526a implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C35537a f97886a;

        C37526a(C35537a aVar) {
            this.f97886a = aVar;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            this.f97886a.mo90362a(strArr, iArr);
        }
    }

    /* renamed from: a */
    public final boolean mo90357a() {
        return C43162f.m136886a();
    }

    /* renamed from: a */
    public final int mo90354a(Context context) {
        C7573i.m23587b(context, "context");
        return C43162f.m136885a(context);
    }

    /* renamed from: b */
    public final int mo90359b(Context context) {
        C7573i.m23587b(context, "context");
        return C43162f.m136887b(context);
    }

    /* renamed from: c */
    public final int mo90360c(Context context) {
        C7573i.m23587b(context, "context");
        return C43162f.m136888c(context);
    }

    /* renamed from: d */
    public final void mo90361d(Context context) {
        C7573i.m23587b(context, "context");
        C42969bc.m136401a(context);
    }

    /* renamed from: a */
    public final int mo90355a(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "permission");
        return ActivityCompat.m2909b(context, str);
    }

    /* renamed from: a */
    public final boolean mo90358a(Activity activity, String str) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "permission");
        return ActivityCompat.m2242a(activity, str);
    }

    /* renamed from: a */
    public final void mo90356a(FragmentActivity fragmentActivity, C35537a aVar, String... strArr) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(aVar, "requestListener");
        C7573i.m23587b(strArr, "permissions");
        C22477b.m74364a(fragmentActivity, strArr, new C37526a(aVar));
    }
}
