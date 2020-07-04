package com.google.api.client.googleapis.notifications;

import java.io.IOException;
import java.io.Serializable;

public interface UnparsedNotificationCallback extends Serializable {
    void onNotification(StoredChannel storedChannel, C17229d dVar) throws IOException;
}
