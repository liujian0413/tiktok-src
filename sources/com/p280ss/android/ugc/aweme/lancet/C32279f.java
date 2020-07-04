package com.p280ss.android.ugc.aweme.lancet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.lancet.f */
public final class C32279f {

    /* renamed from: a */
    public static final Map<String, Set<String>> f84345a;

    static {
        HashMap hashMap = new HashMap(70);
        f84345a = hashMap;
        m104802a(hashMap, "video_play", "homepage_follow");
        m104802a(f84345a, "video_play", "finish");
        m104802a(f84345a, "click", "comment");
        m104802a(f84345a, "comment", "homepage_follow");
        m104802a(f84345a, "like", "homepage_follow");
        m104802a(f84345a, "challenge_click", "homepage_follow");
        m104802a(f84345a, "song_cover", "homepage_follow");
        m104802a(f84345a, "head", "homepage_follow");
        m104802a(f84345a, "name", "homepage_follow");
        m104802a(f84345a, "play_time", "homepage_follow");
        m104802a(f84345a, "share_video", "chat");
        m104802a(f84345a, "share_video", "copy");
        m104802a(f84345a, "share_video", "weixin_moments");
        m104802a(f84345a, "client_show", "homepage_fresh");
        m104802a(f84345a, "video_play", "homepage_fresh");
        m104802a(f84345a, "video_play", "finish");
        m104802a(f84345a, "click", "comment");
        m104802a(f84345a, "comment", "homepage_fresh");
        m104802a(f84345a, "like", "homepage_fresh");
        m104802a(f84345a, "challenge_click", "homepage_fresh");
        m104802a(f84345a, "song_cover", "homepage_fresh");
        m104802a(f84345a, "follow", "homepage_fresh");
        m104802a(f84345a, "head", "homepage_fresh");
        m104802a(f84345a, "name", "homepage_fresh");
        m104802a(f84345a, "slide_left", "left");
        m104802a(f84345a, "play_time", "homepage_fresh");
        m104802a(f84345a, "share_video", "chat");
        m104802a(f84345a, "share_video", "copy");
        m104802a(f84345a, "share_video", "qq");
        m104802a(f84345a, "video_play", "homepage_hot");
        m104802a(f84345a, "video_play", "finish");
        m104802a(f84345a, "click", "comment");
        m104802a(f84345a, "comment", "homepage_hot");
        m104802a(f84345a, "like", "homepage_hot");
        m104802a(f84345a, "challenge_click", "homepage_hot");
        m104802a(f84345a, "song_cover", "homepage_hot");
        m104802a(f84345a, "follow", "homepage_hot");
        m104802a(f84345a, "head", "homepage_hot");
        m104802a(f84345a, "name", "homepage_hot");
        m104802a(f84345a, "slide_left", "left");
        m104802a(f84345a, "play_time", "homepage_hot");
        m104802a(f84345a, "follow", "others_homepage");
        m104802a(f84345a, "share_video", "chat");
        m104802a(f84345a, "share_video", "copy");
        m104802a(f84345a, "share_video", "qq");
        m104802a(f84345a, "share_video", "qzone");
        m104802a(f84345a, "share_video", "weibo");
        m104802a(f84345a, "share_video", "weixin");
        m104802a(f84345a, "share_video", "weixin_moments");
        m104802a(f84345a, "dislike", "long_press");
        m104802a(f84345a, "dislike", "tap");
        m104802a(f84345a, "shoot", "direct_shoot");
        m104802a(f84345a, "shoot", "single_song");
        m104802a(f84345a, "shoot", "challenge");
        m104802a(f84345a, "publish", "start");
        m104802a(f84345a, "search", "general_search");
        m104802a(f84345a, "follow", "general_search");
        m104802a(f84345a, "enter_detail", "personal_homapage");
        m104802a(f84345a, "challenge_click", "general_search");
        m104802a(f84345a, "song_cover", "general_search");
        m104802a(f84345a, "search", "video");
        m104802a(f84345a, "feed_enter", "search_result");
        m104802a(f84345a, "search", "user");
        m104802a(f84345a, "follow", "discovery");
        m104802a(f84345a, "enter_detail", "personal_homepage");
        m104802a(f84345a, "search", "music");
        m104802a(f84345a, "song_cover", "search_result");
        m104802a(f84345a, "search", "challenge");
        m104802a(f84345a, "challenge_click", "search_result");
    }

    /* renamed from: a */
    private static void m104802a(Map<String, Set<String>> map, String str, String str2) {
        Set set = (Set) map.get(str);
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(str2);
            map.put(str, hashSet);
            return;
        }
        set.add(str2);
    }
}
