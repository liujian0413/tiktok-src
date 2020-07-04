package com.p280ss.android.ugc.aweme.login.bean;

/* renamed from: com.ss.android.ugc.aweme.login.bean.ChangePasswordBean */
public class ChangePasswordBean {
    private DataBean data;
    private String message;

    /* renamed from: com.ss.android.ugc.aweme.login.bean.ChangePasswordBean$DataBean */
    public static class DataBean {
        private String description;
        private int error_code;
        private String mobile;
        private String platform;
        private String shark_ticket;

        public String getDescription() {
            return this.description;
        }

        public int getError_code() {
            return this.error_code;
        }

        public String getMobile() {
            return this.mobile;
        }

        public String getPlatform() {
            return this.platform;
        }

        public String getShark_ticket() {
            return this.shark_ticket;
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
