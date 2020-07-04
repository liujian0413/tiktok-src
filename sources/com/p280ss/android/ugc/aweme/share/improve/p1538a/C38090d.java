package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.share.C37981am;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.d */
public class C38090d implements C38389f {

    /* renamed from: a */
    public static final C38091a f99152a = new C38091a(null);

    /* renamed from: b */
    private final String f99153b;

    /* renamed from: c */
    private final boolean f99154c;

    /* renamed from: d */
    private final boolean f99155d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$a */
    public static final class C38091a {
        private C38091a() {
        }

        public /* synthetic */ C38091a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$b */
    static final class C38092b<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ SharePackage f99156a;

        /* renamed from: b */
        final /* synthetic */ String f99157b;

        C38092b(SharePackage sharePackage, String str) {
            this.f99156a = sharePackage;
            this.f99157b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            String a = C37981am.m121294a(this.f99156a, this.f99157b);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$c */
    static final class C38093c<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ C38090d f99158a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f99159b;

        /* renamed from: c */
        final /* synthetic */ Context f99160c;

        C38093c(C38090d dVar, SharePackage sharePackage, Context context) {
            this.f99158a = dVar;
            this.f99159b = sharePackage;
            this.f99160c = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            boolean z;
            if (!C6399b.m19944t()) {
                if (this.f99159b.f20184j.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f99159b.f20184j);
                    sb.append(" ");
                    sb.append(str);
                    str = sb.toString();
                }
            }
            C38090d dVar = this.f99158a;
            C7573i.m23582a((Object) str, "toCopy");
            dVar.mo95724a(str, this.f99160c);
        }
    }

    public C38090d() {
        this(null, false, false, 7, null);
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.asx;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "copy";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dsf;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo95718e() {
        if (C38037a.m121403a() || TextUtils.equals(this.f99153b, "fromWeb")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    /* renamed from: a */
    public void mo95712a(Context context, SharePackage sharePackage) {
        String str;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (C38037a.m121403a() || TextUtils.equals(sharePackage.f20181g, "web")) {
            if (C6399b.m19944t()) {
                str = "copy_link";
            } else {
                str = "copy";
            }
            C7319aa.m22932a((Callable<? extends T>) new C38092b<Object>(sharePackage, str)).mo19127a(C47549a.m148327a()).mo19135b(C7333a.m23044b()).mo19125a((C7326g<? super T>) new C38093c<Object>(this, sharePackage, context)).mo19128a();
            return;
        }
        C10761a.m31410e(context, context.getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
    }

    /* renamed from: a */
    public final void mo95724a(String str, Context context) {
        C7573i.m23587b(str, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            CharSequence charSequence = str;
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
            if (this.f99155d) {
                C10761a.m31383a(context, (int) R.string.ahh).mo25750a();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    public C38090d(String str, boolean z, boolean z2) {
        C7573i.m23587b(str, "enterFrom");
        this.f99153b = str;
        this.f99154c = z;
        this.f99155d = z2;
    }

    public /* synthetic */ C38090d(String str, boolean z, boolean z2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        this(str, false, z2);
    }
}
