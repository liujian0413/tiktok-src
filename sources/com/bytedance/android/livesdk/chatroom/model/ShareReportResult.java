package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdkapi.message.C9505f;
import com.google.gson.p276a.C6593c;

public class ShareReportResult {
    @C6593c(mo15949a = "delta_intimacy")
    private long deltaIntimacy;
    @C6593c(mo15949a = "display_text")
    private C9505f displayText;

    public long getDeltaIntimacy() {
        return this.deltaIntimacy;
    }

    public C9505f getDisplayText() {
        return this.displayText;
    }

    @C6593c(mo15949a = "delta_intimacy")
    public void setDeltaIntimacy(long j) {
        this.deltaIntimacy = j;
    }

    @C6593c(mo15949a = "display_text")
    public void setDisplayText(C9505f fVar) {
        this.displayText = fVar;
    }
}
