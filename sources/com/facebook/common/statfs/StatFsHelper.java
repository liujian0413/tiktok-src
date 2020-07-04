package com.facebook.common.statfs;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.C13315l;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class StatFsHelper {

    /* renamed from: a */
    private static StatFsHelper f35239a;

    /* renamed from: b */
    private static final long f35240b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: c */
    private volatile StatFs f35241c;

    /* renamed from: d */
    private volatile File f35242d;

    /* renamed from: e */
    private volatile StatFs f35243e;

    /* renamed from: f */
    private volatile File f35244f;

    /* renamed from: g */
    private long f35245g;

    /* renamed from: h */
    private final Lock f35246h = new ReentrantLock();

    /* renamed from: i */
    private volatile boolean f35247i;

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    protected StatFsHelper() {
    }

    /* renamed from: a */
    public static synchronized StatFsHelper m39016a() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (f35239a == null) {
                f35239a = new StatFsHelper();
            }
            statFsHelper = f35239a;
        }
        return statFsHelper;
    }

    /* renamed from: d */
    private void m39019d() {
        this.f35241c = m39014a(this.f35241c, this.f35242d);
        this.f35243e = m39014a(this.f35243e, this.f35244f);
        this.f35245g = SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    private void m39017b() {
        if (!this.f35247i) {
            this.f35246h.lock();
            try {
                if (!this.f35247i) {
                    this.f35242d = Environment.getDataDirectory();
                    this.f35244f = Environment.getExternalStorageDirectory();
                    m39019d();
                    this.f35247i = true;
                }
            } finally {
                this.f35246h.unlock();
            }
        }
    }

    /* renamed from: c */
    private void m39018c() {
        if (this.f35246h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f35245g > f35240b) {
                    m39019d();
                }
            } finally {
                this.f35246h.unlock();
            }
        }
    }

    /* renamed from: a */
    private static StatFs m39015a(String str) {
        return new StatFs(str);
    }

    /* renamed from: a */
    private long m39013a(StorageType storageType) {
        StatFs statFs;
        long j;
        long j2;
        m39017b();
        m39018c();
        if (storageType == StorageType.INTERNAL) {
            statFs = this.f35241c;
        } else {
            statFs = this.f35243e;
        }
        if (statFs == null) {
            return 0;
        }
        if (VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    /* renamed from: a */
    private static StatFs m39014a(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = m39015a(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                statFs = null;
            } catch (Throwable th) {
                throw C13315l.m38962b(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    /* renamed from: a */
    public final boolean mo32620a(StorageType storageType, long j) {
        m39017b();
        long a = m39013a(storageType);
        if (a <= 0 || a < j) {
            return true;
        }
        return false;
    }
}
