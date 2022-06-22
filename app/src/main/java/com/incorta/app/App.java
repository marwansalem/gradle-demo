package com.incorta.app;

import com.incorta.common.CommonHelper;
import com.incorta.printer.Printer;

public class App {

    public static void main(String[] args) {
        Printer.print("hello");
        CommonHelper.printInt(300);
    }

    @Test
    public String getName() {
        return "Abdelrahman";
    }
}
