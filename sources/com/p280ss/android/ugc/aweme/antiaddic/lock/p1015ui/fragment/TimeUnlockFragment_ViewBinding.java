package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeUnlockFragment_ViewBinding */
public class TimeUnlockFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TimeUnlockFragment f60238a;

    public void unbind() {
        TimeUnlockFragment timeUnlockFragment = this.f60238a;
        if (timeUnlockFragment != null) {
            this.f60238a = null;
            timeUnlockFragment.desc = null;
            timeUnlockFragment.title = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TimeUnlockFragment_ViewBinding(TimeUnlockFragment timeUnlockFragment, View view) {
        this.f60238a = timeUnlockFragment;
        timeUnlockFragment.desc = (TextView) Utils.findOptionalViewAsType(view, R.id.e6j, "field 'desc'", TextView.class);
        timeUnlockFragment.title = (TextView) Utils.findOptionalViewAsType(view, R.id.e7d, "field 'title'", TextView.class);
    }
}
