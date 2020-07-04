package com.bytedance.android.livesdk.chatroom.model;

import com.google.gson.p276a.C6593c;

public class DecorationTextAuditResult {
    public static final int AUDIT_STATUS_LIVE_DECO_TEXT_NO_PASS = 31;
    public static final int AUDIT_STATUS_LIVE_DECO_TEXT_PASS_BY_HUMAN = 33;
    public static final int AUDIT_STATUS_LIVE_DECO_TEXT_PASS_BY_MACHINE = 32;
    @C6593c(mo15949a = "audit_nopass_warn")
    private String auditNotPassWarnText;
    @C6593c(mo15949a = "audit_status")
    private int auditStatus;

    public String getAuditNotPassWarnText() {
        return this.auditNotPassWarnText;
    }

    public int getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditNotPassWarnText(String str) {
        this.auditNotPassWarnText = str;
    }

    public void setAuditStatus(int i) {
        this.auditStatus = i;
    }
}
