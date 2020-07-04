package com.p280ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.p280ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.p280ss.android.ugc.aweme.views.TextClickable;
import com.p280ss.android.ugc.aweme.views.TextClickable.C43354a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramDialog */
public class PromoteProgramDialog extends C43374j implements C6310a {

    /* renamed from: a */
    public String f96744a;

    /* renamed from: b */
    public Activity f96745b;

    /* renamed from: c */
    public C36922a f96746c;

    /* renamed from: d */
    public C6309f f96747d;

    /* renamed from: e */
    private String f96748e;

    /* renamed from: f */
    private View f96749f;

    /* renamed from: g */
    private DmtLoadingDialog f96750g;
    View mBtnJoin;
    View mBtnNext;
    View mRootView;
    String mStrRegular;
    TextView mTvMsg;
    TextView mTvProtocol;
    TextView mTvTitle;

    public void dismiss() {
        super.dismiss();
        mo93272a(false);
    }

    public void show() {
        super.show();
        C10730a.m31310a(true, this.mRootView);
    }

    /* renamed from: b */
    private void m118797b() {
        TextClickable textClickable = new TextClickable();
        textClickable.mo105215a(Pattern.compile(this.mStrRegular), 0);
        textClickable.mo105216a(this.mTvProtocol);
        textClickable.f112302b = new C43354a() {
            /* renamed from: a */
            public final void mo93279a(TextPaint textPaint) {
                textPaint.setFakeBoldText(true);
                textPaint.setColor(PromoteProgramDialog.this.f96745b.getResources().getColor(R.color.a5i));
                textPaint.setUnderlineText(true);
            }

            /* renamed from: a */
            public final void mo93280a(View view, String str, int i) {
                if (PromoteProgramDialog.this.mStrRegular.equals(str)) {
                    PromoteProgramDialog.this.f96746c.mo93286a(PromoteProgramDialog.this.f96745b, PromoteProgramDialog.this.f96744a, PromoteProgramDialog.this.mStrRegular);
                }
            }
        };
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7705c a = C7705c.m23799a();
        if (a.mo20392b((Object) this)) {
            a.mo20393c((Object) this);
        }
    }

    /* renamed from: a */
    private void m118794a() {
        this.f96747d = new C6309f(this);
        final Integer num = (Integer) SharePrefCache.inst().getPromoteDialogPopupClickType().mo59877d();
        this.mBtnJoin.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C6907h.m21524a("creative_permission_yes", (Map) C22984d.m75611a().f60753a);
                if (num.intValue() == 0) {
                    PromoteProgramDialog.this.mo93272a(true);
                    PromoteProgramRequestApiManager.m118801a(PromoteProgramDialog.this.f96747d);
                    return;
                }
                if (num.intValue() == 1) {
                    PromoteProgramDialog.this.f96746c.mo93286a(PromoteProgramDialog.this.f96745b, PromoteProgramDialog.this.f96744a, PromoteProgramDialog.this.mStrRegular);
                }
            }
        });
        this.mBtnNext.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                PromoteProgramDialog.this.mo93272a(true);
                C6907h.m21524a("creative_permission_no", (Map) C22984d.m75611a().f60753a);
                PromoteProgramRequestApiManager.m118802b(null);
                PromoteProgramDialog.this.dismiss();
            }
        });
        String str = (String) SharePrefCache.inst().getPromoteDialogPopupPopupTitle().mo59877d();
        String str2 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupMsg().mo59877d();
        String str3 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupContent().mo59877d();
        if (!TextUtils.isEmpty(str)) {
            this.mTvTitle.setText(str);
        }
        if (this.mTvTitle.getText() != null) {
            if (num.intValue() == 0) {
                this.mTvTitle.setText(this.mTvTitle.getText().toString().replaceAll("!", "").replaceAll("！", ""));
            }
            this.mTvTitle.setText(this.mTvTitle.getText().toString().replaceAll("\\\\n", "\n"));
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mTvMsg.setText(str2);
        } else {
            this.mTvMsg.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.mTvProtocol.setText(str3);
        }
        m118797b();
    }

    @C7709l
    public void closeKrCopyright(C36926d dVar) {
        dismiss();
    }

    /* renamed from: a */
    public final void mo93272a(boolean z) {
        if (z) {
            if (this.f96750g == null) {
                this.f96750g = new DmtLoadingDialog(this.f96745b);
            }
            this.f96750g.show();
            return;
        }
        if (this.f96750g != null) {
            this.f96750g.dismiss();
        }
    }

    /* renamed from: a */
    private void m118796a(Context context) {
        this.f96749f = LayoutInflater.from(context).inflate(R.layout.l3, null);
        setContentView(this.f96749f);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = C10730a.f28679f;
        window.addFlags(2);
        window.setAttributes(attributes);
        window.setWindowAnimations(0);
        attributes.width = (int) C9738o.m28708b(getContext(), 280.0f);
        ButterKnife.bind((Object) this, this.f96749f);
        this.f96746c = new C36926d();
        String str = (String) SharePrefCache.inst().getPromoteDialogPopupPopupUrl().mo59877d();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f96744a = str;
        String str2 = (String) SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().mo59877d();
        if (TextUtils.isEmpty(str2)) {
            str2 = this.mStrRegular;
        }
        this.mStrRegular = str2;
        m118794a();
    }

    public void handleMsg(Message message) {
        mo93272a(false);
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof ApiServerException) {
            C10761a.m31403c(C6399b.m19921a(), ((ApiServerException) obj).getErrorMsg()).mo25750a();
        } else if (obj instanceof Exception) {
            C10761a.m31403c(getContext(), getContext().getResources().getString(R.string.cjt)).mo25750a();
        } else {
            if ((obj instanceof PromoteProgramResponse) && i == 1 && ((PromoteProgramResponse) obj).isConfirmedSuccess()) {
                dismiss();
                C36924c.m118806a();
            }
        }
    }

    public PromoteProgramDialog(Activity activity, String str) {
        super((Context) activity, (int) R.style.uu, false, true);
        m118795a(activity, str);
    }

    /* renamed from: a */
    private void m118795a(Activity activity, String str) {
        this.f96745b = activity;
        this.f96748e = str;
        setCancelable(false);
        C7705c a = C7705c.m23799a();
        if (!a.mo20392b((Object) this)) {
            a.mo20389a((Object) this);
        }
        m118796a((Context) activity);
    }

    public PromoteProgramDialog(Activity activity, String str, int i) {
        super(activity, R.style.uu, false, true, true);
        m118795a(activity, str);
    }
}
