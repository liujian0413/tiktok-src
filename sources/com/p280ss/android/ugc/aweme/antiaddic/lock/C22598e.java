package com.p280ss.android.ugc.aweme.antiaddic.lock;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22600b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22601c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.MinorSettingData;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1013a.C22587a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockAboutFragmentV2.C22647a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p280ss.android.ugc.aweme.antiaddic.p1011b.C22560b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.e */
public final class C22598e implements C37704a {

    /* renamed from: a */
    public static final C22598e f60167a = new C22598e();

    /* renamed from: b */
    private static final C22601c f60168b;

    /* renamed from: c */
    private static TeenageModeSetting f60169c = m74694p();

    /* renamed from: d */
    private static final C22587a f60170d = new C22587a();

    /* renamed from: e */
    private static String f60171e = "";

    /* renamed from: f */
    private static boolean f60172f;

    private C22598e() {
    }

    /* renamed from: a */
    public static TeenageModeSetting m74675a() {
        return f60169c;
    }

    /* renamed from: b */
    public static boolean m74684b() {
        return f60172f;
    }

    /* renamed from: a */
    public final void mo59219a(C37723b bVar) {
        C7573i.m23587b(bVar, "settings");
        f60169c = new TeenageModeSetting(bVar.f98245C, bVar.f98246D, bVar.f98247E, bVar.f98248F);
        m74691m();
        mo59259i();
        m74678a(f60169c);
        C42961az.m136381b(new C22560b());
    }

    /* renamed from: a */
    public final void mo59220a(Exception exc) {
        C7573i.m23587b(exc, "e");
        m74691m();
    }

    /* renamed from: a */
    public final void mo59252a(FragmentActivity fragmentActivity, int i, boolean z) {
        if (z) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.e8g).mo25750a();
        } else {
            if (i == 0) {
                m74683b(fragmentActivity);
            } else {
                m74689k();
            }
            m74678a(f60169c);
        }
        if (fragmentActivity != null) {
            C22603f.m74724b(fragmentActivity, i);
        }
    }

    /* renamed from: f */
    public static boolean m74687f() {
        int i;
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            i = teenageModeSetting.getMinorControlType();
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static Integer m74688j() {
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            return Integer.valueOf(teenageModeSetting.getMinorControlType());
        }
        return null;
    }

    /* renamed from: m */
    private final void m74691m() {
        if (m74690l()) {
            f60170d.mo59228a();
        }
    }

    /* renamed from: d */
    public final boolean mo59255d() {
        if (mo59256e() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static boolean m74690l() {
        int i;
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            i = teenageModeSetting.getMinorControlType();
        } else {
            i = 0;
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo59254c() {
        boolean z;
        if (m74687f()) {
            TeenageModeSetting teenageModeSetting = f60169c;
            if (teenageModeSetting != null) {
                z = teenageModeSetting.isTeenageModeSelf();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final int mo59256e() {
        if (m74687f()) {
            TeenageModeSetting teenageModeSetting = f60169c;
            if (teenageModeSetting != null) {
                return teenageModeSetting.getTimeLockSelfInMin();
            }
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo59257g() {
        if (mo59254c() || mo59255d()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo59258h() {
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTeenageModeSelf(false);
        }
        TeenageModeSetting teenageModeSetting2 = f60169c;
        if (teenageModeSetting2 != null) {
            teenageModeSetting2.setTimeLockSelfInMin(0);
        }
        TeenageModeSetting teenageModeSetting3 = f60169c;
        if (teenageModeSetting3 != null) {
            teenageModeSetting3.setMinorControlType(0);
        }
        m74678a(f60169c);
    }

    static {
        Object a = C23336d.m76560a(AwemeApplication.m21341a(), C22601c.class);
        C7573i.m23582a(a, "SharedPreferencesHelper.…ePreferences::class.java)");
        f60168b = (C22601c) a;
    }

    /* renamed from: n */
    private final boolean m74692n() {
        int i;
        boolean z;
        TeenageModeSetting p = m74694p();
        if (p != null) {
            i = p.getMinorControlType();
        } else {
            i = 0;
        }
        if (i != 1) {
            TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
            if (userSetting != null) {
                z = userSetting.isContentFilterOn();
            } else {
                z = false;
            }
            if (z || m74693o()) {
                return true;
            }
            return false;
        } else if (p != null) {
            return p.isTeenageModeSelf();
        } else {
            return false;
        }
    }

    /* renamed from: o */
    private static boolean m74693o() {
        TimeLockUserSetting timeLockUserSetting;
        Iterator it = TimeLockRuler.getUserSettingList().iterator();
        while (true) {
            if (!it.hasNext()) {
                timeLockUserSetting = null;
                break;
            }
            timeLockUserSetting = (TimeLockUserSetting) it.next();
            try {
                C7573i.m23582a((Object) timeLockUserSetting, "timeLockUserSetting");
                if (C7573i.m23585a((Object) timeLockUserSetting.getUserId(), (Object) "0")) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        if (timeLockUserSetting != null) {
            return timeLockUserSetting.isContentFilterOn();
        }
        return false;
    }

    /* renamed from: p */
    private static TeenageModeSetting m74694p() {
        String a = f60168b.mo59296a();
        C7573i.m23582a((Object) a, "mPreference.teenageModeSetting");
        if (!TextUtils.isEmpty(a)) {
            try {
                return (TeenageModeSetting) new C6600e().mo15974a(a, TeenageModeSetting.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public final void mo59259i() {
        boolean c = mo59254c();
        boolean n = m74692n();
        if (m74687f() && c != n) {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
            if (!curUser.isUserCancelled()) {
                C22603f.m74713a();
                C25789b.m84757b();
                return;
            }
            f60172f = true;
        }
    }

    /* renamed from: k */
    private static void m74689k() {
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTeenageModeSelf(true);
        }
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl v = a.mo60092v();
        C7573i.m23582a((Object) v, "CommonSharePrefCache.inst().hasOpenTeenMode");
        v.mo59871a(Boolean.valueOf(true));
        IAccountUserService a2 = C21115b.m71197a();
        C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
        C6907h.m21524a("open_teen_mode_finish", (Map) C22984d.m75611a().mo59970a("is_login", a2.isLogin() ? 1 : 0).f60753a);
        C10761a.m31383a(C6399b.m19921a(), (int) R.string.dgs).mo25750a();
        C22603f.m74713a();
        if (!C6399b.m19944t() && !TimeLockRuler.isSelfTimeLockOn()) {
            C23060u a3 = C23060u.m75742a();
            C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
            C22903bl i = a3.mo60079i();
            C7573i.m23582a((Object) i, "CommonSharePrefCache.inst().isForceMinor");
            if (!((Boolean) i.mo59877d()).booleanValue()) {
                TeenageModeSetting teenageModeSetting2 = f60169c;
                if (teenageModeSetting2 != null) {
                    teenageModeSetting2.setTimeLockSelfInMin(40);
                }
            }
        }
        C25789b.m84757b();
    }

    /* renamed from: a */
    public static void m74680a(String str) {
        C7573i.m23587b(str, "<set-?>");
        f60171e = str;
    }

    /* renamed from: a */
    public static void m74678a(TeenageModeSetting teenageModeSetting) {
        f60168b.mo59297a(new C6600e().mo15979b((Object) teenageModeSetting));
    }

    /* renamed from: a */
    public static void m74681a(boolean z) {
        f60172f = false;
    }

    /* renamed from: c */
    private static int m74685c(FragmentActivity fragmentActivity) {
        C0063u a = C0069x.m159a(fragmentActivity).mo147a(TimeLockOptionViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ionViewModel::class.java)");
        C0052o<C22647a> oVar = ((TimeLockOptionViewModel) a).f60314a;
        C7573i.m23582a((Object) oVar, "ViewModelProviders.of(ac…              .optionData");
        C22647a aVar = (C22647a) oVar.getValue();
        if (aVar != null) {
            return aVar.f60283b;
        }
        return 0;
    }

    /* renamed from: b */
    public static String m74682b(String str) {
        C7573i.m23587b(str, "normalCode");
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int parseInt = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(parseInt * parseInt));
            sb.append("dmt");
            String sb2 = sb.toString();
            Charset forName = Charset.forName("UTF-8");
            C7573i.m23582a((Object) forName, "Charset.forName(charsetName)");
            if (sb2 != null) {
                byte[] bytes = sb2.getBytes(forName);
                C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                int length = bytes.length;
                for (int i = 0; i < length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ 5);
                }
                String a = C6306c.m19563a(bytes, 0, bytes.length);
                C7573i.m23582a((Object) a, "DigestUtils.toHexString(data, 0, data.size)");
                return a;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: c */
    private final String m74686c(String str) {
        MinorSettingData minorSettingData = new MinorSettingData();
        minorSettingData.setEventType(3);
        minorSettingData.setEventValue(str);
        minorSettingData.setPassword(m74682b(f60171e));
        String b = new C6600e().mo15979b((Object) C7525m.m23457a(minorSettingData));
        C7573i.m23582a((Object) b, "Gson().toJson(settingList)");
        return b;
    }

    /* renamed from: a */
    public static void m74679a(C22600b bVar) {
        boolean z;
        C7573i.m23587b(bVar, "setting");
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            if (bVar.f60174a == 1) {
                z = true;
            } else {
                z = false;
            }
            teenageModeSetting.setTeenageModeSelf(z);
        }
        TeenageModeSetting teenageModeSetting2 = f60169c;
        if (teenageModeSetting2 != null) {
            teenageModeSetting2.setTimeLockSelfInMin(bVar.f60175b);
        }
        TeenageModeSetting teenageModeSetting3 = f60169c;
        if (teenageModeSetting3 != null) {
            teenageModeSetting3.setMinorControlType(1);
        }
    }

    /* renamed from: b */
    private static void m74683b(FragmentActivity fragmentActivity) {
        int i;
        if (fragmentActivity != null) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.e8m).mo25750a();
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(TimeLockOptionViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ionViewModel::class.java)");
            C0052o<C22647a> oVar = ((TimeLockOptionViewModel) a).f60314a;
            C7573i.m23582a((Object) oVar, "ViewModelProviders.of(ac…              .optionData");
            C22647a aVar = (C22647a) oVar.getValue();
            TeenageModeSetting teenageModeSetting = f60169c;
            int i2 = 0;
            if (teenageModeSetting != null) {
                if (aVar != null) {
                    i = aVar.f60283b;
                } else {
                    i = 0;
                }
                teenageModeSetting.setTimeLockSelfInMin(i);
            }
            String str = "open_time_lock_finish";
            C22984d a2 = C22984d.m75611a();
            String str2 = "set_time";
            if (aVar != null) {
                i2 = aVar.f60283b;
            }
            C6907h.m21524a(str, (Map) a2.mo59970a(str2, i2).f60753a);
        }
    }

    /* renamed from: b */
    public final void mo59253b(boolean z) {
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTeenageModeSelf(false);
        }
        if (z) {
            TeenageModeSetting teenageModeSetting2 = f60169c;
            if (teenageModeSetting2 != null) {
                teenageModeSetting2.setTimeLockSelfInMin(0);
            }
            C6907h.m21524a("close_time_lock_finish", (Map) C22984d.m75611a().f60753a);
        }
        C6907h.m21524a("close_teen_mode_finish", (Map) C22984d.m75611a().f60753a);
        C22603f.m74713a();
        C10761a.m31383a(C6399b.m19921a(), (int) R.string.dgr).mo25750a();
        m74678a(f60169c);
        C25789b.m84757b();
    }

    /* renamed from: a */
    public final void mo59251a(FragmentActivity fragmentActivity) {
        TeenageModeSetting teenageModeSetting = f60169c;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTimeLockSelfInMin(0);
        }
        C6907h.m21524a("close_time_lock_finish", (Map) C22984d.m75611a().f60753a);
        C10761a.m31383a(C6399b.m19921a(), (int) R.string.e8l).mo25750a();
        if (fragmentActivity != null) {
            C22603f.m74727c(fragmentActivity, 0);
        }
        m74678a(f60169c);
    }

    /* renamed from: a */
    private final String m74677a(boolean z, String str) {
        MinorSettingData minorSettingData = new MinorSettingData();
        minorSettingData.setEventType(1);
        minorSettingData.setEventValue(String.valueOf(z ? 1 : 0));
        minorSettingData.setPassword(str);
        List arrayList = new ArrayList();
        arrayList.add(minorSettingData);
        if (!C6399b.m19944t() && z && mo59256e() == 0) {
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl i = a.mo60079i();
            C7573i.m23582a((Object) i, "CommonSharePrefCache.inst().isForceMinor");
            if (!((Boolean) i.mo59877d()).booleanValue()) {
                MinorSettingData minorSettingData2 = new MinorSettingData();
                minorSettingData2.setEventType(2);
                minorSettingData2.setEventValue("40");
                minorSettingData2.setPassword(str);
                arrayList.add(minorSettingData2);
            }
        }
        String b = new C6600e().mo15979b((Object) arrayList);
        C7573i.m23582a((Object) b, "Gson().toJson(settingList)");
        return b;
    }

    /* renamed from: a */
    public final String mo59250a(String str, boolean z) {
        C7573i.m23587b(str, "password");
        MinorSettingData minorSettingData = new MinorSettingData();
        minorSettingData.setEventType(1);
        minorSettingData.setEventValue("0");
        minorSettingData.setPassword(m74682b(str));
        List arrayList = new ArrayList();
        arrayList.add(minorSettingData);
        MinorSettingData minorSettingData2 = new MinorSettingData();
        minorSettingData2.setEventType(2);
        minorSettingData2.setEventValue("0");
        minorSettingData2.setPassword(m74682b(str));
        arrayList.add(minorSettingData2);
        String b = new C6600e().mo15979b((Object) arrayList);
        C7573i.m23582a((Object) b, "Gson().toJson(settingList)");
        return b;
    }

    /* renamed from: a */
    private final String m74676a(boolean z, FragmentActivity fragmentActivity, String str) {
        int i;
        MinorSettingData minorSettingData = new MinorSettingData();
        minorSettingData.setEventType(2);
        if (z) {
            i = m74685c(fragmentActivity);
        } else {
            i = 0;
        }
        minorSettingData.setEventValue(String.valueOf(i));
        minorSettingData.setPassword(str);
        String b = new C6600e().mo15979b((Object) C7525m.m23457a(minorSettingData));
        C7573i.m23582a((Object) b, "Gson().toJson(settingList)");
        return b;
    }

    /* renamed from: a */
    public final String mo59249a(int i, boolean z, String str, boolean z2, FragmentActivity fragmentActivity) {
        C7573i.m23587b(str, "password");
        C7573i.m23587b(fragmentActivity, "activity");
        if (z2) {
            return m74686c(m74682b(str));
        }
        if (i == 0) {
            return m74676a(z, fragmentActivity, m74682b(str));
        }
        return m74677a(z, m74682b(str));
    }
}
