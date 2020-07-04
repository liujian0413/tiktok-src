package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40427a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40427a.C40428a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40429b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40453c;
import com.p280ss.android.vesdk.C45333p;
import com.p280ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b */
public final class C40437b implements IDetectImageResultListener {

    /* renamed from: f */
    public static final C40438a f105132f = new C40438a(null);

    /* renamed from: a */
    public Handler f105133a;

    /* renamed from: b */
    public C40453c f105134b;

    /* renamed from: c */
    public String f105135c;

    /* renamed from: d */
    public C45333p f105136d = new C45333p();

    /* renamed from: e */
    public int f105137e;

    /* renamed from: g */
    private Handler f105138g;

    /* renamed from: h */
    private final HandlerThread f105139h = new HandlerThread("pixaloop_work");

    /* renamed from: i */
    private String f105140i;

    /* renamed from: j */
    private int f105141j;

    /* renamed from: k */
    private int f105142k;

    /* renamed from: l */
    private boolean f105143l = true;

    /* renamed from: m */
    private final ArrayList<C40429b> f105144m = new ArrayList<>();

    /* renamed from: n */
    private String f105145n;

    /* renamed from: o */
    private C20749b f105146o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b$a */
    public static final class C40438a {
        private C40438a() {
        }

        public /* synthetic */ C40438a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b$b */
    public static final class C40439b extends Handler {

        /* renamed from: a */
        final /* synthetic */ C40437b f105147a;

        public final void handleMessage(Message message) {
            C7573i.m23587b(message, "msg");
            if (message.what == 1001) {
                Message obtain = Message.obtain();
                obtain.obj = C40426a.f105087a.mo100447g();
                obtain.what = 1001;
                Handler handler = this.f105147a.f105133a;
                if (handler == null) {
                    C7573i.m23580a();
                }
                handler.sendMessage(obtain);
                return;
            }
            if (message.what == 1004) {
                Bundle data = message.getData();
                ArrayList stringArrayList = data.getStringArrayList("img_list");
                ArrayList stringArrayList2 = data.getStringArrayList("alg_list");
                if (!C23477d.m77081a((Collection<T>) stringArrayList) && !C23477d.m77081a((Collection<T>) stringArrayList2)) {
                    C45333p pVar = this.f105147a.f105136d;
                    String str = this.f105147a.f105135c;
                    if (str == null) {
                        C7573i.m23580a();
                    }
                    if (stringArrayList == null) {
                        C7573i.m23580a();
                    }
                    List list = stringArrayList;
                    if (stringArrayList2 == null) {
                        C7573i.m23580a();
                    }
                    pVar.mo108545a(str, list, (List<String>) stringArrayList2, (IDetectImageResultListener) this.f105147a);
                }
            }
        }

        C40439b(C40437b bVar, Looper looper) {
            this.f105147a = bVar;
            super(looper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b$c */
    public static final class C40440c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C40437b f105148a;

        public final void handleMessage(Message message) {
            C7573i.m23587b(message, "msg");
            if (message.what == 1001) {
                ArrayList arrayList = new ArrayList();
                if (message.obj != null) {
                    Object obj = message.obj;
                    if (obj != null) {
                        arrayList = (ArrayList) obj;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    }
                }
                C40453c cVar = this.f105148a.f105134b;
                if (cVar != null) {
                    cVar.mo100443a((List<String>) arrayList);
                }
            } else if (message.what == 1002) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    C40429b bVar = (C40429b) obj2;
                    if (this.f105148a.f105135c != null && !(!C7573i.m23585a((Object) this.f105148a.f105135c, (Object) bVar.f105105d))) {
                        this.f105148a.mo100467a(bVar);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.data.PixaloopData");
                }
            }
        }

        C40440c(C40437b bVar, Looper looper) {
            this.f105148a = bVar;
            super(looper);
        }
    }

    /* renamed from: b */
    public final void mo100471b() {
        Handler handler = this.f105138g;
        if (handler == null) {
            C7573i.m23583a("workHandler");
        }
        handler.sendEmptyMessage(1001);
    }

    /* renamed from: e */
    private final void m129319e() {
        C40453c cVar = this.f105134b;
        if (cVar != null) {
            cVar.mo100444b(this.f105144m);
        }
        this.f105144m.clear();
    }

    /* renamed from: a */
    public final void mo100464a() {
        if (VERSION.SDK_INT >= 18) {
            this.f105139h.quitSafely();
        }
        Handler handler = this.f105133a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: c */
    public final void mo100472c() {
        this.f105145n = null;
        this.f105141j = 0;
        this.f105143l = true;
        this.f105142k = 0;
        this.f105144m.clear();
    }

    public C40437b() {
        m129318d();
    }

    /* renamed from: d */
    private final void m129318d() {
        this.f105139h.start();
        this.f105138g = new C40439b(this, this.f105139h.getLooper());
        this.f105133a = new C40440c(this, Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo100465a(long j) {
        this.f105136d.mo108543a();
    }

    /* renamed from: a */
    public final void mo100466a(C20749b bVar) {
        C7573i.m23587b(bVar, "effectController");
        this.f105146o = bVar;
    }

    /* renamed from: a */
    public final void mo100468a(C40453c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f105134b = cVar;
    }

    /* renamed from: a */
    public final void mo100467a(C40429b bVar) {
        boolean z;
        boolean z2;
        if (this.f105142k <= this.f105141j) {
            this.f105142k++;
            if (C7573i.m23585a((Object) C40428a.m129289a(), (Object) this.f105140i)) {
                if (!this.f105143l) {
                    if (bVar == null) {
                        C7573i.m23580a();
                    }
                    if (!bVar.f105104c) {
                        z2 = false;
                        this.f105143l = z2;
                    }
                }
                z2 = true;
                this.f105143l = z2;
            } else {
                if (this.f105143l) {
                    if (bVar == null) {
                        C7573i.m23580a();
                    }
                    if (bVar.f105104c) {
                        z = true;
                        this.f105143l = z;
                    }
                }
                z = false;
                this.f105143l = z;
            }
            if (this.f105142k == this.f105141j) {
                if (bVar == null) {
                    C7573i.m23580a();
                }
                bVar.f105104c = this.f105143l;
                C40453c cVar = this.f105134b;
                if (cVar != null) {
                    cVar.mo100442a(bVar);
                }
                if (bVar.f105104c) {
                    this.f105144m.add(bVar);
                }
                this.f105142k = 0;
                this.f105143l = true;
                if (!TextUtils.isEmpty(bVar.f105102a) && C7573i.m23585a((Object) bVar.f105102a, (Object) this.f105145n)) {
                    m129319e();
                }
            }
        }
        this.f105137e++;
    }

    /* renamed from: a */
    public final void mo100469a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "path");
        C20749b bVar = this.f105146o;
        if (bVar != null) {
            bVar.mo56078b(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo100470a(List<String> list, C40429b bVar) {
        C40427a aVar;
        C7573i.m23587b(list, "imgList");
        this.f105137e = 0;
        if (bVar != null) {
            aVar = bVar.f105108g;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            m129319e();
        } else if (!C23477d.m77081a((Collection<T>) list) || !C23477d.m77081a((Collection<T>) bVar.mo100450b())) {
            mo100472c();
            Handler handler = this.f105133a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.f105138g;
            if (handler2 == null) {
                C7573i.m23583a("workHandler");
            }
            handler2.removeCallbacksAndMessages(null);
            this.f105145n = (String) list.get(list.size() - 1);
            this.f105135c = bVar.f105105d;
            this.f105141j = bVar.mo100450b().size();
            this.f105140i = bVar.f105108g.f105100c;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("img_list", (ArrayList) list);
            String str = "alg_list";
            List b = bVar.mo100450b();
            if (b != null) {
                bundle.putStringArrayList(str, (ArrayList) b);
                C7573i.m23582a((Object) obtain, "message");
                obtain.setData(bundle);
                obtain.what = LiveRoomStruct.ROOM_LONGTIME_NO_NET;
                Handler handler3 = this.f105138g;
                if (handler3 == null) {
                    C7573i.m23583a("workHandler");
                }
                handler3.sendMessage(obtain);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        } else {
            m129319e();
        }
    }

    public final void onDetectResult(String str, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "stickerId");
        C7573i.m23587b(str2, "path");
        C7573i.m23587b(str3, "scanAlgorithm");
        if (this.f105135c != null && !(!C7573i.m23585a((Object) this.f105135c, (Object) str))) {
            Message obtain = Message.obtain();
            C40429b bVar = new C40429b(str2, str3, z);
            bVar.f105105d = str;
            obtain.obj = bVar;
            obtain.what = 1002;
            if (this.f105133a != null) {
                Handler handler = this.f105133a;
                if (handler == null) {
                    C7573i.m23580a();
                }
                handler.sendMessage(obtain);
            }
        }
    }
}
