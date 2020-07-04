package com.kakao.auth.common;

public class PageableContext {
    private String afterUrl;
    private String beforeUrl;
    private final int limit;
    private final int offset;
    private final String order;

    public int getLimit() {
        return this.limit;
    }

    public int getOffset() {
        return this.offset;
    }

    public String getOrder() {
        return this.order;
    }

    public synchronized String getAfterUrl() {
        return this.afterUrl;
    }

    public synchronized String getBeforeUrl() {
        return this.beforeUrl;
    }

    public synchronized boolean hasNext() {
        boolean z;
        if (this.afterUrl != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void setAfterUrl(String str) {
        this.afterUrl = str;
    }

    public synchronized void setBeforeUrl(String str) {
        this.beforeUrl = str;
    }

    public PageableContext(int i, int i2, String str) {
        this.offset = i;
        this.limit = i2;
        this.order = str;
    }
}
