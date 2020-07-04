package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.p308ui.HollowTextView;
import com.p280ss.android.ugc.aweme.discover.adapter.DiscoverExpandAdapter;
import com.p280ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.C26383b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.f */
public final class C27040f extends RelativeLayout implements C26383b {

    /* renamed from: a */
    public boolean f71344a;

    /* renamed from: b */
    public boolean f71345b;

    /* renamed from: c */
    public int f71346c;

    /* renamed from: d */
    public int f71347d;

    /* renamed from: e */
    public DiscoverExpandAdapter f71348e;

    /* renamed from: f */
    private TextView f71349f;

    /* renamed from: g */
    private TextView f71350g;

    /* renamed from: h */
    private TextView f71351h;

    /* renamed from: i */
    private TextView f71352i;

    /* renamed from: j */
    private HollowTextView f71353j;

    /* renamed from: k */
    private ImageView f71354k;

    /* renamed from: l */
    private ImageView f71355l;

    /* renamed from: m */
    private ViewGroup f71356m;

    /* renamed from: n */
    private ViewGroup f71357n;

    /* renamed from: o */
    private ViewGroup f71358o;

    /* renamed from: p */
    private View f71359p;

    /* renamed from: q */
    private RecyclerView f71360q;

    /* renamed from: r */
    private C26383b f71361r;

    /* renamed from: s */
    private C27041a f71362s;

    /* renamed from: t */
    private C27043c f71363t;

    /* renamed from: u */
    private C27042b f71364u;

    /* renamed from: v */
    private int f71365v;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$a */
    public interface C27041a {
        /* renamed from: a */
        int mo69847a();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$b */
    public interface C27042b {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$c */
    public interface C27043c {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$d */
    static final class C27044d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C27040f f71366a;

        /* renamed from: b */
        final /* synthetic */ boolean f71367b;

        /* renamed from: c */
        final /* synthetic */ int f71368c;

        C27044d(C27040f fVar, boolean z, int i) {
            this.f71366a = fVar;
            this.f71367b = z;
            this.f71368c = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (!this.f71367b) {
                    ImageView mIvwClose = this.f71366a.getMIvwClose();
                    if (mIvwClose != null) {
                        mIvwClose.setAlpha(1.0f - floatValue);
                    }
                }
                ImageView mIvwArrow = this.f71366a.getMIvwArrow();
                if (mIvwArrow != null) {
                    mIvwArrow.setRotation(180.0f * floatValue);
                }
                ViewGroup mLltDetailContainer = this.f71366a.getMLltDetailContainer();
                if (mLltDetailContainer != null) {
                    mLltDetailContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer = this.f71366a.getMLltCardContainer();
                if (mLltCardContainer != null) {
                    mLltCardContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer2 = this.f71366a.getMLltCardContainer();
                if (mLltCardContainer2 != null) {
                    LayoutParams layoutParams = mLltCardContainer2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (((float) (this.f71366a.f71347d - this.f71366a.f71346c)) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer2 = this.f71366a.getMLltDetailContainer();
                if (mLltDetailContainer2 != null) {
                    LayoutParams layoutParams2 = mLltDetailContainer2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = (int) (((float) this.f71368c) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer3 = this.f71366a.getMLltDetailContainer();
                if (mLltDetailContainer3 != null) {
                    mLltDetailContainer3.requestLayout();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$e */
    public static final class C27045e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C27040f f71369a;

        /* renamed from: b */
        final /* synthetic */ boolean f71370b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f71369a.f71345b = false;
            if (!this.f71370b) {
                ImageView mIvwClose = this.f71369a.getMIvwClose();
                if (mIvwClose != null) {
                    mIvwClose.setVisibility(8);
                }
            }
        }

        C27045e(C27040f fVar, boolean z) {
            this.f71369a = fVar;
            this.f71370b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$f */
    static final class C27046f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C27040f f71371a;

        /* renamed from: b */
        final /* synthetic */ int f71372b;

        C27046f(C27040f fVar, int i) {
            this.f71371a = fVar;
            this.f71372b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ImageView mIvwClose = this.f71371a.getMIvwClose();
                if (mIvwClose != null) {
                    mIvwClose.setAlpha(1.0f - floatValue);
                }
                ImageView mIvwArrow = this.f71371a.getMIvwArrow();
                if (mIvwArrow != null) {
                    mIvwArrow.setRotation(180.0f * floatValue);
                }
                ViewGroup mLltDetailContainer = this.f71371a.getMLltDetailContainer();
                if (mLltDetailContainer != null) {
                    mLltDetailContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer = this.f71371a.getMLltCardContainer();
                if (mLltCardContainer != null) {
                    mLltCardContainer.setAlpha(floatValue);
                }
                ViewGroup mLltCardContainer2 = this.f71371a.getMLltCardContainer();
                if (mLltCardContainer2 != null) {
                    LayoutParams layoutParams = mLltCardContainer2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (((float) (this.f71371a.f71347d - this.f71371a.f71346c)) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer2 = this.f71371a.getMLltDetailContainer();
                if (mLltDetailContainer2 != null) {
                    LayoutParams layoutParams2 = mLltDetailContainer2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = (int) (((float) this.f71372b) * floatValue);
                    }
                }
                ViewGroup mLltDetailContainer3 = this.f71371a.getMLltDetailContainer();
                if (mLltDetailContainer3 != null) {
                    mLltDetailContainer3.requestLayout();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$g */
    public static final class C27047g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C27040f f71373a;

        C27047g(C27040f fVar) {
            this.f71373a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            ViewGroup mLltCardContainer = this.f71373a.getMLltCardContainer();
            if (mLltCardContainer != null) {
                mLltCardContainer.setVisibility(8);
            }
            ViewGroup mLltDetailContainer = this.f71373a.getMLltDetailContainer();
            if (mLltDetailContainer != null) {
                mLltDetailContainer.setVisibility(8);
            }
            this.f71373a.setBackgroundColor(0);
            this.f71373a.f71345b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.f$h */
    static final class C27048h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27040f f71374a;

        /* renamed from: b */
        final /* synthetic */ String f71375b;

        C27048h(C27040f fVar, String str) {
            this.f71374a = fVar;
            this.f71375b = str;
        }

        public final void run() {
            this.f71374a.setTitle(this.f71375b);
        }
    }

    public final C27041a getCurrentPositionProvider() {
        return this.f71362s;
    }

    public final ImageView getMIvwArrow() {
        return this.f71355l;
    }

    public final ImageView getMIvwClose() {
        return this.f71354k;
    }

    public final ViewGroup getMLltCardContainer() {
        return this.f71356m;
    }

    public final ViewGroup getMLltDetailContainer() {
        return this.f71357n;
    }

    public final RecyclerView getMRcvCardContainer() {
        return this.f71360q;
    }

    public final ViewGroup getMRltExpandContainer() {
        return this.f71358o;
    }

    public final TextView getMTvwContent() {
        return this.f71349f;
    }

    public final TextView getMTvwCounts() {
        return this.f71351h;
    }

    public final TextView getMTvwLink() {
        return this.f71352i;
    }

    public final HollowTextView getMTvwTag() {
        return this.f71353j;
    }

    public final TextView getMTvwTitle() {
        return this.f71350g;
    }

    public final View getMVwLineDivider() {
        return this.f71359p;
    }

    public final C27042b getOnButtonClickListener() {
        return this.f71364u;
    }

    public final C27043c getOnExpandStatusChangeLisenter() {
        return this.f71363t;
    }

    public final C26383b getOnItemClickListener() {
        return this.f71361r;
    }

    /* renamed from: b */
    private void m88803b() {
        if (this.f71344a) {
            m88804c();
        } else {
            m88802a(false);
        }
    }

    private final int getContentHeight() {
        int i;
        int i2;
        LayoutParams layoutParams;
        TextView textView = this.f71349f;
        int i3 = 0;
        if (textView != null) {
            i = textView.getMeasuredHeight();
        } else {
            i = 0;
        }
        View view = this.f71359p;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        TextView textView2 = this.f71352i;
        if (textView2 != null) {
            i3 = textView2.getMeasuredHeight();
        }
        int i5 = i4 + i3;
        TextView textView3 = this.f71352i;
        if (textView3 != null) {
            layoutParams = textView3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            return i5 + ((MarginLayoutParams) layoutParams).topMargin;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final int getLinkHeight() {
        int i;
        LayoutParams layoutParams;
        View view = this.f71359p;
        int i2 = 0;
        if (view != null) {
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        TextView textView = this.f71352i;
        if (textView != null) {
            i2 = textView.getMeasuredHeight();
        }
        int i3 = i + i2;
        TextView textView2 = this.f71352i;
        if (textView2 != null) {
            layoutParams = textView2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            return i3 + ((MarginLayoutParams) layoutParams).topMargin;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    private final void m88801a() {
        Integer num;
        int i;
        if (this.f71347d != 0) {
            int contentWidth = getContentWidth();
            TextView textView = this.f71352i;
            int i2 = 0;
            if (textView != null) {
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(contentWidth, 1073741824);
                TextView textView2 = this.f71352i;
                if (textView2 != null) {
                    LayoutParams layoutParams = textView2.getLayoutParams();
                    if (layoutParams != null) {
                        i = layoutParams.height;
                        textView.measure(makeMeasureSpec, i);
                    }
                }
                i = 0;
                textView.measure(makeMeasureSpec, i);
            }
            View view = this.f71359p;
            if (view != null) {
                int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(contentWidth, 1073741824);
                View view2 = this.f71359p;
                if (view2 != null) {
                    LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 != null) {
                        i2 = layoutParams2.height;
                    }
                }
                view.measure(makeMeasureSpec2, i2);
            }
            TextView textView3 = this.f71349f;
            if (textView3 != null) {
                textView3.measure(MeasureSpec.makeMeasureSpec(contentWidth, 1073741824), MeasureSpec.makeMeasureSpec((this.f71347d - this.f71346c) - getLinkHeight(), Integer.MIN_VALUE));
            }
            TextView textView4 = this.f71349f;
            if (textView4 != null) {
                LayoutParams layoutParams3 = textView4.getLayoutParams();
                if (layoutParams3 != null) {
                    TextView textView5 = this.f71349f;
                    if (textView5 != null) {
                        num = Integer.valueOf(textView5.getMeasuredHeight());
                    } else {
                        num = null;
                    }
                    layoutParams3.height = num.intValue();
                }
            }
        }
    }

    /* renamed from: c */
    private void m88804c() {
        if (!this.f71345b) {
            setClickable(false);
            this.f71345b = true;
            int contentHeight = getContentHeight();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            C7573i.m23582a((Object) ofFloat, "valueAnimator");
            ofFloat.setDuration(300);
            ImageView imageView = this.f71354k;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ofFloat.addUpdateListener(new C27046f(this, contentHeight));
            ofFloat.addListener(new C27047g(this));
            ofFloat.start();
            this.f71344a = false;
        }
    }

    private final int getContentWidth() {
        LayoutParams layoutParams;
        int i;
        ViewGroup viewGroup = this.f71356m;
        LayoutParams layoutParams2 = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            ViewGroup viewGroup2 = this.f71357n;
            if (viewGroup2 != null) {
                layoutParams2 = viewGroup2.getLayoutParams();
            }
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                int size = MeasureSpec.getSize(marginLayoutParams.width) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredWidth = getMeasuredWidth();
                ViewGroup viewGroup3 = this.f71358o;
                int i2 = 0;
                if (viewGroup3 != null) {
                    i = viewGroup3.getPaddingLeft();
                } else {
                    i = 0;
                }
                int i3 = measuredWidth - i;
                ViewGroup viewGroup4 = this.f71358o;
                if (viewGroup4 != null) {
                    i2 = viewGroup4.getPaddingRight();
                }
                return (((i3 - i2) - size) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setCurrentPositionProvider(C27041a aVar) {
        this.f71362s = aVar;
    }

    public final void setExpanded(boolean z) {
        this.f71344a = z;
    }

    public final void setMIvwArrow(ImageView imageView) {
        this.f71355l = imageView;
    }

    public final void setMIvwClose(ImageView imageView) {
        this.f71354k = imageView;
    }

    public final void setMLltCardContainer(ViewGroup viewGroup) {
        this.f71356m = viewGroup;
    }

    public final void setMLltDetailContainer(ViewGroup viewGroup) {
        this.f71357n = viewGroup;
    }

    public final void setMRcvCardContainer(RecyclerView recyclerView) {
        this.f71360q = recyclerView;
    }

    public final void setMRltExpandContainer(ViewGroup viewGroup) {
        this.f71358o = viewGroup;
    }

    public final void setMTvwContent(TextView textView) {
        this.f71349f = textView;
    }

    public final void setMTvwCounts(TextView textView) {
        this.f71351h = textView;
    }

    public final void setMTvwLink(TextView textView) {
        this.f71352i = textView;
    }

    public final void setMTvwTag(HollowTextView hollowTextView) {
        this.f71353j = hollowTextView;
    }

    public final void setMTvwTitle(TextView textView) {
        this.f71350g = textView;
    }

    public final void setMVwLineDivider(View view) {
        this.f71359p = view;
    }

    public final void setOnButtonClickListener(C27042b bVar) {
        this.f71364u = bVar;
    }

    public final void setOnExpandStatusChangeLisenter(C27043c cVar) {
        this.f71363t = cVar;
    }

    public final void setOnItemClickListener(C26383b bVar) {
        this.f71361r = bVar;
    }

    public final void setMaxHeight(int i) {
        this.f71347d = i;
        requestLayout();
    }

    private final void setContent(String str) {
        TextView textView = this.f71349f;
        if (textView != null) {
            textView.setText(str);
        }
        m88801a();
    }

    public final void setIsRecommend(boolean z) {
        int i;
        HollowTextView hollowTextView = this.f71353j;
        if (hollowTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            hollowTextView.setVisibility(i);
        }
    }

    public final void setData(List<Aweme> list) {
        Integer num;
        DiscoverExpandAdapter discoverExpandAdapter = this.f71348e;
        if (discoverExpandAdapter != null) {
            discoverExpandAdapter.mo67954a(list);
        }
        TextView textView = this.f71351h;
        if (textView != null) {
            Context context = getContext();
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = Integer.valueOf(0);
            }
            sb.append(num);
            objArr[0] = sb.toString();
            textView.setText(context.getString(R.string.ci4, objArr));
        }
    }

    /* renamed from: a */
    private void m88802a(boolean z) {
        int i;
        if (!this.f71345b) {
            setBackgroundColor(C27049g.m88807a());
            setClickable(true);
            DiscoverExpandAdapter discoverExpandAdapter = this.f71348e;
            if (discoverExpandAdapter != null) {
                C27041a aVar = this.f71362s;
                if (aVar != null) {
                    i = aVar.mo69847a();
                } else {
                    i = 0;
                }
                discoverExpandAdapter.m86798a(i, false);
            }
            int contentHeight = getContentHeight();
            this.f71345b = true;
            ViewGroup viewGroup = this.f71356m;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = this.f71357n;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            C7573i.m23582a((Object) ofFloat, "valueAnimator");
            ofFloat.setDuration(300);
            ofFloat.addUpdateListener(new C27044d(this, false, contentHeight));
            ofFloat.addListener(new C27045e(this, false));
            ofFloat.start();
            this.f71344a = true;
        }
    }

    public final void setTitle(String str) {
        LayoutParams layoutParams;
        boolean z;
        boolean z2;
        int i;
        if (this.f71358o != null) {
            ViewGroup viewGroup = this.f71358o;
            if (viewGroup == null) {
                C7573i.m23580a();
            }
            if (viewGroup.getMeasuredWidth() != 0) {
                TextView textView = this.f71350g;
                if (textView != null) {
                    layoutParams = textView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    ViewGroup viewGroup2 = this.f71358o;
                    if (viewGroup2 == null) {
                        C7573i.m23580a();
                    }
                    int measuredWidth = viewGroup2.getMeasuredWidth();
                    ViewGroup viewGroup3 = this.f71358o;
                    if (viewGroup3 == null) {
                        C7573i.m23580a();
                    }
                    int paddingRight = measuredWidth - viewGroup3.getPaddingRight();
                    ViewGroup viewGroup4 = this.f71358o;
                    if (viewGroup4 == null) {
                        C7573i.m23580a();
                    }
                    int paddingLeft = ((paddingRight - viewGroup4.getPaddingLeft()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                    CharSequence charSequence = str;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (str != null) {
                            str = C7634n.m23762b(charSequence).toString();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    CharSequence charSequence2 = str;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        str = " ";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.append(" ");
                    C27010ao aoVar = new C27010ao(this.f71350g, this.f71355l, 17, true, true);
                    aoVar.f71299a = (int) C9738o.m28708b(getContext(), 8.0f);
                    spannableStringBuilder.setSpan(aoVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
                    TextView textView2 = this.f71350g;
                    if (textView2 != null) {
                        i = textView2.getMaxLines();
                    } else {
                        i = 1;
                    }
                    SpannableStringBuilder a = C30357c.m99186a(spannableStringBuilder, textView2, paddingLeft, i, 1, aoVar.mo69792a(), false, this.f71355l, false);
                    C7573i.m23582a((Object) a, "TagUtil.ellipsizeText2Ex… false, mIvwArrow, false)");
                    TextView textView3 = this.f71350g;
                    if (textView3 != null) {
                        textView3.setText(a);
                    }
                    this.f71346c = 0;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        post(new C27048h(this, str));
    }

    /* renamed from: a */
    public final void mo67953a(View view, int i) {
        m88803b();
        C26383b bVar = this.f71361r;
        if (bVar != null) {
            bVar.mo67953a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f71346c == 0 || !(this.f71347d == 0 || this.f71365v == this.f71347d)) {
            if (this.f71346c == 0) {
                ViewGroup viewGroup = this.f71358o;
                if (viewGroup != null) {
                    i3 = viewGroup.getMeasuredHeight();
                } else {
                    i3 = 0;
                }
                this.f71346c = i3;
            }
            RecyclerView recyclerView = this.f71360q;
            if (recyclerView != null) {
                LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.f71347d - this.f71346c;
                }
            }
            this.f71365v = this.f71347d;
            m88801a();
        }
    }
}
