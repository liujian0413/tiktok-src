package com.kakao.network;

import com.kakao.util.helper.log.Logger.DeployPhase;

public final class ServerProtocol {
    public static final String ACCOUNT_AUTHORITY;
    public static final String AGE_AUTH_AUTHORITY;
    public static final String API_AUTHORITY = initAPIAuthority();
    public static final String AUTH_AUTHORITY = initAuthAuthority();
    public static final DeployPhase DEPLOY_PHASE = DeployPhase.current();
    public static final String NAVI_AUTHORITY = initNaviAuthority();
    public static final String TALK_CHAT_LIST_PATH = "v1/api/talk/chats";

    static {
        String initAgeAuthAuthority = initAgeAuthAuthority();
        AGE_AUTH_AUTHORITY = initAgeAuthAuthority;
        ACCOUNT_AUTHORITY = initAgeAuthAuthority;
    }

    private static String initAPIAuthority() {
        switch (DEPLOY_PHASE) {
            case Local:
                return "localhost:";
            case Alpha:
                return "alpha-kapi.kakao.com";
            case Sandbox:
                return "sandbox-kapi.kakao.com";
            case Beta:
                return "beta-kapi.kakao.com";
            case Real:
                return "kapi.kakao.com";
            default:
                return null;
        }
    }

    private static String initAgeAuthAuthority() {
        switch (DEPLOY_PHASE) {
            case Local:
                return "localhost:";
            case Alpha:
                return "alpha-auth.kakao.com";
            case Sandbox:
                return "sandbox-auth.kakao.com";
            case Beta:
                return "beta-auth.kakao.com";
            case Real:
                return "auth.kakao.com";
            default:
                return null;
        }
    }

    private static String initAuthAuthority() {
        switch (DEPLOY_PHASE) {
            case Local:
                return "localhost:";
            case Alpha:
                return "alpha-kauth.kakao.com";
            case Sandbox:
                return "sandbox-kauth.kakao.com";
            case Beta:
                return "beta-kauth.kakao.com";
            case Real:
                return "kauth.kakao.com";
            default:
                return null;
        }
    }

    private static String initNaviAuthority() {
        switch (DEPLOY_PHASE) {
            case Local:
                return "localhost:";
            case Alpha:
            case Sandbox:
                return "sandbox-kakaonavi-wguide.kakao.com";
            case Beta:
            case Real:
                return "kakaonavi-wguide.kakao.com";
            default:
                return null;
        }
    }
}
