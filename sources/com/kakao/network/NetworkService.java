package com.kakao.network;

import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.CustomErrorConverter;
import com.kakao.network.response.ResponseBody.ResponseBodyException;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.network.tasks.KakaoTaskQueue;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Future;

public interface NetworkService {

    public static class Factory {
        public static NetworkService getInstance() {
            return new DefaultNetworkService(KakaoTaskQueue.getInstance());
        }
    }

    <T> T request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter) throws IOException, ResponseBodyException, ApiResponseStatusError;

    <T, E extends Exception> T request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, CustomErrorConverter<E> customErrorConverter) throws IOException, ResponseBodyException, Exception;

    <T> Future<T> request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, ResponseCallback<T> responseCallback);

    <T, E extends Exception> Future<T> request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, CustomErrorConverter<E> customErrorConverter, ResponseCallback<T> responseCallback);

    <T> List<T> requestList(IRequest iRequest, ResponseStringConverter<T> responseStringConverter) throws IOException;

    <T> Future<List<T>> requestList(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, ResponseCallback<List<T>> responseCallback);
}
