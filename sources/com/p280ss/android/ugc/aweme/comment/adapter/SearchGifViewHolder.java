package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p280ss.android.ugc.aweme.comment.viewmodel.GifEmojiState;
import com.p280ss.android.ugc.aweme.comment.viewmodel.GifEmojiViewModel;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.utils.C27640i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder */
public final class SearchGifViewHolder extends JediBaseViewHolder<SearchGifViewHolder, GifEmoji> implements C27640i {

    /* renamed from: k */
    public static final C24066b f63667k = new C24066b(null);

    /* renamed from: g */
    public boolean f63668g;

    /* renamed from: j */
    public final C24081l f63669j;

    /* renamed from: l */
    private final RemoteImageView f63670l;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$a */
    static final class C24065a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchGifViewHolder f63671a;

        C24065a(SearchGifViewHolder searchGifViewHolder) {
            this.f63671a = searchGifViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f63671a.f63668g) {
                C24081l lVar = this.f63671a.f63669j;
                C7573i.m23582a((Object) view, "it");
                lVar.mo62399a(view, this.f63671a.mo62390p(), this.f63671a.getAdapterPosition());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$b */
    public static final class C24066b {
        private C24066b() {
        }

        public /* synthetic */ C24066b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$c */
    static final class C24067c extends Lambda implements C7562b<GifEmojiState, GifEmojiState> {

        /* renamed from: a */
        final /* synthetic */ SearchGifViewHolder f63672a;

        C24067c(SearchGifViewHolder searchGifViewHolder) {
            this.f63672a = searchGifViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GifEmojiState invoke(GifEmojiState gifEmojiState) {
            C7573i.m23587b(gifEmojiState, "$receiver");
            return gifEmojiState.copy((GifEmoji) this.f63672a.mo29309o());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$d */
    static final class C24068d extends Lambda implements C7563m<SearchGifViewHolder, GifEmojiState, C7581n> {

        /* renamed from: a */
        public static final C24068d f63673a = new C24068d();

        C24068d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m78996a((SearchGifViewHolder) obj, (GifEmojiState) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m78996a(SearchGifViewHolder searchGifViewHolder, GifEmojiState gifEmojiState) {
            C7573i.m23587b(searchGifViewHolder, "$receiver");
            C7573i.m23587b(gifEmojiState, "it");
            searchGifViewHolder.mo62389a(gifEmojiState.getGifEmoji());
        }
    }

    public final void am_() {
        this.f63668g = true;
    }

    public final void an_() {
    }

    public final void bA_() {
        super.bA_();
        mo29061a(m78992q(), C11640h.m34110a(), C24068d.f63673a);
    }

    /* renamed from: q */
    private final GifEmojiViewModel m78992q() {
        C7562b cVar = new C24067c(this);
        Class<GifEmojiViewModel> cls = GifEmojiViewModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(GifEmojiViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(cVar);
            return (GifEmojiViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: p */
    public final Emoji mo62390p() {
        int i;
        Emoji emoji = new Emoji();
        UrlModel origin = ((GifEmoji) mo29309o()).getOrigin();
        if (origin == null) {
            origin = new UrlModel();
        }
        emoji.setAnimateUrl(origin);
        UrlModel thumbnail = ((GifEmoji) mo29309o()).getThumbnail();
        if (thumbnail == null) {
            thumbnail = new UrlModel();
        }
        emoji.setStaticUrl(thumbnail);
        emoji.setId(((GifEmoji) mo29309o()).getImageId());
        UrlModel origin2 = ((GifEmoji) mo29309o()).getOrigin();
        int i2 = 0;
        if (origin2 != null) {
            i = origin2.getWidth();
        } else {
            i = 0;
        }
        emoji.setWidth(i);
        UrlModel origin3 = ((GifEmoji) mo29309o()).getOrigin();
        if (origin3 != null) {
            i2 = origin3.getHeight();
        }
        emoji.setHeight(i2);
        emoji.setStickerType(((GifEmoji) mo29309o()).getStickerType());
        emoji.setAnimateType("gif");
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        emoji.setDisplayName(view.getContext().getString(R.string.azw));
        emoji.setLogPb(((GifEmoji) mo29309o()).getLogPb());
        return emoji;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r3 == null) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62389a(com.p280ss.android.ugc.aweme.comment.model.GifEmoji r7) {
        /*
            r6 = this;
            r0 = 0
            r6.f63668g = r0
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r7.getThumbnail()
            if (r7 == 0) goto L_0x0036
            int[] r1 = com.p280ss.android.ugc.aweme.comment.adapter.C24080k.m79003a(r7)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.f63670l
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r6.f63670l
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r4 = 1
            if (r3 == 0) goto L_0x0022
            r5 = r1[r0]
            r3.width = r5
            r5 = r1[r4]
            r3.height = r5
            if (r3 != 0) goto L_0x002b
        L_0x0022:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r0 = r1[r0]
            r1 = r1[r4]
            r3.<init>(r0, r1)
        L_0x002b:
            r2.setLayoutParams(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r6.f63670l
            r1 = r6
            com.ss.android.ugc.aweme.emoji.utils.i r1 = (com.p280ss.android.ugc.aweme.emoji.utils.C27640i) r1
            com.p280ss.android.ugc.aweme.emoji.utils.C27636g.m90610a(r0, r7, r1)
        L_0x0036:
            com.ss.android.ugc.aweme.comment.adapter.l r7 = r6.f63669j
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r6.f63670l
            android.view.View r0 = (android.view.View) r0
            com.ss.android.ugc.aweme.emoji.model.Emoji r1 = r6.mo62390p()
            int r2 = r6.getAdapterPosition()
            r7.mo62400b(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder.mo62389a(com.ss.android.ugc.aweme.comment.model.GifEmoji):void");
    }

    public SearchGifViewHolder(ViewGroup viewGroup, C24081l lVar) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(lVar, "gifEmojiActionListener");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ty, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…gif_emoji, parent, false)");
        super(inflate);
        this.f63669j = lVar;
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.ay4);
        remoteImageView.setDrawingCacheEnabled(true);
        remoteImageView.setOnClickListener(new C24065a(this));
        C7573i.m23582a((Object) remoteImageView, "itemView.image.apply {\n …        }\n        }\n    }");
        this.f63670l = remoteImageView;
    }
}
