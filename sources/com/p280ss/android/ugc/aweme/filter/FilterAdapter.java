package com.p280ss.android.ugc.aweme.filter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p029v7.recyclerview.extensions.ListAdapter;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.filter.model.C29322b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterAdapter */
public class FilterAdapter extends ListAdapter<C29296g, C29149a> {

    /* renamed from: a */
    final Context f76932a;

    /* renamed from: b */
    RecyclerView f76933b;

    /* renamed from: c */
    int f76934c;

    /* renamed from: d */
    public C29250bj f76935d;

    /* renamed from: e */
    public C29199ad f76936e;

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterAdapter$a */
    class C29149a extends C1293v {

        /* renamed from: a */
        TextView f76937a;

        /* renamed from: b */
        CircleImageView f76938b;

        /* renamed from: c */
        View f76939c;

        C29149a(View view) {
            super(view);
            this.f76937a = (TextView) view.findViewById(R.id.dx2);
            this.f76938b = (CircleImageView) view.findViewById(R.id.b9b);
            this.f76939c = view.findViewById(R.id.bxe);
            view.setOnClickListener(new OnClickListener(FilterAdapter.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (FilterAdapter.this.f76936e == null || !FilterAdapter.this.f76936e.mo74796a(2, true)) {
                        int adapterPosition = C29149a.this.getAdapterPosition();
                        if (!(adapterPosition == -1 || FilterAdapter.this.f76935d == null)) {
                            FilterAdapter.this.f76935d.mo74705a(FilterAdapter.this.mo4535a(adapterPosition));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final C29296g mo4535a(int i) {
        return (C29296g) super.mo4535a(i);
    }

    /* renamed from: c */
    public final void mo74671c(int i) {
        mo74669a(mo4535a(i));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f76933b = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f76933b = null;
    }

    public FilterAdapter(Context context) {
        super(new C1147c<C29296g>() {
            /* renamed from: b */
            private static boolean m95645b(C29296g gVar, C29296g gVar2) {
                return gVar.equals(gVar2);
            }

            /* renamed from: a */
            private static boolean m95644a(C29296g gVar, C29296g gVar2) {
                if (gVar.f77266a == gVar2.f77266a) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
                return m95645b((C29296g) obj, (C29296g) obj2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
                return m95644a((C29296g) obj, (C29296g) obj2);
            }
        });
        this.f76932a = context;
    }

    /* renamed from: a */
    public final void mo74669a(C29296g gVar) {
        int itemCount = getItemCount();
        int i = gVar.f77266a;
        if (this.f76934c != i) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= itemCount) {
                    break;
                } else if (mo4535a(i3).f77266a == this.f76934c) {
                    notifyItemChanged(i3);
                    break;
                } else {
                    i3++;
                }
            }
            while (true) {
                if (i2 >= itemCount) {
                    break;
                } else if (mo4535a(i2).f77266a == i) {
                    notifyItemChanged(i2);
                    if (this.f76933b != null) {
                        if (i2 > 4) {
                            this.f76933b.mo5541b(i2 - 2);
                        }
                        this.f76933b.mo5561d(i2);
                    }
                } else {
                    i2++;
                }
            }
            this.f76934c = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C29149a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C29149a(LayoutInflater.from(this.f76932a).inflate(R.layout.mm, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C29149a aVar, int i) {
        int i2;
        C29296g b = mo4535a(i);
        C29322b bVar = new C29322b(b.f77271f, b.f77267b);
        C23323e.m76514a((RemoteImageView) aVar.f76938b, bVar.f77315a.toString());
        aVar.f76937a.setText(bVar.f77316b);
        View view = aVar.f76939c;
        if (this.f76934c == mo4535a(i).f77266a) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (this.f76934c == i) {
            ObjectAnimator.ofFloat(aVar.f76939c, "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
        }
    }
}
