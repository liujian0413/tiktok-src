package com.p280ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.util.aj */
public final class C36725aj {

    /* renamed from: a */
    private static boolean f96386a;

    /* renamed from: a */
    public static String m118394a(int i) {
        switch (i) {
            case 1:
                return "avatar";
            case 2:
                return "nick_name";
            case 3:
                return "all";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m118397a(boolean z) {
        f96386a = z;
    }

    /* renamed from: b */
    private static void m118398b(int i) {
        C6907h.m21524a("profile_update_alert", (Map) C22984d.m75611a().mo59973a("type", m118394a(i)).f60753a);
    }

    /* renamed from: b */
    private static boolean m118399b(boolean z) {
        int intValue = ((Integer) SharePrefCache.inst().getUpdateUserPosition().mo59877d()).intValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            if (intValue == 1 && currentTimeMillis - ((Long) SharePrefCache.inst().getLastCloseUpdateDialogTime().mo59877d()).longValue() > 86400000) {
                return true;
            }
        } else if (intValue == 0 && f96386a && currentTimeMillis - ((Long) SharePrefCache.inst().getLastCloseFeedUpdateDialogTime().mo59877d()).longValue() > ((long) ((Integer) SharePrefCache.inst().getUpdateUserFrequency().mo59877d()).intValue()) * 3600000) {
            f96386a = false;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m118396a(Activity activity, C35999a aVar, Fragment fragment, boolean z) {
        int i;
        if (!C6399b.m19944t() && ((Boolean) SharePrefCache.inst().getIsEnableUpdateUserDialog().mo59877d()).booleanValue()) {
            User curUser = C21115b.m71197a().getCurUser();
            if (!(curUser == null || curUser.getWxTag() == 0 || !m118399b(true))) {
                int wxTag = curUser.getWxTag();
                if (C6900g.m21454b().mo16942c()) {
                    i = 0;
                } else {
                    i = 1000;
                }
                C36726ak akVar = new C36726ak(wxTag, activity, aVar, fragment, true);
                C6726a.m20843a(akVar, i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.ss.android.ugc.aweme.profile.ui.UpdateUserInfoDialog] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5, types: [com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m118395a(int r7, android.app.Activity r8, com.p280ss.android.ugc.aweme.profile.presenter.C35999a r9, android.support.p022v4.app.Fragment r10, boolean r11) {
        /*
            r0 = 1
            if (r7 == r0) goto L_0x0012
            r0 = 3
            if (r7 != r0) goto L_0x0007
            goto L_0x0012
        L_0x0007:
            r9 = 2
            if (r7 != r9) goto L_0x0010
            com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog r9 = new com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog
            r9.<init>(r8, r11)
            goto L_0x001e
        L_0x0010:
            r9 = 0
            goto L_0x001e
        L_0x0012:
            com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog r6 = new com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r6
        L_0x001e:
            if (r9 == 0) goto L_0x002e
            r9.show()     // Catch:{ Exception -> 0x002e }
            r8 = 0
            r9.setCanceledOnTouchOutside(r8)     // Catch:{ Exception -> 0x002e }
            r9.setCancelable(r8)     // Catch:{ Exception -> 0x002e }
            m118398b(r7)     // Catch:{ Exception -> 0x002e }
            return
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.util.C36725aj.m118395a(int, android.app.Activity, com.ss.android.ugc.aweme.profile.presenter.a, android.support.v4.app.Fragment, boolean):void");
    }
}
