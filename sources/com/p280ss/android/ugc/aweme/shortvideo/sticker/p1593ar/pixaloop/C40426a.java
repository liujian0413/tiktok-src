package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop;

import android.app.Application;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a */
public final class C40426a {

    /* renamed from: a */
    public static final C40426a f105087a = new C40426a();

    /* renamed from: b */
    private static List<String> f105088b = new ArrayList();

    /* renamed from: c */
    private static final int f105089c = f105089c;

    /* renamed from: d */
    private static final int f105090d = f105090d;

    /* renamed from: e */
    private static final int f105091e = f105091e;

    /* renamed from: f */
    private static boolean f105092f;

    /* renamed from: g */
    private static boolean f105093g = true;

    /* renamed from: h */
    private static boolean f105094h = true;

    /* renamed from: i */
    private static final String[] f105095i = {"_data"};

    private C40426a() {
    }

    /* renamed from: a */
    public static List<String> m129276a() {
        return f105088b;
    }

    /* renamed from: b */
    public static int m129281b() {
        return f105089c;
    }

    /* renamed from: c */
    public static int m129283c() {
        return f105090d;
    }

    /* renamed from: d */
    public static boolean m129285d() {
        return f105092f;
    }

    /* renamed from: e */
    public static boolean m129286e() {
        return f105093g;
    }

    /* renamed from: f */
    public static boolean m129287f() {
        return f105094h;
    }

    /* renamed from: g */
    public final List<String> mo100447g() {
        ArrayList arrayList = new ArrayList();
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        C7573i.m23582a((Object) externalStoragePublicDirectory, "Environment.getExternalS…vironment.DIRECTORY_DCIM)");
        String absolutePath = externalStoragePublicDirectory.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        sb.append('%');
        String[] strArr = {sb.toString()};
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        Cursor query = b.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, f105095i, "_data like ? ", strArr, "date_added DESC LIMIT 1000");
        if (query == null) {
            return null;
        }
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                if (C42973bg.m136427a(string) && m129280a(string)) {
                    arrayList.add(string);
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m129277a(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        f105088b = list;
    }

    /* renamed from: b */
    public static void m129282b(boolean z) {
        f105093g = z;
    }

    /* renamed from: c */
    public static void m129284c(boolean z) {
        f105094h = z;
    }

    /* renamed from: a */
    public static void m129278a(boolean z) {
        f105092f = z;
    }

    /* renamed from: a */
    public static boolean m129279a(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || TextUtils.isEmpty(faceStickerBean.getSdkExtra())) {
            return false;
        }
        String sdkExtra = faceStickerBean.getSdkExtra();
        C7573i.m23582a((Object) sdkExtra, "bean.sdkExtra");
        if (!C7634n.m23776c((CharSequence) sdkExtra, (CharSequence) "pl", false)) {
            return false;
        }
        String sdkExtra2 = faceStickerBean.getSdkExtra();
        C7573i.m23582a((Object) sdkExtra2, "bean.sdkExtra");
        if (!C7634n.m23776c((CharSequence) sdkExtra2, (CharSequence) "alg", false)) {
            return false;
        }
        try {
            return new JSONObject(faceStickerBean.getSdkExtra()).has("pl");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m129280a(String str) {
        if (!C42973bg.m136427a(str)) {
            return false;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        CharSequence charSequence = str2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        C7573i.m23582a((Object) str2, "type");
        if (C7634n.m23776c(charSequence, (CharSequence) "png", true) || C7634n.m23776c(charSequence, (CharSequence) "jpg", true) || C7634n.m23776c(charSequence, (CharSequence) "jpeg", true)) {
            return true;
        }
        return false;
    }
}
