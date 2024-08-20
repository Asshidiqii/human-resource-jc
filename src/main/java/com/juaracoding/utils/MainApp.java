package com.juaracoding.utils;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {
        WebDriver driver;

        System.out.println("Page Object Page Factory");

        // Inisialisasi driver dengan strategi Firefox
        DriverSingleton.getInstance("firefox");
        driver = DriverSingleton.getDriver();

        // Buka URL halaman login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Beri jeda 3 detik
        DriverSingleton.delay(3);

        // Tutup instance WebDriver dan akhiri sesi
        DriverSingleton.closeObjectInstance();
    }
}
