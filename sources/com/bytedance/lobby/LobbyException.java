package com.bytedance.lobby;

import android.text.TextUtils;

public final class LobbyException extends Exception {
    private int mErrorCode;
    private String mErrorMessage;
    private boolean mIsCancelled;
    private boolean mIsFromLobby;
    private int mProviderErrorCode;

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    public final int getProviderErrorCode() {
        return this.mProviderErrorCode;
    }

    public final boolean isCancelled() {
        return this.mIsCancelled;
    }

    public final boolean isFromLobby() {
        return this.mIsFromLobby;
    }

    public final String getMessage() {
        if (getCause() != null) {
            return super.getMessage();
        }
        return this.mErrorMessage;
    }

    public final String toString() {
        if (getCause() != null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("LobbyException{");
        sb.append("code: ");
        sb.append(getErrorCode());
        sb.append(", providerCode: ");
        sb.append(getProviderErrorCode());
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", cancelled: ");
        sb.append(isCancelled());
        sb.append(", fromLobby: ");
        sb.append(isFromLobby());
        sb.append("}");
        return sb.toString();
    }

    public final LobbyException setCancelled(boolean z) {
        this.mIsCancelled = z;
        return this;
    }

    public LobbyException(Exception exc) {
        super(exc);
        this.mErrorCode = -999;
    }

    public LobbyException(int i, String str) {
        this(i, 0, str);
    }

    public LobbyException(int i, int i2, String str) {
        this.mErrorCode = -999;
        this.mErrorCode = i;
        this.mProviderErrorCode = i2;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mErrorMessage = str;
        this.mIsFromLobby = true;
        if (i == 4) {
            setCancelled(true);
        }
    }
}
