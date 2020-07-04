package com.p280ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.mediachoose.MediaAdapter.C33140a;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d.C33155b;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40132e;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPreviewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.widget.baseadapter.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.VideoChooseFragment */
public class VideoChooseFragment extends AmeBaseFragment implements C33184p {

    /* renamed from: e */
    private boolean f86249e;

    /* renamed from: f */
    public TextView f86250f;

    /* renamed from: g */
    public DmtLoadingLayout f86251g;

    /* renamed from: h */
    public RecyclerView f86252h;

    /* renamed from: i */
    public MediaAdapter f86253i;

    /* renamed from: j */
    protected C33153d f86254j;

    /* renamed from: k */
    public View f86255k;

    /* renamed from: l */
    public ImageView f86256l;

    /* renamed from: m */
    public ImageView f86257m;

    /* renamed from: n */
    public TextView f86258n;

    /* renamed from: o */
    public C33177i f86259o;

    /* renamed from: p */
    public boolean f86260p;

    /* renamed from: q */
    public long f86261q = C39810eq.m127460a();

    /* renamed from: r */
    public HeaderAndFooterWrapper f86262r;

    /* renamed from: s */
    public boolean f86263s;

    /* renamed from: t */
    public boolean f86264t;

    /* renamed from: u */
    public C33140a f86265u = new C33140a() {
        /* renamed from: a */
        public final void mo80206a(View view, MediaModel mediaModel) {
            if (!VideoChooseFragment.this.f86253i.f86210f) {
                C33175g.m107023a(false, true);
                VideoChooseFragment.this.mo84882a(mediaModel);
            } else if (!VideoChooseFragment.this.f86260p) {
                VideoChooseFragment.this.f86260p = true;
                VideoChooseFragment.this.mo84881a(view, mediaModel);
            }
        }
    };

    /* renamed from: v */
    private int f86266v;

    /* renamed from: w */
    private int f86267w;

    /* renamed from: x */
    private int f86268x;

    /* renamed from: y */
    private C33155b f86269y = new C33155b() {
        /* renamed from: a */
        public final void mo84890a(boolean z, int i, List<MediaModel> list) {
            if (VideoChooseFragment.this.isViewValid() && !VideoChooseFragment.this.f86264t) {
                VideoChooseFragment.this.f86251g.setVisibility(8);
                if (z) {
                    VideoChooseFragment.this.mo80204d();
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo84882a(MediaModel mediaModel) {
        C33153d.m106972a().mo84906b();
        C33153d.m106972a().mo84905a(mediaModel);
        if (mediaModel.f88158d == 4) {
            if (mediaModel.f88159e <= this.f86261q) {
                C10761a.m31403c((Context) getActivity(), m106937a()).mo25750a();
            } else if (mediaModel.f88159e <= 600000) {
                m106942a(mediaModel.f88156b, mediaModel);
            } else {
                C10761a.m31399c((Context) getActivity(), (int) R.string.fp8).mo25750a();
            }
            C6906g.m21513a(getContext(), "upload", "choose_content", 0, 0, C6869c.m21381a().mo16887a("is_photo", "0").mo16888b());
        }
    }

    /* renamed from: a */
    public final void mo84883a(List<MediaModel> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i = (int) (((long) i) + ((MediaModel) list.get(i2)).f88159e);
        }
        if (((long) i) <= this.f86261q) {
            C9738o.m28697a((Context) getActivity(), m106937a());
        } else if (i > 3600000) {
            C9738o.m28693a((Context) getActivity(), (int) R.string.cap);
        } else {
            C33153d.m106972a().mo84906b();
            for (int i3 = 0; i3 < list.size(); i3++) {
                C33153d.m106972a().mo84905a((MediaModel) list.get(i3));
            }
            m106939a(((MediaModel) list.get(0)).f88156b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo84880a(String str, String str2, Long l) {
        if (!isViewValid()) {
            return null;
        }
        C6893q.m21444a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        m106940a(str2, 0, l.longValue(), "select");
        if (!this.f86263s) {
            m106944b(str);
        } else if (getActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra("video_file", str);
            intent.putExtra("video_multi_edit", true);
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo84881a(View view, MediaModel mediaModel) {
        C33185q aVar;
        String str = mediaModel.f88156b;
        if (getActivity() != null) {
            if (C35563c.f93231M.mo93305a(Property.VideoLegalCheckInLocal)) {
                aVar = new C33165d(getActivity());
            } else {
                aVar = new C33146a(getActivity());
            }
            aVar.mo84891a(mediaModel, 0, -1, new C33180l(this, view, str), new C33181m(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo84878a(View view, String str, String str2, Long l) {
        if (!isViewValid()) {
            this.f86260p = false;
            return null;
        }
        C6893q.m21444a("aweme_movie_import_error_rate", 0, (JSONObject) null);
        m106940a(str2, 0, l.longValue(), "preview");
        m106938a(view, str);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo84879a(String str, Long l, Integer num, String str2) {
        this.f86260p = false;
        m106941a(str, num.intValue(), l.longValue(), "preview", str2);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0056, code lost:
        if (r4.f86249e != false) goto L_0x005b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Void mo84877a(bolts.C1592h r5) throws java.lang.Exception {
        /*
            r4 = this;
            java.lang.Object r5 = r5.mo6890e()
            java.util.List r5 = (java.util.List) r5
            com.ss.android.ugc.aweme.mediachoose.MediaAdapter r0 = r4.f86253i
            com.ss.android.ugc.aweme.mediachoose.a.d r1 = r4.f86254j
            java.util.List r1 = r1.mo84910c()
            r0.mo84867a(r5, r1)
            android.support.v7.widget.RecyclerView r0 = r4.f86252h
            com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.HeaderAndFooterWrapper r1 = r4.f86262r
            r0.setAdapter(r1)
            android.support.v7.widget.RecyclerView r0 = r4.f86252h
            android.support.v7.widget.RecyclerView$f r0 = r0.getItemAnimator()
            android.support.v7.widget.SimpleItemAnimator r0 = (android.support.p029v7.widget.SimpleItemAnimator) r0
            r1 = 0
            r0.f5112m = r1
            com.ss.android.ugc.aweme.mediachoose.MediaAdapter r0 = r4.f86253i
            com.ss.android.ugc.aweme.mediachoose.MediaAdapter$a r2 = r4.f86265u
            r0.f86211g = r2
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r0 = r4.f86251g
            r2 = 8
            r0.setVisibility(r2)
            int r5 = r5.size()
            r0 = 0
            if (r5 != 0) goto L_0x004a
            android.widget.TextView r5 = r4.f86250f
            android.content.res.Resources r1 = r4.getResources()
            r3 = 2131825168(0x7f111210, float:1.9283185E38)
            java.lang.String r1 = r1.getString(r3)
            r5.setText(r1)
            android.view.View r5 = r4.f86255k
            goto L_0x0059
        L_0x004a:
            android.widget.TextView r5 = r4.f86250f
            r5.setText(r0)
            r5 = 1
            r4.f86264t = r5
            android.view.View r5 = r4.f86255k
            boolean r3 = r4.f86249e
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r1 = 8
        L_0x005b:
            r5.setVisibility(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mediachoose.VideoChooseFragment.mo84877a(bolts.h):java.lang.Void");
    }

    /* renamed from: f */
    public final void mo84886f() {
        if (this.f86262r != null) {
            this.f86262r.notifyDataSetChanged();
        }
    }

    public void loadData() {
        if (!this.f86264t) {
            mo80204d();
        }
    }

    public void onStart() {
        super.onStart();
        this.f86253i.mo84864a();
        this.f86254j.mo84903a(this.f86269y);
    }

    public void onStop() {
        super.onStop();
        this.f86253i.mo84868b();
        this.f86254j.mo84908b(this.f86269y);
    }

    /* renamed from: a */
    private String m106937a() {
        return getString(R.string.fkq, Long.valueOf(this.f86261q / 1000));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo80204d() {
        if (this.f86254j != null) {
            List a = this.f86254j.mo84898a(4);
            if (!a.isEmpty()) {
                this.f86251g.setVisibility(0);
            }
            C1592h.m7853a((Callable<TResult>) new C33182n<TResult>(a)).mo6876a((C1591g<TResult, TContinuationResult>) new C33183o<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: e */
    public final void mo84885e() {
        if (this.f86254j == null && getActivity() != null) {
            C33153d.m106975a(getActivity().getApplicationContext());
            this.f86254j = C33153d.m106972a();
        }
        if (C6311g.m19573a(this.f86254j.mo84898a(4))) {
            this.f86251g.setVisibility(0);
            this.f86254j.mo84901a(4, false);
        }
        if (this.f86253i == null) {
            MediaAdapter mediaAdapter = new MediaAdapter(getActivity(), this, this.f86266v, 1.0d, 1.5f, 0);
            this.f86253i = mediaAdapter;
            this.f86262r = new HeaderAndFooterWrapper(this.f86253i);
            this.f86262r.mo102457a(C33186r.m107029a(getActivity(), 96));
        }
        this.f86253i.f86214j = this.f86268x;
        this.f86253i.f86213i = this.f86267w;
        this.f86253i.f86215k = false;
        this.f86253i.f86219o = this.f86259o;
        C331432 r0 = new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                VideoChooseFragment.this.f86253i.f86210f = !VideoChooseFragment.this.f86253i.f86210f;
                if (VideoChooseFragment.this.f86253i.f86210f) {
                    VideoChooseFragment.this.f86257m.setVisibility(8);
                    VideoChooseFragment.this.f86256l.setVisibility(0);
                    VideoChooseFragment.this.f86258n.setVisibility(8);
                } else {
                    VideoChooseFragment.this.f86257m.setVisibility(0);
                    VideoChooseFragment.this.f86256l.setVisibility(8);
                    VideoChooseFragment.this.f86258n.setVisibility(0);
                }
                VideoChooseFragment.this.f86253i.mo84869c();
                VideoChooseFragment.this.f86262r.notifyDataSetChanged();
            }
        };
        this.f86255k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
        this.f86256l.setOnClickListener(r0);
        this.f86257m.setOnClickListener(r0);
        this.f86258n.setOnClickListener(r0);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo84885e();
    }

    /* renamed from: b */
    private void m106944b(String str) {
        C35563c.f93240c.mo83128a((Context) getActivity(), (AVChallenge) getArguments().getSerializable("challenge"));
    }

    /* renamed from: b */
    static final /* synthetic */ List m106943b(List list) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            if (!TextUtils.isEmpty(mediaModel.f88156b) && "video/mp4".equalsIgnoreCase(mediaModel.f88161g)) {
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f86266v = getArguments().getInt("ARG_NUM_COLUMNS", 4);
        this.f86267w = getArguments().getInt("ARG_TEXT_COLOR", getResources().getColor(R.color.a91));
        this.f86268x = getArguments().getInt("ARG_SHADOW_COLOR", getResources().getColor(R.color.a82));
        this.f86249e = getArguments().getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
    }

    /* renamed from: a */
    private void m106939a(String str) {
        if (isViewValid()) {
            if (!this.f86263s) {
                m106944b(str);
            } else if (getActivity() != null) {
                Intent intent = new Intent();
                intent.putExtra("video_file", str);
                intent.putExtra("video_multi_edit", true);
                getActivity().setResult(-1, intent);
                getActivity().finish();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* renamed from: a */
    private void m106938a(View view, String str) {
        VideoPreviewActivity.m131410a(getActivity(), view, str, (((float) C9738o.m28691a(getContext())) * 1.0f) / ((float) C9738o.m28709b(getContext())));
        this.f86260p = false;
    }

    /* renamed from: a */
    private void m106942a(String str, MediaModel mediaModel) {
        C33185q aVar;
        if (getActivity() != null) {
            if (C35563c.f93231M.mo93305a(Property.VideoLegalCheckInLocal)) {
                aVar = new C33165d(getActivity());
            } else {
                aVar = new C33146a(getActivity());
            }
            aVar.mo84891a(mediaModel, this.f86261q, -1, new C33178j(this, str), new C33179k(this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b1t, null);
        this.f86252h = (RecyclerView) inflate.findViewById(R.id.ass);
        this.f86252h.setLayoutManager(new WrapGridLayoutManager(null, this.f86266v));
        int i = 0;
        this.f86252h.mo5525a((C1272h) new GridSpacingItemDecoration(this.f86266v, (int) C9738o.m28708b(getContext(), 1.0f), false));
        this.f86250f = (TextView) inflate.findViewById(R.id.dvl);
        this.f86251g = (DmtLoadingLayout) inflate.findViewById(R.id.eau);
        this.f86255k = inflate.findViewById(R.id.te);
        this.f86256l = (ImageView) inflate.findViewById(R.id.bac);
        this.f86257m = (ImageView) inflate.findViewById(R.id.bad);
        this.f86258n = (TextView) inflate.findViewById(R.id.dy6);
        View view = this.f86255k;
        if (!this.f86249e) {
            i = 8;
        }
        view.setVisibility(i);
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C7581n mo84884b(String str, Long l, Integer num, String str2) {
        m106941a(str, num.intValue(), l.longValue(), "select", str2);
        return null;
    }

    /* renamed from: a */
    private static void m106940a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C6893q.m21448a("aweme_video_import_duration", jSONObject, C6869c.m21381a().mo16887a("status", String.valueOf(i)).mo16887a("scene_name", str2).mo16887a("type", str).mo16888b());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static VideoChooseFragment m106935a(int i, int i2, int i3, AVChallenge aVChallenge, C33177i iVar) {
        return m106936a(i, i2, i3, true, aVChallenge, iVar);
    }

    /* renamed from: a */
    private void m106941a(String str, int i, long j, String str2, String str3) {
        if (getActivity() != null && isViewValid()) {
            C40132e.m128287a(getActivity(), i, (int) (this.f86261q / 1000));
            C6893q.m21444a("aweme_movie_import_error_rate", 1, C6869c.m21381a().mo16887a("errorCode", String.valueOf(i)).mo16887a("errorMsg", str3).mo16888b());
            m106940a(str, 1, j, str2);
        }
    }

    /* renamed from: a */
    public static VideoChooseFragment m106936a(int i, int i2, int i3, boolean z, AVChallenge aVChallenge, C33177i iVar) {
        VideoChooseFragment videoChooseFragment = new VideoChooseFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NUM_COLUMNS", i);
        bundle.putInt("ARG_TEXT_COLOR", i2);
        bundle.putInt("ARG_SHADOW_COLOR", i3);
        bundle.putBoolean("ARG_MULTI_VIDEO_ENABLE", z);
        bundle.putSerializable("challenge", aVChallenge);
        videoChooseFragment.setArguments(bundle);
        videoChooseFragment.f86259o = iVar;
        return videoChooseFragment;
    }
}
