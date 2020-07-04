package com.p280ss.android.ugc.aweme.toolsport;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C25672e;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.port.p1479in.C35526aa;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42601a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42602b;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42603c;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42607e;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42608f;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42609g;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42610h;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42611i;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42613k;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42614l;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42615m;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService */
public interface IAVMusicService {

    /* renamed from: b */
    public static final C42591a f110748b = C42591a.f110749a;

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$IStickPointMusicAdapter */
    public static abstract class IStickPointMusicAdapter extends C1262a<C1293v> {
        /* renamed from: a */
        public int mo103962a() {
            return -1;
        }

        /* renamed from: a */
        public void mo103963a(int i) {
        }

        /* renamed from: a */
        public void mo103964a(int i, boolean z) {
        }

        /* renamed from: a */
        public void mo103991a(AVMusic aVMusic) {
        }

        /* renamed from: a */
        public void mo103992a(List<AVMusic> list) {
        }

        /* renamed from: b */
        public int mo103967b() {
            return -1;
        }

        /* renamed from: b */
        public void mo103968b(int i) {
        }

        /* renamed from: b */
        public void mo103969b(int i, boolean z) {
        }

        /* renamed from: f */
        public void mo103974f() {
        }

        /* renamed from: g */
        public void mo103975g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$a */
    public static final class C42591a {

        /* renamed from: a */
        static final /* synthetic */ C42591a f110749a = new C42591a();

        private C42591a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$b */
    public interface C42592b {
        /* renamed from: a */
        void mo103919a(ExtractFramesModel extractFramesModel, boolean z, String str);

        /* renamed from: a */
        void mo103920a(ExtractFramesModel extractFramesModel, boolean z, String str, String str2);

        /* renamed from: a */
        void mo103921a(C42611i iVar);

        /* renamed from: a */
        void mo103923a(String str, String str2, String str3);

        /* renamed from: b */
        void mo103924b(C42615m mVar);

        /* renamed from: i */
        void mo103925i();

        /* renamed from: n */
        void mo103928n();

        /* renamed from: p */
        C42607e mo103929p();

        /* renamed from: q */
        void mo103930q();
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$c */
    public interface C42593c {
        /* renamed from: a */
        AVMusic mo103874a(int i);

        /* renamed from: a */
        void mo103875a();

        /* renamed from: a */
        void mo103876a(AppCompatActivity appCompatActivity, FrameLayout frameLayout);

        /* renamed from: a */
        void mo103877a(C42609g gVar);

        /* renamed from: a */
        void mo103878a(C42610h hVar);

        /* renamed from: a */
        void mo103879a(C42612j jVar);

        /* renamed from: a */
        void mo103880a(C42613k kVar);

        /* renamed from: a */
        void mo103881a(C42614l lVar);

        /* renamed from: a */
        void mo103883a(List<String> list);

        /* renamed from: a */
        void mo103884a(boolean z);

        /* renamed from: b */
        AVMusic mo103885b(int i);

        /* renamed from: b */
        void mo103886b();

        /* renamed from: c */
        void mo103888c();

        /* renamed from: c */
        void mo103889c(int i);

        /* renamed from: c */
        void mo103890c(boolean z);

        /* renamed from: d */
        int mo103891d();

        /* renamed from: e */
        void mo103892e();

        /* renamed from: g */
        void mo103893g();

        /* renamed from: h */
        void mo103894h();
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$d */
    public interface C42594d {
        /* renamed from: a */
        void mo101896a(Exception exc);

        /* renamed from: a */
        void mo101897a(String str, AVMusic aVMusic);
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$e */
    public interface C42595e {
        /* renamed from: a */
        boolean mo103868a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$f */
    public interface C42596f extends C25672e {
        /* renamed from: a */
        void mo99876a(Exception exc, String str);

        /* renamed from: a */
        void mo99877a(List<AVMusic> list, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$g */
    public interface C42597g {
        /* renamed from: a */
        C42597g mo103871a(C42602b bVar);

        /* renamed from: a */
        C42597g mo103872a(List<String> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$h */
    public interface C42598h {
        /* renamed from: a */
        void mo104198a(int i, String str, JSONArray jSONArray);
    }

    /* renamed from: com.ss.android.ugc.aweme.toolsport.IAVMusicService$i */
    public interface C42599i {
        /* renamed from: a */
        void mo100634a(String str, int i, String str2, int i2);

        /* renamed from: a */
        void mo100635a(String str, int i, String str2, Exception exc);

        /* renamed from: a */
        void mo100636a(String str, int i, String str2, float[] fArr);
    }

    /* renamed from: a */
    UrlModel mo103841a(Object obj);

    /* renamed from: a */
    AVChallenge mo103842a(Challenge challenge);

    /* renamed from: a */
    AVMusic mo103843a(MusicModel musicModel);

    /* renamed from: a */
    AVMusicWaveBean mo103844a(Serializable serializable);

    /* renamed from: a */
    IStickPointMusicAdapter mo103845a(List<AVMusic> list, C42612j jVar);

    /* renamed from: a */
    C42593c mo103846a(AppCompatActivity appCompatActivity, C15389d dVar, C42601a aVar);

    /* renamed from: a */
    C42595e mo103847a(C42596f fVar);

    /* renamed from: a */
    C42597g mo103848a(C42608f fVar);

    /* renamed from: a */
    Object mo103849a(AVMusicWaveBean aVMusicWaveBean);

    /* renamed from: a */
    String mo103850a(String str);

    /* renamed from: a */
    List<MusicModel> mo103851a();

    /* renamed from: a */
    List<AVMusic> mo103852a(int i, String str);

    /* renamed from: a */
    List<AVMusic> mo103853a(List<? extends MusicModel> list);

    /* renamed from: a */
    void mo103854a(Activity activity, int i, C42603c cVar, C7562b<? super C42605d, C7581n> bVar, C7561a<C7581n> aVar);

    /* renamed from: a */
    void mo103855a(Context context, String str, int i, ProgressDialog progressDialog, C42594d dVar);

    /* renamed from: a */
    void mo103856a(AVMusic aVMusic, C42599i iVar);

    /* renamed from: a */
    void mo103857a(String str, int i, C42598h hVar);

    /* renamed from: a */
    void mo103858a(String str, C35526aa aaVar);

    /* renamed from: a */
    void mo103859a(boolean z);

    /* renamed from: a */
    boolean mo103860a(int i);

    /* renamed from: a */
    boolean mo103861a(AVMusic aVMusic, Context context, boolean z);

    /* renamed from: b */
    int mo103862b(String str);

    /* renamed from: b */
    File mo103863b();

    /* renamed from: c */
    void mo103864c();

    /* renamed from: c */
    void mo103865c(String str);

    /* renamed from: d */
    boolean mo103866d();

    /* renamed from: e */
    C42592b mo103867e();
}
