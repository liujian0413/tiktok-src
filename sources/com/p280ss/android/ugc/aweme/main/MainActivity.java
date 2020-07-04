package com.p280ss.android.ugc.aweme.main;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.Lifecycle;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import android.widget.Toast;
import bolts.C1592h;
import com.aweme.storage.C1913c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.net.cronet.ttregion.TTRegionTestApi;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.appcontext.C6405d.C6407b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.p073ad.symphony.p078c.C2128g;
import com.bytedance.polaris.depend.C12428i;
import com.google.gson.C6600e;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.p293di.push.C6804a;
import com.p280ss.android.p298ml.C6820a;
import com.p280ss.android.p298ml.C6824e;
import com.p280ss.android.ugc.aweme.C21773q;
import com.p280ss.android.ugc.aweme.C21787z;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.appeal.AppealApi.C21114a;
import com.p280ss.android.ugc.aweme.account.appeal.AppealStatusResponse;
import com.p280ss.android.ugc.aweme.account.util.C22330i;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C22995i;
import com.p280ss.android.ugc.aweme.app.C22999k;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.ChannelUploadHelper;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1031b.C22935b;
import com.p280ss.android.ugc.aweme.app.p305g.C22982a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.p1058c.C23283b;
import com.p280ss.android.ugc.aweme.base.p1058c.C23286e;
import com.p280ss.android.ugc.aweme.base.p1058c.C23287f;
import com.p280ss.android.ugc.aweme.base.p1058c.C23288g;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import com.p280ss.android.ugc.aweme.base.p308ui.SwitchFragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.bridgeservice.C23549b;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.splash.AwesomeSplashMask;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25060e;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25067l;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25083o;
import com.p280ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25266be;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25291bs;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.common.BaseShareContext;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.compliance.gradientpunish.C25796a;
import com.p280ss.android.ugc.aweme.compliance.gradientpunish.GradientPunishWarning;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.HotSearchAndDiscoveryFragment2;
import com.p280ss.android.ugc.aweme.dynamicfeature.DfDummyInitTask;
import com.p280ss.android.ugc.aweme.experiment.BackRefreshExperiment;
import com.p280ss.android.ugc.aweme.experiment.OnlineCoverageExperiment;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.api.C28220h;
import com.p280ss.android.ugc.aweme.feed.cache.C28274b;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28311ag;
import com.p280ss.android.ugc.aweme.feed.event.C28312ah;
import com.p280ss.android.ugc.aweme.feed.event.C28322e;
import com.p280ss.android.ugc.aweme.feed.event.C28324g;
import com.p280ss.android.ugc.aweme.feed.event.C28340w;
import com.p280ss.android.ugc.aweme.feed.event.C28341x;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a.C28540a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.DisLikeAwemeLayout;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28932e;
import com.p280ss.android.ugc.aweme.feed.panel.C28589ac;
import com.p280ss.android.ugc.aweme.feedback.C29074f;
import com.p280ss.android.ugc.aweme.feedback.C29086n;
import com.p280ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendActivity;
import com.p280ss.android.ugc.aweme.homepage.C30235a;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.business.C30255a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.C30262a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.C30294i;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a.C30274c;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a.C30275d;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.i18n.language.initial.C30483e;
import com.p280ss.android.ugc.aweme.journey.C32250l;
import com.p280ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p280ss.android.ugc.aweme.journey.NewUserJourneyActivity.C32223a;
import com.p280ss.android.ugc.aweme.lancet.C7113k;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService.WatchState;
import com.p280ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask;
import com.p280ss.android.ugc.aweme.legoImp.task.C7158v;
import com.p280ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.p280ss.android.ugc.aweme.legoImp.task.LegoRequestTask;
import com.p280ss.android.ugc.aweme.legoImp.task.MobLaunchEventTask;
import com.p280ss.android.ugc.aweme.legoImp.task.OptFirstFrameTask;
import com.p280ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.login.C32657g;
import com.p280ss.android.ugc.aweme.login.larksso.LarkSsoHelper;
import com.p280ss.android.ugc.aweme.main.base.C32895a.C32896a;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment;
import com.p280ss.android.ugc.aweme.main.guide.C33040a;
import com.p280ss.android.ugc.aweme.main.p1382d.C32953b;
import com.p280ss.android.ugc.aweme.main.p1382d.C32955d;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.metrics.C33258c;
import com.p280ss.android.ugc.aweme.metrics.C33274p;
import com.p280ss.android.ugc.aweme.metrics.C33278t;
import com.p280ss.android.ugc.aweme.metrics.C33282x;
import com.p280ss.android.ugc.aweme.miniapp.utils.C33419c;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33601b.C33602a;
import com.p280ss.android.ugc.aweme.money.growth.C33639e.C33640a;
import com.p280ss.android.ugc.aweme.net.C34102v;
import com.p280ss.android.ugc.aweme.net.p1417b.C34041b;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FriendTabFragment;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34334h;
import com.p280ss.android.ugc.aweme.opensdk.share.C34685e;
import com.p280ss.android.ugc.aweme.opensdk.share.p1450a.C34675a;
import com.p280ss.android.ugc.aweme.opensdk.share.p1450a.C34675a.C34678a;
import com.p280ss.android.ugc.aweme.opensdk.share.presenter.C34689b;
import com.p280ss.android.ugc.aweme.opensdk.share.share.C34697a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import com.p280ss.android.ugc.aweme.p1045aw.C23113b;
import com.p280ss.android.ugc.aweme.p1052b.C23148c;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1052b.C23152f;
import com.p280ss.android.ugc.aweme.p1685ug.praise.C42736c;
import com.p280ss.android.ugc.aweme.p1685ug.referral.C42740a;
import com.p280ss.android.ugc.aweme.p1685ug.referral.C42743b;
import com.p280ss.android.ugc.aweme.p1685ug.referral.C42747e;
import com.p280ss.android.ugc.aweme.p1702w.C43392a;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p332ml.C33573d;
import com.p280ss.android.ugc.aweme.p332ml.C33577h;
import com.p280ss.android.ugc.aweme.p332ml.C33583m;
import com.p280ss.android.ugc.aweme.p332ml.C7170a;
import com.p280ss.android.ugc.aweme.p332ml.C7173g;
import com.p280ss.android.ugc.aweme.p332ml.C7174p;
import com.p280ss.android.ugc.aweme.performance.p1250b.C29350a;
import com.p280ss.android.ugc.aweme.player.C34962c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.policy.C35495c;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35500a;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35501b;
import com.p280ss.android.ugc.aweme.policy.notice.p1477b.C35507a;
import com.p280ss.android.ugc.aweme.policy.notice.p1478ui.C35513a;
import com.p280ss.android.ugc.aweme.port.internal.PublishFragmentLifecycleCallbacks;
import com.p280ss.android.ugc.aweme.port.internal.ServiceConnectionImpl;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1488a.C36327a;
import com.p280ss.android.ugc.aweme.promote.C36924c;
import com.p280ss.android.ugc.aweme.promote.PromoteGdprManager;
import com.p280ss.android.ugc.aweme.report.p1502a.C37191a;
import com.p280ss.android.ugc.aweme.requesttask.idle.AVCameraInitTask;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37240b;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37244d;
import com.p280ss.android.ugc.aweme.requesttask.idle.ReportActivityStatusTask;
import com.p280ss.android.ugc.aweme.requesttask.p1505b.C37231a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnPublishCallback;
import com.p280ss.android.ugc.aweme.setting.C37543ad;
import com.p280ss.android.ugc.aweme.setting.C37552ae;
import com.p280ss.android.ugc.aweme.setting.C7208as;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.C7217x;
import com.p280ss.android.ugc.aweme.setting.RegisterStorageTask;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37620c;
import com.p280ss.android.ugc.aweme.setting.personalization.p1523a.C37679a;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37686a;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37686a.C37687a;
import com.p280ss.android.ugc.aweme.setting.secret.C37702c;
import com.p280ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity;
import com.p280ss.android.ugc.aweme.setting.secret.p1526a.C37699a;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.share.command.C38012e;
import com.p280ss.android.ugc.aweme.share.command.CommandObserver;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.p280ss.android.ugc.aweme.shortvideo.CurPlayVideoRecord;
import com.p280ss.android.ugc.aweme.shortvideo.PublishDialogFragment;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39881n;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39327e;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40232d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41560l;
import com.p280ss.android.ugc.aweme.splash.SplashActivity;
import com.p280ss.android.ugc.aweme.story.model.C42001b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.tile.TileTask;
import com.p280ss.android.ugc.aweme.user.p1689d.C42829b;
import com.p280ss.android.ugc.aweme.util.C42866a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.util.C42881i;
import com.p280ss.android.ugc.aweme.utils.ActivityStack;
import com.p280ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43033cw;
import com.p280ss.android.ugc.aweme.utils.C43034cx;
import com.p280ss.android.ugc.aweme.utils.C43034cx.C43038a;
import com.p280ss.android.ugc.aweme.utils.C43051dc;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.p280ss.android.ugc.aweme.utils.C43063dm;
import com.p280ss.android.ugc.aweme.utils.C43068dq;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.p280ss.android.ugc.aweme.utils.C43103en;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.video.C43192ai;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.bitrate.C43196a;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.awemepushapi.AccountExperiment;
import com.p280ss.android.ugc.bytex.coverage_lib.CoverageHandler;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44869b;
import com.p280ss.android.ugc.trill.C44971a;
import com.p280ss.android.ugc.trill.language.C45026f.C45027a;
import com.p280ss.android.ugc.trill.p1757a.C44972a;
import com.p280ss.android.ugc.trill.receiver.HomeWatcherReceiver;
import com.p280ss.android.ugc.trill.share.base.ShareCacheRegisterTask;
import com.p280ss.android.websocket.p344ws.p1781a.C45448f;
import com.p280ss.ugc.aweme.p1817a.p1823b.C46183b;
import com.p280ss.ugc.aweme.p1817a.p1823b.C46183b.C46184a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.main.MainActivity */
public class MainActivity extends AmeSSActivity implements C6407b, C23149d, C28589ac, C32896a, C33054j, C7217x {
    public static final String IS_UPLOAD_PRE_INFO = "is_upload_pre_info";
    private static final int REQUEST_BAN_USER_FEEDBACK = 17;
    private static final int REQUEST_GALLERY_CODE = 16;
    public static final int REQUEST_WELCOME_SCREEN_DEEPLINK = 18;
    private static final String TAG = "MainActivity";
    public static boolean appsFlyerisInit;
    private static boolean mNeedCallShowPrivacySettingActivityIfNeeded;
    private C24723e adViewController = this.mActivityProxy.f79556d;
    private AtomicBoolean appeal = new AtomicBoolean(false);
    private int appealStatus = -1;
    private C23148c asyncInflater;
    private boolean checkPrivacyPolicy;
    private boolean firstCreated;
    private boolean hasFirstRefresh = false;
    public HomePageDataViewModel homeViewModel;
    private HomeWatcherReceiver homeWatcherReceiver;
    boolean isFirstLaunch = false;
    private boolean isPaused = true;
    private boolean isWatchReceiverRegisted;
    private AtomicBoolean lazyDoItCalled = new AtomicBoolean(false);
    private List<Runnable> lazySequence = new ArrayList();
    private boolean lazySequenceCleaned = false;
    public Dialog mAccountBanedDialog;
    private List<C23254a> mActivityOnKeyDownListeners;
    C30235a mActivityProxy = new C30235a();
    private SwitchFragmentPagerAdapter mAdapter;
    public AwesomeSplashMask mAwesomeSplashMask = null;
    private int mAwesomeSplashStatus = 4;
    private C40232d mBinder;
    private C21773q mBroadCastRegister;
    protected DataCenter mDataCenter;
    private C38267a mDialogShowingManager;
    DisLikeAwemeLayout mDisLikeAwemeLayout;
    private String mEventType = "homepage_hot";
    private long mFirstClickPublish;
    private Dialog mGradientPunishWarningDialog;
    private boolean mHasFocus = false;
    private boolean mIsFirstVisible = true;
    public String mLastUserId;
    private C32897bb mMainHelper;
    private boolean mNeedShowBanDialog = false;
    private C35495c mPolicyManager;
    private boolean mRestartFromLogout = false;
    private boolean mResumed = false;
    private C32988dj mScrollSwitchHelper;
    private C34689b mShareIntentParseCenter;
    public boolean mShowFTCAgeGate = false;
    private C25067l mSplashLoadMaskHelper = new C25067l(this);
    private boolean mThemeRestored = false;
    ScrollableViewPager mViewPager;
    private final C32899bd mainLifecycleRegistryWrapper = new C32899bd(this);
    private OnPublishCallback processedCallback = new OnPublishCallback() {
        public final void onStopPublish() {
        }

        public final void onStartPublish() {
            if (C6399b.m19946v()) {
                PromoteGdprManager.m118779a().mo93266a((Activity) MainActivity.this);
            }
            if (!C29132a.m95560a()) {
                C36924c.m118805a(MainActivity.this);
            }
            MainActivity.this.changeTabToFollowAfterPublish();
        }
    };
    private C30274c scrollBasicChecker = new C30274c(this);
    private C30275d scrollFullChecker = new C30275d(this, this.scrollBasicChecker);
    private boolean shouldShowPrivateAccountGuide = false;
    private boolean showToast = false;
    private ScrollSwitchStateManager stateManager;
    private AtomicBoolean userLogicDelete = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.main.MainActivity$a */
    static class C32830a implements Runnable {
        private C32830a() {
        }

        public final void run() {
            if (C21115b.m71197a().isLogin() && SharePrefCache.inst().getIsContactsUploaded() != null && ((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo59877d()).booleanValue()) {
                C42829b.m135986a().mo104530b();
            }
        }
    }

    private void checkJiraPermission() {
        C42881i.m136159a((Activity) this);
    }

    private void feed0VVManagerOnResume() {
        C28434i.m93477f();
    }

    private void feedOVVMainActivityCreate() {
        C28434i.m93455a();
    }

    private FragmentActivity getActivity() {
        return this;
    }

    private void larksso() {
        LarkSsoHelper.m105772a((Context) this);
    }

    public boolean enableInitHook() {
        return false;
    }

    public C40232d getBinder() {
        return this.mBinder;
    }

    public C33061p getHelper() {
        return this.mScrollSwitchHelper;
    }

    public Lifecycle getLifecycle() {
        return this.mainLifecycleRegistryWrapper;
    }

    public C32897bb getMainHelper() {
        return this.mMainHelper;
    }

    public OnPublishCallback getProcessedCallback() {
        return this.processedCallback;
    }

    public View getVisionSearchRect() {
        return null;
    }

    public boolean hasRegistedResumeAction() {
        return false;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public boolean isUnderFamiliarTab() {
        return false;
    }

    public void onPostResume() {
        super.onPostResume();
    }

    private void checkSplashAd() {
        AwemeAppData.m65765a().f60325e = true;
    }

    private void injectVideoInfo() {
        C34041b.m109623a().mo86734a(this);
    }

    private void setupEagleEyeAndDownloaderManager() {
        maybeAddLazySequence(C32873ai.f85811a);
    }

    public void initWaterMark() {
        C39881n.m127622a().mo99302b();
    }

    private void createMainHelper() {
        this.mMainHelper = new C32897bb(this);
        this.mMainHelper.mo84582c();
    }

    private void ensureLazyDoItFinallyCalled() {
        C6726a.m20843a(new C32874aj(this), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
    }

    private void initDislikeView() {
        this.mDisLikeAwemeLayout.setListener(new C28932e() {
            /* renamed from: a */
            public final void mo67761a(boolean z) {
                MainActivity.this.exitDislikeMode();
            }
        });
    }

    private boolean isBanDialogShowing() {
        if (this.mAccountBanedDialog == null || !this.mAccountBanedDialog.isShowing()) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ void lambda$setupEagleEyeAndDownloaderManager$1$MainActivity() {
        DownloaderManagerHolder.m75524a().mo51664a().mo50933a(1);
        C22935b.m75495a();
    }

    private void onStartUp() {
        if (this.homeViewModel != null) {
            C28274b.m92985c(this.homeViewModel.f79564c);
        }
    }

    private void setAdScrollRightControl() {
        if (C6399b.m19944t()) {
            setI18nAdScrollRightControl();
        }
    }

    public void changeTabToFollowAfterPublish() {
        this.mDataCenter.mo60134a("changeTabToFollowAfterPublish", (Object) null);
    }

    public C28130ac getCurrentViewHolder() {
        FeedRecommendFragment currentFeedRecommendFragment = getCurrentFeedRecommendFragment();
        if (currentFeedRecommendFragment == null) {
            return null;
        }
        return currentFeedRecommendFragment.mo73816o();
    }

    public C23148c getInflater() {
        if (this.asyncInflater == null) {
            this.asyncInflater = new C23152f(this);
        }
        return this.asyncInflater;
    }

    public TabChangeManager getTabChangeManager() {
        return TabChangeManager.m106432a(getActivity());
    }

    public boolean isInMaskLayer() {
        if (this.mDisLikeAwemeLayout == null || !this.mDisLikeAwemeLayout.f75632m) {
            return false;
        }
        return true;
    }

    public boolean isUnderMainTab() {
        return "HOME".equals(getTabChangeManager().f85773a);
    }

    public boolean isUnderNearbyTab() {
        return "NEARBY".equals(getTabChangeManager().f85773a);
    }

    public boolean isUnderProfileTab() {
        return "USER".equals(getTabChangeManager().f85773a);
    }

    public boolean isUnderSecondTab() {
        return "DISCOVER".equals(getTabChangeManager().f85773a);
    }

    public boolean isUnderThirdTab() {
        return "NOTIFICATION".equals(getTabChangeManager().f85773a);
    }

    private void addLegoRequestTask() {
        C7121a.m22248b().mo18559a(new LegoRequestTask()).mo18560a();
    }

    /* access modifiers changed from: private */
    /* renamed from: callLazyDoIt */
    public void bridge$lambda$1$MainActivity() {
        if (this.lazyDoItCalled.compareAndSet(false, true)) {
            C1592h.m7848a(1800).mo6880b(new C32879ao(this), C7258h.m22732e());
            lazyDoItMainThread();
        }
    }

    private void checkPrivacyPolicyVersion() {
        if (C21115b.m71197a().isLogin()) {
            if (this.mPolicyManager == null) {
                this.mPolicyManager = new C35495c(this);
            }
            this.mPolicyManager.mo90297a();
        }
    }

    private void cleanEffects() {
        C7121a.m22248b().mo18559a(new CleanEffectsTask()).mo18560a();
    }

    private void doGDPR() {
        if (C6399b.m19946v()) {
            C37686a.f98179g.mo95035f(false);
        }
        if (needShowGradientPunishWarningDialog()) {
            showGradientPunishWarningDialog();
        }
    }

    private void getAppealStatus() {
        try {
            C21114a.m71196a(C6861a.m21337f().getCurUserId(), new C32865aa(this));
        } catch (Exception unused) {
            this.appeal.set(false);
        }
    }

    private void handleMainPageResume() {
        Fragment a = getTabChangeManager().mo84567a();
        if (a != null && (a instanceof MainFragment)) {
            ((MainFragment) a).mo84451c(true);
        }
    }

    private void hotStartIntercept() {
        if (isHotStart() && C6399b.m19944t()) {
            C7208as.m22479a().mo18705b();
        }
    }

    private void pushAuthorityMonitor() {
        if (C43033cw.m136550a(this)) {
            C6877n.m21444a("aweme_push_authority_rate", 0, (JSONObject) null);
        } else {
            C6877n.m21444a("aweme_push_authority_rate", 1, (JSONObject) null);
        }
    }

    private void showFTCAgeGate() {
        this.mShowFTCAgeGate = C6861a.m21334c().showFTCAgeGateForCurrentUser(this, new C21787z() {
            /* renamed from: a */
            public final void mo58121a() {
                MainActivity.this.mShowFTCAgeGate = false;
                MainActivity.this.callAllDialogs();
            }
        });
        C6861a.m21334c().syncAgeGateInfo();
    }

    /* access modifiers changed from: private */
    /* renamed from: startAppsFlyerTrack */
    public void bridge$lambda$2$MainActivity() {
        if (!appsFlyerisInit) {
            try {
                appsFlyerisInit = true;
                C42866a.m136073a();
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
                if (C7163a.m22363a()) {
                    throw e;
                }
            }
        }
    }

    private boolean tryShowGuideView() {
        CommonPageFragment d = this.stateManager.mo79729d("page_feed");
        if (d instanceof MainPageFragment) {
            return ((MainPageFragment) d).mo84511i();
        }
        return false;
    }

    public Fragment getCurFragment() {
        if (getTabChangeManager() == null) {
            return null;
        }
        return getTabChangeManager().mo84567a();
    }

    public FeedRecommendFragment getCurrentFeedRecommendFragment() {
        Fragment curFragment = getCurFragment();
        if (curFragment instanceof MainFragment) {
            FeedFragment g = ((MainFragment) curFragment).mo84447b();
            if (g instanceof FeedRecommendFragment) {
                return (FeedRecommendFragment) g;
            }
        }
        return null;
    }

    public boolean isInDiscoveryPage() {
        if (!C33003b.m106651a()) {
            return isUnderSecondTab();
        }
        if (this.mScrollSwitchHelper == null || !this.stateManager.mo79723b("page_discover")) {
            return false;
        }
        return true;
    }

    public boolean isMainTabVisible() {
        if (!isUnderMainTab() || this.mScrollSwitchHelper == null || !this.stateManager.mo79723b("page_feed")) {
            return false;
        }
        return true;
    }

    public void onBackPressed() {
        if (!this.mMainHelper.mo84580a()) {
            backRefreshStrategy();
        }
        this.mDataCenter.mo60134a("exitGuideView", (Object) Boolean.valueOf(false));
        exitDislikeMode();
    }

    public void onChanged() {
        if (C37687a.m120527a()) {
            C37687a.m120531c(true);
            callAllDialogs();
        }
        SymphonyAdManager.m82664a();
        SymphonyAdManager.m82668a(C7213d.m22500a().mo18790bb());
    }

    public void onFeedRecommendFragmentReady() {
        fitAwesomeSplash();
        C7121a.m22248b().mo18559a(new ReleaseWindowBackgroundTask(this)).mo18560a();
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    private void checkGcmMessage() {
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            String string = intent.getExtras().getString("payload");
            String string2 = intent.getExtras().getString("from");
            try {
                JSONObject jSONObject = new JSONObject(string);
                C44971a.m141911a(jSONObject, this, AwemeAppData.m65765a(), jSONObject.optInt("id", 0), string2, jSONObject.optInt("pass_through", 1), null);
            } catch (Exception unused) {
            }
        }
    }

    private void cleanLazySequence() {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            arrayList.addAll(this.lazySequence);
            this.lazySequence.clear();
            this.lazySequenceCleaned = true;
        }
        for (Runnable wVar : arrayList) {
            C1592h.m7855a((Callable<TResult>) new C33112w<TResult>(wVar), (Executor) C7258h.m22734g());
        }
    }

    private void fitAwesomeSplash() {
        if (!C25266be.m83036a(getIntent())) {
            restoreTheme(false);
        } else if (getCurFragment() != null) {
            if (!C25060e.m82539b() || !C25060e.m82537a(getCurrentFeedRecommendFragment())) {
                restoreTheme(false);
            }
        }
    }

    private String handleIntent() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "HOME";
        }
        Bundle bundleExtra = intent.getBundleExtra("extra_splash_data");
        if (bundleExtra != null) {
            String string = bundleExtra.getString(SplashActivity.SPLASH_OPEN_URL_EXTRA);
            if (!TextUtils.isEmpty(string)) {
                C25291bs.m83097a(this, string);
            }
        }
        return stringExtra;
    }

    private void initMLModel() {
        C6824e.m21223a((C6820a) new C33577h());
        C33573d.m108449a().mo85906c();
        C33583m.m108463a().mo85913c();
        C7174p.m22398a().mo18650c();
        C44869b.m141575a().mo107320a(new C7170a(C7173g.m22395a("auto_bitrate"))).mo16677f();
    }

    private boolean isADShowing() {
        if (AwemeAppData.m65765a().f60326f || C25060e.m82539b() || C25352e.m83221d(this.homeViewModel.f79570i) || C25352e.m83231n(this.homeViewModel.f79570i)) {
            return true;
        }
        return false;
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        if (!isTaskRoot() || intent == null || !intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return false;
        }
        return true;
    }

    private boolean isOpenWebOrOpenUrlOrMpUrl() {
        if (!this.adViewController.mo64705a() || this.adViewController.mo64710e() || (!this.adViewController.mo64708c() && !this.adViewController.mo64709d() && (!C25300bx.m83125a(this.homeViewModel.f79570i, 3) || !this.adViewController.mo64707b()))) {
            return false;
        }
        return true;
    }

    private boolean needShowGradientPunishWarningDialog() {
        if (!C21115b.m71197a().isLogin()) {
            return false;
        }
        String curUserId = C21115b.m71197a().getCurUserId();
        if (!C25796a.m84787a(curUserId) || C25796a.m84788a(curUserId, false)) {
            return false;
        }
        return true;
    }

    private void refreshWhenBack() {
        C22903bl isUseBackRefresh = SharePrefCache.inst().getIsUseBackRefresh();
        if (isUseBackRefresh != null && ((Boolean) isUseBackRefresh.mo59877d()).booleanValue() && getTabChangeManager().mo84567a() != null && (getTabChangeManager().mo84567a() instanceof MainFragment)) {
            ((MainFragment) getTabChangeManager().mo84567a()).mo84458f();
        }
    }

    private boolean shouldRecordWithSticker() {
        if (this.homeViewModel.f79570i == null || !this.homeViewModel.f79570i.hasStickerID() || !"HOME".equals(getTabChangeManager().f85773a)) {
            return false;
        }
        return true;
    }

    public boolean callAllDialogs() {
        if (!C37687a.m120534d() || !C37687a.m120532c() || this.mShowFTCAgeGate || !C37687a.m120527a()) {
            return false;
        }
        if (((Boolean) C23060u.m75742a().mo60085o().mo59877d()).booleanValue()) {
            new C35507a().mo90314a();
        } else {
            doGDPR();
        }
        C37687a.m120526a(false);
        return true;
    }

    public void exitDislikeMode() {
        if (this.mDisLikeAwemeLayout.f75630k) {
            this.mDisLikeAwemeLayout.mo73788b(false);
            this.mDisLikeAwemeLayout.setInDislikeMode(false);
            this.mDataCenter.mo60134a("ENTER_DISLIKE_MODE", (Object) Boolean.valueOf(false));
            C42961az.m136380a(new C28324g(false, 1, getActivity().hashCode()));
        }
    }

    public Resources getResources() {
        if (!this.mFirstResumed) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$lazyDoIt$7$MainActivity() {
        C30483e.m99569a().mo80163b(getActivity());
        if (!C28580o.m93828a().booleanValue() && !this.mRestartFromLogout) {
            C45027a.m142034a().mo107544a((Context) getActivity());
        }
    }

    /* access modifiers changed from: protected */
    public void lazyDoItMainThread() {
        if (isViewValid()) {
            showFTCAgeGate();
            if (this.showToast && this.mAwesomeSplashStatus != 1 && this.mAwesomeSplashStatus != 2) {
                C30255a.m98987a();
                this.showToast = false;
            }
        }
    }

    public void onKeyBack() {
        if (!this.mScrollSwitchHelper.mo84700c()) {
            if (getTabChangeManager().mo84567a() != null && (getTabChangeManager().mo84567a() instanceof C36327a)) {
                refreshWhenBack();
            }
            refreshWhenBack();
        }
    }

    public void onStop() {
        super.onStop();
        C6857a.m21312e().mo16818a();
        LocalVideoPlayerManager.m137195a().mo104996b();
        C30483e.m99569a().mo80164c();
        C1913c.m8853a((Context) this);
        CleanEffectsTask.startCleanEffect(this);
        C28540a.m93747b().mo73253b();
        AVCameraInitTask.init(0, true);
    }

    private void performSplashSkipClick() {
        if (this.mAwesomeSplashStatus == 2) {
            C28130ac currentViewHolder = getCurrentViewHolder();
            long j = 0;
            if (C28478a.m93590e(currentViewHolder) && C25352e.m83231n(currentViewHolder.mo65711h())) {
                if (getCurFragment() instanceof MainFragment) {
                    MainFragment mainFragment = (MainFragment) getCurFragment();
                    if (mainFragment.mo84447b() instanceof FeedRecommendFragment) {
                        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) mainFragment.mo84447b();
                        if (feedRecommendFragment != null) {
                            j = feedRecommendFragment.f75690k.mo73341aC();
                        }
                    }
                }
                long j2 = j;
                new HashMap().put("duration", String.valueOf(j2));
                C24976t.m82049a((Context) this, currentViewHolder.mo65711h(), j2, 1, 2);
                C42961az.m136380a(new C28322e(currentViewHolder.mo65711h()));
            }
        }
    }

    private void recordLaunchDate() {
        try {
            new C42736c(true).mo104345b(System.currentTimeMillis());
            ContentValues contentValues = new ContentValues();
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            contentValues.put(C33040a.f86005e, Long.valueOf(instance.getTimeInMillis()));
            C44972a.m141913a().f115647a.insert(C33040a.f86004d, null, contentValues);
        } catch (Exception unused) {
        }
    }

    private void setI18nAdScrollRightControl() {
        if (!this.adViewController.mo64705a() || this.adViewController.mo64710e()) {
            if (!this.adViewController.mo64710e() || C43122ff.m136767b()) {
                this.stateManager.mo79706a((C23434a) this.scrollFullChecker);
            } else {
                this.stateManager.mo79706a((C23434a) this.scrollBasicChecker);
            }
        } else if (C25352e.m83207I(this.homeViewModel.f79570i).booleanValue()) {
            this.stateManager.mo79706a((C23434a) this.scrollFullChecker);
        } else if (!this.adViewController.mo64707b() || C25352e.m83345aq(this.homeViewModel.f79570i) || this.adViewController.mo64712g()) {
            this.stateManager.mo79706a((C23434a) this.scrollFullChecker);
        } else {
            this.stateManager.mo79706a((C23434a) this.scrollBasicChecker);
        }
    }

    private void showGradientPunishWarningDialog() {
        if (this.mGradientPunishWarningDialog == null || !this.mGradientPunishWarningDialog.isShowing()) {
            GradientPunishWarning a = C25796a.m84785a();
            if (a != null) {
                View inflate = LayoutInflater.from(this).inflate(R.layout.a6x, null);
                ((TextView) inflate.findViewById(R.id.dv8)).setText(a.getDialogMessage());
                TextView textView = (TextView) inflate.findViewById(R.id.dv7);
                textView.setText(a.getDialogButton());
                textView.setOnClickListener(new C32876al(this));
                this.mGradientPunishWarningDialog = new C10741a(this).mo25656a().mo25637a();
                this.mGradientPunishWarningDialog.setContentView(inflate);
                this.mGradientPunishWarningDialog.setCancelable(false);
                this.mGradientPunishWarningDialog.show();
                C6907h.m21524a("violation_dialog_show", (Map) C22984d.m75611a().mo59973a("enter_from", getEnterFrom()).f60753a);
            }
        }
    }

    private void startTrack() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - C6857a.m21312e().f19502b;
        int a = C22999k.m75642a();
        int c = AwemeAppData.m65765a().mo53437c();
        if (a != c) {
            z = true;
        } else {
            z = false;
        }
        if (C22995i.m75637a().f60773a) {
            C7121a.m22248b().mo18559a(new MobLaunchEventTask(z, currentTimeMillis)).mo18560a();
        }
        if (a == 0) {
            C22999k.m75643a(c);
        }
        C22995i.m75637a().f60773a = false;
        C7121a.m22248b().mo18559a(new AntispamApiUploadTask()).mo18560a();
    }

    public void onDestroy() {
        C44869b.m141575a().mo107321b();
        if (this.isWatchReceiverRegisted) {
            unregisterReceiver(this.homeWatcherReceiver);
        }
        super.onDestroy();
        this.mActivityProxy.mo79687a(this);
        C7213d.m22500a().mo18788b((C7217x) this);
        maybeAddLazySequence(C32875ak.f85813a);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkToCleanNoneUsedFiles();
        if (!(this.mBroadCastRegister == null || getApplication() == null)) {
            this.mBroadCastRegister.mo58120c(getApplication());
        }
        if (this.mPolicyManager != null) {
            this.mPolicyManager.mo90300c();
        }
        C34962c.m112651a();
        C25054b.m82490a().f66136c = false;
        C25054b.m82490a();
        C25054b.m82498e();
    }

    public void refreshSlideSwitchCanScrollRight() {
        if (this.mScrollSwitchHelper != null) {
            Fragment a = getTabChangeManager().mo84567a();
            if (a == null || !(a instanceof MainFragment)) {
                this.stateManager.mo79706a((C23434a) this.scrollFullChecker);
            } else if (C43122ff.m136767b()) {
                this.stateManager.mo79706a((C23434a) this.scrollFullChecker);
            } else {
                FeedFragment feedFragment = (FeedFragment) this.stateManager.mo79732e();
                if (feedFragment instanceof C33013g) {
                    C33013g gVar = (C33013g) feedFragment;
                    if ("FeedFollowFragment".equals(gVar.mo73823r()) || "FeedRecommendFragment".equals(gVar.mo73823r())) {
                        this.adViewController.mo64698a((Context) this);
                        setAdScrollRightControl();
                        return;
                    }
                }
                this.adViewController.mo64720o();
                this.stateManager.mo79706a((C23434a) this.scrollFullChecker);
            }
        }
    }

    private void backRefreshStrategy() {
        C32897bb.m106479a(getTabChangeManager().f85773a);
        int a = C6384b.m19835a().mo15287a(BackRefreshExperiment.class, false, "back_refresh_strategy", C6384b.m19835a().mo15295d().back_refresh_strategy, 0);
        if (a != 0) {
            if (this.mMainHelper.f85835a) {
                this.mMainHelper.f85835a = false;
            } else if (!this.mDialogShowingManager.mo95909h()) {
                if (!isUnderMainTab()) {
                    this.mDataCenter.mo60134a("performClickTab", (Object) "HOME");
                    Fragment a2 = getTabChangeManager().mo84567a();
                    if (a2 != null && (a2 instanceof MainFragment)) {
                        MainFragment mainFragment = (MainFragment) a2;
                        if (mainFragment.mo84452c()) {
                            mainFragment.mo84451c(true);
                        } else {
                            mainFragment.mo84448b(1);
                        }
                        if (a == 1) {
                            mainFragment.mo84458f();
                        }
                    }
                    return;
                }
                Fragment a3 = getTabChangeManager().mo84567a();
                if (a3 != null && (a3 instanceof MainFragment)) {
                    MainFragment mainFragment2 = (MainFragment) a3;
                    if (!mainFragment2.mo84452c()) {
                        mainFragment2.mo84448b(1);
                    }
                    if (a == 1) {
                        mainFragment2.mo84458f();
                    }
                }
            }
        }
    }

    private void mobLaunchMob() {
        Uri uri;
        try {
            String str = null;
            if (getIntent() != null) {
                uri = getIntent().getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str = uri.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    return;
                }
            } else {
                uri = null;
            }
            C6907h.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            String str2 = "";
            String str3 = "";
            if (uri != null) {
                str2 = uri.getQueryParameter("enter_to");
                str3 = uri.getQueryParameter("push_id");
            }
            C33282x e = new C33282x().mo85366a("enter_launch").mo85370e(Integer.toString(C22995i.m75637a().f60774b ? 1 : 0));
            if (str2 == null) {
                str2 = "";
            }
            C33282x c = e.mo85368c(str2);
            if (str3 == null) {
                str3 = "";
            }
            c.mo85367b(str3).mo85252e();
            if (C22995i.m75637a().f60774b) {
                C22995i.m75637a().f60774b = false;
            }
        } catch (Exception unused) {
        }
    }

    private void onI18nScrollToProfileEvent() {
        if (C25352e.m83345aq(this.homeViewModel.f79570i)) {
            C25371n.m83484e((Context) this, this.homeViewModel.f79570i);
        } else if (isOpenWebOrOpenUrlOrMpUrl()) {
            if (C25352e.m83341am(this.homeViewModel.f79570i)) {
                C25371n.m83433a((Context) this, this.homeViewModel.f79570i, "slide");
            } else if (!C25371n.m83468b((Context) this, this.homeViewModel.f79570i) && !C33419c.m108078a(this, this.homeViewModel.f79570i)) {
                C25371n.m83474c((Context) this, this.homeViewModel.f79570i);
            }
        } else if (!this.adViewController.mo64705a() || this.adViewController.mo64712g() || this.adViewController.mo64707b() || this.adViewController.mo64710e()) {
            if (!this.adViewController.mo64705a() || !this.adViewController.mo64712g() || this.adViewController.mo64710e()) {
                this.mScrollSwitchHelper.mo84695a(this.homeViewModel.f79570i);
            } else if (!this.adViewController.mo64713h()) {
                C32880ap.m106465a(Toast.makeText(this, R.string.e2, 0));
            } else if (!C25371n.m83446a((Context) this, this.homeViewModel.f79570i)) {
                C32880ap.m106465a(Toast.makeText(this, R.string.e2, 0));
            }
        } else {
            C32880ap.m106465a(Toast.makeText(this, R.string.e2, 0));
        }
    }

    public String getEnterFrom() {
        if (getTabChangeManager() == null || TextUtils.isEmpty(getTabChangeManager().f85773a)) {
            return "homepage_hot";
        }
        String str = getTabChangeManager().f85773a;
        if (TextUtils.equals(str, "HOME")) {
            MainFragment mainFragment = (MainFragment) getTabChangeManager().mo84567a();
            if (mainFragment == null) {
                return "homepage_hot";
            }
            FeedFragment g = mainFragment.mo84447b();
            if (g != null) {
                if (g instanceof FeedFollowFragment) {
                    return "homepage_follow";
                }
                if (g instanceof FeedRecommendFragment) {
                    return "homepage_hot";
                }
            }
        } else if (TextUtils.equals(str, "DISCOVER")) {
            return "discovery";
        } else {
            if (TextUtils.equals(str, "NOTIFICATION")) {
                return "message";
            }
            if (TextUtils.equals(str, "USER")) {
                if (getTabChangeManager().mo84567a() instanceof C33278t) {
                    return ((C33278t) getTabChangeManager().mo84567a()).mo85338c();
                }
                return "personal_homepage";
            }
        }
        return "homepage_hot";
    }

    public void onPause() {
        C25054b bVar;
        boolean z;
        boolean z2 = true;
        this.isPaused = true;
        C6857a.m21312e().mo16818a();
        super.onPause();
        this.mResumed = false;
        C43196a.m136964a();
        Fragment curFragment = getCurFragment();
        if (curFragment == null) {
            C25054b.m82490a().f66136c = false;
            bVar = C25054b.m82490a();
        } else {
            C25054b a = C25054b.m82490a();
            if (((Boolean) C24217a.m79549a().getCommentViewModel(this).mo62290a().getValue()).booleanValue() || hasDialogShowing(curFragment) || isInMaskLayer()) {
                z = true;
            } else {
                z = false;
            }
            a.f66136c = z;
            bVar = C25054b.m82490a();
            if (!this.stateManager.mo79723b("page_feed") || !(curFragment instanceof MainFragment) || !((MainFragment) getCurFragment()).mo84452c()) {
                z2 = false;
            }
        }
        bVar.f66137d = z2;
        C25054b.m82490a().f66143j = false;
        C25054b.m82490a().f66141h = false;
        C1913c.m8857a(C22704b.f60414c);
        C28220h.m92763a().mo71953b();
        C43392a.m137711b(getApplicationContext());
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", true);
        C6857a.m21312e().mo16827b("cold_boot_main_create_to_resume", true);
        C6857a.m21312e().mo16822a("cold_boot_main_resume_duration", true);
        this.isPaused = false;
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
            return;
        }
        this.mResumed = true;
        super.onResume();
        feed0VVManagerOnResume();
        if (this.checkPrivacyPolicy) {
            checkPrivacyPolicyVersion();
            this.checkPrivacyPolicy = false;
        }
        if (C42747e.m135682a()) {
            C42740a.m135671a((Activity) this);
        } else {
            C42747e.f111072a = true;
        }
        if (this.mNeedShowBanDialog && !isADShowing() && this.appealStatus != -1) {
            getAppealDialog(this.appealStatus);
        }
        fitAwesomeSplash();
        C43103en.m136721a(this);
        ((MainLooperOptService) C7121a.m22243a(MainLooperOptService.class)).updateState(WatchState.WATCH_ON_MEASURE);
        if (!isADShowing()) {
            C37543ad.m120266a(this, false);
        }
        C6857a.m21312e().mo16827b("cold_boot_main_resume_duration", true);
        C6857a.m21312e().mo16822a("cold_boot_main_resume_to_measure", false);
        C6857a.m21312e().mo16822a("cold_boot_main_resume_to_focus", true);
        if (!this.firstCreated && C6384b.m19835a().mo15292a(ReleaseWindowBackgroundExperiment.class, true, "is_release_window_background", C6384b.m19835a().mo15295d().is_release_window_background, false)) {
            getWindow().getDecorView().setBackground(null);
        }
        this.firstCreated = false;
        C43073dv.m136651a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public void lazyDoIt() {
        cleanLazySequence();
        hotStartIntercept();
        C43034cx.m136557a((Context) this, (C43038a) new C33113x(this));
        C43068dq.m136627a();
        C29086n.m95429a((Context) this).mo74523a();
        initWaterMark();
        mobLaunchMob();
        this.mShareIntentParseCenter = new C34689b(this, getIntent());
        this.mShareIntentParseCenter.f90472d = this.homeViewModel.mo79692a();
        this.mShareIntentParseCenter.mo88018a(false);
        pushAuthorityMonitor();
        new C32830a().run();
        if (C6887b.m21436b().mo16909b((Context) this, IS_UPLOAD_PRE_INFO, true)) {
            ChannelUploadHelper.parseFile();
            C6887b.m21436b().mo16902a((Context) this, IS_UPLOAD_PRE_INFO, false);
        }
        if (SharePrefCache.inst().getLastPublishFailed() != null && ((Boolean) SharePrefCache.inst().getLastPublishFailed().mo59877d()).booleanValue()) {
            C9738o.m28693a((Context) this, (int) R.string.byh);
            SharePrefCache.inst().getLastPublishFailed().mo59871a(Boolean.valueOf(false));
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().tryRestorePublish(this, new C33114y(this));
        C43192ai.m136949a(true);
        C1592h.m7848a(10000).mo6876a(C33115z.f86136a, (Executor) C7258h.m22732e());
        SharePrefCache.inst().getIsContactDialogShown().mo59871a(Boolean.valueOf(true));
        SharePrefCache.inst().getHasEnterBindPhone().mo59871a(Boolean.valueOf(true));
        SharePrefCache.inst().getIsProfileBubbleShown().mo59871a(Boolean.valueOf(false));
        C23338f.m76565c().mo60634b("open", false);
        if (!this.mStatusDestroyed) {
            this.homeWatcherReceiver = new HomeWatcherReceiver();
            registerReceiver(this.homeWatcherReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            this.isWatchReceiverRegisted = true;
        }
        recordLaunchDate();
        C23113b.m75955a(getApplicationContext());
        checkPrivacyPolicyVersion();
        this.mBroadCastRegister = new C21773q();
        if (getApplication() != null) {
            this.mBroadCastRegister.mo58119b(getApplication());
        }
        if (C7213d.m22500a().mo18722O()) {
            C34315c.m110978a(C21115b.m71197a().allUidList());
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onAwesomeSplashEvent$16$MainActivity(View view) {
        performSplashSkipClick();
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onDoGDPREvent(C35500a aVar) {
        doGDPR();
    }

    @C7709l
    public void onFeedbackEvent(C29074f fVar) {
        showNewFeedbackAlert(this);
    }

    private void changeTag(String str) {
        getTabChangeManager().mo84574a(str);
    }

    public void attachBaseContext(Context context) {
        C28275c.m93003g();
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C1592h lambda$callLazyDoIt$4$MainActivity(C1592h hVar) throws Exception {
        lazyDoIt();
        return null;
    }

    @C7709l
    public void onMobEnterFromEvent(C28340w wVar) {
        this.homeViewModel.mo79695a(wVar.f74667a);
    }

    @C7709l
    public void onMobRequestIdEvent(C28341x xVar) {
        this.homeViewModel.f79569h = xVar.f74668a;
    }

    public static Intent getMainActivityIntent(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(335544320);
        return intent;
    }

    private void setupSlideSwitchLayout(String str) {
        if ("DISCOVER".equals(str)) {
            this.stateManager.mo79716a(false);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C37552ae aeVar) {
        Dialog b = C37543ad.m120269b(this);
        if (!b.isShowing()) {
            b.show();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onSettingsDoneEvent(C32955d dVar) {
        if (C37687a.m120527a()) {
            C37687a.m120529b(true);
            callAllDialogs();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onShowPolicyNoticeDialogEvent(C35501b bVar) {
        new C35513a(this, bVar.f93150a).show();
    }

    public void setTabBackground(boolean z) {
        this.mDataCenter.mo60134a("setTabBackground", (Object) Boolean.valueOf(z));
    }

    public void unRegisterActivityOnKeyDownListener(C23254a aVar) {
        if (this.mActivityOnKeyDownListeners != null) {
            this.mActivityOnKeyDownListeners.remove(aVar);
        }
    }

    static final /* synthetic */ Void lambda$lazyDoIt$11$MainActivity(C1592h hVar) throws Exception {
        TTRegionTestApi.m32092a();
        C7121a.m22246a(C7158v.m22355e());
        C41560l.m132355a(AwemeApplication.m21341a());
        return null;
    }

    private void maybeAddLazySequence(Runnable runnable) {
        boolean z;
        synchronized (this) {
            if (!this.lazySequenceCleaned) {
                this.lazySequence.add(runnable);
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            C1592h.m7855a((Callable<TResult>) new C33111v<TResult>(runnable), (Executor) C7258h.m22734g());
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C37679a aVar) {
        if (C6399b.m19946v()) {
            C37686a.f98179g.mo95034a((Activity) this);
        }
    }

    @C7709l(mo20401b = true)
    public void onQueryUserFinishedEvent(C23283b bVar) {
        if (isViewValid() && C21115b.m71197a().getCurUser().isNeedRecommend()) {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    if (C6405d.m19984g() != null && C6405d.m19984g().getClass() == MainActivity.class) {
                        C33602a.m108492a((Activity) MainActivity.this).mo85935a(RecommendFriendActivity.class).mo85936a();
                    }
                }
            });
        }
    }

    @C7709l
    public void onScrollToDetailEvent(C28311ag agVar) {
        if (agVar != null && this.mScrollSwitchHelper != null && this.mScrollSwitchHelper != null) {
            this.homeViewModel.mo79695a(agVar.f74623a);
        }
    }

    @C7709l
    public void onScrollToProfileEvent(C28312ah ahVar) {
        if (!(ahVar == null || this.mScrollSwitchHelper == null || ahVar.f74625a != hashCode() || this.mScrollSwitchHelper == null || !C6399b.m19944t())) {
            onI18nScrollToProfileEvent();
        }
    }

    @C7709l
    public void onSettingSyncDone(C37620c cVar) {
        if (C45027a.m142034a().mo107549c()) {
            C45027a.m142034a().mo107544a((Context) getActivity());
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onUserBannedEvent(C23286e eVar) {
        if (!isBanDialogShowing() && this.mResumed && !isADShowing() && this.appeal.compareAndSet(false, true)) {
            getAppealStatus();
        }
    }

    public void registerActivityOnKeyDownListener(C23254a aVar) {
        if (this.mActivityOnKeyDownListeners == null) {
            this.mActivityOnKeyDownListeners = new ArrayList();
        }
        if (!this.mActivityOnKeyDownListeners.contains(aVar)) {
            this.mActivityOnKeyDownListeners.add(aVar);
        }
    }

    private void cancelRestoreDialog(DialogInterface dialogInterface) {
        if (isUnderMainTab()) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null) {
                iAVService.publishService().cancelRestoreOnMain();
            }
            handleMainPageResume();
        }
        C19282c.m63182a(getApplicationContext(), "protect", "record_off");
        dialogInterface.dismiss();
    }

    private boolean hasDialogShowing(Fragment fragment) {
        if (!(fragment instanceof MainFragment)) {
            return true;
        }
        FeedFragment g = ((MainFragment) fragment).mo84447b();
        if (!(g instanceof FeedRecommendFragment)) {
            return false;
        }
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) g;
        if (feedRecommendFragment.mo67749k() || C25384x.m83528a((C0608j) feedRecommendFragment.mFragmentManager)) {
            return true;
        }
        return false;
    }

    private void showPrivacySettingActivityIfNeeded(boolean z) {
        mNeedCallShowPrivacySettingActivityIfNeeded = false;
        if (this.mHasFocus) {
            this.shouldShowPrivateAccountGuide = false;
            if (C37699a.m120556a()) {
                Intent intent = new Intent(this, MusPrivacyAccountTipActivity.class);
                intent.putExtra("isFirstLaunch", z);
                startActivity(intent);
                if (C21115b.m71197a().getCurUser().isForcePrivateAccount()) {
                    C37699a.m120558b("privacy_account_setting_show", z);
                } else {
                    C37699a.m120555a("privacy_account_setting_show", z);
                }
            }
        } else {
            this.shouldShowPrivateAccountGuide = true;
        }
    }

    private void showUploadItemInNewFollowFeed(C40232d dVar) {
        Fragment b = TabChangeManager.m106432a((FragmentActivity) this).mo84577b("DISCOVER");
        if (b != null && (b instanceof FriendTabFragment)) {
            FriendTabFragment friendTabFragment = (FriendTabFragment) b;
            if (friendTabFragment.mo86868a() != null) {
                friendTabFragment.mo86868a().mo86857a(dVar, this.processedCallback);
            }
        } else if (b == null) {
            this.mBinder = dVar;
        }
    }

    private void tryFixClassloaderError(Bundle bundle) {
        try {
            if (VERSION.SDK_INT == 28 && bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
                if (bundle2 != null && TextUtils.equals(bundle2.getClassLoader().getClass().getName(), "java.lang.BootClassLoader")) {
                    bundle2.setClassLoader(getClassLoader());
                }
            }
        } catch (Exception unused) {
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            C6921a.m21559a(th);
            C6877n.m21407a("main_activity_dispatch_error", "", C6869c.m21381a().mo16887a("message", th.getMessage()).mo16888b());
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Void lambda$lazyDoIt$10$MainActivity(Boolean bool) {
        if (bool.booleanValue()) {
            AlertDialog a = C42951au.m136341a(this, R.string.f124286for, R.string.w_, new C32871ag(this), R.string.afn, new C32872ah(this));
            a.setCanceledOnTouchOutside(false);
            a.setCancelable(false);
        } else {
            enterRecordFrom3rdPlatform(getIntent(), getIntent().getBooleanExtra("enter_record_from_other_platform", false));
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$showGradientPunishWarningDialog$3$MainActivity(View view) {
        C25796a.m84786a((Context) this);
        C6907h.m21524a("enter_violation_record", (Map) C22984d.m75611a().mo59973a("enter_method", "dialog").mo59973a("enter_from", getEnterFrom()).f60753a);
        C25796a.m84789b(C21115b.m71197a().getCurUserId(), true);
        if (this.mGradientPunishWarningDialog != null) {
            C32880ap.m106464a(this.mGradientPunishWarningDialog);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C37702c cVar) {
        if (C32657g.f85120a) {
            mNeedCallShowPrivacySettingActivityIfNeeded = true;
        } else {
            showPrivacySettingActivityIfNeeded(this.isFirstLaunch);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onLaunchFromAppsFlyer(C22982a aVar) {
        if (!C6399b.m19947w()) {
            Uri uri = aVar.f60752a;
            if (uri.getPath().startsWith("/referral") && !C42747e.f111072a) {
                C42743b bVar = new C42743b(this, this, uri.getQueryParameter("uid"), uri.getQueryParameter("uname"), uri.getQueryParameter("aurl"), uri.getLastPathSegment());
                bVar.show();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r3.f109101e != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        return;
     */
    @org.greenrobot.eventbus.C7709l(mo20400a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPublishMessage(com.p280ss.android.ugc.aweme.story.model.C42001b r3) {
        /*
            r2 = this;
            int r0 = r3.f109097a
            r1 = -1
            if (r0 == r1) goto L_0x0019
            switch(r0) {
                case 1: goto L_0x0013;
                case 2: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0018
        L_0x0009:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f109100d
            java.lang.String r3 = r3.getAid()
            com.p280ss.android.ugc.aweme.util.C42866a.m136079b(r3)
            goto L_0x0018
        L_0x0013:
            boolean r3 = r3.f109101e
            if (r3 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r3 = r2.stateManager
            java.lang.String r0 = "page_feed"
            r1 = 0
            r3.mo79713a(r0, r1)
            java.lang.String r3 = "start_upload"
            r0 = 0
            com.p280ss.android.ugc.aweme.util.C42866a.m136075a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.MainActivity.onPublishMessage(com.ss.android.ugc.aweme.story.model.b):void");
    }

    public void onRestoreInstanceState(Bundle bundle) {
        tryFixClassloaderError(bundle);
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString("previousTag");
        boolean z = bundle.getBoolean("slide_switch_scanScroll");
        getTabChangeManager().mo84579b(bundle);
        getTabChangeManager().mo84575a(string, true);
        this.stateManager.mo79716a(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getTabChangeManager().mo84571a(bundle);
        bundle.putString("previousTag", getTabChangeManager().f85773a);
        bundle.putBoolean("slide_switch_scanScroll", this.stateManager.mo79722b());
        bundle.putBoolean("should_show_slide_setting", this.stateManager.mo79734e("page_setting"));
        if (!C7213d.m22500a().mo18799bk()) {
            bundle.putParcelable("android:support:fragments", null);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onUserLogicDeleteEvent(C23287f fVar) {
        if (this.userLogicDelete.compareAndSet(false, true)) {
            C10761a.m31397b(C6399b.m19921a(), fVar.f61320a, 1, 2).mo25750a();
            C6861a.m21333b().logout("user_logic_delete", "cancel_account_logout");
        }
    }

    @C7709l
    public void onUserLoginStateChange(C23288g gVar) {
        AwemeSSOPlatformUtils.m136204a();
        if (gVar.f61321a == 0) {
            this.checkPrivacyPolicy = true;
            C42866a.m136075a("login", C6861a.m21337f().getCurUserId());
        }
        C33640a.m108571a().mo86023a(0);
    }

    private void getAppealDialog(int i) {
        switch (i) {
            case 0:
                showAppealDialog(R.string.l2, R.string.l1, false);
                return;
            case 1:
                showAppealDialog(R.string.l4, R.string.kv, true);
                return;
            case 3:
                showAppealDialog(R.string.kt, R.string.ks, false);
                return;
            case 4:
                showAppealDialog(R.string.kr, R.string.kq, false);
                return;
            case 6:
                showAppealDialog(0, R.string.gy, false);
                return;
            case 7:
            case 8:
                showAppealDialog(0, R.string.hd, false);
                break;
        }
    }

    private void restoreTheme(boolean z) {
        if (z) {
            if (!this.mThemeRestored) {
                this.mThemeRestored = true;
            } else {
                return;
            }
        }
        findViewById(16908290).setAlpha(1.0f);
        if (VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
        }
        getWindow().getDecorView().setBackgroundResource(R.drawable.iw);
        getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
        this.mSplashLoadMaskHelper.mo65574b();
        ALog.m20862b("awesome_splash", "recoveryTheme");
    }

    private void showOpenSdkShareDialog(Intent intent) {
        String str;
        try {
            if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG")) {
                final ShareContext shareContext = (ShareContext) intent.getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG");
                if (shareContext != null) {
                    shareContext.mNeedShowDialog = true;
                    if (C34697a.m112009a((BaseShareContext) shareContext)) {
                        final FragmentActivity activity = getActivity();
                        if (activity != null) {
                            if (TextUtils.isEmpty(shareContext.mAppName)) {
                                str = activity.getString(R.string.e70);
                            } else {
                                str = shareContext.mAppName;
                            }
                            new C34675a(activity, str, "share saved", new C34678a() {
                                /* renamed from: b */
                                public final void mo80107b() {
                                    Intent intent = new Intent();
                                    intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                                    activity.sendBroadcast(intent);
                                }

                                /* renamed from: a */
                                public final void mo80106a() {
                                    new C34685e(activity, shareContext).mo88009a("Users store shared content for draft or user accounts are not allowed to post videos", 20015);
                                }
                            }).show();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if ("user/homepage".equals(r3.toString()) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void suitRouter(android.content.Intent r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            android.net.Uri r0 = r5.getData()
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = r0.getHost()
            java.lang.String r0 = r0.getPath()
            java.lang.String r2 = "mine"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0030
            java.lang.String r2 = "user/homepage"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0041
        L_0x0030:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
            java.lang.String r1 = "USER"
            r5.putExtra(r0, r1)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.MainActivity.suitRouter(android.content.Intent):void");
    }

    @C7709l
    public void onEvent(C45448f fVar) {
        if (!C6319n.m19593a(AppLog.getServerDeviceId())) {
            C34334h.m111033d().mo87180f();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        suitRouter(intent);
        C42961az.m136380a(new C32953b(intent));
        if (this.mShareIntentParseCenter != null) {
            this.mShareIntentParseCenter.f90469a = intent;
            this.mShareIntentParseCenter.mo88018a(false);
        }
        tryShowGuideView();
        showOpenSdkShareDialog(getIntent());
        if (!tryProcessPublish(intent, false)) {
            this.mDataCenter.mo60134a("onNewIntent", (Object) intent);
            this.stateManager.mo79713a("page_feed", false);
            enterRecordFrom3rdPlatform(intent, intent.getBooleanExtra("enter_record_from_other_platform", false));
            handleSwitchAccount(intent.getExtras());
        }
    }

    /* access modifiers changed from: 0000 */
    public void showNewFeedbackAlert(final Context context) {
        C6907h.m21524a("feedback_reply_alert", (Map) C22984d.m75611a().mo59973a("uid", C21115b.m71197a().getCurUserId()).f60753a);
        new C10741a(context).mo25649a((int) R.string.bto).mo25650a((int) R.string.by8, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C6907h.m21524a("feedback_reply_view", (Map) C22984d.m75611a().mo59973a("uid", C21115b.m71197a().getCurUserId()).f60753a);
                context.startActivity(new Intent(context, FeedbackActivity.class));
            }
        }).mo25658b((int) R.string.bxo, (OnClickListener) null).mo25656a().mo25637a();
    }

    private void handleSwitchAccount(Bundle bundle) {
        if (bundle != null) {
            Uri uri = null;
            if (C43122ff.m136767b() && C21115b.m71197a().allUidList().size() > 1) {
                C6877n.m21407a("child_mode_multi_account", "", null);
            }
            if (mNeedCallShowPrivacySettingActivityIfNeeded && C32657g.f85120a) {
                showPrivacySettingActivityIfNeeded(this.isFirstLaunch);
            }
            C32657g.f85120a = false;
            if (bundle.getInt("switch_account_success_toast_res_id", 0) != 0) {
                new Handler().post(new C32868ad(bundle));
            }
            boolean z = bundle.getBoolean("login_jump");
            boolean z2 = bundle.getBoolean("switch_jump");
            boolean z3 = bundle.getBoolean("cancelRestoreOnMain");
            Intent intent = (Intent) bundle.getParcelable("push_intent");
            if (intent != null) {
                uri = intent.getData();
            }
            if (z3) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().cancelRestoreOnMain();
            }
            if (intent != null && (z || z2)) {
                intent.putExtra("second_jump", true);
                intent.setClass(this, DeepLinkHandlerActivity.class);
                if (uri != null) {
                    intent.setData(uri.buildUpon().appendQueryParameter("_t", String.valueOf(System.currentTimeMillis())).build());
                }
                startActivity(intent);
            }
        }
    }

    private void recordWithMusic(String str) {
        String uuid = UUID.randomUUID().toString();
        C22984d a = C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "direct_shoot").mo59973a("group_id", C33242an.m107316b()).mo59970a("_staging_flag", C6399b.m19946v() ^ true ? 1 : 0);
        if (C22494d.m74385a().mo59063a(C33242an.m107316b())) {
            a.mo59973a("previous_page", "push");
        }
        if (!TextUtils.isEmpty(str)) {
            a.mo59973a("log_pb", str);
        }
        C6907h.m21524a("shoot", (Map) a.f60753a);
        new C33274p().mo85304a("popular_song").mo85252e();
        C28580o.m93830a(PAGE.MUSICAL);
        Intent intent = new Intent();
        intent.putExtra("reverse_video_record_show_planD", true);
        intent.putExtra("shoot_way", "direct_shoot");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("translation_type", 3);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        intent.putExtra("from", "main");
        if (shouldRecordWithSticker()) {
            intent.putStringArrayListExtra("reuse_sticker_ids", C38275x.m122271b(this.homeViewModel.f79570i.getStickerIDs()));
        }
        C33242an.m107315a(getEnterFrom());
        C33242an.m107318c("click_plus");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this, intent);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Void lambda$getAppealStatus$12$MainActivity(C1592h hVar) throws Exception {
        if (hVar == null || hVar.mo6887c() || hVar.mo6889d()) {
            this.appeal.set(false);
        } else if (!(hVar == null || !hVar.mo6882b() || hVar.mo6890e() == null)) {
            this.appealStatus = ((AppealStatusResponse) hVar.mo6890e()).getStatus();
            if (this.appealStatus == 5) {
                if (((AppealStatusResponse) hVar.mo6890e()).getBanTime() > 31536000) {
                    this.appealStatus = 6;
                } else if (((AppealStatusResponse) hVar.mo6890e()).getBanType() == 4) {
                    this.appealStatus = 8;
                } else if (((AppealStatusResponse) hVar.mo6890e()).getBanType() == 1 && ((AppealStatusResponse) hVar.mo6890e()).getBanTime() <= 31536000) {
                    this.appealStatus = 7;
                }
            }
            if (!this.mResumed || isADShowing()) {
                this.mNeedShowBanDialog = true;
            } else {
                getAppealDialog(this.appealStatus);
            }
        }
        return null;
    }

    @C7709l
    public void onAwesomeSplashEvent(C25053a aVar) {
        this.mAwesomeSplashStatus = aVar.f66130a;
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        if (aVar.f66130a == 1) {
            this.mThemeRestored = false;
            this.mSplashLoadMaskHelper.mo65573a();
            getWindow().getDecorView().setBackgroundResource(R.color.a_0);
            viewGroup.setAlpha(0.0f);
        } else {
            viewGroup.setAlpha(1.0f);
            restoreTheme(true);
        }
        if (aVar.f66130a == 4) {
            if (this.mAwesomeSplashMask != null) {
                viewGroup.removeView(this.mAwesomeSplashMask);
                this.mAwesomeSplashMask = null;
            }
        } else if (this.mAwesomeSplashMask == null) {
            getLayoutInflater().inflate(R.layout.hm, viewGroup, true);
            this.mAwesomeSplashMask = (AwesomeSplashMask) viewGroup.findViewById(R.id.jj);
            View findViewById = this.mAwesomeSplashMask.findViewById(R.id.jl);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C32869ae(this));
                findViewById.setOnTouchListener(new OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            long j = 0;
                            C28130ac currentViewHolder = MainActivity.this.getCurrentViewHolder();
                            if (C28478a.m93590e(currentViewHolder) && C25352e.m83231n(currentViewHolder.mo65711h())) {
                                if (MainActivity.this.getCurFragment() instanceof MainFragment) {
                                    MainFragment mainFragment = (MainFragment) MainActivity.this.getCurFragment();
                                    if (mainFragment.mo84447b() instanceof FeedRecommendFragment) {
                                        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) mainFragment.mo84447b();
                                        if (feedRecommendFragment != null) {
                                            j = feedRecommendFragment.f75690k.mo73341aC();
                                        }
                                    }
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("duration", String.valueOf(j));
                                HashMap hashMap2 = new HashMap();
                                if (C43057di.m136601a(MainActivity.this.getBaseContext())) {
                                    hashMap2.put("click_x", String.valueOf(((float) C23482j.m77098b(MainActivity.this.getBaseContext())) - motionEvent.getRawX()));
                                } else {
                                    hashMap2.put("click_x", String.valueOf(motionEvent.getRawX()));
                                }
                                hashMap2.put("click_y", String.valueOf(motionEvent.getRawY()));
                                hashMap.put("ad_extra_data", new C6600e().mo15979b((Object) hashMap2));
                                C24976t.m82184c(MainActivity.this.getApplicationContext(), currentViewHolder.mo65711h(), (Map<String, String>) hashMap);
                            }
                        }
                        return false;
                    }
                });
            }
            this.mAwesomeSplashMask.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C25083o.m82610b(System.currentTimeMillis());
                    if (!(MainActivity.this.mAwesomeSplashMask == null || MainActivity.this.mAwesomeSplashMask.getViewTreeObserver() == null)) {
                        MainActivity.this.mAwesomeSplashMask.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
        }
        if (this.mAwesomeSplashMask != null) {
            this.mAwesomeSplashMask.onEvent(aVar);
        }
        if ((aVar.f66130a == 1 || aVar.f66130a == 2) && (getCurFragment() instanceof MainFragment)) {
            FeedFragment g = ((MainFragment) getCurFragment()).mo84447b();
            if (g instanceof FeedRecommendFragment) {
                ((FeedRecommendFragment) g).mo73853y();
                exitDislikeMode();
            }
        }
    }

    @C7709l
    public void onVideoPageChangeEvent(C28306ab abVar) {
        String str;
        String str2;
        if (abVar.f74612a != null) {
            if (C43122ff.m136767b() && abVar.f74612a.isAd()) {
                C6877n.m21407a("aweme_child_mode_ad", "", null);
            }
            if (SymphonyAdManager.m82664a().mo65648a((Context) this, abVar.f74612a)) {
                this.stateManager.mo79706a((C23434a) this.scrollFullChecker);
                C2128g.m9330a(SymphonyAdManager.m82664a().mo65645a(abVar.f74612a));
                return;
            }
            String authorUid = abVar.f74612a.getAuthorUid();
            this.homeViewModel.f79570i = abVar.f74612a;
            if (this.homeViewModel.f79570i != null) {
                str = this.homeViewModel.f79570i.getAid();
            } else {
                str = "";
            }
            C33242an.m107317b(str);
            C33258c.m107474b(authorUid);
            if (this.homeViewModel.f79570i != null) {
                str2 = this.homeViewModel.f79570i.getAid();
            } else {
                str2 = "";
            }
            C33258c.m107472a(str2);
            if (!TextUtils.equals(this.mLastUserId, authorUid)) {
                this.mLastUserId = authorUid;
                this.adViewController.mo64699a((Context) this, abVar.f74612a);
                this.adViewController.mo64716k();
                if (!this.adViewController.mo64705a() || this.adViewController.mo64710e()) {
                    C6726a.m20843a(new Runnable() {
                        public final void run() {
                            if (!MainActivity.this.isFinishing() && MainActivity.this.homeViewModel != null) {
                                MainActivity.this.homeViewModel.f79566e = MainActivity.this.mLastUserId;
                                MainActivity.this.homeViewModel.mo79694a(MainActivity.this.homeViewModel.f79570i);
                            }
                        }
                    }, C34943c.f91128x);
                }
                setAdScrollRightControl();
                C45027a.m142034a().mo107548b(getActivity());
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onWindowFocusChanged", true);
        if (z) {
            C6857a.m21312e().mo16827b("cold_boot_main_measure_to_focus", false);
            C6857a.m21312e().mo16827b("cold_boot_main_resume_to_focus", true);
            C6857a.m21312e().mo16822a("cold_boot_main_focus_duration", true);
        }
        this.mHasFocus = z;
        super.onWindowFocusChanged(z);
        this.isFirstLaunch = false;
        if (z && this.mIsFirstVisible) {
            ((MainLooperOptService) C7121a.m22243a(MainLooperOptService.class)).updateState(WatchState.WATCH_ON_DRAW);
            this.mIsFirstVisible = false;
            C6726a.m20843a(new C32877am(this), C34943c.f91128x);
            if (!appsFlyerisInit) {
                C6726a.m20843a(new C32878an(this), C34943c.f91127w);
            }
            this.isFirstLaunch = true;
            C22330i.m73930a();
            onStartUp();
        }
        if (C6399b.m19946v() && this.isFirstLaunch) {
            C37687a.m120525a(this, null);
        }
        if (this.mHasFocus && this.shouldShowPrivateAccountGuide) {
            showPrivacySettingActivityIfNeeded(this.isFirstLaunch);
        }
        if (z) {
            C7113k.m22208a();
            C6857a.m21312e().mo16827b("app_start_to_main_focus", true);
            C6857a.m21312e().mo16827b("cold_boot_main_focus_duration", true);
            if (C7121a.m22260h()) {
                C28540a.m93747b().mo73252a();
                if (!this.hasFirstRefresh) {
                    this.hasFirstRefresh = true;
                    C46184a.m145050a();
                    C46183b.m145048a("first_refresh");
                }
            }
        } else {
            C6857a.m21312e().mo16818a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onBottomTabClick */
    public void bridge$lambda$0$MainActivity(String str) {
        if (!this.mDialogShowingManager.mo95909h()) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 2223327) {
                if (hashCode == 482617583 && str.equals("PUBLISH")) {
                    c = 1;
                }
            } else if (str.equals("HOME")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.stateManager.mo79716a(true);
                    refreshSlideSwitchCanScrollRight();
                    setAdScrollRightControl();
                    return;
                case 1:
                    C43063dm.m136614a();
                    if (System.currentTimeMillis() - this.mFirstClickPublish >= 500) {
                        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing() || !iAVService.getPublishService().isPublishServiceRunning(getActivity())) {
                            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
                            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
                            C19282c.m63184a(getActivity(), "record", "click", 0, 0, new C6909j().mo16966a("record_mode", "direct").mo16967a());
                            if (!C21115b.m71197a().isLogin()) {
                                if (!C30538p.m99745a()) {
                                    C32656f.m105742a((Activity) this, this.homeViewModel.mo79692a(), "click_shoot");
                                    return;
                                } else if (C7213d.m22500a().mo18710C()) {
                                    C32656f.m105742a((Activity) this, this.homeViewModel.mo79692a(), "click_shoot");
                                    return;
                                }
                            }
                            String str2 = "";
                            if ("HOME".equals(getTabChangeManager().f85773a)) {
                                MainFragment mainFragment = (MainFragment) getTabChangeManager().mo84567a();
                                if (mainFragment != null && (mainFragment.mo84447b() instanceof FeedRecommendFragment)) {
                                    str2 = C28199ae.m92689a().mo71791a(C33230ac.m107232i(CurPlayVideoRecord.INSTANCE.getVideoId()));
                                }
                            }
                            recordWithMusic(str2);
                            this.mFirstClickPublish = System.currentTimeMillis();
                            ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74858a();
                            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).changeStatusBarMainTab(this, "PUBLISH");
                            break;
                        } else {
                            C10761a.m31409e((Context) getActivity(), (int) R.string.ig).mo25750a();
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", true);
        this.mActivityProxy.mo79688a(this, bundle);
        this.stateManager = ScrollSwitchStateManager.m98918a((FragmentActivity) this);
        this.homeViewModel = this.mActivityProxy.f79553a;
        this.mDataCenter = this.mActivityProxy.f79554b;
        this.mRestartFromLogout = getIntent().getBooleanExtra("restart_from_logout", false);
        C7121a.m22254e().mo18551a(new C37240b()).mo18551a(new C37244d()).mo18551a(new C37231a()).mo18552a();
        this.mActivityProxy.mo79689b(this, bundle);
        C6857a.m21312e().mo16822a("feed_lego_add_to_request", false);
        C6857a.m21312e().mo16822a("method_create_welcome_duration", false);
        if (C32250l.f84286c.mo83470c() && !C32250l.f84285b) {
            C32223a.m104521a(1);
            NewUserJourneyActivity.m104512a((Activity) this, true);
        }
        C6857a.m21312e().mo16827b("method_create_welcome_duration", false);
        C37543ad.m120265a((Activity) this);
        startTrack();
        suitRouter(getIntent());
        C25054b.m82490a().f66141h = true;
        C25054b.m82490a().mo65551a(getIntent());
        handleSwitchAccount(getIntent().getExtras());
        if (bundle != null) {
            i = R.style.t;
        } else {
            i = R.style.u;
        }
        C30294i.m99050a(this, i);
        C6857a.m21312e().mo16822a("method_main_super_duration", false);
        super.onCreate(bundle);
        C6857a.m21312e().mo16827b("method_main_super_duration", false);
        DataCenter dataCenter = this.mDataCenter;
        String str = "start_from_logout_or_switch";
        if (getIntent().getBooleanExtra("restart_from_logout", false) || getIntent().getBooleanExtra("is_start_by_switch_account", false)) {
            z = true;
        } else {
            z = false;
        }
        dataCenter.mo60134a(str, (Object) Boolean.valueOf(z));
        this.mActivityProxy.mo79690c(this, bundle);
        this.mAdapter = C30262a.m99001a();
        this.mViewPager = C30262a.m99003b();
        this.mScrollSwitchHelper = new C32988dj(this, this.mViewPager, this.mAdapter);
        this.mActivityProxy.mo79691d(this, bundle);
        initDislikeView();
        C7213d.m22500a().mo18735a((C7217x) this);
        this.stateManager.mo79739h(this, new C33109t(this));
        createMainHelper();
        checkSplashAd();
        String handleIntent = handleIntent();
        if (!C6399b.m19944t() && SharePrefCache.inst().getIsFirstLaunch() != null && !((Boolean) SharePrefCache.inst().getIsFirstLaunch().mo59877d()).booleanValue()) {
            C42925am.m136274b(this);
        }
        getWindow().setSoftInputMode(32);
        if (TextUtils.equals(C6399b.m19941q(), "local_test")) {
            C29350a.m96320a(this);
        }
        if ("NOTIFICATION".equals(handleIntent)) {
            if (!C21115b.m71197a().isLogin()) {
                C32656f.m105742a((Activity) this, getEnterFrom(), "click_message");
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                return;
            } else if (getIntent().getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_LINK_ACCOUNT", false)) {
                C23549b.m77335a().pushOrNoticeShowLinkAccountDialog(getSupportFragmentManager(), getEnterFrom());
            }
        }
        this.showToast = true;
        C6861a.m21332a().addLoginOrLogoutListener(C33110u.f86131a);
        feedOVVMainActivityCreate();
        setupSlideSwitchLayout(handleIntent);
        checkJiraPermission();
        initMLModel();
        injectVideoInfo();
        setupEagleEyeAndDownloaderManager();
        ensureLazyDoItFinallyCalled();
        if (bundle == null) {
            changeTag(handleIntent);
        }
        if (!TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") || getIntent().getCategories() == null || getIntent().getCategories().size() <= 0 || !getIntent().getCategories().contains("android.intent.category.LAUNCHER") || isTaskRoot()) {
            C43051dc.f111648b = getClass();
            checkGcmMessage();
            if (C6399b.m19947w()) {
                C38012e.m121339a(true);
                CommandObserver.m121319a();
            }
            C1592h.m7855a(C32870af.f85808a, (Executor) C7258h.m22732e());
            addLegoRequestTask();
            C7121a.m22248b().mo18559a(new ShareCacheRegisterTask()).mo18559a(new ReportActivityStatusTask(TAG, bundle)).mo18559a(new TileTask()).mo18559a(new RegisterStorageTask()).mo18560a();
            AVCameraInitTask.init(0, false);
            C25054b.m82490a().f66143j = true;
            larksso();
            cleanEffects();
            C6857a.m21312e().mo16827b("cold_boot_main_create_duration", true);
            C6857a.m21312e().mo16822a("cold_boot_main_create_to_resume", true);
            this.mDialogShowingManager = C38267a.m122239a((Context) this);
            this.firstCreated = true;
            C34102v.m109777a(this);
            Intent intent = getIntent();
            if (intent.getBooleanExtra("jumpToGame", false)) {
                C7167b.m22380b().mo18647a().openMiniApp((Context) this, C33447f.m108188a("", intent.getStringExtra("gameId"), true, ""), new C33472a().mo85791b("schema").mo85790a());
            }
            if (C6384b.m19835a().mo15292a(OnlineCoverageExperiment.class, true, "code_coverage", C6384b.m19835a().mo15295d().code_coverage, false)) {
                CoverageHandler.init(C37191a.m119552a());
            }
            C7121a.m22248b().mo18559a(new DfDummyInitTask(false)).mo18560a();
            if (bundle == null && intent.hasExtra("publish_bundle") && intent.hasExtra("enable_optimize_main_not_in_stack")) {
                tryProcessPublish(intent, true);
            }
            showOpenSdkShareDialog(getIntent());
            if (OptFirstFrameTask.enableFirstFrameOpt) {
                OptFirstFrameTask.enableFirstFrameOpt = false;
                C7121a.m22248b().mo18559a(new OptFirstFrameTask()).mo18560a();
            }
            C43316v.m137450K().mo104944t();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$null$8$MainActivity(DialogInterface dialogInterface, int i) {
        cancelRestoreDialog(dialogInterface);
    }

    private void enterRecordFrom3rdPlatform(Intent intent, boolean z) {
        if (z) {
            C19282c.m63182a(getApplicationContext(), "protect", "record_on");
            Intent intent2 = new Intent(intent);
            if (intent.getBooleanExtra("show_no_splash_ad", false)) {
                AwemeAppData.m65765a().f60329i = true;
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this, intent2);
        }
    }

    static final /* synthetic */ void lambda$showAppealDialog$14$MainActivity(DialogInterface dialogInterface, int i) {
        Intent intent;
        C6907h.m21524a("click_appeal", (Map) new HashMap());
        Activity b = AwemeApplication.m21343b();
        if (b != null) {
            if (C6399b.m19946v()) {
                StringBuilder sb = new StringBuilder("https://m.tiktok.com/falcon/main/gradient_appeal/?hide_nav_bar=1&appeal_type=6&object_id=");
                sb.append(C6861a.m21337f().getCurUserId());
                intent = C25833b.m84946a((Context) b, sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("https://www.tiktok.com/falcon/main/gradient_appeal/?hide_nav_bar=1&appeal_type=6&object_id=");
                sb2.append(C6861a.m21337f().getCurUserId());
                intent = C25833b.m84946a((Context) b, sb2.toString());
            }
            intent.setClass(b, CrossPlatformActivity.class);
            b.startActivityForResult(intent, 17);
        }
    }

    private boolean tryProcessPublish(Intent intent, boolean z) {
        Activity[] activityStack;
        if (z) {
            for (Activity activity : ActivityStack.getActivityStack()) {
                if (!(activity instanceof MainActivity)) {
                    activity.finish();
                }
            }
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        StringBuilder sb = new StringBuilder("MainActivity.onNewIntent()");
        sb.append(intent.getExtras());
        sb.append(" isOnCreate:");
        sb.append(z);
        C42880h.m136156a(sb.toString());
        StringBuilder sb2 = new StringBuilder("MainActivity.onNewIntent()");
        sb2.append(intent.getExtras());
        C6907h.m21524a("av_video_memory", (Map) C22984d.m75611a().mo59973a("log", sb2.toString()).mo59972a("isOnCreate", (Object) Boolean.valueOf(z)).f60753a);
        return iAVService.getPublishService().processPublish(this, intent);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$null$9$MainActivity(DialogInterface dialogInterface, int i) {
        AnchorListManager.m80516a();
        C19282c.m63182a(getApplicationContext(), "protect", "record_on");
        C33242an.m107315a(getEnterFrom());
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "restore_crash");
        intent.putExtra("restore", 2);
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this, intent);
        dialogInterface.dismiss();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mActivityOnKeyDownListeners != null) {
            for (C23254a a : this.mActivityOnKeyDownListeners) {
                if (a.mo60522a(i, keyEvent)) {
                    return true;
                }
            }
        }
        if (i != 4) {
            if (i != 67) {
                return false;
            }
            return super.onKeyDown(i, keyEvent);
        } else if (this.stateManager.mo79723b("page_discover") && this.stateManager.mo79738g("page_discover")) {
            return true;
        } else {
            Fragment a2 = getTabChangeManager().mo84567a();
            if (a2 != null && (a2 instanceof FriendTabFragment)) {
                HotSearchAndDiscoveryFragment2 e = ((FriendTabFragment) a2).mo86870e();
                if (e != null && e.mo67891c()) {
                    return true;
                }
            }
            if (this.mScrollSwitchHelper.mo84700c()) {
                return true;
            }
            if (getTabChangeManager().mo84567a() == null || !(getTabChangeManager().mo84567a() instanceof C36327a)) {
                refreshWhenBack();
                return super.onKeyDown(i, keyEvent);
            }
            refreshWhenBack();
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    static final /* synthetic */ void lambda$showAppealDialog$13$MainActivity(boolean z, DialogInterface dialogInterface, int i) {
        if (z) {
            C6907h.m21524a("cancel_appeal", (Map) new HashMap());
        }
        dialogInterface.dismiss();
        C6861a.m21333b().logout("user_banned", "user_banned");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 16) {
            if (i == 17) {
                C6861a.m21333b().logout("user_banned", "user_banned");
            }
            if (i == 18 && i2 == -1 && intent != null) {
                startActivity(intent);
            }
            if (i == 19 && i2 == -1) {
                C37543ad.m120268a("app_update_click");
            }
            if (i == 1 && i2 == 2 && this.mViewPager != null) {
                this.stateManager.mo79713a("page_profile", false);
            }
            if (i2 != 10) {
                super.onActivityResult(i, i2, intent);
            } else if (intent.getIntExtra("result", -1) == 0) {
                C10761a.m31385a((Context) this, (int) R.string.d3n, 1, 2).mo25750a();
            }
        }
    }

    public void onPublishServiceConnected(C40232d dVar, ServiceConnectionImpl serviceConnectionImpl, Object obj) {
        C6857a.m21312e().mo16818a();
        C42961az.m136380a(new C42001b(-1, null, null, null));
        if (this.processedCallback != null) {
            this.processedCallback.onStartPublish();
        }
        C42961az.m136380a(new C39327e(true));
        if (C33003b.m106651a()) {
            showUploadItemInNewFollowFeed(dVar);
            return;
        }
        PublishDialogFragment publishDialogFragment = (PublishDialogFragment) ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createPublishDialogFragment();
        Bundle bundle = new Bundle();
        if (obj != null) {
            if (obj instanceof Serializable) {
                bundle.putSerializable("args", (Serializable) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable("args", (Parcelable) obj);
            }
        }
        publishDialogFragment.f99682c = dVar;
        publishDialogFragment.setArguments(bundle);
        publishDialogFragment.mo96123a(getSupportFragmentManager(), "publish");
        getSupportFragmentManager().mo2649a((C0609a) new PublishFragmentLifecycleCallbacks(this, serviceConnectionImpl, this.processedCallback), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showAppealDialog(int r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            r3.mNeedShowBanDialog = r0
            boolean r1 = r3.isBanDialogShowing()
            if (r1 == 0) goto L_0x000a
            return
        L_0x000a:
            com.bytedance.ies.dmt.ui.a.a$a r1 = new com.bytedance.ies.dmt.ui.a.a$a
            r1.<init>(r3)
            com.bytedance.ies.dmt.ui.a.a$a r5 = r1.mo25657b(r5)
            r1 = 2131822499(0x7f1107a3, float:1.9277771E38)
            com.ss.android.ugc.aweme.main.ab r2 = new com.ss.android.ugc.aweme.main.ab
            r2.<init>(r6)
            com.bytedance.ies.dmt.ui.a.a$a r5 = r5.mo25650a(r1, r2)
            if (r4 == 0) goto L_0x0024
            r5.mo25649a(r4)
        L_0x0024:
            if (r6 == 0) goto L_0x002e
            r4 = 2131820963(0x7f1101a3, float:1.9274656E38)
            android.content.DialogInterface$OnClickListener r6 = com.p280ss.android.ugc.aweme.main.C32867ac.f85805a
            r5.mo25658b(r4, r6)
        L_0x002e:
            com.bytedance.ies.dmt.ui.a.a r4 = r5.mo25656a()
            android.app.Dialog r4 = r4.mo25638b()
            r3.mAccountBanedDialog = r4
            android.app.Dialog r4 = r3.mAccountBanedDialog
            r4.setCancelable(r0)
            android.app.Dialog r4 = r3.mAccountBanedDialog
            com.ss.android.ugc.aweme.main.MainActivity$8 r5 = new com.ss.android.ugc.aweme.main.MainActivity$8
            r5.<init>()
            r4.setOnShowListener(r5)
            android.app.Dialog r4 = r3.mAccountBanedDialog     // Catch:{ Exception -> 0x00c5 }
            r4.show()     // Catch:{ Exception -> 0x00c5 }
            int r4 = r3.appealStatus     // Catch:{ Exception -> 0x00c5 }
            switch(r4) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x00a5;
                case 2: goto L_0x0051;
                case 3: goto L_0x009a;
                case 4: goto L_0x008f;
                case 5: goto L_0x0051;
                case 6: goto L_0x007b;
                case 7: goto L_0x0067;
                case 8: goto L_0x0053;
                default: goto L_0x0051;
            }     // Catch:{ Exception -> 0x00c5 }
        L_0x0051:
            goto L_0x00c4
        L_0x0053:
            java.lang.String r4 = "pop_appeal"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = "appeal_type"
            java.lang.String r0 = "3"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r0)     // Catch:{ Exception -> 0x00c5 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a     // Catch:{ Exception -> 0x00c5 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c4
        L_0x0067:
            java.lang.String r4 = "pop_appeal"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = "appeal_type"
            java.lang.String r0 = "2"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r0)     // Catch:{ Exception -> 0x00c5 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a     // Catch:{ Exception -> 0x00c5 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x007b:
            java.lang.String r4 = "pop_appeal"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = "appeal_type"
            java.lang.String r0 = "1"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r0)     // Catch:{ Exception -> 0x00c5 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a     // Catch:{ Exception -> 0x00c5 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x008f:
            java.lang.String r4 = "pop_appeal_expired"
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x00c5 }
            r5.<init>()     // Catch:{ Exception -> 0x00c5 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x009a:
            java.lang.String r4 = "pop_appeal_failed"
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x00c5 }
            r5.<init>()     // Catch:{ Exception -> 0x00c5 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x00a5:
            java.lang.String r4 = "pop_appeal"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r6 = "appeal_type"
            java.lang.String r0 = "0"
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r0)     // Catch:{ Exception -> 0x00c5 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a     // Catch:{ Exception -> 0x00c5 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x00b9:
            java.lang.String r4 = "pop_appeal_restored"
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x00c5 }
            r5.<init>()     // Catch:{ Exception -> 0x00c5 }
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x00c4:
            return
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.MainActivity.showAppealDialog(int, int, boolean):void");
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        showCustomToast(str, i2, i3);
    }

    public static void onAccountResult(int i, boolean z, int i2, User user) {
        PolarisInitTask.ensuareInit();
        if (PolarisInitTask.isPolarisInit()) {
            C12428i.m36161k();
        }
        int a = C6384b.m19835a().mo15287a(AccountExperiment.class, false, "account_service_type", C6384b.m19835a().mo15295d().account_service_type, 3);
        if (a == 3 || a == 2) {
            C6804a.m21138a().initPushAccountService(C21115b.m71197a().isLogin());
        }
    }
}
