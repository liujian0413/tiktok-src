package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

public class VideoInfo implements Serializable {
    @C6593c(mo15949a = "aspect_ratio")
    public final List<Integer> aspectRatio;
    @C6593c(mo15949a = "duration_millis")
    public final long durationMillis;
    @C6593c(mo15949a = "variants")
    public final List<Variant> variants;

    public static class Variant implements Serializable {
        @C6593c(mo15949a = "bitrate")
        public final long bitrate;
        @C6593c(mo15949a = "content_type")
        public final String contentType;
        @C6593c(mo15949a = "url")
        public final String url;

        public Variant(long j, String str, String str2) {
            this.bitrate = j;
            this.contentType = str;
            this.url = str2;
        }
    }

    private VideoInfo() {
        this(null, 0, null);
    }

    public VideoInfo(List<Integer> list, long j, List<Variant> list2) {
        this.aspectRatio = C46954k.m146830a(list);
        this.durationMillis = j;
        this.variants = C46954k.m146830a(list2);
    }
}
