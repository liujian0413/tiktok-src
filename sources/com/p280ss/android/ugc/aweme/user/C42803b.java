package com.p280ss.android.ugc.aweme.user;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C21683bp;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.profile.UserResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.user.b */
public final class C42803b {
    /* renamed from: a */
    public static UserResponse m135832a(Map<String, String> map) throws Exception {
        String str;
        User user;
        UserResponse userResponse;
        String str2 = "https://api2.musical.ly/aweme/v1/commit/user/";
        if (map.containsKey("mt_update_username")) {
            str2 = "https://api2.musical.ly/passport/login_name/update/";
            map.remove("mt_update_username");
        }
        HashMap hashMap = new HashMap();
        C42811c.m135845a();
        hashMap.put("uid", C42811c.m135870e());
        hashMap.putAll(map);
        if (!str2.equals("https://api2.musical.ly/passport/login_name/update/")) {
            str = C21683bp.m72581a().mo58586b(Integer.MAX_VALUE, str2, hashMap);
        } else {
            str = C21683bp.m72581a().mo58584a(Integer.MAX_VALUE, str2, hashMap);
        }
        C42811c.m135845a();
        User b = C42811c.m135859b();
        if (m135836a(b, map, str)) {
            userResponse = new UserResponse();
            user = b.clone();
            userResponse.setUser(user);
        } else {
            userResponse = (UserResponse) C21683bp.m72581a().mo58581a().mo15974a(str, UserResponse.class);
            user = userResponse.getUser();
            m135835a(b, user, m135834a((Set<String>) new HashSet<String>(map.keySet())));
        }
        if (!(b == null || user == null || (!TextUtils.isEmpty(b.getUid()) && !TextUtils.isEmpty(user.getUid())))) {
            C21227b.m71452a("aweme_user_manager_null_uid", C21101a.m71159a().mo56942a("local_user_json", new C6600e().mo15979b((Object) b)).mo56942a("server_user_json", new C6600e().mo15979b((Object) user)).mo56942a("map", map.toString()).mo56943b());
        }
        return userResponse;
    }

    /* renamed from: a */
    private static Set<String> m135834a(Set<String> set) {
        if (set.contains("avatar_uri")) {
            set.remove("avatar_uri");
            set.add("avatar_larger");
            set.add("avatar_thumb");
            set.add("avatar_medium");
        }
        if (set.contains("video_icon_virtual_URI")) {
            set.remove("video_icon_virtual_URI");
            set.add("video_icon");
        }
        if (set.contains("poi_id")) {
            set.remove("poi_id");
            set.add("school_poi_id");
        }
        return set;
    }

    /* renamed from: a */
    public static User m135833a(String str, boolean z) throws Exception {
        String str2;
        C19290j jVar = new C19290j(str);
        String str3 = "is_after_login";
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        jVar.mo51188a(str3, str2);
        return ((UserResponse) C21683bp.m72581a().mo58581a().mo15974a(C21683bp.m72581a().mo58583a(Integer.MAX_VALUE, jVar.toString()), UserResponse.class)).getUser();
    }

    /* renamed from: a */
    public static UserResponse m135831a(String str, String str2, int i) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("page_from", String.valueOf(i));
        if (!str.equals("unique_id") || !C6399b.m19944t()) {
            hashMap.put(str, str2);
            return m135832a((Map<String, String>) hashMap);
        }
        hashMap.put("login_name", str2);
        hashMap.put("mt_update_username", "mt_update_username");
        return m135832a((Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static void m135835a(User user, User user2, Set<String> set) {
        Field[] declaredFields;
        if (set != null && user != null && !TextUtils.isEmpty(user.getUid())) {
            for (Field field : User.class.getDeclaredFields()) {
                C6593c cVar = (C6593c) field.getAnnotation(C6593c.class);
                if (cVar != null && !set.contains(cVar.mo15949a())) {
                    try {
                        field.setAccessible(true);
                        field.set(user2, field.get(user));
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m135836a(User user, Map<String, String> map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (map.containsKey("login_name")) {
                if (TextUtils.equals(jSONObject.optString("message").toLowerCase(), "success")) {
                    map.put("unique_id", map.get("login_name"));
                    map.remove("login_name");
                    user.setUniqueId(jSONObject.getJSONObject("data").getString("login_name"));
                    user.setHandleModified(new Date().getTime() / 1000);
                    return true;
                } else if (TextUtils.equals(jSONObject.optString("message").toLowerCase(), "error")) {
                    throw new ApiServerException(jSONObject.getJSONObject("data").optInt("error_code")).setErrorMsg(jSONObject.getJSONObject("data").optString("description"));
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
