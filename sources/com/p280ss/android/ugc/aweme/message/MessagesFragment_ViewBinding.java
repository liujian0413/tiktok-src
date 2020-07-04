package com.p280ss.android.ugc.aweme.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.message.widget.PagerIndicator;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.message.MessagesFragment_ViewBinding */
public class MessagesFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MessagesFragment f86408a;

    /* renamed from: b */
    private View f86409b;

    /* renamed from: c */
    private View f86410c;

    public void unbind() {
        MessagesFragment messagesFragment = this.f86408a;
        if (messagesFragment != null) {
            this.f86408a = null;
            messagesFragment.mStatusBarView = null;
            messagesFragment.mTvNoticeAdd = null;
            messagesFragment.mViewPager = null;
            messagesFragment.pagerIndicator = null;
            messagesFragment.mAddFriendIv = null;
            this.f86409b.setOnClickListener(null);
            this.f86409b = null;
            this.f86410c.setOnClickListener(null);
            this.f86410c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MessagesFragment_ViewBinding(final MessagesFragment messagesFragment, View view) {
        this.f86408a = messagesFragment;
        messagesFragment.mStatusBarView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBarView'");
        View findRequiredView = Utils.findRequiredView(view, R.id.dhv, "field 'mTvNoticeAdd' and method 'noticeViewClick'");
        messagesFragment.mTvNoticeAdd = (TextView) Utils.castView(findRequiredView, R.id.dhv, "field 'mTvNoticeAdd'", TextView.class);
        this.f86409b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                messagesFragment.noticeViewClick();
            }
        });
        messagesFragment.mViewPager = (RtlViewPager) Utils.findRequiredViewAsType(view, R.id.edr, "field 'mViewPager'", RtlViewPager.class);
        messagesFragment.pagerIndicator = (PagerIndicator) Utils.findRequiredViewAsType(view, R.id.e, "field 'pagerIndicator'", PagerIndicator.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e5, "field 'mAddFriendIv' and method 'addFriendViewClick'");
        messagesFragment.mAddFriendIv = (ImageView) Utils.castView(findRequiredView2, R.id.e5, "field 'mAddFriendIv'", ImageView.class);
        this.f86410c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                messagesFragment.addFriendViewClick();
            }
        });
    }
}
