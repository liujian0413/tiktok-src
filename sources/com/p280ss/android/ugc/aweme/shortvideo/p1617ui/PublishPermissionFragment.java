package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishPermissionFragment */
public class PublishPermissionFragment extends Fragment {

    /* renamed from: a */
    int f107095a;

    /* renamed from: b */
    int f107096b;

    /* renamed from: c */
    private int f107097c;

    /* renamed from: d */
    private int f107098d;
    @BindDrawable(2131296479)
    Drawable mImgNormal;
    @BindView(2131493555)
    ImageView mImgPermissionFriend;
    @BindView(2131493556)
    ImageView mImgPermissionOpen;
    @BindView(2131493557)
    ImageView mImgPermissionPrivate;
    @BindDrawable(2131296791)
    Drawable mImgSelected;
    @BindString(2132083333)
    String mTitle;
    @BindView(2131493995)
    TextView mTvPermissionOpen;
    @BindView(2131493996)
    TextView mTvPermissionOpenText;
    @BindView(2131493406)
    LinearLayout permissionFriendLayout;
    @BindView(2131493407)
    LinearLayout permissionOpenLayout;
    @BindView(2131493408)
    LinearLayout permissionPrivateLayout;

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
    private void m131368b() {
        Intent intent = new Intent();
        intent.putExtra("extra.PERMISSION", this.f107097c);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    /* renamed from: c */
    private static boolean m131370c() {
        boolean a = C35563c.f93230L.mo93342a(Property.PublishPermissionDialogPrivate);
        if (a) {
            C35563c.f93230L.mo93341a(Property.PublishPermissionDialogPrivate, false);
        }
        return a;
    }

    /* renamed from: d */
    private static boolean m131371d() {
        boolean a = C35563c.f93230L.mo93342a(Property.PublishPermissionDialogFriend);
        if (a) {
            C35563c.f93230L.mo93341a(Property.PublishPermissionDialogFriend, false);
        }
        return a;
    }

    /* renamed from: a */
    private void m131364a() {
        C22200c e = C35563c.f93260w.mo57092e();
        if (C6399b.m19944t() && e != null && e.mo58561d()) {
            this.mTvPermissionOpen.setText(R.string.d95);
            this.mTvPermissionOpenText.setText(R.string.d96);
        }
    }

    /* renamed from: b */
    private void m131369b(int i) {
        this.f107097c = i;
        m131365a(this.f107097c);
        m131368b();
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131493407, 2131493406, 2131493408})
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.bit) {
            m131369b(0);
        } else if (id != R.id.bis) {
            if (id == R.id.biu) {
                if (m131370c()) {
                    m131366a(1, this.f107096b);
                    return;
                }
                m131369b(1);
            }
        } else if (m131371d()) {
            m131366a(2, this.f107095a);
        } else {
            m131369b(2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f107097c = arguments.getInt("extra.PERMISSION");
        this.f107096b = arguments.getInt("extra.Private.DESCRIPTION");
        this.f107095a = arguments.getInt("extra.Friend.DESCRIPTION");
        this.f107098d = arguments.getInt("extra.TYPE");
    }

    /* renamed from: a */
    private void m131365a(int i) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        ImageView imageView = this.mImgPermissionOpen;
        if (i == 0) {
            drawable = this.mImgSelected;
        } else {
            drawable = this.mImgNormal;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView2 = this.mImgPermissionFriend;
        if (i == 2) {
            drawable2 = this.mImgSelected;
        } else {
            drawable2 = this.mImgNormal;
        }
        imageView2.setImageDrawable(drawable2);
        ImageView imageView3 = this.mImgPermissionPrivate;
        if (i == 1) {
            drawable3 = this.mImgSelected;
        } else {
            drawable3 = this.mImgNormal;
        }
        imageView3.setImageDrawable(drawable3);
    }

    /* renamed from: a */
    private void m131366a(int i, int i2) {
        m131367a(i, getContext().getString(i2));
    }

    /* renamed from: a */
    private void m131367a(int i, String str) {
        C10741a aVar = new C10741a(getContext());
        aVar.mo25660b(str);
        aVar.mo25650a((int) R.string.ap5, (OnClickListener) new C41242ac(this, i));
        aVar.mo25656a().mo25637a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        this.permissionOpenLayout.setBackground(C10774c.m31449e(getContext()));
        this.permissionFriendLayout.setBackground(C10774c.m31449e(getContext()));
        this.permissionPrivateLayout.setBackground(C10774c.m31449e(getContext()));
        m131365a(this.f107097c);
        m131364a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qb, viewGroup, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101657a(int i, DialogInterface dialogInterface, int i2) {
        this.f107097c = i;
        m131365a(i);
        dialogInterface.dismiss();
        m131368b();
    }

    /* renamed from: a */
    public static PublishPermissionFragment m131363a(int i, int i2, int i3, int i4) {
        PublishPermissionFragment publishPermissionFragment = new PublishPermissionFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("extra.TYPE", i);
        bundle.putInt("extra.PERMISSION", i2);
        bundle.putInt("extra.Private.DESCRIPTION", i3);
        bundle.putInt("extra.Friend.DESCRIPTION", i4);
        publishPermissionFragment.setArguments(bundle);
        return publishPermissionFragment;
    }
}
