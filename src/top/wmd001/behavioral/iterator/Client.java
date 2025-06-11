package top.wmd001.behavioral.iterator;

import java.time.LocalDate;
import java.time.LocalTime;

public class Client {

    public static void main(String[] args) {
//        LogIterator.log("Hello {}! I am {}", "World", "wmd001");
        LogIterator.log("[{}] start {} at {}...", LocalTime.now().withNano(0), "engine", LocalDate.now());


    }

}
