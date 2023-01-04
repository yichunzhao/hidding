package com.ynz.sandbox.hidestaticclass;

import lombok.Data;
import lombok.Getter;

@Getter
public class MyClientModule extends StandardClientModule {

    @Data
    public static class Offset{
        private int total;
    }
}
