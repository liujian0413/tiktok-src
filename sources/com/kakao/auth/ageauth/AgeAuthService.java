package com.kakao.auth.ageauth;

import android.app.Activity;
import android.os.Bundle;

public interface AgeAuthService {
    int requestAgeAuth(Bundle bundle, Activity activity, boolean z);
}
