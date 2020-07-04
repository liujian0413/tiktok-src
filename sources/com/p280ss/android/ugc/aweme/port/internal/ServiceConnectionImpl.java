package com.p280ss.android.ugc.aweme.port.internal;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.support.p022v4.app.FragmentActivity;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C40023l;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.VideoPublishException;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40232d;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl */
public class ServiceConnectionImpl implements C0042h, ServiceConnection, C40023l<C38455ap> {

    /* renamed from: a */
    C40232d f93292a;

    /* renamed from: b */
    private FragmentActivity f93293b;

    /* renamed from: c */
    private C35608a f93294c;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        m115030a();
    }

    public void onProgressUpdate(int i, boolean z) {
    }

    public void onSynthetiseSuccess(String str) {
    }

    /* renamed from: a */
    private void m115030a() {
        try {
            this.f93292a.mo96193b(this);
            this.f93293b.unbindService(this);
        } catch (Exception unused) {
        }
    }

    public ServiceConnectionImpl(FragmentActivity fragmentActivity) {
        this.f93293b = fragmentActivity;
        fragmentActivity.getLifecycle().mo55a(this);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f93292a != null) {
            this.f93292a.mo96193b(this);
            this.f93292a = null;
        }
        this.f93294c = null;
    }

    public void onError(VideoPublishException videoPublishException) {
        if (this.f93294c != null) {
            this.f93294c.mo90420a(videoPublishException, this.f93292a.mo96192b(), this.f93292a.mo96190a());
        }
        m115030a();
        this.f93292a = null;
        this.f93294c = null;
    }

    /* renamed from: a */
    private static void m115031a(CreateAwemeResponse createAwemeResponse) {
        if (createAwemeResponse != null && createAwemeResponse.aweme != null && createAwemeResponse.aweme.getVideo() != null) {
            String videoCoverPath = createAwemeResponse.getVideoCoverPath();
            if (videoCoverPath != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Uri.fromFile(new File(videoCoverPath)).toString());
                Video video = createAwemeResponse.aweme.getVideo();
                if (video.getCover() != null) {
                    video.getCover().setUrlList(arrayList);
                }
                if (video.getDynamicCover() != null) {
                    video.getDynamicCover().setUrlList(arrayList);
                }
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f93292a = (C40232d) iBinder;
            this.f93292a.mo96191a(this);
            if (!C34788e.m112192d(this.f93292a.mo96192b())) {
                this.f93294c = new C35608a(this.f93293b);
                C35608a.m115033a();
                StringBuilder sb = new StringBuilder("args is ");
                sb.append(this.f93292a.mo96190a());
                sb.append(" when construct");
                C6921a.m21555a(sb.toString());
            } else {
                this.f93294c = null;
            }
            if ((this.f93293b instanceof MainActivity) && !C34788e.m112192d(this.f93292a.mo96192b())) {
                ((MainActivity) this.f93293b).onPublishServiceConnected(this.f93292a, this, this.f93292a.mo96190a());
            }
        } catch (ClassCastException e) {
            C6921a.m21554a((Exception) e);
            C35620j.m115062a(Toast.makeText(this.f93293b, R.string.b35, 0));
        }
    }

    public void onSuccess(C38455ap apVar, boolean z) {
        int i;
        if (apVar instanceof CreateStoryResponse) {
            if (this.f93292a != null) {
                i = this.f93292a.mo96192b();
            } else {
                i = -1;
            }
            StringBuilder sb = new StringBuilder("CreateStoryResponse cannot be cast to CreateAwemeResponse, and type is ");
            sb.append(i);
            C6921a.m21559a((Throwable) new Exception(sb.toString()));
        }
        if (this.f93294c != null && (apVar instanceof CreateAwemeResponse)) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) apVar;
            m115031a(createAwemeResponse);
            this.f93294c.mo90419a(createAwemeResponse, this.f93292a.mo96192b(), this.f93292a.mo96190a());
        }
        m115030a();
        this.f93292a = null;
        this.f93294c = null;
    }
}
