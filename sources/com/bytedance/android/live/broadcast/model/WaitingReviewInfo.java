package com.bytedance.android.live.broadcast.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

public class WaitingReviewInfo {
    @C6593c(mo15949a = "audit_content")
    private String content;
    @C6593c(mo15949a = "audit_status")
    private int status;
    @C6593c(mo15949a = "total_queue_cnt")
    private int totalWaitingCount;
    @C6593c(mo15949a = "cur_wait_cnt")
    private int waitingCount;
    @C6593c(mo15949a = "rule_info")
    private List<C2757g> waitingReviewRules;
    @C6593c(mo15949a = "to_wait_time")
    private int waitingTime;

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<C2757g> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalWaitingCount(int i) {
        this.totalWaitingCount = i;
    }

    public void setWaitingCount(int i) {
        this.waitingCount = i;
    }

    public void setWaitingReviewRules(List<C2757g> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i) {
        this.waitingTime = i;
    }
}
