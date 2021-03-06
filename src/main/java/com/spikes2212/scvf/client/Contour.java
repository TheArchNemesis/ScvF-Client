package com.spikes2212.scvf.client;

import com.spikes2212.scvf.client.middleware.ContourMiddleware;

public interface Contour {

    int getId();

    double getX();
    double getY();

    double getWidth();
    double getHeight();

    double getCenterX();
    double getCenterY();

    double getArea();

    boolean isUpdated();

    Contour use(ContourMiddleware middleware);
}
