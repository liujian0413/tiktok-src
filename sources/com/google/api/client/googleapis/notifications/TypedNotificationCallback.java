package com.google.api.client.googleapis.notifications;

import com.google.api.client.http.C17265n;
import com.google.api.client.util.C17379u;
import com.google.api.client.util.C17384w;
import java.io.IOException;

public abstract class TypedNotificationCallback<T> implements UnparsedNotificationCallback {
    private static final long serialVersionUID = 1;

    /* access modifiers changed from: protected */
    public abstract Class<T> getDataClass() throws IOException;

    /* access modifiers changed from: protected */
    public abstract C17379u getObjectParser() throws IOException;

    /* access modifiers changed from: protected */
    public abstract void onNotification(StoredChannel storedChannel, C17228c<T> cVar) throws IOException;

    public final void onNotification(StoredChannel storedChannel, C17229d dVar) throws IOException {
        C17228c cVar = new C17228c(dVar);
        String str = dVar.f48016i;
        if (str != null) {
            cVar.mo44554a(getObjectParser().mo44592a(dVar.f48017j, new C17265n(str).mo44638b(), (Class) C17384w.m57847a(getDataClass())));
        }
        onNotification(storedChannel, cVar);
    }
}
