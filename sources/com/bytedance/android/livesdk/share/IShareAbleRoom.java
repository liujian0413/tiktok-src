package com.bytedance.android.livesdk.share;

import com.bytedance.android.livesdkapi.depend.share.IShareAble;

public interface IShareAbleRoom extends IShareAble {
    String getLiveType();

    String getLogPb();

    String getRequestId();

    long getRoomId();

    String getSourceType();

    long getUserFrom();

    long getUserId();
}
