package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b */
public final class C24877b {

    /* renamed from: e */
    public static final int f65595e = 1;

    /* renamed from: f */
    public static final int f65596f = 2;

    /* renamed from: g */
    public static final int f65597g = 3;

    /* renamed from: h */
    public static final int f65598h = 4;

    /* renamed from: i */
    public static final int f65599i = 5;

    /* renamed from: j */
    public static final int f65600j = 6;

    /* renamed from: k */
    public static final int f65601k = 7;

    /* renamed from: l */
    public static final C24878a f65602l = new C24878a(null);

    /* renamed from: a */
    public Context f65603a;

    /* renamed from: b */
    public Loft f65604b;

    /* renamed from: c */
    public C24891f f65605c;

    /* renamed from: d */
    public boolean f65606d;

    /* renamed from: m */
    private Loft f65607m;

    /* renamed from: n */
    private final HashMap<String, Loft> f65608n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b$a */
    public static final class C24878a extends C24892g<C24877b, Context> {
        /* renamed from: a */
        public static int m81657a() {
            return C24877b.f65595e;
        }

        /* renamed from: b */
        public static int m81658b() {
            return C24877b.f65596f;
        }

        /* renamed from: c */
        public static int m81659c() {
            return C24877b.f65599i;
        }

        /* renamed from: d */
        public static int m81660d() {
            return C24877b.f65600j;
        }

        /* renamed from: e */
        public static int m81661e() {
            return C24877b.f65601k;
        }

        private C24878a() {
            super(C248791.f65609a);
        }

        public /* synthetic */ C24878a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b$b */
    public interface C24880b {
        /* renamed from: a */
        void mo64887a(int i, Throwable th);

        /* renamed from: a */
        void mo64889a(Loft loft);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b$c */
    public static final class C24881c extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C24877b f65610a;

        /* renamed from: b */
        final /* synthetic */ String f65611b;

        /* renamed from: c */
        final /* synthetic */ Loft f65612c;

        /* renamed from: d */
        final /* synthetic */ WeakReference f65613d;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            this.f65610a.mo65122b(this.f65611b, this.f65612c, this.f65613d);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            this.f65610a.mo65118a(this.f65611b, C24878a.m81659c(), this.f65613d, baseException);
        }

        C24881c(C24877b bVar, String str, Loft loft, WeakReference weakReference) {
            this.f65610a = bVar;
            this.f65611b = str;
            this.f65612c = loft;
            this.f65613d = weakReference;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b$d */
    static final class C24882d<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C24891f f65614a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f65615b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f65616c;

        C24882d(C24891f fVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f65614a = fVar;
            this.f65615b = viewGroup;
            this.f65616c = viewGroup2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                float floatValue = f.floatValue() / this.f65614a.f65638d;
                ViewGroup viewGroup = this.f65615b;
                C7573i.m23582a((Object) viewGroup, "strongGuide");
                if (viewGroup.getVisibility() == 0) {
                    ViewGroup viewGroup2 = this.f65615b;
                    C7573i.m23582a((Object) viewGroup2, "strongGuide");
                    viewGroup2.setAlpha(1.0f - floatValue);
                }
                ViewGroup viewGroup3 = this.f65616c;
                C7573i.m23582a((Object) viewGroup3, "weakGuide");
                if (viewGroup3.getVisibility() == 0) {
                    ViewGroup viewGroup4 = this.f65616c;
                    C7573i.m23582a((Object) viewGroup4, "weakGuide");
                    viewGroup4.setAlpha(1.0f - floatValue);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b$e */
    public static final class C24883e implements C18245g<LoftResponse> {

        /* renamed from: a */
        final /* synthetic */ C24877b f65617a;

        /* renamed from: b */
        final /* synthetic */ String f65618b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f65619c;

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f65617a.mo65118a(this.f65618b, C24878a.m81657a(), this.f65619c, th);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(LoftResponse loftResponse) {
            boolean z;
            Loft a = C24877b.m81635a(loftResponse);
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f65617a.mo65119a(this.f65618b, a, this.f65619c);
            } else {
                this.f65617a.mo65118a(this.f65618b, C24878a.m81658b(), this.f65619c, null);
            }
        }

        C24883e(C24877b bVar, String str, WeakReference weakReference) {
            this.f65617a = bVar;
            this.f65618b = str;
            this.f65619c = weakReference;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b$f */
    static final class C24884f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C24877b f65620a;

        /* renamed from: b */
        final /* synthetic */ Loft f65621b;

        C24884f(C24877b bVar, Loft loft) {
            this.f65620a = bVar;
            this.f65621b = loft;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m81667a());
        }

        /* renamed from: a */
        private int m81667a() {
            return ((C24874a) C24874a.f65591a.mo65136a(this.f65620a.f65603a)).mo65113b(this.f65620a.mo65127d(this.f65621b), this.f65620a.mo65124c(this.f65621b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.b$g */
    static final class C24885g<TTaskResult, TContinuationResult> implements C1591g<Integer, Void> {

        /* renamed from: a */
        final /* synthetic */ C24877b f65622a;

        /* renamed from: b */
        final /* synthetic */ Loft f65623b;

        /* renamed from: c */
        final /* synthetic */ String f65624c;

        /* renamed from: d */
        final /* synthetic */ WeakReference f65625d;

        C24885g(C24877b bVar, Loft loft, String str, WeakReference weakReference) {
            this.f65622a = bVar;
            this.f65623b = loft;
            this.f65624c = str;
            this.f65625d = weakReference;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            Integer num = (Integer) hVar.mo6890e();
            if (num == null || num.intValue() != 0) {
                this.f65622a.mo65121b(this.f65623b);
                this.f65622a.mo65118a(this.f65624c, C24878a.m81660d(), this.f65625d, hVar.mo6891f());
            } else if (this.f65622a.mo65120a(this.f65623b)) {
                this.f65622a.mo65125c(this.f65624c, this.f65623b, this.f65625d);
            } else {
                this.f65622a.mo65121b(this.f65623b);
                this.f65622a.mo65118a(this.f65624c, C24878a.m81661e(), this.f65625d, null);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo65119a(String str, Loft loft, WeakReference<C24880b> weakReference) {
        if (!C24890e.m81674a(loft)) {
            mo65118a(str, f65597g, weakReference, null);
        } else if (m81640e(loft)) {
            m81641f(loft);
            if (C24890e.m81676c(loft)) {
                mo65125c(str, loft, weakReference);
            } else {
                mo65122b(str, loft, weakReference);
            }
        } else {
            C24886c cVar = (C24886c) C24886c.f65626a.mo65136a(this.f65603a);
            LoftAnimationRes animationRes = loft.getAnimationRes();
            if (animationRes == null) {
                C7573i.m23580a();
            }
            cVar.mo65130a(animationRes.getDownloadUrl(), m81639e(), m81642g(loft), new C24881c(this, str, loft, weakReference));
        }
    }

    /* renamed from: a */
    public final void mo65118a(String str, int i, WeakReference<C24880b> weakReference, Throwable th) {
        CharSequence charSequence = str;
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            this.f65604b = null;
        }
        this.f65607m = null;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            this.f65608n.remove(str);
        }
        if (weakReference != null) {
            C24880b bVar = (C24880b) weakReference.get();
            if (bVar != null) {
                bVar.mo64887a(i, th);
            }
        }
    }

    /* renamed from: e */
    private final String m81639e() {
        return ((C24874a) C24874a.f65591a.mo65136a(this.f65603a)).mo65111a();
    }

    /* renamed from: d */
    private boolean m81638d() {
        if (!mo65123b() || !this.f65606d || this.f65605c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo65123b() {
        Loft loft = this.f65604b;
        if (loft == null || !C24890e.m81676c(loft)) {
            return false;
        }
        if (loft.getStatus() == C24889d.f65631c || loft.getStatus() == C24889d.f65630b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo65126c() {
        Loft loft = this.f65604b;
        if (loft != null && C24890e.m81676c(loft) && loft.getStatus() == C24889d.f65631c) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65115a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r0 = r5.f65607m
            if (r0 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r0 = r5.f65607m
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftAnimationRes r0 = r0.getAnimationRes()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.getDownloadUrl()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0022
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            goto L_0x0076
        L_0x0026:
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r0 = r5.f65607m
            if (r0 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftAnimationRes r0 = r0.getAnimationRes()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r0.getDownloadUrl()
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            if (r0 != 0) goto L_0x003b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x003b:
            java.lang.String r2 = r5.m81639e()
            com.ss.android.ugc.aweme.commercialize.loft.model.c$a r3 = com.p280ss.android.ugc.aweme.commercialize.loft.model.C24886c.f65626a
            android.content.Context r4 = r5.f65603a
            java.lang.Object r3 = r3.mo65136a(r4)
            com.ss.android.ugc.aweme.commercialize.loft.model.c r3 = (com.p280ss.android.ugc.aweme.commercialize.loft.model.C24886c) r3
            boolean r3 = r3.mo65131b(r0, r2)
            if (r3 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.commercialize.loft.model.c$a r3 = com.p280ss.android.ugc.aweme.commercialize.loft.model.C24886c.f65626a
            android.content.Context r4 = r5.f65603a
            java.lang.Object r3 = r3.mo65136a(r4)
            com.ss.android.ugc.aweme.commercialize.loft.model.c r3 = (com.p280ss.android.ugc.aweme.commercialize.loft.model.C24886c) r3
            r3.mo65129a(r0, r2)
        L_0x005c:
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r0 = r5.f65607m
            if (r0 != 0) goto L_0x0063
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0063:
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.loft.model.C24890e.m81675b(r0)
            if (r0 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r0 = r5.f65607m
            if (r0 != 0) goto L_0x0070
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0070:
            r5.mo65121b(r0)
        L_0x0073:
            r5.f65604b = r1
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b.mo65115a():void");
    }

    /* renamed from: a */
    public final boolean mo65120a(Loft loft) {
        m81641f(loft);
        return C24890e.m81676c(loft);
    }

    /* renamed from: g */
    private final String m81642g(Loft loft) {
        return ((C24874a) C24874a.f65591a.mo65136a(this.f65603a)).mo65112a(loft);
    }

    private C24877b(Context context) {
        Context applicationContext = context.getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "context.applicationContext");
        this.f65603a = applicationContext;
        this.f65608n = new HashMap<>();
    }

    /* renamed from: b */
    public final void mo65121b(Loft loft) {
        C24874a.f65591a.mo65136a(this.f65603a);
        C24874a.m81627a(mo65127d(loft));
        C24874a.f65591a.mo65136a(this.f65603a);
        C24874a.m81628b(mo65124c(loft));
    }

    /* renamed from: a */
    public static Loft m81635a(LoftResponse loftResponse) {
        if (loftResponse == null || loftResponse.status_code != 0) {
            return null;
        }
        Loft loft = new Loft();
        loft.setId(loftResponse.getId());
        loft.setAnimationRes(loftResponse.getAnimationRes());
        loft.setEndTime(loftResponse.getEndTime());
        loft.setGuide(loftResponse.getGuide());
        loft.setStatus(loftResponse.getStatus());
        loft.setVideoList(loftResponse.getVideoList());
        return loft;
    }

    /* renamed from: e */
    private final boolean m81640e(Loft loft) {
        String str;
        C24886c cVar = (C24886c) C24886c.f65626a.mo65136a(this.f65603a);
        LoftAnimationRes animationRes = loft.getAnimationRes();
        if (animationRes != null) {
            str = animationRes.getDownloadUrl();
        } else {
            str = null;
        }
        if (str == null) {
            C7573i.m23580a();
        }
        if (!cVar.mo65132c(str, m81639e()) || !new File(mo65127d(loft)).exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo65124c(Loft loft) {
        StringBuilder sb = new StringBuilder();
        sb.append(((C24874a) C24874a.f65591a.mo65136a(this.f65603a)).mo65111a());
        sb.append(File.separator);
        String id = loft.getId();
        if (id == null) {
            C7573i.m23580a();
        }
        sb.append(id);
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo65127d(Loft loft) {
        StringBuilder sb = new StringBuilder();
        sb.append(m81639e());
        sb.append(File.separator);
        sb.append(m81642g(loft));
        return sb.toString();
    }

    /* renamed from: f */
    private final void m81641f(Loft loft) {
        LoftAnimationRes animationRes = loft.getAnimationRes();
        if (animationRes != null) {
            animationRes.setBackgroundUri(m81636a(loft, "background.png"));
        }
        LoftAnimationRes animationRes2 = loft.getAnimationRes();
        if (animationRes2 != null) {
            animationRes2.setFloatLeftTopUri(m81636a(loft, "floatLeftTop.png"));
        }
        LoftAnimationRes animationRes3 = loft.getAnimationRes();
        if (animationRes3 != null) {
            animationRes3.setFloatRightTopUri(m81636a(loft, "floatRightTop.png"));
        }
        LoftAnimationRes animationRes4 = loft.getAnimationRes();
        if (animationRes4 != null) {
            animationRes4.setFloatLeftBottomUri(m81636a(loft, "floatLeftBottom.png"));
        }
        LoftAnimationRes animationRes5 = loft.getAnimationRes();
        if (animationRes5 != null) {
            animationRes5.setFloatRightBottomUri(m81636a(loft, "floatRightBottom.png"));
        }
        LoftAnimationRes animationRes6 = loft.getAnimationRes();
        if (animationRes6 != null) {
            animationRes6.setGoodsBackgroundUri(m81636a(loft, "goodsBackground.png"));
        }
        LoftAnimationRes animationRes7 = loft.getAnimationRes();
        if (animationRes7 != null) {
            animationRes7.setGoodsUri(m81636a(loft, "goods.png"));
        }
        LoftAnimationRes animationRes8 = loft.getAnimationRes();
        if (animationRes8 != null) {
            animationRes8.setLogoLeftUri(m81636a(loft, "logoLeft.png"));
        }
        LoftAnimationRes animationRes9 = loft.getAnimationRes();
        if (animationRes9 != null) {
            animationRes9.setLogoRightUri(m81636a(loft, "logoRight.png"));
        }
    }

    /* renamed from: a */
    public final Loft mo65114a(String str) {
        Object obj;
        C7573i.m23587b(str, "id");
        Loft loft = (Loft) this.f65608n.get(str);
        if (loft != null) {
            Loft loft2 = (Loft) this.f65608n.get(str);
            if (loft2 != null) {
                obj = loft2.getId();
            } else {
                obj = null;
            }
            if (C7573i.m23585a((Object) str, obj)) {
                return loft;
            }
            return null;
        }
        loft = null;
        return loft;
    }

    public /* synthetic */ C24877b(Context context, C7571f fVar) {
        this(context);
    }

    /* renamed from: a */
    public final void mo65117a(C24880b bVar, String str) {
        C18246h.m60214a(LoftApi.m81624a(str), (C18245g<? super V>) new C24883e<Object>(this, str, new WeakReference(bVar)), C1592h.f5958b);
    }

    /* renamed from: a */
    private final String m81636a(Loft loft, String str) {
        try {
            C24874a.f65591a.mo65136a(this.f65603a);
            String a = C24874a.m81626a(mo65127d(loft), mo65124c(loft));
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(File.separator);
            sb.append(str);
            File file = new File(sb.toString());
            if (file.exists()) {
                return Uri.fromFile(file).toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private final void m81637a(String str, Loft loft) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f65604b = loft;
        }
        this.f65607m = loft;
        CharSequence id = loft.getId();
        if (id == null || id.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            Map map = this.f65608n;
            String id2 = loft.getId();
            if (id2 == null) {
                C7573i.m23580a();
            }
            map.put(id2, loft);
        }
    }

    /* renamed from: a */
    public final void mo65116a(View view, C0043i iVar) {
        int i;
        int i2;
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(iVar, "owner");
        C24878a aVar = f65602l;
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        C24891f fVar = ((C24877b) aVar.mo65136a(context)).f65605c;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.dbt);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.eg2);
        View findViewById = view.findViewById(R.id.clu);
        if (!m81638d()) {
            C7573i.m23582a((Object) viewGroup, "strongGuide");
            viewGroup.setVisibility(8);
            C7573i.m23582a((Object) viewGroup2, "weakGuide");
            viewGroup2.setVisibility(8);
            C7573i.m23582a((Object) findViewById, "pullGuideDivide");
            findViewById.setVisibility(8);
            return;
        }
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl c = a.mo60073c();
        C7573i.m23582a((Object) c, "CommonSharePrefCache.ins…shouldShowPullStrongGuide");
        Boolean bool = (Boolean) c.mo59877d();
        C7573i.m23582a((Object) viewGroup, "strongGuide");
        C7573i.m23582a((Object) bool, "showStrongGuide");
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
        C7573i.m23582a((Object) viewGroup2, "weakGuide");
        if (bool.booleanValue()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        viewGroup2.setVisibility(i2);
        if (bool.booleanValue()) {
            C7573i.m23582a((Object) findViewById, "pullGuideDivide");
            findViewById.setVisibility(0);
            TextView textView = (TextView) view.findViewById(R.id.clw);
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.clv);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.clt);
            C7573i.m23582a((Object) textView, "textView");
            C24878a aVar2 = f65602l;
            Context context2 = view.getContext();
            C7573i.m23582a((Object) context2, "itemView.context");
            C24891f fVar2 = ((C24877b) aVar2.mo65136a(context2)).f65605c;
            if (fVar2 == null) {
                C7573i.m23580a();
            }
            textView.setText(fVar2.f65636b);
            C24878a aVar3 = f65602l;
            Context context3 = view.getContext();
            C7573i.m23582a((Object) context3, "itemView.context");
            C24891f fVar3 = ((C24877b) aVar3.mo65136a(context3)).f65605c;
            if (fVar3 == null) {
                C7573i.m23580a();
            }
            if (fVar3.f65635a == null) {
                C7573i.m23582a((Object) frameLayout, "frameLayout");
                frameLayout.setVisibility(8);
            } else {
                C7573i.m23582a((Object) frameLayout, "frameLayout");
                frameLayout.setVisibility(0);
                if (fVar == null) {
                    C7573i.m23580a();
                }
                C23323e.m76524b(remoteImageView, fVar.f65635a);
            }
            C6907h.m21524a("show_toast", (Map) C22984d.m75611a().mo59973a("scene_id", "1003").mo59973a("toast_type", "enter_guide").mo59973a("enter_from", "discovery").f60753a);
        } else {
            C7573i.m23582a((Object) findViewById, "pullGuideDivide");
            findViewById.setVisibility(8);
        }
        if (fVar == null) {
            C7573i.m23580a();
        }
        fVar.f65637c.observe(iVar, new C24882d(fVar, viewGroup, viewGroup2));
    }

    /* renamed from: c */
    public final void mo65125c(String str, Loft loft, WeakReference<C24880b> weakReference) {
        m81637a(str, loft);
        if (weakReference != null) {
            C24880b bVar = (C24880b) weakReference.get();
            if (bVar != null) {
                bVar.mo64889a(loft);
            }
        }
    }

    /* renamed from: b */
    public final void mo65122b(String str, Loft loft, WeakReference<C24880b> weakReference) {
        C1592h.m7853a((Callable<TResult>) new C24884f<TResult>(this, loft)).mo6876a((C1591g<TResult, TContinuationResult>) new C24885g<TResult,TContinuationResult>(this, loft, str, weakReference), C1592h.f5958b);
    }
}
