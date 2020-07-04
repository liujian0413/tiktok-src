package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.VEException */
public class VEException extends RuntimeException {
    private String msgDes;
    private int ret;

    public String getMsgDes() {
        return this.msgDes;
    }

    public int getRetCd() {
        return this.ret;
    }

    public VEException(int i, String str) {
        StringBuilder sb = new StringBuilder("VESDK exception ret: ");
        sb.append(i);
        sb.append("msg: ");
        sb.append(str);
        super(sb.toString());
        this.ret = i;
        this.msgDes = str;
    }
}
