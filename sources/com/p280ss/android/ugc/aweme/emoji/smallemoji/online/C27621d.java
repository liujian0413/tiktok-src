package com.p280ss.android.ugc.aweme.emoji.smallemoji.online;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.vast.p673a.C13015c;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.C27629a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiRes;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo;
import com.p280ss.android.ugc.aweme.emoji.utils.C27631b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27633d;
import com.p280ss.android.ugc.aweme.emoji.utils.EmojiApi;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d */
public final class C27621d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f72789a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27621d.class), "emojiNameIdMap", "getEmojiNameIdMap()Ljava/util/LinkedHashMap;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27621d.class), "panelEmojiNameMap", "getPanelEmojiNameMap()Ljava/util/LinkedHashMap;"))};

    /* renamed from: f */
    public static final C27621d f72790f = new C27621d();

    /* renamed from: g */
    public static final C27622a f72791g = new C27622a(null);

    /* renamed from: b */
    public OnlineSmallEmojiResInfo f72792b;

    /* renamed from: c */
    public C27614b f72793c;

    /* renamed from: d */
    public volatile String f72794d = "";

    /* renamed from: e */
    public volatile int f72795e;

    /* renamed from: h */
    private final C7541d f72796h = C7546e.m23569a(C27624c.f72800a);

    /* renamed from: i */
    private final C7541d f72797i = C7546e.m23569a(C27625d.f72801a);

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d$a */
    public static final class C27622a {
        private C27622a() {
        }

        /* renamed from: a */
        public static C27621d m90577a() {
            return C27621d.f72790f;
        }

        public /* synthetic */ C27622a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d$b */
    public static final class C27623b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C27621d f72798a;

        /* renamed from: b */
        final /* synthetic */ OnlineSmallEmojiRes f72799b;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
            if (r3 == null) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p280ss.android.socialbase.downloader.model.DownloadInfo r3) {
            /*
                r2 = this;
                super.onSuccessed(r3)
                java.lang.String r0 = "OnlineEmojiResManager download succeed"
                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r0)
                com.ss.android.ugc.aweme.emoji.smallemoji.online.d r0 = r2.f72798a
                com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiRes r1 = r2.f72799b
                if (r3 == 0) goto L_0x0014
                java.lang.String r3 = r3.getTargetFilePath()
                if (r3 != 0) goto L_0x0016
            L_0x0014:
                java.lang.String r3 = ""
            L_0x0016:
                r0.mo70953a(r1, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27621d.C27623b.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        C27623b(C27621d dVar, OnlineSmallEmojiRes onlineSmallEmojiRes) {
            this.f72798a = dVar;
            this.f72799b = onlineSmallEmojiRes;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Object obj;
            super.onFailed(downloadInfo, baseException);
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager download failed: ");
            String str = null;
            if (baseException != null) {
                obj = Integer.valueOf(baseException.getErrorCode());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            if (baseException != null) {
                str = baseException.getMessage();
            }
            sb.append(str);
            C6921a.m21555a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d$c */
    static final class C27624c extends Lambda implements C7561a<LinkedHashMap<String, String>> {

        /* renamed from: a */
        public static final C27624c f72800a = new C27624c();

        C27624c() {
            super(0);
        }

        /* renamed from: a */
        private static LinkedHashMap<String, String> m90578a() {
            return new LinkedHashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m90578a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d$d */
    static final class C27625d extends Lambda implements C7561a<LinkedHashMap<String, String>> {

        /* renamed from: a */
        public static final C27625d f72801a = new C27625d();

        C27625d() {
            super(0);
        }

        /* renamed from: a */
        private static LinkedHashMap<String, String> m90579a() {
            return new LinkedHashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m90579a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d$e */
    static final class C27626e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f72802a;

        C27626e(String str) {
            this.f72802a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public OnlineSmallEmojiResInfo call() {
            C27618c cVar = C27618c.f72783a;
            String str = this.f72802a;
            C7573i.m23582a((Object) str, "lastCacheMd5");
            return cVar.mo70944e(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d$f */
    static final class C27627f<TTaskResult, TContinuationResult> implements C1591g<OnlineSmallEmojiResInfo, Void> {

        /* renamed from: a */
        final /* synthetic */ C27621d f72803a;

        /* renamed from: b */
        final /* synthetic */ String f72804b;

        C27627f(C27621d dVar, String str) {
            this.f72803a = dVar;
            this.f72804b = str;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
            if (r7 == null) goto L_0x0094;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(bolts.C1592h<com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo> r7) {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "OnlineEmojiResManager preloadResourceInfo: "
                r0.<init>(r1)
                java.lang.String r1 = r6.f72804b
                r0.append(r1)
                java.lang.String r1 = ", result="
                r0.append(r1)
                java.lang.String r1 = "task"
                kotlin.jvm.internal.C7573i.m23582a(r7, r1)
                java.lang.Object r1 = r7.mo6890e()
                com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo r1 = (com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo) r1
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r0)
                java.lang.Object r7 = r7.mo6890e()
                com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo r7 = (com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo) r7
                r0 = 0
                if (r7 == 0) goto L_0x0094
                boolean r1 = r7.isValid()
                if (r1 == 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r7 = r0
            L_0x0037:
                if (r7 == 0) goto L_0x0094
                com.ss.android.ugc.aweme.emoji.smallemoji.online.d r1 = r6.f72803a
                r1.f72792b = r7
                java.util.List r1 = r7.getStickers()
                if (r1 != 0) goto L_0x0046
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0046:
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x004c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0085
                java.lang.Object r2 = r1.next()
                com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmoji r2 = (com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmoji) r2
                com.ss.android.ugc.aweme.emoji.smallemoji.online.d r3 = r6.f72803a
                java.util.LinkedHashMap r3 = r3.mo70948a()
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = r2.getDisplayName()
                java.lang.String r5 = r2.getUri()
                r3.put(r4, r5)
                boolean r3 = r2.showInPanel()
                if (r3 == 0) goto L_0x004c
                com.ss.android.ugc.aweme.emoji.smallemoji.online.d r3 = r6.f72803a
                java.util.LinkedHashMap r3 = r3.mo70956b()
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = r2.getDisplayName()
                java.lang.String r2 = r2.getUri()
                r3.put(r4, r2)
                goto L_0x004c
            L_0x0085:
                com.ss.android.ugc.aweme.emoji.smallemoji.online.d r1 = r6.f72803a
                com.ss.android.ugc.aweme.emoji.smallemoji.online.b r2 = com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27614b.C27615a.m90541a(r7)
                r1.f72793c = r2
                com.ss.android.ugc.aweme.emoji.smallemoji.online.d r1 = r6.f72803a
                r2 = 2
                r1.f72795e = r2
                if (r7 != 0) goto L_0x0099
            L_0x0094:
                com.ss.android.ugc.aweme.emoji.smallemoji.online.d r7 = r6.f72803a
                r1 = 3
                r7.f72795e = r1
            L_0x0099:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27621d.C27627f.then(bolts.h):java.lang.Void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.d$g */
    public static final class C27628g implements C47557ad<C27629a> {

        /* renamed from: a */
        final /* synthetic */ C27621d f72805a;

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C27628g(C27621d dVar) {
            this.f72805a = dVar;
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            C6921a.m21559a(th);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(C27629a aVar) {
            C7573i.m23587b(aVar, "response");
            boolean z = true;
            if (aVar.f72809b == 1) {
                C27633d a = C27633d.m90594a();
                C7573i.m23582a((Object) a, "EmojiSPUtils.get()");
                a.mo71029a("");
                C6921a.m21555a("OnlineEmojiResManager refreshEmoji fallback");
                return;
            }
            OnlineSmallEmojiRes onlineSmallEmojiRes = aVar.f72808a;
            if (onlineSmallEmojiRes != null) {
                if (!C13015c.m37973a(onlineSmallEmojiRes.getMd5()) && !C13015c.m37973a(onlineSmallEmojiRes.getResourceUrl())) {
                    z = false;
                }
                if (z) {
                    onlineSmallEmojiRes = null;
                }
                if (onlineSmallEmojiRes != null) {
                    C27633d a2 = C27633d.m90594a();
                    C7573i.m23582a((Object) a2, "EmojiSPUtils.get()");
                    if (C7573i.m23585a((Object) onlineSmallEmojiRes.getMd5(), (Object) a2.mo71033d())) {
                        C27618c cVar = C27618c.f72783a;
                        String md5 = onlineSmallEmojiRes.getMd5();
                        if (md5 == null) {
                            C7573i.m23580a();
                        }
                        if (!cVar.mo70942c(md5)) {
                            this.f72805a.mo70957b(onlineSmallEmojiRes);
                            return;
                        }
                    }
                    this.f72805a.mo70952a(onlineSmallEmojiRes);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager refreshEmoji fail: ");
            sb.append(aVar);
            C6921a.m21555a(sb.toString());
        }
    }

    /* renamed from: a */
    public final LinkedHashMap<String, String> mo70948a() {
        return (LinkedHashMap) this.f72796h.getValue();
    }

    /* renamed from: b */
    public final LinkedHashMap<String, String> mo70956b() {
        return (LinkedHashMap) this.f72797i.getValue();
    }

    /* renamed from: g */
    private final boolean m90562g() {
        int i = this.f72795e;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final int mo70959d() {
        return mo70956b().size();
    }

    private C27621d() {
        m90561f();
    }

    /* renamed from: c */
    public final boolean mo70958c() {
        boolean z;
        if (this.f72795e == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager not enabled: ");
            sb.append(this.f72795e);
            C6921a.m21555a(sb.toString());
        }
        return z;
    }

    /* renamed from: e */
    public final void mo70960e() {
        EmojiApi a = C27631b.m90586a();
        C7573i.m23582a((Object) a, "EmojiApiUtil.get()");
        C7319aa.m22929a((C7496w<? extends T>) a.getSmallEmojiResources()).mo19135b(C7333a.m23044b()).mo19137b((C47557ad<? super T>) new C27628g<Object>(this));
    }

    /* renamed from: f */
    private void m90561f() {
        boolean z;
        C27633d a = C27633d.m90594a();
        C7573i.m23582a((Object) a, "EmojiSPUtils.get()");
        String d = a.mo71033d();
        C7573i.m23582a((Object) d, "lastCacheMd5");
        if (d.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C6921a.m21555a("OnlineEmojiResManager preloadResourceInfo lastCacheMd5 empty");
            return;
        }
        this.f72794d = d;
        this.f72795e = 1;
        C1592h.m7853a((Callable<TResult>) new C27626e<TResult>(d)).mo6876a((C1591g<TResult, TContinuationResult>) new C27627f<TResult,TContinuationResult>(this, d), C1592h.f5958b);
    }

    /* renamed from: b */
    private static Drawable m90558b(Context context) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getDrawable(R.drawable.a07);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo70954a(String str) {
        boolean z;
        boolean z2 = true;
        if (str != null) {
            CharSequence charSequence = (CharSequence) mo70948a().get(str);
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return z2;
            }
            return false;
        }
        z2 = false;
        return z2;
    }

    /* renamed from: c */
    private final String m90559c(String str) {
        StringBuilder sb = new StringBuilder("file:/");
        OnlineSmallEmojiResInfo onlineSmallEmojiResInfo = this.f72792b;
        if (onlineSmallEmojiResInfo == null) {
            C7573i.m23580a();
        }
        sb.append(onlineSmallEmojiResInfo.getPicFileDirPath());
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    private final String m90560d(String str) {
        if (!mo70958c()) {
            return null;
        }
        String str2 = (String) mo70948a().get(str);
        if (str2 == null) {
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager mapResource not found: ");
            sb.append(str);
            C6921a.m21555a(sb.toString());
            str2 = null;
        }
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r1 == null) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo70947a(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo r1 = r5.f72792b
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = r1.getMiniCover()
            if (r1 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.emoji.smallemoji.online.b r2 = r5.f72793c
            if (r2 == 0) goto L_0x0018
            r3 = 0
            r4 = 2
            android.graphics.Bitmap r0 = r2.mo70937a(r1, true)
        L_0x0018:
            if (r0 == 0) goto L_0x0026
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r6.getResources()
            r1.<init>(r2, r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            goto L_0x002a
        L_0x0026:
            android.graphics.drawable.Drawable r1 = m90558b(r6)
        L_0x002a:
            if (r1 != 0) goto L_0x0030
        L_0x002c:
            android.graphics.drawable.Drawable r1 = m90558b(r6)
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27621d.mo70947a(android.content.Context):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    public final Bitmap mo70955b(String str) {
        if (!mo70958c()) {
            return null;
        }
        C27614b bVar = this.f72793c;
        if (bVar != null) {
            return bVar.mo70937a(m90560d(str), true);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo70957b(OnlineSmallEmojiRes onlineSmallEmojiRes) {
        boolean z;
        C27618c cVar = C27618c.f72783a;
        if (m90562g()) {
            if (this.f72794d.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String[] strArr = new String[2];
                strArr[0] = this.f72794d;
                String md5 = onlineSmallEmojiRes.getMd5();
                if (md5 == null) {
                    C7573i.m23580a();
                }
                strArr[1] = md5;
                cVar.mo70938a(strArr);
                return;
            }
        }
        String[] strArr2 = new String[1];
        String md52 = onlineSmallEmojiRes.getMd5();
        if (md52 == null) {
            C7573i.m23580a();
        }
        strArr2[0] = md52;
        cVar.mo70938a(strArr2);
    }

    /* renamed from: a */
    public final void mo70952a(OnlineSmallEmojiRes onlineSmallEmojiRes) {
        DownloadTask savePath = Downloader.with(C6399b.m19921a()).url(onlineSmallEmojiRes.getResourceUrl()).retryCount(3).savePath(C27618c.m90546a());
        String md5 = onlineSmallEmojiRes.getMd5();
        if (md5 == null) {
            C7573i.m23580a();
        }
        savePath.name(C27618c.m90547a(md5)).subThreadListener(new C27623b(this, onlineSmallEmojiRes)).download();
    }

    /* renamed from: a */
    public final List<C27517a> mo70949a(int i, int i2) {
        if (!mo70958c()) {
            return new ArrayList<>();
        }
        List<C27517a> arrayList = new ArrayList<>();
        if (i >= mo70956b().size()) {
            return arrayList;
        }
        int i3 = 0;
        for (Entry entry : mo70956b().entrySet()) {
            if (i3 >= i && i3 < i + i2) {
                C27517a aVar = new C27517a();
                aVar.f72558c = (String) entry.getKey();
                aVar.f72557b = m90559c((String) entry.getValue());
                arrayList.add(aVar);
            }
            i3++;
            if (i3 >= i + i2) {
                break;
            }
        }
        int size = i2 - arrayList.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new C27517a());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<C27517a> mo70950a(List<String> list, int i) {
        boolean z;
        if (!mo70958c()) {
            return new ArrayList<>();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (String str : list) {
                String str2 = (String) mo70956b().get(str);
                CharSequence charSequence = str2;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    linkedHashMap.put(str, str2);
                }
            }
        }
        if (linkedHashMap.size() < i) {
            Map b = mo70956b();
            Map linkedHashMap2 = new LinkedHashMap();
            for (Entry entry : b.entrySet()) {
                if (!linkedHashMap.keySet().contains(entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            for (Entry entry2 : C7525m.m23505c((Iterable<? extends T>) linkedHashMap2.entrySet(), i - linkedHashMap.size())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        List<C27517a> arrayList = new ArrayList<>();
        for (Entry entry3 : linkedHashMap.entrySet()) {
            C27517a aVar = new C27517a();
            aVar.f72558c = (String) entry3.getKey();
            aVar.f72557b = m90559c((String) entry3.getValue());
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo70951a(RemoteImageView remoteImageView, C27517a aVar) {
        C7573i.m23587b(remoteImageView, "view");
        C7573i.m23587b(aVar, "emoji");
        if (mo70958c()) {
            C27614b bVar = this.f72793c;
            if (bVar != null) {
                Bitmap a = bVar.mo70937a(m90560d(aVar.f72558c), false);
                if (a != null) {
                    Context context = remoteImageView.getContext();
                    C7573i.m23582a((Object) context, "view.context");
                    remoteImageView.setImageDrawable(new BitmapDrawable(context.getResources(), a));
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.f72557b);
            C23323e.m76514a(remoteImageView, sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo70953a(OnlineSmallEmojiRes onlineSmallEmojiRes, String str) {
        C27618c cVar;
        C27618c cVar2 = C27618c.f72783a;
        String md5 = onlineSmallEmojiRes.getMd5();
        if (md5 == null) {
            C7573i.m23580a();
        }
        if (C27618c.m90550b(str, md5)) {
            cVar = cVar2;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            String md52 = onlineSmallEmojiRes.getMd5();
            if (md52 == null) {
                C7573i.m23580a();
            }
            String b = C27618c.m90549b(md52);
            if (cVar.mo70939a(str, b)) {
                C6921a.m21555a("OnlineEmojiResManager unZip success");
                mo70957b(onlineSmallEmojiRes);
                C27633d a = C27633d.m90594a();
                C7573i.m23582a((Object) a, "EmojiSPUtils.get()");
                a.mo71029a(onlineSmallEmojiRes.getMd5());
            } else {
                C6921a.m21555a("OnlineEmojiResManager unZip failed");
                C27618c.f72783a.mo70943d(b);
            }
        } else {
            C6921a.m21555a("OnlineEmojiResManager resource zip not valid");
        }
        cVar2.mo70940b();
    }
}
