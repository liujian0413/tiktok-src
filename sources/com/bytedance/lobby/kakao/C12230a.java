package com.bytedance.lobby.kakao;

import android.content.Context;
import com.bytedance.lobby.internal.LobbyCore;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.AuthType;
import com.kakao.auth.IApplicationConfig;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.KakaoAdapter;

/* renamed from: com.bytedance.lobby.kakao.a */
public final class C12230a extends KakaoAdapter {
    public final IApplicationConfig getApplicationConfig() {
        return new IApplicationConfig() {
            public final Context getApplicationContext() {
                return LobbyCore.getApplication();
            }
        };
    }

    public final ISessionConfig getSessionConfig() {
        return new ISessionConfig() {
            public final ApprovalType getApprovalType() {
                return ApprovalType.INDIVIDUAL;
            }

            public final boolean isSaveFormData() {
                return true;
            }

            public final boolean isSecureMode() {
                return false;
            }

            public final boolean isUsingWebviewTimer() {
                return false;
            }

            public final AuthType[] getAuthTypes() {
                return new AuthType[]{AuthType.KAKAO_TALK, AuthType.KAKAO_STORY, AuthType.KAKAO_ACCOUNT};
            }
        };
    }
}
