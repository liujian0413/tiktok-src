package com.bytedance.lobby.kakao;

import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.kakao.auth.KakaoSDK;

public class KakaoProvider<T> extends BaseProvider<T> {
    /* renamed from: e */
    public final void mo29949e() {
        if (KakaoSDK.getAdapter() == null) {
            KakaoSDK.init(new C12230a());
        }
    }

    KakaoProvider(C12203b bVar) {
        super(LobbyCore.getApplication(), bVar);
    }
}
