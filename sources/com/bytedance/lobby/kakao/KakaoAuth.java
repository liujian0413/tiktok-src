package com.bytedance.lobby.kakao;

import android.app.Activity;
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
import com.bytedance.lobby.internal.LobbyViewModel;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.auth.AuthService;
import com.kakao.auth.AuthType;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;

public class KakaoAuth extends KakaoProvider<AuthResult> implements C12201d {

    /* renamed from: c */
    public static final boolean f32520c = C12191a.f32435a;

    /* renamed from: d */
    public LobbyViewModel f32521d;

    /* renamed from: e */
    private ISessionCallback f32522e;

    /* renamed from: a */
    public final void mo29935a() {
    }

    /* renamed from: c */
    public final String mo29940c() {
        return C12202e.m35475a(this);
    }

    /* renamed from: b */
    public final String mo29938b() {
        if (KakaoSDK.getAdapter() != null) {
            Session currentSession = Session.getCurrentSession();
            if (currentSession != null) {
                AccessToken tokenInfo = currentSession.getTokenInfo();
                if (tokenInfo == null) {
                    return null;
                }
                return tokenInfo.getAccessToken();
            }
        }
        return null;
    }

    public KakaoAuth(C12203b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo29971a(LobbyException lobbyException) {
        this.f32521d.mo29956b(new C12195a(this.f32494b.f32466b, 1).mo29925a(false).mo29923a(lobbyException).mo29926a());
    }

    /* renamed from: a */
    public final void mo29937a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32521d = LobbyViewModel.m35531a(fragmentActivity);
        if (!mo29951d()) {
            C12197b.m35463a(this.f32521d, this.f32494b.f32466b, 1);
            return;
        }
        this.f32522e = new ISessionCallback() {
            public final void onSessionOpened() {
                final Session currentSession = Session.getCurrentSession();
                if (currentSession != null) {
                    AuthService.getInstance().requestAccessTokenInfo(new ApiResponseCallback<AccessTokenInfoResponse>() {
                        public final void onNotSignedUp() {
                            KakaoAuth.this.mo29971a(new LobbyException(-999, "KakaoSDK ApiResponseCallback onNotSignedUp"));
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void onSuccess(AccessTokenInfoResponse accessTokenInfoResponse) {
                            if (accessTokenInfoResponse == null) {
                                KakaoAuth.this.mo29971a(new LobbyException(3, "KakaoSDK ApiResponseCallback onSuccess called, but AccessTokenInfoResponse is null."));
                            } else {
                                KakaoAuth.this.mo29972a(currentSession, accessTokenInfoResponse);
                            }
                        }

                        public final void onFailure(ErrorResult errorResult) {
                            LobbyException lobbyException;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                lobbyException = new LobbyException(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                lobbyException = new LobbyException(3, "KakaoSDK ApiResponseCallback onFailure with no ErrorResult");
                            }
                            kakaoAuth.mo29971a(lobbyException);
                        }

                        public final void onFailureForUiThread(ErrorResult errorResult) {
                            LobbyException lobbyException;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                lobbyException = new LobbyException(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                lobbyException = new LobbyException(3, "KakaoSDK ApiResponseCallback onFailureForUiThread with no ErrorResult");
                            }
                            kakaoAuth.mo29971a(lobbyException);
                        }

                        public final void onSessionClosed(ErrorResult errorResult) {
                            LobbyException lobbyException;
                            KakaoAuth kakaoAuth = KakaoAuth.this;
                            if (errorResult != null) {
                                lobbyException = new LobbyException(errorResult.getErrorCode(), errorResult.getErrorMessage());
                            } else {
                                lobbyException = new LobbyException(3, "KakaoSDK ApiResponseCallback onSessionClosed with no ErrorResult");
                            }
                            kakaoAuth.mo29971a(lobbyException);
                        }
                    });
                }
            }

            public final void onSessionOpenFailed(KakaoException kakaoException) {
                KakaoAuth.this.f32521d.mo29956b(new C12195a(KakaoAuth.this.f32494b.f32466b, 1).mo29925a(false).mo29923a(new LobbyException(kakaoException).setCancelled(true)).mo29926a());
            }
        };
        Session.getCurrentSession().addCallback(this.f32522e);
        Session.getCurrentSession().checkAndImplicitOpen();
        Session.getCurrentSession().open(AuthType.KAKAO_LOGIN_ALL, (Activity) fragmentActivity);
    }

    /* renamed from: b */
    public final void mo29939b(FragmentActivity fragmentActivity, Bundle bundle) {
        if (Session.getCurrentSession().isOpened()) {
            Session.getCurrentSession().close();
            this.f32521d.mo29956b(new C12195a(this.f32494b.f32466b, 1).mo29925a(true).mo29926a());
        }
    }

    /* renamed from: a */
    public final void mo29972a(Session session, AccessTokenInfoResponse accessTokenInfoResponse) {
        this.f32521d.mo29956b(new C12195a(this.f32494b.f32466b, 1).mo29925a(true).mo29927b(session.getTokenInfo().getAccessToken()).mo29921a(System.currentTimeMillis() + accessTokenInfoResponse.getExpiresInMillis()).mo29924a(String.valueOf(accessTokenInfoResponse.getUserId())).mo29926a());
    }

    /* renamed from: a */
    public final void mo29936a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (this.f32522e != null) {
            Session.getCurrentSession().handleActivityResult(i, i2, intent);
        }
    }
}
