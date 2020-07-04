package com.p280ss.android.ugc.aweme.app.p306k;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.settings.VendorBackUrlKey;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import java.util.ArrayList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.app.k.a */
public final class C23000a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f60778a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23000a.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C23000a f60779b = new C23000a();

    /* renamed from: c */
    private static ArrayList<String> f60780c = new ArrayList<>();

    /* renamed from: d */
    private static final C7541d f60781d = C7546e.m23569a(C23001a.f60782a);

    /* renamed from: com.ss.android.ugc.aweme.app.k.a$a */
    static final class C23001a extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C23001a f60782a = new C23001a();

        C23001a() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m75649a() {
            return Keva.getRepo("LAST_ACTIVITY_TASK_ID_REPO_NAME");
        }

        public final /* synthetic */ Object invoke() {
            return m75649a();
        }
    }

    private C23000a() {
    }

    /* renamed from: b */
    private final Keva m75648b() {
        return (Keva) f60781d.getValue();
    }

    /* renamed from: a */
    private static ArrayList<String> m75645a() {
        if (f60780c.isEmpty()) {
            ArrayList<String> arrayList = f60780c;
            arrayList.add("__BACKURL__");
            arrayList.add("__BACK_URL__");
            arrayList.add("__HWPPSBACKURL__");
        }
        return f60780c;
    }

    /* renamed from: a */
    public static final void m75646a(Context context) {
        if (context != null && (context instanceof AmeActivity)) {
            ((AmeActivity) context).tryRemoveDeeplinkBackView();
        }
    }

    /* renamed from: a */
    private static Intent m75644a(String str, String str2) {
        Uri parse = Uri.parse(str);
        Intent intent = new Intent();
        intent.setData(parse);
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(268435456);
        intent.setComponent(null);
        intent.setSelector(null);
        if (C23764b.m77913a(str2)) {
            intent.setPackage(str2);
        }
        return intent;
    }

    /* renamed from: a */
    public static final void m75647a(Uri uri, Intent intent, Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        if (intent != null && uri != null) {
            Activity activity = (Activity) context;
            if (activity.getTaskId() == f60779b.m75648b().getInt("LAST_ACTIVITY_TASK_ID", 0)) {
                C23018p a = C23018p.m75672a();
                C7573i.m23582a((Object) a, "AwemeRuntime.inst()");
                if (!a.mo59990c()) {
                    return;
                }
            }
            f60779b.m75648b().storeInt("LAST_ACTIVITY_TASK_ID", activity.getTaskId());
            String str = null;
            String a2 = C10292j.m30480a().mo25015a(VendorBackUrlKey.class, "vendor_key_back_url", C6384b.m19835a().mo15294c().getVendorKeyBackUrl());
            C7573i.m23582a((Object) a2, "SettingsManager.getInsta…orBackUrlKey::class.java)");
            if (C23764b.m77913a(a2)) {
                str = uri.getQueryParameter(a2);
            }
            CharSequence charSequence = str;
            boolean z4 = true;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = uri.getQueryParameter("backurl");
            }
            CharSequence charSequence2 = str;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = uri.getQueryParameter("back_url");
            }
            CharSequence charSequence3 = str;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 && !m75645a().contains(str)) {
                String queryParameter = uri.getQueryParameter("btn_name");
                CharSequence charSequence4 = queryParameter;
                if (!(charSequence4 == null || charSequence4.length() == 0)) {
                    z4 = false;
                }
                if (z4 || C7573i.m23585a((Object) queryParameter, (Object) "__BTN_NAME__")) {
                    if (C43045c.m136574d()) {
                        queryParameter = "返回vivo";
                    } else if (C43045c.m136573c()) {
                        queryParameter = "";
                    } else {
                        queryParameter = "返回";
                    }
                }
                Intent a3 = m75644a(str, uri.getQueryParameter("package"));
                if (a3.resolveActivity(activity.getPackageManager()) != null) {
                    intent.putExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY", a3);
                    intent.putExtra("VENDOR_BACK_URL_FOR_INTENT_KEY", str);
                    intent.putExtra("VENDOR_BTN_NAME_FOR_INTENT_KEY", queryParameter);
                }
            }
        }
    }
}
