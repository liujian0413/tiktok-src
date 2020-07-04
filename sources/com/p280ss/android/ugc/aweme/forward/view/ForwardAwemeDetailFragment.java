package com.p280ss.android.ugc.aweme.forward.view;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.forward.adapter.FeedDetailAdapter;
import com.p280ss.android.ugc.aweme.forward.model.C29906b;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29873d;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29886f;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.view.ForwardAwemeDetailFragment */
public class ForwardAwemeDetailFragment extends BaseAwemeDetailFragment implements C29873d {

    /* renamed from: o */
    private C29886f f78719o;

    public final void ae_() {
        super.ae_();
        this.mEditText.performClick();
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f78719o != null) {
            this.f78719o.mo59134U_();
            this.f78719o.mo66535W_();
        }
        C24217a.m79549a().clearAllTranslationCache();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo76097u() {
        if (getArguments() != null) {
            String string = getArguments().getString("forward_id");
            if (!TextUtils.isEmpty(string)) {
                this.f78719o = new C29886f();
                this.f78719o.mo66536a(new C29906b());
                this.f78719o.mo66537a(this);
                this.f78719o.mo56976a(string);
            }
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        super.mo59105a_(exc);
        this.mEditText.performClick();
    }

    /* renamed from: a */
    public final void mo75897a(ForwardDetail forwardDetail) {
        this.f78681k = forwardDetail.getAweme();
        if (this.f78681k == null || this.f78681k.getAwemeType() != 13) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f78676f.f78465j = this.f78681k;
        this.f78676f.mo58045a(FeedDetailAdapter.m97717a(forwardDetail.getAweme(), (List<Comment>) new ArrayList<Comment>()));
        C29893a.m97890b(this.f78678h, this.f78681k);
        mo76098v();
        mo76099w();
    }

    /* renamed from: a */
    public final void mo59099a(List<Comment> list, boolean z) {
        boolean z2;
        super.mo59099a(list, z);
        if (getArguments() != null) {
            if (!C6399b.m19947w() || (list != null && list.size() >= 3)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (getArguments().containsKey("cid")) {
                String string = getArguments().getString("cid", "");
                if (list != null) {
                    for (Comment comment : list) {
                        if (TextUtils.equals(comment.getCid(), string)) {
                            if (comment.getUser() != null) {
                                comment.getUser().getUid();
                            }
                            if (z2) {
                                mo75872d(comment);
                            } else {
                                this.f78682l = comment;
                                this.mEditText.setHint(getString(R.string.dem, C43122ff.m136753A(comment.getUser())));
                            }
                        }
                    }
                } else if (z2) {
                    this.mEditText.performClick();
                }
            } else if (z2) {
                this.mEditText.performClick();
            }
        }
    }
}
