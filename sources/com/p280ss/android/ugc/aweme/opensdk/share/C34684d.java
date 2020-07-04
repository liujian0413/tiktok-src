package com.p280ss.android.ugc.aweme.opensdk.share;

import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.d */
public final class C34684d implements C40231c {

    /* renamed from: a */
    private final String f90459a = "SharePublishServiceExtension";

    /* renamed from: a */
    public final void mo64276a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        C7573i.m23587b(photoContext, "photoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        ShareContext a = ((IAVServiceProxy) service).getBridgeService().mo83145a((Object) photoContext);
        if (a != null) {
            Map map = linkedHashMap;
            String str5 = "open_platform_key";
            if (a.mClientKey == null) {
                str = "";
            } else {
                str = a.mClientKey;
            }
            C7573i.m23582a((Object) str, "if (shareContext.mClient…e shareContext.mClientKey");
            map.put(str5, str);
            String str6 = "open_platform_share_id";
            if (a.mState == null) {
                str2 = "";
            } else {
                str2 = a.mState;
            }
            C7573i.m23582a((Object) str2, "if (shareContext.mState … else shareContext.mState");
            map.put(str6, str2);
            String str7 = "open_platform_extra";
            if (a.mExtras == null) {
                str3 = "";
            } else {
                str3 = a.mExtras;
            }
            C7573i.m23582a((Object) str3, "if (shareContext.mExtras…else shareContext.mExtras");
            map.put(str7, str3);
            String str8 = "open_platform_content";
            if (a.mOpenPlatformContent == null) {
                str4 = "";
            } else {
                str4 = a.mOpenPlatformContent;
            }
            C7573i.m23582a((Object) str4, "if (shareContext.mOpenPl…text.mOpenPlatformContent");
            map.put(str8, str4);
        }
    }

    /* renamed from: a */
    public final void mo64277a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        C7573i.m23587b(baseShortVideoContext, "videoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        ShareContext a = ((IAVServiceProxy) service).getBridgeService().mo83145a((Object) baseShortVideoContext);
        if (a != null) {
            Map map = linkedHashMap;
            String str5 = "open_platform_key";
            if (a.mClientKey == null) {
                str = "";
            } else {
                str = a.mClientKey;
            }
            C7573i.m23582a((Object) str, "if (shareContext.mClient…e shareContext.mClientKey");
            map.put(str5, str);
            String str6 = "open_platform_share_id";
            if (a.mState == null) {
                str2 = "";
            } else {
                str2 = a.mState;
            }
            C7573i.m23582a((Object) str2, "if (shareContext.mState … else shareContext.mState");
            map.put(str6, str2);
            String str7 = "open_platform_extra";
            if (a.mExtras == null) {
                str3 = "";
            } else {
                str3 = a.mExtras;
            }
            C7573i.m23582a((Object) str3, "if (shareContext.mExtras…else shareContext.mExtras");
            map.put(str7, str3);
            String str8 = "open_platform_content";
            if (a.mOpenPlatformContent == null) {
                str4 = "";
            } else {
                str4 = a.mOpenPlatformContent;
            }
            C7573i.m23582a((Object) str4, "if (shareContext.mOpenPl…text.mOpenPlatformContent");
            map.put(str8, str4);
        }
    }
}
