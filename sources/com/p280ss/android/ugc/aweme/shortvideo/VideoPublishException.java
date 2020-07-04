package com.p280ss.android.ugc.aweme.shortvideo;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.VideoPublishException */
public class VideoPublishException extends RuntimeException {
    private boolean isRecover;
    private String stage;

    public String getStage() {
        return this.stage;
    }

    public boolean isRecover() {
        return this.isRecover;
    }

    public boolean isCauseByApiServerException() {
        return getCause() instanceof ApiServerException;
    }

    public boolean isCauseByNoSpaceLeft() {
        if (!(getCause() instanceof SynthetiseException) || ((SynthetiseException) getCause()).getCode() != SynthetiseException.NO_SPACE_LEFT) {
            return false;
        }
        return true;
    }

    public boolean isFJ() {
        if (!(getCause() instanceof ApiServerException)) {
            return false;
        }
        ApiServerException apiServerException = (ApiServerException) getCause();
        if ((apiServerException.getErrorCode() != 21 || !C6399b.m19944t()) && (apiServerException.getErrorCode() != 20 || !C6399b.m19945u())) {
            return false;
        }
        return true;
    }

    public VideoPublishException(Throwable th) {
        super(th);
    }

    public void setRecover(boolean z) {
        this.isRecover = z;
    }

    public void setStage(String str) {
        this.stage = str;
    }

    public VideoPublishException(Throwable th, String str) {
        super(th);
        this.stage = str;
    }
}
