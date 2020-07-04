package com.bytedance.ies.geckoclient.model;

import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;

public class PackageStatisticModel {
    @C6593c(mo15949a = "ac")

    /* renamed from: ac */
    private String f29465ac;
    @C6593c(mo15949a = "access_key")
    private String accessKey;
    @C6593c(mo15949a = "active_check_duration")
    private Long activeCheckDuration;
    @C6593c(mo15949a = "apply_duration")
    private Long applyDuration;
    @C6593c(mo15949a = "channel")
    private String channel;
    @C6593c(mo15949a = "clean_duration")
    private Long cleanDuration;
    @C6593c(mo15949a = "clean_strategy")
    private Integer cleanStrategy;
    @C6593c(mo15949a = "clean_type")
    private Integer cleanType;
    @C6593c(mo15949a = "download_duration")
    private Long downloadDuration;
    @C6593c(mo15949a = "download_fail_records")
    private List<C10892a> downloadFailRecords;
    @C6593c(mo15949a = "download_retry_times")
    private Integer downloadRetryTimes;
    @C6593c(mo15949a = "download_url")
    private String downloadUrl;
    @C6593c(mo15949a = "err_code")
    private String errCode;
    @C6593c(mo15949a = "err_msg")
    private String errMsg;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private Integer f29466id;
    @C6593c(mo15949a = "log_id")
    private String logId;
    @C6593c(mo15949a = "patch_id")
    private Integer patchId;
    @C6593c(mo15949a = "stats_type")
    private Integer statsType;

    /* renamed from: com.bytedance.ies.geckoclient.model.PackageStatisticModel$a */
    public static class C10892a {
        @C6593c(mo15949a = "domain")

        /* renamed from: a */
        public String f29467a;
        @C6593c(mo15949a = "reason")

        /* renamed from: b */
        public String f29468b;

        public C10892a(String str, String str2) {
            this.f29467a = str;
            this.f29468b = str2;
        }
    }

    public String getChannel() {
        return this.channel;
    }

    public Integer getId() {
        return this.f29466id;
    }

    public List<C10892a> getDownloadFailRecords() {
        if (this.downloadFailRecords == null) {
            this.downloadFailRecords = new ArrayList();
        }
        return this.downloadFailRecords;
    }

    public void setAc(String str) {
        this.f29465ac = str;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setActiveCheckDuration(Long l) {
        this.activeCheckDuration = l;
    }

    public void setApplyDuration(Long l) {
        this.applyDuration = l;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setCleanDuration(Long l) {
        this.cleanDuration = l;
    }

    public void setCleanStrategy(Integer num) {
        this.cleanStrategy = num;
    }

    public void setCleanType(Integer num) {
        this.cleanType = num;
    }

    public void setDownloadDuration(Long l) {
        this.downloadDuration = l;
    }

    public void setDownloadFailRecords(List<C10892a> list) {
        this.downloadFailRecords = list;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setErrCode(String str) {
        this.errCode = str;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setId(Integer num) {
        this.f29466id = num;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setPatchId(Integer num) {
        this.patchId = num;
    }

    public void setStatsType(Integer num) {
        this.statsType = num;
    }

    public void setDownloadRetryTimes(int i) {
        this.downloadRetryTimes = Integer.valueOf(i);
    }
}
