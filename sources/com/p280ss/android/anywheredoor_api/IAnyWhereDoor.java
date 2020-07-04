package com.p280ss.android.anywheredoor_api;

import android.app.Activity;
import android.content.Context;
import com.bytedance.retrofit2.p638c.C12469a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.anywheredoor_api.IAnyWhereDoor */
public interface IAnyWhereDoor {

    /* renamed from: com.ss.android.anywheredoor_api.IAnyWhereDoor$a */
    public static final class C19220a {
        /* renamed from: a */
        public static boolean m62951a(IAnyWhereDoor iAnyWhereDoor, Context context, boolean z) {
            C7573i.m23587b(context, "context");
            return false;
        }
    }

    void checkSplashData(Activity activity);

    Class<?> getComposePbModelClass();

    HashMap<String, String> getGeckoInfo();

    C6600e getGson();

    Class<?> getModelByPath(String str);

    C12469a getNetworkInterceptor();

    void openAnyWhereDoorPage(Context context);

    void refreshWithAnim(AmeBaseFragment ameBaseFragment);

    boolean switchEnable(Context context, boolean z);

    boolean switchNetworkCounter(Context context, boolean z);
}
