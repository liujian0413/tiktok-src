package com.p280ss.ugc.live.gift.resource.exception;

import com.p280ss.ugc.live.gift.resource.C46220c;

/* renamed from: com.ss.ugc.live.gift.resource.exception.Md5InvalidException */
public class Md5InvalidException extends BaseGetResourceException {
    private String mMd5;

    public String getMessage() {
        StringBuilder sb = new StringBuilder("md5:");
        sb.append(this.mMd5);
        sb.append("\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public Md5InvalidException(C46220c cVar, String str) {
        super(cVar);
        this.mMd5 = str;
    }

    public Md5InvalidException(String str, C46220c cVar, String str2) {
        super(str, cVar);
        this.mMd5 = str2;
    }

    public Md5InvalidException(String str, Throwable th, C46220c cVar, String str2) {
        super(str, th, cVar);
        this.mMd5 = str2;
    }
}
