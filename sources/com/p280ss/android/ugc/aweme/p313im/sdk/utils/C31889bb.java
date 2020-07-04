package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.text.TextUtils;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession.VerifyType;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bb */
public final class C31889bb {
    /* renamed from: a */
    public static boolean m103602a(IMUser iMUser) {
        if (iMUser == null || !C6956a.m21633b().isUserVerified(iMUser)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m103604c(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m103603b(IMUser iMUser) {
        if (iMUser == null || !TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason()) || iMUser.getVerificationType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m103600a(ImageView imageView, VerifyType verifyType) {
        imageView.setVisibility(0);
        switch (verifyType) {
            case MUSICIAN:
                imageView.setImageResource(R.drawable.b5v);
                return;
            case ENTERPRISE:
                imageView.setImageResource(R.drawable.b5w);
                return;
            case OTHER:
                imageView.setImageResource(R.drawable.b5n);
                return;
            default:
                imageView.setVisibility(4);
                return;
        }
    }

    /* renamed from: a */
    public static boolean m103601a(ImageView imageView, IMUser iMUser) {
        imageView.setVisibility(0);
        if (m103603b(iMUser)) {
            imageView.setImageResource(R.drawable.b5v);
        } else if (m103604c(iMUser)) {
            imageView.setImageResource(R.drawable.b5w);
        } else if (m103602a(iMUser)) {
            imageView.setImageResource(R.drawable.b5n);
        } else {
            imageView.setVisibility(4);
            return false;
        }
        return true;
    }
}
