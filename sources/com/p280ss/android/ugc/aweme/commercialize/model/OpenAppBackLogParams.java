package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.OpenAppBackLogParams */
public final class OpenAppBackLogParams implements Serializable {
    private final AwemeRawAd awemeRawAd;
    private long startTime;
    private final String tag;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.OpenAppBackLogParams$a */
    public static final class C24986a {

        /* renamed from: a */
        public String f65870a = "";

        /* renamed from: b */
        public long f65871b;

        /* renamed from: c */
        public AwemeRawAd f65872c;

        /* renamed from: a */
        public final OpenAppBackLogParams mo65409a() {
            OpenAppBackLogParams openAppBackLogParams = new OpenAppBackLogParams(this.f65870a, this.f65871b, this.f65872c, null);
            return openAppBackLogParams;
        }

        /* renamed from: a */
        public final C24986a mo65406a(long j) {
            C24986a aVar = this;
            aVar.f65871b = j;
            return aVar;
        }

        /* renamed from: a */
        public final C24986a mo65407a(AwemeRawAd awemeRawAd) {
            C24986a aVar = this;
            aVar.f65872c = awemeRawAd;
            return aVar;
        }

        /* renamed from: a */
        public final C24986a mo65408a(String str) {
            C7573i.m23587b(str, "tag");
            C24986a aVar = this;
            aVar.f65870a = str;
            return aVar;
        }
    }

    public static /* synthetic */ OpenAppBackLogParams copy$default(OpenAppBackLogParams openAppBackLogParams, String str, long j, AwemeRawAd awemeRawAd2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openAppBackLogParams.tag;
        }
        if ((i & 2) != 0) {
            j = openAppBackLogParams.startTime;
        }
        if ((i & 4) != 0) {
            awemeRawAd2 = openAppBackLogParams.awemeRawAd;
        }
        return openAppBackLogParams.copy(str, j, awemeRawAd2);
    }

    public final String component1() {
        return this.tag;
    }

    public final long component2() {
        return this.startTime;
    }

    public final AwemeRawAd component3() {
        return this.awemeRawAd;
    }

    public final OpenAppBackLogParams copy(String str, long j, AwemeRawAd awemeRawAd2) {
        C7573i.m23587b(str, "tag");
        return new OpenAppBackLogParams(str, j, awemeRawAd2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OpenAppBackLogParams) {
                OpenAppBackLogParams openAppBackLogParams = (OpenAppBackLogParams) obj;
                if (C7573i.m23585a((Object) this.tag, (Object) openAppBackLogParams.tag)) {
                    if (!(this.startTime == openAppBackLogParams.startTime) || !C7573i.m23585a((Object) this.awemeRawAd, (Object) openAppBackLogParams.awemeRawAd)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int hashCode() {
        String str = this.tag;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.startTime)) * 31;
        AwemeRawAd awemeRawAd2 = this.awemeRawAd;
        if (awemeRawAd2 != null) {
            i = awemeRawAd2.hashCode();
        }
        return hashCode + i;
    }

    public final String toJson() {
        String b = new C6600e().mo15979b((Object) this);
        C7573i.m23582a((Object) b, "Gson().toJson(this)");
        return b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("tag=");
        sb.append(this.tag);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", awemeRawAd=");
        sb.append(this.awemeRawAd);
        return sb.toString();
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    private OpenAppBackLogParams(String str, long j, AwemeRawAd awemeRawAd2) {
        this.tag = str;
        this.startTime = j;
        this.awemeRawAd = awemeRawAd2;
    }

    public /* synthetic */ OpenAppBackLogParams(String str, long j, AwemeRawAd awemeRawAd2, C7571f fVar) {
        this(str, j, awemeRawAd2);
    }
}
