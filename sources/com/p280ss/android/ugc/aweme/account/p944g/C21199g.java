package com.p280ss.android.ugc.aweme.account.p944g;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12198c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.g.g */
public final class C21199g {

    /* renamed from: a */
    public static final C21199g f56979a = new C21199g();

    private C21199g() {
    }

    /* renamed from: a */
    public static final String m71367a(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f32447j.getString("code");
        }
        return "";
    }

    /* renamed from: b */
    public static final String m71371b(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f32447j.getString("profile_key");
        }
        return "";
    }

    /* renamed from: d */
    public static final String m71374d(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        return m71373c(authResult.f32441d);
    }

    /* renamed from: a */
    public static final String m71368a(C12198c cVar) {
        if (cVar == null) {
            return "";
        }
        return m71373c(cVar.f32458b);
    }

    /* renamed from: a */
    public static final String m71369a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1240244679:
                    if (str.equals("google")) {
                        return "google";
                    }
                    break;
                case -916346253:
                    if (str.equals("twitter")) {
                        return "twitter";
                    }
                    break;
                case 3765:
                    if (str.equals("vk")) {
                        return "vk";
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        return "line";
                    }
                    break;
                case 28903346:
                    if (str.equals("instagram")) {
                        return "instagram";
                    }
                    break;
                case 486515695:
                    if (str.equals("kakaotalk")) {
                        return "kakaotalk";
                    }
                    break;
                case 497130182:
                    if (str.equals("facebook")) {
                        return "facebook";
                    }
                    break;
            }
        }
        return "";
    }

    /* renamed from: b */
    public static final Bundle m71370b(String str) {
        C7573i.m23587b(str, "providerId");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        int hashCode = str.hashCode();
        if (hashCode != 28903346) {
            if (hashCode == 497130182 && str.equals("facebook")) {
                bundle.putString("fb_read_permissions", "public_profile, user_friends, user_age_range, email");
                return bundle;
            }
        } else if (str.equals("instagram")) {
            bundle.putString("ig_redirect_url", "https://api2.musical.ly/passport/auth/wap_login_success/");
            return bundle;
        }
        return null;
    }

    /* renamed from: c */
    public static final String m71372c(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        String str = authResult.f32441d;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1240244679) {
                if (hashCode != -916346253) {
                    if (hashCode != 3765) {
                        if (hashCode != 28903346) {
                            if (hashCode == 497130182 && str.equals("facebook")) {
                                return "310";
                            }
                        } else if (str.equals("instagram")) {
                            return "312";
                        }
                    } else if (str.equals("vk")) {
                        return "334";
                    }
                } else if (str.equals("twitter")) {
                    return "313";
                }
            } else if (str.equals("google")) {
                return "311";
            }
        }
        return "";
    }

    /* renamed from: c */
    private static String m71373c(String str) {
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    return "google";
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    return "twitter";
                }
                break;
            case 3765:
                if (str.equals("vk")) {
                    return "vk";
                }
                break;
            case 3321844:
                if (str.equals("line")) {
                    return "line";
                }
                break;
            case 28903346:
                if (str.equals("instagram")) {
                    return "instagram";
                }
                break;
            case 486515695:
                if (str.equals("kakaotalk")) {
                    return "kakaotalk";
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    return "facebook";
                }
                break;
        }
        return "";
    }
}
