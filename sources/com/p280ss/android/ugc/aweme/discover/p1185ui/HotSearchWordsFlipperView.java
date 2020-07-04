package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView */
public class HotSearchWordsFlipperView extends ViewFlipper implements GenericLifecycleObserver {

    /* renamed from: a */
    private List<C26906a> f71008a;

    /* renamed from: b */
    private int f71009b;

    /* renamed from: c */
    private int f71010c;

    /* renamed from: d */
    private C26907b f71011d;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView$a */
    public static class C26906a {

        /* renamed from: a */
        public final HotSearchItem f71012a;

        /* renamed from: b */
        public final AdDefaultSearchStruct f71013b;

        /* renamed from: a */
        public final int mo69610a() {
            if (this.f71013b != null) {
                return 2;
            }
            return 1;
        }

        /* renamed from: b */
        public final String mo69611b() {
            if (this.f71013b != null) {
                return this.f71013b.getDefaultWord();
            }
            return this.f71012a.getWord();
        }

        /* renamed from: c */
        public final String mo69612c() {
            if (this.f71013b != null) {
                return this.f71013b.getSearchWord();
            }
            return this.f71012a.getRealSearchWord();
        }

        public C26906a(AdDefaultSearchStruct adDefaultSearchStruct) {
            this.f71013b = adDefaultSearchStruct;
        }

        public C26906a(HotSearchItem hotSearchItem) {
            this.f71012a = hotSearchItem;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView$b */
    public interface C26907b {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo69603c() {
        showNext();
    }

    /* renamed from: e */
    private void m88384e() {
        if (this.f71011d != null) {
            getCurrentItem();
            getDisplayedChild();
        }
        m88383d();
    }

    /* renamed from: b */
    public final void mo69602b() {
        if (isFlipping()) {
            stopFlipping();
        }
    }

    public void dismiss() {
        mo69602b();
        setVisibility(8);
    }

    public String getCurrentDisplayedWord() {
        C26906a currentItem = getCurrentItem();
        if (currentItem != null) {
            return currentItem.mo69611b();
        }
        return null;
    }

    public String getCurrentOperatedWord() {
        C26906a currentItem = getCurrentItem();
        if (currentItem != null) {
            return currentItem.mo69612c();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo69599a() {
        setVisibility(0);
        if (!isFlipping()) {
            showNext();
            startFlipping();
        }
    }

    public C26906a getCurrentItem() {
        int displayedChild = getDisplayedChild();
        if (displayedChild < 0 || displayedChild >= this.f71008a.size()) {
            return null;
        }
        return (C26906a) this.f71008a.get(displayedChild);
    }

    /* renamed from: d */
    private void m88383d() {
        C26906a currentItem = getCurrentItem();
        if (currentItem != null && currentItem.mo69610a() == 2) {
            C24962g.m81952a((C24939aj) new C27004ai(this, currentItem), currentItem.f71013b.getAdData().getTrackUrlList(), true);
            C24958f.m81905a().mo65266a("result_ad").mo65276b("hot_search_keyword_show").mo65283e("default_search_keyword").mo65286h(currentItem.f71013b.getAdData().getLogExtra()).mo65264a(currentItem.f71013b.getAdData().getCreativeId()).mo65270a(getContext());
        }
    }

    public void setOnItemChangeListener(C26907b bVar) {
        this.f71011d = bVar;
    }

    public HotSearchWordsFlipperView(Context context) {
        this(context, null);
    }

    public void setDisplayedChild(int i) {
        int displayedChild = getDisplayedChild();
        super.setDisplayedChild(i);
        if (displayedChild != getDisplayedChild()) {
            m88384e();
        }
    }

    /* renamed from: a */
    private TextView m88381a(C26906a aVar) {
        TextView textView = new TextView(getContext());
        textView.setSingleLine();
        textView.setText(aVar.mo69611b());
        textView.setTextSize(1, (float) this.f71009b);
        textView.setEllipsize(TruncateAt.END);
        textView.setTextColor(this.f71010c);
        textView.setGravity(8388627);
        return textView;
    }

    public HotSearchWordsFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m88382a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        if (event == Event.ON_RESUME) {
            postDelayed(new C27003ah(this), 100);
        }
    }

    /* renamed from: a */
    private void m88382a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HotSearchWordsFlipperView);
        int i = obtainStyledAttributes.getInt(0, 2) * 1000;
        this.f71009b = obtainStyledAttributes.getColor(2, 15);
        this.f71010c = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.ab5));
        this.f71008a = new ArrayList();
        int intValue = ((Integer) SharePrefCache.inst().getHotSearchWordsShowInterval().mo59877d()).intValue() * 1000;
        if (intValue <= 0) {
            intValue = i;
        }
        setFlipInterval(intValue);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.al));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.am));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo69601a(List<HotSearchItem> list, List<AdDefaultSearchStruct> list2) {
        if (C6307b.m19566a((Collection<T>) list)) {
            setVisibility(8);
            return;
        }
        if (isFlipping()) {
            stopFlipping();
        }
        this.f71008a.clear();
        for (HotSearchItem aVar : list) {
            this.f71008a.add(new C26906a(aVar));
        }
        Collections.shuffle(this.f71008a);
        if (list2 != null) {
            for (AdDefaultSearchStruct adDefaultSearchStruct : list2) {
                this.f71008a.add(Math.max(0, Math.min(adDefaultSearchStruct.getPosition() - 1, this.f71008a.size())), new C26906a(adDefaultSearchStruct));
            }
        }
        removeAllViews();
        for (int i = 0; i < this.f71008a.size(); i++) {
            addView(m88381a((C26906a) this.f71008a.get(i)), new LayoutParams(-1, -1));
        }
        m88383d();
        startFlipping();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69600a(C26906a aVar, String str, String str2, long j) {
        C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65263a(aVar.f71013b.getAdData()).mo65270a(getContext());
    }
}
