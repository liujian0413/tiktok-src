package com.p280ss.android.ugc.aweme.follow.p1263ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import com.p280ss.android.ugc.aweme.base.widget.divider.DividerViewModel;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.follow.p1259b.C29445c;
import com.p280ss.android.ugc.aweme.main.story.C33075f;
import com.p280ss.android.ugc.aweme.main.story.C33091h;
import com.p280ss.android.ugc.aweme.main.story.feed.C33085a;
import com.p280ss.android.ugc.aweme.main.story.feed.C33086b;
import com.p280ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewBig;
import com.p280ss.android.ugc.aweme.main.story.feed.StoryFeedPanel;
import com.p280ss.android.ugc.aweme.story.model.C42005d.C42006a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder */
public class HeaderViewHolder extends C1293v implements C33075f {

    /* renamed from: a */
    StoryFeedPanel f77853a;

    /* renamed from: b */
    public C33086b f77854b;

    /* renamed from: c */
    ViewGroup f77855c;

    /* renamed from: d */
    public boolean f77856d = true;

    /* renamed from: e */
    public boolean f77857e;

    /* renamed from: com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder$StoryPanelScrollHelper */
    static class StoryPanelScrollHelper {
        private WeakReference<HeaderViewHolder> mHostHolder;
        private int mStoryPanelHeight;

        public void setStoryPanelHeight(int i) {
            this.mStoryPanelHeight = i;
        }

        StoryPanelScrollHelper(HeaderViewHolder headerViewHolder) {
            this.mHostHolder = new WeakReference<>(headerViewHolder);
        }

        public void setScrollY(int i) {
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) this.mHostHolder.get();
            if (headerViewHolder != null) {
                C10994a.m32204a(C6399b.m19921a());
                ViewGroup viewGroup = (ViewGroup) headerViewHolder.f77855c.getParent().getParent();
                if (viewGroup instanceof FpsRecyclerView) {
                    ((FpsRecyclerView) viewGroup).setTop(-(this.mStoryPanelHeight + i));
                }
            }
        }
    }

    /* renamed from: b */
    private void m97065b() {
        if (this.f77854b != null && C21115b.m71197a().isLogin()) {
            this.f77856d = true;
            this.f77854b.mo84807a(false);
        }
    }

    /* renamed from: a */
    public final void mo75543a() {
        C21750a aVar = new C21750a();
        aVar.f58255a = 2;
        aVar.f58256b = getAdapterPosition();
        C42961az.m136380a(aVar);
    }

    /* renamed from: f_ */
    public final void mo75546f_(boolean z) {
        if (this.f77853a != null) {
            this.f77853a.setVisible(z);
            if (z) {
                this.f77853a.refresh();
            }
        }
    }

    @C7709l
    public void onEvent(C33091h hVar) {
        if (this.f77854b != null && C21115b.m71197a().isLogin()) {
            this.f77854b.mo84807a(false);
        }
    }

    public HeaderViewHolder(View view) {
        super(view);
        this.f77855c = (ViewGroup) view.findViewById(R.id.am5);
        this.f77854b = new C33086b(StoryFeedItemViewBig.class);
        this.f77854b.f86086e = new C33085a() {
            /* renamed from: a */
            public final void mo75548a(List<C23360e> list, C42006a aVar) {
                if (HeaderViewHolder.this.f77856d) {
                    HeaderViewHolder.this.f77856d = false;
                    if ((list == null || list.isEmpty() || (list.size() == 1 && (list.get(0) instanceof DividerViewModel))) && !HeaderViewHolder.this.f77853a.isLivePageItemViewVisiable()) {
                        HeaderViewHolder.this.mo75543a();
                        HeaderViewHolder.this.f77857e = false;
                        C42961az.m136380a(new C29445c(false));
                        return;
                    }
                    if (!HeaderViewHolder.this.f77857e) {
                        HeaderViewHolder.this.f77855c.getLayoutParams().height = -2;
                        View view = (View) HeaderViewHolder.this.f77855c.getParent();
                        HeaderViewHolder.this.mo75542a(view, view.getHeight(), HeaderViewHolder.this.f77853a.getAndroidView().getLayoutParams().height).start();
                        HeaderViewHolder.this.f77857e = true;
                    }
                    C42961az.m136380a(new C29445c(true));
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo75544a(int i) {
        if (this.f77853a.getAndroidView() != null) {
            this.f77853a.getAndroidView().setBackgroundColor(i);
        }
    }

    /* renamed from: a */
    public final void mo75545a(Context context, boolean z) {
        m97066b(context, false);
        m97065b();
    }

    /* renamed from: b */
    private void m97066b(Context context, boolean z) {
        if (this.f77853a == null) {
            this.f77853a = new StoryFeedPanel(context).create(context, this.f77855c, true, z);
            this.f77853a.setFrom("homepage_follow");
            this.f77853a.setVisible(true);
            this.f77853a.bind(this.f77854b);
        }
        if (!this.f77857e) {
            this.f77855c.getLayoutParams().height = 0;
            ((ViewGroup) this.f77855c.getParent()).getLayoutParams().height = 0;
        }
    }

    /* renamed from: a */
    public final ValueAnimator mo75542a(final View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = intValue;
                view.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(150);
        return ofInt;
    }
}
