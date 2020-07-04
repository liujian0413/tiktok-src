package com.p280ss.android.agilelogger.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.ss.android.agilelogger.utils.e */
public final class C19200e {
    /* renamed from: a */
    public static String m62925a(Intent intent) {
        if (intent == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        sb.append("Intent { ");
        m62928a(intent, sb);
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m62926a(Uri uri) {
        if (VERSION.SDK_INT >= 14) {
            try {
                Method declaredMethod = Uri.class.getDeclaredMethod("toSafeString", new Class[0]);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(uri, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return uri.toString();
    }

    /* renamed from: a */
    public static String m62927a(Bundle bundle) {
        if (bundle == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        sb.append("Bundle[{");
        m62929a(bundle, sb);
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m62929a(Bundle bundle, StringBuilder sb) {
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            sb.append('=');
            Object obj = bundle.get(str);
            if (obj instanceof int[]) {
                sb.append(Arrays.toString((int[]) obj));
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr.length < 102400) {
                    sb.append(Arrays.toString(bArr));
                } else {
                    sb.append("byte[] in Bundle is too long, limit for 100K");
                }
            } else if (obj instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) obj));
            } else if (obj instanceof short[]) {
                sb.append(Arrays.toString((short[]) obj));
            } else if (obj instanceof long[]) {
                sb.append(Arrays.toString((long[]) obj));
            } else if (obj instanceof float[]) {
                sb.append(Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb.append(Arrays.toString((double[]) obj));
            } else if (obj instanceof String[]) {
                sb.append(Arrays.toString((String[]) obj));
            } else if (obj instanceof CharSequence[]) {
                sb.append(Arrays.toString((CharSequence[]) obj));
            } else if (obj instanceof Parcelable[]) {
                sb.append(Arrays.toString((Parcelable[]) obj));
            } else if (obj instanceof Bundle) {
                sb.append(m62927a((Bundle) obj));
            } else {
                sb.append(obj);
            }
            z = false;
        }
    }

    /* renamed from: a */
    private static void m62928a(Intent intent, StringBuilder sb) {
        boolean z;
        String action = intent.getAction();
        boolean z2 = true;
        if (action != null) {
            sb.append("act=");
            sb.append(action);
            z = false;
        } else {
            z = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (String str : categories) {
                if (!z2) {
                    sb.append(',');
                }
                sb.append(str);
                z2 = false;
            }
            sb.append("]");
            z = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            if (VERSION.SDK_INT >= 14) {
                sb.append(m62926a(data));
            } else {
                String scheme = data.getScheme();
                if (scheme == null) {
                    sb.append(data);
                } else if (scheme.equalsIgnoreCase("tel")) {
                    sb.append("tel:xxx-xxx-xxxx");
                } else if (scheme.equalsIgnoreCase("smsto")) {
                    sb.append("smsto:xxx-xxx-xxxx");
                } else {
                    sb.append(data);
                }
            }
            z = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=");
            sb.append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x");
            sb.append(Integer.toHexString(flags));
            z = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=");
            sb.append(str2);
            z = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cmp=");
            sb.append(component.flattenToShortString());
            z = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("bnds=");
            sb.append(sourceBounds.toShortString());
            z = false;
        }
        if (VERSION.SDK_INT >= 16 && intent.getClipData() != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("(has clip)");
            z = false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("extras={");
            m62929a(extras, sb);
            sb.append('}');
        }
        if (VERSION.SDK_INT >= 15) {
            Intent selector = intent.getSelector();
            if (selector != null) {
                sb.append(" sel=");
                m62928a(selector, sb);
                sb.append("}");
            }
        }
    }
}
