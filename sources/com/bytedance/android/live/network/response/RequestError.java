package com.bytedance.android.live.network.response;

import com.google.gson.p276a.C6593c;

public class RequestError {
    @C6593c(mo15949a = "alert")
    public String alert;
    @C6593c(mo15949a = "message")
    public String message;
    @C6593c(mo15949a = "prompts")
    public String prompts = "Operation failed, please try again later";
    public transient String url;
}
