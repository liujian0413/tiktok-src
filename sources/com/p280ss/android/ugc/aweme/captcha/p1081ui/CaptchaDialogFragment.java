package com.p280ss.android.ugc.aweme.captcha.p1081ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23629b;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23630c;
import com.p280ss.android.ugc.aweme.captcha.p1078a.C23633e;
import com.p280ss.android.ugc.aweme.captcha.p1079b.C23638a;
import com.p280ss.android.ugc.aweme.captcha.p1079b.C23639b;
import com.p280ss.android.ugc.aweme.captcha.p1079b.C23640c;
import com.p280ss.android.ugc.aweme.captcha.p1079b.C23641d;
import com.p280ss.android.ugc.aweme.captcha.p1081ui.DragBar.C23656a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.captcha.ui.CaptchaDialogFragment */
public class CaptchaDialogFragment extends BottomSheetDialogFragment implements OnClickListener, C23638a, C23639b {

    /* renamed from: a */
    public AnimatedImageView f62338a;

    /* renamed from: b */
    public AnimatedImageView f62339b;

    /* renamed from: c */
    public View f62340c;

    /* renamed from: d */
    public DragBar f62341d;

    /* renamed from: e */
    public C23637b f62342e;

    /* renamed from: f */
    public C23640c f62343f;

    /* renamed from: g */
    public C23629b f62344g;

    /* renamed from: h */
    public View f62345h;

    /* renamed from: i */
    public Runnable f62346i;

    /* renamed from: j */
    public boolean f62347j;

    /* renamed from: k */
    public long f62348k;

    /* renamed from: l */
    public boolean f62349l;

    /* renamed from: m */
    int f62350m;

    /* renamed from: n */
    private View f62351n;

    /* renamed from: o */
    private TextView f62352o;

    /* renamed from: p */
    private C23641d f62353p;

    /* renamed from: q */
    private int f62354q;

    /* renamed from: r */
    private boolean f62355r;

    /* renamed from: s */
    private float f62356s;

    /* renamed from: t */
    private float f62357t;

    public void onDestroyView() {
        this.f62353p.mo59134U_();
        this.f62343f.mo59134U_();
        super.onDestroyView();
    }

    /* renamed from: d */
    private void m77559d() {
        synchronized (CaptchaDialogFragment.class) {
            if (this.f62342e != null) {
                this.f62342e.mo57593b();
                this.f62342e = null;
            }
        }
    }

    /* renamed from: b */
    private void m77557b() {
        this.f62356s = C9738o.m28708b(getContext(), 262.5f);
        this.f62357t = C9738o.m28708b(getContext(), 150.0f);
        this.f62338a.getLayoutParams().width = (int) this.f62356s;
        this.f62338a.getLayoutParams().height = (int) this.f62357t;
        this.f62339b.getLayoutParams().width = (int) (this.f62356s * 0.33333334f);
        this.f62339b.getLayoutParams().height = (int) (this.f62357t * 0.4f);
        this.f62354q = (int) ((((float) C9738o.m28691a(getContext())) - this.f62356s) / 2.0f);
    }

    /* renamed from: c */
    private void m77558c() {
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            str = arguments.getString("title", "");
        }
        if (!TextUtils.isEmpty(str)) {
            this.f62352o.setText(str);
        }
        this.f62351n.setOnClickListener(this);
        this.f62340c.setOnClickListener(this);
        this.f62341d.setOnDragListener(new C23656a() {
            /* renamed from: a */
            public final void mo61561a() {
                CaptchaDialogFragment.this.f62348k = System.currentTimeMillis();
            }

            /* renamed from: a */
            public final void mo61562a(float f) {
                CaptchaDialogFragment.this.f62339b.setTranslationX(f * ((float) (CaptchaDialogFragment.this.f62338a.getMeasuredWidth() - CaptchaDialogFragment.this.f62339b.getMeasuredWidth())));
            }

            /* renamed from: b */
            public final void mo61563b(float f) {
                if (CaptchaDialogFragment.this.f62349l) {
                    if (CaptchaDialogFragment.this.f62346i != null) {
                        CaptchaDialogFragment.this.f62345h.removeCallbacks(CaptchaDialogFragment.this.f62346i);
                    }
                    C10761a.m31399c(CaptchaDialogFragment.this.getContext(), (int) R.string.fnq).mo25750a();
                    CaptchaDialogFragment.this.f62341d.mo61567a();
                    CaptchaDialogFragment.this.f62341d.setCanDragged(true);
                } else {
                    if (CaptchaDialogFragment.this.f62346i != null) {
                        CaptchaDialogFragment.this.f62345h.removeCallbacks(CaptchaDialogFragment.this.f62346i);
                    }
                    if (CaptchaDialogFragment.this.f62344g != null) {
                        CaptchaDialogFragment.this.f62343f.mo56976a(CaptchaDialogFragment.this.mo61556a(f, System.currentTimeMillis() - CaptchaDialogFragment.this.f62348k));
                    }
                }
                CaptchaDialogFragment.this.f62348k = 0;
            }
        });
        this.f62341d.setCanDragged(false);
        this.f62353p = new C23641d();
        this.f62353p.mo66537a(this);
        this.f62353p.mo56976a(Boolean.valueOf(false));
        this.f62343f = new C23640c();
        this.f62343f.mo66537a(this);
    }

    /* renamed from: a */
    public final void mo61557a() {
        if (this.f62347j && this.f62345h != null) {
            this.f62341d.setCanDragged(true);
            this.f62349l = false;
            if (this.f62346i == null) {
                this.f62346i = new Runnable() {
                    public final void run() {
                        if (CaptchaDialogFragment.this.f62347j) {
                            C10761a.m31403c(CaptchaDialogFragment.this.getContext(), CaptchaDialogFragment.this.getString(R.string.fnq)).mo25750a();
                            CaptchaDialogFragment.this.f62349l = true;
                        }
                    }
                };
            }
            this.f62345h.removeCallbacks(this.f62346i);
            this.f62345h.postDelayed(this.f62346i, (long) (((Integer) SharePrefCache.inst().getVerifyExceed().mo59877d()).intValue() * 1000));
        }
    }

    /* renamed from: a */
    public final void mo61545a(C23630c cVar) {
        if (this.f62347j && cVar != null) {
            this.f62353p.mo61549a(cVar.f62320a);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.g5);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getActivity(), this.mTheme);
    }

    /* renamed from: b */
    public final void mo61548b(Exception exc) {
        if (this.f62347j) {
            C22814a.m75244a((Context) getActivity(), (Throwable) exc);
            this.f62341d.postDelayed(new Runnable() {
                public final void run() {
                    if (CaptchaDialogFragment.this.f62347j) {
                        CaptchaDialogFragment.this.mo61558a(false);
                        CaptchaDialogFragment.this.f62341d.mo61567a();
                    }
                }
            }, 600);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new OnShowListener() {
                public final void onShow(DialogInterface dialogInterface) {
                    FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(R.id.a7r);
                    if (frameLayout != null) {
                        BottomSheetBehavior a = BottomSheetBehavior.m1365a(frameLayout);
                        a.mo1352a(frameLayout.getHeight());
                        a.f1341g = true;
                    }
                }
            });
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f62347j = false;
        this.f62345h.removeCallbacks(this.f62346i);
        if (!this.f62355r && this.f62342e != null) {
            m77559d();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f62347j = false;
        this.f62345h.removeCallbacks(this.f62346i);
        if (!this.f62355r && this.f62342e != null) {
            m77559d();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.b7g) {
            dismiss();
            return;
        }
        if (id == R.id.bbg) {
            if (this.f62346i != null) {
                this.f62345h.removeCallbacks(this.f62346i);
            }
            mo61558a(true);
        }
    }

    /* renamed from: a */
    public final void mo61544a(C23629b bVar) {
        if (this.f62347j && bVar != null) {
            this.f62344g = bVar;
            m77556a(this.f62338a, bVar.f62314b);
            m77556a(this.f62339b, bVar.f62316d);
            LayoutParams layoutParams = (LayoutParams) this.f62339b.getLayoutParams();
            layoutParams.setMargins(this.f62354q, (int) ((((float) bVar.f62318f) * this.f62357t) / ((float) bVar.f62315c.f62312b)), 0, 0);
            this.f62339b.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo61547a(C23633e eVar) {
        if (this.f62347j) {
            C10761a.m31387a(getContext(), eVar.f62330d).mo25750a();
            this.f62355r = true;
            dismiss();
            if (this.f62342e != null) {
                this.f62342e.mo57592a();
            }
        }
    }

    /* renamed from: a */
    public final void mo61546a(Exception exc) {
        if (this.f62347j) {
            C22814a.m75244a((Context) getActivity(), (Throwable) exc);
        }
    }

    /* renamed from: a */
    public final void mo61558a(boolean z) {
        this.f62340c.animate().rotation(360.0f).setDuration(400).withEndAction(new Runnable() {
            public final void run() {
                CaptchaDialogFragment.this.f62340c.setRotation(0.0f);
            }
        }).start();
        this.f62353p.mo56976a(Boolean.valueOf(z));
    }

    public int show(C0633q qVar, String str) {
        int show = super.show(qVar, str);
        this.f62347j = true;
        return show;
    }

    public void show(C0608j jVar, String str) {
        super.show(jVar, str);
        this.f62347j = true;
    }

    /* renamed from: a */
    private void m77556a(final AnimatedImageView animatedImageView, String str) {
        C23323e.m76514a((RemoteImageView) animatedImageView, str);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(new ArrayList());
        urlModel.getUrlList().add(str);
        C23323e.m76502a(urlModel, (C23328a) new C23328a() {
            /* renamed from: a */
            public final void mo60610a(Exception exc) {
            }

            /* renamed from: a */
            public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                if (CaptchaDialogFragment.this.f62347j) {
                    CaptchaDialogFragment.this.f62350m++;
                    if (CaptchaDialogFragment.this.f62350m == 2) {
                        CaptchaDialogFragment.this.mo61557a();
                        CaptchaDialogFragment.this.f62350m = 0;
                    }
                    if (animatedImageView.getVisibility() == 4) {
                        animatedImageView.setVisibility(0);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final String mo61556a(float f, long j) {
        if (this.f62344g == null) {
            return "";
        }
        int i = (int) (f * ((float) (this.f62344g.f62315c.f62311a - this.f62344g.f62317e.f62311a)));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ts", this.f62344g.f62319g + (j / 1000));
            jSONObject.put("offset", i);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f62345h = view;
        this.f62351n = view.findViewById(R.id.b7g);
        this.f62338a = (AnimatedImageView) view.findViewById(R.id.b6w);
        this.f62339b = (AnimatedImageView) view.findViewById(R.id.b8p);
        this.f62341d = (DragBar) view.findViewById(R.id.abe);
        this.f62340c = view.findViewById(R.id.bbg);
        this.f62352o = (TextView) view.findViewById(R.id.title);
        this.f62339b.setVisibility(4);
        m77557b();
        m77558c();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.nb, viewGroup, false);
    }
}
