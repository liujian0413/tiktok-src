package com.bytedance.lobby.p616vk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.AuthResult.C12195a;
import com.bytedance.lobby.auth.C12197b;
import com.bytedance.lobby.auth.C12201d;
import com.bytedance.lobby.auth.C12202e;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.p1848vk.sdk.C47106a;
import com.p1848vk.sdk.C47216b;
import com.p1848vk.sdk.VKSdk;
import com.p1848vk.sdk.api.C47121c;
import java.util.Locale;

/* renamed from: com.bytedance.lobby.vk.VkAuth */
public class VkAuth extends VkProvider<AuthResult> implements C12201d, C47216b<C47106a> {

    /* renamed from: c */
    private static final boolean f32538c = C12191a.f32435a;

    /* renamed from: d */
    private static final String[] f32539d = {"offline", "wall", "photos", "friends"};

    /* renamed from: e */
    private LobbyViewModel f32540e;

    /* renamed from: a */
    public final void mo29935a() {
    }

    /* renamed from: c */
    public final String mo29940c() {
        return C12202e.m35475a(this);
    }

    /* renamed from: b */
    public final String mo29938b() {
        if (!VKSdk.m147270d()) {
            return null;
        }
        return C47106a.m147288b().f120883a;
    }

    public VkAuth(C12203b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    private static boolean m35584a(String[] strArr) {
        if (!VKSdk.m147270d()) {
            return false;
        }
        try {
            return C47106a.m147288b().mo118387a(strArr);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29992a(C47106a aVar) {
        String str;
        long j;
        if (aVar == null || TextUtils.isEmpty(aVar.f120883a)) {
            StringBuilder sb = new StringBuilder();
            if (aVar != null) {
                str = "accessToken ";
            } else {
                str = "VKAccessToken ";
            }
            sb.append(str);
            sb.append("== null");
            this.f32540e.mo29956b(new C12195a(this.f32494b.f32466b, 1).mo29925a(false).mo29923a(new LobbyException(3, sb.toString())).mo29926a());
            return;
        }
        C12195a b = new C12195a(this.f32494b.f32466b, 1).mo29925a(true).mo29927b(aVar.f120883a);
        if (aVar.f120884b > 0) {
            j = System.currentTimeMillis() + ((long) aVar.f120884b);
        } else {
            j = 0;
        }
        this.f32540e.mo29956b(b.mo29921a(j).mo29924a(aVar.f120885c).mo29926a());
    }

    /* renamed from: a */
    public final void mo29991a(C47121c cVar) {
        C12195a a = new C12195a(this.f32494b.f32466b, 1).mo29925a(false);
        if (cVar != null && cVar.f120923d == -102) {
            a.mo29923a(new LobbyException(4, cVar.f120924e));
        } else if (cVar == null) {
            a.mo29923a(new LobbyException(3, "VKCallback.onError called with null VKError parameter"));
        } else {
            a.mo29923a(new LobbyException(cVar.f120923d, C1642a.m8035a(Locale.US, "errorMessage: %s, errorReason: %s", new Object[]{cVar.f120924e, cVar.f120925f})));
        }
        this.f32540e.mo29956b(a.mo29926a());
    }

    /* renamed from: b */
    public final void mo29939b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12197b.m35462a(this.f32540e, this.f32494b.f32466b);
    }

    /* renamed from: a */
    public final void mo29937a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32540e = LobbyViewModel.m35531a(fragmentActivity);
        if (!mo29951d()) {
            C12197b.m35463a(this.f32540e, this.f32494b.f32466b, 1);
        } else if (!m35584a(f32539d)) {
            VKSdk.m147252a((Activity) fragmentActivity, f32539d);
        } else {
            mo29992a(C47106a.m147288b());
        }
    }

    /* renamed from: a */
    public final void mo29936a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        VKSdk.m147260a(i, i2, intent, (C47216b<C47106a>) this);
    }
}
