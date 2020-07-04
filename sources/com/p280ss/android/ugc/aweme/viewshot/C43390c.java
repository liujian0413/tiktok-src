package com.p280ss.android.ugc.aweme.viewshot;

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

/* renamed from: com.ss.android.ugc.aweme.viewshot.c */
public class C43390c implements UIBlock {

    /* renamed from: a */
    private static final String f112377a = "c";

    /* renamed from: b */
    private static byte[] f112378b = new byte[65536];

    /* renamed from: o */
    private static final Object f112379o = new Object();

    /* renamed from: p */
    private static final Set<Bitmap> f112380p = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private final int f112381c;

    /* renamed from: d */
    private final String f112382d;

    /* renamed from: e */
    private final int f112383e;

    /* renamed from: f */
    private final double f112384f;

    /* renamed from: g */
    private final Integer f112385g;

    /* renamed from: h */
    private final Integer f112386h;

    /* renamed from: i */
    private final File f112387i;

    /* renamed from: j */
    private final String f112388j;

    /* renamed from: k */
    private final Promise f112389k;

    /* renamed from: l */
    private final Boolean f112390l;

    /* renamed from: m */
    private final ReactApplicationContext f112391m;

    /* renamed from: n */
    private final Activity f112392n;

    /* renamed from: com.ss.android.ugc.aweme.viewshot.c$a */
    public @interface C7281a {

        /* renamed from: a */
        public static final CompressFormat[] f20360a = {CompressFormat.JPEG, CompressFormat.PNG, CompressFormat.WEBP};
    }

    /* renamed from: com.ss.android.ugc.aweme.viewshot.c$b */
    public static class C43391b extends ByteArrayOutputStream {
        /* renamed from: a */
        public final byte[] mo105299a() {
            return this.buf;
        }

        /* renamed from: b */
        public final void mo105300b(int i) {
            this.count = i;
        }

        public C43391b(byte[] bArr) {
            super(0);
            this.buf = bArr;
        }

        /* renamed from: a */
        public final ByteBuffer mo105298a(int i) {
            if (this.buf.length < i) {
                m137704c(i);
            }
            return ByteBuffer.wrap(this.buf);
        }

        /* renamed from: c */
        private void m137704c(int i) {
            int length = this.buf.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                length = m137705d(i);
            }
            this.buf = Arrays.copyOf(this.buf, length);
        }

        /* renamed from: d */
        private static int m137705d(int i) {
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
    private static <T extends A, A> T m137694a(A r0) {
        /*
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.viewshot.C43390c.m137694a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    private static void m137695a(Bitmap bitmap) {
        synchronized (f112379o) {
            f112380p.add(bitmap);
        }
    }

    /* renamed from: f */
    private static int m137703f(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    /* renamed from: e */
    private List<View> m137702e(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.addAll(m137702e(viewGroup.getChildAt(i)));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private void m137696a(View view) throws IOException {
        m137693a(view, (OutputStream) new FileOutputStream(this.f112387i));
        this.f112389k.resolve(Uri.fromFile(this.f112387i).toString());
    }

    /* renamed from: b */
    private void m137699b(View view) throws IOException {
        String uri = Uri.fromFile(this.f112387i).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f112387i);
        C43391b bVar = new C43391b(f112378b);
        Point a = m137693a(view, (OutputStream) bVar);
        f112378b = bVar.mo105299a();
        int size = bVar.size();
        fileOutputStream.write(C1642a.m8035a(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(a.x), Integer.valueOf(a.y)}).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(f112378b, 0, size);
        fileOutputStream.close();
        this.f112389k.resolve(uri);
    }

    /* renamed from: c */
    private void m137700c(View view) throws IOException {
        String str;
        C43391b bVar = new C43391b(f112378b);
        m137693a(view, (OutputStream) bVar);
        f112378b = bVar.mo105299a();
        String encodeToString = Base64.encodeToString(f112378b, 0, bVar.size(), 2);
        if ("jpg".equals(this.f112382d)) {
            str = "jpeg";
        } else {
            str = this.f112382d;
        }
        Promise promise = this.f112389k;
        StringBuilder sb = new StringBuilder("data:image/");
        sb.append(str);
        sb.append(";base64,");
        sb.append(encodeToString);
        promise.resolve(sb.toString());
    }

    /* renamed from: d */
    private void m137701d(View view) throws IOException {
        boolean z;
        String str;
        if (-1 == this.f112383e) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = "zip-base64".equals(this.f112388j);
        C43391b bVar = new C43391b(f112378b);
        Point a = m137693a(view, (OutputStream) bVar);
        f112378b = bVar.mo105299a();
        int size = bVar.size();
        String a2 = C1642a.m8035a(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(a.x), Integer.valueOf(a.y)});
        if (!z) {
            a2 = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f112378b, 0, size);
            deflater.finish();
            C43391b bVar2 = new C43391b(new byte[32]);
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (!deflater.finished()) {
                bVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(Base64.encodeToString(bVar2.mo105299a(), 0, bVar2.size(), 2));
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a2);
            sb2.append(Base64.encodeToString(f112378b, 0, size, 2));
            str = sb2.toString();
        }
        this.f112389k.resolve(str);
    }

    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        View view;
        if (this.f112381c == -1) {
            view = this.f112392n.getWindow().getDecorView().findViewById(16908290);
        } else {
            view = nativeViewHierarchyManager.resolveView(this.f112381c);
        }
        if (view == null) {
            StringBuilder sb = new StringBuilder("No view found with reactTag: ");
            sb.append(this.f112381c);
            this.f112389k.reject("E_UNABLE_TO_SNAPSHOT", sb.toString());
            return;
        }
        try {
            C43391b bVar = new C43391b(f112378b);
            bVar.mo105300b(m137703f(view));
            f112378b = bVar.mo105299a();
            if ("tmpfile".equals(this.f112388j) && -1 == this.f112383e) {
                m137699b(view);
            } else if (!"tmpfile".equals(this.f112388j) || -1 == this.f112383e) {
                if (!"base64".equals(this.f112388j)) {
                    if (!"zip-base64".equals(this.f112388j)) {
                        if ("data-uri".equals(this.f112388j)) {
                            m137700c(view);
                        }
                        return;
                    }
                }
                m137701d(view);
            } else {
                m137696a(view);
            }
        } catch (Throwable unused) {
            this.f112389k.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
        }
    }

    /* renamed from: a */
    private Point m137693a(View view, OutputStream outputStream) throws IOException {
        try {
            C43388a.m137686a(f112377a, C43388a.m137687a(this.f112392n));
            return m137698b(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    /* renamed from: a */
    private static Bitmap m137691a(int i, int i2) {
        synchronized (f112379o) {
            for (Bitmap bitmap : f112380p) {
                if (bitmap.getWidth() >= i && bitmap.getHeight() >= i2) {
                    f112380p.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
    }

    /* renamed from: b */
    private static Bitmap m137697b(int i, int i2) {
        synchronized (f112379o) {
            for (Bitmap bitmap : f112380p) {
                if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                    f112380p.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
    }

    /* renamed from: b */
    private Point m137698b(View view, OutputStream outputStream) {
        Bitmap bitmap;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        if (this.f112390l.booleanValue()) {
            ScrollView scrollView = (ScrollView) view;
            int i = 0;
            for (int i2 = 0; i2 < scrollView.getChildCount(); i2++) {
                i += scrollView.getChildAt(i2).getHeight();
            }
            height = i;
        }
        Point point = new Point(width, height);
        Bitmap a = m137691a(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(a);
        view.draw(canvas);
        for (View view2 : m137702e(view)) {
            if ((view2 instanceof TextureView) && view2.getVisibility() == 0) {
                TextureView textureView = (TextureView) view2;
                textureView.setOpaque(false);
                Bitmap bitmap2 = textureView.getBitmap(m137697b(view2.getWidth(), view2.getHeight()));
                int save = canvas.save();
                m137692a(canvas, view, view2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                canvas.restoreToCount(save);
                m137695a(bitmap2);
            }
        }
        if (this.f112385g == null || this.f112386h == null || (this.f112385g.intValue() == width && this.f112386h.intValue() == height)) {
            bitmap = a;
        } else {
            bitmap = Bitmap.createScaledBitmap(a, this.f112385g.intValue(), this.f112386h.intValue(), true);
            m137695a(a);
        }
        if (-1 != this.f112383e || !(outputStream instanceof C43391b)) {
            bitmap.compress(C7281a.f20360a[this.f112383e], (int) (this.f112384f * 100.0d), outputStream);
        } else {
            int i3 = width * height * 4;
            C43391b bVar = (C43391b) m137694a((A) outputStream);
            bitmap.copyPixelsToBuffer(bVar.mo105298a(i3));
            bVar.mo105300b(i3);
        }
        m137695a(bitmap);
        return point;
    }

    /* renamed from: a */
    private static Matrix m137692a(Canvas canvas, View view, View view2) {
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

    public C43390c(int i, String str, int i2, double d, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.f112381c = i;
        this.f112382d = str;
        this.f112383e = i2;
        this.f112384f = d;
        this.f112385g = num;
        this.f112386h = num2;
        this.f112387i = file;
        this.f112388j = str2;
        this.f112390l = bool;
        this.f112391m = reactApplicationContext;
        this.f112392n = activity;
        this.f112389k = promise;
    }
}
