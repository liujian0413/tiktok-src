package com.facebook.imagepipeline.p724k;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13322g;
import com.facebook.common.p685b.C13275a;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.k.l */
public final class C13749l extends C13668ac {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33298a() {
        return "DataFetchProducer";
    }

    public C13749l(C13322g gVar) {
        super(C13275a.m38815a(), gVar);
    }

    /* renamed from: b */
    private static boolean m40575b(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13647e mo33297a(ImageRequest imageRequest) throws IOException {
        byte[] a = m40574a(imageRequest.mSourceUri.toString());
        return mo33303a((InputStream) new ByteArrayInputStream(a), a.length);
    }

    /* renamed from: a */
    private static byte[] m40574a(String str) {
        C13307g.m38943a(str.substring(0, 5).equals("data:"));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (m40575b(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        return Uri.decode(substring).getBytes();
    }
}
