package com.p280ss.android.ugc.aweme.feed.share.p1236a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p280ss.android.ugc.aweme.share.C38024d;
import com.p280ss.android.ugc.aweme.share.libra.CloseClientWatermarkExperiment;
import com.p280ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.share.a.a */
public final class C28687a {
    /* renamed from: a */
    private static String m94361a() {
        C22903bl downloadForbiddenToast = SharePrefCache.inst().getDownloadForbiddenToast();
        if (downloadForbiddenToast == null) {
            return null;
        }
        return (String) downloadForbiddenToast.mo59877d();
    }

    /* renamed from: f */
    private static boolean m94371f(Aweme aweme) {
        return aweme.isReviewed();
    }

    /* renamed from: b */
    public static boolean m94366b(Aweme aweme) {
        if (aweme == null || aweme.getDownloadStatus() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m94368c(Aweme aweme) {
        if (m94369d(aweme) || m94370e(aweme)) {
            return true;
        }
        if (aweme == null || !m94363a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m94372g(Aweme aweme) {
        if (aweme.getVideo() == null || !aweme.getVideo().isHasWaterMark()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m94373h(Aweme aweme) {
        if (aweme.getVideo() == null || !aweme.getVideo().hasEndWaterMark() || !MTEndWatermarkExperiment.INSTANCE.enable()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m94374i(Aweme aweme) {
        if (!C23060u.m75742a().mo60049S() || aweme == null || m94371f(aweme) || m94363a(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m94363a(Aweme aweme) {
        return TextUtils.equals(C6861a.m21337f().getCurUserId(), aweme.getAuthorUid());
    }

    /* renamed from: d */
    public static boolean m94369d(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isReviewed() || !aweme.getStatus().isSelfSee() || !((Boolean) C23060u.m75742a().mo60094x().mo59877d()).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m94370e(Aweme aweme) {
        Integer num = (Integer) C23060u.m75742a().mo60048R().mo59877d();
        if (num == null || num.intValue() != 2) {
            return false;
        }
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (aweme == null || currentUser == null || !TextUtils.equals(aweme.getRegion(), currentUser.getRegion()) || m94371f(aweme) || m94363a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m94365b(Context context, Aweme aweme) {
        if (m94374i(aweme) && m94366b(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m94367c(Context context, Aweme aweme) {
        if (!m94374i(aweme)) {
            String a = m94361a();
            if (TextUtils.isEmpty(a)) {
                a = context.getString(R.string.avi);
            }
            C10761a.m31396b(context, a, 1).mo25750a();
            return false;
        } else if (C28482e.m93606a(aweme) || m94366b(aweme)) {
            return true;
        } else {
            C10761a.m31403c(context, context.getString(R.string.b9n)).mo25750a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m94362a(Context context, Aweme aweme) {
        if (!m94374i(aweme)) {
            String a = m94361a();
            if (TextUtils.isEmpty(a)) {
                a = context.getString(R.string.avi);
            }
            AwemeACLStruct.m121220a().setToastMsg(a);
            C38024d.m121365a("", aweme);
            C10761a.m31396b(context, a, 1).mo25750a();
            return false;
        } else if (m94366b(aweme)) {
            return true;
        } else {
            AwemeACLStruct.m121220a().setToastMsg(context.getString(R.string.b9n));
            C38024d.m121365a("", aweme);
            C10761a.m31403c(context, context.getString(R.string.b9n)).mo25750a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m94364a(Aweme aweme, boolean z) {
        boolean z2;
        if (aweme == null || m94369d(aweme) || m94370e(aweme)) {
            return false;
        }
        if (m94372g(aweme) || m94373h(aweme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean f = m94371f(aweme);
        if (m94363a(aweme)) {
            if (!f && CloseClientWatermarkExperiment.INSTANCE.closed()) {
                return false;
            }
            return true;
        } else if (!aweme.isImage() && z2 && !z) {
            return false;
        } else {
            return true;
        }
    }
}
