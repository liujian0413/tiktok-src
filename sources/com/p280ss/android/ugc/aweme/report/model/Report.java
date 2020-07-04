package com.p280ss.android.ugc.aweme.report.model;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.report.model.Report */
public class Report extends BaseResponse {
    public String getMessage() {
        return this.message;
    }

    public void setStatusMessage(String str) {
        this.message = str;
    }
}
