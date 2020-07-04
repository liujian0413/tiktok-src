package com.p280ss.android.ugc.aweme.net.cache;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.net.C34101u;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.DiskLruCache.Editor;
import okhttp3.internal.p359io.FileSystem;
import okio.Buffer;
import okio.Sink;

/* renamed from: com.ss.android.ugc.aweme.net.cache.b */
public class C34046b {

    /* renamed from: a */
    private static volatile C34046b f88799a;

    /* renamed from: b */
    private final DiskLruCache f88800b = DiskLruCache.create(FileSystem.SYSTEM, m109632a(C6399b.m19921a()), 20190214, 1, 2097152);

    /* renamed from: c */
    private final ConcurrentHashMap<String, Long> f88801c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C34046b m109631a() {
        if (f88799a == null) {
            synchronized (C34046b.class) {
                if (f88799a == null) {
                    f88799a = new C34046b();
                }
            }
        }
        return f88799a;
    }

    private C34046b() {
    }

    /* renamed from: a */
    private static File m109632a(Context context) {
        File file;
        String str;
        if (context != null) {
            file = context.getCacheDir();
        } else {
            file = null;
        }
        if (file == null) {
            if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
                str = context.getCacheDir().getPath();
            } else if (context.getExternalCacheDir() != null) {
                str = context.getExternalCacheDir().getPath();
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append("net");
            file = new File(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        sb2.append(File.separator);
        sb2.append("net");
        return new File(sb2.toString());
    }

    /* renamed from: a */
    public static boolean m109633a(C12462c cVar) {
        if (C10944e.m32115b() != null && C10944e.m32115b().f29629k && cVar != null && !TextUtils.isEmpty(cVar.f33098b) && !C23477d.m77081a((Collection<T>) cVar.f33099c)) {
            for (C12461b bVar : cVar.f33099c) {
                if (bVar != null && "cache".equalsIgnoreCase(bVar.f33095a)) {
                    cVar.f33099c.remove(bVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m109634a(C12464d dVar, Sink sink) {
        try {
            byte[] bArr = new byte[4096];
            Buffer buffer = new Buffer();
            InputStream in = dVar.f33122e.mo10444in();
            buffer.writeLong(SystemClock.elapsedRealtime());
            while (true) {
                int read = in.read(bArr);
                if (read == -1) {
                    break;
                }
                buffer.write(bArr, 0, read);
                sink.write(buffer, (long) read);
                buffer.clear();
            }
            buffer.clear();
            buffer.close();
            in.close();
            if (sink != null) {
                sink.flush();
                sink.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo86736a(C12462c cVar, C12534t tVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f33098b) && tVar != null && tVar.mo30510a() == 200 && tVar.f33301a != null) {
            String str = "";
            if (!C23477d.m77081a((Collection<T>) cVar.f33099c)) {
                List b = cVar.mo30445b("cache-key");
                if (!C23477d.m77081a((Collection<T>) b)) {
                    str = ((C12461b) b.get(0)).f33096b;
                    cVar.f33099c.removeAll(b);
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = C34101u.m109776a(cVar.f33098b);
            }
            if (!TextUtils.isEmpty(str)) {
                new StringBuilder("CacheManager.put.key:").append(str);
                try {
                    Editor edit = this.f88800b.edit(str);
                    if (edit != null) {
                        if (m109634a(tVar.f33301a, edit.newSink(0))) {
                            edit.commit();
                            return;
                        }
                        edit.abort();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
