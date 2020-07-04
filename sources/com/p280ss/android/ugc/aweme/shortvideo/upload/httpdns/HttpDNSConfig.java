package com.p280ss.android.ugc.aweme.shortvideo.upload.httpdns;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.httpdns.HttpDNSConfig */
public final class HttpDNSConfig {
    private final int backDNSType;
    private final int backUpUsedDelayTime;
    private final int expiredTime;
    private final int mainDNSType;
    private final int version;

    public static /* synthetic */ HttpDNSConfig copy$default(HttpDNSConfig httpDNSConfig, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = httpDNSConfig.version;
        }
        if ((i6 & 2) != 0) {
            i2 = httpDNSConfig.mainDNSType;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = httpDNSConfig.backDNSType;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = httpDNSConfig.backUpUsedDelayTime;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = httpDNSConfig.expiredTime;
        }
        return httpDNSConfig.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.version;
    }

    public final int component2() {
        return this.mainDNSType;
    }

    public final int component3() {
        return this.backDNSType;
    }

    public final int component4() {
        return this.backUpUsedDelayTime;
    }

    public final int component5() {
        return this.expiredTime;
    }

    public final HttpDNSConfig copy(int i, int i2, int i3, int i4, int i5) {
        HttpDNSConfig httpDNSConfig = new HttpDNSConfig(i, i2, i3, i4, i5);
        return httpDNSConfig;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HttpDNSConfig) {
                HttpDNSConfig httpDNSConfig = (HttpDNSConfig) obj;
                if (this.version == httpDNSConfig.version) {
                    if (this.mainDNSType == httpDNSConfig.mainDNSType) {
                        if (this.backDNSType == httpDNSConfig.backDNSType) {
                            if (this.backUpUsedDelayTime == httpDNSConfig.backUpUsedDelayTime) {
                                if (this.expiredTime == httpDNSConfig.expiredTime) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getBackDNSType() {
        return this.backDNSType;
    }

    public final int getBackUpUsedDelayTime() {
        return this.backUpUsedDelayTime;
    }

    public final int getExpiredTime() {
        return this.expiredTime;
    }

    public final int getMainDNSType() {
        return this.mainDNSType;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return (((((((this.version * 31) + this.mainDNSType) * 31) + this.backDNSType) * 31) + this.backUpUsedDelayTime) * 31) + this.expiredTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpDNSConfig(version=");
        sb.append(this.version);
        sb.append(", mainDNSType=");
        sb.append(this.mainDNSType);
        sb.append(", backDNSType=");
        sb.append(this.backDNSType);
        sb.append(", backUpUsedDelayTime=");
        sb.append(this.backUpUsedDelayTime);
        sb.append(", expiredTime=");
        sb.append(this.expiredTime);
        sb.append(")");
        return sb.toString();
    }

    public HttpDNSConfig(int i, int i2, int i3, int i4, int i5) {
        this.version = i;
        this.mainDNSType = i2;
        this.backDNSType = i3;
        this.backUpUsedDelayTime = i4;
        this.expiredTime = i5;
    }
}
