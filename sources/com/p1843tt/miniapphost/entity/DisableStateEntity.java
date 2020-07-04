package com.p1843tt.miniapphost.entity;

/* renamed from: com.tt.miniapphost.entity.DisableStateEntity */
public class DisableStateEntity {
    private final String mDisableHintMessage;
    private final String mDisableHintUrl;

    public String getHintMessage() {
        return this.mDisableHintMessage;
    }

    public String getHintUrl() {
        return this.mDisableHintUrl;
    }

    public DisableStateEntity(String str, String str2) {
        this.mDisableHintMessage = str;
        this.mDisableHintUrl = str2;
    }
}
