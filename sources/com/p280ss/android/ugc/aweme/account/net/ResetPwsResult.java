package com.p280ss.android.ugc.aweme.account.net;

/* renamed from: com.ss.android.ugc.aweme.account.net.ResetPwsResult */
public class ResetPwsResult {
    private ExtraBean extra;
    private int status_code;
    private String status_msg;

    /* renamed from: com.ss.android.ugc.aweme.account.net.ResetPwsResult$ExtraBean */
    public static class ExtraBean {
        private long now;

        public long getNow() {
            return this.now;
        }

        public void setNow(long j) {
            this.now = j;
        }
    }

    public ExtraBean getExtra() {
        return this.extra;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public void setExtra(ExtraBean extraBean) {
        this.extra = extraBean;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
