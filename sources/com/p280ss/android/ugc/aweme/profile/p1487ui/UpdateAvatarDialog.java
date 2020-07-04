package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36569s.C36572b;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.util.C36725aj;
import com.p280ss.android.ugc.aweme.profile.util.C36737j;
import com.p280ss.android.ugc.aweme.profile.util.C36761s;
import com.p280ss.android.ugc.aweme.profile.util.C36762t;
import com.p280ss.android.ugc.aweme.utils.C43150p;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog */
public class UpdateAvatarDialog extends UpdateUserInfoDialog implements C36039m, C36572b {

    /* renamed from: m */
    private static final int[] f95252m = {R.drawable.bco, R.drawable.bcp, R.drawable.bcq, R.drawable.bcr};

    /* renamed from: n */
    private static final int[] f95253n = {R.drawable.bcj, R.drawable.bck, R.drawable.bcl, R.drawable.bcm};

    /* renamed from: o */
    private static final int[] f95254o = {R.drawable.bct, R.drawable.bcu, R.drawable.bcv, R.drawable.bcw};

    /* renamed from: a */
    protected C35999a f95255a;

    /* renamed from: b */
    public Fragment f95256b;

    /* renamed from: f */
    private C36569s f95257f;

    /* renamed from: g */
    private List<Integer> f95258g = new ArrayList();

    /* renamed from: h */
    private Activity f95259h;

    /* renamed from: i */
    private boolean f95260i;
    ImageView ivDisclaimer;

    /* renamed from: j */
    private boolean f95261j;

    /* renamed from: k */
    private int f95262k = -1;

    /* renamed from: l */
    private int f95263l;
    View mAvatarContainer;
    ImageView mAvatarDecoration;
    AvatarImageView mAvatarImageView;
    RecyclerView mDecorationRecyclerView;
    TextView mPolicyDes;
    ViewGroup mVpExpandContainer;
    TextView txtDisclaimer;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog$a */
    class C36302a extends C1272h {
        private C36302a() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            int i;
            int i2;
            int f = RecyclerView.m5892f(view);
            if (f == 0) {
                i = 0;
            } else {
                i = (int) C9738o.m28708b(view.getContext(), 4.0f);
            }
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || f == layoutManager.mo5744A() - 1) {
                i2 = 0;
            } else {
                i2 = (int) C9738o.m28708b(view.getContext(), 4.0f);
            }
            rect.set(i, 0, i2, 0);
        }
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
    }

    /* renamed from: j */
    private int m117312j() {
        if (this.f95262k < 0) {
            return 0;
        }
        return this.f95262k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo92352e() {
        if (this.f95263l == 3) {
            return R.layout.le;
        }
        return R.layout.lc;
    }

    /* renamed from: h */
    private void m117310h() {
        C23323e.m76524b(this.mAvatarImageView, C43150p.m136858b(this.f95272e));
        this.mAvatarContainer.setOnClickListener(new C36450ee(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92344a() {
        super.mo92344a();
        for (int valueOf : f95252m) {
            this.f95258g.add(Integer.valueOf(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo92350c() {
        super.mo92350c();
        C36737j.m118426a(m117335g(), this.mPolicyDes, this.mVpExpandContainer, this.txtDisclaimer, this.ivDisclaimer, true);
        m117310h();
        m117311i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ String mo92353f() throws Exception {
        return mo92348b(BitmapFactory.decodeFile(C36761s.m118497c().getAbsolutePath()));
    }

    /* renamed from: i */
    private void m117311i() {
        this.f95257f = new C36569s();
        this.f95257f.mo66516d(false);
        this.f95257f.f95968c = this;
        this.mDecorationRecyclerView.setNestedScrollingEnabled(false);
        this.mDecorationRecyclerView.setAdapter(this.f95257f);
        this.mDecorationRecyclerView.mo5525a((C1272h) new C36302a());
        C363011 r0 = new WrapLinearLayoutManager(getContext()) {
            /* renamed from: e */
            public final boolean mo5438e() {
                return false;
            }
        };
        r0.mo5427b(0);
        this.mDecorationRecyclerView.setLayoutManager(r0);
        this.f95257f.mo58045a(this.f95258g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo92351d() {
        String str;
        if (this.f95263l == 3) {
            if (this.mNickNameEditText == null || this.mNickNameEditText.getText() == null) {
                str = "";
            } else {
                str = this.mNickNameEditText.getText().toString();
            }
            if (m117333b(str)) {
                return;
            }
        }
        if (!this.f95260i) {
            C23323e.m76501a(C43150p.m136858b(this.f95272e), 0, 0, (C23319b<Bitmap>) new C36449ed<Bitmap>(this));
        } else if (!this.f95261j) {
            this.f95255a.mo91613a(C36761s.m118497c().getAbsolutePath(), null);
            return;
        } else {
            C1592h.m7853a((Callable<TResult>) new C36447eb<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C36448ec<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
        C6907h.m21524a("profile_update_alert_finish", (Map) C22984d.m75611a().mo59973a("type", C36725aj.m118394a(this.f95263l)).f60753a);
    }

    /* renamed from: a */
    private void m117308a(C35999a aVar) {
        this.f95255a = aVar;
        this.f95255a.f94183c = this;
        this.f95255a.mo80250b(this.f95259h, this.f95256b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo92343a(C1592h hVar) throws Exception {
        if (this.f95255a != null && hVar.mo6882b() && !TextUtils.isEmpty((CharSequence) hVar.mo6890e())) {
            this.f95255a.mo91613a((String) hVar.mo6890e(), null);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo92349b(C1592h hVar) throws Exception {
        if (this.f95255a != null && hVar.mo6882b() && !TextUtils.isEmpty((CharSequence) hVar.mo6890e())) {
            this.f95255a.mo91613a((String) hVar.mo6890e(), null);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo92345a(int i) {
        boolean z;
        this.f95261j = true;
        if (this.f95260i) {
            if (this.f95262k != i) {
                z = true;
            } else {
                z = false;
            }
            this.f95261j = z;
        }
        if (this.mAvatarDecoration != null) {
            if (this.f95261j) {
                C23487o.m77146a(true, this.mAvatarDecoration);
                this.mAvatarDecoration.setImageResource(f95253n[i]);
                this.f95262k = i;
                return;
            }
            C23487o.m77146a(false, this.mAvatarDecoration);
            this.f95262k = -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String mo92348b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, createBitmap.getConfig());
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), f95254o[m117312j()]);
        if (decodeResource.getWidth() <= 0 || decodeResource.getHeight() <= 0) {
            return "";
        }
        float width2 = ((float) width) / ((float) decodeResource.getWidth());
        float height2 = ((float) height) / ((float) decodeResource.getHeight());
        Matrix matrix = new Matrix();
        matrix.postScale(width2, height2);
        Bitmap createBitmap3 = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, null);
        File c = C36761s.m118497c();
        boolean saveBitmapToSD = BitmapUtils.saveBitmapToSD(createBitmap2, c.getParent(), c.getName());
        if (createBitmap != null) {
            createBitmap.recycle();
        }
        if (createBitmap2 != null) {
            createBitmap2.recycle();
        }
        if (decodeResource != null) {
            decodeResource.recycle();
        }
        if (createBitmap3 != null) {
            createBitmap3.recycle();
        }
        if (saveBitmapToSD) {
            return c.getAbsolutePath();
        }
        return "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92346a(Bitmap bitmap) {
        C1592h.m7853a((Callable<TResult>) new C36451ef<TResult>(this, bitmap)).mo6876a((C1591g<TResult, TContinuationResult>) new C36452eg<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92347a(View view) {
        if (this.f95255a != null) {
            this.f95255a.mo91611a(0);
        }
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (this.f95255a != null) {
            this.f95255a.mo91617g();
        }
        if (avatarUri == null) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.d0).mo25750a();
            return;
        }
        if (!(this.f95270c == null || this.f95271d == null)) {
            this.f95270c.f94398d = avatarUri.uri;
            if (this.f95263l == 3) {
                String obj = this.mNickNameEditText.getText().toString();
                if (!C36762t.m118498a(obj)) {
                    C10761a.m31409e(C6399b.m19921a(), (int) R.string.clp).mo25750a();
                    return;
                } else if (!TextUtils.equals(obj, C21115b.m71197a().getCurUser().getNickname())) {
                    this.f95270c.f94395a = obj;
                }
            }
            Map a = this.f95270c.mo91866a();
            a.put("target_user", "1");
            this.f95271d.mo91643a(a);
        }
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        this.f95260i = true;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        C13380c.m39172c().mo33181b(parse);
        C23323e.m76514a((RemoteImageView) this.mAvatarImageView, parse.toString());
        if (this.mAvatarDecoration != null) {
            this.mAvatarDecoration.setVisibility(8);
        }
        if (this.f95257f != null) {
            this.f95257f.f95966a = true;
            this.f95257f.mo92783f();
            this.f95257f.mo92782b(-1);
        }
    }

    public UpdateAvatarDialog(Context context, int i, C35999a aVar, Fragment fragment, boolean z) {
        super(context, z);
        this.f95259h = (Activity) context;
        this.f95263l = i;
        this.f95256b = fragment;
        m117308a(aVar);
    }
}
