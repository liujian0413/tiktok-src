package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30872j;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31923x;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31923x.C31928a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.C31973a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.PhotoDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity */
public class PhotoDetailActivity extends AmeActivity {

    /* renamed from: a */
    public View f80843a;

    /* renamed from: b */
    public View f80844b;

    /* renamed from: c */
    public DragView f80845c;

    /* renamed from: d */
    public View f80846d;

    /* renamed from: e */
    public PhotoDraweeView f80847e;

    /* renamed from: f */
    public int f80848f;

    /* renamed from: g */
    public boolean f80849g;

    /* renamed from: h */
    public boolean f80850h;

    /* renamed from: i */
    public MarginLayoutParams f80851i;

    /* renamed from: j */
    private Message f80852j;

    /* renamed from: k */
    private UrlModel f80853k;

    /* renamed from: l */
    private IViewInfo f80854l;

    /* renamed from: m */
    private OnlyPictureContent f80855m;

    /* renamed from: n */
    private StoryPictureContent f80856n;

    /* renamed from: o */
    private C30872j f80857o;

    public void onBackPressed() {
        mo80751b();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: e */
    private void m100549e() {
        if (VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
    }

    /* renamed from: h */
    private void m100552h() {
        this.f80845c.setDragStateListener(new C31973a() {
            /* renamed from: a */
            public final void mo80760a() {
            }

            /* renamed from: a */
            public final void mo80761a(ValueAnimator valueAnimator) {
            }

            /* renamed from: b */
            public final void mo80762b() {
            }

            /* renamed from: g */
            public final boolean mo80767g() {
                return false;
            }

            /* renamed from: h */
            public final boolean mo80768h() {
                return false;
            }

            /* renamed from: d */
            public final void mo80764d() {
                PhotoDetailActivity.this.mo80748a();
            }

            /* renamed from: e */
            public final void mo80765e() {
                PhotoDetailActivity.this.f80843a.setVisibility(8);
                PhotoDetailActivity.this.f80849g = true;
            }

            /* renamed from: f */
            public final void mo80766f() {
                PhotoDetailActivity.this.f80849g = false;
                PhotoDetailActivity.this.finish();
            }

            /* renamed from: c */
            public final void mo80763c() {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) PhotoDetailActivity.this.f80847e.getLayoutParams();
                if (PhotoDetailActivity.this.f80850h) {
                    PhotoDetailActivity.this.f80850h = false;
                    if (PhotoDetailActivity.this.f80851i == null) {
                        PhotoDetailActivity.this.f80851i = new MarginLayoutParams(PhotoDetailActivity.this.f80845c.getFullWidth(), PhotoDetailActivity.this.f80845c.getFullHeight());
                        PhotoDetailActivity.this.f80851i.leftMargin = marginLayoutParams.leftMargin;
                        PhotoDetailActivity.this.f80851i.topMargin = marginLayoutParams.topMargin;
                    }
                }
                if (PhotoDetailActivity.this.f80845c.getFullWidth() < PhotoDetailActivity.this.f80845c.getWidth() || PhotoDetailActivity.this.f80845c.getFullHeight() < PhotoDetailActivity.this.f80845c.getHeight()) {
                    PhotoDetailActivity.this.f80847e.setScaleType(ScaleType.FIT_CENTER);
                } else {
                    PhotoDetailActivity.this.f80847e.setScaleType(ScaleType.CENTER_CROP);
                }
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.width = PhotoDetailActivity.this.f80845c.getWidth();
                marginLayoutParams.height = PhotoDetailActivity.this.f80845c.getHeight();
                PhotoDetailActivity.this.f80847e.setLayoutParams(marginLayoutParams);
                PhotoDetailActivity.this.f80843a.setVisibility(0);
                PhotoDetailActivity.this.f80849g = false;
            }
        });
    }

    /* renamed from: c */
    public final void mo80752c() {
        C30898i.m100632a().mo80818a(this, new C30894e(this));
    }

    /* renamed from: b */
    public final void mo80751b() {
        mo80748a();
        if (this.f80845c != null) {
            this.f80845c.mo82816a();
        }
    }

    /* renamed from: g */
    private void m100551g() {
        if (this.f80857o == null) {
            this.f80857o = new C30872j() {
                public final void onClick(View view) {
                    if (view.equals(PhotoDetailActivity.this.f80843a)) {
                        PhotoDetailActivity.this.mo80752c();
                        return;
                    }
                    if (view.equals(PhotoDetailActivity.this.f80844b) || view.equals(PhotoDetailActivity.this.f80846d)) {
                        PhotoDetailActivity.this.mo80751b();
                    }
                }

                public final boolean onLongClick(View view) {
                    if ((view.equals(PhotoDetailActivity.this.f80844b) || view.equals(PhotoDetailActivity.this.f80847e)) && !PhotoDetailActivity.this.f80849g) {
                        C25712a aVar = new C25712a(PhotoDetailActivity.this);
                        switch (PhotoDetailActivity.this.f80848f) {
                            case 0:
                            case 1:
                                aVar.mo66614a((CharSequence[]) new String[]{C6399b.m19921a().getString(R.string.bq6), C6399b.m19921a().getString(R.string.bos)}, (OnClickListener) new C30895f(this));
                                aVar.mo66615b();
                                break;
                            case 2:
                                aVar.mo66614a((CharSequence[]) new String[]{C6399b.m19921a().getString(R.string.bos)}, (OnClickListener) new C30896g(this));
                                aVar.mo66615b();
                                break;
                        }
                    } else {
                        return true;
                    }
                    return true;
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo80758a(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        PhotoDetailActivity.this.mo80752c();
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: b */
                public final /* synthetic */ void mo80759b(DialogInterface dialogInterface, int i) {
                    switch (i) {
                        case 0:
                            PhotoDetailActivity.this.mo80753d();
                            return;
                        case 1:
                            PhotoDetailActivity.this.mo80752c();
                            break;
                    }
                }
            };
        }
        C30872j.m100536a((View.OnClickListener) this.f80857o, this.f80844b, this.f80846d, this.f80843a);
        C30872j.m100537a((OnLongClickListener) this.f80857o, this.f80844b, this.f80847e);
        this.f80847e.setOnPhotoTapListener(new C30893d(this));
        m100552h();
    }

    /* renamed from: a */
    public final void mo80748a() {
        if (this.f80851i != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f80847e.getLayoutParams();
            marginLayoutParams.leftMargin = this.f80851i.leftMargin;
            marginLayoutParams.topMargin = this.f80851i.topMargin;
            marginLayoutParams.height = this.f80851i.height;
            marginLayoutParams.width = this.f80851i.width;
            this.f80847e.setLayoutParams(marginLayoutParams);
            this.f80847e.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    /* renamed from: f */
    private void m100550f() {
        this.f80845c = (DragView) findViewById(R.id.biw);
        if (VERSION.SDK_INT >= 19) {
            this.f80845c.setFullScreenWindow(true);
        }
        this.f80844b = findViewById(R.id.cwn);
        this.f80843a = findViewById(R.id.cy8);
        this.f80846d = LayoutInflater.from(this).inflate(R.layout.a0a, this.f80845c, false);
        this.f80847e = (PhotoDraweeView) this.f80846d.findViewById(R.id.bax);
        if (this.f80854l != null) {
            this.f80845c.mo82821a(this.f80846d, this.f80847e, this.f80854l);
        }
        this.f80847e.mo82896a(this.f80853k, null, null);
    }

    /* renamed from: d */
    public final void mo80753d() {
        Bundle bundle = new Bundle();
        if (this.f80852j.getMsgType() == 27) {
            if (this.f80856n != null) {
                bundle.putParcelable("share_package", this.f80856n.generateSharePackage());
                bundle.putSerializable("share_content", this.f80856n);
            } else {
                return;
            }
        } else if (this.f80852j.getMsgType() == 2) {
            if (this.f80855m != null) {
                bundle.putParcelable("share_package", this.f80855m.generateSharePackage());
                bundle.putSerializable("share_content", this.f80855m);
            } else {
                return;
            }
        }
        RelationSelectActivity.m21881a((Context) this, bundle, null);
    }

    /* renamed from: b */
    private void m100548b(UrlModel urlModel) {
        C1592h.m7853a((Callable<TResult>) new C30892c<TResult>(this, urlModel));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo80747a(UrlModel urlModel) throws Exception {
        C31923x.m103683a(urlModel, new C31928a() {
            /* renamed from: b */
            public final void mo80757b() {
                C9738o.m28693a(C6399b.m19921a(), (int) R.string.bor);
            }

            /* renamed from: a */
            public final void mo80756a() {
                C9738o.m28693a(C6399b.m19921a(), (int) R.string.bot);
                C31858ad.m103406a();
                C31858ad.m103470f();
            }
        });
        return null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("drag_view_info", this.f80854l);
        bundle.putSerializable("photo_message", this.f80852j);
        bundle.putSerializable("photo_param", this.f80853k);
        bundle.putInt("photo_show_type", this.f80848f);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onCreate", true);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        m100549e();
        setContentView((int) R.layout.c_);
        m100547a(bundle);
        m100550f();
        m100551g();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80750a(Boolean bool) {
        if (bool.booleanValue()) {
            m100548b(this.f80853k);
        }
    }

    /* renamed from: a */
    private void m100547a(Bundle bundle) {
        this.f80850h = true;
        if (bundle != null) {
            this.f80853k = (UrlModel) bundle.getSerializable("photo_param");
            this.f80852j = (Message) bundle.getSerializable("photo_message");
            this.f80848f = bundle.getInt("photo_show_type", 0);
            this.f80854l = (IViewInfo) bundle.getParcelable("drag_view_info");
            return;
        }
        this.f80852j = (Message) getIntent().getSerializableExtra("photo_message");
        this.f80848f = getIntent().getIntExtra("photo_show_type", 0);
        this.f80854l = (IViewInfo) getIntent().getParcelableExtra("drag_view_info");
        if (this.f80852j.getMsgType() == 27) {
            this.f80856n = (StoryPictureContent) C31913m.m103667a(this.f80852j.getContent(), StoryPictureContent.class);
            if (this.f80856n != null) {
                this.f80853k = this.f80856n.getUrl();
                if (this.f80853k == null || TextUtils.isEmpty(this.f80853k.getUri())) {
                    this.f80853k = new UrlModel();
                    UrlModel urlModel = this.f80853k;
                    StringBuilder sb = new StringBuilder("file://");
                    sb.append(this.f80856n.getPicturePath());
                    urlModel.setUri(sb.toString());
                    this.f80853k.setWidth(this.f80856n.getWidth());
                    this.f80853k.setHeight(this.f80856n.getHeight());
                    return;
                }
                this.f80853k.setWidth(this.f80856n.getWidth());
                this.f80853k.setHeight(this.f80856n.getHeight());
            }
        } else if (this.f80852j.getMsgType() == 2) {
            this.f80855m = (OnlyPictureContent) C31913m.m103667a(this.f80852j.getContent(), OnlyPictureContent.class);
            if (this.f80855m != null) {
                this.f80853k = this.f80855m.getUrl();
                if (this.f80853k != null && !C6307b.m19566a((Collection<T>) this.f80853k.getUrlList())) {
                    this.f80853k.setWidth(this.f80855m.getWidth());
                    this.f80853k.setHeight(this.f80855m.getHeight());
                } else if (!TextUtils.isEmpty(this.f80855m.getPicturePath())) {
                    this.f80853k = new UrlModel();
                    UrlModel urlModel2 = this.f80853k;
                    StringBuilder sb2 = new StringBuilder("file://");
                    sb2.append(this.f80855m.getPicturePath());
                    urlModel2.setUri(sb2.toString());
                    this.f80853k.setWidth(this.f80855m.getWidth());
                    this.f80853k.setHeight(this.f80855m.getHeight());
                    this.f80855m.setUrl(this.f80853k);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80749a(View view, float f, float f2) {
        mo80751b();
    }

    /* renamed from: a */
    public static void m100546a(Context context, Message message, int i, IViewInfo iViewInfo) {
        Intent intent = new Intent(context, PhotoDetailActivity.class);
        intent.putExtra("drag_view_info", iViewInfo);
        intent.putExtra("photo_message", message);
        intent.putExtra("photo_show_type", i);
        context.startActivity(intent);
    }
}
