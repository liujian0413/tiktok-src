package com.zego.zegoavkit2.error;

public class ZegoError {
    public static native String getErrorMsg(int i);

    public static native boolean isDNSResolveError(int i);

    public static native boolean isHttpProtocolError(int i);

    public static native boolean isInitSDKError(int i);

    public static native boolean isLiveRoomError(int i);

    public static native boolean isLogicServerNetWrokError(int i);

    public static native boolean isManualKickoutError(int i);

    public static native boolean isMediaServerNetWorkError(int i);

    public static native boolean isMixStreamNotExistError(int i);

    public static native boolean isMultiLoginError(int i);

    public static native boolean isNetworkUnreachError(int i);

    public static native boolean isNotLoginError(int i);

    public static native boolean isPlayDeniedError(int i);

    public static native boolean isPlayForbidError(int i);

    public static native boolean isPlayStreamNotExistError(int i);

    public static native boolean isPublishBadNameError(int i);

    public static native boolean isPublishDeniedError(int i);

    public static native boolean isPublishForbidError(int i);

    public static native boolean isPublishStopError(int i);

    public static native boolean isReqFrequencyLimitError(int i);

    public static native boolean isRoomSessionError(int i);
}
