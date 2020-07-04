package com.facebook.imagepipeline.p724k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.facebook.common.memory.C13322g;
import com.facebook.common.util.C13337d;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.z */
public final class C13781z extends C13668ac {

    /* renamed from: a */
    private static final String[] f36576a = {"_id", "_data"};

    /* renamed from: b */
    private final ContentResolver f36577b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33298a() {
        return "LocalContentUriFetchProducer";
    }

    /* renamed from: a */
    private static int m40659a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: a */
    private C13647e m40660a(Uri uri) throws IOException {
        Cursor query = this.f36577b.query(uri, f36576a, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                C13647e b = mo33304b(new FileInputStream(string), m40659a(string));
                query.close();
                return b;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13647e mo33297a(ImageRequest imageRequest) throws IOException {
        InputStream inputStream;
        Uri uri = imageRequest.mSourceUri;
        if (C13337d.m39037e(uri)) {
            if (uri.toString().endsWith("/photo")) {
                inputStream = this.f36577b.openInputStream(uri);
            } else if (uri.toString().endsWith("/display_photo")) {
                try {
                    inputStream = this.f36577b.openAssetFileDescriptor(uri, "r").createInputStream();
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder("Contact photo does not exist: ");
                    sb.append(uri);
                    throw new IOException(sb.toString());
                }
            } else {
                inputStream = Contacts.openContactPhotoInputStream(this.f36577b, uri);
                if (inputStream == null) {
                    StringBuilder sb2 = new StringBuilder("Contact photo does not exist: ");
                    sb2.append(uri);
                    throw new IOException(sb2.toString());
                }
            }
            return mo33304b(inputStream, -1);
        }
        if (C13337d.m39038f(uri)) {
            C13647e a = m40660a(uri);
            if (a != null) {
                return a;
            }
        }
        return mo33304b(this.f36577b.openInputStream(uri), -1);
    }

    public C13781z(Executor executor, C13322g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f36577b = contentResolver;
    }
}
