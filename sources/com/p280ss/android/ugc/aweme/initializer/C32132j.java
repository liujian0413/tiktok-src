package com.p280ss.android.ugc.aweme.initializer;

import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.initializer.j */
public final class C32132j implements C22200c {

    /* renamed from: a */
    private User f83937a;

    /* renamed from: a */
    public final String mo58558a() {
        return this.f83937a.getUniqueId();
    }

    /* renamed from: b */
    public final String mo58559b() {
        return this.f83937a.getShortId();
    }

    /* renamed from: c */
    public final String mo58560c() {
        return this.f83937a.getUid();
    }

    /* renamed from: d */
    public final boolean mo58561d() {
        return this.f83937a.isSecret();
    }

    /* renamed from: e */
    public final UrlModel mo58562e() {
        return this.f83937a.getAvatarThumb();
    }

    /* renamed from: f */
    public final UrlModel mo58563f() {
        return this.f83937a.getAvatarMedium();
    }

    /* renamed from: g */
    public final String mo58564g() {
        return this.f83937a.getNickname();
    }

    /* renamed from: h */
    public final String mo58565h() {
        return this.f83937a.getCity();
    }

    /* renamed from: i */
    public final int mo58566i() {
        return this.f83937a.getFansCount();
    }

    /* renamed from: j */
    public final boolean mo58567j() {
        return this.f83937a.isFlowcardMember();
    }

    /* renamed from: l */
    public final boolean mo58569l() {
        return this.f83937a.isPostDefaultDownloadSetting();
    }

    /* renamed from: k */
    public final boolean mo58568k() {
        if (this.f83937a.getDownloadSetting() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo58570m() {
        if (this.f83937a.roomId > 0) {
            return true;
        }
        return false;
    }

    public C32132j(User user) {
        this.f83937a = user;
    }
}
