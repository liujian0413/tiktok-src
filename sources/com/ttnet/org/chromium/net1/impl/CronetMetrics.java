package com.ttnet.org.chromium.net1.impl;

import com.ttnet.org.chromium.net1.RequestFinishedInfo.Metrics;
import java.util.Date;

public final class CronetMetrics extends Metrics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mConnectEndMs;
    private final long mConnectStartMs;
    private final long mDnsEndMs;
    private final long mDnsStartMs;
    private final String mPeerAddr;
    private final Long mPeerPort;
    private final long mPushEndMs;
    private final long mPushStartMs;
    private final Long mReceivedByteCount;
    private final long mRequestEndMs;
    private final long mRequestStartMs;
    private final long mResponseStartMs;
    private final Long mRetryAttempts;
    private final long mSendingEndMs;
    private final long mSendingStartMs;
    private final Long mSentByteCount;
    private final boolean mSocketReused;
    private final long mSslEndMs;
    private final long mSslStartMs;
    private final Long mTotalTimeMs;
    private final Long mTtfbMs;

    private static boolean checkOrder(long j, long j2) {
        return (j2 >= j && j != -1) || j2 == -1;
    }

    public final String getPeerAddr() {
        return this.mPeerAddr;
    }

    public final Long getPeerPort() {
        return this.mPeerPort;
    }

    public final Long getReceivedByteCount() {
        return this.mReceivedByteCount;
    }

    public final Long getRetryAttempts() {
        return this.mRetryAttempts;
    }

    public final Long getSentByteCount() {
        return this.mSentByteCount;
    }

    public final boolean getSocketReused() {
        return this.mSocketReused;
    }

    public final Long getTotalTimeMs() {
        return this.mTotalTimeMs;
    }

    public final Long getTtfbMs() {
        return this.mTtfbMs;
    }

    public final Date getConnectEnd() {
        return toDate(this.mConnectEndMs);
    }

    public final Date getConnectStart() {
        return toDate(this.mConnectStartMs);
    }

    public final Date getDnsEnd() {
        return toDate(this.mDnsEndMs);
    }

    public final Date getDnsStart() {
        return toDate(this.mDnsStartMs);
    }

    public final Date getPushEnd() {
        return toDate(this.mPushEndMs);
    }

    public final Date getPushStart() {
        return toDate(this.mPushStartMs);
    }

    public final Date getRequestEnd() {
        return toDate(this.mRequestEndMs);
    }

    public final Date getRequestStart() {
        return toDate(this.mRequestStartMs);
    }

    public final Date getResponseStart() {
        return toDate(this.mResponseStartMs);
    }

    public final Date getSendingEnd() {
        return toDate(this.mSendingEndMs);
    }

    public final Date getSendingStart() {
        return toDate(this.mSendingStartMs);
    }

    public final Date getSslEnd() {
        return toDate(this.mSslEndMs);
    }

    public final Date getSslStart() {
        return toDate(this.mSslStartMs);
    }

    private static Date toDate(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    public CronetMetrics(Long l, Long l2, Long l3, Long l4) {
        this.mTtfbMs = l;
        this.mTotalTimeMs = l2;
        this.mSentByteCount = l3;
        this.mReceivedByteCount = l4;
        this.mRequestStartMs = -1;
        this.mDnsStartMs = -1;
        this.mDnsEndMs = -1;
        this.mConnectStartMs = -1;
        this.mConnectEndMs = -1;
        this.mSslStartMs = -1;
        this.mSslEndMs = -1;
        this.mSendingStartMs = -1;
        this.mSendingEndMs = -1;
        this.mPushStartMs = -1;
        this.mPushEndMs = -1;
        this.mResponseStartMs = -1;
        this.mRequestEndMs = -1;
        this.mPeerAddr = "";
        this.mPeerPort = Long.valueOf(0);
        this.mRetryAttempts = Long.valueOf(0);
    }

    public CronetMetrics(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16, long j17) {
        long j18 = j;
        long j19 = j9;
        long j20 = j12;
        long j21 = j13;
        this.mRequestStartMs = j18;
        this.mDnsStartMs = j2;
        this.mDnsEndMs = j3;
        this.mConnectStartMs = j4;
        this.mConnectEndMs = j5;
        this.mSslStartMs = j6;
        this.mSslEndMs = j7;
        this.mSendingStartMs = j8;
        this.mSendingEndMs = j19;
        this.mPushStartMs = j10;
        this.mPushEndMs = j11;
        this.mResponseStartMs = j20;
        this.mRequestEndMs = j21;
        this.mSocketReused = z;
        this.mSentByteCount = Long.valueOf(j14);
        this.mReceivedByteCount = Long.valueOf(j15);
        this.mPeerAddr = str;
        this.mPeerPort = Long.valueOf(j16);
        this.mRetryAttempts = Long.valueOf(j17);
        if (j19 == -1 || j20 == -1) {
            this.mTtfbMs = null;
        } else {
            this.mTtfbMs = Long.valueOf(j20 - j19);
        }
        if (j18 == -1 || j21 == -1) {
            this.mTotalTimeMs = null;
        } else {
            this.mTotalTimeMs = Long.valueOf(j21 - j18);
        }
    }
}
