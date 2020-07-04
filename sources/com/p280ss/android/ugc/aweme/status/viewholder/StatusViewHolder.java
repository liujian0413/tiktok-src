package com.p280ss.android.ugc.aweme.status.viewholder;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C39221a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C39221a.C39222a;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.status.p1631a.C41805b;
import com.p280ss.android.ugc.aweme.status.p1631a.C41806c;
import com.p280ss.android.ugc.aweme.status.p1632b.C41809a;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.status.viewholder.StatusViewHolder */
public final class StatusViewHolder extends C1293v implements OnClickListener {

    /* renamed from: j */
    public static final C41834a f108822j = new C41834a(null);

    /* renamed from: a */
    public C39221a f108823a;

    /* renamed from: b */
    public RemoteImageView f108824b;

    /* renamed from: c */
    public C41809a f108825c;

    /* renamed from: d */
    public int f108826d = -1;

    /* renamed from: e */
    public final boolean f108827e = (!C7188c.m22428a());

    /* renamed from: f */
    public RecordStatusViewModel f108828f;

    /* renamed from: g */
    public View f108829g;

    /* renamed from: h */
    public FragmentActivity f108830h;

    /* renamed from: i */
    public int f108831i;

    /* renamed from: com.ss.android.ugc.aweme.status.viewholder.StatusViewHolder$a */
    public static final class C41834a {
        private C41834a() {
        }

        public /* synthetic */ C41834a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.viewholder.StatusViewHolder$b */
    public static final class C41835b extends C41805b {

        /* renamed from: a */
        final /* synthetic */ StatusViewHolder f108833a;

        /* renamed from: com.ss.android.ugc.aweme.status.viewholder.StatusViewHolder$b$a */
        public static final class C41836a implements C39222a {

            /* renamed from: a */
            final /* synthetic */ C41835b f108834a;

            /* renamed from: a */
            public final void mo97462a() {
                Downloader.getInstance(this.f108834a.f108833a.f108830h).cancel(this.f108834a.f108833a.f108826d);
            }

            C41836a(C41835b bVar) {
                this.f108834a = bVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.status.viewholder.StatusViewHolder$b$b */
        static final class C41837b<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C41835b f108835a;

            C41837b(C41835b bVar) {
                this.f108835a = bVar;
            }

            public final /* synthetic */ Object call() {
                m133080a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m133080a() {
                C41809a aVar = this.f108835a.f108833a.f108825c;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                File file = new File(aVar.f108754c.getZipPath());
                C41809a aVar2 = this.f108835a.f108833a.f108825c;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                C43136fo.m136824a(file, new File(aVar2.f108754c.getUnzipPath()));
                this.f108835a.f108833a.f108828f.mo102535f().postValue(this.f108835a.f108833a.f108825c);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.status.viewholder.StatusViewHolder$b$c */
        static final class C41838c<TTaskResult, TContinuationResult> implements C1591g<Object, Void> {

            /* renamed from: a */
            final /* synthetic */ C41835b f108836a;

            C41838c(C41835b bVar) {
                this.f108836a = bVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Object> hVar) {
                if (this.f108836a.f108833a.f108823a != null) {
                    C39221a aVar = this.f108836a.f108833a.f108823a;
                    if (aVar == null) {
                        C7573i.m23580a();
                    }
                    if (aVar.isShowing()) {
                        C39221a aVar2 = this.f108836a.f108833a.f108823a;
                        if (aVar2 != null) {
                            aVar2.dismiss();
                        }
                        this.f108836a.f108833a.f108823a = null;
                    }
                }
                return null;
            }
        }

        C41835b(StatusViewHolder statusViewHolder) {
            this.f108833a = statusViewHolder;
        }

        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            if (this.f108833a.f108823a != null) {
                C39221a aVar = this.f108833a.f108823a;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                if (aVar.isShowing()) {
                    C39221a aVar2 = this.f108833a.f108823a;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    this.f108833a.f108823a = null;
                }
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C1592h.m7853a((Callable<TResult>) new C41837b<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C41838c<TResult,TContinuationResult>(this), C1592h.f5958b);
            C6893q.m21444a("status_template_download_error_state", 0, (JSONObject) null);
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (this.f108833a.f108823a == null) {
                this.f108833a.f108823a = new C39221a(this.f108833a.f108830h);
                C39221a aVar = this.f108833a.f108823a;
                if (aVar != null) {
                    StringBuilder sb = new StringBuilder("       ");
                    sb.append(this.f108833a.f108830h.getString(R.string.fz));
                    sb.append("       ");
                    aVar.setMessage(sb.toString());
                }
                C39221a aVar2 = this.f108833a.f108823a;
                if (aVar2 != null) {
                    aVar2.mo97549a(0);
                }
                C39221a aVar3 = this.f108833a.f108823a;
                if (aVar3 != null) {
                    aVar3.mo97550a((C39222a) new C41836a(this));
                }
                C39221a aVar4 = this.f108833a.f108823a;
                if (aVar4 != null) {
                    aVar4.show();
                }
            }
            if (downloadInfo != null) {
                C39221a aVar5 = this.f108833a.f108823a;
                if (aVar5 != null) {
                    aVar5.mo97549a(downloadInfo.getDownloadProcess());
                }
            }
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            if (this.f108833a.f108823a != null) {
                C39221a aVar = this.f108833a.f108823a;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                if (aVar.isShowing()) {
                    C39221a aVar2 = this.f108833a.f108823a;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    this.f108833a.f108823a = null;
                }
            }
            JSONObject jSONObject = new JSONObject();
            String str = "effectid";
            C41809a aVar3 = this.f108833a.f108825c;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            jSONObject.put(str, aVar3.f108754c.getEffectId());
            C6893q.m21444a("status_template_download_error_state", 1, jSONObject);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f108825c != null) {
            Context context = this.f108830h;
            C41809a aVar = this.f108825c;
            if (aVar == null) {
                C7573i.m23580a();
            }
            this.f108826d = C41806c.m133030a(context, aVar, new C41835b(this));
        }
    }

    /* renamed from: a */
    public final void mo102602a(C41809a aVar) {
        C7573i.m23587b(aVar, "effect");
        this.f108825c = aVar;
        this.f108824b.setVisibility(0);
        switch (this.f108831i) {
            case 0:
                if (this.f108827e) {
                    C23323e.m76515a(this.f108824b, aVar.f108756e, this.f108824b.getWidth(), this.f108824b.getHeight());
                    return;
                } else {
                    C23323e.m76525b(this.f108824b, aVar.f108755d, this.f108824b.getWidth(), this.f108824b.getHeight());
                    return;
                }
            case 1:
                C23323e.m76525b(this.f108824b, aVar.f108755d, this.f108824b.getWidth(), this.f108824b.getHeight());
                return;
            case 2:
                C23323e.m76515a(this.f108824b, aVar.f108756e, this.f108824b.getWidth(), this.f108824b.getHeight());
                return;
            default:
                if (this.f108827e) {
                    C23323e.m76515a(this.f108824b, aVar.f108756e, this.f108824b.getWidth(), this.f108824b.getHeight());
                    return;
                } else {
                    C23323e.m76525b(this.f108824b, aVar.f108755d, this.f108824b.getWidth(), this.f108824b.getHeight());
                    return;
                }
        }
    }

    public StatusViewHolder(RecordStatusViewModel recordStatusViewModel, View view, FragmentActivity fragmentActivity, int i) {
        C7573i.m23587b(recordStatusViewModel, "statusViewModel");
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(fragmentActivity, "context");
        super(view);
        this.f108828f = recordStatusViewModel;
        this.f108829g = view;
        this.f108830h = fragmentActivity;
        this.f108831i = i;
        View findViewById = this.f108829g.findViewById(R.id.dau);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.status_template_iv)");
        this.f108824b = (RemoteImageView) findViewById;
        this.f108824b.post(new Runnable(this) {

            /* renamed from: a */
            final /* synthetic */ StatusViewHolder f108832a;

            {
                this.f108832a = r1;
            }

            public final void run() {
                LayoutParams layoutParams = this.f108832a.f108824b.getLayoutParams();
                layoutParams.height = (this.f108832a.f108824b.getWidth() * 16) / 9;
                this.f108832a.f108824b.setLayoutParams(layoutParams);
            }
        });
        this.f108829g.setOnClickListener(this);
    }
}
