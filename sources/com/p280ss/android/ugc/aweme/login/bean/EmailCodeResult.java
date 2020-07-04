package com.p280ss.android.ugc.aweme.login.bean;

/* renamed from: com.ss.android.ugc.aweme.login.bean.EmailCodeResult */
public class EmailCodeResult {
    private DataBean data;
    private String message;

    /* renamed from: com.ss.android.ugc.aweme.login.bean.EmailCodeResult$DataBean */
    public static class DataBean {
        private String captcha;
        private String description;
        private int error_code;

        public String getCaptcha() {
            return this.captcha;
        }

        public String getDescription() {
            return this.description;
        }

        public int getError_code() {
            return this.error_code;
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
