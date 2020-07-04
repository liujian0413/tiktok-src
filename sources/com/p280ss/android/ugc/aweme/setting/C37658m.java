package com.p280ss.android.ugc.aweme.setting;

import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.m */
final /* synthetic */ class C37658m implements Callable {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f98126a;

    /* renamed from: b */
    private final User f98127b;

    C37658m(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, User user) {
        this.f98126a = i18nSettingManageMyAccountActivity;
        this.f98127b = user;
    }

    public final Object call() {
        return this.f98126a.mo94805c(this.f98127b);
    }
}
