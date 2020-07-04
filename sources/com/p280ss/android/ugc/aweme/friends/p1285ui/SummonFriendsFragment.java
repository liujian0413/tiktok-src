package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.friends.adapter.SummonFriendAdapter;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30040b;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30046f;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30049g;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.SummonFriendsFragment */
public class SummonFriendsFragment extends AmeBaseFragment implements OnTouchListener, C25675c<SummonFriendItem>, C30040b {

    /* renamed from: e */
    public SummonFriendAdapter f79347e;

    /* renamed from: f */
    public C30049g f79348f;

    /* renamed from: g */
    public C30046f f79349g;

    /* renamed from: h */
    public boolean f79350h;

    /* renamed from: i */
    public int f79351i;

    /* renamed from: j */
    private List<SummonFriendItem> f79352j;

    /* renamed from: k */
    private String f79353k;

    /* renamed from: l */
    private boolean f79354l;
    ImageView mBackView;
    View mBtnClear;
    EditText mEditView;
    ImageView mIvSearchBar;
    RecyclerView mListView;
    TextView mSendView;
    DmtStatusView mStatusView;
    TextView mTitleView;
    int margin;

    /* renamed from: a */
    public static String m98764a(int i) {
        return i == 1 ? "comment_user" : i == 0 ? "at_user" : "";
    }

    /* renamed from: c */
    private static String m98766c(int i) {
        return i == 1 ? "comment_at" : i == 0 ? "edit_at" : "";
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
    }

    public final void aD_() {
    }

    public final void aE_() {
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
    }

    public final void ae_() {
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<SummonFriendItem> list, boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ String mo76622j() {
        return this.f79348f.f79024a;
    }

    /* renamed from: k */
    private void m98768k() {
        this.mTitleView.setText(R.string.e3o);
    }

    /* renamed from: g */
    public final void mo76620g() {
        if (this.f79350h) {
            LayoutParams layoutParams = (LayoutParams) this.mStatusView.getLayoutParams();
            layoutParams.bottomMargin = 0;
            this.mStatusView.setLayoutParams(layoutParams);
        }
        this.mStatusView.mo25939d();
    }

    /* renamed from: i */
    public final void mo76621i() {
        if (isViewValid()) {
            C25713b.m84474a((Activity) getActivity(), (View) this.mEditView);
        }
    }

    /* renamed from: l */
    private int m98769l() {
        if (getActivity() == null) {
            return 0;
        }
        int height = getActivity().getWindow().getDecorView().getHeight();
        Rect rect = new Rect();
        getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return height - rect.bottom;
    }

    /* renamed from: e */
    public final void mo76291e() {
        if (isViewValid() && getActivity() != null) {
            if (this.f79350h) {
                LayoutParams layoutParams = (LayoutParams) this.mStatusView.getLayoutParams();
                layoutParams.bottomMargin = m98769l();
                this.mStatusView.setLayoutParams(layoutParams);
            }
            this.mStatusView.mo25942f();
        }
    }

    /* renamed from: f */
    public final void mo76619f() {
        String trim = this.mEditView.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            this.f79350h = true;
            if (!C30154ae.m98790a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                return;
            }
            C6907h.onEvent(MobClick.obtain().setEventName("search").setLabelName(m98766c(this.f79351i)).setJsonObject(new C6869c().mo16887a(POIService.KEY_KEYWORD, trim).mo16888b()));
            if (this.f79347e != null) {
                this.f79347e.f78972b = trim;
            }
            this.f79354l = true;
            this.f79348f.mo56976a(Boolean.valueOf(true), trim, m98764a(this.f79351i));
        }
    }

    public void click(View view) {
        int id = view.getId();
        if (id == R.id.jo) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return;
        }
        if (id == R.id.e1h) {
            mo76619f();
        }
    }

    /* renamed from: d */
    public final void mo76290d(Exception exc) {
        this.f79354l = false;
        if (isViewValid()) {
            mo76620g();
            this.mListView.setVisibility(8);
            this.mStatusView.mo25944h();
            mo76621i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76617a(View view) {
        this.f79348f.mo56976a(Boolean.valueOf(false), this.mEditView.getText().toString(), m98764a(this.f79351i));
    }

    public void onTextChange(CharSequence charSequence) {
        this.mSendView.setEnabled(!TextUtils.isEmpty(charSequence));
        if (TextUtils.isEmpty(charSequence)) {
            this.f79350h = false;
            m98767d(this.f79352j, true);
            this.f79347e.mo76239a(this.f79352j);
            this.f79347e.ai_();
        }
    }

    /* renamed from: b */
    private View m98765b(int i) {
        if (C6399b.m19944t()) {
            MtEmptyView a = MtEmptyView.m31657a(getContext());
            a.setStatus(new C10806a(getContext()).mo25985a((int) R.drawable.ax3).mo25990b((int) R.string.b8k).mo25993c(i).f29135a);
            return a;
        }
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setStatus(new C10806a(getContext()).mo25985a((int) R.drawable.b7d).mo25990b((int) R.string.b8k).mo25993c(i).f29135a);
        return dmtDefaultView;
    }

    /* renamed from: a */
    public static SummonFriendsFragment m98763a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("video_id", str);
        bundle.putInt("source", i);
        SummonFriendsFragment summonFriendsFragment = new SummonFriendsFragment();
        summonFriendsFragment.setArguments(bundle);
        return summonFriendsFragment;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int id = view.getId();
        if (id == R.id.bng) {
            if (this.f79354l) {
                return true;
            }
        } else if (id == R.id.agn && this.mEditView != null) {
            this.mEditView.setCursorVisible(true);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo59108b(List<SummonFriendItem> list, boolean z) {
        if (isViewValid() && list != null && !list.isEmpty()) {
            mo76620g();
            if (C7213d.m22500a().mo18803bo().useRecyclerPartialUpdate) {
                this.f79347e.mo76240b(list);
            } else {
                this.f79347e.mo76239a(list);
            }
            if (z) {
                this.f79347e.ai_();
            } else {
                this.f79347e.ah_();
            }
            mo76621i();
        }
    }

    /* renamed from: d */
    private void m98767d(List<SummonFriendItem> list, boolean z) {
        if (this.mListView != null && this.mStatusView != null && this.mEditView != null && list != null) {
            if (list.isEmpty()) {
                this.mListView.setVisibility(8);
                if (!z && this.f79351i == 0) {
                    this.mStatusView.setBuilder(this.mStatusView.mo25937c().mo25963b(m98765b((int) R.string.dkl)));
                }
                this.mStatusView.mo25943g();
                if (!z) {
                    this.mEditView.setHint(getString(R.string.cm9));
                }
            } else {
                this.mListView.setVisibility(0);
                this.mStatusView.mo25939d();
            }
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<SummonFriendItem> list, boolean z) {
        if (list != null) {
            if (this.f79352j == null) {
                this.f79352j = new ArrayList();
            }
            this.f79352j = list;
            m98767d(list, false);
            this.f79347e.mo76239a(this.f79352j);
            this.f79347e.ai_();
        }
    }

    /* renamed from: a */
    public final void mo76289a(List<SummonFriendItem> list, String str) {
        int i;
        if (this.f79351i == 0 && C6399b.m19944t()) {
            C6907h.m21528b("search_video_at", C33230ac.m107211a(C22984d.m75611a().mo59973a("search_keyword", str).mo59973a("log_pb", C28199ae.m92689a().mo71791a(this.f79348f.f79024a)).f60753a));
        }
        this.f79354l = false;
        if (isViewValid() && !TextUtils.isEmpty(this.mEditView.getText().toString().trim())) {
            mo76620g();
            if (list == null || list.isEmpty()) {
                this.mListView.setVisibility(8);
                if (this.f79351i == 0) {
                    DmtStatusView dmtStatusView = this.mStatusView;
                    C10803a c = this.mStatusView.mo25937c();
                    if (C6399b.m19946v()) {
                        i = R.string.cej;
                    } else {
                        i = R.string.cmv;
                    }
                    dmtStatusView.setBuilder(c.mo25963b(m98765b(i)));
                }
                this.mStatusView.mo25943g();
                this.mEditView.setHint(getString(R.string.cmv));
                return;
            }
            this.mListView.setVisibility(0);
            this.mStatusView.mo25939d();
            this.f79347e.mo76239a(list);
            if (this.f79348f.mo76310e()) {
                this.f79347e.ai_();
            } else {
                this.f79347e.ah_();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f79353k = getArguments().getString("video_id");
        this.f79351i = getArguments().getInt("source");
        m98768k();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f79347e = new SummonFriendAdapter(this.f79353k, this.f79351i);
        this.f79347e.f78973c = new C30152ac(this);
        this.mListView.setAdapter(this.f79347e);
        this.mListView.setOnTouchListener(this);
        this.f79348f = new C30049g();
        this.f79349g = new C30046f();
        this.f79348f.mo66537a(this);
        this.f79349g.mo66537a(this);
        this.f79349g.mo76307a(true);
        this.f79347e.mo66516d(true);
        this.f79347e.mo66504a((C6905a) new C6905a() {
            public final void bd_() {
                SummonFriendsFragment.this.f79347e.ag_();
                if (SummonFriendsFragment.this.f79350h) {
                    SummonFriendsFragment.this.f79348f.mo56976a(Boolean.valueOf(false), SummonFriendsFragment.this.mEditView.getText().toString(), SummonFriendsFragment.m98764a(SummonFriendsFragment.this.f79351i));
                    return;
                }
                SummonFriendsFragment.this.f79349g.mo76307a(false);
            }
        });
        this.mEditView.setHint(getString(R.string.e3n));
        this.mEditView.setOnTouchListener(this);
        this.mEditView.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(editable.toString())) {
                    SummonFriendsFragment.this.mo76619f();
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (TextUtils.isEmpty(charSequence)) {
                    SummonFriendsFragment.this.mBtnClear.setVisibility(8);
                } else {
                    SummonFriendsFragment.this.mBtnClear.setVisibility(0);
                }
            }
        });
        this.mEditView.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66) {
                    return false;
                }
                SummonFriendsFragment.this.mEditView.setCursorVisible(false);
                SummonFriendsFragment.this.mo76621i();
                SummonFriendsFragment.this.mo76620g();
                return true;
            }
        });
        this.mBtnClear.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SummonFriendsFragment.this.mEditView.setText("");
            }
        });
        mo76621i();
        DmtStatusView dmtStatusView = this.mStatusView;
        C10803a a = C10803a.m31631a(getContext());
        if (this.f79351i == 1) {
            i = R.string.fii;
        } else {
            i = R.string.fij;
        }
        dmtStatusView.setBuilder(a.mo25963b(m98765b(i)).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C30153ad(this)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.r6, viewGroup, false);
    }
}
