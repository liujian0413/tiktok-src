package com.p280ss.android.ugc.aweme.shortvideo.sticker.composer;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.ViewStubCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.composer.C40529c.C40530a;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl */
public final class ComposerStickerViewImpl implements C40528b {

    /* renamed from: a */
    public final RecyclerView f105292a;

    /* renamed from: b */
    public final AppCompatActivity f105293b;

    /* renamed from: c */
    public final ViewGroup f105294c;

    /* renamed from: d */
    public final EffectStickerManager f105295d;

    /* renamed from: e */
    public final LiveData<List<ComposerNode>> f105296e;

    /* renamed from: f */
    public final C7563m<AVDmtImageTextView, ComposerNode, C7581n> f105297f;

    /* renamed from: g */
    private ComposerNode f105298g;

    /* renamed from: h */
    private final FilterBeautySeekBar f105299h;

    /* renamed from: i */
    private final ComposerStickerAdapter f105300i = new ComposerStickerAdapter(this, this.f105295d);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl$ComposerStickerAdapter */
    public final class ComposerStickerAdapter extends C1262a<ComposerStickerItemViewHolder> {

        /* renamed from: a */
        public ComposerNode f105302a;

        /* renamed from: b */
        final /* synthetic */ ComposerStickerViewImpl f105303b;

        /* renamed from: c */
        private List<? extends ComposerNode> f105304c;

        /* renamed from: d */
        private final EffectStickerManager f105305d;

        public final int getItemCount() {
            ComposerNode composerNode = this.f105302a;
            if (composerNode != null) {
                List b = m129552b(composerNode);
                if (b != null) {
                    return b.size();
                }
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo100569a(ComposerNode composerNode) {
            List<? extends ComposerNode> list;
            this.f105302a = composerNode;
            if (composerNode != null) {
                list = m129552b(composerNode);
            } else {
                list = null;
            }
            this.f105304c = list;
        }

        /* renamed from: a */
        private final ComposerNode m129550a(int i) {
            ComposerNode composerNode;
            List<? extends ComposerNode> list = this.f105304c;
            if (list != null) {
                composerNode = (ComposerNode) list.get(i);
            } else {
                composerNode = null;
            }
            if (composerNode == null) {
                C7573i.m23580a();
            }
            return composerNode;
        }

        /* renamed from: b */
        private final List<ComposerNode> m129552b(ComposerNode composerNode) {
            if (composerNode.children == null) {
                return C7525m.m23457a(composerNode);
            }
            List arrayList = new ArrayList();
            List<ComposerNode> list = composerNode.children;
            C7573i.m23582a((Object) list, "this.children");
            for (ComposerNode composerNode2 : list) {
                C7573i.m23582a((Object) composerNode2, "it");
                arrayList.addAll(m129552b(composerNode2));
            }
            return C7525m.m23516h((Iterable<? extends T>) arrayList);
        }

        public ComposerStickerAdapter(ComposerStickerViewImpl composerStickerViewImpl, EffectStickerManager effectStickerManager) {
            C7573i.m23587b(effectStickerManager, "effectStickerManager");
            this.f105303b = composerStickerViewImpl;
            this.f105305d = effectStickerManager;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ComposerStickerItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            ComposerStickerViewImpl composerStickerViewImpl = this.f105303b;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u5, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…rent, false\n            )");
            return new ComposerStickerItemViewHolder(composerStickerViewImpl, inflate, this.f105305d);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(ComposerStickerItemViewHolder composerStickerItemViewHolder, int i) {
            C7573i.m23587b(composerStickerItemViewHolder, "holder");
            composerStickerItemViewHolder.mo100570a(m129550a(i), this.f105303b.f105297f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl$ComposerStickerItemViewHolder */
    public final class ComposerStickerItemViewHolder extends C1293v {

        /* renamed from: a */
        public final AVDmtImageTextView f105306a;

        /* renamed from: b */
        final /* synthetic */ ComposerStickerViewImpl f105307b;

        /* renamed from: c */
        private final EffectStickerManager f105308c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl$ComposerStickerItemViewHolder$a */
        static final class C40520a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ComposerStickerItemViewHolder f105309a;

            /* renamed from: b */
            final /* synthetic */ C7563m f105310b;

            /* renamed from: c */
            final /* synthetic */ ComposerNode f105311c;

            C40520a(ComposerStickerItemViewHolder composerStickerItemViewHolder, C7563m mVar, ComposerNode composerNode) {
                this.f105309a = composerStickerItemViewHolder;
                this.f105310b = mVar;
                this.f105311c = composerNode;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f105310b.invoke(this.f105309a.f105306a, this.f105311c);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo100570a(com.p280ss.android.ugc.effectmanager.effect.model.ComposerNode r5, kotlin.jvm.p357a.C7563m<? super com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView, ? super com.p280ss.android.ugc.effectmanager.effect.model.ComposerNode, kotlin.C7581n> r6) {
            /*
                r4 = this;
                java.lang.String r0 = "node"
                kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                java.lang.String r0 = "onClick"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r0 = r4.f105306a
                java.lang.String r1 = r5.UI_name
                r0.setText(r1)
                com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r0 = r4.f105306a
                r1 = 1
                r0.setShowDownloadIcon(r1)
                com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r0 = r4.f105306a
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r5.effect
                java.lang.String r3 = "node.effect"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.ss.android.ugc.effectmanager.common.model.UrlModel r2 = r2.getIconUrl()
                r3 = 0
                if (r2 == 0) goto L_0x0034
                java.util.List r2 = r2.getUrlList()
                if (r2 == 0) goto L_0x0034
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                r0.mo103499a(r2)
                com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.effect
                java.lang.String r2 = "node.effect"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.String r0 = r0.getId()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x0050
                int r0 = r0.length()
                if (r0 != 0) goto L_0x004e
                goto L_0x0050
            L_0x004e:
                r0 = 0
                goto L_0x0051
            L_0x0050:
                r0 = 1
            L_0x0051:
                if (r0 != 0) goto L_0x0063
                com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.effect
                com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r4.f105308c
                com.ss.android.ugc.aweme.effectplatform.EffectPlatform r2 = r2.f104787e
                com.ss.android.ugc.aweme.effectplatform.e r2 = (com.p280ss.android.ugc.aweme.effectplatform.C27481e) r2
                boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper.m129074a(r0, r2)
                if (r0 == 0) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r1 = 0
            L_0x0063:
                if (r1 == 0) goto L_0x006b
                com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r0 = r4.f105306a
                r0.mo103509d()
                goto L_0x0070
            L_0x006b:
                com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r0 = r4.f105306a
                r0.mo103513f()
            L_0x0070:
                com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r0 = r4.f105306a
                com.ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl$ComposerStickerItemViewHolder$a r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl$ComposerStickerItemViewHolder$a
                r1.<init>(r4, r6, r5)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView r6 = r4.f105306a
                com.ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl r0 = r4.f105307b
                android.arch.lifecycle.LiveData<java.util.List<com.ss.android.ugc.effectmanager.effect.model.ComposerNode>> r0 = r0.f105296e
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x008b
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x008b:
                java.util.List r0 = (java.util.List) r0
                boolean r5 = r0.contains(r5)
                r6.mo103501a(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.composer.ComposerStickerViewImpl.ComposerStickerItemViewHolder.mo100570a(com.ss.android.ugc.effectmanager.effect.model.ComposerNode, kotlin.jvm.a.m):void");
        }

        public ComposerStickerItemViewHolder(ComposerStickerViewImpl composerStickerViewImpl, View view, EffectStickerManager effectStickerManager) {
            C7573i.m23587b(view, "itemView");
            C7573i.m23587b(effectStickerManager, "effectStickerManager");
            this.f105307b = composerStickerViewImpl;
            super(view);
            this.f105308c = effectStickerManager;
            View e = C0991u.m4211e(view, (int) R.id.db2);
            C7573i.m23582a((Object) e, "ViewCompat.requireViewBy…w, R.id.sticker_img_view)");
            this.f105306a = (AVDmtImageTextView) e;
        }
    }

    /* renamed from: a */
    public final void mo100564a() {
        this.f105292a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo100567b() {
        this.f105299h.setVisibility(8);
        this.f105292a.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo100568c() {
        C1262a adapter = this.f105292a.getAdapter();
        if (adapter == null) {
            C7573i.m23580a();
        }
        adapter.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo100565a(ComposerNode composerNode) {
        this.f105298g = composerNode;
        this.f105300i.mo100569a(composerNode);
        this.f105300i.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo100566a(ComposerNode composerNode, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(composerNode, "node");
        C7573i.m23587b(bVar, "onProgressChanged");
        this.f105299h.setVisibility(0);
        this.f105299h.setOnSeekBarChangeListener(new C40530a(bVar));
    }

    public ComposerStickerViewImpl(AppCompatActivity appCompatActivity, ViewGroup viewGroup, EffectStickerManager effectStickerManager, LiveData<List<ComposerNode>> liveData, C7563m<? super AVDmtImageTextView, ? super ComposerNode, C7581n> mVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewGroup, "rootView");
        C7573i.m23587b(effectStickerManager, "effectStickerManager");
        C7573i.m23587b(liveData, "selectedComposerNodesLiveData");
        C7573i.m23587b(mVar, "onClick");
        this.f105293b = appCompatActivity;
        this.f105294c = viewGroup;
        this.f105295d = effectStickerManager;
        this.f105296e = liveData;
        this.f105297f = mVar;
        View e = C0991u.m4211e((View) this.f105294c, (int) R.id.dc1);
        if (e != null) {
            View a = ((ViewStubCompat) e).mo6224a();
            View e2 = C0991u.m4211e(a, (int) R.id.bjj);
            C7573i.m23582a((Object) e2, "ViewCompat.requireViewBy…d.layout_rv_face_matting)");
            this.f105292a = (RecyclerView) e2;
            this.f105292a.setAdapter(this.f105300i);
            this.f105292a.setLayoutManager(new LinearLayoutManager(this.f105293b, 0, false));
            View e3 = C0991u.m4211e(a, (int) R.id.a0x);
            C7573i.m23582a((Object) e3, "ViewCompat.requireViewBy…poser_intensity_seek_bar)");
            this.f105299h = (FilterBeautySeekBar) e3;
            this.f105296e.observe(this.f105293b, new C0053p<List<? extends ComposerNode>>(this) {

                /* renamed from: a */
                final /* synthetic */ ComposerStickerViewImpl f105301a;

                {
                    this.f105301a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(List<? extends ComposerNode> list) {
                    C1262a adapter = this.f105301a.f105292a.getAdapter();
                    if (adapter == null) {
                        C7573i.m23580a();
                    }
                    adapter.notifyDataSetChanged();
                }
            });
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.ViewStubCompat");
    }
}
