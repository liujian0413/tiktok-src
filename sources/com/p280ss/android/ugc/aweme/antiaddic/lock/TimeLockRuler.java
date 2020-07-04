package com.p280ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22602d;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler */
public class TimeLockRuler {
    private static final String TAG = "TimeLockRuler";
    public static boolean sLastContentFilterState;
    private static TimeLockUserSetting setting;

    public static void clearCache() {
        setting = null;
    }

    public static void removeUserSetting() {
        C42961az.m136380a(removeUserSettingWithoutNotify());
    }

    public static String getContentFilterFlagText() {
        return Integer.toString(getContentFilterFlag());
    }

    public static long getLastPasswordSetTime() {
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            return userSetting.getLastSetTime();
        }
        return 0;
    }

    public static String getPassword() {
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            return userSetting.getPassword();
        }
        return "";
    }

    private static C22903bl<String> getSharePrefCache() {
        return C23060u.m75742a().mo60065ai();
    }

    public static int getTeenageModeStatus() {
        if (isInTeenagerModeNewVersion()) {
            return 1;
        }
        return 0;
    }

    public static boolean isTeenModeON() {
        if (C6399b.m19944t() || !isInTeenagerModeNewVersion()) {
            return false;
        }
        return true;
    }

    public static int getContentFilterFlag() {
        if (!isContentFilterOn()) {
            return 0;
        }
        if (isTeenagerAbEnable()) {
            return 2;
        }
        return 1;
    }

    public static int getSelfTimeInMin() {
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            String userId = userSetting.getUserId();
            C42811c.m135845a();
            if (TextUtils.equals(userId, C42811c.m135870e())) {
                return userSetting.getLockTimeInMin();
            }
        }
        return 0;
    }

    public static boolean isInTeenagerModeNewVersion() {
        boolean isRuleValid = isRuleValid();
        boolean isContentFilterOn = isContentFilterOn();
        boolean isTeenagerAbEnable = isTeenagerAbEnable();
        C7163a.m22363a();
        if (!isRuleValid || !isContentFilterOn || !isTeenagerAbEnable) {
            return false;
        }
        return true;
    }

    public static boolean isSelfTimeLockOn() {
        if (C22598e.m74687f()) {
            return C22598e.f60167a.mo59255d();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting == null || !userSetting.isTimeLockOn()) {
            return false;
        }
        return true;
    }

    public static int getLockTimeInMin() {
        if ((ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD || ParentalPlatformConfig.f60133a.mo59214b() == Role.UNLINK_LOCKED) && C21115b.m71197a().isLogin()) {
            return ParentalPlatformConfig.f60133a.mo59217e();
        }
        if (C22598e.m74687f()) {
            return C22598e.f60167a.mo59256e();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting == null) {
            return 0;
        }
        return userSetting.getLockTimeInMin();
    }

    public static synchronized TimeLockUserSetting getUserSetting() {
        TimeLockUserSetting timeLockUserSetting;
        synchronized (TimeLockRuler.class) {
            if (setting == null) {
                Iterator it = getUserSettingList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        TimeLockUserSetting timeLockUserSetting2 = (TimeLockUserSetting) it.next();
                        try {
                            if (C21115b.m71197a().getCurUserId().equals(timeLockUserSetting2.getUserId())) {
                                setting = timeLockUserSetting2;
                                break;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            timeLockUserSetting = setting;
        }
        return timeLockUserSetting;
    }

    public static boolean isParentalPlatformContentFilterOn() {
        if ((ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD || ParentalPlatformConfig.f60133a.mo59214b() == Role.UNLINK_LOCKED) && C21115b.m71197a().isLogin() && ParentalPlatformConfig.f60133a.mo59215c()) {
            return true;
        }
        return false;
    }

    public static boolean isParentalPlatformOn() {
        if (!C21115b.m71197a().isLogin() || (ParentalPlatformConfig.f60133a.mo59214b() != Role.CHILD && ParentalPlatformConfig.f60133a.mo59214b() != Role.PARENT && !ParentalPlatformConfig.f60133a.mo59215c())) {
            return false;
        }
        return true;
    }

    public static boolean isSelfContentFilterOn() {
        if (C22598e.m74687f()) {
            return C22598e.f60167a.mo59254c();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null && userSetting.isContentFilterOn()) {
            String userId = userSetting.getUserId();
            C42811c.m135845a();
            if (TextUtils.equals(userId, C42811c.m135870e())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeenagerAbEnable() {
        if ((ParentalPlatformConfig.f60133a.mo59214b() != Role.CHILD || !C21115b.m71197a().isLogin()) && !C6399b.m19944t() && !C7213d.m22500a().mo18774al()) {
            return false;
        }
        return true;
    }

    public static boolean isTimeLockOn() {
        if (ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD && C21115b.m71197a().isLogin()) {
            return ParentalPlatformConfig.f60133a.mo59216d();
        }
        if (ParentalPlatformConfig.f60133a.mo59214b() != Role.UNLINK_LOCKED || !C21115b.m71197a().isLogin() || !ParentalPlatformConfig.f60133a.mo59216d()) {
            return isSelfTimeLockOn();
        }
        return true;
    }

    public static TimeLockUserSetting removeUserSettingWithoutNotify() {
        List userSettingList = getUserSettingList();
        TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
        timeLockUserSetting.setUserId(C21115b.m71197a().getCurUserId());
        userSettingList.remove(timeLockUserSetting);
        getSharePrefCache().mo59871a(C42996by.m136483a().mo15979b((Object) userSettingList));
        clearCache();
        return timeLockUserSetting;
    }

    public static List<TimeLockUserSetting> getUserSettingList() {
        String str = (String) getSharePrefCache().mo59877d();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        C6600e a = C42996by.m136483a();
        List list = (List) a.mo15975a(str, new C6597a<List<TimeLockUserSetting>>() {
        }.type);
        if (list.size() != 0 && TextUtils.isEmpty(((TimeLockUserSetting) list.get(0)).getUserId())) {
            list.clear();
            try {
                for (C22602d a2 : (List) a.mo15975a(str, new C6597a<List<C22602d>>() {
                }.type)) {
                    list.add(a2.mo59298a());
                }
                getSharePrefCache().mo59871a(a.mo15979b((Object) list));
            } catch (Exception unused) {
                getSharePrefCache().mo59871a("");
            }
        }
        return list;
    }

    public static boolean isContentFilterOn() {
        boolean z;
        if (ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD && C21115b.m71197a().isLogin()) {
            z = ParentalPlatformConfig.f60133a.mo59215c();
        } else if (ParentalPlatformConfig.f60133a.mo59214b() != Role.UNLINK_LOCKED || !C21115b.m71197a().isLogin() || !ParentalPlatformConfig.f60133a.mo59215c()) {
            z = isSelfContentFilterOn();
        } else {
            z = true;
        }
        sLastContentFilterState = z;
        if (z || ((Boolean) C23060u.m75742a().mo60079i().mo59877d()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean isRuleValid() {
        if ((((Boolean) C23060u.m75742a().mo60079i().mo59877d()).booleanValue() || ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD || ParentalPlatformConfig.f60133a.mo59214b() == Role.UNLINK_LOCKED) && C21115b.m71197a().isLogin()) {
            return true;
        }
        if (C22598e.m74687f()) {
            return C22598e.f60167a.mo59257g();
        }
        if (getUserSetting() != null) {
            return true;
        }
        return false;
    }

    public static void removeUnLoginUserSetting() {
        if (setting != null && TextUtils.equals(setting.getUserId(), "0") && setting.isContentFilterOn()) {
            List userSettingList = getUserSettingList();
            if (!C6307b.m19566a((Collection<T>) userSettingList)) {
                TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
                timeLockUserSetting.setUserId("0");
                userSettingList.remove(timeLockUserSetting);
                getSharePrefCache().mo59871a(C42996by.m136483a().mo15979b((Object) userSettingList));
            }
        }
    }

    public static void applyUserSetting(TimeLockUserSetting timeLockUserSetting) {
        List userSettingList = getUserSettingList();
        userSettingList.remove(timeLockUserSetting);
        userSettingList.add(timeLockUserSetting);
        getSharePrefCache().mo59871a(C42996by.m136483a().mo15979b((Object) userSettingList));
        setting = timeLockUserSetting;
        C42961az.m136380a(timeLockUserSetting);
    }

    public static void disableStartActivityIfNeeded(Activity activity) {
        if (isTeenModeON() && activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public static boolean isEnableShowTeenageTip(int i) {
        if (!isTeenModeON()) {
            return false;
        }
        C10761a.m31409e(C6399b.m19921a(), i).mo25750a();
        return true;
    }

    public static void doTeenagerModeAction(Context context, String str, final Runnable runnable) {
        int i;
        if (isSelfContentFilterOn()) {
            C22603f.m74722a((C23469a<Boolean>) new C23469a<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo59227a(Boolean bool) {
                    runnable.run();
                }
            }, str);
        } else if (isParentalPlatformContentFilterOn()) {
            if (TextUtils.equals(str, "add_account")) {
                i = R.string.b31;
            } else {
                i = R.string.b32;
            }
            C10761a.m31409e(context, i).mo25750a();
        } else {
            runnable.run();
        }
    }
}
