package com.facebook.react.packagerconnection;

import com.facebook.common.p686c.C13286a;

public abstract class NotificationOnlyHandler implements RequestHandler {
    private static final String TAG = JSPackagerClient.class.getSimpleName();

    public abstract void onNotification(Object obj);

    public final void onRequest(Object obj, Responder responder) {
        responder.error("Request is not supported");
        C13286a.m38863d(TAG, "Request is not supported");
    }
}
