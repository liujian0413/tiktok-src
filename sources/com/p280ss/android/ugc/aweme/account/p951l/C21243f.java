package com.p280ss.android.ugc.aweme.account.p951l;

import android.content.Context;
import com.bytedance.lobby.internal.C12226d;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.bean.C21150e;
import com.p280ss.android.ugc.aweme.account.login.C21281ad;
import com.p280ss.android.ugc.aweme.account.login.LoginType;
import com.p280ss.android.ugc.aweme.account.util.ThirdLoginSetting;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.l.f */
public final class C21243f {
    /* renamed from: a */
    public static LoginType[] m71502a() {
        LoginType[] loginTypeArr = null;
        if (C21671bd.m72540h().isI18nNewLoginPlatformStrategy()) {
            ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) C6887b.m21436b().mo16895a((Context) C21671bd.m72532b(), "i18n_third_login_strategy", ThirdLoginSetting.class);
            if (thirdLoginSetting != null) {
                loginTypeArr = thirdLoginSetting.getOrder();
            }
        }
        if (loginTypeArr == null) {
            return C21281ad.m71642a();
        }
        return loginTypeArr;
    }

    /* renamed from: a */
    private static boolean m71501a(LoginType loginType) {
        if (loginType == LoginType.GOOGLE) {
            return C12226d.m35546a().mo29969c("google");
        }
        return true;
    }

    /* renamed from: a */
    public static List<C21150e> m71500a(LoginType[] loginTypeArr) {
        C21150e eVar;
        LinkedList linkedList = new LinkedList();
        if (loginTypeArr == null) {
            return linkedList;
        }
        for (LoginType loginType : loginTypeArr) {
            if (m71501a(loginType)) {
                switch (loginType) {
                    case FACEBOOK:
                        eVar = new C21150e("Facebook", R.drawable.wb, "facebook");
                        break;
                    case TWITTER:
                        eVar = new C21150e("Twitter", R.drawable.wg, "twitter");
                        break;
                    case GOOGLE:
                        eVar = new C21150e("Google", R.drawable.wc, "google");
                        break;
                    case LINE:
                        eVar = new C21150e("Line", R.drawable.wf, "line");
                        break;
                    case KAKAOTALK:
                        eVar = new C21150e("Kakao Talk", R.drawable.we, "kakaotalk");
                        break;
                    case INSTAGRAM:
                        eVar = new C21150e("Instagram", R.drawable.wd, "instagram");
                        break;
                    case VK:
                        eVar = new C21150e("VK", R.drawable.wh, "vk");
                        break;
                }
                linkedList.add(eVar);
            }
        }
        return linkedList;
    }
}
