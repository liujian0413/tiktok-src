package com.kakao.auth.network;

import com.kakao.auth.Session;
import com.kakao.auth.ageauth.DefaultAgeAuthService;
import com.kakao.network.response.ApiResponseStatusError;

public interface ApiErrorHandlingService {

    public static class Factory {
        private static ApiErrorHandlingService instance;

        public static ApiErrorHandlingService getInstance() {
            return instance;
        }

        static {
            DefaultApiErrorHandlingService defaultApiErrorHandlingService = new DefaultApiErrorHandlingService();
            defaultApiErrorHandlingService.setSession(Session.getCurrentSession());
            defaultApiErrorHandlingService.setAgeAuthService(DefaultAgeAuthService.getInstance());
            defaultApiErrorHandlingService.setActivityProvider(com.kakao.auth.helper.CurrentActivityProvider.Factory.getInstance());
            instance = defaultApiErrorHandlingService;
        }
    }

    boolean shouldRetryAfterTryingRefreshToken() throws Exception;

    boolean shouldRetryWithApiError(ApiResponseStatusError apiResponseStatusError) throws Exception;
}
