package com.p280ss.android.ugc.gamora.recorder.status;

import android.content.Context;
import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter */
public final class StatusBackgroundAdapter extends C1262a<C1293v> {

    /* renamed from: e */
    public static final C44734a f115115e = new C44734a(null);

    /* renamed from: a */
    public C44735b f115116a;

    /* renamed from: b */
    public OnClickListener f115117b;

    /* renamed from: c */
    public int f115118c;

    /* renamed from: d */
    public final List<C44737a> f115119d;

    /* renamed from: f */
    private Animation f115120f;

    /* renamed from: g */
    private boolean f115121g;

    /* renamed from: h */
    private Pair<StatusBackgroundViewHolder, Integer> f115122h;

    /* renamed from: i */
    private final boolean f115123i;

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter$StatusBackgroundViewHolder */
    public static final class StatusBackgroundViewHolder extends C1293v {

        /* renamed from: a */
        public final RemoteImageView f115124a;

        /* renamed from: b */
        public final View f115125b;

        public StatusBackgroundViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.ayn);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.img)");
            this.f115124a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.b_w);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_loading)");
            this.f115125b = findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter$StatusMoreButtonViewHolder */
    public static final class StatusMoreButtonViewHolder extends C1293v {
        public StatusMoreButtonViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter$a */
    public static final class C44734a {
        private C44734a() {
        }

        public /* synthetic */ C44734a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter$b */
    public interface C44735b {
        /* renamed from: a */
        void mo106785a(C44737a aVar, int i);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter$c */
    static final class C44736c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44735b f115126a;

        /* renamed from: b */
        final /* synthetic */ StatusBackgroundAdapter f115127b;

        /* renamed from: c */
        final /* synthetic */ StatusBackgroundViewHolder f115128c;

        /* renamed from: d */
        final /* synthetic */ int f115129d;

        /* renamed from: e */
        final /* synthetic */ int f115130e;

        C44736c(C44735b bVar, StatusBackgroundAdapter statusBackgroundAdapter, StatusBackgroundViewHolder statusBackgroundViewHolder, int i, int i2) {
            this.f115126a = bVar;
            this.f115127b = statusBackgroundAdapter;
            this.f115128c = statusBackgroundViewHolder;
            this.f115129d = i;
            this.f115130e = i2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f115127b.f115118c != this.f115129d) {
                this.f115128c.f115125b.setVisibility(0);
                View view2 = this.f115128c.f115125b;
                StatusBackgroundAdapter statusBackgroundAdapter = this.f115127b;
                View view3 = this.f115128c.itemView;
                C7573i.m23582a((Object) view3, "holder.itemView");
                Context context = view3.getContext();
                C7573i.m23582a((Object) context, "holder.itemView.context");
                view2.startAnimation(statusBackgroundAdapter.mo107149a(context));
                this.f115127b.mo107151a(this.f115129d);
                this.f115126a.mo106785a((C44737a) this.f115127b.f115119d.get(this.f115130e), this.f115129d);
            }
        }
    }

    /* renamed from: b */
    public final void mo107153b() {
        if (this.f115118c >= 0) {
            this.f115118c = -1;
            Pair<StatusBackgroundViewHolder, Integer> pair = this.f115122h;
            if (pair != null) {
                onBindViewHolder((C1293v) pair.getFirst(), ((Number) pair.getSecond()).intValue());
            }
        }
    }

    public final int getItemCount() {
        if (this.f115123i) {
            return this.f115119d.size() + 1;
        }
        return this.f115119d.size();
    }

    /* renamed from: a */
    public final void mo107150a() {
        this.f115121g = false;
        if (this.f115118c >= 0) {
            Pair<StatusBackgroundViewHolder, Integer> pair = this.f115122h;
            if (pair != null) {
                StatusBackgroundViewHolder statusBackgroundViewHolder = (StatusBackgroundViewHolder) pair.getFirst();
                if (statusBackgroundViewHolder != null) {
                    View view = statusBackgroundViewHolder.f115125b;
                    if (view != null) {
                        view.clearAnimation();
                    }
                }
            }
            Pair<StatusBackgroundViewHolder, Integer> pair2 = this.f115122h;
            if (pair2 != null) {
                StatusBackgroundViewHolder statusBackgroundViewHolder2 = (StatusBackgroundViewHolder) pair2.getFirst();
                if (statusBackgroundViewHolder2 != null) {
                    View view2 = statusBackgroundViewHolder2.f115125b;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
            }
        }
    }

    public final int getItemViewType(int i) {
        if (!this.f115123i || i != 0) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final Animation mo107149a(Context context) {
        if (this.f115120f == null) {
            this.f115120f = AnimationUtils.loadAnimation(context, R.anim.av);
        }
        Animation animation = this.f115120f;
        if (animation == null) {
            C7573i.m23580a();
        }
        return animation;
    }

    /* renamed from: a */
    public final void mo107151a(int i) {
        if (this.f115118c != i && i >= 0) {
            int i2 = this.f115118c;
            this.f115118c = i;
            if (i2 >= 0) {
                notifyItemChanged(i2);
            }
            this.f115121g = true;
            notifyItemChanged(this.f115118c);
        }
    }

    /* renamed from: a */
    public final void mo107152a(String str) {
        if (!TextUtils.isEmpty(str) && !C23477d.m77081a((Collection<T>) this.f115119d)) {
            int i = 0;
            for (Object next : this.f115119d) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                if (C7634n.m23717a(((C44737a) next).f115132a, str, false)) {
                    mo107151a(i2);
                    return;
                }
                i = i2;
            }
            mo107153b();
        }
    }

    public StatusBackgroundAdapter(List<C44737a> list, boolean z) {
        C7573i.m23587b(list, "data");
        this.f115119d = list;
        this.f115123i = z;
        this.f115118c = -1;
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aaq, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…lbum_more, parent, false)");
            return new StatusMoreButtonViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gk, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…ackground, parent, false)");
        return new StatusBackgroundViewHolder(inflate2);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        boolean z;
        int i2;
        String str;
        C7573i.m23587b(vVar, "viewholder");
        if (!this.f115123i || i != 0) {
            StatusBackgroundViewHolder statusBackgroundViewHolder = (StatusBackgroundViewHolder) vVar;
            if (this.f115118c == i) {
                z = true;
            } else {
                z = false;
            }
            if (statusBackgroundViewHolder.f115124a.isSelected() != z) {
                statusBackgroundViewHolder.f115124a.setSelected(z);
                statusBackgroundViewHolder.f115124a.invalidate();
            }
            if (!z) {
                statusBackgroundViewHolder.f115125b.clearAnimation();
                statusBackgroundViewHolder.f115125b.setVisibility(8);
            } else {
                this.f115122h = new Pair<>(statusBackgroundViewHolder, Integer.valueOf(i));
            }
            if (this.f115123i) {
                i2 = i - 1;
            } else {
                i2 = i;
            }
            if (((C44737a) this.f115119d.get(i2)).mo107155a() == null) {
                str = Uri.fromFile(new File(((C44737a) this.f115119d.get(i2)).f115132a)).toString();
            } else {
                UrlModel a = ((C44737a) this.f115119d.get(i2)).mo107155a();
                if (a != null) {
                    List urlList = a.getUrlList();
                    if (urlList != null) {
                        str = (String) urlList.get(0);
                    }
                }
                str = null;
            }
            C23323e.m76514a(statusBackgroundViewHolder.f115124a, str);
            C44735b bVar = this.f115116a;
            if (bVar != null) {
                View view = statusBackgroundViewHolder.itemView;
                C44736c cVar = new C44736c(bVar, this, statusBackgroundViewHolder, i, i2);
                view.setOnClickListener(cVar);
                return;
            }
            return;
        }
        OnClickListener onClickListener = this.f115117b;
        if (onClickListener != null) {
            vVar.itemView.setOnClickListener(onClickListener);
        }
    }

    public /* synthetic */ StatusBackgroundAdapter(List list, boolean z, int i, C7571f fVar) {
        this(list, false);
    }
}
