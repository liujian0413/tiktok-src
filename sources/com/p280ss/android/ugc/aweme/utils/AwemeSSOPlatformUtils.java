package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ttplatformsdk.p912c.C20430b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils */
public class AwemeSSOPlatformUtils {

    /* renamed from: a */
    public static final Map<String, String> f111405a;

    /* renamed from: b */
    private static final String f111406b = "AwemeSSOPlatformUtils";

    /* renamed from: com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils$AccountStatusChangedTask */
    static class AccountStatusChangedTask implements LegoTask {
        private AccountStatusChangedTask() {
        }

        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BACKGROUND;
        }

        public void run(Context context) {
            String str;
            C6921a.m21555a("AccountStatusChangedTask");
            User curUser = C21115b.m71197a().getCurUser();
            UrlModel avatarThumb = curUser.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() <= 0) {
                str = "";
            } else {
                str = (String) avatarThumb.getUrlList().get(0);
            }
            C20430b.m67785a(context).mo54978a(curUser.getNickname(), str, C21115b.m71197a().isLogin());
        }
    }

    /* renamed from: b */
    private static String m136206b() {
        return m136203a(C19223b.f51886a);
    }

    /* renamed from: a */
    public static void m136204a() {
        C7121a.m22248b().mo18559a(new AccountStatusChangedTask()).mo18560a();
    }

    static {
        HashMap hashMap = new HashMap();
        f111405a = hashMap;
        hashMap.put("qzone_sns", "qq");
        f111405a.put("weixin", "weixin");
        f111405a.put("sina_weibo", "weibo");
        f111405a.put("mobile", "phone");
        f111405a.put("toutiao", "toutiao");
    }

    /* renamed from: a */
    private static String m136203a(String str) {
        String str2;
        String[] split;
        String str3 = "";
        CookieManager instance = CookieManager.getInstance();
        if (instance == null) {
            str2 = "";
        } else {
            str2 = instance.getCookie(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        for (String str4 : str2.split(";")) {
            if (!TextUtils.isEmpty(str4)) {
                String[] split2 = str4.split("=");
                if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                    return split2[1];
                }
            }
        }
        return str3;
    }

    /* renamed from: a */
    public static void m136205a(Context context, String str, String str2) {
        if (C21115b.m71197a().isLogin()) {
            try {
                C20430b.m67785a(context).mo54977a(str, Long.parseLong(str2), m136206b(), null);
            } catch (Exception unused) {
            }
        }
    }
}
