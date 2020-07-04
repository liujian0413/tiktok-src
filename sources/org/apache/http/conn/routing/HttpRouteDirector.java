package org.apache.http.conn.routing;

public interface HttpRouteDirector {
    int nextStep(RouteInfo routeInfo, RouteInfo routeInfo2);
}
