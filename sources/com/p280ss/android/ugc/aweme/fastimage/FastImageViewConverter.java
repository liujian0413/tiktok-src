package com.p280ss.android.ugc.aweme.fastimage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView.ScaleType;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.fastimage.FastImageViewConverter */
final class FastImageViewConverter {

    /* renamed from: a */
    private static final Drawable f58166a = new ColorDrawable(0);

    /* renamed from: b */
    private static final Map<String, FastImageCacheControl> f58167b = new HashMap<String, FastImageCacheControl>() {
        {
            put("immutable", FastImageCacheControl.IMMUTABLE);
            put("web", FastImageCacheControl.WEB);
            put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        }
    };

    /* renamed from: c */
    private static final Map<String, Priority> f58168c = new HashMap<String, Priority>() {
        {
            put("low", Priority.LOW);
            put("normal", Priority.MEDIUM);
            put("high", Priority.HIGH);
        }
    };

    /* renamed from: d */
    private static final Map<String, ScaleType> f58169d = new HashMap<String, ScaleType>() {
        {
            put("contain", ScaleType.FIT_CENTER);
            put("cover", ScaleType.CENTER_CROP);
            put("stretch", ScaleType.FIT_XY);
            put("center", ScaleType.CENTER);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.fastimage.FastImageViewConverter$FastImageCacheControl */
    public enum FastImageCacheControl {
        IMMUTABLE,
        WEB,
        CACHE_ONLY
    }

    /* renamed from: a */
    public static Priority m72646a(ReadableMap readableMap) {
        return (Priority) m72647a("priority", "normal", f58168c, readableMap);
    }

    /* renamed from: b */
    public static RequestLevel m72649b(ReadableMap readableMap) {
        FastImageCacheControl fastImageCacheControl = (FastImageCacheControl) m72647a("cache", "immutable", f58167b, readableMap);
        Boolean valueOf = Boolean.valueOf(false);
        Boolean valueOf2 = Boolean.valueOf(false);
        switch (fastImageCacheControl) {
            case WEB:
                valueOf2 = Boolean.valueOf(true);
                break;
            case CACHE_ONLY:
                valueOf = Boolean.valueOf(true);
                break;
        }
        if (valueOf2.booleanValue()) {
            return RequestLevel.FULL_FETCH;
        }
        if (valueOf.booleanValue()) {
            return RequestLevel.DISK_CACHE;
        }
        return null;
    }

    /* renamed from: a */
    private static <T> T m72647a(String str, String str2, Map<String, T> map, ReadableMap readableMap) {
        String str3 = null;
        if (readableMap != null) {
            try {
                str3 = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return m72648a(str, str2, map, str3);
    }

    /* renamed from: a */
    private static <T> T m72648a(String str, String str2, Map<String, T> map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        T t = map.get(str2);
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("FastImage, invalid ");
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }
}
