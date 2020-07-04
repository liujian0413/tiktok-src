package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.p280ss.android.ugc.aweme.widget.flowlayout.C43554a;
import com.p280ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.p280ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder */
public final class GuessWordsViewHolder extends BaseWordViewHolder<Word> {

    /* renamed from: h */
    public static final List<Word> f69487h;

    /* renamed from: i */
    public static final List<Word> f69488i;

    /* renamed from: j */
    public static final C26384a f69489j = new C26384a(null);

    /* renamed from: g */
    public C27012a f69490g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder$a */
    public static final class C26384a {
        private C26384a() {
        }

        public /* synthetic */ C26384a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static GuessWordsViewHolder m86813a(ViewGroup viewGroup, C27012a aVar) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wl, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new GuessWordsViewHolder(inflate, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder$b */
    public static final class C26385b extends C43554a<Word> {

        /* renamed from: a */
        final /* synthetic */ GuessWordsViewHolder f69491a;

        /* renamed from: b */
        final /* synthetic */ List f69492b;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder$b$a */
        public static final class C26386a extends C27009an {

            /* renamed from: a */
            final /* synthetic */ C26385b f69493a;

            /* renamed from: b */
            final /* synthetic */ int f69494b;

            /* renamed from: c */
            final /* synthetic */ Word f69495c;

            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C7573i.m23587b(view, "view");
                C7573i.m23587b(motionEvent, "event");
                C6907h.m21524a("trending_words_click", (Map) C22984d.m75611a().mo59970a("words_position", this.f69494b).mo59973a("words_source", "recom_search").mo59973a("words_content", this.f69495c.getWord()).mo59973a("group_id", this.f69495c.getId()).f60753a);
                C27012a aVar = this.f69493a.f69491a.f69490g;
                if (aVar != null) {
                    aVar.handleGuessWordItemClick(this.f69495c, this.f69494b);
                }
            }

            C26386a(C26385b bVar, int i, Word word) {
                this.f69493a = bVar;
                this.f69494b = i;
                this.f69495c = word;
            }
        }

        C26385b(GuessWordsViewHolder guessWordsViewHolder, List list, List list2) {
            this.f69491a = guessWordsViewHolder;
            this.f69492b = list;
            super(list2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View mo67958a(FlowLayout flowLayout, int i, Word word) {
            C7573i.m23587b(flowLayout, "parent");
            C7573i.m23587b(word, "item");
            View view = this.f69491a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.wm, flowLayout, false);
            TextView textView = (TextView) inflate.findViewById(R.id.dvv);
            C7573i.m23582a((Object) textView, "word");
            textView.setText(word.getWord());
            inflate.setOnTouchListener(new C26386a(this, i, word));
            C7573i.m23582a((Object) inflate, "root");
            return inflate;
        }
    }

    /* renamed from: b */
    public final void mo67915b() {
        C6907h.m21524a("trending_show", (Map) C22984d.m75611a().mo59970a("words_num", this.f69432f.size()).mo59973a("words_source", "recom_search").f60753a);
        super.mo67917c();
    }

    static {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new Word());
        List<Word> unmodifiableList = Collections.unmodifiableList(arrayList);
        C7573i.m23582a((Object) unmodifiableList, "Collections.unmodifiableList(placeholder)");
        f69487h = unmodifiableList;
        ArrayList arrayList2 = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            arrayList2.add(new Word());
        }
        List<Word> unmodifiableList2 = Collections.unmodifiableList(arrayList2);
        C7573i.m23582a((Object) unmodifiableList2, "Collections.unmodifiableList(placeholder)");
        f69488i = unmodifiableList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67912a() {
        this.f69427a.setText(R.string.bcs);
        TextView textView = this.f69427a;
        C7573i.m23582a((Object) textView, "mTitle");
        TextPaint paint = textView.getPaint();
        C7573i.m23582a((Object) paint, "mTitle.paint");
        paint.setFakeBoldText(true);
        this.f69427a.setTextSize(1, 14.0f);
        TextView textView2 = this.f69427a;
        TextView textView3 = this.f69427a;
        C7573i.m23582a((Object) textView3, "mTitle");
        Context context = textView3.getContext();
        C7573i.m23582a((Object) context, "mTitle.context");
        textView2.setTextColor(context.getResources().getColor(R.color.lv));
        TextView textView4 = this.f69427a;
        C7573i.m23582a((Object) textView4, "mTitle");
        Context context2 = textView4.getContext();
        C7573i.m23582a((Object) context2, "mTitle.context");
        Drawable drawable = context2.getResources().getDrawable(R.drawable.a86);
        C7573i.m23582a((Object) drawable, "drawable");
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        TextView textView5 = this.f69427a;
        C7573i.m23582a((Object) textView5, "mTitle");
        textView5.setCompoundDrawablePadding(C23486n.m77122a(7.5d));
        this.f69427a.setCompoundDrawables(drawable, null, null, null);
        C23487o.m77140a(this.f69431e, 8);
        C23487o.m77140a(this.f69430d, 8);
        this.f69429c.setMaxLine(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo67916b(List<Word> list) {
        C7573i.m23587b(list, "list");
        if (!C7573i.m23585a((Object) list, (Object) f69487h)) {
            return false;
        }
        C23487o.m77140a(this.f69428b, 0);
        C23487o.m77140a((View) this.f69429c, 8);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo67918c(List<Word> list) {
        C7573i.m23587b(list, "list");
        C23487o.m77140a((View) this.f69429c, 0);
        C23487o.m77140a(this.f69428b, 8);
        this.f69432f = list;
        TagFlowLayout tagFlowLayout = this.f69429c;
        C7573i.m23582a((Object) tagFlowLayout, "mTagGroup");
        tagFlowLayout.setAdapter(new C26385b(this, list, list));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo67913a(Object obj, int i) {
        m86807a((Word) obj, i);
    }

    public GuessWordsViewHolder(View view, C27012a aVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        mo67912a();
        this.f69490g = aVar;
    }

    /* renamed from: a */
    private static void m86807a(Word word, int i) {
        C7573i.m23587b(word, "item");
        if (!word.isShowed()) {
            word.setShowed(true);
            C6907h.m21524a("trending_words_show", (Map) C22984d.m75611a().mo59970a("words_position", i).mo59973a("words_source", "recom_search").mo59973a("words_content", word.getWord()).mo59973a("group_id", word.getId()).f60753a);
        }
    }
}
