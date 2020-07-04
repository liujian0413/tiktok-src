package com.bytedance.lobby.google;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.AuthResult.C12195a;
import com.bytedance.lobby.auth.C12197b;
import com.bytedance.lobby.auth.C12201d;
import com.bytedance.lobby.auth.C12202e;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.lobby.p615b.C12213a;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.auth.api.signin.C14973a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C14972a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15037d.C15038a;
import com.google.android.gms.common.api.C15045h;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

public class GoogleAuth extends GoogleProvider<AuthResult> implements C12201d {

    /* renamed from: c */
    private static final boolean f32479c = C12191a.f32435a;

    /* renamed from: d */
    private int f32480d;

    /* renamed from: e */
    private Bundle f32481e;

    /* renamed from: a */
    public final void mo29935a() {
    }

    /* renamed from: b */
    public final String mo29938b() {
        return null;
    }

    /* renamed from: c */
    public final String mo29940c() {
        return C12202e.m35475a(this);
    }

    /* renamed from: d */
    public final boolean mo29951d() {
        boolean z;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(LobbyCore.getApplication()) == 0) {
                z = true;
                if (super.mo29951d() || !z) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        z = false;
        if (super.mo29951d()) {
        }
        return false;
    }

    public GoogleAuth(C12203b bVar) {
        super(LobbyCore.getApplication(), bVar);
    }

    /* renamed from: a */
    private boolean m35498a(int i) {
        if (i == 7 || i == 8) {
            int i2 = this.f32480d + 1;
            this.f32480d = i2;
            if (i2 <= 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private GoogleSignInOptions m35494a(Bundle bundle) {
        C14972a aVar = new C14972a(GoogleSignInOptions.f38788f);
        if (bundle.getBoolean("google_request_profile", true)) {
            aVar.mo38093c();
        }
        if (bundle.getBoolean("google_request_id", true)) {
            aVar.mo38088a();
        }
        if (bundle.getBoolean("google_request_email", true)) {
            aVar.mo38092b();
        }
        if (bundle.getBoolean("google_request_id_token", true)) {
            aVar.mo38090a(this.f32494b.f32467c);
        }
        if (bundle.getBoolean("google_request_server_auth_code", false)) {
            aVar.mo38091a(this.f32494b.f32467c, bundle.getBoolean("google_force_refresh_token", false));
        }
        return aVar.mo38094d();
    }

    /* renamed from: b */
    private static LobbyException m35499b(int i) {
        if (i == 13) {
            return new LobbyException(7, i, "The operation failed with no more detailed information from Google");
        }
        switch (i) {
            case 5:
                return new LobbyException(3, i, "The client attempted to connect to the service with an invalid account name specified");
            case 6:
                return new LobbyException(3, i, "Completing the operation requires some form of resolution");
            case 7:
                return new LobbyException(5, i, "Google network error occurred. Retrying should resolve the problem");
            case 8:
                return new LobbyException(3, i, "Google internal error occurred. Retrying should resolve the problem");
            default:
                switch (i) {
                    case 15:
                        return new LobbyException(-999, i, "Timed out while awaiting the result");
                    case 16:
                        return new LobbyException(4, i, "The result was canceled either due to client disconnect or cancel()");
                    default:
                        switch (i) {
                            case 12500:
                                return new LobbyException(3, i, "Sign in failed with the selected Google account. There is nothing user can do to recover from the sign in failure. Switching to another account may or may not help. Check adb log to see details if any");
                            case 12501:
                                return new LobbyException(4, i, "The sign in was cancelled by the user. i.e. user cancelled some of the sign in resolutions, e.g. account picking or OAuth consent");
                            case 12502:
                                return new LobbyException(-999, i, "A sign in process is currently in progress and the current one cannot continue. e.g. the user clicks the SignInButton multiple times and more than one sign in intent was launched");
                            default:
                                StringBuilder sb = new StringBuilder("Unknown error code = ");
                                sb.append(i);
                                sb.append(", check documentation");
                                return new LobbyException(7, i, sb.toString());
                        }
                }
        }
    }

    /* renamed from: a */
    private static C15037d m35495a(FragmentActivity fragmentActivity, GoogleSignInOptions googleSignInOptions) {
        return new C15038a(fragmentActivity).mo38253a(C14941a.f38651e, googleSignInOptions).mo38256a();
    }

    /* renamed from: b */
    public final void mo29939b(FragmentActivity fragmentActivity, Bundle bundle) {
        LobbyViewModel a = LobbyViewModel.m35531a(fragmentActivity);
        if (!mo29951d()) {
            C12197b.m35463a(a, "google", 2);
            return;
        }
        C15037d a2 = m35495a(fragmentActivity, m35494a(bundle));
        if (a2.mo38249j()) {
            C14941a.f38654h.mo38099b(a2).mo38262a((C15045h<? super R>) new C12215a<Object>(a));
        } else {
            a.mo29956b(new C12195a("google", 2).mo29925a(false).mo29923a(new LobbyException(new IllegalStateException("GoogleApiClient is not connected yet"))).mo29926a());
        }
    }

    /* renamed from: a */
    private static void m35496a(FragmentActivity fragmentActivity, GoogleSignInAccount googleSignInAccount) {
        C12195a aVar = new C12195a("google", 1);
        aVar.mo29925a(true).mo29924a(googleSignInAccount.f38763a).mo29922a(new C12213a().mo29945a("email", googleSignInAccount.f38765c).mo29945a("display_name", googleSignInAccount.f38766d).mo29945a("code", googleSignInAccount.f38768f).mo29944a()).mo29927b(googleSignInAccount.f38764b);
        LobbyViewModel.m35531a(fragmentActivity).mo29956b(aVar.mo29926a());
    }

    /* renamed from: a */
    public final void mo29937a(FragmentActivity fragmentActivity, Bundle bundle) {
        LobbyViewModel a = LobbyViewModel.m35531a(fragmentActivity);
        if (!mo29951d()) {
            C12197b.m35463a(a, "google", 1);
            return;
        }
        this.f32481e = bundle;
        fragmentActivity.startActivityForResult(C14941a.f38654h.mo38097a(m35495a(fragmentActivity, m35494a(bundle))), BaseNotice.HASHTAG);
    }

    /* renamed from: a */
    public final void mo29936a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        LobbyException lobbyException;
        ApiException apiException = null;
        try {
            googleSignInAccount = (GoogleSignInAccount) C14973a.m43458a(intent).mo44291a(ApiException.class);
        } catch (ApiException e) {
            apiException = e;
            googleSignInAccount = null;
        }
        if (googleSignInAccount == null) {
            if (apiException != null) {
                int statusCode = apiException.getStatusCode();
                if (m35498a(statusCode)) {
                    mo29937a(fragmentActivity, this.f32481e);
                    return;
                }
                lobbyException = m35499b(statusCode);
            } else {
                lobbyException = new LobbyException(6, "GoogleSignInAccount and ApiException are both null");
            }
            LobbyViewModel.m35531a(fragmentActivity).mo29956b(new C12195a("google", 1).mo29925a(false).mo29923a(lobbyException).mo29926a());
            return;
        }
        m35496a(fragmentActivity, googleSignInAccount);
    }
}
