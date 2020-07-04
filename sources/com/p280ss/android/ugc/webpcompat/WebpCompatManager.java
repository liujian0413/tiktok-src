package com.p280ss.android.ugc.webpcompat;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.SystemClock;
import com.bytedance.p255e.C6326a;
import com.facebook.imagepipeline.nativecode.C13838d;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.taobao.android.dexposed.DexposedBridge;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.webpcompat.WebpCompatManager */
public class WebpCompatManager {
    public static Method decodeByteArrayMethod;
    public static Method decodeFileDescriptorMethod;
    public static Method decodeFileMethod;
    public static Method decodeStreamMethod;
    private static WebpCompatManager instance = new WebpCompatManager();
    public static Context mContext;
    public static boolean useLibrarian;
    private boolean mInited;
    public IWebpErrorCallback mWebpErrorCallback;

    /* renamed from: com.ss.android.ugc.webpcompat.WebpCompatManager$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private WebpCompatManager() {
    }

    public static WebpCompatManager getInstance() {
        return instance;
    }

    private boolean loadWebpSupportLibrary() {
        try {
            C13838d.m40862a();
            return true;
        } catch (Exception e) {
            if (this.mWebpErrorCallback != null) {
                this.mWebpErrorCallback.onWebpError(5, e.toString());
            }
            return false;
        }
    }

    private boolean loadDexposedLibrary() {
        try {
            if (!useLibrarian || mContext == null) {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("dexposed");
            } else {
                C6326a.m19642a("dexposed", mContext);
            }
            return true;
        } catch (Throwable th) {
            if (this.mWebpErrorCallback != null) {
                this.mWebpErrorCallback.onWebpError(1, th.toString());
            }
            return false;
        }
    }

    private void initMethods() {
        Class<BitmapFactory> cls = BitmapFactory.class;
        try {
            decodeByteArrayMethod = cls.getDeclaredMethod("decodeByteArray", new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Options.class});
            decodeFileDescriptorMethod = cls.getDeclaredMethod("decodeFileDescriptor", new Class[]{FileDescriptor.class, Rect.class, Options.class});
            decodeStreamMethod = cls.getDeclaredMethod("decodeStream", new Class[]{InputStream.class, Rect.class, Options.class});
            decodeFileMethod = cls.getDeclaredMethod("decodeFile", new Class[]{String.class, Options.class});
        } catch (NoSuchMethodException unused) {
        }
    }

    public static WebpCompatManager getInstance(Context context) {
        mContext = context;
        useLibrarian = true;
        return instance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void init(com.p280ss.android.ugc.webpcompat.IWebpErrorCallback r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mWebpErrorCallback = r9     // Catch:{ all -> 0x0097 }
            boolean r9 = r8.mInited     // Catch:{ all -> 0x0097 }
            if (r9 != 0) goto L_0x0095
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0097 }
            r0 = 17
            if (r9 > r0) goto L_0x0095
            boolean r9 = r8.loadDexposedLibrary()     // Catch:{ all -> 0x0097 }
            if (r9 == 0) goto L_0x0095
            boolean r9 = r8.loadWebpSupportLibrary()     // Catch:{ all -> 0x0097 }
            if (r9 != 0) goto L_0x001a
            goto L_0x0095
        L_0x001a:
            r8.initMethods()     // Catch:{ all -> 0x0097 }
            com.facebook.webpsupport.WebpBitmapFactoryImpl r9 = new com.facebook.webpsupport.WebpBitmapFactoryImpl     // Catch:{ all -> 0x0097 }
            r9.<init>()     // Catch:{ all -> 0x0097 }
            com.ss.android.ugc.webpcompat.WebpCompatManager$1 r0 = new com.ss.android.ugc.webpcompat.WebpCompatManager$1     // Catch:{ all -> 0x0097 }
            r0.<init>()     // Catch:{ all -> 0x0097 }
            r9.setBitmapCreator(r0)     // Catch:{ all -> 0x0097 }
            com.ss.android.ugc.webpcompat.WebpCompatManager$2 r0 = new com.ss.android.ugc.webpcompat.WebpCompatManager$2     // Catch:{ all -> 0x0097 }
            r0.<init>()     // Catch:{ all -> 0x0097 }
            r9.setWebpErrorLogger(r0)     // Catch:{ all -> 0x0097 }
            com.ss.android.ugc.webpcompat.WebpCompatManager$3 r0 = new com.ss.android.ugc.webpcompat.WebpCompatManager$3     // Catch:{ all -> 0x0097 }
            r0.<init>(r9)     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = "decodeStream"
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0097 }
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0097 }
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r5 = 1
            r2[r5] = r3     // Catch:{ all -> 0x0097 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r3 = android.graphics.BitmapFactory.Options.class
            r6 = 2
            r2[r6] = r3     // Catch:{ all -> 0x0097 }
            r3 = 3
            r2[r3] = r0     // Catch:{ all -> 0x0097 }
            r8.replaceBitmapFactory(r9, r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = "decodeFile"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0097 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2[r4] = r7     // Catch:{ all -> 0x0097 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r7 = android.graphics.BitmapFactory.Options.class
            r2[r5] = r7     // Catch:{ all -> 0x0097 }
            r2[r6] = r0     // Catch:{ all -> 0x0097 }
            r8.replaceBitmapFactory(r9, r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = "decodeByteArray"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0097 }
            java.lang.Class<byte[]> r7 = byte[].class
            r2[r4] = r7     // Catch:{ all -> 0x0097 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0097 }
            r2[r5] = r7     // Catch:{ all -> 0x0097 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0097 }
            r2[r6] = r7     // Catch:{ all -> 0x0097 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r7 = android.graphics.BitmapFactory.Options.class
            r2[r3] = r7     // Catch:{ all -> 0x0097 }
            r2[r1] = r0     // Catch:{ all -> 0x0097 }
            r8.replaceBitmapFactory(r9, r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = "decodeFileDescriptor"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0097 }
            java.lang.Class<java.io.FileDescriptor> r2 = java.io.FileDescriptor.class
            r1[r4] = r2     // Catch:{ all -> 0x0097 }
            java.lang.Class<android.graphics.Rect> r2 = android.graphics.Rect.class
            r1[r5] = r2     // Catch:{ all -> 0x0097 }
            java.lang.Class<android.graphics.BitmapFactory$Options> r2 = android.graphics.BitmapFactory.Options.class
            r1[r6] = r2     // Catch:{ all -> 0x0097 }
            r1[r3] = r0     // Catch:{ all -> 0x0097 }
            r8.replaceBitmapFactory(r9, r1)     // Catch:{ all -> 0x0097 }
            r8.mInited = r5     // Catch:{ all -> 0x0097 }
            monitor-exit(r8)
            return
        L_0x0095:
            monitor-exit(r8)
            return
        L_0x0097:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.webpcompat.WebpCompatManager.init(com.ss.android.ugc.webpcompat.IWebpErrorCallback):void");
    }

    private void replaceBitmapFactory(String str, Object... objArr) {
        try {
            DexposedBridge.findAndHookMethod(BitmapFactory.class, str, objArr);
        } catch (Exception e) {
            if (this.mWebpErrorCallback != null) {
                this.mWebpErrorCallback.onWebpError(2, e.toString());
            }
        }
    }
}
