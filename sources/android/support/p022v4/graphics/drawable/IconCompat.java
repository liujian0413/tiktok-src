package android.support.p022v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.C1642a;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final Mode f2731h = Mode.SRC_IN;

    /* renamed from: a */
    public int f2732a;

    /* renamed from: b */
    Object f2733b;

    /* renamed from: c */
    public byte[] f2734c;

    /* renamed from: d */
    public Parcelable f2735d;

    /* renamed from: e */
    public int f2736e;

    /* renamed from: f */
    public int f2737f;

    /* renamed from: g */
    public ColorStateList f2738g;

    /* renamed from: i */
    Mode f2739i = f2731h;

    /* renamed from: j */
    public String f2740j;

    /* renamed from: a */
    private static String m3092a(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: d */
    private String m3095d() {
        if (this.f2732a == -1 && VERSION.SDK_INT >= 23) {
            return m3093a((Icon) this.f2733b);
        }
        if (this.f2732a == 2) {
            return ((String) this.f2733b).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    private int m3096e() {
        if (this.f2732a == -1 && VERSION.SDK_INT >= 23) {
            return m3094b((Icon) this.f2733b);
        }
        if (this.f2732a == 2) {
            return this.f2736e;
        }
        StringBuilder sb = new StringBuilder("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final Bundle mo2886b() {
        Bundle bundle = new Bundle();
        int i = this.f2732a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) this.f2733b);
                    break;
                case 2:
                case 4:
                    bundle.putString("obj", (String) this.f2733b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) this.f2733b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
        } else {
            bundle.putParcelable("obj", (Parcelable) this.f2733b);
        }
        bundle.putInt("type", this.f2732a);
        bundle.putInt("int1", this.f2736e);
        bundle.putInt("int2", this.f2737f);
        if (this.f2738g != null) {
            bundle.putParcelable("tint_list", this.f2738g);
        }
        if (this.f2739i != f2731h) {
            bundle.putString("tint_mode", this.f2739i.name());
        }
        return bundle;
    }

    /* renamed from: c */
    public final void mo2887c() {
        this.f2739i = Mode.valueOf(this.f2740j);
        int i = this.f2732a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    if (this.f2735d != null) {
                        this.f2733b = this.f2735d;
                        return;
                    }
                    this.f2733b = this.f2734c;
                    this.f2732a = 3;
                    this.f2736e = 0;
                    this.f2737f = this.f2734c.length;
                    return;
                case 2:
                case 4:
                    this.f2733b = new String(this.f2734c, Charset.forName("UTF-16"));
                    return;
                case 3:
                    this.f2733b = this.f2734c;
                    break;
            }
        } else if (this.f2735d != null) {
            this.f2733b = this.f2735d;
        } else {
            throw new IllegalArgumentException("Invalid icon");
        }
    }

    public String toString() {
        if (this.f2732a == -1) {
            return String.valueOf(this.f2733b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m3092a(this.f2732a));
        switch (this.f2732a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2733b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2733b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(m3095d());
                sb.append(" id=");
                sb.append(C1642a.m8034a("0x%08x", new Object[]{Integer.valueOf(m3096e())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2736e);
                if (this.f2737f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2737f);
                    break;
                }
                break;
            case 4:
                sb.append(" uri=");
                sb.append(this.f2733b);
                break;
        }
        if (this.f2738g != null) {
            sb.append(" tint=");
            sb.append(this.f2738g);
        }
        if (this.f2739i != f2731h) {
            sb.append(" mode=");
            sb.append(this.f2739i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final Icon mo2884a() {
        Icon icon;
        int i = this.f2732a;
        if (i == -1) {
            return (Icon) this.f2733b;
        }
        switch (i) {
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f2733b);
                break;
            case 2:
                icon = Icon.createWithResource(m3095d(), this.f2736e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f2733b, this.f2736e, this.f2737f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f2733b);
                break;
            case 5:
                if (VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(m3091a((Bitmap) this.f2733b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f2733b);
                    break;
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        if (this.f2738g != null) {
            icon.setTintList(this.f2738g);
        }
        if (this.f2739i != f2731h) {
            icon.setTintMode(this.f2739i);
        }
        return icon;
    }

    /* renamed from: b */
    private static int m3094b(Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            return 0;
        } catch (InvocationTargetException unused2) {
            return 0;
        } catch (NoSuchMethodException unused3) {
            return 0;
        }
    }

    /* renamed from: a */
    private static String m3093a(Icon icon) {
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException unused2) {
            return null;
        } catch (NoSuchMethodException unused3) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo2885a(boolean z) {
        this.f2740j = this.f2739i.name();
        int i = this.f2732a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    if (z) {
                        Bitmap bitmap = (Bitmap) this.f2733b;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                        this.f2734c = byteArrayOutputStream.toByteArray();
                        return;
                    }
                    this.f2735d = (Parcelable) this.f2733b;
                    return;
                case 2:
                    this.f2734c = ((String) this.f2733b).getBytes(Charset.forName("UTF-16"));
                    return;
                case 3:
                    this.f2734c = (byte[]) this.f2733b;
                    break;
                case 4:
                    this.f2734c = this.f2733b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
            }
        } else if (!z) {
            this.f2735d = (Parcelable) this.f2733b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: a */
    private static Bitmap m3091a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = ((float) min) * 0.5f;
        float f2 = 0.9166667f * f;
        paint.setColor(-16777216);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f, f, f2, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
