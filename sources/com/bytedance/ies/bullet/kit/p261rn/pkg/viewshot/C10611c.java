package com.bytedance.ies.bullet.kit.p261rn.pkg.viewshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.C1642a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.viewshot.c */
public class C10611c implements UIBlock {

    /* renamed from: a */
    private static final String f28437a = "c";

    /* renamed from: b */
    private static byte[] f28438b = new byte[65536];

    /* renamed from: o */
    private static final Object f28439o = new Object();

    /* renamed from: p */
    private static final Set<Bitmap> f28440p = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private final int f28441c;

    /* renamed from: d */
    private final String f28442d;

    /* renamed from: e */
    private final int f28443e;

    /* renamed from: f */
    private final double f28444f;

    /* renamed from: g */
    private final Integer f28445g;

    /* renamed from: h */
    private final Integer f28446h;

    /* renamed from: i */
    private final File f28447i;

    /* renamed from: j */
    private final String f28448j;

    /* renamed from: k */
    private final Promise f28449k;

    /* renamed from: l */
    private final Boolean f28450l;

    /* renamed from: m */
    private final ReactApplicationContext f28451m;

    /* renamed from: n */
    private final Activity f28452n;

    /* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.viewshot.c$a */
    public @interface C6393a {

        /* renamed from: a */
        public static final CompressFormat[] f18685a = {CompressFormat.JPEG, CompressFormat.PNG, CompressFormat.WEBP};
    }

    /* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.viewshot.c$b */
    public static class C10612b extends ByteArrayOutputStream {
        /* renamed from: a */
        public final byte[] mo25455a() {
            return this.buf;
        }

        /* renamed from: b */
        public final void mo25456b(int i) {
            this.count = i;
        }

        public C10612b(byte[] bArr) {
            super(0);
            this.buf = bArr;
        }

        /* renamed from: a */
        public final ByteBuffer mo25454a(int i) {
            if (this.buf.length < i) {
                m31044c(i);
            }
            return ByteBuffer.wrap(this.buf);
        }

        /* renamed from: c */
        private void m31044c(int i) {
            int length = this.buf.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                length = m31045d(i);
            }
            this.buf = Arrays.copyOf(this.buf, length);
        }

        /* renamed from: d */
        private static int m31045d(int i) {
            if (i < 0) {
                throw new OutOfMemoryError();
            } else if (i > 2147483639) {
                return Integer.MAX_VALUE;
            } else {
                return 2147483639;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [A, T] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=A, code=null, for r0v0, types: [A, T] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T extends A, A> T m31034a(A r0) {
        /*
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.pkg.viewshot.C10611c.m31034a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    private static void m31035a(Bitmap bitmap) {
        synchronized (f28439o) {
            f28440p.add(bitmap);
        }
    }

    /* renamed from: f */
    private static int m31043f(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    /* renamed from: e */
    private List<View> m31042e(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.addAll(m31042e(viewGroup.getChildAt(i)));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private void m31036a(View view) throws IOException {
        m31033a(view, (OutputStream) new FileOutputStream(this.f28447i));
        this.f28449k.resolve(Uri.fromFile(this.f28447i).toString());
    }

    /* renamed from: b */
    private void m31039b(View view) throws IOException {
        String uri = Uri.fromFile(this.f28447i).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f28447i);
        C10612b bVar = new C10612b(f28438b);
        Point a = m31033a(view, (OutputStream) bVar);
        f28438b = bVar.mo25455a();
        int size = bVar.size();
        fileOutputStream.write(C1642a.m8035a(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(a.x), Integer.valueOf(a.y)}).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(f28438b, 0, size);
        fileOutputStream.close();
        this.f28449k.resolve(uri);
    }

    /* renamed from: c */
    private void m31040c(View view) throws IOException {
        String str;
        C10612b bVar = new C10612b(f28438b);
        m31033a(view, (OutputStream) bVar);
        f28438b = bVar.mo25455a();
        String encodeToString = Base64.encodeToString(f28438b, 0, bVar.size(), 2);
        if ("jpg".equals(this.f28442d)) {
            str = "jpeg";
        } else {
            str = this.f28442d;
        }
        Promise promise = this.f28449k;
        StringBuilder sb = new StringBuilder("data:image/");
        sb.append(str);
        sb.append(";base64,");
        sb.append(encodeToString);
        promise.resolve(sb.toString());
    }

    /* renamed from: d */
    private void m31041d(View view) throws IOException {
        boolean z;
        String str;
        if (-1 == this.f28443e) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = "zip-base64".equals(this.f28448j);
        C10612b bVar = new C10612b(f28438b);
        Point a = m31033a(view, (OutputStream) bVar);
        f28438b = bVar.mo25455a();
        int size = bVar.size();
        String a2 = C1642a.m8035a(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(a.x), Integer.valueOf(a.y)});
        if (!z) {
            a2 = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f28438b, 0, size);
            deflater.finish();
            C10612b bVar2 = new C10612b(new byte[32]);
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (!deflater.finished()) {
                bVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(Base64.encodeToString(bVar2.mo25455a(), 0, bVar2.size(), 2));
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a2);
            sb2.append(Base64.encodeToString(f28438b, 0, size, 2));
            str = sb2.toString();
        }
        this.f28449k.resolve(str);
    }

    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        View view;
        if (this.f28441c == -1) {
            view = this.f28452n.getWindow().getDecorView().findViewById(16908290);
        } else {
            view = nativeViewHierarchyManager.resolveView(this.f28441c);
        }
        if (view == null) {
            StringBuilder sb = new StringBuilder("No view found with reactTag: ");
            sb.append(this.f28441c);
            this.f28449k.reject("E_UNABLE_TO_SNAPSHOT", sb.toString());
            return;
        }
        try {
            C10612b bVar = new C10612b(f28438b);
            bVar.mo25456b(m31043f(view));
            f28438b = bVar.mo25455a();
            if ("tmpfile".equals(this.f28448j) && -1 == this.f28443e) {
                m31039b(view);
            } else if (!"tmpfile".equals(this.f28448j) || -1 == this.f28443e) {
                if (!"base64".equals(this.f28448j)) {
                    if (!"zip-base64".equals(this.f28448j)) {
                        if ("data-uri".equals(this.f28448j)) {
                            m31040c(view);
                        }
                        return;
                    }
                }
                m31041d(view);
            } else {
                m31036a(view);
            }
        } catch (Throwable unused) {
            this.f28449k.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
        }
    }

    /* renamed from: a */
    private Point m31033a(View view, OutputStream outputStream) throws IOException {
        try {
            C10609a.m31026a(f28437a, C10609a.m31027a(this.f28452n));
            return m31038b(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    /* renamed from: a */
    private static Bitmap m31031a(int i, int i2) {
        synchronized (f28439o) {
            for (Bitmap bitmap : f28440p) {
                if (bitmap.getWidth() >= i && bitmap.getHeight() >= i2) {
                    f28440p.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
    }

    /* renamed from: b */
    private static Bitmap m31037b(int i, int i2) {
        synchronized (f28439o) {
            for (Bitmap bitmap : f28440p) {
                if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                    f28440p.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
    }

    /* renamed from: b */
    private Point m31038b(View view, OutputStream outputStream) {
        Bitmap bitmap;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        if (this.f28450l.booleanValue()) {
            ScrollView scrollView = (ScrollView) view;
            int i = 0;
            for (int i2 = 0; i2 < scrollView.getChildCount(); i2++) {
                i += scrollView.getChildAt(i2).getHeight();
            }
            height = i;
        }
        Point point = new Point(width, height);
        Bitmap a = m31031a(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(a);
        view.draw(canvas);
        for (View view2 : m31042e(view)) {
            if ((view2 instanceof TextureView) && view2.getVisibility() == 0) {
                TextureView textureView = (TextureView) view2;
                textureView.setOpaque(false);
                Bitmap bitmap2 = textureView.getBitmap(m31037b(view2.getWidth(), view2.getHeight()));
                int save = canvas.save();
                m31032a(canvas, view, view2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                canvas.restoreToCount(save);
                m31035a(bitmap2);
            }
        }
        if (this.f28445g == null || this.f28446h == null || (this.f28445g.intValue() == width && this.f28446h.intValue() == height)) {
            bitmap = a;
        } else {
            bitmap = Bitmap.createScaledBitmap(a, this.f28445g.intValue(), this.f28446h.intValue(), true);
            m31035a(a);
        }
        if (-1 != this.f28443e || !(outputStream instanceof C10612b)) {
            bitmap.compress(C6393a.f18685a[this.f28443e], (int) (this.f28444f * 100.0d), outputStream);
        } else {
            int i3 = width * height * 4;
            C10612b bVar = (C10612b) m31034a((A) outputStream);
            bitmap.copyPixelsToBuffer(bVar.mo25454a(i3));
            bVar.mo25456b(i3);
        }
        m31035a(bitmap);
        return point;
    }

    /* renamed from: a */
    private static Matrix m31032a(Canvas canvas, View view, View view2) {
        int i;
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            canvas.save();
            int left = view4.getLeft();
            int i2 = 0;
            if (view4 != view2) {
                i = view4.getPaddingLeft();
            } else {
                i = 0;
            }
            float translationX = ((float) (left + i)) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i2 = view4.getPaddingTop();
            }
            float translationY = ((float) (top + i2)) + view4.getTranslationY();
            canvas.translate(translationX, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(translationX, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    public C10611c(int i, String str, int i2, double d, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.f28441c = i;
        this.f28442d = str;
        this.f28443e = i2;
        this.f28444f = d;
        this.f28445g = num;
        this.f28446h = num2;
        this.f28447i = file;
        this.f28448j = str2;
        this.f28450l = bool;
        this.f28451m = reactApplicationContext;
        this.f28452n = activity;
        this.f28449k = promise;
    }
}
