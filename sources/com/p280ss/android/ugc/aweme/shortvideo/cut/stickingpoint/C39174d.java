package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C39221a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C39221a.C39222a;
import com.p280ss.android.vesdk.VEListener.C45209e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d */
public final class C39174d {

    /* renamed from: d */
    public static final C39175a f101533d = new C39175a(null);

    /* renamed from: a */
    public C15389d f101534a;

    /* renamed from: b */
    public List<? extends VideoSegment> f101535b;

    /* renamed from: c */
    public final C39179e f101536c = new C39179e(this, Looper.getMainLooper());

    /* renamed from: e */
    private int f101537e;

    /* renamed from: f */
    private VideoSegment f101538f;

    /* renamed from: g */
    private int f101539g;

    /* renamed from: h */
    private C39176b f101540h;

    /* renamed from: i */
    private C39221a f101541i;

    /* renamed from: j */
    private Activity f101542j;

    /* renamed from: k */
    private float f101543k;

    /* renamed from: l */
    private float f101544l;

    /* renamed from: m */
    private boolean f101545m;

    /* renamed from: n */
    private final HashSet<String> f101546n = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$a */
    public static final class C39175a {
        private C39175a() {
        }

        public /* synthetic */ C39175a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$b */
    public interface C39176b {
        /* renamed from: a */
        void mo97285a();

        /* renamed from: a */
        void mo97286a(boolean z, boolean z2, boolean z3);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$c */
    static final class C39177c implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C39174d f101547a;

        C39177c(C39174d dVar) {
            this.f101547a = dVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f101547a.mo97452a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$d */
    public static final class C39178d implements C39222a {

        /* renamed from: a */
        final /* synthetic */ C39174d f101548a;

        /* renamed from: a */
        public final void mo97462a() {
            this.f101548a.mo97457a(false, true, false);
            if (!C6292i.m19525a(this.f101548a.f101535b)) {
                C39193g.f101577a.mo97486c(this.f101548a.f101535b);
            }
        }

        C39178d(C39174d dVar) {
            this.f101548a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$e */
    public static final class C39179e extends Handler {

        /* renamed from: a */
        final /* synthetic */ C39174d f101549a;

        public final void handleMessage(Message message) {
            C7573i.m23587b(message, "msg");
            if (message.what == 1001) {
                C39174d dVar = this.f101549a;
                Object obj = message.obj;
                if (obj != null) {
                    dVar.mo97459b(((Float) obj).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            if (message.what == 1002) {
                C39174d dVar2 = this.f101549a;
                Object obj2 = message.obj;
                if (obj2 != null) {
                    dVar2.mo97453a(((Float) obj2).floatValue());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
        }

        C39179e(C39174d dVar, Looper looper) {
            this.f101549a = dVar;
            super(looper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$f */
    static final class C39180f implements C45209e {

        /* renamed from: a */
        final /* synthetic */ C39174d f101550a;

        C39180f(C39174d dVar) {
            this.f101550a = dVar;
        }

        /* renamed from: a */
        public final void mo97464a(float f) {
            Message obtain = Message.obtain();
            obtain.what = 1001;
            obtain.obj = Float.valueOf(f);
            this.f101550a.f101536c.sendMessage(obtain);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.d$g */
    static final class C39181g implements C45209e {

        /* renamed from: a */
        final /* synthetic */ C39174d f101551a;

        C39181g(C39174d dVar) {
            this.f101551a = dVar;
        }

        /* renamed from: a */
        public final void mo97464a(float f) {
            Message obtain = Message.obtain();
            obtain.what = 1002;
            obtain.obj = Float.valueOf(f);
            this.f101551a.f101536c.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    public final void mo97460b(List<? extends VideoSegment> list) {
    }

    /* renamed from: b */
    private final void m125073b() {
        if (!this.f101545m) {
            C15389d dVar = this.f101534a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            dVar.mo38761a(this.f101539g, 1, true, (C45209e) new C39180f(this));
        }
    }

    /* renamed from: c */
    private final void m125074c() {
        C15389d dVar = this.f101534a;
        if (dVar == null) {
            C7573i.m23580a();
        }
        dVar.mo38761a(this.f101539g, 1, true, (C45209e) new C39181g(this));
    }

    /* renamed from: e */
    private final void m125076e() {
        if (this.f101541i != null) {
            C39221a aVar = this.f101541i;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.isShowing()) {
                C39221a aVar2 = this.f101541i;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.dismiss();
            }
        }
    }

    /* renamed from: d */
    private final void m125075d() {
        if (this.f101542j != null) {
            Activity activity = this.f101542j;
            if (activity == null) {
                C7573i.m23580a();
            }
            if (!activity.isFinishing() && this.f101541i != null) {
                C39221a aVar = this.f101541i;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                if (!aVar.isShowing()) {
                    try {
                        C39221a aVar2 = this.f101541i;
                        if (aVar2 == null) {
                            C7573i.m23580a();
                        }
                        aVar2.show();
                        m125072a(0);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97452a() {
        this.f101545m = true;
        if (this.f101534a != null) {
            C15389d dVar = this.f101534a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            dVar.mo38864n(this.f101539g);
        }
        this.f101536c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo97455a(C39176b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f101540h = bVar;
    }

    /* renamed from: a */
    public final boolean mo97458a(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return false;
        }
        return this.f101546n.contains(videoSegment.mo96896a(false));
    }

    /* renamed from: a */
    private final void m125072a(int i) {
        if (this.f101541i != null) {
            C39221a aVar = this.f101541i;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.isShowing()) {
                C39221a aVar2 = this.f101541i;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.mo97549a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo97453a(float f) {
        if (f >= 1.0f) {
            if (this.f101538f != null) {
                VideoSegment videoSegment = this.f101538f;
                if (videoSegment == null) {
                    C7573i.m23580a();
                }
                videoSegment.f100776r = true;
            }
            this.f101537e++;
            int i = this.f101537e;
            List<? extends VideoSegment> list = this.f101535b;
            if (list == null) {
                C7573i.m23580a();
            }
            if (i < list.size()) {
                List<? extends VideoSegment> list2 = this.f101535b;
                if (list2 == null) {
                    C7573i.m23580a();
                }
                this.f101538f = (VideoSegment) list2.get(this.f101537e);
                if (this.f101538f != null) {
                    VideoSegment videoSegment2 = this.f101538f;
                    if (videoSegment2 == null) {
                        C7573i.m23580a();
                    }
                    this.f101539g = videoSegment2.f100759a;
                    m125074c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97454a(Activity activity) {
        this.f101542j = activity;
        if (activity != null && !activity.isFinishing()) {
            this.f101541i = new C39221a(activity);
            C39221a aVar = this.f101541i;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.setCancelable(true);
            C39221a aVar2 = this.f101541i;
            if (aVar2 == null) {
                C7573i.m23580a();
            }
            aVar2.setMessage(activity.getResources().getString(R.string.e25));
            C39221a aVar3 = this.f101541i;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            aVar3.mo97549a(0);
            C39221a aVar4 = this.f101541i;
            if (aVar4 == null) {
                C7573i.m23580a();
            }
            aVar4.setOnDismissListener(new C39177c(this));
            C39221a aVar5 = this.f101541i;
            if (aVar5 == null) {
                C7573i.m23580a();
            }
            aVar5.mo97550a((C39222a) new C39178d(this));
        }
    }

    /* renamed from: b */
    public final void mo97459b(float f) {
        if (f >= 1.0f) {
            if (this.f101538f != null) {
                VideoSegment videoSegment = this.f101538f;
                if (videoSegment == null) {
                    C7573i.m23580a();
                }
                videoSegment.f100776r = true;
                HashSet<String> hashSet = this.f101546n;
                VideoSegment videoSegment2 = this.f101538f;
                if (videoSegment2 == null) {
                    C7573i.m23580a();
                }
                hashSet.add(videoSegment2.mo96896a(false));
            }
            this.f101537e++;
            this.f101544l = this.f101543k * ((float) this.f101537e);
            int i = this.f101537e;
            List<? extends VideoSegment> list = this.f101535b;
            if (list == null) {
                C7573i.m23580a();
            }
            if (i >= list.size()) {
                mo97457a(true, false, true);
                return;
            }
            List<? extends VideoSegment> list2 = this.f101535b;
            if (list2 == null) {
                C7573i.m23580a();
            }
            this.f101538f = (VideoSegment) list2.get(this.f101537e);
            if (this.f101538f == null) {
                mo97457a(false, false, false);
                return;
            }
            VideoSegment videoSegment3 = this.f101538f;
            if (videoSegment3 == null) {
                C7573i.m23580a();
            }
            this.f101539g = videoSegment3.f100759a;
            m125073b();
            return;
        }
        float f2 = (f * this.f101543k) + this.f101544l;
        if (this.f101540h != null && this.f101540h == null) {
            C7573i.m23580a();
        }
        int i2 = (int) (f2 * 100.0f);
        if (i2 >= 100) {
            i2 = 100;
        }
        m125072a(i2);
    }

    /* renamed from: a */
    public final void mo97456a(List<? extends VideoSegment> list) {
        this.f101545m = false;
        C39176b bVar = this.f101540h;
        if (bVar != null) {
            bVar.mo97285a();
        }
        if (C6292i.m19525a(list)) {
            mo97457a(true, false, false);
        } else if (this.f101534a == null) {
            mo97457a(false, false, false);
        } else {
            mo97452a();
            this.f101545m = false;
            this.f101544l = 0.0f;
            if (list == null) {
                C7573i.m23580a();
            }
            this.f101543k = 1.0f / ((float) list.size());
            this.f101537e = 0;
            this.f101535b = list;
            this.f101538f = (VideoSegment) list.get(0);
            VideoSegment videoSegment = this.f101538f;
            if (videoSegment == null) {
                C7573i.m23580a();
            }
            this.f101539g = videoSegment.f100759a;
            m125075d();
            m125073b();
        }
    }

    /* renamed from: a */
    public final void mo97457a(boolean z, boolean z2, boolean z3) {
        m125076e();
        if (this.f101540h != null) {
            if (this.f101545m) {
                C39176b bVar = this.f101540h;
                if (bVar == null) {
                    C7573i.m23580a();
                }
                bVar.mo97286a(false, z2, z3);
                return;
            }
            C39176b bVar2 = this.f101540h;
            if (bVar2 == null) {
                C7573i.m23580a();
            }
            bVar2.mo97286a(z, z2, z3);
        }
    }
}
