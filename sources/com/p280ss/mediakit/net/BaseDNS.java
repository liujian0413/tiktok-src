package com.p280ss.mediakit.net;

import android.os.Handler;

/* renamed from: com.ss.mediakit.net.BaseDNS */
public class BaseDNS {
    protected boolean mCancelled;
    protected Handler mHandler;
    public String mHostname;
    public String mId;
    protected DNSCompletionListener mListener;
    protected TTVNetClient mNetClient;

    public void cancel() {
    }

    public void close() {
    }

    public boolean isRunning() {
        return true;
    }

    public void start() {
    }

    /* access modifiers changed from: protected */
    public void notifyCancelled() {
        this.mHandler.sendEmptyMessage(0);
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    /* access modifiers changed from: protected */
    public void notifyError(AVMDLDNSInfo aVMDLDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, aVMDLDNSInfo));
    }

    /* access modifiers changed from: protected */
    public void notifyRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    /* access modifiers changed from: protected */
    public void notifySuccess(AVMDLDNSInfo aVMDLDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, aVMDLDNSInfo));
    }

    public BaseDNS(String str, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(System.nanoTime()));
        sb.append(Integer.toString(System.identityHashCode(this)));
        this.mId = sb.toString();
    }

    public BaseDNS(String str, TTVNetClient tTVNetClient, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        if (tTVNetClient == null) {
            tTVNetClient = new TTHTTPNetwork();
        }
        this.mNetClient = tTVNetClient;
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(System.nanoTime()));
        sb.append(Integer.toString(System.identityHashCode(this)));
        this.mId = sb.toString();
    }
}
