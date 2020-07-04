package com.p280ss.avframework.livestreamv2.interact.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.interact.model.SEI */
public class SEI {
    private String mBackground;
    private String mChannelName;
    private List<Region> mGridList = new ArrayList();
    private int mHeight;
    private long mTimestamp;
    private String mVendor;
    private int mVersion;
    private int mWidth;

    public String getBackground() {
        return this.mBackground;
    }

    public String getChannelName() {
        return this.mChannelName;
    }

    public List<Region> getGridList() {
        return this.mGridList;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public String getVendor() {
        return this.mVendor;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setBackground(String str) {
        this.mBackground = str;
    }

    public void setChannelName(String str) {
        this.mChannelName = str;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setTimestamp(long j) {
        this.mTimestamp = j;
    }

    public void setVendor(String str) {
        this.mVendor = str;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public void addGrid(Region region) {
        this.mGridList.add(region);
    }
}
