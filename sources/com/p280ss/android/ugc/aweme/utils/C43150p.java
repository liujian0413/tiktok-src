package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.utils.p */
public final class C43150p {
    /* renamed from: a */
    public static UrlModel m136857a(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarLarger() == null) {
            return null;
        }
        C6921a.m21554a((Exception) new IllegalStateException("Your avatar image is too large !"));
        return user.getAvatarLarger();
    }

    /* renamed from: b */
    public static UrlModel m136858b(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarLarger() != null) {
            return user.getAvatarLarger();
        }
        return null;
    }
}
