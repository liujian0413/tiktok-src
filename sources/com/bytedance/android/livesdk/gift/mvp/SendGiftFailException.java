package com.bytedance.android.livesdk.gift.mvp;

import com.bytedance.android.live.api.exceptions.local.ApiLocalException;

public class SendGiftFailException extends ApiLocalException {
    public SendGiftFailException() {
        super(-4);
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = SendGiftFailException ");
        sb.append(super.getMessage());
        return sb.toString();
    }
}
