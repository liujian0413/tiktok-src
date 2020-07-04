package com.kakao.usermgmt.response.model;

import android.os.Parcelable;

public interface User extends Parcelable {
    long getId();

    long getServiceUserId();

    String getUUID();
}
