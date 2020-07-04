package com.bytedance.sdk.account.bdplatform.impl.view;

import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.sdk.account.bdplatform.impl.C12766a;
import com.bytedance.sdk.account.bdplatform.impl.C12782d;
import com.bytedance.sdk.account.bdplatform.p655a.C12751a.C12753b;
import com.bytedance.sdk.account.bdplatform.p655a.C12751a.C12754c;
import com.bytedance.sdk.account.bdplatform.p655a.C12755b;
import com.bytedance.sdk.account.bdplatform.p655a.C12756c;
import com.bytedance.sdk.account.bdplatform.p655a.C12757d;
import com.bytedance.sdk.account.bdplatform.p656b.C12759b;
import com.bytedance.sdk.account.bdplatform.p656b.C12760c;
import com.bytedance.sdk.account.p650b.p651a.C12740a;
import com.bytedance.sdk.account.p650b.p653c.C12743a;
import com.bytedance.sdk.account.p650b.p653c.C12744b;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12746a;
import com.bytedance.sdk.account.p650b.p654d.C12750c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class BaseBDAuthorizeActivity extends FragmentActivity implements C12740a, C12754c {
    protected C12755b authorizePlatformDepend;
    protected C12753b authorizePresenter;
    private C12757d bdPlatformApi;
    protected C12760c configuration;
    private ImageView mApplyAuthAppIcon;
    private TextView mApplyAuthAppName;
    public RelativeLayout mAuthContent;
    private TextView mAuthDescTitle;
    protected C12759b mAuthInfoResponse;
    private String mAuthLoadingText;
    public LinearLayout mAuthScopeLayout;
    private View mBorder;
    private TextView mCancelTxt;
    protected RelativeLayout mContainer;
    public ScrollView mContentLayout;
    private TextView mGrantAuthTxt;
    private String mInitLoadingText;
    protected C12746a mLastRequest;
    private ImageView mLeftCube;
    private C12756c mLoadingDialog;
    public TextView mLoginBtn;
    public TextView mProtocol;
    private ImageView mRightCube;
    protected RelativeLayout mRootView;
    protected boolean mStatusDestroyed;
    private FrameLayout mTitleBarLayout;
    private TextView mUserName;
    private ImageView mUserPortrait;

    public abstract C12755b createDepend();

    public String getAuthLoadingText() {
        return this.mAuthLoadingText;
    }

    public String getInitLoadingText() {
        return this.mInitLoadingText;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.ak;
    }

    public abstract Drawable getLoadingProgressBar();

    /* access modifiers changed from: protected */
    public abstract C12760c initPlatformConfiguration();

    public abstract void onCancel();

    public abstract void onLoginClick();

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void initDynamicViewByDataAndShow() {
        initStateListView();
        initAuthButtonLayout();
    }

    public void showContainerView() {
        this.mContainer.setVisibility(0);
    }

    private void initAuthButtonLayout() {
        this.mContentLayout.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (BaseBDAuthorizeActivity.this.mContentLayout != null) {
                    if (VERSION.SDK_INT >= 16) {
                        BaseBDAuthorizeActivity.this.mContentLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        BaseBDAuthorizeActivity.this.mContentLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
                if (!(BaseBDAuthorizeActivity.this.mAuthContent == null || BaseBDAuthorizeActivity.this.mRootView == null)) {
                    int measuredHeight = BaseBDAuthorizeActivity.this.mAuthContent.getMeasuredHeight();
                    if (BaseBDAuthorizeActivity.this.mRootView.getMeasuredHeight() - measuredHeight <= ((int) C12750c.m37039a(BaseBDAuthorizeActivity.this, 220.0f))) {
                        if (BaseBDAuthorizeActivity.this.mContentLayout != null) {
                            LayoutParams layoutParams = (LayoutParams) BaseBDAuthorizeActivity.this.mContentLayout.getLayoutParams();
                            layoutParams.setMargins(0, 0, 0, (int) C12750c.m37039a(BaseBDAuthorizeActivity.this, 60.0f));
                            BaseBDAuthorizeActivity.this.mContentLayout.setLayoutParams(layoutParams);
                        }
                        if (BaseBDAuthorizeActivity.this.mLoginBtn != null) {
                            LayoutParams layoutParams2 = new LayoutParams(-1, (int) C12750c.m37039a(BaseBDAuthorizeActivity.this, 44.0f));
                            if (BaseBDAuthorizeActivity.this.mProtocol.getVisibility() == 8) {
                                layoutParams2.addRule(12);
                            } else {
                                layoutParams2.addRule(2, R.id.e8l);
                            }
                            int a = (int) C12750c.m37039a(BaseBDAuthorizeActivity.this, 15.0f);
                            layoutParams2.setMargins(a, 0, a, a);
                            BaseBDAuthorizeActivity.this.mLoginBtn.setLayoutParams(layoutParams2);
                        }
                    } else if (BaseBDAuthorizeActivity.this.mLoginBtn != null) {
                        LayoutParams layoutParams3 = new LayoutParams(-1, (int) C12750c.m37039a(BaseBDAuthorizeActivity.this, 44.0f));
                        layoutParams3.addRule(3, R.id.bh2);
                        int a2 = (int) C12750c.m37039a(BaseBDAuthorizeActivity.this, 15.0f);
                        layoutParams3.setMargins(a2, (int) C12750c.m37039a(BaseBDAuthorizeActivity.this, 56.0f), a2, a2);
                        BaseBDAuthorizeActivity.this.mLoginBtn.setLayoutParams(layoutParams3);
                    }
                }
                BaseBDAuthorizeActivity.this.showContainerView();
            }
        });
    }

    public void onBackPressed() {
        this.authorizePresenter.mo31256a(-33, "back pressed");
        onCancel();
    }

    private void initListener() {
        this.mCancelTxt.setOnClickListener(new C12786a() {
            /* renamed from: a */
            public final void mo31334a(View view) {
                BaseBDAuthorizeActivity.this.authorizePresenter.mo31256a(-32, "click cancel");
                BaseBDAuthorizeActivity.this.onCancel();
            }
        });
        this.mLoginBtn.setOnClickListener(new C12786a() {
            /* renamed from: a */
            public final void mo31334a(View view) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < BaseBDAuthorizeActivity.this.mAuthScopeLayout.getChildCount(); i++) {
                    CheckBox checkBox = (CheckBox) BaseBDAuthorizeActivity.this.mAuthScopeLayout.getChildAt(i);
                    if (!checkBox.isEnabled() || checkBox.isChecked()) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append((String) checkBox.getTag());
                    }
                }
                BaseBDAuthorizeActivity.this.mLastRequest.f33741f = sb.toString();
                BaseBDAuthorizeActivity.this.authorizePresenter.mo31258b(BaseBDAuthorizeActivity.this.mLastRequest);
                BaseBDAuthorizeActivity.this.onLoginClick();
            }
        });
    }

    public void dismissLoadingDialog() {
        if (!isFinishing() && !isDestroyed() && this.mLoadingDialog != null && this.mLoadingDialog.isShowing()) {
            this.mLoadingDialog.dismiss();
        }
    }

    public boolean isDestroyed() {
        if (VERSION.SDK_INT < 17) {
            return this.mStatusDestroyed;
        }
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.mStatusDestroyed;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.mStatusDestroyed = true;
        if (this.mLoadingDialog != null && this.mLoadingDialog.isShowing()) {
            this.mLoadingDialog.dismiss();
        }
        this.mLoadingDialog = null;
    }

    private void initLoadingDialog() {
        if (!TextUtils.isEmpty(this.configuration.f33781z)) {
            this.mInitLoadingText = this.configuration.f33781z;
        }
        if (!TextUtils.isEmpty(this.configuration.f33753A)) {
            this.mAuthLoadingText = this.configuration.f33753A;
        }
        if (TextUtils.isEmpty(this.mInitLoadingText)) {
            this.mInitLoadingText = getResources().getString(R.string.qy);
        }
        if (TextUtils.isEmpty(this.mAuthLoadingText)) {
            this.mAuthLoadingText = getResources().getString(R.string.qx);
        }
        C12788b.m37121a(getLoadingProgressBar());
        this.mLoadingDialog = this.configuration.f33754B;
        if (this.mLoadingDialog == null) {
            this.mLoadingDialog = new C12788b(this);
        }
    }

    private void initView() {
        try {
            setContentView(getLayout());
            this.mTitleBarLayout = (FrameLayout) findViewById(R.id.bkh);
            this.mCancelTxt = (TextView) findViewById(R.id.e6h);
            this.mRootView = (RelativeLayout) findViewById(R.id.bgq);
            this.mContainer = (RelativeLayout) findViewById(R.id.a20);
            this.mContentLayout = (ScrollView) findViewById(R.id.bh2);
            this.mAuthContent = (RelativeLayout) findViewById(R.id.ht);
            this.mLeftCube = (ImageView) findViewById(R.id.az3);
            this.mRightCube = (ImageView) findViewById(R.id.az4);
            this.mApplyAuthAppIcon = (ImageView) findViewById(R.id.axh);
            this.mApplyAuthAppName = (TextView) findViewById(R.id.e6e);
            this.mGrantAuthTxt = (TextView) findViewById(R.id.e6u);
            this.mUserPortrait = (ImageView) findViewById(R.id.e9w);
            this.mUserName = (TextView) findViewById(R.id.e9m);
            this.mBorder = findViewById(R.id.nh);
            this.mAuthDescTitle = (TextView) findViewById(R.id.hu);
            this.mAuthScopeLayout = (LinearLayout) findViewById(R.id.bgm);
            this.mLoginBtn = (TextView) findViewById(R.id.qm);
            this.mProtocol = (TextView) findViewById(R.id.e8l);
            this.configuration = initPlatformConfiguration();
            if (this.configuration != null) {
                initStaticView();
                initLoadingDialog();
                return;
            }
            throw new IllegalArgumentException("initDynamicViewByDataAndShow view fail, configuration is null");
        } catch (NotFoundException unused) {
            finish();
        }
    }

    private void initStateListView() {
        if (this.mAuthInfoResponse != null && this.mAuthInfoResponse.f33752d != null && this.mAuthInfoResponse.f33752d.length() > 0) {
            HashMap hashMap = new HashMap(this.mAuthInfoResponse.f33752d.length());
            Iterator keys = this.mAuthInfoResponse.f33752d.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                String optString = this.mAuthInfoResponse.f33752d.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    hashMap.put(str, optString);
                }
            }
            int size = hashMap.size();
            if (size == 0 || size == 1) {
                this.mAuthDescTitle.setVisibility(8);
            } else {
                this.mAuthDescTitle.setVisibility(0);
            }
            if (hashMap.entrySet() != null && hashMap.entrySet().size() > 0) {
                for (Entry entry : hashMap.entrySet()) {
                    View inflate = LayoutInflater.from(this).inflate(R.layout.hn, this.mAuthScopeLayout, false);
                    CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.vk);
                    checkBox.setTextColor(this.configuration.f33772q);
                    checkBox.setButtonDrawable(initStateListDrawable(this.configuration));
                    if (size == 1) {
                        checkBox.setText(C1642a.m8034a(getResources().getString(R.string.r4), new Object[]{entry.getValue()}));
                    } else {
                        checkBox.setText((CharSequence) entry.getValue());
                    }
                    checkBox.setTag(entry.getKey());
                    int checkboxType = getCheckboxType((String) entry.getKey());
                    if (checkboxType == 2) {
                        checkBox.setEnabled(false);
                        this.mAuthScopeLayout.addView(inflate, 0);
                    } else {
                        if (checkboxType == 0) {
                            checkBox.setEnabled(true);
                            checkBox.setChecked(false);
                        } else if (checkboxType == 1) {
                            checkBox.setEnabled(true);
                            checkBox.setChecked(true);
                        }
                        this.mAuthScopeLayout.addView(inflate);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void initStaticView() {
        this.mTitleBarLayout.setBackgroundColor(this.configuration.f33756a);
        if (!TextUtils.isEmpty(this.configuration.f33758c)) {
            this.mCancelTxt.setText(this.configuration.f33758c);
        }
        this.mCancelTxt.setTextColor(this.configuration.f33759d);
        this.mRootView.setBackgroundColor(this.configuration.f33757b);
        if (this.configuration.f33760e) {
            this.mLeftCube.setVisibility(0);
            this.mRightCube.setVisibility(0);
            if (this.configuration.f33761f != null) {
                this.mLeftCube.setImageDrawable(this.configuration.f33761f);
            }
            if (this.configuration.f33762g != null) {
                this.mRightCube.setImageDrawable(this.configuration.f33762g);
            }
        } else {
            this.mLeftCube.setVisibility(8);
            this.mRightCube.setVisibility(8);
        }
        this.mApplyAuthAppIcon.setBackgroundColor(this.configuration.f33763h);
        this.mApplyAuthAppName.setTextColor(this.configuration.f33764i);
        this.mGrantAuthTxt.setTextColor(this.configuration.f33766k);
        this.mUserPortrait.setBackgroundColor(this.configuration.f33767l);
        this.mUserName.setTextColor(this.configuration.f33768m);
        this.mBorder.setBackgroundColor(this.configuration.f33769n);
        this.mAuthDescTitle.setTextColor(this.configuration.f33771p);
        if (!TextUtils.isEmpty(this.configuration.f33770o)) {
            this.mAuthDescTitle.setText(this.configuration.f33770o);
        }
        this.mLoginBtn.setTextColor(this.configuration.f33777v);
        ((GradientDrawable) this.mLoginBtn.getBackground()).setColor(this.configuration.f33778w);
        if (!TextUtils.isEmpty(this.configuration.f33776u)) {
            this.mLoginBtn.setText(this.configuration.f33776u);
        }
        if (!TextUtils.isEmpty(this.configuration.f33765j)) {
            this.mGrantAuthTxt.setText(this.configuration.f33765j);
        }
        SpannableString spannableString = this.configuration.f33755C;
        if (!TextUtils.isEmpty(spannableString)) {
            this.mProtocol.setText(spannableString);
            this.mProtocol.setMovementMethod(LinkMovementMethod.getInstance());
            this.mProtocol.setVisibility(0);
        }
        initListener();
    }

    public void onResp(C12744b bVar) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void showView(C12759b bVar) {
        this.mAuthInfoResponse = bVar;
        initDynamicViewByDataAndShow();
    }

    public void onReq(C12743a aVar) {
        if (aVar instanceof C12746a) {
            this.mLastRequest = (C12746a) aVar;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_start_login", false);
    }

    public void setAppIcon(Drawable drawable) {
        if (drawable != null && !isFinishing() && this.mApplyAuthAppIcon != null) {
            this.mApplyAuthAppIcon.setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void setAppName(String str) {
        if (!TextUtils.isEmpty(str) && !isFinishing() && this.mApplyAuthAppName != null) {
            this.mApplyAuthAppName.setText(str);
        }
    }

    public void setUserAvatar(Drawable drawable) {
        if (drawable != null && !isFinishing() && this.mUserPortrait != null) {
            this.mUserPortrait.setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void setUserName(String str) {
        if (!TextUtils.isEmpty(str) && !isFinishing() && this.mUserName != null) {
            this.mUserName.setText(str);
        }
    }

    public void showLoadingDialog(String str) {
        if (!isFinishing() && !isDestroyed() && this.mLoadingDialog != null && !this.mLoadingDialog.isShowing()) {
            this.mLoadingDialog.mo31277a(str);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.bdPlatformApi = C12782d.m37111a(this);
        handleIntent(getIntent(), this);
        this.authorizePlatformDepend = createDepend();
        this.authorizePresenter = new C12766a(this, this.authorizePlatformDepend, this);
        initView();
        this.authorizePresenter.mo31255a();
    }

    public void onLoginResult(int i) {
        if (!isFinishing() && !isDestroyed()) {
            if (i != 0) {
                if (this.authorizePresenter != null) {
                    if (i == -1) {
                        this.authorizePresenter.mo31256a(-30, "login fail");
                    } else {
                        this.authorizePresenter.mo31256a(-31, "cancel login");
                    }
                }
            } else if (!(this.authorizePresenter == null || this.mLastRequest == null)) {
                this.authorizePresenter.mo31257a(this.mLastRequest);
            }
        }
    }

    private int getCheckboxType(String str) {
        String[] split;
        String[] split2;
        if (!TextUtils.isEmpty(this.mLastRequest.f33742g)) {
            for (String str2 : this.mLastRequest.f33742g.split(",")) {
                if (str != null && str.equals(str2)) {
                    return 0;
                }
            }
        }
        if (!TextUtils.isEmpty(this.mLastRequest.f33743h)) {
            for (String str3 : this.mLastRequest.f33743h.split(",")) {
                if (str != null && str.equals(str3)) {
                    return 1;
                }
            }
        }
        return 2;
    }

    private StateListDrawable initStateListDrawable(C12760c cVar) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        if (cVar.f33773r != null) {
            drawable = cVar.f33773r;
        } else {
            drawable = getResources().getDrawable(R.drawable.gr);
        }
        stateListDrawable.addState(iArr, drawable);
        int[] iArr2 = {16842910, 16842912};
        if (cVar.f33774s != null) {
            drawable2 = cVar.f33774s;
        } else {
            drawable2 = getResources().getDrawable(R.drawable.gp);
        }
        stateListDrawable.addState(iArr2, drawable2);
        int[] iArr3 = {16842910, -16842912};
        if (cVar.f33775t != null) {
            drawable3 = cVar.f33775t;
        } else {
            drawable3 = getResources().getDrawable(R.drawable.gq);
        }
        stateListDrawable.addState(iArr3, drawable3);
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    public boolean handleIntent(Intent intent, C12740a aVar) {
        return this.bdPlatformApi.mo31280a(intent, aVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (i2 == -1) {
                this.authorizePresenter.mo31257a(this.mLastRequest);
            } else if (i2 == 0) {
                this.authorizePresenter.mo31256a(-30, "login fail");
            }
        }
    }
}
