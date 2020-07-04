package com.zhihu.matisse;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.p022v4.util.C0888a;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.zhihu.matisse.internal.p1855a.C47330d;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;

public enum MimeType {
    JPEG("image/jpeg", arraySetOf("jpg", "jpeg")),
    PNG("image/png", arraySetOf("png")),
    GIF("image/gif", arraySetOf("gif")),
    BMP("image/x-ms-bmp", arraySetOf("bmp")),
    WEBP("image/webp", arraySetOf("webp")),
    MPEG("video/mpeg", arraySetOf("mpeg", "mpg")),
    MP4("video/mp4", arraySetOf("mp4", "m4v")),
    QUICKTIME("video/quicktime", arraySetOf("mov")),
    THREEGPP("video/3gpp", arraySetOf("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", arraySetOf("3g2", "3gpp2")),
    MKV("video/x-matroska", arraySetOf("mkv")),
    WEBM("video/webm", arraySetOf("webm")),
    TS("video/mp2ts", arraySetOf("ts")),
    AVI("video/avi", arraySetOf("avi"));
    
    private final Set<String> mExtensions;
    private final String mMimeTypeName;

    public final String toString() {
        return this.mMimeTypeName;
    }

    public static Set<MimeType> ofAll() {
        return EnumSet.allOf(MimeType.class);
    }

    public static Set<MimeType> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP);
    }

    public static Set<MimeType> ofVideo() {
        return EnumSet.of(MPEG, new MimeType[]{MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI});
    }

    private static Set<String> arraySetOf(String... strArr) {
        return new C0888a((Collection<E>) Arrays.asList(strArr));
    }

    /* renamed from: of */
    public static Set<MimeType> m147747of(MimeType mimeType, MimeType... mimeTypeArr) {
        return EnumSet.of(mimeType, mimeTypeArr);
    }

    public final boolean checkType(ContentResolver contentResolver, Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String str = null;
        boolean z = false;
        for (String str2 : this.mExtensions) {
            if (str2.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                String a = C47330d.m147780a(contentResolver, uri);
                if (!TextUtils.isEmpty(a)) {
                    a = a.toLowerCase(Locale.US);
                }
                str = a;
                z = true;
            }
            if (str != null && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private MimeType(String str, Set<String> set) {
        this.mMimeTypeName = str;
        this.mExtensions = set;
    }
}
