package com.p280ss.android.ugc.aweme.profile.util;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.util.al */
public final class C36727al extends C43122ff {
    /* renamed from: a */
    public static Map<String, Boolean> m118402a(User user) {
        boolean z;
        HashMap hashMap = new HashMap();
        hashMap.put("avatar", Boolean.valueOf(user.avatarUpdateReminder()));
        hashMap.put("nickname", Boolean.valueOf(user.nicknameUpdateReminder()));
        hashMap.put("unique_id", Boolean.valueOf(TextUtils.isEmpty(user.getUniqueId())));
        hashMap.put("signature", Boolean.valueOf(TextUtils.isEmpty(user.getSignature())));
        String str = "gender";
        boolean z2 = true;
        if (user.getGender() == 0 && user.getShowGenderStrategy() == 0) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put(str, Boolean.valueOf(z));
        hashMap.put("birthday", Boolean.valueOf(TextUtils.isEmpty(user.getBirthday())));
        String str2 = "location";
        if (user.isHideCity() || !TextUtils.isEmpty(user.getIsoCountryCode()) || !TextUtils.isEmpty(user.getCity())) {
            z2 = false;
        }
        hashMap.put(str2, Boolean.valueOf(z2));
        hashMap.put("school", Boolean.valueOf(TextUtils.isEmpty(user.getSchoolName())));
        return hashMap;
    }

    /* renamed from: a */
    public static float m118400a(Map<String, Boolean> map) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (((Boolean) m118401a(map, "avatar", Boolean.valueOf(true))).booleanValue()) {
            f = 0.0f;
        } else {
            f = ((Float) SharePrefCache.inst().getProfilePerfectionAvatar().mo59877d()).floatValue();
        }
        if (((Boolean) m118401a(map, "nickname", Boolean.valueOf(true))).booleanValue()) {
            f2 = 0.0f;
        } else {
            f2 = ((Float) SharePrefCache.inst().getProfilePerfectionNickname().mo59877d()).floatValue();
        }
        float f9 = f + f2;
        if (((Boolean) m118401a(map, "unique_id", Boolean.valueOf(true))).booleanValue()) {
            f3 = 0.0f;
        } else {
            f3 = ((Float) SharePrefCache.inst().getProfilePerfectionShortId().mo59877d()).floatValue();
        }
        float f10 = f9 + f3;
        if (((Boolean) m118401a(map, "signature", Boolean.valueOf(true))).booleanValue()) {
            f4 = 0.0f;
        } else {
            f4 = ((Float) SharePrefCache.inst().getProfilePerfectionSignature().mo59877d()).floatValue();
        }
        float f11 = f10 + f4;
        if (((Boolean) m118401a(map, "gender", Boolean.valueOf(true))).booleanValue()) {
            f5 = 0.0f;
        } else {
            f5 = ((Float) SharePrefCache.inst().getProfilePerfectionGender().mo59877d()).floatValue();
        }
        float f12 = f11 + f5;
        if (((Boolean) m118401a(map, "birthday", Boolean.valueOf(true))).booleanValue()) {
            f6 = 0.0f;
        } else {
            f6 = ((Float) SharePrefCache.inst().getProfilePerfectionBirthday().mo59877d()).floatValue();
        }
        float f13 = f12 + f6;
        if (((Boolean) m118401a(map, "location", Boolean.valueOf(true))).booleanValue()) {
            f7 = 0.0f;
        } else {
            f7 = ((Float) SharePrefCache.inst().getProfilePerfectionLocation().mo59877d()).floatValue();
        }
        float f14 = f13 + f7;
        if (!((Boolean) m118401a(map, "school", Boolean.valueOf(true))).booleanValue()) {
            f8 = ((Float) SharePrefCache.inst().getProfilePerfectionSchool().mo59877d()).floatValue();
        }
        return f14 + f8;
    }

    /* renamed from: a */
    public static void m118403a(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        long j;
        String str3 = "";
        String str4 = "";
        String str5 = "";
        User curUser = C6861a.m21337f().getCurUser();
        boolean z = false;
        if (curUser == null || !C6861a.m21337f().isLogin()) {
            str2 = str4;
            str = str5;
            j = -1;
        } else {
            j = Long.parseLong(C6861a.m21337f().getCurUserId());
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str2 = curUser.getShortId();
            } else {
                str2 = curUser.getUniqueId();
            }
            str = curUser.getBindPhone();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (!(avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().isEmpty())) {
                jSONObject.put("avatar_url", avatarMedium.getUrlList().get(0));
            }
            z = true;
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", str3);
        jSONObject.put("unique_id", str2);
        jSONObject.put("bind_phone", str);
        jSONObject.put("code", 1);
        Long b = C24995f.m82309b(curUser);
        if (b != null) {
            jSONObject.put("decoration_id", b);
        }
    }

    /* renamed from: a */
    private static <K, V> V m118401a(Map<K, V> map, K k, V v) {
        V v2 = map.get(k);
        if (v2 != null || map.containsKey(k)) {
            return v2;
        }
        return v;
    }
}
