package com.p280ss.android.ugc.aweme.opensdk.share.share;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.common.BaseShareContext;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.opensdk.share.share.Share.Request;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.systemshare.SysActionSendShareContext;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.a */
public final class C34697a {

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.a$a */
    static class C34698a {

        /* renamed from: a */
        String f90482a;

        C34698a(String str) {
            this.f90482a = str;
        }
    }

    /* renamed from: a */
    public static ShareContext m112006a(Intent intent) {
        Bundle b = m112010b(intent);
        if (b == null) {
            return null;
        }
        return new ShareContext(b);
    }

    /* renamed from: a */
    public static Request m112008a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Request request = new Request();
        request.fromBundle(bundle);
        return request;
    }

    /* renamed from: a */
    public static boolean m112009a(BaseShareContext baseShareContext) {
        if (baseShareContext == null || TextUtils.isEmpty(baseShareContext.mClientKey) || !baseShareContext.mNeedShowDialog) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static Bundle m112010b(Intent intent) {
        Bundle extras = intent.getExtras();
        SysActionSendShareContext sysActionSendShareContext = (SysActionSendShareContext) intent.getParcelableExtra("sys_send_action");
        if (extras != null) {
            if (TextUtils.isEmpty(extras.getString("_aweme_open_sdk_params_client_key")) && sysActionSendShareContext.f99414d) {
                return null;
            }
            if (sysActionSendShareContext != null && !sysActionSendShareContext.f99414d) {
                extras.putString("_open_platform_content_json", new C6600e().mo15979b((Object) new C34698a("system_share")));
            }
        }
        return extras;
    }

    /* renamed from: a */
    public static ShareContext m112007a(Object obj) {
        ShareContext shareContext = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof PhotoContext) {
            String str = ((PhotoContext) obj).mainBusinessData;
            if (!C6319n.m19593a(str)) {
                shareContext = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(str);
            }
        } else if (obj instanceof PhotoMovieContext) {
            String mainBusinessData = ((PhotoMovieContext) obj).getMainBusinessData();
            if (!C6319n.m19593a(mainBusinessData)) {
                shareContext = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(mainBusinessData);
            }
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).getShortVideoContextClass().isInstance(obj)) {
            String shortVideoContextMainBusinessData = ((IAVService) ServiceManager.get().getService(IAVService.class)).getShortVideoContextMainBusinessData(obj);
            if (!C6319n.m19593a(shortVideoContextMainBusinessData)) {
                shareContext = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(shortVideoContextMainBusinessData);
            }
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().instanceOfVideoPublishEditModel(obj)) {
            String mainBusinessData2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(obj).getMainBusinessData();
            if (!C6319n.m19593a(mainBusinessData2)) {
                shareContext = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(mainBusinessData2);
            }
        }
        return shareContext;
    }
}
