package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView_ViewBinding */
public class MusicDragView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicDragView f102081a;

    /* renamed from: b */
    private View f102082b;

    public void unbind() {
        MusicDragView musicDragView = this.f102081a;
        if (musicDragView != null) {
            this.f102081a = null;
            musicDragView.mKTVView = null;
            musicDragView.mTextViewTimeStart = null;
            musicDragView.mTextViewTotalTime = null;
            musicDragView.cutMusicLayout = null;
            musicDragView.slideContainer = null;
            this.f102082b.setOnClickListener(null);
            this.f102082b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicDragView_ViewBinding(final MusicDragView musicDragView, View view) {
        this.f102081a = musicDragView;
        musicDragView.mKTVView = (KTVView) Utils.findRequiredViewAsType(view, R.id.bfv, "field 'mKTVView'", KTVView.class);
        musicDragView.mTextViewTimeStart = (TextView) Utils.findRequiredViewAsType(view, R.id.e2_, "field 'mTextViewTimeStart'", TextView.class);
        musicDragView.mTextViewTotalTime = (TextView) Utils.findRequiredViewAsType(view, R.id.du3, "field 'mTextViewTotalTime'", TextView.class);
        musicDragView.cutMusicLayout = (DmtCutMusicLayout) Utils.findRequiredViewAsType(view, R.id.a5u, "field 'cutMusicLayout'", DmtCutMusicLayout.class);
        musicDragView.slideContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.d7n, "field 'slideContainer'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b8_, "method 'next'");
        this.f102082b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDragView.next();
            }
        });
        musicDragView.mTimeString = view.getContext().getResources().getString(R.string.e_x);
    }
}
