package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.C13499h;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.C13924n.C13925a;
import com.facebook.internal.C13953v.C13960f;

/* renamed from: com.facebook.internal.f */
public final class C13907f {

    /* renamed from: com.facebook.internal.f$a */
    public interface C13908a {
        /* renamed from: a */
        Bundle mo33560a();

        /* renamed from: b */
        Bundle mo33561b();
    }

    /* renamed from: a */
    public static void m41048a(C13861a aVar) {
        m41050a(aVar, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    /* renamed from: b */
    private static C13960f m41056b(C13906e eVar) {
        String k = C13499h.m39725k();
        String action = eVar.getAction();
        return C13953v.m41163a(action, m41055a(k, action, eVar));
    }

    /* renamed from: a */
    public static boolean m41054a(C13906e eVar) {
        if (m41056b(eVar).f36929b != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m41050a(C13861a aVar, FacebookException facebookException) {
        m41057b(aVar, facebookException);
    }

    /* renamed from: a */
    public static void m41049a(C13861a aVar, Activity activity) {
        activity.startActivityForResult(aVar.f36732b, aVar.f36733c);
        aVar.mo33498a();
    }

    /* renamed from: a */
    public static void m41052a(C13861a aVar, C13945q qVar) {
        qVar.mo33599a(aVar.f36732b, aVar.f36733c);
        aVar.mo33498a();
    }

    /* renamed from: b */
    private static void m41057b(C13861a aVar, FacebookException facebookException) {
        if (facebookException != null) {
            C13876aa.m40982b(C13499h.m39721g());
            Intent intent = new Intent();
            intent.setClass(C13499h.m39721g(), FacebookActivity.class);
            intent.setAction(FacebookActivity.f34644a);
            C13953v.m41167a(intent, aVar.f36731a.toString(), (String) null, C13953v.m41153a(), C13953v.m41161a(facebookException));
            aVar.f36732b = intent;
        }
    }

    /* renamed from: a */
    public static void m41051a(C13861a aVar, C13908a aVar2, C13906e eVar) {
        Bundle bundle;
        Context g = C13499h.m39721g();
        String action = eVar.getAction();
        C13960f b = m41056b(eVar);
        int i = b.f36929b;
        if (i != -1) {
            if (C13953v.m41168a(i)) {
                bundle = aVar2.mo33560a();
            } else {
                bundle = aVar2.mo33561b();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intent a = C13953v.m41157a(g, aVar.f36731a.toString(), action, b, bundle);
            if (a != null) {
                aVar.f36732b = a;
                return;
            }
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    /* renamed from: a */
    public static void m41053a(C13861a aVar, String str, Bundle bundle) {
        C13876aa.m40982b(C13499h.m39721g());
        C13876aa.m40976a(C13499h.m39721g());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        C13953v.m41167a(intent, aVar.f36731a.toString(), str, C13953v.m41153a(), bundle2);
        intent.setClass(C13499h.m39721g(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.f36732b = intent;
    }

    /* renamed from: a */
    private static int[] m41055a(String str, String str2, C13906e eVar) {
        C13925a a = C13924n.m41094a(str, str2, eVar.name());
        if (a != null) {
            return a.f36855d;
        }
        return new int[]{eVar.getMinVersion()};
    }
}
