package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a */
public final class C25330a {

    /* renamed from: a */
    public static final C25330a f66714a = new C25330a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a$a */
    static final class C25331a implements C25372a {

        /* renamed from: a */
        final /* synthetic */ Context f66715a;

        /* renamed from: b */
        final /* synthetic */ Aweme f66716b;

        /* renamed from: c */
        final /* synthetic */ String f66717c;

        C25331a(Context context, Aweme aweme, String str) {
            this.f66715a = context;
            this.f66716b = aweme;
            this.f66717c = str;
        }

        /* renamed from: a */
        public final void mo61517a(boolean z) {
            if (z) {
                C24976t.m82242j(this.f66715a, this.f66716b, this.f66717c);
            } else {
                C24976t.m82195d(this.f66715a, this.f66716b, this.f66717c, "user_canceled");
            }
        }
    }

    private C25330a() {
    }

    /* renamed from: a */
    private static Intent m83244a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        return intent;
    }

    /* renamed from: a */
    private static List<String> m83245a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://"));
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        C7573i.m23582a((Object) queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        Iterable<ResolveInfo> iterable = queryIntentActivities;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ResolveInfo resolveInfo : iterable) {
            arrayList.add(resolveInfo.activityInfo.packageName);
        }
        return (List) arrayList;
    }

    /* renamed from: d */
    public static final boolean m83252d(Context context, Uri uri) {
        if (context == null || uri == null || C25371n.m83464a(uri) || f66714a.m83253e(context, uri).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m83251c(Context context, Uri uri) {
        if (context == null || uri == null || !C25371n.m83464a(uri)) {
            return false;
        }
        if (!C7525m.m23501b((Iterable<? extends T>) f66714a.m83253e(context, uri), (Iterable<? extends T>) m83245a(context)).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final List<String> m83253e(Context context, Uri uri) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(m83244a(uri), 65536);
        C7573i.m23582a((Object) queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        Iterable<ResolveInfo> iterable = queryIntentActivities;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ResolveInfo resolveInfo : iterable) {
            arrayList.add(resolveInfo.activityInfo.packageName);
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    public static final boolean m83249b(Context context, Uri uri) {
        if (context == null || uri == null || !m83252d(context, uri)) {
            return false;
        }
        Intent a = m83244a(uri);
        List e = f66714a.m83253e(context, uri);
        if (!(!e.isEmpty())) {
            e = null;
        }
        if (e == null) {
            return false;
        }
        a.setPackage((String) C7525m.m23516h((Iterable<? extends T>) e).get(0));
        a.addFlags(268435456);
        return C25371n.m83445a(context, a);
    }

    /* renamed from: a */
    public static final boolean m83247a(Context context, Uri uri) {
        if (context == null || uri == null || !m83251c(context, uri)) {
            return false;
        }
        Intent a = m83244a(uri);
        Set b = C7525m.m23501b((Iterable<? extends T>) f66714a.m83253e(context, uri), (Iterable<? extends T>) m83245a(context));
        if (!(!b.isEmpty())) {
            b = null;
        }
        if (b == null) {
            return false;
        }
        a.setPackage((String) C7525m.m23516h((Iterable<? extends T>) b).get(0));
        a.addFlags(268435456);
        return C25371n.m83445a(context, a);
    }

    /* renamed from: c */
    public static final void m83250c(Context context, Aweme aweme, String str) {
        C7573i.m23587b(context, "context");
        C24976t.m82236i(context, aweme, str);
        C24976t.m82195d(context, aweme, str, "whitelist_not_found");
    }

    /* renamed from: a */
    public static final void m83246a(Context context, Aweme aweme, String str) {
        C7573i.m23587b(context, "context");
        C24976t.m82236i(context, aweme, str);
        C24976t.m82247k(context, aweme, str);
    }

    /* renamed from: b */
    public static final void m83248b(Context context, Aweme aweme, String str) {
        C7573i.m23587b(context, "context");
        C24976t.m82236i(context, aweme, str);
        C25371n.m83440a((C25372a) new C25331a(context, aweme, str));
    }
}
