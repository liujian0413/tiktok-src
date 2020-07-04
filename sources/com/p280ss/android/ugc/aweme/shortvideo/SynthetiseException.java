package com.p280ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.SynthetiseException */
public class SynthetiseException extends RuntimeException {
    public static int FAIL_CODE_PRODUCE_DATA = 1001;
    public static int NO_SPACE_LEFT = 100101;
    public static int SYNTHETIC_CANCEL_CODE = -66666;
    SynthetiseResult result;

    public SynthetiseResult getResult() {
        return this.result;
    }

    public int getCode() {
        return this.result.ret;
    }

    public SynthetiseException(String str, SynthetiseResult synthetiseResult) {
        super(str);
        this.result = synthetiseResult;
    }

    public SynthetiseException(Throwable th, SynthetiseResult synthetiseResult) {
        super(th);
        this.result = synthetiseResult;
    }
}
