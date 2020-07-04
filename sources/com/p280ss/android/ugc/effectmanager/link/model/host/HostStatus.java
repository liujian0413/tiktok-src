package com.p280ss.android.ugc.effectmanager.link.model.host;

/* renamed from: com.ss.android.ugc.effectmanager.link.model.host.HostStatus */
public class HostStatus {
    public long duration;
    public Exception exception;
    public Host host;
    public boolean isSuccess;
    public long sendTime;
    public int status;
    public String traceCode;
    public String url;

    public String toString() {
        StringBuilder sb = new StringBuilder("HostStatus{url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", host=");
        sb.append(this.host.toString());
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", sendTime=");
        sb.append(this.sendTime);
        sb.append(", traceCode='");
        sb.append(this.traceCode);
        sb.append('\'');
        sb.append(", exception=");
        sb.append(this.exception);
        sb.append(", isSuccess=");
        sb.append(this.isSuccess);
        sb.append('}');
        return sb.toString();
    }

    public HostStatus(String str, Host host2, int i, long j, long j2, String str2, Exception exc, boolean z) {
        this.url = str;
        this.host = host2;
        this.status = i;
        this.duration = j;
        this.sendTime = j2;
        this.traceCode = str2;
        this.exception = exc;
        this.isSuccess = z;
    }
}
