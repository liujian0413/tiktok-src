package com.p280ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0053p;
import android.os.Build;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p480a.C9700a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28894e;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.utils.C42941at;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.a */
public final class C28351a extends C28894e implements C0053p<C23083a> {

    /* renamed from: f */
    public static final C28352a f74697f = new C28352a(null);

    /* renamed from: a */
    public TextView f74698a;

    /* renamed from: b */
    public TextView f74699b;

    /* renamed from: c */
    public TextView f74700c;

    /* renamed from: d */
    public TextView f74701d;

    /* renamed from: e */
    public TextView f74702e;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.a$a */
    public static final class C28352a {
        private C28352a() {
        }

        public /* synthetic */ C28352a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.a$b */
    static final class C28353b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28351a f74703a;

        C28353b(C28351a aVar) {
            this.f74703a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Aweme aweme = this.f74703a.f76169g;
            C7573i.m23582a((Object) aweme, "mAweme");
            Video video = aweme.getVideo();
            C7573i.m23582a((Object) video, "mAweme.video");
            UrlModel originCover = video.getOriginCover();
            C7573i.m23582a((Object) originCover, "mAweme.video.originCover");
            C9700a.m28636a(this.f74703a.f76175m, "", originCover.getUrlList().toString());
        }
    }

    /* renamed from: a */
    private static String m93162a(String str) {
        return str == null ? TEVideoRecorder.FACE_BEAUTY_NULL : str;
    }

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
    }

    public C28351a(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo72020a(DataCenter dataCenter) {
        super.mo72020a(dataCenter);
        C0053p pVar = this;
        this.f76174l.mo60132a("poster_processor", pVar);
        this.f76174l.mo60132a("poster_processor_end", pVar);
        this.f76174l.mo60132a("poster_processor_time", pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            int hashCode = str.hashCode();
            if (hashCode != -1339133892) {
                if (hashCode != -320681952) {
                    if (hashCode == 1436964748 && str.equals("poster_processor_time")) {
                        String str2 = (String) aVar.mo60161a();
                        TextView textView = this.f74701d;
                        if (textView != null) {
                            textView.setText(str2);
                        }
                    }
                } else if (str.equals("poster_processor")) {
                    TextView textView2 = this.f74698a;
                    if (textView2 != null) {
                        textView2.setText((CharSequence) aVar.mo60161a());
                    }
                }
            } else if (str.equals("poster_processor_end")) {
                TextView textView3 = this.f74700c;
                if (textView3 != null) {
                    textView3.setText((CharSequence) aVar.mo60161a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.abx);
        if (view != null && (view instanceof FrameLayout)) {
            ((FrameLayout) view).addView(view2, 2);
        }
        this.f74698a = (TextView) view2.findViewById(R.id.cip);
        this.f74699b = (TextView) view2.findViewById(R.id.a5f);
        this.f74700c = (TextView) view2.findViewById(R.id.a4m);
        this.f74701d = (TextView) view2.findViewById(R.id.a4n);
        this.f74702e = (TextView) view2.findViewById(R.id.a4r);
        TextView textView = this.f74699b;
        if (textView != null) {
            StringBuilder sb = new StringBuilder("<");
            sb.append(m93162a(Build.HARDWARE));
            sb.append(',');
            sb.append(m93162a(C42941at.m136308a()));
            sb.append('>');
            textView.setText(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        List list;
        super.mo72021a(videoItemParams);
        if (videoItemParams != null && videoItemParams.mAweme != null) {
            TextView textView = this.f74698a;
            if (textView != null) {
                textView.setOnClickListener(new C28353b(this));
            }
            TextView textView2 = this.f74702e;
            if (textView2 != null) {
                Aweme aweme = this.f76169g;
                C7573i.m23582a((Object) aweme, "mAweme");
                Video video = aweme.getVideo();
                if (video != null) {
                    UrlModel originCover = video.getOriginCover();
                    if (originCover != null) {
                        list = originCover.getUrlList();
                        textView2.setText(String.valueOf(list));
                    }
                }
                list = null;
                textView2.setText(String.valueOf(list));
            }
        }
    }
}
