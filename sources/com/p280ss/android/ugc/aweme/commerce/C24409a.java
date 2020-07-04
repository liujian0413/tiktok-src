package com.p280ss.android.ugc.aweme.commerce;

import android.app.Activity;
import android.content.Context;
import com.bytedance.retrofit2.p638c.C12469a;
import com.google.gson.C6600e;
import com.p280ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p280ss.android.anywheredoor_api.IAnyWhereDoor.C19220a;
import com.p280ss.android.p817ad.splash.core.C18962a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22823d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.GsonProvider;
import com.p280ss.android.ugc.aweme.web.C43447i;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.a */
public final class C24409a implements IAnyWhereDoor {

    /* renamed from: a */
    public static final C24410a f64445a = new C24410a(null);

    /* renamed from: b */
    private IAnyWhereDoor f64446b;

    /* renamed from: com.ss.android.ugc.aweme.commerce.a$a */
    public static final class C24410a {
        private C24410a() {
        }

        public /* synthetic */ C24410a(C7571f fVar) {
            this();
        }
    }

    public final Class<?> getComposePbModelClass() {
        return C22823d.class;
    }

    public final C12469a getNetworkInterceptor() {
        m80256a();
        IAnyWhereDoor iAnyWhereDoor = this.f64446b;
        if (iAnyWhereDoor != null) {
            C12469a networkInterceptor = iAnyWhereDoor.getNetworkInterceptor();
            if (networkInterceptor != null) {
                return networkInterceptor;
            }
        }
        return null;
    }

    public final C6600e getGson() {
        Object service = ServiceManager.get().getService(GsonProvider.class);
        C7573i.m23582a(service, "ServiceManager.get().get…GsonProvider::class.java)");
        return ((GsonProvider) service).getGson();
    }

    /* renamed from: a */
    private final void m80256a() {
        if (!C7163a.m22363a()) {
            this.f64446b = null;
        } else if (this.f64446b == null) {
            try {
                Method declaredMethod = Class.forName("com.ss.android.anywheredoor.impl.AnyWhereDoorImpl").getDeclaredMethod("inst", new Class[0]);
                declaredMethod.setAccessible(true);
                this.f64446b = (IAnyWhereDoor) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public final HashMap<String, String> getGeckoInfo() {
        HashMap<String, String> hashMap = new HashMap<>();
        Map map = hashMap;
        C43447i c = C43447i.m137872c();
        C7573i.m23582a((Object) c, "WebOfflineConfig.getInstance()");
        String g = c.mo105382g();
        C7573i.m23582a((Object) g, "WebOfflineConfig.getInstance().geckoAccessKey");
        map.put("gecko_key", g);
        String e = C43447i.m137874e();
        C7573i.m23582a((Object) e, "WebOfflineConfig.getInst…RootDirWithoutAccessKey()");
        map.put("gecko_dir", e);
        return hashMap;
    }

    public final void checkSplashData(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C18962a.m61921a();
        C18962a.m61922b();
    }

    public final void openAnyWhereDoorPage(Context context) {
        m80256a();
        IAnyWhereDoor iAnyWhereDoor = this.f64446b;
        if (iAnyWhereDoor != null) {
            iAnyWhereDoor.openAnyWhereDoorPage(context);
        }
    }

    public final void refreshWithAnim(AmeBaseFragment ameBaseFragment) {
        if (C7163a.m22363a() && (ameBaseFragment instanceof FeedFragment)) {
            ((FeedFragment) ameBaseFragment).mo73821p();
        }
    }

    public final Class<?> getModelByPath(String str) {
        C7573i.m23587b(str, "path");
        if (str.hashCode() == 3138974 && str.equals(C22704b.f60414c)) {
            return FeedItemList.class;
        }
        return null;
    }

    public final boolean switchEnable(Context context, boolean z) {
        m80256a();
        IAnyWhereDoor iAnyWhereDoor = this.f64446b;
        if (iAnyWhereDoor != null) {
            return iAnyWhereDoor.switchEnable(context, z);
        }
        return false;
    }

    public final boolean switchNetworkCounter(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        m80256a();
        IAnyWhereDoor iAnyWhereDoor = this.f64446b;
        if (iAnyWhereDoor != null) {
            return iAnyWhereDoor.switchNetworkCounter(context, z);
        }
        return C19220a.m62951a(this, context, z);
    }
}
