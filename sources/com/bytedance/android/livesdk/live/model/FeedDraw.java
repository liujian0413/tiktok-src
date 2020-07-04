package com.bytedance.android.livesdk.live.model;

import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import java.util.HashMap;
import java.util.Map;

public class FeedDraw {
    @C6593c(mo15949a = "settings")
    private Map<String, Integer> settings = new HashMap();
    @C6593c(mo15949a = "url")
    private String url;

    public static String conventRequestFrom(String str, String str2) {
        return "";
    }

    public Map<String, Integer> getSettings() {
        return this.settings;
    }

    public String getUrl() {
        return this.url;
    }

    public static FeedDraw defaultInstance() {
        FeedDraw feedDraw = new FeedDraw();
        feedDraw.url = "";
        return feedDraw;
    }

    public static boolean needCollectUnRead(String str) {
        if (!C6319n.m19593a(str) && !str.startsWith("homepage_follow_stream")) {
            return true;
        }
        return false;
    }

    public boolean isSupportedRequestFrom(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        Integer num = (Integer) this.settings.get(str);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
