package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import com.airbnb.lottie.model.C1819g;
import com.airbnb.lottie.network.C1835b;
import com.airbnb.lottie.p055c.C1738t;
import com.airbnb.lottie.p056d.C1751f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.g */
public final class C1761g {

    /* renamed from: a */
    public static final Map<String, C1784m<C1757f>> f6346a = new HashMap();

    /* renamed from: a */
    private static String m8401a(int i) {
        StringBuilder sb = new StringBuilder("rawRes_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static C1783l<C1757f> m8394a(InputStream inputStream, String str) {
        return m8395a(inputStream, str, true);
    }

    /* renamed from: b */
    public static C1783l<C1757f> m8403b(Context context, String str) {
        return C1835b.m8597b(context, str);
    }

    /* renamed from: a */
    public static C1783l<C1757f> m8396a(ZipInputStream zipInputStream, String str) {
        try {
            return m8405b(zipInputStream, str);
        } finally {
            C1751f.m8373a((Closeable) zipInputStream);
        }
    }

    /* renamed from: c */
    public static C1784m<C1757f> m8406c(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        return m8400a(str, (Callable<C1783l<C1757f>>) new Callable<C1783l<C1757f>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1783l<C1757f> call() {
                return C1761g.m8407d(applicationContext, str);
            }
        });
    }

    /* renamed from: b */
    public static C1783l<C1757f> m8402b(Context context, int i) {
        try {
            return m8394a(context.getResources().openRawResource(i), m8401a(i));
        } catch (NotFoundException e) {
            return new C1783l<>((Throwable) e);
        }
    }

    /* renamed from: a */
    private static C1780i m8393a(C1757f fVar, String str) {
        for (C1780i iVar : fVar.f6333b.values()) {
            if (iVar.f6397d.equals(str)) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1783l<C1757f> m8404b(JsonReader jsonReader, String str) {
        try {
            C1757f a = C1738t.m8310a(jsonReader);
            C1819g.m8529a().mo7317a(str, a);
            return new C1783l<>(a);
        } catch (Exception e) {
            return new C1783l<>((Throwable) e);
        }
    }

    /* renamed from: d */
    public static C1783l<C1757f> m8407d(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder("asset_");
            sb.append(str);
            String sb2 = sb.toString();
            if (str.endsWith(".zip")) {
                return m8396a(new ZipInputStream(context.getAssets().open(str)), sb2);
            }
            return m8394a(context.getAssets().open(str), sb2);
        } catch (IOException e) {
            return new C1783l<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C1784m<C1757f> m8397a(Context context, final int i) {
        final Context applicationContext = context.getApplicationContext();
        return m8400a(m8401a(i), (Callable<C1783l<C1757f>>) new Callable<C1783l<C1757f>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1783l<C1757f> call() throws Exception {
                return C1761g.m8402b(applicationContext, i);
            }
        });
    }

    /* renamed from: a */
    public static C1784m<C1757f> m8398a(Context context, String str) {
        return C1835b.m8596a(context, str);
    }

    /* renamed from: b */
    private static C1783l<C1757f> m8405b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1757f fVar = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        fVar = (C1757f) m8395a(zipInputStream, str, false).f6424a;
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (fVar == null) {
                return new C1783l<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Entry entry : hashMap.entrySet()) {
                C1780i a = m8393a(fVar, (String) entry.getKey());
                if (a != null) {
                    a.f6399f = (Bitmap) entry.getValue();
                }
            }
            for (Entry entry2 : fVar.f6333b.entrySet()) {
                if (((C1780i) entry2.getValue()).f6399f == null) {
                    StringBuilder sb = new StringBuilder("There is no image for ");
                    sb.append(((C1780i) entry2.getValue()).f6397d);
                    return new C1783l<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            C1819g.m8529a().mo7317a(str, fVar);
            return new C1783l<>(fVar);
        } catch (IOException e) {
            return new C1783l<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C1784m<C1757f> m8399a(final JsonReader jsonReader, final String str) {
        return m8400a(str, (Callable<C1783l<C1757f>>) new Callable<C1783l<C1757f>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1783l<C1757f> call() throws Exception {
                return C1761g.m8404b(jsonReader, str);
            }
        });
    }

    /* renamed from: a */
    private static C1784m<C1757f> m8400a(final String str, Callable<C1783l<C1757f>> callable) {
        if (f6346a.containsKey(str)) {
            return (C1784m) f6346a.get(str);
        }
        C1784m<C1757f> mVar = new C1784m<>(callable);
        mVar.mo7275a((C1781j<T>) new C1781j<C1757f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo7127a(C1757f fVar) {
                C1761g.f6346a.remove(str);
            }
        });
        mVar.mo7281c(new C1781j<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo7127a(Throwable th) {
                C1761g.f6346a.remove(str);
            }
        });
        f6346a.put(str, mVar);
        return mVar;
    }

    /* renamed from: a */
    private static C1783l<C1757f> m8395a(InputStream inputStream, String str, boolean z) {
        try {
            return m8404b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C1751f.m8373a((Closeable) inputStream);
            }
        }
    }
}
