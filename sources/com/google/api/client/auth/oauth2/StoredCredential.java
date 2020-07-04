package com.google.api.client.auth.oauth2;

import com.google.api.client.util.C17380v;
import com.google.api.client.util.p783b.C17355a;
import com.google.api.client.util.p783b.C17356b;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class StoredCredential implements Serializable {
    public static final String DEFAULT_DATA_STORE_ID = "StoredCredential";
    private static final long serialVersionUID = 1;
    private String accessToken;
    private Long expirationTimeMilliseconds;
    private final Lock lock = new ReentrantLock();
    private String refreshToken;

    public StoredCredential() {
    }

    public final String getAccessToken() {
        this.lock.lock();
        try {
            return this.accessToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpirationTimeMilliseconds() {
        this.lock.lock();
        try {
            return this.expirationTimeMilliseconds;
        } finally {
            this.lock.unlock();
        }
    }

    public final String getRefreshToken() {
        this.lock.lock();
        try {
            return this.refreshToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getAccessToken(), getRefreshToken(), getExpirationTimeMilliseconds()});
    }

    public final String toString() {
        return C17380v.m57842a(StoredCredential.class).mo44870a("accessToken", getAccessToken()).mo44870a("refreshToken", getRefreshToken()).mo44870a("expirationTimeMilliseconds", getExpirationTimeMilliseconds()).toString();
    }

    public static C17355a<StoredCredential> getDefaultDataStore(C17356b bVar) throws IOException {
        return bVar.mo44822a(DEFAULT_DATA_STORE_ID);
    }

    public StoredCredential(C17196d dVar) {
        setAccessToken(dVar.mo44485a());
        setRefreshToken(dVar.mo44489b());
        setExpirationTimeMilliseconds(dVar.mo44490c());
    }

    public final StoredCredential setAccessToken(String str) {
        this.lock.lock();
        try {
            this.accessToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public final StoredCredential setExpirationTimeMilliseconds(Long l) {
        this.lock.lock();
        try {
            this.expirationTimeMilliseconds = l;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public final StoredCredential setRefreshToken(String str) {
        this.lock.lock();
        try {
            this.refreshToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredCredential)) {
            return false;
        }
        StoredCredential storedCredential = (StoredCredential) obj;
        if (!C17380v.m57843a(getAccessToken(), storedCredential.getAccessToken()) || !C17380v.m57843a(getRefreshToken(), storedCredential.getRefreshToken()) || !C17380v.m57843a(getExpirationTimeMilliseconds(), storedCredential.getExpirationTimeMilliseconds())) {
            return false;
        }
        return true;
    }
}
