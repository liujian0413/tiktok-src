package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p022v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicWithLyricTabFragment_ViewBinding */
public class NewMusicWithLyricTabFragment_ViewBinding extends NewMusicTabFragment_ViewBinding {

    /* renamed from: a */
    private NewMusicWithLyricTabFragment f63210a;

    public void unbind() {
        NewMusicWithLyricTabFragment newMusicWithLyricTabFragment = this.f63210a;
        if (newMusicWithLyricTabFragment != null) {
            this.f63210a = null;
            newMusicWithLyricTabFragment.mVpFragmentContainer = null;
            newMusicWithLyricTabFragment.mFrameLayout = null;
            newMusicWithLyricTabFragment.mTextView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NewMusicWithLyricTabFragment_ViewBinding(NewMusicWithLyricTabFragment newMusicWithLyricTabFragment, View view) {
        super(newMusicWithLyricTabFragment, view);
        this.f63210a = newMusicWithLyricTabFragment;
        newMusicWithLyricTabFragment.mVpFragmentContainer = (ViewPager) Utils.findRequiredViewAsType(view, R.id.ama, "field 'mVpFragmentContainer'", ViewPager.class);
        newMusicWithLyricTabFragment.mFrameLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.cp0, "field 'mFrameLayout'", FrameLayout.class);
        newMusicWithLyricTabFragment.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.bwb, "field 'mTextView'", TextView.class);
    }
}
