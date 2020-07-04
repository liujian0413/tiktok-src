package com.p280ss.android.ugc.aweme.commerce.service.p1113g;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.g.a */
public final class C24449a {
    /* renamed from: a */
    public static String m80375a(String str) {
        String[] split = str.split("[.]");
        if (split.length < 2) {
            return str;
        }
        String str2 = split[1];
        if (TextUtils.equals(str2, "00")) {
            str = split[0];
        } else if (str2.endsWith("0")) {
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str2.charAt(0));
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public static CommerceUser m80374a(User user) {
        String str;
        if (user == null) {
            return null;
        }
        CommerceUser commerceUser = new CommerceUser();
        commerceUser.setAvatarMedium(user.getAvatarMedium());
        commerceUser.setHasOrders(user.isHasOrders());
        commerceUser.setNickname(user.getNickname());
        if (TextUtils.isEmpty(user.getUid())) {
            str = "";
        } else {
            str = user.getUid();
        }
        commerceUser.setUid(str);
        commerceUser.setVerifyStatus(user.getVerifyStatus());
        commerceUser.setBindPhone(user.getBindPhone());
        commerceUser.setWithCommerceRights(user.isWithCommerceEntry());
        commerceUser.setWithShopEntry(user.isWithFusionShopEntry());
        commerceUser.setWithNewGoods(user.isWithNewGoods());
        commerceUser.setWithCommerceNewbieTask(user.isWithCommerceNewbieTask());
        commerceUser.setWithItemCommerceEntry(user.isWithItemCommerceEntry());
        commerceUser.setShopMicroApp(user.getShopMicroApp());
        commerceUser.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
        return commerceUser;
    }
}
