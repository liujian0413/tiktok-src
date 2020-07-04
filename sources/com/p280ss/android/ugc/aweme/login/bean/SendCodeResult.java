package com.p280ss.android.ugc.aweme.login.bean;

/* renamed from: com.ss.android.ugc.aweme.login.bean.SendCodeResult */
public class SendCodeResult {
    private DataBean data;
    private String message;

    /* renamed from: com.ss.android.ugc.aweme.login.bean.SendCodeResult$DataBean */
    public static class DataBean {
        private String captcha;
        private String description;
        private int error_code;
        private String mobile;
        private int retry_time;

        public String getCaptcha() {
            return this.captcha;
        }

        public String getDescription() {
            return this.description;
        }

        public int getError_code() {
            return this.error_code;
        }

        public String getMobile() {
            return this.mobile;
        }

        public int getRetry_time() {
            return this.retry_time;
        }

        public void setCaptcha(String str) {
            this.captcha = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setError_code(int i) {
            this.error_code = i;
        }

        public void setMobile(String str) {
            this.mobile = str;
        }

        public void setRetry_time(int i) {
            this.retry_time = i;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
