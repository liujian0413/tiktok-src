package com.p280ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.ads.AdError;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.C23361a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.main.p1382d.C32952a;
import com.p280ss.android.ugc.aweme.main.story.p1387a.C33068a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.story.live.C41994h;
import com.p280ss.android.ugc.aweme.story.model.C42000a;
import com.p280ss.android.ugc.aweme.story.model.Story;
import java.util.List;
import org.greenrobot.eventbus.C7705c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewModel */
public class StoryFeedItemViewModel extends C23361a<StoryFeedItemView> {

    /* renamed from: b */
    public static final String f86059b = "StoryFeedItemViewModel";

    /* renamed from: c */
    public String f86060c = "";

    /* renamed from: d */
    public boolean f86061d = true;

    /* renamed from: e */
    public long f86062e;

    /* renamed from: f */
    public AppImageUri f86063f;

    /* renamed from: g */
    public CharSequence f86064g;

    /* renamed from: h */
    public OnClickListener f86065h;

    /* renamed from: i */
    public C33068a f86066i;

    /* renamed from: j */
    public Status f86067j;

    /* renamed from: k */
    public int f86068k;

    /* renamed from: l */
    private C33086b f86069l;

    /* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewModel$Status */
    public enum Status {
        NEW,
        DOWNLOADING,
        READ,
        LIVE,
        FOLLOWING_NEW,
        FOLLOWING_READ
    }

    /* renamed from: g */
    public final String mo84780g() {
        return this.f86066i.f86040a;
    }

    /* renamed from: k */
    private void m106793k() {
        if (this.f86066i != null) {
            m106794l();
        }
    }

    /* renamed from: e */
    public final boolean mo84778e() {
        if (this.f86067j == Status.LIVE) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final String mo84782i() {
        if (this.f86061d) {
            return "toplist_homepage_follow";
        }
        String str = this.f86069l.f86087f;
        if (str == null) {
            return "toplist_homepage_hot";
        }
        return str;
    }

    /* renamed from: c */
    public final int mo84776c() {
        if (this.f86069l != null) {
            return this.f86069l.mo84803a(mo84780g());
        }
        return -1;
    }

    /* renamed from: d */
    public final void mo84777d() {
        Status status;
        try {
            if (this.f86066i.mo84758a().f109095a.isFollowing()) {
                status = Status.FOLLOWING_READ;
            } else {
                status = Status.READ;
            }
            mo84774a(status);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* renamed from: f */
    public final boolean mo84779f() {
        if (this.f86067j == Status.FOLLOWING_NEW || this.f86067j == Status.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final String mo84781h() {
        if (mo84778e()) {
            return this.f86066i.f86040a.replace("live", "");
        }
        return this.f86066i.f86040a;
    }

    /* renamed from: j */
    private void m106792j() {
        String str;
        if (this.f86066i.mo84758a() != null) {
            final Story story = this.f86066i.mo84758a().f109095a;
            final User userInfo = story.getUserInfo();
            this.f86063f = AppImageUri.m76616a(userInfo.getAvatarThumb());
            if (!TextUtils.isEmpty(userInfo.getRemarkName())) {
                str = userInfo.getRemarkName();
            } else {
                str = userInfo.getNickname();
            }
            this.f86064g = str;
            switch (this.f86067j) {
                case LIVE:
                    this.f86062e = userInfo.roomId;
                    this.f86068k = story.type;
                    this.f86065h = new OnClickListener() {
                        public final void onClick(View view) {
                            int i;
                            int i2;
                            ClickInstrumentation.onClick(view);
                            Rect d = C23487o.m77157d(view);
                            String i3 = StoryFeedItemViewModel.this.mo84782i();
                            if (userInfo != null) {
                                userInfo.setRequestId(StoryFeedItemViewModel.this.f86060c);
                            }
                            Context context = view.getContext();
                            User user = userInfo;
                            List<Story> list = StoryFeedItemViewModel.this.f86066i.f86041b.f109106b;
                            if (StoryFeedItemViewModel.this.f86061d) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            boolean z = StoryFeedItemViewModel.this.f86066i.f86041b.f109107c;
                            if (story == null) {
                                i2 = 1;
                            } else {
                                i2 = story.type;
                            }
                            C41994h.m133521a(context, user, d, list, i3, i, z, i2);
                            C7705c.m23799a().mo20394d(new C32952a(1));
                        }
                    };
                    return;
                case FOLLOWING_NEW:
                case FOLLOWING_READ:
                    this.f86065h = new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            StoryFeedItemViewModel.this.f86067j = Status.FOLLOWING_READ;
                            StoryFeedItemViewModel.this.mo60675b();
                            StoryFeedItemViewModel.this.mo84773a(view);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(POIService.KEY_ORDER, StoryFeedItemViewModel.this.mo84776c());
                            } catch (JSONException unused) {
                            }
                            C6907h.onEvent(MobClick.obtain().setEventName("head_click").setLabelName("toplist").setValue(StoryFeedItemViewModel.this.mo84780g()).setJsonObject(jSONObject));
                        }
                    };
                    return;
                default:
                    this.f86065h = new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            if (StoryFeedItemViewModel.this.f86067j == Status.READ || StoryFeedItemViewModel.this.f86066i.mo84758a().mo103175a()) {
                                StoryFeedItemViewModel.this.mo84775b(view);
                                return;
                            }
                            StoryFeedItemViewModel.this.f86067j = Status.DOWNLOADING;
                            StoryFeedItemViewModel.this.mo60675b();
                        }
                    };
                    return;
            }
        }
    }

    /* renamed from: l */
    private void m106794l() {
        Status status;
        C42000a a = this.f86066i.mo84758a();
        if (a == null) {
            StringBuilder sb = new StringBuilder("loadCommonStatus() called, with appstory = [null], mModel.getUid() = [");
            sb.append(this.f86066i.f86040a);
            sb.append("], UserManager.inst().getCurUserId() = [");
            sb.append(C21115b.m71197a().getCurUserId());
            sb.append("]");
            C6921a.m21555a(sb.toString());
        } else if (a.f109095a.isLive()) {
            mo84774a(Status.LIVE);
        } else if (a.f109095a.isFollowing()) {
            if (a.f109095a.isRead()) {
                status = Status.FOLLOWING_READ;
            } else {
                status = Status.FOLLOWING_NEW;
            }
            mo84774a(status);
        } else if (a.f109095a.isRead()) {
            mo84774a(Status.READ);
        } else {
            mo84774a(Status.NEW);
        }
    }

    /* renamed from: a */
    public final void mo84773a(View view) {
        C6726a.m20843a(new Runnable() {
            public final void run() {
                StoryFeedItemViewModel.this.f86067j = Status.FOLLOWING_READ;
                StoryFeedItemViewModel.this.mo60675b();
            }
        }, AdError.SERVER_ERROR_CODE);
        if (this.f86069l != null && this.f86066i != null) {
            this.f86069l.mo84806a(view.getContext(), this.f86066i.f86040a);
        }
    }

    /* renamed from: a */
    public final void mo84774a(Status status) {
        boolean z;
        boolean z2;
        if (this.f86067j != status) {
            Status status2 = this.f86067j;
            boolean e = mo84778e();
            boolean f = mo84779f();
            this.f86067j = status;
            boolean e2 = mo84778e();
            boolean f2 = mo84779f();
            boolean z3 = false;
            if (e != e2) {
                z = true;
            } else {
                z = false;
            }
            if (f != f2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (status2 == null || z || z2) {
                z3 = true;
            }
            if (z3) {
                m106792j();
            }
        }
    }

    /* renamed from: b */
    public final void mo84775b(View view) {
        C6726a.m20843a(new Runnable() {
            public final void run() {
                StoryFeedItemViewModel.this.f86067j = Status.READ;
                StoryFeedItemViewModel.this.mo60675b();
            }
        }, AdError.SERVER_ERROR_CODE);
        Story story = this.f86066i.mo84758a().f109095a;
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(((Aweme) story.getAwemes().get(0)).getAid());
        a.mo18682a(sb.toString());
    }

    public StoryFeedItemViewModel(C33068a aVar, C33086b bVar, String str) {
        this.f86066i = aVar;
        this.f86069l = bVar;
        m106793k();
        this.f86060c = str;
    }
}
