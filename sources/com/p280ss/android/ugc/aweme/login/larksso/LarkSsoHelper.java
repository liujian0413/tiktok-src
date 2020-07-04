package com.p280ss.android.ugc.aweme.login.larksso;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.http.legacy.p296a.C6810f;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso.C32663a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.update.C42785e.C42786a;
import com.p280ss.android.ugc.aweme.util.C42881i;
import com.p280ss.android.ugc.aweme.utils.C43171v;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper */
public final class LarkSsoHelper {

    /* renamed from: a */
    public static final LarkSsoHelper f85130a = new LarkSsoHelper();

    /* renamed from: b */
    private static C32666a f85131b;

    /* renamed from: c */
    private static LarkApi f85132c = ((LarkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(LarkApi.class));

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$LarkApi */
    public interface LarkApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$a */
    public interface C32666a {
        /* renamed from: a */
        void mo84109a();
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$b */
    static final class C32667b<T> implements C7495v<String> {

        /* renamed from: a */
        final /* synthetic */ String f85133a;

        C32667b(String str) {
            this.f85133a = str;
        }

        public final void subscribe(C47870u<String> uVar) {
            String str;
            C7573i.m23587b(uVar, "it");
            try {
                str = NetworkUtils.executeGet(0, 0, this.f85133a, true, false, null, (C6810f) null, true);
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optString("username");
                String optString = jSONObject.optString("email");
                C42881i.m136163a(optString);
                uVar.mo19239a((Object) optString);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$c */
    public static final class C32668c implements C7498y<String> {
        C32668c() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            m105781a((String) obj);
        }

        /* renamed from: a */
        private static void m105781a(String str) {
            C7573i.m23587b(str, "t");
            if (!TextUtils.isEmpty(str)) {
                C6887b.m21436b().mo16899a((Context) AwemeApplication.m21341a(), "sso_time", System.currentTimeMillis());
                C32666a a = LarkSsoHelper.m105771a();
                if (a != null) {
                    a.mo84109a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.LarkSsoHelper$d */
    static final class C32669d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f85134a;

        C32669d(Context context) {
            this.f85134a = context;
        }

        public final void run() {
            boolean z;
            if (LarkSsoHelper.m105778b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(C7276d.m22809b(C6399b.m19921a()).toString());
                sb.append(File.separator);
                sb.append("validation.prop");
                if (C7276d.m22824f(sb.toString()) != null) {
                    z = true;
                    if (C32670a.m105782a((Context) AwemeApplication.m21341a()) && LarkSsoHelper.m105779c() && LarkSsoHelper.m105778b() && !C6870b.m21395c() && !C42786a.m135804a().f111206a && VERSION.SDK_INT >= 23) {
                        C43171v a = C43171v.m136920a();
                        C7573i.m23582a((Object) a, "BoeUtils.inst()");
                        if (!C32670a.m105783a(a) && !z) {
                            Intent a2 = C25833b.m84946a(this.f85134a, "https://sso.bytedance.com/cas/login");
                            C7573i.m23582a((Object) a2, "CrossPlatformUtil.getInt…bytedance.com/cas/login\")");
                            a2.setClass(this.f85134a, CrossPlatformActivityForLarkSso.class);
                            a2.putExtra("hide_more", true);
                            a2.putExtra("title_extra", this.f85134a.getString(R.string.byd));
                            this.f85134a.startActivity(a2);
                        }
                    }
                    C32666a a3 = C32663a.m105766a();
                    if (a3 != null) {
                        a3.mo84109a();
                        return;
                    }
                    return;
                }
            }
            z = false;
            C43171v a4 = C43171v.m136920a();
            C7573i.m23582a((Object) a4, "BoeUtils.inst()");
            Intent a22 = C25833b.m84946a(this.f85134a, "https://sso.bytedance.com/cas/login");
            C7573i.m23582a((Object) a22, "CrossPlatformUtil.getInt…bytedance.com/cas/login\")");
            a22.setClass(this.f85134a, CrossPlatformActivityForLarkSso.class);
            a22.putExtra("hide_more", true);
            a22.putExtra("title_extra", this.f85134a.getString(R.string.byd));
            this.f85134a.startActivity(a22);
        }
    }

    private LarkSsoHelper() {
    }

    /* renamed from: a */
    public static C32666a m105771a() {
        return f85131b;
    }

    /* renamed from: a */
    public static final void m105772a(Context context) {
        m105773a(context, 1);
    }

    /* renamed from: b */
    public static boolean m105778b() {
        if (C6319n.m19594a(C6399b.m19941q(), "local_test") || C6319n.m19594a(C6399b.m19941q(), "lark_inhouse")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m105779c() {
        long c = C6887b.m21436b().mo16910c(AwemeApplication.m21341a(), "sso_time");
        if (c == 0 || System.currentTimeMillis() - c > TimeUnit.DAYS.toMillis(30)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m105775a(C32666a aVar) {
        f85131b = aVar;
    }

    /* renamed from: b */
    private static void m105777b(String str) {
        try {
            if (C7634n.m23776c((CharSequence) str, (CharSequence) "api/v1/be/user", false)) {
                C7492s.m23282a((C7495v<T>) new C32667b<T>(str)).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19189a((C7498y<? super T>) new C32668c<Object>());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final synchronized void m105776a(String str) {
        synchronized (LarkSsoHelper.class) {
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    C7573i.m23580a();
                }
                m105777b(str);
            }
        }
    }

    /* renamed from: a */
    public static final void m105773a(Context context, long j) {
        C7573i.m23587b(context, "context");
        new Handler().postDelayed(new C32669d(context), TimeUnit.SECONDS.toMillis(j));
    }
}
