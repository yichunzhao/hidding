package com.ynz.sandbox.hidestaticclass;

import lombok.Data;
import lombok.Getter;

@Getter
public class ClientModule {

    @Data
    public static class Offset{
        private int current;
        private int next;
    }
}
