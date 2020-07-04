package com.snapchat.kit.sdk;

import android.content.Context;
import com.snapchat.kit.sdk.creative.C18702a;
import com.snapchat.kit.sdk.creative.CreativeComponent;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;

public class SnapCreative {

    /* renamed from: a */
    static CreativeComponent f50363a;

    public static SnapCreativeKitApi getApi(Context context) {
        return m61137a(context).getApi();
    }

    public static SnapMediaFactory getMediaFactory(Context context) {
        return m61137a(context).getMediaFactory();
    }

    /* renamed from: a */
    private static synchronized CreativeComponent m61137a(Context context) {
        CreativeComponent creativeComponent;
        synchronized (SnapCreative.class) {
            if (f50363a == null) {
                f50363a = C18702a.m61255a().mo49193a(SnapKit.getComponent(context)).mo49192a();
            }
            creativeComponent = f50363a;
        }
        return creativeComponent;
    }
}
