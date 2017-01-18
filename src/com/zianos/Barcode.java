package com.zianos;

/**
 * Created by andrew on 1/18/17.
 */
public class Barcode {
    private int[] barcode;

    public String getBarcode() {
        return barcode.toString();
    }

    public void setBarcode(int[] barcode) {
        this.barcode = barcode;
    }

    public boolean isValid(){
        //TODO: Implement this
        return true;
    }

    @Override
    public String toString() {
        String barcodeStr = "";

        for(int digit : barcode){
            barcodeStr += digit;
        }
        return barcodeStr;
    }
}
