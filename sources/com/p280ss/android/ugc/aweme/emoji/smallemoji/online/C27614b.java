package com.p280ss.android.ugc.aweme.emoji.smallemoji.online;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.b */
public final class C27614b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f72776a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27614b.class), "lruCache", "getLruCache()Landroid/util/LruCache;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27614b.class), "weakRefCache", "getWeakRefCache()Ljava/util/HashMap;"))};

    /* renamed from: b */
    public static final C27615a f72777b = new C27615a(null);

    /* renamed from: c */
    private final C7541d f72778c;

    /* renamed from: d */
    private final C7541d f72779d;

    /* renamed from: e */
    private final OnlineSmallEmojiResInfo f72780e;

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.b$a */
    public static final class C27615a {
        private C27615a() {
        }

        public /* synthetic */ C27615a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27614b m90541a(OnlineSmallEmojiResInfo onlineSmallEmojiResInfo) {
            C7573i.m23587b(onlineSmallEmojiResInfo, "resInfo");
            return new C27614b(onlineSmallEmojiResInfo, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.b$b */
    static final class C27616b extends Lambda implements C7561a<LruCache<String, Bitmap>> {

        /* renamed from: a */
        public static final C27616b f72781a = new C27616b();

        C27616b() {
            super(0);
        }

        /* renamed from: a */
        private static LruCache<String, Bitmap> m90542a() {
            return new LruCache<>(20);
        }

        public final /* synthetic */ Object invoke() {
            return m90542a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.b$c */
    static final class C27617c extends Lambda implements C7561a<HashMap<String, WeakReference<Bitmap>>> {

        /* renamed from: a */
        public static final C27617c f72782a = new C27617c();

        C27617c() {
            super(0);
        }

        /* renamed from: a */
        private static HashMap<String, WeakReference<Bitmap>> m90543a() {
            return new HashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m90543a();
        }
    }

    /* renamed from: a */
    private final HashMap<String, WeakReference<Bitmap>> m90537a() {
        return (HashMap) this.f72779d.getValue();
    }

    private C27614b(OnlineSmallEmojiResInfo onlineSmallEmojiResInfo) {
        this.f72780e = onlineSmallEmojiResInfo;
        this.f72778c = C7546e.m23569a(C27616b.f72781a);
        this.f72779d = C7546e.m23569a(C27617c.f72782a);
    }

    /* renamed from: b */
    private final Bitmap m90539b(String str) {
        Bitmap c = C27618c.f72783a.mo70941c(this.f72780e.getPicFileDirPath(), str);
        if (c != null) {
            m90538a(str, c);
        }
        return c;
    }

    /* renamed from: a */
    private final Bitmap m90536a(String str) {
        List<String> arrayList = new ArrayList<>();
        Bitmap bitmap = null;
        for (Entry entry : m90537a().entrySet()) {
            Bitmap bitmap2 = (Bitmap) ((WeakReference) entry.getValue()).get();
            if (bitmap2 == null) {
                arrayList.add(entry.getKey());
            } else if (C7573i.m23585a((Object) str, (Object) (String) entry.getKey())) {
                bitmap = bitmap2;
            }
        }
        for (String remove : arrayList) {
            m90537a().remove(remove);
        }
        return bitmap;
    }

    public /* synthetic */ C27614b(OnlineSmallEmojiResInfo onlineSmallEmojiResInfo, C7571f fVar) {
        this(onlineSmallEmojiResInfo);
    }

    /* renamed from: a */
    public final Bitmap mo70937a(String str, boolean z) {
        if (str == null) {
            return null;
        }
        Bitmap a = m90536a(str);
        if (a != null && a != null) {
            return a;
        }
        if (z) {
            return m90539b(str);
        }
        return null;
    }

    /* renamed from: a */
    private final void m90538a(String str, Bitmap bitmap) {
        List<String> arrayList = new ArrayList<>();
        for (Entry entry : m90537a().entrySet()) {
            if (((WeakReference) entry.getValue()).get() == null) {
                arrayList.add(entry.getKey());
            }
        }
        for (String remove : arrayList) {
            m90537a().remove(remove);
        }
        m90537a().put(str, new WeakReference(bitmap));
    }
}
