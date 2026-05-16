package com.pipecoding.ec.firtsapirest.controller;

public class Reboot {


    private String system;
    private Integer sku;
    private String codec;

    public Reboot() {
    }

    public Reboot(String system, Integer sku, String codec) {
        this.system = system;
        this.sku = sku;
        this.codec = codec;
    }

    public String getSystem() {
        return system;
    }

    public Integer getSku() {
        return sku;
    }

    public String getCodec() {
        return codec;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /* System not setter */

    @Override
    public String toString() {
        return "System " + system + " SKU " + sku + " CODEC " + codec;
    }
}
