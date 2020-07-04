package org.apache.http.entity;

import org.apache.http.HttpException;
import org.apache.http.HttpMessage;

public interface ContentLengthStrategy {
    long determineLength(HttpMessage httpMessage) throws HttpException;
}
