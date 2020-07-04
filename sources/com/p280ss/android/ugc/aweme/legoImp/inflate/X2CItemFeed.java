package com.p280ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.core.C12133n;
import com.p063by.inflate_lib.C2058a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C7149b;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed */
public class X2CItemFeed extends X2CBaseInflate {
    protected WeakReference<Activity> mActivityWeakReference;
    private ConcurrentHashMap<Integer, View> viewCache = new ConcurrentHashMap<>();

    /* access modifiers changed from: protected */
    public int cacheCount() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public int[] layoutResId() {
        return new int[]{R.layout.item_feed, R.layout.layout_feed_avatar, R.layout.addiction_hint, R.layout.layout_video_share, R.layout.layout_video_comment_count, R.layout.layout_video_desc, R.layout.layout_video_digg, R.layout.layout_video_tag, R.layout.view_video_hot_search_bar, R.layout.layout_video_cover_music, R.layout.layout_video_title_music, R.layout.view_video_progress_bar, R.layout.layout_video_post_time, R.layout.view_video_mix_bar, R.layout.a6a, R.layout.b4y};
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$getView$0$X2CItemFeed(int i) {
        ConcurrentHashMap<Integer, View> concurrentHashMap = this.viewCache;
        Activity activity = (Activity) this.mActivityWeakReference.get();
        if (concurrentHashMap != null && activity != null) {
            concurrentHashMap.put(Integer.valueOf(i), C2058a.m9122a(activity, i, new FrameLayout(activity), false));
        }
    }

    public void inflate(Context context, Activity activity) {
        super.inflate(context, activity);
        if (this.mActivityWeakReference == null && activity != null) {
            C12133n.m35301a("").mo29838a(activity).mo29854b();
        }
        this.mActivityWeakReference = new WeakReference<>(activity);
    }

    public View getView(Context context, int i) {
        if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(context)) {
            if (!(this.viewCache == null && this.mActivityWeakReference.get() == null)) {
                this.viewCache = null;
                this.mActivityWeakReference.clear();
            }
            if (context instanceof C23149d) {
                return ((C23149d) context).getInflater().mo60290a(i);
            }
            if (isX2CAsyncInflateOpen() || isX2COpen()) {
                return C2058a.m9122a(context, i, new FrameLayout(context), false);
            }
            return LayoutInflater.from(context).inflate(i, new FrameLayout(context), false);
        } else if (isX2CAsyncInflateOpen()) {
            int size = this.viewCaches.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) ((SparseArray) this.viewCaches.get(i2)).get(i);
                if (view != null) {
                    ((SparseArray) this.viewCaches.get(i2)).remove(i);
                    if (!(i2 != size - 1 || this.mActivityWeakReference.get() == null || this.viewCache == null)) {
                        C7149b.m22312b().postDelayed(new C32347f(this, i), 500);
                    }
                    return view;
                }
            }
            if (!(this.viewCache == null || this.mActivityWeakReference.get() == context)) {
                this.viewCache.clear();
                this.viewCache = null;
            }
            if (this.viewCache != null) {
                View view2 = (View) this.viewCache.get(Integer.valueOf(i));
                if (view2 != null) {
                    this.viewCache.remove(Integer.valueOf(i));
                    return view2;
                }
            }
            return C2058a.m9122a(context, i, new FrameLayout(context), false);
        } else if (isX2COpen()) {
            return C2058a.m9122a(context, i, new FrameLayout(context), false);
        } else {
            return LayoutInflater.from(context).inflate(i, new FrameLayout(context), false);
        }
    }
}
