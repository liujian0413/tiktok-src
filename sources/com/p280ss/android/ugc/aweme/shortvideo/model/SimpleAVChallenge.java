package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SimpleAVChallenge */
public class SimpleAVChallenge {
    private static final C6600e GSON = C35563c.f93239b;
    public String challengeName;
    public String cid;
    public String stickerId;
    public int type;
    public int userCount;
    public long viewCount = -1;

    public AVChallenge parse2AVChallenge() {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = this.cid;
        aVChallenge.challengeName = this.challengeName;
        aVChallenge.type = this.type;
        aVChallenge.stickerId = this.stickerId;
        aVChallenge.viewCount = this.viewCount;
        aVChallenge.userCount = this.userCount;
        return aVChallenge;
    }

    public static String serializeToStr(SimpleAVChallenge simpleAVChallenge) {
        if (simpleAVChallenge == null) {
            return null;
        }
        try {
            return GSON.mo15979b((Object) simpleAVChallenge);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SimpleAVChallenge deserializeFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (SimpleAVChallenge) GSON.mo15974a(str, SimpleAVChallenge.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SimpleAVChallenge fromAVChallenge(AVChallenge aVChallenge) {
        SimpleAVChallenge simpleAVChallenge = new SimpleAVChallenge();
        simpleAVChallenge.cid = aVChallenge.cid;
        simpleAVChallenge.challengeName = aVChallenge.challengeName;
        simpleAVChallenge.type = aVChallenge.type;
        simpleAVChallenge.stickerId = aVChallenge.stickerId;
        simpleAVChallenge.viewCount = aVChallenge.viewCount;
        simpleAVChallenge.userCount = aVChallenge.userCount;
        return simpleAVChallenge;
    }
}
