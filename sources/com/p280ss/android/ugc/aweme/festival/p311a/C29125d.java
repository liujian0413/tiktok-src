package com.p280ss.android.ugc.aweme.festival.p311a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.LruCache;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.festival.a.d */
public final class C29125d {

    /* renamed from: a */
    private static LruCache<String, Drawable> f76874a = new LruCache<>(20);

    /* renamed from: b */
    private static LruCache<String, Bitmap> f76875b = new LruCache<>(20);

    /* renamed from: com.ss.android.ugc.aweme.festival.a.d$a */
    public @interface C6920a {

        /* renamed from: a */
        public static final String f19604a;

        /* renamed from: b */
        public static final String f19605b;

        /* renamed from: c */
        public static final String f19606c;

        /* renamed from: d */
        public static final String f19607d;

        /* renamed from: e */
        public static final String f19608e;

        /* renamed from: f */
        public static final String[] f19609f = {"shot_icon_animation_01.png", "shot_icon_animation_02.png", "shot_icon_animation_03.png", "shot_icon_animation_04.png", "shot_icon_animation_05.png"};

        static {
            StringBuilder sb = new StringBuilder("like_animation");
            sb.append(File.separator);
            sb.append("images");
            f19604a = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f19604a);
            sb2.append(File.separator);
            sb2.append("like_liked_3x.png");
            f19605b = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f19604a);
            sb3.append(File.separator);
            sb3.append("like_normal_3x.png");
            f19606c = sb3.toString();
            StringBuilder sb4 = new StringBuilder("like_animation");
            sb4.append(File.separator);
            sb4.append("like.json");
            f19607d = sb4.toString();
            StringBuilder sb5 = new StringBuilder("like_animation");
            sb5.append(File.separator);
            sb5.append("like_cancel.json");
            f19608e = sb5.toString();
        }
    }

    /* renamed from: m */
    private static File m95534m() {
        return m95524c("top_left_close_icon.png");
    }

    /* renamed from: n */
    private static File m95535n() {
        return m95524c("liked_icon.png");
    }

    /* renamed from: o */
    private static File m95536o() {
        return m95524c("like_icon.png");
    }

    /* renamed from: p */
    private static File m95537p() {
        return m95524c("double_like_icon.png");
    }

    /* renamed from: r */
    private static File m95539r() {
        return m95524c("comment_icon.png");
    }

    /* renamed from: s */
    private static File m95540s() {
        return m95524c("share_icon.png");
    }

    /* renamed from: t */
    private static File m95541t() {
        return m95524c("share_flip_icon.png");
    }

    /* renamed from: u */
    private static File m95542u() {
        return m95524c("share_flip_my_icon.png");
    }

    /* renamed from: v */
    private static File m95543v() {
        return m95524c("avatar_hat.png");
    }

    /* renamed from: a */
    public static File m95518a() {
        return m95524c("top_left_icon_animation.webp");
    }

    /* renamed from: b */
    public static Drawable m95522b() {
        Drawable a = m95517a("top_left_close_icon.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m95515a(m95534m());
        if (a2 != null) {
            m95520a("top_left_close_icon.png", a2);
        }
        return a2;
    }

    /* renamed from: e */
    public static Drawable m95526e() {
        Drawable a = m95517a("double_like_icon.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m95515a(m95537p());
        if (a2 != null) {
            m95520a("double_like_icon.png", a2);
        }
        return a2;
    }

    /* renamed from: f */
    public static Drawable m95527f() {
        Drawable a = m95517a("comment_icon.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m95515a(m95539r());
        if (a2 != null) {
            m95520a("comment_icon.png", a2);
        }
        return a2;
    }

    /* renamed from: g */
    public static Drawable m95528g() {
        Drawable a = m95517a("share_icon.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m95515a(m95540s());
        if (a2 != null) {
            m95520a("share_icon.png", a2);
        }
        return a2;
    }

    /* renamed from: h */
    public static Drawable m95529h() {
        Drawable a = m95517a("share_flip_icon.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m95515a(m95541t());
        if (a2 != null) {
            m95520a("share_flip_icon.png", a2);
        }
        return a2;
    }

    /* renamed from: i */
    public static Drawable m95530i() {
        Drawable a = m95517a("share_flip_my_icon.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m95515a(m95542u());
        if (a2 != null) {
            m95520a("share_flip_my_icon.png", a2);
        }
        return a2;
    }

    /* renamed from: j */
    public static Drawable m95531j() {
        Drawable a = m95517a("avatar_hat.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m95515a(m95543v());
        if (a2 != null) {
            m95520a("avatar_hat.png", a2);
        }
        return a2;
    }

    /* renamed from: c */
    public static Drawable m95523c() {
        Drawable q = m95538q();
        Drawable d = m95525d();
        if (q == null || d == null) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842913}, q);
        stateListDrawable.addState(new int[]{16842913}, d);
        return stateListDrawable;
    }

    /* renamed from: k */
    public static Drawable m95532k() {
        Drawable a = m95515a(m95524c("shot_icon.png"));
        if (a != null) {
            ((BitmapDrawable) a).setTargetDensity((C9738o.m28716d(C6399b.m19921a()) * C9738o.m28716d(C6399b.m19921a())) / 480);
        }
        return a;
    }

    /* renamed from: l */
    public static C29127f m95533l() {
        C29127f fVar = new C29127f();
        for (String c : C6920a.f19609f) {
            Drawable a = m95515a(m95524c(c));
            if (a == null) {
                return null;
            }
            ((BitmapDrawable) a).setTargetDensity((C9738o.m28716d(C6399b.m19921a()) * C9738o.m28716d(C6399b.m19921a())) / 480);
            fVar.addFrame(a, 100);
        }
        return fVar;
    }

    /* renamed from: d */
    public static Drawable m95525d() {
        Bitmap b = m95521b("liked_icon.png");
        if (b != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C6399b.m19921a().getResources(), b);
            bitmapDrawable.setTargetDensity((C9738o.m28716d(C6399b.m19921a()) * C9738o.m28716d(C6399b.m19921a())) / 480);
            return bitmapDrawable;
        }
        Drawable a = m95515a(m95535n());
        if (a instanceof BitmapDrawable) {
            m95519a("liked_icon.png", ((BitmapDrawable) a).getBitmap());
        }
        return a;
    }

    /* renamed from: q */
    private static Drawable m95538q() {
        Bitmap b = m95521b("like_icon.png");
        if (b != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C6399b.m19921a().getResources(), b);
            bitmapDrawable.setTargetDensity((C9738o.m28716d(C6399b.m19921a()) * C9738o.m28716d(C6399b.m19921a())) / 480);
            return bitmapDrawable;
        }
        Drawable a = m95515a(m95536o());
        if (a instanceof BitmapDrawable) {
            m95519a("like_icon.png", ((BitmapDrawable) a).getBitmap());
        }
        return a;
    }

    /* renamed from: a */
    private static Drawable m95515a(File file) {
        return m95516a(file, 0);
    }

    /* renamed from: a */
    private static Drawable m95517a(String str) {
        return (Drawable) f76874a.get(str);
    }

    /* renamed from: b */
    private static Bitmap m95521b(String str) {
        return (Bitmap) f76875b.get(str);
    }

    /* renamed from: c */
    private static File m95524c(String str) {
        File c = C29122b.m95497a().mo74581c();
        if (c == null || !c.exists() || !c.isDirectory()) {
            return null;
        }
        File file = new File(c, str);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        return file;
    }

    /* renamed from: a */
    private static Drawable m95516a(File file, int i) {
        if (file == null || !file.exists()) {
            return null;
        }
        Drawable createFromPath = Drawable.createFromPath(file.getPath());
        if (createFromPath instanceof BitmapDrawable) {
            ((BitmapDrawable) createFromPath).setTargetDensity((C9738o.m28716d(C6399b.m19921a()) * C9738o.m28716d(C6399b.m19921a())) / 480);
        }
        return createFromPath;
    }

    /* renamed from: a */
    private static void m95519a(String str, Bitmap bitmap) {
        if (bitmap != null) {
            f76875b.put(str, bitmap);
        }
    }

    /* renamed from: a */
    private static void m95520a(String str, Drawable drawable) {
        if (drawable != null) {
            f76874a.put(str, drawable);
        }
    }
}
