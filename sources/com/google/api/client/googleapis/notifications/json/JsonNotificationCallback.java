package com.google.api.client.googleapis.notifications.json;

import com.google.api.client.googleapis.notifications.TypedNotificationCallback;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.C17293e;
import java.io.IOException;

public abstract class JsonNotificationCallback<T> extends TypedNotificationCallback<T> {
    private static final long serialVersionUID = 1;

    /* access modifiers changed from: protected */
    public abstract C17291c getJsonFactory() throws IOException;

    /* access modifiers changed from: protected */
    public final C17293e getObjectParser() throws IOException {
        return new C17293e(getJsonFactory());
    }
}
