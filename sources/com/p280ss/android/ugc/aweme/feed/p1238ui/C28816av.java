package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoInteractionExperiment;
import com.p280ss.android.ugc.aweme.feed.helper.C28419g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28498o;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.C32346e;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.p1378a.C32858a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.setting.C37649i;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.av */
public final class C28816av extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    TextView f75967a;

    /* renamed from: b */
    View f75968b;

    /* renamed from: c */
    ImageView f75969c;

    /* renamed from: d */
    View f75970d;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.av$a */
    public class C28817a implements OnClickListener {
        public C28817a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C43122ff.m136767b()) {
                C10761a.m31409e(C28816av.this.f76175m, (int) R.string.a3c).mo25750a();
            } else if (C32698a.m105818a(C28816av.this.f76169g)) {
                C10761a.m31403c(C28816av.this.f76175m, C32698a.m105817a(C28816av.this.f76169g, R.string.fp_)).mo25750a();
            } else if (C28816av.this.f76169g == null || (C28816av.this.f76169g.isCanPlay() && !C28816av.this.f76169g.isDelete())) {
                C24217a.m79549a().setStartLoadTime();
                C28419g.m93414a().mo72155b(C28816av.this.f75969c, C28816av.this.f76170h, C33230ac.m107238m(C28816av.this.f76169g), C33230ac.m107205a(C28816av.this.f76169g));
                C42961az.m136380a(new C32858a());
                if (C43168s.m136912d(C28816av.this.f76169g) && !C28482e.m93606a(C28816av.this.f76169g)) {
                    C10761a.m31399c(C28816av.this.f76175m, (int) R.string.d5i).mo25750a();
                } else if (!C28482e.m93606a(C28816av.this.f76169g) && C43168s.m136911c(C28816av.this.f76169g) && !C43168s.m136913e(C28816av.this.f76169g)) {
                    C10761a.m31399c(C28816av.this.f76175m, (int) R.string.fsr).mo25750a();
                } else if (C28816av.this.f76169g == null || C28816av.this.f76169g.getVideoControl() == null || C28816av.this.f76169g.getVideoControl().timerStatus != 0) {
                    if (C28816av.this.mo74042i() || C25329c.m83220c(C28816av.this.f76169g)) {
                        C28816av.this.f76174l.mo60134a("video_comment_list", (Object) Integer.valueOf(7));
                    } else if (!C25329c.m83220c(C28816av.this.f76169g)) {
                        C10761a.m31399c(C28816av.this.f76175m, (int) R.string.w5).mo25750a();
                    }
                    if (C33230ac.m107230h(C28816av.this.f76170h) && C25329c.m83221d(C28816av.this.f76169g)) {
                        C24671f.m80851a().mo64674e(C28816av.this.f76175m, C28816av.this.f76169g);
                    }
                } else {
                    C10761a.m31409e(C28816av.this.f76175m, (int) R.string.foh).mo25750a();
                }
            } else if (C28816av.this.f76169g.isImage()) {
                C10761a.m31399c(C28816av.this.f76175m, (int) R.string.bsx).mo25750a();
            } else {
                C10761a.m31399c(C28816av.this.f76175m, (int) R.string.fp_).mo25750a();
            }
        }
    }

    /* renamed from: j */
    private void m94837j() {
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    public final void mo72018a() {
        C42961az.m136383d(this);
    }

    /* renamed from: l */
    private static String m94839l() {
        if (VideoInteractionExperiment.NEED_SHOW_TEXT) {
            return VideoInteractionExperiment.DEFAULT_COMMENT_TEXT;
        }
        return "0";
    }

    /* renamed from: m */
    private int m94840m() {
        if (this.f76169g == null) {
            return 0;
        }
        AwemeStatistics statistics = this.f76169g.getStatistics();
        if (statistics == null) {
            return 0;
        }
        int commentCount = statistics.getCommentCount();
        if (this.f76169g.getAdCommentStruct() != null && commentCount > 0) {
            commentCount++;
        }
        return commentCount;
    }

    /* renamed from: i */
    public final boolean mo74042i() {
        if (this.f76169g == null || this.f76169g.getStatus() == null || !this.f76169g.getStatus().isAllowComment()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo73965b() {
        if (C29132a.m95560a()) {
            Drawable f = C29125d.m95527f();
            if (f == null) {
                f = C0683b.m2903a(this.f76175m, (int) R.drawable.a8m);
            }
            this.f75969c.setImageDrawable(f);
        }
    }

    /* renamed from: k */
    private void m94838k() {
        int i;
        Aweme aweme = this.f76169g;
        if (aweme == null || !aweme.isDelete()) {
            this.f75967a.setVisibility(0);
            this.f75968b.setVisibility(0);
            if (C37649i.m120472b(aweme) || C32698a.m105818a(aweme)) {
                i = 0;
            } else {
                i = m94840m();
            }
            if (C24217a.m79549a().buildCommentStruct(this.f76169g) != null) {
                i = m94836b(1);
            }
            if (i < 0) {
                i = 0;
            }
            try {
                String a = m94832a(i);
                this.f75967a.setText(a);
                m94835a(a);
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
                this.f75967a.setText("0");
                m94835a("0");
            }
        } else {
            this.f75967a.setVisibility(4);
        }
    }

    public C28816av(View view) {
        super(view);
        m94837j();
    }

    /* renamed from: a */
    private String m94832a(int i) {
        if (i <= 0) {
            return m94839l();
        }
        return C30537o.m99738a((long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60132a("show_festival_activity_icon", (C0053p<C23083a>) this).mo60132a("video_open_comment_dialog", (C0053p<C23083a>) this);
        }
    }

    /* renamed from: b */
    private int m94836b(int i) {
        if (this.f76169g == null) {
            return 0;
        }
        AwemeStatistics statistics = this.f76169g.getStatistics();
        if (statistics == null) {
            return 0;
        }
        return statistics.getCommentCount() + 1;
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        C28498o.m93660a(this.f76169g, this.f76176n, true, true);
        mo73965b();
        m94838k();
        if (videoItemParams != null) {
            m94834a(videoItemParams.mAdViewController);
        }
    }

    @C7709l
    public final void onCommentEvent(C24029a aVar) {
        int i = aVar.f63539a;
        if (i == 3 || i == 4 || i == 8) {
            Object[] objArr = (Object[]) aVar.f63540b;
            if (objArr != null && objArr.length == 2) {
                m94838k();
            }
        }
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        if (anVar != null && 14 == anVar.f74631a) {
            if (C6319n.m19594a(this.f76169g.getAid(), (String) anVar.f74632b)) {
                m94838k();
            }
        }
    }

    /* renamed from: a */
    private void m94834a(C24723e eVar) {
        int i;
        if (eVar != null) {
            if (eVar.mo64705a() || !C25329c.m83219b(this.f76169g)) {
                TextView textView = this.f75967a;
                if (!eVar.mo64711f() || C25329c.m83220c(this.f76169g)) {
                    i = 4;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            }
            if (this.f76169g != null && this.f76169g.isDelete()) {
                this.f75967a.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -213371911) {
                if (hashCode != 281945252) {
                    if (hashCode == 350216171 && str.equals("on_page_selected")) {
                        c = 0;
                    }
                } else if (str.equals("show_festival_activity_icon")) {
                    c = 1;
                }
            } else if (str.equals("video_open_comment_dialog")) {
                c = 2;
            }
            switch (c) {
                case 0:
                case 1:
                    mo73965b();
                    return;
                case 2:
                    if (this.f75970d != null) {
                        this.f75970d.callOnClick();
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m94835a(String str) {
        if (!C6399b.m19944t()) {
            this.f75970d.setContentDescription(this.f76175m.getString(R.string.a7w, new Object[]{str}));
            this.f75969c.setContentDescription(this.f76175m.getString(R.string.a7w, new Object[]{str}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_comment_count);
        this.f75970d = view2.findViewById(R.id.zv);
        if (this.f75970d == null) {
            view2 = C32346e.m104913a(getClass().getName(), view2, this.f76175m, R.layout.layout_video_comment_count);
            this.f75970d = view2.findViewById(R.id.zv);
        }
        this.f75967a = (TextView) view2.findViewById(R.id.z7);
        this.f75968b = view2.findViewById(R.id.z5);
        this.f75969c = (ImageView) view2.findViewById(R.id.zc);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f75970d.setOnClickListener(new C28817a());
        this.f75967a.setOnClickListener(new C28817a());
        this.f75968b.setOnClickListener(new C28817a());
        this.f75968b.setOnTouchListener(C23487o.m77135a());
    }
}
