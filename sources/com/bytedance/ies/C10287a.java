package com.bytedance.ies;

import android.content.Context;
import com.google.gson.C6607f;
import com.google.gson.C6717s;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.WireTypeAdapterFactory;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okio.Okio;

/* renamed from: com.bytedance.ies.a */
public final class C10287a<M extends Message> {

    /* renamed from: a */
    private final Context f27943a;

    /* renamed from: b */
    private final DefaultValueProtoAdapter<M> f27944b;

    /* renamed from: c */
    private final C10288a<M> f27945c;

    /* renamed from: d */
    private final C10289b f27946d = null;

    /* renamed from: e */
    private final boolean f27947e = false;

    /* renamed from: com.bytedance.ies.a$a */
    public interface C10288a<T> {
        /* renamed from: a */
        T mo25009a();
    }

    /* renamed from: com.bytedance.ies.a$b */
    public interface C10289b {
        /* renamed from: a */
        String mo25010a(Context context);
    }

    /* renamed from: a */
    public final M mo25008a() {
        return m30468a(m30470a(this.f27943a));
    }

    /* renamed from: a */
    private static File m30470a(Context context) {
        return new File(context.getFilesDir(), "ies_settings.pb");
    }

    /* renamed from: a */
    private static void m30473a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private M m30468a(File file) {
        if (file.exists()) {
            M a = m30469a(file, (M) null);
            if (a != null) {
                return a;
            }
            M m = (Message) this.f27945c.mo25009a();
            M a2 = m30469a(file, m);
            if (a2 != null) {
                return a2;
            }
            return m;
        } else if (this.f27946d == null) {
            return (Message) this.f27945c.mo25009a();
        } else {
            M m2 = (Message) this.f27945c.mo25009a();
            try {
                String a3 = this.f27946d.mo25010a(this.f27943a);
                WireTypeAdapterFactory wireTypeAdapterFactory = new WireTypeAdapterFactory();
                wireTypeAdapterFactory.registerDefaultValue(m2, null);
                M m3 = (Message) new C6607f().mo15985a((C6717s) wireTypeAdapterFactory).mo15992f().mo15974a(a3, m2.getClass());
                m30472a(this.f27943a, m3, file);
                return m3;
            } catch (Throwable unused) {
                return m2;
            }
        }
    }

    /* renamed from: a */
    public static void m30471a(Context context, Message message) {
        m30472a(context, message, m30470a(context));
    }

    /* renamed from: a */
    private M m30469a(File file, M m) {
        FileInputStream fileInputStream;
        M m2;
        M m3 = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (m != null) {
                try {
                    m2 = (Message) this.f27944b.decode(new ProtoReader(Okio.buffer(Okio.source((InputStream) fileInputStream))), m);
                } catch (Throwable th) {
                    th = th;
                    m30473a((Closeable) fileInputStream);
                    throw th;
                }
            } else {
                m2 = (Message) this.f27944b.decode((InputStream) fileInputStream);
            }
            m3 = m2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            m30473a((Closeable) fileInputStream);
            throw th;
        }
        m30473a((Closeable) fileInputStream);
        return m3;
    }

    /* renamed from: a */
    private static void m30472a(Context context, Message message, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                message.encode((OutputStream) fileOutputStream2);
                m30473a((Closeable) fileOutputStream2);
            } catch (FileNotFoundException unused) {
                fileOutputStream = fileOutputStream2;
                m30473a((Closeable) fileOutputStream);
            } catch (IOException unused2) {
                fileOutputStream = fileOutputStream2;
                m30473a((Closeable) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                m30473a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            m30473a((Closeable) fileOutputStream);
        } catch (IOException unused4) {
            m30473a((Closeable) fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            m30473a((Closeable) fileOutputStream);
            throw th;
        }
    }

    public C10287a(Context context, DefaultValueProtoAdapter<M> defaultValueProtoAdapter, C10288a<M> aVar, C10289b bVar, boolean z) {
        this.f27943a = context;
        this.f27944b = defaultValueProtoAdapter;
        this.f27945c = aVar;
    }
}
