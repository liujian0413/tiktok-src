package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

public class MediaEntity extends UrlEntity {
    @C6593c(mo15949a = "ext_alt_text")
    public final String altText;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public final long f120367id;
    @C6593c(mo15949a = "id_str")
    public final String idStr;
    @C6593c(mo15949a = "media_url")
    public final String mediaUrl;
    @C6593c(mo15949a = "media_url_https")
    public final String mediaUrlHttps;
    @C6593c(mo15949a = "sizes")
    public final Sizes sizes;
    @C6593c(mo15949a = "source_status_id")
    public final long sourceStatusId;
    @C6593c(mo15949a = "source_status_id_str")
    public final String sourceStatusIdStr;
    @C6593c(mo15949a = "type")
    public final String type;
    @C6593c(mo15949a = "video_info")
    public final VideoInfo videoInfo;

    public static class Size implements Serializable {
        @C6593c(mo15949a = "h")

        /* renamed from: h */
        public final int f120368h;
        @C6593c(mo15949a = "resize")
        public final String resize;
        @C6593c(mo15949a = "w")

        /* renamed from: w */
        public final int f120369w;

        public Size(int i, int i2, String str) {
            this.f120369w = i;
            this.f120368h = i2;
            this.resize = str;
        }
    }

    public static class Sizes implements Serializable {
        @C6593c(mo15949a = "large")
        public final Size large;
        @C6593c(mo15949a = "medium")
        public final Size medium;
        @C6593c(mo15949a = "small")
        public final Size small;
        @C6593c(mo15949a = "thumb")
        public final Size thumb;

        public Sizes(Size size, Size size2, Size size3, Size size4) {
            this.thumb = size;
            this.small = size2;
            this.medium = size3;
            this.large = size4;
        }
    }

    public MediaEntity(String str, String str2, String str3, int i, int i2, long j, String str4, String str5, String str6, Sizes sizes2, long j2, String str7, String str8, VideoInfo videoInfo2, String str9) {
        super(str, str2, str3, i, i2);
        this.f120367id = j;
        this.idStr = str4;
        this.mediaUrl = str5;
        this.mediaUrlHttps = str6;
        this.sizes = sizes2;
        this.sourceStatusId = j2;
        this.sourceStatusIdStr = str7;
        this.type = str8;
        this.videoInfo = videoInfo2;
        this.altText = str9;
    }
}
