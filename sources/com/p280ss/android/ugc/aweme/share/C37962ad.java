package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.update.C42791i;
import com.p280ss.android.ugc.aweme.update.UpdateHelper;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.ad */
public final class C37962ad implements C6310a {

    /* renamed from: c */
    public static final int f98854c = 1;

    /* renamed from: d */
    public static final int f98855d = 2;

    /* renamed from: e */
    public static final int f98856e = 3;

    /* renamed from: f */
    public static final C37963a f98857f = new C37963a(null);

    /* renamed from: a */
    public final C6309f f98858a = new C6309f(this);

    /* renamed from: b */
    public final Activity f98859b;

    /* renamed from: g */
    private C42791i f98860g;

    /* renamed from: h */
    private WeakReference<C11029b> f98861h;

    /* renamed from: i */
    private final String f98862i;

    /* renamed from: com.ss.android.ugc.aweme.share.ad$a */
    public static final class C37963a {
        private C37963a() {
        }

        public /* synthetic */ C37963a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ad$b */
    static final class C37964b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Runnable f98863a;

        C37964b(Runnable runnable) {
            this.f98863a = runnable;
        }

        /* renamed from: a */
        private void m121266a() {
            this.f98863a.run();
        }

        public final /* synthetic */ Object call() {
            m121266a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ad$c */
    static final class C37965c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37962ad f98864a;

        /* renamed from: b */
        final /* synthetic */ C42791i f98865b;

        C37965c(C37962ad adVar, C42791i iVar) {
            this.f98864a = adVar;
            this.f98865b = iVar;
        }

        public final void run() {
            if (!this.f98865b.mo104433a()) {
                if (!C37967af.m121268a(this.f98864a.f98859b)) {
                    this.f98864a.f98858a.sendEmptyMessage(C37962ad.f98854c);
                } else {
                    this.f98864a.f98858a.sendEmptyMessage(C37962ad.f98855d);
                }
            } else if (!this.f98865b.mo104434b()) {
                this.f98864a.f98858a.sendEmptyMessage(C37962ad.f98855d);
            } else {
                this.f98864a.f98858a.sendEmptyMessage(C37962ad.f98856e);
            }
        }
    }

    /* renamed from: a */
    public final void mo95569a() {
        if (!this.f98859b.isFinishing()) {
            this.f98860g = UpdateHelper.m135755b().mo104415z();
            C42791i iVar = this.f98860g;
            if (iVar != null) {
                if (iVar.mo104435c()) {
                    new C11030a(this.f98859b).mo26634a((int) R.string.e9k).mo26645b((int) R.string.btm).mo26635a((int) R.string.afn, (OnClickListener) null).mo26649b();
                } else if (!C37966ae.m121267a(this.f98859b)) {
                    new C11030a(this.f98859b).mo26634a((int) R.string.e9k).mo26645b((int) R.string.cjs).mo26635a((int) R.string.afn, (OnClickListener) null).mo26649b();
                } else {
                    this.f98861h = new WeakReference<>(new C11030a(this.f98859b).mo26634a((int) R.string.e9k).mo26645b((int) R.string.a3a).mo26642a(false).mo26649b());
                    C1592h.m7855a((Callable<TResult>) new C37964b<TResult>(new C37965c(this, iVar)), (Executor) C7258h.m22730c());
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        C11029b bVar;
        C7573i.m23587b(message, "msg");
        WeakReference<C11029b> weakReference = this.f98861h;
        if (weakReference != null) {
            bVar = (C11029b) weakReference.get();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.dismiss();
        }
        if (this.f98859b != null && !this.f98859b.isFinishing()) {
            int i = message.what;
            if (i == f98854c) {
                new C11030a(this.f98859b).mo26634a((int) R.string.e9k).mo26645b((int) R.string.cjm).mo26635a((int) R.string.afn, (OnClickListener) null).mo26649b();
            } else if (i == f98855d) {
                new C11030a(this.f98859b).mo26634a((int) R.string.e9k).mo26645b((int) R.string.cn4).mo26635a((int) R.string.afn, (OnClickListener) null).mo26649b();
            } else {
                if (i == f98856e) {
                    C42791i iVar = this.f98860g;
                    if (iVar != null) {
                        iVar.mo104432a(this.f98859b, this.f98862i);
                    }
                }
            }
        }
    }

    public C37962ad(Activity activity, String str) {
        C7573i.m23587b(activity, "mContext");
        C7573i.m23587b(str, "effectId");
        this.f98859b = activity;
        this.f98862i = str;
    }
}
