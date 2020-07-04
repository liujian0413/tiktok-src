package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.host.p453a.C9448i;

public interface IHostShare extends C2324b, C9448i {
    public static final String FACEBOOK = "facebook";
    public static final String FB_LITE = "facebook_lite";
    public static final String INSTAGRAM = "instagram";
    public static final String KAKAO_TALK = "kakao_talk";
    public static final String LINE = "line";
    public static final String MESSENGER = "messenger";

    /* renamed from: QQ */
    public static final String f25909QQ = "qq";
    public static final String QZONE = "qzone";
    public static final String ROCKET = "rocket";
    public static final String ROCKET_TIMELINE = "rocket_timeline";
    public static final String TWITTER = "twitter";

    /* renamed from: VK */
    public static final String f25910VK = "vk";
    public static final String WEIBO = "weibo";
    public static final String WEIXIN = "weixin";
    public static final String WEIXIN_MOMENT = "weixin_moment";
    public static final String WHATS_APP = "whatsapp";

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostShare$a */
    public interface C9431a {
        /* renamed from: a */
        void mo22112a(String str);
    }

    void getShortUrl(String str, C9431a aVar);

    boolean isShareAvailable(String str, Activity activity);

    void share(Activity activity, C9389b bVar, C9388a aVar);

    void showReportDialog(Activity activity, C9389b bVar, String str);

    void showShareDialog(Activity activity, C9389b bVar, C9388a aVar);
}
