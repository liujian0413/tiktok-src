package com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a;

import com.p280ss.android.ugc.lib.video.bitrate.regulator.BitrateNotMatchException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.a.f */
public final class C44866f implements C44863c {

    /* renamed from: a */
    public C44863c f115380a;

    /* renamed from: b */
    public BitrateNotMatchException f115381b;

    /* renamed from: c */
    public int f115382c;

    /* renamed from: d */
    public double f115383d;

    public final int getBitRate() {
        if (this.f115380a != null) {
            return this.f115380a.getBitRate();
        }
        return 0;
    }

    public final String getChecksum() {
        if (this.f115380a != null) {
            return this.f115380a.getChecksum();
        }
        return "";
    }

    public final String getGearName() {
        if (this.f115380a != null) {
            return this.f115380a.getGearName();
        }
        return "";
    }

    public final int getQualityType() {
        if (this.f115380a != null) {
            return this.f115380a.getQualityType();
        }
        return 0;
    }

    public final String getUrlKey() {
        if (this.f115380a != null) {
            return this.f115380a.getUrlKey();
        }
        return "";
    }

    public final int isH265() {
        if (this.f115380a != null) {
            return this.f115380a.isH265();
        }
        return 0;
    }

    public final List<String> urlList() {
        if (this.f115380a != null) {
            return this.f115380a.urlList();
        }
        return Collections.emptyList();
    }
}
