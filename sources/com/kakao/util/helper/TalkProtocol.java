package com.kakao.util.helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class TalkProtocol extends KakaoServiceProtocol {
    public static Intent createKakakoTalkLinkIntent(Context context, String str) {
        return checkSupportedService(context, new Intent("android.intent.action.SEND", Uri.parse(str)), 139);
    }
}
