package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserHonor */
public class UserHonor implements Serializable {
    @C6593c(mo15949a = "now_diamond")
    private long currentDiamond;
    @C6593c(mo15949a = "icon")
    private UrlModel currentHonorIcon;
    @C6593c(mo15949a = "name")
    private String currentHonorName;
    @C6593c(mo15949a = "diamond_icon")
    private UrlModel diamondIcon;
    @C6593c(mo15949a = "im_icon")
    private UrlModel imIcon;
    @C6593c(mo15949a = "level")
    private int level;
    @C6593c(mo15949a = "live_icon")
    private UrlModel liveIcon;
    @C6593c(mo15949a = "next_diamond")
    private long nextDiamond;
    @C6593c(mo15949a = "next_icon")
    private UrlModel nextHonorIcon;
    @C6593c(mo15949a = "next_name")
    private String nextHonorName;
    @C6593c(mo15949a = "total_diamond_count")
    private long totalDiamond;

    public long getCurrentDiamond() {
        return this.currentDiamond;
    }

    public UrlModel getCurrentHonorIcon() {
        return this.currentHonorIcon;
    }

    public String getCurrentHonorName() {
        return this.currentHonorName;
    }

    public UrlModel getDiamondIcon() {
        return this.diamondIcon;
    }

    public UrlModel getImIcon() {
        return this.imIcon;
    }

    public int getLevel() {
        return this.level;
    }

    public UrlModel getLiveIcon() {
        return this.liveIcon;
    }

    public long getNextDiamond() {
        return this.nextDiamond;
    }

    public UrlModel getNextHonorIcon() {
        return this.nextHonorIcon;
    }

    public String getNextHonorName() {
        return this.nextHonorName;
    }

    public long getTotalDiamond() {
        return this.totalDiamond;
    }

    public void setCurrentDiamond(long j) {
        this.currentDiamond = j;
    }

    public void setCurrentHonorIcon(UrlModel urlModel) {
        this.currentHonorIcon = urlModel;
    }

    public void setCurrentHonorName(String str) {
        this.currentHonorName = str;
    }

    public void setDiamondIcon(UrlModel urlModel) {
        this.diamondIcon = urlModel;
    }

    public void setImIcon(UrlModel urlModel) {
        this.imIcon = urlModel;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLiveIcon(UrlModel urlModel) {
        this.liveIcon = urlModel;
    }

    public void setNextDiamond(long j) {
        this.nextDiamond = j;
    }

    public void setNextHonorIcon(UrlModel urlModel) {
        this.nextHonorIcon = urlModel;
    }

    public void setNextHonorName(String str) {
        this.nextHonorName = str;
    }

    public void setTotalDiamond(long j) {
        this.totalDiamond = j;
    }
}
