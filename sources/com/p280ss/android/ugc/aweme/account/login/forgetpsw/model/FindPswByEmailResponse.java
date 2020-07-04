package com.p280ss.android.ugc.aweme.account.login.forgetpsw.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.model.FindPswByEmailResponse */
public class FindPswByEmailResponse extends BaseResponse {
    private static int NO_ACCOUNT = 1000;
    private static int NO_PASSPORT_ACCOUNT = 1011;
    @C6593c(mo15949a = "data")
    private DataBean data;

    /* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.model.FindPswByEmailResponse$DataBean */
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

    public boolean isNoAccountFind() {
        if (this.status_code == NO_ACCOUNT) {
            return true;
        }
        try {
            if (TextUtils.equals("success", this.message)) {
                return false;
            }
            return getData().getError_code() == NO_PASSPORT_ACCOUNT ? true : true;
        } catch (Exception unused) {
        }
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
