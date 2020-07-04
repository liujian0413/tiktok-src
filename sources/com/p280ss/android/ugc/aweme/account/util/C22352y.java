package com.p280ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.bean.C21350a;
import com.p280ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.util.y */
public final class C22352y {
    /* renamed from: a */
    private static void m74016a(C1592h<User> hVar) {
        String str;
        if (hVar.mo6889d()) {
            String str2 = "";
            if (hVar.mo6891f() instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) hVar.mo6891f();
                str2 = String.valueOf(apiServerException.getErrorCode());
                str = apiServerException.getErrorMsg();
            } else {
                str = hVar.mo6891f().getMessage();
            }
            AccountLoginAlogHelper.m71518a(str2, str, ALogLoginPart.REFRESH_AWEME_USER, null, "");
        } else if (hVar.mo6890e() != null) {
            AccountLoginAlogHelper.m71514a(ALogLoginPart.REFRESH_AWEME_USER, null, ((User) hVar.mo6890e()).getUid());
        } else {
            AccountLoginAlogHelper.m71518a("", "user == null", ALogLoginPart.REFRESH_AWEME_USER, null, "");
        }
    }

    /* renamed from: a */
    private static void m74018a(String str, CachedUserAgeInfo cachedUserAgeInfo) {
        HashMap hashMap;
        String i = C22345t.m73979i();
        if (TextUtils.isEmpty(i)) {
            hashMap = new HashMap();
            hashMap.put(str, cachedUserAgeInfo);
        } else {
            try {
                hashMap = (HashMap) new C6600e().mo15975a(i, new C6597a<HashMap<String, CachedUserAgeInfo>>() {
                }.type);
            } catch (Exception unused) {
                hashMap = null;
            }
            if (hashMap != null) {
                hashMap.put(str, cachedUserAgeInfo);
            }
        }
        C22345t.m73959a(new C6600e().mo15979b((Object) hashMap));
    }

    /* renamed from: a */
    private static void m74017a(String str) {
        HashMap hashMap;
        try {
            hashMap = (HashMap) new C6600e().mo15975a(C22345t.m73979i(), new C6597a<HashMap<String, CachedUserAgeInfo>>() {
            }.type);
        } catch (Exception unused) {
            hashMap = null;
        }
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), str)) {
                    hashMap.remove(entry.getKey());
                    break;
                }
            }
            C22345t.m73959a(new C6600e().mo15979b((Object) hashMap));
        }
    }

    /* renamed from: e */
    public static boolean m74024e() {
        return C22345t.m73978h();
    }

    /* renamed from: c */
    public static boolean m74022c() {
        IAccountUserService a = C21671bd.m72520a();
        if (!a.isLogin() || a.getCurUser().getUserMode() != 2 || !C22345t.m73982j()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m74023d() {
        IAccountUserService a = C21671bd.m72520a();
        if (!a.isLogin() || a.getCurUser().getUserMode() != 2 || !C22345t.m73984k()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m74020b() {
        if (C30199h.m98861a().getEnableNewUserInfoSync().booleanValue()) {
            CachedUserAgeInfo g = m74026g();
            if (C21671bd.m72539g() && g != null) {
                m74013a(g.getBirthday(), g.getUserMode(), true);
            }
        }
    }

    /* renamed from: f */
    public static boolean m74025f() {
        IAccountUserService a = C21671bd.m72520a();
        if (!a.isLogin() || C20098b.m66270a().mo53819a("facebook") || C20098b.m66270a().mo53819a("google") || a.getCurUser().getUserMode() != 0 || C22345t.m73973f() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C1592h<C21350a> m74011a() {
        if (C30199h.m98861a().getEnableNewUserInfoSync().booleanValue()) {
            CachedUserAgeInfo g = m74026g();
            if (g != null) {
                return m74013a(g.getBirthday(), g.getUserMode(), true);
            }
        }
        return C1592h.m7853a(C22317aa.f59586a);
    }

    /* renamed from: g */
    private static CachedUserAgeInfo m74026g() {
        HashMap hashMap;
        try {
            hashMap = (HashMap) new C6600e().mo15975a(C22345t.m73979i(), new C6597a<HashMap<String, CachedUserAgeInfo>>() {
            }.type);
        } catch (Exception unused) {
            hashMap = null;
        }
        if (hashMap != null) {
            for (Entry entry : hashMap.entrySet()) {
                if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), C21671bd.m72536d())) {
                    return (CachedUserAgeInfo) entry.getValue();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1592h<Bundle> m74019b(Bundle bundle) {
        return C1592h.m7853a((Callable<TResult>) new C22318ab<TResult>(bundle)).mo6876a((C1591g<TResult, TContinuationResult>) new C22319ac<TResult,TContinuationResult>(bundle), C1592h.f5958b);
    }

    /* renamed from: a */
    public static C1592h<C21350a> m74012a(Bundle bundle) {
        AgeGateResponse ageGateResponse;
        if (bundle.getSerializable("age_gate_response") != null) {
            ageGateResponse = (AgeGateResponse) bundle.getSerializable("age_gate_response");
        } else {
            ageGateResponse = null;
        }
        if (ageGateResponse != null) {
            int i = 1;
            if (C22345t.m73973f() == 1) {
                if (!ageGateResponse.is_eligible()) {
                    i = 2;
                }
                bundle.putInt("user_mode", i);
                if (C30199h.m98861a().getEnableNewUserInfoSync().booleanValue()) {
                    return m74013a(C22323b.m73914a(), i, false);
                }
                return new MusLoginManager().mo57206a(i);
            }
        }
        if (C30199h.m98861a().getEnableNewUserInfoSync().booleanValue()) {
            return m74013a(C22323b.m73914a(), -1, false);
        }
        return C1592h.m7853a(C22356z.f59620a);
    }

    /* renamed from: c */
    static final /* synthetic */ User m74021c(Bundle bundle) throws Exception {
        try {
            User queryUser = C21671bd.m72520a().queryUser(null, true);
            C21231d.m71463a(true, 0, "", bundle);
            if (C22345t.m73973f() == 1 && queryUser.getUserMode() == 0) {
                SharedPreferences a = C7285c.m22838a(C21671bd.m72532b(), "aweme_user", 0);
                int i = bundle.getInt("user_mode", -1);
                if (i != 2) {
                    if (i != 1) {
                        StringBuilder sb = new StringBuilder("ftc_user_mode_prefix_");
                        sb.append(queryUser.getUid());
                        int i2 = a.getInt(sb.toString(), 0);
                        if (i2 == 2 || i2 == 1) {
                            queryUser.setUserMode(i2);
                        }
                    }
                }
                queryUser.setUserMode(i);
                Editor edit = a.edit();
                StringBuilder sb2 = new StringBuilder("ftc_user_mode_prefix_");
                sb2.append(queryUser.getUid());
                edit.putInt(sb2.toString(), i).commit();
            }
            return queryUser;
        } catch (ApiServerException e) {
            C21231d.m71463a(false, e.getErrorCode(), e.getErrorMsg(), bundle);
            if (e.getErrorCode() == 9) {
                C21671bd.m72520a().setUserBanned();
            } else if (e.getErrorCode() == 14) {
                C21671bd.m72520a().setUserLogicDelete(e.getErrorMsg());
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static String m74015a(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    /* renamed from: a */
    static final /* synthetic */ Bundle m74010a(Bundle bundle, C1592h hVar) throws Exception {
        m74016a(hVar);
        if (!hVar.mo6889d()) {
            if (hVar.mo6890e() != null) {
                C21671bd.m72520a().queryUserSync((User) hVar.mo6890e());
            }
            return bundle;
        }
        throw hVar.mo6891f();
    }

    /* renamed from: a */
    private static C1592h<C21350a> m74013a(String str, int i, boolean z) {
        MusLoginManager musLoginManager = new MusLoginManager();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("birthday", str);
        }
        if (i != -1) {
            hashMap.put("user_mode", String.valueOf(i));
        }
        if (hashMap.containsKey("birthday")) {
            return musLoginManager.mo57207a(hashMap).mo6880b(new C22320ad(str, i, z), C1592h.f5957a);
        }
        return C1592h.m7853a(C22321ae.f59592a);
    }

    /* renamed from: a */
    static final /* synthetic */ C1592h m74014a(String str, int i, boolean z, C1592h hVar) throws Exception {
        int i2;
        if (hVar.mo6889d() || hVar.mo6887c() || !(((C21350a) hVar.mo6890e()).f57342a == 0 || ((C21350a) hVar.mo6890e()).f57342a == 5)) {
            m74018a(C21671bd.m72536d(), new CachedUserAgeInfo(str, i));
            String str2 = "compliance_api_status";
            String str3 = "";
            C21101a a = C21101a.m71159a().mo56942a("type", "/aweme/v1/user/info/sync/").mo56940a("error_message", Integer.valueOf(((C21350a) hVar.mo6890e()).f57342a));
            String str4 = "status";
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            C21227b.m71451a(str2, str3, a.mo56940a(str4, Integer.valueOf(i2)).mo56943b());
            C22323b.m73915a("");
        } else if (hVar.mo6882b() && (((C21350a) hVar.mo6890e()).f57342a == 0 || ((C21350a) hVar.mo6890e()).f57342a == 5)) {
            if (z) {
                m74017a(C21671bd.m72536d());
            } else {
                C22323b.m73915a("");
            }
            C21227b.m71451a("compliance_api_status", "", C21101a.m71159a().mo56942a("type", "/aweme/v1/user/info/sync/").mo56940a("status", Integer.valueOf(0)).mo56943b());
        }
        return C1592h.m7853a(C22322af.f59593a);
    }
}
