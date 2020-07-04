package com.bytedance.android.livesdk.verify.model;

import com.google.gson.p276a.C6593c;

public class QueryZhimaStatusResponse {
    public static final int NOT_PASSED = 0;
    public static final int PASSED = 1;
    @C6593c(mo15949a = "failed_reason")
    private String failedReason;
    @C6593c(mo15949a = "msg")
    private String message;
    @C6593c(mo15949a = "is_verified")
    private boolean passed;
    @C6593c(mo15949a = "status_code")
    private int statusCode;

    public String getFailedReason() {
        return this.failedReason;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
