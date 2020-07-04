package com.p280ss.android.ugc.aweme.longvideonew.widget;

import android.arch.lifecycle.C0053p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideonew.C32799g;
import com.p280ss.android.ugc.aweme.longvideonew.feature.VolumeController;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.GenericWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget */
public final class VideoFunctionalLayerWidget extends GenericWidget implements C0053p<C23083a>, OnClickListener {

    /* renamed from: p */
    public static final C32808a f85585p = new C32808a(null);

    /* renamed from: a */
    public ImageView f85586a;

    /* renamed from: i */
    public AnimatedImageView f85587i;

    /* renamed from: j */
    public LineProgressBar f85588j;

    /* renamed from: k */
    public VolumeController f85589k;

    /* renamed from: l */
    public final Aweme f85590l;

    /* renamed from: m */
    public final String f85591m;

    /* renamed from: n */
    public final int f85592n;

    /* renamed from: o */
    public final String f85593o;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget$a */
    public static final class C32808a {
        private C32808a() {
        }

        public /* synthetic */ C32808a(C7571f fVar) {
            this();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        LineProgressBar lineProgressBar = this.f85588j;
        if (lineProgressBar != null) {
            lineProgressBar.mo74363c();
        }
        VolumeController volumeController = this.f85589k;
        if (volumeController != null) {
            volumeController.mo84319c();
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0053p pVar = this;
        this.f60922e.mo60132a("action_video_on_play_completed", pVar).mo60132a("action_video_on_resume_play", pVar).mo60132a("action_video_on_pause_play", pVar).mo60132a("action_video_on_prepare_play", pVar).mo60132a("action_video_on_play_fail", pVar).mo60132a("action_video_on_buffering", pVar).mo60132a("action_video_on_render_ready", pVar).mo60132a("on_render_first_frame", pVar).mo60132a("action_seek_stop_tracking_touch", pVar).mo60132a("action_keycode_volume_down", pVar).mo60132a("action_keycode_volume_up", pVar);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.bbh) {
            C42961az.m136380a(new C32716a());
            ImageView imageView = this.f85586a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.f60922e.mo60134a("action_replay", (Object) "replay");
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        Video video;
        UrlModel urlModel;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            UrlModel urlModel2 = null;
            View inflate = LayoutInflater.from(mo60148c()).inflate(R.layout.ac0, null, false);
            if (inflate != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                viewGroup.addView(frameLayout);
                this.f85587i = (AnimatedImageView) frameLayout.findViewById(R.id.a4g);
                AnimatedImageView animatedImageView = this.f85587i;
                if (animatedImageView != null) {
                    animatedImageView.setVisibility(0);
                }
                if ("long_video_player_activity".equals(this.f85593o)) {
                    video = C32799g.f85556b.mo84325a(this.f85590l);
                } else {
                    video = null;
                }
                if (video == null) {
                    video = C32799g.f85555a.mo84325a(this.f85590l);
                }
                AnimatedImageView animatedImageView2 = this.f85587i;
                if (animatedImageView2 != null) {
                    if (video != null) {
                        urlModel = video.getOriginCover();
                    } else {
                        urlModel = null;
                    }
                    animatedImageView2.mo60860a(urlModel);
                    RemoteImageView remoteImageView = animatedImageView2;
                    if (video != null) {
                        urlModel2 = video.getOriginCover();
                    }
                    C23323e.m76509a(remoteImageView, urlModel2, animatedImageView2.getControllerListener());
                }
                View findViewById = frameLayout.findViewById(R.id.hs);
                C7573i.m23582a((Object) findViewById, "funLayerContainer.findViewById(R.id.audio_view)");
                this.f85589k = new VolumeController((AudioControlView) findViewById);
                this.f85588j = (LineProgressBar) frameLayout.findViewById(R.id.cce);
                LineProgressBar lineProgressBar = this.f85588j;
                if (lineProgressBar != null) {
                    lineProgressBar.mo74361a();
                }
                this.f85586a = (ImageView) frameLayout.findViewById(R.id.bbh);
                ImageView imageView = this.f85586a;
                if (imageView != null) {
                    imageView.setOnClickListener(this);
                }
                ImageView imageView2 = this.f85586a;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1294386419:
                    if (str.equals("action_video_on_render_ready")) {
                        LineProgressBar lineProgressBar = this.f85588j;
                        if (lineProgressBar != null) {
                            lineProgressBar.mo74362b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -1235492779:
                    if (str.equals("on_render_first_frame")) {
                        AnimatedImageView animatedImageView = this.f85587i;
                        if (animatedImageView != null) {
                            animatedImageView.setVisibility(8);
                        }
                        return;
                    }
                    break;
                case -809540112:
                    if (str.equals("action_video_on_pause_play")) {
                        LineProgressBar lineProgressBar2 = this.f85588j;
                        if (lineProgressBar2 != null) {
                            lineProgressBar2.mo74362b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -517056298:
                    if (str.equals("action_video_on_play_fail")) {
                        LineProgressBar lineProgressBar3 = this.f85588j;
                        if (lineProgressBar3 != null) {
                            lineProgressBar3.mo74362b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -411372444:
                    if (str.equals("action_keycode_volume_up")) {
                        VolumeController volumeController = this.f85589k;
                        if (volumeController != null) {
                            Object a = aVar.mo60161a();
                            C7573i.m23582a(a, "t.getData()");
                            volumeController.mo60522a(((Number) a).intValue(), null);
                            return;
                        }
                    }
                    break;
                case -192431061:
                    if (str.equals("action_keycode_volume_down")) {
                        VolumeController volumeController2 = this.f85589k;
                        if (volumeController2 != null) {
                            Object a2 = aVar.mo60161a();
                            C7573i.m23582a(a2, "t.getData()");
                            volumeController2.mo60522a(((Number) a2).intValue(), null);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -110819137:
                    if (str.equals("action_video_on_prepare_play")) {
                        LineProgressBar lineProgressBar4 = this.f85588j;
                        if (lineProgressBar4 != null) {
                            lineProgressBar4.mo74361a();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 356960147:
                    if (str.equals("action_video_on_play_completed")) {
                        ImageView imageView = this.f85586a;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        AnimatedImageView animatedImageView2 = this.f85587i;
                        if (animatedImageView2 != null) {
                            animatedImageView2.setVisibility(0);
                        }
                        return;
                    }
                    break;
                case 710880054:
                    if (str.equals("action_seek_stop_tracking_touch")) {
                        Object a3 = aVar.mo60161a();
                        C7573i.m23582a(a3, "t.getData()");
                        if (((Number) a3).floatValue() > 0.0f) {
                            ImageView imageView2 = this.f85586a;
                            if (imageView2 != null) {
                                imageView2.setVisibility(8);
                            }
                            AnimatedImageView animatedImageView3 = this.f85587i;
                            if (animatedImageView3 != null) {
                                animatedImageView3.setVisibility(8);
                            }
                            return;
                        }
                    }
                    break;
                case 1422397231:
                    if (str.equals("action_video_on_buffering")) {
                        Object a4 = aVar.mo60161a();
                        C7573i.m23582a(a4, "t.getData()");
                        if (((Boolean) a4).booleanValue()) {
                            LineProgressBar lineProgressBar5 = this.f85588j;
                            if (lineProgressBar5 != null) {
                                lineProgressBar5.mo74361a();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            LineProgressBar lineProgressBar6 = this.f85588j;
                            if (lineProgressBar6 != null) {
                                lineProgressBar6.mo74362b();
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 2060932179:
                    if (str.equals("action_video_on_resume_play")) {
                        ImageView imageView3 = this.f85586a;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        AnimatedImageView animatedImageView4 = this.f85587i;
                        if (animatedImageView4 != null) {
                            animatedImageView4.setVisibility(8);
                        }
                        return;
                    }
                    break;
            }
        }
    }

    public VideoFunctionalLayerWidget(Aweme aweme, String str, int i, String str2) {
        C7573i.m23587b(str, "mEventType");
        C7573i.m23587b(str2, "mBusinessType");
        this.f85590l = aweme;
        this.f85591m = str;
        this.f85592n = i;
        this.f85593o = str2;
    }
}
