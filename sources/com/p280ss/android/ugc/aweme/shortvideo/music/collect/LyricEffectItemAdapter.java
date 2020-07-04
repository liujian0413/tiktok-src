package com.p280ss.android.ugc.aweme.shortvideo.music.collect;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap.Config;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.effect.EffectModel;
import com.p280ss.android.ugc.aweme.effect.base.AbsVEDownloadableEffectAdapter;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter */
public final class LyricEffectItemAdapter extends AbsVEDownloadableEffectAdapter<ViewHolder> {

    /* renamed from: d */
    public static final int f104121d = -1;

    /* renamed from: e */
    public static final C40090a f104122e = new C40090a(null);

    /* renamed from: a */
    public C40091b f104123a;

    /* renamed from: b */
    public int f104124b = f104121d;

    /* renamed from: f */
    private String f104125f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter$ViewHolder */
    public final class ViewHolder extends C1293v {

        /* renamed from: a */
        public AVDmtImageTextView f104126a;

        /* renamed from: b */
        public ImageView f104127b;

        /* renamed from: c */
        final /* synthetic */ LyricEffectItemAdapter f104128c;

        /* renamed from: d */
        private ObjectAnimator f104129d;

        /* renamed from: e */
        private int f104130e = -1;

        /* renamed from: b */
        private final void m128112b() {
            if (this.f104129d != null) {
                ObjectAnimator objectAnimator = this.f104129d;
                if (objectAnimator == null) {
                    C7573i.m23580a();
                }
                if (objectAnimator.isRunning()) {
                    ObjectAnimator objectAnimator2 = this.f104129d;
                    if (objectAnimator2 == null) {
                        C7573i.m23580a();
                    }
                    objectAnimator2.cancel();
                }
            }
            this.f104127b.setRotation(0.0f);
            this.f104127b.setImageResource(R.drawable.ep);
        }

        /* renamed from: a */
        private final void m128110a() {
            this.f104127b.setVisibility(0);
            this.f104127b.setImageResource(R.drawable.eq);
            this.f104129d = ObjectAnimator.ofFloat(this.f104127b, "rotation", new float[]{0.0f, 360.0f});
            ObjectAnimator objectAnimator = this.f104129d;
            if (objectAnimator == null) {
                C7573i.m23580a();
            }
            objectAnimator.setDuration(800);
            ObjectAnimator objectAnimator2 = this.f104129d;
            if (objectAnimator2 == null) {
                C7573i.m23580a();
            }
            objectAnimator2.setRepeatMode(1);
            ObjectAnimator objectAnimator3 = this.f104129d;
            if (objectAnimator3 == null) {
                C7573i.m23580a();
            }
            objectAnimator3.setRepeatCount(-1);
            ObjectAnimator objectAnimator4 = this.f104129d;
            if (objectAnimator4 == null) {
                C7573i.m23580a();
            }
            objectAnimator4.start();
        }

        /* renamed from: a */
        private void m128111a(int i) {
            if (this.f104130e != i) {
                this.f104130e = i;
                switch (i) {
                    case 0:
                        m128112b();
                        this.f104127b.setVisibility(0);
                        return;
                    case 1:
                        this.f104127b.setVisibility(8);
                        return;
                    case 2:
                        m128110a();
                        return;
                    case 3:
                        m128112b();
                        this.f104127b.setVisibility(8);
                        return;
                    case 4:
                        this.f104127b.setVisibility(0);
                        m128112b();
                        break;
                }
            }
        }

        public ViewHolder(LyricEffectItemAdapter lyricEffectItemAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f104128c = lyricEffectItemAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.bwa);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.lyric_img_view)");
            this.f104126a = (AVDmtImageTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.b8u);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_effect_download)");
            this.f104127b = (ImageView) findViewById2;
            this.f104126a.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ ViewHolder f104131a;

                {
                    this.f104131a = r1;
                }

                public final void onClick(View view) {
                    int i;
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = this.f104131a.getAdapterPosition();
                    if (!(adapterPosition == -1 || this.f104131a.f104128c.f104124b == adapterPosition)) {
                        LyricEffectItemAdapter lyricEffectItemAdapter = this.f104131a.f104128c;
                        if (C38527bf.m123172a(((EffectModel) this.f104131a.f104128c.f72283c.get(adapterPosition)).resDir)) {
                            i = adapterPosition;
                        } else {
                            i = LyricEffectItemAdapter.f104121d;
                        }
                        lyricEffectItemAdapter.f104124b = i;
                        int a = C40092a.m128115a();
                        C40091b bVar = this.f104131a.f104128c.f104123a;
                        if (bVar != null) {
                            bVar.mo99479a((EffectModel) this.f104131a.f104128c.f72283c.get(this.f104131a.getAdapterPosition()), a, adapterPosition);
                            this.f104131a.f104128c.notifyDataSetChanged();
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo99793a(int i, int i2) {
            boolean z;
            EffectModel effectModel = (EffectModel) this.f104128c.f72283c.get(i);
            if (effectModel != null) {
                AVDmtImageTextView aVDmtImageTextView = this.f104126a;
                String str = effectModel.iconUrl;
                C7573i.m23582a((Object) str, "model.iconUrl");
                aVDmtImageTextView.mo103500a(str, Config.ARGB_8888);
                this.f104126a.setText(effectModel.name);
                AVDmtImageTextView aVDmtImageTextView2 = this.f104126a;
                if (i == this.f104128c.f104124b) {
                    z = true;
                } else {
                    z = false;
                }
                aVDmtImageTextView2.mo103501a(z);
                this.f104126a.mo103503a(true, false);
                m128111a(i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter$a */
    public static final class C40090a {
        private C40090a() {
        }

        public /* synthetic */ C40090a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter$b */
    public interface C40091b {

        /* renamed from: b */
        public static final C40092a f104132b = C40092a.f104133a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter$b$a */
        public static final class C40092a {

            /* renamed from: a */
            static final /* synthetic */ C40092a f104133a = new C40092a();

            /* renamed from: b */
            private static final int f104134b = 1;

            /* renamed from: c */
            private static final int f104135c = 2;

            private C40092a() {
            }

            /* renamed from: a */
            public static int m128115a() {
                return f104134b;
            }
        }

        /* renamed from: a */
        void mo99479a(EffectModel effectModel, int i, int i2);
    }

    public final int getItemCount() {
        if (this.f72283c == null) {
            return 0;
        }
        return this.f72283c.size();
    }

    /* renamed from: a */
    private final void m128106a() {
        if (this.f104125f == null) {
            if (this.f104124b != f104121d) {
                int i = this.f104124b;
                this.f104124b = f104121d;
                notifyItemChanged(i);
            }
            return;
        }
        int i2 = 0;
        this.f104124b = 0;
        int size = this.f72283c.size();
        while (true) {
            if (i2 >= size) {
                break;
            } else if (C7573i.m23585a((Object) ((EffectModel) this.f72283c.get(i2)).key, (Object) this.f104125f)) {
                this.f104124b = i2;
                break;
            } else {
                i2++;
            }
        }
        notifyItemChanged(this.f104124b);
    }

    /* renamed from: a */
    public final void mo99791a(C40091b bVar) {
        C7573i.m23587b(bVar, "onItemClickListener");
        this.f104123a = bVar;
    }

    /* renamed from: a */
    public final void mo99792a(String str) {
        this.f104125f = str;
        m128106a();
    }

    public LyricEffectItemAdapter(RecyclerView recyclerView, C27359a aVar) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super(recyclerView, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C7573i.m23587b(viewHolder, "holder");
        viewHolder.mo99793a(i, mo70492a(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        Object systemService = viewGroup.getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.xd, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new ViewHolder(this, inflate);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
