package com.p280ss.android.ugc.aweme.miniapp_api.model;

import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.g */
public final class C33463g {

    /* renamed from: a */
    public String f87360a;

    /* renamed from: b */
    public String f87361b;

    /* renamed from: c */
    public String f87362c;

    /* renamed from: a */
    public final C33463g mo85776a(User user) {
        String str;
        String str2;
        String str3;
        if (user != null) {
            str = user.getNickname();
        } else {
            str = "";
        }
        this.f87360a = str;
        if (user != null) {
            str2 = String.valueOf(user.getGender());
        } else {
            str2 = "";
        }
        this.f87362c = str2;
        if (user != null) {
            str3 = user.getUid();
        } else {
            str3 = "";
        }
        this.f87361b = str3;
        return this;
    }
}
