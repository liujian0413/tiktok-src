package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1598d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Handler;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.support.p029v7.widget.ViewStubCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.adapter.PixaloopMattingAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40429b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1596b.C40441a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1596b.C40442b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1596b.C40442b.C40443a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40452b;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c */
public final class C40457c {

    /* renamed from: d */
    public static final C40459a f105173d = new C40459a(null);

    /* renamed from: a */
    public C40454a f105174a;

    /* renamed from: b */
    public boolean f105175b = true;

    /* renamed from: c */
    public final Activity f105176c;

    /* renamed from: e */
    private final View f105177e;

    /* renamed from: f */
    private final RecyclerView f105178f;

    /* renamed from: g */
    private final View f105179g;

    /* renamed from: h */
    private final PixaloopMattingAdapter f105180h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c$a */
    public static final class C40459a {
        private C40459a() {
        }

        public /* synthetic */ C40459a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c$b */
    static final class C40460b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40457c f105182a;

        C40460b(C40457c cVar) {
            this.f105182a = cVar;
        }

        public final void run() {
            if (this.f105182a.f105176c != null && !this.f105182a.f105176c.isFinishing() && this.f105182a.f105175b) {
                try {
                    C40454a aVar = this.f105182a.f105174a;
                    if (aVar == null) {
                        C7573i.m23580a();
                    }
                    aVar.show();
                    this.f105182a.f105175b = false;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo100499b() {
        this.f105177e.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo100500c() {
        this.f105177e.setVisibility(8);
    }

    /* renamed from: i */
    private final boolean m129370i() {
        if (this.f105176c == null || this.f105176c.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo100492a() {
        PixaloopMattingAdapter pixaloopMattingAdapter = this.f105180h;
        if (pixaloopMattingAdapter == null) {
            C7573i.m23580a();
        }
        return pixaloopMattingAdapter.mo100453a();
    }

    /* renamed from: d */
    public final void mo100501d() {
        PixaloopMattingAdapter pixaloopMattingAdapter = this.f105180h;
        if (pixaloopMattingAdapter == null) {
            C7573i.m23580a();
        }
        pixaloopMattingAdapter.mo100457b();
    }

    /* renamed from: f */
    public final void mo100503f() {
        if (this.f105180h != null) {
            this.f105180h.mo100459d();
            this.f105180h.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public final void mo100504g() {
        PixaloopMattingAdapter pixaloopMattingAdapter = this.f105180h;
        if (pixaloopMattingAdapter == null) {
            C7573i.m23580a();
        }
        pixaloopMattingAdapter.mo100460e();
        this.f105180h.notifyDataSetChanged();
    }

    /* renamed from: e */
    public final void mo100502e() {
        if (this.f105180h != null) {
            this.f105180h.mo100458c();
            this.f105180h.notifyItemRemoved(this.f105180h.getItemCount());
        }
    }

    /* renamed from: h */
    public final void mo100505h() {
        this.f105175b = true;
        if (this.f105174a != null) {
            C40454a aVar = this.f105174a;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.isShowing()) {
                C40454a aVar2 = this.f105174a;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo100493a(int i) {
        this.f105178f.mo5541b(0);
    }

    /* renamed from: a */
    public final void mo100495a(C40429b bVar) {
        if (bVar != null) {
            PixaloopMattingAdapter pixaloopMattingAdapter = this.f105180h;
            if (pixaloopMattingAdapter == null) {
                C7573i.m23580a();
            }
            pixaloopMattingAdapter.mo100454a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo100494a(Handler handler) {
        if (handler != null && m129370i()) {
            if (this.f105174a == null) {
                Activity activity = this.f105176c;
                if (activity == null) {
                    C7573i.m23580a();
                }
                this.f105174a = new C40454a(activity);
            }
            C40454a aVar = this.f105174a;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (!aVar.isShowing()) {
                handler.postDelayed(new C40460b(this), 300);
            }
        }
    }

    /* renamed from: a */
    public final void mo100496a(String str) {
        PixaloopMattingAdapter pixaloopMattingAdapter = this.f105180h;
        if (pixaloopMattingAdapter == null) {
            C7573i.m23580a();
        }
        pixaloopMattingAdapter.mo100455a(str);
    }

    /* renamed from: a */
    public final void mo100497a(List<C40429b> list) {
        C7573i.m23587b(list, "dataList");
        if (!C23477d.m77081a((Collection<T>) list)) {
            PixaloopMattingAdapter pixaloopMattingAdapter = this.f105180h;
            if (pixaloopMattingAdapter == null) {
                C7573i.m23580a();
            }
            pixaloopMattingAdapter.mo100456a(list);
        }
    }

    /* renamed from: a */
    public final boolean mo100498a(FaceStickerBean faceStickerBean, OnDismissListener onDismissListener, Handler handler) {
        C7573i.m23587b(faceStickerBean, "faceStickerBean");
        C7573i.m23587b(onDismissListener, "onDismissListener");
        C7573i.m23587b(handler, "handler");
        if (!C40443a.m129343a(faceStickerBean) || !m129370i()) {
            return false;
        }
        C40441a aVar = new C40441a();
        aVar.mo100477a(C40426a.m129276a());
        aVar.mo100476a(faceStickerBean);
        Activity activity = this.f105176c;
        if (activity == null) {
            C7573i.m23580a();
        }
        C40442b bVar = new C40442b(activity, faceStickerBean, aVar);
        bVar.mo100480a(handler);
        bVar.setOnDismissListener(onDismissListener);
        if (m129370i()) {
            try {
                bVar.show();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public C40457c(ViewStubCompat viewStubCompat, Activity activity, String str, final C40452b bVar) {
        C7573i.m23587b(viewStubCompat, "faceViewStub");
        C7573i.m23587b(str, "panel");
        this.f105176c = activity;
        View a = viewStubCompat.mo6224a();
        C7573i.m23582a((Object) a, "faceViewStub.inflate()");
        this.f105177e = a;
        View findViewById = this.f105177e.findViewById(R.id.bjj);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.layout_rv_face_matting)");
        this.f105178f = (RecyclerView) findViewById;
        this.f105178f.setLayoutManager(new LinearLayoutManager(this.f105178f.getContext(), 0, false));
        View findViewById2 = this.f105177e.findViewById(R.id.bc0);
        C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.iv_select)");
        this.f105179g = findViewById2;
        this.f105179g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C40452b bVar = bVar;
                if (bVar != null) {
                    bVar.mo100414a();
                }
            }
        });
        Context context = viewStubCompat.getContext();
        C7573i.m23582a((Object) context, "faceViewStub.context");
        this.f105180h = new PixaloopMattingAdapter(context, str, bVar);
        this.f105178f.setAdapter(this.f105180h);
        C1267f itemAnimator = this.f105178f.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            this.f105177e.setVisibility(8);
            if (m129370i()) {
                Activity activity2 = this.f105176c;
                if (activity2 == null) {
                    C7573i.m23580a();
                }
                this.f105174a = new C40454a(activity2);
            }
            ImageView imageView = (ImageView) this.f105177e.findViewById(R.id.d2a);
            if (C6399b.m19946v()) {
                imageView.setColorFilter(-535422941);
            } else {
                imageView.setColorFilter(-1);
            }
            if (C40881d.m130626a(str)) {
                imageView.setColorFilter(-1);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }
}
