package com.bytedance.lobby.google;

import com.bytedance.lobby.auth.AuthResult.C12195a;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.C15045h;
import com.google.android.gms.common.api.Status;

/* renamed from: com.bytedance.lobby.google.a */
final /* synthetic */ class C12215a implements C15045h {

    /* renamed from: a */
    private final LobbyViewModel f32482a;

    C12215a(LobbyViewModel lobbyViewModel) {
        this.f32482a = lobbyViewModel;
    }

    /* renamed from: a */
    public final void mo29952a(C15044g gVar) {
        this.f32482a.mo29956b(new C12195a("google", 2).mo29925a(((Status) gVar).mo38201c()).mo29926a());
    }
}
