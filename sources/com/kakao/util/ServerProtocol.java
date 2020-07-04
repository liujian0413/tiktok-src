package com.kakao.util;

import com.kakao.util.helper.log.Logger.DeployPhase;

public final class ServerProtocol {
    public static final DeployPhase DEPLOY_PHASE = DeployPhase.current();
    public static final String PLUS_FRIEND_AUTHORITY = initPlusFriendAuthority();

    private static String initPlusFriendAuthority() {
        switch (DEPLOY_PHASE) {
            case Local:
                return "localhost:";
            case Alpha:
            case Sandbox:
                return "sandbox-pf.kakao.com";
            case Beta:
                return "beta-pf.kakao.com";
            default:
                return "pf.kakao.com";
        }
    }
}
