package com.ynz.sandbox.hidestaticclass;

import lombok.Data;
import lombok.Getter;

@Getter
public class StandardClientModule extends ClientModule {


    @Data
    public static class Offset {
        private int myCurrent;
        private int myNext;
    }
}
