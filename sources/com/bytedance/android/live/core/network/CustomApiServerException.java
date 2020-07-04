package com.bytedance.android.live.core.network;

import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;

public class CustomApiServerException extends ApiServerException {
    private String url;
    private String xTtLogId;

    public String getUrl() {
        return this.url;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = CustomApiServerException, url = ");
        sb.append(this.url);
        sb.append(", xTtLogId = ");
        sb.append(this.xTtLogId);
        sb.append("  ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public CustomApiServerException(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.url = "";
        } else {
            this.url = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.xTtLogId = "";
        } else {
            this.xTtLogId = str2;
        }
    }
}
