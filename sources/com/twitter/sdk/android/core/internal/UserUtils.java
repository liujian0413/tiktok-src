package com.twitter.sdk.android.core.internal;

import android.text.TextUtils;
import com.twitter.sdk.android.core.models.User;

public final class UserUtils {

    public enum AvatarSize {
        NORMAL("_normal"),
        BIGGER("_bigger"),
        MINI("_mini"),
        ORIGINAL("_original"),
        REASONABLY_SMALL("_reasonably_small");
        
        public final String suffix;

        private AvatarSize(String str) {
            this.suffix = str;
        }
    }

    /* renamed from: a */
    public static CharSequence m146549a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if (charSequence.charAt(0) == '@') {
            return charSequence;
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(charSequence);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m146550a(User user, AvatarSize avatarSize) {
        if (user == null || user.profileImageUrlHttps == null) {
            return null;
        }
        String str = user.profileImageUrlHttps;
        if (avatarSize == null || str == null) {
            return str;
        }
        switch (avatarSize) {
            case NORMAL:
            case BIGGER:
            case MINI:
            case ORIGINAL:
            case REASONABLY_SMALL:
                return str.replace(AvatarSize.NORMAL.suffix, avatarSize.suffix);
            default:
                return str;
        }
    }
}
