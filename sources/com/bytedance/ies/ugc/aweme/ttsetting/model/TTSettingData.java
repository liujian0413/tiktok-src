package com.bytedance.ies.ugc.aweme.ttsetting.model;

public final class TTSettingData {
    private TTSettingDataBean data;
    private String message;

    public final TTSettingDataBean getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setData(TTSettingDataBean tTSettingDataBean) {
        this.data = tTSettingDataBean;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
