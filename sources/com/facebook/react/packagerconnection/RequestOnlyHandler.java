package com.facebook.react.packagerconnection;

import com.facebook.common.p686c.C13286a;

public abstract class RequestOnlyHandler implements RequestHandler {
    private static final String TAG = JSPackagerClient.class.getSimpleName();

    public abstract void onRequest(Object obj, Responder responder);

    public final void onNotification(Object obj) {
        C13286a.m38863d(TAG, "Notification is not supported");
    }
}
