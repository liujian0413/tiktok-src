package com.google.api.client.googleapis.testing.notifications;

import com.google.api.client.googleapis.notifications.C17229d;
import com.google.api.client.googleapis.notifications.StoredChannel;
import com.google.api.client.googleapis.notifications.UnparsedNotificationCallback;
import java.io.IOException;

public class MockUnparsedNotificationCallback implements UnparsedNotificationCallback {
    private static final long serialVersionUID = 0;
    private boolean wasCalled;

    public boolean wasCalled() {
        return this.wasCalled;
    }

    public void onNotification(StoredChannel storedChannel, C17229d dVar) throws IOException {
        this.wasCalled = true;
    }
}
