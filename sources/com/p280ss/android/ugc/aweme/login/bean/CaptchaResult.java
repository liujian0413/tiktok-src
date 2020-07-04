package com.p280ss.android.ugc.aweme.login.bean;

/* renamed from: com.ss.android.ugc.aweme.login.bean.CaptchaResult */
public class CaptchaResult {
    private DataBean data;
    private String message;

    /* renamed from: com.ss.android.ugc.aweme.login.bean.CaptchaResult$DataBean */
    public static class DataBean {
        private String captcha;

        public String getCaptcha() {
            return this.captcha;
        }

        public void setCaptcha(String str) {
            this.captcha = str;
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
