package com.p280ss.android.ugc.aweme.profile.util;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.profile.model.UpdateUserTime;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ai */
public final class C36723ai implements C7162m {
    /* renamed from: b */
    public final void mo18612b() {
    }

    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: a */
    public final void mo18611a() {
        User curUser = C21115b.m71197a().getCurUser();
        if (C6776h.m20947b(C6399b.m19921a()) && !C6399b.m19944t() && C21115b.m71197a().isLogin() && curUser != null && curUser.getWxTag() != 0 && ((Boolean) SharePrefCache.inst().getIsEnableUpdateUserDialog().mo59877d()).booleanValue()) {
            boolean z = true;
            if (((Integer) SharePrefCache.inst().getUpdateUserPosition().mo59877d()).intValue() != 1) {
                long currentTimeMillis = System.currentTimeMillis();
                UpdateUserTime updateUserTime = null;
                try {
                    updateUserTime = (UpdateUserTime) new C6600e().mo15975a((String) SharePrefCache.inst().getAppEnterForegroundTime().mo59877d(), new C6597a<UpdateUserTime>() {
                    }.type);
                } catch (Exception unused) {
                }
                if (updateUserTime == null) {
                    updateUserTime = new UpdateUserTime();
                    updateUserTime.setCount(1);
                    updateUserTime.setCurrentTime(currentTimeMillis);
                } else if (currentTimeMillis - updateUserTime.getCurrentTime() <= 86400000) {
                    updateUserTime.setCount(updateUserTime.getCount() + 1);
                } else {
                    updateUserTime.setCurrentTime(currentTimeMillis);
                    updateUserTime.setCount(1);
                }
                if (updateUserTime.getCount() != 3) {
                    z = false;
                }
                C36725aj.m118397a(z);
                SharePrefCache.inst().getAppEnterForegroundTime().mo59871a(new C6600e().mo15979b((Object) updateUserTime));
            }
        }
    }
}
