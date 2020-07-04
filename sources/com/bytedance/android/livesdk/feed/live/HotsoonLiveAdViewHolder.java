package com.bytedance.android.livesdk.feed.live;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.dislike.C5972a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdkapi.depend.model.live.C9368k;
import com.bytedance.android.livesdkapi.depend.model.live.C9368k.C9370b;
import com.bytedance.android.livesdkapi.p434a.C9286a;
import com.bytedance.android.livesdkapi.p434a.C9288c;
import com.bytedance.android.livesdkapi.p452h.C9418f;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

public class HotsoonLiveAdViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: b */
    public FeedItem f17909b;

    /* renamed from: c */
    public boolean f17910c;

    /* renamed from: d */
    public boolean f17911d;

    /* renamed from: e */
    protected final C5980f f17912e;

    /* renamed from: f */
    protected final FeedDataKey f17913f;

    /* renamed from: g */
    private HSImageView f17914g;

    /* renamed from: h */
    private TextView f17915h;

    /* renamed from: i */
    private TextView f17916i;

    /* renamed from: j */
    private TextView f17917j;

    /* renamed from: k */
    private ImageView f17918k;

    /* renamed from: l */
    private int f17919l = -1;

    /* renamed from: m */
    private View f17920m;

    /* renamed from: n */
    private boolean f17921n;

    /* renamed from: o */
    private boolean f17922o;

    /* renamed from: p */
    private C9286a f17923p;

    /* renamed from: q */
    private C7486b<Object> f17924q;

    /* renamed from: r */
    private C7486b<Object> f17925r;

    /* renamed from: s */
    private C9288c f17926s;

    /* renamed from: m */
    private static String m18912m() {
        return "feed_ad";
    }

    /* renamed from: d */
    public final void mo10321d() {
        super.mo10321d();
        m18914o();
    }

    /* renamed from: q */
    private void m18916q() {
        if (this.f17926s != null) {
            ((C9368k) this.f17909b.item).mo23058a(1);
        }
    }

    /* renamed from: a */
    public final void mo10317a() {
        super.mo10317a();
        m18905f();
        m18910k();
    }

    /* renamed from: c */
    public final void mo10320c() {
        super.mo10320c();
        m18911l();
        m18913n();
    }

    /* renamed from: e */
    private void m18904e() {
        C5951b.m18637b().mo14576p();
        this.itemView.getContext();
        this.itemView.hashCode();
    }

    /* renamed from: f */
    private void m18905f() {
        if (this.f17909b != null) {
            C5951b.m18637b().mo14576p();
            this.itemView.getContext();
            this.itemView.hashCode();
        }
    }

    /* renamed from: k */
    private void m18910k() {
        if (this.f17922o) {
            this.f17922o = false;
            if (this.f17909b != null) {
                C5951b.m18637b().mo14576p();
                this.itemView.getContext();
            }
        }
    }

    /* renamed from: h */
    private void m18907h() {
        this.f17912e.mo14612a(this.f17913f, String.valueOf(this.f17909b.item.getId()));
        C5951b.m18637b().mo14576p();
        this.itemView.getContext();
        C3517a.m12960a(this.itemView.getContext(), (int) R.string.eka);
    }

    /* renamed from: i */
    private void m18908i() {
        this.f17912e.mo14612a(this.f17913f, String.valueOf(this.f17909b.item.getId()));
        C3517a.m12960a(this.itemView.getContext(), (int) R.string.eka);
        this.f17910c = false;
    }

    /* renamed from: j */
    private void m18909j() {
        if (!this.f17922o) {
            this.f17922o = true;
            if (this.f17909b != null) {
                C5951b.m18637b().mo14576p();
                this.itemView.getContext();
                new Object[1][0] = new Object() {
                };
            }
        }
    }

    /* renamed from: n */
    private void m18913n() {
        if (this.f17926s != null && this.f17909b != null && this.f17909b.item != null && (this.f17909b.item instanceof C9368k)) {
            ((C9368k) this.f17909b.item).mo23058a(1);
        }
    }

    /* renamed from: p */
    private void m18915p() {
        m18904e();
        m18913n();
        if (this.f17910c) {
            m18908i();
            this.f17910c = false;
        }
        if (this.f17911d) {
            C5951b.m18637b().mo14576p();
            this.itemView.getContext();
        }
        if (this.f17926s != null) {
            ((C9368k) this.f17909b.item).mo23058a(1);
        }
    }

    /* renamed from: l */
    private void m18911l() {
        if (this.f17909b != null && this.f17909b.item != null && (this.f17909b.item instanceof C9368k)) {
            C9368k kVar = (C9368k) this.f17909b.item;
            C5951b.m18637b().mo14576p();
            this.itemView.getContext();
            m18912m();
            kVar.getId();
            kVar.mo23059a();
            C5951b.m18637b().mo14576p();
            this.itemView.getContext();
            Object[] objArr = {this.f17909b.adJSONObject, "show"};
        }
    }

    /* renamed from: o */
    private void m18914o() {
        if (!(this.f17926s == null || this.f17909b == null || this.f17909b.item == null || !(this.f17909b.item instanceof C9368k))) {
            C9368k kVar = (C9368k) this.f17909b.item;
            try {
                JSONObject a = this.f17926s.mo22774a(kVar.mo23058a(1));
                JSONObject a2 = kVar.mo23059a();
                if (a != null) {
                    long optLong = a.optLong("duration", 0);
                    a.put("play_50", a.optLong("play_100", 0));
                    a.remove("duration");
                    a2.put("duration", optLong);
                    a2.put("ad_extra_data", a);
                }
                C5951b.m18637b().mo14576p();
                this.itemView.getContext();
                kVar.getId();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: g */
    private boolean m18906g() {
        int[] iArr = new int[2];
        this.itemView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        View view = (View) this.itemView.getParent();
        view.getLocationInWindow(iArr2);
        int a = C3358ac.m12510a(78.0f);
        int max = Math.max(0, iArr2[1] - iArr[1]);
        int height = (this.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + this.itemView.getHeight()) - iArr2[1]) - view.getHeight());
        float f = ((float) a) / 2.0f;
        if (((float) height) < (((float) this.itemView.getHeight()) / 2.0f) + f) {
            return false;
        }
        View inflate = View.inflate(this.itemView.getContext(), R.layout.av0, null);
        View findViewById = inflate.findViewById(R.id.a97);
        ((LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) this.itemView.getHeight()) / 2.0f) - f) - ((float) max));
        PopupWindow popupWindow = new PopupWindow(inflate, this.itemView.getWidth(), height, true);
        inflate.setOnClickListener(new C6048aa(popupWindow));
        findViewById.setOnClickListener(new C6068s(this, popupWindow));
        popupWindow.showAtLocation(this.itemView, 51, iArr[0], iArr[1] + max);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo14720c(Object obj) throws Exception {
        m18915p();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14718b(Object obj) throws Exception {
        m18916q();
    }

    /* renamed from: a */
    private void m18901a(String str) {
        if (!(this.f17909b == null || this.f17909b.item == null || !(this.f17909b.item instanceof C9368k))) {
            C9368k kVar = (C9368k) this.f17909b.item;
            if (kVar.f25679b.equals("app")) {
                C5951b.m18637b().mo14576p();
                this.itemView.getContext();
                m18912m();
                return;
            }
            kVar.mo23060a(str, 0);
            C5951b.m18637b().mo14576p();
            this.itemView.getContext();
            m18912m();
            kVar.getId();
            C5951b.m18637b().mo14576p();
            this.itemView.getContext();
            Object[] objArr = {this.f17909b.adJSONObject, "click"};
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo14716a(View view) {
        boolean g = m18906g();
        if (g) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14714a(PopupWindow popupWindow, View view) {
        m18907h();
        C6049ab.m18946a(popupWindow);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14717b(FeedItem feedItem, View view) {
        m18903b(feedItem, 2);
        m18901a("image");
    }

    /* renamed from: b */
    private void m18903b(FeedItem feedItem, int i) {
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C9368k)) {
            C5951b.m18637b().mo14576p();
            this.itemView.getContext();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo14719c(FeedItem feedItem, View view) {
        m18903b(feedItem, 1);
        m18901a("title");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14715a(FeedItem feedItem, View view) {
        m18903b(feedItem, 3);
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C9368k) && !TextUtils.equals(((C9368k) feedItem.item).f25679b, "app")) {
            m18901a("more_button");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10072a(FeedItem feedItem, int i) {
        this.f17909b = feedItem;
        m18909j();
        if (this.f17919l <= 0) {
            this.f17919l = C9738o.m28691a(this.f17914g.getContext());
        }
        this.f17914g.setLayoutParams(new RelativeLayout.LayoutParams(this.f17919l, this.f17919l));
        if (feedItem != null && (feedItem.item instanceof C9368k)) {
            C9368k kVar = (C9368k) feedItem.item;
            this.f17915h.setOnClickListener(new C6067r(this, feedItem));
            this.itemView.setOnClickListener(new C6069t(this, feedItem));
            if (this.f17921n) {
                this.itemView.setOnLongClickListener(new C6070u(this));
            } else {
                this.itemView.setOnLongClickListener(null);
            }
            this.f17920m.setOnClickListener(new C6071v(this, feedItem));
            if (!C6307b.m19566a((Collection<T>) kVar.f25681d) && kVar.f25681d.get(0) != null && !C6307b.m19566a((Collection<T>) ((C9370b) kVar.f25681d.get(0)).f25708c)) {
                this.f17914g.setImageURI((String) ((C9370b) kVar.f25681d.get(0)).f25708c.get(0));
            }
            if (!TextUtils.isEmpty(kVar.f25667A)) {
                this.f17915h.setText(kVar.f25667A);
                this.f17915h.setVisibility(0);
            } else {
                this.f17915h.setVisibility(8);
            }
            if (!TextUtils.isEmpty(kVar.f25668B)) {
                this.f17917j.setText(kVar.f25668B);
            }
            this.f17916i.setText(kVar.f25692o);
            m18904e();
            if (this.f17924q != null) {
                mo10318a(this.f17924q.mo19280a((C7326g<? super T>) new C6072w<Object>(this), C6073x.f17968a));
            }
            if (this.f17925r != null) {
                mo10318a(this.f17925r.mo19280a((C7326g<? super T>) new C6074y<Object>(this), C6075z.f17970a));
            }
        }
    }

    public HotsoonLiveAdViewHolder(View view, C5972a aVar, C5980f fVar, FeedDataKey feedDataKey, C6037j jVar, C9418f fVar2, C7486b<FeedItem> bVar, C7486b<Boolean> bVar2, C7486b<Object> bVar3, C7486b<Object> bVar4) {
        boolean z;
        super(view);
        this.f17914g = (HSImageView) view.findViewById(R.id.b5q);
        this.f17915h = (TextView) view.findViewById(R.id.title);
        this.f17916i = (TextView) view.findViewById(R.id.dqb);
        this.f17918k = (ImageView) view.findViewById(R.id.b_k);
        this.f17920m = view.findViewById(R.id.dr);
        this.f17917j = (TextView) view.findViewById(R.id.c_);
        this.f17923p = new C6066q(this);
        if (feedDataKey == null || jVar == null || !jVar.mo14692b(feedDataKey.f17734c)) {
            z = false;
        } else {
            z = true;
        }
        this.f17921n = z;
        this.f17912e = fVar;
        this.f17913f = feedDataKey;
        this.f17924q = bVar3;
        this.f17925r = bVar4;
        this.f17926s = C5951b.m18637b().mo14576p().mo23199a();
    }
}
