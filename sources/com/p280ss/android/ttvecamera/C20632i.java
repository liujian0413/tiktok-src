package com.p280ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.i */
public final class C20632i {

    /* renamed from: D */
    public static final int[] f55717D = {2, 0, 1, 3};

    /* renamed from: E */
    public static final int[] f55718E = {1, 2, 0, 3};

    /* renamed from: a */
    public static final String[] f55719a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* renamed from: A */
    public boolean f55720A = true;

    /* renamed from: B */
    public int f55721B = 0;

    /* renamed from: C */
    public String f55722C = "auto";

    /* renamed from: b */
    public Context f55723b;

    /* renamed from: c */
    public int f55724c = 1;

    /* renamed from: d */
    public C20651l f55725d = new C20651l(7, 30);

    /* renamed from: e */
    public int f55726e = 0;

    /* renamed from: f */
    public int f55727f = 0;

    /* renamed from: g */
    public int f55728g = -1;

    /* renamed from: h */
    public int f55729h = 17;

    /* renamed from: i */
    public boolean f55730i = false;

    /* renamed from: j */
    public TEFrameSizei f55731j = new TEFrameSizei(1280, 720);

    /* renamed from: k */
    public TEFrameSizei f55732k = new TEFrameSizei(1920, 1080);

    /* renamed from: l */
    public int f55733l = 1;

    /* renamed from: m */
    public int f55734m = 0;

    /* renamed from: n */
    public int f55735n = 0;

    /* renamed from: o */
    public boolean f55736o = false;

    /* renamed from: p */
    public int f55737p = 0;

    /* renamed from: q */
    public int f55738q = 1;

    /* renamed from: r */
    public int f55739r = 1;

    /* renamed from: s */
    public Bundle f55740s = new Bundle();

    /* renamed from: t */
    public byte f55741t = 1;

    /* renamed from: u */
    public String f55742u = "auto";

    /* renamed from: v */
    public String f55743v = "0";

    /* renamed from: w */
    public String f55744w = "-1";

    /* renamed from: x */
    public C20633a f55745x = new C20633a();

    /* renamed from: y */
    public boolean f55746y = true;

    /* renamed from: z */
    public int f55747z = 0;

    /* renamed from: com.ss.android.ttvecamera.i$a */
    public static class C20633a {

        /* renamed from: a */
        public int f55748a;

        /* renamed from: b */
        public int f55749b;

        /* renamed from: c */
        public int f55750c;

        /* renamed from: d */
        public float f55751d;

        /* renamed from: a */
        public final boolean mo55812a() {
            if (this.f55748a <= this.f55750c || this.f55751d <= 0.001f) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$b */
    public interface C20634b {
        /* renamed from: a */
        void mo55813a(float[] fArr);
    }

    /* renamed from: com.ss.android.ttvecamera.i$c */
    public static final class C20635c {

        /* renamed from: a */
        private static final Map<String, Class> f55752a;

        static {
            HashMap hashMap = new HashMap();
            f55752a = hashMap;
            hashMap.put("facing", Integer.class);
            f55752a.put("support_light_soft", Boolean.class);
            f55752a.put("device_support_wide_angle", Boolean.class);
            f55752a.put("device_support_camera", Boolean.class);
            f55752a.put("support_wide_angle", Boolean.class);
            f55752a.put("support_body_beauty", Boolean.class);
            f55752a.put("support_anti_shake", Boolean.class);
            f55752a.put("support_fps_480", Boolean.class);
            f55752a.put("support_fps_120", Boolean.class);
            f55752a.put("support_fps_60", Boolean.class);
            f55752a.put("support_preview_sizes", ArrayList.class);
            f55752a.put("support_picture_sizes", ArrayList.class);
            f55752a.put("camera_preview_size", TEFrameSizei.class);
            f55752a.put("camera_focus_parameters", TEFocusParameters.class);
            f55752a.put("camera_torch_supported", Boolean.class);
        }

        /* renamed from: a */
        public static Class m68398a(String str) {
            if (f55752a.containsKey(str)) {
                return (Class) f55752a.get(str);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$d */
    public static class C20636d {

        /* renamed from: a */
        public int f55753a;
    }

    /* renamed from: com.ss.android.ttvecamera.i$e */
    public static final class C20637e {

        /* renamed from: a */
        private static final Map<String, Class> f55754a;

        static {
            HashMap hashMap = new HashMap();
            f55754a = hashMap;
            hashMap.put("enable_body_beauty", Boolean.class);
            f55754a.put("enable_light_soft", Boolean.class);
            f55754a.put("enable_anti_shake", Boolean.class);
            f55754a.put("video_path", String.class);
            f55754a.put("body_beauty_level", Integer.class);
        }

        /* renamed from: a */
        public static boolean m68399a(String str, Object obj) {
            if (!f55754a.containsKey(str) || (obj != null && obj.getClass() != f55754a.get(str))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.i$f */
    public interface C20638f {
        /* renamed from: a */
        void mo55814a(TECameraFrame tECameraFrame, C20604f fVar);

        /* renamed from: a */
        void mo55815a(Exception exc);
    }

    /* renamed from: com.ss.android.ttvecamera.i$g */
    public interface C20639g {
        /* renamed from: a */
        void mo55816a(int i, float f);
    }

    /* renamed from: com.ss.android.ttvecamera.i$h */
    public interface C20640h {
    }

    /* renamed from: com.ss.android.ttvecamera.i$i */
    public interface C20641i {
        /* renamed from: a */
        void mo55817a(int i, float f, boolean z);

        /* renamed from: a */
        void mo55818a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo55819a();
    }

    /* renamed from: a */
    public final void mo55811a() {
        this.f55723b = null;
        this.f55740s.clear();
    }

    public C20632i(Context context) {
        this.f55723b = context;
    }

    public C20632i(Context context, int i) {
        this.f55723b = context;
        this.f55724c = i;
    }

    public C20632i(Context context, int i, int i2, int i3) {
        this.f55723b = context;
        this.f55724c = i;
        this.f55731j.f55535a = i2;
        this.f55731j.f55536b = i3;
    }
}
