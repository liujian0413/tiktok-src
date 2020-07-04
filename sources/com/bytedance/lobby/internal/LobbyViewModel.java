package com.bytedance.lobby.internal;

import android.app.Application;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.lobby.auth.AuthResult;

public class LobbyViewModel extends BaseViewModel<AuthResult> {
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ LiveData mo29959h() {
        return super.mo29959h();
    }

    public LobbyViewModel(Application application) {
        super(application);
    }

    /* renamed from: a */
    public static LobbyViewModel m35531a(FragmentActivity fragmentActivity) {
        return (LobbyViewModel) C0069x.m159a(fragmentActivity).mo147a(LobbyViewModel.class);
    }
}
