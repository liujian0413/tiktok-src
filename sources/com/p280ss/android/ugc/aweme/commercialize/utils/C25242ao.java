package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ao */
public final class C25242ao {

    /* renamed from: a */
    public static final C25242ao f66579a = new C25242ao();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f66580b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final LinkedList<String> f66581c = new LinkedList<>();

    private C25242ao() {
    }

    /* renamed from: b */
    public static final boolean m82976b(Challenge challenge) {
        if (challenge == null || !m82979c(challenge)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m82973a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct != null && textExtraStruct.isCommerce()) {
            m82974a(textExtraStruct.getCid());
            m82974a(textExtraStruct.getHashTagName());
        }
    }

    /* renamed from: b */
    public static final boolean m82977b(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        ReadLock readLock = f66580b.readLock();
        readLock.lock();
        try {
            return f66581c.contains(str);
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: c */
    private static void m82978c(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f66581c.remove(str);
            f66581c.add(str);
            while (f66581c.size() > 100) {
                f66581c.removeFirst();
            }
        }
    }

    /* renamed from: c */
    public static final boolean m82979c(Challenge challenge) {
        boolean z;
        C7573i.m23587b(challenge, "$this$isCommerceChallenge");
        if (challenge.isCommerce() || challenge.isCommerceAndValid()) {
            return true;
        }
        CharSequence schema = challenge.getSchema();
        if (schema == null || schema.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String queryParameter = Uri.parse(challenge.getSchema()).getQueryParameter("is_commerce");
            if (C7573i.m23585a((Object) queryParameter, (Object) "1") || C7634n.m23717a("true", queryParameter, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final void m82972a(Challenge challenge) {
        int i;
        if (challenge != null && m82979c(challenge)) {
            ReentrantReadWriteLock reentrantReadWriteLock = f66580b;
            ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
            WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                m82978c(challenge.getCid());
                m82978c(challenge.getChallengeName());
                writeLock.unlock();
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public static final void m82974a(String str) {
        boolean z;
        int i;
        CharSequence charSequence = str;
        int i2 = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ReentrantReadWriteLock reentrantReadWriteLock = f66580b;
            ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
            WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                m82978c(str);
                writeLock.unlock();
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public static final void m82975a(String str, String str2) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                m82971a(parse, str2);
            }
        }
    }

    /* renamed from: a */
    public static final void m82971a(Uri uri, String str) {
        boolean z;
        int i;
        if (uri != null) {
            CharSequence charSequence = str;
            int i2 = 0;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String queryParameter = uri.getQueryParameter("is_commerce");
                if (C7573i.m23585a((Object) queryParameter, (Object) "1") || C7634n.m23717a("true", queryParameter, true)) {
                    ReentrantReadWriteLock reentrantReadWriteLock = f66580b;
                    ReadLock readLock = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                    } else {
                        i = 0;
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                    WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        m82978c(str);
                        writeLock.unlock();
                    } finally {
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    }
                }
            }
        }
    }
}
