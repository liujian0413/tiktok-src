package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.p1583a.C40093a;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a */
public final class C40154a {

    /* renamed from: a */
    public C40161f f104364a;

    /* renamed from: b */
    public C0052o<Bitmap> f104365b;

    /* renamed from: c */
    public C0052o<Boolean> f104366c;

    /* renamed from: d */
    private List<Bitmap> f104367d;

    /* renamed from: e */
    private int f104368e;

    /* renamed from: f */
    private C15389d f104369f;

    /* renamed from: g */
    private int[] f104370g;

    /* renamed from: h */
    private int f104371h;

    /* renamed from: i */
    private C45329l f104372i;

    /* renamed from: j */
    private Handler f104373j;

    /* renamed from: k */
    private HandlerThread f104374k;

    /* renamed from: l */
    private Handler f104375l;

    /* renamed from: m */
    private C41654d f104376m;

    /* renamed from: n */
    private int f104377n;

    /* renamed from: o */
    private int f104378o;

    /* renamed from: p */
    private boolean f104379p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a$a */
    static class C40156a extends Handler {

        /* renamed from: a */
        private WeakReference<C40154a> f104381a;

        C40156a(C40154a aVar) {
            this.f104381a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            if (this.f104381a.get() != null) {
                if (message.what == 1002) {
                    List list = (List) message.obj;
                    if (((C40154a) this.f104381a.get()).f104364a != null) {
                        ((C40154a) this.f104381a.get()).f104364a.mo70479a(list);
                        if (!C23477d.m77081a((Collection<T>) list) && list.get(0) != null) {
                            if (((C40154a) this.f104381a.get()).f104366c != null) {
                                ((C40154a) this.f104381a.get()).f104366c.setValue(Boolean.valueOf(true));
                            }
                            if (((C40154a) this.f104381a.get()).f104365b != null) {
                                ((C40154a) this.f104381a.get()).f104365b.setValue(list.get(0));
                            }
                        }
                    }
                    return;
                }
                if (message.what == 1003) {
                    ((C40154a) this.f104381a.get()).mo99902a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99906a(String str, C15389d dVar, C40093a aVar, int i, int i2, float f, String str2) {
        if (i == 4101 && !this.f104379p) {
            this.f104379p = true;
            C1592h.m7853a((Callable<TResult>) new C40159d<TResult>(this, str)).mo6876a((C1591g<TResult, TContinuationResult>) new C40160e<TResult,TContinuationResult>(this, dVar, aVar), C1592h.f5958b);
        }
    }

    /* renamed from: b */
    private Bitmap m128300b() {
        Bitmap bitmap;
        if (this.f104369f == null) {
            return null;
        }
        if (this.f104377n == 0) {
            bitmap = this.f104369f.mo38835d();
        } else {
            bitmap = this.f104369f.mo38794a(this.f104377n);
        }
        return bitmap;
    }

    public C40154a() {
        this.f104367d = new ArrayList();
        this.f104368e = 7;
        this.f104374k = new HandlerThread("mv_cover_creator");
        this.f104374k.start();
        this.f104373j = new Handler(this.f104374k.getLooper()) {
            public final void handleMessage(Message message) {
                C40154a.this.mo99905a(message);
            }
        };
        this.f104375l = new C40156a(this);
    }

    /* renamed from: a */
    public final void mo99902a() {
        if (this.f104364a != null) {
            this.f104364a.mo70479a(this.f104367d);
        }
        if (this.f104369f != null) {
            this.f104369f.mo38763a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
        if (!(this.f104369f == null || this.f104372i == null)) {
            this.f104369f.mo38831c(this.f104372i);
        }
        if (this.f104374k != null && VERSION.SDK_INT >= 18) {
            this.f104374k.quitSafely();
        }
        if (this.f104376m != null) {
            this.f104376m.dismiss();
        }
        if (this.f104366c != null) {
            this.f104366c.setValue(Boolean.valueOf(false));
        }
        this.f104364a = null;
    }

    /* renamed from: a */
    public final C40154a mo99899a(C0052o<Bitmap> oVar) {
        this.f104365b = oVar;
        return this;
    }

    /* renamed from: b */
    public final C40154a mo99907b(C0052o<Boolean> oVar) {
        this.f104366c = oVar;
        return this;
    }

    /* renamed from: a */
    private boolean m128299a(Context context) {
        if (context == null) {
            this.f104375l.sendEmptyMessage(1003);
            return false;
        }
        if (context instanceof Activity) {
            if (((Activity) context).isFinishing()) {
                this.f104375l.sendEmptyMessage(1003);
                return false;
            }
        } else if (((Activity) context).isFinishing()) {
            this.f104375l.sendEmptyMessage(1003);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo99901a(String str) throws Exception {
        Bitmap b = m128300b();
        if (b != null) {
            C42341f.m134636a(b, new File(str), 60, CompressFormat.PNG);
            C42341f.m134634a(b);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo99905a(Message message) {
        if (message.what != 1001) {
            this.f104375l.sendEmptyMessage(1003);
        } else if (this.f104371h >= this.f104368e) {
            if (this.f104371h == this.f104368e) {
                this.f104367d.add(m128300b());
            }
            this.f104375l.sendEmptyMessage(1003);
        } else if (this.f104369f == null) {
            this.f104375l.sendEmptyMessage(1003);
        } else {
            int i = this.f104370g[this.f104371h];
            Bitmap b = m128300b();
            this.f104367d.add(b);
            if (this.f104367d.size() == 1) {
                ArrayList arrayList = new ArrayList(this.f104368e);
                for (int i2 = 0; i2 < this.f104368e; i2++) {
                    arrayList.add(b);
                }
                Message message2 = new Message();
                message2.obj = arrayList;
                message2.what = 1002;
                this.f104375l.sendMessage(message2);
            }
            this.f104369f.mo38763a(i, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: a */
    public final C40154a mo99898a(int i, int i2) {
        this.f104377n = i;
        this.f104378o = i2;
        return this;
    }

    /* renamed from: b */
    private static int[] m128301b(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo99900a(C15389d dVar, C40093a aVar, C1592h hVar) throws Exception {
        if (!(dVar == null || this.f104372i == null)) {
            dVar.mo38831c(this.f104372i);
        }
        if (aVar != null) {
            aVar.mo96653a();
        }
        return null;
    }

    public C40154a(C15389d dVar, String str, int i, C40093a aVar) {
        this.f104367d = new ArrayList();
        this.f104368e = 7;
        if (dVar == null) {
            C42880h.m136156a("MvChooseCoverBitmap veEditor is null");
        } else if (TextUtils.isEmpty(str)) {
            C42880h.m136156a("MvChooseCoverBitmap imgPath is null");
        } else {
            this.f104369f = dVar;
            try {
                if (C7276d.m22812b(str)) {
                    C13380c.m39172c().mo33181b(Uri.fromFile(new File(str)));
                    new File(str).delete();
                }
                this.f104372i = new C40157b(this, str, dVar, aVar);
                dVar.mo38880w();
                dVar.mo38824b(this.f104372i);
                int a = dVar.mo38763a(i, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                if (a != 0) {
                    StringBuilder sb = new StringBuilder("MvChooseCoverBitmap start time ");
                    sb.append(i);
                    sb.append(", seek error ");
                    sb.append(a);
                    C42880h.m136156a(sb.toString());
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("MvChooseCoverBitmap exception");
                sb2.append(e.toString());
                C42880h.m136156a(sb2.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99903a(int i, int i2, float f, String str) {
        if (i == 4101) {
            if (this.f104371h >= this.f104368e) {
                this.f104375l.sendEmptyMessage(1003);
            } else {
                this.f104371h++;
                this.f104373j.sendEmptyMessage(1001);
            }
        }
    }

    /* renamed from: a */
    public final void mo99904a(Context context, C15389d dVar, int i, C40161f fVar) {
        if (m128299a(context)) {
            this.f104376m = C41654d.m132586b(context, context.getString(R.string.dy2));
            this.f104376m.setIndeterminate(true);
            this.f104364a = fVar;
            this.f104368e = i;
            this.f104369f = dVar;
            if (dVar == null) {
                this.f104375l.sendEmptyMessage(1003);
                return;
            }
            this.f104370g = m128301b(dVar.mo38860l(), this.f104368e);
            this.f104372i = new C40158c(this);
            dVar.mo38880w();
            dVar.mo38824b(this.f104372i);
            dVar.mo38763a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }
}
