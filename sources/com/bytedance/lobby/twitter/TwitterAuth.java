package com.bytedance.lobby.twitter;

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
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.lobby.p615b.C12213a;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import java.util.Arrays;

public class TwitterAuth extends TwitterProvider<AuthResult> implements C12201d {

    /* renamed from: c */
    public static final boolean f32531c = C12191a.f32435a;

    /* renamed from: d */
    public LobbyViewModel f32532d;

    /* renamed from: e */
    private TwitterLoginButton f32533e;

    /* renamed from: f */
    private C46821b<C46972t> f32534f;

    /* renamed from: a */
    public final void mo29935a() {
        this.f32533e = null;
    }

    /* renamed from: i */
    private void m35571i() {
        this.f32534f = new C46821b<C46972t>() {
            /* renamed from: a */
            public final void mo29990a(C46830i<C46972t> iVar) {
                TwitterAuth.this.mo29988a((C46972t) iVar.f120123a);
            }

            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                String message = twitterException.getMessage();
                C12195a aVar = new C12195a(TwitterAuth.this.f32494b.f32466b, 1);
                if (Arrays.asList(new String[]{"Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete"}).contains(message)) {
                    aVar.mo29925a(false).mo29923a(new LobbyException(4, message));
                } else {
                    aVar.mo29925a(false).mo29923a(new LobbyException(twitterException));
                }
                TwitterAuth.this.f32532d.mo29956b(aVar.mo29926a());
            }
        };
    }

    /* renamed from: j */
    private static C46972t m35572j() {
        C46939k<C46972t> kVar = C46969q.m146847a().f120510b;
        if (kVar == null || kVar.mo117913a() == null) {
            return null;
        }
        return (C46972t) kVar.mo117913a();
    }

    /* renamed from: b */
    public final String mo29938b() {
        C46972t j = m35572j();
        if (j == null || j.f120356a == null) {
            return null;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) j.f120356a;
        if (twitterAuthToken == null) {
            return null;
        }
        return twitterAuthToken.f120106b;
    }

    /* renamed from: c */
    public final String mo29940c() {
        C46972t j = m35572j();
        if (j == null || j.f120356a == null) {
            return null;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) j.f120356a;
        if (twitterAuthToken == null) {
            return null;
        }
        return twitterAuthToken.f120107c;
    }

    public TwitterAuth(C12203b bVar) {
        super(LobbyCore.getApplication(), bVar);
    }

    /* renamed from: a */
    public final void mo29988a(C46972t tVar) {
        String str = ((TwitterAuthToken) tVar.f120356a).f120106b;
        this.f32532d.mo29956b(new C12195a(this.f32494b.f32466b, 1).mo29925a(true).mo29927b(str).mo29928c(((TwitterAuthToken) tVar.f120356a).f120107c).mo29924a(String.valueOf(tVar.mo118127a())).mo29922a(new C12213a().mo29945a("username", tVar.f120526c).mo29944a()).mo29926a());
    }

    /* renamed from: b */
    public final void mo29939b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12197b.m35462a(this.f32532d, this.f32494b.f32466b);
    }

    /* renamed from: a */
    public final void mo29937a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32532d = LobbyViewModel.m35531a(fragmentActivity);
        if (!mo29951d()) {
            C12197b.m35463a(this.f32532d, this.f32494b.f32466b, 1);
            return;
        }
        this.f32533e = new TwitterLoginButton(fragmentActivity);
        m35571i();
        this.f32533e.setCallback(this.f32534f);
        this.f32533e.performClick();
    }

    /* renamed from: a */
    public final void mo29936a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (this.f32533e != null) {
            this.f32533e.mo117925a(i, i2, intent);
        }
    }
}
