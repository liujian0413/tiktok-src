package com.p280ss.android.ugc.aweme.shortvideo.cover;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40154a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40161f;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.Adapter;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C41661a;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47516v;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment */
public class VEChooseVideoCoverFragment extends Fragment implements C41661a {

    /* renamed from: a */
    ChooseVideoCoverView f100333a;

    /* renamed from: b */
    View f100334b;

    /* renamed from: c */
    View f100335c;

    /* renamed from: d */
    ViewGroup f100336d;

    /* renamed from: e */
    ViewGroup f100337e;

    /* renamed from: f */
    ViewGroup f100338f;

    /* renamed from: g */
    C38632c f100339g;

    /* renamed from: h */
    SafeHandler f100340h;

    /* renamed from: i */
    C38629a f100341i;

    /* renamed from: j */
    public float f100342j;

    /* renamed from: k */
    public boolean f100343k;

    /* renamed from: l */
    public C41654d f100344l;

    /* renamed from: m */
    public C0052o<Bitmap> f100345m;

    /* renamed from: n */
    public C0052o<Boolean> f100346n;

    /* renamed from: o */
    private boolean f100347o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment$a */
    public interface C38629a {
        /* renamed from: a */
        C15389d mo96642a();

        /* renamed from: b */
        C0052o<C47516v> mo96643b();

        /* renamed from: c */
        VideoPublishEditModel mo96644c();
    }

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

    /* renamed from: b */
    public final int mo96634b() {
        return this.f100336d.getMeasuredHeight();
    }

    /* renamed from: c */
    public final int mo96635c() {
        return this.f100337e.getMeasuredHeight();
    }

    /* renamed from: d */
    public final int mo96636d() {
        return this.f100338f.getMeasuredHeight();
    }

    public void onDestroy() {
        if (this.f100333a.getAdapter() instanceof Adapter) {
            Adapter adapter = (Adapter) this.f100333a.getAdapter();
            if (adapter != null) {
                adapter.mo102330a();
            }
        }
        super.onDestroy();
    }

    /* renamed from: e */
    public final void mo96637e() {
        if (this.f100343k) {
            Bitmap d = this.f100341i.mo96642a().mo38835d();
            if (d != null) {
                this.f100342j = (float) this.f100341i.mo96642a().mo38862m();
                this.f100333a.setVideoCoverFrameView(d);
                d.recycle();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo96632a() {
        if (this.f100344l != null) {
            this.f100344l.dismiss();
        }
        this.f100340h.removeCallbacksAndMessages(null);
        this.f100341i.mo96643b().setValue(C47516v.m148297b());
        this.f100341i.mo96642a().mo38832c(true);
        this.f100341i.mo96643b().setValue(C47516v.m148295a());
        if (this.mFragmentManager == null) {
            return false;
        }
        requireFragmentManager().mo2645a().mo2587a((Fragment) this).mo2606d();
        return true;
    }

    /* renamed from: d */
    private int m123401d(float f) {
        return (int) (((float) this.f100341i.mo96642a().mo38860l()) * f);
    }

    /* renamed from: a */
    public final void mo88410a(float f) {
        this.f100340h.removeCallbacksAndMessages(null);
        this.f100341i.mo96643b().setValue(C47516v.m148297b());
    }

    /* renamed from: b */
    public final void mo88412b(float f) {
        this.f100343k = true;
        this.f100341i.mo96643b().setValue(C47516v.m148296a((long) m123401d(f)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo96631a(final long j) {
        this.f100341i.mo96643b().setValue(C47516v.m148297b());
        this.f100341i.mo96643b().setValue(C47516v.m148295a());
        this.f100340h.postDelayed(new Runnable() {
            public final void run() {
                VEChooseVideoCoverFragment.this.f100343k = false;
                VEChooseVideoCoverFragment.this.f100341i.mo96643b().setValue(C47516v.m148298b(j));
                VEChooseVideoCoverFragment.this.mo96631a(j);
            }
        }, 1000);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C38629a) {
            this.f100341i = (C38629a) context;
            this.f100347o = C35563c.f93230L.mo93342a(Property.IsLowMemoryMachine);
            Activity activity = (Activity) context;
            C23487o.m77149b(activity);
            if (C6399b.m19946v()) {
                C23487o.m77155c(activity);
                return;
            }
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    /* renamed from: c */
    public final void mo88413c(float f) {
        this.f100343k = true;
        C47516v b = C47516v.m148298b((long) m123401d(f));
        this.f100341i.mo96643b().setValue(b);
        C6907h.onEvent(new MobClick().setEventName("choose_cover").setLabelName("cover_page"));
        C6907h.m21524a("cover_click", (Map) C22984d.m75611a().mo59973a("creation_id", this.f100341i.mo96644c().creationId).mo59973a("shoot_way", this.f100341i.mo96644c().mShootWay).mo59970a("draft_id", this.f100341i.mo96644c().draftId).f60753a);
        if (this.f100339g != null) {
            mo96631a(b.f121980b);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f100333a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f100333a.setOnScrollListener(this);
        final VideoPublishEditModel c = this.f100341i.mo96644c();
        this.f100339g = m123400b(c);
        this.f100333a.post(new Runnable() {
            public final void run() {
                int measuredHeight = VEChooseVideoCoverFragment.this.f100333a.getMeasuredHeight();
                int oneThumbWidth = (int) VEChooseVideoCoverFragment.this.f100333a.getOneThumbWidth();
                if (VEChooseVideoCoverFragment.this.mo96633a(c)) {
                    MvChooseCoverAdapter mvChooseCoverAdapter = new MvChooseCoverAdapter(oneThumbWidth, measuredHeight);
                    VEChooseVideoCoverFragment.this.f100333a.setAdapter(mvChooseCoverAdapter);
                    new C40154a().mo99898a(oneThumbWidth, measuredHeight).mo99899a(VEChooseVideoCoverFragment.this.f100345m).mo99907b(VEChooseVideoCoverFragment.this.f100346n).mo99904a((Context) VEChooseVideoCoverFragment.this.getActivity(), VEChooseVideoCoverFragment.this.f100341i.mo96642a(), 7, (C40161f) new C38636f(mvChooseCoverAdapter));
                    return;
                }
                VEChooseVideoCoverFragment.this.f100333a.setAdapter(new Adapter(VEChooseVideoCoverFragment.this.f100339g, oneThumbWidth, measuredHeight));
            }
        });
        this.f100334b.setOnClickListener(new C42939as() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo96639a() {
                VEChooseVideoCoverFragment.this.mo96632a();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo96640b() {
                VEChooseVideoCoverFragment.this.mo96632a();
            }

            /* renamed from: a */
            public final void mo70606a(View view) {
                VideoPublishEditModel c = VEChooseVideoCoverFragment.this.f100341i.mo96644c();
                c.mVideoCoverStartTm = VEChooseVideoCoverFragment.this.f100342j / 1000.0f;
                if (c.isMvThemeVideoType()) {
                    c.mvCreateVideoData.videoCoverStartTime = (int) VEChooseVideoCoverFragment.this.f100342j;
                    VEChooseVideoCoverFragment.this.f100344l = C41654d.m132586b(VEChooseVideoCoverFragment.this.getContext(), "");
                    VEChooseVideoCoverFragment.this.f100344l.setIndeterminate(true);
                    new C40154a(VEChooseVideoCoverFragment.this.f100341i.mo96642a(), c.mvCreateVideoData.videoCoverImgPath, c.mvCreateVideoData.videoCoverStartTime, new C38637g(this));
                } else if (c.isStatusVideoType()) {
                    c.statusCreateVideoData.setVideoCoverStartTime((int) VEChooseVideoCoverFragment.this.f100342j);
                    VEChooseVideoCoverFragment.this.f100344l = C41654d.m132586b(VEChooseVideoCoverFragment.this.getContext(), "");
                    VEChooseVideoCoverFragment.this.f100344l.setIndeterminate(true);
                    new C40154a(VEChooseVideoCoverFragment.this.f100341i.mo96642a(), c.statusCreateVideoData.getVideoCoverImgPath(), c.statusCreateVideoData.getVideoCoverStartTime(), new C38638h(this));
                } else {
                    VEChooseVideoCoverFragment.this.mo96632a();
                }
            }
        });
        this.f100335c.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                VEChooseVideoCoverFragment.this.requireFragmentManager().mo2645a().mo2587a((Fragment) VEChooseVideoCoverFragment.this).mo2606d();
            }
        });
        this.f100340h = new SafeHandler(this);
    }

    /* renamed from: b */
    private C38632c m123400b(VideoPublishEditModel videoPublishEditModel) {
        int i;
        if (mo96633a(videoPublishEditModel)) {
            if (this.f100341i.mo96642a() == null) {
                i = 0;
            } else {
                i = this.f100341i.mo96642a().mo38860l();
            }
            return new MvEffectVideoCoverGeneratorImpl(i);
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            VEMultiEditVideoCoverGeneratorImpl vEMultiEditVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(this.f100341i.mo96642a(), this, this.f100333a.getCoverSize(), this.f100341i.mo96642a().mo38860l(), 0);
            return vEMultiEditVideoCoverGeneratorImpl;
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isEnableUseVEGetThumbs() || videoPublishEditModel.isFastImport) {
            return new VEVideoCoverGeneratorImpl(this.f100341i.mo96642a(), this, this.f100333a.getCoverSize());
        } else {
            EffectVideoCoverGeneratorImpl effectVideoCoverGeneratorImpl = new EffectVideoCoverGeneratorImpl(this, videoPublishEditModel.mEffectList, C35563c.f93224F.mo70097l().mo74949b().mo74962a(videoPublishEditModel.mSelectedId).mo74978b(), videoPublishEditModel.mSelectedFilterIntensity, this.f100333a.getCoverSize(), videoPublishEditModel.isReverse(), videoPublishEditModel.getPreviewInfo());
            return effectVideoCoverGeneratorImpl;
        }
    }

    /* renamed from: a */
    public final boolean mo96633a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType() || this.f100347o || videoPublishEditModel.isStatusVideoType()) {
            return true;
        }
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f100333a = (ChooseVideoCoverView) C0991u.m4211e(view, (int) R.id.vx);
        this.f100334b = C0991u.m4211e(view, (int) R.id.drr);
        this.f100335c = C0991u.m4211e(view, (int) R.id.drq);
        this.f100337e = (ViewGroup) C0991u.m4211e(view, (int) R.id.ebr);
        this.f100336d = (ViewGroup) C0991u.m4211e(view, (int) R.id.auq);
        this.f100338f = (ViewGroup) C0991u.m4211e(view, (int) R.id.cqh);
        C0991u.m4211e(view, (int) R.id.edb).setOnTouchListener(C38635e.f100367a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.g1, viewGroup, false);
    }
}
