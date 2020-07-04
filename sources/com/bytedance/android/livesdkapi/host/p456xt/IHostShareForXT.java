package com.bytedance.android.livesdkapi.host.p456xt;

import android.app.Activity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.host.p453a.C9448i;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostShareForXT */
public interface IHostShareForXT extends C2324b, C9448i {
    public static final String FACEBOOK = "facebook";
    public static final String FB_LITE = "facebook_lite";
    public static final String INSTAGRAM = "instagram";
    public static final String KAKAO_TALK = "kakao_talk";
    public static final String LINE = "line";
    public static final String MESSENGER = "messenger";

    /* renamed from: QQ */
    public static final String f25915QQ = "qq";
    public static final String QZONE = "qzone";
    public static final String ROCKET = "rocket";
    public static final String ROCKET_TIMELINE = "rocket_timeline";
    public static final String TWITTER = "twitter";

    /* renamed from: VK */
    public static final String f25916VK = "vk";
    public static final String WEIBO = "weibo";
    public static final String WEIXIN = "weixin";
    public static final String WEIXIN_MOMENT = "weixin_moment";
    public static final String WHATS_APP = "whatsapp";

    boolean isShareAvailable(String str, Activity activity);

    void share(Activity activity, C9389b bVar, C9388a aVar);

    void showShareDialog(Activity activity, C9389b bVar, C9388a aVar);
}
