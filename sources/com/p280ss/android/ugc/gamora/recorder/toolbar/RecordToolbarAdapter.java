package com.p280ss.android.ugc.gamora.recorder.toolbar;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.C39960gg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.RecordToolbarAdapter */
public class RecordToolbarAdapter extends C1262a<C1293v> {

    /* renamed from: b */
    public static final C44756a f115166b = new C44756a(null);

    /* renamed from: a */
    public List<? extends C44779b> f115167a;

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.RecordToolbarAdapter$ViewHolder */
    public final class ViewHolder extends C1293v {

        /* renamed from: a */
        public ImageView f115168a;

        /* renamed from: b */
        public TextView f115169b;

        /* renamed from: c */
        final /* synthetic */ RecordToolbarAdapter f115170c;

        public ViewHolder(RecordToolbarAdapter recordToolbarAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f115170c = recordToolbarAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.b_a);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_icon)");
            this.f115168a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.dw4);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_icon_desc)");
            this.f115169b = (TextView) findViewById2;
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ ViewHolder f115171a;

                {
                    this.f115171a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = this.f115171a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C44779b bVar = (C44779b) this.f115171a.f115170c.f115167a.get(adapterPosition);
                        C44778a aVar = bVar.f115195d;
                        if (bVar.f115194c) {
                            if (bVar.f115199h != null) {
                                bVar.f115199h.mo60330a(this.f115171a.f115168a);
                            }
                            if (aVar != null) {
                                aVar.mo60328a(bVar);
                                if (bVar.f115197f) {
                                    this.f115171a.f115168a.setImageResource(bVar.f115193b);
                                    bVar.mo107228b();
                                }
                            }
                        } else if (aVar != null) {
                            aVar.mo60329b(bVar);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.RecordToolbarAdapter$a */
    public static final class C44756a {
        private C44756a() {
        }

        public /* synthetic */ C44756a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.RecordToolbarAdapter$b */
    final class C44757b extends C1293v {

        /* renamed from: a */
        final /* synthetic */ RecordToolbarAdapter f115172a;

        public C44757b(RecordToolbarAdapter recordToolbarAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f115172a = recordToolbarAdapter;
            super(view);
            if (!C39960gg.m127843a(view.getContext())) {
                View findViewById = view.findViewById(R.id.dw4);
                C7573i.m23582a((Object) findViewById, "itemView.findViewById<View>(R.id.tv_icon_desc)");
                findViewById.setVisibility(8);
            } else {
                View findViewById2 = view.findViewById(R.id.dw4);
                if (findViewById2 != null) {
                    ((TextView) findViewById2).setText(R.string.b6p);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            View findViewById3 = view.findViewById(R.id.b_a);
            if (findViewById3 != null) {
                ((ImageView) findViewById3).setImageResource(R.drawable.aq4);
                view.findViewById(R.id.dl5).setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44757b f115173a;

                    {
                        this.f115173a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        int adapterPosition = this.f115173a.getAdapterPosition();
                        if (adapterPosition != -1) {
                            C44779b bVar = (C44779b) this.f115173a.f115172a.f115167a.get(adapterPosition);
                            C44778a aVar = bVar.f115195d;
                            if (aVar != null) {
                                aVar.mo60328a(bVar);
                            }
                        }
                    }
                });
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    public int getItemCount() {
        return this.f115167a.size();
    }

    /* renamed from: a */
    public final void mo107171a(List<? extends C44779b> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f115167a = list;
    }

    public RecordToolbarAdapter(List<? extends C44779b> list) {
        C7573i.m23587b(list, "models");
        this.f115167a = list;
    }

    /* renamed from: a */
    public final boolean mo107172a(C44779b bVar) {
        C7573i.m23587b(bVar, "model");
        return this.f115167a.contains(bVar);
    }

    /* renamed from: b */
    public final int mo107173b(C44779b bVar) {
        C7573i.m23587b(bVar, "model");
        return this.f115167a.indexOf(bVar);
    }

    public int getItemViewType(int i) {
        if (((C44779b) this.f115167a.get(i)).f115192a == 3) {
            return 1;
        }
        return 0;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        int i2;
        float f;
        C7573i.m23587b(vVar, "holder");
        if (getItemViewType(i) == 0) {
            C44779b bVar = (C44779b) this.f115167a.get(i);
            ViewHolder viewHolder = (ViewHolder) vVar;
            ImageView imageView = viewHolder.f115168a;
            imageView.setImageResource(bVar.f115193b);
            if (bVar.f115194c) {
                i2 = NormalGiftView.ALPHA_255;
            } else {
                i2 = 127;
            }
            imageView.setImageAlpha(i2);
            TextView textView = viewHolder.f115169b;
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            if (bVar.f115194c) {
                f = 1.0f;
            } else {
                f = 0.49803922f;
            }
            textView.setAlpha(f);
            if (bVar.f115198g <= 0) {
                textView.setVisibility(8);
                view.setContentDescription(null);
            } else {
                textView.setVisibility(0);
                textView.setText(bVar.f115198g);
                view.setContentDescription(view.getContext().getText(bVar.f115198g));
            }
            if (bVar.f115196e && bVar.f115199h != null) {
                bVar.f115199h.mo60330a(imageView);
            }
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gj, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…ar_filter, parent, false)");
            return new C44757b(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1u, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…mall_icon, parent, false)");
        return new ViewHolder(this, inflate2);
    }
}
