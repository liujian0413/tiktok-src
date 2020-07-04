package com.p280ss.android.ugc.aweme.longvideonew.widget;

import android.arch.lifecycle.C0053p;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32724c.C32725a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e.C32728a;
import com.p280ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32797c;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33252aw;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.GenericWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget */
public final class VideoSeekContainerWidget extends GenericWidget implements C0053p<C23083a>, OnClickListener, OnSeekBarChangeListener {

    /* renamed from: l */
    public static final C32814a f85618l = new C32814a(null);

    /* renamed from: a */
    public final Aweme f85619a;

    /* renamed from: i */
    public final String f85620i;

    /* renamed from: j */
    public final int f85621j;

    /* renamed from: k */
    public final String f85622k;

    /* renamed from: m */
    private boolean f85623m;

    /* renamed from: n */
    private ImageView f85624n;

    /* renamed from: o */
    private ImageView f85625o;

    /* renamed from: p */
    private VideoPlaySeekBar f85626p;

    /* renamed from: q */
    private int f85627q;

    /* renamed from: r */
    private long f85628r;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget$a */
    public static final class C32814a {
        private C32814a() {
        }

        public /* synthetic */ C32814a(C7571f fVar) {
            this();
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public final void onCreate() {
        super.onCreate();
        C0053p pVar = this;
        this.f60922e.mo60132a("action_is_landscape_mode", pVar).mo60132a("action_video_on_resume_play", pVar).mo60132a("action_video_on_pause_play", pVar).mo60132a("action_video_on_play_progress_change", pVar).mo60132a("action_video_secondary_progress", pVar).mo60132a("action_video_on_play_completed", pVar).mo60132a("resize_video_and_cover", pVar);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f85623m = true;
        C32716a aVar = new C32716a();
        aVar.f85292a = true;
        C42961az.m136380a(aVar);
        if (seekBar != null) {
            this.f85627q = seekBar.getProgress();
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        String str;
        String str2;
        this.f85628r = SystemClock.elapsedRealtime();
        this.f85623m = false;
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            DataCenter dataCenter = this.f60922e;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_seek_stop_tracking_touch", (Object) Float.valueOf(((float) progress) / 100.0f));
            }
        }
        C32716a aVar = new C32716a();
        aVar.f85293b = true;
        C42961az.m136380a(aVar);
        if (seekBar != null) {
            if (this.f85627q < seekBar.getProgress()) {
                str = "front";
            } else {
                str = "back";
            }
            String str3 = "click_progress_bar";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f85620i).mo59970a("is_long_item", 1).mo59973a("impr_type", C33230ac.m107245t(this.f85619a)).mo59973a("action_type", str);
            String str4 = "group_id";
            Aweme aweme = this.f85619a;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        int i;
        int i2;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            Video video = null;
            int i3 = 0;
            View inflate = LayoutInflater.from(mo60148c()).inflate(R.layout.a9r, null, false);
            if (inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                viewGroup.addView(linearLayout);
                this.f85624n = (ImageView) linearLayout.findViewById(R.id.bb4);
                ImageView imageView = this.f85624n;
                if (imageView != null) {
                    imageView.setSelected(true);
                }
                ImageView imageView2 = this.f85624n;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(this);
                }
                this.f85625o = (ImageView) linearLayout.findViewById(R.id.bcx);
                ImageView imageView3 = this.f85625o;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(this);
                }
                if ("long_video_player_activity".equals(this.f85622k)) {
                    video = C32752l.f85394b.mo84248a(this.f85619a);
                }
                if (video == null) {
                    video = C32752l.f85393a.mo84248a(this.f85619a);
                }
                if (video != null) {
                    i = video.getWidth();
                } else {
                    i = 0;
                }
                if (video != null) {
                    i2 = video.getHeight();
                } else {
                    i2 = 0;
                }
                m106201a(i, i2);
                this.f85626p = (VideoPlaySeekBar) linearLayout.findViewById(R.id.ebh);
                VideoPlaySeekBar videoPlaySeekBar = this.f85626p;
                if (videoPlaySeekBar != null) {
                    if (video != null) {
                        i3 = video.getDuration();
                    }
                    videoPlaySeekBar.setTotalTime(C32728a.m105939b(i3));
                }
                VideoPlaySeekBar videoPlaySeekBar2 = this.f85626p;
                if (videoPlaySeekBar2 != null) {
                    videoPlaySeekBar2.setProgress(0.0f);
                }
                VideoPlaySeekBar videoPlaySeekBar3 = this.f85626p;
                if (videoPlaySeekBar3 != null) {
                    videoPlaySeekBar3.setOnSeekBarChangeListener(this);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        C42961az.m136380a(new C32716a());
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        boolean z = false;
        if (num != null && num.intValue() == R.id.bb4) {
            ImageView imageView = this.f85624n;
            if (imageView != null && imageView.isSelected()) {
                new C33252aw().mo85159c(this.f85619a, this.f85621j).mo85158a(this.f85620i).mo85157a(1).mo85252e();
            }
            DataCenter dataCenter = this.f60922e;
            String str2 = "action_play_control";
            ImageView imageView2 = this.f85624n;
            if (imageView2 != null) {
                z = imageView2.isSelected();
            }
            dataCenter.mo60134a(str2, (Object) Boolean.valueOf(z));
            return;
        }
        if (num != null && num.intValue() == R.id.bcx) {
            ImageView imageView3 = this.f85625o;
            if (imageView3 != null && !imageView3.isSelected()) {
                String str3 = "enter_full_screen";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f85620i).mo59970a("is_long_item", 1);
                String str4 = "group_id";
                Aweme aweme = this.f85619a;
                if (aweme != null) {
                    str = aweme.getAid();
                }
                C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).f60753a);
            }
            DataCenter dataCenter2 = this.f60922e;
            String str5 = "action_switch_mode";
            ImageView imageView4 = this.f85625o;
            if (imageView4 != null) {
                z = imageView4.isSelected();
            }
            dataCenter2.mo60134a(str5, (Object) Boolean.valueOf(z));
        }
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
                case -809540112:
                    if (str.equals("action_video_on_pause_play")) {
                        ImageView imageView = this.f85624n;
                        if (imageView != null) {
                            imageView.setSelected(false);
                        }
                        return;
                    }
                    break;
                case -330388150:
                    if (str.equals("action_video_on_play_progress_change") && !this.f85623m) {
                        if (this.f85628r == 0 || SystemClock.elapsedRealtime() > this.f85628r + 1200) {
                            VideoPlaySeekBar videoPlaySeekBar = this.f85626p;
                            if (videoPlaySeekBar != null) {
                                Object a = aVar.mo60161a();
                                C7573i.m23582a(a, "t.getData()");
                                videoPlaySeekBar.setProgress(((Number) a).floatValue());
                                break;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                    break;
                case 356960147:
                    if (str.equals("action_video_on_play_completed")) {
                        VideoPlaySeekBar videoPlaySeekBar2 = this.f85626p;
                        if (videoPlaySeekBar2 != null) {
                            videoPlaySeekBar2.setProgress(0.0f);
                        }
                        this.f85628r = 0;
                        return;
                    }
                    break;
                case 441659136:
                    if (str.equals("resize_video_and_cover")) {
                        Object a2 = aVar.mo60161a();
                        C7573i.m23582a(a2, "t.getData()");
                        C32797c cVar = (C32797c) a2;
                        m106201a(cVar.f85551a, cVar.f85552b);
                        break;
                    }
                    break;
                case 929573523:
                    if (str.equals("action_is_landscape_mode")) {
                        ImageView imageView2 = this.f85625o;
                        if (imageView2 != null) {
                            Object a3 = aVar.mo60161a();
                            C7573i.m23582a(a3, "t.getData()");
                            imageView2.setSelected(((Boolean) a3).booleanValue());
                        }
                        Object a4 = aVar.mo60161a();
                        C7573i.m23582a(a4, "t.getData()");
                        if (((Boolean) a4).booleanValue()) {
                            VideoPlaySeekBar videoPlaySeekBar3 = this.f85626p;
                            if (videoPlaySeekBar3 != null) {
                                videoPlaySeekBar3.setSeekBarThumb(1);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            VideoPlaySeekBar videoPlaySeekBar4 = this.f85626p;
                            if (videoPlaySeekBar4 != null) {
                                videoPlaySeekBar4.setSeekBarThumb(0);
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 1083569349:
                    if (str.equals("action_video_secondary_progress")) {
                        VideoPlaySeekBar videoPlaySeekBar5 = this.f85626p;
                        if (videoPlaySeekBar5 != null) {
                            Object a5 = aVar.mo60161a();
                            C7573i.m23582a(a5, "t.getData()");
                            videoPlaySeekBar5.setSecondaryProgress(((Number) a5).intValue());
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 2060932179:
                    if (str.equals("action_video_on_resume_play")) {
                        ImageView imageView3 = this.f85624n;
                        if (imageView3 != null) {
                            imageView3.setSelected(true);
                        }
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    private final void m106201a(int i, int i2) {
        if (!"long_video_player_activity".equals(this.f85622k) || !C32725a.m105937a(i, i2)) {
            ImageView imageView = this.f85625o;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            return;
        }
        ImageView imageView2 = this.f85625o;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        ImageView imageView3 = this.f85625o;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
    }

    public VideoSeekContainerWidget(Aweme aweme, String str, int i, String str2) {
        C7573i.m23587b(str, "mEventType");
        C7573i.m23587b(str2, "mBusinessType");
        this.f85619a = aweme;
        this.f85620i = str;
        this.f85621j = i;
        this.f85622k = str2;
    }
}
