package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.challenge.api.ChallengeServerException;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23659b;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23675d;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23683j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.BaseDialogFragment;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40248a;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.CreateChallengeDialogFragment */
public class CreateChallengeDialogFragment extends BaseDialogFragment implements C23683j {

    /* renamed from: a */
    private C23675d f62558a;

    /* renamed from: b */
    private C41653c f62559b;

    /* renamed from: c */
    private int f62560c;

    /* renamed from: d */
    private OnKeyListener f62561d = new OnKeyListener() {

        /* renamed from: b */
        private boolean f62565b;

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.f62565b = true;
                return false;
            } else if (4 != i || !this.f62565b) {
                return false;
            } else {
                CreateChallengeDialogFragment.this.back();
                this.f62565b = false;
                return true;
            }
        }
    };
    TextView mConfirmView;
    TextView mCountView;
    View mDeleteView;
    EditText mEditDescView;
    EditText mEditTitleView;
    TextView mTitleView;

    public void back() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
            activity.onBackPressed();
            activity.finish();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f62558a != null) {
            this.f62558a.mo59134U_();
        }
        if (this.f62559b != null) {
            this.f62559b.dismiss();
            this.f62559b = null;
        }
    }

    /* renamed from: a */
    private void m77799a() {
        this.mTitleView.setText(R.string.ym);
        this.mTitleView.setTextColor(getResources().getColor(R.color.aye));
        this.mTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.a4z, 0);
    }

    /* renamed from: b */
    private void m77801b() {
        Bundle arguments = getArguments();
        String string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_NAME");
        if (!TextUtils.isEmpty(string)) {
            this.mEditTitleView.setText(string);
            this.mEditDescView.setSelection(0);
        } else {
            this.mEditTitleView.setSelection(0);
            this.mEditTitleView.setText("");
        }
        this.mEditTitleView.setSelection(this.mEditTitleView.getText().length());
        this.f62560c = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 1);
    }

    /* renamed from: c */
    private void m77802c() {
        if (mo66608p() && getActivity() != null) {
            if (!C23804p.m78015a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                return;
            }
            String trim = this.mEditTitleView.getText().toString().trim();
            if (TextUtils.isEmpty(trim)) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.yv).mo25750a();
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f62559b = C41653c.m132582a(activity, activity.getString(R.string.d5k));
                if (this.f62558a != null) {
                    this.f62558a.mo56976a(trim, this.mEditDescView.getText().toString().trim());
                }
            }
        }
    }

    public void onDescTextChange(CharSequence charSequence) {
        m77800a(charSequence);
    }

    /* renamed from: a */
    public final void mo61610a(Challenge challenge) {
        if (mo66608p()) {
            this.f62559b.dismiss();
            mo61724b(challenge);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.sd);
    }

    public void onTitleTextChange(CharSequence charSequence) {
        int i;
        View view = this.mDeleteView;
        if (!TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* renamed from: c */
    private void m77803c(final Challenge challenge) {
        if (getActivity() != null) {
            new C11030a(getActivity()).mo26634a((int) R.string.yr).mo26645b((int) R.string.ys).mo26646b((int) R.string.pp, (OnClickListener) null).mo26635a((int) R.string.yu, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CreateChallengeDialogFragment.this.mo61724b(challenge);
                }
            }).mo26649b();
        }
    }

    public void click(View view) {
        int id = view.getId();
        if (id == R.id.jo) {
            if (this.f62560c == 1) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                    activity.onBackPressed();
                    activity.finish();
                }
            }
        } else if (id == R.id.a11) {
            m77802c();
            C25713b.m84474a((Activity) getActivity(), (View) this.mEditDescView);
        } else if (id == R.id.dhh) {
            this.mEditTitleView.setText("");
        }
    }

    /* renamed from: a */
    private void m77800a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mCountView.setText(R.string.aob);
            return;
        }
        this.mCountView.setText(getActivity().getString(R.string.aoa, new Object[]{Integer.valueOf(60 - charSequence.length())}));
    }

    /* renamed from: a */
    public final void mo61611a(Exception exc) {
        if (mo66608p()) {
            this.f62559b.dismiss();
            if (exc instanceof ChallengeServerException) {
                ChallengeServerException challengeServerException = (ChallengeServerException) exc;
                if (challengeServerException.getErrorCode() == 2069) {
                    m77803c(challengeServerException.getChallenge());
                    return;
                }
            }
            if (getActivity() != null) {
                C22814a.m75245a(getActivity(), exc, R.string.yn);
            }
        }
    }

    /* renamed from: b */
    public final void mo61724b(Challenge challenge) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(challenge);
        if (this.f62560c == 0) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C6907h.m21518a(getContext(), "add_challenge", "publish", challenge.getCid(), 0);
                if (C6399b.m19944t()) {
                    activity.setResult(-1);
                    activity.onBackPressed();
                } else {
                    C42961az.m136380a(new C23659b(challenge));
                }
            }
            return;
        }
        AmeActivity ameActivity = (AmeActivity) getActivity();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
        if (!C21115b.m71197a().isLogin()) {
            C32656f.m105742a((Activity) ameActivity, "publish", "add_challenge");
        } else if (ameActivity != null) {
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing()) {
                C10761a.m31409e(getContext(), (int) R.string.ig).mo25750a();
                return;
            }
            String uuid = UUID.randomUUID().toString();
            C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "challenge").mo59970a("_staging_flag", C6399b.m19946v() ^ true ? 1 : 0).mo59973a("tag_id", challenge.getCid()).f60753a);
            Intent intent = new Intent();
            intent.putExtra("shoot_way", "challenge");
            intent.putExtra("creation_id", uuid);
            intent.putExtra("translation_type", 3);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            new C40248a();
            intent.putExtra("challenge", C40248a.m128593a(challenge));
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) ameActivity, intent);
            ameActivity.finish();
            C6907h.m21518a(getContext(), "challenge_create", "publish", challenge.getCid(), 0);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        m77801b();
        TextView textView = this.mConfirmView;
        if (this.f62560c == 0) {
            i = R.string.afn;
        } else {
            i = R.string.byn;
        }
        textView.setText(i);
        if (bundle == null) {
            this.mEditDescView.setText("");
        }
        m77800a((CharSequence) this.mEditDescView.getText());
        this.f62558a = new C23675d();
        this.f62558a.mo66537a(this);
        getDialog().setOnKeyListener(this.f62561d);
        if (this.f62560c == 0) {
            getDialog().getWindow().getAttributes().windowAnimations = R.style.sx;
        }
        mo66607i(this.mEditDescView);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.nl, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        m77799a();
        return inflate;
    }
}
