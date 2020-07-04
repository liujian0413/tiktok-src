package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25677e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.j.e */
public final class C28482e {
    /* renamed from: c */
    public static Aweme m93610c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.isForwardAweme()) {
            aweme = aweme.getForwardItem();
        }
        return aweme;
    }

    /* renamed from: d */
    public static boolean m93611d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m93613f(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: l */
    public static boolean m93619l(Aweme aweme) {
        if (aweme == null || !aweme.isPreventDownload()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m93609b(Aweme aweme) {
        if (aweme == null || aweme.getHotListStruct() == null || aweme.getHotListStruct().getType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m93612e(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    /* renamed from: g */
    public static boolean m93614g(Aweme aweme) {
        if (aweme == null || !m93606a(aweme) || !aweme.isProhibited()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m93616i(Aweme aweme) {
        if (!C6399b.m19944t() && aweme != null && aweme.getAwemeRiskModel() != null && aweme.getAwemeRiskModel().isVote()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m93617j(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRiskModel() == null || !aweme.getAwemeRiskModel().isWarn()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m93618k(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null || m93617j(aweme) || !m93621n(aweme) || ((C43168s.m136915g(aweme) && !C43122ff.m136763a(aweme.getAuthorUid())) || m93620m(aweme))) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m93620m(Aweme aweme) {
        int i;
        if (aweme == null || aweme.getVideoControl() == null) {
            i = -1;
        } else {
            i = aweme.getVideoControl().preventDownloadType;
        }
        if (!C6399b.m19944t() || m93606a(aweme) || i != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m93621n(Aweme aweme) {
        if (!(aweme == null || aweme.getAuthor() == null)) {
            int downloadSetting = aweme.getAuthor().getDownloadSetting();
            if (downloadSetting == 3) {
                return m93606a(aweme);
            }
            switch (downloadSetting) {
                case 0:
                    return true;
                case 1:
                    if (C43168s.m136913e(aweme) || m93606a(aweme)) {
                        return true;
                    }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Aweme m93605a(String str) {
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (awemeById == null) {
            awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getProfileSelfSeeAweme(str);
        }
        if (awemeById != null) {
            return awemeById;
        }
        StringBuilder sb = new StringBuilder("getAweme ");
        sb.append(str);
        sb.append(" is null, mock one");
        C6921a.m21552a(6, "DeleteAweme", sb.toString());
        Aweme aweme = new Aweme();
        aweme.setAid(str);
        return aweme;
    }

    /* renamed from: h */
    public static boolean m93615h(Aweme aweme) {
        if (aweme == null || C6399b.m19944t() || !SharePrefCache.inst().isOpenForward() || aweme.getStatus() == null || aweme.getStatus().isDelete() || !aweme.getStatus().isAllowComment() || !aweme.getStatus().isAllowShare() || aweme.getStatus().getPrivateStatus() == 1 || aweme.getStatus().getPrivateStatus() == 2 || aweme.getAuthor() == null || aweme.getAuthor().isSecret() || aweme.isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m93606a(Aweme aweme) {
        User user;
        if (aweme == null) {
            user = null;
        } else {
            user = aweme.getAuthor();
        }
        if (user != null) {
            return TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUser().getUid());
        }
        return false;
    }

    /* renamed from: a */
    public static int m93604a(List<Aweme> list, Aweme aweme) {
        if (aweme == null || aweme.getAid() == null || list == null || list.isEmpty()) {
            return -1;
        }
        String aid = aweme.getAid();
        for (int i = 0; i < list.size(); i++) {
            Aweme aweme2 = (Aweme) list.get(i);
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m93608b(List<Aweme> list, Aweme aweme) {
        if (aweme == null || aweme.getAid() == null || list == null || list.isEmpty()) {
            return -1;
        }
        String aid = aweme.getAid();
        for (int size = list.size() - 1; size >= 0; size--) {
            Aweme aweme2 = (Aweme) list.get(size);
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m93607a(Collection<Aweme> collection, Aweme aweme, List<C25678f> list) {
        if (aweme == null || aweme.getAid() == null || collection == null || collection.isEmpty()) {
            C6921a.m21552a(6, "DeleteAweme", "aweme is null or items is null, delete failed");
            return true;
        }
        int i = -1;
        String aid = aweme.getAid();
        Iterator it = collection.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Aweme aweme2 = (Aweme) it.next();
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                it.remove();
                i = i2;
                break;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder("delete aweme : ");
        sb.append(aid);
        sb.append(", index is ");
        sb.append(i);
        C6921a.m21552a(6, "DeleteAweme", sb.toString());
        if (i >= 0 && !C6307b.m19566a((Collection<T>) list)) {
            for (C25678f fVar : list) {
                if (fVar instanceof C25677e) {
                    ((C25677e) fVar).mo59135a(i);
                }
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }
}
