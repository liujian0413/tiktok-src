package com.p280ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.bytedance.common.utility.reflect.C6322b;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.utils.fk */
public final class C43131fk {

    /* renamed from: d */
    private static C43131fk f111753d;

    /* renamed from: a */
    public Handler f111754a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public LruCache<String, Bitmap> f111755b = new LruCache<String, Bitmap>(this.f111758f / 5) {
        /* renamed from: a */
        private static int m136818a(String str, Bitmap bitmap) {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return m136818a((String) obj, (Bitmap) obj2);
        }
    };

    /* renamed from: c */
    public String f111756c = C35563c.f93238a.getCacheDir().getPath();

    /* renamed from: e */
    private ExecutorService f111757e = C43133fl.m136819a(4);

    /* renamed from: f */
    private int f111758f = ((int) Runtime.getRuntime().totalMemory());

    /* renamed from: a */
    public static C43131fk m136816a() {
        if (f111753d == null) {
            f111753d = new C43131fk();
        }
        return f111753d;
    }

    private C43131fk() {
    }

    /* renamed from: a */
    public static Bitmap m136815a(String str, int i, int i2, int i3) {
        return ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(str, 1), 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 2);
    }

    /* renamed from: b */
    public static Bitmap m136817b(String str, int i, int i2, int i3) {
        try {
            return ThumbnailUtils.extractThumbnail((Bitmap) C6322b.m19609a(ThumbnailUtils.class).mo15158a("createImageThumbnail", (Class<?>[]) new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(1)).f18556a, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
