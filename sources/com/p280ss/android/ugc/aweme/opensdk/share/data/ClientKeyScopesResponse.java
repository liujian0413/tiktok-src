package com.p280ss.android.ugc.aweme.opensdk.share.data;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse */
public class ClientKeyScopesResponse extends BaseResponse {
    private DataBean data;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse$DataBean */
    public static class DataBean {
        private String app_name;
        private List<ScopesBean> scopes;

        /* renamed from: com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse$DataBean$ScopesBean */
        public static class ScopesBean {
            private String desc;
            private String name;

            public String getDesc() {
                return this.desc;
            }

            public String getName() {
                return this.name;
            }

            public void setDesc(String str) {
                this.desc = str;
            }

            public void setName(String str) {
                this.name = str;
            }
        }

        public String getAppName() {
            return this.app_name;
        }

        public List<ScopesBean> getScopes() {
            return this.scopes;
        }

        public void setAppName(String str) {
            this.app_name = str;
        }

        public void setScopes(List<ScopesBean> list) {
            this.scopes = list;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
