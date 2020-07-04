package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui;

import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1145a;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.shortvideo.model.Face;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.C40420d;
import com.p280ss.android.ugc.aweme.views.C43373i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingNormalAdapter */
public class FaceMattingNormalAdapter extends C1262a<FaceMattingNormalViewHolder> {

    /* renamed from: a */
    public C40420d f105189a;

    /* renamed from: b */
    public ArrayList<Face> f105190b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<Face> f105191c = new ArrayList<>();

    /* renamed from: d */
    public Face f105192d = null;

    /* renamed from: e */
    private C1145a f105193e = new C1145a() {
        /* renamed from: a */
        public final int mo248a() {
            return FaceMattingNormalAdapter.this.f105191c.size();
        }

        /* renamed from: b */
        public final int mo250b() {
            return FaceMattingNormalAdapter.this.f105190b.size();
        }

        /* renamed from: b */
        public final boolean mo251b(int i, int i2) {
            return ((Face) FaceMattingNormalAdapter.this.f105191c.get(i)).equals(FaceMattingNormalAdapter.this.f105190b.get(i2));
        }

        /* renamed from: c */
        public final boolean mo252c(int i, int i2) {
            return ((Face) FaceMattingNormalAdapter.this.f105191c.get(i)).equals(FaceMattingNormalAdapter.this.f105190b.get(i2));
        }
    };

    /* renamed from: b */
    public final void mo100514b() {
        this.f105189a = null;
    }

    public int getItemCount() {
        return this.f105190b.size();
    }

    /* renamed from: a */
    public final void mo100511a() {
        int indexOf = this.f105190b.indexOf(this.f105192d);
        this.f105192d = null;
        notifyItemChanged(indexOf);
    }

    /* renamed from: a */
    private static String m129389a(String str) {
        return Uri.fromFile(new File(str)).toString();
    }

    public FaceMattingNormalAdapter(C40420d dVar) {
        this.f105189a = dVar;
    }

    /* renamed from: a */
    public final void mo100513a(List<Face> list) {
        this.f105191c.clear();
        this.f105191c.addAll(this.f105190b);
        this.f105190b.clear();
        Collections.sort(list, new Comparator<Face>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m129399a((Face) obj, (Face) obj2);
            }

            /* renamed from: a */
            private static int m129399a(Face face, Face face2) {
                if (face.data_added > face2.data_added) {
                    return -1;
                }
                if (face.data_added < face2.data_added) {
                    return 1;
                }
                return 0;
            }
        });
        this.f105190b.addAll(list);
        C1143a.m5066a(this.f105193e).mo4548a((C1262a) this);
        notifyItemChanged(this.f105190b.indexOf(this.f105192d));
    }

    /* renamed from: a */
    public final FaceMattingNormalViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tb, viewGroup, false);
        if (VERSION.SDK_INT >= 21) {
            inflate.setOutlineProvider(new C43373i((int) C9738o.m28708b(viewGroup.getContext(), 8.0f)));
            inflate.setClipToOutline(true);
        }
        final FaceMattingNormalViewHolder faceMattingNormalViewHolder = new FaceMattingNormalViewHolder(inflate);
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                int adapterPosition = faceMattingNormalViewHolder.getAdapterPosition();
                if (FaceMattingNormalAdapter.this.f105192d == ((Face) FaceMattingNormalAdapter.this.f105190b.get(adapterPosition))) {
                    faceMattingNormalViewHolder.f105198a.setVisibility(8);
                    FaceMattingNormalAdapter.this.f105192d = null;
                    if (FaceMattingNormalAdapter.this.f105189a != null) {
                        FaceMattingNormalAdapter.this.f105189a.mo100392a();
                    }
                } else {
                    int indexOf = FaceMattingNormalAdapter.this.f105190b.indexOf(FaceMattingNormalAdapter.this.f105192d);
                    FaceMattingNormalAdapter.this.f105192d = (Face) FaceMattingNormalAdapter.this.f105190b.get(adapterPosition);
                    FaceMattingNormalAdapter.this.notifyItemChanged(indexOf);
                    faceMattingNormalViewHolder.f105198a.setVisibility(0);
                    if (FaceMattingNormalAdapter.this.f105189a != null) {
                        FaceMattingNormalAdapter.this.f105189a.mo100393a((Face) FaceMattingNormalAdapter.this.f105190b.get(adapterPosition));
                    }
                }
            }
        });
        return faceMattingNormalViewHolder;
    }

    /* renamed from: a */
    public final void onBindViewHolder(FaceMattingNormalViewHolder faceMattingNormalViewHolder, int i) {
        if (this.f105192d == this.f105190b.get(i)) {
            faceMattingNormalViewHolder.f105198a.setVisibility(0);
        } else {
            faceMattingNormalViewHolder.f105198a.setVisibility(8);
        }
        C23323e.m76514a(faceMattingNormalViewHolder.f105199b, m129389a(((Face) this.f105190b.get(i)).path));
    }
}
