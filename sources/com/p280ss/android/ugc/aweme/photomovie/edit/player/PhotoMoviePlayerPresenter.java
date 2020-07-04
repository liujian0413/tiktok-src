package com.p280ss.android.ugc.aweme.photomovie.edit.player;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import bolts.C1592h;
import com.p280ss.android.medialib.photomovie.C19758a;
import com.p280ss.android.medialib.photomovie.PhotoMoviePlayer;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter */
public class PhotoMoviePlayerPresenter implements C0042h, SurfaceTextureListener, C34918a {

    /* renamed from: a */
    public PhotoMoviePlayer f91073a;

    /* renamed from: b */
    public C34917a f91074b;

    /* renamed from: c */
    public boolean f91075c;

    /* renamed from: d */
    private final C0043i f91076d;

    /* renamed from: e */
    private PhotoMovieContext f91077e;

    /* renamed from: f */
    private SurfaceTexture f91078f;

    /* renamed from: g */
    private TextureView f91079g;

    /* renamed from: h */
    private int f91080h;

    /* renamed from: i */
    private int f91081i;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter$a */
    public interface C34917a {
        /* renamed from: a */
        void mo88344a();
    }

    /* renamed from: a */
    public final PhotoMovieContext mo88460a() {
        return this.f91077e;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    /* renamed from: b */
    public final long mo88476b() {
        return this.f91073a.mo52809e();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        this.f91073a.mo52804b();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        this.f91073a.mo52795a();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                PhotoMoviePlayerPresenter.this.f91073a.mo52808d();
                return null;
            }
        });
    }

    /* renamed from: c */
    private void m112536c() {
        String str;
        this.f91073a = new PhotoMoviePlayer(C35563c.f93238a);
        C19758a aVar = null;
        if (this.f91077e.mMusicPath == null || TextUtils.equals(this.f91077e.mMusicPath, "")) {
            str = null;
        } else {
            str = C43142i.m136842a(this.f91077e.mMusicPath, MediaType.AUDIO);
        }
        int i = 2500;
        this.f91077e.photoTime = 2500;
        this.f91077e.transTime = VETransitionFilterParam.TransitionDuration_DEFAULT;
        if (C40173d.m128359d()) {
            if (this.f91077e.getImageCount() > 24) {
                i = (int) ((60.0f / ((float) this.f91077e.getImageCount())) * 1000.0f);
            }
            aVar = new C19758a(1, i, VETransitionFilterParam.TransitionDuration_DEFAULT);
            this.f91077e.photoTime = i;
        }
        this.f91073a.mo52797a(C43142i.m136843a(this.f91077e.mImageList, MediaType.IMAGE), str, aVar);
        this.f91073a.mo52803a(true);
        this.f91073a.mo52798a(this.f91077e.mPlayType);
        this.f91073a.mo52801a(this.f91077e.mFilterPath);
    }

    /* renamed from: a */
    public final void mo88461a(int i) {
        this.f91077e.mPlayType = i;
        this.f91073a.mo52798a(this.f91077e.mPlayType);
    }

    /* renamed from: b */
    public final void mo88477b(int i) {
        this.f91073a.mo52805b(i);
    }

    /* renamed from: a */
    public final void mo88473a(long j) {
        this.f91073a.mo52800a(j);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f91076d instanceof PhotoMovieEditActivity) {
            PhotoMovieEditActivity photoMovieEditActivity = (PhotoMovieEditActivity) this.f91076d;
            if (photoMovieEditActivity.f90837d != null && photoMovieEditActivity.f90837d.f90973d) {
                photoMovieEditActivity.mo88333a(this.f91079g.getBitmap());
            }
        }
    }

    /* renamed from: a */
    public final void mo88474a(C29296g gVar) {
        String str = gVar.f77273h;
        this.f91073a.mo52801a(str);
        this.f91077e.mFilterPath = str;
        this.f91077e.mFilterName = gVar.f77268c;
        this.f91077e.mFilterId = gVar.f77266a;
    }

    /* renamed from: a */
    public final void mo88467a(String str) {
        this.f91073a.mo52801a(str);
        this.f91077e.mFilterPath = str;
    }

    /* renamed from: a */
    public final void mo88472a(int i, int i2) {
        this.f91073a.mo52806b(i, i2);
    }

    /* renamed from: a */
    public final void mo88466a(AVMusic aVMusic, String str) {
        this.f91077e.mMusicPath = str;
        this.f91077e.mMusic = aVMusic;
        this.f91073a.mo52807c();
        this.f91073a.mo52808d();
        m112536c();
        this.f91073a.mo52796a(new Surface(this.f91078f), this.f91080h, this.f91081i);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f91078f = surfaceTexture;
        this.f91080h = i;
        this.f91081i = i2;
        this.f91073a.mo52799a(i, i2);
    }

    public PhotoMoviePlayerPresenter(C0043i iVar, TextureView textureView, PhotoMovieContext photoMovieContext) {
        iVar.getLifecycle().mo55a(this);
        this.f91076d = iVar;
        this.f91077e = photoMovieContext;
        this.f91079g = textureView;
        m112536c();
        textureView.setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f91078f == null) {
            this.f91078f = surfaceTexture;
            this.f91080h = i;
            this.f91081i = i2;
            this.f91073a.mo52796a(new Surface(this.f91078f), this.f91080h, this.f91081i);
            if (this.f91074b != null) {
                this.f91074b.mo88344a();
            }
            if (this.f91075c) {
                this.f91073a.mo52804b();
            }
        } else {
            this.f91079g.setSurfaceTexture(this.f91078f);
        }
    }

    /* renamed from: a */
    public final void mo88475a(String str, String str2, float f) {
        this.f91073a.mo52802a(str, str2, f);
    }
}
