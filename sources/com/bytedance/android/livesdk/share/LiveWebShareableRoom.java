package com.bytedance.android.livesdk.share;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.IShareAble.SharePlatform;
import com.p280ss.android.common.util.C19290j;
import java.util.Map;

public class LiveWebShareableRoom extends ShareableRoom {
    private String desc;
    private Map<String, String> extraMap;
    private String image;
    private String title;
    private String url;

    public String getShareTargetUrl() {
        C19290j jVar;
        if (this.url == null || this.url.isEmpty()) {
            jVar = new C19290j(super.getShareTargetUrl());
            if (this.extraMap != null) {
                for (String str : this.extraMap.keySet()) {
                    jVar.mo51188a(str, (String) this.extraMap.get(str));
                }
            }
        } else {
            jVar = new C19290j(this.url);
        }
        return jVar.mo51184a();
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getShareDesc(SharePlatform sharePlatform) {
        if (this.desc == null || this.desc.isEmpty()) {
            return super.getShareDesc(sharePlatform);
        }
        return this.desc;
    }

    public String getShareThumbUrl(SharePlatform sharePlatform) {
        if (this.image == null || this.image.isEmpty()) {
            return super.getShareThumbUrl(sharePlatform);
        }
        return this.image;
    }

    public String getShareTitle(SharePlatform sharePlatform) {
        if (this.title == null || this.title.isEmpty()) {
            return super.getShareTitle(sharePlatform);
        }
        return this.title;
    }

    public LiveWebShareableRoom(Context context, Room room, Map<String, String> map) {
        super(room);
        this.extraMap = map;
    }

    public LiveWebShareableRoom(Context context, Room room, String str, String str2, String str3, String str4, Map<String, String> map) {
        super(room);
        this.title = str;
        this.desc = str2;
        this.image = str3;
        this.url = str4;
        this.extraMap = map;
    }
}
