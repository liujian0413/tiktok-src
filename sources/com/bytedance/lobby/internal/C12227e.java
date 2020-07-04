package com.bytedance.lobby.internal;

/* renamed from: com.bytedance.lobby.internal.e */
final class C12227e {

    /* renamed from: a */
    static final boolean f32514a = m35553a("com.google.android.gms.auth.api.signin.GoogleSignInClient");

    /* renamed from: b */
    static final boolean f32515b = m35553a("com.facebook.login.LoginManager");

    /* renamed from: c */
    static final boolean f32516c = m35553a("com.linecorp.linesdk.auth.LineLoginApi");

    /* renamed from: d */
    static final boolean f32517d = m35553a("com.twitter.sdk.android.core.identity.TwitterAuthClient");

    /* renamed from: e */
    static final boolean f32518e = m35553a("com.kakao.auth.KakaoSDK");

    /* renamed from: f */
    static final boolean f32519f = m35553a("com.vk.sdk.VKSdk");

    /* renamed from: a */
    private static boolean m35553a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
