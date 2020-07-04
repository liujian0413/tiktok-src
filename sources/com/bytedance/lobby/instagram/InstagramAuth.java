package com.bytedance.lobby.instagram;

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

public class InstagramAuth extends InstagramProvider<AuthResult> implements C12201d {

    /* renamed from: c */
    private static final boolean f32483c = C12191a.f32435a;

    /* renamed from: d */
    private LobbyViewModel f32484d;

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

    public InstagramAuth(C12203b bVar) {
        super(LobbyCore.getApplication(), bVar);
    }

    /* renamed from: b */
    public final void mo29939b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12197b.m35462a(this.f32484d, this.f32494b.f32466b);
    }

    /* renamed from: a */
    public final void mo29937a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32484d = LobbyViewModel.m35531a(fragmentActivity);
        if (!mo29951d()) {
            C12197b.m35463a(this.f32484d, "instagram", 1);
            return;
        }
        String str = this.f32494b.f32467c;
        String string = this.f32494b.f32468d.getString("ig_redirect_url");
        String string2 = this.f32494b.f32468d.getString("ig_scope", "basic");
        String string3 = this.f32494b.f32468d.getString("ig_response_type", "code");
        Intent intent = new Intent(fragmentActivity, InstagramAuthActivity.class);
        intent.putExtra("client_id", str);
        intent.putExtra("redirect_url", string);
        intent.putExtra("response_type", string3);
        intent.putExtra("scope", string2);
        fragmentActivity.startActivityForResult(intent, 458);
    }

    /* renamed from: a */
    public final void mo29936a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        C12195a aVar = new C12195a(this.f32494b.f32466b, 1);
        if (intent == null) {
            aVar.mo29925a(false).mo29923a(new LobbyException(1, "No intent data received after launching InstagramAuthActivity"));
            this.f32484d.mo29956b(aVar.mo29926a());
            return;
        }
        switch (i2) {
            case -1:
                aVar.mo29925a(false).mo29923a(new LobbyException(4, intent.getStringExtra("ig_result_error_info")));
                break;
            case 0:
                aVar.mo29925a(false).mo29923a(new LobbyException(3, intent.getStringExtra("ig_result_error_info")));
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putString("code", intent.getStringExtra("ig_result_code"));
                aVar.mo29925a(true).mo29922a(bundle);
                break;
            default:
                aVar.mo29925a(false).mo29923a(new LobbyException(7, "Unidentified result code in InstagramAuthActivity"));
                break;
        }
        this.f32484d.mo29956b(aVar.mo29926a());
    }
}
