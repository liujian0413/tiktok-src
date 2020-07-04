package net.openid.appauth;

/* renamed from: net.openid.appauth.d */
final class C48258d {
    /* renamed from: a */
    static void m149701a(AuthorizationManagementActivity authorizationManagementActivity) {
        if (authorizationManagementActivity.f123177a != null) {
            authorizationManagementActivity.mo120602a();
            return;
        }
        try {
            authorizationManagementActivity.mo120602a();
        } catch (NullPointerException unused) {
            authorizationManagementActivity.finish();
        }
    }
}
