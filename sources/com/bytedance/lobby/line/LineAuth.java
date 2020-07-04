package com.bytedance.lobby.line;

import android.arch.lifecycle.C0069x;
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
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.auth.LineLoginApi;
import com.linecorp.linesdk.auth.LineLoginResult;

public class LineAuth extends LineProvider<AuthResult> implements C12201d {

    /* renamed from: c */
    private static final boolean f32528c = C12191a.f32435a;

    /* renamed from: d */
    private LobbyViewModel f32529d;

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

    public LineAuth(C12203b bVar) {
        super(LobbyCore.getApplication(), bVar);
    }

    /* renamed from: b */
    public final void mo29939b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12197b.m35462a(this.f32529d, this.f32494b.f32466b);
    }

    /* renamed from: a */
    public final void mo29937a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32529d = (LobbyViewModel) C0069x.m159a(fragmentActivity).mo147a(LobbyViewModel.class);
        if (!mo29951d()) {
            C12197b.m35463a(this.f32529d, "line", 1);
            return;
        }
        try {
            fragmentActivity.startActivityForResult(LineLoginApi.m61017a(fragmentActivity, this.f32494b.f32467c), 1);
        } catch (Throwable th) {
            this.f32529d.mo29956b(new C12195a(this.f32494b.f32466b, 1).mo29925a(false).mo29923a(new LobbyException(6, th.getMessage())).mo29926a());
        }
    }

    /* renamed from: a */
    public final void mo29936a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        LineLoginResult a = LineLoginApi.m61018a(intent);
        switch (a.f50245b) {
            case SUCCESS:
                LineCredential lineCredential = a.f50247d;
                if (lineCredential != null) {
                    this.f32529d.mo29956b(new C12195a("line", 1).mo29925a(true).mo29921a(lineCredential.f50180a.f50175b).mo29927b(lineCredential.f50180a.f50174a).mo29926a());
                    return;
                }
                break;
            case CANCEL:
                this.f32529d.mo29956b(new C12195a("line", 1).mo29925a(false).mo29923a(new LobbyException(4, "Line login cancelled by user")).mo29926a());
                return;
            default:
                Bundle bundle = new Bundle();
                bundle.putInt("line_response_ordinal", a.f50245b.ordinal());
                this.f32529d.mo29956b(new C12195a("line", 1).mo29925a(false).mo29923a(new LobbyException(3, a.f50248e.f50179c)).mo29922a(bundle).mo29926a());
                break;
        }
    }
}
