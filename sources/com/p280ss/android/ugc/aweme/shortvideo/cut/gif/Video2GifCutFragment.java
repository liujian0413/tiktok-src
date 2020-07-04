package com.p280ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.util.C0902i;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.mediaplayer.C33187a;
import com.p280ss.android.ugc.aweme.mediaplayer.C33188b;
import com.p280ss.android.ugc.aweme.mediaplayer.C33194h;
import com.p280ss.android.ugc.aweme.mediaplayer.C33195i;
import com.p280ss.android.ugc.aweme.mediaplayer.C33196j;
import com.p280ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment */
public class Video2GifCutFragment extends Fragment {

    /* renamed from: h */
    private static final double f100705h = ((double) RecordingSpeed.FAST.value());

    /* renamed from: a */
    public MediaPlayerModule f100706a;

    /* renamed from: b */
    public CutMultiVideoViewModel f100707b;

    /* renamed from: c */
    public VideoEditViewModel f100708c;

    /* renamed from: d */
    public VideoShare2GifEditContext f100709d;

    /* renamed from: e */
    public Handler f100710e = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                Video2GifCutFragment.this.f100707b.mo96665a(((Long) message.obj).longValue(), Video2GifCutFragment.this.f100708c.mo97720m());
            }
        }
    };

    /* renamed from: f */
    public Runnable f100711f = new Runnable() {
        public final void run() {
            if (Video2GifCutFragment.this.f100706a != null) {
                Video2GifCutFragment.this.f100710e.obtainMessage(0, Long.valueOf(Video2GifCutFragment.this.f100706a.f86357b.mo84950f())).sendToTarget();
                Video2GifCutFragment.this.f100710e.postDelayed(Video2GifCutFragment.this.f100711f, 30);
            }
        }
    };
    @BindView(2131493181)
    FrameLayout flVideoContainer;

    /* renamed from: g */
    private boolean f100712g;

    /* renamed from: i */
    private C0053p<C33195i> f100713i = new C38756a(this);
    @BindView(2131493518)
    ImageView ivPlay;
    @BindView(2131493844)
    TextureView textureVideoView;
    @BindView(2131493942)
    DmtTextView tvSelectedTime;
    @BindView(2131493968)
    VideoEditView videoEditView;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: i */
    private void m123769i() {
        this.f100710e.post(this.f100711f);
    }

    /* renamed from: j */
    private void m123770j() {
        this.f100710e.removeCallbacks(this.f100711f);
    }

    /* renamed from: k */
    private void m123771k() {
        this.flVideoContainer.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int i;
                if (Video2GifCutFragment.this.f100709d != null) {
                    Video2GifCutFragment.this.flVideoContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int height = Video2GifCutFragment.this.flVideoContainer.getHeight();
                    int width = Video2GifCutFragment.this.flVideoContainer.getWidth();
                    int[] a = FFMpegManager.m64569a().mo51828a(Video2GifCutFragment.this.f100709d.f99031a);
                    if (a[0] == 0) {
                        int i2 = a[2];
                        int i3 = a[3];
                        Video2GifCutFragment.this.f100709d.f99037g = i2;
                        Video2GifCutFragment.this.f100709d.f99038h = i3;
                        LayoutParams layoutParams = new LayoutParams(-1, -1);
                        if (i2 < i3) {
                            layoutParams.width = (i2 * height) / i3;
                            layoutParams.height = height;
                            layoutParams.leftMargin = (width - layoutParams.width) / 2;
                            layoutParams.topMargin = 0;
                        } else {
                            layoutParams.width = width;
                            layoutParams.height = (i3 * width) / i2;
                            layoutParams.topMargin = (height - layoutParams.height) / 2;
                            if (layoutParams.topMargin >= 0) {
                                i = layoutParams.topMargin;
                            } else {
                                i = 0;
                            }
                            layoutParams.topMargin = i;
                            layoutParams.leftMargin = 0;
                        }
                        if (VERSION.SDK_INT >= 17) {
                            layoutParams.setMarginStart(layoutParams.leftMargin);
                        }
                        Video2GifCutFragment.this.f100709d.f99039i = layoutParams.width;
                        Video2GifCutFragment.this.f100709d.f99040j = layoutParams.height;
                        Video2GifCutFragment.this.flVideoContainer.setLayoutParams(layoutParams);
                    }
                    FFMpegManager.m64569a().mo51829b();
                }
            }
        });
    }

    /* renamed from: c */
    private C33194h m123763c() {
        C33194h hVar = new C33194h();
        hVar.f86374c = true;
        hVar.f86372a = (float) f100705h;
        hVar.f86373b = 0.0f;
        hVar.f86376e = this.videoEditView.getMaxCutDuration();
        return hVar;
    }

    /* renamed from: l */
    private void m123772l() {
        if (getActivity() != null) {
            C9738o.m28693a((Context) getActivity(), (int) R.string.cus);
            getActivity().finish();
        }
    }

    /* renamed from: e */
    private void m123765e() {
        if (this.videoEditView.getPlayBoundary() != null && this.videoEditView.getPlayBoundary().f3155b != null) {
            this.f100706a.f86357b.mo84946c(((Long) this.videoEditView.getPlayBoundary().f3155b).longValue());
            m123768h();
        }
    }

    /* renamed from: f */
    private void m123766f() {
        if (this.videoEditView.getPlayBoundary() != null && this.videoEditView.getPlayBoundary().f3154a != null) {
            this.f100706a.f86357b.mo84943b(((Long) this.videoEditView.getPlayBoundary().f3154a).longValue());
            m123768h();
        }
    }

    /* renamed from: g */
    private void m123767g() {
        C0902i singleVideoPlayBoundary = this.videoEditView.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f3154a != null && singleVideoPlayBoundary.f3155b != null) {
            this.f100706a.f86357b.mo84940a(((Long) singleVideoPlayBoundary.f3154a).longValue(), ((Long) singleVideoPlayBoundary.f3155b).longValue());
            this.f100706a.f86357b.mo84936a(this.videoEditView.getSinglePlayingPosition());
        }
    }

    /* renamed from: a */
    private void m123761a() {
        if (getActivity() == null) {
            m123772l();
            return;
        }
        this.f100707b = (CutMultiVideoViewModel) C0069x.m159a(getActivity()).mo147a(CutMultiVideoViewModel.class);
        this.f100708c = (VideoEditViewModel) C0069x.m159a(getActivity()).mo147a(VideoEditViewModel.class);
        this.f100709d = (VideoShare2GifEditContext) getArguments().getParcelable("extra_edit_context");
        if (this.f100709d == null) {
            m123772l();
        }
    }

    /* renamed from: d */
    private void m123764d() {
        this.f100708c.f101837b.observe(this, new C38763b(this));
        this.f100708c.f101839d.observe(this, new C38764c(this));
        this.f100708c.f101838c.observe(this, new C38765d(this));
        this.f100708c.f101840e.observe(this, new C38766e(this));
        this.f100708c.f101841f.observe(this, new C38767f(this));
        this.f100708c.f101846k.observe(this, new C38768g(this));
    }

    /* renamed from: h */
    private void m123768h() {
        this.tvSelectedTime.setText(getString(R.string.cb0, C1642a.m8035a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.videoEditView.getSelectedTime())})));
        C0902i singleVideoPlayBoundary = this.videoEditView.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f3154a != null && singleVideoPlayBoundary.f3155b != null) {
            this.f100709d.f99043m = ((Long) singleVideoPlayBoundary.f3154a).longValue();
            this.f100709d.f99044n = ((Long) singleVideoPlayBoundary.f3155b).longValue();
        }
    }

    /* renamed from: b */
    private void m123762b() {
        C33187a aVar;
        if (VERSION.SDK_INT >= 21) {
            this.textureVideoView.setClipToOutline(true);
            this.textureVideoView.setOutlineProvider(new C43070ds(C23486n.m77122a(4.0d)));
        }
        m123771k();
        this.videoEditView.setMinVideoLength(2000);
        this.videoEditView.setMaxVideoLength(C40413c.f105051b);
        if (this.videoEditView.mo97632a(getActivity(), this.f100707b, this.f100709d.f99031a) || getActivity() == null) {
            m123764d();
            try {
                if (C35563c.f93231M.mo93305a(Property.RemoveIESMediaPlayer)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C39811er.f103469e);
                    sb.append("video2gif_workspace");
                    String sb2 = sb.toString();
                    C7276d.m22822e(sb2);
                    aVar = new C33196j(sb2, this.textureVideoView);
                } else {
                    aVar = new C33188b(getActivity());
                }
                this.f100706a = new MediaPlayerModule(aVar, m123763c());
                this.f100706a.f86356a = this.f100709d.f99031a;
                this.f100706a.f86358c.observe(this, this.f100713i);
                this.f100706a.mo84923a(this.textureVideoView, false);
                getLifecycle().mo55a(this.f100706a);
            } catch (Exception unused) {
                m123772l();
            }
        } else {
            getActivity().finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96836a(Float f) {
        m123768h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo96839b(Void voidR) {
        m123766f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo96840c(Void voidR) {
        m123765e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96838a(Void voidR) {
        m123767g();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m123761a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96837a(Long l) {
        if (l != null) {
            this.f100706a.f86357b.mo84936a(l.longValue());
        }
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493844})
    public void resolveUiClick(View view) {
        if (view.getId() == R.id.dij) {
            this.f100706a.mo84922a();
        }
    }

    /* renamed from: a */
    public static Video2GifCutFragment m123760a(VideoShare2GifEditContext videoShare2GifEditContext) {
        Video2GifCutFragment video2GifCutFragment = new Video2GifCutFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_edit_context", videoShare2GifEditContext);
        video2GifCutFragment.setArguments(bundle);
        return video2GifCutFragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96835a(Boolean bool) {
        boolean z;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f100712g = z;
        if (bool == null || !bool.booleanValue()) {
            this.f100706a.mo84927c();
        } else {
            this.f100706a.mo84926b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96834a(C33195i iVar) {
        if (iVar != null) {
            switch (iVar.f86378b) {
                case 1:
                    if (!iVar.f86377a) {
                        m123772l();
                        return;
                    } else if (this.f100709d != null) {
                        this.f100709d.f99034d = (int) this.f100706a.f86357b.mo84949e();
                        return;
                    }
                    break;
                case 2:
                case 4:
                    this.ivPlay.setVisibility(8);
                    if (iVar.f86377a) {
                        m123769i();
                        return;
                    }
                    break;
                case 3:
                case 5:
                    if (iVar.f86377a && !this.f100712g) {
                        m123770j();
                        this.ivPlay.setVisibility(0);
                        return;
                    }
                case 6:
                    if (iVar.f86377a) {
                        this.ivPlay.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        m123762b();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rx, viewGroup, false);
    }
}
