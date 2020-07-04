package com.p280ss.android.ugc.aweme.profile.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.p280ss.android.socialbase.downloader.constants.C20195c;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43144k;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.util.i */
public final class C36736i {
    /* renamed from: a */
    public static void m118416a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("tel:");
            sb.append(str);
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m118418a(Context context, String str, String str2) {
        if (!C25371n.m83463a(context, str, true)) {
            C25371n.m83459a(context, str, str2);
        }
    }

    /* renamed from: a */
    public static void m118417a(Context context, String str, User user) {
        String str2;
        String str3;
        if (context != null) {
            DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(context, str);
            if (appDownloadInfo != null && C20195c.m66506b(appDownloadInfo.getStatus())) {
                C10761a.m31409e(context, (int) R.string.ij).mo25750a();
            } else if (Downloader.getInstance(C19491j.m64206a()).isDownloadSuccessAndFileNotExist(appDownloadInfo)) {
                C10761a.m31409e(context, (int) R.string.b6n).mo25750a();
            } else if (appDownloadInfo == null || !C43144k.m136847a(context, appDownloadInfo.getTargetFilePath())) {
                AppDownloader.getInstance().addDownloadTask(new AppTaskBuilder(context, str));
                MobClick value = MobClick.obtain().setEventName("homepage_ad").setLabelName("download_start").setValue(user.getUid());
                C6869c cVar = new C6869c();
                String str4 = "homepage_type";
                if (C36694aa.m118347a(user)) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                C6907h.onEvent(value.setJsonObject(cVar.mo16887a(str4, str2).mo16888b()));
            } else {
                C43144k.m136846a(appDownloadInfo.getTargetFilePath());
                MobClick value2 = MobClick.obtain().setEventName("homepage_ad").setLabelName("click_install").setValue(user.getUid());
                C6869c cVar2 = new C6869c();
                String str5 = "homepage_type";
                if (C36694aa.m118347a(user)) {
                    str3 = "personal_homepage";
                } else {
                    str3 = "others_homepage";
                }
                C6907h.onEvent(value2.setJsonObject(cVar2.mo16887a(str5, str3).mo16888b()));
            }
        }
    }
}
