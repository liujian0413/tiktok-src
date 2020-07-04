package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui.FaceMattingNormalViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40429b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40452b;
import com.p280ss.android.ugc.aweme.views.C43373i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter */
public final class PixaloopMattingAdapter extends C1262a<C1293v> {

    /* renamed from: e */
    public static final C40433a f105118e = new C40433a(null);

    /* renamed from: a */
    public C40429b f105119a;

    /* renamed from: b */
    public final ArrayList<C40429b> f105120b = new ArrayList<>();

    /* renamed from: c */
    public int f105121c;

    /* renamed from: d */
    public final C40452b f105122d;

    /* renamed from: f */
    private View f105123f = LayoutInflater.from(this.f105125h).inflate(R.layout.t_, null);

    /* renamed from: g */
    private C40434b f105124g;

    /* renamed from: h */
    private final Context f105125h;

    /* renamed from: i */
    private final String f105126i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter$a */
    public static final class C40433a {
        private C40433a() {
        }

        public /* synthetic */ C40433a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter$b */
    final class C40434b extends C1293v {

        /* renamed from: a */
        final /* synthetic */ PixaloopMattingAdapter f105127a;

        /* renamed from: b */
        private ObjectAnimator f105128b;

        /* renamed from: c */
        private final ImageView f105129c;

        /* renamed from: a */
        public final void mo100461a() {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            view.setVisibility(0);
            m129309c();
        }

        /* renamed from: b */
        public final void mo100462b() {
            if (this.f105128b != null) {
                ObjectAnimator objectAnimator = this.f105128b;
                if (objectAnimator == null) {
                    C7573i.m23580a();
                }
                objectAnimator.cancel();
                this.f105128b = null;
            }
            if (this.itemView != null) {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                view.setVisibility(8);
            }
        }

        /* renamed from: c */
        private final void m129309c() {
            this.f105128b = ObjectAnimator.ofFloat(this.f105129c, "rotation", new float[]{0.0f, 360.0f});
            ObjectAnimator objectAnimator = this.f105128b;
            if (objectAnimator == null) {
                C7573i.m23580a();
            }
            objectAnimator.setDuration(800);
            ObjectAnimator objectAnimator2 = this.f105128b;
            if (objectAnimator2 == null) {
                C7573i.m23580a();
            }
            objectAnimator2.setRepeatMode(1);
            ObjectAnimator objectAnimator3 = this.f105128b;
            if (objectAnimator3 == null) {
                C7573i.m23580a();
            }
            objectAnimator3.setRepeatCount(-1);
            ObjectAnimator objectAnimator4 = this.f105128b;
            if (objectAnimator4 == null) {
                C7573i.m23580a();
            }
            objectAnimator4.start();
        }

        public C40434b(PixaloopMattingAdapter pixaloopMattingAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f105127a = pixaloopMattingAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.b_w);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_loading)");
            this.f105129c = (ImageView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter$c */
    static final class C40435c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PixaloopMattingAdapter f105130a;

        /* renamed from: b */
        final /* synthetic */ FaceMattingNormalViewHolder f105131b;

        C40435c(PixaloopMattingAdapter pixaloopMattingAdapter, FaceMattingNormalViewHolder faceMattingNormalViewHolder) {
            this.f105130a = pixaloopMattingAdapter;
            this.f105131b = faceMattingNormalViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int adapterPosition = this.f105131b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f105130a.f105120b.size()) {
                this.f105130a.f105119a = (C40429b) this.f105130a.f105120b.get(adapterPosition);
                this.f105130a.notifyItemChanged(this.f105130a.f105121c);
                this.f105130a.notifyItemChanged(adapterPosition);
                C40452b bVar = this.f105130a.f105122d;
                if (bVar != null) {
                    bVar.mo100415a(this.f105130a.f105119a);
                }
                this.f105130a.f105121c = adapterPosition;
            }
        }
    }

    /* renamed from: b */
    public final void mo100457b() {
        this.f105119a = null;
        if (this.f105121c >= 0) {
            notifyItemChanged(this.f105121c);
        }
    }

    /* renamed from: e */
    public final void mo100460e() {
        this.f105120b.clear();
        this.f105119a = null;
    }

    public final int getItemCount() {
        int size = this.f105120b.size();
        if (this.f105123f != null) {
            return size + 1;
        }
        return size;
    }

    /* renamed from: c */
    public final void mo100458c() {
        if (this.f105124g != null) {
            C40434b bVar = this.f105124g;
            if (bVar == null) {
                C7573i.m23580a();
            }
            bVar.mo100462b();
            this.f105123f = null;
        }
    }

    /* renamed from: d */
    public final void mo100459d() {
        if (this.f105123f == null) {
            this.f105123f = LayoutInflater.from(this.f105125h).inflate(R.layout.t_, null);
        }
    }

    /* renamed from: a */
    public final int mo100453a() {
        if (C23477d.m77081a((Collection<T>) this.f105120b)) {
            return 0;
        }
        return this.f105120b.size();
    }

    public final int getItemViewType(int i) {
        if (this.f105123f == null || i != getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    private final C40434b m129297a(ViewGroup viewGroup) {
        View view = this.f105123f;
        if (view == null) {
            C7573i.m23580a();
        }
        this.f105124g = new C40434b(this, view);
        C40434b bVar = this.f105124g;
        if (bVar != null) {
            return bVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter.FooterViewHolder");
    }

    /* renamed from: b */
    private final boolean m129300b(C40429b bVar) {
        if (bVar == null || this.f105119a == null) {
            return false;
        }
        C40429b bVar2 = this.f105119a;
        if (bVar2 == null) {
            C7573i.m23580a();
        }
        if (TextUtils.isEmpty(bVar2.f105102a)) {
            return false;
        }
        C40429b bVar3 = this.f105119a;
        if (bVar3 == null) {
            C7573i.m23580a();
        }
        return C7573i.m23585a((Object) bVar3.f105102a, (Object) bVar.f105102a);
    }

    /* renamed from: b */
    private final FaceMattingNormalViewHolder m129299b(ViewGroup viewGroup) {
        int i;
        float f;
        if (C40881d.m130626a(this.f105126i)) {
            i = R.layout.g3;
        } else {
            i = R.layout.tb;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (VERSION.SDK_INT >= 21) {
            if (C40881d.m130626a(this.f105126i)) {
                f = 2.0f;
            } else {
                f = 6.0f;
            }
            C7573i.m23582a((Object) inflate, "view");
            inflate.setOutlineProvider(new C43373i((int) C9738o.m28708b(viewGroup.getContext(), f)));
            inflate.setClipToOutline(true);
        }
        FaceMattingNormalViewHolder faceMattingNormalViewHolder = new FaceMattingNormalViewHolder(inflate);
        inflate.setOnClickListener(new C40435c(this, faceMattingNormalViewHolder));
        return faceMattingNormalViewHolder;
    }

    /* renamed from: a */
    public final void mo100454a(C40429b bVar) {
        C7573i.m23587b(bVar, "pixaloopData");
        this.f105120b.add(bVar);
        notifyItemInserted(getItemCount() - 1);
    }

    /* renamed from: a */
    public final void mo100455a(String str) {
        if (!TextUtils.isEmpty(str) && !C23477d.m77081a((Collection<T>) this.f105120b)) {
            int size = this.f105120b.size();
            for (int i = 0; i < size; i++) {
                if (C7634n.m23717a(str, ((C40429b) this.f105120b.get(i)).f105102a, false)) {
                    this.f105119a = (C40429b) this.f105120b.get(i);
                    if (this.f105121c >= 0) {
                        notifyItemChanged(this.f105121c);
                    }
                    notifyItemChanged(i);
                    this.f105121c = i;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100456a(List<C40429b> list) {
        C7573i.m23587b(list, "pixaloopDataList");
        this.f105120b.clear();
        this.f105120b.addAll(list);
        this.f105123f = null;
        notifyDataSetChanged();
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (vVar instanceof C40434b) {
            ((C40434b) vVar).mo100461a();
            return;
        }
        if (vVar instanceof FaceMattingNormalViewHolder) {
            m129298a((FaceMattingNormalViewHolder) vVar, i);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            return m129297a(viewGroup);
        }
        return m129299b(viewGroup);
    }

    /* renamed from: a */
    private final void m129298a(FaceMattingNormalViewHolder faceMattingNormalViewHolder, int i) {
        Object obj = this.f105120b.get(i);
        C7573i.m23582a(obj, "dataList[position]");
        C40429b bVar = (C40429b) obj;
        if (m129300b(bVar)) {
            ImageView imageView = faceMattingNormalViewHolder.f105198a;
            C7573i.m23582a((Object) imageView, "holder.selectedMark");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = faceMattingNormalViewHolder.f105198a;
            C7573i.m23582a((Object) imageView2, "holder.selectedMark");
            imageView2.setVisibility(8);
        }
        String uri = Uri.fromFile(new File(bVar.f105102a)).toString();
        C7573i.m23582a((Object) uri, "Uri.fromFile(File(pixalo…Data.imgPath)).toString()");
        RemoteImageView remoteImageView = faceMattingNormalViewHolder.f105199b;
        C7573i.m23582a((Object) remoteImageView, "holder.imageView");
        int b = (int) C9738o.m28708b(remoteImageView.getContext(), 50.0f);
        C23323e.m76525b(faceMattingNormalViewHolder.f105199b, uri, b, b);
        if (bVar.f105110i == 2) {
            float f = (((float) bVar.f105109h) * 1.0f) / 1000.0f;
            TextView textView = faceMattingNormalViewHolder.f105200c;
            StringBuilder sb = new StringBuilder();
            Locale locale = Locale.getDefault();
            C7573i.m23582a((Object) locale, "Locale.getDefault()");
            String a = C1642a.m8035a(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            sb.append(a);
            sb.append("s");
            textView.setText(sb.toString());
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = faceMattingNormalViewHolder.f105200c;
        C7573i.m23582a((Object) textView2, "holder.tvDuration");
        textView2.setVisibility(8);
    }

    public PixaloopMattingAdapter(Context context, String str, C40452b bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "panel");
        this.f105125h = context;
        this.f105126i = str;
        this.f105122d = bVar;
    }
}
