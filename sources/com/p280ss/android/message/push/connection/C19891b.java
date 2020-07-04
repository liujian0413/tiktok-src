package com.p280ss.android.message.push.connection;

/* renamed from: com.ss.android.message.push.connection.b */
public final class C19891b {

    /* renamed from: a */
    public final ConnectionState f53950a;

    /* renamed from: b */
    public final ConnectionState f53951b;

    public final int hashCode() {
        return this.f53950a.hashCode() + this.f53951b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C19891b)) {
            return false;
        }
        C19891b bVar = (C19891b) obj;
        if (this.f53951b == bVar.f53951b && this.f53950a == bVar.f53950a) {
            return true;
        }
        return false;
    }

    public C19891b(ConnectionState connectionState, ConnectionState connectionState2) throws IllegalArgumentException {
        if (connectionState != connectionState2) {
            this.f53950a = connectionState;
            this.f53951b = connectionState2;
            return;
        }
        StringBuilder sb = new StringBuilder("Attempted to create an connection state update where both previous and current state are: ");
        sb.append(connectionState2);
        throw new IllegalArgumentException(sb.toString());
    }
}
