package com.bytedance.android.livesdkapi.depend.live;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;

public enum EntryType {
    FEED_WITH_PREVIEW("feed_with_preview"),
    FEED(C22704b.f60414c),
    FEED_SHORTCUT("feed_shortcut"),
    MOMENT("moment"),
    SLIDE("slide"),
    LIVE_END("live_end"),
    PUSH("push"),
    WEB("web"),
    OTHER("other");
    
    public final String typeName;

    public static EntryType convert(String str) {
        EntryType entryType = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1068531200:
                if (str.equals("moment")) {
                    c = 3;
                    break;
                }
                break;
            case 117588:
                if (str.equals("web")) {
                    c = 7;
                    break;
                }
                break;
            case 3138974:
                if (str.equals(C22704b.f60414c)) {
                    c = 1;
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 6;
                    break;
                }
                break;
            case 106069776:
                if (str.equals("other")) {
                    c = 8;
                    break;
                }
                break;
            case 109526449:
                if (str.equals("slide")) {
                    c = 4;
                    break;
                }
                break;
            case 758159815:
                if (str.equals("feed_shortcut")) {
                    c = 2;
                    break;
                }
                break;
            case 1418007304:
                if (str.equals("live_end")) {
                    c = 5;
                    break;
                }
                break;
            case 1595681360:
                if (str.equals("feed_with_preview")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                entryType = FEED_WITH_PREVIEW;
                break;
            case 1:
                entryType = FEED;
                break;
            case 2:
                entryType = FEED_SHORTCUT;
                break;
            case 3:
                entryType = MOMENT;
                break;
            case 4:
                entryType = SLIDE;
                break;
            case 5:
                entryType = LIVE_END;
                break;
            case 6:
                entryType = PUSH;
                break;
            case 7:
                entryType = WEB;
                break;
            case 8:
                entryType = OTHER;
                break;
        }
        return entryType;
    }

    private EntryType(String str) {
        this.typeName = str;
    }
}
