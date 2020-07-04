package com.p280ss.android.ugc.aweme.main.story.feed;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.p280ss.android.ugc.aweme.commercialize.p1122e.C24623b;
import com.p280ss.android.ugc.aweme.commercialize.p1122e.C24626e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.IMainBottomInflate;
import com.p280ss.android.ugc.aweme.main.story.C33090g;
import com.p280ss.android.ugc.aweme.main.story.live.C33092a;
import com.p280ss.android.ugc.aweme.main.story.live.C33101b;
import com.p280ss.android.ugc.aweme.main.story.live.C33104d;
import com.p280ss.android.ugc.aweme.main.story.live.view.C33107b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.C7217x;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel */
public class StoryFeedPanel extends IViewDefault<C33086b> implements C0042h, C7217x {
    public static final int HEIGHT = (C23486n.m77122a(90.0d) + C23482j.m77101d());
    public static final int MIN_DISTANCE = C23486n.m77122a(8.0d);
    private boolean isVisible;
    private int lastX;
    private int lastY;
    private C33092a livePageItemView;
    private C33104d mAvatars;
    private C24626e mCommerceLiveController;
    private String mEnterFrom;
    int mFirstVisiblePos;
    private Rect mFirstVisibleRect = new Rect();
    private String mFrom = "homepage_hot";
    private boolean mIsBig;
    private boolean mIsShowStatusBarHeight = true;
    int mLastVisiblePos = 4;
    private Rect mLastVisibleRect = new Rect();
    private LinearLayoutManager mLinearLayoutManager;
    private BaseRecyclerView mRecyclerView;
    private View mRootView;
    private C33086b mViewModel;
    private AnimationImageView switchView;

    public boolean isVisible() {
        return this.isVisible;
    }

    private int getPanelPaddingTop() {
        return C23486n.m77122a(12.0d) + getRealStatusBarHeight();
    }

    private void initListeners() {
        this.mRecyclerView.mo5528a((C1281m) new C1281m() {

            /* renamed from: a */
            boolean f86079a = true;

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f86079a = z;
                StoryFeedPanel.this.logChangedHeads(this.f86079a);
            }
        });
    }

    public void logOnTabChange() {
        if (this.isVisible) {
            logOnLiveRecommendShow(this.isVisible);
        }
    }

    public void logWithLive() {
        if (this.isVisible) {
            logOnHeadExpand();
            logOnLiveRecommendShow(this.isVisible);
        }
    }

    public void refresh() {
        if (this.mViewModel != null) {
            bind(this.mViewModel);
            logWithLive();
        }
    }

    private int getRealStatusBarHeight() {
        if (!this.mIsShowStatusBarHeight || VERSION.SDK_INT < 19) {
            return 0;
        }
        return C9738o.m28717e(C6399b.m19921a());
    }

    public boolean isLivePageItemViewVisiable() {
        if (this.livePageItemView == null || this.livePageItemView.mo84813c().getVisibility() != 0) {
            return false;
        }
        return true;
    }

    private void logOnHeadExpand() {
        if (!C6307b.m19566a((Collection<T>) this.mViewModel.f86083b)) {
            int l = this.mLinearLayoutManager.mo5447l();
            int i = 0;
            for (C23360e eVar : this.mViewModel.f86083b) {
                if (i >= l) {
                    break;
                } else if (eVar instanceof StoryFeedItemViewModel) {
                    logShowHeads2Remote((StoryFeedItemViewModel) eVar, getContext(), i);
                    i++;
                }
            }
        }
    }

    public void onChanged() {
        if (this.livePageItemView != null && (this.mView instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.mView;
            viewGroup.removeView(this.livePageItemView.mo84813c());
            this.livePageItemView = C33101b.m106843a(this.mView.getContext(), this.mIsBig);
            View c = this.livePageItemView.mo84813c();
            if (c != null) {
                viewGroup.addView(c, 0);
            }
            this.livePageItemView.mo84810a(this.mAvatars);
            if (this.mCommerceLiveController != null) {
                this.mCommerceLiveController.mo64477a(viewGroup);
            }
        }
    }

    private void initViews() {
        int i;
        int i2;
        if (this.mView != null) {
            if (!this.mIsBig) {
                i = HEIGHT;
            } else if (this.mIsShowStatusBarHeight) {
                if (VERSION.SDK_INT >= 19) {
                    i2 = C9738o.m28717e(C6399b.m19921a());
                } else {
                    i2 = 0;
                }
                i = C23486n.m77122a(105.0d) + i2;
            } else {
                i = C23486n.m77122a(105.0d);
            }
            this.mView.setLayoutParams(new LayoutParams(-1, i));
            this.mView.setPadding(this.mView.getPaddingLeft(), getPanelPaddingTop(), this.mView.getPaddingRight(), this.mView.getPaddingBottom());
            this.mLinearLayoutManager = new WrapLinearLayoutManager(getContext(), 0, false);
            this.mRecyclerView.setLayoutManager(this.mLinearLayoutManager);
            this.mView.setBackgroundDrawable(C23487o.m77134a(Orientation.LEFT_RIGHT, C23481i.m77088a(R.color.aae), C23481i.m77088a(R.color.aad)));
        }
    }

    public void setFrom(String str) {
        this.mFrom = str;
    }

    public void bindWithoutRefresh(C33086b bVar) {
        this.mViewModel = bVar;
        bVar.mo60672a(this);
    }

    public void updateEnterFrom(String str) {
        this.mEnterFrom = str;
        this.livePageItemView.mo84811a(str);
    }

    public void bind(C33086b bVar) {
        this.mViewModel = bVar;
        bVar.mo60672a(this);
        C23487o.m77139a((RecyclerView) this.mRecyclerView, bVar.mo84804a(getContext()));
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume(C0043i iVar) {
        if (this.mViewModel != null) {
            C1262a a = this.mViewModel.mo84804a(getContext());
            if (a.getItemCount() > 0) {
                a.notifyDataSetChanged();
            }
        }
    }

    public void setLivePageAnimation(boolean z) {
        if (!this.mIsBig) {
            if (!z || !this.isVisible) {
                this.livePageItemView.mo84809a();
            } else {
                this.livePageItemView.mo84812b();
            }
        }
    }

    public void setLivePageItemView(C33104d dVar) {
        if (this.livePageItemView != null) {
            this.mAvatars = dVar;
            this.livePageItemView.mo84810a(this.mAvatars);
            if (this.mCommerceLiveController != null) {
                this.mCommerceLiveController.mo64478c();
            }
        }
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
        if (z) {
            C41989d.m133495c(this.mEnterFrom);
            this.livePageItemView.mo84812b();
            C24623b.m80726b();
            return;
        }
        this.livePageItemView.mo84809a();
    }

    public StoryFeedPanel(Context context) {
        super(context);
        if (C0043i.class.isAssignableFrom(context.getClass())) {
            ((C0043i) context).getLifecycle().mo55a(this);
        }
    }

    private void logOnLiveRecommendShow(boolean z) {
        String str;
        if (this.mViewModel != null && z && this.livePageItemView != null && this.livePageItemView.mo84813c().getVisibility() == 0) {
            String str2 = this.mViewModel.f86085d;
            if (this.mIsBig) {
                C34138b.m109999b(str2);
                str = "toplist_homepage_follow";
            } else {
                str = this.mViewModel.f86087f;
            }
            C41989d.m133487a(str2, this.mFrom, this.livePageItemView.mo84813c() instanceof C33107b);
            C41989d.m133488a(str, this.livePageItemView.mo84813c() instanceof C33107b);
        }
    }

    public void logChangedHeads(boolean z) {
        int i;
        int j = this.mLinearLayoutManager.mo5445j();
        int l = this.mLinearLayoutManager.mo5447l();
        if (j != -1 && l != -1) {
            View c = this.mLinearLayoutManager.mo5432c(j);
            c.getLocalVisibleRect(this.mFirstVisibleRect);
            View c2 = this.mLinearLayoutManager.mo5432c(l);
            c2.getGlobalVisibleRect(this.mLastVisibleRect);
            int i2 = 0;
            if (this.mFirstVisibleRect.right > 0) {
                i = this.mFirstVisibleRect.right;
            } else {
                i = 0;
            }
            if (this.mFirstVisibleRect.left > 0) {
                i2 = this.mFirstVisibleRect.left;
            }
            float measuredWidth = (((float) (i - i2)) * 1.0f) / ((float) c.getMeasuredWidth());
            float measuredWidth2 = (((float) (this.mLastVisibleRect.right - this.mLastVisibleRect.left)) * 1.0f) / ((float) c2.getMeasuredWidth());
            if (((double) measuredWidth) < 0.5d) {
                j++;
            }
            if (((double) measuredWidth2) < 0.5d) {
                l--;
            }
            if (!z) {
                if (this.mFirstVisiblePos > j) {
                    int i3 = this.mFirstVisiblePos;
                    for (int i4 = j; i4 < i3; i4++) {
                        logShowHeads2Remote(this.mViewModel.mo84805a(i4), getContext(), i4);
                    }
                    this.mFirstVisiblePos = j;
                }
                if (this.mLastVisiblePos != l) {
                    this.mLastVisiblePos = l;
                    return;
                }
            } else {
                if (this.mLastVisiblePos < l) {
                    int i5 = l + 1;
                    for (int i6 = this.mLastVisiblePos + 1; i6 < i5; i6++) {
                        logShowHeads2Remote(this.mViewModel.mo84805a(i6), getContext(), i6);
                    }
                    this.mLastVisiblePos = l;
                }
                if (this.mFirstVisiblePos == j) {
                    this.mLastVisiblePos = l;
                    return;
                }
            }
            this.mFirstVisiblePos = j;
        }
    }

    public StoryFeedPanel(Context context, AnimationImageView animationImageView) {
        super(context);
        this.switchView = animationImageView;
    }

    public void setPanelVisibility(int i, boolean z) {
        if (this.switchView != null) {
            this.switchView.setVisibility(0);
            if (i != 0) {
                this.switchView.setAnimation(C33090g.m106822a("story_open"));
                this.switchView.mo7078b();
            }
        }
        if (this.mIsBig || z) {
            this.mRootView.setVisibility(i);
        }
    }

    public StoryFeedPanel create(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.mView = linearLayout;
        linearLayout.setOrientation(0);
        this.livePageItemView = C33101b.m106843a(context, this.mIsBig);
        if (this.livePageItemView.mo84813c() != null) {
            linearLayout.addView(this.livePageItemView.mo84813c(), 0);
        }
        if (!this.mIsBig) {
            this.mCommerceLiveController = C24623b.m80723a(context);
            this.mCommerceLiveController.mo64477a(linearLayout);
        }
        C7213d.m22500a().mo18735a((C7217x) this);
        if (C6399b.m19944t()) {
            this.mRecyclerView = new BaseRecyclerView(context) {
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                        case 2:
                            getParent().requestDisallowInterceptTouchEvent(true);
                            break;
                        case 1:
                        case 3:
                            getParent().requestDisallowInterceptTouchEvent(false);
                            break;
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 1:
                        case 3:
                            getParent().requestDisallowInterceptTouchEvent(false);
                            break;
                        case 2:
                            getParent().requestDisallowInterceptTouchEvent(true);
                            break;
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
        } else {
            this.mRecyclerView = ((IMainBottomInflate) C7121a.m22249b(IMainBottomInflate.class)).getBaseRecyclerView(context);
        }
        linearLayout.addView(this.mRecyclerView, new LayoutParams(-1, -1));
        initListeners();
        initViews();
        viewGroup.addView(this.mView);
        this.mRootView = viewGroup;
        setPanelVisibility(8, true);
        return this;
    }

    private void logShowHeads2Remote(C23360e eVar, Context context, int i) {
        String str;
        if (eVar != null) {
            boolean z = eVar instanceof StoryFeedItemViewModel;
            if (z) {
                JSONObject jSONObject = new JSONObject();
                StoryFeedItemViewModel storyFeedItemViewModel = (StoryFeedItemViewModel) eVar;
                try {
                    jSONObject.put("request_id", storyFeedItemViewModel.f86060c);
                } catch (JSONException unused) {
                }
                if (storyFeedItemViewModel.mo84778e() && C41983b.m133444a()) {
                    if (this.mIsBig) {
                        str = "homepage_follow";
                    } else {
                        str = "homepage_hot";
                    }
                    C41989d.m133470a(getContext(), 0, storyFeedItemViewModel.f86060c, storyFeedItemViewModel.mo84781h(), storyFeedItemViewModel.f86062e, str);
                    if (z) {
                        storyFeedItemViewModel.f86061d = this.mIsBig;
                        C41989d.m133479a(storyFeedItemViewModel.mo84781h(), storyFeedItemViewModel.f86062e, storyFeedItemViewModel.mo84782i(), storyFeedItemViewModel.f86060c, i, storyFeedItemViewModel.f86066i.mo84758a().f109095a.type, false, "", "others_photo");
                    }
                } else if (storyFeedItemViewModel.mo84779f()) {
                    try {
                        jSONObject.put(POIService.KEY_ORDER, storyFeedItemViewModel.mo84776c());
                    } catch (JSONException unused2) {
                    }
                    C6907h.m21521a(context, "head_show", "toplist", storyFeedItemViewModel.mo84780g(), "0", jSONObject);
                } else {
                    C6907h.m21521a(context, "show", "story_head", storyFeedItemViewModel.mo84780g(), "0", jSONObject);
                }
            }
        }
    }

    public StoryFeedPanel create(Context context, ViewGroup viewGroup, boolean z, boolean z2) {
        this.mIsBig = z;
        this.mIsShowStatusBarHeight = z2;
        return create(context, viewGroup);
    }
}
