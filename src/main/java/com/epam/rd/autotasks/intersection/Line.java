package com.epam.rd.autotasks.intersection;

public class Line {
    private final int k,b;
    public Line(int k, int b) {
        this.k=k;
        this.b=b;
    }

    public Point intersection(Line other) {
        if (k==other.k)
            return null;
        int x=(b-other.b)/(other.k-k);
        int y=k*x+b;
        return new Point(x,y);
    }
}
