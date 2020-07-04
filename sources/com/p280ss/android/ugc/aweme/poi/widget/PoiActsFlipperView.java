package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.R$styleable;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiActsFlipperView */
public class PoiActsFlipperView extends ViewFlipper {

    /* renamed from: a */
    private List<PoiClassRankBannerStruct> f93035a;

    /* renamed from: b */
    private int f93036b;

    /* renamed from: c */
    private int f93037c;

    /* renamed from: d */
    private PoiSimpleBundle f93038d;

    /* renamed from: e */
    private C35471a f93039e;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiActsFlipperView$a */
    public interface C35471a {
    }

    public int getCurrentPosition() {
        return getDisplayedChild();
    }

    /* renamed from: c */
    private void m114593c() {
        if (this.f93039e != null) {
            getCurrentItem();
            getDisplayedChild();
        }
    }

    /* renamed from: b */
    public final void mo90208b() {
        if (isFlipping()) {
            stopFlipping();
        }
    }

    /* renamed from: a */
    public final void mo90206a() {
        if (!isFlipping() && this.f93035a.size() >= 2) {
            showNext();
            startFlipping();
        }
    }

    public PoiClassRankBannerStruct getCurrentItem() {
        int displayedChild = getDisplayedChild();
        if (displayedChild < 0 || displayedChild >= this.f93035a.size()) {
            return null;
        }
        return (PoiClassRankBannerStruct) this.f93035a.get(displayedChild);
    }

    public void setOnItemChangeListener(C35471a aVar) {
        this.f93039e = aVar;
    }

    public PoiActsFlipperView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private TextView m114590a(PoiClassRankBannerStruct poiClassRankBannerStruct) {
        TextView textView = new TextView(getContext());
        textView.setSingleLine();
        textView.setText(poiClassRankBannerStruct.getDescription());
        textView.setTextSize(1, (float) this.f93036b);
        textView.setEllipsize(TruncateAt.END);
        textView.setTextColor(this.f93037c);
        textView.setGravity(8388627);
        return textView;
    }

    public void setDisplayedChild(int i) {
        int displayedChild = getDisplayedChild();
        super.setDisplayedChild(i);
        int displayedChild2 = getDisplayedChild();
        if (displayedChild != displayedChild2) {
            m114593c();
            int size = displayedChild2 % this.f93035a.size();
            m114592a((PoiClassRankBannerStruct) this.f93035a.get(size), size);
        }
    }

    public PoiActsFlipperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m114591a(context, attributeSet);
    }

    /* renamed from: a */
    private void m114591a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HotSearchWordsFlipperView);
        this.f93036b = obtainStyledAttributes.getInt(2, 15);
        this.f93037c = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.ab5));
        this.f93035a = new ArrayList();
        setFlipInterval(5000);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.al));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.am));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m114592a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        C35454m.m114523a(this.f93038d, "banner_show", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("previous_page", this.f93038d.getPreviousPage()).mo59973a("banner_id", poiClassRankBannerStruct.getBid()).mo59970a("client_order", i).mo59973a("city_info", C33230ac.m107204a()).mo59973a("from_poi_id", this.f93038d.getPoiId()));
    }

    /* renamed from: a */
    public final void mo90207a(List<PoiClassRankBannerStruct> list, PoiSimpleBundle poiSimpleBundle) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f93038d = poiSimpleBundle;
            if (isFlipping()) {
                stopFlipping();
            }
            this.f93035a.clear();
            this.f93035a.addAll(list);
            Collections.shuffle(this.f93035a);
            removeAllViews();
            for (int i = 0; i < this.f93035a.size(); i++) {
                PoiClassRankBannerStruct poiClassRankBannerStruct = (PoiClassRankBannerStruct) this.f93035a.get(i);
                addView(m114590a(poiClassRankBannerStruct), new LayoutParams(-1, -1));
                if (i == 0) {
                    m114592a(poiClassRankBannerStruct, 0);
                }
            }
            if (this.f93035a.size() >= 2) {
                startFlipping();
            }
        }
    }
}
