package com.p280ss.android.ugc.aweme.base.api;

import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;

/* renamed from: com.ss.android.ugc.aweme.base.api.BaseResponse */
public class BaseResponse extends C23268a {
    public int error_code;
    public ServerTimeExtra extra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    /* renamed from: com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra */
    public static class ServerTimeExtra {
        public String logid;
        public long now;

        public String toString() {
            StringBuilder sb = new StringBuilder("{now=");
            sb.append(this.now);
            sb.append(", logid='");
            sb.append(this.logid);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public <T> T checkValid() throws Throwable {
        checkStatusCode();
        super.checkValid();
        return this;
    }

    private void checkStatusCode() throws ApiServerException {
        if (this.status_code != 0) {
            throw new ApiServerException(this.status_code).setErrorMsg(this.status_msg).setPrompt(this.prompts).setResponse((Object) this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseResponse{status_code=");
        sb.append(this.status_code);
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", status_msg='");
        sb.append(this.status_msg);
        sb.append('\'');
        sb.append(", prompts='");
        sb.append(this.prompts);
        sb.append('\'');
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append('}');
        return sb.toString();
    }
}
