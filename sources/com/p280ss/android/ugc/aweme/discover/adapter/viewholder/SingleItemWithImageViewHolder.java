package com.p280ss.android.ugc.aweme.discover.adapter.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Params;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.p280ss.android.ugc.aweme.discover.widget.C27273a;
import com.p280ss.android.ugc.aweme.hotsearch.p1293a.C30351a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SingleItemWithImageViewHolder */
public final class SingleItemWithImageViewHolder extends MultiTypeViewHolder<Object> {

    /* renamed from: c */
    public static final C26522a f69963c = new C26522a(null);

    /* renamed from: a */
    public C27012a f69964a;

    /* renamed from: b */
    public final ViewGroup f69965b;

    /* renamed from: d */
    private final RemoteImageView f69966d;

    /* renamed from: e */
    private final DmtTextView f69967e;

    /* renamed from: f */
    private final View f69968f;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SingleItemWithImageViewHolder$a */
    public static final class C26522a {
        private C26522a() {
        }

        public /* synthetic */ C26522a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SingleItemWithImageViewHolder m87209a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3v, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new SingleItemWithImageViewHolder(inflate, viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.SingleItemWithImageViewHolder$b */
    static final class C26523b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SingleItemWithImageViewHolder f69969a;

        /* renamed from: b */
        final /* synthetic */ int f69970b;

        /* renamed from: c */
        final /* synthetic */ Word f69971c;

        C26523b(SingleItemWithImageViewHolder singleItemWithImageViewHolder, int i, Word word) {
            this.f69969a = singleItemWithImageViewHolder;
            this.f69970b = i;
            this.f69971c = word;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26612d.f70187a.mo68302a(5);
            C6907h.m21524a("trending_words_click", (Map) C22984d.m75611a().mo59970a("words_position", this.f69970b).mo59973a("words_source", "recom_search").mo59973a("words_content", this.f69971c.getWord()).mo59973a("group_id", this.f69971c.getId()).f60753a);
            C27012a aVar = this.f69969a.f69964a;
            if (aVar != null) {
                aVar.handleGuessWordItemClick(this.f69971c, this.f69969a.getAdapterPosition());
            }
        }
    }

    /* renamed from: a */
    private final void m87205a() {
        ViewGroup viewGroup = this.f69965b;
        if (viewGroup != null) {
            C1273i layoutManager = ((RecyclerView) viewGroup).getLayoutManager();
            if (layoutManager != null) {
                int a = ((GridLayoutManager) layoutManager).f4721g.mo5387a(getAdapterPosition(), 2);
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    if (a % 2 == 0) {
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = C23486n.m77122a(8.0d);
                    } else {
                        marginLayoutParams.leftMargin = C23486n.m77122a(8.0d);
                        marginLayoutParams.rightMargin = 0;
                    }
                    View view2 = this.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    view2.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
    }

    /* renamed from: a */
    private final void m87207a(Word word) {
        if (!word.isShowed()) {
            word.setShowed(true);
            C6907h.m21524a("trending_words_show", (Map) C22984d.m75611a().mo59970a("words_position", getPosition()).mo59973a("words_source", "recom_search").mo59973a("words_content", word.getWord()).mo59973a("group_id", word.getId()).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo29214a(Object obj, int i) {
        C7573i.m23587b(obj, "item");
        m87205a();
        if (obj instanceof Word) {
            m87206a(i, (Word) obj);
        }
    }

    public SingleItemWithImageViewHolder(View view, ViewGroup viewGroup) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(viewGroup, "parent");
        super(view);
        this.f69965b = viewGroup;
        this.f69966d = (RemoteImageView) view.findViewById(R.id.b_c);
        this.f69967e = (DmtTextView) view.findViewById(R.id.e38);
        this.f69968f = view.findViewById(R.id.cc4);
    }

    /* renamed from: a */
    private final void m87206a(int i, Word word) {
        CharSequence charSequence;
        if (word.getWord() == null) {
            View view = this.f69968f;
            C7573i.m23582a((Object) view, "placeHolderView");
            view.setVisibility(0);
            RemoteImageView remoteImageView = this.f69966d;
            C7573i.m23582a((Object) remoteImageView, "coverView");
            remoteImageView.setVisibility(4);
        } else {
            View view2 = this.f69968f;
            C7573i.m23582a((Object) view2, "placeHolderView");
            view2.setVisibility(4);
            RemoteImageView remoteImageView2 = this.f69966d;
            C7573i.m23582a((Object) remoteImageView2, "coverView");
            remoteImageView2.setVisibility(0);
        }
        if (word.getWord() != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(word.getWord());
            if (word.getWordType() > 0 && word.getWordType() <= C30351a.f79773c.length) {
                View view3 = this.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                Drawable a = C0683b.m2903a(view3.getContext(), C30351a.f79773c[word.getWordType() - 1]);
                if (a != null) {
                    a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
                    View view4 = this.itemView;
                    C7573i.m23582a((Object) view4, "itemView");
                    Context context = view4.getContext();
                    C7573i.m23582a((Object) context, "itemView.context");
                    C27273a aVar = new C27273a(context, a, 4, 0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
                    spannableStringBuilder2.setSpan(aVar, 0, 1, 17);
                    spannableStringBuilder.append(spannableStringBuilder2);
                }
            }
            DmtTextView dmtTextView = this.f69967e;
            C7573i.m23582a((Object) dmtTextView, "textView");
            dmtTextView.setText(spannableStringBuilder);
            Params params = word.getParams();
            String str = null;
            if (params != null) {
                charSequence = params.getWordImg();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                RemoteImageView remoteImageView3 = this.f69966d;
                Params params2 = word.getParams();
                if (params2 != null) {
                    str = params2.getWordImg();
                }
                C23323e.m76514a(remoteImageView3, str);
            }
        }
        this.itemView.setOnClickListener(new C26523b(this, i, word));
        m87207a(word);
    }
}
