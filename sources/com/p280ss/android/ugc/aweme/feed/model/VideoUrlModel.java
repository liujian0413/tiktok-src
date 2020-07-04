package com.p280ss.android.ugc.aweme.feed.model;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoUrlModel */
public class VideoUrlModel extends UrlModel {
    private static final long serialVersionUID = 4566748102483196885L;
    @C6593c(mo15949a = "bit_rate")
    public List<BitRate> bitRate;
    public long createTime = SystemClock.elapsedRealtime();
    @C6593c(mo15949a = "duration")
    public double duration;
    @C6593c(mo15949a = "file_cs")
    public String fileCheckSum;
    public transient C44863c hitBitrate;
    public boolean isH265;
    public String mDashVideoId;
    public String mDashVideoModelString;
    public boolean mVr;
    public String ratio;
    public String ratioUri;
    public String sourceId;

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDashVideoId() {
        return this.mDashVideoId;
    }

    public String getDashVideoModelStr() {
        return this.mDashVideoModelString;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public C44863c getHitBitrate() {
        return this.hitBitrate;
    }

    public String getRatio() {
        return this.ratio;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public boolean isH265() {
        return this.isH265;
    }

    public boolean isVr() {
        return this.mVr;
    }

    public List<BitRate> getBitRate() {
        if (this.bitRate == null) {
            return Collections.emptyList();
        }
        return this.bitRate;
    }

    public String getUri() {
        if (!TextUtils.isEmpty(getUrlKey())) {
            return getUrlKey();
        }
        return getRatioUri();
    }

    public String getBitRatedRatioUri() {
        String str;
        C44863c cVar = this.hitBitrate;
        if (cVar == null) {
            return getUri();
        }
        String urlKey = cVar.getUrlKey();
        if (!TextUtils.isEmpty(urlKey)) {
            return urlKey;
        }
        if (cVar.isH265() == 1) {
            str = "h265";
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getUri());
        sb.append(str);
        sb.append("T");
        sb.append(cVar.getBitRate());
        return sb.toString();
    }

    public String getRatioUri() {
        String str;
        String str2;
        String str3;
        if (this.ratioUri == null) {
            if (isH265()) {
                str = "h265";
            } else {
                str = "";
            }
            if (this.uri == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.uri);
                if (this.ratio == null) {
                    str3 = "";
                } else {
                    str3 = this.ratio;
                }
                sb.append(str3);
                sb.append(str);
                str2 = sb.toString();
            }
            this.ratioUri = str2;
        }
        return this.ratioUri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoUrlModel{uri='");
        sb.append(this.uri);
        sb.append('\'');
        sb.append(", urlList=");
        sb.append(this.urlList);
        sb.append("sourceId='");
        sb.append(this.sourceId);
        sb.append('\'');
        sb.append(", ratio='");
        sb.append(this.ratio);
        sb.append('\'');
        sb.append(", mVr=");
        sb.append(this.mVr);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", ish265=");
        sb.append(this.isH265);
        sb.append('}');
        return sb.toString();
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setDashVideoId(String str) {
        this.mDashVideoId = str;
    }

    public void setDashVideoModelStr(String str) {
        this.mDashVideoModelString = str;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setH265(boolean z) {
        this.isH265 = z;
    }

    public void setHitBitrate(C44863c cVar) {
        this.hitBitrate = cVar;
    }

    public VideoUrlModel setRatio(String str) {
        this.ratio = str;
        return this;
    }

    public VideoUrlModel setSourceId(String str) {
        this.sourceId = str;
        return this;
    }

    public void setVr(boolean z) {
        this.mVr = z;
    }
}
