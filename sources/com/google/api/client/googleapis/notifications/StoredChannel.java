package com.google.api.client.googleapis.notifications;

import com.google.api.client.util.C17380v;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.p783b.C17355a;
import com.google.api.client.util.p783b.C17356b;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class StoredChannel implements Serializable {
    public static final String DEFAULT_DATA_STORE_ID = "StoredChannel";
    private static final long serialVersionUID = 1;
    private String clientToken;
    private Long expiration;

    /* renamed from: id */
    private final String f48006id;
    private final Lock lock;
    private final UnparsedNotificationCallback notificationCallback;
    private String topicId;

    public final int hashCode() {
        return getId().hashCode();
    }

    public final String getClientToken() {
        this.lock.lock();
        try {
            return this.clientToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpiration() {
        this.lock.lock();
        try {
            return this.expiration;
        } finally {
            this.lock.unlock();
        }
    }

    public final String getId() {
        this.lock.lock();
        try {
            return this.f48006id;
        } finally {
            this.lock.unlock();
        }
    }

    public final UnparsedNotificationCallback getNotificationCallback() {
        this.lock.lock();
        try {
            return this.notificationCallback;
        } finally {
            this.lock.unlock();
        }
    }

    public final String getTopicId() {
        this.lock.lock();
        try {
            return this.topicId;
        } finally {
            this.lock.unlock();
        }
    }

    public final String toString() {
        return C17380v.m57842a(StoredChannel.class).mo44870a("notificationCallback", getNotificationCallback()).mo44870a("clientToken", getClientToken()).mo44870a("expiration", getExpiration()).mo44870a("id", getId()).mo44870a("topicId", getTopicId()).toString();
    }

    public StoredChannel(UnparsedNotificationCallback unparsedNotificationCallback) {
        this(unparsedNotificationCallback, C17227b.m57236a());
    }

    public static C17355a<StoredChannel> getDefaultDataStore(C17356b bVar) throws IOException {
        return bVar.mo44822a(DEFAULT_DATA_STORE_ID);
    }

    public final StoredChannel store(C17356b bVar) throws IOException {
        return store(getDefaultDataStore(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredChannel)) {
            return false;
        }
        return getId().equals(((StoredChannel) obj).getId());
    }

    public final StoredChannel setClientToken(String str) {
        this.lock.lock();
        try {
            this.clientToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public final StoredChannel setExpiration(Long l) {
        this.lock.lock();
        try {
            this.expiration = l;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public final StoredChannel setTopicId(String str) {
        this.lock.lock();
        try {
            this.topicId = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public final StoredChannel store(C17355a<StoredChannel> aVar) throws IOException {
        this.lock.lock();
        try {
            getId();
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public StoredChannel(UnparsedNotificationCallback unparsedNotificationCallback, String str) {
        this.lock = new ReentrantLock();
        this.notificationCallback = (UnparsedNotificationCallback) C17384w.m57847a(unparsedNotificationCallback);
        this.f48006id = (String) C17384w.m57847a(str);
    }
}
