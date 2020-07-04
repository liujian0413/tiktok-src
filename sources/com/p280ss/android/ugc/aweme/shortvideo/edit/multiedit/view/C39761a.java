package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.view.View;
import android.view.View.OnClickListener;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39709b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a */
public interface C39761a {
    /* renamed from: a */
    AbstractVideoEditView mo99182a();

    /* renamed from: a */
    void mo99183a(int i, int i2);

    /* renamed from: a */
    void mo99184a(FragmentActivity fragmentActivity, int i, AnimatorListenerAdapter animatorListenerAdapter);

    /* renamed from: a */
    void mo99185a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter);

    /* renamed from: a */
    void mo99186a(FragmentActivity fragmentActivity, View view);

    /* renamed from: a */
    void mo99187a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z);

    /* renamed from: a */
    void mo99188a(FragmentActivity fragmentActivity, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo99189a(C0902i<Float, Float> iVar);

    /* renamed from: a */
    void mo99190a(OnClickListener onClickListener);

    /* renamed from: a */
    void mo99191a(VideoSegment videoSegment);

    /* renamed from: a */
    void mo99192a(C39709b bVar);

    /* renamed from: a */
    void mo99193a(List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo99194a(boolean z);

    /* renamed from: a */
    void mo99195a(boolean z, int i);

    /* renamed from: b */
    void mo99196b(C0902i<Float, Float> iVar);

    /* renamed from: b */
    void mo99197b(VideoSegment videoSegment);

    /* renamed from: b */
    void mo99198b(boolean z);

    /* renamed from: b */
    boolean mo99199b();

    /* renamed from: c */
    void mo99200c();

    /* renamed from: d */
    C0902i<Float, Float> mo99201d();

    /* renamed from: e */
    boolean mo99202e();

    /* renamed from: f */
    void mo99203f();

    /* renamed from: g */
    void mo99204g();

    /* renamed from: h */
    void mo99205h();

    /* renamed from: i */
    void mo99206i();

    /* renamed from: j */
    void mo99207j();

    /* renamed from: k */
    View mo99208k();
}
