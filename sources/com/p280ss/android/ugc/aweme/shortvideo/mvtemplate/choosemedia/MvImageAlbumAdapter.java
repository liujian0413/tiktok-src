package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter */
public class MvImageAlbumAdapter extends C1262a<C40111c> implements OnClickListener {

    /* renamed from: a */
    public C40112d f104246a;

    /* renamed from: b */
    private ArrayList<C40109a> f104247b = new ArrayList<>();

    /* renamed from: c */
    private HashMap<String, C40109a> f104248c;

    /* renamed from: d */
    private int f104249d;

    /* renamed from: e */
    private Context f104250e;

    /* renamed from: f */
    private LayoutInflater f104251f;

    /* renamed from: g */
    private C40110b f104252g;

    /* renamed from: h */
    private C40109a f104253h = null;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a */
    class C40109a {

        /* renamed from: a */
        String f104254a = "";

        /* renamed from: b */
        List<MyMediaModel> f104255b = new ArrayList();

        /* renamed from: c */
        List<MyMediaModel> f104256c = new ArrayList();

        /* renamed from: a */
        public final int mo99844a() {
            return this.f104255b.size() + this.f104256c.size();
        }

        C40109a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$b */
    public interface C40110b {
        /* renamed from: a */
        void mo99813a(C40109a aVar, boolean z, int i, boolean z2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$c */
    class C40111c extends C1293v {

        /* renamed from: a */
        View f104258a;

        /* renamed from: b */
        AnimatedImageView f104259b;

        /* renamed from: c */
        TextView f104260c;

        /* renamed from: d */
        TextView f104261d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo99845a(C40109a aVar) {
            MediaModel mediaModel;
            int i;
            this.f104258a.setTag(aVar);
            this.f104260c.setText(aVar.f104254a);
            this.f104261d.setText(String.valueOf(aVar.f104255b.size() + aVar.f104256c.size()));
            if (aVar.f104255b.size() != 0 || aVar.f104256c.size() != 0) {
                if (C6311g.m19573a(aVar.f104255b)) {
                    mediaModel = (MediaModel) aVar.f104256c.get(0);
                } else {
                    mediaModel = (MediaModel) aVar.f104255b.get(0);
                }
                if (mediaModel != null && C7276d.m22812b(mediaModel.f88156b)) {
                    if (this.f104259b.getLayoutParams().width > 0) {
                        i = this.f104259b.getLayoutParams().width;
                    } else {
                        i = -1;
                    }
                    C23323e.m76516a((RemoteImageView) this.f104259b, Uri.fromFile(new File(mediaModel.f88156b)).toString(), i, i, Config.ARGB_4444);
                }
            }
        }

        C40111c(View view, AnimatedImageView animatedImageView, TextView textView, TextView textView2) {
            super(view);
            this.f104258a = view;
            this.f104259b = animatedImageView;
            this.f104260c = textView;
            this.f104261d = textView2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$d */
    public interface C40112d {
        /* renamed from: a */
        void mo99846a(int i);
    }

    public int getItemCount() {
        return this.f104247b.size();
    }

    /* renamed from: a */
    private C40109a m128204a() {
        if (this.f104247b.size() > 0) {
            return (C40109a) this.f104247b.get(0);
        }
        return null;
    }

    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40109a aVar = (C40109a) view.getTag();
        if (this.f104252g != null) {
            this.f104252g.mo99813a(aVar, true, this.f104249d, true);
            this.f104253h = aVar;
        }
    }

    /* renamed from: a */
    private void m128206a(int i) {
        Iterator it = this.f104247b.iterator();
        while (it.hasNext()) {
            C40109a aVar = (C40109a) it.next();
            if (i == 4) {
                aVar.f104256c.clear();
            } else if (i == 3) {
                aVar.f104255b.clear();
            }
            if (aVar.mo99844a() == 0) {
                it.remove();
                this.f104248c.remove(aVar.f104254a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C40111c cVar, int i) {
        cVar.mo99845a((C40109a) this.f104247b.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C40111c onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.f104251f.inflate(R.layout.zr, viewGroup, false);
        C40111c cVar = new C40111c(inflate, (AnimatedImageView) inflate.findViewById(R.id.b_a), (TextView) inflate.findViewById(R.id.ayf), (TextView) inflate.findViewById(R.id.ay_));
        inflate.setOnClickListener(this);
        return cVar;
    }

    public MvImageAlbumAdapter(Context context, C40110b bVar) {
        this.f104250e = context;
        this.f104251f = LayoutInflater.from(context);
        this.f104252g = bVar;
        C40109a aVar = new C40109a();
        aVar.f104254a = this.f104250e.getResources().getString(R.string.hs);
        this.f104247b.add(aVar);
        this.f104248c = new HashMap<>();
        Iterator it = this.f104247b.iterator();
        while (it.hasNext()) {
            C40109a aVar2 = (C40109a) it.next();
            this.f104248c.put(aVar2.f104254a, aVar2);
        }
    }

    /* renamed from: a */
    private static void m128207a(C40109a aVar, MyMediaModel myMediaModel, int i) {
        if (myMediaModel != null) {
            if (i == 4) {
                aVar.f104256c.add(myMediaModel);
                return;
            }
            if (i == 3) {
                aVar.f104255b.add(myMediaModel);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel>, for r10v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ android.util.Pair mo99840a(boolean r8, int r9, java.util.List<com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel> r10) throws java.lang.Exception {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0005
            r7.m128206a(r9)
        L_0x0005:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a> r8 = r7.f104247b
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a r8 = (com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter.C40109a) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x001c:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r10.next()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r2 = (com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel) r2
            m128207a(r8, r2, r9)
            java.lang.String r3 = r2.f88156b
            java.lang.String r4 = java.io.File.separator
            java.lang.String[] r3 = r3.split(r4)
            java.lang.String r4 = ""
            int r5 = r3.length
            r6 = 2
            if (r5 < r6) goto L_0x003d
            int r4 = r3.length
            int r4 = r4 - r6
            r4 = r3[r4]
        L_0x003d:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a> r3 = r7.f104248c
            java.lang.Object r3 = r3.get(r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a r3 = (com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter.C40109a) r3
            if (r3 != 0) goto L_0x0056
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a
            r3.<init>()
            r3.f104254a = r4
            r0.add(r3)
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter$a> r5 = r7.f104248c
            r5.put(r4, r3)
        L_0x0056:
            m128207a(r3, r2, r9)
            r1.add(r3)
            goto L_0x001c
        L_0x005d:
            android.util.Pair r8 = android.util.Pair.create(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter.mo99840a(boolean, int, java.util.List):android.util.Pair");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo99841a(int i, boolean z, C1592h hVar) throws Exception {
        if (hVar.mo6887c() || hVar.mo6889d()) {
            return null;
        }
        this.f104249d |= 1 << i;
        this.f104247b.addAll((List) ((Pair) hVar.mo6890e()).first);
        notifyDataSetChanged();
        if (this.f104252g != null) {
            if (!z || this.f104253h == null) {
                this.f104252g.mo99813a(m128204a(), false, this.f104249d, true);
                this.f104253h = m128204a();
            } else if (((HashSet) ((Pair) hVar.mo6890e()).second).contains(this.f104253h) || this.f104253h == m128204a()) {
                this.f104252g.mo99813a(this.f104253h, false, this.f104249d, false);
            }
        }
        if (this.f104246a != null) {
            this.f104246a.mo99846a(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo99842a(List<MyMediaModel> list, int i, boolean z, boolean z2) {
        if (i == 4 || i == 3) {
            C1592h.m7853a((Callable<TResult>) new C40148u<TResult>(this, z, i, list)).mo6876a((C1591g<TResult, TContinuationResult>) new C40149v<TResult,TContinuationResult>(this, i, z2), C1592h.f5958b);
        }
    }
}
