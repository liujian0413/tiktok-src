package com.bytedance.lobby.auth;

import android.text.TextUtils;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult.C12195a;
import com.bytedance.lobby.internal.LobbyViewModel;

/* renamed from: com.bytedance.lobby.auth.b */
public final class C12197b {
    /* renamed from: a */
    public static void m35462a(LobbyViewModel lobbyViewModel, String str) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] provider currently does not support logging out, please contact Lobby developer for further details.");
            lobbyViewModel.mo29956b(new C12195a(str, 2).mo29925a(false).mo29923a(new LobbyException(1, sb.toString())).mo29926a());
        }
    }

    /* renamed from: a */
    public static void m35463a(LobbyViewModel lobbyViewModel, String str, int i) {
        if (lobbyViewModel != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] provider is not available, make sure you have added it to your dependency.");
            lobbyViewModel.mo29956b(new C12195a(str, i).mo29925a(false).mo29923a(new LobbyException(2, sb.toString())).mo29926a());
        }
    }
}
