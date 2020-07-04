package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitcompat.C6548c;
import com.google.android.play.core.splitinstall.C6567p;
import com.google.android.play.core.splitinstall.C6568q;
import com.google.android.play.core.splitinstall.C6570s;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.internal.b */
public final class C6521b implements C6567p {

    /* renamed from: a */
    private final Context f18831a;

    /* renamed from: b */
    private final C6548c f18832b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6523d f18833c;

    /* renamed from: d */
    private final Executor f18834d;

    /* renamed from: e */
    private final C6570s f18835e;

    public C6521b(Context context, Executor executor, C6523d dVar, C6548c cVar, C6570s sVar) {
        this.f18831a = context;
        this.f18832b = cVar;
        this.f18833c = dVar;
        this.f18834d = executor;
        this.f18835e = sVar;
    }

    /* renamed from: a */
    private final Integer m20268a(List<Intent> list) {
        FileChannel channel;
        FileLock fileLock;
        Integer num;
        Throwable th;
        try {
            channel = new RandomAccessFile(this.f18832b.mo15906b(), "rw").getChannel();
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                num = Integer.valueOf(m20275b(list));
                fileLock.release();
            } else {
                num = null;
            }
            if (channel != null) {
                m20274a((Throwable) null, channel);
            }
            return num;
        } catch (Exception unused2) {
            return Integer.valueOf(-13);
        } catch (Throwable th2) {
            if (channel != null) {
                m20274a(th, channel);
            }
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20271a(C6568q qVar) {
        try {
            if (!C6570s.m20402a(this.f18831a.getApplicationContext())) {
                qVar.mo15932a(-12);
            } else {
                qVar.mo15931a();
            }
        } catch (Exception unused) {
            qVar.mo15932a(-12);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m20272a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C6514ak.m20231a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m20273a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
            } catch (Throwable th2) {
                C6514ak.m20231a(th, th2);
            }
        } else {
            outputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m20274a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C6514ak.m20231a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: b */
    private final int m20275b(List<Intent> list) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        Throwable th3;
        try {
            for (Intent intent : list) {
                String stringExtra = intent.getStringExtra("split_id");
                File a = this.f18832b.mo15903a(stringExtra);
                if (!a.exists() && !this.f18832b.mo15907b(stringExtra).exists()) {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f18831a.getContentResolver().openFileDescriptor(intent.getData(), "r").getFileDescriptor()));
                    fileOutputStream = new FileOutputStream(a);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        m20272a((Throwable) null, (InputStream) bufferedInputStream);
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        th3 = r9;
                        th2 = th5;
                    }
                }
            }
            try {
                return !this.f18833c.mo15886a() ? -11 : 0;
            } catch (Exception unused) {
                return -11;
            }
            m20273a(th3, (OutputStream) fileOutputStream);
            throw th2;
        } catch (Exception unused2) {
            return -13;
        } catch (Throwable th6) {
            m20272a(th, (InputStream) bufferedInputStream);
            throw th6;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20276b(List<Intent> list, C6568q qVar) {
        Integer a = m20268a(list);
        if (a != null) {
            if (a.intValue() == 0) {
                qVar.mo15933b();
            } else {
                qVar.mo15932a(a.intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo15885a(List<Intent> list, C6568q qVar) {
        if (C6570s.m20401a()) {
            this.f18834d.execute(new C6524e(this, list, qVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
